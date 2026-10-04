package com.huawei.cloud.base.http;

import com.huawei.cloud.base.util.StreamingContent;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes8.dex */
public interface HttpEncoding {
    void encode(StreamingContent streamingContent, OutputStream outputStream) throws IOException;

    String getName();
}
