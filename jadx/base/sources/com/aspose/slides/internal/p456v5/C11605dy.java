package com.aspose.slides.internal.p456v5;

/* JADX INFO: renamed from: com.aspose.slides.internal.v5.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C11605dy {

    /* JADX INFO: renamed from: k4 */
    private final byte[] f39171k4 = new byte[256];

    /* JADX INFO: renamed from: kk */
    private int f39172kk;

    /* JADX INFO: renamed from: x1 */
    private int f39173x1;

    /* JADX INFO: renamed from: k4 */
    public final void m54653k4(byte[] bArr) {
        m54655k4(bArr, 0, bArr.length, bArr, 0);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m54657x1(byte[] bArr) {
        m54658x1(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54654k4(byte[] bArr, int i, int i2) {
        m54655k4(bArr, i, i2, bArr, i);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m54658x1(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < 256; i3++) {
            this.f39171k4[i3] = (byte) i3;
        }
        this.f39173x1 = 0;
        this.f39172kk = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < 256; i6++) {
            int i7 = bArr[i4 + i] & 255;
            byte[] bArr2 = this.f39171k4;
            byte b = bArr2[i6];
            i5 = (i7 + (b & 255) + i5) & 255;
            bArr2[i6] = bArr2[i5];
            bArr2[i5] = b;
            i4 = (i4 + 1) % i2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54655k4(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i2 + i;
        for (int i5 = i; i5 < i4; i5++) {
            int i6 = (this.f39173x1 + 1) & 255;
            this.f39173x1 = i6;
            byte[] bArr3 = this.f39171k4;
            byte b = bArr3[i6];
            int i7 = ((b & 255) + this.f39172kk) & 255;
            this.f39172kk = i7;
            bArr3[i6] = bArr3[i7];
            bArr3[i7] = b;
            bArr2[(i5 - i) + i3] = (byte) ((bArr3[((bArr3[i6] & 255) + (b & 255)) & 255] & 255) ^ (bArr[i5] & 255));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54656k4(byte[] bArr, byte[] bArr2) {
        m54655k4(bArr, 0, bArr.length, bArr2, 0);
    }
}
