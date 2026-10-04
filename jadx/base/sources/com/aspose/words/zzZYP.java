package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZYP implements zzZ9F {
    private com.aspose.words.internal.zzGQ zzFh;
    private int zzXn;
    private boolean zzYQA;
    private boolean zzYQB;
    private boolean zzYQC;
    private int zzYQD;
    private int zzYQE;
    private int zzYQF;
    private int zzYQG;
    private boolean zzYQH;
    private boolean zzYQI;
    private zzZ zzYQJ;
    private zzZN3 zzYQK;
    private zzYE2 zzYQL;
    private boolean zzYQv;
    private boolean zzYQw;
    private int zzYQy;
    private boolean zzYQz;
    private boolean zzan;
    private zzYA7 zzYQM = zzYA7.zzY5n();
    private ArrayList<String> zzZw0 = new ArrayList<>();
    private zzYBM zzYQx = new zzYBM("", false, false, 0, 4);

    public static class zzZ extends com.aspose.words.internal.zzZYR {
        private int zzYO;
        private zzZN3 zzYQK;

        public zzZ(String str, zzZN3 zzzn3) {
            super(str);
            this.zzYQK = zzzn3;
            this.zzYO = 3;
        }

        public final void zzZ(String str, zzZN3 zzzn3, int i) {
            zzXv(str);
            this.zzYQK = zzzn3;
            this.zzYO = i;
        }

        @Override // com.aspose.words.internal.zzZYR
        public final com.aspose.words.internal.zzZXH zzy(int i) throws Exception {
            return this.zzYQK.zzXj(i, this.zzYO);
        }
    }

    public zzZYP(Inline inline, zzYEF zzyef, String str, zzYAB zzyab) throws Exception {
        CompositeNode ancestor;
        com.aspose.words.internal.zzZYD.zzXk(str);
        zzZYZ zzzyzZzZqy = inline.getDocument().zzZqy();
        this.zzFh = zzzyzZzZqy;
        this.zzYQK = new zzZN3(zzyef, inline, zzzyzZzZqy);
        this.zzYQD = zzyab.zzYTR().getNumeralFormat();
        this.zzYQC = zzyab.zzYTR().getKeepOriginalFontMetrics();
        this.zzYQJ = new zzZ(ControlChar.zzZs5, this.zzYQK);
        this.zzYQw = zzyab.zzZng() || zzNY(this.zzYQK.zzYx6);
        if (inline.getNodeType() == 21) {
            this.zzan = ((Run) inline).zzpA();
        }
        this.zzYQA = inline.getParentParagraph() != null && inline.getParentParagraph().isEndOfCell();
        boolean bool = zzyef.zzYdM().toBool();
        this.zzYQI = bool;
        this.zzYQH = bool || zzyef.zzYdL().toBool();
        this.zzYQG = zzyef.getLocaleId();
        this.zzYQE = zzyef.getLocaleIdBi();
        this.zzYQF = zzyef.getLocaleIdFarEast();
        this.zzYQy = zzZQ.zzPf(zzyef.getScaling());
        this.zzYQv = zzyab.zzYTR().zzYSN();
        this.zzYQL = new zzYE2(this, zzyab.getCompatibilityOptions(), 1);
        zzZN3 zzzn3 = this.zzYQK;
        zzY5Q zzy5q = new zzY5Q(str, new zzY5P(zzzn3.zzYx2, zzzn3.zzYx1, this.zzYQw, zzU(zzyef), zzQ(inline.getDocument()), this.zzYQE, this.zzYQI || zzZnX(), zzyab.zzY5o(), this.zzYQK.zzYxc, zzyab.getCompatibilityOptions().getBalanceSingleByteDoubleByteWidth()));
        ArrayList<String> arrayListZzYRK = zzy5q.zzYRK();
        this.zzYQB = zzy5q.zzXW0();
        int iZzU = (inline.getNodeType() != 26 || (ancestor = inline.getAncestor(20)) == null) ? 3 : zzZP.zzU(ancestor);
        for (String str2 : arrayListZzYRK) {
            com.aspose.words.internal.zzZYD.zzXk(str2);
            char cCharAt = str2.charAt(0);
            if (cCharAt == 2 || cCharAt == 5 || cCharAt == ' ' || cCharAt == 8194 || cCharAt == 8206 || cCharAt == 8207) {
                zzZ(this.zzYQK.zzYxc, str2, iZzU);
            } else {
                zzNZ(str2);
            }
        }
        this.zzXn = -1;
        this.zzYQL = null;
    }

    private void zz0(String str, int i) throws Exception {
        this.zzYQJ.zzZ(str, this.zzYQK, i);
        while (this.zzYQJ.moveNext()) {
            String text = this.zzYQJ.getText();
            String strZzY = this.zzYQJ.zzr6() ? zzY(text, this.zzYQJ.zzr7()) : null;
            boolean z = this.zzYQK.zzYx2 && Character.isLowerCase(text.charAt(0));
            zzZN3 zzzn3 = this.zzYQK;
            zzZ(EditingLanguage.ARABIC_YEMEN, text, i, z, (zzzn3.zzYx2 || zzzn3.zzYx1) && !zzWZ.zzZs(text.charAt(0)), strZzY, this.zzYQC && this.zzYQJ.getKeepOriginalFontMetrics());
        }
    }

    private boolean zzNX(String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        boolean zIsDigit = Character.isDigit(str.charAt(0));
        boolean zZzwI = zzZ3X.zzwI(this.zzYQE);
        if (!this.zzYQH || (zIsDigit && !zZzwI)) {
            return zIsDigit && zZzwI && zzZnX();
        }
        return true;
    }

    private static boolean zzNY(String str) {
        return com.aspose.words.internal.zzZYD.zzXk(str) && str.charAt(0) == '@';
    }

    private void zzNZ(String str) throws Exception {
        this.zzYQx.zzZ(str, zzZnY(), this.zzYQI, this.zzYQE, this.zzYQD);
        zzYBP.zzZ(this.zzYQx);
        this.zzYQz = this.zzYQx.zzYKS();
        this.zzYQL.zzZ(this.zzYQx.getText(), this.zzYQK.zzYxc);
    }

    private static boolean zzQ(DocumentBase documentBase) {
        int i = documentBase.zzZpV().zzYVM;
        return i == 1 || i == 2;
    }

    private String zzY(String str, com.aspose.words.internal.zzZXH zzzxh) {
        com.aspose.words.internal.zzZXH zzzxhZzZ = this.zzFh.zzZ(zzzxh, com.aspose.words.internal.zzZVS.zzA(str, 0), true);
        if (zzzxhZzZ != null) {
            return zzzxhZzZ.zzPh();
        }
        return null;
    }

    private void zzZY(String str, int i) {
        this.zzZw0.clear();
        int i2 = 0;
        while (true) {
            int i3 = i2 + i;
            if (i3 >= str.length()) {
                com.aspose.words.internal.zzZQG.zzZ(this.zzZw0, str.substring(i2));
                return;
            } else {
                com.aspose.words.internal.zzZQG.zzZ(this.zzZw0, str.substring(i2, i3));
                i2 = i3;
            }
        }
    }

    private int zzZZ(String str, int i) {
        if (this.zzan || !zzNX(str)) {
            return i;
        }
        return 2;
    }

    private boolean zzZnX() {
        int i = this.zzYQD;
        return i == 1 || i == 2;
    }

    private boolean zzZnY() {
        return this.zzYQI && !this.zzYQv;
    }

    private zzYA8 zzZo4() {
        return this.zzYQM.zzlF(this.zzXn);
    }

    public final String getText() {
        return zzZo4().zzZAL;
    }

    public final boolean moveNext() {
        int i = this.zzXn + 1;
        this.zzXn = i;
        return i < this.zzYQM.getCount();
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzT(Font font) {
        zzX(9250, ControlChar.zzZs1, zzY0C.zzW(173, font));
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzU(Font font) {
        zzX(11799, ControlChar.zzZs3, 3);
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzV(Font font) {
        zzX(9238, ControlChar.zzZs4, 3);
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzW(Font font) {
        zzX(9747, ControlChar.NON_BREAKING_SPACE, 0);
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzX(Font font) {
        zzX(12803, ControlChar.TAB, 3);
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzZ(Font font, boolean z) {
    }

    public final int zzZg() {
        return zzZo4().zzXbW.zzXbj;
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzZnZ() {
        zzX(21779, ControlChar.COLUMN_BREAK, 3);
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzZo0() {
        zzX(21788, ControlChar.PAGE_BREAK, 3);
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzZo1() {
        zzX(21514, ControlChar.LINE_BREAK, 3);
    }

    public final int zzZo2() {
        return zzZg() == 1 ? this.zzYQF : this.zzYQI ? this.zzYQE : this.zzYQG;
    }

    public final zzY9O zzZo3() {
        return zzZo4().zzXbW;
    }

    public final boolean zzZo5() {
        return this.zzYQB;
    }

    public final int zzZo6() {
        return zzZo4().zzXbX;
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzZ(Font font, String str, int i) throws Exception {
        if (str.length() <= 0) {
            return;
        }
        char cCharAt = str.charAt(0);
        int iZzXN = zzY9R.zzXN(cCharAt);
        boolean z = cCharAt == 5 || cCharAt == 2;
        if (i != 2) {
            i = zzZZ(str, i);
        } else if (!this.zzYQH && (!zzZnX() || !Character.isDigit(str.charAt(0)))) {
            i = 3;
        }
        if (iZzXN != 9217 || z) {
            zzZ(str, i, iZzXN, !z);
        } else {
            zz0(str, i);
        }
    }

    private static boolean zzU(zzYEF zzyef) {
        return zzyef.getSize() >= zzyef.zzYL4();
    }

    private void zzX(int i, String str, int i2) {
        zzZ(i, str, i2, false, false, null, false);
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzY(Font font) {
        if (this.zzYQA) {
            zzX(10785, ControlChar.zzZs5, 3);
        } else {
            zzX(21515, ControlChar.LINE_BREAK, 3);
        }
    }

    private void zzZ(String str, int i, int i2, boolean z) throws Exception {
        String strZzY;
        boolean z2;
        boolean z3 = i2 == 10754 && this.zzYQK.zzYx2;
        char cCharAt = str.charAt(0);
        com.aspose.words.internal.zzZXH zzzxhZzXj = this.zzYQK.zzXj(cCharAt, i);
        if (z && com.aspose.words.internal.zzK5.zzZ(cCharAt, zzzxhZzXj)) {
            strZzY = zzY(str, zzzxhZzXj);
            z2 = this.zzYQC && com.aspose.words.internal.zzK5.zzY(cCharAt, zzzxhZzXj);
        } else {
            strZzY = null;
            z2 = false;
        }
        String str2 = strZzY;
        if (cCharAt == '\n') {
            str = Character.toString((char) 8195);
        }
        zzZ(i2, str, i, z3, false, str2, z2);
    }

    private void zzZ(int i, String str, int i2, boolean z, boolean z2, String str2, boolean z3) {
        String fontName = this.zzYQK.getFontName(i2);
        String str3 = str2 != null ? str2 : fontName;
        if (!z3) {
            fontName = null;
        }
        String str4 = fontName;
        boolean z4 = false;
        if (this.zzYQw && zz0.zzP(str3, str.charAt(0))) {
            z4 = true;
        }
        boolean z5 = z4;
        zzZY(str, zzZ(i2, this.zzYQK.zzYxc, this.zzYQy));
        Iterator<String> it = this.zzZw0.iterator();
        while (it.hasNext()) {
            this.zzYQM.zzZ(new zzYA8(i, it.next(), i2, str4, str3, z, z2, this.zzYQz, z5));
        }
    }

    private static int zzZ(int i, Font font, int i2) {
        return Integer.MAX_VALUE / (zzT9.zzMF(i2) * com.aspose.words.internal.zzSA.zzn(zzZQ.zzZ7(i == 2 ? font.getSizeBi() : font.getSize())));
    }
}
