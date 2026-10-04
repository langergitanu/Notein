package com.aspose.slides.p559ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.internal.p088dn.C3203rv;
import com.aspose.slides.internal.p088dn.C3205up;
import com.aspose.slides.internal.p463vm.C11683c5;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.nv */
/* JADX INFO: loaded from: classes5.dex */
public final class C14081nv {
    /* JADX INFO: renamed from: k4 */
    public static int m67061k4(int i) {
        m67069kk(i);
        return i;
    }

    /* JADX INFO: renamed from: kk */
    private static void m67069kk(int i) {
        if (i > 65535 || i < 0) {
            throw new OverflowException();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static String m67070x1(int i) {
        m67069kk(i);
        return C3205up.m13814k4((String) null, i, (InterfaceC14073kp) C11683c5.m55034jd());
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67062k4(int i, int i2) {
        m67069kk(i);
        m67069kk(i2);
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67063k4(int i, Object obj) {
        m67069kk(i);
        if (obj == null) {
            return 1;
        }
        if (obj.getClass() != Integer.class && obj.getClass() != Short.class) {
            throw new ArgumentException("Object must be of type Int16");
        }
        int iM66917h4 = C14080ne.m66917h4(obj);
        if (i < iM66917h4) {
            return -1;
        }
        return i > iM66917h4 ? 1 : 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67064k4(String str, int i) {
        return C3203rv.m13784k4(str, i);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67065k4(String str, int i, InterfaceC14073kp interfaceC14073kp) {
        return C3203rv.m13785k4(str, i, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67066k4(int i, String str) {
        m67069kk(i);
        return C3205up.m13814k4(str, i, (InterfaceC14073kp) C11683c5.m55034jd());
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67067k4(int i, String str, InterfaceC14073kp interfaceC14073kp) {
        m67069kk(i);
        return C3205up.m13814k4(str, i, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m67068k4(String str, int i, InterfaceC14073kp interfaceC14073kp, int[] iArr) {
        try {
            iArr[0] = m67065k4(str, i, interfaceC14073kp);
            return true;
        } catch (Exception unused) {
            iArr[0] = 0;
            return false;
        }
    }
}
