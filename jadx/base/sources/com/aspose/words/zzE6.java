package com.aspose.words;

import com.alibaba.sdk.android.oss.common.RequestParameters;

/* JADX INFO: loaded from: classes6.dex */
final class zzE6 {
    private static void zzY(zzGK zzgk, zzZXR zzzxr, boolean z) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzDO zzdoZzZPg = zzgk.zzZPg();
        Object objZzLu = zzdoZzZPg.zzLu(15);
        if (objZzLu != null) {
            zzzydZzZlV.zzX(zzFX.zzE("barDir", z), "val", zzC6.zzK6(((Integer) objZzLu).intValue()));
        }
        Object objZzLu2 = zzdoZzZPg.zzLu(28);
        if (objZzLu2 != null) {
            zzzydZzZlV.zzX(zzFX.zzE("ofPieType", z), "val", zzC6.zzJR(((Integer) objZzLu2).intValue()));
        }
        Object objZzLu3 = zzdoZzZPg.zzLu(32);
        if (objZzLu3 != null) {
            zzzydZzZlV.zzX(zzFX.zzE("radarStyle", z), "val", zzC6.zzJO(((Integer) objZzLu3).intValue()));
        }
        Object objZzLu4 = zzdoZzZPg.zzLu(33);
        if (objZzLu4 != null) {
            zzzydZzZlV.zzX(zzFX.zzE("scatterStyle", z), "val", zzC6.zzJN(((Integer) objZzLu4).intValue()));
        }
        Object objZzLu5 = zzdoZzZPg.zzLu(35);
        if (objZzLu5 != null) {
            zzzydZzZlV.zzX(zzFX.zzE("wireframe", z), "val", objZzLu5);
        }
        Object objZzLu6 = zzdoZzZPg.zzLu(12);
        if (objZzLu6 != null) {
            zzzydZzZlV.zzX(zzFX.zzE("grouping", z), "val", zzC6.zzK5(((Integer) objZzLu6).intValue()));
        }
        Object objZzLu7 = zzdoZzZPg.zzLu(14);
        if (objZzLu7 != null) {
            zzzydZzZlV.zzX(zzFX.zzE("varyColors", z), "val", objZzLu7);
        }
        if (zzdoZzZPg.zzLu(13) != null) {
            zzDC.zzZ(zzgk, zzzxr);
        }
        Object objZzLu8 = zzdoZzZPg.zzLu(3);
        if (objZzLu8 != null) {
            zzFX.zzZ((ChartDataLabelCollection) objZzLu8, zzzxr, z);
        }
        Object objZzLu9 = zzdoZzZPg.zzLu(4);
        boolean zBooleanValue = ((Boolean) zzdoZzZPg.zzLv(5)).booleanValue();
        if (objZzLu9 != null) {
            zzFX.zzZ(zzFX.zzE("dropLines", z), (zzD9) objZzLu9, zzzxr, zBooleanValue, z);
        }
        Object objZzLu10 = zzdoZzZPg.zzLu(6);
        boolean zBooleanValue2 = ((Boolean) zzdoZzZPg.zzLv(7)).booleanValue();
        if (objZzLu10 != null) {
            zzFX.zzZ(zzFX.zzE("hiLowLines", z), (zzD9) objZzLu10, zzzxr, zBooleanValue2, z);
        }
        Object objZzLu11 = zzdoZzZPg.zzLu(11);
        if (objZzLu11 != null) {
            zzzydZzZlV.zzX(zzFX.zzE("gapWidth", z), "val", objZzLu11);
        }
        Object objZzLu12 = zzdoZzZPg.zzLu(10);
        if (objZzLu12 != null) {
            zzzydZzZlV.zzX(zzFX.zzE("gapDepth", z), "val", objZzLu12);
        }
        Object objZzLu13 = zzdoZzZPg.zzLu(16);
        if (objZzLu13 != null) {
            zzzydZzZlV.zzX(zzFX.zzE("shape", z), "val", zzC6.zzJM(((Integer) objZzLu13).intValue()));
        }
        Object objZzLu14 = zzdoZzZPg.zzLu(17);
        if (objZzLu14 != null) {
            zzzydZzZlV.zzX(zzFX.zzE("overlap", z), "val", objZzLu14);
        }
        Object objZzLu15 = zzdoZzZPg.zzLu(31);
        if (objZzLu15 != null) {
            zzzydZzZlV.zzX(zzFX.zzE("splitType", z), "val", zzC6.zzJK(((Integer) objZzLu15).intValue()));
        }
        Object objZzLu16 = zzdoZzZPg.zzLu(30);
        if (objZzLu16 != null) {
            zzzydZzZlV.zzX(zzFX.zzE("splitPos", z), "val", objZzLu16);
        }
        Object objZzLu17 = zzdoZzZPg.zzLu(27);
        if (objZzLu17 != null) {
            zzFX.zzZ((int[]) objZzLu17, zzzydZzZlV, z);
        }
        Object objZzLu18 = zzdoZzZPg.zzLu(29);
        if (objZzLu18 != null) {
            zzzydZzZlV.zzX(zzFX.zzE("secondPieSize", z), "val", objZzLu18);
        }
        Object objZzLu19 = zzdoZzZPg.zzLu(8);
        if (objZzLu19 != null) {
            zzFX.zzZ(zzFX.zzE("serLines", z), (zzD9) objZzLu19, zzzxr, ((Boolean) zzdoZzZPg.zzLv(9)).booleanValue(), z);
        }
        Object objZzLu20 = zzdoZzZPg.zzLu(18);
        if (objZzLu20 != null) {
            zzzydZzZlV.zzX(zzFX.zzE("bubble3D", z), "val", objZzLu20);
        }
        Object objZzLu21 = zzdoZzZPg.zzLu(19);
        if (objZzLu21 != null) {
            zzzydZzZlV.zzX(zzFX.zzE("bubbleScale", z), "val", objZzLu21);
        }
        Object objZzLu22 = zzdoZzZPg.zzLu(20);
        if (objZzLu22 != null) {
            zzzydZzZlV.zzX(zzFX.zzE("showNegBubbles", z), "val", objZzLu22);
        }
        Object objZzLu23 = zzdoZzZPg.zzLu(21);
        if (objZzLu23 != null) {
            zzzydZzZlV.zzX(zzFX.zzE("sizeRepresents", z), "val", zzC6.zzJL(((Integer) objZzLu23).intValue()));
        }
        Object objZzLu24 = zzdoZzZPg.zzLu(22);
        if (objZzLu24 != null) {
            zzzydZzZlV.zzX(zzFX.zzE("firstSliceAng", z), "val", objZzLu24);
        }
        Object objZzLu25 = zzdoZzZPg.zzLu(23);
        if (objZzLu25 != null) {
            zzzydZzZlV.zzX(zzFX.zzE("holeSize", z), "val", objZzLu25);
        }
        Object objZzLu26 = zzdoZzZPg.zzLu(26);
        if (objZzLu26 != null) {
            zzFX.zzZ((zzCH) objZzLu26, zzzxr, z);
        }
        Object objZzLu27 = zzdoZzZPg.zzLu(24);
        if (objZzLu27 != null) {
            zzzydZzZlV.zzX(zzFX.zzE(RequestParameters.MARKER, z), "val", objZzLu27);
        }
        Object objZzLu28 = zzdoZzZPg.zzLu(25);
        if (objZzLu28 != null) {
            zzzydZzZlV.zzX(zzFX.zzE("smooth", z), "val", objZzLu28);
        }
        Object objZzLu29 = zzdoZzZPg.zzLu(34);
        if (objZzLu29 != null) {
            zzFX.zzZ((zzG7) objZzLu29, zzzxr, z);
        }
        Object objZzLu30 = zzdoZzZPg.zzLu(0);
        if (objZzLu30 != null) {
            zzzydZzZlV.zzX(zzFX.zzE("axId", z), "val", objZzLu30);
        }
        Object objZzLu31 = zzdoZzZPg.zzLu(1);
        if (objZzLu31 != null) {
            zzzydZzZlV.zzX(zzFX.zzE("axId", z), "val", objZzLu31);
        }
        Object objZzLu32 = zzdoZzZPg.zzLu(2);
        if (objZzLu32 != null) {
            zzzydZzZlV.zzX(zzFX.zzE("axId", z), "val", objZzLu32);
        }
        Object objZzLu33 = zzdoZzZPg.zzLu(36);
        if (objZzLu33 != null) {
            zz7Z.zzZ(zzFX.zzY0(z), (com.aspose.words.internal.zzZYG<zz82>) objZzLu33, zzzxr);
        }
    }

    public static void zzZ(zzGK zzgk, zzZXR zzzxr, boolean z) throws Exception {
        zzzxr.zzZlV().zzY(zzd(zzgk.zzZQO(), z));
        zzY(zzgk, zzzxr, z);
        zzzxr.zzZlV().zzo();
    }

    private static String zzd(int i, boolean z) {
        switch (i) {
            case 0:
                return zzFX.zzE("areaChart", z);
            case 1:
                return zzFX.zzE("area3DChart", z);
            case 2:
                return zzFX.zzE("lineChart", z);
            case 3:
                return zzFX.zzE("line3DChart", z);
            case 4:
                return zzFX.zzE("stockChart", z);
            case 5:
                return zzFX.zzE("radarChart", z);
            case 6:
                return zzFX.zzE("scatterChart", z);
            case 7:
                return zzFX.zzE("pieChart", z);
            case 8:
                return zzFX.zzE("pie3DChart", z);
            case 9:
                return zzFX.zzE("doughnutChart", z);
            case 10:
                return zzFX.zzE("barChart", z);
            case 11:
                return zzFX.zzE("bar3DChart", z);
            case 12:
                return zzFX.zzE("ofPieChart", z);
            case 13:
                return zzFX.zzE("surfaceChart", z);
            case 14:
                return zzFX.zzE("surface3DChart", z);
            case 15:
                return zzFX.zzE("bubbleChart", z);
            default:
                throw new IllegalArgumentException("Unexpected Dml chart type");
        }
    }
}
