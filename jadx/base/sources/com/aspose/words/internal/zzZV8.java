package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZV8 extends zz70 implements zzGU {
    private boolean zz75;
    private String zz76;
    private String zz77;
    private String zzLw;
    private zzA6 zzl6;
    private zzH6 zzl7;
    private boolean zzxd;
    private boolean zz78 = true;
    private int zzB = 95;
    private zzFR zz7i = zz7N.zznX;

    public zzZV8(zzH6 zzh6) {
        this.zzl7 = zzh6;
        this.zzl6 = new zzA6(zzh6);
    }

    public final boolean getExportEmbeddedImages() {
        return this.zz75;
    }

    public final int getJpegQuality() {
        return this.zzB;
    }

    public final boolean getPrettyFormat() {
        return this.zzxd;
    }

    @Override // com.aspose.words.internal.zzGU
    public final String getResourcesFolderAlias() {
        return this.zz76;
    }

    public final boolean getShowPageBorder() {
        return this.zz78;
    }

    public final void setExportEmbeddedImages(boolean z) {
        this.zz75 = z;
    }

    public final void setJpegQuality(int i) {
        if (i < 0 || i > 100) {
            throw new IllegalArgumentException("value");
        }
        this.zzB = i;
    }

    public final void setPrettyFormat(boolean z) {
        this.zzxd = z;
    }

    @Override // com.aspose.words.internal.zzGU
    public final void setResourcesFolderAlias(String str) {
        this.zz76 = str;
    }

    public final void setShowPageBorder(boolean z) {
        this.zz78 = z;
    }

    @Override // com.aspose.words.internal.zzGU
    public final String zzFB() {
        return this.zz77;
    }

    public final String zzQG() {
        return this.zzLw;
    }

    @Override // com.aspose.words.internal.zzGU
    public final void zzYZ(String str) {
        this.zz77 = str;
    }

    public final void zzZ(zzA6 zza6) {
        this.zzl6 = zza6;
    }

    public final void zzb(String str) {
        this.zzLw = str;
    }

    public final zzFR zzn7() {
        if (this.zz7i == null) {
            this.zz7i = zz7N.zznX;
        }
        return this.zz7i;
    }

    public final zzH6 zzwx() {
        return this.zzl7;
    }

    public final zzA6 zzwy() {
        return this.zzl6;
    }

    public final void zzZ(zzFR zzfr) {
        this.zz7i = zzfr;
    }
}
