package com.aspose.words;

import com.huawei.hms.network.embedded.C18115b5;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY57 extends zzZQF {
    private static com.aspose.words.internal.zzZNR zzX2i = new com.aspose.words.internal.zzZNR("[\\s\\p{Z}]", 0);
    private Bookmark zzX2j;
    private zzZ8Y zzX2k;
    private int zzX2l;
    private zzY51 zzX2m;
    private boolean zzX2v;
    private Paragraph zzXBS;
    private String zzYBu;
    private String zzYBy;
    private ArrayList<zzZ8Z> zzZDM = new ArrayList<>();
    private Document zzZEY;

    public static class zzZ extends com.aspose.words.internal.zzBY<zzZPE> {
        private Document zzZEY;

        public zzZ(Document document) {
            this.zzZEY = document;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzBY
        /* JADX INFO: renamed from: zzXUW, reason: merged with bridge method [inline-methods] */
        public zzZPE zzBL() {
            Document document = this.zzZEY;
            return new zzZPE(document, new zzYD(document));
        }
    }

    private zzY57(Document document, zzZ8Y zzz8y) throws Exception {
        this.zzZEY = document;
        this.zzX2k = zzz8y;
        if (zzz8y.zzZbQ()) {
            this.zzX2j = this.zzX2k.zzZbF();
        } else {
            this.zzX2v = true;
        }
        this.zzX2m = new zzY51(this.zzX2k);
    }

    private String getCaptionlessTableOfFiguresLabel() throws Exception {
        String str = this.zzYBu;
        if (str != null) {
            return str;
        }
        String strZzAb = zzAb(this.zzX2k.getCaptionlessTableOfFiguresLabel());
        this.zzYBu = strZzAb;
        return strZzAb;
    }

    private String getTableOfFiguresLabel() throws Exception {
        String str = this.zzYBy;
        if (str != null) {
            return str;
        }
        String strZzAb = zzAb(this.zzX2k.getTableOfFiguresLabel());
        this.zzYBy = strZzAb;
        return strZzAb;
    }

    private static String zzAb(String str) {
        return com.aspose.words.internal.zzZKN.zzU3(str) ? "" : zzX2i.zzZS(str, C18115b5.CONNECTOR);
    }

    private zzYMF zzK(Paragraph paragraph, int i) {
        if (!zzZ5S.zzxU(i)) {
            return null;
        }
        if (this.zzX2v) {
            return new zzYMF(i);
        }
        Bookmark bookmark = this.zzX2j;
        if (bookmark != null && zzZ(paragraph, bookmark.getBookmarkStart())) {
            return new zzYMF(i, this.zzX2j.getBookmarkStart(), null);
        }
        return null;
    }

    private boolean zzL(Paragraph paragraph, int i) {
        zzYMF zzymfZzK;
        if (!zzZ5S.zzxU(i) || (zzymfZzK = zzK(paragraph, i)) == null) {
            return false;
        }
        zzZ(paragraph, zzymfZzK);
        return true;
    }

    private void zzM(Paragraph paragraph, int i) {
        this.zzZDM.add(new zzZKM(paragraph, i));
    }

    private boolean zzR(FieldSeq fieldSeq) throws Exception {
        return (fieldSeq.zzZcp() || fieldSeq.zzZcq() || (!com.aspose.words.internal.zzZYD.zzi(fieldSeq.getSequenceIdentifier(), getTableOfFiguresLabel()) && !com.aspose.words.internal.zzZYD.zzi(fieldSeq.getSequenceIdentifier(), getCaptionlessTableOfFiguresLabel()))) ? false : true;
    }

    private void zzS(FieldSeq fieldSeq) throws Exception {
        if (this.zzX2k.zzZbN() && zzR(fieldSeq)) {
            Paragraph parentParagraph = fieldSeq.getStart().getParentParagraph();
            Node firstChild = com.aspose.words.internal.zzZKN.zzU3(this.zzX2k.getCaptionlessTableOfFiguresLabel()) ? parentParagraph.getFirstChild() : zzZQ(fieldSeq);
            zzZ(parentParagraph, firstChild != null ? new zzYMF(1, firstChild, parentParagraph.getLastChild()) : zzYMF.zzXFZ);
        }
    }

    public static ArrayList<zzZ8Z> zzV(Document document, boolean z) throws Exception {
        zzY56 zzy56 = new zzY56();
        zzy56.zzPB(!z);
        zzY57 zzy57 = new zzY57(document, zzy56);
        document.updateListLabels();
        zzy57.zzXV0();
        return zzy57.zzZDM;
    }

    private boolean zzWe(Node node) throws Exception {
        Bookmark bookmark = this.zzX2j;
        return bookmark != null && node == bookmark.getBookmarkEnd();
    }

    private boolean zzWf(Node node) {
        Bookmark bookmark = this.zzX2j;
        return bookmark != null && node == bookmark.getBookmarkStart();
    }

    private void zzX(FieldRD fieldRD) throws Exception {
        Document documentZzZ;
        if (this.zzX2k.zzZbG() && (documentZzZ = zzZQ3.zzZ(fieldRD)) != null) {
            ArrayList<zzZ8Z> arrayListZzZ = zzZ(documentZzZ, new zzYJX(this.zzX2k));
            if (arrayListZzZ.size() == 0) {
                return;
            }
            documentZzZ.updateListLabels();
            zzZ zzz = new zzZ(documentZzZ);
            Iterator<zzZ8Z> it = arrayListZzZ.iterator();
            while (it.hasNext()) {
                this.zzZDM.add(new zzYJY(it.next(), documentZzZ, zzz));
            }
        }
    }

    private void zzXUY() {
        int i = this.zzX2l;
        if (i > 0) {
            this.zzX2l = i - 1;
        }
    }

    private void zzXUZ() {
        this.zzX2l++;
    }

    private void zzXV0() throws Exception {
        Iterator<T> it = this.zzZEY.getSections().iterator();
        while (it.hasNext() && ((Section) it.next()).getBody().accept(this)) {
        }
    }

    private boolean zzXY(Paragraph paragraph) throws Exception {
        return (this.zzX2k.getUseParagraphOutlineLevel() && zzY51.zzXW(paragraph) == -1) ? false : true;
    }

    private void zzXZ(Paragraph paragraph) throws Exception {
        if (!this.zzX2k.zzZbN() || this.zzX2k.zzZbM()) {
            if (!this.zzX2k.zzZbL() || this.zzX2k.zzZbM()) {
                if (zzXY(paragraph) && zzL(paragraph, this.zzX2m.zzXX(paragraph))) {
                    return;
                }
                zzZ(paragraph, this.zzX2k.zzZbJ());
            }
        }
    }

    private void zzY(Paragraph paragraph, zzYMF zzymf) {
        Node firstChild = (zzymf.getFirstChild() != null || zzymf.zzYo2()) ? zzymf.getFirstChild() : paragraph.zzZYv();
        Node lastChild = (zzymf.getLastChild() != null || zzymf.zzYo2()) ? zzymf.getLastChild() : paragraph.zzZYu();
        boolean z = false;
        if (firstChild != null && lastChild != null) {
            boolean z2 = false;
            boolean z3 = false;
            for (Node node : new zzYWB(firstChild, lastChild)) {
                if (node == firstChild) {
                    z2 = true;
                }
                if (node == this.zzX2k.getEnd()) {
                    z3 = true;
                }
                if (node == this.zzX2k.getStart() && node != firstChild && z2) {
                    zzZ(paragraph, zzymf.getLevel(), firstChild, this.zzX2k.getStart().getPreviousSibling());
                } else if (node == lastChild && node != this.zzX2k.getEnd() && z3) {
                    zzZ(paragraph, zzymf.getLevel(), this.zzX2k.getEnd().getNextSibling(), lastChild);
                }
                z = true;
            }
        }
        if (z) {
            return;
        }
        zzX(paragraph, zzymf);
    }

    private boolean zzY0(Paragraph paragraph) throws Exception {
        if (!this.zzX2k.getUseParagraphOutlineLevel()) {
            return false;
        }
        if (this.zzX2k.zzZbL() && !this.zzX2k.zzZbM()) {
            return false;
        }
        int iZzXW = zzY51.zzXW(paragraph);
        if (this.zzX2k.zzZbJ().zzxV(iZzXW)) {
            return zzL(paragraph, iZzXW);
        }
        return false;
    }

    private boolean zzY1(Paragraph paragraph) throws Exception {
        if (!this.zzX2k.zzZbL()) {
            return false;
        }
        if (zzL(paragraph, this.zzX2k.zzY(paragraph, paragraph.zzqy(1)))) {
            return true;
        }
        if (!this.zzX2k.zzZbL() || this.zzX2k.zzZbM()) {
            return zzZ(paragraph, zzZ5S.zzYeW);
        }
        return false;
    }

    private void zzY2(Paragraph paragraph) throws Exception {
        if (zzYc(paragraph)) {
            return;
        }
        if (!zzZlU() || paragraph.zzYoT()) {
            if ((this.zzX2k.zzZbP() && !this.zzX2k.zzZbM() && !this.zzX2k.zzZbL()) || zzY1(paragraph) || zzY0(paragraph)) {
                return;
            }
            zzXZ(paragraph);
        }
    }

    private static boolean zzYc(Paragraph paragraph) {
        return paragraph.zzYp8() && paragraph.getRuns().getCount() == 0;
    }

    public static ArrayList<zzZ8Z> zzZ(Document document, zzZ8Y zzz8y) throws Exception {
        zzY57 zzy57 = new zzY57(document, zzz8y);
        zzy57.zzXV0();
        return zzy57.zzZDM;
    }

    private static Node zzZP(Field field) {
        Node end = field.getEnd();
        while (true) {
            end = end.getNextSibling();
            if (end == null) {
                return null;
            }
            if (!zzYVU.zztq(end.getNodeType()) && (end.getNodeType() != 21 || ((Run) end).getText().length() != 0)) {
                break;
            }
        }
        return end;
    }

    private static Node zzZQ(Field field) {
        Node nodeZzZP = zzZP(field);
        Run run = (Run) com.aspose.words.internal.zzZKW.zzZ(nodeZzZP, Run.class);
        return run == null ? nodeZzZP : (com.aspose.words.internal.zzZYD.zzj(run.getText().charAt(0)) && run.zzng(1) == null) ? run.getNextSibling() : run;
    }

    private boolean zzZlU() {
        return this.zzX2l > 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBookmarkEnd(BookmarkEnd bookmarkEnd) throws Exception {
        return zzWe(bookmarkEnd) ? 2 : 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBookmarkStart(BookmarkStart bookmarkStart) {
        this.zzX2v = this.zzX2v || zzWf(bookmarkStart);
        return 0;
    }

    @Override // com.aspose.words.zzZQF, com.aspose.words.DocumentVisitor
    public final int visitFieldEnd(FieldEnd fieldEnd) throws Exception {
        int iZzCF = zzZOO.zzCF(fieldEnd.getFieldType());
        boolean zHasSeparator = true;
        if (iZzCF != 0) {
            if (iZzCF == 1) {
                zHasSeparator = true ^ fieldEnd.hasSeparator();
            } else {
                if (iZzCF != 2) {
                    throw new IllegalArgumentException();
                }
                zHasSeparator = false;
            }
        }
        if (zHasSeparator) {
            zzXUY();
        }
        return super.visitFieldEnd(fieldEnd);
    }

    @Override // com.aspose.words.zzZQF, com.aspose.words.DocumentVisitor
    public final int visitFieldSeparator(FieldSeparator fieldSeparator) throws Exception {
        zzXUY();
        return super.visitFieldSeparator(fieldSeparator);
    }

    @Override // com.aspose.words.zzZQF, com.aspose.words.DocumentVisitor
    public final int visitFieldStart(FieldStart fieldStart) throws Exception {
        zzXUZ();
        return super.visitFieldStart(fieldStart);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphStart(Paragraph paragraph) throws Exception {
        zzY2(paragraph);
        return 0;
    }

    public final zzY51 zzXUX() {
        return this.zzX2m;
    }

    @Override // com.aspose.words.zzZQF
    public final void zzZe8() throws Exception {
        if (!this.zzX2k.zzZbQ() || this.zzX2v) {
            int iZzZe6 = zzZe6();
            if (iZzZe6 == 9) {
                zzZ((FieldTC) zzZe7());
            } else if (iZzZe6 == 11) {
                zzX((FieldRD) zzZe7());
            } else {
                if (iZzZe6 != 12) {
                    return;
                }
                zzS((FieldSeq) zzZe7());
            }
        }
    }

    private void zzZ(FieldTC fieldTC) throws Exception {
        if ((this.zzX2k.zzZbP() || this.zzX2k.zzZbO()) && this.zzX2k.zzZbK().zzxV(fieldTC.getLevel())) {
            if (this.zzX2k.zzuZ() < 0) {
                this.zzZDM.add(fieldTC);
            } else {
                if (this.zzX2k.zzuZ() != zzZQ3.zzLV(fieldTC.getTypeIdentifier())) {
                    return;
                }
                this.zzZDM.add(fieldTC);
            }
        }
    }

    private void zzX(Paragraph paragraph, zzYMF zzymf) {
        this.zzZDM.add(new zzYMG(paragraph, zzymf));
    }

    private void zzZ(Paragraph paragraph, zzYMF zzymf) {
        if ((!this.zzX2k.zzZbH() || paragraph.getAncestor(5) == null) && this.zzXBS != paragraph) {
            this.zzXBS = paragraph;
            if (zzZlU()) {
                zzM(paragraph, zzymf.getLevel());
            } else {
                zzY(paragraph, zzymf);
            }
        }
    }

    private void zzZ(Paragraph paragraph, int i, Node node, Node node2) {
        zzX(paragraph, new zzYMF(i, node, node2));
    }

    private static boolean zzZ(Paragraph paragraph, BookmarkStart bookmarkStart) {
        boolean zZzYF = bookmarkStart.zzYF(paragraph);
        Node previousSibling = bookmarkStart;
        if (!zZzYF) {
            return false;
        }
        while (previousSibling != paragraph) {
            while (true) {
                if (previousSibling.getPreviousSibling() != null) {
                    previousSibling = previousSibling.getPreviousSibling();
                    if (previousSibling instanceof zzZAM) {
                        Run run = (Run) com.aspose.words.internal.zzZKW.zzZ(previousSibling, Run.class);
                        if (run == null || !com.aspose.words.internal.zzZKN.equals(run.getText(), ControlChar.PAGE_BREAK)) {
                            return false;
                        }
                    }
                }
            }
            previousSibling = previousSibling.getParentNode();
        }
        return true;
    }

    private boolean zzZ(Paragraph paragraph, zzZ5S zzz5s) throws Exception {
        zzY54 zzy54 = new zzY54(this, zzz5s);
        boolean z = this.zzX2v;
        boolean z2 = false;
        boolean z3 = false;
        for (Node node : new zzYWB(paragraph, paragraph)) {
            int nodeType = node.getNodeType();
            if (nodeType == 22) {
                if (((FieldStart) node).getFieldType() == 13) {
                    z2 = true;
                }
            } else if (nodeType == 24 && ((FieldEnd) node).getFieldType() == 13) {
                z2 = false;
            }
            if (!z2) {
                if (nodeType != 21) {
                    if (nodeType == 9) {
                        z = z || (zzWf(node) && zzZ(paragraph, (BookmarkStart) node));
                    } else if (nodeType == 10 && zzWe(node)) {
                        break;
                    }
                } else if (z && zzZ(zzy54, (Run) node, paragraph)) {
                    z3 = true;
                }
            }
        }
        return z3;
    }

    private boolean zzZ(zzY54 zzy54, Run run, Paragraph paragraph) throws Exception {
        int iZzZ = zzy54.zzZ(run, paragraph);
        if (!zzZ5S.zzxU(iZzZ)) {
            return false;
        }
        zzZ(run.getParentParagraph(), new zzYMF(iZzZ, run, zzZ(run, iZzZ, paragraph)));
        return true;
    }

    private Node zzZ(Run run, int i, Paragraph paragraph) throws Exception {
        if (run == null) {
            return null;
        }
        for (Node node : new zzYWB(run, false, paragraph, true)) {
            int nodeType = node.getNodeType();
            if (nodeType != 21) {
                if (nodeType == 34) {
                    break;
                }
            } else {
                Run run2 = (Run) node;
                if (i != this.zzX2m.zzZ(run2, paragraph)) {
                    break;
                }
                run = run2;
            }
        }
        return run;
    }
}
