package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYSL implements zzYV3 {
    private zzYSD zzVXU;
    private zzYSE zzVXV;
    private zzYSE zzVXW;

    public zzYSL(zzYSE zzyse, zzYSE zzyse2) {
        this(zzyse, zzyse2, new zzYSD(zzyse2.zzWjg.zzXHu().zzK(zzyse2.zzWlo), zzyse2.zzWjg));
    }

    public final zzYSE zzXCk() {
        return this.zzVXV;
    }

    public final zzYSE zzXCl() {
        return this.zzVXW;
    }

    private zzYSL(zzYSE zzyse, zzYSE zzyse2, zzYSD zzysd) {
        this.zzVXW = zzyse;
        this.zzVXV = zzyse2;
        this.zzVXU = zzysd;
        if (!zzyse.zzWjg.equals(zzyse2.zzWjg) || !zzyse.zzWjg.equals(zzysd.zzWjg)) {
            throw new zzZ5E("Static and ephemeral keys have different domain parameters");
        }
    }
}
