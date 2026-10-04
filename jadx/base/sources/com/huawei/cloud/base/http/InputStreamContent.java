package com.huawei.cloud.base.http;

import com.huawei.cloud.base.util.Preconditions;
import java.io.InputStream;

/* JADX INFO: loaded from: classes8.dex */
public final class InputStreamContent extends AbstractInputStreamContent {
    private final InputStream inputStream;
    private long length;
    private boolean retrySupported;

    public InputStreamContent(String str, InputStream inputStream) {
        super(str);
        this.length = -1L;
        this.inputStream = (InputStream) Preconditions.checkNotNull(inputStream);
    }

    @Override // com.huawei.cloud.base.http.AbstractInputStreamContent
    public InputStream getInputStream() {
        return this.inputStream;
    }

    @Override // com.huawei.cloud.base.http.HttpContent
    public long getLength() {
        return this.length;
    }

    @Override // com.huawei.cloud.base.http.HttpContent
    public boolean retrySupported() {
        return this.retrySupported;
    }

    public InputStreamContent setLength(long j) {
        this.length = j;
        return this;
    }

    public InputStreamContent setRetrySupported(boolean z) {
        this.retrySupported = z;
        return this;
    }

    @Override // com.huawei.cloud.base.http.AbstractInputStreamContent
    public InputStreamContent setCloseInputStream(boolean z) {
        return (InputStreamContent) super.setCloseInputStream(z);
    }

    @Override // com.huawei.cloud.base.http.AbstractInputStreamContent
    public InputStreamContent setType(String str) {
        return (InputStreamContent) super.setType(str);
    }
}
