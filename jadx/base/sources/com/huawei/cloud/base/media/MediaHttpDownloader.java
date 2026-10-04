package com.huawei.cloud.base.media;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.cloud.base.MediaOverride;
import com.huawei.cloud.base.http.GenericUrl;
import com.huawei.cloud.base.http.HttpHeaders;
import com.huawei.cloud.base.http.HttpRequest;
import com.huawei.cloud.base.http.HttpRequestFactory;
import com.huawei.cloud.base.http.HttpRequestInitializer;
import com.huawei.cloud.base.http.HttpResponse;
import com.huawei.cloud.base.http.HttpTransport;
import com.huawei.cloud.base.json.gson.GsonFactory;
import com.huawei.cloud.base.util.ByteStreams;
import com.huawei.cloud.base.util.Logger;
import com.huawei.cloud.base.util.Preconditions;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes8.dex */
public final class MediaHttpDownloader {
    private static final Logger LOGGER = Logger.getLogger("MediaHttpDownloader");
    public static final int MAXIMUM_CHUNK_SIZE = 33554432;
    private long bytesDownloaded;
    private long mediaContentLength;
    private MediaHttpDownloaderProgressListener progressListener;
    private final HttpRequestFactory requestFactory;
    private long totalTimeRequired;
    private final HttpTransport transport;
    private boolean directDownloadEnabled = false;
    private int chunkSize = 33554432;
    private DownloadState downloadState = DownloadState.NOT_STARTED;
    private long lastBytePos = -1;

    public enum DownloadState {
        NOT_STARTED,
        MEDIA_IN_PROGRESS,
        MEDIA_COMPLETE
    }

    public MediaHttpDownloader(HttpTransport httpTransport, HttpRequestInitializer httpRequestInitializer) {
        this.transport = (HttpTransport) Preconditions.checkNotNull(httpTransport);
        this.requestFactory = httpRequestInitializer == null ? httpTransport.createRequestFactory() : httpTransport.createRequestFactory(httpRequestInitializer);
    }

    private void execute(GenericUrl genericUrl, HttpHeaders httpHeaders, OutputStream outputStream) throws IOException {
        if (this.directDownloadEnabled) {
            updateStateAndNotifyListener(DownloadState.MEDIA_IN_PROGRESS);
            long jLongValue = executeCurrentRequest(this.lastBytePos, genericUrl, httpHeaders, outputStream).getHeaders().getContentLength().longValue();
            this.mediaContentLength = jLongValue;
            this.bytesDownloaded = jLongValue;
            updateStateAndNotifyListener(DownloadState.MEDIA_COMPLETE);
            return;
        }
        while (true) {
            long j = (this.bytesDownloaded + ((long) this.chunkSize)) - 1;
            long j2 = this.lastBytePos;
            String contentRange = executeCurrentRequest(j2 != -1 ? Math.min(j2, j) : -1L, genericUrl, httpHeaders, outputStream).getHeaders().getContentRange();
            long nextByteIndex = getNextByteIndex(contentRange);
            setMediaContentLength(contentRange);
            long j3 = this.mediaContentLength;
            if (nextByteIndex >= j3) {
                this.bytesDownloaded = j3;
                updateStateAndNotifyListener(DownloadState.MEDIA_COMPLETE);
                return;
            }
            long j4 = this.lastBytePos;
            if (nextByteIndex >= j4) {
                this.bytesDownloaded = j4;
                updateStateAndNotifyListener(DownloadState.MEDIA_COMPLETE);
                return;
            } else {
                this.bytesDownloaded = nextByteIndex;
                updateStateAndNotifyListener(DownloadState.MEDIA_IN_PROGRESS);
            }
        }
    }

    private HttpResponse executeCurrentRequest(long j, GenericUrl genericUrl, HttpHeaders httpHeaders, OutputStream outputStream) throws Throwable {
        HttpRequest httpRequestBuildGetRequest = this.requestFactory.buildGetRequest(genericUrl);
        httpRequestBuildGetRequest.setParser(GsonFactory.getDefaultInstance().createJsonObjectParser());
        if (httpHeaders != null) {
            httpRequestBuildGetRequest.getHeaders().putAll(httpHeaders);
        }
        if (this.bytesDownloaded != 0 || j != -1) {
            StringBuilder sb = new StringBuilder("bytes=");
            sb.append(this.bytesDownloaded);
            sb.append(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
            if (j != -1) {
                sb.append(j);
            }
            httpRequestBuildGetRequest.getHeaders().setRange(sb.toString());
        }
        HttpResponse httpResponseExecute = httpRequestBuildGetRequest.execute();
        InputStream content = httpResponseExecute.getContent();
        try {
            httpResponseExecute.getHeaders().setContentLength(Long.valueOf(ByteStreams.copy(content, outputStream)));
            return httpResponseExecute;
        } finally {
            content.close();
            httpResponseExecute.disconnect();
        }
    }

    private long getNextByteIndex(String str) {
        if (str == null) {
            return 0L;
        }
        return Long.parseLong(str.substring(str.indexOf(45) + 1, str.indexOf(47))) + 1;
    }

    private void setMediaContentLength(String str) {
        if (str != null && this.mediaContentLength == 0) {
            this.mediaContentLength = Long.parseLong(str.substring(str.indexOf(47) + 1));
        }
    }

    private void updateStateAndNotifyListener(DownloadState downloadState) throws IOException {
        this.downloadState = downloadState;
        MediaHttpDownloaderProgressListener mediaHttpDownloaderProgressListener = this.progressListener;
        if (mediaHttpDownloaderProgressListener != null) {
            mediaHttpDownloaderProgressListener.progressChanged(this);
        }
    }

    public void download(GenericUrl genericUrl, OutputStream outputStream) throws IOException {
        download(genericUrl, null, outputStream);
    }

    public int getChunkSize() {
        return this.chunkSize;
    }

    public DownloadState getDownloadState() {
        return this.downloadState;
    }

    public long getLastBytePosition() {
        return this.lastBytePos;
    }

    public long getNumBytesDownloaded() {
        return this.bytesDownloaded;
    }

    public double getProgress() {
        long j = this.mediaContentLength;
        if (j == 0) {
            return 0.0d;
        }
        return this.bytesDownloaded / j;
    }

    public MediaHttpDownloaderProgressListener getProgressListener() {
        return this.progressListener;
    }

    public long getTotalTimeRequired() {
        return this.totalTimeRequired;
    }

    public HttpTransport getTransport() {
        return this.transport;
    }

    public boolean isDirectDownloadEnabled() {
        return this.directDownloadEnabled;
    }

    public MediaHttpDownloader setBytesDownloaded(long j) {
        Preconditions.checkArgument(j >= 0);
        this.bytesDownloaded = j;
        return this;
    }

    public MediaHttpDownloader setChunkSize(int i) {
        Preconditions.checkArgument(i > 0 && i <= 33554432);
        this.chunkSize = i;
        return this;
    }

    public MediaHttpDownloader setContentRange(long j, long j2) {
        Preconditions.checkArgument(j2 >= j);
        setBytesDownloaded(j);
        this.lastBytePos = j2;
        return this;
    }

    public MediaHttpDownloader setDirectDownloadEnabled(boolean z) {
        this.directDownloadEnabled = z;
        return this;
    }

    public MediaHttpDownloader setProgressListener(MediaHttpDownloaderProgressListener mediaHttpDownloaderProgressListener) {
        this.progressListener = mediaHttpDownloaderProgressListener;
        return this;
    }

    public void download(GenericUrl genericUrl, HttpHeaders httpHeaders, OutputStream outputStream) throws IOException {
        Preconditions.checkArgument(this.downloadState == DownloadState.NOT_STARTED);
        if (httpHeaders == null) {
            httpHeaders = new HttpHeaders();
        }
        genericUrl.put("form", FirebaseAnalytics.Param.CONTENT);
        new MediaOverride(this.requestFactory.getInitializer()).intercept(genericUrl);
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            execute(genericUrl, httpHeaders, outputStream);
        } finally {
            this.totalTimeRequired = System.currentTimeMillis() - jCurrentTimeMillis;
        }
    }
}
