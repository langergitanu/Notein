package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zz27 extends zz2F implements Cloneable {
    private double zzYYY;
    private zzBW zzZh4;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.zz2F
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        zz27 zz27Var = (zz27) obj;
        return com.aspose.words.internal.zzZKO.equals(zz27Var.zzZh4, this.zzZh4) && com.aspose.words.internal.zzAN.zzL(zz27Var.zzYYY, this.zzYYY);
    }

    @Override // com.aspose.words.zz2F
    public int hashCode() {
        int iHashCode = super.hashCode();
        zzBW zzbw = this.zzZh4;
        if (zzbw != null) {
            iHashCode ^= zzbw.hashCode();
        }
        return iHashCode ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzYYY);
    }

    @Override // com.aspose.words.zz2F
    public final boolean isEmpty() {
        return com.aspose.words.internal.zzAN.zzZD(this.zzYYY);
    }

    public final void zzYL(double d) {
        this.zzYYY = d;
    }

    public final void zzZ(zzBW zzbw) {
        this.zzZh4 = zzbw;
    }

    public final double zzZPS() {
        return this.zzYYY;
    }

    public final zzBW zzZQX() {
        return this.zzZh4;
    }

    @Override // com.aspose.words.zz2F
    public final int zzZvh() {
        return 5;
    }

    @Override // com.aspose.words.zz2F
    public final zz2F zzZvi() {
        zz27 zz27Var = (zz27) memberwiseClone();
        zzBW zzbw = this.zzZh4;
        if (zzbw != null) {
            zz27Var.zzZh4 = zzbw.zzZHt();
        }
        return zz27Var;
    }
}
