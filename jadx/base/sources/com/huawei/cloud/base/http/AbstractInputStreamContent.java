package com.huawei.cloud.base.http;

import com.huawei.cloud.base.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractInputStreamContent implements HttpContent {
    private boolean closeInputStream = true;
    private String type;

    public AbstractInputStreamContent(String str) {
        setType(str);
    }

    public final boolean getCloseInputStream() {
        return this.closeInputStream;
    }

    public abstract InputStream getInputStream() throws IOException;

    @Override // com.huawei.cloud.base.http.HttpContent
    public String getType() {
        return this.type;
    }

    public AbstractInputStreamContent setCloseInputStream(boolean z) {
        this.closeInputStream = z;
        return this;
    }

    public AbstractInputStreamContent setType(String str) {
        this.type = str;
        return this;
    }

    @Override // com.huawei.cloud.base.http.HttpContent, com.huawei.cloud.base.util.StreamingContent
    public void writeTo(OutputStream outputStream) throws IOException {
        IOUtils.copy(getInputStream(), outputStream, this.closeInputStream);
        outputStream.flush();
    }
}
