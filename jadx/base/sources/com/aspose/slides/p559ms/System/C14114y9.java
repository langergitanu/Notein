package com.aspose.slides.p559ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.internal.p088dn.C3205up;
import com.aspose.slides.internal.p088dn.C3207x6;
import com.aspose.slides.internal.p463vm.C11683c5;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.y9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14114y9 {
    /* JADX INFO: renamed from: k4 */
    public static int m67453k4(long j) {
        m67464kk(j);
        return new Long(j).intValue();
    }

    /* JADX INFO: renamed from: kk */
    private static void m67464kk(long j) {
        if (j > 4294967295L || j < 0) {
            throw new OverflowException();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static String m67465x1(long j) {
        return C3205up.m13815k4((String) null, j, (InterfaceC14073kp) C11683c5.m55034jd());
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67454k4(long j, long j2) {
        m67464kk(j);
        m67464kk(j2);
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67455k4(long j, Object obj) {
        m67464kk(j);
        if (obj == null) {
            return 1;
        }
        if (obj.getClass() != Long.class && obj.getClass() != Integer.class) {
            throw new ArgumentException("Object must be of type UInt32");
        }
        long jM66889dy = C14080ne.m66889dy(obj);
        if (j < jM66889dy) {
            return -1;
        }
        return j > jM66889dy ? 1 : 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static long m67456k4(String str) {
        return C3207x6.m13897k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public static long m67457k4(String str, int i) {
        return C3207x6.m13898k4(str, i);
    }

    /* JADX INFO: renamed from: k4 */
    public static long m67458k4(String str, int i, InterfaceC14073kp interfaceC14073kp) {
        return C3207x6.m13899k4(str, i, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67459k4(long j, InterfaceC14073kp interfaceC14073kp) {
        return C3205up.m13815k4((String) null, j, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67460k4(long j, String str) {
        return C3205up.m13815k4(str, j, (InterfaceC14073kp) C11683c5.m55034jd());
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67461k4(long j, String str, InterfaceC14073kp interfaceC14073kp) {
        return C3205up.m13815k4(str, j, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m67462k4(String str, int i, InterfaceC14073kp interfaceC14073kp, long[] jArr) {
        try {
            jArr[0] = m67458k4(str, i, interfaceC14073kp);
            return true;
        } catch (Exception | OverflowException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m67463k4(String str, long[] jArr) {
        return m67462k4(str, 7, C11683c5.m55034jd(), jArr);
    }
}
