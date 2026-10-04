package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class DefaultFontSubstitutionRule extends FontSubstitutionRule {
    private String zzLV;

    public DefaultFontSubstitutionRule(Object obj) {
        super(obj);
        this.zzLV = "Times New Roman";
    }

    public String getDefaultFontName() {
        String str;
        synchronized (getSyncRoot()) {
            str = this.zzLV;
        }
        return str;
    }

    public void setDefaultFontName(String str) {
        synchronized (getSyncRoot()) {
            if (str == null) {
                str = "";
            }
            this.zzLV = str;
        }
    }

    @Override // com.aspose.words.FontSubstitutionRule
    public final com.aspose.words.internal.zzZXH zzZ(String str, int i, FontInfo fontInfo, com.aspose.words.internal.zzKJ zzkj) {
        return zzkj.zzV(getDefaultFontName(), i);
    }
}
