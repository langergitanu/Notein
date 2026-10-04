package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz6W implements Cloneable {
    private String mName;
    private boolean zzZ38;
    private zz7M zzZ39;

    public zz6W(String str, zz7M zz7m, boolean z) {
        this.mName = str;
        this.zzZ39 = zz7m;
        this.zzZ38 = z;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final String getName() {
        return this.mName;
    }

    public final boolean zzZA5() {
        return this.zzZ38;
    }

    public final zz7M zzZA6() {
        return this.zzZ39;
    }

    public final zz6W zzZA7() {
        zz6W zz6w = (zz6W) memberwiseClone();
        zz7M zz7m = this.zzZ39;
        if (zz7m != null) {
            zz6w.zzZ39 = zz7m.zzZAR();
        }
        return zz6w;
    }
}
