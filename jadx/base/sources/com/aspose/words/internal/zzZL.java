package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZL implements Cloneable {
    private zz7 zzYD;

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public zzZL zz1() {
        return (zzZL) memberwiseClone();
    }

    public final void zzV(zz7 zz7Var) {
        this.zzYD = zz7Var;
    }

    public abstract void zzZ(zz6 zz6Var) throws Exception;

    public final zz7 zzZ5() {
        return this.zzYD;
    }

    public final void zzZ6() {
        this.zzYD.removeAt(this.zzYD.zzW(this));
        this.zzYD = null;
    }
}
