package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYAE extends zzYAG {
    private Document zzZEY;

    public zzYAE(Document document, zzZOR zzzor) {
        super(zzzor);
        this.zzZEY = document;
    }

    @Override // com.aspose.words.zzYAG
    public final zzYAH zzI(FieldStart fieldStart) throws Exception {
        return this.zzZEY.zzZqh().zzJ(fieldStart);
    }

    @Override // com.aspose.words.zzZQJ
    public final zzYAD zzX(Footnote footnote) throws Exception {
        return this.zzZEY.zzZqh().zzZoz().zzY(footnote);
    }

    @Override // com.aspose.words.zzYAG
    public final boolean zzY5w() {
        return false;
    }

    @Override // com.aspose.words.zzYAG
    public final zzYN8 zzZ8m() {
        return null;
    }

    @Override // com.aspose.words.zzYAG
    public final void zzZp(zzYAU zzyau) {
    }
}
