package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzY1 {
    public static String zzS(String str, String str2) {
        return str != null ? str : (String) zzU(str2);
    }

    private static Object zzU(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw zzXe();
    }

    private static IllegalStateException zzXe() {
        return new IllegalStateException("A value for the specified key is missing and the default value is not provided.");
    }

    private static int zzo(int i) {
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        throw zzXe();
    }

    public static int zzS(int i, int i2) {
        return i != Integer.MIN_VALUE ? i : zzo(i2);
    }
}
