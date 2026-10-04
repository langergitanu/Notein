package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzEN {
    private static zzEO zzY(boolean z, boolean z2, int i, ChartDataPoint chartDataPoint, float f, double d, zzDI zzdi) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzZ(chartDataPoint.zzaQ().getOutline(), f);
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        if (z) {
            com.aspose.words.internal.zzZG zzzgZzZ = zzZ(chartDataPoint.zzaQ().getOutline(), chartDataPoint.zz3I(), zzzq4ZzZ, d, zzdi.zzZIC().zzZMG(), i);
            if (!zzDG.zzz(zzzgZzZ)) {
                z = false;
            }
            zzg.zzX(zzzgZzZ);
        }
        if (z2) {
            float height = zzzq4ZzZ.getHeight() / 2.0f;
            com.aspose.words.internal.zzZG zzzgZzZ2 = zzZ(z ? com.aspose.words.internal.zzZPY.zzG(zzzq4ZzZ.getWidth() / 2.0f, height) : com.aspose.words.internal.zzZPY.zzG(height, height), chartDataPoint, i, d, zzdi);
            if (zzzgZzZ2 != null) {
                zzg.zzX(zzzgZzZ2);
            }
        }
        return new zzEO(zzg, z ? zzzq4ZzZ.getWidth() : zzzq4ZzZ.getHeight(), zzzq4ZzZ.getHeight(), 1);
    }

    private static double zzYn(double d) {
        return Math.max(1.0d, (d * 0.5d) - 1.0d);
    }

    public static zzEO zzZ(zzGK zzgk, int i, ChartDataPoint chartDataPoint, float f, double d, zzDI zzdi) throws Exception {
        int iZzZQO = zzgk.zzZQO();
        if (iZzZQO == 2) {
            return zzZ(true, ((Boolean) zzgk.zzZPg().zzLv(24)).booleanValue(), i, chartDataPoint, f, d, zzdi);
        }
        if (iZzZQO == 3) {
            return zzZ(i, chartDataPoint, f, d, zzdi);
        }
        if (iZzZQO == 4) {
            return zzY(i, chartDataPoint, f, d, zzdi);
        }
        if (iZzZQO == 5) {
            int iIntValue = ((Integer) zzgk.zzZPg().zzLv(32)).intValue();
            return iIntValue == 0 ? zzZ(i, chartDataPoint, f, d, zzdi) : zzZ(true, iIntValue == 1, i, chartDataPoint, f, d, zzdi);
        }
        if (iZzZQO != 6) {
            return iZzZQO != 15 ? zzZ(i, chartDataPoint, f, d, zzdi) : zzZ(i, ((Boolean) zzgk.zzZPg().zzLv(18)).booleanValue(), chartDataPoint, f, d, zzdi);
        }
        zz2U zz2u = (zz2U) zzgk;
        return zzZ(zz2u.zzZvH(), zz2u.zzZyL(), i, chartDataPoint, f, d, zzdi);
    }

    private static com.aspose.words.internal.zzZQ4 zzZi(float f) {
        return new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, f, f);
    }

    public static zzEO zzY(int i, ChartDataPoint chartDataPoint, float f, double d, zzDI zzdi) throws Exception {
        return zzY(true, true, i, chartDataPoint, f, d, zzdi);
    }

    public static float zzY(zzCL zzcl, zzDI zzdi) throws Exception {
        return zzDG.zzS(zzcl, zzdi) * (zzDG.zzT(zzcl, zzdi).zzOZ() ? 0.35f : 0.45f);
    }

    public static zzEO zzZ(int i, ChartDataPoint chartDataPoint, float f, double d, zzDI zzdi) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZi = zzZi(f);
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        com.aspose.words.internal.zzZG zzzgZzW = com.aspose.words.internal.zzZG.zzW(zzzq4ZzZi);
        zzD9 zzd9ZzaQ = chartDataPoint.zzaQ();
        zzF2 zzf2ZzZMK = zzdi.zzZIC().zzZMK();
        zz4G zz4gZzZ = zzZ(zzd9ZzaQ.getOutline(), zzf2ZzZMK, i, d);
        if (zz4gZzZ != chartDataPoint.zzaQ().getOutline()) {
            zzd9ZzaQ = chartDataPoint.zzaQ().zzZI4();
            zzd9ZzaQ.setOutline(zz4gZzZ);
        }
        zzDG.zzZ(zzzgZzW, zzd9ZzaQ, (zzE3) null, zzf2ZzZMK, i);
        zzg.zzX(zzzgZzW);
        return new zzEO(zzg, zzzq4ZzZi.getWidth(), zzzq4ZzZi.getHeight(), 0);
    }

    public static zzEO zzZ(int i, boolean z, ChartDataPoint chartDataPoint, float f, double d, zzDI zzdi) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZi = zzZi(f);
        zz4G zz4gZzZ = zzZ(chartDataPoint.zzaQ().getOutline(), zzdi.zzZIC().zzZMK(), i, d);
        if (zz4gZzZ != chartDataPoint.zzaQ().getOutline()) {
            chartDataPoint = chartDataPoint.zz3g();
            chartDataPoint.zzaQ().setOutline(zz4gZzZ);
        }
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzX(zzGP.zzZ(i, z, chartDataPoint, zzzq4ZzZi, zzdi));
        return new zzEO(zzg, zzzq4ZzZi.getWidth(), zzzq4ZzZi.getHeight(), 3);
    }

    public static zzEO zzZ(boolean z, boolean z2, int i, ChartDataPoint chartDataPoint, float f, double d, zzDI zzdi) throws Exception {
        return zzY(z, z2, i, chartDataPoint, f, d, zzdi);
    }

    public static zzEO zzZ(zzD9 zzd9, float f, double d, zzDI zzdi) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = zzZ(zzd9.getOutline(), f);
        com.aspose.words.internal.zzZG zzzgZzZ = zzZ(zzd9.getOutline(), (zzGK) null, zzzq4ZzZ, d, zzdi.zzZIC().zzZMC(), 0);
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzX(zzzgZzZ);
        return new zzEO(zzg, zzzq4ZzZ.getWidth(), zzzq4ZzZ.getHeight(), 1);
    }

    public static zzEO zzZ(zzD9 zzd9, int i, float f, boolean z, zzDI zzdi) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzZi = zzZi(f);
        com.aspose.words.internal.zzZG zzzgZzW = com.aspose.words.internal.zzZG.zzW(zzzq4ZzZi);
        zzDG.zzZ(zzzgZzW, zzd9, (zzE3) null, zzdi.zzZIC().zzZMK(), i);
        if (z) {
            zzDG.zzB(zzzgZzW);
            zzzgZzW.zzY((com.aspose.words.internal.zzPY) null);
        }
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzX(zzzgZzW);
        return new zzEO(zzg, zzzq4ZzZi.getWidth(), zzzq4ZzZi.getHeight(), 4);
    }

    private static com.aspose.words.internal.zzZG zzZ(zz4G zz4g, zzGK zzgk, com.aspose.words.internal.zzZQ4 zzzq4, double d, zzFI zzfi, int i) throws Exception {
        float height = zzzq4.getHeight() / 2.0f;
        com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(new long[]{com.aspose.words.internal.zzZPY.zzG(0.0f, height), com.aspose.words.internal.zzZPY.zzG(zzzq4.getWidth(), height)}, false, false);
        zzzgZzZ.zzX(zzDG.zzZ(zzZ(zz4g, zzfi, i, d), zzgk, zzfi, i));
        return zzzgZzZ;
    }

    private static com.aspose.words.internal.zzZG zzZ(long j, ChartDataPoint chartDataPoint, int i, double d, zzDI zzdi) throws Exception {
        ChartMarker marker = chartDataPoint.getMarker();
        float fMin = Math.min(marker.getSize(), (int) (0.6d * d));
        if (com.aspose.words.internal.zzAN.zzf(fMin)) {
            return null;
        }
        zz4G zz4gZzZ = zzZ(marker.zzaQ().getOutline(), zzdi.zzZIC().zzZME(), i, d);
        if (zz4gZzZ != marker.zzaQ().getOutline()) {
            marker = chartDataPoint.getMarker().zz2P();
            marker.zzaQ().setOutline(zz4gZzZ);
        }
        return zzEE.zzZ(j, marker, i, fMin, zzdi);
    }

    private static com.aspose.words.internal.zzZQ4 zzZ(zz4G zz4g, float f) {
        return new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, (zz4g.getDashStyle() == 0 ? 242570.0f : 323850.0f) + ((!zz4g.zzLh(3) || zz4g.getEndCap() == 0) ? ((float) zz4g.getWeight()) / 2.0f : 0.0f), f);
    }

    private static zz4G zzZ(zz4G zz4g, zzFI zzfi, int i, double d) throws Exception {
        double dMax = Math.max(((double) zzDG.zzZ(zz4g, zzfi, i).getWidth()) / 12700.0d, zz4g.getWeight());
        double dZzYn = zzYn(d);
        if (dMax <= dZzYn) {
            return zz4g;
        }
        zz4G zz4gZzZxK = zz4g.zzZxK();
        zz4gZzZxK.setWeight(dZzYn);
        return zz4gZzZxK;
    }
}
