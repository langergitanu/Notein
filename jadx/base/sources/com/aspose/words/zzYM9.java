package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYM9 extends com.aspose.words.internal.zz6 {
    private com.aspose.words.internal.zzGQ zzFh;
    private boolean zzXFq;
    private com.aspose.words.internal.zzG zzXFr;
    private com.aspose.words.internal.zzG zzZg1;
    private com.aspose.words.internal.zzF4 zzv;

    public static com.aspose.words.internal.zzG zzZ(com.aspose.words.internal.zzG zzg, com.aspose.words.internal.zzGQ zzgq, com.aspose.words.internal.zzF4 zzf4) throws Exception {
        zzYM9 zzym9 = new zzYM9();
        zzym9.zzFh = zzgq;
        zzym9.zzv = zzf4;
        zzym9.zzXFq = true;
        zzg.zzZ(zzym9);
        return zzym9.zzZg1;
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(com.aspose.words.internal.zzG zzg) {
        if (this.zzZg1.zzZ5() != null) {
            this.zzZg1 = (com.aspose.words.internal.zzG) this.zzZg1.zzZ5();
        }
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzG zzg) {
        if (this.zzZg1 == null) {
            com.aspose.words.internal.zzG zzg2 = new com.aspose.words.internal.zzG();
            this.zzXFr = zzg2;
            this.zzZg1 = zzg2;
        } else {
            com.aspose.words.internal.zzG zzg3 = new com.aspose.words.internal.zzG();
            zzg3.zzQ(zzg.zzZK());
            this.zzZg1.zzX((com.aspose.words.internal.zzZL) zzg3);
            this.zzZg1 = zzg3;
        }
        this.zzZg1.zzW(zzg.zzZO());
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzZG zzzg) throws Exception {
        this.zzZg1.zzX(com.aspose.words.internal.zz6G.zzZ(zzzg, this.zzXFq));
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzZP zzzp) throws Exception {
        this.zzZg1.zzX(zzzp);
        super.zzZ(zzzp);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(com.aspose.words.internal.zzZU zzzu) throws Exception {
        if (zzzu.isHidden()) {
            return;
        }
        for (com.aspose.words.internal.zzZG zzzg : new zzY5O(zzzu.zzZr(), new com.aspose.words.internal.zzOU(zzzu.zzZy()), new com.aspose.words.internal.zzOI(zzzu.zzZy()), this.zzFh).zzT(zzzu.getText(), com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) zzzu.zzZE()), zzzu.zzZr().getDescentPoints() + com.aspose.words.internal.zzZPY.zzYC(zzzu.zzZE())))) {
            com.aspose.words.internal.zzZG zzzgZzYZ = zzzg.zzYZ();
            zzzgZzYZ.zzX(zzzu.zzZq().isEmpty() ? null : new com.aspose.words.internal.zzOU(zzzu.zzZq()));
            zzzgZzYZ.zzY(zzzu.zzZy().isEmpty() ? null : new com.aspose.words.internal.zzOI(zzzu.zzZy()));
            if (zzzu.zzZO() != null) {
                zzzgZzYZ.zzY(zzzu.zzZO());
            }
            this.zzZg1.zzX(zzzgZzYZ);
        }
    }
}
