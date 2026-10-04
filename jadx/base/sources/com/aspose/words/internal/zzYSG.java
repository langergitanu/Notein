package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYSG implements zzYV3 {
    private zzYSD zzVXT;
    private zzYSD zzVXU;

    public zzYSG(zzYSD zzysd, zzYSD zzysd2) {
        this.zzVXT = zzysd;
        this.zzVXU = zzysd2;
        if (!zzysd.zzWjg.equals(zzysd2.zzWjg)) {
            throw new zzZ5E("Static and ephemeral keys have different domain parameters");
        }
    }

    public final zzYSD zzXCi() {
        return this.zzVXU;
    }

    public final zzYSD zzXCj() {
        return this.zzVXT;
    }
}
