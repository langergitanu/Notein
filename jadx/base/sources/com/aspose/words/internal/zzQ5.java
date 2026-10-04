package com.aspose.words.internal;

import OooooOo.C21385OooOOOO;

/* JADX INFO: loaded from: classes5.dex */
public final class zzQ5 {
    private double zzKr;
    private double zzKs;
    private double zzKt;
    private double zzKu;
    private long zzYV;
    private long zzZr;

    public zzQ5() {
        this.zzZr = 0L;
        this.zzYV = 0L;
    }

    private double zz7(double d) {
        double d2 = this.zzKr;
        double dSin = Math.sin(d) * (1.0d / (d2 != 0.0d ? d2 / 2.0d : zzZPW.zzYz(zzPU())));
        double d3 = this.zzKs;
        return Math.atan2(dSin, Math.cos(d) * (1.0d / (d3 != 0.0d ? d3 / 2.0d : Float.intBitsToFloat((int) zzPU()))));
    }

    private long zz8(double d) {
        double dZz7 = zz7(d);
        return zzZPY.zzG((float) C21385OooOOOO.OooO0O0(dZz7, Float.intBitsToFloat((int) zzPU()), Float.intBitsToFloat((int) zzPT())), (float) ((Math.sin(dZz7) * ((double) zzZPW.zzYz(zzPU()))) + ((double) zzZPY.zzYC(zzPT()))));
    }

    private long zzPU() {
        return zzZPW.zzG(Float.intBitsToFloat((int) this.zzYV) / 2.0f, zzZPW.zzYz(this.zzYV) / 2.0f);
    }

    private void zzZ(zzQ2 zzq2, double d, double d2) {
        double dZzZL = zzAN.zzZL(d);
        double dZzZL2 = zzAN.zzZL(d2);
        double dZz7 = zz7(dZzZL);
        double d3 = dZzZL2 + dZzZL;
        double dZz72 = zz7(d3);
        double d4 = dZz72 - dZz7;
        double dSqrt = ((Math.sqrt((Math.pow(Math.tan(d4 / 2.0d), 2.0d) * 3.0d) + 4.0d) - 1.0d) * Math.sin(d4)) / 3.0d;
        long jZz8 = zz8(dZzZL);
        long jZz82 = zz8(d3);
        zzq2.zzV(jZz8, zzZPY.zzG((float) (((double) Float.intBitsToFloat((int) jZz8)) - (Math.sin(dZz7) * (((double) Float.intBitsToFloat((int) zzPU())) * dSqrt))), (float) C21385OooOOOO.OooO0O0(dZz7, ((double) zzZPW.zzYz(zzPU())) * dSqrt, zzZPY.zzYC(jZz8))), zzZPY.zzG((float) ((Math.sin(dZz72) * ((double) Float.intBitsToFloat((int) zzPU())) * dSqrt) + ((double) Float.intBitsToFloat((int) jZz82))), (float) (((double) zzZPY.zzYC(jZz82)) - (Math.cos(dZz72) * (dSqrt * ((double) zzZPW.zzYz(zzPU())))))), jZz82);
    }

    public final long getSize() {
        return this.zzYV;
    }

    public final void setSize(long j) {
        this.zzYV = j;
    }

    public final void zz5(double d) {
        this.zzKt = d;
    }

    public final void zz6(double d) {
        this.zzKu = d;
    }

    public final void zzA(long j) {
        this.zzZr = j;
    }

    public final long zzPT() {
        return zzZPY.zzG(Float.intBitsToFloat((int) zzPU()) + Float.intBitsToFloat((int) this.zzZr), zzZPW.zzYz(zzPU()) + zzZPY.zzYC(this.zzZr));
    }

    public final zzQ2 zzPV() {
        if (Float.intBitsToFloat((int) this.zzYV) == 0.0f || zzZPW.zzYz(this.zzYV) == 0.0f) {
            zzQ2 zzq2 = new zzQ2(1);
            long j = this.zzZr;
            zzq2.zzU(j, j, zzZPY.zzG(Float.intBitsToFloat((int) this.zzYV) + Float.intBitsToFloat((int) j), zzZPW.zzYz(this.zzYV) + zzZPY.zzYC(this.zzZr)), zzZPY.zzG(Float.intBitsToFloat((int) this.zzYV) + Float.intBitsToFloat((int) this.zzZr), zzZPW.zzYz(this.zzYV) + zzZPY.zzYC(this.zzZr)));
            return zzq2;
        }
        double d = this.zzKt;
        double d2 = d >= 360.0d ? 90.0d : 45.0d;
        int iAbs = (int) (Math.abs(d) / d2);
        if (this.zzKt % d2 != 0.0d) {
            iAbs++;
        }
        int iMin = Math.min(iAbs, (int) (360.0d / d2));
        zzQ2 zzq22 = new zzQ2(iMin);
        double d3 = this.zzKu;
        double dSignum = Math.signum(this.zzKt);
        for (int i = 0; i < iMin; i++) {
            double dMin = Math.min(d2, Math.abs((this.zzKu + this.zzKt) - d3)) * dSignum;
            zzZ(zzq22, d3, dMin);
            d3 += dMin;
        }
        return zzq22;
    }

    public final long zzPW() {
        return zz8(zzAN.zzZL(this.zzKu + this.zzKt));
    }

    public final long zzPX() {
        return zz8(zzAN.zzZL(this.zzKu));
    }

    public zzQ5(zzZQ4 zzzq4, double d, double d2, double d3, double d4) {
        this(zzzq4, d, d2);
        this.zzKs = d3;
        this.zzKr = d4;
    }

    public zzQ5(zzZQ4 zzzq4, double d, double d2) {
        this.zzZr = 0L;
        this.zzYV = 0L;
        this.zzZr = zzzq4.zzZE();
        this.zzYV = zzzq4.getSize();
        this.zzKu = d;
        this.zzKt = d2;
    }

    public zzQ5(zzZQ4 zzzq4) {
        this(zzzq4, 0.0d, 360.0d);
    }
}
