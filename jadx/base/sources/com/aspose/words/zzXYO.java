package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzXYO extends zzZNQ {
    private com.aspose.words.internal.zzZS2 zzWRY;
    private zzYDZ zzZFZ;

    private static com.aspose.words.internal.zzZS2 zzY(zzYDZ zzydz, com.aspose.words.internal.zzQR zzqr) throws Exception {
        return new com.aspose.words.internal.zzZS2(zzqr, ((XpsSaveOptions) zzydz.zzXpa).zzZG(zzydz.zzYfy));
    }

    @Override // com.aspose.words.zzZNQ
    public final void zzT(com.aspose.words.internal.zzZH zzzh) throws Exception {
        this.zzWRY.zzO(zzzh);
    }

    @Override // com.aspose.words.zzZNQ
    public final void zzZ(zzYDZ zzydz, com.aspose.words.internal.zzQR zzqr) throws Exception {
        this.zzZFZ = zzydz;
        this.zzWRY = zzY(zzydz, zzqr);
    }

    @Override // com.aspose.words.zzZNQ
    public final SaveOutputParameters zzZ9c() throws Exception {
        this.zzWRY.endDocument();
        this.zzWRY.zzm1().zzL(this.zzZFZ.zzXpb);
        return new SaveOutputParameters("application/vnd.ms-xpsdocument");
    }
}
