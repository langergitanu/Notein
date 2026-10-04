package com.aspose.slides.internal.p282mu;

import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.mu.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C6542kk {

    /* JADX INFO: renamed from: k4 */
    static final /* synthetic */ boolean f18286k4 = true;

    /* JADX INFO: renamed from: k4 */
    public static float m26357k4(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((f6 * f6) + (f5 * f5));
    }

    /* JADX INFO: renamed from: kk */
    public static double m26361kk(C12025x6 c12025x6, C12025x6 c12025x62) {
        float fM56897x1 = c12025x6.m56897x1();
        float fM56895kk = c12025x6.m56895kk();
        float fM56897x12 = c12025x62.m56897x1();
        float fM56895kk2 = c12025x62.m56895kk();
        double d = fM56897x12 - fM56897x1;
        double d2 = fM56895kk2 - fM56895kk;
        if (d == 0.0d && d2 == 0.0d) {
            return 0.0d;
        }
        if (d == 0.0d && d2 != 0.0d) {
            return fM56895kk > fM56895kk2 ? -1.5707963267948966d : 1.5707963267948966d;
        }
        if (d != 0.0d && d2 == 0.0d) {
            return fM56897x1 > fM56897x12 ? 3.141592653589793d : 0.0d;
        }
        double dAtan = Math.atan(d2 / d);
        if (d < 0.0d && d2 < 0.0d) {
            dAtan -= 3.141592653589793d;
        }
        return (d >= 0.0d || d2 < 0.0d) ? dAtan : dAtan + 3.141592653589793d;
    }

    /* JADX INFO: renamed from: to */
    private static double m26362to(C12025x6 c12025x6, C12025x6 c12025x62) {
        C12025x6[] c12025x6ArrM26360k4 = m26360k4(c12025x6, c12025x62);
        float fM56897x1 = c12025x6ArrM26360k4[0].m56897x1();
        float fM56895kk = c12025x6ArrM26360k4[0].m56895kk();
        float fM56897x12 = c12025x6ArrM26360k4[1].m56897x1();
        float fM56895kk2 = c12025x6ArrM26360k4[1].m56895kk();
        float f = fM56897x12 - fM56897x1;
        float f2 = fM56895kk2 - fM56895kk;
        double d = f;
        if (d == 0.0d && f2 == 0.0d) {
            return 0.0d;
        }
        if (d == 0.0d && f2 != 0.0d) {
            return fM56895kk > fM56895kk2 ? -1.5707963267948966d : 1.5707963267948966d;
        }
        if (d == 0.0d || f2 != 0.0d) {
            return Math.atan(f2 / f);
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: x1 */
    public static float m26363x1(C12025x6 c12025x6, C12025x6 c12025x62) {
        return m26357k4(c12025x6.m56897x1(), c12025x6.m56895kk(), c12025x62.m56897x1(), c12025x62.m56895kk());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C12025x6 m26358k4(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63, C12025x6 c12025x64) {
        float fM56897x1 = c12025x6.m56897x1();
        float fM56895kk = c12025x6.m56895kk();
        float fM56897x12 = c12025x62.m56897x1() - fM56897x1;
        float fM56895kk2 = c12025x62.m56895kk() - fM56895kk;
        float fM56897x13 = c12025x63.m56897x1() - fM56897x1;
        float fM56895kk3 = c12025x63.m56895kk() - fM56895kk;
        float fM56897x14 = c12025x64.m56897x1() - fM56897x1;
        float fM56895kk4 = c12025x64.m56895kk() - fM56895kk;
        float f = fM56897x14 - fM56897x13;
        float f2 = fM56895kk2 / fM56897x12;
        float f3 = (fM56895kk4 - fM56895kk3) / f;
        if (f2 == f3) {
            return null;
        }
        if (f != 0.0f || fM56897x12 == 0.0f) {
            if (f != 0.0f || fM56897x12 != 0.0f) {
                fM56895kk3 = fM56895kk4;
            }
            float f4 = fM56895kk4 - (fM56897x14 * f3);
            if (f != 0.0f) {
                if (f2 != 0.0f) {
                    fM56895kk3 = f4 / (1.0f - (f3 / f2));
                    fM56897x13 = fM56895kk3 / f2;
                } else if (f3 != 0.0f) {
                    fM56895kk3 = ((((-1.0f) * f4) * f2) / f3) / (1.0f - (f2 / f3));
                    fM56897x13 = (fM56895kk3 - f4) / f3;
                }
            }
            return new C12025x6(fM56897x13 + fM56897x1, fM56895kk3 + fM56895kk);
        }
        fM56895kk3 = f2 * fM56897x14;
        fM56897x13 = fM56897x14;
        float f42 = fM56895kk4 - (fM56897x14 * f3);
        if (f != 0.0f) {
        }
        return new C12025x6(fM56897x13 + fM56897x1, fM56895kk3 + fM56895kk);
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m26364x1(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63, float f) {
        return Math.abs((((double) m26363x1(c12025x6, c12025x63)) + ((double) m26363x1(c12025x62, c12025x63))) - ((double) m26363x1(c12025x6, c12025x62))) < ((double) f);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m26359k4(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63, float f) {
        double dM26362to = m26362to(c12025x6, c12025x62);
        double dM26362to2 = m26362to(c12025x6, c12025x63);
        double dM26362to3 = m26362to(c12025x62, c12025x63);
        if (m26363x1(c12025x6, c12025x62) < f || m26363x1(c12025x6, c12025x63) < f || m26363x1(c12025x62, c12025x63) < f) {
            return true;
        }
        double d = 1.0E-4f;
        return Math.abs(dM26362to - dM26362to2) < d || Math.abs(dM26362to - dM26362to3) < d || Math.abs(dM26362to2 - dM26362to3) < d;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12025x6[] m26360k4(C12025x6 c12025x6, C12025x6 c12025x62) {
        return c12025x6.m56897x1() < c12025x62.m56897x1() ? new C12025x6[]{c12025x6, c12025x62} : c12025x6.m56897x1() > c12025x62.m56897x1() ? new C12025x6[]{c12025x62, c12025x6} : c12025x6.m56895kk() > c12025x62.m56895kk() ? new C12025x6[]{c12025x62, c12025x6} : new C12025x6[]{c12025x6, c12025x62};
    }
}
