package com.aspose.words;

import com.aspose.slides.o000oOoO;
import com.aspose.words.ref.RefDouble;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzY7M {
    private static com.aspose.words.internal.zzZNR zzX7U = new com.aspose.words.internal.zzZNR("(M|m|Z|z|L|l|H|h|V|v|C|c|S|s|Q|q|T|t|A|a)([^MmZzLlHhVvCcSsQqTtAa]+)?");
    private com.aspose.words.internal.zzP5 zzSo;
    private com.aspose.words.internal.zzP8 zzSq;
    private long zzX7W = 0;
    private long zzX7V = 0;
    private long zzqz = 0;
    private long zzX7T = 0;

    public zzY7M(com.aspose.words.internal.zzP8 zzp8) {
        this.zzSq = zzp8;
    }

    private void zzL(long j, long j2, long j3, long j4) {
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzPZ>) this.zzSo.zzNY(), new com.aspose.words.internal.zzPZ(j, j2, j3, j4));
        this.zzqz = j4;
        this.zzX7W = j3;
    }

    private void zzO(com.aspose.words.internal.zzP5 zzp5) throws Exception {
        if (zzp5 == null) {
            return;
        }
        if (this.zzSq.getCount() == 0) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzSq.zzO7(), zzp5);
        } else {
            if (com.aspose.words.internal.zzZPW.zzYF(com.aspose.words.internal.zzP6.zzV(zzp5).getSize())) {
                return;
            }
            com.aspose.words.internal.zzZQG.zzZ(this.zzSq.zzO7(), zzp5);
        }
    }

    private void zzPO(boolean z) {
        com.aspose.words.internal.zzOS zzos;
        if (!z || this.zzSo.getCount() <= 0 || (zzos = (com.aspose.words.internal.zzOS) com.aspose.words.internal.zzZKW.zzZ(this.zzSo.zzNY().get(0), com.aspose.words.internal.zzOS.class)) == null || zzos.zzNu().getCount() > 1) {
            return;
        }
        this.zzSo.zzNY().clear();
    }

    private void zzQ(long j, long j2, long j3) {
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzPZ>) this.zzSo.zzNY(), new com.aspose.words.internal.zzPZ(j, j2, j3));
        this.zzqz = j3;
        this.zzX7V = j2;
    }

    private void zzT(float[] fArr, boolean z) {
        double d;
        float[] fArr2 = fArr;
        int i = 0;
        while (i < fArr2.length) {
            double dIntBitsToFloat = Float.intBitsToFloat((int) this.zzqz);
            double dZzYC = com.aspose.words.internal.zzZPY.zzYC(this.zzqz);
            double dPixelToPoint = ConvertUtil.pixelToPoint(fArr2[i]);
            double dPixelToPoint2 = ConvertUtil.pixelToPoint(fArr2[i + 1]);
            double d2 = fArr2[i + 2];
            boolean zZzP = com.aspose.words.internal.zzAN.zzP(fArr2[i + 3], 1.0f);
            boolean zZzP2 = com.aspose.words.internal.zzAN.zzP(fArr2[i + 4], 1.0f);
            double dPixelToPoint3 = ConvertUtil.pixelToPoint(fArr2[i + 5]);
            int i2 = i;
            double dPixelToPoint4 = ConvertUtil.pixelToPoint(fArr2[i + 6]);
            if (z) {
                d = dPixelToPoint4;
            } else {
                d = dPixelToPoint4;
                dPixelToPoint3 += (double) Float.intBitsToFloat((int) this.zzqz);
            }
            double dZzYC2 = z ? d : ((double) com.aspose.words.internal.zzZPY.zzYC(this.zzqz)) + d;
            if (com.aspose.words.internal.zzAN.zzZD(dPixelToPoint) || com.aspose.words.internal.zzAN.zzZD(dPixelToPoint2)) {
                return;
            }
            RefDouble refDouble = new RefDouble(0.0d);
            RefDouble refDouble2 = new RefDouble(0.0d);
            RefDouble refDouble3 = new RefDouble(0.0d);
            RefDouble refDouble4 = new RefDouble(0.0d);
            RefDouble refDouble5 = new RefDouble(0.0d);
            RefDouble refDouble6 = new RefDouble(0.0d);
            zzZ(dIntBitsToFloat, dPixelToPoint3, dZzYC, dZzYC2, dPixelToPoint, dPixelToPoint2, d2, zZzP, zZzP2, refDouble, refDouble2, refDouble3, refDouble4, refDouble5, refDouble6);
            zzY(zzZ(d2, zZzP2, refDouble3.get(), refDouble4.get(), refDouble5.get(), refDouble6.get(), refDouble.get(), refDouble2.get()).zzIb(), true);
            i = i2 + 7;
            fArr2 = fArr;
        }
    }

    private void zzU(float[] fArr, boolean z) {
        if (!z) {
            fArr = zzZ(fArr, this.zzqz, 4);
        }
        for (int i = 0; i < fArr.length; i += 4) {
            zzQ(this.zzqz, com.aspose.words.internal.zzZPY.zzG(fArr[i], fArr[i + 1]), com.aspose.words.internal.zzZPY.zzG(fArr[i + 2], fArr[i + 3]));
        }
    }

    private void zzV(float[] fArr, boolean z) {
        if (!z) {
            fArr = zzZ(fArr, this.zzqz, 2);
        }
        for (int i = 0; i < fArr.length; i += 2) {
            long j = this.zzqz;
            zzQ(j, zzt(this.zzX7V, j), com.aspose.words.internal.zzZPY.zzG(fArr[i], fArr[i + 1]));
        }
    }

    private static float[] zzW(float[] fArr, int i) {
        if ((fArr.length > 0 && fArr.length % i == 0) || fArr.length <= i) {
            return fArr;
        }
        int length = (fArr.length / i) * i;
        float[] fArr2 = new float[length];
        System.arraycopy(fArr, 0, fArr2, 0, length);
        return fArr2;
    }

    private void zzX(float[] fArr, boolean z) {
        if (!z) {
            fArr = zzZ(fArr, this.zzqz, 4);
        }
        for (int i = 0; i < fArr.length; i += 4) {
            long j = this.zzqz;
            zzL(j, zzt(this.zzX7W, j), com.aspose.words.internal.zzZPY.zzG(fArr[i], fArr[i + 1]), com.aspose.words.internal.zzZPY.zzG(fArr[i + 2], fArr[i + 3]));
        }
    }

    private void zzXM(char c) {
        if (c != 'c') {
            if (c != 'q') {
                if (c != 's') {
                    if (c != 't') {
                        this.zzX7W = 0L;
                        this.zzX7V = 0L;
                        return;
                    }
                }
            }
            this.zzX7W = 0L;
            return;
        }
        this.zzX7V = 0L;
    }

    private static boolean zzY(char c, float[] fArr) {
        if (fArr == null) {
            return false;
        }
        if (c == 'a') {
            return fArr.length > 0 && fArr.length % 7 == 0;
        }
        if (c == 'c') {
            return fArr.length > 0 && fArr.length % 6 == 0;
        }
        if (c != 'h') {
            if (c != 'q') {
                if (c != 'v') {
                    if (c != 'l') {
                        if (c == 'm') {
                            return fArr.length >= 2;
                        }
                        if (c != 's') {
                            if (c != 't') {
                                return true;
                            }
                        }
                    }
                    return fArr.length > 0 && fArr.length % 2 == 0;
                }
            }
            return fArr.length > 0 && fArr.length % 4 == 0;
        }
        return fArr.length > 0;
    }

    private static long zzt(long j, long j2) {
        return com.aspose.words.internal.zzZPY.zzYF(j) ? j2 : com.aspose.words.internal.zzZPY.zzG((Float.intBitsToFloat((int) j2) * 2.0f) - Float.intBitsToFloat((int) j), (com.aspose.words.internal.zzZPY.zzYC(j2) * 2.0f) - com.aspose.words.internal.zzZPY.zzYC(j));
    }

    public final void zzZ(String str, zzY7J zzy7j) throws Exception {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            while (true) {
                boolean z = false;
                for (com.aspose.words.internal.zzZNT zzznt : zzX7U.zzUW(str)) {
                    char cCharAt = zzznt.zzhJ().zzQx(1).getValue().charAt(0);
                    char cZzo = com.aspose.words.internal.zzZYD.zzo(cCharAt);
                    boolean z2 = cZzo != cCharAt;
                    if (this.zzSo == null) {
                        this.zzSo = new com.aspose.words.internal.zzP5();
                    }
                    String strOooO00o = OooO0O0.OooO00o(zzznt, 2);
                    float[] fArrZzAy = cZzo == 'a' ? zzY80.zzAy(strOooO00o) : zzY80.zzZZ(strOooO00o, true);
                    zzXM(cZzo);
                    if (fArrZzAy != null) {
                        fArrZzAy = zzZ(cZzo, fArrZzAy);
                    }
                    if (zzY(cZzo, fArrZzAy)) {
                        if (cZzo == 'a') {
                            zzT(fArrZzAy, z2);
                        } else if (cZzo == 'c') {
                            zzW(fArrZzAy, z2);
                        } else if (cZzo == 'h') {
                            zzY(zzZ(fArrZzAy, z2, false), z2);
                        } else if (cZzo == 'q') {
                            zzU(fArrZzAy, z2);
                        } else if (cZzo == 'v') {
                            zzY(zzZ(fArrZzAy, z2, true), z2);
                        } else if (cZzo == 'z') {
                            this.zzqz = this.zzX7T;
                            this.zzSo.zze(true);
                            zzO(this.zzSo);
                            this.zzSo = null;
                        } else if (cZzo == 'l') {
                            zzY(fArrZzAy, z2);
                        } else if (cZzo == 'm') {
                            zzZ(z2, fArrZzAy, z);
                        } else if (cZzo == 's') {
                            zzX(fArrZzAy, z2);
                        } else if (cZzo != 't') {
                            zzy7j.zzT(16777216, com.aspose.words.internal.zzZKN.format("Path command '{0}' is unsupported and has been ignored.", Character.valueOf(cCharAt)));
                        } else {
                            zzV(fArrZzAy, z2);
                        }
                        if (cZzo == 'm') {
                            z = true;
                        }
                    } else {
                        zzy7j.zzT(16777216, com.aspose.words.internal.zzZKN.format("Path command '{0}' has incorrect number of parameters and has been ignored.", Character.valueOf(cCharAt)));
                    }
                }
                zzO(this.zzSo);
                return;
            }
        }
    }

    private void zzW(float[] fArr, boolean z) {
        if (!z) {
            fArr = zzZ(fArr, this.zzqz, 6);
        }
        for (int i = 0; i < fArr.length; i += 6) {
            zzL(this.zzqz, com.aspose.words.internal.zzZPY.zzG(fArr[i], fArr[i + 1]), com.aspose.words.internal.zzZPY.zzG(fArr[i + 2], fArr[i + 3]), com.aspose.words.internal.zzZPY.zzG(fArr[i + 4], fArr[i + 5]));
        }
    }

    private void zzY(float[] fArr, boolean z) {
        if (!z) {
            fArr = zzZ(fArr, this.zzqz, 2);
        }
        com.aspose.words.internal.zzOS zzos = new com.aspose.words.internal.zzOS();
        if (this.zzSo.getCount() == 0 || !com.aspose.words.internal.zzJ6.zzN(this.zzSo.zzPQ(), this.zzqz)) {
            zzos.zzNu().add(this.zzqz);
        }
        zzZ(zzos, fArr);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzOS>) this.zzSo.zzNY(), zzos);
        this.zzqz = com.aspose.words.internal.zzZPY.zzG(fArr[fArr.length - 2], fArr[fArr.length - 1]);
    }

    private static float[] zzZ(char c, float[] fArr) {
        if (c == 'a') {
            return zzW(fArr, 7);
        }
        if (c != 'c') {
            if (c != 'h') {
                if (c != 'q') {
                    if (c != 'v') {
                        if (c != 'l') {
                            if (c == 'm') {
                                if (fArr.length >= 2) {
                                    return fArr;
                                }
                                return null;
                            }
                            if (c != 's') {
                                if (c != 't') {
                                    return fArr;
                                }
                            }
                        }
                        return zzW(fArr, 2);
                    }
                }
                return zzW(fArr, 4);
            }
            if (fArr.length > 0) {
                return fArr;
            }
            return null;
        }
        return zzW(fArr, 6);
    }

    private void zzZ(boolean z, float[] fArr, boolean z2) throws Exception {
        zzPO(z2);
        zzZ(new float[]{fArr[0], fArr[1]}, z);
        this.zzX7T = this.zzqz;
        int length = fArr.length - 2;
        if (length > 0) {
            float[] fArr2 = new float[length];
            com.aspose.words.internal.zzZKV.zzZ(fArr, 2, fArr2, 0, length);
            zzY(fArr2, z);
        }
    }

    private void zzZ(float[] fArr, boolean z) throws Exception {
        if (this.zzSo.getCount() > 0) {
            zzO(this.zzSo);
        }
        this.zzSo = new com.aspose.words.internal.zzP5();
        if (!z) {
            fArr = zzZ(fArr, this.zzqz, 2);
        }
        this.zzqz = com.aspose.words.internal.zzZPY.zzG(fArr[0], fArr[1]);
    }

    private static void zzZ(com.aspose.words.internal.zzOS zzos, float[] fArr) {
        int length = fArr.length / 2;
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            zzos.zzNu().add(com.aspose.words.internal.zzZPY.zzG(fArr[i2], fArr[i2 + 1]));
        }
    }

    private static void zzZ(double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2, RefDouble refDouble, RefDouble refDouble2, RefDouble refDouble3, RefDouble refDouble4, RefDouble refDouble5, RefDouble refDouble6) {
        double dZzZL = com.aspose.words.internal.zzAN.zzZL(d7);
        double d8 = (d - d2) / 2.0d;
        double dCos = (Math.cos(dZzZL) * d8) + (Math.sin(dZzZL) * ((d3 - d4) / 2.0d));
        double d9 = (-Math.sin(dZzZL)) * d8;
        int length = String.length();
        refDouble5.set(Math.abs(d5));
        refDouble6.set(Math.abs(d6));
        double d10 = refDouble5.get() * refDouble5.get();
        double d11 = refDouble6.get() * refDouble6.get();
        double d12 = dCos * dCos;
        double d13 = length * length;
        double d14 = (d13 / d11) + (d12 / d10);
        if (d14 > 1.0d) {
            refDouble5.set(refDouble5.get() * Math.sqrt(d14));
            refDouble6.set(refDouble6.get() * Math.sqrt(d14));
            d10 = refDouble5.get() * refDouble5.get();
            d11 = refDouble6.get() * refDouble6.get();
        }
        double d15 = z == z2 ? -1.0d : 1.0d;
        double d16 = d10 * d11;
        double d17 = d10 * d13;
        double d18 = d11 * d12;
        double d19 = ((d16 - d17) - d18) / (d17 + d18);
        if (d19 < 0.0d || Double.isNaN(d19) || Double.isInfinite(d19)) {
            d19 = 0.0d;
        }
        double dSqrt = Math.sqrt(d19) * d15;
        double d20 = ((refDouble5.get() * length) / refDouble6.get()) * dSqrt;
        double d21 = dSqrt * (-((refDouble6.get() * dCos) / refDouble5.get()));
        refDouble.set(((Math.cos(dZzZL) * d20) - (Math.sin(dZzZL) * d21)) + ((d + d2) / 2.0d));
        refDouble2.set((Math.cos(dZzZL) * d21) + (Math.sin(dZzZL) * d20) + ((d3 + d4) / 2.0d));
        double d22 = (dCos - d20) / refDouble5.get();
        double d23 = (length - d21) / refDouble6.get();
        double d24 = ((-dCos) - d20) / refDouble5.get();
        double d25 = ((-length) - d21) / refDouble6.get();
        double d26 = (d23 * d23) + (d22 * d22);
        double dSqrt2 = Math.sqrt(d26);
        refDouble3.set(dSqrt2 > 0.0d ? Math.acos(d22 / dSqrt2) * (d23 < 0.0d ? -1.0d : 1.0d) : 0.0d);
        refDouble3.set(com.aspose.words.internal.zzAN.zzZK(refDouble3.get()));
        double dSqrt3 = Math.sqrt(androidx.core.graphics.OooO00o.OooO00o(d25, d25, d24 * d24, d26));
        refDouble4.set(dSqrt3 > 0.0d ? Math.acos(((d23 * d25) + (d22 * d24)) / dSqrt3) * ((d22 * d25) - (d23 * d24) < 0.0d ? -1.0d : 1.0d) : 0.0d);
        refDouble4.set(com.aspose.words.internal.zzAN.zzZK(refDouble4.get()));
        if (!z2 && refDouble4.get() > 0.0d) {
            refDouble4.set(refDouble4.get() - 360.0d);
        } else if (z2 && refDouble4.get() < 0.0d) {
            refDouble4.set(refDouble4.get() + 360.0d);
        }
        refDouble4.set(refDouble4.get() % 360.0d);
        refDouble3.set(refDouble3.get() % 360.0d);
    }

    private static com.aspose.words.internal.zzKA zzZ(double d, boolean z, double d2, double d3, double d4, double d5, double d6, double d7) {
        double dZzZL = com.aspose.words.internal.zzAN.zzZL(-d);
        double dCos = Math.cos(dZzZL);
        double dSin = Math.sin(dZzZL);
        com.aspose.words.internal.zzKA zzka = new com.aspose.words.internal.zzKA();
        double d8 = z ? d2 : d2 + d3;
        double d9 = z ? d2 + d3 : d2;
        for (double d10 = d8; d10 < d9; d10 += 1.0d) {
            zzZ(z, d4, d5, d6, d7, d10, dCos, dSin, zzka);
        }
        zzZ(z, d4, d5, d6, d7, d9, dCos, dSin, zzka);
        return zzka;
    }

    private static void zzZ(boolean z, double d, double d2, double d3, double d4, double d5, double d6, double d7, com.aspose.words.internal.zzKA zzka) {
        double dZzZL = com.aspose.words.internal.zzAN.zzZL(d5);
        double dCos = Math.cos(dZzZL) * d;
        double dSin = Math.sin(dZzZL) * d2;
        double dOooO00o = o000oOoO.OooO00o(d7, dSin, d6 * dCos, d3);
        double dOooO00o2 = o000oOoO.OooO00o(d6, dSin, (-d7) * dCos, d4);
        if (z) {
            zzka.zzu((float) dOooO00o);
            zzka.zzu((float) dOooO00o2);
        } else {
            zzka.zzY(0, (float) dOooO00o2);
            zzka.zzY(0, (float) dOooO00o);
        }
    }

    private static float[] zzZ(float[] fArr, long j, int i) {
        int length = fArr.length;
        float[] fArr2 = new float[length];
        float fIntBitsToFloat = Float.intBitsToFloat((int) j);
        float fZzYC = com.aspose.words.internal.zzZPY.zzYC(j);
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 % i == 0) {
                j = com.aspose.words.internal.zzZPY.zzG(fIntBitsToFloat, fZzYC);
            }
            if (i2 % 2 == 0) {
                fIntBitsToFloat = Float.intBitsToFloat((int) j) + fArr[i2];
                fArr2[i2] = fIntBitsToFloat;
            } else {
                fZzYC = com.aspose.words.internal.zzZPY.zzYC(j) + fArr[i2];
                fArr2[i2] = fZzYC;
            }
        }
        return fArr2;
    }

    private float[] zzZ(float[] fArr, boolean z, boolean z2) {
        float fZzYC;
        int length = fArr.length * 2;
        float[] fArr2 = new float[length];
        for (int i = 0; i < length; i++) {
            if (z2) {
                fZzYC = z ? Float.intBitsToFloat((int) this.zzqz) : 0.0f;
                if (i % 2 != 0) {
                    fZzYC = fArr[i / 2];
                }
                fArr2[i] = fZzYC;
            } else {
                fZzYC = z ? com.aspose.words.internal.zzZPY.zzYC(this.zzqz) : 0.0f;
                if (i % 2 == 0) {
                    fZzYC = fArr[i / 2];
                }
                fArr2[i] = fZzYC;
            }
        }
        return fArr2;
    }
}
