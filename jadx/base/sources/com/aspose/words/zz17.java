package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zz17 implements Cloneable {
    private zzBW zzZh4;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final boolean isEmpty() {
        return this.zzZh4 == null;
    }

    public final void zzZ(zzBW zzbw) {
        this.zzZh4 = zzbw;
    }

    public zz17 zzZM2() {
        zz17 zz17Var = (zz17) memberwiseClone();
        zzBW zzbw = this.zzZh4;
        if (zzbw != null) {
            zz17Var.zzZh4 = zzbw.zzZHt();
        }
        return zz17Var;
    }

    public final zzBW zzZQX() {
        return this.zzZh4;
    }
}
