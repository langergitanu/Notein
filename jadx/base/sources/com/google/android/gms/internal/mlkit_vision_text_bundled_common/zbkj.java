package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import androidx.appcompat.widget.C21532OooOOo;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes7.dex */
public final class zbkj {
    public static int zba(int i, int i2, String str) {
        String strZba;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strZba = zbkp.zba("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i2, "negative size: "));
            }
            strZba = zbkp.zba("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(strZba);
    }

    public static int zbb(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(zbe(i, i2, FirebaseAnalytics.Param.INDEX));
        }
        return i;
    }

    public static void zbc(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void zbd(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? zbe(i, i3, "start index") : (i2 < 0 || i2 > i3) ? zbe(i2, i3, "end index") : zbkp.zba("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    private static String zbe(int i, int i2, String str) {
        if (i < 0) {
            return zbkp.zba("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zbkp.zba("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i2, "negative size: "));
    }
}
