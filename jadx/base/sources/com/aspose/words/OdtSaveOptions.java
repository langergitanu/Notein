package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class OdtSaveOptions extends SaveOptions {
    private int zzXMs;
    private boolean zzXMt;
    private int zzZCv;
    private String zzjf;

    public OdtSaveOptions() {
        this(60);
    }

    private void zzGe(int i) {
        if (i != 60 && i != 61) {
            throw new IllegalArgumentException("An invalid SaveFormat for this options type was chosen.");
        }
        this.zzZCv = i;
    }

    public int getMeasureUnit() {
        return this.zzXMs;
    }

    public String getPassword() {
        return this.zzjf;
    }

    @Override // com.aspose.words.SaveOptions
    public int getSaveFormat() {
        return this.zzZCv;
    }

    public boolean isStrictSchema11() {
        return this.zzXMt;
    }

    public void setMeasureUnit(int i) {
        this.zzXMs = i;
    }

    public void setPassword(String str) {
        this.zzjf = str;
    }

    @Override // com.aspose.words.SaveOptions
    public void setSaveFormat(int i) {
        zzGe(i);
    }

    public OdtSaveOptions(String str) {
        this(60);
        this.zzjf = str;
    }

    public void isStrictSchema11(boolean z) {
        this.zzXMt = z;
    }

    public OdtSaveOptions(int i) {
        this.zzXMs = 0;
        zzGe(i);
    }
}
