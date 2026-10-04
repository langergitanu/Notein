package com.google.firebase.storage;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.storage.StorageMetadata;
import com.google.firebase.storage.internal.AdaptiveStreamBuffer;
import com.google.firebase.storage.internal.ExponentialBackoffSender;
import com.google.firebase.storage.internal.Sleeper;
import com.google.firebase.storage.internal.SleeperImpl;
import com.google.firebase.storage.internal.Util;
import com.google.firebase.storage.network.NetworkRequest;
import com.google.firebase.storage.network.ResumableUploadByteRequest;
import com.google.firebase.storage.network.ResumableUploadCancelRequest;
import com.google.firebase.storage.network.ResumableUploadQueryRequest;
import com.google.firebase.storage.network.ResumableUploadStartRequest;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
public class UploadTask extends StorageTask<TaskSnapshot> {
    private static final String APPLICATION_OCTET_STREAM = "application/octet-stream";
    private static final int MAXIMUM_CHUNK_SIZE = 33554432;
    static final int PREFERRED_CHUNK_SIZE = 262144;
    private static final String RESUMABLE_FINAL_STATUS = "final";
    private static final String TAG = "UploadTask";
    private static final String X_GOOG_UPLOAD_URL = "X-Goog-Upload-URL";
    private final InteropAppCheckTokenProvider mAppCheckProvider;
    private final InternalAuthProvider mAuthProvider;
    private final AtomicLong mBytesUploaded;
    private int mCurrentChunkSize;
    private volatile Exception mException;
    private boolean mIsStreamOwned;
    private volatile StorageMetadata mMetadata;
    private volatile int mResultCode;
    private ExponentialBackoffSender mSender;
    private volatile Exception mServerException;
    private volatile String mServerStatus;
    private final StorageReference mStorageRef;
    private final AdaptiveStreamBuffer mStreamBuffer;
    private final long mTotalByteCount;
    private volatile Uri mUploadUri;
    private final Uri mUri;
    private volatile long maxSleepTime;
    private final int minimumSleepInterval;
    private int sleepTime;
    private static final Random random = new Random();
    static Sleeper sleeper = new SleeperImpl();
    static Clock clock = DefaultClock.getInstance();

    public class TaskSnapshot extends StorageTask<TaskSnapshot>.SnapshotBase {
        private final long mBytesUploaded;
        private final StorageMetadata mMetadata;
        private final Uri mUploadUri;

        public TaskSnapshot(Exception exc, long j, Uri uri, StorageMetadata storageMetadata) {
            super(exc);
            this.mBytesUploaded = j;
            this.mUploadUri = uri;
            this.mMetadata = storageMetadata;
        }

        public long getBytesTransferred() {
            return this.mBytesUploaded;
        }

        public StorageMetadata getMetadata() {
            return this.mMetadata;
        }

        public long getTotalByteCount() {
            return UploadTask.this.getTotalByteCount();
        }

        public Uri getUploadSessionUri() {
            return this.mUploadUri;
        }
    }

    public UploadTask(StorageReference storageReference, StorageMetadata storageMetadata, byte[] bArr) {
        this.mBytesUploaded = new AtomicLong(0L);
        this.mCurrentChunkSize = 262144;
        this.mUploadUri = null;
        this.mException = null;
        this.mServerException = null;
        this.mResultCode = 0;
        this.sleepTime = 0;
        this.minimumSleepInterval = 1000;
        Preconditions.checkNotNull(storageReference);
        Preconditions.checkNotNull(bArr);
        FirebaseStorage storage = storageReference.getStorage();
        this.mTotalByteCount = bArr.length;
        this.mStorageRef = storageReference;
        this.mMetadata = storageMetadata;
        InternalAuthProvider authProvider = storage.getAuthProvider();
        this.mAuthProvider = authProvider;
        InteropAppCheckTokenProvider appCheckProvider = storage.getAppCheckProvider();
        this.mAppCheckProvider = appCheckProvider;
        this.mUri = null;
        this.mStreamBuffer = new AdaptiveStreamBuffer(new ByteArrayInputStream(bArr), 262144);
        this.mIsStreamOwned = true;
        this.maxSleepTime = storage.getMaxChunkUploadRetry();
        this.mSender = new ExponentialBackoffSender(storage.getApp().getApplicationContext(), authProvider, appCheckProvider, storage.getMaxUploadRetryTimeMillis());
    }

    private void beginResumableUpload() {
        String contentType = this.mMetadata != null ? this.mMetadata.getContentType() : null;
        if (this.mUri != null && TextUtils.isEmpty(contentType)) {
            contentType = this.mStorageRef.getStorage().getApp().getApplicationContext().getContentResolver().getType(this.mUri);
        }
        if (TextUtils.isEmpty(contentType)) {
            contentType = "application/octet-stream";
        }
        ResumableUploadStartRequest resumableUploadStartRequest = new ResumableUploadStartRequest(this.mStorageRef.getStorageReferenceUri(), this.mStorageRef.getApp(), this.mMetadata != null ? this.mMetadata.createJSONObject() : null, contentType);
        if (sendWithRetry(resumableUploadStartRequest)) {
            String resultString = resumableUploadStartRequest.getResultString(X_GOOG_UPLOAD_URL);
            if (TextUtils.isEmpty(resultString)) {
                return;
            }
            this.mUploadUri = Uri.parse(resultString);
        }
    }

    private boolean delaySend(NetworkRequest networkRequest) {
        try {
            Log.d(TAG, "Waiting " + this.sleepTime + " milliseconds");
            sleeper.sleep(this.sleepTime + random.nextInt(250));
            boolean zSend = send(networkRequest);
            if (zSend) {
                this.sleepTime = 0;
            }
            return zSend;
        } catch (InterruptedException e) {
            Log.w(TAG, "thread interrupted during exponential backoff.");
            Thread.currentThread().interrupt();
            this.mServerException = e;
            return false;
        }
    }

    private boolean isValidHttpResponseCode(int i) {
        if (i != 308) {
            return i >= 200 && i < 300;
        }
        return true;
    }

    private boolean processResultValid(NetworkRequest networkRequest) {
        int resultCode = networkRequest.getResultCode();
        if (this.mSender.isRetryableError(resultCode)) {
            resultCode = -2;
        }
        this.mResultCode = resultCode;
        this.mServerException = networkRequest.getException();
        this.mServerStatus = networkRequest.getResultString("X-Goog-Upload-Status");
        return isValidHttpResponseCode(this.mResultCode) && this.mServerException == null;
    }

    private boolean recoverStatus(boolean z) {
        ResumableUploadQueryRequest resumableUploadQueryRequest = new ResumableUploadQueryRequest(this.mStorageRef.getStorageReferenceUri(), this.mStorageRef.getApp(), this.mUploadUri);
        if (RESUMABLE_FINAL_STATUS.equals(this.mServerStatus)) {
            return false;
        }
        if (z) {
            if (!sendWithRetry(resumableUploadQueryRequest)) {
                return false;
            }
        } else if (!send(resumableUploadQueryRequest)) {
            return false;
        }
        if (RESUMABLE_FINAL_STATUS.equals(resumableUploadQueryRequest.getResultString("X-Goog-Upload-Status"))) {
            this.mException = new IOException("The server has terminated the upload session");
            return false;
        }
        String resultString = resumableUploadQueryRequest.getResultString("X-Goog-Upload-Size-Received");
        long j = !TextUtils.isEmpty(resultString) ? Long.parseLong(resultString) : 0L;
        long j2 = this.mBytesUploaded.get();
        if (j2 > j) {
            this.mException = new IOException("Unexpected error. The server lost a chunk update.");
            return false;
        }
        if (j2 >= j) {
            return true;
        }
        try {
            if (this.mStreamBuffer.advance((int) r7) != j - j2) {
                this.mException = new IOException("Unexpected end of stream encountered.");
                return false;
            }
            if (this.mBytesUploaded.compareAndSet(j2, j)) {
                return true;
            }
            Log.e(TAG, "Somehow, the uploaded bytes changed during an uploaded.  This should nothappen");
            this.mException = new IllegalStateException("uploaded bytes changed unexpectedly.");
            return false;
        } catch (IOException e) {
            Log.e(TAG, "Unable to recover position in Stream during resumable upload", e);
            this.mException = e;
            return false;
        }
    }

    private boolean send(NetworkRequest networkRequest) {
        networkRequest.performRequest(Util.getCurrentAuthToken(this.mAuthProvider), Util.getCurrentAppCheckToken(this.mAppCheckProvider), this.mStorageRef.getApp().getApplicationContext());
        return processResultValid(networkRequest);
    }

    private boolean sendWithRetry(NetworkRequest networkRequest) {
        this.mSender.sendWithExponentialBackoff(networkRequest);
        return processResultValid(networkRequest);
    }

    private boolean serverStateValid() {
        if (!RESUMABLE_FINAL_STATUS.equals(this.mServerStatus)) {
            return true;
        }
        if (this.mException == null) {
            this.mException = new IOException("The server has terminated the upload session", this.mServerException);
        }
        tryChangeState(64, false);
        return false;
    }

    private boolean shouldContinue() {
        if (getInternalState() == 128) {
            return false;
        }
        if (Thread.interrupted()) {
            this.mException = new InterruptedException();
            tryChangeState(64, false);
            return false;
        }
        if (getInternalState() == 32) {
            tryChangeState(256, false);
            return false;
        }
        if (getInternalState() == 8) {
            tryChangeState(16, false);
            return false;
        }
        if (!serverStateValid()) {
            return false;
        }
        if (this.mUploadUri == null) {
            if (this.mException == null) {
                this.mException = new IllegalStateException("Unable to obtain an upload URL.");
            }
            tryChangeState(64, false);
            return false;
        }
        if (this.mException != null) {
            tryChangeState(64, false);
            return false;
        }
        boolean z = this.mServerException != null || this.mResultCode < 200 || this.mResultCode >= 300;
        long jElapsedRealtime = clock.elapsedRealtime() + this.maxSleepTime;
        long jElapsedRealtime2 = clock.elapsedRealtime() + ((long) this.sleepTime);
        if (z) {
            if (jElapsedRealtime2 > jElapsedRealtime || !recoverStatus(true)) {
                if (serverStateValid()) {
                    tryChangeState(64, false);
                }
                return false;
            }
            this.sleepTime = Math.max(this.sleepTime * 2, 1000);
        }
        return true;
    }

    private void uploadChunk() {
        try {
            this.mStreamBuffer.fill(this.mCurrentChunkSize);
            int iMin = Math.min(this.mCurrentChunkSize, this.mStreamBuffer.available());
            ResumableUploadByteRequest resumableUploadByteRequest = new ResumableUploadByteRequest(this.mStorageRef.getStorageReferenceUri(), this.mStorageRef.getApp(), this.mUploadUri, this.mStreamBuffer.get(), this.mBytesUploaded.get(), iMin, this.mStreamBuffer.isFinished());
            if (!delaySend(resumableUploadByteRequest)) {
                this.mCurrentChunkSize = 262144;
                Log.d(TAG, "Resetting chunk size to " + this.mCurrentChunkSize);
                return;
            }
            this.mBytesUploaded.getAndAdd(iMin);
            if (!this.mStreamBuffer.isFinished()) {
                this.mStreamBuffer.advance(iMin);
                int i = this.mCurrentChunkSize;
                if (i < 33554432) {
                    this.mCurrentChunkSize = i * 2;
                    Log.d(TAG, "Increasing chunk size to " + this.mCurrentChunkSize);
                    return;
                }
                return;
            }
            try {
                this.mMetadata = new StorageMetadata.Builder(resumableUploadByteRequest.getResultBody(), this.mStorageRef).build();
                tryChangeState(4, false);
                tryChangeState(128, false);
            } catch (JSONException e) {
                Log.e(TAG, "Unable to parse resulting metadata from upload:" + resumableUploadByteRequest.getRawResult(), e);
                this.mException = e;
            }
        } catch (IOException e2) {
            Log.e(TAG, "Unable to read bytes for uploading", e2);
            this.mException = e2;
        }
    }

    @Override // com.google.firebase.storage.StorageTask
    public StorageReference getStorage() {
        return this.mStorageRef;
    }

    public long getTotalByteCount() {
        return this.mTotalByteCount;
    }

    @Override // com.google.firebase.storage.StorageTask
    public void onCanceled() {
        this.mSender.cancel();
        final ResumableUploadCancelRequest resumableUploadCancelRequest = this.mUploadUri != null ? new ResumableUploadCancelRequest(this.mStorageRef.getStorageReferenceUri(), this.mStorageRef.getApp(), this.mUploadUri) : null;
        if (resumableUploadCancelRequest != null) {
            StorageTaskScheduler.getInstance().scheduleCommand(new Runnable() { // from class: com.google.firebase.storage.UploadTask.1
                @Override // java.lang.Runnable
                public void run() {
                    resumableUploadCancelRequest.performRequest(Util.getCurrentAuthToken(UploadTask.this.mAuthProvider), Util.getCurrentAppCheckToken(UploadTask.this.mAppCheckProvider), UploadTask.this.mStorageRef.getApp().getApplicationContext());
                }
            });
        }
        this.mException = StorageException.fromErrorStatus(Status.RESULT_CANCELED);
        super.onCanceled();
    }

    @Override // com.google.firebase.storage.StorageTask
    public void resetState() {
        this.mException = null;
        this.mServerException = null;
        this.mResultCode = 0;
        this.mServerStatus = null;
    }

    @Override // com.google.firebase.storage.StorageTask
    public void run() {
        this.mSender.reset();
        if (!tryChangeState(4, false)) {
            Log.d(TAG, "The upload cannot continue as it is not in a valid state.");
            return;
        }
        if (this.mStorageRef.getParent() == null) {
            this.mException = new IllegalArgumentException("Cannot upload to getRoot. You should upload to a storage location such as .getReference('image.png').putFile...");
        }
        if (this.mException != null) {
            return;
        }
        if (this.mUploadUri == null) {
            beginResumableUpload();
        } else {
            recoverStatus(false);
        }
        boolean zShouldContinue = shouldContinue();
        while (zShouldContinue) {
            uploadChunk();
            zShouldContinue = shouldContinue();
            if (zShouldContinue) {
                tryChangeState(4, false);
            }
        }
        if (!this.mIsStreamOwned || getInternalState() == 16) {
            return;
        }
        try {
            this.mStreamBuffer.close();
        } catch (IOException e) {
            Log.e(TAG, "Unable to close stream.", e);
        }
    }

    @Override // com.google.firebase.storage.StorageTask
    public void schedule() {
        StorageTaskScheduler.getInstance().scheduleUpload(getRunnable());
    }

    @Override // com.google.firebase.storage.StorageTask
    public TaskSnapshot snapStateImpl() {
        return new TaskSnapshot(StorageException.fromExceptionAndHttpCode(this.mException != null ? this.mException : this.mServerException, this.mResultCode), this.mBytesUploaded.get(), this.mUploadUri, this.mMetadata);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.firebase.auth.internal.InternalAuthProvider] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v2, types: [long] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8, types: [long] */
    /* JADX WARN: Type inference failed for: r7v9, types: [long] */
    public UploadTask(StorageReference storageReference, StorageMetadata storageMetadata, Uri uri, Uri uri2) {
        FileNotFoundException fileNotFoundException;
        ?? r5;
        ?? r7;
        ?? r52;
        NullPointerException nullPointerException;
        IOException iOException;
        long j;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        this.mBytesUploaded = new AtomicLong(0L);
        this.mCurrentChunkSize = 262144;
        InputStream inputStreamOpenInputStream = null;
        this.mUploadUri = null;
        this.mException = null;
        this.mServerException = null;
        this.mResultCode = 0;
        this.sleepTime = 0;
        this.minimumSleepInterval = 1000;
        Preconditions.checkNotNull(storageReference);
        Preconditions.checkNotNull(uri);
        FirebaseStorage storage = storageReference.getStorage();
        this.mStorageRef = storageReference;
        this.mMetadata = storageMetadata;
        ?? authProvider = storage.getAuthProvider();
        this.mAuthProvider = authProvider;
        InteropAppCheckTokenProvider appCheckProvider = storage.getAppCheckProvider();
        this.mAppCheckProvider = appCheckProvider;
        this.mUri = uri;
        this.maxSleepTime = storage.getMaxChunkUploadRetry();
        this.mSender = new ExponentialBackoffSender(storageReference.getApp().getApplicationContext(), authProvider, appCheckProvider, storage.getMaxUploadRetryTimeMillis());
        ?? r53 = -1;
        try {
            try {
                ContentResolver contentResolver = storageReference.getStorage().getApp().getApplicationContext().getContentResolver();
                try {
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                } catch (IOException e) {
                    iOException = e;
                    j = -1;
                } catch (NullPointerException e2) {
                    nullPointerException = e2;
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    long statSize = parcelFileDescriptorOpenFileDescriptor.getStatSize();
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        authProvider = statSize;
                    } catch (IOException e3) {
                        iOException = e3;
                        j = statSize;
                        Log.w(TAG, "could not retrieve file size for upload " + this.mUri.toString(), iOException);
                        authProvider = j;
                    } catch (NullPointerException e4) {
                        nullPointerException = e4;
                        Log.w(TAG, "NullPointerException during file size calculation.", nullPointerException);
                        authProvider = -1;
                    }
                } else {
                    authProvider = -1;
                }
                inputStreamOpenInputStream = contentResolver.openInputStream(this.mUri);
                r7 = authProvider;
            } catch (FileNotFoundException e5) {
                fileNotFoundException = e5;
                r5 = authProvider;
                Log.e(TAG, "could not locate file for uploading:" + this.mUri.toString());
                this.mException = fileNotFoundException;
                r52 = r5;
                r7 = r52;
                this.mTotalByteCount = r7;
                this.mStreamBuffer = new AdaptiveStreamBuffer(inputStreamOpenInputStream, 262144);
                this.mIsStreamOwned = true;
                this.mUploadUri = uri2;
            }
        } catch (FileNotFoundException e6) {
            fileNotFoundException = e6;
            r5 = r53;
            Log.e(TAG, "could not locate file for uploading:" + this.mUri.toString());
            this.mException = fileNotFoundException;
            r52 = r5;
            r7 = r52;
            this.mTotalByteCount = r7;
            this.mStreamBuffer = new AdaptiveStreamBuffer(inputStreamOpenInputStream, 262144);
            this.mIsStreamOwned = true;
            this.mUploadUri = uri2;
        }
        if (inputStreamOpenInputStream != null) {
            if (authProvider == -1) {
                try {
                    int iAvailable = inputStreamOpenInputStream.available();
                    if (iAvailable >= 0) {
                        authProvider = iAvailable;
                    }
                } catch (IOException unused) {
                }
            }
            r53 = authProvider;
            inputStreamOpenInputStream = new BufferedInputStream(inputStreamOpenInputStream);
            r52 = r53;
            r7 = r52;
        }
        this.mTotalByteCount = r7;
        this.mStreamBuffer = new AdaptiveStreamBuffer(inputStreamOpenInputStream, 262144);
        this.mIsStreamOwned = true;
        this.mUploadUri = uri2;
    }

    public UploadTask(StorageReference storageReference, StorageMetadata storageMetadata, InputStream inputStream) {
        this.mBytesUploaded = new AtomicLong(0L);
        this.mCurrentChunkSize = 262144;
        this.mUploadUri = null;
        this.mException = null;
        this.mServerException = null;
        this.mResultCode = 0;
        this.sleepTime = 0;
        this.minimumSleepInterval = 1000;
        Preconditions.checkNotNull(storageReference);
        Preconditions.checkNotNull(inputStream);
        FirebaseStorage storage = storageReference.getStorage();
        this.mTotalByteCount = -1L;
        this.mStorageRef = storageReference;
        this.mMetadata = storageMetadata;
        InternalAuthProvider authProvider = storage.getAuthProvider();
        this.mAuthProvider = authProvider;
        InteropAppCheckTokenProvider appCheckProvider = storage.getAppCheckProvider();
        this.mAppCheckProvider = appCheckProvider;
        this.mStreamBuffer = new AdaptiveStreamBuffer(inputStream, 262144);
        this.mIsStreamOwned = false;
        this.mUri = null;
        this.maxSleepTime = storage.getMaxChunkUploadRetry();
        this.mSender = new ExponentialBackoffSender(storageReference.getApp().getApplicationContext(), authProvider, appCheckProvider, storage.getMaxUploadRetryTimeMillis());
    }
}
