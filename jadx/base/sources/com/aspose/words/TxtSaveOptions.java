package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class TxtSaveOptions extends TxtSaveOptionsBase {
    private TxtListIndentation zzX1r = new TxtListIndentation();
    private boolean zzX1s;
    private boolean zzX1t;
    private boolean zzX1u;
    private int zzX1v;

    public boolean getAddBidiMarks() {
        return this.zzX1s;
    }

    public TxtListIndentation getListIndentation() {
        return this.zzX1r;
    }

    public int getMaxCharactersPerLine() {
        return this.zzX1v;
    }

    public boolean getPreserveTableLayout() {
        return this.zzX1u;
    }

    @Override // com.aspose.words.SaveOptions
    public int getSaveFormat() {
        return 70;
    }

    public boolean getSimplifyListLabels() {
        return this.zzX1t;
    }

    public void setAddBidiMarks(boolean z) {
        this.zzX1s = z;
    }

    public void setMaxCharactersPerLine(int i) {
        this.zzX1v = i;
    }

    public void setPreserveTableLayout(boolean z) {
        this.zzX1u = z;
    }

    @Override // com.aspose.words.SaveOptions
    public void setSaveFormat(int i) {
        if (i != 70) {
            throw new IllegalArgumentException("An invalid SaveFormat for this options type was chosen.");
        }
    }

    public void setSimplifyListLabels(boolean z) {
        this.zzX1t = z;
    }
}
