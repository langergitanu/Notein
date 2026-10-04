package com.huawei.cloud.base.http;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes8.dex */
public class EmptyContent implements HttpContent {
    @Override // com.huawei.cloud.base.http.HttpContent
    public long getLength() throws IOException {
        return 0L;
    }

    @Override // com.huawei.cloud.base.http.HttpContent
    public String getType() {
        return null;
    }

    @Override // com.huawei.cloud.base.http.HttpContent
    public boolean retrySupported() {
        return true;
    }

    @Override // com.huawei.cloud.base.http.HttpContent, com.huawei.cloud.base.util.StreamingContent
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.flush();
    }
}
