package com.aspose.slides.internal.p016a8;

/* JADX INFO: renamed from: com.aspose.slides.internal.a8.du */
/* JADX INFO: loaded from: classes3.dex */
public class C1303du extends C1307to {

    /* JADX INFO: renamed from: du */
    private int f5743du;

    public C1303du(int i, int i2, byte[] bArr) {
        super(i, i2, bArr);
        this.f5743du = 7;
    }

    @Override // com.aspose.slides.internal.p016a8.C1307to
    /* JADX INFO: renamed from: k4 */
    public byte mo7783k4() {
        byte[] bArr = this.f5761kk;
        int i = this.f5762to;
        byte b = bArr[i];
        int i2 = this.f5743du;
        byte b2 = (byte) ((b >> i2) & 1);
        int i3 = i2 - 1;
        this.f5743du = i3;
        if (i3 == -1) {
            this.f5743du = 7;
            this.f5762to = i + 1;
        }
        return b2;
    }

    @Override // com.aspose.slides.internal.p016a8.C1307to
    /* JADX INFO: renamed from: x1 */
    public void mo7785x1() {
        this.f5743du = 7;
        if (this.f5760k4 % 8 == 0) {
            this.f5762to += this.f5763x1;
        } else {
            this.f5762to = this.f5763x1 + 1 + this.f5762to;
        }
    }

    @Override // com.aspose.slides.internal.p016a8.C1307to
    /* JADX INFO: renamed from: k4 */
    public void mo7784k4(byte b) {
        byte[] bArr = this.f5761kk;
        int i = this.f5762to;
        byte b2 = bArr[i];
        int i2 = this.f5743du;
        bArr[i] = (byte) ((b << i2) | b2);
        int i3 = i2 - 1;
        this.f5743du = i3;
        if (i3 == -1) {
            this.f5743du = 7;
            this.f5762to = i + 1;
        }
    }
}
