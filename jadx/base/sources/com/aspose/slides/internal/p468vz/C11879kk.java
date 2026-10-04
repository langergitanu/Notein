package com.aspose.slides.internal.p468vz;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.aspose.slides.internal.vz.kk */
/* JADX INFO: loaded from: classes4.dex */
public final class C11879kk extends OutputStream {

    /* JADX INFO: renamed from: k4 */
    AbstractC3150x6 f39997k4;

    public C11879kk(AbstractC3150x6 abstractC3150x6) {
        this.f39997k4 = abstractC3150x6;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f39997k4.close();
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.f39997k4.writeByte((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.f39997k4.write(bArr, i, i2);
    }
}
