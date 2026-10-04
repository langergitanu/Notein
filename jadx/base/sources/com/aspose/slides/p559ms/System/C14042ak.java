package com.aspose.slides.p559ms.System;

import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.ak */
/* JADX INFO: loaded from: classes5.dex */
public final class C14042ak {
    /* JADX INFO: renamed from: k4 */
    public static int m66408k4(byte b) {
        return C14045bs.m66442k4(b);
    }

    /* JADX INFO: renamed from: x1 */
    public static int m66413x1(byte b) {
        return C14098up.m67317k4(b);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m66409k4(int i) {
        return C14057f9.m66579k4(i);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66410k4(Class<?> cls, long j) {
        return AbstractC14106wy.toString(cls, j);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66411k4(Class<?> cls, long j, String str) {
        if (str == null || str.length() == 0) {
            str = "G";
        }
        if (C14113y2.m67360du(str, "G", (short) 5) == 0) {
            return m66410k4(cls, j);
        }
        if (C14113y2.m67360du(str, "D", (short) 5) == 0) {
            return C14091t6.m67191x1(j);
        }
        if (C14113y2.m67360du(str, "X", (short) 5) == 0) {
            return C14091t6.m67187k4(j, str);
        }
        if (C14113y2.m67360du(str, "F", (short) 5) == 0) {
            return m66410k4(cls, j);
        }
        throw new FormatException("Invalid Enum Format Specification");
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66412k4(Class<?> cls, long j, Class<?> cls2, long j2) {
        return cls != null && cls2 != null && cls.equals(cls2) && C7019kk.m27443k4(cls).m66763yd() && j == j2;
    }
}
