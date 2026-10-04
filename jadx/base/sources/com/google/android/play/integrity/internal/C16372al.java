package com.google.android.play.integrity.internal;

import androidx.appcompat.widget.C21532OooOOo;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.al */
/* JADX INFO: loaded from: classes7.dex */
public final class C16372al {
    /* JADX INFO: renamed from: a */
    public static int m75021a(int i, int i2, String str) {
        String strM75025a;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strM75025a = C16373am.m75025a("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i2, "negative size: "));
            }
            strM75025a = C16373am.m75025a("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(strM75025a);
    }

    /* JADX INFO: renamed from: b */
    public static int m75022b(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m75024d(i, i2, FirebaseAnalytics.Param.INDEX));
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public static void m75023c(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? m75024d(i, i3, "start index") : (i2 < 0 || i2 > i3) ? m75024d(i2, i3, "end index") : C16373am.m75025a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: d */
    private static String m75024d(int i, int i2, String str) {
        if (i < 0) {
            return C16373am.m75025a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C16373am.m75025a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i2, "negative size: "));
    }
}
