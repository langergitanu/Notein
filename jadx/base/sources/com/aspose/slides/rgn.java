package com.aspose.slides;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class rgn {
    /* JADX INFO: renamed from: k4 */
    public static double[][] m70089k4(double[] dArr, double[][] dArr2) {
        char c;
        char c2;
        double[][] dArr3 = new double[5][];
        int length = dArr.length;
        int i = 0;
        int length2 = dArr2[0].length;
        for (int i2 = 0; i2 < 5; i2++) {
            dArr3[i2] = new double[length2 + 1];
        }
        double[] dArr4 = new double[length2];
        int i3 = 0;
        while (true) {
            double d = 0.0d;
            if (i3 >= length2) {
                break;
            }
            for (int i4 = 0; i4 < length; i4++) {
                d += dArr2[i4][i3];
            }
            dArr4[i3] = d / ((double) length);
            i3++;
        }
        double d2 = 0.0d;
        for (double d3 : dArr) {
            d2 += d3;
        }
        double d4 = d2 / ((double) length);
        double[][] dArr5 = new double[length2][];
        for (int i5 = 0; i5 < length2; i5++) {
            dArr5[i5] = new double[length2];
            for (int i6 = 0; i6 < length2; i6++) {
                double dOooO0O0 = 0.0d;
                for (int i7 = 0; i7 < length; i7++) {
                    double[] dArr6 = dArr2[i7];
                    dOooO0O0 = C21532OooOOo.OooO0O0(dArr6[i6], dArr4[i6], dArr6[i5] - dArr4[i5], dOooO0O0);
                }
                dArr5[i5][i6] = dOooO0O0;
            }
        }
        double[] dArr7 = new double[length2];
        for (int i8 = 0; i8 < length2; i8++) {
            dArr7[i8] = 0.0d;
            int i9 = 0;
            while (i9 < length) {
                double d5 = d4;
                dArr7[i8] = C21532OooOOo.OooO0O0(dArr[i9], d5, dArr2[i9][i8] - dArr4[i8], dArr7[i8]);
                i9++;
                d4 = d5;
            }
        }
        double d6 = d4;
        double[][] dArr8 = new double[length2][];
        for (int i10 = 0; i10 < length2; i10++) {
            double[] dArr9 = new double[length2 + 1];
            dArr8[i10] = dArr9;
            System.arraycopy(dArr5[i10], 0, dArr9, 0, length2);
            dArr8[i10][length2] = dArr7[i10];
        }
        double[] dArrM70092kk = m70092kk(dArr8);
        int i11 = 0;
        for (int length3 = dArrM70092kk.length - 1; length3 >= 0 && dArrM70092kk[length3] == 0.0d; length3--) {
            i11++;
        }
        double d7 = d6;
        for (int i12 = 0; i12 < length2; i12++) {
            d7 -= dArrM70092kk[i12] * dArr4[i12];
        }
        for (int i13 = 0; i13 < length2; i13++) {
            dArr3[0][i13] = dArrM70092kk[(length2 - i13) - 1];
        }
        dArr3[0][length2] = d7;
        int length4 = dArrM70092kk.length;
        char c3 = 4;
        char c4 = 3;
        if (i11 == length4) {
            for (int i14 = 0; i14 < length2; i14++) {
                dArr3[1][i14] = 0.0d;
            }
            double[] dArr10 = dArr3[2];
            dArr10[0] = 1.0d;
            dArr10[1] = 0.0d;
            double[] dArr11 = dArr3[3];
            dArr11[0] = Double.NaN;
            dArr11[1] = length - length2;
            double[] dArr12 = dArr3[4];
            dArr12[0] = 0.0d;
            dArr12[1] = 0.0d;
            return dArr3;
        }
        double[] dArr13 = new double[length];
        for (int i15 = 0; i15 < length; i15++) {
            dArr13[i15] = 0.0d;
            for (int i16 = 0; i16 < length2; i16++) {
                dArr13[i15] = (dArr3[0][(length2 - i16) - 1] * dArr2[i15][i16]) + dArr13[i15];
            }
            dArr13[i15] = dArr13[i15] + dArr3[0][length2];
        }
        double dOooO0O02 = 0.0d;
        double dOooO0O03 = 0.0d;
        for (int i17 = 0; i17 < length; i17++) {
            double d8 = dArr[i17];
            double d9 = dArr13[i17];
            dOooO0O03 = C21532OooOOo.OooO0O0(d8, d9, d8 - d9, dOooO0O03);
            double d10 = d6;
            dOooO0O02 = C21532OooOOo.OooO0O0(d10, d9, d6 - d9, dOooO0O02);
            d6 = d10;
        }
        double d11 = (((double) (length - length2)) - 1.0d) + ((double) i11);
        double d12 = dOooO0O03 / d11;
        dArr3[2][1] = C14116yg.m67496rv(d12);
        double[][] dArr14 = new double[dArr2.length][];
        int i18 = 0;
        while (i18 < dArr2.length) {
            dArr14[i18] = new double[dArr2[i18].length + 1];
            int i19 = i;
            while (true) {
                double[] dArr15 = dArr2[i18];
                c2 = c3;
                if (i19 < dArr15.length + 1) {
                    if (i19 == 0) {
                        dArr14[i18][i19] = 1.0d;
                    } else {
                        dArr14[i18][i19] = dArr15[i19 - 1];
                    }
                    i19++;
                    c3 = c2;
                }
            }
            i18++;
            i = i19;
            c3 = c2;
        }
        int i20 = i;
        char c5 = c3;
        double[][] dArrM70090k4 = m70090k4(m70091k4(m70094x1(dArr14), dArr14));
        for (int i21 = i20; i21 < dArrM70090k4.length; i21++) {
            int i22 = i20;
            while (true) {
                double[] dArr16 = dArrM70090k4[i21];
                if (i22 < dArr16.length) {
                    if (i21 == i22) {
                        c = c4;
                        dArr3[1][(dArrM70090k4.length - i21) - 1] = C14116yg.m67496rv(dArr16[i22] * d12);
                    } else {
                        c = c4;
                    }
                    i22++;
                    c4 = c;
                }
            }
        }
        double[] dArr17 = dArr3[c4];
        dArr17[i20] = (dOooO0O02 / ((double) (length2 - i11))) / d12;
        dArr17[1] = d11;
        double[] dArr18 = dArr3[c5];
        dArr18[i20] = dOooO0O02;
        dArr18[1] = dOooO0O03;
        dArr3[2][i20] = dOooO0O02 / (dOooO0O02 + dOooO0O03);
        return dArr3;
    }

    /* JADX INFO: renamed from: kk */
    private static double[] m70092kk(double[][] dArr) {
        int i;
        if (dArr == null) {
            return null;
        }
        int length = dArr.length;
        int i2 = 0;
        int length2 = dArr[0].length;
        double[] dArr2 = new double[length];
        int i3 = 0;
        while (i3 < length) {
            double d = dArr[i3][i3];
            int i4 = i3 + 1;
            int i5 = i3;
            for (int i6 = i4; i6 < length; i6++) {
                if (C14116yg.m67475k4(d) < C14116yg.m67475k4(dArr[i6][i3])) {
                    d = dArr[i6][i3];
                    i5 = i6;
                }
            }
            if (i3 != i5) {
                for (int i7 = i2; i7 < length2; i7++) {
                    double[] dArr3 = dArr[i3];
                    double d2 = dArr3[i7];
                    double[] dArr4 = dArr[i5];
                    dArr3[i7] = dArr4[i7];
                    dArr4[i7] = d2;
                }
            }
            int i8 = i4;
            while (i8 < length) {
                double d3 = dArr[i8][i3];
                if (d3 != 0.0d) {
                    double d4 = -(d3 / d);
                    for (int i9 = i3; i9 < length2; i9++) {
                        double[] dArr5 = dArr[i8];
                        double d5 = (dArr[i3][i9] * d4) + dArr5[i9];
                        dArr5[i9] = d5;
                        if (C14116yg.m67475k4(d5) < 5.0E-14d) {
                            dArr[i8][i9] = 0.0d;
                        }
                    }
                }
                i8++;
                i2 = 0;
            }
            i3 = i4;
        }
        int i10 = length - 1;
        for (int i11 = i10; i11 >= 0; i11--) {
            if (i11 == i10) {
                if (C14116yg.m67475k4(dArr[i11][i11]) < 5.0E-14d) {
                    dArr2[i11] = 0.0d;
                } else {
                    double[] dArr6 = dArr[i11];
                    dArr2[i11] = dArr6[length2 - 1] / dArr6[i11];
                }
            } else if (C14116yg.m67475k4(dArr[i11][i11]) < 5.0E-14d) {
                dArr2[i11] = 0.0d;
            } else {
                int i12 = i11 + 1;
                double d6 = 0.0d;
                while (true) {
                    i = length2 - 1;
                    if (i12 >= i) {
                        break;
                    }
                    d6 += dArr[i11][i12] * dArr2[i12];
                    i12++;
                }
                double[] dArr7 = dArr[i11];
                dArr2[i11] = (dArr7[i] - d6) / dArr7[i11];
            }
        }
        return dArr2;
    }

    /* JADX INFO: renamed from: x1 */
    public static double[][] m70093x1(double[] dArr, double[][] dArr2) {
        double dOooO0O0;
        char c;
        double[][] dArr3 = new double[5][];
        int length = dArr.length;
        int length2 = dArr2[0].length;
        for (int i = 0; i < 5; i++) {
            dArr3[i] = new double[length2 + 1];
        }
        double[] dArr4 = new double[length2];
        int i2 = 0;
        while (true) {
            dOooO0O0 = 0.0d;
            if (i2 >= length2) {
                break;
            }
            for (int i3 = 0; i3 < length; i3++) {
                dOooO0O0 += dArr2[i3][i2];
            }
            dArr4[i2] = dOooO0O0 / ((double) length);
            i2++;
        }
        double d = 0.0d;
        for (double d2 : dArr) {
            d += d2;
        }
        double d3 = d / ((double) length);
        double[][] dArr5 = new double[length2][];
        for (int i4 = 0; i4 < length2; i4++) {
            dArr5[i4] = new double[length2];
            for (int i5 = 0; i5 < length2; i5++) {
                double d4 = 0.0d;
                for (int i6 = 0; i6 < length; i6++) {
                    double[] dArr6 = dArr2[i6];
                    d4 = (dArr6[i5] * dArr6[i4]) + d4;
                }
                dArr5[i4][i5] = d4;
            }
        }
        double[] dArr7 = new double[length2];
        for (int i7 = 0; i7 < length2; i7++) {
            dArr7[i7] = 0.0d;
            for (int i8 = 0; i8 < length; i8++) {
                dArr7[i7] = (dArr[i8] * dArr2[i8][i7]) + dArr7[i7];
            }
        }
        double[][] dArr8 = new double[length2][];
        for (int i9 = 0; i9 < length2; i9++) {
            double[] dArr9 = new double[length2 + 1];
            dArr8[i9] = dArr9;
            System.arraycopy(dArr5[i9], 0, dArr9, 0, length2);
            dArr8[i9][length2] = dArr7[i9];
        }
        double[] dArrM70092kk = m70092kk(dArr8);
        for (int i10 = 0; i10 < length2; i10++) {
            dArr3[0][i10] = dArrM70092kk[(length2 - i10) - 1];
        }
        dArr3[0][length2] = 0.0d;
        double[] dArr10 = new double[length];
        for (int i11 = 0; i11 < length; i11++) {
            dArr10[i11] = 0.0d;
            for (int i12 = 0; i12 < length2; i12++) {
                dArr10[i11] = (dArr3[0][(length2 - i12) - 1] * dArr2[i11][i12]) + dArr10[i11];
            }
            dArr10[i11] = dArr10[i11] + dArr3[0][length2];
        }
        double dOooO0O02 = 0.0d;
        for (int i13 = 0; i13 < length; i13++) {
            double d5 = dArr[i13];
            double d6 = dArr10[i13];
            dOooO0O02 = C21532OooOOo.OooO0O0(d5, d6, d5 - d6, dOooO0O02);
            dOooO0O0 = C21532OooOOo.OooO0O0(d3, d6, d3 - d6, dOooO0O0);
        }
        double d7 = dOooO0O0;
        double d8 = ((double) (length - length2)) - 1.0d;
        double d9 = dOooO0O02 / d8;
        char c2 = 2;
        dArr3[2][1] = C14116yg.m67496rv(d9);
        double[][] dArr11 = new double[dArr2.length][];
        int i14 = 0;
        while (i14 < dArr2.length) {
            dArr11[i14] = new double[dArr2[i14].length + 1];
            int i15 = 0;
            while (true) {
                double[] dArr12 = dArr2[i14];
                c = c2;
                if (i15 < dArr12.length + 1) {
                    if (i15 == 0) {
                        dArr11[i14][i15] = 1.0d;
                    } else {
                        dArr11[i14][i15] = dArr12[i15 - 1];
                    }
                    i15++;
                    c2 = c;
                }
            }
            i14++;
            c2 = c;
        }
        char c3 = c2;
        double[][] dArrM70090k4 = m70090k4(m70091k4(m70094x1(dArr11), dArr11));
        for (int i16 = 0; i16 < dArrM70090k4.length; i16++) {
            int i17 = 0;
            while (true) {
                double[] dArr13 = dArrM70090k4[i16];
                if (i17 < dArr13.length) {
                    if (i16 == i17) {
                        dArr3[1][(dArrM70090k4.length - i16) - 1] = C14116yg.m67496rv(dArr13[i17] * d9);
                    }
                    i17++;
                }
            }
        }
        double[] dArr14 = dArr3[3];
        dArr14[0] = (d7 / ((double) length2)) / d9;
        dArr14[1] = d8;
        double[] dArr15 = dArr3[4];
        dArr15[0] = d7;
        dArr15[1] = dOooO0O02;
        dArr3[c3][0] = d7 / (d7 + dOooO0O02);
        return dArr3;
    }

    /* JADX INFO: renamed from: k4 */
    public static double[][] m70090k4(double[][] dArr) {
        int length = dArr.length;
        double[][] dArr2 = new double[length][];
        for (int i = 0; i < length; i++) {
            double[] dArr3 = dArr[0];
            dArr2[i] = new double[dArr3.length + dArr3.length];
            int i2 = 0;
            while (true) {
                double[] dArr4 = dArr2[i];
                if (i2 < dArr4.length) {
                    double[] dArr5 = dArr[0];
                    if (i2 < dArr5.length) {
                        dArr4[i2] = dArr[i][i2];
                    } else if (i2 == dArr5.length + i) {
                        dArr4[i2] = 1.0d;
                    }
                    i2++;
                }
            }
        }
        int length2 = dArr2[0].length;
        int i3 = 1;
        do {
            int i4 = i3 - 1;
            double dM67475k4 = C14116yg.m67475k4(dArr2[i4][i4]);
            int i5 = i4;
            int i6 = i5;
            while (i5 < length) {
                if (C14116yg.m67475k4(dArr2[i5][i4]) > dM67475k4) {
                    dM67475k4 = C14116yg.m67475k4(dArr2[i5][i4]);
                    i6 = i5;
                }
                i5++;
            }
            if (i6 != i4) {
                for (int i7 = 0; i7 < length2; i7++) {
                    double[] dArr6 = dArr2[i4];
                    double d = dArr6[i7];
                    double[] dArr7 = dArr2[i6];
                    dArr6[i7] = dArr7[i7];
                    dArr7[i7] = d;
                }
            }
            for (int i8 = i3; i8 < length; i8++) {
                double d2 = dArr2[i4][i4];
                if (d2 == 0.0d) {
                    return null;
                }
                double d3 = dArr2[i8][i4] / d2;
                for (int i9 = 0; i9 < length2; i9++) {
                    double[] dArr8 = dArr2[i8];
                    dArr8[i9] = dArr8[i9] - (dArr2[i4][i9] * d3);
                }
            }
            i3++;
        } while (i3 <= length);
        int i10 = length - 2;
        do {
            for (int i11 = i10; i11 >= 0; i11--) {
                int i12 = i10 + 1;
                double d4 = dArr2[i12][i12];
                if (d4 == 0.0d) {
                    return null;
                }
                double d5 = dArr2[i11][i12] / d4;
                if (C14116yg.m67475k4(d4) < 5.0E-14d) {
                    d5 = 0.0d;
                }
                for (int i13 = 0; i13 < length2; i13++) {
                    double[] dArr9 = dArr2[i11];
                    dArr9[i13] = dArr9[i13] - (dArr2[i12][i13] * d5);
                }
            }
            i10--;
        } while (i10 >= 0);
        for (int i14 = 0; i14 < length; i14++) {
            double d6 = dArr2[i14][i14];
            if (C14116yg.m67475k4(d6) < 5.0E-14d) {
                for (int i15 = 0; i15 < length2; i15++) {
                    dArr2[i14][i15] = 0.0d;
                }
            } else {
                for (int i16 = 0; i16 < length2; i16++) {
                    double[] dArr10 = dArr2[i14];
                    dArr10[i16] = dArr10[i16] / d6;
                }
            }
        }
        double[][] dArr11 = new double[dArr.length][];
        for (int i17 = 0; i17 < length; i17++) {
            double[] dArr12 = new double[length];
            dArr11[i17] = dArr12;
            System.arraycopy(dArr2[i17], length, dArr12, 0, length);
        }
        return dArr11;
    }

    /* JADX INFO: renamed from: x1 */
    public static double[][] m70094x1(double[][] dArr) {
        if (dArr == null) {
            return null;
        }
        int length = dArr.length;
        int length2 = dArr[0].length;
        double[][] dArr2 = new double[length2][];
        for (int i = 0; i < length2; i++) {
            dArr2[i] = new double[length];
        }
        for (int i2 = 0; i2 < length2; i2++) {
            for (int i3 = 0; i3 < length; i3++) {
                dArr2[i2][i3] = dArr[i3][i2];
            }
        }
        return dArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public static double[][] m70091k4(double[][] dArr, double[][] dArr2) {
        if (dArr == null || dArr2 == null) {
            return null;
        }
        int length = dArr.length;
        int length2 = dArr[0].length;
        int length3 = dArr2[0].length;
        double[][] dArr3 = new double[length][];
        for (int i = 0; i < length; i++) {
            dArr3[i] = new double[length3];
        }
        for (int i2 = 0; i2 < length; i2++) {
            for (int i3 = 0; i3 < length3; i3++) {
                dArr3[i2][i3] = 0.0d;
                for (int i4 = 0; i4 < length2; i4++) {
                    double[] dArr4 = dArr3[i2];
                    dArr4[i3] = (dArr[i2][i4] * dArr2[i4][i3]) + dArr4[i3];
                }
            }
        }
        return dArr3;
    }
}
