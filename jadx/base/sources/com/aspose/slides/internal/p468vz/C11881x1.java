package com.aspose.slides.internal.p468vz;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import java.io.InputStream;

/* JADX INFO: renamed from: com.aspose.slides.internal.vz.x1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11881x1 extends InputStream {

    /* JADX INFO: renamed from: k4 */
    AbstractC3150x6 f40011k4;

    public C11881x1(AbstractC3150x6 abstractC3150x6) {
        this.f40011k4 = abstractC3150x6;
    }

    @Override // java.io.InputStream
    public int available() {
        return (int) (this.f40011k4.getLength() - this.f40011k4.getPosition());
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f40011k4.close();
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC3150x6 m55478k4() {
        return this.f40011k4;
    }

    @Override // java.io.InputStream
    public int read() {
        return this.f40011k4.readByte();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        return this.f40011k4.seek(j, 1) - this.f40011k4.getPosition();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f40011k4.read(bArr, i, i2);
        if (i3 == 0) {
            return -1;
        }
        return i3;
    }
}
