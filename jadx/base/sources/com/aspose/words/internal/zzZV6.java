package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZV6 extends zzZ5 {
    private zzZVB zz70;
    private zzZVD zz71;
    private zzA2 zzj0;
    private zzZ9 zzz9;

    public zzZV6(zzZVD zzzvd, zzZVB zzzvb) {
        this.zz71 = zzzvd;
        this.zz70 = zzzvb;
        this.zzj0 = new zzA2(zzzvd.zznh().zzwy());
        zzZ9 zzz9 = new zzZ9();
        this.zzz9 = zzz9;
        zzZ(zzz9);
    }

    public final void endDocument() throws Exception {
        this.zz70.endDocument();
    }

    public final void startDocument() throws Exception {
        this.zz70.startDocument();
    }

    public void zzFY() {
    }

    public final void zzO(zzZL zzzl) throws Exception {
        zzFY();
        zzzl.zzZ(zzYJ());
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(zzZH zzzh) throws Exception {
        this.zz70.zzG3();
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZU zzzu) throws Exception {
        if (zzzu.isHidden()) {
            return;
        }
        this.zz70.zznc().zzQ(zzzu);
    }

    public final zzZ9 zzn2() {
        return this.zzz9;
    }

    public final zzZVB zzn3() {
        return this.zz70;
    }

    public final zzZVD zzn4() {
        return this.zz71;
    }

    public final zzA2 zzv2() {
        return this.zzj0;
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(zzG zzg) throws Exception {
        this.zz70.zznc().zzN(zzg);
    }

    @Override // com.aspose.words.internal.zz6
    public void zzZ(zzZP zzzp) throws Exception {
        zzZP zzzpZzZ = zzZO.zzZ(zzzp, zzYJ(), this.zzj0, this.zzz9.zzYP());
        if (zzzpZzZ != null) {
            this.zz70.zznc().zzX(zzzpZzZ);
        }
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZH zzzh) throws Exception {
        this.zz70.zzX(zzzh);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzG zzg) throws Exception {
        this.zz70.zznc().zzO(zzg);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZG zzzg) throws Exception {
        this.zz70.zznc().zzS(zzzg);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzI zzi) throws Exception {
        this.zz70.zznc().zzY(zzi);
    }
}
