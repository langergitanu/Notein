package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz1D extends com.aspose.words.internal.zz6 {
    private com.aspose.words.internal.zzZQC<com.aspose.words.internal.zzG> zzYA;
    private float zzYYh;
    private boolean zzZgj;

    private zz1D(float f, boolean z) {
        com.aspose.words.internal.zzZQC<com.aspose.words.internal.zzG> zzzqc = new com.aspose.words.internal.zzZQC<>();
        this.zzYA = zzzqc;
        zzzqc.push(new com.aspose.words.internal.zzG());
        this.zzYYh = f;
        this.zzZgj = false;
    }

    public static com.aspose.words.internal.zzG zzZ(com.aspose.words.internal.zzZL zzzl, float f) throws Exception {
        zz1D zz1d = new zz1D(f, false);
        zzzl.zzZ(zz1d);
        return zz1d.zzsD();
    }

    private void zzZI() {
        com.aspose.words.internal.zzG zzgPop = this.zzYA.pop();
        int iZzW = zzsD().zzW((com.aspose.words.internal.zzZL) zzgPop);
        if (zzgPop.getCount() == 0) {
            zzsD().removeAt(iZzW);
        } else if (zzgPop.zzZN() != null) {
            zzZ(new com.aspose.words.internal.zzZG(zzgPop.zzZN().zzO8()), false, iZzW);
        }
    }

    private void zzd(com.aspose.words.internal.zzG zzg) {
        zzsD().zzZ(0, zzg);
        this.zzYA.push(zzg);
    }

    private com.aspose.words.internal.zzG zzsD() {
        return this.zzYA.peek();
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(com.aspose.words.internal.zzG zzg) {
        zzZI();
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzG zzg) {
        com.aspose.words.internal.zzG zzg2 = (com.aspose.words.internal.zzG) zzg.zz1();
        zzg2.clear();
        zzd(zzg2);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzZG zzzg) {
        com.aspose.words.internal.zzZG zzzg2 = (com.aspose.words.internal.zzZG) zzzg.zz1();
        zzZ(zzzg2, zzzg2.zzZ1() != null, 0);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzZP zzzp) {
        zzZ(com.aspose.words.internal.zzZG.zzW(zzzp.zzZj()), true, 0);
    }

    private void zzZ(com.aspose.words.internal.zzZG zzzg, boolean z, int i) {
        if (z) {
            zzzg.zzY(new com.aspose.words.internal.zzOI(com.aspose.words.internal.zzPV.zzKa));
        }
        zzzg.zzX(new com.aspose.words.internal.zzOU(this.zzZgj ? new com.aspose.words.internal.zzPV(30, com.aspose.words.internal.zzPV.zzKa) : com.aspose.words.internal.zzPV.zzIs, this.zzYYh));
        zzzg.zzZ2().zzXW(2);
        zzsD().zzZ(i, zzzg);
    }
}
