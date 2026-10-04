package com.aspose.slides.internal.p519y5;

import com.aspose.slides.internal.p135fp.C4093h4;
import com.aspose.slides.internal.p135fp.C4095jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.y5.m9 */
/* JADX INFO: loaded from: classes5.dex */
public class C12799m9 implements InterfaceC12796h4 {

    /* JADX INFO: renamed from: k4 */
    private final C4095jd f42558k4;

    /* JADX INFO: renamed from: kk */
    private final int f42559kk;

    /* JADX INFO: renamed from: to */
    private final int f42560to;

    /* JADX INFO: renamed from: x1 */
    private final int f42561x1;

    public C12799m9(C4095jd c4095jd, int i, int i2, int i3) {
        this.f42558k4 = c4095jd;
        this.f42561x1 = i;
        this.f42559kk = i2;
        this.f42560to = i3;
    }

    @Override // com.aspose.slides.internal.p519y5.InterfaceC12796h4
    /* JADX INFO: renamed from: k4 */
    public void mo24374k4(byte[][][] bArr) {
        int i;
        int iM16329to = this.f42559kk / (this.f42558k4.m16329to() & 255);
        int iM16316fa = this.f42560to / (this.f42558k4.m16316fa() & 255);
        int i2 = this.f42558k4.f11197k4;
        int i3 = iM16329to * i2 * 8;
        int length = bArr[0][this.f42561x1].length / i3;
        byte[] bArr2 = new byte[i3 * length];
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = 0;
            int i7 = 0;
            while (true) {
                i = i2 * 8;
                if (i6 >= i) {
                    break;
                }
                byte b = bArr[0][this.f42561x1][(i5 * i3) + i6];
                for (int iM16329to2 = this.f42558k4.m16329to() & 255; iM16329to2 > 0; iM16329to2--) {
                    bArr2[(i4 * i3) + i7] = b;
                    i7++;
                }
                i6++;
            }
            if (iM16316fa > 1) {
                for (int i8 = 1; i8 < this.f42560to; i8++) {
                    int i9 = i4 * i3;
                    i4++;
                    C4093h4.m16293k4(bArr2, i9, bArr2, i4 * i3, (this.f42558k4.m16329to() & 255) * i);
                }
            }
            i5++;
            i4++;
        }
        bArr[0][this.f42561x1] = bArr2;
    }
}
