package com.aspose.slides.internal.p482wr;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.wr.dy */
/* JADX INFO: loaded from: classes5.dex */
public class C12254dy extends AbstractC3150x6 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC3150x6 f40848k4;

    /* JADX INFO: renamed from: kk */
    private long f40849kk;

    /* JADX INFO: renamed from: x1 */
    private long f40850x1;

    public C12254dy(AbstractC3150x6 abstractC3150x6) {
        this.f40848k4 = abstractC3150x6;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canRead() {
        return this.f40848k4.canRead();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canSeek() {
        return this.f40848k4.canSeek();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canWrite() {
        return this.f40848k4.canWrite();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void flush() {
        this.f40848k4.flush();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getLength() {
        return this.f40848k4.getLength();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getPosition() {
        return this.f40848k4.getPosition();
    }

    /* JADX INFO: renamed from: k4 */
    public final long m57217k4() {
        return this.f40850x1;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int read(byte[] bArr, int i, int i2) {
        int i3 = this.f40848k4.read(bArr, i, i2);
        this.f40849kk += (long) i3;
        return i3;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long seek(long j, int i) {
        return this.f40848k4.seek(j, i);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setLength(long j) {
        this.f40848k4.setLength(j);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setPosition(long j) {
        this.f40848k4.seek(j, 0);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void write(byte[] bArr, int i, int i2) {
        this.f40848k4.write(bArr, i, i2);
        this.f40850x1 += (long) i2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57218k4(long j) {
        long j2 = this.f40850x1 - j;
        this.f40850x1 = j2;
        if (j2 < 0) {
            throw new InvalidOperationException();
        }
        if (C7019kk.m27452k4((Object) this.f40848k4, C12254dy.class) != null) {
            ((C12254dy) this.f40848k4).m57218k4(j);
        }
    }
}
