package com.aspose.words.internal;

import OooOoO.C20504OooO0O0;
import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.o000oOoO;

/* JADX INFO: loaded from: classes5.dex */
public final class zzQ0 {
    private static zzOQ zzS(long j, long j2, long j3, long j4) {
        int i = 4;
        zzQ2 zzq2 = new zzQ2(4);
        zzq2.zzV(j, j2, j3, j4);
        for (int i2 = 1; i2 < 4; i2++) {
            zzq2.zzV(0L, 0L, 0L, 0L);
        }
        int i3 = 2;
        int i4 = 4;
        while (i3 > 0) {
            int i5 = 0;
            while (i5 < i) {
                long jZzYd = zzq2.zzYd(i5);
                long jZzYc = zzq2.zzYc(i5);
                long jZzYb = zzq2.zzYb(i5);
                long jZzYa = zzq2.zzYa(i5);
                long jZzU = zzU(jZzYd, jZzYc);
                long jZzU2 = zzU(jZzYc, jZzYb);
                long jZzU3 = zzU(jZzYb, jZzYa);
                long jZzU4 = zzU(jZzU, jZzU2);
                long jZzU5 = zzU(jZzU2, jZzU3);
                long jZzU6 = zzU(jZzU4, jZzU5);
                zzq2.zzY(i5, jZzU);
                zzq2.zzX(i5, jZzU4);
                zzq2.zzW(i5, jZzU6);
                int i6 = i5 + i3;
                zzq2.zzZ(i6, jZzU6);
                zzq2.zzY(i6, jZzU5);
                zzq2.zzX(i6, jZzU3);
                zzq2.zzW(i6, jZzYa);
                i5 += i4;
                i = 4;
            }
            i4 = i3;
            i3 /= 2;
            i = 4;
        }
        return zzq2.zzPS();
    }

    public static zzOQ zzT(long j, long j2, long j3, long j4) {
        return zzS(j, j2, j3, j4);
    }

    public static long zzU(long j, long j2) {
        return zzZPY.zzG((Float.intBitsToFloat((int) j2) + Float.intBitsToFloat((int) j)) / 2.0f, (zzZPY.zzYC(j2) + zzZPY.zzYC(j)) / 2.0f);
    }

    public static float zzZ(long j, long j2, long j3) {
        int i = (int) j;
        int i2 = (int) j2;
        float fIntBitsToFloat = Float.intBitsToFloat((int) j3) + (Float.intBitsToFloat(i) - (Float.intBitsToFloat(i2) * 2.0f));
        float fZzYC = zzZPY.zzYC(j3) + (zzZPY.zzYC(j) - (zzZPY.zzYC(j2) * 2.0f));
        if (fIntBitsToFloat == 0.0f && fZzYC == 0.0f) {
            return (float) Math.sqrt(zzAN.zzg(zzZPY.zzYC(j3) - zzZPY.zzYC(j)) + zzAN.zzg(Float.intBitsToFloat(r7) - Float.intBitsToFloat(i)));
        }
        float fIntBitsToFloat2 = (Float.intBitsToFloat(i2) * 2.0f) - (Float.intBitsToFloat(i) * 2.0f);
        float fZzYC2 = (zzZPY.zzYC(j2) * 2.0f) - (zzZPY.zzYC(j) * 2.0f);
        float fOooO0O0 = C20504OooO0O0.OooO0O0(fZzYC, fZzYC, fIntBitsToFloat * fIntBitsToFloat, 4.0f);
        float fOooO0O02 = C20504OooO0O0.OooO0O0(fZzYC, fZzYC2, fIntBitsToFloat * fIntBitsToFloat2, 4.0f);
        float f = (fZzYC2 * fZzYC2) + (fIntBitsToFloat2 * fIntBitsToFloat2);
        double dSqrt = Math.sqrt(fOooO0O0 + fOooO0O02 + f) * 2.0d;
        double dSqrt2 = Math.sqrt(fOooO0O0);
        double d = ((double) (2.0f * fOooO0O0)) * dSqrt2;
        double dSqrt3 = Math.sqrt(f) * 2.0d;
        double d2 = fOooO0O02;
        double d3 = d2 / dSqrt2;
        return (float) (((Math.log(o000oOoO.OooO00o(dSqrt2, 2.0d, d3, dSqrt) / (d3 + dSqrt3)) * ((double) (((f * 4.0f) * fOooO0O0) - (fOooO0O02 * fOooO0O02)))) + C21532OooOOo.OooO0O0(dSqrt, dSqrt3, dSqrt2 * d2, d * dSqrt)) / (d * 4.0d));
    }
}
