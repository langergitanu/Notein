package com.aspose.words.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYXY {
    private static final Map<zzZ1P, zzYUV> zzW72 = new HashMap();

    public static <T> zzYUV<T> zzS(zzZ1P zzz1p) {
        return zzW72.get(zzz1p);
    }

    public static void zzZ(zzZ1P zzz1p, zzZ1E zzz1e) {
        if (zzz1p == null || zzz1e == null) {
            throw new IllegalArgumentException("Arguments cannot be null");
        }
        zzW72.put(zzz1p, zzz1e);
    }
}
