package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz7L {
    public static boolean zzN(byte b) {
        if (zzP(b)) {
            return zzO(b);
        }
        return false;
    }

    private static boolean zzO(byte b) {
        if (zzP(b)) {
            return b == 1;
        }
        throw new IllegalStateException();
    }

    private static boolean zzP(byte b) {
        return b != -1;
    }
}
