package com.alibaba.sdk.android.oss.internal;

import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.ClientException;
import com.alibaba.sdk.android.oss.ServiceException;
import com.alibaba.sdk.android.oss.TaskCancelException;
import com.alibaba.sdk.android.oss.callback.OSSCompletedCallback;
import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.common.utils.BinaryUtil;
import com.alibaba.sdk.android.oss.common.utils.CRC64;
import com.alibaba.sdk.android.oss.common.utils.OSSSharedPreferences;
import com.alibaba.sdk.android.oss.common.utils.OSSUtils;
import com.alibaba.sdk.android.oss.model.AbortMultipartUploadRequest;
import com.alibaba.sdk.android.oss.model.CompleteMultipartUploadResult;
import com.alibaba.sdk.android.oss.model.InitiateMultipartUploadRequest;
import com.alibaba.sdk.android.oss.model.InitiateMultipartUploadResult;
import com.alibaba.sdk.android.oss.model.ListPartsRequest;
import com.alibaba.sdk.android.oss.model.ListPartsResult;
import com.alibaba.sdk.android.oss.model.PartETag;
import com.alibaba.sdk.android.oss.model.PartSummary;
import com.alibaba.sdk.android.oss.model.ResumableUploadRequest;
import com.alibaba.sdk.android.oss.model.ResumableUploadResult;
import com.alibaba.sdk.android.oss.model.UploadPartRequest;
import com.alibaba.sdk.android.oss.model.UploadPartResult;
import com.alibaba.sdk.android.oss.network.ExecutionContext;
import com.aspose.slides.C22218Oooo;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.CheckedInputStream;

/* JADX INFO: loaded from: classes.dex */
public class SequenceUploadTask extends BaseMultipartUploadTask<ResumableUploadRequest, ResumableUploadResult> implements Callable<ResumableUploadResult> {
    private List<Integer> mAlreadyUploadIndex;
    private File mCRC64RecordFile;
    private long mFirstPartSize;
    private File mRecordFile;
    private OSSSharedPreferences mSp;

    public SequenceUploadTask(ResumableUploadRequest resumableUploadRequest, OSSCompletedCallback<ResumableUploadRequest, ResumableUploadResult> oSSCompletedCallback, ExecutionContext executionContext, InternalRequestOperation internalRequestOperation) {
        super(internalRequestOperation, resumableUploadRequest, oSSCompletedCallback, executionContext);
        this.mAlreadyUploadIndex = new ArrayList();
        this.mSp = OSSSharedPreferences.instance(this.mContext.getApplicationContext());
    }

    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public void abortThisUpload() {
        if (this.mUploadId != null) {
            this.mApiOperation.abortMultipartUpload(new AbortMultipartUploadRequest(((ResumableUploadRequest) this.mRequest).getBucketName(), ((ResumableUploadRequest) this.mRequest).getObjectKey(), this.mUploadId), null).waitUntilFinished();
        }
    }

    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public void checkException() throws Throwable {
        ObjectOutputStream objectOutputStream;
        if (this.mContext.getCancellationHandler().isCancelled()) {
            if (((ResumableUploadRequest) this.mRequest).deleteUploadOnCancelling().booleanValue()) {
                abortThisUpload();
                File file = this.mRecordFile;
                if (file != null) {
                    file.delete();
                }
            } else {
                List<PartETag> list = this.mPartETags;
                if (list != null && list.size() > 0 && this.mCheckCRC64 && ((ResumableUploadRequest) this.mRequest).getRecordDirectory() != null) {
                    HashMap map = new HashMap();
                    for (PartETag partETag : this.mPartETags) {
                        map.put(Integer.valueOf(partETag.getPartNumber()), Long.valueOf(partETag.getCRC64()));
                    }
                    ObjectOutputStream objectOutputStream2 = null;
                    try {
                        try {
                            File file2 = new File(((ResumableUploadRequest) this.mRequest).getRecordDirectory() + File.separator + this.mUploadId);
                            this.mCRC64RecordFile = file2;
                            if (!file2.exists()) {
                                this.mCRC64RecordFile.createNewFile();
                            }
                            objectOutputStream = new ObjectOutputStream(new FileOutputStream(this.mCRC64RecordFile));
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (IOException e) {
                        e = e;
                    }
                    try {
                        objectOutputStream.writeObject(map);
                        objectOutputStream.close();
                    } catch (IOException e2) {
                        e = e2;
                        objectOutputStream2 = objectOutputStream;
                        OSSLog.logThrowable2Local(e);
                        if (objectOutputStream2 != null) {
                            objectOutputStream2.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        objectOutputStream2 = objectOutputStream;
                        if (objectOutputStream2 != null) {
                            objectOutputStream2.close();
                        }
                        throw th;
                    }
                }
            }
        }
        super.checkException();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x012d  */
    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void initMultipartUploadId() throws ServiceException, ClientException, IOException {
        String strCalculateMd5Str;
        Map map;
        boolean zIsTruncated;
        if (!OSSUtils.isEmptyString(((ResumableUploadRequest) this.mRequest).getRecordDirectory())) {
            if (this.mUploadUri != null) {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.mContext.getApplicationContext().getContentResolver().openFileDescriptor(this.mUploadUri, "r");
                try {
                    strCalculateMd5Str = BinaryUtil.calculateMd5Str(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    throw th;
                }
            } else {
                strCalculateMd5Str = BinaryUtil.calculateMd5Str(this.mUploadFilePath);
            }
            StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(strCalculateMd5Str);
            sbOooO0OO.append(((ResumableUploadRequest) this.mRequest).getBucketName());
            sbOooO0OO.append(((ResumableUploadRequest) this.mRequest).getObjectKey());
            sbOooO0OO.append(String.valueOf(((ResumableUploadRequest) this.mRequest).getPartSize()));
            sbOooO0OO.append(this.mCheckCRC64 ? "-crc64" : "");
            sbOooO0OO.append("-sequence");
            String strCalculateMd5Str2 = BinaryUtil.calculateMd5Str(sbOooO0OO.toString().getBytes());
            StringBuilder sb = new StringBuilder();
            sb.append(((ResumableUploadRequest) this.mRequest).getRecordDirectory());
            String str = File.separator;
            File file = new File(androidx.concurrent.futures.OooO00o.OooO0OO(sb, str, strCalculateMd5Str2));
            this.mRecordFile = file;
            if (file.exists()) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(this.mRecordFile));
                this.mUploadId = bufferedReader.readLine();
                bufferedReader.close();
                OSSLog.logDebug("sequence [initUploadId] - Found record file, uploadid: " + this.mUploadId);
            }
            if (!OSSUtils.isEmptyString(this.mUploadId)) {
                if (this.mCheckCRC64) {
                    File file2 = new File(((ResumableUploadRequest) this.mRequest).getRecordDirectory() + str + this.mUploadId);
                    if (file2.exists()) {
                        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file2));
                        try {
                            try {
                                map = (Map) objectInputStream.readObject();
                                try {
                                    file2.delete();
                                } catch (ClassNotFoundException e) {
                                    e = e;
                                    OSSLog.logThrowable2Local(e);
                                }
                            } catch (ClassNotFoundException e2) {
                                e = e2;
                                map = null;
                            }
                        } finally {
                            objectInputStream.close();
                            file2.delete();
                        }
                    } else {
                        map = null;
                    }
                    int nextPartNumberMarker = 0;
                    do {
                        ListPartsRequest listPartsRequest = new ListPartsRequest(((ResumableUploadRequest) this.mRequest).getBucketName(), ((ResumableUploadRequest) this.mRequest).getObjectKey(), this.mUploadId);
                        if (nextPartNumberMarker > 0) {
                            listPartsRequest.setPartNumberMarker(Integer.valueOf(nextPartNumberMarker));
                        }
                        OSSAsyncTask<ListPartsResult> oSSAsyncTaskListParts = this.mApiOperation.listParts(listPartsRequest, null);
                        try {
                            ListPartsResult listPartsResult = (ListPartsResult) oSSAsyncTaskListParts.getResult();
                            zIsTruncated = listPartsResult.isTruncated();
                            nextPartNumberMarker = listPartsResult.getNextPartNumberMarker();
                            List<PartSummary> parts = listPartsResult.getParts();
                            for (int i = 0; i < parts.size(); i++) {
                                PartSummary partSummary = parts.get(i);
                                PartETag partETag = new PartETag(partSummary.getPartNumber(), partSummary.getETag());
                                partETag.setPartSize(partSummary.getSize());
                                if (map != null && map.size() > 0 && map.containsKey(Integer.valueOf(partETag.getPartNumber()))) {
                                    partETag.setCRC64(((Long) map.get(Integer.valueOf(partETag.getPartNumber()))).longValue());
                                }
                                this.mPartETags.add(partETag);
                                this.mUploadedLength += partSummary.getSize();
                                this.mAlreadyUploadIndex.add(Integer.valueOf(partSummary.getPartNumber()));
                                if (i == 0) {
                                    this.mFirstPartSize = partSummary.getSize();
                                }
                            }
                        } catch (ClientException e3) {
                            throw e3;
                        } catch (ServiceException e4) {
                            if (e4.getStatusCode() != 404) {
                                throw e4;
                            }
                            this.mUploadId = null;
                            zIsTruncated = false;
                        }
                        oSSAsyncTaskListParts.waitUntilFinished();
                    } while (zIsTruncated);
                }
            }
            if (!this.mRecordFile.exists() && !this.mRecordFile.createNewFile()) {
                throw new ClientException("Can't create file at path: " + this.mRecordFile.getAbsolutePath() + "\nPlease make sure the directory exist!");
            }
        }
        if (OSSUtils.isEmptyString(this.mUploadId)) {
            InitiateMultipartUploadRequest initiateMultipartUploadRequest = new InitiateMultipartUploadRequest(((ResumableUploadRequest) this.mRequest).getBucketName(), ((ResumableUploadRequest) this.mRequest).getObjectKey(), ((ResumableUploadRequest) this.mRequest).getMetadata());
            initiateMultipartUploadRequest.isSequential = true;
            this.mUploadId = ((InitiateMultipartUploadResult) this.mApiOperation.initMultipartUpload(initiateMultipartUploadRequest, null).getResult()).getUploadId();
            if (this.mRecordFile != null) {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.mRecordFile));
                bufferedWriter.write(this.mUploadId);
                bufferedWriter.close();
            }
        }
        ((ResumableUploadRequest) this.mRequest).setUploadId(this.mUploadId);
    }

    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public void processException(Exception exc) {
        if (this.mUploadException == null || !exc.getMessage().equals(this.mUploadException.getMessage())) {
            this.mUploadException = exc;
        }
        OSSLog.logThrowable2Local(exc);
        if (!this.mContext.getCancellationHandler().isCancelled() || this.mIsCancel) {
            return;
        }
        this.mIsCancel = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d0 A[Catch: IOException -> 0x01c7, TRY_LEAVE, TryCatch #8 {IOException -> 0x01c7, blocks: (B:94:0x01c3, B:98:0x01cb, B:100:0x01d0), top: B:106:0x01c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4 A[Catch: all -> 0x00e0, Exception -> 0x00e3, ServiceException -> 0x00e7, TryCatch #0 {all -> 0x00e0, blocks: (B:36:0x008b, B:37:0x00a4, B:39:0x00d4, B:46:0x00eb, B:48:0x0104, B:59:0x0126, B:60:0x0138, B:79:0x0162, B:81:0x016a, B:82:0x016e, B:84:0x0188, B:85:0x01a6), top: B:104:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104 A[Catch: all -> 0x00e0, Exception -> 0x00e3, ServiceException -> 0x00e7, TRY_LEAVE, TryCatch #0 {all -> 0x00e0, blocks: (B:36:0x008b, B:37:0x00a4, B:39:0x00d4, B:46:0x00eb, B:48:0x0104, B:59:0x0126, B:60:0x0138, B:79:0x0162, B:81:0x016a, B:82:0x016e, B:84:0x0188, B:85:0x01a6), top: B:104:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0126 A[Catch: all -> 0x00e0, Exception -> 0x00e3, ServiceException -> 0x00e7, TRY_ENTER, TryCatch #0 {all -> 0x00e0, blocks: (B:36:0x008b, B:37:0x00a4, B:39:0x00d4, B:46:0x00eb, B:48:0x0104, B:59:0x0126, B:60:0x0138, B:79:0x0162, B:81:0x016a, B:82:0x016e, B:84:0x0188, B:85:0x01a6), top: B:104:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0150 A[Catch: IOException -> 0x0114, TRY_ENTER, TryCatch #3 {IOException -> 0x0114, blocks: (B:50:0x0110, B:54:0x0118, B:56:0x011d, B:71:0x0150, B:73:0x0155, B:75:0x015a, B:87:0x01b3, B:89:0x01b8, B:91:0x01bd), top: B:105:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0155 A[Catch: IOException -> 0x0114, TryCatch #3 {IOException -> 0x0114, blocks: (B:50:0x0110, B:54:0x0118, B:56:0x011d, B:71:0x0150, B:73:0x0155, B:75:0x015a, B:87:0x01b3, B:89:0x01b8, B:91:0x01bd), top: B:105:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015a A[Catch: IOException -> 0x0114, TRY_LEAVE, TryCatch #3 {IOException -> 0x0114, blocks: (B:50:0x0110, B:54:0x0118, B:56:0x011d, B:71:0x0150, B:73:0x0155, B:75:0x015a, B:87:0x01b3, B:89:0x01b8, B:91:0x01bd), top: B:105:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cb A[Catch: IOException -> 0x01c7, TryCatch #8 {IOException -> 0x01c7, blocks: (B:94:0x01c3, B:98:0x01cb, B:100:0x01d0), top: B:106:0x01c3 }] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask, com.alibaba.sdk.android.oss.internal.SequenceUploadTask] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.alibaba.sdk.android.oss.model.UploadPartRequest] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void uploadPart(int i, int i2, int i3) {
        ?? r9;
        ?? r92;
        ?? r7;
        ?? r8;
        ?? r93;
        ?? r82;
        ?? r72;
        ?? r0;
        ?? r83;
        UploadPartRequest uploadPartRequest;
        BufferedInputStream bufferedInputStream;
        ?? r2 = 0;
        r2 = 0;
        ?? r22 = 0;
        r2 = 0;
        r2 = 0;
        r2 = 0;
        r2 = 0;
        try {
            try {
                try {
                } catch (Throwable th) {
                    r0 = th;
                }
            } catch (ServiceException e) {
                e = e;
                r7 = r2;
                r8 = r7;
                r93 = r8;
            } catch (Exception e2) {
                e = e2;
                ?? r84 = r2;
                r92 = r84;
                r22 = r2;
                r83 = r84;
            } catch (Throwable th2) {
                ?? r73 = r2;
                ?? r85 = r73;
                r9 = r85;
                r0 = th2;
                r72 = r73;
                r82 = r85;
            }
            if (this.mContext.getCancellationHandler().isCancelled()) {
                return;
            }
            this.mRunPartTaskCount++;
            preUploadPart(i, i2, i3);
            long partSize = ((long) i) * ((ResumableUploadRequest) this.mRequest).getPartSize();
            byte[] bArr = new byte[i2];
            if (this.mUploadUri != null) {
                InputStream inputStreamOpenInputStream = this.mContext.getApplicationContext().getContentResolver().openInputStream(this.mUploadUri);
                try {
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStreamOpenInputStream);
                    try {
                        bufferedInputStream2.skip(partSize);
                        bufferedInputStream2.read(bArr, 0, i2);
                        r7 = 0;
                        r93 = bufferedInputStream2;
                        r8 = inputStreamOpenInputStream;
                        try {
                            try {
                                uploadPartRequest = new UploadPartRequest(((ResumableUploadRequest) this.mRequest).getBucketName(), ((ResumableUploadRequest) this.mRequest).getObjectKey(), this.mUploadId, i + 1);
                                try {
                                    uploadPartRequest.setPartContent(bArr);
                                    uploadPartRequest.setMd5Digest(BinaryUtil.calculateBase64Md5(bArr));
                                    uploadPartRequest.setCRC64(((ResumableUploadRequest) this.mRequest).getCRC64());
                                    UploadPartResult uploadPartResultSyncUploadPart = this.mApiOperation.syncUploadPart(uploadPartRequest);
                                    PartETag partETag = new PartETag(uploadPartRequest.getPartNumber(), uploadPartResultSyncUploadPart.getETag());
                                    long j = i2;
                                    partETag.setPartSize(j);
                                    if (this.mCheckCRC64) {
                                        partETag.setCRC64(uploadPartResultSyncUploadPart.getClientCRC().longValue());
                                    }
                                    this.mPartETags.add(partETag);
                                    this.mUploadedLength += j;
                                    uploadPartFinish(partETag);
                                    if (!this.mContext.getCancellationHandler().isCancelled()) {
                                        TaskCancelException taskCancelException = new TaskCancelException("sequence upload task cancel");
                                        throw new ClientException(taskCancelException.getMessage(), taskCancelException, Boolean.TRUE);
                                    }
                                    onProgressCallback(this.mRequest, this.mUploadedLength, this.mFileLength);
                                    if (r7 != 0) {
                                        r7.close();
                                    }
                                    if (r8 != 0) {
                                        r8.close();
                                    }
                                    if (r93 != 0) {
                                        r93.close();
                                        return;
                                    }
                                    return;
                                } catch (ServiceException e3) {
                                    e = e3;
                                    r2 = uploadPartRequest;
                                }
                            } catch (ServiceException e4) {
                                e = e4;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            r22 = r7;
                            r83 = r8;
                            r92 = r93;
                            try {
                                processException(e);
                                if (r22 != 0) {
                                    r22.close();
                                }
                                if (r83 != 0) {
                                    r83.close();
                                }
                                if (r92 != 0) {
                                    r92.close();
                                    return;
                                }
                                return;
                            } catch (Throwable th3) {
                                r72 = r22;
                                r0 = th3;
                                r82 = r83;
                                r9 = r92;
                                r2 = r0;
                                if (r72 != 0) {
                                }
                                if (r82 != 0) {
                                }
                                if (r9 != 0) {
                                }
                            }
                        }
                    } catch (ServiceException e6) {
                        e = e6;
                        r7 = 0;
                        r93 = bufferedInputStream2;
                        r8 = inputStreamOpenInputStream;
                    } catch (Exception e7) {
                        e = e7;
                        bufferedInputStream = bufferedInputStream2;
                        r83 = inputStreamOpenInputStream;
                        r92 = bufferedInputStream;
                        processException(e);
                        if (r22 != 0) {
                        }
                        if (r83 != 0) {
                        }
                        if (r92 != 0) {
                        }
                    } catch (Throwable th4) {
                        r72 = 0;
                        r9 = bufferedInputStream2;
                        r2 = th4;
                        r82 = inputStreamOpenInputStream;
                        if (r72 != 0) {
                        }
                        if (r82 != 0) {
                        }
                        if (r9 != 0) {
                        }
                    }
                } catch (ServiceException e8) {
                    e = e8;
                    r7 = 0;
                    r93 = 0;
                } catch (Exception e9) {
                    e = e9;
                    bufferedInputStream = null;
                } catch (Throwable th5) {
                    r72 = 0;
                    r9 = 0;
                    r82 = inputStreamOpenInputStream;
                    r0 = th5;
                    r2 = r0;
                }
            } else {
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.mUploadFile, "r");
                try {
                    randomAccessFile.seek(partSize);
                    randomAccessFile.readFully(bArr, 0, i2);
                    r8 = 0;
                    r93 = 0;
                    r7 = randomAccessFile;
                    uploadPartRequest = new UploadPartRequest(((ResumableUploadRequest) this.mRequest).getBucketName(), ((ResumableUploadRequest) this.mRequest).getObjectKey(), this.mUploadId, i + 1);
                    uploadPartRequest.setPartContent(bArr);
                    uploadPartRequest.setMd5Digest(BinaryUtil.calculateBase64Md5(bArr));
                    uploadPartRequest.setCRC64(((ResumableUploadRequest) this.mRequest).getCRC64());
                    UploadPartResult uploadPartResultSyncUploadPart2 = this.mApiOperation.syncUploadPart(uploadPartRequest);
                    PartETag partETag2 = new PartETag(uploadPartRequest.getPartNumber(), uploadPartResultSyncUploadPart2.getETag());
                    long j2 = i2;
                    partETag2.setPartSize(j2);
                    if (this.mCheckCRC64) {
                    }
                    this.mPartETags.add(partETag2);
                    this.mUploadedLength += j2;
                    uploadPartFinish(partETag2);
                    if (!this.mContext.getCancellationHandler().isCancelled()) {
                    }
                } catch (ServiceException e10) {
                    e = e10;
                    r8 = 0;
                    r93 = 0;
                    r7 = randomAccessFile;
                } catch (Exception e11) {
                    e = e11;
                    r83 = 0;
                    r92 = 0;
                    r22 = randomAccessFile;
                    processException(e);
                    if (r22 != 0) {
                    }
                    if (r83 != 0) {
                    }
                    if (r92 != 0) {
                    }
                } catch (Throwable th6) {
                    r82 = 0;
                    r9 = 0;
                    r72 = randomAccessFile;
                    r0 = th6;
                    r2 = r0;
                    if (r72 != 0) {
                    }
                    if (r82 != 0) {
                    }
                    if (r9 != 0) {
                    }
                }
            }
            if (r72 != 0) {
                try {
                    r72.close();
                } catch (IOException e12) {
                    OSSLog.logThrowable2Local(e12);
                    throw r2;
                }
            }
            if (r82 != 0) {
                r82.close();
            }
            if (r9 != 0) {
                throw r2;
            }
            r9.close();
            throw r2;
            if (e.getStatusCode() != 409) {
                processException(e);
            } else {
                PartETag partETag3 = new PartETag(r2.getPartNumber(), e.getPartEtag());
                partETag3.setPartSize(r2.getPartContent().length);
                if (this.mCheckCRC64) {
                    partETag3.setCRC64(new CheckedInputStream(new ByteArrayInputStream(r2.getPartContent()), new CRC64()).getChecksum().getValue());
                }
                this.mPartETags.add(partETag3);
                this.mUploadedLength += (long) i2;
            }
            if (r7 != 0) {
                r7.close();
            }
            if (r8 != 0) {
                r8.close();
            }
            if (r93 != 0) {
                r93.close();
            }
        } catch (IOException e13) {
            OSSLog.logThrowable2Local(e13);
        }
    }

    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public void uploadPartFinish(PartETag partETag) throws Exception {
        if (!this.mContext.getCancellationHandler().isCancelled() || this.mSp.contains(this.mUploadId)) {
            return;
        }
        this.mSp.setStringValue(this.mUploadId, String.valueOf(this.mUploadedLength));
        onProgressCallback(this.mRequest, this.mUploadedLength, this.mFileLength);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public ResumableUploadResult doMultipartUpload() throws Throwable {
        long j = this.mUploadedLength;
        checkCancel();
        int[] iArr = this.mPartAttr;
        int i = iArr[0];
        int i2 = iArr[1];
        if (this.mPartETags.size() > 0 && this.mAlreadyUploadIndex.size() > 0) {
            long jLongValue = this.mUploadedLength;
            if (jLongValue > this.mFileLength) {
                throw new ClientException("The uploading file is inconsistent with before");
            }
            if (this.mFirstPartSize != i) {
                throw new ClientException("The part size setting is inconsistent with before");
            }
            if (!TextUtils.isEmpty(this.mSp.getStringValue(this.mUploadId))) {
                jLongValue = Long.valueOf(this.mSp.getStringValue(this.mUploadId)).longValue();
            }
            long j2 = jLongValue;
            OSSProgressCallback<Request> oSSProgressCallback = this.mProgressCallback;
            if (oSSProgressCallback != 0) {
                oSSProgressCallback.onProgress(this.mRequest, j2, this.mFileLength);
            }
            this.mSp.removeKey(this.mUploadId);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.mAlreadyUploadIndex.size() == 0 || !this.mAlreadyUploadIndex.contains(Integer.valueOf(i3 + 1))) {
                if (i3 == i2 - 1) {
                    i = (int) (this.mFileLength - j);
                }
                OSSLog.logDebug("upload part readByte : " + i);
                j += (long) i;
                uploadPart(i3, i, i2);
                if (this.mUploadException != null) {
                    break;
                }
            }
        }
        checkException();
        CompleteMultipartUploadResult completeMultipartUploadResult = completeMultipartUploadResult();
        ResumableUploadResult resumableUploadResult = completeMultipartUploadResult != null ? new ResumableUploadResult(completeMultipartUploadResult) : null;
        File file = this.mRecordFile;
        if (file != null) {
            file.delete();
        }
        File file2 = this.mCRC64RecordFile;
        if (file2 != null) {
            file2.delete();
        }
        return resumableUploadResult;
    }
}
