package com.aspose.slides.internal.p080dd;

import com.aspose.slides.exceptions.NotSupportedException;

/* JADX INFO: renamed from: com.aspose.slides.internal.dd.ks */
/* JADX INFO: loaded from: classes3.dex */
class C3136ks extends AbstractC3150x6 {
    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canRead() {
        return true;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canSeek() {
        return true;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canWrite() {
        return true;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void flush() {
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getLength() {
        return 0L;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getPosition() {
        return 0L;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int read(byte[] bArr, int i, int i2) {
        return 0;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int readByte() {
        return -1;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long seek(long j, int i) {
        return 0L;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setLength(long j) {
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setPosition(long j) {
        throw new NotSupportedException("The NullStream does not support setPosition operation.");
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void write(byte[] bArr, int i, int i2) {
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void writeByte(byte b) {
    }
}
