package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZDH implements zzZBR {
    @Override // com.aspose.words.zzZBR
    public final SaveOutputParameters zzZ(zzYDZ zzydz) throws Exception {
        zzydz.zzYdd();
        new zzZJ2(zzydz.zzYfy, zzydz.zzXpb, zzydz.getFileName(), (HtmlSaveOptions) zzydz.zzXpa, zzydz, null, null).zzZ3I();
        return new SaveOutputParameters("text/html");
    }
}
