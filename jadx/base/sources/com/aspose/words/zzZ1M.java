package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ1M extends zzY4E {
    private boolean zzY2W;
    private zzZ22 zzY2X;
    private zzZ1Z zzY2Z;
    private zzZ1V zzY3G;
    private zzZ1W zzY3U;
    private int zzY33 = 0;
    private com.aspose.words.internal.zzZQC<zzZ1P> zzY32 = new com.aspose.words.internal.zzZQC<>();
    private com.aspose.words.internal.zzZQC<zzZ23> zzY31 = new com.aspose.words.internal.zzZQC<>();
    private com.aspose.words.internal.zzZQC<zzZ1V> zzY30 = new com.aspose.words.internal.zzZQC<>();
    private ArrayList<String> zzY2Y = new ArrayList<>();

    private boolean zzEE() {
        return this.zzY32.size() > 0;
    }

    private void zzX(zzZ1V zzz1v) {
        zzY(zzYHz());
        if (zzz1v != null) {
            this.zzY30.push(zzz1v);
        } else if (this.zzY30.size() > 0) {
            this.zzY30.pop();
        }
    }

    private void zzY(zzZ1V zzz1v) {
        if (zzz1v != null) {
            this.zzY3G = zzz1v;
        }
    }

    private zzZ23 zzYHA() {
        if (zzZfT()) {
            return this.zzY31.peek();
        }
        return null;
    }

    private zzZ1P zzYHB() {
        if (zzEE()) {
            return this.zzY32.peek();
        }
        return null;
    }

    private void zzYHG() {
        Iterator<String> it = this.zzY2Y.iterator();
        while (it.hasNext()) {
            zzi(com.aspose.words.internal.zzZKN.format("<a name=\"{0}\"></a>", it.next()), false);
        }
        this.zzY2Y.clear();
    }

    private zzZ1W zzYHx() {
        if (this.zzY3U == null) {
            this.zzY3U = new zzZ1W(this);
        }
        return this.zzY3U;
    }

    private zzZ1Z zzYHy() throws Exception {
        if (this.zzY2Z == null) {
            String fileName = zzZqS().getFileName();
            if (fileName == null && (zzZqS().zzXpb instanceof com.aspose.words.internal.zzZOS)) {
                fileName = ((com.aspose.words.internal.zzZOS) zzZqS().zzXpb).getName();
            }
            this.zzY2Z = new zzZ1Z(fileName, (MarkdownSaveOptions) zzXUj(), zzYHx());
        }
        return this.zzY2Z;
    }

    private zzZ1V zzYHz() {
        if (this.zzY30.size() > 0) {
            return this.zzY30.peek();
        }
        return null;
    }

    private static boolean zzYP(Node node) {
        Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(node.getAncestor(18), Shape.class);
        return shape != null && shape.getShapeType() == 202;
    }

    private void zzZ(zzZ1P zzz1p) {
        this.zzY32.push(zzz1p);
    }

    private boolean zzZfT() {
        return this.zzY31.size() > 0;
    }

    private boolean zzZr(Paragraph paragraph) throws Exception {
        return !com.aspose.words.internal.zzZKN.zzU3(zzZs(paragraph));
    }

    private String zzZs(Paragraph paragraph) throws Exception {
        if (!paragraph.isListItem()) {
            return null;
        }
        updateListLabels();
        return paragraph.getListLabel().getLabelString();
    }

    private Run zzZt(Paragraph paragraph) throws Exception {
        String strZzZs = zzZs(paragraph);
        if (com.aspose.words.internal.zzZKN.zzU3(strZzZs)) {
            return null;
        }
        if (!com.aspose.words.internal.zzZYD.zzZ1(strZzZs.charAt(strZzZs.length() - 1))) {
            strZzZs = com.aspose.words.internal.zzZKN.format("{0} ", strZzZs);
        }
        return new Run(getDocument(), strZzZs, paragraph.getListLabel().zzU(true, 1));
    }

    private void zzi(String str, boolean z) {
        zzYHz();
        zzYHz().zzi(str, z);
    }

    public final void updateListLabels() throws Exception {
        if (this.zzY2W) {
            return;
        }
        ((Document) getDocument()).updateListLabels();
        this.zzY2W = true;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBookmarkStart(BookmarkStart bookmarkStart) {
        if ("_GoBack".equals(bookmarkStart.getName())) {
            return 0;
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzY2Y, com.aspose.words.internal.zzZKN.zzU2(bookmarkStart.getName()));
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCellEnd(Cell cell) throws Exception {
        zzYHB().zzI(cell);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCellStart(Cell cell) {
        zzYHB().zzJ(cell);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitDocumentEnd(Document document) throws Exception {
        zzYHD().zzZ(this);
        zzYHx().zzZ(this);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldEnd(FieldEnd fieldEnd) {
        String strZzT = zzYHA().zzT(fieldEnd);
        this.zzY31.pop();
        if (zzZfT()) {
            zzYHA().zzIC(strZzT);
        } else {
            zzi(strZzT, false);
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldSeparator(FieldSeparator fieldSeparator) {
        zzYHA().zzT(fieldSeparator);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldStart(FieldStart fieldStart) {
        zzZ(zzZ23.zzZ(fieldStart, zzYHx(), this));
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFootnoteEnd(Footnote footnote) {
        zzYHD().zzYIw();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFootnoteStart(Footnote footnote) {
        zzYHD().zzP(footnote);
        zzYHz().zzR(footnote);
        zzYHz().zzi(zzYHD().zzZAT(), false);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitGroupShapeStart(GroupShape groupShape) throws Exception {
        if (!zzYHy().zz7(groupShape)) {
            return 0;
        }
        zzi(zzYHy().getText(), true);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitHeaderFooterStart(HeaderFooter headerFooter) {
        this.zzY3G = null;
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphEnd(Paragraph paragraph) throws Exception {
        Iterator<zzZ23> it = this.zzY31.iterator();
        while (it.hasNext()) {
            zzYHz().zzi(it.next().zzYIz(), false);
        }
        zzYHz().zzQ(null);
        if (((MarkdownSaveOptions) zzXUj()).getListExportMode() == 1 && zzZr(paragraph)) {
            paragraph.removeChild(paragraph.zzYVe());
        }
        if (zzEE()) {
            zzYHB().zzZ(zzYHz());
        } else if (this.zzY2X.zzYIv()) {
            zzYHD().zzZ(zzYHz());
        } else {
            zzYHz().zzIg();
            com.aspose.words.internal.zzZNH.zzU(zzZeE(), ((MarkdownSaveOptions) zzXUj()).getParagraphBreak());
        }
        if (zzYHz().zzYIo()) {
            this.zzY33--;
        }
        zzX(null);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphStart(Paragraph paragraph) throws Exception {
        Run runZzZt;
        zzX(new zzZ1V(paragraph, this));
        if (zzYHz().zzYIo()) {
            this.zzY33++;
        }
        if (((MarkdownSaveOptions) zzXUj()).getListExportMode() != 1 || (runZzZt = zzZt(paragraph)) == null) {
            return 0;
        }
        paragraph.prependChild(runZzZt);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRowEnd(Row row) {
        zzYHB().zzN(row);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRowStart(Row row) {
        zzYHB().zzYHM();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRun(Run run) {
        if (zzZ7R.zzZ(run, 130, 0) == zzZU.zzZF6 || zzYP(run)) {
            return 0;
        }
        zzYHG();
        if (zzZfT()) {
            zzYHA().zzQ(run);
        } else {
            zzYHz().zzQ(run);
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitShapeStart(Shape shape) throws Exception {
        if (shape.zzY9h().zzZyf() != null && shape.zzY9h().zzZyf().getOn()) {
            zzi("-----", true);
        } else if (zzYHy().zzm(shape)) {
            zzi(zzYHy().getText(), false);
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitTableEnd(Table table) throws Exception {
        zzYHB().zzYHO();
        if (zzYHB().zzYIo()) {
            this.zzY33--;
        }
        this.zzY32.pop();
        if (!zzEE()) {
            return 0;
        }
        zzYHB().zzYHN();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitTableStart(Table table) throws Exception {
        if (zzEE()) {
            zzZ(zzYHB().zzr(table));
            return 0;
        }
        zzZ(new zzZ1P(table, this));
        if (zzYHB().zzYIo()) {
            this.zzY33++;
        }
        zzYHB().zzYHP();
        return 0;
    }

    @Override // com.aspose.words.zzY4E
    public final void zzO(Section section) throws Exception {
        if (section.zzYVf()) {
            com.aspose.words.internal.zzZNH.zzU(zzXUk(), ((MarkdownSaveOptions) zzXUj()).getParagraphBreak());
        }
        super.zzO(section);
    }

    public final boolean zzYHC() {
        return this.zzY33 > 0;
    }

    public final zzZ22 zzYHD() {
        if (this.zzY2X == null) {
            this.zzY2X = new zzZ22();
        }
        return this.zzY2X;
    }

    public final zzZ1V zzYHE() {
        return this.zzY3G;
    }

    public final MarkdownSaveOptions zzYHF() {
        return (MarkdownSaveOptions) zzXUj();
    }

    private void zzZ(zzZ23 zzz23) {
        this.zzY31.push(zzz23);
    }
}
