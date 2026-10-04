package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz02 extends zz70 {
    private int zzB = 95;
    private String zzLw;
    private zzA6 zzl6;

    public zz02(zzH6 zzh6) {
        this.zzl6 = new zzA6(zzh6);
    }

    public final int getJpegQuality() {
        return this.zzB;
    }

    public final void setJpegQuality(int i) {
        if (i < 0 || i > 100) {
            throw new IllegalArgumentException("value");
        }
        this.zzB = i;
    }

    public final String zzQG() {
        return this.zzLw;
    }

    public final void zzZ(zzA6 zza6) {
        this.zzl6 = zza6;
    }

    public final void zzb(String str) {
        this.zzLw = str;
    }

    public final zzA6 zzwy() {
        return this.zzl6;
    }
}
