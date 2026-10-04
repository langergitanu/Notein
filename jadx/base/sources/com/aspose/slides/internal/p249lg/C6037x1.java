package com.aspose.slides.internal.p249lg;

import com.aspose.slides.C22213OooOoOO;
import com.aspose.slides.internal.p135fp.C4095jd;
import com.aspose.slides.internal.p519y5.InterfaceC12796h4;

/* JADX INFO: renamed from: com.aspose.slides.internal.lg.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C6037x1 implements InterfaceC12796h4 {

    /* JADX INFO: renamed from: k4 */
    private final C4095jd f17124k4;

    /* JADX INFO: renamed from: x1 */
    private final int f17125x1;

    public C6037x1(C4095jd c4095jd, int i) {
        this.f17124k4 = c4095jd;
        this.f17125x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    private int m24373k4(byte[][][] bArr, int i, int i2, int i3) {
        return bArr[0][this.f17125x1][(i * i2) + i3] & 255;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    @Override // com.aspose.slides.internal.p519y5.InterfaceC12796h4
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo24374k4(byte[][][] bArr) {
        int i;
        int i2 = this.f17124k4.f11197k4 * 16;
        int i3 = 0;
        int length = bArr[0][this.f17125x1].length / i2;
        byte[] bArr2 = new byte[i2 * length];
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = i3;
            while (i6 < 2) {
                if (i6 == 0) {
                    i = i5 == 0 ? i5 : i5 - 1;
                } else if (i5 != (length / 2) - 1) {
                    i = i5 + 1;
                }
                int iM24373k4 = (m24373k4(bArr, i2, i5, i3) * 3) + m24373k4(bArr, i2, i, i3);
                int iM24373k42 = (m24373k4(bArr, i2, i5, 1) * 3) + m24373k4(bArr, i2, i, 1);
                int i7 = i2 * i4;
                bArr2[i7] = (byte) (((iM24373k4 * 4) + 8) >> 4);
                int i8 = i3;
                int i9 = 2;
                bArr2[i7 + 1] = (byte) (C22213OooOoOO.OooO0O0(iM24373k4, 3, iM24373k42, 7) >> 4);
                int i10 = (this.f17124k4.f11197k4 * 8) - 2;
                int i11 = iM24373k4;
                int i12 = iM24373k42;
                int i13 = 2;
                int i14 = 2;
                while (i10 > 0) {
                    int i15 = i13 + 1;
                    int iM24373k43 = (m24373k4(bArr, i2, i5, i13) * 3) + m24373k4(bArr, i2, i, i14);
                    int i16 = i12 * 3;
                    bArr2[i7 + i9] = (byte) (((i16 + i11) + 8) >> 4);
                    bArr2[i9 + 1 + i7] = (byte) (((i16 + iM24373k43) + 7) >> 4);
                    i9 += 2;
                    i10--;
                    i11 = i12;
                    i14++;
                    i12 = iM24373k43;
                    i13 = i15;
                }
                bArr2[i7 + i9] = (byte) (C22213OooOoOO.OooO0O0(i12, 3, i11, 8) >> 4);
                bArr2[i9 + 1 + i7] = (byte) (((i12 * 4) + 7) >> 4);
                i4++;
                i6++;
                i3 = i8;
            }
            i5++;
        }
        bArr[i3][this.f17125x1] = bArr2;
    }
}
