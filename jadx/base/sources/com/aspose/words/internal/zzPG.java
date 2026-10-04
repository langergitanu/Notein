package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzPG {
    private boolean zzHm;
    private float zzHn;
    private float zzHo;

    public zzPG() {
    }

    private float zzN(float f) {
        return this.zzHm ? this.zzHn : (this.zzHo * f) + this.zzHn;
    }

    private boolean zzY(long j, float f, long[] jArr) {
        if (this.zzHm) {
            jArr[0] = C22243OooO0Oo.OooO00o(f, Float.intBitsToFloat((int) j), j);
            return true;
        }
        float f2 = this.zzHo;
        if (f2 < 0.0f) {
            f *= -1.0f;
        }
        double dAtan = Math.atan(f2);
        double d = f;
        jArr[0] = zzZPY.zzG((float) ((Math.cos(dAtan) * d) + ((double) Float.intBitsToFloat((int) j))), (float) ((Math.sin(dAtan) * d) + ((double) zzZPY.zzYC(j))));
        return true;
    }

    public final zzPG zzM(float f) {
        float f2 = this.zzHo;
        if (f2 != 0.0f) {
            f /= (float) Math.abs(Math.cos(Math.atan(f2)));
        }
        zzPG zzpg = new zzPG();
        zzpg.zzHm = this.zzHm;
        zzpg.zzHo = this.zzHo;
        zzpg.zzHn = this.zzHn + f;
        return zzpg;
    }

    public final boolean zzOD() {
        return this.zzHm;
    }

    public final float zzOE() {
        return this.zzHo;
    }

    public final void zzZ(long j, float f, long[] jArr) {
        zzY(j, f, jArr);
    }

    public final boolean zzq(long j) {
        return this.zzHm ? zzAN.zzY(Float.intBitsToFloat((int) j), this.zzHn, 0.001f) : ((double) Math.abs(zzZPY.zzYC(j) - zzN(Float.intBitsToFloat((int) j)))) < 0.01d;
    }

    public final zzPG zzr(long j) {
        zzPG zzpg = new zzPG();
        if (this.zzHm) {
            zzpg.zzHm = true;
            zzpg.zzHn = Float.intBitsToFloat((int) j);
            return zzpg;
        }
        zzpg.zzHo = this.zzHo;
        zzpg.zzHn = zzZPY.zzYC(j) - (Float.intBitsToFloat((int) j) * this.zzHo);
        return zzpg;
    }

    public final zzPG zzs(long j) {
        zzPG zzpg = new zzPG();
        if (this.zzHm) {
            return new zzPG(j, zzZPY.zzG(Float.intBitsToFloat((int) j) + 1.0f, zzZPY.zzYC(j)));
        }
        float f = this.zzHo;
        if (f == 0.0f) {
            zzpg.zzHm = true;
            zzpg.zzHn = Float.intBitsToFloat((int) j);
            return zzpg;
        }
        zzpg.zzHo = (-1.0f) / f;
        zzpg.zzHn = ((this.zzHo - zzpg.zzHo) * Float.intBitsToFloat((int) j)) + this.zzHn;
        return zzpg;
    }

    public final zzPG zzt(long j) {
        return zzs(j);
    }

    public final boolean zzu(long j) {
        return this.zzHm ? this.zzHn < Float.intBitsToFloat((int) j) : zzN(Float.intBitsToFloat((int) j)) < zzZPY.zzYC(j);
    }

    public zzPG(long j, long j2) {
        int i = (int) j;
        int i2 = (int) j2;
        if (zzAN.zzY(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), 0.001f)) {
            this.zzHm = true;
            this.zzHn = Float.intBitsToFloat(i);
        } else {
            this.zzHo = (zzZPY.zzYC(j) - zzZPY.zzYC(j2)) / (Float.intBitsToFloat(i) - Float.intBitsToFloat(i2));
            this.zzHn = zzZPY.zzYC(j) - (Float.intBitsToFloat(i) * this.zzHo);
        }
    }

    public static void zzZ(zzPG zzpg, zzPG zzpg2, long[] jArr) {
        zzZ(zzpg, zzpg2, jArr, false);
    }

    public static boolean zzZ(zzPG zzpg, zzPG zzpg2, long[] jArr, boolean z) {
        float f;
        float fZzN;
        float fZzN2;
        float f2;
        if (z && zzZ(zzpg, zzpg2)) {
            return false;
        }
        if (zzpg.zzHm) {
            f2 = zzpg.zzHn;
            fZzN2 = zzpg2.zzN(f2);
        } else {
            if (zzpg2.zzHm) {
                f = zzpg2.zzHn;
                fZzN = zzpg.zzN(f);
            } else {
                float f3 = zzpg2.zzHn;
                float f4 = zzpg.zzHn;
                float f5 = zzpg.zzHo;
                f = (f3 - f4) / (f5 - zzpg2.zzHo);
                fZzN = (f5 * f) + f4;
            }
            float f6 = f;
            fZzN2 = fZzN;
            f2 = f6;
        }
        jArr[0] = zzZPY.zzG(f2, fZzN2);
        return true;
    }

    public static boolean zzY(zzPG zzpg, zzPG zzpg2, long[] jArr) {
        if ((zzpg.zzHm && zzpg2.zzHm) || zzpg.zzHo == zzpg2.zzHo) {
            return false;
        }
        return zzZ(zzpg, zzpg2, jArr, false);
    }

    public static zzPG zzZ(long j, boolean z) {
        return new zzPG(j, zzZPY.zzG(Float.intBitsToFloat((int) j) + (z ? 1.0f : 0.0f), zzZPY.zzYC(j) + (!z ? 1 : 0)));
    }

    public static boolean zzZ(zzPG zzpg, zzPG zzpg2) {
        if (zzpg.zzHm && zzpg2.zzHm) {
            return true;
        }
        return (!zzAN.zzY(zzpg.zzHo, zzpg2.zzHo, 0.001f) || zzpg.zzHm || zzpg2.zzHm) ? false : true;
    }
}
