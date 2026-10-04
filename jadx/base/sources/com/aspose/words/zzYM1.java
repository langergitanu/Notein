package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYM1 extends zzZNQ {
    private com.aspose.words.internal.zz5Z zzXFd;

    @Override // com.aspose.words.zzZNQ
    public final void zzT(com.aspose.words.internal.zzZH zzzh) throws Exception {
        this.zzXFd.zzO(zzzh);
    }

    @Override // com.aspose.words.zzZNQ
    public final void zzZ(zzYDZ zzydz, com.aspose.words.internal.zzQR zzqr) throws Exception {
        this.zzXFd = new com.aspose.words.internal.zz5Z(zzydz.zzXpb, ((PclSaveOptions) zzydz.zzXpa).zz6(zzydz.zzYfy));
    }

    @Override // com.aspose.words.zzZNQ
    public final SaveOutputParameters zzZ9c() throws Exception {
        this.zzXFd.endDocument();
        return new SaveOutputParameters("application/vnd.hp-pcl");
    }
}
