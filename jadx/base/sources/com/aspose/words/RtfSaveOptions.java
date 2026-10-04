package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class RtfSaveOptions extends SaveOptions {
    private boolean zzXsv;
    private boolean zzXsy;
    private boolean zzXsx = true;
    private boolean zzXsw = true;
    private boolean zzXsu = true;

    public boolean getExportCompactSize() {
        return this.zzXsy;
    }

    public boolean getExportImagesForOldReaders() {
        return this.zzXsx;
    }

    @Override // com.aspose.words.SaveOptions
    public int getSaveFormat() {
        return 30;
    }

    public boolean getSaveImagesAsWmf() {
        return this.zzXsv;
    }

    public void setExportCompactSize(boolean z) {
        this.zzXsy = z;
    }

    public void setExportImagesForOldReaders(boolean z) {
        this.zzXsx = z;
    }

    @Override // com.aspose.words.SaveOptions
    public void setSaveFormat(int i) {
        if (i != 30) {
            throw new IllegalArgumentException("An invalid SaveFormat for this options type was chosen.");
        }
    }

    public void setSaveImagesAsWmf(boolean z) {
        this.zzXsv = z;
    }

    @Override // com.aspose.words.SaveOptions
    public final void zzYZd() {
        super.zzYZd();
        setExportImagesForOldReaders(false);
        this.zzXsw = false;
        this.zzXsu = false;
    }

    public final boolean zzYg5() {
        return this.zzXsu;
    }

    public final boolean zzYg6() {
        return this.zzXsw;
    }
}
