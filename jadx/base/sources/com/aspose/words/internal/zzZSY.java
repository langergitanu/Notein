package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZSY extends zz70 implements zzGU {
    private String zz76;
    private String zz77;
    private zzFR zz7i;
    private int zzB = 95;
    private String zzLw;
    private zzA6 zzl6;

    public zzZSY(zzH6 zzh6) {
        this.zzl6 = new zzA6(zzh6);
    }

    public final int getJpegQuality() {
        return this.zzB;
    }

    @Override // com.aspose.words.internal.zzGU
    public final String getResourcesFolderAlias() {
        return this.zz76;
    }

    public final void setJpegQuality(int i) {
        if (i < 0 || i > 100) {
            throw new IllegalArgumentException("value");
        }
        this.zzB = i;
    }

    @Override // com.aspose.words.internal.zzGU
    public final void setResourcesFolderAlias(String str) {
        this.zz76 = str;
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

    public final zzA6 zzwy() {
        return this.zzl6;
    }

    public final void zzZ(zzFR zzfr) {
        this.zz7i = zzfr;
    }
}
