package o0000O00;

import OooO0O0.C20395OooO0o0;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: o0000O00.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24143OooO0oo extends OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final double[] f81398OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final double[][] f81399OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final double[][] f81400OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final double[] f81401OooO0Oo;

    public C24143OooO0oo(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f81401OooO0Oo = new double[length2];
        int i = length - 1;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, i, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, length2);
        for (int i2 = 0; i2 < length2; i2++) {
            int i3 = 0;
            while (i3 < i) {
                int i4 = i3 + 1;
                double d = dArr[i4] - dArr[i3];
                double[] dArr5 = dArr3[i3];
                double d2 = (dArr2[i4][i2] - dArr2[i3][i2]) / d;
                dArr5[i2] = d2;
                if (i3 == 0) {
                    dArr4[i3][i2] = d2;
                } else {
                    dArr4[i3][i2] = (dArr3[i3 - 1][i2] + d2) * 0.5d;
                }
                i3 = i4;
            }
            dArr4[i][i2] = dArr3[length - 2][i2];
        }
        for (int i5 = 0; i5 < i; i5++) {
            for (int i6 = 0; i6 < length2; i6++) {
                double d3 = dArr3[i5][i6];
                if (d3 == 0.0d) {
                    dArr4[i5][i6] = 0.0d;
                    dArr4[i5 + 1][i6] = 0.0d;
                } else {
                    double d4 = dArr4[i5][i6] / d3;
                    int i7 = i5 + 1;
                    double d5 = dArr4[i7][i6] / d3;
                    double dHypot = Math.hypot(d4, d5);
                    if (dHypot > 9.0d) {
                        double d6 = 3.0d / dHypot;
                        double[] dArr6 = dArr4[i5];
                        double[] dArr7 = dArr3[i5];
                        dArr6[i6] = d4 * d6 * dArr7[i6];
                        dArr4[i7][i6] = d6 * d5 * dArr7[i6];
                    }
                }
            }
        }
        this.f81398OooO00o = dArr;
        this.f81399OooO0O0 = dArr2;
        this.f81400OooO0OO = dArr4;
    }

    public static double OooO0o(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d2 * d2;
        double d8 = d2 * 6.0d;
        double d9 = d * 3.0d;
        return (d * d5) + ((C20395OooO0o0.OooO00o(d9, d5, d7, C20395OooO0o0.OooO00o(d9, d6, d7, C20395OooO0o0.OooO00o(d7, 6.0d, d3, (d8 * d4) + (((-6.0d) * d7) * d4)) - (d8 * d3))) - (((2.0d * d) * d6) * d2)) - (((4.0d * d) * d5) * d2));
    }

    public static double OooO0oo(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d2 * d2;
        double d8 = d7 * d2;
        double d9 = d7 * 3.0d;
        double dOooO00o = (C20395OooO0o0.OooO00o(d8, 2.0d, d3, (d9 * d4) + (((-2.0d) * d8) * d4)) - (d9 * d3)) + d3;
        double d10 = d * d6;
        double d11 = (d10 * d8) + dOooO00o;
        double d12 = d * d5;
        return (d12 * d2) + ((((d8 * d12) + d11) - (d10 * d7)) - (((d * 2.0d) * d5) * d7));
    }

    @Override // o0000O00.OooO0O0
    public final double OooO0O0(double d) {
        double d2;
        double d3;
        double dOooO0oO;
        double[] dArr = this.f81398OooO00o;
        int length = dArr.length;
        double d4 = dArr[0];
        double[][] dArr2 = this.f81399OooO0O0;
        if (d <= d4) {
            d2 = dArr2[0][0];
            d3 = d - d4;
            dOooO0oO = OooO0oO(d4);
        } else {
            int i = length - 1;
            double d5 = dArr[i];
            if (d < d5) {
                int i2 = 0;
                while (i2 < i) {
                    double d6 = dArr[i2];
                    if (d == d6) {
                        return dArr2[i2][0];
                    }
                    int i3 = i2 + 1;
                    double d7 = dArr[i3];
                    if (d < d7) {
                        double d8 = d7 - d6;
                        double d9 = (d - d6) / d8;
                        double d10 = dArr2[i2][0];
                        double d11 = dArr2[i3][0];
                        double[][] dArr3 = this.f81400OooO0OO;
                        return OooO0oo(d8, d9, d10, d11, dArr3[i2][0], dArr3[i3][0]);
                    }
                    i2 = i3;
                }
                return 0.0d;
            }
            d2 = dArr2[i][0];
            d3 = d - d5;
            dOooO0oO = OooO0oO(d5);
        }
        return (dOooO0oO * d3) + d2;
    }

    @Override // o0000O00.OooO0O0
    public final void OooO0OO(double d, double[] dArr) {
        double[] dArr2 = this.f81398OooO00o;
        int length = dArr2.length;
        double[][] dArr3 = this.f81399OooO0O0;
        int i = 0;
        int length2 = dArr3[0].length;
        double d2 = dArr2[0];
        double[] dArr4 = this.f81401OooO0Oo;
        if (d <= d2) {
            OooO0o0(d2, dArr4);
            for (int i2 = 0; i2 < length2; i2++) {
                dArr[i2] = ((d - dArr2[0]) * dArr4[i2]) + dArr3[0][i2];
            }
            return;
        }
        int i3 = length - 1;
        double d3 = dArr2[i3];
        if (d >= d3) {
            OooO0o0(d3, dArr4);
            while (i < length2) {
                dArr[i] = ((d - dArr2[i3]) * dArr4[i]) + dArr3[i3][i];
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < length - 1) {
            if (d == dArr2[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    dArr[i5] = dArr3[i4][i5];
                }
            }
            int i6 = i4 + 1;
            double d4 = dArr2[i6];
            if (d < d4) {
                double d5 = dArr2[i4];
                double d6 = d4 - d5;
                double d7 = (d - d5) / d6;
                while (i < length2) {
                    double d8 = dArr3[i4][i];
                    double d9 = dArr3[i6][i];
                    double[][] dArr5 = this.f81400OooO0OO;
                    dArr[i] = OooO0oo(d6, d7, d8, d9, dArr5[i4][i], dArr5[i6][i]);
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    @Override // o0000O00.OooO0O0
    public final void OooO0Oo(double d, float[] fArr) {
        double[] dArr = this.f81398OooO00o;
        int length = dArr.length;
        double[][] dArr2 = this.f81399OooO0O0;
        int i = 0;
        int length2 = dArr2[0].length;
        double d2 = dArr[0];
        double[] dArr3 = this.f81401OooO0Oo;
        if (d <= d2) {
            OooO0o0(d2, dArr3);
            for (int i2 = 0; i2 < length2; i2++) {
                fArr[i2] = (float) (((d - dArr[0]) * dArr3[i2]) + dArr2[0][i2]);
            }
            return;
        }
        int i3 = length - 1;
        double d3 = dArr[i3];
        if (d >= d3) {
            OooO0o0(d3, dArr3);
            while (i < length2) {
                fArr[i] = (float) (((d - dArr[i3]) * dArr3[i]) + dArr2[i3][i]);
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < length - 1) {
            if (d == dArr[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    fArr[i5] = (float) dArr2[i4][i5];
                }
            }
            int i6 = i4 + 1;
            double d4 = dArr[i6];
            if (d < d4) {
                double d5 = dArr[i4];
                double d6 = d4 - d5;
                double d7 = (d - d5) / d6;
                while (i < length2) {
                    double d8 = dArr2[i4][i];
                    double d9 = dArr2[i6][i];
                    double[][] dArr4 = this.f81400OooO0OO;
                    fArr[i] = (float) OooO0oo(d6, d7, d8, d9, dArr4[i4][i], dArr4[i6][i]);
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    @Override // o0000O00.OooO0O0
    public final void OooO0o0(double d, double[] dArr) {
        double[] dArr2 = this.f81398OooO00o;
        int length = dArr2.length;
        double[][] dArr3 = this.f81399OooO0O0;
        int length2 = dArr3[0].length;
        double d2 = dArr2[0];
        if (d > d2) {
            d2 = dArr2[length - 1];
            if (d < d2) {
                d2 = d;
            }
        }
        int i = 0;
        while (i < length - 1) {
            int i2 = i + 1;
            double d3 = dArr2[i2];
            if (d2 <= d3) {
                double d4 = dArr2[i];
                double d5 = d3 - d4;
                double d6 = (d2 - d4) / d5;
                for (int i3 = 0; i3 < length2; i3++) {
                    double d7 = dArr3[i][i3];
                    double d8 = dArr3[i2][i3];
                    double[][] dArr4 = this.f81400OooO0OO;
                    dArr[i3] = OooO0o(d5, d6, d7, d8, dArr4[i][i3], dArr4[i2][i3]) / d5;
                }
                return;
            }
            i = i2;
        }
    }

    public final double OooO0oO(double d) {
        double[] dArr = this.f81398OooO00o;
        int length = dArr.length;
        double d2 = dArr[0];
        if (d >= d2) {
            d2 = dArr[length - 1];
            if (d < d2) {
                d2 = d;
            }
        }
        int i = 0;
        while (i < length - 1) {
            int i2 = i + 1;
            double d3 = dArr[i2];
            if (d2 <= d3) {
                double d4 = dArr[i];
                double d5 = d3 - d4;
                double[][] dArr2 = this.f81399OooO0O0;
                double d6 = dArr2[i][0];
                double d7 = dArr2[i2][0];
                double[][] dArr3 = this.f81400OooO0OO;
                return OooO0o(d5, (d2 - d4) / d5, d6, d7, dArr3[i][0], dArr3[i2][0]) / d5;
            }
            i = i2;
        }
        return 0.0d;
    }
}
