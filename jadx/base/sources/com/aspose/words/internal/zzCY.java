package com.aspose.words.internal;

import androidx.datastore.preferences.protobuf.C21825OoooOO0;

/* JADX INFO: loaded from: classes5.dex */
final class zzCY {
    public static void zzU(zzOS zzos, zzOS zzos2) {
        int count = zzos2.zzNu().getCount();
        if (zzos.zzNu().getCount() <= 1 || count <= 1) {
            return;
        }
        int i = count - 1;
        if (zzJ6.zzN(zzos2.zzNu().get(i), zzos.zzNu().get(0))) {
            zzos2.zzNu().set(i, zzos.zzNu().get(0));
        }
        long[] jArr = {0};
        if (zzPG.zzZ(new zzPG(zzos2.zzNu().get(count - 2), zzos2.zzNu().get(i)), new zzPG(zzos.zzNu().get(0), zzos.zzNu().get(1)), jArr, true)) {
            zzos2.zzNu().set(i, jArr[0]);
            zzos.zzNu().set(0, jArr[0]);
        }
    }

    public static long[] zzY(zzOQ zzoq, boolean z) {
        return z ? new long[]{zzoq.zzXT(0), zzoq.zzYd(0)} : new long[]{zzoq.zzXT(zzoq.getCount() - 1), zzoq.zzYa(zzoq.getCount() - 1)};
    }

    public static zzOQ zzZ(zzOS zzos, zzOQ zzoq, boolean z) {
        long j;
        long j2;
        if (zzos.zzNu().getCount() < 2) {
            return zzoq;
        }
        zzOQ zzoq2 = new zzOQ();
        if (z) {
            j = zzos.zzNu().get(0);
            j2 = zzos.zzNu().get(1);
        } else {
            j = zzos.zzNu().get(zzos.zzNu().getCount() - 2);
            j2 = zzos.zzNu().get(zzos.zzNu().getCount() - 1);
        }
        long[] jArr = {j, j2};
        if (!zzZ(zzos, zzoq, z, jArr, zzoq2)) {
            zzZ(zzos, zzoq, z, jArr);
        }
        return zzoq2;
    }

    private static boolean zzh(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalStateException();
        }
        return (f == 0.0f || f == 1.0f) ? false : true;
    }

    private static void zzY(zzOQ zzoq, int i, zzOQ zzoq2, float f) {
        zzY(zzoq, i, zzoq2, zzoq2.getCount(), f);
    }

    private static void zzY(zzOQ zzoq, int i, zzOQ zzoq2, int i2, float f) {
        long jZzYd;
        long jZzXT;
        long jZzYa = zzoq.zzYa(i);
        if (zzh(f)) {
            jZzYd = zzY(zzoq, i, f);
            long jZzXT2 = zzoq.zzXT(i);
            jZzXT = zzZ(new zzPG(jZzXT2, jZzYa), zzoq, i, f, zzJ6.zzO(jZzXT2, jZzYa), false);
        } else {
            jZzYd = zzoq.zzYd(i);
            jZzXT = zzoq.zzXT(i);
        }
        zzoq2.zzZ(i2, jZzYd, jZzXT, jZzYa);
    }

    private static void zzZ(zzOS zzos, zzOQ zzoq, boolean z, long[] jArr) {
        zzPG zzpg;
        zzPG zzpg2 = new zzPG(jArr[0], jArr[1]);
        if (z) {
            zzpg = new zzPG(zzoq.zzXT(zzoq.getCount() - 1), zzoq.zzYa(zzoq.getCount() - 1));
        } else {
            zzpg = new zzPG(zzoq.zzXT(0), zzoq.zzYd(0));
        }
        long[] jArr2 = {0};
        zzPG.zzZ(zzpg2, zzpg, jArr2);
        jArr2[0] = zzZ(zzoq, z, jArr, jArr2[0]);
        if (z) {
            zzos.zzNu().set(0, jArr2[0]);
        } else {
            zzos.zzNu().set(zzos.zzNu().getCount() - 1, jArr2[0]);
        }
    }

    public static void zzU(zzOQ zzoq) {
        if (zzoq.getCount() < 2) {
            return;
        }
        int i = 0;
        while (i < zzoq.getCount() - 1) {
            int i2 = i + 1;
            zzD0 zzd0ZzZ = zzZ(zzoq, i, zzoq, i2);
            if (zzd0ZzZ.zzCG()) {
                zzZ(zzoq, i, zzoq, i, zzd0ZzZ.zzCF().get(0));
                zzY(zzoq, i2, zzoq, i2, zzd0ZzZ.zzCE().get(0));
            }
            zzoq.zzW(i, zzoq.zzYd(i2));
            i = i2;
        }
    }

    private static long zzY(zzOQ zzoq, int i, float f) {
        return new zzZZV(zzoq, i).zzZS(f);
    }

    private static long zzZ(zzOQ zzoq, boolean z, long[] jArr, long j) {
        float fIntBitsToFloat;
        float fZzNt = zzoq.zzNt();
        if (zzJ6.zzO(j, z ? zzoq.zzYa(zzoq.getCount() - 1) : zzoq.zzYd(0)) <= fZzNt) {
            return j;
        }
        zzPG zzpg = new zzPG(jArr[0], jArr[1]);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) j);
        if (z) {
            fIntBitsToFloat = Float.intBitsToFloat((int) jArr[0]);
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) jArr[1]);
        }
        if (fIntBitsToFloat2 < fIntBitsToFloat) {
            fZzNt *= -1.0f;
        }
        long[] jArr2 = {0};
        zzpg.zzZ(z ? jArr[0] : jArr[1], fZzNt, jArr2);
        return jArr2[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean zzZ(zzOS zzos, zzOQ zzoq, boolean z, long[] jArr, zzOQ zzoq2) {
        zzCZ zzczZzZ;
        int count = z ? 0 : zzoq.getCount() - 1;
        while (true) {
            if (z) {
                if (count >= zzoq.getCount()) {
                    break;
                }
                int i = count;
                zzOQ zzoq3 = zzoq;
                zzczZzZ = zzZ(jArr[0], jArr[1], zzoq3, i);
                if (!zzczZzZ.zzCG()) {
                    zzZ(z, zzoq3, i, zzczZzZ, zzos, zzoq2);
                    return true;
                }
                zzOS zzos2 = zzos;
                boolean z2 = z;
                zzOQ zzoq4 = zzoq2;
                zzoq4.zzY(zzoq3, i);
                count = i + (z2 ? 1 : -1);
                z = z2;
                zzoq = zzoq3;
                zzos = zzos2;
                zzoq2 = zzoq4;
            } else {
                if (count < 0) {
                    break;
                }
                int i2 = count;
                zzOQ zzoq32 = zzoq;
                zzczZzZ = zzZ(jArr[0], jArr[1], zzoq32, i2);
                if (!zzczZzZ.zzCG()) {
                }
            }
        }
    }

    private static void zzZ(boolean z, zzOQ zzoq, int i, zzCZ zzcz, zzOS zzos, zzOQ zzoq2) {
        long j = zzcz.zzCC()[0];
        float f = zzcz.zzCB()[0];
        if (z) {
            zzos.zzNu().set(0, j);
            zzZ(zzoq, i, zzoq2, f);
        } else {
            zzos.zzNu().set(zzos.zzNu().getCount() - 1, j);
            zzY(zzoq, i, zzoq2, f);
        }
    }

    public static zzZZK zzZ(zzOQ zzoq, zzOQ zzoq2, boolean z) {
        zzZZK zzzzk = new zzZZK();
        zzzzk.zzZB(z);
        zzzzk.zzZA(!z);
        zzzzk.zzT(new zzOQ());
        zzzzk.zzS(new zzOQ());
        if (!zzZ(zzoq, zzoq2, zzzzk.zzrC(), zzzzk.zzrB(), z)) {
            zzZ(zzoq, zzoq2, z, zzzzk);
        }
        return zzzzk;
    }

    private static void zzZ(zzOQ zzoq, zzOQ zzoq2, boolean z, zzZZK zzzzk) {
        long[] jArr = {0};
        if (!zzAN.zzY(zzJ6.zzO(z ? zzoq.zzYd(0) : zzoq.zzYa(zzoq.getCount() - 1), !z ? zzoq2.zzYd(0) : zzoq2.zzYa(zzoq2.getCount() - 1)), 0.0f, 0.001f)) {
            zzPG.zzZ(zzZ(zzoq, z), zzZ(zzoq2, !z), jArr);
        }
        if (zzZPY.zzD(jArr[0], 0L)) {
            return;
        }
        zzzzk.zzry();
        zzzzk.zzYY(jArr[0]);
    }

    private static zzPG zzZ(zzOQ zzoq, boolean z) {
        long[] jArrZzY = zzY(zzoq, z);
        return new zzPG(jArrZzY[0], jArrZzY[1]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
    
        r3 = r11;
        r5 = r12;
        r7 = r13;
        r8 = r14;
        r9 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        r7.zzY(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        if (r9 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006a, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0040 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean zzZ(zzOQ zzoq, zzOQ zzoq2, zzOQ zzoq3, zzOQ zzoq4, boolean z) {
        int count;
        int i;
        zzOQ zzoq5;
        zzOQ zzoq6;
        zzOQ zzoq7;
        zzOQ zzoq8;
        boolean z2;
        zzD0 zzd0ZzZ;
        int count2 = z ? zzoq.getCount() - 1 : 0;
        while (true) {
            if (!z) {
                if (count2 >= zzoq.getCount()) {
                    break;
                }
                zzoq4.clear();
                if (z) {
                }
                while (true) {
                    i = -1;
                    if (!z) {
                    }
                    count += i;
                    zzoq = zzoq;
                    zzoq2 = zzoq;
                    zzoq3 = zzoq;
                    zzoq4 = zzoq;
                    z = z;
                }
            } else {
                if (count2 < 0) {
                    break;
                }
                zzoq4.clear();
                count = z ? zzoq2.getCount() - 1 : 0;
                while (true) {
                    i = -1;
                    if (!z) {
                        if (count >= zzoq2.getCount()) {
                            break;
                        }
                        zzd0ZzZ = zzZ(zzoq, count2, zzoq2, count);
                        if (!zzd0ZzZ.zzCG()) {
                        }
                    } else {
                        if (count < 0) {
                            break;
                        }
                        zzd0ZzZ = zzZ(zzoq, count2, zzoq2, count);
                        if (!zzd0ZzZ.zzCG()) {
                            zzZ(zzoq, count2, zzoq2, count, zzoq3, zzoq4, z, zzd0ZzZ);
                            return true;
                        }
                        zzOQ zzoq9 = zzoq;
                        zzOQ zzoq10 = zzoq2;
                        zzOQ zzoq11 = zzoq3;
                        zzOQ zzoq12 = zzoq4;
                        boolean z3 = z;
                        zzoq12.zzY(zzoq10, count);
                        if (z3) {
                            i = 1;
                        }
                        count += i;
                        zzoq = zzoq9;
                        zzoq2 = zzoq10;
                        zzoq3 = zzoq11;
                        zzoq4 = zzoq12;
                        z = z3;
                    }
                }
            }
            count2 += i;
            zzoq = zzoq5;
            zzoq2 = zzoq6;
            zzoq3 = zzoq7;
            zzoq4 = zzoq8;
            z = z2;
        }
    }

    private static void zzZ(zzOQ zzoq, int i, zzOQ zzoq2, int i2, zzOQ zzoq3, zzOQ zzoq4, boolean z, zzD0 zzd0) {
        float f = -3.4028235E38f;
        int i3 = 0;
        for (int i4 = 0; i4 < zzd0.zzCF().getCount(); i4++) {
            if ((z && zzd0.zzCF().get(i4) > f) || (!z && zzd0.zzCF().get(i4) <= f)) {
                f = zzd0.zzCF().get(i4);
                i3 = i4;
            }
        }
        float f2 = zzd0.zzCF().get(i3);
        float f3 = zzd0.zzCE().get(i3);
        if (!z) {
            zzZ(zzoq, i, zzoq3, f2);
            zzY(zzoq2, i2, zzoq4, f3);
        } else {
            zzY(zzoq, i, zzoq3, f2);
            zzZ(zzoq2, i2, zzoq4, f3);
        }
    }

    private static zzD0 zzZ(zzOQ zzoq, int i, zzOQ zzoq2, int i2) {
        zzKA zzkaZzIc = zzKA.zzIc();
        zzKA zzkaZzIc2 = zzKA.zzIc();
        zzZZV zzzzv = new zzZZV(zzoq, i);
        zzZZV zzzzv2 = new zzZZV(zzoq2, i2);
        zzZ(zzzzv, zzzzv2, zzkaZzIc);
        zzZ(zzzzv, zzzzv2, zzkaZzIc, zzkaZzIc2);
        if (zzkaZzIc.getCount() == 0) {
            return zzD0.zzCH();
        }
        return new zzD0(true, zzkaZzIc.getCount(), zzkaZzIc2, zzkaZzIc);
    }

    private static void zzZ(zzZZV zzzzv, zzZZV zzzzv2, zzKA zzka, zzKA zzka2) {
        long j;
        long jZzrU = zzzzv.zzrU();
        long jZzrT = zzzzv.zzrT();
        long jZzrS = zzzzv.zzrS();
        long jZzrU2 = zzzzv2.zzrU();
        long jZzrT2 = zzzzv2.zzrT();
        long jZzrS2 = zzzzv2.zzrS();
        int i = 0;
        while (i < zzka.getCount()) {
            float f = zzka.get(i);
            long j2 = jZzrU;
            double[] dArrZzsi = new zz0L(-Float.intBitsToFloat((int) jZzrU), -Float.intBitsToFloat((int) jZzrT), (Float.intBitsToFloat((int) jZzrU2) * f * f) + (Float.intBitsToFloat((int) jZzrT2) * f) + Float.intBitsToFloat((int) jZzrS2) + (-Float.intBitsToFloat((int) jZzrS))).zzsi();
            int i2 = 0;
            while (true) {
                j = jZzrT;
                if (i2 < dArrZzsi.length) {
                    int i3 = i2;
                    float f2 = (float) dArrZzsi[i3];
                    if (f2 >= 0.0f && f2 <= 1.0f) {
                        zzka2.zzu(f2);
                        break;
                    } else {
                        i2 = i3 + 1;
                        jZzrT = j;
                    }
                }
            }
            i++;
            jZzrT = j;
            jZzrU = j2;
        }
    }

    private static void zzZ(zzZZV zzzzv, zzZZV zzzzv2, zzKA zzka) {
        long jZzrU = zzzzv.zzrU();
        long jZzrT = zzzzv.zzrT();
        long jZzrS = zzzzv.zzrS();
        long jZzrU2 = zzzzv2.zzrU();
        long jZzrT2 = zzzzv2.zzrT();
        long jZzrS2 = zzzzv2.zzrS();
        int i = (int) jZzrU;
        int i2 = (int) jZzrT;
        double dZzYC = (zzZPY.zzYC(jZzrT) * Float.intBitsToFloat(i)) - (zzZPY.zzYC(jZzrU) * Float.intBitsToFloat(i2));
        int i3 = (int) jZzrU2;
        double dZzYC2 = (zzZPY.zzYC(jZzrT) * Float.intBitsToFloat(i3)) - (zzZPY.zzYC(jZzrU2) * Float.intBitsToFloat(i2));
        int i4 = (int) jZzrT2;
        double dZzYC3 = (zzZPY.zzYC(jZzrT) * Float.intBitsToFloat(i4)) - (zzZPY.zzYC(jZzrT2) * Float.intBitsToFloat(i2));
        int i5 = (int) jZzrS;
        int i6 = (int) jZzrS2;
        double dIntBitsToFloat = ((Float.intBitsToFloat(i6) + (-Float.intBitsToFloat(i5))) * zzZPY.zzYC(jZzrT)) + ((zzZPY.zzYC(jZzrS) - zzZPY.zzYC(jZzrS2)) * Float.intBitsToFloat(i2));
        double dZzYC4 = (zzZPY.zzYC(jZzrU) * Float.intBitsToFloat(i3)) - (zzZPY.zzYC(jZzrU2) * Float.intBitsToFloat(i));
        double dZzYC5 = (zzZPY.zzYC(jZzrU) * Float.intBitsToFloat(i4)) - (zzZPY.zzYC(jZzrT2) * Float.intBitsToFloat(i));
        double dIntBitsToFloat2 = ((Float.intBitsToFloat(i6) + (-Float.intBitsToFloat(i5))) * zzZPY.zzYC(jZzrU)) + ((zzZPY.zzYC(jZzrS) - zzZPY.zzYC(jZzrS2)) * Float.intBitsToFloat(i));
        zzZ(zzzzv, zzzzv2, new zz0L((-dZzYC4) * dZzYC4, (-2.0d) * dZzYC4 * dZzYC5, C21825OoooOO0.OooO00o(dZzYC4, 2.0d, dIntBitsToFloat2, (dZzYC * dZzYC2) - (dZzYC5 * dZzYC5)), C21825OoooOO0.OooO00o(dZzYC5, 2.0d, dIntBitsToFloat2, dZzYC * dZzYC3), (dZzYC * dIntBitsToFloat) - (dIntBitsToFloat2 * dIntBitsToFloat2)).zzsi(), zzka);
    }

    private static void zzZ(zzZZV zzzzv, zzZZV zzzzv2, double[] dArr, zzKA zzka) {
        long j;
        int i;
        double[] dArr2 = dArr;
        long jZzrU = zzzzv.zzrU();
        long jZzrT = zzzzv.zzrT();
        long jZzrS = zzzzv.zzrS();
        long jZzrU2 = zzzzv2.zzrU();
        long jZzrT2 = zzzzv2.zzrT();
        long jZzrS2 = zzzzv2.zzrS();
        int i2 = 0;
        while (i2 < dArr2.length) {
            double d = dArr2[i2];
            if (d < 0.0d || d > 1.0d) {
                j = jZzrU;
                i = i2;
            } else {
                i = i2;
                j = jZzrU;
                double d2 = d * d;
                double[] dArrZzsi = new zz0L(-Float.intBitsToFloat((int) jZzrU), -Float.intBitsToFloat((int) jZzrT), (((double) Float.intBitsToFloat((int) jZzrU2)) * d2) + (((double) Float.intBitsToFloat((int) jZzrT2)) * d) + ((double) (Float.intBitsToFloat((int) jZzrS2) + (-Float.intBitsToFloat((int) jZzrS))))).zzsi();
                double[] dArrZzsi2 = new zz0L(-zzZPY.zzYC(j), -zzZPY.zzYC(jZzrT), (d2 * ((double) zzZPY.zzYC(jZzrU2))) + (((double) zzZPY.zzYC(jZzrT2)) * d) + ((double) (zzZPY.zzYC(jZzrS2) + (-zzZPY.zzYC(jZzrS))))).zzsi();
                if (dArrZzsi.length > 0 && dArrZzsi2.length > 0) {
                    int i3 = 0;
                    while (i3 < dArrZzsi.length) {
                        double[] dArr3 = dArrZzsi2;
                        if (!zzZ(dArrZzsi[i3], dArr3, zzka, d)) {
                            i3++;
                            dArrZzsi2 = dArr3;
                        }
                    }
                }
            }
            i2 = i + 1;
            dArr2 = dArr;
            jZzrU = j;
        }
    }

    private static boolean zzZ(double d, double[] dArr, zzKA zzka, double d2) {
        if (0.0d <= d && d <= 1.0d) {
            for (double d3 : dArr) {
                if (Math.abs(d - d3) < 1.0E-4d) {
                    zzka.zzu((float) d2);
                    return true;
                }
            }
        }
        return false;
    }

    private static zzCZ zzZ(long j, long j2, zzOQ zzoq, int i) {
        zzZZV zzzzv = new zzZZV(zzoq, i);
        boolean zZzY = zzAN.zzY(zzZPY.zzYC(j2), zzZPY.zzYC(j), 0.001f);
        return zzZ(j, j2, zzzzv, zzZ(j, j2, zzzzv, zZzY), zZzY);
    }

    private static double[] zzZ(long j, long j2, zzZZV zzzzv, boolean z) {
        if (z) {
            return new zz0L(zzZPY.zzYC(zzzzv.zzrU()), zzZPY.zzYC(zzzzv.zzrT()), zzZPY.zzYC(zzzzv.zzrS()) - zzZPY.zzYC(j)).zzsi();
        }
        float fIntBitsToFloat = (Float.intBitsToFloat((int) j2) - Float.intBitsToFloat((int) j)) / (zzZPY.zzYC(j2) - zzZPY.zzYC(j));
        return new zz0L((zzZPY.zzYC(zzzzv.zzrU()) * fIntBitsToFloat) - Float.intBitsToFloat((int) zzzzv.zzrU()), (zzZPY.zzYC(zzzzv.zzrT()) * fIntBitsToFloat) - Float.intBitsToFloat((int) zzzzv.zzrT()), (Float.intBitsToFloat(r0) + ((zzZPY.zzYC(zzzzv.zzrS()) * fIntBitsToFloat) - (zzZPY.zzYC(j) * fIntBitsToFloat))) - Float.intBitsToFloat((int) zzzzv.zzrS())).zzsi();
    }

    private static zzCZ zzZ(long j, long j2, zzZZV zzzzv, double[] dArr, boolean z) {
        if (dArr.length == 0) {
            return zzCZ.zzCD();
        }
        long[] jArr = new long[2];
        jArr[0] = 0;
        jArr[1] = 0;
        float[] fArr = new float[2];
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        for (double d : dArr) {
            float f = (float) d;
            if (f >= 0.0f && f <= 1.0f) {
                int i2 = i + 1;
                fArr[i] = f;
                float fZzZ = zzZ(f, j, j2, zzzzv, z);
                boolean z4 = fZzZ > 0.0f || fZzZ < 1.0f;
                if (i2 == 1) {
                    z2 = z4;
                } else {
                    z3 = z4;
                }
                jArr[i] = zzzzv.zzZS(f);
                i = i2;
            }
        }
        if (i == 0) {
            return zzCZ.zzCD();
        }
        return new zzCZ(true, z2, z3, i, jArr, fArr);
    }

    private static void zzZ(zzOQ zzoq, int i, zzOQ zzoq2, float f) {
        zzZ(zzoq, i, zzoq2, zzoq2.getCount(), f);
    }

    private static void zzZ(zzOQ zzoq, int i, zzOQ zzoq2, int i2, float f) {
        long jZzXT;
        long jZzYa;
        long jZzYd = zzoq.zzYd(i);
        if (zzh(f)) {
            long jZzXT2 = zzoq.zzXT(i);
            jZzXT = zzZ(new zzPG(jZzYd, jZzXT2), zzoq, i, f, zzJ6.zzO(jZzYd, jZzXT2), true);
            jZzYa = zzY(zzoq, i, f);
        } else {
            jZzXT = zzoq.zzXT(i);
            jZzYa = zzoq.zzYa(i);
        }
        zzoq2.zzZ(i2, jZzYd, jZzXT, jZzYa);
    }

    private static long zzZ(zzPG zzpg, zzOQ zzoq, int i, float f, float f2, boolean z) {
        long jZzYd = zzoq.zzYd(i);
        long jZzXT = zzoq.zzXT(i);
        long jZzYa = zzoq.zzYa(i);
        long[] jArr = {0};
        float f3 = (zzpg.zzOE() > 0.0f ? 1 : (zzpg.zzOE() == 0.0f ? 0 : -1)) != 0 || zzpg.zzOD() ? !(!z ? (zzZPY.zzYC(jZzYa) > zzZPY.zzYC(jZzXT) ? 1 : (zzZPY.zzYC(jZzYa) == zzZPY.zzYC(jZzXT) ? 0 : -1)) <= 0 : (zzZPY.zzYC(jZzXT) > zzZPY.zzYC(jZzYd) ? 1 : (zzZPY.zzYC(jZzXT) == zzZPY.zzYC(jZzYd) ? 0 : -1)) <= 0) : !(!z ? (Float.intBitsToFloat((int) jZzYa) > Float.intBitsToFloat((int) jZzXT) ? 1 : (Float.intBitsToFloat((int) jZzYa) == Float.intBitsToFloat((int) jZzXT) ? 0 : -1)) <= 0 : (Float.intBitsToFloat((int) jZzXT) > Float.intBitsToFloat((int) jZzYd) ? 1 : (Float.intBitsToFloat((int) jZzXT) == Float.intBitsToFloat((int) jZzYd) ? 0 : -1)) <= 0) ? 1.0f : -1.0f;
        if (!z) {
            jZzYd = jZzXT;
        }
        zzpg.zzZ(jZzYd, f3 * f * f2, jArr);
        return jArr[0];
    }

    private static float zzZ(float f, long j, long j2, zzZZV zzzzv, boolean z) {
        float fZzYC;
        float fZzYC2;
        float fZzYC3;
        if (z) {
            fZzYC = Float.intBitsToFloat((int) j2);
        } else {
            fZzYC = zzZPY.zzYC(j2);
        }
        if (z) {
            fZzYC2 = Float.intBitsToFloat((int) j);
        } else {
            fZzYC2 = zzZPY.zzYC(j);
        }
        long jZzZS = zzzzv.zzZS(f);
        if (z) {
            fZzYC3 = Float.intBitsToFloat((int) jZzZS);
        } else {
            fZzYC3 = zzZPY.zzYC(jZzZS) - fZzYC2;
        }
        return fZzYC3 / (fZzYC - fZzYC2);
    }
}
