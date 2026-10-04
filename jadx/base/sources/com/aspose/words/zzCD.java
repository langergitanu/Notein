package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzCD implements Cloneable {
    private zzBW zzZ98;
    private zzBW zzZ99;
    private zzBW zzZ9a;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final boolean isEmpty() {
        return this.zzZ9a == null && this.zzZ99 == null && this.zzZ98 == null;
    }

    public final void zzW(zzBW zzbw) {
        this.zzZ98 = zzbw;
    }

    public final void zzX(zzBW zzbw) {
        this.zzZ99 = zzbw;
    }

    public final void zzY(zzBW zzbw) {
        this.zzZ9a = zzbw;
    }

    public final zzBW zzZG3() {
        return this.zzZ98;
    }

    public final zzBW zzZG4() {
        return this.zzZ99;
    }

    public final zzBW zzZG5() {
        return this.zzZ9a;
    }

    public final zzCD zzZG6() {
        zzCD zzcd = (zzCD) memberwiseClone();
        zzBW zzbw = this.zzZ9a;
        if (zzbw != null) {
            zzcd.zzZ9a = zzbw.zzZHt();
        }
        zzBW zzbw2 = this.zzZ99;
        if (zzbw2 != null) {
            zzcd.zzZ99 = zzbw2.zzZHt();
        }
        zzBW zzbw3 = this.zzZ98;
        if (zzbw3 != null) {
            zzcd.zzZ98 = zzbw3.zzZHt();
        }
        return zzcd;
    }
}
