package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class DocSaveOptions extends SaveOptions {
    private boolean zzYU0;
    private boolean zzYU1;
    private boolean zzYU2;
    private int zzZCv;
    private String zzjf;

    public DocSaveOptions() {
        this(10);
    }

    private void zzGe(int i) {
        if (i != 10 && i != 11) {
            throw new IllegalArgumentException("An invalid SaveFormat for this options type was chosen.");
        }
        this.zzZCv = i;
    }

    public boolean getAlwaysCompressMetafiles() {
        return this.zzYU0;
    }

    public String getPassword() {
        return this.zzjf;
    }

    @Override // com.aspose.words.SaveOptions
    public int getSaveFormat() {
        return this.zzZCv;
    }

    public boolean getSavePictureBullet() {
        return this.zzYU1;
    }

    public boolean getSaveRoutingSlip() {
        return this.zzYU2;
    }

    public void setAlwaysCompressMetafiles(boolean z) {
        this.zzYU0 = z;
    }

    public void setPassword(String str) {
        this.zzjf = str;
    }

    @Override // com.aspose.words.SaveOptions
    public void setSaveFormat(int i) {
        zzGe(i);
    }

    public void setSavePictureBullet(boolean z) {
        this.zzYU1 = z;
    }

    public void setSaveRoutingSlip(boolean z) {
        this.zzYU2 = z;
    }

    public DocSaveOptions(int i) {
        this.zzYU2 = true;
        this.zzYU1 = true;
        this.zzYU0 = true;
        zzGe(i);
    }
}
