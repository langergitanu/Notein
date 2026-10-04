package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzQB {
    private int zzKF;
    private double zzKG;
    private double zzKH;
    private double zzKI;
    private double zzKJ;
    private double zzKK;
    private double zzKL;
    private double zzKM;
    private double zzKN;
    private double zzKO;
    private double zzKP;
    private double zzKQ;
    private double zzKR;
    private double zzKS;
    private double zzKT;
    private double zzKU;
    private double zzKV;

    public zzQB() {
        this.zzKG = 1.0d;
        this.zzKL = 1.0d;
        this.zzKQ = 1.0d;
        this.zzKV = 1.0d;
    }

    private static void zzQk() {
        throw new IllegalStateException("Missing case in transform state switch.");
    }

    private void zzQl() {
        this.zzKF = 0;
        if (this.zzKJ != 0.0d || this.zzKI != 0.0d || this.zzKH != 0.0d) {
            this.zzKF = 1;
        }
        if (this.zzKS != 0.0d || this.zzKO != 0.0d || this.zzKK != 0.0d) {
            this.zzKF |= 8;
        }
        if (this.zzKG != 1.0d) {
            this.zzKF |= 16;
        }
        if (this.zzKR == 0.0d && this.zzKN == 0.0d && this.zzKU == 0.0d && this.zzKM == 0.0d && this.zzKT == 0.0d && this.zzKP == 0.0d) {
            if (this.zzKV != 1.0d || this.zzKQ != 1.0d || this.zzKL != 1.0d) {
                this.zzKF |= 2;
            }
        } else if (this.zzKV == 0.0d && this.zzKQ == 0.0d && this.zzKL == 0.0d) {
            this.zzKF |= 4;
        } else {
            this.zzKF |= 6;
        }
        if (this.zzKF == 0) {
            this.zzKF = 0;
        }
    }

    public static zzQB zzZ(zzQ9 zzq9, long j) {
        double dZzQb = zzq9.zzQb() + ((double) Float.intBitsToFloat((int) j));
        double dZzYm = zzq9.zzYm() + ((double) zzZPY.zzYC(j));
        double dZzQa = (-1.0d) / zzq9.zzQa();
        return new zzQB(dZzQb * dZzQa, dZzYm * dZzQa, dZzQa);
    }

    private void zza(double d) {
        double dZzZL = zzAN.zzZL(d);
        double dSin = Math.sin(dZzZL);
        double dCos = Math.cos(dZzZL);
        if (dCos != 1.0d) {
            double d2 = this.zzKV;
            double d3 = this.zzKU;
            this.zzKV = (dCos * d2) - (dSin * d3);
            this.zzKU = (d3 * dCos) + (d2 * dSin);
            double d4 = this.zzKR;
            double d5 = this.zzKQ;
            this.zzKR = (dCos * d4) - (dSin * d5);
            this.zzKQ = (d5 * dCos) + (d4 * dSin);
            double d6 = this.zzKN;
            double d7 = this.zzKM;
            this.zzKN = (dCos * d6) - (dSin * d7);
            this.zzKM = (d7 * dCos) + (d6 * dSin);
            double d8 = this.zzKJ;
            double d9 = this.zzKI;
            this.zzKJ = (dCos * d8) - (dSin * d9);
            this.zzKI = (dCos * d9) + (dSin * d8);
            zzQl();
        }
    }

    private void zzb(double d) {
        double dZzZL = zzAN.zzZL(d);
        double dSin = Math.sin(dZzZL);
        double dCos = Math.cos(dZzZL);
        if (dCos != 1.0d) {
            double d2 = this.zzKV;
            double d3 = this.zzKT;
            this.zzKV = (dSin * d3) + (dCos * d2);
            double d4 = -dSin;
            this.zzKT = (d3 * dCos) + (d2 * d4);
            double d5 = this.zzKR;
            double d6 = this.zzKP;
            this.zzKR = (dSin * d6) + (dCos * d5);
            this.zzKP = (d6 * dCos) + (d5 * d4);
            double d7 = this.zzKN;
            double d8 = this.zzKL;
            this.zzKN = (dSin * d8) + (dCos * d7);
            this.zzKL = (d8 * dCos) + (d7 * d4);
            double d9 = this.zzKJ;
            double d10 = this.zzKH;
            this.zzKJ = (dSin * d10) + (dCos * d9);
            this.zzKH = (dCos * d10) + (d4 * d9);
            zzQl();
        }
    }

    private void zzc(double d) {
        double dZzZL = zzAN.zzZL(d);
        double dSin = Math.sin(dZzZL);
        double dCos = Math.cos(dZzZL);
        if (dCos != 1.0d) {
            double d2 = this.zzKU;
            double d3 = this.zzKT;
            this.zzKU = (dCos * d2) - (dSin * d3);
            this.zzKT = (d3 * dCos) + (d2 * dSin);
            double d4 = this.zzKQ;
            double d5 = this.zzKP;
            this.zzKQ = (dCos * d4) - (dSin * d5);
            this.zzKP = (d5 * dCos) + (d4 * dSin);
            double d6 = this.zzKM;
            double d7 = this.zzKL;
            this.zzKM = (dCos * d6) - (dSin * d7);
            this.zzKL = (d7 * dCos) + (d6 * dSin);
            double d8 = this.zzKI;
            double d9 = this.zzKH;
            this.zzKI = (dCos * d8) - (dSin * d9);
            this.zzKH = (dCos * d9) + (dSin * d8);
            zzQl();
        }
    }

    public static zzQB zzd(double d) {
        double d2;
        double d3 = 0.0d;
        if (d != 0.0d) {
            double dZzZL = 3.141592653589793d - zzAN.zzZL(d);
            double dCos = Math.cos(dZzZL) / 2.0d;
            double dSin = Math.sin(dZzZL) / 2.0d;
            d3 = dCos;
            d2 = dSin;
        } else {
            d2 = 0.0d;
        }
        return new zzQB(-d3, -d2, 0.0d);
    }

    public final String toString() {
        return zzZKN.format("{0}, {1}, {2}, {3}, {4}, {5}, {6}, {7}, {8}, {9}, {10}, {11}, {12}, {13}, {14}, {15}", Double.valueOf(this.zzKV), Double.valueOf(this.zzKU), Double.valueOf(this.zzKT), Double.valueOf(this.zzKS), Double.valueOf(this.zzKR), Double.valueOf(this.zzKQ), Double.valueOf(this.zzKP), Double.valueOf(this.zzKO), Double.valueOf(this.zzKN), Double.valueOf(this.zzKM), Double.valueOf(this.zzKL), Double.valueOf(this.zzKK), Double.valueOf(this.zzKJ), Double.valueOf(this.zzKI), Double.valueOf(this.zzKH), Double.valueOf(this.zzKG));
    }

    public final double zzQe() {
        return this.zzKI;
    }

    public final double zzQf() {
        return this.zzKJ;
    }

    public final double zzQg() {
        return this.zzKQ;
    }

    public final double zzQh() {
        return this.zzKR;
    }

    public final double zzQi() {
        return this.zzKU;
    }

    public final double zzQj() {
        return this.zzKV;
    }

    public final void zzX(double d, double d2, double d3) {
        if (d2 != 0.0d) {
            zzb(d2);
        }
        if (d != 0.0d) {
            zzc(d);
        }
        if (d3 != 0.0d) {
            zza(d3);
        }
    }

    public final void zzY(double d, double d2, double d3) {
        int i = this.zzKF;
        if ((i & 1) == 1) {
            this.zzKJ += d;
            this.zzKI += d2;
            this.zzKH += d3;
        } else {
            this.zzKJ = d;
            this.zzKI = d2;
            this.zzKH = d3;
            this.zzKF = i | 1;
        }
    }

    private zzQB(double d, double d2, double d3) {
        this.zzKV = 1.0d;
        this.zzKU = 0.0d;
        this.zzKT = 0.0d;
        this.zzKS = 0.0d;
        this.zzKR = 0.0d;
        this.zzKQ = 1.0d;
        this.zzKP = 0.0d;
        this.zzKO = 0.0d;
        this.zzKN = d;
        this.zzKM = d2;
        this.zzKL = 0.0d;
        this.zzKK = d3;
        this.zzKJ = 0.0d;
        this.zzKI = 0.0d;
        this.zzKH = 0.0d;
        this.zzKG = 1.0d;
        zzQl();
    }

    public final zzQ9 zzY(zzQ9 zzq9) {
        double dAbs;
        zzQ9 zzq92;
        zzQ9 zzq93;
        zzQ9 zzq94 = new zzQ9(zzq9.zzQb(), zzq9.zzYm(), zzq9.zzQa());
        int i = this.zzKF;
        double dZzQb = zzq94.zzQb();
        double dZzYm = zzq94.zzYm();
        double dZzQa = zzq94.zzQa();
        if ((i & 24) == 0) {
            dAbs = 1.0d;
        } else {
            dAbs = Math.abs((this.zzKK * dZzQa) + (this.zzKO * dZzYm) + (this.zzKS * dZzQb) + this.zzKG);
        }
        if (dAbs == 0.0d) {
            return new zzQ9(dZzQb, dZzYm, dZzQa);
        }
        switch (i & 7) {
            case 0:
                break;
            case 1:
                zzq92 = new zzQ9(dZzQb + this.zzKJ, dZzYm + this.zzKI, dZzQa + this.zzKH);
                zzq94 = zzq92;
                break;
            case 2:
                zzq94 = new zzQ9(this.zzKV * dZzQb, this.zzKQ * dZzYm, this.zzKL * dZzQa);
                break;
            case 3:
                zzq93 = new zzQ9((dZzQb * this.zzKV) + this.zzKJ, (dZzYm * this.zzKQ) + this.zzKI, (dZzQa * this.zzKL) + this.zzKH);
                zzq94 = zzq93;
                break;
            case 4:
                zzq94 = new zzQ9((this.zzKN * dZzQa) + (this.zzKR * dZzYm), (dZzQa * this.zzKM) + (this.zzKU * dZzQb), (dZzYm * this.zzKP) + (dZzQb * this.zzKT));
                break;
            case 5:
                zzq92 = new zzQ9((this.zzKN * dZzQa) + (this.zzKR * dZzYm) + this.zzKJ, (dZzQa * this.zzKM) + (this.zzKU * dZzQb) + this.zzKI, (dZzYm * this.zzKP) + (dZzQb * this.zzKT) + this.zzKH);
                zzq94 = zzq92;
                break;
            case 6:
                zzq94 = new zzQ9((this.zzKN * dZzQa) + (this.zzKR * dZzYm) + (this.zzKV * dZzQb), (this.zzKM * dZzQa) + (this.zzKQ * dZzYm) + (this.zzKU * dZzQb), (dZzYm * this.zzKP) + (dZzQb * this.zzKT) + (dZzQa * this.zzKL));
                break;
            case 7:
                zzq93 = new zzQ9(this.zzKJ + (this.zzKN * dZzQa) + (this.zzKR * dZzYm) + (this.zzKV * dZzQb), (this.zzKM * dZzQa) + (this.zzKQ * dZzYm) + (this.zzKU * dZzQb) + this.zzKI, (dZzQa * this.zzKL) + (dZzYm * this.zzKP) + (dZzQb * this.zzKT) + this.zzKH);
                zzq94 = zzq93;
                break;
            default:
                zzQk();
                break;
        }
        zzq94.zzW(zzq94.zzQb() / dAbs);
        zzq94.zzV(zzq94.zzYm() / dAbs);
        zzq94.zz9(zzq94.zzQa() / dAbs);
        return zzq94;
    }

    public final void zzY(zzQB zzqb) {
        double d;
        if (zzqb == null) {
            return;
        }
        int i = this.zzKF;
        int i2 = zzqb.zzKF;
        double d2 = zzqb.zzKV;
        double d3 = zzqb.zzKR;
        double d4 = zzqb.zzKN;
        double d5 = zzqb.zzKJ;
        double d6 = zzqb.zzKU;
        double d7 = zzqb.zzKQ;
        double d8 = zzqb.zzKM;
        double d9 = zzqb.zzKI;
        double d10 = zzqb.zzKT;
        double d11 = zzqb.zzKP;
        double d12 = zzqb.zzKL;
        double d13 = zzqb.zzKH;
        double d14 = zzqb.zzKS;
        double d15 = zzqb.zzKO;
        double d16 = zzqb.zzKK;
        double d17 = zzqb.zzKG;
        if ((i & 17) != 0) {
            d = d10;
            double d18 = this.zzKJ;
            double d19 = this.zzKI;
            double d20 = this.zzKH;
            double d21 = this.zzKG;
            this.zzKJ = (d21 * d5) + (d20 * d4) + (d19 * d3) + (d18 * d2);
            this.zzKI = (d21 * d9) + (d20 * d8) + (d19 * d7) + (d18 * d6);
            this.zzKH = (d21 * d13) + (d20 * d12) + (d19 * d11) + (d18 * d);
            this.zzKG = (d21 * d17) + (d20 * d16) + (d19 * d15) + (d18 * d14);
        } else {
            d = d10;
            this.zzKJ = d5;
            this.zzKI = d9;
            this.zzKH = d13;
            this.zzKG = d17;
        }
        int i3 = i & 6;
        if (i3 != 0) {
            if (i3 == 2) {
                double d22 = this.zzKV;
                this.zzKV = d2 * d22;
                this.zzKU = d6 * d22;
                this.zzKT = d22 * d;
                this.zzKS = d22 * d14;
                double d23 = this.zzKQ;
                this.zzKR = d23 * d3;
                this.zzKQ = d23 * d7;
                this.zzKP = d23 * d11;
                this.zzKO = d23 * d15;
                double d24 = this.zzKL;
                this.zzKN = d24 * d4;
                this.zzKM = d24 * d8;
                this.zzKL = d24 * d12;
                this.zzKK = d24 * d16;
            } else if (i3 == 4) {
                double d25 = this.zzKU;
                double d26 = this.zzKT;
                this.zzKV = (d26 * d4) + (d25 * d3);
                this.zzKU = (d26 * d8) + (d25 * d7);
                this.zzKT = (d26 * d12) + (d25 * d11);
                this.zzKS = (d26 * d16) + (d25 * d15);
                double d27 = this.zzKR;
                double d28 = this.zzKP;
                this.zzKR = (d28 * d4) + (d27 * d2);
                this.zzKQ = (d28 * d8) + (d27 * d6);
                this.zzKP = (d28 * d12) + (d27 * d);
                this.zzKO = (d28 * d16) + (d27 * d14);
                double d29 = this.zzKN;
                double d30 = this.zzKM;
                this.zzKN = (d30 * d3) + (d2 * d29);
                this.zzKM = (d30 * d7) + (d6 * d29);
                this.zzKL = (d30 * d11) + (d29 * d);
                this.zzKK = (d30 * d15) + (d29 * d14);
            } else if (i3 == 6) {
                double d31 = this.zzKV;
                double d32 = this.zzKU;
                double d33 = this.zzKT;
                this.zzKV = (d33 * d4) + (d32 * d3) + (d31 * d2);
                this.zzKU = (d33 * d8) + (d32 * d7) + (d31 * d6);
                this.zzKT = (d33 * d12) + (d32 * d11) + (d31 * d);
                double d34 = d33 * d16;
                this.zzKS = d34 + (d32 * d15) + (d31 * d14);
                double d35 = this.zzKR;
                double d36 = this.zzKQ;
                double d37 = this.zzKP;
                this.zzKR = (d37 * d4) + (d36 * d3) + (d35 * d2);
                this.zzKQ = (d37 * d8) + (d36 * d7) + (d35 * d6);
                this.zzKP = (d37 * d12) + (d36 * d11) + (d35 * d);
                double d38 = d37 * d16;
                this.zzKO = d38 + (d36 * d15) + (d35 * d14);
                double d39 = this.zzKN;
                double d40 = this.zzKM;
                double d41 = this.zzKL;
                double d42 = d41 * d4;
                this.zzKN = d42 + (d40 * d3) + (d2 * d39);
                double d43 = d41 * d8;
                this.zzKM = d43 + (d40 * d7) + (d6 * d39);
                this.zzKL = (d41 * d12) + (d40 * d11) + (d39 * d);
                double d44 = d41 * d16;
                this.zzKK = d44 + (d40 * d15) + (d39 * d14);
            } else if (i3 == 10) {
                double d45 = this.zzKV;
                double d46 = this.zzKS;
                this.zzKV = (d46 * d5) + (d2 * d45);
                this.zzKU = (d46 * d9) + (d6 * d45);
                this.zzKT = (d46 * d13) + (d45 * d);
                this.zzKS = (d46 * d17) + (d45 * d14);
                double d47 = this.zzKQ;
                double d48 = this.zzKO;
                this.zzKR = (d48 * d5) + (d47 * d3);
                this.zzKQ = (d48 * d9) + (d47 * d7);
                this.zzKP = (d48 * d13) + (d47 * d11);
                this.zzKO = (d48 * d17) + (d47 * d15);
                double d49 = this.zzKL;
                double d50 = this.zzKK;
                this.zzKN = (d5 * d50) + (d49 * d4);
                this.zzKM = (d50 * d9) + (d49 * d8);
                this.zzKL = (d13 * d50) + (d49 * d12);
                this.zzKK = (d50 * d17) + (d49 * d16);
            } else if (i3 == 12) {
                double d51 = this.zzKU;
                double d52 = this.zzKT;
                double d53 = this.zzKS;
                this.zzKV = (d53 * d5) + (d52 * d4) + (d51 * d3);
                this.zzKU = (d53 * d9) + (d52 * d8) + (d51 * d7);
                this.zzKT = (d53 * d13) + (d52 * d12) + (d51 * d11);
                this.zzKS = (d53 * d17) + (d52 * d16) + (d51 * d15);
                double d54 = this.zzKR;
                double d55 = this.zzKP;
                double d56 = this.zzKO;
                this.zzKR = (d56 * d5) + (d4 * d55) + (d54 * d2);
                this.zzKQ = (d56 * d9) + (d8 * d55) + (d54 * d6);
                this.zzKP = (d56 * d13) + (d55 * d12) + (d54 * d);
                this.zzKO = (d56 * d17) + (d55 * d16) + (d54 * d14);
                double d57 = this.zzKN;
                double d58 = this.zzKM;
                double d59 = this.zzKK;
                double d60 = d5 * d59;
                this.zzKN = d60 + (d58 * d3) + (d57 * d2);
                this.zzKM = (d59 * d9) + (d58 * d7) + (d57 * d6);
                double d61 = d58 * d11;
                this.zzKL = (d13 * d59) + d61 + (d57 * d);
                this.zzKK = (d59 * d17) + (d58 * d15) + (d57 * d14);
            } else if (i3 != 14) {
                zzQk();
            } else {
                double d62 = this.zzKV;
                double d63 = this.zzKU;
                double d64 = this.zzKT;
                double d65 = this.zzKS;
                this.zzKV = (d65 * d5) + (d64 * d4) + (d63 * d3) + (d62 * d2);
                this.zzKU = (d65 * d9) + (d64 * d8) + (d63 * d7) + (d62 * d6);
                this.zzKT = (d65 * d13) + (d64 * d12) + (d63 * d11) + (d62 * d);
                this.zzKS = (d65 * d17) + (d64 * d16) + (d63 * d15) + (d62 * d14);
                double d66 = this.zzKR;
                double d67 = this.zzKQ;
                double d68 = this.zzKP;
                double d69 = this.zzKO;
                this.zzKR = (d69 * d5) + (d68 * d4) + (d67 * d3) + (d66 * d2);
                this.zzKQ = (d69 * d9) + (d68 * d8) + (d67 * d7) + (d66 * d6);
                this.zzKP = (d69 * d13) + (d68 * d12) + (d67 * d11) + (d66 * d);
                this.zzKO = (d69 * d17) + (d68 * d16) + (d67 * d15) + (d66 * d14);
                double d70 = this.zzKN;
                double d71 = this.zzKM;
                double d72 = this.zzKL;
                double d73 = this.zzKK;
                double d74 = d5 * d73;
                this.zzKN = d74 + (d72 * d4) + (d3 * d71) + (d70 * d2);
                this.zzKM = (d73 * d9) + (d72 * d8) + (d71 * d7) + (d70 * d6);
                this.zzKL = (d13 * d73) + (d72 * d12) + (d71 * d11) + (d70 * d);
                this.zzKK = (d73 * d17) + (d72 * d16) + (d71 * d15) + (d70 * d14);
            }
            zzQl();
            return;
        }
        this.zzKV = d2;
        this.zzKU = d6;
        this.zzKT = d;
        this.zzKS = d14;
        this.zzKR = d3;
        this.zzKQ = d7;
        this.zzKP = d11;
        this.zzKO = d15;
        this.zzKN = d4;
        this.zzKM = d8;
        this.zzKL = d12;
        this.zzKK = d16;
        this.zzKF = i | i2;
    }
}
