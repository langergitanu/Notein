package com.huawei.cloud.base.http;

import com.huawei.cloud.base.util.StreamingContent;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes8.dex */
public interface HttpContent extends StreamingContent {
    long getLength() throws IOException;

    String getType();

    boolean retrySupported();

    @Override // com.huawei.cloud.base.util.StreamingContent
    void writeTo(OutputStream outputStream) throws IOException;
}
