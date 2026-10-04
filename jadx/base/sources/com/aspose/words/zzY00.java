package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY00 extends zzZNQ {
    private com.aspose.words.internal.zzZSX zzWTG;

    @Override // com.aspose.words.zzZNQ
    public final void zzT(com.aspose.words.internal.zzZH zzzh) throws Exception {
        this.zzWTG.zzO(zzzh);
    }

    @Override // com.aspose.words.zzZNQ
    public final void zzZ(zzYDZ zzydz, com.aspose.words.internal.zzQR zzqr) throws Exception {
        com.aspose.words.internal.zzZSY zzzsyZzZ = ((XamlFixedSaveOptions) zzydz.zzXpa).zzZ(zzydz.zzYfy, zzqr);
        zzZNQ.zzZ(zzzsyZzZ, zzydz.getFileName());
        this.zzWTG = new com.aspose.words.internal.zzZSX(zzydz.zzXpb, zzzsyZzZ);
    }

    @Override // com.aspose.words.zzZNQ
    public final SaveOutputParameters zzZ9c() throws Exception {
        this.zzWTG.endDocument();
        return new SaveOutputParameters("application/xml");
    }
}
