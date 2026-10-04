package com.huawei.cloud.base.media;

import com.huawei.cloud.base.http.HttpIOExceptionHandler;
import com.huawei.cloud.base.http.HttpRequest;
import com.huawei.cloud.base.http.HttpResponse;
import com.huawei.cloud.base.http.HttpUnsuccessfulResponseHandler;
import com.huawei.cloud.base.media.MediaHttpUploader;
import com.huawei.cloud.base.util.Preconditions;
import com.huawei.cloud.base.util.Sleeper;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
class MediaUploadErrorHandler implements HttpIOExceptionHandler, HttpUnsuccessfulResponseHandler {
    private static final Logger LOGGER = Logger.getLogger(MediaUploadErrorHandler.class.getName());
    public static final long RETRY_DELAY_TIME = 10000;
    private final HttpIOExceptionHandler originalIOExceptionHandler;
    private final HttpUnsuccessfulResponseHandler originalUnsuccessfulHandler;
    public long retryCount = 1;
    private final MediaHttpUploader.SliceUploadTask uploader;

    public MediaUploadErrorHandler(MediaHttpUploader.SliceUploadTask sliceUploadTask, HttpRequest httpRequest) {
        this.uploader = (MediaHttpUploader.SliceUploadTask) Preconditions.checkNotNull(sliceUploadTask);
        this.originalIOExceptionHandler = httpRequest.getIOExceptionHandler();
        this.originalUnsuccessfulHandler = httpRequest.getUnsuccessfulResponseHandler();
        httpRequest.setIOExceptionHandler(this);
        httpRequest.setUnsuccessfulResponseHandler(this);
    }

    public static boolean isRetryRequired(HttpResponse httpResponse) {
        int statusCode = httpResponse.getStatusCode();
        return statusCode == 401 || statusCode == 429 || statusCode == 500 || statusCode == 502 || statusCode == 503 || statusCode == 504;
    }

    @Override // com.huawei.cloud.base.http.HttpIOExceptionHandler
    public boolean handleIOException(HttpRequest httpRequest, boolean z) throws IOException {
        HttpIOExceptionHandler httpIOExceptionHandler = this.originalIOExceptionHandler;
        boolean zHandleIOException = httpIOExceptionHandler != null ? httpIOExceptionHandler.handleIOException(httpRequest, z) : true;
        if (zHandleIOException) {
            try {
                this.uploader.serverErrorCallback();
                return zHandleIOException;
            } catch (IOException e) {
                LOGGER.log(Level.WARNING, "exception thrown while calling server callback" + e.getMessage());
            }
        }
        return zHandleIOException;
    }

    @Override // com.huawei.cloud.base.http.HttpUnsuccessfulResponseHandler
    public boolean handleResponse(HttpRequest httpRequest, HttpResponse httpResponse, boolean z) throws IOException {
        HttpUnsuccessfulResponseHandler httpUnsuccessfulResponseHandler = this.originalUnsuccessfulHandler;
        if (httpUnsuccessfulResponseHandler != null) {
            httpUnsuccessfulResponseHandler.handleResponse(httpRequest, httpResponse, z);
        }
        boolean zIsRetryRequired = isRetryRequired(httpResponse);
        if (!z || !zIsRetryRequired) {
            return false;
        }
        try {
            this.uploader.serverErrorCallback();
            Sleeper.DEFAULT.sleep(this.retryCount * 10000);
            this.retryCount++;
            return true;
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "exception thrown while calling server callback" + e.getMessage());
            return false;
        }
    }
}
