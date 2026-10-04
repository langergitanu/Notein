package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYLY extends zzZNQ {
    private com.aspose.words.internal.zz2A zzXET;
    private zzZAI zzYgG;

    private static String zzR(zzYDZ zzydz) {
        String strZzVn = com.aspose.words.internal.zzBM.zzVn(zzydz.zzYfy.getStyles().zzY37().getLocaleId());
        return !com.aspose.words.internal.zzZYD.zzXk(strZzVn) ? "en-US" : strZzVn;
    }

    private static boolean zzS(zzYDZ zzydz) {
        return ((PdfSaveOptions) zzydz.zzXpa).getExportParagraphGraphicsToArtifact();
    }

    private static boolean zzT(zzYDZ zzydz) {
        return ((PdfSaveOptions) zzydz.zzXpa).getExportLanguageToSpanTag();
    }

    private static boolean zzU(zzYDZ zzydz) {
        return ((PdfSaveOptions) zzydz.zzXpa).zzYnx();
    }

    @Override // com.aspose.words.zzZNQ
    public final zzZ72 zzV(zzYDZ zzydz) {
        zzZAI zzz3u = zzU(zzydz) ? new zzZ3U(zzT(zzydz), zzR(zzydz), zzS(zzydz)) : new zzYTZ();
        this.zzYgG = zzz3u;
        return new zzZ72(zzz3u, false, true);
    }

    @Override // com.aspose.words.zzZNQ
    public final boolean zzW(SaveOptions saveOptions) {
        return ((PdfSaveOptions) saveOptions).getCustomPropertiesExport() != 0;
    }

    @Override // com.aspose.words.zzZNQ
    public final void zzZ(zzYDZ zzydz, com.aspose.words.internal.zzQR zzqr) throws Exception {
        com.aspose.words.internal.zz2A zz2a = new com.aspose.words.internal.zz2A(zzydz.zzXpb, ((PdfSaveOptions) zzydz.zzXpa).zz5(zzydz.zzYfy));
        this.zzXET = zz2a;
        zz2a.zzti().zzZ(zzqr);
        this.zzXET.zzti().zzXX(zzR(zzydz));
    }

    @Override // com.aspose.words.zzZNQ
    public final SaveOutputParameters zzZ9c() throws Exception {
        this.zzYgG.endDocument();
        this.zzXET.zzti().zzU(this.zzYgG.zzZ2d());
        this.zzXET.endDocument();
        return new SaveOutputParameters("application/pdf");
    }

    @Override // com.aspose.words.zzZNQ
    public final void zzT(com.aspose.words.internal.zzZH zzzh) throws Exception {
        this.zzXET.zzU(zzzh);
    }
}
