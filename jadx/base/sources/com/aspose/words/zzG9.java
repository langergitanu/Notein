package com.aspose.words;

import com.alibaba.sdk.android.oss.common.RequestParameters;

/* JADX INFO: loaded from: classes6.dex */
final class zzG9 {
    private static void zzU(ChartAxis chartAxis, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzFX.zzE("valAx", false));
        zzZ(chartAxis, zzzxr, false);
        zzzydZzZlV.zzX(zzFX.zzE("crossBetween", false), "val", zzC6.zzK3(chartAxis.zz4k()));
        if (!chartAxis.getMajorUnitIsAuto()) {
            zzzydZzZlV.zzX(zzFX.zzE("majorUnit", false), "val", com.aspose.words.internal.zzJB.zzZW(chartAxis.getMajorUnit()));
        }
        if (!chartAxis.getMinorUnitIsAuto()) {
            zzzydZzZlV.zzX(zzFX.zzE("minorUnit", false), "val", com.aspose.words.internal.zzJB.zzZW(chartAxis.getMinorUnit()));
        }
        zzFX.zzZ(chartAxis.getDisplayUnit(), zzzxr, false);
        zz7Z.zzZ(zzFX.zzY0(false), chartAxis.getExtensions(), zzzxr);
        zzFX.zzE("valAx", false);
        zzzydZzZlV.zzo();
    }

    private static void zzV(ChartAxis chartAxis, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzFX.zzE("serAx", false));
        zzZ(chartAxis, zzzxr, false);
        if (!chartAxis.getTickLabels().isAutoSpacing()) {
            zzzydZzZlV.zzX(zzFX.zzE("tickLblSkip", false), "val", Integer.valueOf(chartAxis.getTickLabels().getSpacing()));
        }
        if (!chartAxis.zz4e()) {
            zzzydZzZlV.zzX(zzFX.zzE("tickMarkSkip", false), "val", Integer.valueOf(chartAxis.getTickMarkSpacing()));
        }
        zz7Z.zzZ(zzFX.zzY0(false), chartAxis.getExtensions(), zzzxr);
        zzFX.zzE("serAx", false);
        zzzydZzZlV.zzo();
    }

    private static void zzW(ChartAxis chartAxis, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzFX.zzE("dateAx", false));
        zzZ(chartAxis, zzzxr, false);
        zzFX.zzZ(zzFX.zzE("auto", false), chartAxis.getCategoryType() == 0, zzzydZzZlV);
        zzzydZzZlV.zzX(zzFX.zzE("lblOffset", false), "val", Integer.valueOf(chartAxis.getTickLabels().getOffset()));
        zzzydZzZlV.zzX(zzFX.zzE("baseTimeUnit", false), "val", zzC6.zzJH(chartAxis.getBaseTimeUnit()));
        if (!chartAxis.getMajorUnitIsAuto()) {
            zzzydZzZlV.zzX(zzFX.zzE("majorUnit", false), "val", com.aspose.words.internal.zzJB.zzZW(chartAxis.getMajorUnit()));
        }
        zzzydZzZlV.zzX(zzFX.zzE("majorTimeUnit", false), "val", zzC6.zzJH(chartAxis.getMajorUnitScale()));
        if (!chartAxis.getMinorUnitIsAuto()) {
            zzzydZzZlV.zzX(zzFX.zzE("minorUnit", false), "val", com.aspose.words.internal.zzJB.zzZW(chartAxis.getMinorUnit()));
        }
        zzzydZzZlV.zzX(zzFX.zzE("minorTimeUnit", false), "val", zzC6.zzJH(chartAxis.getMinorUnitScale()));
        zz7Z.zzZ(zzFX.zzY0(false), chartAxis.getExtensions(), zzzxr);
        zzFX.zzE("dateAx", false);
        zzzydZzZlV.zzo();
    }

    private static void zzX(ChartAxis chartAxis, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzFX.zzE("catAx", false));
        zzZ(chartAxis, zzzxr, false);
        zzzydZzZlV.zzX(zzFX.zzE("auto", false), "val", Boolean.valueOf(chartAxis.getCategoryType() == 0));
        if (chartAxis.zz4o() != 0) {
            zzzydZzZlV.zzX(zzFX.zzE("lblAlgn", false), "val", zzC6.zzJW(chartAxis.zz4o()));
        }
        zzzydZzZlV.zzX(zzFX.zzE("lblOffset", false), "val", Integer.valueOf(chartAxis.getTickLabels().getOffset()));
        if (!chartAxis.getTickLabels().isAutoSpacing()) {
            zzzydZzZlV.zzX(zzFX.zzE("tickLblSkip", false), "val", Integer.valueOf(chartAxis.getTickLabels().getSpacing()));
        }
        if (!chartAxis.zz4e()) {
            zzzydZzZlV.zzX(zzFX.zzE("tickMarkSkip", false), "val", Integer.valueOf(chartAxis.getTickMarkSpacing()));
        }
        zzzydZzZlV.zzX(zzFX.zzE("noMultiLvlLbl", false), "val", Boolean.valueOf(chartAxis.zz4h()));
        zz7Z.zzZ(zzFX.zzY0(false), chartAxis.getExtensions(), zzzxr);
        zzFX.zzE("catAx", false);
        zzzydZzZlV.zzo();
    }

    public static void zzY(ChartAxis chartAxis, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzFX.zzE("axis", true));
        zzzydZzZlV.zzZj("id", chartAxis.zz4n());
        if (chartAxis.getHidden()) {
            zzzydZzZlV.zzx("hidden", chartAxis.getHidden());
        }
        if (chartAxis.zz3Z()) {
            zzZ(chartAxis, zzzydZzZlV);
        } else {
            zzY(chartAxis, zzzydZzZlV);
        }
        zzFX.zzZ(chartAxis.getDisplayUnit(), zzzxr, true);
        zzZ(chartAxis, zzzxr, true);
        zz7Z.zzZ(zzFX.zzY0(true), chartAxis.getExtensions(), zzzxr);
        zzFX.zzE("axis", true);
        zzzydZzZlV.zzo();
    }

    public static void zzZ(ChartAxis chartAxis, zzZXR zzzxr) throws Exception {
        int type = chartAxis.getType();
        if (type == 0) {
            if (chartAxis.zz4q()) {
                zzW(chartAxis, zzzxr);
                return;
            } else {
                zzX(chartAxis, zzzxr);
                return;
            }
        }
        if (type == 1) {
            zzV(chartAxis, zzzxr);
        } else {
            if (type != 2) {
                throw new IllegalArgumentException("Unexpected axis type.");
            }
            zzU(chartAxis, zzzxr);
        }
    }

    private static void zzZ(ChartAxis chartAxis, zzZXR zzzxr, boolean z) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        if (!z) {
            zzzydZzZlV.zzX(zzFX.zzE("axId", z), "val", Integer.valueOf(chartAxis.zz4n()));
            zzFX.zzZ(chartAxis.getScaling(), zzzxr, z);
            zzzydZzZlV.zzX(zzFX.zzE(RequestParameters.SUBRESOURCE_DELETE, z), "val", Boolean.valueOf(chartAxis.getHidden()));
            zzzydZzZlV.zzX(zzFX.zzE("axPos", z), "val", zzC6.zzK7(chartAxis.zz4m()));
        }
        zzFX.zzZ("majorGridlines", chartAxis.zz4j(), zzzxr, z);
        zzFX.zzZ("minorGridlines", chartAxis.zz4i(), zzzxr, z);
        zzFX.zzZ(chartAxis.zz48(), zzzxr, chartAxis.getTitleDeleted(), z, true);
        zzFX.zzZ(chartAxis.zz4d(), zzzydZzZlV, z);
        zzFX.zzZ(z ? "majorTickMarks" : "majorTickMark", chartAxis.getMajorTickMark(), chartAxis.zz4a(), zzzxr, z);
        zzFX.zzZ(z ? "minorTickMarks" : "minorTickMark", chartAxis.getMinorTickMark(), chartAxis.zz49(), zzzxr, z);
        if (z) {
            if (chartAxis.zz4c() || (chartAxis.zz4b() != null && chartAxis.zz4b().getCount() > 0)) {
                zzzydZzZlV.zzY(zzFX.zzE("tickLabels", z));
                zz7Z.zzZ(zzFX.zzY0(z), chartAxis.zz4b(), zzzxr);
                zzFX.zzE("tickLabels", z);
                zzzydZzZlV.zzo();
            }
        } else {
            Object objZzLu = chartAxis.zz4p().zzLu(24);
            if (objZzLu != null) {
                zzzydZzZlV.zzX(zzFX.zzE("tickLblPos", z), "val", zzC6.zzJJ(((Integer) objZzLu).intValue()));
            }
        }
        zzFX.zzZ(chartAxis.zzaQ(), zzzxr, z, (String) null);
        zzFX.zzZ(chartAxis.zzaR(), zzzxr, z);
        if (z) {
            return;
        }
        zzzydZzZlV.zzX(zzFX.zzE("crossAx", z), "val", Integer.valueOf(chartAxis.zz4l()));
        if (chartAxis.getCrosses() == 3) {
            zzzydZzZlV.zzX(zzFX.zzE("crossesAt", z), "val", Double.valueOf(chartAxis.getCrossesAt()));
        } else {
            zzzydZzZlV.zzX(zzFX.zzE("crosses", z), "val", zzC6.zzK2(chartAxis.getCrosses()));
        }
    }

    private static void zzY(ChartAxis chartAxis, zzZYD zzzyd) {
        zzzyd.zzY(zzFX.zzE("valScaling", true));
        if (chartAxis.getScaling().zzaU()) {
            zzFX.zzZ("max", chartAxis.getScaling().getMaximum(), zzzyd);
        }
        if (chartAxis.getScaling().zzaV()) {
            zzFX.zzZ("min", chartAxis.getScaling().getMinimum(), zzzyd);
        }
        zzFX.zzZ("majorUnit", chartAxis.zz4g(), zzzyd);
        zzFX.zzZ("minorUnit", chartAxis.zz4f(), zzzyd);
        zzFX.zzE("valScaling", true);
        zzzyd.zzo();
    }

    private static void zzZ(ChartAxis chartAxis, zzZYD zzzyd) {
        zzzyd.zzY(zzFX.zzE("catScaling", true));
        zzFX.zzZ("gapWidth", chartAxis.getScaling().zzaT(), zzzyd);
        zzFX.zzE("catScaling", true);
        zzzyd.zzo();
    }
}
