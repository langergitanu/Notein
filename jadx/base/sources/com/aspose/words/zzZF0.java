package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: loaded from: classes6.dex */
final class zzZF0 {
    private zzZIX zzYlD;
    private double zzYlE;
    private double zzYlF;
    private double zzYlG;
    private zzZEM[] zzYlH;
    private Inline zzYlI;
    private boolean zzYlJ = true;
    private Paragraph zzYlK;
    private int zzYlL;
    private zzZH4 zzYs8;
    private HtmlSaveOptions zzYt2;
    private zzZAO zzYt4;
    private DocumentBase zzZCL;
    private boolean zzsU;

    public zzZF0(DocumentBase documentBase, zzZAO zzzao, zzZH4 zzzh4, HtmlSaveOptions htmlSaveOptions) {
        this.zzZCL = documentBase;
        this.zzYt4 = zzzao;
        this.zzYs8 = zzzh4;
        this.zzYt2 = htmlSaveOptions;
    }

    private boolean zzL(Font font) throws Exception {
        double d;
        zzZEM zzzemZzWV;
        if (this.zzYlK == null || (zzzemZzWV = zzWV((d = this.zzYlE + this.zzYlG))) == null) {
            return false;
        }
        int alignment = zzzemZzWV.getAlignment();
        if (alignment != 0) {
            if (alignment != 1 && alignment != 2) {
                return false;
            }
            zzZ(zzzemZzWV, 36.0d, font, false);
            return true;
        }
        double position = zzzemZzWV.getPosition() - d;
        zzZ(zzzemZzWV, position, font, false);
        double d2 = this.zzYlG + position;
        this.zzYlG = d2;
        this.zzYlF = d2;
        return true;
    }

    private static boolean zzM(Font font) {
        String text;
        int iIndexOf;
        Inline inline = (Inline) com.aspose.words.internal.zzZKW.zzZ(font.zzZ7g(), Inline.class);
        return inline != null && (iIndexOf = (text = inline.getText()).indexOf(9)) >= 0 && text.indexOf(9, iIndexOf + 1) < 0;
    }

    private double zzV(String str, Font font) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            return this.zzYlK.getDocument().zzZqy().zzY(font.getName(), (float) font.getSize(), font.zzza()).zz7(str);
        }
        return 0.0d;
    }

    private String zzW(Font font, String str, int i) {
        return this.zzZCL.zzZqy().zzN(font.getFontName(i), font.zzza()).zzWU(str);
    }

    private zzZEM zzWV(double d) {
        if (this.zzYlH == null) {
            this.zzYlH = zzZEN.zzZ(this.zzYlK, this.zzsU, 1);
        }
        for (zzZEM zzzem : this.zzYlH) {
            if (zzzem.zzWU(d)) {
                return zzzem;
            }
        }
        return null;
    }

    private static String zzYR(char c) {
        return c == ' ' ? "&#xa0;" : c != 0 ? com.aspose.words.internal.zzZKN.zzS(c, 1) : "";
    }

    private void zzYYU() {
        String string;
        zzZIX zzzix = this.zzYlD;
        if (zzzix == null) {
            return;
        }
        double dZzZ34 = (this.zzYlE + this.zzYlF) - zzzix.zzZ34();
        if (this.zzYlD.zzZ36()) {
            dZzZ34 /= 2.0d;
        }
        double dZzZ37 = (this.zzYlD.zzZ37() - dZzZ34) - this.zzYlD.zzZ34();
        if (dZzZ37 < 0.0d) {
            dZzZ37 = 0.0d;
        }
        zzZDN zzzdnZzZ38 = this.zzYlD.zzZ38();
        zzPR zzpr = new zzPR(zzzdnZzZ38.zzYXf());
        zzpr.zzU(new zzM3("width", new zzOI(dZzZ37, 4), (byte) 0));
        zzzdnZzZ38.zzYXj().remove("style");
        zzzdnZzZ38.zzYXj().zzZ(new zzZDP(zzpr.zzZWe()));
        if (com.aspose.words.internal.zzAN.zzZD(this.zzYlD.zzZ35())) {
            string = "&#xa0;";
        } else {
            string = com.aspose.words.internal.zzZNH.zzZ(new StringBuilder(), 0, this.zzYlD.zzZ33(), (int) com.aspose.words.internal.zzZKQ.zzZb(dZzZ37 / this.zzYlD.zzZ35())).toString();
        }
        zzzdnZzZ38.zzYXk().zzW(zzzdnZzZ38.zzYXk().zzyy(0));
        if (com.aspose.words.internal.zzZYD.zzXk(string)) {
            zzzdnZzZ38.zzYXk().zzX(new zzZFJ(string, false));
        }
        double d = this.zzYlG + dZzZ37;
        this.zzYlG = d;
        this.zzYlF = d;
        this.zzYlD = null;
    }

    private boolean zzYYV() {
        zzZDN zzzdnZzYXX = zzZ3E().zzYXX();
        if (zzzdnZzYXX == null) {
            return false;
        }
        if (zzzdnZzYXX.zzYXk().getCount() == 0) {
            return true;
        }
        zzZDN zzzdn = (zzZDN) com.aspose.words.internal.zzZKW.zzZ(zzzdnZzYXX.zzYXk().zzyy(zzzdnZzYXX.zzYXk().getCount() - 1), zzZDN.class);
        if (zzzdn != null && zzzdn.getRole() == 6) {
            return true;
        }
        if (zzzdn == null || zzzdn.zzYXk().getCount() != 1) {
            return false;
        }
        zzZDK zzzdkZzyy = zzzdn.zzYXk().zzyy(0);
        return com.aspose.words.internal.zzZKN.zzW(zzzdkZzyy instanceof zzZDI ? ((zzZDI) zzzdkZzyy).getText() : zzzdkZzyy instanceof zzZFJ ? ((zzZFJ) zzzdkZzyy).getText() : "", " ", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8);
    }

    private void zzYYW() {
        this.zzYlE = 0.0d;
        this.zzYlG = 0.0d;
        this.zzYlF = 0.0d;
    }

    private zzZE7 zzZ3E() {
        return this.zzYt4.zzZ3E();
    }

    private static String zzz5(int i) {
        if (i == 1) {
            return "&#xa0;";
        }
        StringBuilder sb = new StringBuilder(i * 6);
        for (int i2 = 0; i2 < i - 1; i2++) {
            com.aspose.words.internal.zzZNH.zzU(sb, "&#xa0;");
        }
        sb.append(ControlChar.SPACE_CHAR);
        return sb.toString();
    }

    public final void zzN(Font font) throws Exception {
        if (this.zzYlJ) {
            zzYYU();
            this.zzYlF = this.zzYlG;
            if (zzL(font)) {
                return;
            }
            zzZEM[] zzzemArr = this.zzYlH;
            if (zzzemArr == null || zzzemArr.length != 1 || !zzM(font)) {
                zzZ(com.aspose.words.internal.zzJF.zzZK(font.getName()) ? zzW(font, "Arial") : font, "              ", 3, true);
            } else {
                zzZ(this.zzYlH[0], 36.0d, font, true);
                this.zzYlD = null;
            }
        }
    }

    public final void zzO(Inline inline) {
        this.zzYlI = inline;
    }

    public final void zzR(Paragraph paragraph, boolean z) {
        if (this.zzYlK != paragraph) {
            this.zzYlK = paragraph;
            zzYYW();
            this.zzYlE = paragraph.getParagraphFormat().getFirstLineIndent() + paragraph.getParagraphFormat().getLeftIndent();
            this.zzsU = true;
            this.zzYlH = null;
            this.zzYlJ = z;
            this.zzYlD = null;
            if (paragraph.isListItem() && paragraph.getParagraphFormat().getFirstLineIndent() < 0.0d && zzO7.zzZ(paragraph.zzRB(false))) {
                this.zzYlE = paragraph.getParagraphFormat().getLeftIndent();
            }
            if (this.zzYt2.getExportListLabels() == 1 && zzZGI.zzZW(this.zzYlK).isListItem()) {
                zzZ45 zzz45ZzP = zzZ45.zzP(this.zzYlK, 1);
                this.zzYlE = zzz45ZzP.zzYNW() + zzz45ZzP.zzZ1a();
            }
        }
    }

    public final void zzU(Font font, int i) throws Exception {
        if (this.zzYlJ) {
            zzZ(font, 3, true, i, 1, "&#xa0;", 1);
            zzX(font, ControlChar.NON_BREAKING_SPACE);
        }
    }

    public final void zzX(Font font, String str, int i) throws Exception {
        if (this.zzYlJ) {
            zzZ(font, str, i, false);
        }
    }

    public final void zzY(Font font, String str) throws Exception {
        if (this.zzYlJ) {
            zzZ(font, str, 3, true);
        }
    }

    public final void zzYYX() {
        zzYYU();
        zzYYW();
        this.zzYlD = null;
        Paragraph paragraph = this.zzYlK;
        if (paragraph != null) {
            this.zzsU = false;
            this.zzYlE = paragraph.getParagraphFormat().getLeftIndent();
        }
    }

    public final void zzYYY() {
        zzYYU();
    }

    public final void zzZ(Font font, String str) throws Exception {
        if (this.zzYlJ) {
            zzZ(font, str, 3, false);
        }
    }

    public final void zzz4(int i) {
        this.zzYlL = i;
    }

    private Font zzW(Font font, String str) {
        Font fontZzZ = Font.zzZ((zzYEF) ((Inline) font.zzZ7g()).zzZYh().zzbn(), this.zzZCL);
        fontZzZ.setName(str);
        return fontZzZ;
    }

    private void zzX(Font font, String str) {
        if (this.zzYlK == null) {
            return;
        }
        double dZzV = zzV(str, font);
        String strZzTY = com.aspose.words.internal.zzZKN.zzTY(str);
        double dZzV2 = com.aspose.words.internal.zzZKN.equals(strZzTY, str) ? dZzV : zzV(strZzTY, font);
        double d = this.zzYlG;
        this.zzYlG = dZzV + d;
        this.zzYlF = d + dZzV2;
    }

    private void zzY(zzLU zzlu, int i) {
        zzOT zzot;
        if (!this.zzYt2.getExportRoundtripInformation() || i == 0) {
            return;
        }
        if (i == 1) {
            zzot = zzL4.zzZkM;
        } else if (i == 2) {
            zzot = zzL4.zzZkL;
        } else {
            throw new IllegalStateException("Unknown element import behavior.");
        }
        zzlu.zzV(new zzM3("-aw-import", zzot, (byte) 0));
    }

    private void zzZ(Font font, String str, int i, boolean z) throws Exception {
        com.aspose.words.internal.zzZKN.zzU3(str);
        zzZ(font, i, z, str);
        if (str.contains("&#xa0;")) {
            str = str.replace("&#xa0;", ControlChar.NON_BREAKING_SPACE);
        }
        zzX(font, str);
    }

    private zzLU zzWV(int i, int i2) {
        zzZRH zzzrhZzYdC;
        zzLU zzlu = new zzLU();
        zzY(zzlu, i2);
        Inline inline = this.zzYlI;
        if (inline != null && (zzzrhZzYdC = inline.zzZYh().zzYdC()) != null && zzzrhZzYdC.zzZh5()) {
            if (this.zzYt2.zzYZc()) {
                zzlu.zzZs("-epub-text-orientation", "upright");
                zzlu.zzZs("-epub-text-combine-horizontal", "all");
                return zzlu;
            }
            if (i == 1) {
                zzlu.zzZs("text-orientation", "upright");
                zzlu.zzZs("-webkit-text-orientation", "upright");
            }
            zzlu.zzZs("display", "inline-block");
            zzL2 zzl2 = new zzL2(new zzPP(-90.0d));
            zzlu.zzZ("-moz-transform", "rotate", zzl2);
            if (i > 1) {
                zzlu.zzZ("transform", "rotate", zzl2);
                zzlu.zzZ("-webkit-transform", "rotate", zzl2);
            }
        }
        return zzlu;
    }

    private static char zzY(int i, Font font) {
        char c = i != 1 ? i != 2 ? (i == 3 || i == 4) ? '_' : i != 5 ? (char) 0 : (char) 183 : '-' : FilenameUtils.EXTENSION_SEPARATOR;
        return c == 0 ? (font.getUnderline() != 0 || font.getStrikeThrough()) ? ControlChar.SPACE_CHAR : c : c;
    }

    private void zzZ(Font font, int i, boolean z, String str) throws Exception {
        int i2;
        boolean z2;
        if (!z) {
            str = zzW(font, str, i);
        }
        zzZJE zzzje = new zzZJE(str, zzYYV());
        while (zzzje.moveNext()) {
            String strZzZ3P = zzzje.zzZ3P();
            int length = strZzZ3P.length();
            if (zzzje.zzZ3O()) {
                strZzZ3P = zzz5(length);
                i2 = 2;
                z2 = true;
            } else {
                i2 = 0;
                z2 = z;
            }
            zzZ(font, i, z2, 0, i2, strZzZ3P, length);
        }
    }

    private void zzZ(Font font, int i, boolean z, int i2, int i3, String str, int i4) throws Exception {
        zzLU zzluZzWV = zzWV(i4, i3);
        zzZ3E().zzZN("span", 0);
        this.zzYt4.zzZ3C().zzZ(font, i, this.zzYlL | i2, zzluZzWV, this.zzYt4.zzZ3b());
        this.zzYs8.zzV(font, i);
        if (z) {
            zzZ3E().zzY(str, false);
        } else {
            zzZ3E().writeString(str);
        }
        zzZ3E().endElement("span");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzZ(zzZEM zzzem, double d, Font font, boolean z) throws Exception {
        double dZzV;
        double d2;
        Font font2;
        String string;
        String str;
        double d3;
        String name;
        int iZzZb;
        double d4;
        char cZzY = zzY(zzzem.getLeader(), font);
        if (cZzY == 0) {
            dZzV = 0.0d;
            d2 = d;
            font2 = font;
            string = "";
            str = string;
        } else {
            String strZzYR = zzYR(cZzY);
            Font fontZzW = zzW(font, "Lucida Console");
            dZzV = zzV(com.aspose.words.internal.zzZKN.zzS(cZzY, 1), fontZzW);
            if (com.aspose.words.internal.zzAN.zzZD(dZzV)) {
                d2 = d;
                string = "";
                str = strZzYR;
                font2 = fontZzW;
            } else {
                if (z) {
                    iZzZb = (int) com.aspose.words.internal.zzZKQ.zzZa(d / dZzV);
                    d4 = ((double) iZzZb) * dZzV;
                } else {
                    iZzZb = (int) com.aspose.words.internal.zzZKQ.zzZb(d / dZzV);
                    d4 = d;
                }
                string = com.aspose.words.internal.zzZNH.zzZ(new StringBuilder(), 0, strZzYR, iZzZb).toString();
                str = strZzYR;
                font2 = fontZzW;
                d3 = dZzV;
                d2 = d4;
                zzZ3E().zzZN("span", 0);
                if (!com.aspose.words.internal.zzZKN.equals(font.getName(), font2.getName())) {
                    name = "";
                } else {
                    name = font.getName();
                }
                this.zzYt4.zzZ3C().zzZ(zzzem, d2, font2, name, this.zzYlL);
                zzZE7 zzze7ZzZ3E = zzZ3E();
                if (com.aspose.words.internal.zzZKN.equals(string, "")) {
                    string = "&#xa0;";
                }
                zzze7ZzZ3E.zzY(string, false);
                if (zzzem.getAlignment() == 1 && zzzem.getAlignment() != 2) {
                    this.zzYlD = null;
                } else {
                    this.zzYlD = new zzZIX(zzZ3E().zzYXX(), zzzem.getPosition(), zzzem.getAlignment() != 1, this.zzYlG, d3, str);
                }
                zzZ3E().endElement("span");
            }
        }
        d3 = dZzV;
        zzZ3E().zzZN("span", 0);
        if (!com.aspose.words.internal.zzZKN.equals(font.getName(), font2.getName())) {
        }
        this.zzYt4.zzZ3C().zzZ(zzzem, d2, font2, name, this.zzYlL);
        zzZE7 zzze7ZzZ3E2 = zzZ3E();
        if (com.aspose.words.internal.zzZKN.equals(string, "")) {
        }
        zzze7ZzZ3E2.zzY(string, false);
        if (zzzem.getAlignment() == 1) {
            this.zzYlD = new zzZIX(zzZ3E().zzYXX(), zzzem.getPosition(), zzzem.getAlignment() != 1, this.zzYlG, d3, str);
        }
        zzZ3E().endElement("span");
    }
}
