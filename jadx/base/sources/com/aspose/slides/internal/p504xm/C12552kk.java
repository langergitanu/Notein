package com.aspose.slides.internal.p504xm;

import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14112xw;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.xm.kk */
/* JADX INFO: loaded from: classes5.dex */
public class C12552kk {
    /* JADX INFO: renamed from: k4 */
    public static void m58539k4(C12009k4 c12009k4, int i) {
        int i2;
        byte b;
        int iMo15760yj = c12009k4.mo15760yj();
        int iMo15757m9 = c12009k4.mo15757m9();
        int i3 = 0;
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, iMo15760yj, iMo15757m9).Clone(), 3, 2498570);
        C14112xw c14112xwM15721to = c3983k4M56597k4.m15721to();
        int iM67482k4 = C14116yg.m67482k4(c3983k4M56597k4.m15715du());
        int i4 = iM67482k4 * iMo15757m9;
        byte[] bArr = new byte[i4];
        C3914k4.m15618k4(c14112xwM15721to, bArr, 0, i4);
        byte[] bArr2 = new byte[i4 >> 2];
        int i5 = 0;
        while (i5 < i) {
            int i6 = i3;
            while (i6 < iMo15757m9) {
                int i7 = i6 * iM67482k4;
                int i8 = i3;
                while (i8 < iMo15760yj - 1) {
                    int i9 = i7 + 4;
                    byte b2 = bArr[i7 + 3];
                    int i10 = iM67482k4;
                    byte b3 = bArr[i7 + 7];
                    byte[] bArr3 = bArr2;
                    int i11 = b2 & 255;
                    if (i11 == 0) {
                        b = b2;
                        if ((b3 & 255) != 0) {
                            bArr[i7] = bArr[i9];
                            bArr[i7 + 1] = bArr[i7 + 5];
                            bArr[i7 + 2] = bArr[i7 + 6];
                            bArr3[i7 >> 2] = b3;
                        }
                    } else {
                        b = b2;
                    }
                    if ((b3 & 255) == 0 && i11 != 0) {
                        bArr[i9] = bArr[i7];
                        bArr[i7 + 5] = bArr[i7 + 1];
                        bArr[i7 + 6] = bArr[i7 + 2];
                        bArr3[i9 >> 2] = b;
                    }
                    i8++;
                    i7 = i9;
                    bArr2 = bArr3;
                    iM67482k4 = i10;
                }
                i6++;
                i3 = 0;
            }
            int i12 = iM67482k4;
            byte[] bArr4 = bArr2;
            int i13 = 0;
            while (i13 < iMo15757m9 - 1) {
                int i14 = i13 * i12;
                int i15 = 0;
                while (i15 < iMo15760yj) {
                    int i16 = i14 + i12;
                    byte b4 = bArr[i14 + 3];
                    byte b5 = bArr[i16 + 3];
                    int i17 = b4 & 255;
                    if (i17 == 0) {
                        i2 = i13;
                        if ((b5 & 255) != 0) {
                            bArr[i14] = bArr[i16];
                            bArr[i14 + 1] = bArr[i16 + 1];
                            bArr[i14 + 2] = bArr[i16 + 2];
                            bArr4[i14 >> 2] = b5;
                        }
                    } else {
                        i2 = i13;
                    }
                    if ((b5 & 255) == 0 && i17 != 0) {
                        bArr[i16] = bArr[i14];
                        bArr[i16 + 1] = bArr[i14 + 1];
                        bArr[i16 + 2] = bArr[i14 + 2];
                        bArr4[i16 >> 2] = b4;
                    }
                    i15++;
                    i14 += 4;
                    i13 = i2;
                }
                i13++;
            }
            for (int i18 = 0; i18 < iMo15757m9; i18++) {
                int i19 = i18 * i12;
                int i20 = 0;
                while (i20 < iMo15760yj) {
                    byte b6 = bArr4[i19 >> 2];
                    if ((b6 & 255) != 0) {
                        bArr[i19 + 3] = b6;
                    }
                    i20++;
                    i19 += 4;
                }
            }
            i5++;
            bArr2 = bArr4;
            iM67482k4 = i12;
            i3 = 0;
        }
        C3914k4.m15621k4(bArr, i3, c14112xwM15721to, i4);
        c12009k4.m56605k4(c3983k4M56597k4);
    }
}
