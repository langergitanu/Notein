package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.StringUtils;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.c6 */
/* JADX INFO: loaded from: classes9.dex */
public class C18130c6 extends OutputStream {

    /* JADX INFO: renamed from: a */
    public InterfaceC18275mb f54421a;

    public C18130c6(InterfaceC18275mb interfaceC18275mb) {
        this.f54421a = interfaceC18275mb;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f54421a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f54421a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        write(StringUtils.getBytes(String.valueOf(i)));
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f54421a.write(bArr, i, i2);
    }
}
