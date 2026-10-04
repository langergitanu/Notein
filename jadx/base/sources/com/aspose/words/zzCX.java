package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes6.dex */
final class zzCX {
    private static String zzRe(String str) {
        return com.aspose.words.internal.zzZKN.format("cs:{0}", str);
    }

    public static void zzY(zzD3 zzd3, zzZXR zzzxr) throws Exception {
        if (zzd3 == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("cs:chartStyle");
        zzzydZzZlV.zz0("xmlns:cs", "http://schemas.microsoft.com/office/drawing/2012/chartStyle");
        zzzydZzZlV.zz0("xmlns:a", zzZX5.zz9(6, zzzxr.getCompliance() == 2));
        zzzydZzZlV.zz0("id", zzd3.getId());
        zzZ(zzd3.zzKn(0), "axisTitle", zzzxr);
        zzZ(zzd3.zzKn(1), "categoryAxis", zzzxr);
        zzZ(zzd3.zzKn(2), "chartArea", zzzxr);
        zzZ(zzd3.zzKn(3), "dataLabel", zzzxr);
        zzZ(zzd3.zzKn(4), "dataLabelCallout", zzzxr);
        zzZ(zzd3.zzKn(5), "dataPoint", zzzxr);
        zzZ(zzd3.zzKn(6), "dataPoint3D", zzzxr);
        zzZ(zzd3.zzKn(7), "dataPointLine", zzzxr);
        zzZ(zzd3.zzKn(8), "dataPointMarker", zzzxr);
        zzZ(zzd3.zzZHu(), "dataPointMarkerLayout", zzzxr);
        zzZ(zzd3.zzKn(9), "dataPointWireframe", zzzxr);
        zzZ(zzd3.zzKn(10), "dataTable", zzzxr);
        zzZ(zzd3.zzKn(11), "downBar", zzzxr);
        zzZ(zzd3.zzKn(12), "dropLine", zzzxr);
        zzZ(zzd3.zzKn(13), "errorBar", zzzxr);
        zzZ(zzd3.zzKn(14), "floor", zzzxr);
        zzZ(zzd3.zzKn(15), "gridlineMajor", zzzxr);
        zzZ(zzd3.zzKn(16), "gridlineMinor", zzzxr);
        zzZ(zzd3.zzKn(17), "hiLoLine", zzzxr);
        zzZ(zzd3.zzKn(18), "leaderLine", zzzxr);
        zzZ(zzd3.zzKn(19), "legend", zzzxr);
        zzZ(zzd3.zzKn(20), "plotArea", zzzxr);
        zzZ(zzd3.zzKn(21), "plotArea3D", zzzxr);
        zzZ(zzd3.zzKn(22), "seriesAxis", zzzxr);
        zzZ(zzd3.zzKn(23), "seriesLine", zzzxr);
        zzZ(zzd3.zzKn(24), NoteMeta.PROPERTY_TITLE, zzzxr);
        zzZ(zzd3.zzKn(25), "trendline", zzzxr);
        zzZ(zzd3.zzKn(26), "trendlineLabel", zzzxr);
        zzZ(zzd3.zzKn(27), "upBar", zzzxr);
        zzZ(zzd3.zzKn(28), "valueAxis", zzzxr);
        zzZ(zzd3.zzKn(29), "wall", zzzxr);
        zz7Z.zzZ(TranslateLanguage.CZECH, zzd3.getExtensions(), zzzxr);
        zzzydZzZlV.zzo();
        zzzydZzZlV.flush();
    }

    private static void zzZ(zzD1 zzd1, String str, zzZXR zzzxr) throws Exception {
        if (zzd1 == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzRe(str));
        if (zzd1.zzZM1() != null && zzd1.zzZM1().length > 0) {
            zzzydZzZlV.zz0("mods", com.aspose.words.internal.zzZKN.zzY(" ", zzd1.zzZM1()));
        }
        zzZ(zzd1.zzZHq(), "lnRef", zzzxr);
        if (!com.aspose.words.internal.zzAN.zzL(zzd1.zzZHp(), 1.0d)) {
            zzzydZzZlV.zzZ("cs:lineWidthScale", com.aspose.words.internal.zzJB.zzZT(zzd1.zzZHp()));
        }
        zzZ(zzd1.zzZHo(), "fillRef", zzzxr);
        zzZ(zzd1.zzZHn(), "effectRef", zzzxr);
        zzZ(zzd1.zzZHm(), "fontRef", zzzxr);
        if (zzd1.zzZTm() != null) {
            zz1T.zzZ(TranslateLanguage.CZECH, zzd1.zzZTm(), zzzxr);
        }
        if (zzd1.zzZHw() != null) {
            zz0F.zzZ("cs:defRPr", zzd1.zzZHw(), zzzxr);
        }
        if (zzd1.zzZTl() != null) {
            zz0F.zzZ("cs:bodyPr", zzd1.zzZTl(), zzzxr);
        }
        if (zzd1.hasExtensions()) {
            zz7Z.zzZ(TranslateLanguage.CZECH, zzd1.getExtensions(), zzzxr);
        }
        zzRe(str);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzCY zzcy, String str, zzZXR zzzxr) {
        zzZ(com.aspose.words.internal.zzJB.zzWF(zzcy.zzZC7()), zzcy.zzZQX(), zzcy.zzZM1(), str, zzzxr);
    }

    private static void zzZ(String str, zzBW zzbw, String[] strArr, String str2, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzRe(str2));
        zzzydZzZlV.zz0("idx", str);
        if (strArr != null && strArr.length > 0) {
            zzzydZzZlV.zz0("mods", com.aspose.words.internal.zzZKN.zzY(" ", strArr));
        }
        if (zzbw != null) {
            if (zzbw.zzZHs() == 7) {
                zzZ((zzD2) zzbw, zzzxr);
            } else {
                zzBN.zzW("a", zzbw, zzzxr);
            }
        }
        zzRe(str2);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzD2 zzd2, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("cs:styleClr");
        zzzydZzZlV.zz0("val", zzd2.getValue());
        zzBS.zzZ("a", zzd2.zzZNX(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzEZ zzez, String str, zzZXR zzzxr) {
        zzZ(zz84.zzIr(zzez.zzZAU()), zzez.zzZQX(), zzez.zzZM1(), str, zzzxr);
    }

    private static void zzZ(zzEG zzeg, String str, zzZXR zzzxr) {
        if (zzeg == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzRe(str));
        if (com.aspose.words.internal.zzZYD.zzXk(zzeg.getSymbol())) {
            zzzydZzZlV.zz0("symbol", zzeg.getSymbol());
        }
        if (zzeg.getSize() > 0) {
            zzzydZzZlV.zzZj("size", zzeg.getSize());
        }
        zzRe(str);
        zzzydZzZlV.zzo();
    }
}
