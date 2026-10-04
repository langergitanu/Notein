package com.aspose.slides.p559ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p088dn.C3197jd;
import com.aspose.slides.internal.p088dn.C3205up;
import com.aspose.slides.internal.p463vm.C11683c5;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.s7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14088s7 {
    /* JADX INFO: renamed from: k4 */
    public static int m67172k4(short s) {
        return (s << 16) | (65535 & s);
    }

    /* JADX INFO: renamed from: x1 */
    public static String m67180x1(short s) {
        return C3205up.m13819k4((String) null, s, (InterfaceC14073kp) C11683c5.m55034jd());
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67173k4(short s, Object obj) {
        if (obj == null) {
            return 1;
        }
        if (obj.getClass() != Short.class) {
            throw new ArgumentException("Object must be of type Int16");
        }
        short sM66876du = C14080ne.m66876du(obj);
        if (s < sM66876du) {
            return -1;
        }
        return s > sM66876du ? 1 : 0;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m67181x1(short s, short s2) {
        return s == s2;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67174k4(short s, short s2) {
        if (s < s2) {
            return -1;
        }
        return s > s2 ? 1 : 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67175k4(short s, InterfaceC14073kp interfaceC14073kp) {
        return C3205up.m13819k4((String) null, s, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67176k4(short s, String str, InterfaceC14073kp interfaceC14073kp) {
        return C3205up.m13819k4(str, s, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: k4 */
    public static short m67177k4(String str, int i, InterfaceC14073kp interfaceC14073kp) {
        return C3197jd.m13770k4(str, i, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m67178k4(String str, int i, InterfaceC14073kp interfaceC14073kp, short[] sArr) {
        try {
            sArr[0] = m67177k4(str, i, interfaceC14073kp);
            return true;
        } catch (Exception unused) {
            sArr[0] = 0;
            return false;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m67179k4(String str, short[] sArr) {
        return m67178k4(str, 7, C11683c5.m55034jd(), sArr);
    }
}
