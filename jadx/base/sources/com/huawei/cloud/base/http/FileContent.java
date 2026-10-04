package com.huawei.cloud.base.http;

import com.huawei.cloud.base.util.Preconditions;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes8.dex */
public class FileContent extends AbstractInputStreamContent {
    private final File file;

    public FileContent(String str, File file) {
        super(str);
        this.file = (File) Preconditions.checkNotNull(file);
    }

    public File getFile() {
        return this.file;
    }

    @Override // com.huawei.cloud.base.http.AbstractInputStreamContent
    public InputStream getInputStream() throws FileNotFoundException {
        return new FileInputStream(this.file);
    }

    @Override // com.huawei.cloud.base.http.HttpContent
    public long getLength() {
        return this.file.length();
    }

    @Override // com.huawei.cloud.base.http.HttpContent
    public boolean retrySupported() {
        return true;
    }

    @Override // com.huawei.cloud.base.http.AbstractInputStreamContent
    public FileContent setCloseInputStream(boolean z) {
        return (FileContent) super.setCloseInputStream(z);
    }

    @Override // com.huawei.cloud.base.http.AbstractInputStreamContent
    public FileContent setType(String str) {
        return (FileContent) super.setType(str);
    }
}
