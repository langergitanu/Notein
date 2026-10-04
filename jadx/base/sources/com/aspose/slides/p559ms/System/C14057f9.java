package com.aspose.slides.p559ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p088dn.C3192ck;
import com.aspose.slides.internal.p088dn.C3205up;
import com.aspose.slides.internal.p463vm.C11683c5;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.f9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14057f9 {
    /* JADX INFO: renamed from: k4 */
    public static int m66579k4(int i) {
        return i;
    }

    /* JADX INFO: renamed from: x1 */
    public static String m66591x1(int i) {
        return C3205up.m13856x1((String) null, i, (InterfaceC14073kp) C11683c5.m55034jd());
    }

    /* JADX INFO: renamed from: k4 */
    public static int m66580k4(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m66592x1(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m66581k4(int i, Object obj) {
        if (obj == null) {
            return 1;
        }
        if (obj.getClass() != Integer.class) {
            throw new ArgumentException("Object must be of type Int32");
        }
        int iM66998m9 = C14080ne.m66998m9(obj);
        if (i < iM66998m9) {
            return -1;
        }
        return i > iM66998m9 ? 1 : 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m66582k4(String str) {
        return C3192ck.m13738k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m66583k4(String str, int i) {
        return C3192ck.m13739k4(str, i);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m66584k4(String str, int i, InterfaceC14073kp interfaceC14073kp) {
        return C3192ck.m13740k4(str, i, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m66585k4(String str, InterfaceC14073kp interfaceC14073kp) {
        return C3192ck.m13741k4(str, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66586k4(int i, InterfaceC14073kp interfaceC14073kp) {
        return C3205up.m13856x1((String) null, i, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66587k4(int i, String str) {
        return C3205up.m13856x1(str, i, (InterfaceC14073kp) C11683c5.m55034jd());
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66588k4(int i, String str, InterfaceC14073kp interfaceC14073kp) {
        return C3205up.m13856x1(str, i, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66589k4(String str, int i, InterfaceC14073kp interfaceC14073kp, int[] iArr) {
        try {
            iArr[0] = m66584k4(str, i, interfaceC14073kp);
            return true;
        } catch (Exception unused) {
            iArr[0] = 0;
            return false;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66590k4(String str, int[] iArr) {
        return m66589k4(str, 7, C11683c5.m55034jd(), iArr);
    }
}
