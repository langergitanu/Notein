package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZKM implements zzZ8Z {
    private Paragraph zzYtC;
    private int zzYw;

    public zzZKM(Paragraph paragraph, int i) {
        paragraph.zzYoT();
        this.zzYtC = paragraph;
        this.zzYw = i;
    }

    private String zzZ4z() {
        int iIntValue = ((Integer) this.zzYtC.fetchParaAttr(EditingLanguage.KASHMIRI_ARABIC)).intValue();
        int iIntValue2 = ((Integer) this.zzYtC.fetchParaAttr(EditingLanguage.GALICIAN)).intValue();
        List listZzxv = this.zzYtC.getDocument().getLists().zzxv(iIntValue);
        zzZ47 zzz47 = new zzZ47(listZzxv);
        zzz47.zzZ(listZzxv, iIntValue2, true);
        return zzZ4D.zzZ(zzz47, 0, (zzZAJ) null, (String) null);
    }

    @Override // com.aspose.words.zzZ8Z
    public final String getDocumentOutlineTitle() {
        return zzZ4z();
    }

    @Override // com.aspose.words.zzZ8Z
    public final zzYWB getLabelRange() {
        Run run = new Run(this.zzYtC.zzYBb(), zzZ4z());
        return new zzYWB(run, run);
    }

    @Override // com.aspose.words.zzZ8Z
    public final int getLevel() {
        return this.zzYw;
    }

    @Override // com.aspose.words.zzZ8Z
    public final boolean getOmitPageNumber() {
        return false;
    }

    @Override // com.aspose.words.zzZ8Z
    public final int getPageNumber() {
        throw new IllegalStateException();
    }

    @Override // com.aspose.words.zzZ8Z
    public final Paragraph getParagraph() {
        return this.zzYtC;
    }

    @Override // com.aspose.words.zzZ8Z
    public final int getSequenceValue(String str) {
        throw new IllegalStateException();
    }

    @Override // com.aspose.words.zzZ8Z
    public final boolean hasBookmark() {
        return true;
    }

    @Override // com.aspose.words.zzZ8Z
    public final zzYWB insertBookmark(String str) {
        BookmarkStart bookmarkStart = new BookmarkStart(this.zzYtC.zzYBb(), str);
        BookmarkEnd bookmarkEnd = new BookmarkEnd(this.zzYtC.zzYBb(), str);
        this.zzYtC.appendChild(bookmarkStart);
        this.zzYtC.appendChild(bookmarkEnd);
        return zzYWB.zzXV4;
    }

    @Override // com.aspose.words.zzZ8Z
    public final boolean isInFieldCode() {
        return true;
    }
}
