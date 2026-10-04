package com.aspose.slides.p559ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p088dn.C3195fa;
import com.aspose.slides.internal.p088dn.C3205up;
import com.aspose.slides.internal.p463vm.C11683c5;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.t6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14091t6 {
    /* JADX INFO: renamed from: k4 */
    public static int m67182k4(long j) {
        return ((int) (j >> 32)) ^ ((int) j);
    }

    /* JADX INFO: renamed from: x1 */
    public static String m67191x1(long j) {
        return C3205up.m13840kk(null, j, C11683c5.m55034jd());
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67183k4(long j, Object obj) {
        if (obj == null) {
            return 1;
        }
        if (obj.getClass() != Long.class) {
            throw new ArgumentException("Object must be of type Int64");
        }
        long jM66847c5 = C14080ne.m66847c5(obj);
        if (j < jM66847c5) {
            return -1;
        }
        return j > jM66847c5 ? 1 : 0;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m67192x1(long j, Object obj) {
        return obj != null && obj.getClass() == Long.class && C14080ne.m66847c5(obj) == j;
    }

    /* JADX INFO: renamed from: k4 */
    public static long m67184k4(String str, int i) {
        return C3195fa.m13767k4(str, i);
    }

    /* JADX INFO: renamed from: k4 */
    public static long m67185k4(String str, int i, InterfaceC14073kp interfaceC14073kp) {
        return C3195fa.m13768k4(str, i, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67186k4(long j, InterfaceC14073kp interfaceC14073kp) {
        return C3205up.m13840kk(null, j, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67187k4(long j, String str) {
        return C3205up.m13840kk(str, j, C11683c5.m55034jd());
    }

    /* JADX INFO: renamed from: k4 */
    public static String m67188k4(long j, String str, InterfaceC14073kp interfaceC14073kp) {
        return C3205up.m13840kk(str, j, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m67189k4(String str, int i, InterfaceC14073kp interfaceC14073kp, long[] jArr) {
        try {
            jArr[0] = m67185k4(str, i, interfaceC14073kp);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m67190k4(String str, long[] jArr) {
        return m67189k4(str, 7, C11683c5.m55034jd(), jArr);
    }
}
