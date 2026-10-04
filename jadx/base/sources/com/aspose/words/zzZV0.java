package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZV0 {
    private zz2N zzZjb;
    private zz2S zzZjc;
    private zz2C zzZjd;

    public final void zzZ(zz2S zz2s) {
        this.zzZjc = zz2s;
    }

    public final zz2N zzZTc() {
        return this.zzZjb;
    }

    public final zz2S zzZTd() {
        return this.zzZjc;
    }

    public final zz2C zzZTe() {
        return this.zzZjd;
    }

    public final zzZV0 zzZjM() {
        zzZV0 zzzv0 = new zzZV0();
        zz2S zz2s = this.zzZjc;
        if (zz2s != null) {
            zzzv0.zzZjc = zz2s.zzZvG();
        }
        zz2N zz2n = this.zzZjb;
        if (zz2n != null) {
            zzzv0.zzZjb = zz2n.zzZvt();
        }
        zz2C zz2c = this.zzZjd;
        if (zz2c != null) {
            zzzv0.zzZjd = zz2c.zzZuX();
        }
        return zzzv0;
    }

    public final void zzZ(zz2N zz2n) {
        this.zzZjb = zz2n;
    }

    public final void zzZ(zz2C zz2c) {
        this.zzZjd = zz2c;
    }
}
