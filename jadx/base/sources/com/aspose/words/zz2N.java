package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz2N extends zz80 implements Cloneable {
    private double zzKE;
    private int zzYZk;
    private double zzYZl;
    private double zzYZm;
    private zzBW zzYZn;
    private zzBW zzYZo;
    private zzH4 zzYZp;
    private zzH4 zzYZq;
    private boolean zzYZr;

    public zz2N() {
        this(false);
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!com.aspose.words.internal.zzZ4.zzW(this, obj)) {
            return false;
        }
        zz2N zz2n = (zz2N) obj;
        return zz2n.zzYZk == this.zzYZk && com.aspose.words.internal.zzAN.zzL(zz2n.zzKE, this.zzKE) && com.aspose.words.internal.zzAN.zzL(zz2n.zzYZm, this.zzYZm) && com.aspose.words.internal.zzAN.zzL(zz2n.zzYZl, this.zzYZl) && com.aspose.words.internal.zzZKO.equals(zz2n.zzYZq, this.zzYZq) && com.aspose.words.internal.zzZKO.equals(zz2n.zzYZp, this.zzYZp) && com.aspose.words.internal.zzZKO.equals(zz2n.zzYZo, this.zzYZo) && com.aspose.words.internal.zzZKO.equals(zz2n.zzYZn, this.zzYZn);
    }

    public final int hashCode() {
        zzH4 zzh4 = this.zzYZq;
        int iHashCode = zzh4 != null ? zzh4.hashCode() : 0;
        zzH4 zzh42 = this.zzYZp;
        if (zzh42 != null) {
            iHashCode ^= zzh42.hashCode();
        }
        zzBW zzbw = this.zzYZo;
        if (zzbw != null) {
            iHashCode ^= zzbw.hashCode();
        }
        zzBW zzbw2 = this.zzYZn;
        if (zzbw2 != null) {
            iHashCode ^= zzbw2.hashCode();
        }
        return (((iHashCode ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzKE)) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzYZm)) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzYZl)) ^ this.zzYZk;
    }

    public final void zz9(double d) {
        this.zzKE = d;
    }

    public final void zzH3(int i) {
        this.zzYZk = i;
    }

    public final void zzJ(zzBW zzbw) {
        this.zzYZn = zzbw;
    }

    public final void zzK(zzBW zzbw) {
        this.zzYZo = zzbw;
    }

    public final double zzQa() {
        return this.zzKE;
    }

    public final void zzXs(double d) {
        this.zzYZl = d;
    }

    public final void zzXt(double d) {
        this.zzYZm = d;
    }

    public final void zzY(zzH4 zzh4) {
        this.zzYZp = zzh4;
    }

    public final void zzZ(zzH4 zzh4) {
        this.zzYZq = zzh4;
    }

    public final boolean zzZvC() {
        return this.zzYZr;
    }

    public final int zzZvm() {
        return this.zzYZk;
    }

    public final double zzZvn() {
        return this.zzYZl;
    }

    public final double zzZvo() {
        return this.zzYZm;
    }

    public final zzBW zzZvp() {
        return this.zzYZn;
    }

    public final zzBW zzZvq() {
        return this.zzYZo;
    }

    public final zzH4 zzZvr() {
        return this.zzYZp;
    }

    public final zzH4 zzZvs() {
        return this.zzYZq;
    }

    public final zz2N zzZvt() {
        zz2N zz2n = (zz2N) memberwiseClone();
        zzH4 zzh4 = this.zzYZq;
        if (zzh4 != null) {
            zz2n.zzYZq = zzh4.zzZQe();
        }
        zzH4 zzh42 = this.zzYZp;
        if (zzh42 != null) {
            zz2n.zzYZp = zzh42.zzZQe();
        }
        zzBW zzbw = this.zzYZo;
        if (zzbw != null) {
            zz2n.zzYZo = zzbw.zzZHt();
        }
        zzBW zzbw2 = this.zzYZn;
        if (zzbw2 != null) {
            zz2n.zzYZn = zzbw2.zzZHt();
        }
        zz2n.zzKE = this.zzKE;
        zz2n.zzYZm = this.zzYZm;
        zz2n.zzYZl = this.zzYZl;
        zz2n.zzYZk = this.zzYZk;
        zz2n.setExtensions(zzZBz());
        return zz2n;
    }

    public zz2N(boolean z) {
        this.zzYZk = 7;
        this.zzYZr = z;
    }
}
