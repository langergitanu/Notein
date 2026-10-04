package com.huawei.cloud.base.http;

import com.huawei.cloud.base.util.Charsets;
import com.huawei.cloud.base.util.IOUtils;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractHttpContent implements HttpContent {
    private long computedLength;
    private HttpMediaType mediaType;

    public AbstractHttpContent(String str) {
        this(str == null ? null : new HttpMediaType(str));
    }

    public static long computeLength(HttpContent httpContent) throws IOException {
        if (httpContent.retrySupported()) {
            return IOUtils.computeLength(httpContent);
        }
        return -1L;
    }

    public final Charset getCharset() {
        HttpMediaType httpMediaType = this.mediaType;
        return (httpMediaType == null || httpMediaType.getCharsetParameter() == null) ? Charsets.UTF_8 : this.mediaType.getCharsetParameter();
    }

    @Override // com.huawei.cloud.base.http.HttpContent
    public long getLength() throws IOException {
        if (this.computedLength == -1) {
            this.computedLength = computeLength();
        }
        return this.computedLength;
    }

    public final HttpMediaType getMediaType() {
        return this.mediaType;
    }

    @Override // com.huawei.cloud.base.http.HttpContent
    public String getType() {
        HttpMediaType httpMediaType = this.mediaType;
        if (httpMediaType == null) {
            return null;
        }
        return httpMediaType.build();
    }

    @Override // com.huawei.cloud.base.http.HttpContent
    public boolean retrySupported() {
        return true;
    }

    public AbstractHttpContent setMediaType(HttpMediaType httpMediaType) {
        this.mediaType = httpMediaType;
        return this;
    }

    public AbstractHttpContent(HttpMediaType httpMediaType) {
        this.computedLength = -1L;
        this.mediaType = httpMediaType;
    }

    public long computeLength() throws IOException {
        return computeLength(this);
    }
}
