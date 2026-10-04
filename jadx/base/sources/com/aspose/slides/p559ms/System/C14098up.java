package com.aspose.slides.p559ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p088dn.C3194dy;
import com.aspose.slides.internal.p088dn.C3205up;
import com.aspose.slides.internal.p463vm.C11683c5;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.up */
/* JADX INFO: loaded from: classes5.dex */
public final class C14098up {
    /* JADX INFO: renamed from: k4 */
    public static byte m67315k4(String str, int i, InterfaceC14073kp interfaceC14073kp) {
        return C3194dy.m13765k4(str, i, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: x1 */
    public static String m67323x1(byte b) {
        return C3205up.m13855x1((String) null, b, (InterfaceC14073kp) C11683c5.m55034jd());
    }

    /* JADX INFO: renamed from: k4 */
    public static byte m67316k4(String str, InterfaceC14073kp interfaceC14073kp) {
        return C3194dy.m13766k4(str, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67317k4(byte b) {
        return b & 255;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67318k4(byte b, Object obj) {
        if (obj == null) {
            return 1;
        }
        if (obj.getClass() != Byte.class) {
            throw new ArgumentException("Object must be of type Byte");
        }
        int i = b & 255;
        int iM66979kk = C14080ne.m66979kk(obj) & 255;
        if (i < iM66979kk) {
            return -1;
        }
        return i > iM66979kk ? 1 : 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67319k4(byte b, InterfaceC14073kp interfaceC14073kp) {
        return C3205up.m13855x1((String) null, b, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67320k4(byte b, String str) {
        return C3205up.m13855x1(str, b, (InterfaceC14073kp) C11683c5.m55034jd());
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67321k4(byte b, String str, InterfaceC14073kp interfaceC14073kp) {
        return C3205up.m13855x1(str, b, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m67322k4(String str, int i, InterfaceC14073kp interfaceC14073kp, byte[] bArr) {
        try {
            bArr[0] = m67315k4(str, i, interfaceC14073kp);
            return true;
        } catch (Exception unused) {
            bArr[0] = 0;
            return false;
        }
    }
}
