package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYKL extends zzZNQ {
    private com.aspose.words.internal.zz00 zzXDb;

    @Override // com.aspose.words.zzZNQ
    public final void zzT(com.aspose.words.internal.zzZH zzzh) throws Exception {
        this.zzXDb.zzO(zzzh);
    }

    @Override // com.aspose.words.zzZNQ
    public final void zzZ(zzYDZ zzydz, com.aspose.words.internal.zzQR zzqr) throws Exception {
        com.aspose.words.internal.zz02 zz02VarZz3 = ((PsSaveOptions) zzydz.zzXpa).zz3(zzydz.zzYfy);
        zz02VarZz3.zzZ(new zzY21(zzydz.zzYfy.getWarningCallback()));
        this.zzXDb = new com.aspose.words.internal.zz00(zzydz.zzXpb, zzqr, zz02VarZz3);
    }

    @Override // com.aspose.words.zzZNQ
    public final SaveOutputParameters zzZ9c() throws Exception {
        this.zzXDb.endDocument();
        return new SaveOutputParameters("application/postscript");
    }
}
