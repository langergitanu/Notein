package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYPT {
    private static com.aspose.words.internal.zzZNR zzXMf;
    private zzYQA zzXMg;
    private zzYTN zzXQW;
    private zzYOW zzXRR;
    private zzYPM zzXRS;
    private zzYOR zzXRT;

    static {
        StringBuilder sb = new StringBuilder("(");
        sb.append(ControlChar.PAGE_BREAK);
        sb.append(")|(");
        sb.append(ControlChar.COLUMN_BREAK);
        sb.append(")|(");
        sb.append(ControlChar.PARAGRAPH_BREAK);
        sb.append(")|([^");
        sb.append(ControlChar.PAGE_BREAK);
        sb.append(ControlChar.COLUMN_BREAK);
        zzXMf = new com.aspose.words.internal.zzZNR(androidx.concurrent.futures.OooO00o.OooO0OO(sb, ControlChar.PARAGRAPH_BREAK, "]*)"), 0);
    }

    public zzYPT(zzYOR zzyor, zzYPM zzypm, zzYTN zzytn, zzYOW zzyow, zzYQA zzyqa) {
        this.zzXRT = zzyor;
        this.zzXRS = zzypm;
        this.zzXQW = zzytn;
        this.zzXRR = zzyow;
        this.zzXMg = zzyqa;
    }

    private boolean zz9(String str, boolean z) {
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzXRT.zzYsG().zzT(str)) || z) {
            return false;
        }
        String str2 = ControlChar.LINE_BREAK;
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        return com.aspose.words.internal.zzZKN.zzT(str, str2, i) == -1 && com.aspose.words.internal.zzZKN.zzT(str, ControlChar.TAB, i) == -1;
    }

    private void zzB(Inline inline) {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        String strZzE0 = zzE0(inline.getText());
        int i = 0;
        while (i < strZzE0.length()) {
            char cCharAt = strZzE0.charAt(i);
            if (cCharAt == '\t') {
                zzZkf();
            } else if (cCharAt == 11) {
                zzytgZzYsG.zzX("<text:line-break/>");
            } else if (cCharAt == ' ') {
                i++;
                int i2 = 1;
                while (i < strZzE0.length() && strZzE0.charAt(i) == ' ') {
                    i2++;
                    i++;
                }
                zzrG(i2);
            } else {
                int i3 = i;
                while (cCharAt != ' ' && cCharAt != '\t' && cCharAt != 11) {
                    i3++;
                    if (i3 >= strZzE0.length()) {
                        break;
                    } else {
                        cCharAt = strZzE0.charAt(i3);
                    }
                }
                zzytgZzYsG.writeString(C22241OooO0Oo.OooO00o(i3, i, i, i, strZzE0));
                i = i3;
            }
            i++;
        }
    }

    private void zzC(Inline inline) throws Exception {
        Paragraph parentParagraph = inline.getParentParagraph();
        Section section = (Section) parentParagraph.getParentSection().deepClone(true);
        Paragraph paragraph = (Paragraph) parentParagraph.deepClone(true);
        section.getBody().getParagraphs().add(paragraph);
        for (com.aspose.words.internal.zzZNT zzznt : zzXMf.zzUW(inline.getText())) {
            if (zzZ(zzznt.zzhJ()) && !zzZ(inline, zzznt.getIndex())) {
                this.zzXMg.zzYJ(parentParagraph);
            }
            String strOooO00o = OooO0O0.OooO00o(zzznt, 4);
            if (com.aspose.words.internal.zzZYD.zzXk(strOooO00o)) {
                Run run = (Run) inline.deepClone(true);
                paragraph.getRuns().add(run);
                run.setText(strOooO00o);
                zzG(run);
            }
        }
    }

    private void zzD(Inline inline) {
        Paragraph parentParagraph = inline.getParentParagraph();
        for (com.aspose.words.internal.zzZNT zzznt : zzXMf.zzUW(inline.getText())) {
            com.aspose.words.internal.zzZNU zzznuZzhJ = zzznt.zzhJ();
            if (zzZ(zzznuZzhJ) && !zzZ(inline, zzznt.getIndex())) {
                if (zzW(zzznuZzhJ)) {
                    this.zzXQW.zzV(parentParagraph, false, true);
                }
                if (zzX(zzznuZzhJ)) {
                    this.zzXQW.zzV(parentParagraph, true, false);
                }
                if (zzY(zzznuZzhJ)) {
                    this.zzXQW.zzV(parentParagraph, false, false);
                }
            }
            if (com.aspose.words.internal.zzZYD.zzXk(zzznuZzhJ.zzQx(4).getValue()) && !this.zzXRT.zzYsn()) {
                this.zzXQW.zzJ(inline);
            }
        }
    }

    private static String zzE0(String str) {
        return str != null ? com.aspose.words.internal.zzZKN.zzZ(com.aspose.words.internal.zzZKN.zzZ(str, ControlChar.NON_BREAKING_HYPHEN_CHAR, (char) 8209), ControlChar.OPTIONAL_HYPHEN_CHAR, (char) 173) : str;
    }

    private static boolean zzE1(String str) {
        String str2 = ControlChar.PAGE_BREAK;
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        return (com.aspose.words.internal.zzZKN.zzT(str, str2, i) == -1 && com.aspose.words.internal.zzZKN.zzT(str, ControlChar.COLUMN_BREAK, i) == -1 && com.aspose.words.internal.zzZKN.zzT(str, ControlChar.PARAGRAPH_BREAK, i) == -1) ? false : true;
    }

    private boolean zzF(Inline inline) {
        if (zzYQA.zzYF(inline.getParentParagraph())) {
            return false;
        }
        return (this.zzXRT.zzYs3() && this.zzXRT.zzYs4()) ? false : true;
    }

    private static boolean zzW(com.aspose.words.internal.zzZNU zzznu) {
        return com.aspose.words.internal.zzZYD.zzXk(zzznu.zzQx(2).getValue());
    }

    private static boolean zzX(com.aspose.words.internal.zzZNU zzznu) {
        return com.aspose.words.internal.zzZYD.zzXk(zzznu.zzQx(1).getValue());
    }

    private static boolean zzY(com.aspose.words.internal.zzZNU zzznu) {
        return com.aspose.words.internal.zzZYD.zzXk(zzznu.zzQx(3).getValue());
    }

    private boolean zzZ(Inline inline, String str, boolean z) {
        if (com.aspose.words.internal.zzZKN.equals(str, ControlChar.zzZsb) || com.aspose.words.internal.zzZKN.equals(str, ControlChar.zzZsc) || zz9(str, z)) {
            return true;
        }
        return !inline.getParentParagraph().zzZ7D() && this.zzXRT.zzYsF();
    }

    private void zzZkf() {
        this.zzXRT.zzYsG().zzX("<text:tab/>");
    }

    private void zzrG(int i) {
        if (i <= 0) {
            return;
        }
        this.zzXRT.zzYsG().zzX(i == 1 ? "<text:s/>" : com.aspose.words.internal.zzZKN.format("<text:s text:c=\"{0}\"/>", Integer.valueOf(i)));
    }

    public final int zzE(Inline inline) throws Exception {
        String text = inline.getText();
        boolean zZzE1 = zzE1(text);
        if (zzZ(inline, text, zZzE1)) {
            return 0;
        }
        if (!this.zzXRT.zzYsE() || ((this.zzXRT.zzYsn() && !zZzE1) || !zzF(inline))) {
            if (this.zzXRT.zzYsD()) {
                if (this.zzXRR.zzXu(inline)) {
                    return 1;
                }
                this.zzXRR.zzXs(inline);
                if (zZzE1) {
                    zzC(inline);
                } else {
                    zzG(inline);
                }
                this.zzXRR.zzXr(inline);
            }
        } else if (zZzE1) {
            zzD(inline);
        } else {
            this.zzXQW.zzJ(inline);
        }
        return 0;
    }

    public final void zzG(Inline inline) {
        if (this.zzXRT.zzYsn()) {
            return;
        }
        boolean zZzF = zzF(inline);
        if (zZzF) {
            zzYud();
        }
        zzB(inline);
        if (zZzF) {
            zzYuc();
        }
    }

    public final void zzL(Run run) {
        zzYEJ zzyej = (zzYEJ) run.zzZYh().zzPk(885);
        if (this.zzXRT.zzYsE()) {
            this.zzXQW.zzZ(run, zzyej);
            return;
        }
        if (this.zzXRT.zzYsD()) {
            zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
            zzytgZzYsG.zzY("text:ruby");
            zzytgZzYsG.zz0("text:style-name", this.zzXRS.zzYtU());
            zzytgZzYsG.zzY("text:ruby-base");
            zzytgZzYsG.writeString(zzyej.zzYe6().getText());
            zzytgZzYsG.zzo();
            zzytgZzYsG.zzY("text:ruby-text");
            zzytgZzYsG.zz0("text:style-name", this.zzXRS.zzYtV());
            zzytgZzYsG.writeString(zzyej.zzYe7().getText());
            zzytgZzYsG.zzo();
            this.zzXRT.zzYsG().zzo();
        }
    }

    public final void zzYuc() {
        this.zzXRT.zzYsG().zzGA("text:span");
    }

    public final void zzYud() {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        zzytgZzYsG.zzGB("text:span");
        zzytgZzYsG.zzYt("text:style-name", this.zzXRS.zzYtV());
    }

    private static boolean zzZ(com.aspose.words.internal.zzZNU zzznu) {
        return zzW(zzznu) || zzX(zzznu) || zzY(zzznu);
    }

    private boolean zzZ(Inline inline, int i) {
        if (i == inline.getText().length() - 1 && inline.getNextSibling() == null) {
            return true;
        }
        return (i == 0 && inline.zz9I()) || (this.zzXRT.getPreviousSibling() instanceof FieldStart) || (inline.getNextSibling() instanceof FieldEnd);
    }
}
