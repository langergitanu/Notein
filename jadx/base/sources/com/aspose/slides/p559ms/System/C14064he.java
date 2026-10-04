package com.aspose.slides.p559ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p088dn.C3200ks;
import com.aspose.slides.internal.p088dn.C3205up;
import com.aspose.slides.internal.p463vm.C11683c5;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.he */
/* JADX INFO: loaded from: classes5.dex */
public final class C14064he {
    /* JADX INFO: renamed from: du */
    public static boolean m66703du(float f) {
        return f == Float.POSITIVE_INFINITY;
    }

    /* JADX INFO: renamed from: h4 */
    public static String m66704h4(float f) {
        return C3205up.m13813k4("G", f, (InterfaceC14073kp) C11683c5.m55034jd());
    }

    /* JADX INFO: renamed from: k4 */
    public static float m66705k4(String str) {
        return C3200ks.m13778k4(str);
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m66715kk(float f) {
        return Double.isNaN(f);
    }

    /* JADX INFO: renamed from: to */
    public static boolean m66716to(float f) {
        return f == Float.NEGATIVE_INFINITY;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m66717x1(float f) {
        return f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY;
    }

    /* JADX INFO: renamed from: k4 */
    public static float m66706k4(String str, int i, InterfaceC14073kp interfaceC14073kp) {
        return C3200ks.m13779k4(str, i, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m66718x1(float f, float f2) {
        if (f2 != f) {
            return m66715kk(f2) && m66715kk(f);
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static float m66707k4(String str, InterfaceC14073kp interfaceC14073kp) {
        return C3200ks.m13780k4(str, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m66708k4(float f) {
        return new Float(f).hashCode();
    }

    /* JADX INFO: renamed from: k4 */
    public static int m66709k4(float f, float f2) {
        if (m66703du(f) && m66703du(f2)) {
            return 0;
        }
        if (m66716to(f) && m66716to(f2)) {
            return 0;
        }
        if (m66715kk(f2)) {
            return m66715kk(f) ? 0 : 1;
        }
        if (m66715kk(f) && !m66715kk(f2)) {
            return -1;
        }
        if (f > f2) {
            return 1;
        }
        return f < f2 ? -1 : 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m66710k4(float f, Object obj) {
        if (obj == null) {
            return 1;
        }
        if (obj.getClass() != Float.class) {
            throw new ArgumentException("Value is not a System.Single");
        }
        float fM66861ck = C14080ne.m66861ck(obj);
        if (m66703du(f) && m66703du(fM66861ck)) {
            return 0;
        }
        if (m66716to(f) && m66716to(fM66861ck)) {
            return 0;
        }
        if (m66715kk(fM66861ck)) {
            return !m66715kk(f) ? 1 : 0;
        }
        if (m66715kk(f) && !m66715kk(fM66861ck)) {
            return -1;
        }
        if (f > fM66861ck) {
            return 1;
        }
        return f < fM66861ck ? -1 : 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66711k4(float f, InterfaceC14073kp interfaceC14073kp) {
        return C3205up.m13813k4((String) null, f, (InterfaceC14073kp) C11683c5.m55035k4(interfaceC14073kp));
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66712k4(float f, String str, InterfaceC14073kp interfaceC14073kp) {
        return C3205up.m13813k4(str, f, (InterfaceC14073kp) C11683c5.m55035k4(interfaceC14073kp));
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66713k4(String str, int i, InterfaceC14073kp interfaceC14073kp, float[] fArr) {
        try {
            fArr[0] = m66706k4(str, i, interfaceC14073kp);
            return true;
        } catch (Exception unused) {
            fArr[0] = 0.0f;
            return false;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66714k4(String str, float[] fArr) {
        return m66713k4(str, 231, C11683c5.m55034jd(), fArr);
    }
}
