package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzA0 {
    private zzA1 zzEg;
    private boolean zzFH;
    private boolean zzr2;
    private zzG zzvd;

    public zzA0(zzA1 zza1, boolean z) {
        this.zzEg = zza1;
        this.zzr2 = z;
    }

    public final void play() throws Exception {
        try {
            this.zzvd = zzAb();
        } catch (Exception e) {
            this.zzEg.zzI().zzZ(2, 3, "Metafile cannot be processed: {0}", e.getMessage());
            this.zzFH = true;
            this.zzvd = null;
        }
    }

    public final zz8T zzA8() {
        return this.zzEg.zzAg();
    }

    public final boolean zzA9() {
        return this.zzr2;
    }

    public zzG zzAa() {
        return this.zzvd;
    }

    public abstract zzG zzAb() throws Exception;

    public final zzF4 zzI() {
        return this.zzEg.zzI();
    }

    public final zzA1 zzKp() {
        return this.zzEg;
    }

    public final boolean zzML() {
        return this.zzFH;
    }

    public final void zzZR(boolean z) {
        this.zzFH = z;
    }
}
