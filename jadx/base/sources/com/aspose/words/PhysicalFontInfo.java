package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class PhysicalFontInfo {
    private String zzAn;
    private String zzAp;
    private String zzYzM;
    private String zzaF;

    public PhysicalFontInfo(String str, String str2, String str3, String str4) {
        this.zzAp = str;
        this.zzaF = str2;
        this.zzAn = str3;
        this.zzYzM = str4;
    }

    public String getFilePath() {
        return this.zzYzM;
    }

    public String getFontFamilyName() {
        return this.zzAp;
    }

    public String getFullFontName() {
        return this.zzaF;
    }

    public String getVersion() {
        return this.zzAn;
    }
}
