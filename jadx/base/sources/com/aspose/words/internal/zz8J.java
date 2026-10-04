package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz8J implements zzGD, zzGF {
    private zzG zzp0;
    private zzG zzp1;
    private zzG zzp2;
    private zzG4 zzp3;
    private zzGE zzp4;
    private zzZQ4 zzp5;

    public zz8J(zzZQ4 zzzq4, zzGE zzge, zzG4 zzg4) {
        this.zzp5 = zzzq4;
        this.zzp4 = zzge;
        zzge.zzZ(this);
        this.zzp3 = zzg4;
        zzg4.zzY(this);
        this.zzp2 = new zzG();
    }

    private void zzym() throws Exception {
        zzyn();
        if (this.zzp0 == null) {
            zzG zzg = new zzG();
            this.zzp0 = zzg;
            zzg.zzW(this.zzp3.zzMq().zzOh());
            this.zzp1.zzX((zzZL) this.zzp0);
        }
    }

    private void zzyn() throws Exception {
        if (this.zzp1 == null) {
            zzG zzg = new zzG();
            this.zzp1 = zzg;
            zzg.zzZ(this.zzp4.zzFx());
            this.zzp2.zzX((zzZL) this.zzp1);
            this.zzp0 = null;
        }
    }

    private boolean zzyo() throws Exception {
        return this.zzp4.zzFw();
    }

    @Override // com.aspose.words.internal.zzGD
    public final void zzFu() {
        this.zzp0 = null;
    }

    @Override // com.aspose.words.internal.zzGD
    public final void zzFv() {
        this.zzp1 = null;
    }

    public final void zzK(zzZL zzzl) {
        if (zzzl == null) {
            return;
        }
        this.zzp1 = null;
        this.zzp2.zzX(zzzl);
    }

    @Override // com.aspose.words.internal.zzGF
    public final void zzM(zzZL zzzl) throws Exception {
        if (zzzl == null || zzyo()) {
            return;
        }
        this.zzp0 = null;
        zzyn();
        this.zzp1.zzX(zzzl);
    }

    @Override // com.aspose.words.internal.zzGF
    public final void zzMM() {
        zzy(zzPV.zzI0);
    }

    public final zzG zzMN() {
        return this.zzp2;
    }

    @Override // com.aspose.words.internal.zzGF
    public final void zzN(zzZL zzzl) throws Exception {
        if (zzzl == null || zzyo()) {
            return;
        }
        zzym();
        this.zzp0.zzX(zzzl);
    }

    public final void zzy(zzPV zzpv) {
        this.zzp2 = new zzG();
        if (!zzPV.zzZ(zzpv, zzPV.zzI0)) {
            zzZG zzzgZzW = zzZG.zzW(this.zzp5);
            zzzgZzW.zzY(new zzOI(zzpv));
            this.zzp2.zzX(zzzgZzW);
        }
        this.zzp1 = null;
    }
}
