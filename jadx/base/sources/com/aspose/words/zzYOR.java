package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYOR extends DocumentVisitor implements zzZBR {
    private int mColumnIndex;
    private int zzU8;
    private boolean zzXJG;
    private boolean zzXJH;
    private boolean zzXJI;
    private boolean zzXJJ;
    private boolean zzXJK;
    private boolean zzXJL;
    private int zzXJM;
    private boolean zzXJN;
    private zzYSH zzXJO;
    private zzYP8 zzXJP;
    private zzYSK zzXJQ;
    private zzYRG zzXJR;
    private zzYRX zzXJS;
    private zzYTK zzXJT;
    private zzYPX zzXJU;
    private zzYPU zzXJV;
    private zzYS0 zzXJW;
    private zzYPO zzXJX;
    private zzYPO zzXJY;
    private zzYPO zzXJZ;
    private boolean zzXK0;
    private boolean zzXK1;
    private boolean zzXK2;
    private boolean zzXK3;
    private boolean zzXK4;
    private boolean zzXK5;
    private boolean zzXK6;
    private boolean zzXK7;
    private ArrayList<Node> zzXK8;
    private ArrayList<zzYR5> zzXK9;
    private ArrayList<zzYR5> zzXKa;
    private ArrayList<zzYR5> zzXKb;
    private int zzXKc;
    private int zzXKd;
    private int zzXKe;
    private int zzXKf;
    private int zzXKg;
    private int zzXKh;
    private int zzXKi;
    private int zzXKj;
    private int zzXKk;
    private Paragraph zzXKl;
    private Node zzXKm;
    private zzYRA zzXKn;
    private com.aspose.words.internal.zzD3<String> zzXKo;
    private zzYQA zzXMg;
    private zzYP7 zzXQT;
    private zzYTG zzXQU;
    private zzYPT zzXQV;
    private zzYTN zzXQW;
    private zzYPM zzXRS;
    private Section zzXWP;
    private zzYQP zzYKO;
    private zzYDZ zzZFZ;
    private com.aspose.words.internal.zzZQC<String> zzXJF = new com.aspose.words.internal.zzZQC<>();
    private double zzXMI = 1.0d;
    private ArrayList<zzYR5> zzXML = new ArrayList<>();

    public static boolean zzC(Section section) {
        if (zzr0(section.getPageSetup().getSectionStart()) || section.zz9I()) {
            return true;
        }
        return section.getPageSetup().getSectionStart() == 0 && !zzW(section, (Section) com.aspose.words.internal.zzZKW.zzZ(section.getPreviousSibling(), Section.class));
    }

    public static boolean zzW(Section section, Section section2) {
        if (section == null || section2 == null) {
            return true;
        }
        return com.aspose.words.internal.zzAN.zzL(section2.getPageSetup().getPageWidth(), section.getPageSetup().getPageWidth()) && com.aspose.words.internal.zzAN.zzL(section2.getPageSetup().getPageHeight(), section.getPageSetup().getPageHeight());
    }

    public static String zzWt(double d) {
        return com.aspose.words.internal.zzZKN.format("{0}%", com.aspose.words.internal.zzJB.zzZU(d));
    }

    public static boolean zzX(Object obj, boolean z) {
        if (!(obj instanceof Style)) {
            return false;
        }
        Style style = (Style) obj;
        return !z && (style.getType() == 1 || style.getType() == 4) && style.zzY3v() == 12287;
    }

    public static Story zzXj(Node node) {
        return (Story) node.getAncestor(Story.class);
    }

    public static boolean zzXk(Node node) {
        Story storyZzXj = zzXj(node);
        return storyZzXj != null && storyZzXj.getStoryType() == 1;
    }

    public static boolean zzYB(Paragraph paragraph) {
        return !paragraph.isInCell() && paragraph.zzZYj().zzYpF();
    }

    private void zzYsJ() throws Exception {
        Iterator<zzYR5> it = this.zzXML.iterator();
        while (it.hasNext()) {
            zzZ(it.next());
        }
    }

    private void zzYsK() throws Exception {
        for (zzYQO zzyqo : this.zzYKO.zzYvp()) {
            if (zzyqo.zzYvH()) {
                com.aspose.words.internal.zzZQG.zzZ(this.zzXML, new zzYR5(zzyqo));
            }
        }
    }

    private void zzYsM() throws Exception {
        this.zzXJY = new zzYPO();
        this.zzXJZ = new zzYPO();
        this.zzXJX = new zzYPO();
        this.zzXKb = new ArrayList<>();
        this.zzXKa = new ArrayList<>();
        this.zzXK9 = new ArrayList<>();
        this.zzXK8 = new ArrayList<>();
        zzYRM zzyrm = new zzYRM(this);
        zzYOZ zzyoz = new zzYOZ(this);
        zzYQ0 zzyq0 = new zzYQ0(this);
        zzYQD zzyqd = new zzYQD(this);
        zzYRE zzyre = new zzYRE(this);
        this.zzXJT = new zzYTK(this);
        zzYPM zzypm = new zzYPM(this);
        this.zzXRS = zzypm;
        zzYOW zzyow = new zzYOW(this, zzypm);
        zzYTN zzytn = new zzYTN(this, this.zzXRS, zzyow, zzyoz, zzyrm, zzyqd, zzyq0);
        this.zzXQW = zzytn;
        this.zzXMg = new zzYQA(this, this.zzXRS, zzytn);
        this.zzXQV = new zzYPT(this, this.zzXRS, this.zzXQW, zzyow, this.zzXMg);
        this.zzXJW = new zzYS0(this, this.zzXRS, this.zzXQW, this.zzXQV, zzyow, zzyrm);
        this.zzXJV = new zzYPU(this, this.zzXQV, this.zzXQW, this.zzXRS, zzyre);
        this.zzXQT = new zzYP7(this, zzyow);
        this.zzXJU = new zzYPX(this, this.zzXQW, this.zzXRS);
        this.zzXJS = new zzYRX(this, this.zzXRS, this.zzXQW);
        this.zzXJR = new zzYRG(this, zzyow);
        this.zzXJP = new zzYP8(this, this.zzXRS, this.zzXQW);
        this.zzXJQ = new zzYSK(this, this.zzXRS, zzyow, this.zzXQW, this.zzXQV);
        this.zzXKo = new com.aspose.words.internal.zzD3<>();
        this.zzYKO = new zzYQP();
        zzYSH zzysh = new zzYSH(this, this.zzXQW, this.zzXQT);
        this.zzXJO = zzysh;
        zzysh.zzIg();
        this.zzXK8.clear();
        new zzYPJ(this, this.zzXQW, zzyow, zzyre, zzyoz).zzIg();
        new zzYQV(this).zzIg();
        this.zzXKk = 6;
        this.zzZFZ.zzYfy.accept(this);
        new zzYPV(this).zzIg();
        zzYsK();
        if (com.aspose.words.internal.zzZYD.zzXk(zzYsI().getPassword())) {
            zzYsJ();
        }
        new zzYR3(this).write(zzZk9());
        this.zzYKO.zzZ(this.zzZFZ.zzXpb, zzZk9(), this.zzXML);
    }

    private boolean zzYz(Paragraph paragraph) throws Exception {
        if (this.zzXQW.zzS(paragraph).isHeading()) {
            return ((paragraph.getParentNode() instanceof Shape) && zzYPU.zzZV((Shape) com.aspose.words.internal.zzZKW.zzZ(paragraph.getParentNode(), Shape.class))) ? false : true;
        }
        return false;
    }

    private String zzZk9() {
        if (this.zzZFZ.zzXpa.getSaveFormat() == 60) {
            return "application/vnd.oasis.opendocument.text";
        }
        if (this.zzZFZ.zzXpa.getSaveFormat() == 61) {
            return "application/vnd.oasis.opendocument.text-template";
        }
        throw new IllegalStateException("Unexpected save format type.");
    }

    private void zzf(Document document) {
        if (com.aspose.words.internal.zzZYD.zzXk(document.getAttachedTemplate())) {
            zzY(1, "Export of template attached to the document is not supported for ODT format by Aspose.Words.", zzYsE());
        }
        zzY(1, "Export of all Document.DocPr members is not supported for ODT format by Aspose.Words except: DocPr.ShowRevisions, DocPr.DocumentProtection, DocPr.DefaultTabStop, DocPr.AutoHyphenation, DocPr.CompatibilityOptions.", zzYsE());
        zzY(1, "Export of all Document.DocPr.CompatibilityOptions members is not supported for ODT format by Aspose.Words except: DoNotUseHTMLParagraphAutoSpacing, ApplyBreakingRules, NoColumnBalance, NoLeadin.", zzYsE());
        if (document.zzZpV().zzYWy) {
            zzY(262144, com.aspose.words.internal.zzZKN.format("Fonts are not embedded, as it is not supported for {0} file format.", "ODT"), zzYsE());
        }
    }

    private void zzp(OfficeMath officeMath) throws Exception {
        if (zzYsE() || zzYsD()) {
            NodeCollection childNodes = officeMath.getChildNodes(19, true);
            this.zzXJK = true;
            Iterator<T> it = childNodes.iterator();
            while (it.hasNext()) {
                ((Comment) it.next()).accept(this);
            }
            this.zzXJK = false;
        }
        if (zzYsD()) {
            this.zzXQU.zzX("<draw:frame>");
            this.zzXQU.zzGB("draw:object");
            this.zzXQU.zzYt("xlink:href", officeMath.getId());
        }
    }

    private static boolean zzr0(int i) {
        return i == 2 || i == 3 || i == 4;
    }

    private int zzz(Inline inline) throws Exception {
        if (inline.getParentNode().getNodeType() == 35) {
            return 0;
        }
        return this.zzXQV.zzE(inline);
    }

    public final int getColumnIndex() {
        return this.mColumnIndex;
    }

    public final Document getDocument() {
        return this.zzZFZ.zzYfy;
    }

    public final Node getPreviousSibling() {
        return this.zzXKm;
    }

    public final int getRowIndex() {
        return this.zzU8;
    }

    public final IWarningCallback getWarningCallback() {
        return this.zzZFZ.zzYfy.getWarningCallback();
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitAbsolutePositionTab(AbsolutePositionTab absolutePositionTab) throws Exception {
        if (absolutePositionTab.getAlignment() != 0) {
            return super.visitAbsolutePositionTab(absolutePositionTab);
        }
        zzZ(absolutePositionTab);
        return 1;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBodyEnd(Body body) throws Exception {
        this.zzXJT.zzYye();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBodyStart(Body body) {
        this.zzXK5 = zzr0(body.getParentSection().getPageSetup().getSectionStart());
        this.zzXKm = null;
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBookmarkEnd(BookmarkEnd bookmarkEnd) {
        return this.zzXJT.visitBookmarkEnd(bookmarkEnd);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBookmarkStart(BookmarkStart bookmarkStart) throws Exception {
        return this.zzXJT.visitBookmarkStart(bookmarkStart);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBuildingBlockStart(BuildingBlock buildingBlock) {
        zz2("Export of element 'BuildingBlock' is not supported to this format by Aspose.Words");
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCellEnd(Cell cell) throws Exception {
        return this.zzXJP.visitCellEnd(cell);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCellStart(Cell cell) throws Exception {
        return this.zzXJP.visitCellStart(cell);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentEnd(Comment comment) throws Exception {
        this.zzXJT.zzYye();
        return this.zzXJQ.zzYwW();
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentRangeStart(CommentRangeStart commentRangeStart) {
        zz2("Export of element 'CommentRange' is not supported to this format by Aspose.Words");
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentStart(Comment comment) {
        return this.zzXJQ.visitCommentStart(comment);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitDocumentEnd(Document document) {
        return this.zzXQT.zzYtf();
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitDocumentStart(Document document) throws Exception {
        this.zzXKc = 0;
        zzf(document);
        this.zzXKn.clear();
        return this.zzXJO.zzYwU();
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldEnd(FieldEnd fieldEnd) throws Exception {
        return this.zzXJW.visitFieldEnd(fieldEnd);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldSeparator(FieldSeparator fieldSeparator) {
        return this.zzXJW.visitFieldSeparator(fieldSeparator);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldStart(FieldStart fieldStart) throws Exception {
        return this.zzXJW.zzM(fieldStart);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFootnoteEnd(Footnote footnote) throws Exception {
        this.zzXJT.zzYye();
        return this.zzXJS.visitFootnoteEnd(footnote);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFootnoteStart(Footnote footnote) {
        return this.zzXJS.visitFootnoteStart(footnote);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFormField(FormField formField) {
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitGlossaryDocumentStart(GlossaryDocument glossaryDocument) {
        zz2("Export of element 'GlossaryDocument' is not supported by ODT format.");
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitGroupShapeEnd(GroupShape groupShape) throws Exception {
        return this.zzXJV.zzZl(groupShape);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitGroupShapeStart(GroupShape groupShape) throws Exception {
        return this.zzXJV.zzZF(groupShape);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitHeaderFooterEnd(HeaderFooter headerFooter) throws Exception {
        this.zzXJT.zzYye();
        return this.zzXJR.visitHeaderFooterEnd(headerFooter);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitHeaderFooterStart(HeaderFooter headerFooter) throws Exception {
        return this.zzXJR.visitHeaderFooterStart(headerFooter);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitOfficeMathEnd(OfficeMath officeMath) {
        if (officeMath.zzZsL().getMathObjectType() == 0 && this.zzXKk != 6 && zzYsD()) {
            this.zzXQU.zzGA("draw:object");
            this.zzXQU.zzGA("draw:frame");
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitOfficeMathStart(OfficeMath officeMath) throws Exception {
        Run run = (Run) com.aspose.words.internal.zzZKW.zzZ(officeMath.getPreviousSibling(), Run.class);
        if (run != null && ((zzYEJ) com.aspose.words.internal.zzZKW.zzZ(run.zzZYh().zzPk(885), zzYEJ.class)) != null) {
            return 1;
        }
        if (this.zzXKk == 6 && officeMath.zzZsL().getMathObjectType() == 0) {
            String id = officeMath.getId();
            this.zzXK9.add(new zzYR5("text/xml", com.aspose.words.internal.zzZKN.format("{0}/content.xml", id)));
            com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
            zzZ0P.zzZ(officeMath, (zzZAC) new zzYU5(zzzor), true);
            this.zzYKO.zzYvp().zzZ(new zzYQO(com.aspose.words.internal.zzZKN.format("{0}/content.xml", id), zzzor));
        }
        if (officeMath.zzZsL().getMathObjectType() != 0) {
            return 0;
        }
        zzp(officeMath);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphEnd(Paragraph paragraph) throws Exception {
        return this.zzXMg.visitParagraphEnd(paragraph);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphStart(Paragraph paragraph) throws Exception {
        this.zzXMg.visitParagraphStart(paragraph);
        this.zzXJT.zzYye();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRowEnd(Row row) throws Exception {
        return this.zzXJP.visitRowEnd(row);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRowStart(Row row) throws Exception {
        return this.zzXJP.visitRowStart(row);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRun(Run run) throws Exception {
        if (run.zzZYh().contains(885)) {
            this.zzXQV.zzL(run);
        }
        return zzz(run);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitSectionEnd(Section section) {
        return this.zzXJU.zzYug();
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitSectionStart(Section section) {
        return this.zzXJU.visitSectionStart(section);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitShapeEnd(Shape shape) throws Exception {
        return this.zzXJV.zzZl(shape);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitShapeStart(Shape shape) throws Exception {
        return this.zzXJV.zzZF(shape);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitSmartTagStart(SmartTag smartTag) {
        zz2("Export of element 'SmartTag' is not supported by ODT format.");
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitSpecialChar(SpecialChar specialChar) throws Exception {
        return zzz(specialChar);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitStructuredDocumentTagStart(StructuredDocumentTag structuredDocumentTag) {
        zz2("Export of element 'StructuredDocumentTag' is not supported by ODT format.");
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitSubDocument(SubDocument subDocument) {
        zz2("Export of element 'SubDocument' is not supported to this format by Aspose.Words.");
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitTableEnd(Table table) throws Exception {
        return this.zzXJP.visitTableEnd(table);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitTableStart(Table table) throws Exception {
        return this.zzXJP.visitTableStart(table);
    }

    public final void zz2(String str) {
        zzY(1, str, zzYsD());
    }

    public final boolean zz6W() {
        return this.zzXK0;
    }

    public final zzYTG zzDg(String str) throws Exception {
        zzYQO zzyqo = new zzYQO(str);
        this.zzXQU = new zzYTG(zzyqo, zzYsI().getPrettyFormat());
        this.zzYKO.zzYvp().zzZ(zzyqo);
        return this.zzXQU;
    }

    public final void zzK(Section section) {
        this.zzXWP = section;
    }

    public final void zzOv(int i) {
        this.mColumnIndex = i;
    }

    public final void zzRQ(boolean z) {
        this.zzXJG = z;
    }

    public final void zzRR(boolean z) {
        this.zzXJI = z;
    }

    public final void zzRS(boolean z) {
        this.zzXJJ = z;
    }

    public final void zzRT(boolean z) {
        this.zzXK0 = z;
    }

    public final void zzRU(boolean z) {
        this.zzXJN = z;
    }

    public final void zzRV(boolean z) {
        this.zzXK6 = z;
    }

    public final void zzRW(boolean z) {
        this.zzXK7 = z;
    }

    public final void zzRX(boolean z) {
        this.zzXK1 = z;
    }

    public final void zzRY(boolean z) {
        this.zzXK2 = z;
    }

    public final void zzV(Paragraph paragraph, String str) {
        zzYTG zzytg = this.zzXQU;
        zzytg.zzY(str);
        zzytg.zz0("text:style-name", this.zzXRS.getNextParagraphStyleName());
        if (!"text:h".equals(str) || paragraph == null) {
            return;
        }
        zzytg.zzZj("text:outline-level", paragraph.getParagraphFormat().getOutlineLevel() + 1);
    }

    public final String zzWu(double d) {
        int measureUnit = zzYsI().getMeasureUnit();
        if (measureUnit == 0) {
            return com.aspose.words.internal.zzZKN.format("{0}cm", com.aspose.words.internal.zzJB.zzX(com.aspose.words.internal.zzSA.zzi(d), 3));
        }
        if (measureUnit == 1) {
            return com.aspose.words.internal.zzZKN.format("{0}in", com.aspose.words.internal.zzJB.zzX(d / 72.0d, 5));
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: Unknown measure unit");
    }

    public final void zzWz(double d) {
        this.zzXMI = d;
    }

    public final void zzY(int i, String str, boolean z) {
        if (z && getWarningCallback() != null) {
            OooO00o.OooO0O0(getWarningCallback(), i, 15, str);
        }
    }

    public final String zzYA(Paragraph paragraph) throws Exception {
        return zzYz(paragraph) ? "text:h" : "text:p";
    }

    public final Section zzYBx() {
        return this.zzXWP;
    }

    public final String zzYrY() {
        int measureUnit = zzYsI().getMeasureUnit();
        if (measureUnit == 0) {
            return "0cm";
        }
        if (measureUnit == 1) {
            return "0in";
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: Unknown measure unit");
    }

    public final com.aspose.words.internal.zzZQC<String> zzYrZ() {
        return this.zzXJF;
    }

    public final boolean zzYs0() {
        return this.zzXJG;
    }

    public final void zzYs1() {
        this.zzXJH = true;
    }

    public final boolean zzYs2() {
        return this.zzXJH;
    }

    public final boolean zzYs3() {
        return this.zzXJI;
    }

    public final boolean zzYs4() {
        return this.zzXJJ;
    }

    public final boolean zzYs5() {
        return this.zzXJK;
    }

    public final void zzYs6() {
        this.zzXJL = true;
    }

    public final boolean zzYs7() {
        return this.zzXJL;
    }

    public final com.aspose.words.internal.zzD3<String> zzYs8() {
        return this.zzXKo;
    }

    public final zzYRA zzYs9() {
        return this.zzXKn;
    }

    public final int zzYsA() {
        return this.zzXKe;
    }

    public final int zzYsB() {
        return this.zzXKj;
    }

    public final int zzYsC() {
        return this.zzXKk;
    }

    public final boolean zzYsD() {
        int i = this.zzXKk;
        return i == 4 || i == 1;
    }

    public final boolean zzYsE() {
        int i = this.zzXKk;
        return i == 0 || i == 3;
    }

    public final boolean zzYsF() {
        int i = this.zzXKk;
        return i == 0 || i == 1;
    }

    public final zzYTG zzYsG() {
        return this.zzXQU;
    }

    public final boolean zzYsH() {
        return this.zzZFZ.zzYsH();
    }

    public final OdtSaveOptions zzYsI() {
        return (OdtSaveOptions) this.zzZFZ.zzXpa;
    }

    public final void zzYsL() {
        this.zzXJM = 0;
        this.zzXKh = 0;
        this.mColumnIndex = 0;
        this.zzU8 = 0;
        this.zzXKi = 0;
        this.zzXKg = 0;
        this.zzXKf = 0;
        this.zzXKd = 0;
        this.zzXRS.zzYtP();
    }

    public final Paragraph zzYsa() {
        return this.zzXKl;
    }

    public final zzYPO zzYsb() {
        return this.zzXJX;
    }

    public final zzYPO zzYsc() {
        return this.zzXJY;
    }

    public final zzYPO zzYsd() {
        return this.zzXJZ;
    }

    public final void zzYse() {
        this.zzXK3 = true;
    }

    public final boolean zzYsf() {
        return this.zzXK3;
    }

    public final void zzYsg() {
        this.zzXK4 = true;
    }

    public final boolean zzYsh() {
        return this.zzXK4;
    }

    public final void zzYsi() {
        this.zzXK5 = false;
    }

    public final boolean zzYsj() {
        return this.zzXK5;
    }

    public final boolean zzYsk() {
        return this.zzXJN;
    }

    public final int zzYsl() {
        return this.zzXJM;
    }

    public final boolean zzYsm() {
        return this.zzXK6;
    }

    public final boolean zzYsn() {
        return this.zzXK7;
    }

    public final boolean zzYso() {
        return this.zzXK1;
    }

    public final boolean zzYsp() {
        return this.zzXK2;
    }

    public final ArrayList<Node> zzYsq() {
        return this.zzXK8;
    }

    public final ArrayList<zzYR5> zzYsr() {
        return this.zzXK9;
    }

    public final ArrayList<zzYR5> zzYss() {
        return this.zzXKa;
    }

    public final ArrayList<zzYR5> zzYst() {
        return this.zzXKb;
    }

    public final int zzYsu() {
        return this.zzXKg;
    }

    public final int zzYsv() {
        return this.zzXKf;
    }

    public final int zzYsw() {
        return this.zzXKh;
    }

    public final int zzYsx() {
        return this.zzXKc;
    }

    public final int zzYsy() {
        return this.zzXKd;
    }

    public final int zzYsz() {
        return this.zzXKi;
    }

    public final zzYQP zzYuU() {
        return this.zzYKO;
    }

    public final double zzYuu() {
        return this.zzXMI;
    }

    public final ArrayList<zzYR5> zzYux() {
        return this.zzXML;
    }

    public final void zzYy(Paragraph paragraph) {
        this.zzXKl = paragraph;
    }

    @Override // com.aspose.words.zzZBR
    public final SaveOutputParameters zzZ(zzYDZ zzydz) throws Exception {
        this.zzZFZ = zzydz;
        this.zzXK7 = false;
        this.zzXK5 = false;
        this.zzXK4 = false;
        this.zzXK3 = false;
        this.zzXKn = new zzYRA();
        zzYsM();
        return new SaveOutputParameters(zzZk9());
    }

    public final String zzr1(int i) {
        return zzWu(((double) i) / 12700.0d);
    }

    public final String zzr2(int i) {
        if (i == Integer.MIN_VALUE) {
            return null;
        }
        int measureUnit = zzYsI().getMeasureUnit();
        if (measureUnit == 0) {
            return com.aspose.words.internal.zzZKN.format("{0}cm", com.aspose.words.internal.zzJB.zzX(((double) i) / 566.9291338582677d, 3));
        }
        if (measureUnit == 1) {
            return com.aspose.words.internal.zzZKN.format("{0}in", com.aspose.words.internal.zzJB.zzX(((double) i) / 1440.0d, 5));
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: Unknown measure unit");
    }

    public final void zzr3(int i) {
        this.zzXJM = i;
    }

    public final void zzr4(int i) {
        this.zzXKg = i;
    }

    public final void zzr5(int i) {
        this.zzXKf = i;
    }

    public final void zzr6(int i) {
        this.zzU8 = i;
    }

    public final void zzr7(int i) {
        this.zzXKh = i;
    }

    public final void zzr8(int i) {
        this.zzXKc = i;
    }

    public final void zzr9(int i) {
        this.zzXKd = i;
    }

    public final void zzra(int i) {
        this.zzXKi = i;
    }

    public final void zzrb(int i) {
        this.zzXKe = i;
    }

    public final void zzrc(int i) {
        this.zzXKj = i;
    }

    public final void zzrd(int i) {
        this.zzXKk = i;
    }

    public final String zzz(Border border) {
        String strZzWu;
        com.aspose.words.internal.zzPV zzpvZz8Q = border.zz8Q();
        if (zzpvZz8Q.isEmpty()) {
            zzpvZz8Q = com.aspose.words.internal.zzPV.zzKa;
        }
        String str = com.aspose.words.internal.zzZKN.format("{0}{1}", zzYOU.zzZQ(zzpvZz8Q), com.aspose.words.internal.zzZKN.zzU3(zzYOU.zzZQ(zzpvZz8Q)) ? "" : " ");
        if (border.zz8T()) {
            strZzWu = zzWu(0.06d);
        } else {
            strZzWu = zzWu(zzYOU.zzWr(border.getLineStyle(), border.zz8L()));
        }
        return com.aspose.words.internal.zzZKN.format("{0}{1} {2}", str, strZzWu, zzYS3.zzsl(border.getLineStyle()));
    }

    public final String zzX(zzYC3 zzyc3, int i, boolean z) {
        if (i == 0) {
            return null;
        }
        zzYR1 zzyr1ZzY = zzYOU.zzY(zzyc3, i, z);
        if (this.zzXJY.zzY(zzyr1ZzY.getName(), null, false, false) == null) {
            this.zzXJY.zzZ((zzYPP) zzyr1ZzY, false, false);
        }
        return zzyr1ZzY.getName();
    }

    public final void zzY(zzYTI zzyti, String str) {
        Border borderZzGC = zzyti.zzGC(str);
        if (zzYTI.zzB(borderZzGC) && "double".equals(zzYS3.zzsl(borderZzGC.getLineStyle()))) {
            String strZzWu = zzWu(zzYOU.zzWr(borderZzGC.getLineStyle(), borderZzGC.zz8L()) / 3.0d);
            this.zzXQU.zz0(com.aspose.words.internal.zzZKN.format("style:border-line-width-{0}", str), com.aspose.words.internal.zzZKN.format("{0} {1} {2}", strZzWu, strZzWu, strZzWu));
        }
    }

    private void zzZ(AbsolutePositionTab absolutePositionTab) {
        if (absolutePositionTab.getPreviousSibling() == null || (absolutePositionTab.getPreviousSibling() instanceof AbsolutePositionTab)) {
            return;
        }
        if (zzYsE()) {
            this.zzXQW.zzYw(this.zzXRS.zzYtV(), "text");
            this.zzXQU.zzo();
        }
        if (zzYsD()) {
            this.zzXQV.zzYud();
            this.zzXQU.zzX("<text:line-break/>");
            this.zzXQV.zzYuc();
        }
    }

    public final void zzZ(Node node, Section section) {
        if (node.zzYB3()) {
            if ((node.getParentNode() instanceof Body) && section.getParentNode() != null && !section.zzYB3()) {
                this.zzXKm = null;
                return;
            } else {
                this.zzXKm = node.getParentNode();
                return;
            }
        }
        this.zzXKm = node;
    }

    public final void zzZ(zzYTI zzyti, String str) {
        this.zzXQU.zz0(com.aspose.words.internal.zzZKN.format("fo:border-{0}", str), zzz(zzyti.zzGC(str)));
    }

    public final void zzZ(zzYTI zzyti) {
        float fZzYyb = zzyti.zzYyb();
        if (fZzYyb > 0.0f) {
            this.zzXQU.zz0("style:shadow", com.aspose.words.internal.zzZKN.format("#000000 {0} {0}", zzWu(fZzYyb)));
        }
    }

    private void zzZ(zzYR5 zzyr5) throws Exception {
        zzYQO zzyqoZzEn = this.zzYKO.zzEn(zzyr5.zzxf());
        zzyr5.zzZ(new zzYS5());
        zzyr5.zzYvI().zzra();
        zzyqoZzEn.zzYvo().zzH(0L);
        byte[] bArrZzT = com.aspose.words.internal.zzZRV.zzT(zzyqoZzEn.zzYvo(), 0);
        zzyr5.zzYvI().zzXY(bArrZzT);
        zzyqoZzEn.zzF(zzYS7.zzY(bArrZzT, zzYsI().getPassword(), zzyr5.zzYvI()));
    }

    public final void zzZ(int i, String str, boolean z, boolean z2) {
        boolean z3 = this.zzXKk == 2 || zzYsE();
        if (z) {
            zzY(256, com.aspose.words.internal.zzZKN.format("Export of {0} formatting modifier 0x{1:x4} is not supported for ODT format by Aspose.Words.", str, Integer.valueOf(i)), z3);
        }
        if (z2) {
            zzY(256, com.aspose.words.internal.zzZKN.format("Export of {0} formatting modifier 0x{1:x4} is not supported by ODT format.", str, Integer.valueOf(i)), z3);
        }
    }
}
