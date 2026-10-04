package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZS2 extends zzZ5 {
    private zzZSC zz5x;
    private zz79 zz5y;
    private zzA2 zzj0;
    private zzZ9 zzz9 = new zzZ9();

    public zzZS2(zzQR zzqr, zzZS7 zzzs7) throws Exception {
        zz79 zz79Var = new zz79();
        this.zz5y = zz79Var;
        zzZSC zzzsc = new zzZSC(zz79Var, zzzs7);
        this.zz5x = zzzsc;
        zzzsc.zzZ(zzqr);
        this.zzj0 = new zzA2(zzzs7.zzwy());
        zzZ(this.zzz9);
    }

    public final void endDocument() throws Exception {
        this.zz5x.zzmA();
    }

    public final void zzO(zzZL zzzl) throws Exception {
        zzzl.zzZ(zzYJ());
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(zzZH zzzh) {
        this.zz5x.zzG3();
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZH zzzh) throws Exception {
        this.zz5x.zzM(zzzh.getWidth(), zzzh.getHeight());
        this.zz5x.zzYS(zzzh.getSize());
    }

    public final zz79 zzm1() {
        return this.zz5y;
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(zzG zzg) {
        this.zz5x.zzmy().zzm5();
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzG zzg) throws Exception {
        this.zz5x.zzmy().zzO(zzg);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZU zzzu) throws Exception {
        if (zzzu.isHidden()) {
            return;
        }
        this.zz5x.zzmy().zzH(zzzu);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZG zzzg) throws Exception {
        this.zz5x.zzmy().zzS(zzzg);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZP zzzp) throws Exception {
        zzZP zzzpZzZ = zzZO.zzZ(zzzp, zzYJ(), this.zzj0, this.zzz9.zzYP());
        if (zzzpZzZ != null) {
            this.zz5x.zzmy().zzX(zzzpZzZ);
        }
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzI zzi) throws Exception {
        this.zz5x.zzW(zzi);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZI zzzi) throws Exception {
        this.zz5x.zzX(zzzi);
    }
}
