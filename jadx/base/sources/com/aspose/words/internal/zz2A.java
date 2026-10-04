package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz2A extends zz6 {
    private int zzgc;
    private zz4N zzgd;

    public zz2A(zzZOP zzzop, zz2R zz2r) throws Exception {
        this(new zz4N(zzzop, zz2r));
    }

    public final void endDocument() throws Exception {
        this.zzgd.endDocument();
    }

    public final void zzU(zzZH zzzh) throws Exception {
        if (zzZM.zzT(zzzh) > 28) {
            zzzh = (zzZH) zzF.zzZ(zzzh);
        }
        zzzh.zzZ(this);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(zzZH zzzh) throws Exception {
        int iZzvg = this.zzgd.zzuM().zzto().zzvg();
        if (iZzvg > this.zzgc) {
            this.zzgc = iZzvg;
        }
        this.zzgd.zzG3();
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZH zzzh) throws Exception {
        this.zzgd.zzZ5(zzzh.getSize());
    }

    public final zz4N zzti() {
        return this.zzgd;
    }

    private zz2A(zz4N zz4n) {
        this.zzgc = 0;
        zz4n.zzZ(new zzA2(zz4n.zzuN().zzvc().zzwy(), true, zz4n.zzuN().zzv7().zzvx() ? 32767.0f : 1000000.0f));
        this.zzgd = zz4n;
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzG zzg) throws Exception {
        this.zzgd.zzuM().zzto().zzZ(zzg);
    }

    @Override // com.aspose.words.internal.zz6
    public final boolean zzZ(zzZS zzzs) throws Exception {
        return this.zzgd.zzuM().zzY(zzzs);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZU zzzu) throws Exception {
        if (zzzu.isHidden()) {
            return;
        }
        this.zzgd.zzuM().zzto().zzZ(zzzu);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(zzG zzg) throws Exception {
        this.zzgd.zzuM().zzto().zzY(zzg);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(zzZN zzzn) throws Exception {
        this.zzgd.zzuM().zzW(zzzn);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZG zzzg) throws Exception {
        this.zzgd.zzuM().zzto().zzZ(zzzg);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(zzJ zzj) throws Exception {
        this.zzgd.zzuM().zzW(zzj);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZP zzzp) throws Exception {
        this.zzgd.zzuM().zzto().zzZ(zzzp);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzI zzi) {
        this.zzgd.zzuM().zzX(zzi);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZI zzzi) {
        this.zzgd.zzuM().zzY(zzzi);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZB zzzb) throws Exception {
        this.zzgd.zzvU().zzZ(zzzb, this.zzgd.zzuM());
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZC zzzc) throws Exception {
        this.zzgd.zzvU().zzZ(zzzc, this.zzgd.zzuM());
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zz9 zz9Var) throws Exception {
        this.zzgd.zzvU().zzZ(zz9Var, this.zzgd.zzuM());
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzC zzc) throws Exception {
        this.zzgd.zzvU().zzZ(zzc, this.zzgd.zzuM());
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZN zzzn) throws Exception {
        this.zzgd.zzuM().zzX(zzzn);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzJ zzj) throws Exception {
        this.zzgd.zzuM().zzX(zzj);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzN zzn) throws Exception {
        this.zzgd.zzuM().zzto().zzZ(zzn);
    }
}
