package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzDC {
    private static void zzQ(ArrayList<ChartSeries> arrayList, zzZXR zzzxr) throws Exception {
        int iIndexOf;
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        for (ChartSeries chartSeries : arrayList) {
            zzzydZzZlV.zzY(zzFX.zzE("series", true));
            zzzydZzZlV.zz0("layoutId", zzC6.zzJB(chartSeries.zz6y()));
            if (chartSeries.getHidden()) {
                zzzydZzZlV.zzx("hidden", chartSeries.getHidden());
            }
            if (chartSeries.zz2o() != null && (iIndexOf = arrayList.indexOf(chartSeries.zz2o())) >= 0) {
                zzzydZzZlV.zzZj("ownerIdx", iIndexOf);
            }
            zzzydZzZlV.zz0("uniqueId", chartSeries.getUniqueId());
            if (chartSeries.zz2n() >= 0) {
                zzzydZzZlV.zzZj("formatIdx", chartSeries.zz2n());
            }
            zzY(chartSeries, zzzxr, true);
            zzFX.zzZ(chartSeries.zz2p(), zzzxr);
            zzFX.zzZ(chartSeries, zzzxr, true);
            if (chartSeries.hasDataLabels()) {
                zzFX.zzZ(chartSeries.getDataLabels(), zzzxr, true);
            }
            if (chartSeries.zz2m() >= 0) {
                zzzydZzZlV.zzX(zzFX.zzE("dataId", true), "val", Integer.valueOf(chartSeries.zz2m()));
            }
            zzFX.zzZ(chartSeries.zz2k(), zzzxr);
            if (chartSeries.zz2l() >= 0) {
                zzzydZzZlV.zzX(zzFX.zzE("axisId", true), "val", Integer.valueOf(chartSeries.zz2l()));
            }
            zzX(chartSeries, zzzxr, true);
        }
    }

    private static void zzR(ArrayList<ChartSeries> arrayList, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        for (ChartSeries chartSeries : arrayList) {
            zzzydZzZlV.zzY(zzFX.zzE("ser", false));
            zzY(chartSeries, zzzxr, false);
            zzzydZzZlV.zzX(zzFX.zzE("invertIfNegative", false), "val", Boolean.valueOf(chartSeries.zz2H().getInvertIfNegative()));
            zzFX.zzZ(chartSeries.zz2H().zz3e(), zzzydZzZlV, false);
            zzFX.zzZ(chartSeries, zzzxr, false);
            if (chartSeries.hasDataLabels()) {
                zzFX.zzZ(chartSeries.getDataLabels(), zzzxr, false);
            }
            zzFX.zzZ(chartSeries.zz2t(), zzzxr);
            zzFX.zzZ(chartSeries.zz2v(), zzzxr);
            zzFX.zzZ(chartSeries.zz2u(), zzzxr);
            zzFX.zzZ(zzFX.zzE("cat", false), chartSeries.zz2z().zzZMu(), zzzxr, false);
            zzFX.zzZ(zzFX.zzE("val", false), chartSeries.zz2y().zzZMu(), zzzxr, false);
            if (chartSeries.getShape() != 6 && chartSeries.getShape() != ((Integer) chartSeries.zz3I().zzZPg().zzLv(16)).intValue()) {
                zzzydZzZlV.zzX(zzFX.zzE("shape", false), "val", zzC6.zzJM(chartSeries.getShape()));
            }
            zzX(chartSeries, zzzxr, false);
        }
    }

    private static void zzS(ArrayList<ChartSeries> arrayList, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        for (ChartSeries chartSeries : arrayList) {
            zzzydZzZlV.zzY(zzFX.zzE("ser", false));
            zzY(chartSeries, zzzxr, false);
            zzFX.zzZ(chartSeries.zz2H().zz3e(), zzzydZzZlV, false);
            zzFX.zzZ(chartSeries, zzzxr, false);
            if (chartSeries.hasDataLabels()) {
                zzFX.zzZ(chartSeries.getDataLabels(), zzzxr, false);
            }
            zzFX.zzZ(chartSeries.zz2t(), zzzxr);
            zzFX.zzZ(chartSeries.zz2v(), zzzxr);
            zzFX.zzZ(chartSeries.zz2u(), zzzxr);
            zzFX.zzZ(zzFX.zzE("cat", false), chartSeries.zz2z().zzZMu(), zzzxr, false);
            zzFX.zzZ(zzFX.zzE("val", false), chartSeries.zz2y().zzZMu(), zzzxr, false);
            zzX(chartSeries, zzzxr, false);
        }
    }

    private static void zzT(ArrayList<ChartSeries> arrayList, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        for (ChartSeries chartSeries : arrayList) {
            zzzydZzZlV.zzY(zzFX.zzE("ser", false));
            zzY(chartSeries, zzzxr, false);
            zzFX.zzZ(chartSeries.zz2H().getMarker(), zzzxr, false);
            zzFX.zzZ(chartSeries, zzzxr, false);
            if (chartSeries.hasDataLabels()) {
                zzFX.zzZ(chartSeries.getDataLabels(), zzzxr, false);
            }
            zzFX.zzZ(zzFX.zzE("cat", false), chartSeries.zz2z().zzZMu(), zzzxr, false);
            zzFX.zzZ(zzFX.zzE("val", false), chartSeries.zz2y().zzZMu(), zzzxr, false);
            zzX(chartSeries, zzzxr, false);
        }
    }

    private static void zzU(ArrayList<ChartSeries> arrayList, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        for (ChartSeries chartSeries : arrayList) {
            zzzydZzZlV.zzY(zzFX.zzE("ser", false));
            zzY(chartSeries, zzzxr, false);
            zzFX.zzZ(chartSeries.zz2H().getMarker(), zzzxr, false);
            zzFX.zzZ(chartSeries, zzzxr, false);
            if (chartSeries.hasDataLabels()) {
                zzFX.zzZ(chartSeries.getDataLabels(), zzzxr, false);
            }
            zzFX.zzZ(chartSeries.zz2t(), zzzxr);
            zzFX.zzZ(chartSeries.zz2v(), zzzxr);
            zzFX.zzZ(chartSeries.zz2u(), zzzxr);
            zzFX.zzZ(zzFX.zzE("xVal", false), chartSeries.zz2z().zzZMu(), zzzxr, false);
            zzFX.zzZ(zzFX.zzE("yVal", false), chartSeries.zz2y().zzZMu(), zzzxr, false);
            zzzydZzZlV.zzX(zzFX.zzE("smooth", false), "val", Boolean.valueOf(chartSeries.getSmooth()));
            zzX(chartSeries, zzzxr, false);
        }
    }

    private static void zzV(ArrayList<ChartSeries> arrayList, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        for (ChartSeries chartSeries : arrayList) {
            zzzydZzZlV.zzY(zzFX.zzE("ser", false));
            zzY(chartSeries, zzzxr, false);
            zzFX.zzZ(zzFX.zzE("cat", false), chartSeries.zz2z().zzZMu(), zzzxr, false);
            zzFX.zzZ(zzFX.zzE("val", false), chartSeries.zz2y().zzZMu(), zzzxr, false);
            zzX(chartSeries, zzzxr, false);
        }
    }

    private static void zzW(ArrayList<ChartSeries> arrayList, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        for (ChartSeries chartSeries : arrayList) {
            zzzydZzZlV.zzY(zzFX.zzE("ser", false));
            zzY(chartSeries, zzzxr, false);
            if (chartSeries.zz2H().getExplosion() != -1) {
                zzzydZzZlV.zzX(zzFX.zzE("explosion", false), "val", Integer.valueOf(chartSeries.zz2H().getExplosion()));
            }
            zzFX.zzZ(chartSeries, zzzxr, false);
            if (chartSeries.hasDataLabels()) {
                zzFX.zzZ(chartSeries.getDataLabels(), zzzxr, false);
            }
            zzFX.zzZ(zzFX.zzE("cat", false), chartSeries.zz2z().zzZMu(), zzzxr, false);
            zzFX.zzZ(zzFX.zzE("val", false), chartSeries.zz2y().zzZMu(), zzzxr, false);
            zzX(chartSeries, zzzxr, false);
        }
    }

    private static void zzX(ArrayList<ChartSeries> arrayList, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        for (ChartSeries chartSeries : arrayList) {
            zzzydZzZlV.zzY(zzFX.zzE("ser", false));
            zzY(chartSeries, zzzxr, false);
            if (chartSeries.zz2H().zz3f()) {
                zzFX.zzZ(chartSeries.zz2H().getMarker(), zzzxr, false);
            }
            zzFX.zzZ(chartSeries, zzzxr, false);
            if (chartSeries.hasDataLabels()) {
                zzFX.zzZ(chartSeries.getDataLabels(), zzzxr, false);
            }
            zzFX.zzZ(chartSeries.zz2t(), zzzxr);
            zzFX.zzZ(chartSeries.zz2v(), zzzxr);
            zzFX.zzZ(chartSeries.zz2u(), zzzxr);
            zzFX.zzZ(zzFX.zzE("cat", false), chartSeries.zz2z().zzZMu(), zzzxr, false);
            zzFX.zzZ(zzFX.zzE("val", false), chartSeries.zz2y().zzZMu(), zzzxr, false);
            zzzydZzZlV.zzX(zzFX.zzE("smooth", false), "val", Boolean.valueOf(chartSeries.getSmooth()));
            zzX(chartSeries, zzzxr, false);
        }
    }

    private static void zzY(ArrayList<ChartSeries> arrayList, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        for (ChartSeries chartSeries : arrayList) {
            zzzydZzZlV.zzY(zzFX.zzE("ser", false));
            zzY(chartSeries, zzzxr, false);
            zzzydZzZlV.zzX(zzFX.zzE("invertIfNegative", false), "val", Boolean.valueOf(chartSeries.zz2H().getInvertIfNegative()));
            zzFX.zzZ(chartSeries, zzzxr, false);
            if (chartSeries.hasDataLabels()) {
                zzFX.zzZ(chartSeries.getDataLabels(), zzzxr, false);
            }
            zzFX.zzZ(chartSeries.zz2t(), zzzxr);
            zzFX.zzZ(chartSeries.zz2v(), zzzxr);
            zzFX.zzZ(chartSeries.zz2u(), zzzxr);
            zzFX.zzZ(zzFX.zzE("xVal", false), chartSeries.zz2z().zzZMu(), zzzxr, false);
            zzFX.zzZ(zzFX.zzE("yVal", false), chartSeries.zz2y().zzZMu(), zzzxr, false);
            zzFX.zzZ(zzFX.zzE("bubbleSize", false), chartSeries.zz2x().zzZMu(), zzzxr, false);
            zzzydZzZlV.zzX(zzFX.zzE("bubble3D", false), "val", Boolean.valueOf(chartSeries.zz2H().getBubble3D()));
            zzX(chartSeries, zzzxr, false);
        }
    }

    public static void zzZ(zzGK zzgk, zzZXR zzzxr) throws Exception {
        ArrayList arrayList = (ArrayList) zzgk.zzZPg().zzLu(13);
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        switch (zzgk.zzZQO()) {
            case 0:
            case 1:
                zzS(arrayList, zzzxr);
                return;
            case 2:
            case 3:
            case 4:
                zzX(arrayList, zzzxr);
                return;
            case 5:
                zzT(arrayList, zzzxr);
                return;
            case 6:
                zzU(arrayList, zzzxr);
                return;
            case 7:
            case 8:
            case 9:
            case 12:
                zzW(arrayList, zzzxr);
                return;
            case 10:
            case 11:
                zzR(arrayList, zzzxr);
                return;
            case 13:
            case 14:
                zzV(arrayList, zzzxr);
                return;
            case 15:
                zzY(arrayList, zzzxr);
                return;
            case 16:
                zzQ(arrayList, zzzxr);
                return;
            default:
                throw new IllegalArgumentException("Unexpected Dml chart type");
        }
    }

    private static void zzX(ChartSeries chartSeries, zzZXR zzzxr, boolean z) throws Exception {
        com.aspose.words.internal.zzZYG<zz82> extensions = chartSeries.getExtensions();
        if (extensions != null) {
            zz7Z.zzZ(zzFX.zzY0(z), extensions, zzzxr);
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzFX.zzE(z ? "series" : "ser", z);
        zzzydZzZlV.zzo();
    }

    private static void zzY(ChartSeries chartSeries, zzZXR zzzxr, boolean z) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        if (!z) {
            zzzydZzZlV.zzX(zzFX.zzE("idx", z), "val", Integer.valueOf(chartSeries.getIndex()));
            zzzydZzZlV.zzX(zzFX.zzE("order", z), "val", Integer.valueOf(chartSeries.getOrder()));
        }
        zzFX.zzZ(chartSeries.zz3u(), zzzxr, z);
        zzFX.zzZ(chartSeries.zz2H().zzaQ(), zzzxr, z, (String) null);
    }
}
