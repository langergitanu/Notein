package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class XlsxSaveOptions extends SaveOptions {
    private int zzWSs;
    private int zzn1 = 0;

    public int getCompressionLevel() {
        return this.zzn1;
    }

    @Override // com.aspose.words.SaveOptions
    public int getSaveFormat() {
        return 80;
    }

    public int getSectionMode() {
        return this.zzWSs;
    }

    public void setCompressionLevel(int i) {
        this.zzn1 = i;
    }

    @Override // com.aspose.words.SaveOptions
    public void setSaveFormat(int i) {
        if (i != 80) {
            throw new IllegalArgumentException("An invalid SaveFormat for this options type was chosen.");
        }
    }

    public void setSectionMode(int i) {
        this.zzWSs = i;
    }
}
