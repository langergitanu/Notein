package com.aspose.slides.p559ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.ArithmeticException;
import com.aspose.slides.exceptions.OverflowException;
import com.google.firebase.crashlytics.internal.common.IdManager;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.yg */
/* JADX INFO: loaded from: classes5.dex */
public final class C14116yg {
    /* JADX INFO: renamed from: c5 */
    public static double m67466c5(double d) {
        return Math.tan(d);
    }

    /* JADX INFO: renamed from: ck */
    public static double m67467ck(double d) {
        return Math.asin(d);
    }

    /* JADX INFO: renamed from: du */
    public static double m67468du(double d) {
        return (Double.isInfinite(d) || Double.isNaN(d)) ? d : d > 0.0d ? m67490kk(d) : d < 0.0d ? m67501x1(d) : d;
    }

    /* JADX INFO: renamed from: dy */
    public static double m67470dy(double d) {
        return Math.cos(d);
    }

    /* JADX INFO: renamed from: fa */
    public static double m67471fa(double d) {
        return Math.atan(d);
    }

    /* JADX INFO: renamed from: h4 */
    public static int m67472h4(double d) {
        if (C14044b3.m66437kk(d)) {
            throw new ArithmeticException("NAN");
        }
        if (d > 0.0d) {
            return 1;
        }
        return d == 0.0d ? 0 : -1;
    }

    /* JADX INFO: renamed from: jd */
    public static double m67473jd(double d) {
        return Math.acos(d);
    }

    /* JADX INFO: renamed from: k4 */
    public static byte m67474k4(byte b, byte b2) {
        return (b & 255) > (b2 & 255) ? b : b2;
    }

    /* JADX INFO: renamed from: kk */
    public static double m67490kk(double d) {
        return Math.floor(d);
    }

    /* JADX INFO: renamed from: ks */
    public static double m67494ks(double d) {
        return Math.log10(d);
    }

    /* JADX INFO: renamed from: m9 */
    public static double m67495m9(double d) {
        return Math.sin(d);
    }

    /* JADX INFO: renamed from: rv */
    public static double m67496rv(double d) {
        return Math.sqrt(d);
    }

    /* JADX INFO: renamed from: to */
    public static double m67497to(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d) || d == 0.0d) {
            return d;
        }
        double dM67490kk = m67490kk(d);
        double dM67501x1 = m67501x1(d);
        double d2 = dM67501x1 - d;
        double d3 = dM67490kk - d;
        return (m67475k4(d2) != m67475k4(d3) ? m67475k4(d2) <= m67475k4(d3) : m67475k4(dM67490kk % 2.0d) == 1.0d) ? dM67501x1 : dM67490kk;
    }

    /* JADX INFO: renamed from: up */
    public static double m67500up(double d) {
        return Math.exp(d);
    }

    /* JADX INFO: renamed from: x1 */
    public static double m67501x1(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            return d;
        }
        double dM67490kk = m67490kk(d);
        return dM67490kk != d ? dM67490kk + 1.0d : dM67490kk;
    }

    /* JADX INFO: renamed from: yj */
    public static double m67511yj(double d) {
        return Math.log(d);
    }

    /* JADX INFO: renamed from: du */
    public static double m67469du(double d, double d2) {
        if (C14044b3.m66437kk(d)) {
            return Double.NaN;
        }
        return Math.pow(d, d2);
    }

    /* JADX INFO: renamed from: k4 */
    public static double m67475k4(double d) {
        return d < 0.0d ? -d : d;
    }

    /* JADX INFO: renamed from: kk */
    public static double m67491kk(double d, double d2) {
        if (C14044b3.m66437kk(d) || C14044b3.m66437kk(d2)) {
            return Double.NaN;
        }
        return d < d2 ? d : d2;
    }

    /* JADX INFO: renamed from: to */
    public static double m67498to(double d, double d2) {
        return Math.atan2(d, d2);
    }

    /* JADX INFO: renamed from: x1 */
    public static double m67502x1(double d, double d2) {
        if (C14044b3.m66437kk(d) || C14044b3.m66437kk(d2)) {
            return Double.NaN;
        }
        return d > d2 ? d : d2;
    }

    /* JADX INFO: renamed from: k4 */
    public static double m67476k4(double d, double d2) {
        if (d2 == 1.0d) {
            return Double.NaN;
        }
        double dM67511yj = m67511yj(d) / m67511yj(d2);
        if (dM67511yj == 0.0d) {
            return 0.0d;
        }
        return dM67511yj;
    }

    /* JADX INFO: renamed from: kk */
    public static long m67492kk(long j, long j2) {
        return j < j2 ? j : j2;
    }

    /* JADX INFO: renamed from: to */
    public static long m67499to(long j, long j2) {
        long j3 = j & 4294967295L;
        long j4 = j2 & 4294967295L;
        return j3 < j4 ? j3 : j4;
    }

    /* JADX INFO: renamed from: x1 */
    private static double m67503x1(double d, int i, short s) {
        return C14046bv.m66483m9(C14046bv.m66467k4(C14046bv.m66463k4(d), i, s));
    }

    /* JADX INFO: renamed from: k4 */
    public static double m67477k4(double d, int i) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            return d;
        }
        if (i < 0 || i > 15) {
            throw new ArgumentOutOfRangeException("Value is too small or too big.");
        }
        return i == 0 ? m67497to(d) : m67503x1(d, i, (short) 0);
    }

    /* JADX INFO: renamed from: kk */
    public static C14046bv m67493kk(C14046bv c14046bv) {
        return C14046bv.m66452dy(c14046bv);
    }

    /* JADX INFO: renamed from: x1 */
    public static float m67504x1(float f, float f2) {
        if (C14064he.m66715kk(f) || C14064he.m66715kk(f2)) {
            return Float.NaN;
        }
        return f < f2 ? f : f2;
    }

    /* JADX INFO: renamed from: k4 */
    public static double m67478k4(double d, int i, short s) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            return d;
        }
        if (s == 0 || s == 1) {
            return i == 0 ? m67479k4(d, s) : m67503x1(d, i, s);
        }
        throw new ArgumentException(C14113y2.m67408k4("The value '", AbstractC14106wy.getName((Class<?>) C14102vj.class, s), "' is not valid for this usage of the type MidpointRounding."), "mode");
    }

    /* JADX INFO: renamed from: x1 */
    public static int m67505x1(float f) {
        if (C14064he.m66715kk(f)) {
            throw new ArithmeticException("NAN");
        }
        if (f > 0.0f) {
            return 1;
        }
        return f == 0.0f ? 0 : -1;
    }

    /* JADX INFO: renamed from: k4 */
    public static double m67479k4(double d, short s) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            return d;
        }
        if (s == 0 || s == 1) {
            return s == 0 ? m67497to(d) : d > 0.0d ? m67490kk(d + 0.5d) : m67501x1(d - 0.5d);
        }
        throw new ArgumentException(C14113y2.m67408k4("The value '", AbstractC14106wy.getName((Class<?>) C14102vj.class, s), "' is not valid for this usage of the type MidpointRounding."), "mode");
    }

    /* JADX INFO: renamed from: x1 */
    public static int m67506x1(int i) {
        if (i > 0) {
            return 1;
        }
        return i == 0 ? 0 : -1;
    }

    /* JADX INFO: renamed from: k4 */
    public static float m67480k4(float f) {
        return f < 0.0f ? -f : f;
    }

    /* JADX INFO: renamed from: x1 */
    public static int m67507x1(int i, int i2) {
        return i < i2 ? i : i2;
    }

    /* JADX INFO: renamed from: k4 */
    public static float m67481k4(float f, float f2) {
        if (C14064he.m66715kk(f) || C14064he.m66715kk(f2)) {
            return Float.NaN;
        }
        return f > f2 ? f : f2;
    }

    /* JADX INFO: renamed from: x1 */
    public static long m67508x1(long j, long j2) {
        long j3 = j & 4294967295L;
        long j4 = j2 & 4294967295L;
        return j3 > j4 ? j3 : j4;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67482k4(int i) {
        if (i != Integer.MIN_VALUE) {
            return i < 0 ? -i : i;
        }
        throw new OverflowException("Value is too small.");
    }

    /* JADX INFO: renamed from: x1 */
    public static C14046bv m67509x1(C14046bv c14046bv) {
        C14046bv c14046bvM66452dy = C14046bv.m66452dy(c14046bv);
        C14046bv c14046bvM66490to = C14046bv.m66490to(c14046bv, c14046bvM66452dy);
        return (C14046bv.m66460jd(c14046bvM66452dy, C14046bv.m66465k4(0)) && C14046bv.m66460jd(c14046bvM66490to, new C14046bv("0.5"))) ? C14046bv.m66489to(c14046bvM66452dy) : (C14046bv.m66448ck(c14046bvM66452dy, C14046bv.m66465k4(0)) && C14046bv.m66447c5(c14046bvM66490to, new C14046bv("0.5"))) ? C14046bv.m66489to(c14046bvM66452dy) : c14046bvM66452dy;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67483k4(int i, int i2) {
        return i > i2 ? i : i2;
    }

    /* JADX INFO: renamed from: x1 */
    public static short m67510x1(short s, short s2) {
        return s < s2 ? s : s2;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67484k4(int i, int i2, int[] iArr) {
        iArr[0] = i % i2;
        return i / i2;
    }

    /* JADX INFO: renamed from: k4 */
    public static long m67485k4(long j) {
        if (j != Long.MIN_VALUE) {
            return j < 0 ? -j : j;
        }
        throw new OverflowException("Value is too small.");
    }

    /* JADX INFO: renamed from: k4 */
    public static long m67486k4(long j, long j2) {
        return j > j2 ? j : j2;
    }

    /* JADX INFO: renamed from: k4 */
    public static C14046bv m67487k4(C14046bv c14046bv) {
        C14046bv c14046bvM66452dy = C14046bv.m66452dy(c14046bv);
        C14046bv c14046bvM66490to = C14046bv.m66490to(c14046bv, c14046bvM66452dy);
        return ((C14046bv.m66453dy(c14046bvM66490to, new C14046bv("0.5")) && C14046bv.m66484m9(C14046bv.m66451du(new C14046bv("2.0"), C14046bv.m66490to(C14046bv.m66458h4(c14046bvM66452dy, new C14046bv("2.0")), C14046bv.m66452dy(C14046bv.m66458h4(c14046bvM66452dy, new C14046bv("2.0"))))), new C14046bv(IdManager.DEFAULT_VERSION_NAME))) || C14046bv.m66447c5(c14046bvM66490to, new C14046bv("0.5"))) ? C14046bv.m66489to(c14046bvM66452dy) : c14046bvM66452dy;
    }

    /* JADX INFO: renamed from: k4 */
    public static C14046bv m67488k4(C14046bv c14046bv, short s) {
        if (s == 0 || s == 1) {
            return s == 0 ? m67487k4(c14046bv) : m67509x1(c14046bv);
        }
        throw new ArgumentException(C14113y2.m67408k4("The value '", AbstractC14106wy.getName((Class<?>) C14102vj.class, s), "' is not valid for this usage of the type MidpointRounding."), "mode");
    }

    /* JADX INFO: renamed from: k4 */
    public static short m67489k4(short s, short s2) {
        return s > s2 ? s : s2;
    }
}
