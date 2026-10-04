package com.huawei.cloud.base.media;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.cloud.base.MediaOverride;
import com.huawei.cloud.base.MethodOverride;
import com.huawei.cloud.base.http.AbstractInputStreamContent;
import com.huawei.cloud.base.http.ByteArrayContent;
import com.huawei.cloud.base.http.EmptyContent;
import com.huawei.cloud.base.http.FileContent;
import com.huawei.cloud.base.http.GZipEncoding;
import com.huawei.cloud.base.http.GenericUrl;
import com.huawei.cloud.base.http.HttpContent;
import com.huawei.cloud.base.http.HttpHeaders;
import com.huawei.cloud.base.http.HttpRequest;
import com.huawei.cloud.base.http.HttpRequestFactory;
import com.huawei.cloud.base.http.HttpRequestInitializer;
import com.huawei.cloud.base.http.HttpResponse;
import com.huawei.cloud.base.http.HttpTransport;
import com.huawei.cloud.base.http.InputStreamContent;
import com.huawei.cloud.base.http.MultipartContent;
import com.huawei.cloud.base.http.json.JsonHttpContent;
import com.huawei.cloud.base.json.gson.GsonFactory;
import com.huawei.cloud.base.util.ByteStreams;
import com.huawei.cloud.base.util.Charsets;
import com.huawei.cloud.base.util.GenericData;
import com.huawei.cloud.base.util.Logger;
import com.huawei.cloud.base.util.Preconditions;
import com.huawei.cloud.base.util.Sleeper;
import com.huawei.cloud.client.exception.DriveException;
import com.huawei.cloud.client.task.Task;
import com.huawei.cloud.client.task.TaskManager;
import com.huawei.cloud.client.util.HashFile;
import com.huawei.cloud.services.drive.model.ResumeResBody;
import com.huawei.hms.drive.C17871f;
import com.huawei.hms.network.embedded.C18115b5;
import com.huawei.hms.network.embedded.C18358t1;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes8.dex */
public final class MediaHttpUploader {
    public static final String CONTENT_LENGTH_HEADER = "X-Upload-Content-Length";
    public static final String CONTENT_TYPE_HEADER = "X-Upload-Content-Type";
    public static final int DEFAULT_CHUNK_SIZE = 2097152;
    private static final int DEFAULT_PROCESS_TIME = 1000;

    /* JADX INFO: renamed from: KB */
    public static final int f52286KB = 1024;
    private static final Logger LOGGER = Logger.getLogger("MediaHttpUploader");

    /* JADX INFO: renamed from: MB */
    public static final int f52287MB = 1048576;
    public static final int MINIMUM_CHUNK_SIZE = 262144;
    private static final int WAIT_SERVER_RETRY_TIME = 10;
    private boolean directUploadEnabled;
    private boolean disableGZipContent;
    private volatile boolean isFailed;
    private boolean isMediaContentLengthCalculated;
    private volatile boolean isSuccess;
    private volatile ResumeResBody lastResumeResBody;
    private final AbstractInputStreamContent mediaContent;
    private long mediaContentLength;
    private HttpContent metadata;
    private MediaHttpUploaderProgressListener progressListener;
    private volatile List<String> rangeList;
    private final HttpRequestFactory requestFactory;
    private volatile HttpResponse response;
    private long totalBytesServerReceived;
    private long totalTimeRequired;
    private final HttpTransport transport;
    private UploadState uploadState = UploadState.NOT_STARTED;
    private volatile IOException childThreadException = null;
    private String initiationRequestMethod = "POST";
    private HttpHeaders initiationHeaders = new HttpHeaders();
    private String mediaContentLengthStr = C18358t1.g.f56183c;
    private int chunkSize = 2097152;
    private List<Task> tasks = new ArrayList();
    private ReentrantLock lock = new ReentrantLock();

    public class SliceUploadTask extends Task {
        private long alreadySend;
        private long begin;
        private InputStream contentInputStream;
        private AbstractInputStreamContent currentInputStreamContent;
        private HttpRequest currentRequest;
        private long end;
        private Semaphore semaphore;
        private GenericUrl uploadUrl;

        public SliceUploadTask(long j, long j2, InputStream inputStream, GenericUrl genericUrl, Semaphore semaphore) {
            this.begin = j;
            this.end = j2;
            this.contentInputStream = inputStream;
            this.uploadUrl = genericUrl;
            this.semaphore = semaphore;
        }

        private void calculateTotalReceived(long j) throws IOException {
            long j2 = this.begin;
            if (j < j2) {
                long j3 = this.alreadySend - (j2 - j);
                if (j3 >= 0) {
                    MediaHttpUploader.LOGGER.m75693w("retransmissionSize: " + j3);
                } else {
                    MediaHttpUploader.this.lock.lock();
                    MediaHttpUploader mediaHttpUploader = MediaHttpUploader.this;
                    mediaHttpUploader.totalBytesServerReceived = (0 - j3) + mediaHttpUploader.totalBytesServerReceived;
                    MediaHttpUploader.this.lock.unlock();
                }
                this.contentInputStream.skip(this.begin - j);
            }
        }

        private void executeUpload() throws Throwable {
            this.contentInputStream.skip(this.begin);
            ResumeResBody resumeResBody = null;
            while (!Thread.currentThread().isInterrupted()) {
                MediaHttpUploader.LOGGER.m75691i("executeUpload executeUpload: + " + isCancel());
                if (isCancel()) {
                    throw new InterruptedIOException("upload task is cancel.");
                }
                this.alreadySend = 0L;
                if (this.end < this.begin) {
                    return;
                }
                HttpRequest httpRequestBuildPutRequest = MediaHttpUploader.this.requestFactory.buildPutRequest(this.uploadUrl, null);
                this.currentRequest = httpRequestBuildPutRequest;
                httpRequestBuildPutRequest.getHeaders().putAll(MediaHttpUploader.this.initiationHeaders);
                setContentAndHeadersOnCurrentRequest();
                new MediaUploadErrorHandler(this, this.currentRequest);
                HttpResponse httpResponseExecuteCurrentRequestWithoutGZip = MediaHttpUploader.this.executeCurrentRequestWithoutGZip(this.currentRequest, new HttpRequest.ProgressListener() { // from class: com.huawei.cloud.base.media.MediaHttpUploader.SliceUploadTask.1
                    @Override // com.huawei.cloud.base.http.HttpRequest.ProgressListener
                    public void onErrorCallback() throws IOException {
                        MediaHttpUploader.LOGGER.m75688d("executeUpload onErrorCallback: + " + SliceUploadTask.this.isCancel());
                        if (SliceUploadTask.this.isCancel()) {
                            throw new InterruptedIOException("upload task is cancel.");
                        }
                        SliceUploadTask.this.serverErrorCallback();
                    }

                    @Override // com.huawei.cloud.base.http.HttpRequest.ProgressListener
                    public void onProgress(long j) {
                        MediaHttpUploader.LOGGER.m75688d("executeUpload onProgress: + " + SliceUploadTask.this.isCancel());
                        SliceUploadTask.this.listenerProgress(j);
                    }
                });
                boolean z = false;
                try {
                } catch (Throwable th) {
                    th = th;
                }
                if (!httpResponseExecuteCurrentRequestWithoutGZip.isSuccessStatusCode()) {
                    if (httpResponseExecuteCurrentRequestWithoutGZip.getStatusCode() != 308) {
                        MediaHttpUploader.this.isFailed = true;
                        MediaHttpUploader.this.response = httpResponseExecuteCurrentRequestWithoutGZip;
                        try {
                            MediaHttpUploader.this.cancelAllTasks();
                            if (MediaHttpUploader.this.isSuccess || MediaHttpUploader.this.isFailed) {
                                return;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            z = true;
                        }
                    } else {
                        String location = httpResponseExecuteCurrentRequestWithoutGZip.getHeaders().getLocation();
                        if (location != null) {
                            this.uploadUrl = new GenericUrl(location);
                        }
                        ResumeResBody resumeResBody2 = (ResumeResBody) httpResponseExecuteCurrentRequestWithoutGZip.parseAs(ResumeResBody.class);
                        try {
                            MediaHttpUploader.this.rangeList = resumeResBody2.getRangeList();
                            long jUpdateBeginAndEnd = updateBeginAndEnd(MediaHttpUploader.this.rangeList);
                            this.contentInputStream.reset();
                            calculateTotalReceived(jUpdateBeginAndEnd);
                            if (MediaHttpUploader.this.totalBytesServerReceived != MediaHttpUploader.this.mediaContentLength && MediaHttpUploader.this.totalBytesServerReceived != 0 && !MediaHttpUploader.this.isSuccess && !MediaHttpUploader.this.isFailed) {
                                MediaHttpUploader.this.updateStateAndNotifyListener(UploadState.MEDIA_IN_PROGRESS);
                            }
                            httpResponseExecuteCurrentRequestWithoutGZip.disconnect();
                            if (!MediaHttpUploader.this.isSuccess && !MediaHttpUploader.this.isFailed) {
                                MediaHttpUploader.this.response = httpResponseExecuteCurrentRequestWithoutGZip;
                                MediaHttpUploader.this.lastResumeResBody = resumeResBody2;
                            }
                            resumeResBody = resumeResBody2;
                        } catch (Throwable th3) {
                            th = th3;
                            resumeResBody = resumeResBody2;
                        }
                    }
                    if (!z) {
                        httpResponseExecuteCurrentRequestWithoutGZip.disconnect();
                    }
                    if (!MediaHttpUploader.this.isSuccess && !MediaHttpUploader.this.isFailed) {
                        MediaHttpUploader.this.response = httpResponseExecuteCurrentRequestWithoutGZip;
                        MediaHttpUploader.this.lastResumeResBody = resumeResBody;
                    }
                    throw th;
                }
                MediaHttpUploader mediaHttpUploader = MediaHttpUploader.this;
                mediaHttpUploader.totalBytesServerReceived = mediaHttpUploader.getMediaContentLength();
                MediaHttpUploader.this.isSuccess = true;
                MediaHttpUploader.this.response = httpResponseExecuteCurrentRequestWithoutGZip;
                this.semaphore.release(MediaHttpUploader.this.tasks.size());
                MediaHttpUploader.this.updateStateAndNotifyListener(UploadState.MEDIA_COMPLETE);
                if (MediaHttpUploader.this.isSuccess || MediaHttpUploader.this.isFailed) {
                    return;
                }
                MediaHttpUploader.this.response = httpResponseExecuteCurrentRequestWithoutGZip;
                MediaHttpUploader.this.lastResumeResBody = resumeResBody;
                return;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void listenerProgress(long j) {
            MediaHttpUploader.LOGGER.m75689d("executeCurrentRequestWithoutGZip onProgress: " + j, false);
            MediaHttpUploader.this.lock.lock();
            MediaHttpUploader mediaHttpUploader = MediaHttpUploader.this;
            mediaHttpUploader.totalBytesServerReceived = (j - this.alreadySend) + mediaHttpUploader.totalBytesServerReceived;
            MediaHttpUploader.this.lock.unlock();
            this.alreadySend = j;
            try {
                if (MediaHttpUploader.this.isFailed) {
                    return;
                }
                MediaHttpUploader.this.updateStateAndNotifyListener(UploadState.MEDIA_IN_PROGRESS);
            } catch (IOException e) {
                MediaHttpUploader.LOGGER.m75690e("updateStateAndNotifyListener ex: " + e.toString());
            }
        }

        private void setContentAndHeaders(AbstractInputStreamContent abstractInputStreamContent, int i) throws IOException {
            this.currentInputStreamContent = abstractInputStreamContent;
            abstractInputStreamContent.getInputStream().mark(i);
            this.currentRequest.setContent(abstractInputStreamContent);
            this.currentRequest.getHeaders().setContentRange("bytes " + this.begin + CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + this.end + "/" + MediaHttpUploader.this.mediaContentLengthStr);
        }

        private void setContentAndHeadersOnCurrentRequest() throws IOException {
            int i = (int) ((this.end - this.begin) + 1);
            this.contentInputStream.mark(i);
            long j = i;
            setContentAndHeaders(new InputStreamContent(MediaHttpUploader.this.mediaContent.getType(), ByteStreams.limit(this.contentInputStream, j)).setRetrySupported(true).setLength(j).setCloseInputStream(false), i);
        }

        private long updateBeginAndEnd(List<String> list) {
            if (list == null) {
                list = new ArrayList<>();
            }
            long j = this.begin;
            Iterator<String> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String[] strArrSplit = it.next().split(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
                if (strArrSplit != null && strArrSplit.length == 2) {
                    long j2 = Long.parseLong(strArrSplit[0]);
                    long j3 = Long.parseLong(strArrSplit[1]);
                    long j4 = this.begin;
                    if (j4 >= j2 && j4 <= j3) {
                        long j5 = this.end;
                        if (j5 <= j3) {
                            this.end = j4 - 1;
                            this.begin = j5 + 1;
                            return j;
                        }
                        this.begin = j3 + 1;
                    }
                }
            }
            return j;
        }

        @Override // com.huawei.cloud.client.task.Task
        public void call() {
            Logger logger;
            StringBuilder sb;
            MediaHttpUploader.LOGGER.m75691i("SliceUploadTask start: + " + isCancel());
            updateBeginAndEnd(MediaHttpUploader.this.rangeList);
            try {
                try {
                    try {
                        executeUpload();
                        try {
                            this.contentInputStream.close();
                        } catch (IOException e) {
                            e = e;
                            logger = MediaHttpUploader.LOGGER;
                            sb = new StringBuilder("contentInputStream close failed, IOException: ");
                            sb.append(e.toString());
                            logger.m75690e(sb.toString());
                        }
                    } catch (Throwable th) {
                        try {
                            this.contentInputStream.close();
                        } catch (IOException e2) {
                            MediaHttpUploader.LOGGER.m75690e("contentInputStream close failed, IOException: " + e2.toString());
                        }
                        this.semaphore.release();
                        throw th;
                    }
                } catch (IOException e3) {
                    MediaHttpUploader.LOGGER.m75690e("task execute failed, IOException: " + e3.toString());
                    if (MediaHttpUploader.this.childThreadException == null) {
                        MediaHttpUploader.this.childThreadException = e3;
                    }
                    MediaHttpUploader.this.isFailed = true;
                    MediaHttpUploader.this.cancelAllTasks();
                    try {
                        this.contentInputStream.close();
                    } catch (IOException e4) {
                        e = e4;
                        logger = MediaHttpUploader.LOGGER;
                        sb = new StringBuilder("contentInputStream close failed, IOException: ");
                        sb.append(e.toString());
                        logger.m75690e(sb.toString());
                    }
                }
            } catch (Exception e5) {
                MediaHttpUploader.LOGGER.m75690e("task execute failed, Exception: " + e5.toString());
                if (MediaHttpUploader.this.childThreadException == null) {
                    MediaHttpUploader.this.childThreadException = new IOException(e5.getMessage());
                }
                MediaHttpUploader.this.isFailed = true;
                MediaHttpUploader.this.cancelAllTasks();
                try {
                    this.contentInputStream.close();
                } catch (IOException e6) {
                    e = e6;
                    logger = MediaHttpUploader.LOGGER;
                    sb = new StringBuilder("contentInputStream close failed, IOException: ");
                    sb.append(e.toString());
                    logger.m75690e(sb.toString());
                }
            }
            this.semaphore.release();
        }

        @Override // com.huawei.cloud.client.task.Task
        public boolean cancel() {
            HttpRequest httpRequest = this.currentRequest;
            if (httpRequest != null) {
                httpRequest.cancel();
            }
            this.semaphore.release();
            return super.cancel();
        }

        public void serverErrorCallback() throws IOException {
            Preconditions.checkNotNull(this.currentRequest, "The current request should not be null");
            AbstractInputStreamContent abstractInputStreamContent = this.currentInputStreamContent;
            if (abstractInputStreamContent != null) {
                abstractInputStreamContent.getInputStream().reset();
            }
        }
    }

    public enum UploadState {
        NOT_STARTED,
        INITIATION_STARTED,
        INITIATION_COMPLETE,
        MEDIA_IN_PROGRESS,
        MEDIA_COMPLETE
    }

    public MediaHttpUploader(AbstractInputStreamContent abstractInputStreamContent, HttpTransport httpTransport, HttpRequestInitializer httpRequestInitializer) {
        this.mediaContent = (AbstractInputStreamContent) Preconditions.checkNotNull(abstractInputStreamContent);
        this.transport = (HttpTransport) Preconditions.checkNotNull(httpTransport);
        this.requestFactory = httpRequestInitializer == null ? httpTransport.createRequestFactory() : httpTransport.createRequestFactory(httpRequestInitializer);
    }

    private void addCheckHashToMetadata(JsonHttpContent jsonHttpContent, String str) {
        ((GenericData) jsonHttpContent.getData()).set("sha256", str);
    }

    private void calTotalBytesReceived() {
        if (this.rangeList == null) {
            this.totalBytesServerReceived = 0L;
            return;
        }
        Iterator<String> it = this.rangeList.iterator();
        while (it.hasNext()) {
            String[] strArrSplit = it.next().split(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
            if (strArrSplit != null && strArrSplit.length == 2) {
                long j = Long.parseLong(strArrSplit[0]);
                this.totalBytesServerReceived = (Long.parseLong(strArrSplit[1]) - j) + 1 + this.totalBytesServerReceived;
            }
        }
    }

    private int calcChunkSize(long j, long j2) {
        if (j2 > j) {
            j2 = (long) Math.floor(j / 4);
        }
        if (j2 < PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) {
            j2 = 2097152;
        }
        return (int) j2;
    }

    private String calcLocalID(String str, HttpContent httpContent, FileContent fileContent) throws Throwable {
        Object hash;
        try {
            String hash2 = HashFile.getHash(fileContent.getFile());
            if (httpContent != null) {
                addCheckHashToMetadata((JsonHttpContent) httpContent, hash2);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                httpContent.writeTo(byteArrayOutputStream);
                hash = HashFile.getHash(byteArrayOutputStream.toByteArray());
            } else {
                hash = null;
            }
            Object hash3 = str != null ? HashFile.getHash(str.getBytes(Charsets.UTF_8)) : null;
            StringBuilder sb = new StringBuilder();
            if (hash3 == null) {
                hash3 = 0;
            }
            sb.append(hash3);
            sb.append(C18115b5.CONNECTOR);
            if (hash == null) {
                hash = 0;
            }
            sb.append(hash);
            sb.append(C18115b5.CONNECTOR);
            sb.append(hash2);
            return sb.toString();
        } catch (DriveException e) {
            LOGGER.m75693w("calcLocalID IOException: " + e.toString());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void cancelAllTasks() {
        try {
            Iterator<Task> it = this.tasks.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.tasks.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    private void cleanGenericUrlFromLocal(String str) {
        try {
            C17871f.m76782b("UploadID", str);
        } catch (IOException e) {
            LOGGER.m75693w("saveGenericUrlToLocal IOException: " + e.toString());
        }
    }

    private HttpResponse directUpload(GenericUrl genericUrl) throws Throwable {
        updateStateAndNotifyListener(UploadState.MEDIA_IN_PROGRESS);
        HttpContent contentParts = this.mediaContent;
        if (this.metadata != null) {
            contentParts = new MultipartContent().setContentParts(Arrays.asList(this.metadata, this.mediaContent));
            genericUrl.put("uploadType", "multipart");
            AbstractInputStreamContent abstractInputStreamContent = this.mediaContent;
            if (abstractInputStreamContent instanceof FileContent) {
                try {
                    String hash = HashFile.getHash(((FileContent) abstractInputStreamContent).getFile());
                    HttpContent httpContent = this.metadata;
                    if (httpContent != null) {
                        addCheckHashToMetadata((JsonHttpContent) httpContent, hash);
                    }
                } catch (Exception e) {
                    LOGGER.m75693w("directUpload addCheckHashToMetadata IOException: " + e.toString());
                }
            }
        } else {
            genericUrl.put("uploadType", FirebaseAnalytics.Param.CONTENT);
        }
        HttpRequest httpRequestBuildRequest = this.requestFactory.buildRequest(this.initiationRequestMethod, genericUrl, contentParts);
        httpRequestBuildRequest.getHeaders().putAll(this.initiationHeaders);
        HttpResponse httpResponseExecuteCurrentRequest = executeCurrentRequest(httpRequestBuildRequest, new HttpRequest.ProgressListener() { // from class: com.huawei.cloud.base.media.MediaHttpUploader.1
            @Override // com.huawei.cloud.base.http.HttpRequest.ProgressListener
            public void onErrorCallback() {
                MediaHttpUploader.LOGGER.m75688d("directUpload onErrorCallback.");
            }

            @Override // com.huawei.cloud.base.http.HttpRequest.ProgressListener
            public void onProgress(long j) {
                try {
                    MediaHttpUploader.this.totalBytesServerReceived = j;
                    MediaHttpUploader.this.updateStateAndNotifyListener(UploadState.MEDIA_IN_PROGRESS);
                    MediaHttpUploader.LOGGER.m75689d("directUpload onProgress: " + j, false);
                } catch (IOException e2) {
                    MediaHttpUploader.LOGGER.m75693w("directUpload HttpRequest ProgressListener onProgress IOException: " + e2.toString());
                }
            }
        });
        try {
            if (isMediaLengthKnown()) {
                this.totalBytesServerReceived = getMediaContentLength();
            }
            updateStateAndNotifyListener(UploadState.MEDIA_COMPLETE);
            return httpResponseExecuteCurrentRequest;
        } catch (Throwable th) {
            httpResponseExecuteCurrentRequest.disconnect();
            throw th;
        }
    }

    private HttpResponse executeCurrentRequest(HttpRequest httpRequest, HttpRequest.ProgressListener progressListener) throws IOException {
        if (!this.disableGZipContent && !(httpRequest.getContent() instanceof EmptyContent)) {
            httpRequest.setEncoding(new GZipEncoding());
        }
        return executeCurrentRequestWithoutGZip(httpRequest, progressListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HttpResponse executeCurrentRequestWithoutGZip(HttpRequest httpRequest, HttpRequest.ProgressListener progressListener) throws IOException {
        new MethodOverride().intercept(httpRequest);
        httpRequest.setThrowExceptionOnExecuteError(false);
        httpRequest.setParser(GsonFactory.getDefaultInstance().createJsonObjectParser());
        httpRequest.setProgressListener(progressListener);
        return httpRequest.execute();
    }

    private HttpResponse executeUploadInitiation(GenericUrl genericUrl) throws IOException {
        updateStateAndNotifyListener(UploadState.INITIATION_STARTED);
        genericUrl.put("uploadType", "resume");
        HttpContent emptyContent = this.metadata;
        if (emptyContent == null) {
            emptyContent = new EmptyContent();
        }
        HttpRequest httpRequestBuildRequest = this.requestFactory.buildRequest(this.initiationRequestMethod, genericUrl, emptyContent);
        this.initiationHeaders.set("X-Upload-Content-Type", (Object) this.mediaContent.getType());
        if (isMediaLengthKnown()) {
            this.initiationHeaders.set("X-Upload-Content-Length", (Object) Long.valueOf(getMediaContentLength()));
        }
        httpRequestBuildRequest.getHeaders().putAll(this.initiationHeaders);
        HttpResponse httpResponseExecuteCurrentRequest = executeCurrentRequest(httpRequestBuildRequest, null);
        try {
            updateStateAndNotifyListener(UploadState.INITIATION_COMPLETE);
            return httpResponseExecuteCurrentRequest;
        } catch (Throwable th) {
            httpResponseExecuteCurrentRequest.disconnect();
            throw th;
        }
    }

    private GenericUrl getGenericUrlFromLocal(String str) {
        try {
            UploadID uploadID = (UploadID) C17871f.m76778a("UploadID", str);
            if (uploadID == null) {
                return null;
            }
            if (!uploadID.isExpired()) {
                return new GenericUrl(uploadID.getUploadID());
            }
            C17871f.m76782b("UploadID", str);
            return null;
        } catch (IOException e) {
            LOGGER.m75693w("getGenericUrlFromLocal IOException: " + e.toString());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getMediaContentLength() throws IOException {
        if (!this.isMediaContentLengthCalculated) {
            this.mediaContentLength = this.mediaContent.getLength();
            this.isMediaContentLengthCalculated = true;
        }
        return this.mediaContentLength;
    }

    private void initChunkSize() throws IOException {
        ResumeResBody resumeResBody = (ResumeResBody) this.response.parseAs(ResumeResBody.class);
        this.lastResumeResBody = resumeResBody;
        this.rangeList = resumeResBody.getRangeList();
        if (resumeResBody.getSliceSize() != null) {
            this.chunkSize = calcChunkSize(getMediaContentLength(), r0.intValue());
        }
        LOGGER.m75688d("use chunkSize: " + this.chunkSize);
    }

    private boolean isMediaLengthKnown() throws IOException {
        return getMediaContentLength() >= 0;
    }

    private HttpResponse resumableUpload(GenericUrl genericUrl) throws Throwable {
        String strCalcLocalID;
        GenericUrl genericUrlFromLocal;
        boolean z;
        int i = 0;
        if (this.mediaContent instanceof FileContent) {
            strCalcLocalID = calcLocalID(genericUrl.toString(), this.metadata, (FileContent) this.mediaContent);
            genericUrlFromLocal = getGenericUrlFromLocal(strCalcLocalID);
            z = true;
        } else {
            strCalcLocalID = "";
            genericUrlFromLocal = null;
            z = false;
        }
        if (genericUrlFromLocal == null) {
            HttpResponse httpResponseExecuteUploadInitiation = executeUploadInitiation(genericUrl);
            if (!httpResponseExecuteUploadInitiation.isSuccessStatusCode()) {
                return httpResponseExecuteUploadInitiation;
            }
            try {
                String location = httpResponseExecuteUploadInitiation.getHeaders().getLocation();
                GenericUrl genericUrl2 = new GenericUrl(location);
                if (z) {
                    saveGenericUrlToLocal(strCalcLocalID, location);
                }
                httpResponseExecuteUploadInitiation.disconnect();
                genericUrlFromLocal = genericUrl2;
            } catch (Throwable th) {
                httpResponseExecuteUploadInitiation.disconnect();
                throw th;
            }
        }
        long mediaContentLength = getMediaContentLength();
        this.mediaContentLengthStr = String.valueOf(mediaContentLength);
        HttpRequest httpRequestBuildPutRequest = this.requestFactory.buildPutRequest(genericUrlFromLocal, null);
        httpRequestBuildPutRequest.getHeaders().putAll(this.initiationHeaders);
        httpRequestBuildPutRequest.setContent(new ByteArrayContent("application/json", new byte[0]));
        httpRequestBuildPutRequest.getHeaders().setContentRange("bytes */" + this.mediaContentLengthStr);
        this.response = executeCurrentRequestWithoutGZip(httpRequestBuildPutRequest, null);
        initChunkSize();
        calTotalBytesReceived();
        updateStateAndNotifyListener(UploadState.MEDIA_IN_PROGRESS);
        splitChunkUpload(genericUrlFromLocal, mediaContentLength);
        while (this.response.getStatusCode() == 308) {
            int i2 = i + 1;
            if (i >= 10) {
                break;
            }
            LOGGER.m75688d("wait server retryTime: " + i2);
            Integer processTime = this.lastResumeResBody.getProcessTime();
            if (processTime == null) {
                processTime = 1000;
            }
            try {
                Sleeper.DEFAULT.sleep(processTime.intValue());
                waitServer(genericUrlFromLocal);
                i = i2;
            } catch (InterruptedException e) {
                LOGGER.m75690e("sleep interrupted, ex: " + e.toString());
                throw new InterruptedIOException(e.toString());
            }
        }
        if (!MediaUploadErrorHandler.isRetryRequired(this.response) && this.response.getStatusCode() != 308) {
            cleanGenericUrlFromLocal(strCalcLocalID);
        }
        if (this.response.getStatusCode() == 200) {
            this.totalBytesServerReceived = getMediaContentLength();
            cleanGenericUrlFromLocal(strCalcLocalID);
            updateStateAndNotifyListener(UploadState.MEDIA_COMPLETE);
        }
        return this.response;
    }

    private void saveGenericUrlToLocal(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            UploadID uploadID = new UploadID();
            uploadID.setLocalID(str);
            uploadID.setUploadID(str2);
            uploadID.setTimeStamp(System.currentTimeMillis());
            C17871f.m76779a("UploadID", str, uploadID);
        } catch (IOException e) {
            LOGGER.m75693w("saveGenericUrlToLocal IOException: " + e.toString());
        }
    }

    private void splitChunkUpload(GenericUrl genericUrl, long j) throws IOException {
        this.childThreadException = null;
        int i = this.chunkSize;
        int i2 = j % ((long) i) == 0 ? (int) (j / ((long) i)) : ((int) (j / ((long) i))) + 1;
        Semaphore semaphore = new Semaphore((i2 * (-1)) + 1);
        for (long j2 = 0; j2 < i2; j2++) {
            int i3 = this.chunkSize;
            long j3 = j2 * ((long) i3);
            long j4 = ((((long) i3) * j2) + ((long) i3)) - 1;
            long j5 = j - 1;
            if (j4 <= j5) {
                j5 = j4;
            }
            InputStream inputStream = this.mediaContent.getInputStream();
            SliceUploadTask sliceUploadTask = new SliceUploadTask(j3, j5, (inputStream.markSupported() || !isMediaLengthKnown()) ? inputStream : new BufferedInputStream(inputStream), genericUrl, semaphore);
            this.tasks.add(sliceUploadTask);
            TaskManager.getInstance().createTask(sliceUploadTask);
        }
        try {
            semaphore.acquire();
            if (this.childThreadException != null) {
                throw this.childThreadException;
            }
            LOGGER.m75688d("semaphore end");
        } catch (InterruptedException e) {
            LOGGER.m75690e("semaphore wait failed: " + e.toString());
            cancelAllTasks();
            throw new InterruptedIOException(e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateStateAndNotifyListener(UploadState uploadState) throws IOException {
        LOGGER.m75688d("updateStateAndNotifyListener: " + this.totalBytesServerReceived + " uploadState: " + uploadState.name() + " progress " + getProgress());
        this.uploadState = uploadState;
        MediaHttpUploaderProgressListener mediaHttpUploaderProgressListener = this.progressListener;
        if (mediaHttpUploaderProgressListener != null) {
            mediaHttpUploaderProgressListener.progressChanged(this);
        }
    }

    private void waitServer(GenericUrl genericUrl) throws IOException {
        HttpRequest httpRequestBuildPutRequest = this.requestFactory.buildPutRequest(genericUrl, null);
        httpRequestBuildPutRequest.getHeaders().putAll(this.initiationHeaders);
        httpRequestBuildPutRequest.setContent(new ByteArrayContent("application/json", new byte[0]));
        httpRequestBuildPutRequest.getHeaders().setContentRange("bytes */" + this.mediaContentLengthStr);
        this.response = executeCurrentRequestWithoutGZip(httpRequestBuildPutRequest, null);
        if (this.response.getStatusCode() == 308) {
            this.lastResumeResBody = (ResumeResBody) this.response.parseAs(ResumeResBody.class);
        }
    }

    public int getChunkSize() {
        return this.chunkSize;
    }

    public boolean getDisableGZipContent() {
        return this.disableGZipContent;
    }

    public HttpHeaders getInitiationHeaders() {
        return this.initiationHeaders;
    }

    public String getInitiationRequestMethod() {
        return this.initiationRequestMethod;
    }

    public HttpContent getMediaContent() {
        return this.mediaContent;
    }

    public HttpContent getMetadata() {
        return this.metadata;
    }

    public long getNumBytesUploaded() {
        return this.totalBytesServerReceived;
    }

    public double getProgress() throws IOException {
        Preconditions.checkArgument(isMediaLengthKnown(), "Cannot call getProgress() if the specified AbstractInputStreamContent has no content length. Use  getNumBytesUploaded() to denote progress instead.");
        if (getMediaContentLength() == 0) {
            return 0.0d;
        }
        return Math.min(this.totalBytesServerReceived, getMediaContentLength()) / getMediaContentLength();
    }

    public MediaHttpUploaderProgressListener getProgressListener() {
        return this.progressListener;
    }

    public long getTotalTimeRequired() {
        return this.totalTimeRequired;
    }

    public HttpTransport getTransport() {
        return this.transport;
    }

    public UploadState getUploadState() {
        return this.uploadState;
    }

    public boolean isDirectUploadEnabled() {
        return this.directUploadEnabled;
    }

    public MediaHttpUploader setChunkSize(int i) {
        Preconditions.checkArgument(i > 0 && i % 262144 == 0, "chunkSize must be a positive multiple of 262144.");
        this.chunkSize = i;
        return this;
    }

    public MediaHttpUploader setDirectUploadEnabled(boolean z) {
        this.directUploadEnabled = z;
        return this;
    }

    public MediaHttpUploader setDisableGZipContent(boolean z) {
        this.disableGZipContent = z;
        return this;
    }

    public MediaHttpUploader setInitiationHeaders(HttpHeaders httpHeaders) {
        this.initiationHeaders = httpHeaders;
        return this;
    }

    public MediaHttpUploader setInitiationRequestMethod(String str) {
        Preconditions.checkArgument(str.equals("POST") || str.equals("PUT") || str.equals("PATCH"));
        this.initiationRequestMethod = str;
        return this;
    }

    public MediaHttpUploader setMetadata(HttpContent httpContent) {
        this.metadata = httpContent;
        return this;
    }

    public MediaHttpUploader setProgressListener(MediaHttpUploaderProgressListener mediaHttpUploaderProgressListener) {
        this.progressListener = mediaHttpUploaderProgressListener;
        return this;
    }

    public HttpResponse upload(GenericUrl genericUrl) throws IOException {
        HttpResponse httpResponseResumableUpload;
        StringBuilder sb;
        Preconditions.checkArgument(this.uploadState == UploadState.NOT_STARTED);
        new MediaOverride(this.requestFactory.getInitializer()).intercept(genericUrl);
        Logger logger = LOGGER;
        logger.m75688d("begin upload");
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (this.directUploadEnabled) {
                httpResponseResumableUpload = directUpload(genericUrl);
                this.totalTimeRequired = System.currentTimeMillis() - jCurrentTimeMillis;
                sb = new StringBuilder("end upload, totalTimeRequired:");
            } else {
                httpResponseResumableUpload = resumableUpload(genericUrl);
                this.totalTimeRequired = System.currentTimeMillis() - jCurrentTimeMillis;
                sb = new StringBuilder("end upload, totalTimeRequired:");
            }
            sb.append(this.totalTimeRequired);
            logger.m75688d(sb.toString());
            return httpResponseResumableUpload;
        } catch (Throwable th) {
            this.totalTimeRequired = System.currentTimeMillis() - jCurrentTimeMillis;
            LOGGER.m75688d("end upload, totalTimeRequired:" + this.totalTimeRequired);
            throw th;
        }
    }
}
