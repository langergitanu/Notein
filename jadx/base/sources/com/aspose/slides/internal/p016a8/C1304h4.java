package com.aspose.slides.internal.p016a8;

/* JADX INFO: renamed from: com.aspose.slides.internal.a8.h4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1304h4 extends C1307to {

    /* JADX INFO: renamed from: du */
    private boolean f5744du;

    public C1304h4(int i, int i2, byte[] bArr) {
        super(i, i2, bArr);
        this.f5744du = true;
    }

    @Override // com.aspose.slides.internal.p016a8.C1307to
    /* JADX INFO: renamed from: k4 */
    public byte mo7783k4() {
        byte b;
        byte[] bArr = this.f5761kk;
        int i = this.f5762to;
        byte b2 = bArr[i];
        boolean z = this.f5744du;
        if (z) {
            b = (byte) ((b2 >> 4) & 15);
        } else {
            b = (byte) (b2 & 15);
            this.f5762to = i + 1;
        }
        this.f5744du = !z;
        return b;
    }

    @Override // com.aspose.slides.internal.p016a8.C1307to
    /* JADX INFO: renamed from: x1 */
    public void mo7785x1() {
        if (this.f5744du) {
            this.f5762to += this.f5763x1;
        } else {
            this.f5762to = this.f5763x1 + 1 + this.f5762to;
        }
        this.f5744du = true;
    }

    @Override // com.aspose.slides.internal.p016a8.C1307to
    /* JADX INFO: renamed from: k4 */
    public void mo7784k4(byte b) {
        boolean z = this.f5744du;
        byte[] bArr = this.f5761kk;
        int i = this.f5762to;
        if (z) {
            bArr[i] = (byte) ((b & 15) << 4);
        } else {
            bArr[i] = (byte) ((b & 15) | bArr[i]);
            this.f5762to = i + 1;
        }
        this.f5744du = !z;
    }
}
