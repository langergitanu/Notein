package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FolderFontSource extends FontSourceBase implements com.aspose.words.internal.zzGP {
    private boolean zzBH;
    private String zzBI;

    public FolderFontSource(String str, boolean z) {
        this.zzBI = str;
        this.zzBH = z;
    }

    public String getFolderPath() {
        return this.zzBI;
    }

    @Override // com.aspose.words.FontSourceBase, com.aspose.words.internal.zzGP
    @ReservedForInternalUse
    @Deprecated
    public Iterable<com.aspose.words.internal.zzGR> getFontDataInternal() {
        return com.aspose.words.internal.zzK8.zzZ(this.zzBI, this.zzBH, new zzY21(getWarningCallback()));
    }

    public boolean getScanSubfolders() {
        return this.zzBH;
    }

    @Override // com.aspose.words.FontSourceBase
    public int getType() {
        return 1;
    }

    public FolderFontSource(String str, boolean z, int i) {
        super(i);
        this.zzBI = str;
        this.zzBH = z;
    }
}
