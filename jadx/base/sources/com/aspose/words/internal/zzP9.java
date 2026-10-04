package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzP9 {
    private static int[] zzH5 = {4, 5, 4, 5, 2, 3, 6, 7};
    private float zzH6;
    private float zzH7;
    private float zzH8;
    private float zzH9;
    private float zzHa;
    private float zzHb;
    private boolean zzHc;
    private int zzKF;
    private int zzL4;

    public zzP9() {
        zzJ(1.0f);
        zzG(1.0f);
    }

    private void zzE(float f) {
        zzOg();
        this.zzH6 = f;
    }

    private void zzF(float f) {
        zzOg();
        this.zzH7 = f;
    }

    private void zzG(float f) {
        zzOg();
        this.zzH8 = f;
    }

    private void zzH(float f) {
        zzOg();
        this.zzH9 = f;
    }

    private void zzI(float f) {
        zzOg();
        this.zzHa = f;
    }

    private void zzJ(float f) {
        zzOg();
        this.zzHb = f;
    }

    private void zzK(float f) {
        if (f == 0.0f) {
            return;
        }
        if (f == 90.0f || f == -270.0f) {
            zzOn();
            return;
        }
        if (f == -90.0f || f == 270.0f) {
            zzOl();
            return;
        }
        if (f == 180.0f || f == -180.0f) {
            zzOm();
            return;
        }
        double dZzZL = zzAN.zzZL(f);
        double dSin = Math.sin(dZzZL);
        double dCos = Math.cos(dZzZL);
        if (dCos != 1.0d) {
            double d = this.zzHb;
            double d2 = this.zzH9;
            zzJ((float) ((dSin * d2) + (dCos * d)));
            double d3 = -dSin;
            zzH((float) ((d2 * dCos) + (d * d3)));
            double d4 = this.zzHa;
            double d5 = this.zzH8;
            zzI((float) ((dSin * d5) + (dCos * d4)));
            zzG((float) ((dCos * d5) + (d3 * d4)));
            zzQl();
        }
    }

    public static boolean zzO(zzP9 zzp9) {
        return zzp9 == null || zzp9.isIdentity();
    }

    private void zzOg() {
        if (this.zzHc) {
            throw new IllegalStateException("Locked matrix cannot be changed.");
        }
    }

    private void zzOi() {
        float f = this.zzHb;
        zzJ(this.zzHa);
        zzI(-f);
        float f2 = this.zzH9;
        zzH(this.zzH8);
        zzG(-f2);
        float f3 = this.zzH7;
        zzF(this.zzH6);
        zzE(-f3);
        zzQl();
    }

    private void zzOj() {
        zzJ(-this.zzHb);
        zzH(-this.zzH9);
        zzI(-this.zzHa);
        zzG(-this.zzH8);
        zzF(-this.zzH7);
        zzE(-this.zzH6);
        zzQl();
    }

    private void zzOk() {
        float f = this.zzHb;
        zzJ(-this.zzHa);
        zzI(f);
        float f2 = this.zzH9;
        zzH(-this.zzH8);
        zzG(f2);
        float f3 = this.zzH7;
        zzF(-this.zzH6);
        zzE(f3);
        zzQl();
    }

    private void zzOl() {
        float f = this.zzHb;
        zzJ(-this.zzH9);
        zzH(f);
        float f2 = this.zzHa;
        zzI(-this.zzH8);
        zzG(f2);
        int i = zzH5[this.zzKF];
        if ((i & 6) == 2 && this.zzHb == 1.0f && this.zzH8 == 1.0f) {
            i -= 2;
        }
        this.zzKF = i;
        this.zzL4 = -1;
    }

    private void zzOm() {
        zzJ(-this.zzHb);
        zzG(-this.zzH8);
        int i = this.zzKF;
        if ((i & 4) != 0) {
            zzH(-this.zzH9);
            zzI(-this.zzHa);
        } else if (this.zzHb == 1.0f && this.zzH8 == 1.0f) {
            this.zzKF = i & (-3);
        } else {
            this.zzKF = i | 2;
        }
        this.zzL4 = -1;
    }

    private void zzOn() {
        float f = this.zzHb;
        zzJ(this.zzH9);
        zzH(-f);
        float f2 = this.zzHa;
        zzI(this.zzH8);
        zzG(-f2);
        int i = zzH5[this.zzKF];
        if ((i & 6) == 2 && this.zzHb == 1.0f && this.zzH8 == 1.0f) {
            i -= 2;
        }
        this.zzKF = i;
        this.zzL4 = -1;
    }

    private static void zzQk() {
        throw new IllegalStateException("Missing case in transform state switch.");
    }

    private void zzQl() {
        if (this.zzH9 == 0.0f && this.zzHa == 0.0f) {
            if (this.zzHb == 1.0f && this.zzH8 == 1.0f) {
                if (this.zzH7 == 0.0f && this.zzH6 == 0.0f) {
                    this.zzKF = 0;
                    this.zzL4 = 0;
                    return;
                } else {
                    this.zzKF = 1;
                    this.zzL4 = 1;
                    return;
                }
            }
            if (this.zzH7 == 0.0f && this.zzH6 == 0.0f) {
                this.zzKF = 2;
                this.zzL4 = -1;
                return;
            } else {
                this.zzKF = 3;
                this.zzL4 = -1;
                return;
            }
        }
        if (this.zzHb == 0.0f && this.zzH8 == 0.0f) {
            if (this.zzH7 == 0.0f && this.zzH6 == 0.0f) {
                this.zzKF = 4;
                this.zzL4 = -1;
                return;
            } else {
                this.zzKF = 5;
                this.zzL4 = -1;
                return;
            }
        }
        if (this.zzH7 == 0.0f && this.zzH6 == 0.0f) {
            this.zzKF = 6;
            this.zzL4 = -1;
        } else {
            this.zzKF = 7;
            this.zzL4 = -1;
        }
    }

    private void zzV(float f, float f2) {
        switch (this.zzKF) {
            case 0:
                zzF(f);
                zzE(f2);
                if (f != 0.0f || f2 != 0.0f) {
                    this.zzKF = 1;
                    this.zzL4 = 1;
                }
                break;
            case 1:
                zzF(f + this.zzH7);
                zzE(f2 + this.zzH6);
                if (this.zzH7 == 0.0f && this.zzH6 == 0.0f) {
                    this.zzKF = 0;
                    this.zzL4 = 0;
                    break;
                }
                break;
            case 2:
                zzF(f * this.zzHb);
                zzE(f2 * this.zzH8);
                if (this.zzH7 != 0.0d || this.zzH6 != 0.0d) {
                    this.zzKF = 3;
                    this.zzL4 |= 1;
                }
                break;
            case 3:
                zzF((f * this.zzHb) + this.zzH7);
                zzE((f2 * this.zzH8) + this.zzH6);
                if (this.zzH7 == 0.0d && this.zzH6 == 0.0d) {
                    this.zzKF = 2;
                    int i = this.zzL4;
                    if (i != -1) {
                        this.zzL4 = i - 1;
                    }
                    break;
                }
                break;
            case 4:
                zzF(f2 * this.zzH9);
                zzE(f * this.zzHa);
                if (this.zzH7 != 0.0d || this.zzH6 != 0.0d) {
                    this.zzKF = 5;
                    this.zzL4 |= 1;
                }
                break;
            case 5:
                zzF((f2 * this.zzH9) + this.zzH7);
                zzE((f * this.zzHa) + this.zzH6);
                if (this.zzH7 == 0.0d && this.zzH6 == 0.0d) {
                    this.zzKF = 4;
                    int i2 = this.zzL4;
                    if (i2 != -1) {
                        this.zzL4 = i2 - 1;
                    }
                    break;
                }
                break;
            case 6:
                zzF((this.zzH9 * f2) + (this.zzHb * f));
                zzE((f2 * this.zzH8) + (f * this.zzHa));
                if (this.zzH7 != 0.0d || this.zzH6 != 0.0d) {
                    this.zzKF = 7;
                    this.zzL4 |= 1;
                }
                break;
            case 7:
                zzF((this.zzH9 * f2) + (this.zzHb * f) + this.zzH7);
                zzE((f2 * this.zzH8) + (f * this.zzHa) + this.zzH6);
                if (this.zzH7 == 0.0d && this.zzH6 == 0.0d) {
                    this.zzKF = 6;
                    int i3 = this.zzL4;
                    if (i3 != -1) {
                        this.zzL4 = i3 - 1;
                    }
                    break;
                }
                break;
            default:
                zzQk();
                break;
        }
    }

    private void zzW(float f, float f2) {
        int i = this.zzKF;
        if ((i & 2) != 0) {
            zzJ(this.zzHb * f);
            zzG(this.zzH8 * f2);
        }
        switch (i) {
            case 0:
            case 1:
                zzJ(f);
                zzG(f2);
                if (f != 1.0f || f2 != 1.0f) {
                    this.zzKF = i | 2;
                    this.zzL4 = -1;
                }
                break;
            case 2:
            case 3:
                if (this.zzHb == 1.0f && this.zzH8 == 1.0f) {
                    int i2 = i & 1;
                    this.zzKF = i2;
                    this.zzL4 = i2 != 0 ? 1 : 0;
                } else {
                    this.zzL4 = -1;
                }
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                zzH(this.zzH9 * f2);
                zzI(this.zzHa * f);
                if (this.zzH9 == 0.0f && this.zzHa == 0.0f) {
                    int i3 = i & 1;
                    if (this.zzHb == 1.0f && this.zzH8 == 1.0f) {
                        this.zzL4 = i3 != 0 ? 1 : 0;
                    } else {
                        i3 |= 2;
                        this.zzL4 = -1;
                    }
                    this.zzKF = i3;
                    break;
                }
                break;
            default:
                zzQk();
                break;
        }
    }

    public static zzP9 zzZ(zzZQ4 zzzq4, zzZQ4 zzzq42) {
        zzP9 zzp9 = new zzP9();
        zzp9.zzY(-C22244OooO0o0.OooO00o(zzzq4, 2.0f, zzzq4.getX()), -((zzzq4.getHeight() / 2.0f) + zzzq4.getY()), 0);
        zzp9.zzZ(zzzq42.getWidth() / zzzq4.getWidth(), zzzq42.getHeight() / zzzq4.getHeight(), 1);
        zzp9.zzY(C22244OooO0o0.OooO00o(zzzq42, 2.0f, zzzq42.getX()), (zzzq42.getHeight() / 2.0f) + zzzq42.getY(), 1);
        return zzp9;
    }

    public boolean equals(Object obj) {
        zzP9 zzp9 = (zzP9) zzZKW.zzZ(obj, zzP9.class);
        return zzp9 != null && zzY(this, zzp9);
    }

    public final boolean getLocked() {
        return this.zzHc;
    }

    public int hashCode() {
        long jFloatToIntBits = (((((((((((long) Float.floatToIntBits(this.zzHb)) * 31) + ((long) Float.floatToIntBits(this.zzH9))) * 31) + ((long) Float.floatToIntBits(this.zzH7))) * 31) + ((long) Float.floatToIntBits(this.zzHa))) * 31) + ((long) Float.floatToIntBits(this.zzH8))) * 31) + ((long) Float.floatToIntBits(this.zzH6));
        return ((int) (jFloatToIntBits >> 32)) ^ ((int) jFloatToIntBits);
    }

    public final boolean isIdentity() {
        return this.zzHb == 1.0f && this.zzHa == 0.0f && this.zzH9 == 0.0f && this.zzH8 == 1.0f && this.zzH7 == 0.0f && this.zzH6 == 0.0f;
    }

    public final void lock() {
        this.zzHc = true;
    }

    public final void reset() {
        zzJ(1.0f);
        zzG(1.0f);
        zzI(0.0f);
        zzH(0.0f);
        zzF(0.0f);
        zzE(0.0f);
        this.zzKF = 0;
        this.zzL4 = 0;
    }

    public String toString() {
        return zzZKN.format("{0}, {1}, {2}, {3}, {4}, {5}", Float.valueOf(this.zzHb), Float.valueOf(this.zzHa), Float.valueOf(this.zzH9), Float.valueOf(this.zzH8), Float.valueOf(this.zzH7), Float.valueOf(this.zzH6));
    }

    public final long[] zzN(zzZQ4 zzzq4) {
        long[] jArr = {zzZPY.zzG(zzzq4.zzZm(), zzzq4.zzZo()), zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZo()), zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZn()), zzZPY.zzG(zzzq4.zzZm(), zzzq4.zzZn())};
        zzZ(jArr, 4);
        return jArr;
    }

    public final float zzOa() {
        return this.zzH6;
    }

    public final float zzOb() {
        return this.zzH7;
    }

    public final float zzOc() {
        return this.zzH8;
    }

    public final float zzOd() {
        return this.zzH9;
    }

    public final float zzOe() {
        return this.zzHa;
    }

    public final float zzOf() {
        return this.zzHb;
    }

    public final zzP9 zzOh() {
        zzP9 zzp9 = new zzP9();
        zzp9.zzJ(this.zzHb);
        zzp9.zzI(this.zzHa);
        zzp9.zzH(this.zzH9);
        zzp9.zzG(this.zzH8);
        zzp9.zzF(this.zzH7);
        zzp9.zzE(this.zzH6);
        zzp9.zzKF = this.zzKF;
        zzp9.zzL4 = this.zzL4;
        return zzp9;
    }

    public final zzP9 zzOo() {
        if (zzAN.zzZD(zzOq())) {
            throw new IllegalStateException("Can't inverse the matrix, because its determinant is zero.");
        }
        double dZzOq = zzOq();
        float f = this.zzH8;
        double d = ((double) f) / dZzOq;
        float f2 = this.zzHa;
        double d2 = ((double) (-f2)) / dZzOq;
        float f3 = this.zzH9;
        double d3 = ((double) (-f3)) / dZzOq;
        float f4 = this.zzHb;
        double d4 = ((double) f4) / dZzOq;
        float f5 = this.zzH6;
        float f6 = this.zzH7;
        return new zzP9((float) d, (float) d2, (float) d3, (float) d4, (float) (((double) ((f3 * f5) - (f * f6))) / dZzOq), (float) (((double) ((f2 * f6) + ((-f4) * f5))) / dZzOq));
    }

    public final boolean zzOp() {
        return zzAN.zzZD(zzOq());
    }

    public final double zzOq() {
        return (this.zzHb * this.zzH8) - (this.zzH9 * this.zzHa);
    }

    public final float[] zzOr() {
        float[] fArrZzOs = zzOs();
        double dZzOq = zzOq();
        float f = this.zzH8;
        float f2 = this.zzH7;
        float f3 = this.zzH9;
        float f4 = this.zzH6;
        fArrZzOs[4] = (float) (((double) ((f * f2) - (f3 * f4))) / dZzOq);
        fArrZzOs[5] = (float) (((double) ((this.zzHb * f4) - (this.zzHa * f2))) / dZzOq);
        return fArrZzOs;
    }

    public final float[] zzOs() {
        float[] fArr = new float[6];
        zzX(fArr);
        return fArr;
    }

    public final boolean zzOt() {
        return (this.zzHa == 0.0f && this.zzH9 == 0.0f) ? false : true;
    }

    public final long zzR(long j) {
        long jZzG = zzZPY.zzG(Float.intBitsToFloat((int) j), zzZPY.zzYC(j));
        int i = this.zzKF;
        float fIntBitsToFloat = Float.intBitsToFloat((int) jZzG);
        float fZzYC = zzZPY.zzYC(jZzG);
        switch (i) {
            case 0:
                return jZzG;
            case 1:
                return zzZPY.zzG(fIntBitsToFloat + this.zzH7, fZzYC + this.zzH6);
            case 2:
                return zzZPY.zzG(fIntBitsToFloat * this.zzHb, fZzYC * this.zzH8);
            case 3:
                return zzZPY.zzG((fIntBitsToFloat * this.zzHb) + this.zzH7, (fZzYC * this.zzH8) + this.zzH6);
            case 4:
                return zzZPY.zzG(fZzYC * this.zzH9, fIntBitsToFloat * this.zzHa);
            case 5:
                return zzZPY.zzG((fZzYC * this.zzH9) + this.zzH7, (fIntBitsToFloat * this.zzHa) + this.zzH6);
            case 6:
                return zzZPY.zzG((this.zzH9 * fZzYC) + (this.zzHb * fIntBitsToFloat), (fZzYC * this.zzH8) + (fIntBitsToFloat * this.zzHa));
            case 7:
                return zzZPY.zzG((this.zzH9 * fZzYC) + (this.zzHb * fIntBitsToFloat) + this.zzH7, (fZzYC * this.zzH8) + (fIntBitsToFloat * this.zzHa) + this.zzH6);
            default:
                zzQk();
                return jZzG;
        }
    }

    public final void zzX(zz0Q zz0q) {
        if (isIdentity()) {
            return;
        }
        for (int i = 0; i < zz0q.getCount(); i++) {
            zz0q.set(i, zzR(zz0q.get(i)));
        }
    }

    public final void zzY(float f, int i) {
        zzZ(f, f, i);
    }

    public final zzZQ4 zzO(zzZQ4 zzzq4) {
        return zzJ6.zzU(new long[]{zzR(zzZPY.zzG(zzzq4.zzZm(), zzzq4.zzZo())), zzR(zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZn()))});
    }

    public final void zzY(float f, float f2, int i) {
        if (i == 0) {
            zzV(f, f2);
        }
        switch (this.zzKF) {
            case 0:
            case 2:
            case 4:
            case 6:
                zzF(f);
                zzE(f2);
                this.zzKF |= 1;
                this.zzL4 |= 1;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
                zzF(this.zzH7 + f);
                zzE(this.zzH6 + f2);
                break;
        }
    }

    public zzP9(float f, float f2, float f3, float f4, float f5, float f6) {
        zzJ(f);
        zzI(f2);
        zzH(f3);
        zzG(f4);
        zzF(f5);
        zzE(f6);
        zzQl();
    }

    public final void zzX(float f, int i) {
        float fZzZJ = (float) zzAN.zzZJ(f);
        if (zzAN.zzf(fZzZJ)) {
            return;
        }
        if (i == 0) {
            zzK(fZzZJ);
            return;
        }
        if (fZzZJ == 90.0f || fZzZJ == -270.0f) {
            zzOk();
            return;
        }
        if (fZzZJ == -90.0f || fZzZJ == 270.0f) {
            zzOi();
            return;
        }
        if (fZzZJ != 180.0f && fZzZJ != -180.0f) {
            double dZzZL = zzAN.zzZL(fZzZJ);
            double dSin = Math.sin(dZzZL);
            double dCos = Math.cos(dZzZL);
            if (dCos != 1.0d) {
                double d = this.zzHb;
                double d2 = this.zzHa;
                zzJ((float) ((dCos * d) - (dSin * d2)));
                zzI((float) ((d2 * dCos) + (d * dSin)));
                double d3 = this.zzH9;
                double d4 = this.zzH8;
                zzH((float) ((dCos * d3) - (dSin * d4)));
                zzG((float) ((d4 * dCos) + (d3 * dSin)));
                double d5 = this.zzH7;
                double d6 = this.zzH6;
                zzF((float) ((dCos * d5) - (dSin * d6)));
                zzE((float) ((dCos * d6) + (dSin * d5)));
                zzQl();
                return;
            }
            return;
        }
        zzOj();
    }

    private void zzN(zzP9 zzp9) {
        int i = this.zzKF;
        int i2 = zzp9.zzKF;
        if (i == 0) {
            zzJ(zzp9.zzHb);
            zzG(zzp9.zzH8);
            zzH(zzp9.zzH9);
            zzI(zzp9.zzHa);
            zzF(zzp9.zzH7);
            zzE(zzp9.zzH6);
            this.zzKF = i2;
            this.zzL4 = zzp9.zzL4;
            return;
        }
        if (i2 != 0) {
            if (i2 == 1) {
                zzY(zzp9.zzH7, zzp9.zzH6, 0);
                return;
            }
            if (i2 != 2) {
                if (i2 == 4) {
                    switch (i) {
                        case 1:
                            zzJ(0.0f);
                            zzH(zzp9.zzH9);
                            zzI(zzp9.zzHa);
                            zzG(0.0f);
                            this.zzKF = 5;
                            this.zzL4 = -1;
                            break;
                        case 2:
                        case 3:
                            zzH(this.zzHb * zzp9.zzH9);
                            zzJ(0.0f);
                            zzI(this.zzH8 * zzp9.zzHa);
                            zzG(0.0f);
                            this.zzKF = i ^ 6;
                            this.zzL4 = -1;
                            break;
                        case 4:
                        case 5:
                            zzJ(this.zzH9 * zzp9.zzHa);
                            zzH(0.0f);
                            zzG(this.zzHa * zzp9.zzH9);
                            zzI(0.0f);
                            this.zzKF = i ^ 6;
                            this.zzL4 = -1;
                            break;
                        case 6:
                        case 7:
                            float f = zzp9.zzH9;
                            float f2 = zzp9.zzHa;
                            float f3 = this.zzHb;
                            zzJ(this.zzH9 * f2);
                            zzH(f3 * f);
                            float f4 = this.zzHa;
                            zzI(this.zzH8 * f2);
                            zzG(f4 * f);
                            this.zzL4 = -1;
                            break;
                    }
                    return;
                }
                float f5 = zzp9.zzHb;
                float f6 = zzp9.zzH9;
                float f7 = zzp9.zzH7;
                float f8 = zzp9.zzHa;
                float f9 = zzp9.zzH8;
                float f10 = zzp9.zzH6;
                switch (i) {
                    case 1:
                        zzJ(f5);
                        zzH(f6);
                        zzF(this.zzH7 + f7);
                        zzI(f8);
                        zzG(f9);
                        zzE(this.zzH6 + f10);
                        this.zzKF = i2 | 1;
                        this.zzL4 = -1;
                        return;
                    case 2:
                    case 3:
                        float f11 = this.zzHb;
                        zzJ(f5 * f11);
                        zzH(f6 * f11);
                        zzF((f7 * f11) + this.zzH7);
                        float f12 = this.zzH8;
                        zzI(f8 * f12);
                        zzG(f9 * f12);
                        zzE((f10 * f12) + this.zzH6);
                        break;
                    case 4:
                    case 5:
                        float f13 = this.zzH9;
                        zzJ(f8 * f13);
                        zzH(f9 * f13);
                        zzF((f10 * f13) + this.zzH7);
                        float f14 = this.zzHa;
                        zzI(f5 * f14);
                        zzG(f6 * f14);
                        zzE((f7 * f14) + this.zzH6);
                        break;
                    case 6:
                    case 7:
                        if (i == 6) {
                            this.zzKF = i | i2;
                        }
                        float f15 = this.zzHb;
                        float f16 = this.zzH9;
                        zzJ((f8 * f16) + (f5 * f15));
                        zzH((f9 * f16) + (f6 * f15));
                        float f17 = f16 * f10;
                        zzF(f17 + (f15 * f7) + this.zzH7);
                        float f18 = this.zzHa;
                        float f19 = this.zzH8;
                        zzI((f8 * f19) + (f5 * f18));
                        zzG((f9 * f19) + (f6 * f18));
                        float f20 = f10 * f19;
                        zzE(f20 + (f7 * f18) + this.zzH6);
                        this.zzL4 = -1;
                        return;
                    default:
                        zzQk();
                        break;
                }
                zzQl();
                return;
            }
            zzZ(zzp9.zzHb, zzp9.zzH8, 0);
        }
    }

    public static boolean zzY(zzP9 zzp9, zzP9 zzp92) {
        if (zzZKO.zzA(zzp9, zzp92)) {
            return true;
        }
        return !zzZKO.zzA(null, zzp9) && !zzZKO.zzA(null, zzp92) && zzp9.zzHb == zzp92.zzHb && zzp9.zzHa == zzp92.zzHa && zzp9.zzH9 == zzp92.zzH9 && zzp9.zzH8 == zzp92.zzH8 && zzp9.zzH7 == zzp92.zzH7 && zzp9.zzH6 == zzp92.zzH6;
    }

    public static zzP9 zzZ(zzZQ4 zzzq4, long[] jArr) {
        if (jArr != null) {
            if (jArr.length == 3) {
                long j = jArr[0];
                long j2 = jArr[1];
                long j3 = jArr[2];
                int i = (int) j;
                float fIntBitsToFloat = (Float.intBitsToFloat((int) j2) - Float.intBitsToFloat(i)) / zzzq4.getWidth();
                float fZzYC = (zzZPY.zzYC(j2) - zzZPY.zzYC(j)) / zzzq4.getWidth();
                float fIntBitsToFloat2 = (Float.intBitsToFloat((int) j3) - Float.intBitsToFloat(i)) / zzzq4.getHeight();
                float fZzYC2 = (zzZPY.zzYC(j3) - zzZPY.zzYC(j)) / zzzq4.getHeight();
                return new zzP9(fIntBitsToFloat, fZzYC, fIntBitsToFloat2, fZzYC2, Float.intBitsToFloat(i) - ((zzzq4.zzZo() * fIntBitsToFloat2) + (zzzq4.zzZm() * fIntBitsToFloat)), zzZPY.zzYC(j) - ((zzzq4.zzZo() * fZzYC2) + (zzzq4.zzZm() * fZzYC)));
            }
            throw new IllegalArgumentException("Parallelogram points array should contain 3 points.");
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: dstParallelogram");
    }

    public static boolean zzX(zzP9 zzp9, zzP9 zzp92) {
        if (zzZKO.zzA(zzp9, zzp92)) {
            return true;
        }
        return !zzZKO.zzA(null, zzp9) && !zzZKO.zzA(null, zzp92) && zzAN.zzS(zzp9.zzHb, zzp92.zzHb) && zzAN.zzS(zzp9.zzHa, zzp92.zzHa) && zzAN.zzS(zzp9.zzH9, zzp92.zzH9) && zzAN.zzS(zzp9.zzH8, zzp92.zzH8);
    }

    private void zzZ(long[] jArr, int i) {
        if (isIdentity()) {
            return;
        }
        if (i > jArr.length) {
            i = jArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = zzR(jArr[i2]);
        }
    }

    public final void zzZ(long[] jArr) {
        zzZ(jArr, jArr.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzZ(float f, float f2, int i) {
        if (i == 0) {
            zzW(f, f2);
            return;
        }
        int i2 = this.zzKF;
        if (i2 == 1 || i2 == 0) {
            this.zzKF = i2 | 2;
        }
        if ((this.zzKF & 4) != 0) {
            zzH(this.zzH9 * f);
            zzI(this.zzHa * f2);
            if ((this.zzKF & 2) != 0) {
                zzJ(this.zzHb * f);
                zzG(this.zzH8 * f2);
            }
        }
        if ((this.zzKF & 1) != 0) {
            zzF(this.zzH7 * f);
            zzE(this.zzH6 * f2);
        }
        this.zzL4 = -1;
    }

    public final void zzX(float[] fArr) {
        double dZzZK;
        double d;
        double d2;
        double d3;
        if (!zzAN.zzZD(zzOq())) {
            double dZzOq = zzOq();
            if (zzAN.zzS(this.zzH8, 0.0f)) {
                d2 = -this.zzH9;
                float f = this.zzHa;
                d3 = f;
                d = (-this.zzHb) / f;
                dZzZK = 90.0d;
            } else {
                double dAtan = Math.atan((-this.zzH9) / this.zzH8);
                double dCos = ((double) this.zzH8) / Math.cos(dAtan);
                dZzZK = zzAN.zzZK(dAtan);
                double d4 = dZzOq / dCos;
                d = ((double) ((this.zzHa * this.zzH8) + (this.zzHb * this.zzH9))) / dZzOq;
                d2 = dCos;
                d3 = d4;
            }
            fArr[0] = (float) d3;
            fArr[1] = (float) d2;
            fArr[2] = (float) d;
            fArr[3] = (float) dZzZK;
            fArr[4] = this.zzH7;
            fArr[5] = this.zzH6;
            return;
        }
        throw new IllegalStateException("Can't decompose the matrix, because its determinant is zero.");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzZ(zzP9 zzp9, int i) {
        if (i == 0) {
            zzN(zzp9);
            return;
        }
        int i2 = this.zzKF;
        int i3 = zzp9.zzKF;
        if (i3 != 0) {
            if (i3 == 1) {
                switch (i2) {
                    case 0:
                    case 2:
                    case 4:
                    case 6:
                        zzF(zzp9.zzH7);
                        zzE(zzp9.zzH6);
                        this.zzKF = i2 | 1;
                        this.zzL4 |= 1;
                        break;
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                        zzF(this.zzH7 + zzp9.zzH7);
                        zzE(this.zzH6 + zzp9.zzH6);
                        break;
                }
                return;
            }
            if (i3 == 2) {
                if (i2 == 1 || i2 == 0) {
                    this.zzKF = i2 | 2;
                }
                float f = zzp9.zzHb;
                float f2 = zzp9.zzH8;
                if ((i2 & 4) != 0) {
                    zzH(this.zzH9 * f);
                    zzI(this.zzHa * f2);
                    if ((i2 & 2) != 0) {
                        zzJ(this.zzHb * f);
                        zzG(this.zzH8 * f2);
                    }
                }
                if ((i2 & 1) != 0) {
                    zzF(this.zzH7 * f);
                    zzE(this.zzH6 * f2);
                }
                this.zzL4 = -1;
                return;
            }
            if (i3 != 4) {
                float f3 = zzp9.zzHb;
                float f4 = zzp9.zzH9;
                float f5 = zzp9.zzH7;
                float f6 = zzp9.zzHa;
                float f7 = zzp9.zzH8;
                float f8 = zzp9.zzH6;
                if ((i2 & 1) != 0) {
                    float f9 = this.zzH7;
                    float f10 = this.zzH6;
                    f5 = (f10 * f4) + (f9 * f3) + f5;
                    f8 = (f10 * f7) + (f9 * f6) + f8;
                }
                switch (i2) {
                    case 0:
                    case 1:
                        zzF(f5);
                        zzE(f8);
                        zzJ(f3);
                        zzI(f6);
                        zzH(f4);
                        zzG(f7);
                        this.zzKF = i2 | i3;
                        this.zzL4 = -1;
                        return;
                    case 2:
                    case 3:
                        zzF(f5);
                        zzE(f8);
                        float f11 = this.zzHb;
                        zzJ(f3 * f11);
                        zzI(f11 * f6);
                        float f12 = this.zzH8;
                        zzH(f4 * f12);
                        zzG(f12 * f7);
                        break;
                    case 4:
                    case 5:
                        zzF(f5);
                        zzE(f8);
                        float f13 = this.zzHa;
                        zzJ(f4 * f13);
                        zzI(f13 * f7);
                        float f14 = this.zzH9;
                        zzH(f3 * f14);
                        zzG(f14 * f6);
                        break;
                    case 6:
                    case 7:
                        zzF(f5);
                        zzE(f8);
                        float f15 = this.zzHb;
                        float f16 = this.zzHa;
                        zzJ((f16 * f4) + (f15 * f3));
                        zzI((f16 * f7) + (f15 * f6));
                        float f17 = this.zzH9;
                        float f18 = this.zzH8;
                        zzH((f4 * f18) + (f3 * f17));
                        zzG((f18 * f7) + (f17 * f6));
                        break;
                    default:
                        zzQk();
                        break;
                }
                zzQl();
                return;
            }
            if (i2 == 5 || i2 == 4) {
                i2 |= 2;
                this.zzKF = i2 ^ 4;
            }
            if (i2 == 1 || i2 == 0 || i2 == 3 || i2 == 2) {
                this.zzKF = i2 ^ 4;
            }
            float f19 = zzp9.zzH9;
            float f20 = zzp9.zzHa;
            float f21 = this.zzHb;
            zzJ(this.zzHa * f19);
            zzI(f21 * f20);
            float f22 = this.zzH9;
            zzH(this.zzH8 * f19);
            zzG(f22 * f20);
            float f23 = this.zzH7;
            zzF(this.zzH6 * f19);
            zzE(f23 * f20);
            this.zzL4 = -1;
        }
    }

    public final void zzZ(float f, long j, int i) {
        if (i == 0) {
            zzZ(f, j);
            return;
        }
        int i2 = (int) j;
        zzY(-Float.intBitsToFloat(i2), -zzZPY.zzYC(j), 1);
        zzX(f, 1);
        zzY(Float.intBitsToFloat(i2), zzZPY.zzYC(j), 1);
    }

    private void zzZ(float f, long j) {
        int i = (int) j;
        zzY(Float.intBitsToFloat(i), zzZPY.zzYC(j), 0);
        zzX(f, 0);
        zzY(-Float.intBitsToFloat(i), -zzZPY.zzYC(j), 0);
    }
}
