package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zz21 extends zz2F implements Cloneable {
    private double zzYYU;
    private double zzYYW;
    private zzBW zzZh4 = new zz3H("black");
    private zzHK zzYYV = new zzHK(0.0d);
    private int zzUG = 7;
    private zzHK zzYYS = new zzHK(0.0d);
    private zzHK zzYYR = new zzHK(0.0d);
    private double zzYYQ = 1.0d;
    private double zzYYP = 1.0d;
    private boolean zzZgt = true;

    public zz21() {
        this.zzZh4.zzZ(new zzHV());
        this.zzZh4.zzZFG().setValue(0.4d);
    }

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
        zz21 zz21Var = (zz21) obj;
        return zz21Var.zzZgt == this.zzZgt && zz21Var.zzUG == this.zzUG && com.aspose.words.internal.zzAN.zzL(zz21Var.zzYYW, this.zzYYW) && com.aspose.words.internal.zzAN.zzL(zz21Var.zzYYU, this.zzYYU) && com.aspose.words.internal.zzAN.zzL(zz21Var.zzYYQ, this.zzYYQ) && com.aspose.words.internal.zzAN.zzL(zz21Var.zzYYP, this.zzYYP) && com.aspose.words.internal.zzZKO.equals(zz21Var.zzZh4, this.zzZh4) && com.aspose.words.internal.zzZKO.equals(zz21Var.zzYYV, this.zzYYV) && com.aspose.words.internal.zzZKO.equals(zz21Var.zzYYS, this.zzYYS) && com.aspose.words.internal.zzZKO.equals(zz21Var.zzYYR, this.zzYYR);
    }

    public final int getAlignment() {
        return this.zzUG;
    }

    @Override // com.aspose.words.zz2F
    public int hashCode() {
        int iHashCode = super.hashCode();
        zzBW zzbw = this.zzZh4;
        if (zzbw != null) {
            iHashCode ^= zzbw.hashCode();
        }
        return ((((((((iHashCode ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzYYW)) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzYYV.getValue())) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzYYU)) ^ this.zzUG) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzYYS.getValue())) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzYYR.getValue())) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzYYQ)) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzYYP)) ^ com.aspose.words.internal.zzZKP.zzYY(this.zzZgt);
    }

    @Override // com.aspose.words.zz2F
    public final boolean isEmpty() {
        return com.aspose.words.internal.zzAN.zzX(this.zzYYW, this.zzYYV.zzZQQ(), this.zzYYU, this.zzYYS.zzZQQ(), this.zzYYR.zzZQQ(), this.zzYYQ, this.zzYYP);
    }

    public final void setAlignment(int i) {
        this.zzUG = i;
    }

    public final void zzO(zzHK zzhk) {
        this.zzYYR = zzhk;
    }

    public final void zzP(zzHK zzhk) {
        this.zzYYS = zzhk;
    }

    public final void zzQ(zzHK zzhk) {
        this.zzYYV = zzhk;
    }

    public final void zzXm(double d) {
        this.zzYYP = d;
    }

    public final void zzXn(double d) {
        this.zzYYQ = d;
    }

    public final void zzXo(double d) {
        this.zzYYU = d;
    }

    public final void zzXp(double d) {
        this.zzYYW = d;
    }

    public final void zzY6(boolean z) {
        this.zzZgt = z;
    }

    public final void zzZ(zzBW zzbw) {
        this.zzZh4 = zzbw;
    }

    public final boolean zzZQ5() {
        return this.zzZgt;
    }

    public final zzBW zzZQX() {
        return this.zzZh4;
    }

    public final double zzZuG() {
        return this.zzYYP;
    }

    public final double zzZuH() {
        return this.zzYYQ;
    }

    public final zzHK zzZuI() {
        return this.zzYYR;
    }

    public final zzHK zzZuJ() {
        return this.zzYYS;
    }

    public final boolean zzZuK() {
        return com.aspose.words.internal.zzAN.zzZD(this.zzYYQ) && com.aspose.words.internal.zzAN.zzZD(this.zzYYP);
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
        return 6;
    }

    @Override // com.aspose.words.zz2F
    public final zz2F zzZvi() {
        zz21 zz21Var = (zz21) memberwiseClone();
        zzBW zzbw = this.zzZh4;
        if (zzbw != null) {
            zz21Var.zzZh4 = zzbw.zzZHt();
        }
        return zz21Var;
    }
}
