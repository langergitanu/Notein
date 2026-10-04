package com.aspose.slides.internal.p169hl;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.hl.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C4596k4 extends AbstractC3150x6 {

    /* JADX INFO: renamed from: k4 */
    protected final AbstractC3150x6 f12849k4;

    public C4596k4(AbstractC3150x6 abstractC3150x6) {
        this.f12849k4 = abstractC3150x6;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canRead() {
        return false;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canSeek() {
        return false;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canWrite() {
        return true;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void close() {
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void flush() {
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getLength() {
        return this.f12849k4.getLength();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getPosition() {
        return this.f12849k4.getPosition();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int read(byte[] bArr, int i, int i2) {
        throw new InvalidOperationException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int readByte() {
        throw new InvalidOperationException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long seek(long j, int i) {
        throw new InvalidOperationException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setLength(long j) {
        throw new InvalidOperationException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setPosition(long j) {
        throw new InvalidOperationException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void write(byte[] bArr, int i, int i2) {
        this.f12849k4.write(bArr, i, i2);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void writeByte(byte b) {
        throw new InvalidOperationException();
    }
}
