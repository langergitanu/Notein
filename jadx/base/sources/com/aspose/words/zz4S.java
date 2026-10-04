package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zz4S implements Cloneable {
    private zzC3 zzZ11;
    private zz4T zzZ12;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zzY(zz4T zz4t) {
        this.zzZ12 = zz4t;
    }

    public final void zzZ(zzC3 zzc3) {
        this.zzZ11 = zzc3;
    }

    public abstract int zzZFM();

    public final zz4T zzZxV() {
        return this.zzZ12;
    }

    public final zzC3 zzZxW() {
        return this.zzZ11;
    }

    public final zz4S zzZxX() {
        zz4S zz4s = (zz4S) memberwiseClone();
        zz4T zz4t = this.zzZ12;
        if (zz4t != null) {
            zz4s.zzZ12 = zz4t.zzZy0();
        }
        zzC3 zzc3 = this.zzZ11;
        if (zzc3 != null) {
            zz4s.zzZ11 = zzc3.zzZFN();
        }
        return zz4s;
    }
}
