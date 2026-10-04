package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZS7 extends zz70 {
    private boolean zz5C;
    private zzA6 zzl6;
    private zz6U zzgU = new zz6U();
    private int zzB = 95;

    public zzZS7(zzH6 zzh6) {
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

    public final void zzZ(zzA6 zza6) {
        this.zzl6 = zza6;
    }

    public final void zzZb(boolean z) {
        this.zz5C = z;
    }

    public final boolean zzm3() {
        return this.zz5C;
    }

    public final zz6U zztw() {
        return this.zzgU;
    }

    public final zzA6 zzwy() {
        return this.zzl6;
    }

    public final void zzZ(zz6U zz6u) {
        if (zz6u == null) {
            zz6u = new zz6U();
        }
        this.zzgU = zz6u;
    }
}
