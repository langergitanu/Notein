package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzME extends zzMO {
    private zz8O zzDy;
    private int zzDz;
    private int zzVL;

    public final int getWidth() {
        return this.zzVL;
    }

    public final zz8O zzJF() {
        return this.zzDy;
    }

    public final int zzJG() {
        return this.zzDz;
    }

    @Override // com.aspose.words.internal.zzMO
    public final void zzK0() throws Exception {
        zzJJ().zzMY();
        zzJJ().zzXc();
        this.zzDz = zzJJ().zzXc();
        this.zzVL = zzJJ().zzXc();
        zzJJ().zzXc();
        zz8O zz8o = new zz8O();
        this.zzDy = zz8o;
        zz8o.zzT(zzJJ());
    }
}
