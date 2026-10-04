package com.aspose.words;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes6.dex */
final class zzYQA {
    private Paragraph zzXNf;
    private boolean zzXOC;
    private zzYTN zzXQW;
    private zzYPM zzXRS;
    private zzYOR zzXRT;

    public zzYQA(zzYOR zzyor, zzYPM zzypm, zzYTN zzytn) {
        this.zzXRT = zzyor;
        this.zzXRS = zzypm;
        this.zzXQW = zzytn;
    }

    private boolean zzB(boolean z, boolean z2) {
        return (z || z2) && this.zzXRT.getPreviousSibling() == null;
    }

    private static boolean zzP(zzYMX zzymx) {
        return zzymx.zzYpy() == 1 && zzymx.zzYpz() == 1;
    }

    private static boolean zzS(Paragraph paragraph, Paragraph paragraph2) {
        return paragraph.isEndOfCell() || paragraph2.zzYpa() || paragraph.isEndOfSection();
    }

    private boolean zzT(Paragraph paragraph, Paragraph paragraph2) {
        return (zzYW(paragraph2) || paragraph.isEndOfSection()) && this.zzXRT.zzYBx().getNextSibling() != null;
    }

    private static boolean zzU(Paragraph paragraph, Paragraph paragraph2) {
        if (zzYOR.zzYB(paragraph)) {
            return paragraph2 == null || !zzYOR.zzYB(paragraph2) || !paragraph.zzZYj().zzO(paragraph2.zzZYj()) || zzYW(paragraph2);
        }
        return false;
    }

    private boolean zzW(Paragraph paragraph, Paragraph paragraph2, Paragraph paragraph3) {
        if (paragraph3 == null) {
            return true;
        }
        if (paragraph2 == null) {
            return false;
        }
        return !paragraph2.isListItem() || zzS(paragraph, paragraph2) || zzYP(paragraph) || zzYQ(paragraph);
    }

    private boolean zzX(Paragraph paragraph, char c) {
        return zzYH(paragraph) == c && !this.zzXRT.zzYs0() && paragraph.getLastChild() == paragraph.zzRD(false);
    }

    private boolean zzY(Paragraph paragraph, char c) {
        return zzYI(paragraph) == c && !this.zzXRT.zzYs0() && paragraph.getFirstChild() == paragraph.zzYVe();
    }

    public static boolean zzYF(Paragraph paragraph) {
        return zzX(paragraph, paragraph);
    }

    private static boolean zzYG(Paragraph paragraph) {
        return (paragraph.getFirstChild() instanceof Shape) && paragraph.getFirstChild().getNextSibling() == null;
    }

    private static char zzYH(Paragraph paragraph) {
        Run runZzRD;
        if (paragraph == null || paragraph.getRuns().getCount() <= 0 || (runZzRD = paragraph.zzRD(false)) == null) {
            return (char) 0;
        }
        String text = runZzRD.getText();
        if (com.aspose.words.internal.zzZYD.zzXk(text)) {
            return androidx.core.content.OooO0O0.OooO00o(1, text);
        }
        return (char) 0;
    }

    private static char zzYI(Paragraph paragraph) {
        if (paragraph != null && paragraph.zzYVe() != null) {
            String text = paragraph.zzYVe().getText();
            if (com.aspose.words.internal.zzZYD.zzXk(text)) {
                return text.charAt(0);
            }
        }
        return (char) 0;
    }

    private static boolean zzYK(Paragraph paragraph) {
        Paragraph paragraph2 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(paragraph.zzYB5(), Paragraph.class);
        if (paragraph.zzYB3()) {
            return true;
        }
        return paragraph2 != null && zzYW(paragraph2);
    }

    private static Paragraph zzYL(Paragraph paragraph) {
        if (zzYK(paragraph)) {
            return null;
        }
        boolean zIsEndOfCell = paragraph.isEndOfCell();
        Paragraph paragraphZzZex = paragraph;
        if (zIsEndOfCell) {
            paragraphZzZex = paragraph.zzZex();
        }
        for (Node nodeZzYB5 = paragraphZzZex.zzYB5(); nodeZzYB5 != null && !(nodeZzYB5 instanceof Table); nodeZzYB5 = (Node) com.aspose.words.internal.zzZKW.zzZ(nodeZzYB5.zzYB5(), Paragraph.class)) {
            Paragraph paragraph2 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(nodeZzYB5, Paragraph.class);
            if (paragraph2 != null && paragraph2.isListItem()) {
                return paragraph2;
            }
        }
        return null;
    }

    private static boolean zzYM(Paragraph paragraph) {
        return paragraph.isInCell() && paragraph.zzYB4() == null;
    }

    private boolean zzYN(Paragraph paragraph) {
        int listId = paragraph.getListFormat().getListId();
        int iZzYON = paragraph.getListFormat().zzYON();
        Paragraph paragraph2 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(paragraph.zzYB4(), Paragraph.class);
        Paragraph paragraphZzYL = zzYL(paragraph);
        return paragraph2 != null && paragraph2.isListItem() && (paragraphZzYL == null ? -1 : paragraphZzYL.getListFormat().getListId()) == listId && iZzYON >= zzX(paragraph, paragraph2, paragraphZzYL) && !zzYM(paragraph) && !zzT(paragraph, paragraph2);
    }

    private boolean zzYO(Paragraph paragraph) {
        int listId = paragraph.getListFormat().getListId();
        Paragraph paragraph2 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(paragraph.zzYB4(), Paragraph.class);
        Paragraph paragraphZzYL = zzYL(paragraph);
        return paragraph2 == null || !paragraph2.isListItem() || (paragraphZzYL == null ? -1 : paragraphZzYL.getListFormat().getListId()) != listId || (paragraph.zzYB5() instanceof Table) || zzYM(paragraph) || zzT(paragraph, paragraph2);
    }

    private boolean zzYP(Paragraph paragraph) {
        return (zzYW(paragraph) || paragraph.isEndOfSection()) && this.zzXRT.zzYBx().getNextSibling() != null;
    }

    private static boolean zzYQ(Paragraph paragraph) {
        return (paragraph.getParentNode() instanceof Footnote) && paragraph.zzYB9() == null;
    }

    private boolean zzYR(Paragraph paragraph) {
        int listId = paragraph.getListFormat().getListId();
        int iZzYON = paragraph.getListFormat().zzYON();
        Paragraph paragraph2 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(this.zzXRT.getPreviousSibling(), Paragraph.class);
        Paragraph paragraphZzYuZ = zzYuZ();
        return paragraph2 != null && paragraph2.isListItem() && (paragraphZzYuZ == null ? -1 : paragraphZzYuZ.getListFormat().getListId()) == listId && iZzYON <= zzZ(paragraph, paragraph2, paragraphZzYuZ) && !(paragraph.isInCell() && paragraph.zzYB9() == null);
    }

    private boolean zzYS(Paragraph paragraph) {
        int listId = paragraph.getListFormat().getListId();
        Paragraph paragraph2 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(this.zzXRT.getPreviousSibling(), Paragraph.class);
        Paragraph paragraphZzYuZ = zzYuZ();
        return paragraph2 == null || !paragraph2.isListItem() || (paragraphZzYuZ == null ? -1 : paragraphZzYuZ.getListFormat().getListId()) != listId || ((paragraph.isInCell() || (paragraph.getParentNode() instanceof Footnote)) && paragraph.zzYB9() == null);
    }

    private void zzYT(Paragraph paragraph) {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        int iZzX = zzX(paragraph, (Paragraph) com.aspose.words.internal.zzZKW.zzZ(paragraph.zzYB4(), Paragraph.class), zzYL(paragraph));
        if (zzYO(paragraph)) {
            zzytgZzYsG.zzp();
            zzytgZzYsG.zzp();
        }
        if (zzYN(paragraph)) {
            zzytgZzYsG.zzp();
        }
        for (int listLevelNumber = paragraph.getListFormat().getListLevelNumber(); listLevelNumber > iZzX; listLevelNumber--) {
            zzytgZzYsG.zzp();
            zzytgZzYsG.zzp();
        }
        this.zzXRT.zzYs9().zzZE(paragraph);
    }

    private String zzYU(Paragraph paragraph) {
        int i;
        if (paragraph.zzRB(false).getNumberStyle() == 23) {
            return null;
        }
        zzYRA zzyraZzYs9 = this.zzXRT.zzYs9();
        while (i < zzyraZzYs9.getCount()) {
            Paragraph paragraph2 = zzyraZzYs9.get(i);
            i = (paragraph2.isListItem() && paragraph.getListFormat().getListId() == paragraph2.getListFormat().getListId() && (!this.zzXRT.zzYsI().isStrictSchema11() || i == zzyraZzYs9.getCount() + (-1))) ? 0 : i + 1;
            return zzrN(i);
        }
        return null;
    }

    private void zzYV(Paragraph paragraph) {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        int iZzZ = zzZ(paragraph, this.zzXRT.zzYsa(), zzYuZ());
        if (zzYS(paragraph)) {
            boolean zIsStrictSchema11 = this.zzXRT.zzYsI().isStrictSchema11();
            zzytgZzYsG.zzY("text:list");
            zzytgZzYsG.zz0("text:style-name", com.aspose.words.internal.zzZKN.format("LS{0}", Integer.valueOf(paragraph.getListFormat().getList().getListId())));
            if (!zIsStrictSchema11) {
                zzytgZzYsG.zz0("xml:id", zzrN(this.zzXRT.zzYs9().getCount()));
            }
            String strZzYU = zzYU(paragraph);
            if (com.aspose.words.internal.zzZYD.zzXk(strZzYU)) {
                if (zIsStrictSchema11) {
                    zzytgZzYsG.zz0("text:continue-numbering", TelemetryEventStrings.Value.TRUE);
                } else {
                    zzytgZzYsG.zz0("text:continue-list", strZzYU);
                }
            }
            zzytgZzYsG.zzY("text:list-item");
        }
        if (zzYR(paragraph)) {
            zzytgZzYsG.zzY("text:list-item");
        }
        for (int iZzYON = paragraph.getListFormat().zzYON(); iZzYON > iZzZ; iZzYON--) {
            zzytgZzYsG.zzY("text:list");
            zzytgZzYsG.zzY("text:list-item");
        }
    }

    private static boolean zzYW(Paragraph paragraph) {
        return (!paragraph.isEndOfSection() || paragraph.hasChildNodes() || paragraph.isEndOfDocument() || paragraph.getParentStory().zz6T()) ? false : true;
    }

    private static boolean zzYX(Paragraph paragraph) {
        Node firstChild = paragraph.getFirstChild();
        return firstChild != null && firstChild.getNodeType() == 22 && zzYOU.zzq((FieldStart) firstChild);
    }

    private static boolean zzYY(Paragraph paragraph) {
        for (FieldEnd fieldEnd : paragraph.getChildNodes(24, false)) {
            if (zzYOU.zzq(fieldEnd) && ((!fieldEnd.zzYB3() && fieldEnd.zz9I()) || paragraph.getChildNodes(0, false).getCount() == 1)) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzYZ(Paragraph paragraph) {
        return zzYX(paragraph) || zzYY(paragraph);
    }

    private Paragraph zzYuZ() {
        if (this.zzXRT.zzYs9().getCount() > 0) {
            return this.zzXRT.zzYs9().get(this.zzXRT.zzYs9().getCount() - 1);
        }
        return null;
    }

    private boolean zzZ(Paragraph paragraph, char c) {
        if (zzY(paragraph, c)) {
            return true;
        }
        return zzX(this.zzXRT.zzYsa(), c) && !zzY(this.zzXRT.zzYsa(), c);
    }

    private static boolean zzZ0(Paragraph paragraph) {
        NodeCollection childNodes = paragraph.getChildNodes(0, false);
        return childNodes.getCount() == 1 && (childNodes.get(0) instanceof Shape) && ((Shape) childNodes.get(0)).isImage();
    }

    private static boolean zzZ1(Paragraph paragraph) {
        Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(paragraph.getParentNode(), Shape.class);
        return shape != null && (shape.getParentNode() instanceof GroupShape) && paragraph.zzYB9() == null && paragraph.zzYB4() == null && zzZ0(paragraph) && zzZ0(paragraph);
    }

    private boolean zzZ2(Paragraph paragraph) {
        return (!paragraph.isListItem() || (paragraph.getParentNode() instanceof Comment) || this.zzXRT.zz6W()) ? false : true;
    }

    private static boolean zzZ3(Paragraph paragraph) {
        if (paragraph.isEndOfSection()) {
            return true;
        }
        return paragraph.zzYB4().getNodeType() == 8 && zzYW((Paragraph) com.aspose.words.internal.zzZKW.zzZ(paragraph.zzYB4(), Paragraph.class));
    }

    private boolean zzZ4(Paragraph paragraph) {
        Paragraph paragraph2 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(this.zzXRT.getPreviousSibling(), Paragraph.class);
        return (paragraph.zzYBd() instanceof Shape) || paragraph.isInCell() || zzYOR.zzYB(paragraph) || paragraph2 == null || !zzYOR.zzYB(paragraph2);
    }

    private Paragraph zzZ5(Paragraph paragraph) {
        Paragraph paragraph2 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(this.zzXRT.getPreviousSibling(), Paragraph.class);
        if (paragraph2 != null && zzYOR.zzYB(paragraph2) && !zzYG(paragraph)) {
            return null;
        }
        Paragraph paragraph3 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(paragraph.zzYB4(), Paragraph.class);
        while (true) {
            if (paragraph3 == null) {
                break;
            }
            if (!zzYOR.zzYB(paragraph3)) {
                if (zzYW(paragraph3)) {
                    break;
                }
                return paragraph3;
            }
            paragraph3 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(paragraph3.zzYB4(), Paragraph.class);
        }
        return paragraph;
    }

    private void zzZ6(Paragraph paragraph) throws Exception {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzYMX zzymxZzZYj = paragraph.zzZYj();
        Paragraph paragraphZzZ5 = zzZ5(paragraph);
        this.zzXNf = paragraphZzZ5;
        if (paragraphZzZ5 != null) {
            zzytgZzYsG.zzY(this.zzXRT.zzYA(paragraphZzZ5));
            zzytgZzYsG.zz0("text:style-name", this.zzXRS.getNextParagraphStyleName());
        }
        zzytgZzYsG.zzY("draw:frame");
        zzytgZzYsG.zz0("svg:x", this.zzXRT.zzr2(zzymxZzZYj.zzYpC()));
        zzytgZzYsG.zz0("svg:y", this.zzXRT.zzr2(zzymxZzZYj.zzYpB()));
        if (zzymxZzZYj.zzVE(1310) && zzymxZzZYj.zzJ5() != 0) {
            zzytgZzYsG.zz0("svg:width", this.zzXRT.zzr2(zzymxZzZYj.zzJ5()));
        }
        if (zzymxZzZYj.zzVE(1430)) {
            if (zzymxZzZYj.zzYpA() == 1) {
                zzytgZzYsG.zz0("svg:height", this.zzXRT.zzr2(zzymxZzZYj.zzJ4()));
            }
        } else if (zzymxZzZYj.zzYpA() != 2) {
            zzytgZzYsG.zz0("svg:height", this.zzXRT.zzr2(1440));
        }
        zzytgZzYsG.zz0("draw:style-name", this.zzXRS.zzYtT());
        zzytgZzYsG.zz0("text:anchor-type", zzP(zzymxZzZYj) ? "page" : "char");
        zzytgZzYsG.zz0("draw:z-index", "0");
        zzytgZzYsG.zzY("draw:text-box");
        if (!zzymxZzZYj.zzVE(1430) && zzymxZzZYj.zzYpA() != 1) {
            zzytgZzYsG.zz0("fo:min-height", this.zzXRT.zzr2(zzymxZzZYj.zzJ4()));
        }
        if (!zzymxZzZYj.zzVE(1310) || zzymxZzZYj.zzJ5() == 0) {
            zzytgZzYsG.zz0("fo:min-width", this.zzXRT.zzYrY());
        }
    }

    private static String zzrN(int i) {
        if (i != -1) {
            return com.aspose.words.internal.zzZKN.format("list{0}", Integer.valueOf(i));
        }
        return null;
    }

    public final int visitParagraphEnd(Paragraph paragraph) throws Exception {
        if (this.zzXRT.zzYsD()) {
            boolean zZzYB = zzYOR.zzYB(paragraph);
            boolean zZzU = zzU(paragraph, (Paragraph) com.aspose.words.internal.zzZKW.zzZ(paragraph.zzYB4(), Paragraph.class));
            if (!zzY(paragraph, paragraph) || (zZzYB && zzX(paragraph, paragraph))) {
                zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
                this.zzXRT.zzYA(paragraph);
                zzytgZzYsG.zzo();
                if (zzZ2(paragraph)) {
                    zzYT(paragraph);
                }
                if (zZzU) {
                    this.zzXRT.zzYsG().zzo();
                    this.zzXRT.zzYsG().zzo();
                    if (zzZ5(paragraph) == paragraph) {
                        zzYTG zzytgZzYsG2 = this.zzXRT.zzYsG();
                        this.zzXRT.zzYA(paragraph);
                        zzytgZzYsG2.zzo();
                    } else if (zzZ3(paragraph) && this.zzXNf != null) {
                        zzYTG zzytgZzYsG3 = this.zzXRT.zzYsG();
                        this.zzXRT.zzYA(this.zzXNf);
                        zzytgZzYsG3.zzo();
                    }
                }
            }
        }
        this.zzXRT.zzYy(paragraph);
        this.zzXRT.zzZ(paragraph, paragraph.getParentSection());
        return 0;
    }

    public final int visitParagraphStart(Paragraph paragraph) throws Exception {
        this.zzXOC = true;
        try {
            Node previousSibling = this.zzXRT.getPreviousSibling();
            if (previousSibling != null && zzYVU.zztq(previousSibling.getNodeType())) {
                previousSibling = previousSibling.zzYB9();
            }
            if (!zzY(paragraph, previousSibling) && !zzYZ(paragraph)) {
                zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
                boolean zZzZ = zzZ(paragraph, '\f');
                boolean zZzZ2 = zzZ(paragraph, ControlChar.COLUMN_BREAK_CHAR);
                boolean zZzB = zzB(zZzZ, zZzZ2);
                boolean zZzU = zzU(paragraph, (Paragraph) com.aspose.words.internal.zzZKW.zzZ(previousSibling, Paragraph.class));
                if (this.zzXRT.zzYsE()) {
                    if (zZzU) {
                        Paragraph paragraphZzZ5 = zzZ5(paragraph);
                        this.zzXNf = paragraphZzZ5;
                        if (paragraphZzZ5 != null) {
                            zzZ(paragraphZzZ5, zZzB, zZzZ, zZzZ2);
                        }
                        this.zzXQW.zzZc(paragraph);
                    }
                    if (zzZ4(paragraph)) {
                        zzZ(paragraph, zZzB, zZzZ, zZzZ2);
                    }
                } else if (this.zzXRT.zzYsD()) {
                    if (zZzU) {
                        zzZ6(paragraph);
                    }
                    zzZ(paragraph, zZzB, zzytgZzYsG);
                }
                this.zzXOC = false;
                return 0;
            }
            return 0;
        } finally {
            this.zzXOC = false;
        }
    }

    public final void zzYJ(Paragraph paragraph) throws Exception {
        this.zzXRT.zzRT(true);
        if (!zzYZ(paragraph)) {
            visitParagraphEnd(paragraph);
        }
        visitParagraphStart(paragraph);
        this.zzXRT.zzRT(false);
    }

    private boolean zzY(Paragraph paragraph, Node node) {
        if (this.zzXRT.zzYsC() == 6 || zzZ1(paragraph)) {
            return true;
        }
        if ((paragraph.zzZ7D() || !this.zzXRT.zzYsF()) && !zzYW(paragraph)) {
            return zzX(paragraph, node);
        }
        return true;
    }

    private void zzZ(Paragraph paragraph, boolean z, zzYTG zzytg) throws Exception {
        if (zzZ4(paragraph)) {
            this.zzXRS.zzYtN();
        }
        String strZzYA = this.zzXRT.zzYA(paragraph);
        if (z) {
            this.zzXRT.zzV(paragraph, strZzYA);
            zzytg.zzo();
        }
        if (zzZ2(paragraph)) {
            zzYV(paragraph);
        }
        if (zzZ4(paragraph)) {
            this.zzXRT.zzV(paragraph, strZzYA);
        }
    }

    private int zzX(Paragraph paragraph, Paragraph paragraph2, Paragraph paragraph3) {
        if (zzW(paragraph, paragraph2, paragraph3)) {
            return 0;
        }
        return paragraph3.getListFormat().zzYON();
    }

    private static boolean zzX(Paragraph paragraph, Node node) {
        if (node != null && (node instanceof Paragraph)) {
            Paragraph paragraph2 = (Paragraph) node;
            boolean z = paragraph2.zzZYj().contains(1450) && paragraph2.zzZYj().contains(1440);
            boolean z2 = paragraph2.isInCell() || (paragraph.zzYBd() instanceof Shape);
            if (!zzYOR.zzYB(paragraph) && !zzYG(paragraph2) && (paragraph2.zzYB4() instanceof Paragraph) && !z2 && z) {
                return true;
            }
        }
        return false;
    }

    private boolean zzY(Paragraph paragraph, Paragraph paragraph2, Paragraph paragraph3) {
        if (paragraph3 == null) {
            return true;
        }
        if (paragraph2 == null) {
            return false;
        }
        return !paragraph2.isListItem() || paragraph2.zzYp0() || zzS(paragraph2, paragraph) || zzYP(paragraph2) || zzYQ(paragraph);
    }

    private void zzZ(Paragraph paragraph, boolean z, boolean z2, boolean z3) {
        if (z) {
            this.zzXQW.zzV(paragraph, false, false);
        }
        this.zzXQW.zzV(paragraph, z2, z3);
    }

    private int zzZ(Paragraph paragraph, Paragraph paragraph2, Paragraph paragraph3) {
        if (zzY(paragraph, paragraph2, paragraph3)) {
            return 0;
        }
        return paragraph3.getListFormat().zzYON();
    }
}
