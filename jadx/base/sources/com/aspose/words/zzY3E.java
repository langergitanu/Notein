package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzY3E {
    public static zzY3E zzzZ(String str) {
        zzYTT zzyttZzGK = zzYTS.zzGK(str);
        return zzyttZzGK != null ? zzyttZzGK : new zzY3W(str);
    }

    public abstract boolean zzZ(zzY3E zzy3e, int i);
}
