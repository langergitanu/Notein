package com.aspose.slides.p559ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.internal.p463vm.C11697x1;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.ck */
/* JADX INFO: loaded from: classes5.dex */
public final class C14051ck {
    /* JADX INFO: renamed from: k4 */
    public static int m66552k4(boolean z) {
        return z ? 1 : 0;
    }

    /* JADX INFO: renamed from: x1 */
    public static String m66557x1(boolean z) {
        return !z ? "False" : "True";
    }

    /* JADX INFO: renamed from: k4 */
    public static int m66553k4(boolean z, Object obj) {
        if (obj == null) {
            return 1;
        }
        if (obj.getClass() != Boolean.class) {
            throw new ArgumentException("Object is not a Boolean.");
        }
        boolean zM66965k4 = C14080ne.m66965k4(obj);
        if (!z || zM66965k4) {
            return z == zM66965k4 ? 0 : -1;
        }
        return 1;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m66558x1(boolean z, boolean z2) {
        return z == z2;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m66554k4(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        return !z ? -1 : 1;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66555k4(String str) {
        if (str == null) {
            throw new ArgumentNullException("value");
        }
        String strM67440x1 = C14113y2.m67440x1(str);
        if (C14113y2.m67383k4(strM67440x1, "True", true, C11697x1.m55250kk()) == 0) {
            return true;
        }
        if (C14113y2.m67383k4(strM67440x1, "False", true, C11697x1.m55250kk()) == 0) {
            return false;
        }
        throw new FormatException("Value is not equivalent to either TrueString or FalseString.");
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66556k4(String str, boolean[] zArr) {
        zArr[0] = false;
        if (str == null) {
            return false;
        }
        try {
            zArr[0] = m66555k4(C14113y2.m67440x1(str));
            return true;
        } catch (FormatException unused) {
            return false;
        }
    }
}
