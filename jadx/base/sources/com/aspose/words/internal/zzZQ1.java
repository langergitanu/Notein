package com.aspose.words.internal;

import android.graphics.Color;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZQ1 {
    public static final int zz2p = Color.argb(0, 0, 0, 0);

    public static int fromName(String str) {
        return zzZQ6.zzVR(str).value();
    }

    public static int zz0(int i) {
        return Color.red(i);
    }

    public static int zzRh(int i) {
        return Color.argb(Color.alpha(i), Color.red(i), Color.green(i), Color.blue(i));
    }

    private static int zzRi(int i) {
        return Color.rgb(Color.red(i), Color.green(i), Color.blue(i));
    }

    public static int zzRj(int i) {
        return i;
    }

    public static boolean zzRk(int i) {
        return i == 0;
    }

    public static int zzZX(int i) {
        return Color.alpha(i);
    }

    public static int zzZY(int i) {
        return Color.blue(i);
    }

    public static int zzZZ(int i) {
        return Color.green(i);
    }

    public static int zzkq() {
        return zzRi(zzZQ6.Silver.value());
    }
}
