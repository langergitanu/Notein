package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZGI {
    private zzYMX zzYop;
    private zzYMX zzYoq;
    private Paragraph zzYor;
    private int zzZio;

    private zzZGI(Paragraph paragraph, zzYMX zzymx, zzYMX zzymx2, int i) {
        this.zzYor = paragraph;
        this.zzYoq = zzymx;
        this.zzYop = zzymx2;
        this.zzZio = i;
    }

    public static zzZGI zzU(Paragraph paragraph, int i) {
        return new zzZGI(paragraph, null, null, i);
    }

    public static zzZGI zzZ(Paragraph paragraph, zzYMX zzymx, zzYMX zzymx2, int i) {
        return new zzZGI(paragraph, zzymx, zzymx2, i);
    }

    private boolean zzZ0M() {
        return this.zzZio == 1;
    }

    private boolean zzZ0N() {
        return this.zzYoq != null;
    }

    public static zzZGI zzZW(Paragraph paragraph) {
        return new zzZGI(paragraph, null, null, 1);
    }

    public final double getFirstLineIndent() {
        return ((double) (zzZ0N() ? zzZ0M() ? this.zzYop.zzYMa() : this.zzYoq.zzYMa() : ((Integer) this.zzYor.zzWm(EditingLanguage.CENTRAL_KURDISH_IRAQ, this.zzZio)).intValue())) / 20.0d;
    }

    public final String getLabelString() {
        return zzZ0M() ? this.zzYor.getListLabel().zzYOt() : this.zzYor.getListLabel().zzYOu();
    }

    public final int getLabelValue() {
        return zzZ0M() ? this.zzYor.getListLabel().zzYOv() : this.zzYor.getListLabel().getLabelValue();
    }

    public final double getLeftIndent() {
        return ((double) (zzZ0N() ? zzZ0M() ? this.zzYop.zzYM7() : this.zzYoq.zzYM7() : ((Integer) this.zzYor.zzWm(1160, this.zzZio)).intValue())) / 20.0d;
    }

    public final List getList() {
        return this.zzYor.zzRC(zzZ0M());
    }

    public final ListLevel getListLevel() {
        return this.zzYor.zzRB(zzZ0M());
    }

    public final double getRightIndent() {
        return ((double) (zzZ0N() ? zzZ0M() ? this.zzYop.zzYM4() : this.zzYoq.zzYM4() : ((Integer) this.zzYor.zzWm(EditingLanguage.BRETON, this.zzZio)).intValue())) / 20.0d;
    }

    public final int getTrailingCharacter() {
        TabStop tabStopZzY0o = zzZ0O().zzY0o();
        return tabStopZzY0o != null ? tabStopZzY0o.zzY0B() : zzZ0M() ? this.zzYor.getListLabel().zzYOs() : this.zzYor.getListLabel().getTrailingCharacter();
    }

    public final boolean isListItem() {
        boolean zZzYoT = zzZ0M() ? this.zzYor.zzYoT() : this.zzYor.zzYoU();
        if (!zZzYoT || zzZ4D.zzR(this.zzYor, 0) || zzZ4D.zzR(this.zzYor, 1)) {
            return zZzYoT;
        }
        return false;
    }

    public final TabStopCollection zzZ0O() {
        TabStopCollection tabStops = zzZ0N() ? zzZ0M() ? this.zzYop.getTabStops() : this.zzYoq.getTabStops() : (TabStopCollection) this.zzYor.zzWm(EditingLanguage.GUARANI, this.zzZio);
        return tabStops != null ? tabStops : new TabStopCollection();
    }

    public final Shape zzZ0P() {
        return getListLevel().zzZ0P();
    }

    public final String[] zzZ0Q() {
        return zzZ0M() ? this.zzYor.getListLabel().zzYOw() : this.zzYor.getListLabel().zzYOx();
    }

    public final boolean zzZ0R() {
        return zzZ0M() ? this.zzYor.zzYoX() : this.zzYor.zzZ0R();
    }

    public final Font zzZ0S() {
        return Font.zzZ(this.zzYor.getListLabel().zzU(true, (zzZ0M() ? 8 : 0) | 1), this.zzYor.getDocument());
    }
}
