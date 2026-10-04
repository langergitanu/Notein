package com.aspose.slides.internal.p482wr;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.wr.bv */
/* JADX INFO: loaded from: classes5.dex */
public class C12248bv extends AbstractC3150x6 {

    /* JADX INFO: renamed from: k4 */
    private C12273v4 f40819k4;

    /* JADX INFO: renamed from: kk */
    private int f40820kk;

    /* JADX INFO: renamed from: x1 */
    private AbstractC3150x6 f40821x1;

    public C12248bv(AbstractC3150x6 abstractC3150x6, C12273v4 c12273v4, int i) {
        this.f40819k4 = c12273v4;
        this.f40821x1 = abstractC3150x6;
        this.f40820kk = i;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canRead() {
        return this.f40820kk == 1;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canSeek() {
        return false;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canWrite() {
        return this.f40820kk == 0;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void flush() {
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getLength() {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getPosition() {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int read(byte[] bArr, int i, int i2) {
        if (this.f40820kk == 0) {
            throw new NotImplementedException();
        }
        byte[] bArr2 = new byte[i2];
        int i3 = this.f40821x1.read(bArr2, 0, i2);
        byte[] bArrM57416k4 = this.f40819k4.m57416k4(bArr2, i3);
        if (i3 >= 0) {
            System.arraycopy(bArrM57416k4, 0, bArr, i, i3);
        }
        return i3;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long seek(long j, int i) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setLength(long j) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setPosition(long j) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void write(byte[] bArr, int i, int i2) {
        if (this.f40820kk == 1) {
            throw new NotImplementedException();
        }
        if (i2 == 0) {
            return;
        }
        if (i != 0) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            bArr = bArr2;
        }
        byte[] bArrM57418x1 = this.f40819k4.m57418x1(bArr, i2);
        this.f40821x1.write(bArrM57418x1, 0, bArrM57418x1.length);
    }
}
