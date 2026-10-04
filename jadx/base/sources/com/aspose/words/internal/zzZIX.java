package com.aspose.words.internal;

import com.aspose.slides.OooOO0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZIX {

    public static class zzZ extends zzZIX {
        public double zzZJA;
        public double zzZJB;
        public double zzZJu;
        public double zzZJv;
        public double zzZJw;
        public double zzZJx;
        public double zzZJy;
        public double zzZJz;

        public zzZ() {
        }

        private void zzZ(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
            this.zzZJB = d;
            this.zzZJA = d2;
            this.zzZJz = d3;
            this.zzZJy = d4;
            this.zzZJx = d5;
            this.zzZJw = d6;
            this.zzZJv = d7;
            this.zzZJu = d8;
        }

        @Override // com.aspose.words.internal.zzZIX
        public final double zzda() {
            return this.zzZJw;
        }

        @Override // com.aspose.words.internal.zzZIX
        public final double zzdb() {
            return this.zzZJx;
        }

        @Override // com.aspose.words.internal.zzZIX
        public final double zzdc() {
            return this.zzZJy;
        }

        @Override // com.aspose.words.internal.zzZIX
        public final double zzdd() {
            return this.zzZJz;
        }

        @Override // com.aspose.words.internal.zzZIX
        public final double zzde() {
            return this.zzZJu;
        }

        @Override // com.aspose.words.internal.zzZIX
        public final double zzdf() {
            return this.zzZJv;
        }

        @Override // com.aspose.words.internal.zzZIX
        public final double zzdg() {
            return this.zzZJA;
        }

        @Override // com.aspose.words.internal.zzZIX
        public final double zzdh() {
            return this.zzZJB;
        }

        public zzZ(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
            zzZ(d, d2, d3, d4, d5, d6, d7, d8);
        }
    }

    private static boolean zzD(double d, double d2) {
        if (d >= 0.0d || d2 <= 0.0d) {
            return d > 0.0d && d2 < 0.0d;
        }
        return true;
    }

    private static boolean zzM(double d, double d2, double d3) {
        return d2 <= d && d <= d3;
    }

    private static boolean zzN(double d, double d2, double d3) {
        double d4 = d2 - d;
        return d4 <= d3 && d4 >= (-d3);
    }

    private static double zzU(double[] dArr) {
        double d = dArr[3];
        double dMax = (Math.max(Math.max(Math.abs(dArr[2]), Math.abs(dArr[1])), Math.abs(dArr[0])) / Math.abs(d)) + 1.0d;
        return Math.ulp(dMax) + 1.0d + dMax;
    }

    public static int zzX(double[] dArr, double[] dArr2) {
        double[] dArrCopyOf = dArr;
        int iZzZ = 3;
        double d = dArrCopyOf[3];
        if (d == 0.0d) {
            return zzZIU.zzW(dArr, dArr2);
        }
        double d2 = dArrCopyOf[2] / d;
        double d3 = dArrCopyOf[1] / d;
        double d4 = dArrCopyOf[0] / d;
        double d5 = d2 * d2;
        double dOooO00o = androidx.core.graphics.OooO00o.OooO00o(d5, -0.3333333333333333d, d3, 0.3333333333333333d);
        double d6 = 0.07407407407407407d * d2 * d5;
        double d7 = d2 * 0.3333333333333333d;
        double d8 = 0.5d * ((d6 - (d3 * d7)) + d4);
        double d9 = dOooO00o * dOooO00o * dOooO00o;
        double d10 = (d8 * d8) + d9;
        if (d10 < 0.0d) {
            double dAcos = Math.acos((-d8) / Math.sqrt(-d9)) * 0.3333333333333333d;
            double dSqrt = Math.sqrt(-dOooO00o) * 2.0d;
            if (dArr2 == dArrCopyOf) {
                dArrCopyOf = Arrays.copyOf(dArrCopyOf, 4);
            }
            dArr2[0] = Math.cos(dAcos) * dSqrt;
            double d11 = -dSqrt;
            dArr2[1] = Math.cos(dAcos + 1.0471975511965976d) * d11;
            dArr2[2] = Math.cos(dAcos - 1.0471975511965976d) * d11;
            for (int i = 0; i < 3; i++) {
                dArr2[i] = dArr2[i] - d7;
            }
        } else {
            double dSqrt2 = Math.sqrt(d10);
            double dCbrt = Math.cbrt(dSqrt2 - d8);
            double d12 = -Math.cbrt(dSqrt2 + d8);
            double d13 = dCbrt + d12;
            double dUlp = Math.ulp(Math.abs(d7) + Math.abs(d13)) * 1.2E9d;
            if (zzN(d10, 0.0d, dUlp) || zzN(dCbrt, d12, dUlp)) {
                if (dArr2 == dArrCopyOf) {
                    dArrCopyOf = Arrays.copyOf(dArrCopyOf, 4);
                }
                dArr2[1] = (-(d13 / 2.0d)) - d7;
                iZzZ = 2;
            } else {
                iZzZ = 1;
            }
            dArr2[0] = d13 - d7;
        }
        if (iZzZ > 1) {
            iZzZ = zzZ(dArrCopyOf, dArr2, iZzZ);
        }
        if (iZzZ > 2) {
            double d14 = dArr2[2];
            if (d14 == dArr2[1] || d14 == dArr2[0]) {
                iZzZ--;
            }
        }
        if (iZzZ <= 1 || dArr2[1] != dArr2[0]) {
            return iZzZ;
        }
        int i2 = iZzZ - 1;
        dArr2[1] = dArr2[i2];
        return i2;
    }

    private static double zzY(double[] dArr, double d, double d2, double d3) {
        int i = 0;
        if (zzM(d3, d, d2)) {
            double[] dArr2 = {dArr[1], dArr[2] * 2.0d, dArr[3] * 3.0d};
            double d4 = d3;
            while (i < 3) {
                double dZzZ = zzZ(dArr2, 2, d4);
                double dZzZ2 = zzZ(dArr, 3, d4);
                double d5 = (-(dZzZ2 / dZzZ)) + d4;
                if (dZzZ == 0.0d || dZzZ2 == 0.0d || d4 == d5) {
                    break;
                }
                i++;
                d4 = d5;
            }
            if (zzN(d4, d3, Math.ulp(d3) * 1000.0d) && zzM(d4, d, d2)) {
                return d4;
            }
        }
        return d3;
    }

    private static int zzZ(double[] dArr, double[] dArr2, int i) {
        int i2;
        double[] dArr3 = {dArr[1], dArr[2] * 2.0d, dArr[3] * 3.0d};
        int iZzW = zzZIU.zzW(dArr3, dArr3);
        if (iZzW == 2 && dArr3[0] == dArr3[1]) {
            iZzW--;
        }
        if (iZzW == 2) {
            double d = dArr3[0];
            double d2 = dArr3[1];
            if (d > d2) {
                dArr3[0] = d2;
                dArr3[1] = d;
            }
        }
        if (i == 3) {
            double dZzU = zzU(dArr);
            double d3 = -dZzU;
            Arrays.sort(dArr2, 0, i);
            if (iZzW == 2) {
                dArr2[0] = zzY(dArr, d3, dArr3[0], dArr2[0]);
                dArr2[1] = zzY(dArr, dArr3[0], dArr3[1], dArr2[1]);
                dArr2[2] = zzY(dArr, dArr3[1], dZzU, dArr2[2]);
                return 3;
            }
            if (iZzW == 1) {
                double d4 = dArr[3];
                i2 = 1;
                double d5 = dArr3[0];
                double dZzZ = zzZ(dArr, 3, d5);
                if (zzD(-d4, dZzZ)) {
                    dArr2[0] = zzZ(dArr, d3, d5, dArr2[0]);
                } else if (zzD(dZzZ, d4)) {
                    dArr2[0] = zzZ(dArr, d5, dZzU, dArr2[2]);
                } else {
                    dArr2[0] = d5;
                }
            } else {
                i2 = 1;
                if (iZzW == 0) {
                    dArr2[0] = zzZ(dArr, d3, dZzU, dArr2[1]);
                }
            }
        } else {
            i2 = 1;
            if (i == 2 && iZzW == 2) {
                double d6 = dArr2[0];
                double d7 = dArr2[1];
                double d8 = dArr3[0];
                double d9 = dArr3[1];
                if (Math.abs(d8 - d6) <= Math.abs(d9 - d6)) {
                    d8 = d9;
                }
                double dZzZ2 = zzZ(dArr, 3, d8);
                if (zzN(dZzZ2, 0.0d, Math.ulp(d8) * 1.0E7d)) {
                    if (Math.abs(zzZ(dArr, 3, d7)) >= Math.abs(dZzZ2)) {
                        d7 = d8;
                    }
                    dArr2[1] = d7;
                    return 2;
                }
            }
        }
        return i2;
    }

    public abstract double zzda();

    public abstract double zzdb();

    public abstract double zzdc();

    public abstract double zzdd();

    public abstract double zzde();

    public abstract double zzdf();

    public abstract double zzdg();

    public abstract double zzdh();

    private static double zzZ(double[] dArr, double d, double d2, double d3) {
        double dMin = Math.min(Math.abs(d3 - d) / 64.0d, 0.0625d);
        double dMin2 = Math.min(Math.abs(d3 - d2) / 64.0d, 0.0625d);
        double d4 = d3 - dMin;
        double d5 = d3 + dMin2;
        double d6 = d;
        double d7 = dMin;
        double dZzZ = zzZ(dArr, 3, d4);
        double dZzZ2 = zzZ(dArr, 3, d5);
        double d8 = dMin2;
        double d9 = d2;
        while (true) {
            if (zzD(dZzZ, dZzZ2)) {
                if (d4 >= d5) {
                    break;
                }
                double d10 = d7 / 64.0d;
                d8 /= 64.0d;
                double d11 = d3 - d10;
                double d12 = d3 + d8;
                double dZzZ3 = zzZ(dArr, 3, d11);
                double dZzZ4 = zzZ(dArr, 3, d12);
                double d13 = d5;
                d5 = d12;
                d9 = d13;
                d7 = d10;
                d6 = d4;
                d4 = d11;
                dZzZ = dZzZ3;
                dZzZ2 = dZzZ4;
            } else if (dZzZ != 0.0d) {
                return dZzZ2 == 0.0d ? d5 : zzZ(dArr, d6, d9);
            }
        }
        return d4;
    }

    private static double zzZ(double[] dArr, double d, double d2) {
        double d3;
        double dZzZ = zzZ(dArr, 3, d);
        double d4 = d;
        double dOooO00o = OooOO0.OooO00o(d2, d4, 2.0d, d);
        while (dOooO00o != d4 && dOooO00o != d2) {
            double dZzZ2 = zzZ(dArr, 3, dOooO00o);
            if (dZzZ2 == 0.0d) {
                break;
            }
            if (zzD(dZzZ, dZzZ2)) {
                d3 = dOooO00o;
            } else {
                d4 = dOooO00o;
                dZzZ = dZzZ2;
                d3 = d2;
            }
            dOooO00o = OooOO0.OooO00o(d3, d4, 2.0d, d4);
            d2 = d3;
        }
        return dOooO00o;
    }

    private static double zzZ(double[] dArr, int i, double d) {
        double d2 = dArr[i];
        while (true) {
            i--;
            if (i < 0) {
                return d2;
            }
            d2 = (d2 * d) + dArr[i];
        }
    }
}
