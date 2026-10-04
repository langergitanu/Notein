package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FileFontSource extends FontSourceBase implements com.aspose.words.internal.zzGP {
    private String zzBX;
    private String zzYzM;

    public FileFontSource(String str) {
        this.zzYzM = str;
    }

    public String getCacheKey() {
        return this.zzBX;
    }

    public String getFilePath() {
        return this.zzYzM;
    }

    @Override // com.aspose.words.FontSourceBase, com.aspose.words.internal.zzGP
    @ReservedForInternalUse
    @Deprecated
    public Iterable<com.aspose.words.internal.zzGR> getFontDataInternal() {
        return com.aspose.words.internal.zzZKV.zzZY(new com.aspose.words.internal.zzGR[]{new com.aspose.words.internal.zzKG(this.zzYzM, getCacheKey() != null ? getCacheKey() : this.zzYzM)});
    }

    @Override // com.aspose.words.FontSourceBase
    public int getType() {
        return 0;
    }

    public FileFontSource(String str, int i) {
        super(i);
        this.zzYzM = str;
    }

    public FileFontSource(String str, int i, String str2) {
        super(i);
        this.zzYzM = str;
        this.zzBX = str2;
    }
}
