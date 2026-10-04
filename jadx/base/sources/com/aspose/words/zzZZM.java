package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZZM extends DocumentVisitor {
    private Section zzYWJ;
    private boolean zzYWK;
    private boolean zzYWL;

    public zzZZM(Section section) {
        this.zzYWJ = section;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFootnoteStart(Footnote footnote) throws Exception {
        if (footnote.getFootnoteType() == 0) {
            this.zzYWL = true;
        }
        return super.visitFootnoteStart(footnote);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFormField(FormField formField) throws Exception {
        this.zzYWK = true;
        return super.visitFormField(formField);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitSectionEnd(Section section) throws Exception {
        if (section == this.zzYWJ) {
            return 2;
        }
        return super.visitSectionEnd(section);
    }

    public final boolean zzZrR() {
        return this.zzYWK;
    }

    public final boolean zzZrS() {
        return this.zzYWL;
    }
}
