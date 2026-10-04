package com.aspose.slides.internal.p161h5;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.h5.h4 */
/* JADX INFO: loaded from: classes.dex */
public class C4496h4 extends AbstractC3150x6 {

    /* JADX INFO: renamed from: k4 */
    C4502m9 f12440k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f12441x1;

    public C4496h4(AbstractC3150x6 abstractC3150x6, int i, int i2, boolean z) {
        this.f12440k4 = new C4502m9(abstractC3150x6, i, i2, 1950, z);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canRead() {
        if (this.f12441x1) {
            throw new ObjectDisposedException("ZlibStream");
        }
        return this.f12440k4.f12474ck.canRead();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canSeek() {
        return false;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canWrite() {
        if (this.f12441x1) {
            throw new ObjectDisposedException("ZlibStream");
        }
        return this.f12440k4.f12474ck.canWrite();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void dispose(boolean z) {
        C4502m9 c4502m9;
        try {
            if (!this.f12441x1) {
                if (z && (c4502m9 = this.f12440k4) != null) {
                    c4502m9.close();
                }
                this.f12441x1 = true;
            }
            super.dispose(z);
        } catch (Throwable th) {
            super.dispose(z);
            throw th;
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void flush() {
        if (this.f12441x1) {
            throw new ObjectDisposedException("ZlibStream");
        }
        this.f12440k4.flush();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getLength() {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getPosition() {
        C4502m9 c4502m9 = this.f12440k4;
        int i = c4502m9.f12488x1;
        if (i == 0) {
            return c4502m9.f12480k4.f12504dy;
        }
        if (i == 1) {
            return c4502m9.f12480k4.f12512to;
        }
        return 0L;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int read(byte[] bArr, int i, int i2) {
        if (this.f12441x1) {
            throw new ObjectDisposedException("ZlibStream");
        }
        return this.f12440k4.read(bArr, i, i2);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long seek(long j, int i) {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setLength(long j) {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setPosition(long j) {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void write(byte[] bArr, int i, int i2) {
        if (this.f12441x1) {
            throw new ObjectDisposedException("ZlibStream");
        }
        this.f12440k4.write(bArr, i, i2);
    }

    public C4496h4(AbstractC3150x6 abstractC3150x6, int i, boolean z) {
        this(abstractC3150x6, i, 6, z);
    }
}
