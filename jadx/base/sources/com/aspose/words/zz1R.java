package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zz1R extends zz2F implements Cloneable {
    private double zzYYE;
    private double zzYYH;
    private double zzYYU;
    private double zzYYW;
    private zzHK zzYYV = new zzHK();
    private int zzUG = 7;
    private zzHK zzYYS = new zzHK();
    private zzHK zzYYR = new zzHK();
    private double zzYYQ = 1.0d;
    private double zzYYP = 1.0d;
    private boolean zzZgt = true;
    private double zzYYG = 1.0d;
    private double zzYYF = 1.0d;
    private zzHK zzYYD = new zzHK(5400000.0d);

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
        zz1R zz1r = (zz1R) obj;
        return zz1r.zzZgt == this.zzZgt && zz1r.zzUG == this.zzUG && com.aspose.words.internal.zzAN.zzL(zz1r.zzYYW, this.zzYYW) && com.aspose.words.internal.zzAN.zzL(zz1r.zzYYU, this.zzYYU) && com.aspose.words.internal.zzAN.zzL(zz1r.zzYYQ, this.zzYYQ) && com.aspose.words.internal.zzAN.zzL(zz1r.zzYYP, this.zzYYP) && com.aspose.words.internal.zzAN.zzL(zz1r.zzYYH, this.zzYYH) && com.aspose.words.internal.zzAN.zzL(zz1r.zzYYG, this.zzYYG) && com.aspose.words.internal.zzAN.zzL(zz1r.zzYYF, this.zzYYF) && com.aspose.words.internal.zzAN.zzL(zz1r.zzYYE, this.zzYYE) && com.aspose.words.internal.zzZKO.equals(zz1r.zzYYV, this.zzYYV) && com.aspose.words.internal.zzZKO.equals(zz1r.zzYYD, this.zzYYD) && com.aspose.words.internal.zzZKO.equals(zz1r.zzYYS, this.zzYYS) && com.aspose.words.internal.zzZKO.equals(zz1r.zzYYR, this.zzYYR);
    }

    public final int getAlignment() {
        return this.zzUG;
    }

    @Override // com.aspose.words.zz2F
    public int hashCode() {
        return (((((((((((super.hashCode() ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzYYW)) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzYYV.getValue())) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzYYU)) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzYYS.getValue())) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzYYR.getValue())) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzYYQ)) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzYYP)) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzYYH)) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzYYG)) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzYYF)) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzYYE)) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzYYD.getValue());
    }

    @Override // com.aspose.words.zz2F
    public final boolean isEmpty() {
        return com.aspose.words.internal.zzAN.zzX(this.zzYYW, this.zzYYV.zzZQQ(), this.zzYYU, this.zzYYS.zzZQQ(), this.zzYYR.zzZQQ(), this.zzYYQ, this.zzYYP, this.zzYYH, this.zzYYG, this.zzYYF, this.zzYYE, this.zzYYD.zzZQQ());
    }

    public final void setAlignment(int i) {
        this.zzUG = i;
    }

    public final void zzN(zzHK zzhk) {
        this.zzYYD = zzhk;
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

    public final void zzXi(double d) {
        this.zzYYE = d;
    }

    public final void zzXj(double d) {
        this.zzYYF = d;
    }

    public final void zzXk(double d) {
        this.zzYYG = d;
    }

    public final void zzXl(double d) {
        this.zzYYH = d;
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

    public final boolean zzZQ5() {
        return this.zzZgt;
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

    public final double zzZuL() {
        return this.zzYYU;
    }

    public final zzHK zzZuM() {
        return this.zzYYV;
    }

    public final double zzZuN() {
        return this.zzYYW;
    }

    public final zzHK zzZuv() {
        return this.zzYYD;
    }

    public final double zzZuw() {
        return this.zzYYE;
    }

    public final double zzZux() {
        return this.zzYYF;
    }

    public final double zzZuy() {
        return this.zzYYG;
    }

    public final double zzZuz() {
        return this.zzYYH;
    }

    @Override // com.aspose.words.zz2F
    public final int zzZvh() {
        return 7;
    }

    @Override // com.aspose.words.zz2F
    public final zz2F zzZvi() {
        return (zz1R) memberwiseClone();
    }
}
