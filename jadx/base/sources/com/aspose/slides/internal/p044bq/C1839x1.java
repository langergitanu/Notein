package com.aspose.slides.internal.p044bq;

import OooOO0.OooO0OO;
import androidx.datastore.preferences.protobuf.C21825OoooOO0;

/* JADX INFO: renamed from: com.aspose.slides.internal.bq.x1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1839x1 {

    /* JADX INFO: renamed from: k4 */
    static final /* synthetic */ boolean f6678k4 = true;

    private C1839x1() {
        throw new Error("This is a non instantiable class");
    }

    /* JADX INFO: renamed from: k4 */
    public static float m9609k4(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((f6 * f6) + (f5 * f5));
    }

    /* JADX INFO: renamed from: x1 */
    public static void m9621x1(float f, float[] fArr, int i, float[] fArr2, int i2, float[] fArr3, int i3) {
        float f2 = fArr[i];
        float f3 = fArr[i + 1];
        float f4 = fArr[i + 2];
        float f5 = fArr[i + 3];
        float f6 = fArr[i + 4];
        float f7 = fArr[i + 5];
        if (fArr2 != null) {
            fArr2[i2] = f2;
            fArr2[i2 + 1] = f3;
        }
        if (fArr3 != null) {
            fArr3[i3 + 4] = f6;
            fArr3[i3 + 5] = f7;
        }
        float fOooO0O0 = OooO0OO.OooO0O0(f4, f2, f, f2);
        float fOooO0O02 = OooO0OO.OooO0O0(f5, f3, f, f3);
        float fOooO0O03 = OooO0OO.OooO0O0(f6, f4, f, f4);
        float fOooO0O04 = OooO0OO.OooO0O0(f7, f5, f, f5);
        float fOooO0O05 = OooO0OO.OooO0O0(fOooO0O03, fOooO0O0, f, fOooO0O0);
        float fOooO0O06 = OooO0OO.OooO0O0(fOooO0O04, fOooO0O02, f, fOooO0O02);
        if (fArr2 != null) {
            fArr2[i2 + 2] = fOooO0O0;
            fArr2[i2 + 3] = fOooO0O02;
            fArr2[i2 + 4] = fOooO0O05;
            fArr2[i2 + 5] = fOooO0O06;
        }
        if (fArr3 != null) {
            fArr3[i3] = fOooO0O05;
            fArr3[i3 + 1] = fOooO0O06;
            fArr3[i3 + 2] = fOooO0O03;
            fArr3[i3 + 3] = fOooO0O04;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static int m9610k4(float f, float f2, float f3, float f4, float[] fArr, int i, float f5, float f6) {
        int i2;
        int iM9612k4;
        if (f == 0.0f) {
            iM9612k4 = m9612k4(fArr, i, m9611k4(f2, f3, f4, fArr, i), f5, f6);
        } else {
            float f7 = f2 / f;
            double d = f7 * f7;
            double d2 = f3 / f;
            double d3 = (((-0.3333333333333333d) * d) + d2) * 0.3333333333333333d;
            double d4 = f7;
            double dOooO00o = (C21825OoooOO0.OooO00o(d4, 0.3333333333333333d, d2, 0.07407407407407407d * d4 * d) + ((double) (f4 / f))) * 0.5d;
            double d5 = d3 * d3 * d3;
            double d6 = (dOooO00o * dOooO00o) + d5;
            if (d6 < 0.0d) {
                double dAcos = Math.acos((-dOooO00o) / Math.sqrt(-d5)) * 0.3333333333333333d;
                double dSqrt = Math.sqrt(-d3) * 2.0d;
                fArr[i] = (float) (Math.cos(dAcos) * dSqrt);
                double d7 = -dSqrt;
                fArr[i + 1] = (float) (Math.cos(dAcos + 1.0471975511965976d) * d7);
                fArr[i + 2] = (float) (Math.cos(dAcos - 1.0471975511965976d) * d7);
                i2 = 3;
            } else {
                double dSqrt2 = Math.sqrt(d6);
                fArr[i] = (float) (Math.cbrt(dSqrt2 - dOooO00o) + (-Math.cbrt(dSqrt2 + dOooO00o)));
                if (m9619k4(d6, 0.0d, 1.0E-8d)) {
                    fArr[i + 1] = -(fArr[i] / 2.0f);
                    i2 = 2;
                } else {
                    i2 = 1;
                }
            }
            float f8 = f7 * 0.33333334f;
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i + i3;
                fArr[i4] = fArr[i4] - f8;
            }
            iM9612k4 = m9612k4(fArr, i, i2, f5, f6);
        }
        return iM9612k4 - i;
    }

    /* JADX INFO: renamed from: x1 */
    public static void m9622x1(float[] fArr, int i, float[] fArr2, int i2, float[] fArr3, int i3) {
        float f = fArr[i];
        float f2 = fArr[i + 1];
        float f3 = fArr[i + 2];
        float f4 = fArr[i + 3];
        float f5 = fArr[i + 4];
        float f6 = fArr[i + 5];
        if (fArr2 != null) {
            fArr2[i2] = f;
            fArr2[i2 + 1] = f2;
        }
        if (fArr3 != null) {
            fArr3[i3 + 4] = f5;
            fArr3[i3 + 5] = f6;
        }
        float f7 = (f + f3) / 2.0f;
        float f8 = (f2 + f4) / 2.0f;
        float f9 = (f5 + f3) / 2.0f;
        float f10 = (f6 + f4) / 2.0f;
        float f11 = (f7 + f9) / 2.0f;
        float f12 = (f8 + f10) / 2.0f;
        if (fArr2 != null) {
            fArr2[i2 + 2] = f7;
            fArr2[i2 + 3] = f8;
            fArr2[i2 + 4] = f11;
            fArr2[i2 + 5] = f12;
        }
        if (fArr3 != null) {
            fArr3[i3] = f11;
            fArr3[i3 + 1] = f12;
            fArr3[i3 + 2] = f9;
            fArr3[i3 + 3] = f10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m9611k4(float f, float f2, float f3, float[] fArr, int i) {
        int i2;
        if (f != 0.0f) {
            float f4 = (f2 * f2) - ((4.0f * f) * f3);
            if (f4 > 0.0f) {
                float fSqrt = (float) Math.sqrt(f4);
                if (f2 >= 0.0f) {
                    float f5 = (-f2) - fSqrt;
                    fArr[i] = (f3 * 2.0f) / f5;
                    i2 = i + 2;
                    fArr[i + 1] = f5 / (f * 2.0f);
                } else {
                    float f6 = (-f2) + fSqrt;
                    fArr[i] = f6 / (f * 2.0f);
                    fArr[i + 1] = (f3 * 2.0f) / f6;
                    i2 = i + 2;
                }
            } else if (f4 == 0.0f) {
                i2 = i + 1;
                fArr[i] = (-f2) / (f * 2.0f);
            } else {
                i2 = i;
            }
        } else if (f2 != 0.0f) {
            float f7 = (-f3) / f2;
            i2 = i + 1;
            fArr[i] = f7;
        }
        return i2 - i;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m9612k4(float[] fArr, int i, int i2, float f, float f2) {
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            float f3 = fArr[i];
            if (f3 >= f && f3 < f2) {
                fArr[i4] = f3;
                i4++;
            }
            i++;
        }
        return i4;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m9613k4(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float[] fArr, int i) {
        float f9 = f3 - f;
        float f10 = f4 - f2;
        float f11 = f7 - f5;
        float f12 = f8 - f6;
        float f13 = (((f2 - f6) * f11) - ((f - f5) * f12)) / ((f9 * f12) - (f11 * f10));
        fArr[i] = (f9 * f13) + f;
        fArr[i + 1] = (f13 * f10) + f2;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m9614k4(float f, float[] fArr, int i, float[] fArr2, int i2, float[] fArr3, int i3) {
        float f2 = fArr[i];
        float f3 = fArr[i + 1];
        float f4 = fArr[i + 2];
        float f5 = fArr[i + 3];
        float f6 = fArr[i + 4];
        float f7 = fArr[i + 5];
        float f8 = fArr[i + 6];
        float f9 = fArr[i + 7];
        if (fArr2 != null) {
            fArr2[i2] = f2;
            fArr2[i2 + 1] = f3;
        }
        if (fArr3 != null) {
            fArr3[i3 + 6] = f8;
            fArr3[i3 + 7] = f9;
        }
        float fOooO0O0 = OooO0OO.OooO0O0(f4, f2, f, f2);
        float fOooO0O02 = OooO0OO.OooO0O0(f5, f3, f, f3);
        float fOooO0O03 = OooO0OO.OooO0O0(f8, f6, f, f6);
        float fOooO0O04 = OooO0OO.OooO0O0(f9, f7, f, f7);
        float fOooO0O05 = OooO0OO.OooO0O0(f6, f4, f, f4);
        float fOooO0O06 = OooO0OO.OooO0O0(f7, f5, f, f5);
        float fOooO0O07 = OooO0OO.OooO0O0(fOooO0O05, fOooO0O0, f, fOooO0O0);
        float fOooO0O08 = OooO0OO.OooO0O0(fOooO0O06, fOooO0O02, f, fOooO0O02);
        float fOooO0O09 = OooO0OO.OooO0O0(fOooO0O03, fOooO0O05, f, fOooO0O05);
        float fOooO0O010 = OooO0OO.OooO0O0(fOooO0O04, fOooO0O06, f, fOooO0O06);
        float fOooO0O011 = OooO0OO.OooO0O0(fOooO0O09, fOooO0O07, f, fOooO0O07);
        float fOooO0O012 = OooO0OO.OooO0O0(fOooO0O010, fOooO0O08, f, fOooO0O08);
        if (fArr2 != null) {
            fArr2[i2 + 2] = fOooO0O0;
            fArr2[i2 + 3] = fOooO0O02;
            fArr2[i2 + 4] = fOooO0O07;
            fArr2[i2 + 5] = fOooO0O08;
            fArr2[i2 + 6] = fOooO0O011;
            fArr2[i2 + 7] = fOooO0O012;
        }
        if (fArr3 != null) {
            fArr3[i3] = fOooO0O011;
            fArr3[i3 + 1] = fOooO0O012;
            fArr3[i3 + 2] = fOooO0O09;
            fArr3[i3 + 3] = fOooO0O010;
            fArr3[i3 + 4] = fOooO0O03;
            fArr3[i3 + 5] = fOooO0O04;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m9615k4(float f, float[] fArr, int i, float[] fArr2, int i2, float[] fArr3, int i3, int i4) {
        if (i4 == 6) {
            m9621x1(f, fArr, i, fArr2, i2, fArr3, i3);
        } else {
            if (i4 != 8) {
                return;
            }
            m9614k4(f, fArr, i, fArr2, i2, fArr3, i3);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m9616k4(float[] fArr, int i, int i2) {
        int i3 = i2 + i;
        for (int i4 = i + 1; i4 < i3; i4++) {
            float f = fArr[i4];
            int i5 = i4 - 1;
            while (i5 >= i) {
                float f2 = fArr[i5];
                if (f2 > f) {
                    fArr[i5 + 1] = f2;
                    i5--;
                }
            }
            fArr[i5 + 1] = f;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m9617k4(float[] fArr, int i, float[] fArr2, int i2, float[] fArr3, int i3) {
        float f = fArr[i];
        float f2 = fArr[i + 1];
        float f3 = fArr[i + 2];
        float f4 = fArr[i + 3];
        float f5 = fArr[i + 4];
        float f6 = fArr[i + 5];
        float f7 = fArr[i + 6];
        float f8 = fArr[i + 7];
        if (fArr2 != null) {
            fArr2[i2] = f;
            fArr2[i2 + 1] = f2;
        }
        if (fArr3 != null) {
            fArr3[i3 + 6] = f7;
            fArr3[i3 + 7] = f8;
        }
        float f9 = (f + f3) / 2.0f;
        float f10 = (f2 + f4) / 2.0f;
        float f11 = (f7 + f5) / 2.0f;
        float f12 = (f8 + f6) / 2.0f;
        float f13 = (f3 + f5) / 2.0f;
        float f14 = (f4 + f6) / 2.0f;
        float f15 = (f9 + f13) / 2.0f;
        float f16 = (f10 + f14) / 2.0f;
        float f17 = (f13 + f11) / 2.0f;
        float f18 = (f14 + f12) / 2.0f;
        float f19 = (f15 + f17) / 2.0f;
        float f20 = (f16 + f18) / 2.0f;
        if (fArr2 != null) {
            fArr2[i2 + 2] = f9;
            fArr2[i2 + 3] = f10;
            fArr2[i2 + 4] = f15;
            fArr2[i2 + 5] = f16;
            fArr2[i2 + 6] = f19;
            fArr2[i2 + 7] = f20;
        }
        if (fArr3 != null) {
            fArr3[i3] = f19;
            fArr3[i3 + 1] = f20;
            fArr3[i3 + 2] = f17;
            fArr3[i3 + 3] = f18;
            fArr3[i3 + 4] = f11;
            fArr3[i3 + 5] = f12;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m9618k4(float[] fArr, int i, float[] fArr2, int i2, float[] fArr3, int i3, int i4) {
        if (i4 == 6) {
            m9622x1(fArr, i, fArr2, i2, fArr3, i3);
        } else {
            if (i4 != 8) {
                throw new InternalError("Unsupported curve type");
            }
            m9617k4(fArr, i, fArr2, i2, fArr3, i3);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m9619k4(double d, double d2, double d3) {
        double d4 = d2 - d;
        return d4 <= d3 && d4 >= (-d3);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m9620k4(float f, float f2, float f3) {
        float f4 = f2 - f;
        return f4 <= f3 && f4 >= (-f3);
    }
}
