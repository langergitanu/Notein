package com.aspose.words.internal;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
final class zzYQ2 {
    private static final Set<String> zzWms;

    static {
        HashSet hashSet = new HashSet();
        zzWms = hashSet;
        hashSet.add("DES");
        hashSet.add("DESEDE");
        hashSet.add(zzZ9K.zzWz0.getId());
        hashSet.add(zzZ96.zzWya.getId());
        hashSet.add(zzZ96.zzWwu.getId());
    }

    public static void zzW0(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            bArr[i] = (byte) (((((b >> 7) ^ ((((((b >> 1) ^ (b >> 2)) ^ (b >> 3)) ^ (b >> 4)) ^ (b >> 5)) ^ (b >> 6))) ^ 1) & 1) | (b & 254));
        }
    }

    public static boolean zzws(String str) {
        return zzWms.contains(zzYGI.toUpperCase(str));
    }
}
