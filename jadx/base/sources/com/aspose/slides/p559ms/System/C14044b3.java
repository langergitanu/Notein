package com.aspose.slides.p559ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p088dn.C3191c5;
import com.aspose.slides.internal.p088dn.C3205up;
import com.aspose.slides.internal.p463vm.C11683c5;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.b3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14044b3 {
    /* JADX INFO: renamed from: du */
    public static boolean m66424du(double d) {
        return d == Double.POSITIVE_INFINITY;
    }

    /* JADX INFO: renamed from: h4 */
    public static String m66425h4(double d) {
        return C3205up.m13812k4("G", d, C11683c5.m55034jd());
    }

    /* JADX INFO: renamed from: k4 */
    public static double m66426k4(String str) {
        return C3191c5.m13705k4(str);
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m66437kk(double d) {
        return Double.isNaN(d);
    }

    /* JADX INFO: renamed from: to */
    public static boolean m66438to(double d) {
        return d == Double.NEGATIVE_INFINITY;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m66439x1(double d) {
        return d == Double.POSITIVE_INFINITY || d == Double.NEGATIVE_INFINITY;
    }

    /* JADX INFO: renamed from: k4 */
    public static double m66427k4(String str, int i, InterfaceC14073kp interfaceC14073kp) {
        return C3191c5.m13706k4(str, i, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m66440x1(double d, double d2) {
        if (d2 != d) {
            return m66437kk(d2) && m66437kk(d);
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static double m66428k4(String str, InterfaceC14073kp interfaceC14073kp) {
        return C3191c5.m13707k4(str, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m66429k4(double d) {
        return new Double(d).hashCode();
    }

    /* JADX INFO: renamed from: k4 */
    public static int m66430k4(double d, double d2) {
        if (m66424du(d) && m66424du(d2)) {
            return 0;
        }
        if (m66438to(d) && m66438to(d2)) {
            return 0;
        }
        if (m66437kk(d2)) {
            return m66437kk(d) ? 0 : 1;
        }
        if (m66437kk(d) && !m66437kk(d2)) {
            return -1;
        }
        if (d > d2) {
            return 1;
        }
        return d < d2 ? -1 : 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m66431k4(double d, Object obj) {
        if (obj == null) {
            return 1;
        }
        if (obj.getClass() != Double.class) {
            throw new ArgumentException("Value is not a System.Double");
        }
        double dM66903fa = C14080ne.m66903fa(obj);
        if (m66424du(d) && m66424du(dM66903fa)) {
            return 0;
        }
        if (m66438to(d) && m66438to(dM66903fa)) {
            return 0;
        }
        if (m66437kk(dM66903fa)) {
            return !m66437kk(d) ? 1 : 0;
        }
        if (m66437kk(d) && !m66437kk(dM66903fa)) {
            return -1;
        }
        if (d > dM66903fa) {
            return 1;
        }
        return d < dM66903fa ? -1 : 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66432k4(double d, InterfaceC14073kp interfaceC14073kp) {
        return C3205up.m13812k4((String) null, d, C11683c5.m55035k4(interfaceC14073kp));
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66433k4(double d, String str) {
        return C3205up.m13812k4(str, d, C11683c5.m55034jd());
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66434k4(double d, String str, InterfaceC14073kp interfaceC14073kp) {
        return C3205up.m13812k4(str, d, C11683c5.m55035k4(interfaceC14073kp));
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66435k4(String str, int i, InterfaceC14073kp interfaceC14073kp, double[] dArr) {
        try {
            dArr[0] = m66427k4(str, i, interfaceC14073kp);
            return true;
        } catch (Exception unused) {
            dArr[0] = 0.0d;
            return false;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66436k4(String str, double[] dArr) {
        return m66435k4(str, 231, C11683c5.m55034jd(), dArr);
    }
}
