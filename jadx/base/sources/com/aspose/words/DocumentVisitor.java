package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public abstract class DocumentVisitor {
    private int zzYPC;

    public final boolean isLocked() {
        return this.zzYPC > 0;
    }

    public final void lock() {
        this.zzYPC++;
    }

    public final void unlock() {
        int i = this.zzYPC;
        if (i > 0) {
            this.zzYPC = i - 1;
        }
    }

    public int visitAbsolutePositionTab(AbsolutePositionTab absolutePositionTab) throws Exception {
        return visitSpecialChar(absolutePositionTab);
    }

    public int visitBodyEnd(Body body) throws Exception {
        return 0;
    }

    public int visitBodyStart(Body body) throws Exception {
        return 0;
    }

    public int visitBookmarkEnd(BookmarkEnd bookmarkEnd) throws Exception {
        return 0;
    }

    public int visitBookmarkStart(BookmarkStart bookmarkStart) throws Exception {
        return 0;
    }

    public int visitBuildingBlockEnd(BuildingBlock buildingBlock) throws Exception {
        return 0;
    }

    public int visitBuildingBlockStart(BuildingBlock buildingBlock) throws Exception {
        return 0;
    }

    public int visitCellEnd(Cell cell) throws Exception {
        return 0;
    }

    public int visitCellStart(Cell cell) throws Exception {
        return 0;
    }

    public int visitCommentEnd(Comment comment) throws Exception {
        return 0;
    }

    public int visitCommentRangeEnd(CommentRangeEnd commentRangeEnd) throws Exception {
        return 0;
    }

    public int visitCommentRangeStart(CommentRangeStart commentRangeStart) throws Exception {
        return 0;
    }

    public int visitCommentStart(Comment comment) throws Exception {
        return 0;
    }

    public int visitDocumentEnd(Document document) throws Exception {
        return 0;
    }

    public int visitDocumentStart(Document document) throws Exception {
        return 0;
    }

    public int visitEditableRangeEnd(EditableRangeEnd editableRangeEnd) throws Exception {
        return 0;
    }

    public int visitEditableRangeStart(EditableRangeStart editableRangeStart) throws Exception {
        return 0;
    }

    public int visitFieldEnd(FieldEnd fieldEnd) throws Exception {
        return 0;
    }

    public int visitFieldSeparator(FieldSeparator fieldSeparator) throws Exception {
        return 0;
    }

    public int visitFieldStart(FieldStart fieldStart) throws Exception {
        return 0;
    }

    public int visitFootnoteEnd(Footnote footnote) throws Exception {
        return 0;
    }

    public int visitFootnoteStart(Footnote footnote) throws Exception {
        return 0;
    }

    public int visitFormField(FormField formField) throws Exception {
        return 0;
    }

    public int visitGlossaryDocumentEnd(GlossaryDocument glossaryDocument) throws Exception {
        return 0;
    }

    public int visitGlossaryDocumentStart(GlossaryDocument glossaryDocument) throws Exception {
        return 0;
    }

    public int visitGroupShapeEnd(GroupShape groupShape) throws Exception {
        return 0;
    }

    public int visitGroupShapeStart(GroupShape groupShape) throws Exception {
        return 0;
    }

    public int visitHeaderFooterEnd(HeaderFooter headerFooter) throws Exception {
        return 0;
    }

    public int visitHeaderFooterStart(HeaderFooter headerFooter) throws Exception {
        return 0;
    }

    public int visitOfficeMathEnd(OfficeMath officeMath) throws Exception {
        return 0;
    }

    public int visitOfficeMathStart(OfficeMath officeMath) throws Exception {
        return 0;
    }

    public int visitParagraphEnd(Paragraph paragraph) throws Exception {
        return 0;
    }

    public int visitParagraphStart(Paragraph paragraph) throws Exception {
        return 0;
    }

    public int visitRowEnd(Row row) throws Exception {
        return 0;
    }

    public int visitRowStart(Row row) throws Exception {
        return 0;
    }

    public int visitRun(Run run) throws Exception {
        return 0;
    }

    public int visitSectionEnd(Section section) throws Exception {
        return 0;
    }

    public int visitSectionStart(Section section) throws Exception {
        return 0;
    }

    public int visitShapeEnd(Shape shape) throws Exception {
        return 0;
    }

    public int visitShapeStart(Shape shape) throws Exception {
        return 0;
    }

    public int visitSmartTagEnd(SmartTag smartTag) throws Exception {
        return 0;
    }

    public int visitSmartTagStart(SmartTag smartTag) throws Exception {
        return 0;
    }

    public int visitSpecialChar(SpecialChar specialChar) throws Exception {
        return 0;
    }

    public int visitStructuredDocumentTagEnd(StructuredDocumentTag structuredDocumentTag) throws Exception {
        return 0;
    }

    public int visitStructuredDocumentTagRangeEnd(StructuredDocumentTagRangeEnd structuredDocumentTagRangeEnd) throws Exception {
        return 0;
    }

    public int visitStructuredDocumentTagRangeStart(StructuredDocumentTagRangeStart structuredDocumentTagRangeStart) throws Exception {
        return 0;
    }

    public int visitStructuredDocumentTagStart(StructuredDocumentTag structuredDocumentTag) throws Exception {
        return 0;
    }

    public int visitSubDocument(SubDocument subDocument) throws Exception {
        return 0;
    }

    public int visitTableEnd(Table table) throws Exception {
        return 0;
    }

    public int visitTableStart(Table table) throws Exception {
        return 0;
    }

    public int zzY(zzYX6 zzyx6) throws Exception {
        return 0;
    }

    public int zzZ(zzYX6 zzyx6) throws Exception {
        return 0;
    }

    public boolean zzZn9() {
        return true;
    }

    public int zzY(zzYX9 zzyx9) throws Exception {
        return 0;
    }

    public int zzZ(zzYX9 zzyx9) throws Exception {
        return 0;
    }
}
