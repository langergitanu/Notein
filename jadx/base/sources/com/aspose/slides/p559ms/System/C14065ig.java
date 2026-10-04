package com.aspose.slides.p559ms.System;

import androidx.core.location.LocationRequestCompat;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.internal.p088dn.C3202ne;
import com.aspose.slides.internal.p088dn.C3205up;
import com.aspose.slides.internal.p463vm.C11683c5;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.ig */
/* JADX INFO: loaded from: classes5.dex */
public final class C14065ig {
    /* JADX INFO: renamed from: k4 */
    public static int m66719k4(long j, long j2) {
        return m66724k4(j).compareTo(m66724k4(j2));
    }

    /* JADX INFO: renamed from: k4 */
    public static int m66720k4(long j, Object obj) {
        if (obj == null) {
            return 1;
        }
        if (obj.getClass() == Long.class) {
            return m66719k4(j, C14080ne.m66930jd(obj));
        }
        throw new ArgumentException("Object must be of type Int64");
    }

    /* JADX INFO: renamed from: k4 */
    public static long m66721k4(String str, int i, InterfaceC14073kp interfaceC14073kp) {
        return C3202ne.m13782k4(str, i, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66722k4(long j, String str) {
        return C3205up.m13857x1(str, j, C11683c5.m55034jd());
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66723k4(long j, String str, InterfaceC14073kp interfaceC14073kp) {
        return C3205up.m13857x1(str, j, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: k4 */
    public static BigInteger m66724k4(long j) {
        return j >= 0 ? BigInteger.valueOf(j) : BigInteger.valueOf(LocationRequestCompat.PASSIVE_INTERVAL).add(BigInteger.ONE).add(BigInteger.valueOf(Long.MIN_VALUE - j).abs());
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66725k4(String str, int i, InterfaceC14073kp interfaceC14073kp, long[] jArr) {
        try {
            jArr[0] = m66721k4(str, i, interfaceC14073kp);
            return true;
        } catch (Exception | OverflowException unused) {
            return false;
        }
    }
}
