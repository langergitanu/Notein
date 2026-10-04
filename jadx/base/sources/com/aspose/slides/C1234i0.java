package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.i0 */
/* JADX INFO: loaded from: classes3.dex */
class C1234i0 {
    /* JADX INFO: renamed from: k4 */
    public static void m7346k4(C12009k4 c12009k4, double d, int i) {
        if (c12009k4 == null) {
            throw new ArgumentNullException("bitmap cannot null.");
        }
        if (d < 0.0d) {
            throw new ArgumentException("blurRadius cannot be negative.");
        }
        if (i <= 0) {
            throw new ArgumentException("blurringIteration cannot be zero or negative.");
        }
        if (c12009k4.mo15753jd() != 2498570 && c12009k4.mo15753jd() != 137224) {
            throw new ArgumentException("bitmap should have PixelFormat:Format32bppArgb or Format24bppRgb.");
        }
        if (d <= 0.0d || c12009k4.mo15760yj() == 0 || c12009k4.mo15757m9() == 0) {
            return;
        }
        int i2 = 0;
        boolean z = AbstractC12002ck.m56311k4(c12009k4.mo15753jd()) >= 32;
        int iMo15757m9 = c12009k4.mo15757m9() * c12009k4.mo15760yj();
        int[] iArr = new int[iMo15757m9];
        int[] iArr2 = new int[iMo15757m9];
        int[] iArr3 = new int[iMo15757m9];
        int[] iArr4 = new int[iMo15757m9];
        char c = 3;
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 3, c12009k4.mo15753jd());
        int iMo15757m92 = c12009k4.mo15757m9() * C14116yg.m67482k4(c3983k4M56597k4.m15715du());
        byte[] bArr = new byte[iMo15757m92];
        System.arraycopy((byte[]) c3983k4M56597k4.m15721to().m67356kk().m19850k4(), 0, bArr, 0, iMo15757m92);
        int i3 = 0;
        int i4 = 0;
        while (i3 < iMo15757m9) {
            iArr4[i3] = bArr[i4] & 255;
            char c2 = c;
            iArr3[i3] = bArr[i4 + 1] & 255;
            int i5 = i4 + 3;
            iArr2[i3] = bArr[i4 + 2] & 255;
            if (z) {
                i4 += 4;
                iArr[i3] = bArr[i5] & 255;
            } else {
                i4 = i5;
            }
            i3++;
            c = c2;
        }
        int[][] iArr5 = {new int[iMo15757m9], new int[iMo15757m9], new int[iMo15757m9], new int[iMo15757m9]};
        m7351k4(new int[][]{iArr, iArr2, iArr3, iArr4}, iArr5, c12009k4.mo15760yj(), c12009k4.mo15757m9(), d, i, m7353k4(d, i));
        int[] iArr6 = iArr5[0];
        int[] iArr7 = iArr5[1];
        int[] iArr8 = iArr5[2];
        int[] iArr9 = iArr5[c];
        int i6 = 0;
        int i7 = 0;
        while (i6 < iMo15757m9) {
            int i8 = i7 + 1;
            int i9 = iArr9[i6];
            if (i9 > 255) {
                i9 = 255;
            } else if (i9 < 0) {
                i9 = i2;
            }
            bArr[i7] = (byte) i9;
            int i10 = i7 + 2;
            int i11 = iArr8[i6];
            if (i11 > 255) {
                i11 = 255;
            } else if (i11 < 0) {
                i11 = 0;
            }
            bArr[i8] = (byte) i11;
            int i12 = i7 + 3;
            int i13 = iArr7[i6];
            if (i13 > 255) {
                i13 = 255;
            } else if (i13 < 0) {
                i13 = 0;
            }
            bArr[i10] = (byte) i13;
            if (z) {
                i7 += 4;
                int i14 = iArr6[i6];
                if (i14 > 255) {
                    i14 = 255;
                } else if (i14 < 0) {
                    i14 = 0;
                }
                bArr[i12] = (byte) i14;
            } else {
                i7 = i12;
            }
            i6++;
            i2 = 0;
        }
        System.arraycopy(bArr, 0, (byte[]) c3983k4M56597k4.m15721to().m67356kk().m19850k4(), 0, iMo15757m92);
        c12009k4.m56605k4(c3983k4M56597k4);
    }

    /* JADX INFO: renamed from: kk */
    private static void m7354kk(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        int i4;
        int i5;
        double d = 1.0d / ((double) ((i3 + i3) + 1));
        int i6 = 0;
        while (i6 < i) {
            int i7 = (i3 * i) + i6;
            int i8 = iArr[i6];
            int i9 = iArr[androidx.core.graphics.OooO0OO.OooO00o(i2, 1, i, i6)];
            int i10 = i3 + 1;
            int i11 = i10 * i8;
            for (int i12 = 0; i12 < i3; i12++) {
                i11 += iArr[(i12 * i) + i6];
            }
            int i13 = i6;
            int i14 = 0;
            while (true) {
                i4 = i6;
                if (i14 > i3) {
                    break;
                }
                i11 = (iArr[i7] - i8) + i11;
                double d2 = d;
                iArr2[i13] = C22201OooO0oO.OooO00o(((double) i11) * d2, 0.5d, 14);
                i7 += i;
                i13 += i;
                i14++;
                i6 = i4;
                d = d2;
            }
            double d3 = d;
            int i15 = i4;
            while (true) {
                i5 = i2 - i3;
                if (i10 >= i5) {
                    break;
                }
                i11 += iArr[i7] - iArr[i15];
                iArr2[i13] = C22201OooO0oO.OooO00o(((double) i11) * d3, 0.5d, 14);
                i15 += i;
                i7 += i;
                i13 += i;
                i10++;
            }
            while (i5 < i2) {
                i11 += i9 - iArr[i15];
                iArr2[i13] = C22201OooO0oO.OooO00o(((double) i11) * d3, 0.5d, 14);
                i15 += i;
                i13 += i;
                i5++;
            }
            i6 = i4 + 1;
            d = d3;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m7356x1(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        int i4;
        double d = 1.0d / ((double) ((i3 + i3) + 1));
        int i5 = 0;
        while (i5 < i2) {
            int i6 = i5 * i;
            int i7 = i6 + i3;
            int i8 = iArr[i6];
            int i9 = iArr[(i6 + i) - 1];
            int i10 = i3 + 1;
            int i11 = i10 * i8;
            for (int i12 = 0; i12 < i3; i12++) {
                i11 += iArr[i6 + i12];
            }
            int i13 = i6;
            int i14 = 0;
            while (i14 <= i3) {
                i11 += iArr[i7] - i8;
                double d2 = d;
                iArr2[i13] = C22201OooO0oO.OooO00o(((double) i11) * d2, 0.5d, 14);
                i14++;
                i13++;
                i7++;
                d = d2;
            }
            double d3 = d;
            while (true) {
                i4 = i - i3;
                if (i10 >= i4) {
                    break;
                }
                i11 += iArr[i7] - iArr[i6];
                iArr2[i13] = C22201OooO0oO.OooO00o(((double) i11) * d3, 0.5d, 14);
                i10++;
                i13++;
                i6++;
                i7++;
            }
            while (i4 < i) {
                i11 += i9 - iArr[i6];
                iArr2[i13] = C22201OooO0oO.OooO00o(((double) i11) * d3, 0.5d, 14);
                i4++;
                i13++;
                i6++;
            }
            i5++;
            d = d3;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7347k4(C12009k4 c12009k4, double d, int i, int i2) {
        if (c12009k4 == null) {
            throw new ArgumentNullException("bitmap cannot null.");
        }
        if (d < 0.0d) {
            throw new ArgumentException("blurRadius cannot be negative.");
        }
        if (i <= 0) {
            throw new ArgumentException("blurringIteration cannot be zero or negative.");
        }
        if (c12009k4.mo15753jd() != 2498570 && c12009k4.mo15753jd() != 137224) {
            throw new ArgumentException("bitmap should have PixelFormat:Format32bppArgb or Format24bppRgb.");
        }
        int i3 = i2;
        if (i3 == 3 && !AbstractC12002ck.m56321kk(c12009k4.mo15753jd())) {
            throw new ArgumentException("bitmap doesn't contain alpha channel.");
        }
        if (d <= 0.0d || c12009k4.mo15760yj() == 0 || c12009k4.mo15757m9() == 0) {
            return;
        }
        int iMo15757m9 = c12009k4.mo15757m9();
        int iMo15760yj = c12009k4.mo15760yj();
        int iM56311k4 = AbstractC12002ck.m56311k4(c12009k4.mo15753jd()) >> 3;
        int i4 = iMo15760yj * iMo15757m9;
        int[] iArr = new int[i4];
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, iMo15760yj, iMo15757m9), 3, c12009k4.mo15753jd());
        int iM67482k4 = C14116yg.m67482k4(c3983k4M56597k4.m15715du()) * iMo15757m9;
        byte[] bArr = new byte[iM67482k4];
        System.arraycopy((byte[]) c3983k4M56597k4.m15721to().m67356kk().m19850k4(), 0, bArr, 0, iM67482k4);
        int i5 = i3;
        for (int i6 = 0; i6 < i4; i6++) {
            iArr[i6] = 255 & bArr[i5];
            i5 += iM56311k4;
        }
        int[] iArr2 = new int[i4];
        m7349k4(iArr, iArr2, iMo15760yj, iMo15757m9, d, i, m7353k4(d, i));
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = iArr2[i7];
            if (i8 > 255) {
                i8 = 255;
            } else if (i8 < 0) {
                i8 = 0;
            }
            bArr[i3] = (byte) i8;
            i3 += iM56311k4;
        }
        System.arraycopy(bArr, 0, (byte[]) c3983k4M56597k4.m15721to().m67356kk().m19850k4(), 0, iM67482k4);
        c12009k4.m56605k4(c3983k4M56597k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7348k4(int[] iArr, int[] iArr2, int i, int i2, double d, int i3) {
        m7349k4(iArr, iArr2, i, i2, d, i3, m7353k4(d, i3));
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7349k4(int[] iArr, int[] iArr2, int i, int i2, double d, int i3, int[] iArr3) {
        if (d < 0.0d) {
            throw new ArgumentException("blurRadius cannot be negative.");
        }
        if (i3 <= 0) {
            throw new ArgumentException("blurringIteration cannot be zero or negative.");
        }
        if (d > 0.0d) {
            if (i3 >= 1) {
                int i4 = iArr3[0];
                if (i4 - 1 < i) {
                    m7350k4(iArr, iArr2, i, i2, (i4 - 1) / 2);
                }
            }
            if (i3 >= 2) {
                int i5 = iArr3[1];
                if (i5 - 1 < i) {
                    m7350k4(iArr2, iArr, i, i2, (i5 - 1) / 2);
                }
            }
            if (i3 >= 3) {
                int i6 = iArr3[2];
                if (i6 - 1 < i) {
                    m7350k4(iArr, iArr2, i, i2, (i6 - 1) / 2);
                }
            }
            if (i3 >= 4) {
                int i7 = iArr3[3];
                if (i7 - 1 < i) {
                    m7350k4(iArr2, iArr, i, i2, (i7 - 1) / 2);
                }
            }
            if (i3 >= 5) {
                int i8 = iArr3[4];
                if (i8 - 1 < i) {
                    m7350k4(iArr2, iArr, i, i2, (i8 - 1) / 2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7350k4(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        m7356x1(iArr2, iArr, i, i2, i3);
        m7354kk(iArr, iArr2, i, i2, i3);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7351k4(int[][] iArr, int[][] iArr2, int i, int i2, double d, int i3, int[] iArr3) {
        if (d < 0.0d) {
            throw new ArgumentException("blurRadius cannot be negative.");
        }
        if (i3 <= 0) {
            throw new ArgumentException("blurringIteration cannot be zero or negative.");
        }
        if (d > 0.0d) {
            if (i3 >= 1) {
                m7352k4(iArr, iArr2, i, i2, (iArr3[0] - 1) / 2);
            }
            if (i3 >= 2) {
                m7352k4(iArr2, iArr, i, i2, (iArr3[1] - 1) / 2);
            }
            if (i3 >= 3) {
                m7352k4(iArr, iArr2, i, i2, (iArr3[2] - 1) / 2);
            }
            if (i3 >= 4) {
                m7352k4(iArr2, iArr, i, i2, (iArr3[3] - 1) / 2);
            }
            if (i3 >= 5) {
                m7352k4(iArr2, iArr, i, i2, (iArr3[4] - 1) / 2);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m7352k4(int[][] iArr, int[][] iArr2, int i, int i2, int i3) {
        for (int i4 = 0; i4 < iArr.length; i4++) {
            iArr2[i4] = (int[]) iArr[i4].clone();
        }
        m7357x1(iArr2, iArr, i, i2, i3);
        m7355kk(iArr, iArr2, i, i2, i3);
    }

    /* JADX INFO: renamed from: k4 */
    private static int[] m7353k4(double d, int i) {
        double d2 = 12.0d * d * d;
        int iM27462to = C7019kk.m27462to(Double.valueOf(C14116yg.m67490kk(C14116yg.m67496rv((d2 / ((double) i)) + 1.0d))), 14);
        if (iM27462to % 2 == 0) {
            iM27462to--;
        }
        int i2 = iM27462to + 2;
        double dM67497to = C14116yg.m67497to((((d2 - ((double) ((i * iM27462to) * iM27462to))) - ((double) ((i * 4) * iM27462to))) - ((double) (i * 3))) / ((double) ((iM27462to * (-4)) - 4)));
        int[] iArr = new int[i];
        for (int i3 = 0; i3 < i; i3++) {
            iArr[i3] = ((double) i3) < dM67497to ? iM27462to : i2;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: kk */
    private static void m7355kk(int[][] iArr, int[][] iArr2, int i, int i2, int i3) {
        int i4;
        int i5 = i;
        int i6 = i3;
        char c = 1;
        double d = 1.0d / ((double) ((i6 + i6) + 1));
        int i7 = 0;
        int i8 = 0;
        while (i8 < i5) {
            int i9 = (i6 * i5) + i8;
            int[] iArr3 = iArr[i7];
            int i10 = iArr3[i8];
            int[] iArr4 = iArr[c];
            int i11 = iArr4[i8];
            char c2 = 2;
            int[] iArr5 = iArr[2];
            int i12 = iArr5[i8];
            int[] iArr6 = iArr[3];
            int i13 = iArr6[i8];
            int i14 = i7;
            int iOooO00o = androidx.core.graphics.OooO0OO.OooO00o(i2, 1, i5, i8);
            int i15 = iArr3[iOooO00o];
            int i16 = iArr4[iOooO00o];
            int i17 = iArr5[iOooO00o];
            int i18 = iArr6[iOooO00o];
            int i19 = i6 + 1;
            int i20 = i19 * i10;
            int i21 = i19 * i11;
            int i22 = i19 * i12;
            int i23 = i19 * i13;
            char c3 = c;
            for (int i24 = i14; i24 < i6; i24++) {
                int i25 = (i24 * i5) + i8;
                i20 += iArr[i14][i25];
                i21 += iArr[c3][i25];
                i22 += iArr[2][i25];
                i23 += iArr[3][i25];
            }
            int i26 = i8;
            int i27 = i14;
            while (i27 <= i6) {
                char c4 = c2;
                int i28 = (iArr[i14][i9] - i10) + i20;
                int i29 = (iArr[c3][i9] - i11) + i21;
                int i30 = (iArr[c4][i9] - i12) + i22;
                int i31 = i18;
                int i32 = (iArr[3][i9] - i13) + i23;
                iArr2[i14][i26] = (int) ((((double) i28) * d) + 0.5d);
                iArr2[c3][i26] = (int) ((((double) i29) * d) + 0.5d);
                iArr2[c4][i26] = (int) ((((double) i30) * d) + 0.5d);
                iArr2[3][i26] = (int) ((((double) i32) * d) + 0.5d);
                i9 += i;
                i26 += i;
                i27++;
                i21 = i29;
                i22 = i30;
                i23 = i32;
                i20 = i28;
                i18 = i31;
                c2 = c4;
                i8 = i8;
                i6 = i3;
            }
            int i33 = i18;
            int i34 = i8;
            char c5 = c2;
            int i35 = i19;
            int i36 = i34;
            while (true) {
                i4 = i2 - i3;
                if (i35 >= i4) {
                    break;
                }
                int[] iArr7 = iArr[i14];
                int i37 = (iArr7[i9] - iArr7[i36]) + i20;
                int[] iArr8 = iArr[c3];
                int i38 = (iArr8[i9] - iArr8[i36]) + i21;
                int[] iArr9 = iArr[c5];
                int i39 = (iArr9[i9] - iArr9[i36]) + i22;
                int[] iArr10 = iArr[3];
                int i40 = (iArr10[i9] - iArr10[i36]) + i23;
                double d2 = d;
                iArr2[i14][i26] = (int) ((((double) i37) * d2) + 0.5d);
                iArr2[c3][i26] = (int) ((((double) i38) * d2) + 0.5d);
                iArr2[c5][i26] = (int) ((((double) i39) * d2) + 0.5d);
                iArr2[3][i26] = (int) ((((double) i40) * d2) + 0.5d);
                i36 += i;
                i9 += i;
                i26 += i;
                i35++;
                i20 = i37;
                i21 = i38;
                i22 = i39;
                i23 = i40;
                d = d2;
            }
            double d3 = d;
            while (i4 < i2) {
                int i41 = (i15 - iArr[i14][i36]) + i20;
                int i42 = (i16 - iArr[c3][i36]) + i21;
                int i43 = (i17 - iArr[c5][i36]) + i22;
                int i44 = (i33 - iArr[3][i36]) + i23;
                iArr2[i14][i26] = (int) ((((double) i41) * d3) + 0.5d);
                iArr2[c3][i26] = (int) ((((double) i42) * d3) + 0.5d);
                iArr2[c5][i26] = (int) ((((double) i43) * d3) + 0.5d);
                iArr2[3][i26] = (int) ((((double) i44) * d3) + 0.5d);
                i36 += i;
                i26 += i;
                i4++;
                i20 = i41;
                i21 = i42;
                i22 = i43;
                i23 = i44;
            }
            i8 = i34 + 1;
            i5 = i;
            i6 = i3;
            d = d3;
            i7 = i14;
            c = c3;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m7357x1(int[][] iArr, int[][] iArr2, int i, int i2, int i3) {
        int i4;
        int i5 = i3;
        char c = 1;
        double d = 1.0d / ((double) ((i5 + i5) + 1));
        int i6 = 0;
        int i7 = 0;
        while (i7 < i2) {
            int i8 = i7 * i;
            int i9 = i8 + i5;
            int[] iArr3 = iArr[i6];
            int i10 = iArr3[i8];
            int[] iArr4 = iArr[c];
            int i11 = iArr4[i8];
            char c2 = 2;
            int[] iArr5 = iArr[2];
            int i12 = iArr5[i8];
            int[] iArr6 = iArr[3];
            int i13 = iArr6[i8];
            int i14 = (i8 + i) - 1;
            int i15 = iArr3[i14];
            int i16 = iArr4[i14];
            int i17 = iArr5[i14];
            int i18 = iArr6[i14];
            int i19 = i5 + 1;
            int i20 = i19 * i10;
            int i21 = i19 * i11;
            int i22 = i19 * i12;
            int i23 = i19 * i13;
            int i24 = i6;
            while (i6 < i5) {
                int i25 = i8 + i6;
                i20 += iArr[i24][i25];
                i21 += iArr[c][i25];
                i22 += iArr[2][i25];
                i23 += iArr[3][i25];
                i6++;
            }
            int i26 = i8;
            int i27 = i24;
            while (i27 <= i5) {
                char c3 = c;
                int i28 = (iArr[i24][i9] - i10) + i20;
                char c4 = c2;
                int i29 = (iArr[c3][i9] - i11) + i21;
                int i30 = (iArr[c4][i9] - i12) + i22;
                int i31 = i27;
                int i32 = (iArr[3][i9] - i13) + i23;
                i9++;
                iArr2[i24][i26] = (int) ((((double) i28) * d) + 0.5d);
                iArr2[c3][i26] = (int) ((((double) i29) * d) + 0.5d);
                iArr2[c4][i26] = (int) ((((double) i30) * d) + 0.5d);
                iArr2[3][i26] = (int) ((((double) i32) * d) + 0.5d);
                i26++;
                i22 = i30;
                i23 = i32;
                i27 = i31 + 1;
                i20 = i28;
                i21 = i29;
                c2 = c4;
                c = c3;
                i7 = i7;
                i5 = i3;
            }
            char c5 = c;
            int i33 = i7;
            char c6 = c2;
            int i34 = i19;
            while (true) {
                i4 = i - i3;
                if (i34 >= i4) {
                    break;
                }
                int[] iArr7 = iArr[i24];
                int i35 = (iArr7[i9] - iArr7[i8]) + i20;
                int[] iArr8 = iArr[c5];
                int i36 = (iArr8[i9] - iArr8[i8]) + i21;
                int[] iArr9 = iArr[c6];
                int i37 = (iArr9[i9] - iArr9[i8]) + i22;
                int[] iArr10 = iArr[3];
                int i38 = (iArr10[i9] - iArr10[i8]) + i23;
                i9++;
                i8++;
                iArr2[i24][i26] = (int) ((((double) i35) * d) + 0.5d);
                iArr2[c5][i26] = (int) ((((double) i36) * d) + 0.5d);
                iArr2[c6][i26] = (int) ((((double) i37) * d) + 0.5d);
                iArr2[3][i26] = (int) ((((double) i38) * d) + 0.5d);
                i26++;
                i34++;
                i20 = i35;
                i21 = i36;
                i22 = i37;
                i23 = i38;
            }
            while (i4 < i) {
                int i39 = (i15 - iArr[i24][i8]) + i20;
                int i40 = (i16 - iArr[c5][i8]) + i21;
                int i41 = (i17 - iArr[c6][i8]) + i22;
                int i42 = (i18 - iArr[3][i8]) + i23;
                i8++;
                iArr2[i24][i26] = (int) ((((double) i39) * d) + 0.5d);
                iArr2[c5][i26] = (int) ((((double) i40) * d) + 0.5d);
                iArr2[c6][i26] = (int) ((((double) i41) * d) + 0.5d);
                iArr2[3][i26] = (int) ((((double) i42) * d) + 0.5d);
                i26++;
                i4++;
                i20 = i39;
                i21 = i40;
                i22 = i41;
                i23 = i42;
            }
            i7 = i33 + 1;
            i5 = i3;
            i6 = i24;
            c = c5;
        }
    }
}
