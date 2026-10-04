package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZHW extends zzZNQ {
    private com.aspose.words.internal.zzI4 zzYqr;
    private zzZHZ zzYqs = new zzZHZ();

    @Override // com.aspose.words.zzZNQ
    public final void zzT(com.aspose.words.internal.zzZH zzzh) throws Exception {
        com.aspose.words.internal.zzI4 zzi4 = this.zzYqr;
        zzZHZ zzzhz = this.zzYqs;
        zzi4.zzZ(zzzhz != null ? zzzhz.zzZ2b() : null);
        this.zzYqr.zzO(zzzh);
    }

    @Override // com.aspose.words.zzZNQ
    public final zzZ72 zzV(zzYDZ zzydz) {
        return new zzZ72(this.zzYqs, true, false);
    }

    @Override // com.aspose.words.zzZNQ
    public final void zzZ(zzYDZ zzydz, com.aspose.words.internal.zzQR zzqr) throws Exception {
        com.aspose.words.internal.zzI6 zzi6Zzq = ((HtmlFixedSaveOptions) zzydz.zzXpa).zzq(zzydz.zzYfy);
        zzi6Zzq.zzb(zzqr.zzQG());
        zzi6Zzq.setTitle(zzqr.getTitle());
        zzZNQ.zzZ(zzi6Zzq, zzydz.getFileName());
        com.aspose.words.internal.zzI4 zzi4 = new com.aspose.words.internal.zzI4(zzydz.zzXpb, zzi6Zzq);
        this.zzYqr = zzi4;
        zzi4.startDocument();
    }

    @Override // com.aspose.words.zzZNQ
    public final SaveOutputParameters zzZ9c() throws Exception {
        this.zzYqr.endDocument();
        return new SaveOutputParameters("text/html");
    }
}
