package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzWP {
    public static zzWP zzW(zzWK zzwk, int i) throws Exception {
        short sZzUU = zzwk.zzUU();
        if (sZzUU == 0) {
            return zzWO.zzV(zzwk, i);
        }
        if (sZzUU == 3) {
            return zzWN.zzU(zzwk, i);
        }
        throw new IllegalStateException("Unknown CFF FDSelect format.");
    }

    public abstract int getSize();

    public abstract void zzZ(zzWJ zzwj) throws Exception;

    public abstract int zzZt(int i);
}
