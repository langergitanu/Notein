package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz1W extends zz2F implements Cloneable {
    private int zzYYJ;
    private double zzYYU;
    private zzBW zzZh4 = new zz3Y();
    private zzHK zzYYV = new zzHK();

    public zz1W() {
        this.zzZh4.zzZ(new zzHV());
        this.zzZh4.zzZFG().setValue(0.5d);
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.zz2F
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        zz1W zz1w = (zz1W) obj;
        return zz1w.zzYYJ == this.zzYYJ && com.aspose.words.internal.zzAN.zzL(zz1w.zzYYU, this.zzYYU) && com.aspose.words.internal.zzZKO.equals(zz1w.zzZh4, this.zzZh4) && com.aspose.words.internal.zzZKO.equals(zz1w.zzYYV, this.zzYYV);
    }

    @Override // com.aspose.words.zz2F
    public final int hashCode() {
        int iHashCode = super.hashCode();
        zzBW zzbw = this.zzZh4;
        if (zzbw != null) {
            iHashCode ^= zzbw.hashCode();
        }
        return ((iHashCode ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzYYV.getValue())) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzYYU)) ^ this.zzYYJ;
    }

    public final void zzGW(int i) {
        this.zzYYJ = i;
    }

    public final void zzQ(zzHK zzhk) {
        this.zzYYV = zzhk;
    }

    public final void zzXo(double d) {
        this.zzYYU = d;
    }

    public final void zzZ(zzBW zzbw) {
        this.zzZh4 = zzbw;
    }

    public final zzBW zzZQX() {
        return this.zzZh4;
    }

    public final int zzZuE() {
        return this.zzYYJ;
    }

    public final double zzZuL() {
        return this.zzYYU;
    }

    public final zzHK zzZuM() {
        return this.zzYYV;
    }

    @Override // com.aspose.words.zz2F
    public final int zzZvh() {
        return 2;
    }

    @Override // com.aspose.words.zz2F
    public final zz2F zzZvi() {
        zz1W zz1w = (zz1W) memberwiseClone();
        zzBW zzbw = this.zzZh4;
        if (zzbw != null) {
            zz1w.zzZh4 = zzbw.zzZHt();
        }
        return zz1w;
    }
}
