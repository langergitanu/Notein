package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYI2 {
    private boolean zzXwD;
    private zzYFT zzXwE;

    public zzYI2(zzYFT zzyft) {
        this.zzXwD = false;
        this.zzXwE = zzyft;
        if (zzyft.zzYgi() != null) {
            this.zzXwD = zzyft.zzYgi().zzZrB();
        }
    }

    public abstract boolean zzV(zzYET zzyet) throws Exception;

    public abstract boolean zzW(zzYET zzyet) throws Exception;

    public final boolean zzX(zzYET zzyet) throws Exception {
        if (zzW(zzyet)) {
            return true;
        }
        if (this.zzXwD) {
            return false;
        }
        return zzV(zzyet);
    }

    public final zzYFT zzYja() {
        return this.zzXwE;
    }

    public final boolean zzZrB() {
        return this.zzXwD;
    }
}
