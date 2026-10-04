package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzYEN extends DocumentVisitor implements zzZBR {
    private int zzXSv;
    private boolean zzXqA;
    private FieldStart zzXqC;
    private boolean zzXqD;
    private StringBuilder zzXqE;
    private boolean zzXqF;
    private boolean zzXqG;
    private com.aspose.words.internal.zzZQC<zzYF0> zzXqH;
    private zzYF0 zzXqI;
    private zzYFK zzXqJ;
    private com.aspose.words.internal.zzZOR zzXqK;
    private zzYEM zzXwl;
    private zzZQC zzYTq;
    private IWarningCallback zzZG0;
    private com.aspose.words.internal.zzZOP zzdy;
    private ArrayList<Node> zzXRL = new ArrayList<>();
    private com.aspose.words.internal.zzZQC<FieldStart> zzXqB = new com.aspose.words.internal.zzZQC<>();
    private com.aspose.words.internal.zzZQC<String> zzXqz = new com.aspose.words.internal.zzZQC<>();
    private com.aspose.words.internal.zzDB zzYzW = new com.aspose.words.internal.zzDB();

    private void zz2(String str) {
        IWarningCallback iWarningCallback = this.zzZG0;
        if (iWarningCallback != null) {
            OooO00o.OooO0O0(iWarningCallback, 1, 12, str);
        }
    }

    private static boolean zzBs(String str) {
        if (com.aspose.words.internal.zzZKN.zzS(str, "_Toc", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            return com.aspose.words.internal.zzJB.zzZ7(str.substring(4));
        }
        return false;
    }

    private static String zzBt(String str) {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == 55349) {
                z = true;
            } else {
                if (!z || cCharAt < 56398 || cCharAt > 56423) {
                    if (z) {
                        sb.append((char) 55349);
                    }
                    sb.append(cCharAt);
                } else {
                    sb.append((char) (cCharAt - 56301));
                }
                z = false;
            }
        }
        return sb.toString();
    }

    private static boolean zzE(Run run) {
        if (!run.zzZYh().contains(880) || run.zz9I() || run.getPreviousSibling().getNodeType() != 21) {
            return false;
        }
        Run run2 = (Run) run.getPreviousSibling();
        if (run2.zzZYh().contains(880)) {
            return ((zzZNW) run.zzZYh().get(880)).getId() == ((zzZNW) run2.zzZYh().get(880)).getId();
        }
        return false;
    }

    private void zzF(Footnote footnote) {
        int footnoteType = footnote.getFootnoteType();
        if (footnoteType == 0) {
            zzYEM zzyem = this.zzXwl;
            zzyem.zznj(zzyem.zzYef() + 1);
        } else {
            if (footnoteType != 1) {
                throw new IllegalStateException("Unknown footnote type.");
            }
            zzYEM zzyem2 = this.zzXwl;
            zzyem2.zzni(zzyem2.zzYee() + 1);
        }
    }

    private void zzI(FieldEnd fieldEnd) throws Exception {
        if (isLocked()) {
            return;
        }
        zzZQO zzzqo = new zzZQO((FieldXE) zzZQB.zzX(this.zzXqC, null, fieldEnd));
        this.zzXwl.zzYfW().zzCC("\\xe");
        zzYWB zzywbZzZeH = zzzqo.zzZeH();
        this.zzXqA = true;
        zzywbZzZeH.zzZ(this, new zzYHH(zzywbZzZeH));
        this.zzXqA = false;
        if (zzzqo.isBold()) {
            this.zzXwl.zzYfW().zzCD("\\bxe");
        }
        if (zzzqo.isItalic()) {
            this.zzXwl.zzYfW().zzCD("\\ixe");
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zzzqo.getEntryType())) {
            this.zzXwl.zzYfW().zzZ5("\\xef", zzzqo.getEntryType().charAt(0));
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zzzqo.getPageNumberReplacement())) {
            this.zzXwl.zzYfW().zzCC("\\txe");
            this.zzXwl.zzYfW().write(zzzqo.getPageNumberReplacement());
            this.zzXwl.zzYfW().zzYj3();
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zzzqo.getPageRangeBookmarkName())) {
            this.zzXwl.zzYfW().zzCC("\\rxe");
            this.zzXwl.zzYfW().write(zzzqo.getPageRangeBookmarkName());
            this.zzXwl.zzYfW().zzYj3();
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zzzqo.getYomi())) {
            this.zzXwl.zzYfW().zzY7("\\yxe", zzzqo.getYomi());
        }
        this.zzXwl.zzYfW().zzYj3();
    }

    private void zzJ(FieldEnd fieldEnd) throws Exception {
        if (isLocked()) {
            return;
        }
        zzZQR zzzqr = new zzZQR((FieldTC) zzZQB.zzX(this.zzXqC, null, fieldEnd));
        this.zzXwl.zzYfW().zzCC(!zzzqr.getOmitPageNumber() ? "\\tc" : "\\tcn");
        zzY(this.zzXqC, false, zzzqr.zzZeH().zzYA2().getNode(), !zzzqr.zzZeH().zzYA4());
        zzzqr.zzZeH().zzZ(this, new zzZP9(zzzqr.zzZeH()));
        zzY(zzzqr.zzZeH().zzYA1().getNode(), !zzzqr.zzZeH().zzYA3(), fieldEnd, false);
        if (zzzqr.getLevel() != 1) {
            this.zzXwl.zzYfW().zzZ5("\\tcl", zzzqr.getLevel());
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zzzqr.getTypeIdentifier())) {
            this.zzXwl.zzYfW().zzZ5("\\tcf", zzzqr.getTypeIdentifier().charAt(0));
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zzzqr.zzZeG())) {
            this.zzXwl.zzYfW().zzYV(zzzqr.zzZeG());
        }
        this.zzXwl.zzYfW().zzYj3();
    }

    private void zzK(FieldEnd fieldEnd) throws Exception {
        FieldStart fieldStartPop = this.zzXqB.pop();
        Paragraph paragraph = (Paragraph) fieldStartPop.getAncestor(8);
        Paragraph paragraph2 = (Paragraph) fieldEnd.getAncestor(8);
        if (paragraph != paragraph2) {
            visitParagraphStart(paragraph2);
        }
        Section section = (Section) fieldStartPop.getAncestor(2);
        Section section2 = (Section) fieldEnd.getAncestor(2);
        if (section != section2) {
            visitSectionStart(section2);
        }
    }

    private void zzL(FieldEnd fieldEnd) throws Exception {
        fieldEnd.hasSeparator();
        if (!fieldEnd.isDeleteRevision()) {
            Field field = fieldEnd.getField();
            this.zzXwl.zzYeh().zzYiH();
            zzV(zzZ7R.zzZ(fieldEnd, 1), field.getDisplayResult());
        }
        this.zzXwl.zzYeh().zzRp(true);
    }

    private void zzV(zzYEF zzyef, String str) throws Exception {
        this.zzXwl.zzYfW().zzFg();
        this.zzXwl.zzYfW().zzYj5();
        this.zzXwl.zzYel().zzw(zzyef);
        if (this.zzXSv > 0) {
            zzu(zzyef);
            str = zzBt(str);
        }
        this.zzXwl.zzYfW().zzZ3(str, this.zzXqA ? 4 : 0);
        if (this.zzXSv > 0) {
            this.zzXwl.zzYfW().zzYj3();
        }
        this.zzXwl.zzYfW().zzYj4();
    }

    private void zzW(BookmarkStart bookmarkStart) throws Exception {
        this.zzXwl.zzYfW().zzFg();
        this.zzXwl.zzYfW().zzCC("\\*\\bkmkstart");
        if (bookmarkStart.isColumn()) {
            this.zzXwl.zzYfW().zzZ5("\\bkmkcolf", bookmarkStart.getFirstColumn());
            this.zzXwl.zzYfW().zzZ5("\\bkmkcoll", bookmarkStart.getLastColumn() + 1);
        }
        this.zzXwl.zzYfW().zzYV(bookmarkStart.getName());
        this.zzXwl.zzYfW().zzYj3();
    }

    private static boolean zzWD(Node node) {
        if (node.getNodeType() != 22 && node.getNodeType() != 23 && node.getNodeType() != 24) {
            return false;
        }
        boolean z = node.getNodeType() == 24;
        while (node != null) {
            if (node.getNodeType() == (z ? 22 : 24)) {
                break;
            }
            if (node.getNodeType() == 23) {
                return ((FieldSeparator) node).getOleObject() != null;
            }
            node = z ? node.getPreviousSibling() : node.getNextSibling();
        }
        return false;
    }

    private void zzY3(String str, String str2) throws Exception {
        this.zzXwl.zzYfW().zzZ5(str, com.aspose.words.internal.zzZYD.zzXk(str2) ? this.zzXwl.zzZqS().zzXp4.get(str2).intValue() : 0);
    }

    private void zzYer() throws Exception {
        if (isLocked()) {
            return;
        }
        this.zzXwl.zzYfW().zzCC("\\*\\xmlclose");
        this.zzXwl.zzYfW().zzYj3();
    }

    private void zzYes() {
        this.zzXqI = this.zzXqH.pop();
    }

    private void zzYet() throws Exception {
        this.zzXqH.push(this.zzXqI);
        this.zzXqI = new zzYF0(this.zzXwl);
    }

    private void zzYeu() throws Exception {
        if (this.zzXwl.getDocument().getVariables().getCount() > 0) {
            this.zzXwl.zzYfW().zzFg();
        }
        for (Map.Entry<String, String> entry : this.zzXwl.getDocument().getVariables()) {
            this.zzXwl.zzYfW().zzCC("\\*\\docvar");
            this.zzXwl.zzYfW().zzYj5();
            this.zzXwl.zzYfW().zzYV(entry.getKey());
            this.zzXwl.zzYfW().zzYj4();
            this.zzXwl.zzYfW().zzYj5();
            this.zzXwl.zzYfW().zzYV(entry.getValue());
            this.zzXwl.zzYfW().zzYj4();
            this.zzXwl.zzYfW().zzYj3();
        }
        if (this.zzXwl.getDocument().getVariables().getCount() > 0) {
            this.zzXwl.zzYfW().zzFg();
        }
    }

    private void zzYev() throws Exception {
        Shape backgroundShape = this.zzXwl.getDocument().getBackgroundShape();
        if (backgroundShape == null) {
            return;
        }
        this.zzXwl.zzYfW().zzFg();
        this.zzXwl.zzYfW().zzCC("\\*\\background");
        this.zzXwl.zzYeg().zzZ3(backgroundShape);
        this.zzXwl.zzYfW().zzYj3();
        this.zzXwl.zzYfW().zzFg();
    }

    private void zzYew() throws Exception {
        com.aspose.words.internal.zzZYT<Integer> zzzyt = this.zzXwl.zzZqS().zzXp4;
        if (zzzyt.getCount() == 0) {
            return;
        }
        this.zzXwl.zzYfW().zzFg();
        this.zzXwl.zzYfW().zzCC("\\*\\xmlnstbl");
        Iterator<Map.Entry<K, V>> it = zzzyt.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            this.zzXwl.zzYfW().zzYj5();
            this.zzXwl.zzYfW().zzZ5("\\xmlns", ((Integer) entry.getValue()).intValue());
            this.zzXwl.zzYfW().zzYV((String) entry.getKey());
            this.zzXwl.zzYfW().zzYj4();
        }
        this.zzXwl.zzYfW().zzYj3();
        this.zzXwl.zzYfW().zzFg();
    }

    private void zzYex() {
        for (Style style : this.zzXwl.getDocument().getStyles()) {
            if (style.getType() == 1 && style.zzY3v() == 12287) {
                style.getFont().setSize(style.getFont().getSize());
                style.getFont().setSizeBi(style.getFont().getSizeBi());
            }
        }
    }

    private void zzYq(Paragraph paragraph) throws Exception {
        if (!paragraph.zzZ0R()) {
            paragraph.zzYoX();
        }
        this.zzXwl.zzYfW().zzCC("\\listtext");
        this.zzXwl.zzYfW().zzCD("\\pard");
        this.zzXwl.zzYfW().zzCD("\\plain");
        boolean z = paragraph.zzYoT() && !paragraph.isDeleteRevision();
        ListLevel listLevelZzRB = paragraph.zzRB(z);
        if (listLevelZzRB.zzYOc() != 12287) {
            this.zzXwl.zzYfW().zzZ5("\\s", listLevelZzRB.zzYOc());
        }
        this.zzXwl.zzYek().zzY(listLevelZzRB.zzZYj(), false, false);
        ListLabel listLabel = paragraph.getListLabel();
        this.zzXwl.zzYel().zzw(listLabel.zzU(true, 1));
        this.zzXwl.zzYfW().zzYV(z ? listLabel.zzYOt() : listLabel.zzYOu());
        int trailingCharacter = listLevelZzRB.getTrailingCharacter();
        if (trailingCharacter == 0) {
            this.zzXwl.zzYfW().zzYV(ControlChar.TAB);
        } else if (trailingCharacter == 1) {
            this.zzXwl.zzYfW().zzYV(ControlChar.zzZs5);
        }
        this.zzXwl.zzYfW().zzYj3();
    }

    private void zzYr(Paragraph paragraph) throws Exception {
        if (paragraph.zzYp3() || paragraph.zzYp2()) {
            return;
        }
        this.zzXwl.zzYfW().zzYj5();
        this.zzXwl.zzYel().zzw(paragraph.zzqv(0));
        if (paragraph.isEndOfCell()) {
            if (this.zzXqI.zzYf5()) {
                this.zzXwl.zzYfW().zzCD("\\nestcell");
                this.zzXwl.zzYfW().zzCC("\\nonesttables");
                this.zzXwl.zzYfW().write("\\par");
                this.zzXwl.zzYfW().zzYj3();
            } else {
                this.zzXwl.zzYfW().zzCD("\\cell");
            }
        } else if (paragraph.isEndOfSection()) {
            this.zzXwl.zzYfW().zzCD(paragraph.isEndOfDocument() ? "\\par" : "\\sect");
        } else {
            this.zzXwl.zzYfW().zzCD("\\par");
        }
        this.zzXwl.zzYfW().zzYj4();
    }

    private void zzYs(Paragraph paragraph) throws Exception {
        zzYr(paragraph);
        if (paragraph.zzYp9()) {
            Row row = (Row) paragraph.zzYBd().zzYBd();
            zzYEF zzyefZzqv = paragraph.zzqv(0);
            row.zzZYf().zzX(zzyefZzqv, 12);
            if (row.zzZYf().getHidden()) {
                zzyefZzqv.set(130, zzZU.zzZF6);
            } else {
                zzyefZzqv.remove(130);
            }
            zzZ(row, zzyefZzqv);
        }
        this.zzXwl.zzYfW().zzFg();
    }

    private void zzYye() throws Exception {
        for (Node node : this.zzXRL) {
            int nodeType = node.getNodeType();
            if (nodeType == 33) {
                zzY((CommentRangeStart) node);
            } else if (nodeType != 34) {
                switch (nodeType) {
                    case 9:
                        zzW((BookmarkStart) node);
                        break;
                    case 10:
                        zzW((BookmarkEnd) node);
                        break;
                    case 11:
                        zzYHJ.zzZ(this.zzXwl, (EditableRangeStart) node);
                        break;
                    case 12:
                        zzYHJ.zzZ(this.zzXwl, (EditableRangeEnd) node);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected node type.");
                }
            } else {
                zzY((CommentRangeEnd) node);
            }
        }
        this.zzXRL.clear();
    }

    private static boolean zzZH(Shape shape) {
        return shape.getPreviousSibling() != null && shape.getPreviousSibling().getNodeType() == 35 && shape.zzYvW().zzVE(780);
    }

    private Map<Node, Field> zzZqO() {
        if (this.zzYTq == null) {
            zzZQC zzzqc = new zzZQC(23);
            this.zzYTq = zzzqc;
            zzzqc.zzZQ(this.zzXwl.getDocument());
        }
        return this.zzYTq.zzZqO();
    }

    private static boolean zznl(int i) {
        return i == 4 || i == 9;
    }

    private static String zzo(Cell cell) {
        Table parentTable = cell.getParentRow().getParentTable();
        if (parentTable == null) {
            return "";
        }
        TableStyle tableStyle = (TableStyle) parentTable.getStyle();
        if (!tableStyle.zzZYa()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (ConditionalStyle conditionalStyle : tableStyle.getConditionalStyles().zzZY9()) {
            if (tableStyle.zzZ(cell, conditionalStyle)) {
                com.aspose.words.internal.zzZNH.zzU(sb, zzYHY.zzp3(conditionalStyle.zzZYk()));
            }
        }
        if (tableStyle.zzZ7j() != 11) {
            com.aspose.words.internal.zzZNH.zzU(sb, "\\yts");
            sb.append(tableStyle.zzZ7j());
        }
        return sb.toString();
    }

    private static boolean zzp(FieldChar fieldChar) {
        if (fieldChar.getFieldType() != 56) {
            return false;
        }
        return zzWD(fieldChar);
    }

    private void zzq(Row row) throws Exception {
        int styleOptions = row.zzZYf().getStyleOptions();
        if ((styleOptions & 32) != 0) {
            this.zzXwl.zzYfW().zzCD("\\tbllkhdrrows");
        }
        if ((styleOptions & 64) != 0) {
            this.zzXwl.zzYfW().zzCD("\\tbllklastrow");
        }
        if ((styleOptions & 128) != 0) {
            this.zzXwl.zzYfW().zzCD("\\tbllkhdrcols");
        }
        if ((styleOptions & 256) != 0) {
            this.zzXwl.zzYfW().zzCD("\\tbllklastcol");
        }
        if ((styleOptions & 512) == 0) {
            this.zzXwl.zzYfW().zzCD("\\tbllknorowband");
        }
        if ((styleOptions & 1024) == 0) {
            this.zzXwl.zzYfW().zzCD("\\tbllknocolband");
        }
    }

    private void zzu(zzYEF zzyef) throws Exception {
        this.zzXwl.zzYfW().zzCC("\\mr");
        this.zzXwl.zzYfW().zz7("\\mnor", zzyef.zzYdI());
        this.zzXwl.zzYfW().zzZ5("\\mscr", zzyef.zzYdH());
        this.zzXwl.zzYfW().zzZ5("\\msty", zzyef.zzYdG());
        if (zzyef.zzYdF() != null) {
            zzYGE.zzZ(zzyef.zzYdF(), this.zzXwl.zzYfW());
        }
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitAbsolutePositionTab(AbsolutePositionTab absolutePositionTab) throws Exception {
        this.zzXwl.zzYfW().zzCC(zzYEO.zznB(absolutePositionTab.zzc0()));
        this.zzXwl.zzYfW().zzCD(zzYEO.zzVS(absolutePositionTab.getAlignment(), absolutePositionTab.zzc1()));
        this.zzXwl.zzYfW().zzYj3();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBodyEnd(Body body) throws Exception {
        zzYye();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBodyStart(Body body) {
        if (this.zzXqD) {
            return 0;
        }
        this.zzXqD = true;
        return body.zzYB3() ? 0 : 1;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBookmarkEnd(BookmarkEnd bookmarkEnd) throws Exception {
        if (isLocked()) {
            return 0;
        }
        if (bookmarkEnd.zzYAY() == 6) {
            zzW(bookmarkEnd);
        } else {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<BookmarkEnd>) this.zzXRL, bookmarkEnd);
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBookmarkStart(BookmarkStart bookmarkStart) throws Exception {
        if (isLocked()) {
            return 0;
        }
        if (bookmarkStart.zzYAY() == 6) {
            zzW(bookmarkStart);
        } else {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<BookmarkStart>) this.zzXRL, bookmarkStart);
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCellEnd(Cell cell) {
        this.zzXqz.pop();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCellStart(Cell cell) {
        this.zzXqz.push(zzo(cell));
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentEnd(Comment comment) throws Exception {
        if (isLocked()) {
            return 0;
        }
        zzYye();
        this.zzXwl.zzYfW().zzYj3();
        this.zzXwl.zzYfW().zzFg();
        zzYes();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentRangeEnd(CommentRangeEnd commentRangeEnd) throws Exception {
        if (isLocked()) {
            return 0;
        }
        if (commentRangeEnd.zzYAY() == 6) {
            zzY(commentRangeEnd);
        } else {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<CommentRangeEnd>) this.zzXRL, commentRangeEnd);
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentRangeStart(CommentRangeStart commentRangeStart) throws Exception {
        if (isLocked()) {
            return 0;
        }
        if (commentRangeStart.zzYAY() == 6) {
            zzY(commentRangeStart);
        } else {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<CommentRangeStart>) this.zzXRL, commentRangeStart);
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentStart(Comment comment) throws Exception {
        if (isLocked()) {
            return 0;
        }
        zzYet();
        this.zzXwl.zzYfW().zzFg();
        this.zzXwl.zzYfW().zzY6("\\*\\atnid", comment.getInitial());
        this.zzXwl.zzYfW().zzY6("\\*\\atnauthor", comment.getAuthor());
        this.zzXwl.zzYfW().zzCD("\\chatn");
        this.zzXwl.zzYfW().zzCC("\\*\\annotation");
        if (this.zzXwl.zzZqS().zzL(comment)) {
            this.zzXwl.zzYfW().zzZ4("\\*\\atnref", comment.getId());
        }
        if (!com.aspose.words.internal.zzZQ9.zzZ(comment.zzZZU(), com.aspose.words.internal.zzZQ9.zz35)) {
            this.zzXwl.zzYfW().zzY6("\\*\\atndate", Integer.toString(zzKE.zzt(comment.zzZZU())));
        }
        this.zzYzW.add(comment.getId());
        if (comment.getParentId() != -1) {
            this.zzXwl.zzYfW().zzZ4("\\*\\atnparent", this.zzYzW.indexOf(comment.getParentId()) - (this.zzYzW.getCount() - 1));
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitDocumentEnd(Document document) throws Exception {
        this.zzXwl.zzYfW().flush();
        this.zzXwl.zzYfW().zzZ(new zzYF6(this.zzdy));
        this.zzXwl.zzYfW().zzYj5();
        zzYGZ.zzZ(this.zzXwl);
        zzYGV.zzZ(this.zzXwl);
        zzYew();
        this.zzXqJ.zzYg2();
        zzYHL.zzZ(this.zzXwl, this.zzZG0);
        zzYev();
        zzYeu();
        this.zzXwl.zzYfW().flush();
        this.zzXqK.zzZH(this.zzdy);
        zzYEV.zzZ(this.zzXwl);
        zzYGT.zzZ(this.zzXwl);
        if (document.getCustomXmlParts().getCount() > 0 || document.getCustomXmlParts().zzZTF() != null) {
            this.zzXwl.zzYfW().zzFg();
            this.zzXwl.zzYfW().zzCC("\\*\\datastore");
            this.zzXwl.zzYfW().zzFh();
            this.zzXwl.zzYfW().zzXQ(document.getCustomXmlParts().getCount() > 0 ? zzKN.zzY(document.getCustomXmlParts()) : document.getCustomXmlParts().zzZTF());
            this.zzXwl.zzYfW().zzYj3();
        }
        this.zzXwl.zzYfW().zzYj4();
        this.zzXwl.zzYfW().flush();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitDocumentStart(Document document) {
        this.zzXwl.zzYeg().zzP(this.zzXwl);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitEditableRangeEnd(EditableRangeEnd editableRangeEnd) throws Exception {
        if (editableRangeEnd.zzYAY() == 6) {
            zzYHJ.zzZ(this.zzXwl, editableRangeEnd);
            return 0;
        }
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<EditableRangeEnd>) this.zzXRL, editableRangeEnd);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitEditableRangeStart(EditableRangeStart editableRangeStart) throws Exception {
        if (editableRangeStart.zzYAY() == 6) {
            zzYHJ.zzZ(this.zzXwl, editableRangeStart);
            return 0;
        }
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<EditableRangeStart>) this.zzXRL, editableRangeStart);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldEnd(FieldEnd fieldEnd) throws Exception {
        if (fieldEnd.getFieldType() == 67) {
            this.zzXwl.zzRf(false);
        }
        int fieldType = fieldEnd.getFieldType();
        if (fieldType == 4) {
            unlock();
            zzI(fieldEnd);
            this.zzXwl.zzYfW().zzYj4();
        } else if (fieldType != 9) {
            boolean z = true;
            if (fieldType != 56) {
                if (fieldType == 90 || fieldType == 53 || fieldType == 54) {
                    zzL(fieldEnd);
                } else {
                    zzYHG zzyhgZzYeh = this.zzXwl.zzYeh();
                    if (!fieldEnd.hasSeparator() && !fieldEnd.isDeleteRevision()) {
                        z = false;
                    }
                    zzyhgZzYeh.zzRp(z);
                }
            } else if (zzWD(fieldEnd)) {
                zzYG6.zzS(this.zzXwl);
            } else {
                zzYHG zzyhgZzYeh2 = this.zzXwl.zzYeh();
                if (!fieldEnd.hasSeparator() && !fieldEnd.isDeleteRevision()) {
                    z = false;
                }
                zzyhgZzYeh2.zzRp(z);
            }
        } else {
            unlock();
            zzJ(fieldEnd);
            this.zzXwl.zzYfW().zzYj4();
        }
        zzK(fieldEnd);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldSeparator(FieldSeparator fieldSeparator) throws Exception {
        if (fieldSeparator.getFieldType() == 67) {
            this.zzXwl.zzRf(true);
        }
        this.zzXwl.zzYfW().zzFg();
        Field field = (Field) com.aspose.words.internal.zzQW.zzZ((Map<FieldSeparator, TValue>) zzZqO(), fieldSeparator);
        if (zzZKO.zzAd(fieldSeparator.getFieldType()) && zzZKO.zzc(field)) {
            com.aspose.words.internal.zzZOW zzzow = new com.aspose.words.internal.zzZOW(new com.aspose.words.internal.zzZOR());
            try {
                zzZKO.zzZ(zzzow, (Field) com.aspose.words.internal.zzQW.zzZ((Map<FieldSeparator, TValue>) zzZqO(), fieldSeparator));
                this.zzXwl.zzYfW().zzY6("\\*\\datafield", com.aspose.words.internal.zzZYD.zzZ8(((com.aspose.words.internal.zzZOR) zzzow.zzq()).zzWy()).toLowerCase());
            } finally {
                zzzow.close();
            }
        }
        if (zzp(fieldSeparator)) {
            zzYG6.zzZ(this.zzXwl, this.zzXqE.toString(), fieldSeparator.getOleObject());
            this.zzXqF = false;
            this.zzXqE.setLength(0);
        } else if (!zznl(fieldSeparator.getFieldType())) {
            this.zzXwl.zzYeh().zzYiH();
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldStart(FieldStart fieldStart) throws Exception {
        this.zzXqB.push(fieldStart);
        this.zzXwl.zzYfW().zzFg();
        int fieldType = fieldStart.getFieldType();
        if (fieldType == 4 || fieldType == 9) {
            zzYEF zzyefZzZ = zzZ7R.zzZ(fieldStart, 0);
            this.zzXwl.zzYfW().zzYj5();
            zzyefZzZ.zzQ(130, zzZU.zzZF6);
            this.zzXwl.zzYel().zzw(zzyefZzZ);
            if (!isLocked()) {
                this.zzXqC = fieldStart;
            }
            lock();
        } else if (fieldType == 56 && zzWD(fieldStart)) {
            this.zzXqF = true;
        } else {
            this.zzXwl.zzYeh().zzy(fieldStart.isLocked(), fieldStart.isDirty());
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFootnoteEnd(Footnote footnote) throws Exception {
        zzYye();
        this.zzXwl.zzYfW().zzYj3();
        if (!footnote.isAuto()) {
            this.zzXwl.zzYfW().zzYV(footnote.getReferenceMark().substring(1, footnote.getReferenceMark().length()));
        }
        this.zzXwl.zzYfW().zzYj4();
        this.zzXwl.zzYfW().zzFg();
        zzYes();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFootnoteStart(Footnote footnote) throws Exception {
        zzYet();
        zzF(footnote);
        this.zzXwl.zzYfW().zzFg();
        this.zzXwl.zzYfW().zzYj5();
        this.zzXwl.zzYel().zzW(zzZ7R.zzZ(footnote, 0), true);
        if (footnote.isAuto()) {
            this.zzXwl.zzYfW().zzCD("\\chftn");
        } else if (com.aspose.words.internal.zzZKN.equals(footnote.getReferenceMark(), ControlChar.PARAGRAPH_BREAK)) {
            this.zzXwl.zzYfW().zzCD("\r");
        } else {
            if (footnote.getReferenceMark().length() > 1) {
                zz2("RTF format can only store 1 symbol as custom reference mark, other symbols will be truncated.");
            }
            this.zzXwl.zzYfW().zzYV(Character.toString(footnote.getReferenceMark().charAt(0)));
        }
        this.zzXwl.zzYfW().zzCC("\\footnote");
        this.zzXwl.zzYfW().zz7("\\ftnalt", footnote.getFootnoteType() == 1);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFormField(FormField formField) throws Exception {
        if (isLocked()) {
            return 0;
        }
        if (!zzZOO.zzCJ(formField.getType())) {
            return 1;
        }
        this.zzXwl.zzYfW().zzFg();
        this.zzXwl.zzYeh().zzS(formField);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitGroupShapeEnd(GroupShape groupShape) throws Exception {
        if (isLocked()) {
            return 0;
        }
        this.zzXwl.zzYeg().zzYX(groupShape);
        this.zzXwl.zzYfW().zzFg();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitGroupShapeStart(GroupShape groupShape) throws Exception {
        if (isLocked()) {
            return 0;
        }
        this.zzXwl.zzYfW().zzFg();
        this.zzXwl.zzYeg().zzYY(groupShape);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitHeaderFooterEnd(HeaderFooter headerFooter) throws Exception {
        zzYye();
        if (!headerFooter.isLinkedToPrevious()) {
            this.zzXwl.zzSB(false);
            this.zzXwl.zzYfW().zzYj3();
            this.zzXwl.zzYfW().zzFg();
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitHeaderFooterStart(HeaderFooter headerFooter) throws Exception {
        if (headerFooter.isLinkedToPrevious()) {
            return 0;
        }
        this.zzXwl.zzSB(true);
        this.zzXwl.zzYfW().zzFg();
        this.zzXwl.zzYfW().zzCC(zzYGD.zzZn(headerFooter.getHeaderFooterType(), this.zzXqG));
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitOfficeMathEnd(OfficeMath officeMath) throws Exception {
        this.zzXwl.zzYfW().zzYj3();
        this.zzXSv--;
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitOfficeMathStart(OfficeMath officeMath) throws Exception {
        if (this.zzXSv == 0) {
            this.zzXwl.zzYfW().zzCC("\\mmath");
        }
        this.zzXSv++;
        zzYGE.zzZ(officeMath, this.zzXwl);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphEnd(Paragraph paragraph) throws Exception {
        if (isLocked()) {
            return 0;
        }
        zzYs(paragraph);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphStart(Paragraph paragraph) throws Exception {
        if (isLocked()) {
            return 0;
        }
        this.zzXwl.zzYfW().zzFg();
        this.zzXqI.zzYf8();
        this.zzXwl.zzYfW().zzCD("\\pard");
        this.zzXwl.zzYfW().zzCD("\\plain");
        this.zzXwl.zzYfW().zz7("\\intbl", this.zzXqI.zzYTl() > 0);
        this.zzXwl.zzYfW().zzZ5("\\itap", this.zzXqI.zzYTl());
        zzYMX zzymxZzqw = paragraph.zzqw(3);
        if (zzymxZzqw.zz6D()) {
            zzymxZzqw.zzYsN().zzY(paragraph.zzqw(18));
        }
        this.zzXwl.zzYek().zzY(zzymxZzqw, true, false);
        if (paragraph.zzZex() != null) {
            this.zzXwl.zzYfW().zzCD(this.zzXqz.peek());
        }
        this.zzXwl.zzYel().zzW(this.zzXwl.zzYec() ? paragraph.zzYp7().zzl1(1) : paragraph.zzYp7().zzl1(0), true);
        if (paragraph.zzZ0R() || paragraph.zzYoX()) {
            zzYq(paragraph);
        }
        zzYye();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRowEnd(Row row) throws Exception {
        if (isLocked()) {
            return 0;
        }
        this.zzXwl.zzYfW().zzFg();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRowStart(Row row) throws Exception {
        if (isLocked()) {
            return 0;
        }
        this.zzXwl.zzYfW().zzFg();
        this.zzXqI.zzt(row);
        zzq(row);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRun(Run run) throws Exception {
        if (isLocked()) {
            return 0;
        }
        if (this.zzXqF) {
            com.aspose.words.internal.zzZNH.zzU(this.zzXqE, run.getText());
        } else {
            String text = run.getText();
            FieldStart fieldStart = this.zzXqC;
            if (fieldStart != null && fieldStart.getFieldType() == 9) {
                text = text.replace("\r", "");
                if (com.aspose.words.internal.zzZKN.equals(text, "")) {
                    return 0;
                }
            }
            this.zzXwl.zzRe(zzE(run));
            zzV(zzZ7R.zzZ(run, 1), text);
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitSectionEnd(Section section) throws Exception {
        if (isLocked()) {
            return 0;
        }
        if (!section.getBody().zzYB3()) {
            section.getBody().accept(this);
        }
        this.zzXwl.zzYfW().zzFg();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitSectionStart(Section section) throws Exception {
        if (isLocked()) {
            return 0;
        }
        this.zzXqD = false;
        this.zzXwl.zzYfW().zzFg();
        this.zzXqJ.zzW(section.zzYvR());
        this.zzXwl.zzYfW().zzFg();
        this.zzXqG = section.getPageSetup().getOddAndEvenPagesHeaderFooter();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitShapeEnd(Shape shape) throws Exception {
        if (isLocked()) {
            return 0;
        }
        if (shape.hasChildNodes()) {
            zzYes();
        }
        this.zzXwl.zzYeg().zzYX(shape);
        this.zzXwl.zzYfW().zzFg();
        if (zzZH(shape)) {
            this.zzXwl.zzYfW().zzYj3();
            this.zzXwl.zzYfW().zzYj3();
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitShapeStart(Shape shape) throws Exception {
        if (isLocked()) {
            return 0;
        }
        if (zzZH(shape)) {
            this.zzXwl.zzYfW().zzCC("\\mmathPict");
        }
        this.zzXwl.zzYfW().zzFg();
        this.zzXwl.zzYeg().zzYY(shape);
        if (shape.hasChildNodes()) {
            zzYet();
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitSmartTagEnd(SmartTag smartTag) throws Exception {
        zzYer();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitSmartTagStart(SmartTag smartTag) throws Exception {
        zzZ(smartTag.getUri(), "\\factoidname", smartTag.getElement(), smartTag.getProperties());
        zzYye();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitSpecialChar(SpecialChar specialChar) throws Exception {
        if (isLocked()) {
            return 0;
        }
        zzV(zzZ7R.zzZ(specialChar, 0), specialChar.getText());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitStructuredDocumentTagStart(StructuredDocumentTag structuredDocumentTag) throws Exception {
        zz2("StructuredDocumentTags are not supported by RTF format.");
        return super.visitStructuredDocumentTagStart(structuredDocumentTag);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitSubDocument(SubDocument subDocument) throws Exception {
        com.aspose.words.internal.zzZQG.zzZ(this.zzXwl.zzYeo(), subDocument.getFileName());
        this.zzXwl.zzYfW().zzZ5("\\subdocument", this.zzXwl.zzYeo().size());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitTableEnd(Table table) throws Exception {
        if (isLocked()) {
            return 0;
        }
        this.zzXqI.zzGW();
        this.zzXwl.zzYfW().zzFg();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitTableStart(Table table) throws Exception {
        if (isLocked()) {
            return 0;
        }
        this.zzXwl.zzYfW().zzFg();
        this.zzXqI.zz9(table);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int zzY(zzYX6 zzyx6) throws Exception {
        zzYGA.zzZ(this.zzXwl, zzyx6, 1);
        return 0;
    }

    @Override // com.aspose.words.zzZBR
    public final SaveOutputParameters zzZ(zzYDZ zzydz) throws Exception {
        zzydz.zzYdc();
        this.zzZG0 = zzydz.zzYfy.getWarningCallback();
        this.zzdy = zzydz.zzXpb;
        this.zzXqK = new com.aspose.words.internal.zzZOR();
        zzYEM zzyem = new zzYEM(zzydz, this, new zzYF6(this.zzXqK));
        this.zzXwl = zzyem;
        this.zzXqJ = new zzYFK(zzyem);
        this.zzXqI = new zzYF0(this.zzXwl);
        this.zzXqH = new com.aspose.words.internal.zzZQC<>();
        this.zzXqF = false;
        this.zzXqE = new StringBuilder();
        zzYex();
        this.zzXwl.zzRd(zzydz.zzYfy.getStyles().zzYec());
        this.zzXwl.getDocument().accept(this);
        return new SaveOutputParameters("application/rtf");
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int zzY(zzYX9 zzyx9) throws Exception {
        zzYGA.zzZ(this.zzXwl, zzyx9, 1);
        return 0;
    }

    private void zzY(Node node, boolean z, Node node2, boolean z2) throws Exception {
        if (node == null || node2 == null) {
            return;
        }
        if (!z) {
            node = node.getNextSibling();
        }
        if (z2) {
            node2 = node2.getNextSibling();
        }
        if (z2 || node2.getNextSibling() != node) {
            while (node != null && node != node2) {
                int nodeType = node.getNodeType();
                if (nodeType == 9) {
                    BookmarkStart bookmarkStart = (BookmarkStart) node;
                    if (zzBs(bookmarkStart.getName())) {
                        zzW(bookmarkStart);
                    }
                } else if (nodeType == 10) {
                    BookmarkEnd bookmarkEnd = (BookmarkEnd) node;
                    if (zzBs(bookmarkEnd.getName())) {
                        zzW(bookmarkEnd);
                    }
                }
                node = node.getNextSibling();
            }
        }
    }

    private void zzW(BookmarkEnd bookmarkEnd) throws Exception {
        this.zzXwl.zzYfW().zzCC("\\*\\bkmkend");
        this.zzXwl.zzYfW().zzYV(bookmarkEnd.getName());
        this.zzXwl.zzYfW().zzYj3();
        this.zzXwl.zzYfW().zzFg();
    }

    private void zzY(CustomXmlProperty customXmlProperty) throws Exception {
        this.zzXwl.zzYfW().zzCC("\\xmlattr");
        zzY3("\\xmlattrns", customXmlProperty.getUri());
        this.zzXwl.zzYfW().zzY6("\\xmlattrname", customXmlProperty.getName());
        this.zzXwl.zzYfW().zzY6("\\xmlattrvalue", customXmlProperty.getValue());
        this.zzXwl.zzYfW().zzYj3();
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int zzZ(zzYX6 zzyx6) throws Exception {
        zzYGA.zzZ(this.zzXwl, zzyx6, 0);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int zzZ(zzYX9 zzyx9) throws Exception {
        zzYGA.zzZ(this.zzXwl, zzyx9, 0);
        return 0;
    }

    private void zzZ(Row row, zzYEF zzyef) throws Exception {
        if (this.zzXqI.zzYf5()) {
            this.zzXwl.zzYfW().zzCC("\\*\\nesttableprops");
            this.zzXqI.zzs(row);
            this.zzXwl.zzYel().zzW(zzyef, true);
            this.zzXwl.zzYfW().zzCD("\\nestrow");
            this.zzXwl.zzYfW().zzYj3();
            return;
        }
        if (row.zzZYf().contains(5015)) {
            int iIntValue = ((Integer) row.zzZYf().zzPk(5015)).intValue();
            this.zzXwl.zzYfW().zzCD("\\pard");
            this.zzXwl.zzYfW().zzZ5("\\ipgp", this.zzXwl.getDocument().zzZq2().indexOfKey(iIntValue) + 1);
        }
        this.zzXwl.zzYfW().zzYj5();
        this.zzXqI.zzs(row);
        zzq(row);
        this.zzXwl.zzYel().zzW(zzyef, true);
        this.zzXwl.zzYfW().zzCD("\\row");
        this.zzXwl.zzYfW().zzYj4();
    }

    private void zzY(CommentRangeStart commentRangeStart) throws Exception {
        this.zzXwl.zzYfW().zzZ4("\\*\\atrfstart", commentRangeStart.getId());
    }

    private void zzY(CommentRangeEnd commentRangeEnd) throws Exception {
        this.zzXwl.zzYfW().zzZ4("\\*\\atrfend", commentRangeEnd.getId());
    }

    private void zzZ(String str, String str2, String str3, CustomXmlPropertyCollection customXmlPropertyCollection) throws Exception {
        if (isLocked()) {
            return;
        }
        this.zzXwl.zzYfW().zzCC("\\*\\xmlopen");
        zzY3("\\xmlns", str);
        this.zzXwl.zzYfW().zzY6(str2, str3);
        Iterator<CustomXmlProperty> it = customXmlPropertyCollection.iterator();
        while (it.hasNext()) {
            zzY(it.next());
        }
        this.zzXwl.zzYfW().zzYj3();
    }
}
