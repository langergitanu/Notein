package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz25 extends zz2F implements Cloneable {
    private double zzYYU;
    private double zzYYW;
    private zzBW zzZh4 = new zz3Y();
    private zzHK zzYYV = new zzHK(0.0d);

    public zz25() {
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
        zz25 zz25Var = (zz25) obj;
        return com.aspose.words.internal.zzZKO.equals(zz25Var.zzZh4, this.zzZh4) && com.aspose.words.internal.zzZKO.equals(zz25Var.zzYYV, this.zzYYV) && com.aspose.words.internal.zzAN.zzL(zz25Var.zzYYW, this.zzYYW) && com.aspose.words.internal.zzAN.zzL(zz25Var.zzYYU, this.zzYYU);
    }

    @Override // com.aspose.words.zz2F
    public final int hashCode() {
        int iHashCode = super.hashCode();
        zzBW zzbw = this.zzZh4;
        if (zzbw != null) {
            iHashCode ^= zzbw.hashCode();
        }
        return ((iHashCode ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzYYW)) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzYYV.getValue())) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzYYU);
    }

    public final void zzQ(zzHK zzhk) {
        this.zzYYV = zzhk;
    }

    public final void zzXo(double d) {
        this.zzYYU = d;
    }

    public final void zzXp(double d) {
        this.zzYYW = d;
    }

    public final void zzZ(zzBW zzbw) {
        this.zzZh4 = zzbw;
    }

    public final zzBW zzZQX() {
        return this.zzZh4;
    }

    public final double zzZuL() {
        return this.zzYYU;
    }

    public final zzHK zzZuM() {
        return this.zzYYV;
    }

    public final double zzZuN() {
        return this.zzYYW;
    }

    @Override // com.aspose.words.zz2F
    public final int zzZvh() {
        return 1;
    }

    @Override // com.aspose.words.zz2F
    public final zz2F zzZvi() {
        zz25 zz25Var = (zz25) memberwiseClone();
        zzBW zzbw = this.zzZh4;
        if (zzbw != null) {
            zz25Var.zzZh4 = zzbw.zzZHt();
        }
        return zz25Var;
    }
}
