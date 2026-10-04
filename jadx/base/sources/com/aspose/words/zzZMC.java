package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZMC {
    private static com.aspose.words.internal.zzP8 zzR(float f, float f2, float f3, float f4) {
        float f5 = (f3 + f4) / 2.0f;
        com.aspose.words.internal.zzP5 zzp5 = new com.aspose.words.internal.zzP5();
        zzp5.zzZ(new com.aspose.words.internal.zzQ5(com.aspose.words.internal.zzZQ4.zzX(f, f3, f2, f4), 0.0d, 360.0d));
        float f6 = f2 - 1.4f;
        zzp5.zzR(com.aspose.words.internal.zzZPY.zzG(f2, f5), com.aspose.words.internal.zzZPY.zzG(f6, f5));
        zzp5.zzZ(new com.aspose.words.internal.zzQ5(com.aspose.words.internal.zzZQ4.zzX(f + 1.4f, f3 + 1.4f, f6, f4 - 1.4f), 0.0d, -360.0d));
        zzp5.zze(true);
        com.aspose.words.internal.zzP8 zzp8 = new com.aspose.words.internal.zzP8(1);
        com.aspose.words.internal.zzZQG.zzZ(zzp8.zzO7(), zzp5);
        zzp8.zzY1(1);
        return zzp8;
    }

    private static com.aspose.words.internal.zzP8 zzS(float f, float f2, float f3, float f4) {
        float f5 = (f3 + f4) / 2.0f;
        com.aspose.words.internal.zzP5 zzp5 = new com.aspose.words.internal.zzP5();
        zzp5.zzZ(new com.aspose.words.internal.zzQ5(com.aspose.words.internal.zzZQ4.zzX(f, f3, f2, f4), 180.0d, 180.0d));
        float f6 = f2 - 0.7f;
        zzp5.zzR(com.aspose.words.internal.zzZPY.zzG(f2, f5), com.aspose.words.internal.zzZPY.zzG(f6, f5));
        zzp5.zzZ(new com.aspose.words.internal.zzQ5(com.aspose.words.internal.zzZQ4.zzX(f + 0.7f, f3 + 0.7f, f6, f4 - 0.7f), 0.0d, -180.0d));
        zzp5.zze(true);
        com.aspose.words.internal.zzP8 zzp8 = new com.aspose.words.internal.zzP8(1);
        com.aspose.words.internal.zzZQG.zzZ(zzp8.zzO7(), zzp5);
        zzp8.zzY1(1);
        return zzp8;
    }

    public static com.aspose.words.internal.zzZL zzV(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzPV zzpv) {
        float fZzkw = (zzzq4.zzkw() + zzzq4.zzZm()) / 2.0f;
        long jZzj = zzj(zzzq4.getWidth(), zzzq4.getHeight());
        float fZzZn = (zzzq4.zzZn() + zzzq4.zzZo()) / 2.0f;
        float fZzYz = fZzkw - (com.aspose.words.internal.zzZPW.zzYz(jZzj) / 2.0f);
        float fZzYz2 = com.aspose.words.internal.zzZPW.zzYz(jZzj) + fZzYz;
        int i = (int) jZzj;
        com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(new long[]{com.aspose.words.internal.zzZPY.zzG(fZzYz, fZzZn - (Float.intBitsToFloat(i) / 2.0f)), com.aspose.words.internal.zzZPY.zzG(fZzYz, (Float.intBitsToFloat(i) / 2.0f) + fZzZn), com.aspose.words.internal.zzZPY.zzG(fZzYz2, fZzZn)}, false, true);
        zzzgZzZ.zzY(new com.aspose.words.internal.zzOI(zzpv));
        return zzzgZzZ;
    }

    private static com.aspose.words.internal.zzZG zzW(float f, float f2, float f3, float f4, com.aspose.words.internal.zzPV zzpv) {
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG(zzS(f, f2, f3, f4));
        zzzg.zzY(new com.aspose.words.internal.zzOI(zzpv));
        zzzg.zzW(new com.aspose.words.internal.zzP9());
        zzzg.zzZO().zzZ(135.0f, com.aspose.words.internal.zzZPY.zzG((f + f2) / 2.0f, (f3 + f4) / 2.0f), 0);
        return zzzg;
    }

    private static com.aspose.words.internal.zzZG zzX(float f, float f2, float f3, float f4, com.aspose.words.internal.zzPV zzpv) {
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG(zzS(f, f2, f3, f4));
        zzzg.zzY(new com.aspose.words.internal.zzOI(zzpv));
        zzzg.zzW(new com.aspose.words.internal.zzP9());
        zzzg.zzZO().zzZ(-45.0f, com.aspose.words.internal.zzZPY.zzG((f + f2) / 2.0f, (f3 + f4) / 2.0f), 0);
        return zzzg;
    }

    private static com.aspose.words.internal.zzZG zzY(float f, float f2, float f3, float f4, com.aspose.words.internal.zzPV zzpv) {
        long jZzG = com.aspose.words.internal.zzZPY.zzG(f2, f4);
        long jZzG2 = com.aspose.words.internal.zzZPY.zzG(f2, f3);
        float f5 = f2 - 0.7f;
        long jZzG3 = com.aspose.words.internal.zzZPY.zzG(f5, f3);
        float f6 = f4 - 0.7f;
        com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(new long[]{jZzG, jZzG2, jZzG3, com.aspose.words.internal.zzZPY.zzG(f5, f6), com.aspose.words.internal.zzZPY.zzG(f, f6), com.aspose.words.internal.zzZPY.zzG(f, f4)}, false, true);
        zzzgZzZ.zzY(new com.aspose.words.internal.zzOI(zzpv));
        return zzzgZzZ;
    }

    public static com.aspose.words.internal.zzZL zzZ(com.aspose.words.internal.zzZQ4 zzzq4, float f, com.aspose.words.internal.zzPV zzpv) {
        return zzZ(zzzq4.zzZm(), zzzq4.zzkw(), zzzq4.zzZo(), zzzq4.zzZn(), f, zzpv);
    }

    private static com.aspose.words.internal.zzZL zzZi(com.aspose.words.internal.zzZQ4 zzzq4) {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzX(zzX(zzzq4.zzZm(), zzzq4.zzkw(), zzzq4.zzZo(), zzzq4.zzZn(), com.aspose.words.internal.zzPV.zzYR(com.aspose.words.internal.zzZQ2.zz2u)));
        zzg.zzX(zzX(zzzq4.zzZm() + 0.7f, zzzq4.zzkw() - 0.7f, zzzq4.zzZo() + 0.7f, zzzq4.zzZn() - 0.7f, com.aspose.words.internal.zzPV.zzYR(com.aspose.words.internal.zzZQ2.zz2t)));
        zzg.zzX(zzW(zzzq4.zzZm(), zzzq4.zzkw(), zzzq4.zzZo(), zzzq4.zzZn(), com.aspose.words.internal.zzPV.zzYR(com.aspose.words.internal.zzZQ2.zz2v)));
        zzg.zzX(zzW(zzzq4.zzZm() + 0.7f, zzzq4.zzkw() - 0.7f, zzzq4.zzZo() + 0.7f, zzzq4.zzZn() - 0.7f, com.aspose.words.internal.zzPV.zzYR(com.aspose.words.internal.zzZQ2.zz2w)));
        return zzg;
    }

    public static com.aspose.words.internal.zzZL zzZj(com.aspose.words.internal.zzZQ4 zzzq4) {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzX(zzZ(zzzq4.zzZm(), zzzq4.zzkw() - 0.7f, zzzq4.zzZo(), zzzq4.zzZn() - 0.7f, com.aspose.words.internal.zzPV.zzYR(com.aspose.words.internal.zzZQ2.zz2v)));
        zzg.zzX(zzZ(zzzq4.zzZm() + 0.7f, zzzq4.zzkw() - 1.4f, zzzq4.zzZo() + 0.7f, zzzq4.zzZn() - 1.4f, com.aspose.words.internal.zzPV.zzYR(com.aspose.words.internal.zzZQ2.zz2w)));
        zzg.zzX(zzY(zzzq4.zzZm() + 0.7f, zzzq4.zzkw() - 0.7f, zzzq4.zzZo() + 0.7f, zzzq4.zzZn() - 0.7f, com.aspose.words.internal.zzPV.zzYR(com.aspose.words.internal.zzZQ2.zz2u)));
        zzg.zzX(zzY(zzzq4.zzZm(), zzzq4.zzkw(), zzzq4.zzZo(), zzzq4.zzZn(), com.aspose.words.internal.zzPV.zzYR(com.aspose.words.internal.zzZQ2.zz2t)));
        return zzg;
    }

    public static com.aspose.words.internal.zzZL zzZk(com.aspose.words.internal.zzZQ4 zzzq4) {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzX(zzZ(zzzq4.zzZm(), zzzq4.zzkw() - 0.7f, zzzq4.zzZo(), zzzq4.zzZn() - 0.7f, com.aspose.words.internal.zzPV.zzYR(com.aspose.words.internal.zzZQ2.zz2t)));
        zzg.zzX(zzZ(zzzq4.zzZm() + 0.7f, zzzq4.zzkw() - 1.4f, zzzq4.zzZo() + 0.7f, zzzq4.zzZn() - 1.4f, com.aspose.words.internal.zzPV.zzYR(com.aspose.words.internal.zzZQ2.zz2u)));
        zzg.zzX(zzY(zzzq4.zzZm() + 0.7f, zzzq4.zzkw() - 0.7f, zzzq4.zzZo() + 0.7f, zzzq4.zzZn() - 0.7f, com.aspose.words.internal.zzPV.zzYR(com.aspose.words.internal.zzZQ2.zz2w)));
        zzg.zzX(zzY(zzzq4.zzZm(), zzzq4.zzkw(), zzzq4.zzZo(), zzzq4.zzZn(), com.aspose.words.internal.zzPV.zzYR(com.aspose.words.internal.zzZQ2.zz2v)));
        return zzg;
    }

    public static com.aspose.words.internal.zzZL zzZl(com.aspose.words.internal.zzZQ4 zzzq4) {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzX(zzZ(zzzq4.zzZm(), zzzq4.zzkw() - 0.7f, zzzq4.zzZo(), zzzq4.zzZn() - 0.7f, com.aspose.words.internal.zzPV.zzYR(com.aspose.words.internal.zzZQ2.zz2u)));
        zzg.zzX(zzZ(zzzq4.zzZm() + 0.7f, zzzq4.zzkw() - 1.4f, zzzq4.zzZo() + 0.7f, zzzq4.zzZn() - 1.4f, com.aspose.words.internal.zzPV.zzYR(com.aspose.words.internal.zzZQ2.zz2t)));
        zzg.zzX(zzY(zzzq4.zzZm() + 0.7f, zzzq4.zzkw() - 0.7f, zzzq4.zzZo() + 0.7f, zzzq4.zzZn() - 0.7f, com.aspose.words.internal.zzPV.zzYR(com.aspose.words.internal.zzZQ2.zz2w)));
        zzg.zzX(zzY(zzzq4.zzZm(), zzzq4.zzkw(), zzzq4.zzZo(), zzzq4.zzZn(), com.aspose.words.internal.zzPV.zzYR(com.aspose.words.internal.zzZQ2.zz2v)));
        return zzg;
    }

    public static com.aspose.words.internal.zzZL zzZm(com.aspose.words.internal.zzZQ4 zzzq4) {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzX(zzZ(zzzq4.zzZm(), zzzq4.zzkw() - 0.7f, zzzq4.zzZo(), zzzq4.zzZn() - 0.7f, com.aspose.words.internal.zzPV.zzYR(com.aspose.words.internal.zzZQ2.zz2w)));
        zzg.zzX(zzY(zzzq4.zzZm() + 0.7f, zzzq4.zzkw() - 0.7f, zzzq4.zzZo() + 0.7f, zzzq4.zzZn() - 0.7f, com.aspose.words.internal.zzPV.zzYR(com.aspose.words.internal.zzZQ2.zz2u)));
        zzg.zzX(zzY(zzzq4.zzZm(), zzzq4.zzkw(), zzzq4.zzZo(), zzzq4.zzZn(), com.aspose.words.internal.zzPV.zzYR(com.aspose.words.internal.zzZQ2.zz2t)));
        return zzg;
    }

    public static com.aspose.words.internal.zzZL zzZn(com.aspose.words.internal.zzZQ4 zzzq4) {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzX(zzZ(zzzq4.zzZm(), zzzq4.zzkw() - 0.7f, zzzq4.zzZo(), zzzq4.zzZn() - 0.7f, 0.7f, com.aspose.words.internal.zzPV.zzYR(com.aspose.words.internal.zzZQ2.zz2u)));
        float fZzZm = zzzq4.zzZm() + 0.7f;
        float fZzkw = zzzq4.zzkw() - 1.4f;
        float fZzZo = zzzq4.zzZo() + 0.7f;
        float fZzZn = zzzq4.zzZn() - 1.4f;
        int i = com.aspose.words.internal.zzZQ2.zz2v;
        zzg.zzX(zzZ(fZzZm, fZzkw, fZzZo, fZzZn, com.aspose.words.internal.zzPV.zzYR(i)));
        zzg.zzX(zzY(zzzq4.zzZm(), zzzq4.zzkw(), zzzq4.zzZo(), zzzq4.zzZn(), com.aspose.words.internal.zzPV.zzYR(i)));
        return zzg;
    }

    public static com.aspose.words.internal.zzZL zzZo(com.aspose.words.internal.zzZQ4 zzzq4) {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzX(zzZ(zzzq4.zzZm(), zzzq4.zzkw() - 0.7f, zzzq4.zzZo(), zzzq4.zzZn() - 0.7f, 0.7f, com.aspose.words.internal.zzPV.zzYR(com.aspose.words.internal.zzZQ2.zz2w)));
        float fZzZm = zzzq4.zzZm() + 0.7f;
        float fZzkw = zzzq4.zzkw() - 1.4f;
        float fZzZo = zzzq4.zzZo() + 0.7f;
        float fZzZn = zzzq4.zzZn() - 1.4f;
        int i = com.aspose.words.internal.zzZQ2.zz2t;
        zzg.zzX(zzZ(fZzZm, fZzkw, fZzZo, fZzZn, com.aspose.words.internal.zzPV.zzYR(i)));
        zzg.zzX(zzY(zzzq4.zzZm(), zzzq4.zzkw(), zzzq4.zzZo(), zzzq4.zzZn(), com.aspose.words.internal.zzPV.zzYR(i)));
        return zzg;
    }

    private static long zzj(float f, float f2) {
        float fMin = Math.min(f, f2);
        return com.aspose.words.internal.zzZPW.zzG(fMin / 2.0f, fMin / 4.0f);
    }

    private static com.aspose.words.internal.zzZG zzZ(float f, float f2, float f3, float f4, com.aspose.words.internal.zzPV zzpv) {
        long jZzG = com.aspose.words.internal.zzZPY.zzG(f, f3);
        long jZzG2 = com.aspose.words.internal.zzZPY.zzG(f2, f3);
        float f5 = f3 + 0.7f;
        float f6 = 0.7f + f;
        com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(new long[]{jZzG, jZzG2, com.aspose.words.internal.zzZPY.zzG(f2, f5), com.aspose.words.internal.zzZPY.zzG(f6, f5), com.aspose.words.internal.zzZPY.zzG(f6, f4), com.aspose.words.internal.zzZPY.zzG(f, f4)}, false, true);
        zzzgZzZ.zzY(new com.aspose.words.internal.zzOI(zzpv));
        return zzzgZzZ;
    }

    public static com.aspose.words.internal.zzZL zzW(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzPV zzpv) {
        long jZzj = zzj(zzzq4.getWidth(), zzzq4.getHeight());
        float fZzkw = (zzzq4.zzkw() + zzzq4.zzZm()) / 2.0f;
        float fZzZn = (zzzq4.zzZn() + zzzq4.zzZo()) / 2.0f;
        float fZzYz = fZzkw - (com.aspose.words.internal.zzZPW.zzYz(jZzj) / 2.0f);
        float fZzYz2 = com.aspose.words.internal.zzZPW.zzYz(jZzj) + fZzYz;
        int i = (int) jZzj;
        com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(new long[]{com.aspose.words.internal.zzZPY.zzG(fZzYz2, fZzZn - (Float.intBitsToFloat(i) / 2.0f)), com.aspose.words.internal.zzZPY.zzG(fZzYz2, (Float.intBitsToFloat(i) / 2.0f) + fZzZn), com.aspose.words.internal.zzZPY.zzG(fZzYz, fZzZn)}, false, true);
        zzzgZzZ.zzY(new com.aspose.words.internal.zzOI(zzpv));
        return zzzgZzZ;
    }

    public static com.aspose.words.internal.zzZL zzX(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzPV zzpv) {
        long jZzj = zzj(zzzq4.getHeight(), zzzq4.getWidth());
        float fZzkw = (zzzq4.zzkw() + zzzq4.zzZm()) / 2.0f;
        float fZzZn = ((zzzq4.zzZn() + zzzq4.zzZo()) / 2.0f) - (com.aspose.words.internal.zzZPW.zzYz(jZzj) / 2.0f);
        float fZzYz = com.aspose.words.internal.zzZPW.zzYz(jZzj) + fZzZn;
        int i = (int) jZzj;
        com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(new long[]{com.aspose.words.internal.zzZPY.zzG(fZzkw - (Float.intBitsToFloat(i) / 2.0f), fZzZn), com.aspose.words.internal.zzZPY.zzG((Float.intBitsToFloat(i) / 2.0f) + fZzkw, fZzZn), com.aspose.words.internal.zzZPY.zzG(fZzkw, fZzYz)}, false, true);
        zzzgZzZ.zzY(new com.aspose.words.internal.zzOI(zzpv));
        return zzzgZzZ;
    }

    public static com.aspose.words.internal.zzZL zzY(com.aspose.words.internal.zzZQ4 zzzq4, boolean z, byte b) {
        int i;
        int i2;
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        if (b != 0) {
            com.aspose.words.internal.zzZG zzzgZzW = com.aspose.words.internal.zzZG.zzW(zzzq4);
            if (b == 1) {
                i = com.aspose.words.internal.zzZQ2.zz2H;
            } else {
                i = com.aspose.words.internal.zzZQ2.zz2y;
            }
            zzzgZzW.zzY(new com.aspose.words.internal.zzOI(com.aspose.words.internal.zzPV.zzYR(i)));
            zzg.zzX(zzzgZzW);
            com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(new long[]{com.aspose.words.internal.zzZPY.zzG(zzzq4.getWidth() * 0.23f, zzzq4.getHeight() * 0.38f), com.aspose.words.internal.zzZPY.zzG(zzzq4.getWidth() * 0.42f, zzzq4.getHeight() * 0.58f), com.aspose.words.internal.zzZPY.zzG(zzzq4.getWidth() * 0.77f, zzzq4.getHeight() * 0.23f), com.aspose.words.internal.zzZPY.zzG(zzzq4.getWidth() * 0.77f, zzzq4.getHeight() * 0.46f), com.aspose.words.internal.zzZPY.zzG(zzzq4.getWidth() * 0.42f, zzzq4.getHeight() * 0.8f), com.aspose.words.internal.zzZPY.zzG(zzzq4.getWidth() * 0.23f, zzzq4.getHeight() * 0.62f)}, false, true);
            if (b == 1) {
                i2 = com.aspose.words.internal.zzZQ2.zz2x;
            } else {
                i2 = com.aspose.words.internal.zzZQ2.zz2u;
            }
            zzzgZzZ.zzY(new com.aspose.words.internal.zzOI(com.aspose.words.internal.zzPV.zzYR(i2)));
            zzzgZzZ.zzW(new com.aspose.words.internal.zzP9(1.0f, 0.0f, 0.0f, 1.0f, zzzq4.zzZm(), zzzq4.zzZo()));
            zzg.zzX(zzzgZzZ);
        }
        if (z) {
            zzg.zzX(zzZl(zzzq4));
            return zzg;
        }
        zzg.zzX(zzZ(zzzq4, 1.4f, com.aspose.words.internal.zzPV.zzYR(com.aspose.words.internal.zzZQ2.zz2t)));
        return zzg;
    }

    private static com.aspose.words.internal.zzZG zzZ(float f, float f2, float f3, float f4, float f5, com.aspose.words.internal.zzPV zzpv) {
        float f6 = f + f5;
        float f7 = f4 - f5;
        float f8 = f2 - f5;
        float f9 = f3 + f5;
        com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(new long[]{com.aspose.words.internal.zzZPY.zzG(f, f3), com.aspose.words.internal.zzZPY.zzG(f2, f3), com.aspose.words.internal.zzZPY.zzG(f2, f4), com.aspose.words.internal.zzZPY.zzG(f, f4), com.aspose.words.internal.zzZPY.zzG(f, f3), com.aspose.words.internal.zzZPY.zzG(f6, f3), com.aspose.words.internal.zzZPY.zzG(f6, f7), com.aspose.words.internal.zzZPY.zzG(f8, f7), com.aspose.words.internal.zzZPY.zzG(f8, f9), com.aspose.words.internal.zzZPY.zzG(f, f9)}, false, true);
        zzzgZzZ.zzZ0().zzY1(1);
        zzzgZzZ.zzY(new com.aspose.words.internal.zzOI(zzpv));
        return zzzgZzZ;
    }

    private static com.aspose.words.internal.zzZL zzZ(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzPV zzpv) {
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG(zzR(zzzq4.zzZm(), zzzq4.zzkw(), zzzq4.zzZo(), zzzq4.zzZn()));
        zzzg.zzY(new com.aspose.words.internal.zzOI(zzpv));
        return zzzg;
    }

    public static com.aspose.words.internal.zzZL zzZ(com.aspose.words.internal.zzZQ4 zzzq4, boolean z, byte b) {
        int i;
        int i2;
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        if (b != 0) {
            com.aspose.words.internal.zzZG zzzgZzW = com.aspose.words.internal.zzZG.zzW(zzzq4);
            if (b == 1) {
                i = com.aspose.words.internal.zzZQ2.zz2H;
            } else {
                i = com.aspose.words.internal.zzZQ2.zz2y;
            }
            zzzgZzW.zzY(new com.aspose.words.internal.zzOI(com.aspose.words.internal.zzPV.zzYR(i)));
            zzg.zzX(zzzgZzW);
            com.aspose.words.internal.zzP5 zzp5 = new com.aspose.words.internal.zzP5();
            zzp5.zzZ(new com.aspose.words.internal.zzQ5(new com.aspose.words.internal.zzZQ4(((zzzq4.getWidth() * 0.6f) / 2.0f) + zzzq4.getX(), ((zzzq4.getHeight() * 0.6f) / 2.0f) + zzzq4.getY(), zzzq4.getWidth() * 0.4f, zzzq4.getHeight() * 0.4f), 0.0d, 360.0d));
            zzp5.zze(true);
            com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG();
            com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), zzp5);
            if (b == 1) {
                i2 = com.aspose.words.internal.zzZQ2.zz2x;
            } else {
                i2 = com.aspose.words.internal.zzZQ2.zz2u;
            }
            zzzg.zzY(new com.aspose.words.internal.zzOI(com.aspose.words.internal.zzPV.zzYR(i2)));
            zzg.zzX(zzzg);
        }
        if (z) {
            zzg.zzX(zzZi(zzzq4));
            return zzg;
        }
        zzg.zzX(zzZ(zzzq4, com.aspose.words.internal.zzPV.zzYR(com.aspose.words.internal.zzZQ2.zz2t)));
        return zzg;
    }

    public static com.aspose.words.internal.zzZL zzY(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzPV zzpv) {
        long jZzj = zzj(zzzq4.getHeight(), zzzq4.getWidth());
        float fZzkw = (zzzq4.zzkw() + zzzq4.zzZm()) / 2.0f;
        float fZzZn = ((zzzq4.zzZn() + zzzq4.zzZo()) / 2.0f) - (com.aspose.words.internal.zzZPW.zzYz(jZzj) / 2.0f);
        float fZzYz = com.aspose.words.internal.zzZPW.zzYz(jZzj) + fZzZn;
        int i = (int) jZzj;
        com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(new long[]{com.aspose.words.internal.zzZPY.zzG(fZzkw - (Float.intBitsToFloat(i) / 2.0f), fZzYz), com.aspose.words.internal.zzZPY.zzG((Float.intBitsToFloat(i) / 2.0f) + fZzkw, fZzYz), com.aspose.words.internal.zzZPY.zzG(fZzkw, fZzZn)}, false, true);
        zzzgZzZ.zzY(new com.aspose.words.internal.zzOI(zzpv));
        return zzzgZzZ;
    }
}
