package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYA4 {
    private boolean zzXbH;
    private boolean zzXbI;
    private zzZ zzXbJ;
    private zzZ zzXbK;
    private Paragraph zzYtC;

    public static class zzZ {
        int zzXbC;
        int zzXbD;
        boolean zzXbE;
        boolean zzXbF;
        boolean zzXbG;

        public zzZ(Paragraph paragraph, boolean z) {
            this.zzXbG = z;
            if (zzYA4.zzP(paragraph, z)) {
                ListLevel listLevelZzRB = paragraph.zzRB(z);
                ListLabel listLabel = paragraph.getListLabel();
                this.zzXbF = com.aspose.words.internal.zzZYD.zzXk(z ? listLabel.zzYOt() : listLabel.zzYOu()) || listLevelZzRB.zzYOb();
                this.zzXbE = listLevelZzRB.getTrailingCharacter() != 2;
            }
        }
    }

    public zzYA4(Paragraph paragraph, boolean z, boolean z2) {
        this.zzYtC = paragraph;
        this.zzXbI = z;
        this.zzXbH = z2;
        this.zzXbK = new zzZ(paragraph, false);
        this.zzXbJ = new zzZ(paragraph, true);
        zzY5h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzP(Paragraph paragraph, boolean z) {
        return z ? paragraph.zzYoT() : paragraph.zzYoU();
    }

    private zzZ zzY5c() {
        return this.zzXbI ? this.zzXbK : this.zzXbJ;
    }

    private zzZ zzY5d() {
        return this.zzXbI ? this.zzXbJ : this.zzXbK;
    }

    private void zzY5h() {
        if (this.zzXbH && this.zzYtC.isInsertRevision()) {
            zzZ zzz = this.zzXbK;
            zzz.zzXbD = 0;
            zzz.zzXbC = 0;
            zzZ zzz2 = this.zzXbJ;
            zzz2.zzXbD = zzz2.zzXbF ? 3 : 0;
            zzz2.zzXbC = zzz2.zzXbE ? 3 : 0;
            return;
        }
        if (this.zzXbH && this.zzYtC.isDeleteRevision()) {
            zzZ zzz3 = this.zzXbK;
            zzz3.zzXbD = zzz3.zzXbF ? 2 : 0;
            zzz3.zzXbC = zzz3.zzXbE ? 2 : 0;
            zzZ zzz4 = this.zzXbJ;
            zzz4.zzXbD = 0;
            zzz4.zzXbC = 0;
            return;
        }
        if (!this.zzXbH || !zzYh(this.zzYtC)) {
            zzY5d().zzXbD = zzY5d().zzXbF ? 1 : 0;
            zzY5d().zzXbC = zzY5d().zzXbE ? 1 : 0;
            zzY5c().zzXbD = 0;
            zzY5c().zzXbC = 0;
            return;
        }
        if (this.zzXbI) {
            zzZ zzz5 = this.zzXbK;
            zzz5.zzXbD = zzz5.zzXbF ? 2 : 0;
            zzz5.zzXbC = zzz5.zzXbE ? 1 : 0;
            zzZ zzz6 = this.zzXbJ;
            zzz6.zzXbD = zzz6.zzXbF ? 3 : 0;
            zzz6.zzXbC = zzz6.zzXbE ? 3 : 0;
            return;
        }
        zzZ zzz7 = this.zzXbK;
        zzz7.zzXbD = zzz7.zzXbF ? 2 : 0;
        zzz7.zzXbC = 0;
        zzZ zzz8 = this.zzXbJ;
        zzz8.zzXbD = zzz8.zzXbF ? 3 : 0;
        zzz8.zzXbC = zzz8.zzXbE ? 3 : 0;
    }

    private static boolean zzYh(Paragraph paragraph) {
        if ((!paragraph.zzYoU() && !paragraph.zzYoT()) || paragraph.zzYoU() != paragraph.zzYoT()) {
            return true;
        }
        ListLabel listLabel = paragraph.getListLabel();
        String strZzYOu = listLabel.zzYOu();
        String strZzYOt = listLabel.zzYOt();
        ListLevel listLevelZzRB = paragraph.zzRB(false);
        ListLevel listLevelZzRB2 = paragraph.zzRB(true);
        if (listLevelZzRB.zzYOb() != listLevelZzRB2.zzYOb()) {
            return true;
        }
        if (!listLevelZzRB.zzYOb() || listLevelZzRB.zzZ0p() == listLevelZzRB2.zzZ0p()) {
            return (com.aspose.words.internal.zzZYD.zzXk(strZzYOu) || com.aspose.words.internal.zzZYD.zzXk(strZzYOt)) && !com.aspose.words.internal.zzZKN.zzX(strZzYOu, strZzYOt, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8);
        }
        return true;
    }

    public final int getTrailingCharacter() {
        TabStop tabStopZzY0o;
        zzZ zzzZzY5c = zzY5d().zzXbC == 0 ? zzY5c() : zzY5d();
        if (zzzZzY5c.zzXbC == 0) {
            return 2;
        }
        TabStopCollection tabStops = this.zzYtC.zzqw(StyleIdentifier.BIBLIOGRAPHY).getTabStops();
        return (tabStops == null || (tabStopZzY0o = tabStops.zzY0o()) == null) ? this.zzYtC.zzRB(zzzZzY5c.zzXbG).getTrailingCharacter() : tabStopZzY0o.zzY0B();
    }

    public final String[] zzQp(boolean z) {
        return z ? this.zzYtC.getListLabel().zzYOy() : this.zzYtC.getListLabel().zzYOz();
    }

    public final Shape zzQq(boolean z) {
        ListLevel listLevelZzRB = this.zzYtC.zzRB(z);
        if (listLevelZzRB.zzYOb()) {
            return listLevelZzRB.zzZ0P();
        }
        return null;
    }

    public final int zzY5e() {
        if (zzY5d().zzXbC != 0) {
            return zzY5d().zzXbC;
        }
        if (this.zzXbH) {
            return zzY5c().zzXbC;
        }
        return 0;
    }

    public final int zzY5f() {
        return this.zzXbJ.zzXbD;
    }

    public final int zzY5g() {
        return this.zzXbK.zzXbD;
    }
}
