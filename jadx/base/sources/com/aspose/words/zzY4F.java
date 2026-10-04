package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY4F extends zzY4E {
    private int zzX18;
    private int zzX1c;
    private com.aspose.words.internal.zzZQC<ListLabel> zzX1d;
    private static com.aspose.words.internal.zzZNR zzX1a = new com.aspose.words.internal.zzZNR("(" + ControlChar.LINE_BREAK + ")|(" + ControlChar.PAGE_BREAK + ")|([^" + com.aspose.words.internal.zzZKN.format("{0}{1}", ControlChar.LINE_BREAK, ControlChar.PAGE_BREAK) + "]*)", 0);
    private static char[] zzX19 = {'*', '>', '+', '-', 'o', '>', '+', '-', 'o'};
    private com.aspose.words.internal.zzZQC<zzY4G> zzX1e = new com.aspose.words.internal.zzZQC<>();
    private StringBuilder zzX1b = new StringBuilder();

    public zzY4F() {
        com.aspose.words.internal.zzZQC<ListLabel> zzzqc = new com.aspose.words.internal.zzZQC<>();
        this.zzX1d = zzzqc;
        zzzqc.push(null);
    }

    private void zzA2(String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            zzXUn();
            char cCharAt = str.charAt(0);
            if (cCharAt == 11) {
                zzA4(ControlChar.CR_LF);
            } else if (cCharAt != '\f') {
                zzY1Z.zzZ(getDocument().getWarningCallback(), 11, "Unexpected break, ignored.", new Object[0]);
            } else if (((TxtSaveOptions) zzXUj()).getForcePageBreaks()) {
                zzA4(ControlChar.PAGE_BREAK);
            }
            this.zzX1c = 0;
        }
    }

    private void zzA3(String str) {
        if (com.aspose.words.internal.zzZKN.equals(str, ((TxtSaveOptions) zzXUj()).getParagraphBreak())) {
            zzXUn();
            com.aspose.words.internal.zzZNH.zzU(zzZeE(), str);
            this.zzX1c = 0;
            return;
        }
        if (zzXUm() && this.zzX18 > 0) {
            com.aspose.words.internal.zzZNH.zzU(zzZeE(), com.aspose.words.internal.zzZKN.format("{0} ", com.aspose.words.internal.zzZKN.zzS('>', this.zzX18)));
        }
        for (int i = 0; i < str.length(); i++) {
            char cZzF = com.aspose.words.internal.zzJF.zzF(str.charAt(i));
            if (((TxtSaveOptions) zzXUj()).getMaxCharactersPerLine() <= 0) {
                zzZeE().append(cZzF);
            } else if (Character.isLetterOrDigit(cZzF)) {
                this.zzX1b.append(cZzF);
            } else {
                zzXUn();
                if (this.zzX1c == ((TxtSaveOptions) zzXUj()).getMaxCharactersPerLine()) {
                    com.aspose.words.internal.zzZNH.zzU(zzZeE(), ((TxtSaveOptions) zzXUj()).getParagraphBreak());
                    this.zzX1c = 0;
                }
                zzZeE().append(cZzF);
                this.zzX1c++;
            }
        }
    }

    private void zzA4(String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            if (((TxtSaveOptions) zzXUj()).getPreserveTableLayout() && zzEE()) {
                zzXUl().zzID(str);
            } else {
                zzA3(str);
            }
        }
    }

    private boolean zzEE() {
        return this.zzX1e.size() > 0;
    }

    private void zzID(String str) {
        if (com.aspose.words.internal.zzZKN.zzU3(str)) {
            return;
        }
        Iterator<com.aspose.words.internal.zzZNT> it = zzX1a.zzUW(str).iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZNU zzznuZzhJ = it.next().zzhJ();
            int iZzV = zzV(zzznuZzhJ);
            if (iZzV <= 0) {
                iZzV = zzznuZzhJ.getCount() - 1;
            }
            if (iZzV == zzznuZzhJ.getCount() - 1) {
                zzA4(zzznuZzhJ.zzQx(zzznuZzhJ.getCount() - 1).getValue());
            } else {
                zzA2(zzznuZzhJ.zzQx(iZzV).getValue());
            }
        }
    }

    private static int zzV(com.aspose.words.internal.zzZNU zzznu) {
        if (zzznu != null) {
            zzznu.getCount();
        }
        int i = 0;
        for (int i2 = 1; i2 < zzznu.getCount(); i2++) {
            if (zzznu.zzQx(i2).zzhL()) {
                i = i2;
            }
        }
        return i;
    }

    private zzY4G zzXUl() {
        if (this.zzX1e.size() > 0) {
            return this.zzX1e.peek();
        }
        return null;
    }

    private boolean zzXUm() {
        char cCharAt;
        return zzZeE().length() == 0 || (cCharAt = zzZeE().charAt(zzZeE().length() - 1)) == '\n' || cCharAt == 11 || cCharAt == '\f';
    }

    private void zzXUn() {
        if (this.zzX1b.length() == 0) {
            return;
        }
        if (((TxtSaveOptions) zzXUj()).getMaxCharactersPerLine() <= 0) {
            com.aspose.words.internal.zzZNH.zzZ(zzZeE(), this.zzX1b);
            return;
        }
        if (this.zzX1b.length() + this.zzX1c <= ((TxtSaveOptions) zzXUj()).getMaxCharactersPerLine()) {
            com.aspose.words.internal.zzZNH.zzZ(zzZeE(), this.zzX1b);
            this.zzX1c = this.zzX1b.length() + this.zzX1c;
        } else if (this.zzX1b.length() <= ((TxtSaveOptions) zzXUj()).getMaxCharactersPerLine()) {
            com.aspose.words.internal.zzZNH.zzU(zzZeE(), ((TxtSaveOptions) zzXUj()).getParagraphBreak());
            com.aspose.words.internal.zzZNH.zzZ(zzZeE(), this.zzX1b);
            this.zzX1c = this.zzX1b.length();
        } else {
            int i = 0;
            while (i < this.zzX1b.length()) {
                if (this.zzX1c == ((TxtSaveOptions) zzXUj()).getMaxCharactersPerLine()) {
                    com.aspose.words.internal.zzZNH.zzU(zzZeE(), ((TxtSaveOptions) zzXUj()).getParagraphBreak());
                    this.zzX1c = 0;
                }
                zzZeE().append(this.zzX1b.charAt(i));
                i++;
                this.zzX1c++;
            }
        }
        this.zzX1b.setLength(0);
    }

    private static String zzY(zzZ47 zzz47) {
        StringBuilder sb = new StringBuilder();
        ListLevel listLevel = zzz47.getListLevel();
        int i = 0;
        if (listLevel.getNumberStyle() == 23) {
            while (i < listLevel.zzYOa()) {
                com.aspose.words.internal.zzZNH.zzU(sb, "  ");
                i++;
            }
            sb.append(zzX19[listLevel.zzYOa()]);
        } else {
            while (i <= listLevel.zzYOa()) {
                sb.append(zzz47.zzR0(i));
                sb.append(FilenameUtils.EXTENSION_SEPARATOR);
                i++;
            }
        }
        return sb.toString();
    }

    private void zzZ(String str, Run run) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            char c = zzZ7R.zzW((zzZ9G) run, StyleIdentifier.BIBLIOGRAPHY) ? (char) 8207 : (char) 8206;
            if (zzZ(str, run, true)) {
                zzZeE().append(c);
            }
            zzID(str);
            if (zzZ(str, run, false)) {
                zzZeE().append(c);
            }
        }
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCellEnd(Cell cell) {
        if (!((TxtSaveOptions) zzXUj()).getPreserveTableLayout()) {
            return 0;
        }
        zzXUl().zzXZT();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCellStart(Cell cell) {
        return ((TxtSaveOptions) zzXUj()).getPreserveTableLayout() ? !zzXUl().zzh(cell) ? 1 : 0 : cell.zz6G().zz5B() ? 1 : 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentStart(Comment comment) {
        if (zzZeE().length() <= 0 || zzZeE().charAt(zzZeE().length() - 1) == '\r' || zzZeE().charAt(zzZeE().length() - 1) == '\n') {
            return 0;
        }
        zzID(((TxtSaveOptions) zzXUj()).getParagraphBreak());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldEnd(FieldEnd fieldEnd) {
        if (fieldEnd.hasSeparator() || !isLocked()) {
            return 0;
        }
        unlock();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldSeparator(FieldSeparator fieldSeparator) {
        if (!isLocked()) {
            return 0;
        }
        unlock();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldStart(FieldStart fieldStart) {
        if (fieldStart.getFieldType() == 51) {
            zzID(((FieldMacroButton) fieldStart.getField()).getDisplayText());
        }
        lock();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphEnd(Paragraph paragraph) {
        if (!isLocked()) {
            ListLabel listLabelPeek = this.zzX1d.peek();
            if (listLabelPeek != null) {
                zzID(zzZ(listLabelPeek));
            }
            zzID((!paragraph.isEndOfCell() || ((TxtSaveOptions) zzXUj()).getPreserveTableLayout()) ? ((TxtSaveOptions) zzXUj()).getParagraphBreak() : ControlChar.f50773CR);
        }
        this.zzX1d.pop();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphStart(Paragraph paragraph) {
        this.zzX18 = paragraph.zzYoS();
        this.zzX1d.push(paragraph.zzZ0R() ? paragraph.getListLabel() : null);
        if (!((TxtSaveOptions) zzXUj()).getPreserveTableLayout() || !zzEE()) {
            return 0;
        }
        zzXUl().zzXV(paragraph);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRowEnd(Row row) {
        if (!((TxtSaveOptions) zzXUj()).getPreserveTableLayout()) {
            return 0;
        }
        zzXUl().zzYNh();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRowStart(Row row) {
        if (!((TxtSaveOptions) zzXUj()).getPreserveTableLayout()) {
            return 0;
        }
        zzXUl().zzY25();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRun(Run run) {
        char cCharAt;
        if (!isLocked()) {
            ListLabel listLabelPeek = this.zzX1d.peek();
            String strZzr = zzY4E.zzr(run);
            if (listLabelPeek != null) {
                int i = 0;
                while (i < strZzr.length() && ((cCharAt = strZzr.charAt(i)) == '\f' || cCharAt == 14)) {
                    i++;
                }
                if (i > 0) {
                    zzID(strZzr.substring(0, i));
                }
                if (i < strZzr.length()) {
                    zzID(zzZ(listLabelPeek));
                    zzID(" ");
                    strZzr = strZzr.substring(i);
                    this.zzX1d.pop();
                    this.zzX1d.push(null);
                }
            }
            if (((TxtSaveOptions) zzXUj()).getAddBidiMarks()) {
                zzZ(strZzr, run);
            } else {
                zzID(strZzr);
            }
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitTableEnd(Table table) {
        if (((TxtSaveOptions) zzXUj()).getPreserveTableLayout() && this.zzX1e.size() == 1) {
            for (int i = 0; i < zzXUl().zzXUt().getCount(); i++) {
                zzA3(zzXUl().zzXUt().zzju(i).toString());
                zzA3(((TxtSaveOptions) zzXUj()).getParagraphBreak());
            }
        }
        this.zzX1e.pop();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitTableStart(Table table) {
        this.zzX1e.push(new zzY4G(table, zzXUl(), (TxtSaveOptions) zzXUj()));
        return 0;
    }

    @Override // com.aspose.words.zzY4E
    public final void zzWa(Node node) {
        super.zzWa(node);
        if (node.isRemoved() || !((TxtSaveOptions) zzXUj()).getPreserveTableLayout()) {
            return;
        }
        if (node.getNodeType() == 7 || node.getNodeType() == 6) {
            visitTableEnd(node.getNodeType() == 7 ? ((Cell) node).getParentRow().getParentTable() : ((Row) node).getParentTable());
        }
    }

    @Override // com.aspose.words.zzY4E
    public final void zzWb(Node node) throws Exception {
        super.zzWb(node);
        if (node.isRemoved() || !((TxtSaveOptions) zzXUj()).getPreserveTableLayout()) {
            return;
        }
        if (node.getNodeType() == 7 || node.getNodeType() == 6) {
            visitTableStart(node.getNodeType() == 7 ? ((Cell) node).getParentRow().getParentTable() : ((Row) node).getParentTable());
        }
    }

    private static boolean zzZ(String str, Run run, boolean z) {
        Run run2;
        com.aspose.words.internal.zzZYD.zzXk(run.getText());
        if (com.aspose.words.internal.zzZVU.zz8(z ? str.charAt(0) : str.charAt(run.getText().length() - 1))) {
            return false;
        }
        if (z) {
            run2 = (Run) run.zztC(21);
        } else {
            run2 = (Run) run.zztD(21);
        }
        return run2 == null || zzZ7R.zzW((zzZ9G) run, StyleIdentifier.BIBLIOGRAPHY) != zzZ7R.zzW((zzZ9G) run2, StyleIdentifier.BIBLIOGRAPHY);
    }

    private String zzZ(ListLabel listLabel) {
        String strZzYOu;
        String strZzrI = ((TxtSaveOptions) zzXUj()).getListIndentation().zzrI(listLabel.getListLevel().zzYOa());
        if (((TxtSaveOptions) zzXUj()).getSimplifyListLabels()) {
            strZzYOu = zzY(listLabel.zzYOD());
        } else {
            strZzYOu = listLabel.zzYOu();
        }
        return com.aspose.words.internal.zzZKN.format("{0}{1}", strZzrI, strZzYOu);
    }
}
