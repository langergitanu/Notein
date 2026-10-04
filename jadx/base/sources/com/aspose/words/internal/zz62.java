package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz62 extends zz70 {
    private zzA6 zzl6;
    private zzH6 zzl7;
    private boolean zzl5 = true;
    private String zzl3 = "Arial";
    private zzZYF zzl4 = new zzZYF();

    public zz62(zzH6 zzh6) {
        this.zzl7 = zzh6;
        this.zzl6 = new zzA6(zzh6);
    }

    public final String getFallbackFontName() {
        return this.zzl3;
    }

    public final boolean getRasterizeTransformedElements() {
        return this.zzl5;
    }

    public final void setFallbackFontName(String str) {
        this.zzl3 = str;
    }

    public final void setRasterizeTransformedElements(boolean z) {
        this.zzl5 = z;
    }

    public final void zzY(zzZYF zzzyf) {
        this.zzl4 = zzzyf;
    }

    public final void zzZ(zzA6 zza6) {
        this.zzl6 = zza6;
    }

    public final zzZYF zzww() {
        return this.zzl4;
    }

    public final zzH6 zzwx() {
        return this.zzl7;
    }

    public final zzA6 zzwy() {
        return this.zzl6;
    }
}
