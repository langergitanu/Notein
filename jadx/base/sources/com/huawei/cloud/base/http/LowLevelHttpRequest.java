package com.huawei.cloud.base.http;

import com.huawei.cloud.base.http.HttpRequest;
import com.huawei.cloud.base.util.StreamingContent;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class LowLevelHttpRequest {
    private String contentEncoding;
    private long contentLength = -1;
    private String contentType;
    private HttpRequestInitializer initializer;
    private HttpRequest.ProgressListener progressListener;
    private StreamingContent streamingContent;

    public abstract void addHeader(String str, String str2) throws IOException;

    public void cancel() {
    }

    public abstract LowLevelHttpResponse execute() throws IOException;

    public final String getContentEncoding() {
        return this.contentEncoding;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public HttpRequestInitializer getInitializer() {
        return this.initializer;
    }

    public HttpRequest.ProgressListener getProgressListener() {
        return this.progressListener;
    }

    public final StreamingContent getStreamingContent() {
        return this.streamingContent;
    }

    public final void setContentEncoding(String str) throws IOException {
        this.contentEncoding = str;
    }

    public final void setContentLength(long j) throws IOException {
        this.contentLength = j;
    }

    public final void setContentType(String str) throws IOException {
        this.contentType = str;
    }

    public void setInitializer(HttpRequestInitializer httpRequestInitializer) {
        this.initializer = httpRequestInitializer;
    }

    public void setProgressListener(HttpRequest.ProgressListener progressListener) {
        this.progressListener = progressListener;
    }

    public final void setStreamingContent(StreamingContent streamingContent) throws IOException {
        this.streamingContent = streamingContent;
    }

    public void setTimeout(int i, int i2) throws IOException {
    }
}
