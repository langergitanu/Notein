package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zz07 {
    private static zz07 zzYX9 = new zz6X();
    private double zzXA;
    private double zzXw;
    private double zzXx;
    private double zzXy;
    private boolean zzYXa;
    private long zzZg9 = 0;
    private int zzYXb = 0;
    private zzHK zzZhQ = new zzHK();

    public final int getFlipOrientation() {
        return this.zzYXb;
    }

    public final double getHeight() {
        return this.zzXA;
    }

    public final double getWidth() {
        return this.zzXy;
    }

    public void offset(float f, float f2) {
        this.zzXx += (double) f;
        this.zzXw += (double) f2;
    }

    public final void setFlipOrientation(int i) {
        this.zzYXb = i;
    }

    public final void setHeight(double d) {
        this.zzXA = d;
    }

    public final void setWidth(double d) {
        this.zzXy = d;
    }

    public final long zzNV() {
        return com.aspose.words.internal.zzZPY.zzG((float) ((this.zzXy / 2.0d) + this.zzXx), (float) ((this.zzXA / 2.0d) + this.zzXw));
    }

    public final double zzQb() {
        return this.zzXx;
    }

    public final void zzT(zz07 zz07Var) {
        zz07Var.zzYXb = this.zzYXb;
        zz07Var.zzXA = this.zzXA;
        zz07Var.zzZhQ = this.zzZhQ;
        zz07Var.zzYXa = this.zzYXa;
        zz07Var.zzXy = this.zzXy;
        zz07Var.zzXx = this.zzXx;
        zz07Var.zzXw = this.zzXw;
    }

    public final boolean zzU(zz07 zz07Var) {
        return zz07Var.zzYXb == this.zzYXb && zz07Var.zzYXa == this.zzYXa && com.aspose.words.internal.zzAN.zzL(zz07Var.zzXA, this.zzXA) && com.aspose.words.internal.zzAN.zzL(zz07Var.zzZhQ.getValue(), this.zzZhQ.getValue()) && com.aspose.words.internal.zzAN.zzL(zz07Var.zzXy, this.zzXy) && com.aspose.words.internal.zzAN.zzL(zz07Var.zzXx, this.zzXx) && com.aspose.words.internal.zzAN.zzL(zz07Var.zzXw, this.zzXw);
    }

    public final void zzV(double d) {
        this.zzXw = d;
    }

    public final void zzW(double d) {
        this.zzXx = d;
    }

    public final void zzX(zzHK zzhk) {
        this.zzZhQ = zzhk;
    }

    public final void zzXR(long j) {
        this.zzXx = Float.intBitsToFloat((int) j);
        this.zzXw = com.aspose.words.internal.zzZPY.zzYC(j);
    }

    public final void zzY4(long j) {
        this.zzZg9 = j;
    }

    public final double zzYm() {
        return this.zzXw;
    }

    public float zzZA9() {
        return 1.0f;
    }

    public float zzZAa() {
        return 1.0f;
    }

    public zz07 zzZAi() {
        zz07 zz07Var = new zz07();
        zzT(zz07Var);
        return zz07Var;
    }

    public final zzHK zzZCC() {
        return this.zzZhQ;
    }

    public final long zzZPI() {
        return com.aspose.words.internal.zzZPY.zzYF(this.zzZg9) ? com.aspose.words.internal.zzZPY.zzG((float) (this.zzXy / 2.0d), (float) (this.zzXA / 2.0d)) : this.zzZg9;
    }

    public final long zzZsb() {
        return com.aspose.words.internal.zzZPY.zzG((float) this.zzXx, (float) this.zzXw);
    }

    public final com.aspose.words.internal.zzP9 zzZsc() {
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        long jZzNV = zzNV();
        int i = (int) jZzNV;
        zzp9.zzY(-Float.intBitsToFloat(i), -com.aspose.words.internal.zzZPY.zzYC(jZzNV), 1);
        int i2 = this.zzYXb;
        zzp9.zzZ(i2 == 1 || i2 == 3 ? -1.0f : 1.0f, i2 == 2 || i2 == 3 ? -1.0f : 1.0f, 1);
        zzp9.zzX((float) this.zzZhQ.zzZQQ(), 1);
        zzp9.zzY(Float.intBitsToFloat(i), com.aspose.words.internal.zzZPY.zzYC(jZzNV), 1);
        return zzp9;
    }

    public final com.aspose.words.internal.zzZQ4 zzZv() {
        return new com.aspose.words.internal.zzZQ4((float) this.zzXx, (float) this.zzXw, (float) this.zzXy, (float) this.zzXA);
    }

    public void zzq(double d, double d2) {
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        long jZzNV = zzNV();
        int i = (int) jZzNV;
        zzp9.zzY(-Float.intBitsToFloat(i), -com.aspose.words.internal.zzZPY.zzYC(jZzNV), 1);
        zzp9.zzZ((float) d, (float) d2, 1);
        zzp9.zzY(Float.intBitsToFloat(i), com.aspose.words.internal.zzZPY.zzYC(jZzNV), 1);
        zzXR(zzp9.zzR(zzZsb()));
        this.zzXy *= d;
        this.zzXA *= d2;
    }
}
