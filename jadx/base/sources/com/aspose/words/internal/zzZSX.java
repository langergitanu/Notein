package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZSX extends zzZ5 {
    private zzZSZ zz6k;
    private zzA2 zzj0;
    private zzZ9 zzz9 = new zzZ9();

    public zzZSX(zzZOP zzzop, zzZSY zzzsy) throws Exception {
        this.zz6k = new zzZSZ(zzzop, zzzsy);
        this.zzj0 = new zzA2(zzzsy.zzwy());
        zzZ(this.zzz9);
    }

    public final void endDocument() throws Exception {
        this.zz6k.zzmA();
    }

    public final void zzO(zzZL zzzl) throws Exception {
        zzzl.zzZ(zzYJ());
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(zzZH zzzh) {
        this.zz6k.zzG3();
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZH zzzh) throws Exception {
        this.zz6k.zzM(zzzh.getWidth(), zzzh.getHeight());
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(zzG zzg) {
        this.zz6k.zzmy().zzm5();
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzG zzg) throws Exception {
        this.zz6k.zzmy().zzO(zzg);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZU zzzu) throws Exception {
        if (zzzu.isHidden()) {
            return;
        }
        this.zz6k.zzmy().zzH(zzzu);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZG zzzg) throws Exception {
        this.zz6k.zzmy().zzS(zzzg);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZP zzzp) throws Exception {
        zzZP zzzpZzZ = zzZO.zzZ(zzzp, zzYJ(), this.zzj0, this.zzz9.zzYP());
        if (zzzpZzZ != null) {
            this.zz6k.zzmy().zzX(zzzpZzZ);
        }
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzI zzi) throws Exception {
        this.zz6k.zzW(zzi);
    }
}
