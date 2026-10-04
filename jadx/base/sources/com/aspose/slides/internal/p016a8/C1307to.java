package com.aspose.slides.internal.p016a8;

/* JADX INFO: renamed from: com.aspose.slides.internal.a8.to */
/* JADX INFO: loaded from: classes3.dex */
public class C1307to {

    /* JADX INFO: renamed from: k4 */
    protected int f5760k4;

    /* JADX INFO: renamed from: kk */
    protected byte[] f5761kk;

    /* JADX INFO: renamed from: to */
    protected int f5762to;

    /* JADX INFO: renamed from: x1 */
    protected int f5763x1;

    public C1307to(int i, int i2, byte[] bArr) {
        this.f5760k4 = i;
        this.f5763x1 = i2;
        this.f5761kk = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public byte mo7783k4() {
        byte[] bArr = this.f5761kk;
        int i = this.f5762to;
        this.f5762to = i + 1;
        return bArr[i];
    }

    /* JADX INFO: renamed from: x1 */
    public void mo7785x1() {
        this.f5762to += this.f5763x1;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo7784k4(byte b) {
        byte[] bArr = this.f5761kk;
        int i = this.f5762to;
        this.f5762to = i + 1;
        bArr[i] = b;
    }
}
