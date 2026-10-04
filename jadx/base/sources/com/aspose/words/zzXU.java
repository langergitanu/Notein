package com.aspose.words;

import com.aspose.words.internal.C22243OooO0Oo;

/* JADX INFO: loaded from: classes6.dex */
final class zzXU {
    private int zzZBJ;
    private boolean zzZBK;
    private float zzZBL;
    private float zzZBM;
    private float zzZBN;
    private float zzZBO;
    private zzXW zzZBP;
    private zzXW zzZC7;
    private static int[] zzZBI = {3, 0, 1};
    private static int[] zzZBH = {1, 0, 3};
    private static int[] zzZBG = {1, 0, 1};
    private static int[] zzZBF = {5, 0, 3, 0, 1};
    private static int[] zzZBE = {1, 0, 3, 0, 5};
    private static int[] zzZBD = {1, 0, 3, 0, 1};

    private boolean zz7J() {
        int i = this.zzZBJ;
        return i == 6 || i == 7;
    }

    private boolean zz7K() {
        int i = this.zzZBJ;
        return i == 1 || i == 2 || i == 5;
    }

    private boolean zz7L() {
        int i = this.zzZBJ;
        return i == 3 || i == 0 || i == 4;
    }

    private boolean zz7M() {
        if (!zz7O().getShadow()) {
            return false;
        }
        int i = this.zzZBJ;
        return i == 0 || i == 2;
    }

    private float zz7N() {
        switch (zz7O().getLineStyle()) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
            case 20:
            case 21:
            case 22:
            case 23:
                return zz7O().zz8S();
            case 2:
            case 5:
                return 1.0f;
            case 3:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 24:
            case 25:
                return zzu4();
            case 4:
            default:
                return zz7O().zz8S();
            case 26:
            case 27:
                return 1.0f;
        }
    }

    private Border zz7O() {
        int i = this.zzZBJ;
        return i == 6 ? this.zzZC7.zz8k() : i == 7 ? this.zzZC7.zz8l() : zz7K() ? this.zzZC7.zz8m() : this.zzZC7.zz8o();
    }

    private com.aspose.words.internal.zzPV[] zz7P() {
        com.aspose.words.internal.zzPV[] zzpvArr = new com.aspose.words.internal.zzPV[3];
        com.aspose.words.internal.zzIQ zziq = new com.aspose.words.internal.zzIQ(zzZy());
        if (zziq.zzGy() < 85.0f) {
            zzpvArr[0] = zzZy();
            zzpvArr[1] = com.aspose.words.internal.zzIQ.zzZ(zzZy(), 85.0f);
            zzpvArr[2] = com.aspose.words.internal.zzIQ.zzZ(zzZy(), 170.0f);
            return zzpvArr;
        }
        if (zziq.zzGy() < 170.0f) {
            zzpvArr[0] = com.aspose.words.internal.zzIQ.zzZ(zzZy(), -85.0f);
            zzpvArr[1] = zzZy();
            zzpvArr[2] = com.aspose.words.internal.zzIQ.zzZ(zzZy(), 85.0f);
            return zzpvArr;
        }
        zzpvArr[0] = com.aspose.words.internal.zzIQ.zzZ(zzZy(), -170.0f);
        zzpvArr[1] = com.aspose.words.internal.zzIQ.zzZ(zzZy(), -85.0f);
        zzpvArr[2] = zzZy();
        return zzpvArr;
    }

    private boolean zz7Q() {
        if (zz7J()) {
            return false;
        }
        return zz7K() ? this.zzZBP.zz87() : this.zzZBP.zz89();
    }

    private boolean zz7R() {
        if (zz7J()) {
            return false;
        }
        return zz7K() ? this.zzZC7.zz86() : this.zzZC7.zz88();
    }

    private boolean zz7S() {
        switch (this.zzZBJ) {
            case 0:
            case 2:
                return !zz7O().zz8P();
            case 1:
            case 3:
            case 6:
            case 7:
                return false;
            case 4:
            case 5:
                return true;
            default:
                throw new IllegalStateException("Unknown border type.");
        }
    }

    private boolean zz7T() {
        int i = this.zzZBJ;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return !this.zzZBP.zz8q() && zz7O().zz8P();
                }
                if (i != 3 && i != 4) {
                    if (i == 5) {
                        return false;
                    }
                    throw new IllegalStateException("Unknown border type.");
                }
                return zz7O().zz8P();
            }
            if (this.zzZBP.zz8q() && zz7O().zz8P()) {
                return true;
            }
        }
        return false;
    }

    private boolean zz7U() {
        int i = this.zzZBJ;
        if (i != 0) {
            if (i == 1) {
                return false;
            }
            if (i != 2) {
                if (i == 3 || i == 4 || i == 5) {
                    return false;
                }
                throw new IllegalStateException("Unknown border type.");
            }
        }
        return zz7O().zz8P();
    }

    private boolean zz7V() {
        int i = this.zzZBJ;
        if (i != 0) {
            if (i == 1) {
                return true;
            }
            if (i != 2) {
                if (i == 3) {
                    return true;
                }
                if (i != 4 && i != 5) {
                    throw new IllegalStateException("Unknown border type.");
                }
            }
            return false;
        }
        return false;
    }

    private boolean zz7W() {
        int i = this.zzZBJ;
        if (i != 0) {
            if (i == 1) {
                return false;
            }
            if (i != 2) {
                if (i == 3) {
                    return false;
                }
                if (i != 4 && i != 5) {
                    throw new IllegalStateException("Unknown border type.");
                }
            }
            return true;
        }
        return true;
    }

    private boolean zz7X() {
        if (zz7J()) {
            return false;
        }
        return zz7K() ? this.zzZBP.zz8q() && !this.zzZBK : this.zzZBP.zz8c() || this.zzZBP.zz8b();
    }

    private boolean zz7Y() {
        if (zz7J()) {
            return false;
        }
        return zz7K() || this.zzZC7.zz8b() || this.zzZC7.zz8c();
    }

    private void zz7Z() {
        if (zz7Y()) {
            long jZzZD = zzZD(-zzS(this.zzZC7));
            this.zzZBO = Float.intBitsToFloat((int) jZzZD);
            this.zzZBN = com.aspose.words.internal.zzZPY.zzYC(jZzZD);
        }
        if (zz7X()) {
            long jZzZC = zzZC(-zzS(this.zzZBP));
            this.zzZBM = Float.intBitsToFloat((int) jZzZC);
            this.zzZBL = com.aspose.words.internal.zzZPY.zzYC(jZzZC);
        }
        if (this.zzZBJ == 6) {
            this.zzZBN += zzT(this.zzZC7);
        }
        if (this.zzZBJ == 7) {
            this.zzZBL += zzT(this.zzZBP);
        }
    }

    private void zz80() {
        this.zzZBO = (zz7O().zz8S() / 2.0f) + this.zzZBO;
        this.zzZBM = (zz7O().zz8S() / 2.0f) + this.zzZBM;
    }

    private void zz81() {
        if (this.zzZBK) {
            if (zz7L()) {
                long jZzZD = zzZD(zzS(this.zzZC7) / 2.0f);
                this.zzZBO = Float.intBitsToFloat((int) jZzZD);
                this.zzZBN = com.aspose.words.internal.zzZPY.zzYC(jZzZD);
                long jZzZC = zzZC(zzS(this.zzZBP) / 2.0f);
                this.zzZBM = Float.intBitsToFloat((int) jZzZC);
                this.zzZBL = com.aspose.words.internal.zzZPY.zzYC(jZzZC);
            }
            int i = this.zzZBJ;
            if (i == 0) {
                float f = this.zzZBL;
                this.zzZBN = f;
                this.zzZBN = zz7O().zz8S() + f;
                this.zzZBL = zz7O().zz8S() + this.zzZBL;
                return;
            }
            if (i == 1) {
                this.zzZBO -= zz7O().zz8S() / 2.0f;
                this.zzZBM -= zz7O().zz8S() / 2.0f;
            } else if (i == 2) {
                zz80();
            } else {
                if (i != 5) {
                    return;
                }
                if (this.zzZBP.zz8q() && this.zzZBP.zz88()) {
                    this.zzZBL = com.aspose.words.internal.zzZPY.zzYC(this.zzZBP.zz8g().zzZE());
                }
                zz80();
            }
        }
    }

    private void zz82() {
        if (this.zzZBJ != 4) {
            return;
        }
        this.zzZBN = zz7O().zz8S() + this.zzZBN;
        this.zzZBL = zz7O().zz8S() + this.zzZBL;
    }

    private void zzE(float f, float f2) {
        int i = this.zzZBJ;
        if (i == 6) {
            this.zzZBO -= f;
            this.zzZBM -= f;
            this.zzZBN += f2;
            this.zzZBL += f2;
            return;
        }
        if (i != 7) {
            throw new IllegalStateException("Unexpected border type.");
        }
        this.zzZBO += f;
        this.zzZBM += f;
        this.zzZBN += f2;
        this.zzZBL += f2;
    }

    private void zzI(com.aspose.words.internal.zzOU zzou) {
        float[] fArrZzOR = Border.zzOR(zz7O().getLineStyle());
        if (fArrZzOR != null) {
            zzou.zzW(fArrZzOR);
        }
    }

    private int[] zzR(zzXW zzxw) {
        int iZz8J = zz7O().zz8J();
        if (iZz8J == 3) {
            return zzZ(zzxw, zzZBI, zzZBH, zzZBG);
        }
        if (iZz8J != 5) {
            return null;
        }
        return zzZ(zzxw, zzZBF, zzZBE, zzZBD);
    }

    private float zzS(zzXW zzxw) {
        int i = this.zzZBJ;
        if (i == 0) {
            return zzxw.zz8n().zz8S();
        }
        if (i == 1) {
            return zzxw.zz8o().zz8S();
        }
        if (i == 2) {
            return zzxw.zz8p().zz8S();
        }
        if (i == 3) {
            return zzxw.zz8m().zz8S();
        }
        if (i == 4) {
            return Math.max(zzxw.zz8n().isVisible() ? zzxw.zz8n().zz8S() : 0.0f, zzxw.zz8m().isVisible() ? zzxw.zz8m().zz8S() : 0.0f);
        }
        if (i == 5) {
            return zzxw.zz88() ? zzxw.zz8o().zz8S() : zzxw.zz8p().zz8S();
        }
        throw new IllegalStateException("Unexpected border type.");
    }

    private static float zzT(zzXW zzxw) {
        float fMax = 0.0f;
        for (zzXW zzxwZz8h = zzxw; zzxwZz8h != null; zzxwZz8h = zzxwZz8h.zz8h()) {
            if (zzxwZz8h.zz8p() != null) {
                fMax = Math.max(fMax, zzxwZz8h.zz8p().zz8S());
            }
        }
        while (zzxw != null) {
            if (zzxw.zz8o() != null) {
                fMax = Math.max(fMax, zzxw.zz8o().zz8S());
            }
            zzxw = zzxw.zz8g();
        }
        return fMax;
    }

    private static int zzU(int i, int i2, boolean z) {
        if (z) {
            if (i == 0) {
                return 0;
            }
            if (i == i2 - 1) {
                return 2;
            }
        }
        return 1;
    }

    private void zzV(zzZ71 zzz71) {
        float[] fArrZzYL;
        int[] iArrZzR;
        int[] iArrZzR2;
        float[] fArrZzYL2;
        double d;
        double d2;
        int i;
        float f;
        boolean z;
        float f2;
        com.aspose.words.internal.zzZL zzzlZzZ;
        zzXU zzxu = this;
        boolean zZz7R = zzxu.zz7R();
        if (zZz7R) {
            fArrZzYL = zzxu.zzYL(((zzxu.zzZC7.zz8e() ^ zzxu.zz7W()) ^ zzxu.zz7U()) ^ zzxu.zz7S());
            iArrZzR = zzxu.zzR(zzxu.zzZC7);
        } else {
            fArrZzYL = null;
            iArrZzR = null;
        }
        boolean zZz7Q = zzxu.zz7Q();
        if (zZz7Q) {
            fArrZzYL2 = zzxu.zzYL(((zzxu.zzZBP.zz8e() ^ zzxu.zz7V()) ^ zzxu.zz7T()) ^ zzxu.zz7S());
            iArrZzR2 = zzxu.zzR(zzxu.zzZBP);
        } else {
            iArrZzR2 = null;
            fArrZzYL2 = null;
        }
        float f3 = 2.0f;
        if (zzxu.zz7J()) {
            float fAbs = Math.abs(zzxu.zzZBL - zzxu.zzZBN);
            float fAbs2 = Math.abs(zzxu.zzZBM - zzxu.zzZBO);
            double dSqrt = Math.sqrt((fAbs2 * fAbs2) + (fAbs * fAbs));
            double d3 = ((double) fAbs2) / dSqrt;
            double d4 = ((double) fAbs) / dSqrt;
            zzxu.zzE(-((float) (((double) (zzxu.zz7O().zz8S() / 2.0f)) * d4)), -((float) (((double) (zzxu.zz7O().zz8S() / 2.0f)) * d3)));
            d = d4;
            d2 = d3;
        } else {
            d = 0.0d;
            d2 = 0.0d;
        }
        float[] fArrZzYL3 = zzxu.zzYL(zzxu.zz7S());
        int i2 = 0;
        while (i2 < fArrZzYL3.length) {
            float f4 = fArrZzYL3[i2];
            float f5 = f4 / f3;
            float f6 = (float) (((double) (f4 / f3)) * d);
            double d5 = d;
            float f7 = (float) (((double) (f4 / f3)) * d2);
            if (zzxu.zz7J()) {
                zzxu.zzE(f6, f7);
            } else {
                zzxu.zzZE(f5);
            }
            if (com.aspose.words.internal.zzAN.zzZP(i2)) {
                i = i2;
                f = f5;
                z = zZz7R;
                f2 = f6;
            } else {
                long jZzZD = zZz7R ? zzxu.zzZD(zzZ(iArrZzR[i2], fArrZzYL)) : com.aspose.words.internal.zzZPY.zzG(zzxu.zzZBO, zzxu.zzZBN);
                i = i2;
                long jZzZC = zZz7Q ? zzxu.zzZC(zzZ(iArrZzR2[i2], fArrZzYL2)) : com.aspose.words.internal.zzZPY.zzG(zzxu.zzZBM, zzxu.zzZBL);
                int i3 = (int) jZzZD;
                float fIntBitsToFloat = Float.intBitsToFloat(i3);
                int i4 = (int) jZzZC;
                if (Math.abs(fIntBitsToFloat - Float.intBitsToFloat(i4)) >= 0.005f) {
                    Math.abs(com.aspose.words.internal.zzZPY.zzYC(jZzZD) - com.aspose.words.internal.zzZPY.zzYC(jZzZC));
                }
                Float.intBitsToFloat(i3);
                com.aspose.words.internal.zzZPY.zzYC(jZzZD);
                Float.intBitsToFloat(i4);
                com.aspose.words.internal.zzZPY.zzYC(jZzZC);
                if (zz7O().zz8T()) {
                    z = zZz7R;
                    f2 = f6;
                    zzxu = this;
                    f = f5;
                    zzzlZzZ = zzxu.zzU(jZzZD, jZzZC, fArrZzYL3[i]);
                    i = i;
                } else {
                    z = zZz7R;
                    f2 = f6;
                    zzxu = this;
                    f = f5;
                    zzzlZzZ = zzxu.zzZ(jZzZD, jZzZC, i, fArrZzYL3);
                }
                if (zzzlZzZ != null) {
                    zzz71.zzS(zzzlZzZ);
                }
            }
            if (zzxu.zz7J()) {
                zzxu.zzE(f2, f7);
            } else {
                zzxu.zzZE(f);
            }
            i2 = i + 1;
            d = d5;
            zZz7R = z;
            f3 = 2.0f;
        }
    }

    private static float zzX(float f, float f2, float f3, boolean z) {
        int i = z ? 2 : 0;
        float fZzY = zzY(f, f2, f3, z) - i;
        return ((f - (i * f2)) - ((f2 * fZzY) * f3)) / fZzY;
    }

    private static int zzY(float f, float f2, float f3, boolean z) {
        int i = z ? 2 : 0;
        return i + ((int) ((f - (i * f2)) / (f2 * f3)));
    }

    private float[] zzYL(boolean z) {
        float[] fArrZzU = Border.zzU(zz7O().getLineStyle(), zz7N());
        if (z) {
            com.aspose.words.internal.zzZKV.zzY(fArrZzU, fArrZzU.length);
        }
        return fArrZzU;
    }

    private static float zzZ(float f, float f2, float f3, int i) {
        return i != 1 ? f : (f * f2) + f3;
    }

    private long zzZC(float f) {
        return zz7K() ? com.aspose.words.internal.zzZPY.zzG(this.zzZBM, this.zzZBL + f) : com.aspose.words.internal.zzZPY.zzG(this.zzZBM + f, this.zzZBL);
    }

    private long zzZD(float f) {
        return zz7K() ? com.aspose.words.internal.zzZPY.zzG(this.zzZBO, this.zzZBN - f) : com.aspose.words.internal.zzZPY.zzG(this.zzZBO - f, this.zzZBN);
    }

    private void zzZE(float f) {
        int i = this.zzZBJ;
        if (i != 0) {
            if (i == 1) {
                this.zzZBO += f;
                this.zzZBM += f;
                return;
            }
            if (i != 2) {
                if (i == 3) {
                    this.zzZBN += f;
                    this.zzZBL += f;
                    return;
                } else if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("Unexpected border type.");
                    }
                }
            }
            this.zzZBO -= f;
            this.zzZBM -= f;
            return;
        }
        this.zzZBN -= f;
        this.zzZBL -= f;
    }

    private com.aspose.words.internal.zzPV zzZy() {
        com.aspose.words.internal.zzPV zzpvZz8Q = zz7O().zz8Q();
        return zzpvZz8Q.isEmpty() ? com.aspose.words.internal.zzPV.zzKa : zzpvZz8Q;
    }

    private float zzu4() {
        return (float) zz7O().zz8U();
    }

    private void zzU(zzZ71 zzz71) {
        this.zzZBO = Float.intBitsToFloat((int) this.zzZC7.zzZE());
        this.zzZBN = com.aspose.words.internal.zzZPY.zzYC(this.zzZC7.zzZE());
        this.zzZBM = Float.intBitsToFloat((int) this.zzZBP.zzZE());
        this.zzZBL = com.aspose.words.internal.zzZPY.zzYC(this.zzZBP.zzZE());
        if (!zz7J()) {
            zzZE((-zz7O().zz8S()) / 2.0f);
        }
        com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(zzZD(-zz7O().zz8S()), zzZC(zz7O().zz8S() * (zz7L() ? 0.0f : 1.0f)));
        zzzgZzZ.zzX(new com.aspose.words.internal.zzOU(com.aspose.words.internal.zzPV.zzKa, zz7O().zz8S()));
        zzz71.zzS(zzzgZzZ);
    }

    private static float zzZ(float f, float f2, float f3, boolean z) {
        float f4 = f2 - ((z ? 2 : 0) * f3);
        return f4 < f3 * f ? f4 / f3 : f;
    }

    public final void zzZ(zzXW zzxw, zzXW zzxw2, boolean z, zzZ71 zzz71) {
        this.zzZC7 = zzxw;
        this.zzZBP = zzxw2;
        this.zzZBJ = zzZ(zzxw, zzxw2);
        this.zzZBK = z;
        this.zzZBO = Float.intBitsToFloat((int) this.zzZC7.zzZE());
        this.zzZBN = com.aspose.words.internal.zzZPY.zzYC(this.zzZC7.zzZE());
        this.zzZBM = Float.intBitsToFloat((int) this.zzZBP.zzZE());
        this.zzZBL = com.aspose.words.internal.zzZPY.zzYC(this.zzZBP.zzZE());
        zz81();
        zz7Z();
        zz82();
        zzV(zzz71);
        if (zz7M()) {
            zzU(zzz71);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int[] zzZ(zzXW zzxw, int[] iArr, int[] iArr2, int[] iArr3) {
        int iZz8a = zzxw.zz8a();
        if (iZz8a != 2) {
            if (iZz8a == 3) {
                int i = this.zzZBJ;
                if (i != 4) {
                    if (i == 5) {
                        if (!zzxw.zz89() || !zzxw.zz88()) {
                            if (!zzxw.zz89()) {
                                return iArr2;
                            }
                        }
                    }
                    return iArr;
                }
                if (!zzxw.zz87() || !zzxw.zz86()) {
                    if (zzxw.zz87()) {
                        return iArr;
                    }
                }
            } else if (iZz8a != 4) {
                throw new IllegalStateException("Unexpected number of connected borders at a point.");
            }
            return iArr3;
        }
        int i2 = this.zzZBJ;
        if (i2 == 4 ? !zzxw.zz87() : i2 == 5 && !zzxw.zz89()) {
        }
    }

    private com.aspose.words.internal.zzG zzU(long j, long j2, float f) {
        return zzZ(j, j2, f, zz7L());
    }

    private static float zzZ(int i, float[] fArr) {
        int length = fArr.length - 1;
        float f = 0.0f;
        while (i > 0) {
            f += fArr[length];
            length--;
            i--;
        }
        return f;
    }

    private com.aspose.words.internal.zzZG zzZ(long j, long j2, int i, float[] fArr) {
        com.aspose.words.internal.zzZG zzzgZzZ;
        float f = fArr[i];
        switch (zz7O().getLineStyle()) {
            case 0:
                zzzgZzZ = null;
                break;
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 22:
            case 26:
            case 27:
                zzzgZzZ = zzXT.zzZ(j, j2, f, zzZy());
                break;
            case 4:
            default:
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: Unknown border line style");
            case 20:
                zzzgZzZ = zzXT.zzZ(j, j2, zz7O().zz8S(), zzZy(), zz7L());
                break;
            case 21:
                zzzgZzZ = zzXT.zzY(j, j2, zz7O().zz8S(), zzZy(), zz7L());
                break;
            case 23:
                zzzgZzZ = zzXT.zzX(j, j2, zz7O().zz8S(), zzZy(), zz7L());
                break;
            case 24:
                zzzgZzZ = zzXT.zzY(j, j2, zzZ(i, f, false));
                break;
            case 25:
                zzzgZzZ = zzXT.zzY(j, j2, zzZ(i, f, true));
                break;
        }
        if (zzzgZzZ != null && fArr.length == 1) {
            zzI(zzzgZzZ.zzZ2());
        }
        return zzzgZzZ;
    }

    private static void zzZ(com.aspose.words.internal.zzZP zzzp, com.aspose.words.internal.zzPV zzpv) {
        if (com.aspose.words.internal.zzPV.zzZ(zzpv, com.aspose.words.internal.zzPV.zzKa)) {
            return;
        }
        com.aspose.words.internal.zz0 zz0Var = new com.aspose.words.internal.zz0(com.aspose.words.internal.zzPV.zzKa, zzpv);
        zzzp.zzZ8();
        zzzp.zzZb().add(zz0Var);
    }

    private com.aspose.words.internal.zzOU zzZ(int i, float f, boolean z) {
        com.aspose.words.internal.zzPV[] zzpvArr;
        com.aspose.words.internal.zzPV[] zzpvArrZz7P = zz7P();
        if (z) {
            com.aspose.words.internal.zzPV zzpv = com.aspose.words.internal.zzPV.zzHZ;
            zzpvArr = new com.aspose.words.internal.zzPV[]{zzpvArrZz7P[0], zzpv, zzpvArrZz7P[1], zzpv, zzpvArrZz7P[2]};
        } else {
            com.aspose.words.internal.zzPV zzpv2 = com.aspose.words.internal.zzPV.zzHZ;
            zzpvArr = new com.aspose.words.internal.zzPV[]{zzpvArrZz7P[2], zzpv2, zzpvArrZz7P[1], zzpv2, zzpvArrZz7P[0]};
        }
        if (zz7S()) {
            com.aspose.words.internal.zzZKV.zzZ(zzpvArr, 5);
        }
        return new com.aspose.words.internal.zzOU(zzpvArr[i], f);
    }

    private static int zzZ(zzXW zzxw, zzXW zzxw2) {
        if (zzxw.zz8t() && zzxw2.zz8t()) {
            return 1;
        }
        if (zzxw.zz8s() && zzxw2.zz8s()) {
            return 2;
        }
        if (zzxw.zz8r() && zzxw2.zz8r()) {
            return 3;
        }
        if (zzxw.zz8q() && zzxw2.zz8q()) {
            return 0;
        }
        if (zzxw.zz8i() == zzxw2) {
            return 6;
        }
        if (zzxw.zz8j() == zzxw2) {
            return 7;
        }
        zzXW zzxwZz8f = zzxw.zz8f();
        while (zzxwZz8f != null && zzxwZz8f != zzxw2) {
            zzxwZz8f = zzxwZz8f.zz8f();
        }
        if (zzxwZz8f == zzxw2) {
            return 5;
        }
        zzXW zzxwZz8g = zzxw.zz8g();
        while (zzxwZz8g != null && zzxwZz8g != zzxw2) {
            zzxwZz8g = zzxwZz8g.zz8g();
        }
        if (zzxwZz8g == zzxw2) {
            return 4;
        }
        throw new IllegalStateException("Border type is not detected.");
    }

    private com.aspose.words.internal.zzG zzZ(long j, long j2, float f, boolean z) {
        float fZzYC;
        float fZzYC2;
        float fZzYqA;
        long jZzG;
        zzYND zzyndZzqS = zzYNC.zzqS(zz7O().getLineStyle());
        if (z) {
            fZzYC = Float.intBitsToFloat((int) j2);
            fZzYC2 = Float.intBitsToFloat((int) j);
        } else {
            fZzYC = com.aspose.words.internal.zzZPY.zzYC(j2);
            fZzYC2 = com.aspose.words.internal.zzZPY.zzYC(j);
        }
        float f2 = fZzYC - fZzYC2;
        if (z) {
            fZzYqA = zzyndZzqS.zzYqB();
        } else {
            fZzYqA = zzyndZzqS.zzYqA();
        }
        float fZzZ = zzZ(fZzYqA, f2, f, z);
        int iZzY = zzY(f2, f, fZzZ, z);
        float fZzX = zzX(f2, f, fZzZ, z);
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        float f3 = 0.0f;
        for (int i = 0; i < iZzY; i++) {
            int iZzU = zzU(i, iZzY, z);
            float fZzZ2 = zzZ(f, fZzZ, fZzX, iZzU);
            if (z) {
                jZzG = com.aspose.words.internal.zzZPW.zzG(fZzZ2, f);
            } else {
                jZzG = com.aspose.words.internal.zzZPW.zzG(f, fZzZ2);
            }
            com.aspose.words.internal.zzZP zzzp = new com.aspose.words.internal.zzZP(zzZ(j, f3, f, z), jZzG, zzyndZzqS.zzWq(this.zzZBJ, iZzU));
            zzZ(zzzp, zzZy());
            zzg.zzX(zzzp);
            f3 += fZzZ2;
        }
        return zzg;
    }

    private static long zzZ(long j, float f, float f2, boolean z) {
        if (z) {
            return com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) j) + f, com.aspose.words.internal.zzZPY.zzYC(j) - (f2 / 2.0f));
        }
        return C22243OooO0Oo.OooO00o(f, Float.intBitsToFloat((int) j) - (f2 / 2.0f), j);
    }
}
