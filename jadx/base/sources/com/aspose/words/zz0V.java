package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz0V implements Cloneable {
    private zzBW zzZh4;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zzZ(zzBW zzbw) {
        if (zzbw == null) {
            return;
        }
        this.zzZh4 = zzbw;
    }

    public final zzBW zzZQX() {
        return this.zzZh4;
    }

    public final boolean zzZtd() {
        return this.zzZh4 == null;
    }

    public final zz0V zzZte() {
        zz0V zz0v = (zz0V) memberwiseClone();
        zzBW zzbw = this.zzZh4;
        if (zzbw != null) {
            zz0v.zzZh4 = zzbw.zzZHt();
        }
        return zz0v;
    }
}
