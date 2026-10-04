package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzQE {
    public static boolean zzYe(int i) {
        return (i & 3) != 0 && zzYf(i);
    }

    private static boolean zzYf(int i) {
        return (i & 4) == 0;
    }

    public static boolean zzYg(int i) {
        return (i & 2) != 0;
    }

    public static boolean zzYh(int i) {
        return (i & 1) != 0;
    }
}
