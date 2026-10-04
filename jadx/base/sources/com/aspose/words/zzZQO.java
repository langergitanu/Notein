package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQO {
    private String zzYER;
    private String zzYES;
    private zzYWB zzYET;
    private String zzYEU;
    private int zzYEV;
    private String zzYEW;
    private boolean zzYEX;
    private boolean zzYEY;
    private zzYWB zzYF7;
    private String zzZi;

    public zzZQO(FieldXE fieldXE) {
        this.zzYF7 = fieldXE.zzZgq().zzZfE();
        this.zzZi = fieldXE.getText();
        this.zzYEY = fieldXE.isBold();
        this.zzYEX = fieldXE.isItalic();
        String entryType = fieldXE.getEntryType();
        this.zzYEW = entryType;
        this.zzYEV = zzZQ3.zzLV(entryType);
        this.zzYEU = fieldXE.getPageRangeBookmarkName();
        this.zzYET = fieldXE.zzZeA();
        this.zzYES = fieldXE.getPageNumberReplacement();
        this.zzYER = fieldXE.getYomi();
    }

    public final String getEntryType() {
        return this.zzYEW;
    }

    public final String getPageNumberReplacement() {
        return this.zzYES;
    }

    public final String getPageRangeBookmarkName() {
        return this.zzYEU;
    }

    public final String getText() {
        return this.zzZi;
    }

    public final String getYomi() {
        return this.zzYER;
    }

    public final boolean isBold() {
        return this.zzYEY;
    }

    public final boolean isItalic() {
        return this.zzYEX;
    }

    public final zzYWB zzZeA() {
        return this.zzYET;
    }

    public final boolean zzZeB() {
        return this.zzYEU != null;
    }

    public final int zzZeC() {
        return this.zzYEV;
    }

    public final zzYWB zzZeH() {
        return this.zzYF7;
    }

    public final boolean zzZez() {
        return this.zzYES != null;
    }
}
