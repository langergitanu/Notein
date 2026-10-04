package com.aspose.words.internal;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
final class zz7T {
    static Class zzo7 = Date.class;

    private static int zzI(Class cls) {
        if (Date.class.isAssignableFrom(cls)) {
            return 1;
        }
        return Calendar.class.isAssignableFrom(cls) ? 2 : 0;
    }

    public static int zzJ(Class cls) {
        return zzI(cls);
    }

    public static Object zzM(zzZQ9 zzzq9) {
        if (zzzq9 != null) {
            return zzzq9.zzkH();
        }
        return null;
    }

    public static boolean zzUB(int i) {
        return i == 1 || i == 2;
    }

    public static double zzX(Object obj, int i) {
        if (i == 1) {
            return zzZQ9.zzZ((Date) obj).zzkM();
        }
        if (i == 2) {
            return zzZQ9.zzZ((Calendar) obj).zzkM();
        }
        throw new IllegalStateException();
    }
}
