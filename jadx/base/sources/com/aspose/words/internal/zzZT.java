package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZT {
    public static boolean zzU(zzHU zzhu) {
        return zzV(zzhu.zzZN());
    }

    public static boolean zzV(zzHU zzhu) {
        return (zzhu.zzZO() == null || zzhu.zzZO().isIdentity()) ? false : true;
    }

    public static boolean zzW(zzHU zzhu) {
        return zzV(zzhu) || zzU(zzhu);
    }

    public static boolean zzV(zzP8 zzp8) {
        return (zzp8 == null || zzp8.zzO7().size() == 0) ? false : true;
    }
}
