package com.aspose.words;

import OooOoO.C20504OooO0O0;
import com.aspose.words.internal.C22243OooO0Oo;
import com.aspose.words.ref.RefInt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzXT {
    private static float zzT(RefInt refInt) {
        refInt.set(refInt.get() + 1);
        if (refInt.get() % 5 == 0) {
            return 2.25f;
        }
        if (refInt.get() % 6 != 0) {
            return 0.75f;
        }
        refInt.set(0);
        return 2.25f;
    }

    public static com.aspose.words.internal.zzZG zzX(long j, long j2, float f, com.aspose.words.internal.zzPV zzpv, boolean z) {
        long jZzG;
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG(new com.aspose.words.internal.zzOU(zzpv));
        float f2 = f + 3.0f;
        if (z) {
            jZzG = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) j) - f2, (f2 / 2.0f) + com.aspose.words.internal.zzZPY.zzYC(j));
        } else {
            jZzG = com.aspose.words.internal.zzZPY.zzG((f2 / 2.0f) + Float.intBitsToFloat((int) j), com.aspose.words.internal.zzZPY.zzYC(j) - f2);
        }
        com.aspose.words.internal.zzP5 zzp5 = new com.aspose.words.internal.zzP5();
        com.aspose.words.internal.OooO00o.OooO00o(zzzg, zzp5);
        float fZzZ = zzZ(j, j2, z);
        int iOooO0O0 = (int) C20504OooO0O0.OooO0O0(f2, 2.0f, fZzZ, 2.0f);
        int i = 2;
        float[] fArr = new float[(iOooO0O0 + 1) * 2];
        int i2 = (int) jZzG;
        int i3 = 0;
        fArr[0] = Float.intBitsToFloat(i2);
        int i4 = 1;
        fArr[1] = com.aspose.words.internal.zzZPY.zzYC(jZzG);
        if (z) {
            float fIntBitsToFloat = Float.intBitsToFloat(i2);
            float fZzT = fIntBitsToFloat + f2;
            int i5 = 0;
            while (i3 < iOooO0O0) {
                if ((i3 & 2) == 2) {
                    if ((i3 & 1) == 1) {
                        RefInt refInt = new RefInt(i5);
                        fZzT += zzT(refInt);
                        i5 = refInt.get();
                        fIntBitsToFloat = fZzT - f2;
                    }
                    int i6 = i3 * 2;
                    fArr[i6 + 2] = fZzT;
                    fArr[i6 + 3] = com.aspose.words.internal.zzZPY.zzYC(j) - (f2 / 2.0f);
                } else {
                    if ((i3 & 1) == 1) {
                        RefInt refInt2 = new RefInt(i5);
                        fIntBitsToFloat += zzT(refInt2);
                        i5 = refInt2.get();
                        fZzT = fIntBitsToFloat + f2;
                    }
                    int i7 = i3 * 2;
                    fArr[i7 + 2] = fIntBitsToFloat;
                    fArr[i7 + 3] = (f2 / 2.0f) + com.aspose.words.internal.zzZPY.zzYC(j);
                }
                i3++;
            }
        } else {
            float fZzYC = com.aspose.words.internal.zzZPY.zzYC(jZzG);
            float fZzT2 = fZzYC + f2;
            int i8 = 0;
            while (i3 < iOooO0O0) {
                if ((i3 & 2) == i) {
                    if ((i3 & 1) == i4) {
                        RefInt refInt3 = new RefInt(i8);
                        fZzT2 += zzT(refInt3);
                        i8 = refInt3.get();
                        fZzYC = fZzT2 - f2;
                    }
                    int i9 = i3 * 2;
                    fArr[i9 + 2] = Float.intBitsToFloat((int) j) - (f2 / 2.0f);
                    fArr[i9 + 3] = fZzT2;
                } else {
                    if ((i3 & 1) == i4) {
                        RefInt refInt4 = new RefInt(i8);
                        fZzYC += zzT(refInt4);
                        i8 = refInt4.get();
                        fZzT2 = fZzYC + f2;
                    }
                    int i10 = i3 * 2;
                    fArr[i10 + 2] = (f2 / 2.0f) + Float.intBitsToFloat((int) j);
                    fArr[i10 + 3] = fZzYC;
                }
                i3++;
                i4 = 1;
                i = 2;
            }
        }
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzOS>) zzp5.zzNY(), new com.aspose.words.internal.zzOS(fArr));
        zzZ(zzzg, j, fZzZ, f, z);
        return zzzg;
    }

    public static com.aspose.words.internal.zzZG zzY(long j, long j2, com.aspose.words.internal.zzOU zzou) {
        com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(j, j2);
        zzzgZzZ.zzX(zzou);
        return zzzgZzZ;
    }

    public static com.aspose.words.internal.zzZG zzZ(long j, long j2, float f, com.aspose.words.internal.zzPV zzpv) {
        return zzY(j, j2, new com.aspose.words.internal.zzOU(zzpv, f));
    }

    public static com.aspose.words.internal.zzZG zzZ(long j, long j2, float f, com.aspose.words.internal.zzPV zzpv, boolean z) {
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG(new com.aspose.words.internal.zzOU(zzpv));
        float fZzZ = zzZ(j, j2, z);
        com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), zzY(j, fZzZ, f, z));
        zzZ(zzzg, j, fZzZ, f + 1.5f, z);
        return zzzg;
    }

    public static com.aspose.words.internal.zzZG zzY(long j, long j2, float f, com.aspose.words.internal.zzPV zzpv, boolean z) {
        long jZzG;
        long jZzG2;
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG(new com.aspose.words.internal.zzOU(zzpv));
        float fZzZ = zzZ(j, j2, z);
        if (z) {
            int i = (int) j;
            float f2 = 0.25f * f;
            jZzG = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat(i), com.aspose.words.internal.zzZPY.zzYC(j) - f2);
            jZzG2 = C22243OooO0Oo.OooO00o(f2, Float.intBitsToFloat(i), j);
        } else {
            int i2 = (int) j;
            float f3 = 0.25f * f;
            jZzG = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat(i2) - f3, com.aspose.words.internal.zzZPY.zzYC(j));
            jZzG2 = com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat(i2) + f3, com.aspose.words.internal.zzZPY.zzYC(j));
        }
        float f4 = 0.5f * f;
        com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), zzY(jZzG, fZzZ, f4, z));
        com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), zzY(jZzG2, fZzZ, f4, z));
        zzZ(zzzg, j, fZzZ, f + 1.5f, z);
        return zzzg;
    }

    private static void zzZ(com.aspose.words.internal.zzZG zzzg, long j, float f, float f2, boolean z) {
        com.aspose.words.internal.zzZQ4 zzzq4;
        if (z) {
            zzzq4 = new com.aspose.words.internal.zzZQ4(Float.intBitsToFloat((int) j), com.aspose.words.internal.zzZPY.zzYC(j) - (f2 / 2.0f), f, f2);
        } else {
            zzzq4 = new com.aspose.words.internal.zzZQ4(Float.intBitsToFloat((int) j) - (f2 / 2.0f), com.aspose.words.internal.zzZPY.zzYC(j), f2, f);
        }
        zzzg.zzZ(com.aspose.words.internal.zzP8.zzM(zzzq4));
    }

    private static float zzZ(long j, long j2, boolean z) {
        float fZzYC;
        float fZzYC2;
        if (z) {
            fZzYC = Float.intBitsToFloat((int) j2);
            fZzYC2 = Float.intBitsToFloat((int) j);
        } else {
            fZzYC = com.aspose.words.internal.zzZPY.zzYC(j2);
            fZzYC2 = com.aspose.words.internal.zzZPY.zzYC(j);
        }
        return fZzYC - fZzYC2;
    }

    private static com.aspose.words.internal.zzP5 zzY(long j, float f, float f2, boolean z) {
        com.aspose.words.internal.zzP5 zzp5 = new com.aspose.words.internal.zzP5();
        int i = (int) (f / f2);
        float[] fArr = new float[(i + 2) * 2];
        int i2 = (int) j;
        int i3 = 0;
        fArr[0] = Float.intBitsToFloat(i2);
        fArr[1] = com.aspose.words.internal.zzZPY.zzYC(j);
        if (z) {
            while (i3 < i + 1) {
                int i4 = i3 * 2;
                float f3 = f2 / 2.0f;
                fArr[i4 + 2] = (i3 * f2) + Float.intBitsToFloat(i2) + f3;
                if (com.aspose.words.internal.zzAN.zzZP(i3)) {
                    fArr[i4 + 3] = com.aspose.words.internal.zzZPY.zzYC(j) + f3;
                } else {
                    fArr[i4 + 3] = com.aspose.words.internal.zzZPY.zzYC(j) - f3;
                }
                i3++;
            }
        } else {
            while (i3 < i + 1) {
                if (com.aspose.words.internal.zzAN.zzZP(i3)) {
                    fArr[(i3 * 2) + 2] = (f2 / 2.0f) + Float.intBitsToFloat(i2);
                } else {
                    fArr[(i3 * 2) + 2] = Float.intBitsToFloat(i2) - (f2 / 2.0f);
                }
                fArr[(i3 * 2) + 3] = (f2 / 2.0f) + (i3 * f2) + com.aspose.words.internal.zzZPY.zzYC(j);
                i3++;
            }
        }
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzOS>) zzp5.zzNY(), new com.aspose.words.internal.zzOS(fArr));
        return zzp5;
    }
}
