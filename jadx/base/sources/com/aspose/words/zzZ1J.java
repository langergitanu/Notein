package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ1J extends DocumentVisitor {
    private zzZ1E zzY2P;
    private zzZ1D zzY2Q;
    private zzZ1L zzY2R;
    private zzZ1K zzY2S;
    private zzZ1G zzY2T;
    private com.aspose.words.internal.zzZQC<Boolean> zzY2U = new com.aspose.words.internal.zzZQC<>();
    private boolean zzY2V;
    private zzYLW zzYok;
    private zzZ1I zzYrj;
    private zzZN8 zzYs5;
    private zzYDW zzYs6;

    public zzZ1J(zzZ1G zzz1g, zzZ1K zzz1k, zzZ1I zzz1i, zzZ1L zzz1l, zzZ1D zzz1d, zzZN8 zzzn8, zzZ1E zzz1e, zzYLW zzylw, zzYDW zzydw) {
        this.zzY2T = zzz1g;
        this.zzY2S = zzz1k;
        this.zzYrj = zzz1i;
        this.zzY2R = zzz1l;
        this.zzY2Q = zzz1d;
        this.zzYs5 = zzzn8;
        this.zzY2P = zzz1e;
        this.zzYok = zzylw;
        this.zzYs6 = zzydw;
    }

    private void zzYHu() {
        if (zzZlT() && this.zzY2U.pop().booleanValue()) {
            unlock();
        }
    }

    private void zzYHv() {
        if (zzZlT() && this.zzY2U.peek().booleanValue()) {
            unlock();
            this.zzY2U.pop();
            this.zzY2U.push(Boolean.FALSE);
        }
    }

    private void zzYHw() {
        this.zzY2U.push(Boolean.TRUE);
        lock();
    }

    private boolean zzZlT() {
        return this.zzY2U.size() > 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitAbsolutePositionTab(AbsolutePositionTab absolutePositionTab) throws Exception {
        this.zzY2S.zzZ3F();
        return super.visitAbsolutePositionTab(absolutePositionTab);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBodyEnd(Body body) throws Exception {
        this.zzYok.zzYye();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBookmarkEnd(BookmarkEnd bookmarkEnd) throws Exception {
        if (isLocked()) {
            return 0;
        }
        boolean z = bookmarkEnd.zzYB0() != null && bookmarkEnd.zzYB0().getNodeType() == 28;
        if (this.zzY2R.zzZ3Z() || bookmarkEnd.zzYAY() == 6 || z) {
            this.zzY2R.zzW(bookmarkEnd);
        } else {
            this.zzYok.add(bookmarkEnd);
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBookmarkStart(BookmarkStart bookmarkStart) throws Exception {
        if (isLocked()) {
            return 0;
        }
        if (this.zzY2R.zzZ3Z() || bookmarkStart.zzYAY() == 6) {
            this.zzY2R.zzW(bookmarkStart);
        } else {
            this.zzYok.add(bookmarkStart);
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCellEnd(Cell cell) throws Exception {
        if (isLocked()) {
            return 0;
        }
        this.zzY2T.zzZ0K();
        this.zzYs5.zzZ7c();
        this.zzY2Q.zzYHn();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCellStart(Cell cell) throws Exception {
        zzWP zzwpZz5r = cell.zz6G().zz5r();
        if (zzwpZz5r.zz5B()) {
            return 1;
        }
        if (isLocked()) {
            return 0;
        }
        this.zzYs5.zzU(zzwpZz5r.getShading());
        this.zzY2Q.zzF(cell);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentEnd(Comment comment) throws Exception {
        this.zzYok.zzYye();
        return this.zzY2S.zzQ(comment);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentRangeEnd(CommentRangeEnd commentRangeEnd) throws Exception {
        if (this.zzY2S.zzZ3c() || commentRangeEnd.zzYAY() == 6) {
            this.zzY2S.zzZ(commentRangeEnd);
            return 0;
        }
        this.zzYok.add(commentRangeEnd);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentRangeStart(CommentRangeStart commentRangeStart) throws Exception {
        if (this.zzY2S.zzZ3c() || commentRangeStart.zzYAY() == 6) {
            this.zzY2S.zzZ(commentRangeStart);
            return 0;
        }
        this.zzYok.add(commentRangeStart);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentStart(Comment comment) throws Exception {
        return this.zzY2S.zzR(comment);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitDocumentEnd(Document document) {
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldEnd(FieldEnd fieldEnd) throws Exception {
        zzYHu();
        if (!isLocked()) {
            this.zzYrj.zzU(fieldEnd);
        }
        if (fieldEnd.getFieldType() == 13) {
            this.zzY2V = false;
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldSeparator(FieldSeparator fieldSeparator) throws Exception {
        if (!this.zzYrj.zz5(fieldSeparator.getField())) {
            zzYHv();
        }
        if (isLocked()) {
            return 0;
        }
        this.zzYrj.zzU(fieldSeparator);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldStart(FieldStart fieldStart) throws Exception {
        if (!isLocked()) {
            this.zzYrj.zzK(fieldStart);
        }
        zzYHw();
        this.zzY2S.zzL(fieldStart);
        if (fieldStart.getFieldType() != 13) {
            return 0;
        }
        this.zzY2V = true;
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFootnoteEnd(Footnote footnote) throws Exception {
        this.zzYok.zzYye();
        return this.zzY2S.zzU(footnote);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFootnoteStart(Footnote footnote) throws Exception {
        return this.zzY2S.zzV(footnote);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFormField(FormField formField) throws Exception {
        return this.zzYrj.zzW(formField);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitGroupShapeStart(GroupShape groupShape) throws Exception {
        if (isLocked()) {
            return 0;
        }
        return this.zzY2P.zz1(groupShape);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitHeaderFooterEnd(HeaderFooter headerFooter) throws Exception {
        this.zzYok.zzYye();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitOfficeMathStart(OfficeMath officeMath) throws Exception {
        if (isLocked()) {
            return 0;
        }
        return this.zzY2S.zzW(officeMath);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphEnd(Paragraph paragraph) throws Exception {
        if (isLocked()) {
            return 0;
        }
        this.zzY2S.zza(paragraph);
        zzYDW zzydw = this.zzYs6;
        if (zzydw != null) {
            zzydw.zzYd0();
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphStart(Paragraph paragraph) throws Exception {
        if (isLocked()) {
            return 0;
        }
        int iZzb = this.zzY2S.zzb(paragraph);
        this.zzYok.zzYye();
        return iZzb;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRowEnd(Row row) throws Exception {
        if (isLocked()) {
            return 0;
        }
        this.zzY2Q.zzYHo();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRowStart(Row row) throws Exception {
        if (isLocked()) {
            return 0;
        }
        this.zzY2Q.zzL(row);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRun(Run run) throws Exception {
        if (isLocked() || this.zzYrj.zzP(run)) {
            return 0;
        }
        return this.zzY2S.zzQ(run);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitShapeStart(Shape shape) throws Exception {
        if (isLocked()) {
            return 0;
        }
        return this.zzY2P.zz1(shape);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitSpecialChar(SpecialChar specialChar) throws Exception {
        if (isLocked()) {
            return 0;
        }
        String text = specialChar.getText();
        if (com.aspose.words.internal.zzZKN.equals(text, ControlChar.zzZsc)) {
            this.zzY2S.zzY(specialChar);
            return 0;
        }
        if (com.aspose.words.internal.zzZKN.equals(text, ControlChar.zzZsb)) {
            return 0;
        }
        return this.zzY2S.zzQ(specialChar);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitStructuredDocumentTagEnd(StructuredDocumentTag structuredDocumentTag) throws Exception {
        this.zzY2S.zzZ3H();
        return super.visitStructuredDocumentTagEnd(structuredDocumentTag);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitStructuredDocumentTagStart(StructuredDocumentTag structuredDocumentTag) throws Exception {
        this.zzY2S.zzT(structuredDocumentTag);
        return super.visitStructuredDocumentTagStart(structuredDocumentTag);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitTableEnd(Table table) throws Exception {
        if (isLocked()) {
            return 0;
        }
        this.zzY2Q.zzp(table);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitTableStart(Table table) throws Exception {
        if (isLocked()) {
            return 0;
        }
        this.zzY2T.zzZ0K();
        this.zzY2Q.zzq(table);
        return 0;
    }

    public final boolean zzZ3b() {
        return this.zzY2V;
    }
}
