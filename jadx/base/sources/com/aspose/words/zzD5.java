package com.aspose.words;

import com.aspose.words.ref.Ref;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzD5 {
    private static void zzU(ShapeBase shapeBase, zzZXR zzzxr) throws Exception {
        zz53 zz53VarZzY9i = shapeBase.zzY9i();
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("cdr:grpSp");
        zz4Y.zzZ("cdr", zz53VarZzY9i, zzzxr);
        zz6Y.zzZ("cdr", (zzBK) zz53VarZzY9i, zzzxr);
        Iterator<T> it = shapeBase.getChildNodes(0, false).iterator();
        while (it.hasNext()) {
            zzV((ShapeBase) it.next(), zzzxr);
        }
        zzzydZzZlV.zzo();
    }

    private static void zzV(ShapeBase shapeBase, zzZXR zzzxr) throws Exception {
        zz53 zz53VarZzY9i = shapeBase.zzY9i();
        int iZzZHY = zz53VarZzY9i.zzZHY();
        if (iZzZHY == 0) {
            zzY((zz2O) zz53VarZzY9i, zzzxr);
            return;
        }
        if (iZzZHY == 1) {
            zzZ((zz2O) zz53VarZzY9i, zzzxr);
        } else if (iZzZHY == 2) {
            zzZ((zz3V) zz53VarZzY9i, zzzxr);
        } else {
            if (iZzZHY != 3) {
                return;
            }
            zzU(shapeBase, zzzxr);
        }
    }

    private static void zzW(ShapeBase shapeBase, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        boolean z = zzzxr.getCompliance() == 2;
        zzzydZzZlV.zzY(shapeBase.zzY9l() == 0 ? "cdr:absSizeAnchor" : "cdr:relSizeAnchor");
        zzzydZzZlV.zz0("xmlns:cdr", zzZX5.zz9(26, z));
        zzZ("cdr:from", shapeBase.zzY9k(), zzzydZzZlV);
        zzZ("cdr:to", shapeBase.zzY9j(), zzzydZzZlV);
        zzV(shapeBase, zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzX(ShapeBase shapeBase, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        boolean z = zzzxr.getCompliance() == 2;
        zzzydZzZlV.zzZ("c:userShapes");
        zzzydZzZlV.zz0("xmlns:c", zzZX5.zz9(9, z));
        zzzydZzZlV.zz0("xmlns:a", zzZX5.zz9(6, z));
        Iterator<T> it = shapeBase.getChildNodes(0, false).iterator();
        while (it.hasNext()) {
            zzW((ShapeBase) it.next(), zzzxr);
        }
        zzzydZzZlV.endDocument();
    }

    public static void zzY(ShapeBase shapeBase, zzZXR zzzxr) throws Exception {
        zzD8 zzd8 = (zzD8) com.aspose.words.internal.zzZKW.zzZ(shapeBase.zzY9i(), zzD8.class);
        if (zzd8 == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        boolean z = zzzxr.getCompliance() == 2;
        boolean zZz33 = zzd8.zz33();
        zzzydZzZlV.zzZ(zzFX.zzE("chartSpace", zZz33));
        zzzydZzZlV.zz0("xmlns:" + zzFX.zzY0(zZz33), zzZX5.zz9(zzd8.zz33() ? 28 : 9, z));
        zzzydZzZlV.zz0("xmlns:a", zzZX5.zz9(6, z));
        zzzydZzZlV.zz0("xmlns:r", zzZX5.zz9(0, z));
        if (zZz33) {
            zzY(zzd8, zzzxr);
        } else {
            zzzydZzZlV.zzX(zzFX.zzE("date1904", zZz33), "val", Boolean.valueOf(zzd8.zzZHW()));
            zzzydZzZlV.zzX(zzFX.zzE(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, zZz33), "val", zzd8.zzZHS());
            zzzydZzZlV.zzX(zzFX.zzE("roundedCorners", zZz33), "val", Boolean.valueOf(zzd8.zzZHP()));
            zzZ(zzd8, zzzydZzZlV);
            zzZ(zzd8.zzZHL(), zzzxr, zZz33);
            zzFX.zzZ(zzd8.zzZHR(), zzzxr, zZz33);
            zzFX.zzZ(zzd8.zzZHQ(), zzzydZzZlV, zZz33);
        }
        zzY(zzd8.zzZHX(), zzzxr, zZz33);
        zzFX.zzZ(zzd8.zzaQ(), zzzxr, zZz33, (String) null);
        zzFX.zzZ(zzd8.zzaR(), zzzxr, zZz33);
        if (zZz33) {
            zzZ(zzd8.zzZHL(), zzzxr, zZz33);
            zzX(zzd8, zzzxr);
        } else {
            zzZ(zzd8, zzzxr);
        }
        zzZ(shapeBase, zzzxr, zZz33);
        zzZ(zzd8.zzZHM(), zzzxr);
        zzY(zzd8.zzZHK(), zzzxr);
        zzZ(zzd8.zzZHJ(), zzzxr);
        zz7Z.zzZ(zzFX.zzY0(zZz33), zzd8.getExtensions(), zzzxr);
        zzzydZzZlV.endDocument();
    }

    private static void zzZ(zzD3 zzd3, zzZXR zzzxr) throws Exception {
        if (zzd3 == null) {
            return;
        }
        String strZz0 = zzZWV.zz0(52, zzzxr.getCompliance() == 2);
        String str = com.aspose.words.internal.zzZKN.format("chart/style{0}.xml", Integer.valueOf(zzzxr.zzNG(strZz0)));
        Ref<String> ref = new Ref<>(null);
        zzZYD zzzydZzY = zzzxr.zzY(zzzxr.zzZlV().zzZmN(), str, "application/vnd.ms-office.chartstyle+xml", strZz0, ref);
        ref.get();
        zzzxr.zzY(zzzydZzY);
        zzCX.zzY(zzd3, zzzxr);
        zzzxr.zzZlX();
    }

    private static void zzX(zzD8 zzd8, zzZXR zzzxr) throws Exception {
        if (zzd8.zzZHH().size() == 0) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        boolean zZz33 = zzd8.zz33();
        zzzydZzZlV.zzY(zzFX.zzE("fmtOvrs", zZz33));
        Iterator<zzEV> it = zzd8.zzZHH().iterator();
        while (it.hasNext()) {
            zzFX.zzZ(it.next(), zzzxr, zZz33);
        }
        zzFX.zzE("fmtOvrs", zZz33);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzD8 zzd8, zzZYD zzzyd) {
        boolean zZz33 = zzd8.zz33();
        if (zzd8.zzZHN() < 0) {
            if (zzd8.zzZHO() != 2) {
                zzzyd.zzX(zzFX.zzE("style", zZz33), "val", Integer.valueOf(zzd8.zzZHO()));
                return;
            }
            return;
        }
        boolean z = zzzyd.zzZtY() == 2;
        zzzyd.zzY("mc:AlternateContent");
        zzzyd.zz0("xmlns:mc", zzZX5.zz9(14, z));
        zzzyd.zzY("mc:Choice");
        zzzyd.zz0("Requires", "c14");
        zzzyd.zz0("xmlns:c14", zzZX5.zz9(25, z));
        zzzyd.zzX("c14:style", "val", Integer.valueOf(zzd8.zzZHN()));
        zzzyd.zzo();
        zzzyd.zzY("mc:Fallback");
        zzzyd.zzX(zzFX.zzE("style", zZz33), "val", Integer.valueOf(zzd8.zzZHO()));
        zzzyd.zzo();
        zzzyd.zzo();
    }

    private static void zzZ(zzG2 zzg2, zzZXR zzzxr, boolean z) {
        if (zzg2 == null) {
            return;
        }
        zzzxr.zzZlV().zzX(zzFX.zzE("clrMapOvr", z), "bg1", zzg2.zzZf5, "tx1", zzg2.zzZf4, "bg2", zzg2.zzZf3, "tx2", zzg2.zzZf2, "accent1", zzg2.zzZf1, "accent2", zzg2.zzZf0, "accent3", zzg2.zzZeZ, "accent4", zzg2.zzZeY, "accent5", zzg2.zzZeX, "accent6", zzg2.zzZeW, "hlink", zzg2.zzZeV, "folHlink", zzg2.zzZeU);
    }

    private static void zzZ(Theme theme, zzZXR zzzxr) throws Exception {
        if (theme == null) {
            return;
        }
        zzZXS.zzZ(theme, zzzxr, true);
    }

    private static void zzZ(zzDT zzdt, zzZXR zzzxr, boolean z) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzFX.zzE("plotArea", z));
        if (!z) {
            zzFX.zzZ(zzFX.zzY0(z), zzdt.zz3y(), zzzxr, z);
            Iterator<zzGK> it = zzdt.zzZJf().iterator();
            while (it.hasNext()) {
                zzE6.zzZ(it.next(), zzzxr, z);
            }
        } else {
            zzZ(zzdt, zzzxr);
        }
        for (ChartAxis chartAxis : zzdt.zz3G()) {
            if (z) {
                zzG9.zzY(chartAxis, zzzxr);
            } else {
                zzG9.zzZ(chartAxis, zzzxr);
            }
        }
        if (!z) {
            zzZ(zzdt.getDataTable(), zzzxr, z);
        }
        zzFX.zzZ(zzdt.zzaQ(), zzzxr, z, (String) null);
        zz7Z.zzZ(zzFX.zzY0(z), zzdt.getExtensions(), zzzxr);
        zzFX.zzE("plotArea", z);
        zzzydZzZlV.zzo();
    }

    private static void zzY(zzG1 zzg1, zzZXR zzzxr) throws Exception {
        if (zzg1 == null) {
            return;
        }
        String strZz0 = zzZWV.zz0(53, zzzxr.getCompliance() == 2);
        String str = com.aspose.words.internal.zzZKN.format("chart/colors{0}.xml", Integer.valueOf(zzzxr.zzNG(strZz0)));
        Ref<String> ref = new Ref<>(null);
        zzZYD zzzydZzY = zzzxr.zzY(zzzxr.zzZlV().zzZmN(), str, "application/vnd.ms-office.chartcolorstyle+xml", strZz0, ref);
        ref.get();
        zzzxr.zzY(zzzydZzY);
        zzFY.zzZ(zzg1, zzzxr);
        zzzxr.zzZlX();
    }

    private static void zzY(zzEY zzey, zzZXR zzzxr, boolean z) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzFX.zzE("chart", z));
        zzFX.zzZ(zzey.getDCTitle(), zzzxr, zzey.zzZLY(), z, false);
        if (!z) {
            zzzydZzZlV.zzX(zzFX.zzE("autoTitleDeleted", z), "val", Boolean.valueOf(zzey.zzZLY()));
            zzFX.zzZ(zzey.zzZLR(), zzzxr, z);
            zzFX.zzZ(zzey, zzzxr, z);
            zzFX.zzZ(zzFX.zzE("floor", z), zzey.zzZLU(), zzzxr, z);
            zzFX.zzZ(zzFX.zzE("sideWall", z), zzey.zzZLT(), zzzxr, z);
            zzFX.zzZ(zzFX.zzE("backWall", z), zzey.zzZLV(), zzzxr, z);
        }
        zzZ(zzey.zz45(), zzzxr, z);
        zzFX.zzZ(zzey.getLegend(), zzzxr, z);
        if (!z) {
            zzFX.zzZ(zzFX.zzE("plotVisOnly", z), zzey.zzZLX(), zzzydZzZlV);
            zzzydZzZlV.zzX(zzFX.zzE("dispBlanksAs", z), "val", zzC6.zzK0(zzey.zzZLS()));
            zzzydZzZlV.zzX(zzFX.zzE("showDLblsOverMax", z), "val", Boolean.valueOf(zzey.zzZLW()));
        }
        zz7Z.zzZ(zzFX.zzY0(z), zzey.getExtensions(), zzzxr);
        zzFX.zzE("chart", z);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzDT zzdt, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzFX.zzE("plotAreaRegion", true));
        zzFX.zzZ(zzFX.zzE("plotSurface", true), zzdt.zzZJ9(), zzzxr, true);
        zzDC.zzZ(zzdt.zzZJd(), zzzxr);
        zz7Z.zzZ(zzFX.zzY0(true), zzdt.zzZJ8(), zzzxr);
        zzFX.zzE("plotAreaRegion", true);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(ChartDataTable chartDataTable, zzZXR zzzxr, boolean z) throws Exception {
        if (chartDataTable == null || !chartDataTable.getShow()) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzFX.zzE("dTable", z));
        zzzydZzZlV.zzX(zzFX.zzE("showHorzBorder", z), "val", Boolean.valueOf(chartDataTable.hasHorizontalBorder()));
        zzzydZzZlV.zzX(zzFX.zzE("showVertBorder", z), "val", Boolean.valueOf(chartDataTable.hasVerticalBorder()));
        zzzydZzZlV.zzX(zzFX.zzE("showOutline", z), "val", Boolean.valueOf(chartDataTable.hasOutlineBorder()));
        zzzydZzZlV.zzX(zzFX.zzE("showKeys", z), "val", Boolean.valueOf(chartDataTable.hasLegendKeys()));
        zzFX.zzZ(chartDataTable.zzaQ(), zzzxr, z, (String) null);
        zzFX.zzZ(chartDataTable.zzaR(), zzzxr, z);
        zzFX.zzE("dTable", z);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzD8 zzd8, zzZXR zzzxr) throws Exception {
        String str;
        boolean zZz33 = zzd8.zz33();
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        String strZzNE = null;
        if (zzd8.zzZHV() != null) {
            zzYO2 zzyo2 = (zzYO2) com.aspose.words.internal.zzZKW.zzZ(zzd8.zzZHV(), zzYO2.class);
            boolean z = zzyo2 != null;
            String contentType = z ? zzyo2.getContentType() : "application/vnd.openxmlformats-officedocument.oleObject";
            zzZWV zzzwvZzZmp = zzzxr.zzZmp();
            String str2 = z ? zzzwvZzZmp.getPackage() : zzzwvZzZmp.zzZkC();
            if (z) {
                str = "/word/embeddings/Microsoft_Excel_Worksheet{0}{1}";
            } else {
                str = "/word/embeddings/OleObject{0}{1}";
            }
            String strZzNs = zzZXP.zzNs(contentType);
            if ("application/octet-stream".equals(contentType)) {
                strZzNs = zzZXP.zzNs("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
            }
            String str3 = com.aspose.words.internal.zzZKN.format(str, Integer.valueOf(zzzxr.zzNG(str2)), strZzNs);
            Ref<String> ref = new Ref<>(null);
            com.aspose.words.internal.zz77 zz77VarZzZ = zzzxr.zzZmf().zzZ(zzzydZzZlV.zzZmN(), str3, contentType, str2, ref);
            String str4 = ref.get();
            if (z) {
                zzyo2.zzR1().zzH(0L);
                com.aspose.words.internal.zzZYQ.zzX(zzyo2.zzR1(), zz77VarZzZ.zzR1());
            } else {
                new com.aspose.words.internal.zzKD(((zzYOC) zzd8.zzZHV()).zzYrr()).zzL(zz77VarZzZ.zzR1());
            }
            strZzNE = str4;
        } else if (com.aspose.words.internal.zzZYD.zzXk(zzd8.zzZHU())) {
            strZzNE = zzzxr.zzNE(zzd8.zzZHU());
        }
        if (com.aspose.words.internal.zzZYD.zzXk(strZzNE)) {
            zzzydZzZlV.zzY(zzFX.zzE("externalData", zZz33));
            if (zzzxr.getCompliance() == 2 && zZz33) {
                zzzydZzZlV.zz0("xmlns:p5", zzZX5.zz9(0, false));
                zzzydZzZlV.zz0("p5:id", strZzNE);
            } else {
                zzzydZzZlV.zz0("r:id", strZzNE);
            }
            if (!zzd8.getAutoUpdate()) {
                if (zZz33) {
                    zzzydZzZlV.zzx(zzFX.zzE("autoUpdate", true), zzd8.getAutoUpdate());
                } else {
                    zzzydZzZlV.zzX(zzFX.zzE("autoUpdate", false), "val", Boolean.valueOf(zzd8.getAutoUpdate()));
                }
            }
            zzFX.zzE("externalData", zZz33);
            zzzydZzZlV.zzo();
        }
    }

    private static void zzY(zz2O zz2o, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("cdr:sp");
        zz4Y.zzZ("cdr", zz2o, zzzxr);
        zz1T.zzZ("cdr", zz2o, zzzxr);
        zz1I.zzZ("cdr", zz2o.zzZTj(), zzzxr);
        if (zz2o.zzZAk() != null) {
            zz0F.zzZ("cdr:txBody", zz2o.zzZAk().zzZCZ(), zzzxr);
        }
        zzzydZzZlV.zzo();
    }

    private static void zzY(zzD8 zzd8, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        boolean zZz33 = zzd8.zz33();
        zzzydZzZlV.zzY(zzFX.zzE("chartData", zZz33));
        zzZ(zzd8, zzzxr);
        Iterator<zzFV> it = zzd8.zzZHI().iterator();
        while (it.hasNext()) {
            zzFX.zzZ(it.next(), zzzxr, zZz33);
        }
        zz7Z.zzZ(zzFX.zzY0(zZz33), zzd8.zzZHI().getExtensions(), zzzxr);
        zzFX.zzE("chartData", zZz33);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(ShapeBase shapeBase, zzZXR zzzxr, boolean z) throws Exception {
        if (shapeBase.getChildNodes(0, false).getCount() == 0) {
            return;
        }
        String strZz0 = zzZWV.zz0(39, zzzxr.getCompliance() == 2);
        String str = com.aspose.words.internal.zzZKN.format("/word/drawings/drawing{0}.xml", Integer.valueOf(zzzxr.zzNG(strZz0)));
        Ref<String> ref = new Ref<>(null);
        zzZYD zzzydZzY = zzzxr.zzY(zzzxr.zzZlV().zzZmN(), str, "application/vnd.openxmlformats-officedocument.drawingml.chartshapes+xml", strZz0, ref);
        zzzxr.zzZlV().zzX(zzFX.zzE("userShapes", z), "r:id", ref.get());
        zzzxr.zzY(zzzydZzY);
        zzX(shapeBase, zzzxr);
        zzzxr.zzZlX();
    }

    private static void zzZ(zz2O zz2o, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("cdr:cxnSp");
        zz4Y.zzZ("cdr", zz2o, zzzxr);
        zz1T.zzZ("cdr", zz2o, zzzxr);
        zz1I.zzZ("cdr", zz2o.zzZTj(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zz3V zz3v, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("cdr:pic");
        zz4Y.zzZ("cdr", zz3v, zzzxr);
        zz7T.zzZ("cdr", zz3v.zzZwy(), zzzxr);
        zz1T.zzZ("cdr", zz3v, zzzxr);
        zz1I.zzZ("cdr", zz3v.zzZTj(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(String str, long j, zzZYD zzzyd) {
        zzzyd.zzY(str);
        zzzyd.zzZ("cdr:x", com.aspose.words.internal.zzJB.zzX(Float.intBitsToFloat((int) j), 5));
        zzzyd.zzZ("cdr:y", com.aspose.words.internal.zzJB.zzX(com.aspose.words.internal.zzZPY.zzYC(j), 5));
        zzzyd.zzo();
    }
}
