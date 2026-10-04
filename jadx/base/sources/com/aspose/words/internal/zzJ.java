package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzJ extends zz7 {
    private int zzZO;
    private int zzZP;
    private zzBI zzZQ;

    public zzJ(int i, zzBI zzbi, int i2) {
        this.zzZP = i;
        this.zzZQ = zzbi;
        this.zzZO = i2;
    }

    @Override // com.aspose.words.internal.zz7, com.aspose.words.internal.zzZL
    public final void zzZ(zz6 zz6Var) throws Exception {
        zz6Var.zzZ(this);
        super.zzZ(zz6Var);
        zz6Var.zzY(this);
    }

    public final int zzZU() {
        return this.zzZO;
    }

    public final zzBI zzZV() {
        return this.zzZQ;
    }

    public final int zzZW() {
        return this.zzZP;
    }

    public final void zzZ(zzBI zzbi) {
        this.zzZQ = zzbi;
    }
}
