package com.aspose.words.internal;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYG8 extends OutputStream {

    /* JADX INFO: renamed from: eS */
    private OutputStream f50810eS;

    /* JADX INFO: renamed from: eT */
    private OutputStream f50811eT;

    public zzYG8(OutputStream outputStream, OutputStream outputStream2) {
        this.f50810eS = outputStream;
        this.f50811eT = outputStream2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f50810eS.close();
        this.f50811eT.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f50810eS.flush();
        this.f50811eT.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f50810eS.write(bArr);
        this.f50811eT.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f50810eS.write(bArr, i, i2);
        this.f50811eT.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f50810eS.write(i);
        this.f50811eT.write(i);
    }
}
