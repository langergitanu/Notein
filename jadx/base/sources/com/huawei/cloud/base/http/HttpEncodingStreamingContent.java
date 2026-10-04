package com.huawei.cloud.base.http;

import com.huawei.cloud.base.util.Preconditions;
import com.huawei.cloud.base.util.StreamingContent;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes8.dex */
public final class HttpEncodingStreamingContent implements StreamingContent {
    private final StreamingContent content;
    private final HttpEncoding encoding;

    public HttpEncodingStreamingContent(StreamingContent streamingContent, HttpEncoding httpEncoding) {
        this.content = (StreamingContent) Preconditions.checkNotNull(streamingContent);
        this.encoding = (HttpEncoding) Preconditions.checkNotNull(httpEncoding);
    }

    public StreamingContent getContent() {
        return this.content;
    }

    public HttpEncoding getEncoding() {
        return this.encoding;
    }

    @Override // com.huawei.cloud.base.util.StreamingContent
    public void writeTo(OutputStream outputStream) throws IOException {
        this.encoding.encode(this.content, outputStream);
    }
}
