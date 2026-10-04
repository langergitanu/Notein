package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz2S extends zz80 implements Cloneable {
    private boolean zzYZr;
    private zzHA zzYZs;
    private zz5Z zzYZt;
    private zzGO zzYZu;

    public zz2S() {
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
        zz2S zz2s = (zz2S) obj;
        return zz2s.zzYZr == this.zzYZr && com.aspose.words.internal.zzZKO.equals(zz2s.zzZvF(), zzZvF()) && com.aspose.words.internal.zzZKO.equals(zz2s.zzZvE(), zzZvE()) && com.aspose.words.internal.zzZKO.equals(zz2s.zzYZs, this.zzYZs);
    }

    public final int hashCode() {
        int iHashCode = zzZvF().hashCode() ^ zzZvE().hashCode();
        zzHA zzha = this.zzYZs;
        if (zzha != null) {
            iHashCode ^= zzha.hashCode();
        }
        return iHashCode ^ com.aspose.words.internal.zzZKP.zzYY(this.zzYZr);
    }

    public final void zzZ(zzGO zzgo) {
        this.zzYZu = zzgo;
    }

    public final boolean zzZvC() {
        return this.zzYZr;
    }

    public final zzHA zzZvD() {
        return this.zzYZs;
    }

    public final zz5Z zzZvE() {
        if (this.zzYZt == null) {
            this.zzYZt = new zz5Z();
        }
        return this.zzYZt;
    }

    public final zzGO zzZvF() {
        if (this.zzYZu == null) {
            this.zzYZu = new zzGO();
        }
        return this.zzYZu;
    }

    public final zz2S zzZvG() {
        zz2S zz2s = (zz2S) memberwiseClone();
        zzGO zzgo = this.zzYZu;
        if (zzgo != null) {
            zz2s.zzYZu = zzgo.zzZPA();
        }
        zz5Z zz5z = this.zzYZt;
        if (zz5z != null) {
            zz2s.zzYZt = zz5z.zzZyO();
        }
        zzHA zzha = this.zzYZs;
        if (zzha != null) {
            zz2s.zzYZs = zzha.zzZQp();
        }
        zz2s.setExtensions(zzZBz());
        return zz2s;
    }

    public zz2S(boolean z) {
        this.zzYZr = z;
    }

    public final void zzZ(zz5Z zz5z) {
        this.zzYZt = zz5z;
    }

    public final void zzZ(zzHA zzha) {
        this.zzYZs = zzha;
    }
}
