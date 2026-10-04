package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz1E {
    private static int zzW(double d, int i, int i2) {
        double d2 = ((double) i2) / 255.0d;
        int i3 = (int) (((((((double) i) / 255.0d) * d) - d2) / (1.0d - d2)) * 255.0d);
        return (i3 >= 0 || i3 <= i) ? i3 : i;
    }

    private static int zzXZ(int i, int i2) {
        double d = ((double) i) / 255.0d;
        return (int) ((((1.0d - d) * (((double) i2) / 255.0d)) + d) * 255.0d);
    }

    public static com.aspose.words.internal.zzG zzZ(com.aspose.words.internal.zzZG zzzg, double d, com.aspose.words.internal.zzPV zzpv) {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        float fZzYB = com.aspose.words.internal.zzSA.zzYB(1);
        int i = (int) (d / ((double) fZzYB));
        if (i == 0) {
            i++;
        }
        double d2 = 1.0d / ((double) i);
        float f = (float) d;
        int iZzW = zzW(d2, zzpv.zzPD(), 0);
        int iZzXZ = zzXZ(0, iZzW);
        for (int i2 = 0; i2 < i; i2++) {
            if (iZzW != 0) {
                com.aspose.words.internal.zzZG zzzgZzYZ = zzzg.zzYZ();
                zzzgZzYZ.zzY((com.aspose.words.internal.zzPY) null);
                if (zzzgZzYZ.zzZ2() == null) {
                    zzzgZzYZ.zzX(new com.aspose.words.internal.zzOU(new com.aspose.words.internal.zzPV(iZzW, zzpv), f));
                } else {
                    zzzgZzYZ.zzZ2().zzY(new com.aspose.words.internal.zzOI(new com.aspose.words.internal.zzPV(iZzW, zzpv)));
                    zzzgZzYZ.zzZ2().setWidth(f);
                    zzZ(zzzgZzYZ.zzZ2(), zzzg.zzZ2().getWidth() / f);
                }
                zzzgZzYZ.zzZ2().zzXW(2);
                zzg.zzX(zzzgZzYZ);
            }
            f -= fZzYB;
            iZzW = zzW(((double) (i2 + 2)) * d2, zzpv.zzPD(), iZzXZ);
            iZzXZ = zzXZ(iZzXZ, iZzW);
        }
        return zzg;
    }

    private static void zzZ(com.aspose.words.internal.zzOU zzou, float f) {
        if (zzou.zzNH() == null || zzou.zzNH().length == 0) {
            return;
        }
        float[] fArr = new float[zzou.zzNH().length];
        for (int i = 0; i < zzou.zzNH().length; i++) {
            fArr[i] = zzou.zzNH()[i] * f;
        }
        zzou.zzW(fArr);
        zzou.setDashStyle(5);
    }

    public static com.aspose.words.internal.zzG zzZ(com.aspose.words.internal.zzZG zzzg, double d, com.aspose.words.internal.zzPV zzpv, int i, boolean z, DocumentBase documentBase) throws Exception {
        if (com.aspose.words.internal.zzAN.zzZD(d)) {
            com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
            zzg.zzX(zzzg);
            return zzg;
        }
        double dZzZ = zzZ(zzzg, d, z);
        int iZzPD = zzpv.zzPD();
        if (dZzZ < d) {
            iZzPD = (int) ((dZzZ / d) * ((double) iZzPD));
            d = dZzZ;
        }
        com.aspose.words.internal.zzPV zzpv2 = new com.aspose.words.internal.zzPV(255, zzpv);
        com.aspose.words.internal.zzG zzgZzZ = zzZ(zzzg, d, zzpv2);
        if (zzzg.zzZ0().zzO9() && zzzg.zzZ1() != null && !zzzg.zzZ1().isEmpty()) {
            com.aspose.words.internal.zzZG zzzgZzYZ = zzzg.zzYZ();
            zzzgZzYZ.zzX(null);
            zzzgZzYZ.zzY(new com.aspose.words.internal.zzOI(zzpv2));
            zzgZzZ.zzX(zzzgZzYZ);
        }
        return iZzPD == 255 ? zzgZzZ : zzZ(zzgZzZ, iZzPD, i, documentBase);
    }

    private static double zzZ(com.aspose.words.internal.zzZG zzzg, double d, boolean z) throws Exception {
        com.aspose.words.internal.zzH zzh = new com.aspose.words.internal.zzH();
        com.aspose.words.internal.zzZG zzzg2 = (com.aspose.words.internal.zzZG) zzzg.zz1();
        zzzg2.zzX(null);
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzh.zzZ((com.aspose.words.internal.zzZL) zzzg2);
        long jZzB = com.aspose.words.internal.zzJ6.zzB(zzzq4ZzZ);
        float fMin = Math.min(zzzq4ZzZ.getWidth(), zzzq4ZzZ.getHeight());
        if (com.aspose.words.internal.zzAN.zzf(fMin)) {
            return d;
        }
        double d2 = fMin;
        if (d2 <= d) {
            d = 0.9d * d2;
        }
        float f = ((float) d) / 2.0f;
        float f2 = (z ? 1.0f : -1.0f) * f;
        float fMax = Math.max((f2 / (zzzq4ZzZ.getWidth() - f)) + 1.0f, (f2 / (zzzq4ZzZ.getHeight() - f)) + 1.0f);
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        int i = (int) jZzB;
        zzp9.zzY(-Float.intBitsToFloat(i), -com.aspose.words.internal.zzZPY.zzYC(jZzB), 1);
        zzp9.zzZ(fMax, fMax, 1);
        zzp9.zzY(Float.intBitsToFloat(i), com.aspose.words.internal.zzZPY.zzYC(jZzB), 1);
        if (zzzg.zzZO() == null) {
            zzzg.zzW(zzp9);
            return d;
        }
        zzzg.zzZO().zzZ(zzp9, 1);
        return d;
    }

    public static com.aspose.words.internal.zzG zzZ(com.aspose.words.internal.zzG zzg, int i, int i2, DocumentBase documentBase) throws Exception {
        float f = (float) (1.0d / ((double) i2));
        if (zzg.zzZO() == null) {
            com.aspose.words.internal.OooO0O0.OooO00o(zzg);
        }
        zzg.zzZO().zzZ(f, f, 1);
        return zzZ(zzg, i, 1.0f / f, documentBase);
    }

    private static com.aspose.words.internal.zzG zzZ(com.aspose.words.internal.zzG zzg, int i, float f, DocumentBase documentBase) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = new com.aspose.words.internal.zzH().zzZ((com.aspose.words.internal.zzZL) zzg);
        byte[] bArrZzZ = zzZ(zzzq4ZzZ, zzg, i, documentBase);
        if (bArrZzZ == null) {
            return new com.aspose.words.internal.zzG();
        }
        com.aspose.words.internal.zzEG zzegZzZT = com.aspose.words.internal.zzEF.zzZT(bArrZzZ);
        long jZzG = com.aspose.words.internal.zzZPW.zzG((float) zzegZzZT.getWidthPoints(), (float) zzegZzZT.getHeightPoints());
        int i2 = (int) jZzG;
        float x = (zzzq4ZzZ.getX() - ((Float.intBitsToFloat(i2) - zzzq4ZzZ.getWidth()) / 2.0f)) * f;
        float y = (zzzq4ZzZ.getY() - ((com.aspose.words.internal.zzZPW.zzYz(jZzG) - zzzq4ZzZ.getHeight()) / 2.0f)) * f;
        long jZzG2 = com.aspose.words.internal.zzZPW.zzG(Float.intBitsToFloat(i2) * f, com.aspose.words.internal.zzZPW.zzYz(jZzG) * f);
        com.aspose.words.internal.zzG zzg2 = new com.aspose.words.internal.zzG();
        zzg2.zzX(new com.aspose.words.internal.zzZP(com.aspose.words.internal.zzZPY.zzG(x, y), jZzG2, bArrZzZ));
        return zzg2;
    }

    private static byte[] zzZ(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzG zzg, int i, DocumentBase documentBase) throws Exception {
        int iZzZG = com.aspose.words.internal.zzAN.zzZG(com.aspose.words.internal.zzSA.pointToPixel(zzzq4.getWidth()));
        int iZzZG2 = com.aspose.words.internal.zzAN.zzZG(com.aspose.words.internal.zzSA.pointToPixel(zzzq4.getHeight()));
        if (iZzZG == 0 || iZzZG2 == 0) {
            return null;
        }
        if (zzg.zzZO() == null) {
            com.aspose.words.internal.OooO0O0.OooO00o(zzg);
        }
        zzg.zzZO().zzY(-zzzq4.getX(), -zzzq4.getY(), 1);
        com.aspose.words.internal.zzXN zzxn = new com.aspose.words.internal.zzXN(iZzZG, iZzZG2);
        try {
            com.aspose.words.internal.zzIY zziy = new com.aspose.words.internal.zzIY(zzxn);
            try {
                new com.aspose.words.internal.zzJ8(documentBase.zzZqx().zzZo7()).zzZ(zzg, zziy);
                zziy.dispose();
                com.aspose.words.internal.zzEI zzei = new com.aspose.words.internal.zzEI(zzxn);
                try {
                    zzei.zzDT().zzZ(com.aspose.words.internal.zzPN.zzY8(i));
                    zzei.zzDU();
                    return zzei.getImageBytes();
                } finally {
                    zzei.dispose();
                }
            } catch (Throwable th) {
                zziy.dispose();
                throw th;
            }
        } finally {
            zzxn.dispose();
        }
    }
}
