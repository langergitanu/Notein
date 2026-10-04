package com.aspose.slides.internal.p340pm;

import androidx.datastore.preferences.protobuf.C21825OoooOO0;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.pm.to */
/* JADX INFO: loaded from: classes4.dex */
public class C9467to {
    /* JADX INFO: renamed from: k4 */
    public static double m46521k4(C12025x6 c12025x6, C12025x6 c12025x62) {
        return m46532kk(c12025x6.m56897x1(), c12025x6.m56895kk(), c12025x62.m56897x1(), c12025x62.m56895kk());
    }

    /* JADX INFO: renamed from: kk */
    public static double m46532kk(float f, float f2, float f3, float f4) {
        double d = f - f3;
        double d2 = f2 - f4;
        return Math.sqrt((d2 * d2) + (d * d));
    }

    /* JADX INFO: renamed from: x1 */
    public static float m46533x1(float f, float f2, float f3, float f4) {
        return (float) (Math.atan2(f4, f3) - Math.atan2(f2, f));
    }

    /* JADX INFO: renamed from: k4 */
    public static float m46522k4(float f, float f2) {
        return (float) Math.sqrt((f2 * f2) + (f * f));
    }

    /* JADX INFO: renamed from: x1 */
    public static C12025x6 m46534x1(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = 1.0f - f;
        float f9 = f8 * f8;
        float f10 = f * f;
        C12025x6 c12025x6 = new C12025x6();
        float f11 = f * 2.0f * f8;
        float f12 = f6 * f10;
        c12025x6.m56891k4(f12 + (f4 * f11) + (f2 * f9));
        float f13 = f10 * f7;
        c12025x6.m56898x1(f13 + (f11 * f5) + (f9 * f3));
        return c12025x6;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12025x6 m46523k4(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10 = 1.0f - f;
        float f11 = f10 * f10 * f10;
        float f12 = f * f * f;
        C12025x6 c12025x6 = new C12025x6();
        float f13 = 3.0f * f;
        float f14 = f13 * f10 * f10;
        float f15 = f13 * f * f10;
        float f16 = f6 * f15;
        float f17 = f8 * f12;
        c12025x6.m56891k4(f17 + f16 + (f4 * f14) + (f2 * f11));
        float f18 = f15 * f7;
        float f19 = f12 * f9;
        c12025x6.m56898x1(f19 + f18 + (f14 * f5) + (f11 * f3));
        return c12025x6;
    }

    /* JADX INFO: renamed from: x1 */
    public static C12025x6 m46535x1(C12025x6 c12025x6, C12025x6 c12025x62) {
        return new C12025x6((c12025x62.m56897x1() + c12025x6.m56897x1()) / 2.0f, (c12025x62.m56895kk() + c12025x6.m56895kk()) / 2.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b8  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C12025x6 m46524k4(C9468x1 c9468x1, C12025x6 c12025x6, C12025x6 c12025x62, float f) {
        if (f == 0.0f) {
            return new C12025x6(c12025x6.m56897x1(), c12025x6.m56895kk());
        }
        if (c9468x1.m46542k4()) {
            return c12025x62.m56895kk() > c12025x6.m56895kk() ? new C12025x6(c12025x6.m56897x1(), c12025x6.m56895kk() + f) : new C12025x6(c12025x6.m56897x1(), c12025x6.m56895kk() - f);
        }
        float f2 = -c9468x1.f34471k4;
        float f3 = c9468x1.f34475x1;
        double d = f2 / f3;
        double d2 = (-c9468x1.f34472kk) / f3;
        double d3 = (d * d) + 1.0d;
        double dM56895kk = ((d2 - ((double) c12025x6.m56895kk())) * (d * 2.0d)) - ((double) (c12025x6.m56897x1() * 2.0f));
        double dSqrt = Math.sqrt(C21825OoooOO0.OooO00o(d3, 4.0d, (((d2 - ((double) c12025x6.m56895kk())) * (d2 - ((double) c12025x6.m56895kk()))) + ((double) (c12025x6.m56897x1() * c12025x6.m56897x1()))) - ((double) (f * f)), dM56895kk * dM56895kk));
        double d4 = -dM56895kk;
        double d5 = d3 * 2.0d;
        double d6 = (d4 + dSqrt) / d5;
        double d7 = (d4 - dSqrt) / d5;
        if (c12025x6.m56897x1() < c12025x62.m56897x1()) {
            float fM56897x1 = c12025x6.m56897x1();
            if (f <= 0.0f ? fM56897x1 < d6 : fM56897x1 >= d6) {
                d6 = d7;
            }
        } else {
            float fM56897x12 = c12025x6.m56897x1();
            if (f <= 0.0f ? fM56897x12 > d6 : fM56897x12 <= d6) {
            }
        }
        return new C12025x6((float) d6, (float) ((d * d6) + d2));
    }

    /* JADX INFO: renamed from: k4 */
    public static C12025x6 m46525k4(C12025x6 c12025x6, C11913yj c11913yj) {
        float[] fArr = new float[2];
        c11913yj.m55773k4(new float[]{c12025x6.m56897x1(), c12025x6.m56895kk()}, 0, fArr, 0, 1);
        return new C12025x6(fArr[0], fArr[1]);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m46526k4(float f, float f2, float f3, float f4) {
        return f * f4 <= f2 * f3;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m46527k4(float f, float f2, float f3, float f4, float f5) {
        return Math.abs(f - f3) <= f5 && Math.abs(f2 - f4) <= f5;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m46528k4(C12025x6 c12025x6) {
        return (Float.isNaN(c12025x6.m56897x1()) || Float.isInfinite(c12025x6.m56897x1()) || Float.isNaN(c12025x6.m56895kk()) || Float.isInfinite(c12025x6.m56895kk())) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m46529k4(C12025x6 c12025x6, C12025x6 c12025x62, float f) {
        return m46527k4(c12025x6.m56897x1(), c12025x6.m56895kk(), c12025x62.m56897x1(), c12025x62.m56895kk(), f);
    }

    /* JADX INFO: renamed from: k4 */
    public static double[] m46530k4(double d, double d2, double d3) {
        double dOooO00o = C21825OoooOO0.OooO00o(d, 4.0d, d3, d2 * d2);
        if (dOooO00o < 0.0d) {
            return null;
        }
        if (dOooO00o == 0.0d) {
            return new double[]{(-d2) / (d * 2.0d)};
        }
        double dSqrt = Math.sqrt(dOooO00o);
        double d4 = -d2;
        double d5 = d * 2.0d;
        return new double[]{(d4 + dSqrt) / d5, (d4 - dSqrt) / d5};
    }

    /* JADX INFO: renamed from: k4 */
    public static C12025x6[] m46531k4(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f4 - f2;
        float f9 = f6 - f2;
        float f10 = f5 - f3;
        float f11 = f7 - f3;
        float f12 = f9 - f8;
        float f13 = f11 - f10;
        float f14 = (f13 * f13) + (f12 * f12);
        float f15 = (f8 * f11) - (f9 * f10);
        float f16 = ((f * f) * f14) - (f15 * f15);
        if (f16 < 0.0f) {
            return null;
        }
        float fSqrt = (float) Math.sqrt(f16);
        float f17 = f15 * f13;
        float f18 = (((((f13 < 0.0f ? -1 : 1) * f12) * fSqrt) + f17) / f14) + f2;
        float f19 = ((f17 - (((f13 < 0.0f ? -1 : 1) * f12) * fSqrt)) / f14) + f2;
        float f20 = (-f15) * f12;
        float fAbs = (((Math.abs(f13) * fSqrt) + f20) / f14) + f3;
        return f16 == 0.0f ? new C12025x6[]{new C12025x6(f18, fAbs)} : new C12025x6[]{new C12025x6(f18, fAbs), new C12025x6(f19, ((f20 - (Math.abs(f13) * fSqrt)) / f14) + f3)};
    }
}
