package com.aspose.words;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.firebase.messaging.Constants;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18437z2;
import com.miui.penengine.p596e.C18773h;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzFX {
    public static String zzE(String str, boolean z) {
        return zzZm(zzY0(z), str);
    }

    private static void zzX(String str, zzBW zzbw, zzZXR zzzxr) {
        if (zzbw == null) {
            return;
        }
        zzzxr.zzZlV().zzY(zzE(str, true));
        zzBN.zzW("a", zzbw, zzzxr);
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzE(str, true);
        zzzydZzZlV.zzo();
    }

    private static void zzY(zzCM zzcm, zzZXR zzzxr, boolean z) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzE("rich", z));
        zz0F.zzZ("a:bodyPr", zzcm.zzZGw().zzZtK(), zzzxr);
        zzzydZzZlV.zzZ("a:lstStyle", (String) null);
        Iterator<zz4A> it = zzcm.zzZGw().zzMi().iterator();
        while (it.hasNext()) {
            zz0F.zzZ(it.next(), zzzxr);
        }
        zzE("rich", z);
        zzzydZzZlV.zzo();
    }

    public static String zzY0(boolean z) {
        return z ? "cx" : "c";
    }

    public static void zzZ(zzD9 zzd9, zzZXR zzzxr, boolean z, String str) throws Exception {
        if (zzd9 == null || zzd9.isEmpty()) {
            return;
        }
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            str = zzY0(z);
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzZm(str, "spPr"));
        if (zzd9.zzZI3() == null || zzd9.zzZI3().zzZQ4() != 0) {
            zz7T.zzZ(zzd9.zzZI3(), zzzxr, false);
        } else {
            zz7T.zzZ("a", (zzH0) zzd9.zzZI3(), zzzxr);
        }
        zz4B.zzZ("a:ln", zzd9.zzZI2(), zzzxr);
        zz2A.zzZ(zzd9.zzZTe(), zzzxr, false);
        zzJN.zzZ(zzd9.zzZI1(), zzzxr, false);
        zzJN.zzZ(zzd9.zzZI0(), zzzxr, false);
        zz7Z.zzZ(zzY0(z), zzd9.getExtensions(), zzzxr);
        zzZm(str, "spPr");
        zzzydZzZlV.zzo();
    }

    private static String zzZm(String str, String str2) {
        return com.aspose.words.internal.zzZKN.format("{0}:{1}", str, str2);
    }

    private static String zzg(int i, boolean z) {
        if (i == 1) {
            return zzE("strRef", z);
        }
        if (i == 2) {
            return zzE("numRef", z);
        }
        if (i == 3) {
            return zzE(z ? "strDim" : "multiLvlStrRef", z);
        }
        if (i != 4) {
            throw new IllegalArgumentException("Unexpected Dml Chart Value Reference Type");
        }
        if (z) {
            return zzE("numDim", z);
        }
        throw new IllegalArgumentException("Unexpected Dml Chart Value Reference Type");
    }

    private static void zzY(String str, zzFT zzft, zzZXR zzzxr) {
        Object objZzLu = zzft.zzLu(11);
        Object objZzLu2 = zzft.zzLu(8);
        Object objZzLu3 = zzft.zzLu(12);
        if (objZzLu == null && objZzLu2 == null && objZzLu3 == null) {
            return;
        }
        zzzxr.zzZlV().zzX(com.aspose.words.internal.zzZKN.format("{0}:visibility", str), "seriesName", objZzLu, "categoryName", objZzLu2, "value", objZzLu3);
    }

    public static void zzZ(zzCL zzcl, zzZXR zzzxr, boolean z) throws Exception {
        if (zzcl == null || zzcl.isEmpty()) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzE("txPr", z));
        zz0F.zzZ("a:bodyPr", zzcl.zzZHh(), zzzxr);
        zzzydZzZlV.zzZ("a:lstStyle", (String) null);
        zz0F.zzZ(zzcl.zzZGt(), zzzxr);
        zzE("txPr", z);
        zzzydZzZlV.zzo();
    }

    public static void zzZ(zzCU zzcu, zzZXR zzzxr, boolean z, boolean z2, boolean z3) throws Exception {
        if (zzcu == null || z) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzE(NoteMeta.PROPERTY_TITLE, z2));
        if (z2 && !z3) {
            if (zzcu.zz2W() != 1) {
                zzzydZzZlV.zz0("pos", zzC6.zzJD(zzcu.zz2W()));
            }
            if (zzcu.zz2V() != 1) {
                zzzydZzZlV.zz0("align", zzC6.zzJC(zzcu.zz2V()));
            }
            zzzydZzZlV.zzw("overlay", zzcu.getOverlay());
        }
        zzZ(zzcu.zz3u(), zzzxr, z2);
        if (!z2) {
            zzZ(zzY0(z2), zzcu.zz3y(), zzzxr, z2);
            zzzydZzZlV.zzX(zzE("overlay", z2), "val", Boolean.valueOf(zzcu.getOverlay()));
        }
        zzZ(zzcu.zzaQ(), zzzxr, z2, (String) null);
        zzZ(zzcu.zzaR(), zzzxr, z2);
        zz7Z.zzZ(zzY0(z2), zzcu.getExtensions(), zzzxr);
        zzE(NoteMeta.PROPERTY_TITLE, z2);
        zzzydZzZlV.zzo();
    }

    public static void zzZ(zzCM zzcm, zzZXR zzzxr, boolean z) throws Exception {
        if (zzcm == null) {
            return;
        }
        if (zzcm.zzZGz() == 1 && zzcm.zzZGw().zzMi().size() == 0) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzE("tx", z));
        if (zzcm.zzZGy() == null) {
            if (zzcm.zzZGz() == 1) {
                zzY(zzcm, zzzxr, z);
            } else if (z) {
                zzZ(zzcm, zzzxr);
            } else {
                zzzydZzZlV.zzZ(zzE("v", z), zzcm.zzZGx());
            }
        } else {
            zzZ(zzcm.zzZGy(), zzzxr, false);
        }
        zz7Z.zzZ(zzY0(z), zzcm.getExtensions(), zzzxr);
        zzE("tx", z);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzCM zzcm, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzE("txData", true));
        if (zzcm.zzZGv() != null) {
            zzZ(zzE("f", true), zzcm.zzZGv(), zzzydZzZlV);
        }
        if (zzcm.zzYR() != null) {
            zzzydZzZlV.zzY(zzE("v", true));
            zzzydZzZlV.writeString(zzcm.zzYR());
            zzE("v", true);
            zzzydZzZlV.zzo();
        }
        zzE("txData", true);
        zzzydZzZlV.zzo();
    }

    public static void zzZ(String str, zzFK zzfk, zzZXR zzzxr, boolean z) throws Exception {
        zzCE zzceZzZN4 = zzfk.zzZN4();
        if (zzceZzZN4 == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(str);
        if (!zzfk.zzZN3().zzZG0()) {
            zzZ(zzfk.zzZN3(), zzzxr, false);
        } else if (zzceZzZN4.getValueType() == 3) {
            zzzydZzZlV.zzY("mc:AlternateContent");
            zzzydZzZlV.zz0("xmlns:mc", zzZX5.zz9(14, false));
            zzzydZzZlV.zzY("mc:Choice");
            zzzydZzZlV.zz0("Requires", "c16ac");
            zzzydZzZlV.zz0("xmlns:c16ac", zzZX5.zz9(39, false));
            zzZ(zzceZzZN4, zzzxr, false, false);
            zzzydZzZlV.zzo();
            zzzydZzZlV.zzY("mc:Fallback");
            zzZ(zzfk.zzZN6(), zzzxr, false, false);
            zzzydZzZlV.zzo();
            zzzydZzZlV.zzo();
        } else {
            zzZ(zzceZzZN4, zzzxr, false, false);
        }
        zzzydZzZlV.zzo();
    }

    public static void zzZ(String str, zzEH zzeh, zzZXR zzzxr, boolean z) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        if (zzeh != null) {
            zzzydZzZlV.zzY(com.aspose.words.internal.zzZKN.format("{0}:layout", str));
            zzzydZzZlV.zzY(zzE("manualLayout", z));
            if (zzeh.zzZLp() == 0) {
                zzzydZzZlV.zzX(zzE("layoutTarget", z), "val", zzC6.zzJU(zzeh.zzZLp()));
            }
            zzZ(zzeh.zzZLn(), zzzydZzZlV, zzE("xMode", z));
            zzZ(zzeh.zzZLm(), zzzydZzZlV, zzE("yMode", z));
            zzZ(zzeh.zzZLo(), zzzydZzZlV, zzE("wMode", z));
            zzZ(zzeh.zzZLq(), zzzydZzZlV, zzE("hMode", z));
            if (zzeh.zzZLl() || zzeh.zzZLk()) {
                zzzydZzZlV.zzX(zzE("x", z), "val", com.aspose.words.internal.zzJB.zzZW(zzeh.getLeft()));
                zzzydZzZlV.zzX(zzE("y", z), "val", com.aspose.words.internal.zzJB.zzZW(zzeh.getTop()));
            }
            if (zzeh.zzZLj()) {
                zzzydZzZlV.zzX(zzE("w", z), "val", com.aspose.words.internal.zzJB.zzZW(zzeh.getWidth()));
            }
            if (zzeh.zzZLi()) {
                zzzydZzZlV.zzX(zzE(C18773h.f57233c, z), "val", com.aspose.words.internal.zzJB.zzZW(zzeh.getHeight()));
            }
            zz7Z.zzZ(zzY0(z), zzeh.getExtensions(), zzzxr);
            zzE("manualLayout", z);
            zzzydZzZlV.zzo();
            com.aspose.words.internal.zzZKN.format("{0}:layout", str);
            zzzydZzZlV.zzo();
            return;
        }
        zzzydZzZlV.zzZ(com.aspose.words.internal.zzZKN.format("{0}:layout", str), (String) null);
    }

    public static void zzZ(String str, boolean z, zzZYD zzzyd) {
        if (z) {
            zzzyd.zzX(str, "val", Boolean.valueOf(z));
        }
    }

    public static void zzZ(String str, zzCW zzcw, zzZXR zzzxr, boolean z) throws Exception {
        if (zzcw == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(str);
        if (!z) {
            zzzydZzZlV.zzX(zzE("thickness", z), "val", Integer.valueOf(zzcw.getThickness()));
        }
        zzZ(zzcw.zzaQ(), zzzxr, z, (String) null);
        if (!z) {
            zzZ(zzcw.zz3e(), zzzydZzZlV, z);
        }
        zz7Z.zzZ(zzY0(z), zzcw.getExtensions(), zzzxr);
        zzzydZzZlV.zzo();
    }

    public static void zzZ(zzE3 zze3, zzZYD zzzyd, boolean z) {
        if (zze3 == null) {
            return;
        }
        zzzyd.zzY(zzE("pictureOptions", z));
        zzZ(zzE("applyToEnd", z), zze3.zzZKZ(), zzzyd);
        zzZ(zzE("applyToFront", z), zze3.zzZL1(), zzzyd);
        zzZ(zzE("applyToSides", z), zze3.zzZL0(), zzzyd);
        zzzyd.zzX(zzE("pictureFormat", z), "val", zzC6.zzJP(zze3.getPictureFormat()));
        if (!com.aspose.words.internal.zzAN.zzZD(zze3.zzZKY())) {
            zzzyd.zzX(zzE("pictureStackUnit", z), "val", Double.valueOf(zze3.zzZKY()));
        }
        zzE("pictureOptions", z);
        zzzyd.zzo();
    }

    public static void zzZ(ChartLegend chartLegend, zzZXR zzzxr, boolean z) throws Exception {
        if (chartLegend == null || chartLegend.getPosition() == 0) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzE("legend", z));
        if (z) {
            if (chartLegend.zz2W() != 1) {
                zzzydZzZlV.zz0("pos", zzC6.zzJD(chartLegend.zz2W()));
            }
            if (chartLegend.zz2V() != 1) {
                zzzydZzZlV.zz0("align", zzC6.zzJC(chartLegend.zz2V()));
            }
            zzzydZzZlV.zzw("overlay", chartLegend.getOverlay());
        } else {
            zzzydZzZlV.zzX(zzE("legendPos", z), "val", zzC6.zzJT(chartLegend.getPosition()));
            Iterator<ChartLegendEntry> it = chartLegend.getLegendEntries().zz2T().iterator();
            while (it.hasNext()) {
                zzZ(it.next(), zzzxr, z);
            }
            zzZ(zzY0(z), chartLegend.zz3y(), zzzxr, z);
            zzzydZzZlV.zzX(zzE("overlay", z), "val", Boolean.valueOf(chartLegend.getOverlay()));
        }
        zzZ(chartLegend.zzaQ(), zzzxr, z, (String) null);
        zzZ(chartLegend.zzaR(), zzzxr, z);
        zz7Z.zzZ(zzY0(z), chartLegend.getExtensions(), zzzxr);
        zzE("legend", z);
        zzzydZzZlV.zzo();
    }

    public static void zzZ(zzDN zzdn, zzZYD zzzyd, boolean z) {
        if (zzdn == null || !zzdn.zzZIK()) {
            return;
        }
        zzzyd.zzY(zzE("protection", z));
        zzZ(zzE("chartObject", z), zzdn.zzZIP(), zzzyd);
        zzZ(zzE(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, z), zzdn.zzZIO(), zzzyd);
        zzZ(zzE("formatting", z), zzdn.zzZIN(), zzzyd);
        zzZ(zzE("selection", z), zzdn.zzZIM(), zzzyd);
        zzZ(zzE("userInterface", z), zzdn.zzZIL(), zzzyd);
        zzE("protection", z);
        zzzyd.zzo();
    }

    public static void zzZ(zzE8 zze8, zzZYD zzzyd, boolean z) {
        String strZzZLa;
        if (zze8 == null) {
            return;
        }
        zzzyd.zzY(zzE("numFmt", z));
        if (!com.aspose.words.internal.zzZKN.zzU3(zze8.zzZLa())) {
            strZzZLa = zze8.zzZLa();
        } else {
            strZzZLa = "General";
        }
        zzzyd.zz0("formatCode", strZzZLa);
        zzzyd.zzx("sourceLinked", zze8.zzZLb());
        zzE("numFmt", z);
        zzzyd.zzo();
    }

    public static void zzZ(ChartDataLabelCollection chartDataLabelCollection, zzZXR zzzxr, boolean z) throws Exception {
        Object objZzLu;
        zzFT zzftZz3q = chartDataLabelCollection.zz3q();
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzE(z ? "dataLabels" : "dLbls", z));
        if (z && (objZzLu = zzftZz3q.zzLu(2)) != null) {
            zzzydZzZlV.zz0("pos", zzC6.zzK1(((Integer) objZzLu).intValue()));
        }
        ArrayList<ChartDataLabel> arrayListZz3k = chartDataLabelCollection.zz3k();
        Iterator<ChartDataLabel> it = arrayListZz3k.iterator();
        while (it.hasNext()) {
            zzZ(it.next(), zzzxr, z);
        }
        zzZ(zzY0(z), chartDataLabelCollection.zz3q(), zzzxr, z, false);
        if (z) {
            for (ChartDataLabel chartDataLabel : arrayListZz3k) {
                if (chartDataLabel.isHidden()) {
                    zzzydZzZlV.zzX(zzE("dataLabelHidden", true), "idx", Integer.valueOf(chartDataLabel.getIndex()));
                }
            }
        }
        zzE(z ? "dataLabels" : "dLbls", z);
        zzzydZzZlV.zzo();
    }

    public static void zzZ(String str, zzET zzet, zzZXR zzzxr, boolean z) throws Exception {
        if (zzet == null) {
            return;
        }
        zzzxr.zzZlV().zzY(zzE(str, z));
        zzZ(zzet.zzaQ(), zzzxr, z, (String) null);
        zz7Z.zzZ(zzY0(z), zzet.getExtensions(), zzzxr);
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzE(str, z);
        zzzydZzZlV.zzo();
    }

    public static void zzZ(String str, zzD9 zzd9, zzZXR zzzxr, boolean z, boolean z2) throws Exception {
        if (zzd9 != null) {
            if (!zzd9.isEmpty() || z) {
                zzzxr.zzZlV().zzY(str);
                zzZ(zzd9, zzzxr, z2, (String) null);
                zzzxr.zzZlV().zzo();
            }
        }
    }

    public static void zzZ(ChartSeries chartSeries, zzZXR zzzxr, boolean z) throws Exception {
        boolean zZzO2 = ChartDataPointCollection.zzO2(chartSeries.zz3I().zzZQO());
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        for (ChartDataPoint chartDataPoint : chartSeries.getDataPoints().zz3a()) {
            if (chartDataPoint.zz3n()) {
                zzzydZzZlV.zzY(zzE(z ? "dataPt" : "dPt", z));
                zzFN zzfnZz3d = chartDataPoint.zz3d();
                if (z) {
                    zzzydZzZlV.zzZj("idx", chartDataPoint.getIndex());
                } else {
                    zzZ(zzfnZz3d, 0, zzzxr, z);
                    if (zZzO2 || chartDataPoint.zz3d().zzLh(2)) {
                        zzzydZzZlV.zzX(zzE("invertIfNegative", false), "val", Boolean.valueOf(chartDataPoint.getInvertIfNegative()));
                    }
                    zzZ(zzfnZz3d, 3, zzzxr, z);
                    zzZ(zzfnZz3d, 1, zzzxr, z);
                    zzZ(zzfnZz3d, 4, zzzxr, z);
                    zzZ(zzfnZz3d, 6, zzzxr, z);
                }
                zzZ(zzfnZz3d, 5, zzzxr, z);
                zzZ(zzfnZz3d, 7, zzzxr, z);
                zzE(z ? "dataPt" : "dPt", z);
                zzzydZzZlV.zzo();
            }
        }
    }

    public static void zzZ(ChartMarker chartMarker, zzZXR zzzxr, boolean z) throws Exception {
        zzEF zzefZz2O = chartMarker.zz2O();
        if (zzefZz2O.getCount() == 0) {
            return;
        }
        zzzxr.zzZlV().zzY(zzE(RequestParameters.MARKER, z));
        zzZ(zzefZz2O, 0, zzzxr, z);
        zzZ(zzefZz2O, 1, zzzxr, z);
        zzZ(zzefZz2O, 2, zzzxr, z);
        zzZ(zzefZz2O, 3, zzzxr, z);
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzE(RequestParameters.MARKER, z);
        zzzydZzZlV.zzo();
    }

    public static void zzZ(zzF7 zzf7, zzZXR zzzxr) throws Exception {
        if (zzf7 == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzE("errBars", false));
        if (zzf7.zzZMl() != 1) {
            zzzydZzZlV.zzX(zzE("errDir", false), "val", zzC6.zzJZ(zzf7.zzZMl()));
        }
        zzzydZzZlV.zzX(zzE("errBarType", false), "val", zzC6.zzJY(zzf7.zzZMm()));
        zzzydZzZlV.zzX(zzE("errValType", false), "val", zzC6.zzJX(zzf7.zzZMk()));
        zzzydZzZlV.zzX(zzE("noEndCap", false), "val", Boolean.valueOf(zzf7.zzZMh()));
        zzZ(zzE("plus", false), zzf7.zzZMi().zzZMu(), zzzxr, false);
        zzZ(zzE("minus", false), zzf7.zzZMj().zzZMu(), zzzxr, false);
        if (!com.aspose.words.internal.zzAN.zzZD(zzf7.zzZMg())) {
            zzzydZzZlV.zzX(zzE("val", false), "val", Double.valueOf(zzf7.zzZMg()));
        }
        zzZ(zzf7.zzaQ(), zzzxr, false, (String) null);
        zz7Z.zzZ(zzY0(false), zzf7.getExtensions(), zzzxr);
        zzE("errBars", false);
        zzzydZzZlV.zzo();
    }

    public static void zzZ(ArrayList<zzCR> arrayList, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        for (zzCR zzcr : arrayList) {
            zzzydZzZlV.zzY(zzE("trendline", false));
            zzCO zzcoZzZGP = zzcr.zzZGP();
            zzZ(zzcoZzZGP, 5, zzzxr, false);
            zzZ(zzcoZzZGP, 8, zzzxr, false);
            zzZ(zzcoZzZGP, 10, zzzxr, false);
            zzZ(zzcoZzZGP, 6, zzzxr, false);
            zzZ(zzcoZzZGP, 7, zzzxr, false);
            zzZ(zzcoZzZGP, 3, zzzxr, false);
            zzZ(zzcoZzZGP, 0, zzzxr, false);
            zzZ(zzcoZzZGP, 4, zzzxr, false);
            zzZ(zzcoZzZGP, 2, zzzxr, false);
            zzZ(zzcoZzZGP, 1, zzzxr, false);
            zzZ(zzcoZzZGP, 9, zzzxr, false);
            zzZ(zzcoZzZGP, 11, zzzxr, false);
            zzE("trendline", false);
            zzzydZzZlV.zzo();
        }
    }

    public static void zzZ(zzEY zzey, zzZXR zzzxr, boolean z) throws Exception {
        zzC9 zzc9ZzZLQ = zzey.zzZLQ();
        if (zzc9ZzZLQ == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzE("view3D", z));
        zzzydZzZlV.zzX(zzE("rotX", z), "val", Integer.valueOf(zzc9ZzZLQ.zzZJF()));
        zzZ(zzE("hPercent", z), zzc9ZzZLQ.zzZFV(), 100.0d, zzzydZzZlV);
        int iZzZFS = zzc9ZzZLQ.zzZFS();
        if (zzey.zz45().zzZJd().zzZQO() == 8 && !zzc9ZzZLQ.zzZFR()) {
            iZzZFS = 0;
        }
        zzzydZzZlV.zzX(zzE("rotY", z), "val", Integer.valueOf(iZzZFS));
        zzZ(zzE("depthPercent", z), zzc9ZzZLQ.zzZFW(), 100.0d, zzzydZzZlV);
        zzzydZzZlV.zzX(zzE("rAngAx", z), "val", Boolean.valueOf(zzc9ZzZLQ.zzZFT()));
        zzZ(zzE("perspective", z), zzc9ZzZLQ.zzZFU(), 30.0d, zzzydZzZlV);
        zz7Z.zzZ(zzY0(z), zzc9ZzZLQ.getExtensions(), zzzxr);
        zzE("view3D", z);
        zzzydZzZlV.zzo();
    }

    public static void zzZ(zzE1 zze1, zzZXR zzzxr, boolean z) throws Exception {
        if (zze1 == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzE("pivotFmts", z));
        for (zzE2 zze2 : zze1.zzZKU().zzCJ()) {
            zzzydZzZlV.zzY(zzE("pivotFmt", z));
            zzzydZzZlV.zzX(zzE("idx", z), "val", Integer.valueOf(zze2.getIndex()));
            zzZ(zze2.zzaQ(), zzzxr, z, (String) null);
            zzZ(zze2.zzaR(), zzzxr, z);
            zzZ(zze2.getMarker(), zzzxr, z);
            zzZ(zze2.zzZKW(), zzzxr, z);
            zz7Z.zzZ(zzY0(z), zze2.getExtensions(), zzzxr);
            zzE("pivotFmt", z);
            zzzydZzZlV.zzo();
        }
        zzE("pivotFmts", z);
        zzzydZzZlV.zzo();
    }

    public static void zzZ(zzE0 zze0, zzZXR zzzxr, boolean z) throws Exception {
        if (zze0 == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzE("pivotSource", z));
        zzzydZzZlV.zzZ(zzE("name", z), zze0.getName());
        zzzydZzZlV.zzX(zzE("fmtId", z), "val", Integer.valueOf(zze0.zzZKS()));
        zz7Z.zzZ(zzY0(z), zze0.getExtensions(), zzzxr);
        zzE("pivotSource", z);
        zzzydZzZlV.zzo();
    }

    public static void zzZ(AxisDisplayUnit axisDisplayUnit, zzZXR zzzxr, boolean z) throws Exception {
        if (axisDisplayUnit == null || !axisDisplayUnit.isDefined()) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        String str = z ? "units" : "dispUnits";
        zzzydZzZlV.zzY(zzE(str, z));
        if (axisDisplayUnit.getUnit() != 0) {
            if (z) {
                if (axisDisplayUnit.getUnit() != 1) {
                    zzzydZzZlV.zz0("unit", zzC6.zzK4(axisDisplayUnit.getUnit()));
                }
            } else if (axisDisplayUnit.getUnit() != 1) {
                zzzydZzZlV.zzX(zzE("builtInUnit", z), "val", zzC6.zzK4(axisDisplayUnit.getUnit()));
            } else {
                zzzydZzZlV.zzX(zzE("custUnit", z), "val", com.aspose.words.internal.zzJB.zzZW(axisDisplayUnit.getCustomUnit()));
            }
        }
        zzZ(axisDisplayUnit.zzb2(), zzzxr, z);
        zz7Z.zzZ(zzY0(z), axisDisplayUnit.getExtensions(), zzzxr);
        zzE(str, z);
        zzzydZzZlV.zzo();
    }

    public static void zzZ(AxisScaling axisScaling, zzZXR zzzxr, boolean z) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzE("scaling", z));
        if (axisScaling.getType() == 1) {
            zzzydZzZlV.zzX(zzE("logBase", z), "val", com.aspose.words.internal.zzJB.zzZW(axisScaling.getLogBase()));
        }
        zzzydZzZlV.zzX(zzE("orientation", z), "val", zzC6.zzJQ(axisScaling.getOrientation()));
        if (!axisScaling.getMaximum().isAuto()) {
            zzzydZzZlV.zzX(zzE("max", z), "val", com.aspose.words.internal.zzJB.zzZW(axisScaling.getMaximum().getValue()));
        }
        if (!axisScaling.getMinimum().isAuto()) {
            zzzydZzZlV.zzX(zzE("min", z), "val", com.aspose.words.internal.zzJB.zzZW(axisScaling.getMinimum().getValue()));
        }
        zz7Z.zzZ(zzY0(z), axisScaling.getExtensions(), zzzxr);
        zzE("scaling", z);
        zzzydZzZlV.zzo();
    }

    public static void zzZ(zzG7 zzg7, zzZXR zzzxr, boolean z) throws Exception {
        if (zzg7 == null || zzg7.getCount() == 0) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzE("bandFmts", z));
        for (zzG8 zzg8 : zzg7.zzZOi()) {
            zzzydZzZlV.zzY(zzE("bandFmt", z));
            zzzydZzZlV.zzX(zzE("idx", z), "val", Integer.valueOf(zzg8.getIndex()));
            zzZ(zzg8.zzaQ(), zzzxr, z, (String) null);
            zzE("bandFmt", z);
            zzzydZzZlV.zzo();
        }
        zzE("bandFmts", z);
        zzzydZzZlV.zzo();
    }

    public static void zzZ(int[] iArr, zzZYD zzzyd, boolean z) {
        zzzyd.zzY(zzE("custSplit", z));
        for (int i : iArr) {
            zzzyd.zzX(zzE("secondPiePt", z), "val", Integer.valueOf(i));
        }
        zzE("custSplit", z);
        zzzyd.zzo();
    }

    public static void zzZ(zzCH zzch, zzZXR zzzxr, boolean z) throws Exception {
        if (zzch == null || zzch.isEmpty()) {
            return;
        }
        zzzxr.zzZlV().zzY(zzE("upDownBars", z));
        zzzxr.zzZlV().zzX(zzE("gapWidth", z), "val", Integer.valueOf(zzch.getGapWidth()));
        zzZ(zzE("upBars", z), zzch.zzZGi(), zzzxr, zzch.zzZGf(), z);
        zzZ(zzE("downBars", z), zzch.zzZGh(), zzzxr, zzch.zzZGe(), z);
        zz7Z.zzZ(zzY0(z), zzch.getExtensions(), zzzxr);
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzE("upDownBars", z);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzCB zzcb, zzZXR zzzxr, boolean z) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzg(zzcb.zzZN4().getValueType(), z));
        if (z) {
            zzzydZzZlV.zz0(C18437z2.f56754h, zzC6.zzJF(zzcb.zzZFY()));
            zzZ(zzE("f", z), zzcb.zzZGv(), zzzydZzZlV);
            zzZ(zzE("nf", z), zzcb.zzZFZ(), zzzydZzZlV);
            zzZ(zzcb.zzZN4(), zzzydZzZlV, z);
        } else {
            zzzydZzZlV.zzZ(zzE("f", z), zzcb.zzZGv().getValue());
            zzZ(zzcb.zzZN4(), zzzxr, true, z);
            zz7Z.zzZ(zzY0(z), zzcb.getExtensions(), zzzxr);
        }
        zzzydZzZlV.zzo();
    }

    private static void zzZ(String str, zzEU zzeu, zzZYD zzzyd) {
        if (zzeu == null || !com.aspose.words.internal.zzZYD.zzXk(zzeu.getValue())) {
            return;
        }
        zzzyd.zzY(str);
        if (zzeu.getDirection() != 0) {
            zzzyd.zz0("dir", zzC6.zzJE(zzeu.getDirection()));
        }
        zzzyd.writeString(zzeu.getValue());
        zzzyd.zzp();
    }

    public static void zzZ(String str, zzCE zzce, zzZXR zzzxr, boolean z) throws Exception {
        if (zzce == null || zzce.getValueCount() <= 0 || zzce.getValueType() == 0) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(str);
        if (zzce.getValueType() == 2 && com.aspose.words.internal.zzZYD.zzXk(zzce.getFormatCode())) {
            zzzydZzZlV.zzZ(zzE("formatCode", z), zzce.getFormatCode());
        }
        zzzydZzZlV.zzX(zzE("ptCount", z), "val", Integer.valueOf(zzce.getValueCount()));
        if (zzce.getValueType() == 3) {
            zzZ(zzce, zzzydZzZlV, false);
        } else {
            for (int i = 0; i < zzce.getValueCount(); i++) {
                zzCF zzcfZzKg = zzce.zzKg(i);
                if (zzcfZzKg != null) {
                    zzZ(zzcfZzKg, zzzydZzZlV, z);
                }
            }
        }
        zz7Z.zzZ(zzY0(z), zzce.getExtensions(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzCE zzce, zzZXR zzzxr, boolean z, boolean z2) throws Exception {
        zzZ(zzZ(zzce, z, z2), zzce, zzzxr, z2);
    }

    private static String zzZ(zzCE zzce, boolean z, boolean z2) {
        int valueType = zzce.getValueType();
        if (valueType == 1) {
            return zzE(z ? "strCache" : "strLit", z2);
        }
        if (valueType == 2) {
            return zzE(z ? "numCache" : "numLit", z2);
        }
        if (valueType != 3) {
            throw new IllegalArgumentException("Unexpected Dml Chart Value Type");
        }
        if (!z && !z2) {
            return "c16ac:multiLvlStrLit";
        }
        return zzE("multiLvlStrCache", z2);
    }

    private static void zzZ(zzCE zzce, zzZYD zzzyd, boolean z) {
        int size;
        String strZzZZ;
        zzFP zzfp;
        if (z) {
            size = zzce.zzZG8().size();
        } else {
            Iterator<zzCF> it = zzce.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(((zzEA) it.next()).zzZLe().size(), iMax);
            }
            size = iMax;
        }
        for (int i = 0; i < size; i++) {
            zzzyd.zzY(zzE("lvl", z));
            if (z && (zzfp = zzce.zzZG8().get(i)) != null) {
                zzzyd.zzZj("ptCount", zzfp.getValueCount());
                zzzyd.zz0("formatCode", zzfp.getFormatCode());
                zzzyd.zz0("name", zzfp.getName());
            }
            for (int i2 = 0; i2 <= zzce.zz2w(); i2++) {
                zzE9 zze9 = (zzE9) zzce.zzKg(i2);
                if (zze9 != null && zze9.zzZLe().size() > i && zze9.zzZLe().get(i) != null) {
                    zzzyd.zzY(zzE(TranslateLanguage.PORTUGUESE, z));
                    zzzyd.zzZj("idx", zze9.getIndex());
                    if (z) {
                        if (zzce.getValueType() == 3) {
                            strZzZZ = (String) zze9.zzZLe().get(i);
                        } else {
                            strZzZZ = com.aspose.words.internal.zzJB.zzZZ(((Double) zze9.zzZLe().get(i)).doubleValue());
                        }
                        zzzyd.writeString(strZzZZ);
                    } else {
                        zzzyd.zzZ(zzE("v", z), (String) zze9.zzZLe().get(i));
                    }
                    zzE(TranslateLanguage.PORTUGUESE, z);
                    zzzyd.zzo();
                }
            }
            zzE("lvl", z);
            zzzyd.zzo();
        }
    }

    private static void zzZ(zzCF zzcf, zzZYD zzzyd, boolean z) {
        if (zzcf.getValueType() == 0) {
            return;
        }
        zzzyd.zzY(zzE(TranslateLanguage.PORTUGUESE, z));
        zzzyd.zzZj("idx", zzcf.getIndex());
        if (zzcf.getValueType() == 1) {
            zzzyd.zzZ(zzE("v", z), zzcf.getStringValue());
        }
        if (zzcf.getValueType() == 2) {
            zzE7 zze7 = (zzE7) zzcf;
            if (com.aspose.words.internal.zzZYD.zzXk(zze7.zzZLa())) {
                zzzyd.zz0("formatCode", zze7.zzZLa());
            }
            zzzyd.zzZ(zzE("v", z), Double.isNaN(zze7.getValue()) ? "#N/A" : com.aspose.words.internal.zzJB.zzZW(zze7.getValue()));
        }
        zzE(TranslateLanguage.PORTUGUESE, z);
        zzzyd.zzo();
    }

    private static void zzZ(int i, zzZYD zzzyd, String str) {
        if (i == 1) {
            return;
        }
        zzzyd.zzX(str, "val", zzC6.zzJV(i));
    }

    private static void zzZ(ChartLegendEntry chartLegendEntry, zzZXR zzzxr, boolean z) throws Exception {
        if (chartLegendEntry.zz3n()) {
            zzZYD zzzydZzZlV = zzzxr.zzZlV();
            zzzydZzZlV.zzY(zzE("legendEntry", z));
            zzzydZzZlV.zzX(zzE("idx", z), "val", Integer.valueOf(chartLegendEntry.getIndex()));
            zzZ(zzE(RequestParameters.SUBRESOURCE_DELETE, z), chartLegendEntry.isHidden(), zzzydZzZlV);
            zzZ(chartLegendEntry.zzaR(), zzzxr, z);
            zz7Z.zzZ(zzY0(z), chartLegendEntry.getExtensions(), zzzxr);
            zzE("legendEntry", z);
            zzzydZzZlV.zzo();
        }
    }

    private static void zzZ(ChartDataLabel chartDataLabel, zzZXR zzzxr, boolean z) throws Exception {
        if (chartDataLabel != null) {
            if (z && chartDataLabel.isHidden()) {
                return;
            }
            zzZYD zzzydZzZlV = zzzxr.zzZlV();
            zzzydZzZlV.zzY(zzE(z ? "dataLabel" : "dLbl", z));
            if (z) {
                zzzydZzZlV.zzZj("idx", chartDataLabel.getIndex());
                Object objZzLu = chartDataLabel.zz3q().zzLu(2);
                if (objZzLu != null) {
                    zzzydZzZlV.zz0("pos", zzC6.zzK1(((Integer) objZzLu).intValue()));
                }
            }
            zzZ(zzY0(z), chartDataLabel.zz3q(), zzzxr, z, chartDataLabel.isHidden());
            zzE(z ? "dataLabel" : "dLbl", z);
            zzzydZzZlV.zzo();
        }
    }

    private static void zzZ(String str, zzFT zzft, zzZXR zzzxr, boolean z, boolean z2) throws Exception {
        if (!z) {
            zzZ(str, zzft, 3, zzzxr, z);
            zzZ(str, zzft, 1, zzzxr, z);
            zzZ(str, zzft, 4, zzzxr, z);
            if (!z2) {
                zzZ(str, zzft, 16, zzzxr, z);
            }
        }
        zzZ(str, zzft, 5, zzzxr, z);
        zzZ(str, zzft, 15, zzzxr, z);
        zzZ(str, zzft, 17, zzzxr, z);
        if (z) {
            zzY(str, zzft, zzzxr);
        } else if (!z2) {
            zzZ(str, zzft, 2, zzzxr, z);
            zzZ(str, zzft, 9, zzzxr, z);
            zzZ(str, zzft, 12, zzzxr, z);
            zzZ(str, zzft, 8, zzzxr, z);
            zzZ(str, zzft, 11, zzzxr, z);
            zzZ(str, zzft, 10, zzzxr, z);
            zzZ(str, zzft, 7, zzzxr, z);
        }
        zzZ(str, zzft, 6, zzzxr, z);
        if (!z) {
            zzZ(str, zzft, 13, zzzxr, z);
            zzZ(str, zzft, 18, zzzxr, z);
        }
        zzZ(str, zzft, 19, zzzxr, z);
    }

    public static void zzZ(String str, zzFT zzft, zzZXR zzzxr) throws Exception {
        zzZ(str, zzft, 4, zzzxr, false);
        zzZ(str, zzft, 21, zzzxr, false);
        zzZ(str, zzft, 17, zzzxr, false);
        zzZ(str, zzft, 14, zzzxr, false);
        zzZ(str, zzft, 13, zzzxr, false);
        zzZ(str, zzft, 18, zzzxr, false);
        zzZ(str, zzft, 20, zzzxr, false);
    }

    private static void zzZ(String str, zzFT zzft, int i, zzZXR zzzxr, boolean z) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        Object objZzLu = zzft.zzLu(i);
        if (objZzLu == null) {
            return;
        }
        switch (i) {
            case 1:
                zzzydZzZlV.zzX(com.aspose.words.internal.zzZKN.format("{0}:delete", str), "val", objZzLu);
                break;
            case 2:
                zzzydZzZlV.zzX(com.aspose.words.internal.zzZKN.format("{0}:dLblPos", str), "val", zzC6.zzK1(((Integer) objZzLu).intValue()));
                break;
            case 3:
                zzzydZzZlV.zzX(com.aspose.words.internal.zzZKN.format("{0}:idx", str), "val", objZzLu);
                break;
            case 4:
                zzZ(str, (zzEH) objZzLu, zzzxr, z);
                break;
            case 5:
                zzZ((zzE8) objZzLu, zzzydZzZlV, z);
                break;
            case 6:
                zzzydZzZlV.zzZ(com.aspose.words.internal.zzZKN.format("{0}:separator", str), (String) objZzLu);
                break;
            case 7:
                zzzydZzZlV.zzX(com.aspose.words.internal.zzZKN.format("{0}:showBubbleSize", str), "val", objZzLu);
                break;
            case 8:
                zzzydZzZlV.zzX(com.aspose.words.internal.zzZKN.format("{0}:showCatName", str), "val", objZzLu);
                break;
            case 9:
                zzzydZzZlV.zzX(com.aspose.words.internal.zzZKN.format("{0}:showLegendKey", str), "val", objZzLu);
                break;
            case 10:
                zzzydZzZlV.zzX(com.aspose.words.internal.zzZKN.format("{0}:showPercent", str), "val", objZzLu);
                break;
            case 11:
                zzzydZzZlV.zzX(com.aspose.words.internal.zzZKN.format("{0}:showSerName", str), "val", objZzLu);
                break;
            case 12:
                zzzydZzZlV.zzX(com.aspose.words.internal.zzZKN.format("{0}:showVal", str), "val", objZzLu);
                break;
            case 13:
                zzzydZzZlV.zzX(com.aspose.words.internal.zzZKN.format("{0}:showLeaderLines", str), "val", objZzLu);
                break;
            case 14:
                zzzydZzZlV.zzX(com.aspose.words.internal.zzZKN.format("{0}:showDataLabelsRange", str), "val", objZzLu);
                break;
            case 15:
                zzZ((zzD9) objZzLu, zzzxr, z, str);
                break;
            case 16:
                zzZ((zzCM) objZzLu, zzzxr, z);
                break;
            case 17:
                zzZ((zzCL) objZzLu, zzzxr, z);
                break;
            case 18:
                zzZ(com.aspose.words.internal.zzZKN.format("{0}:leaderLines", str), (zzD9) objZzLu, zzzxr, false, z);
                break;
            case 19:
                zz7Z.zzZ(zzY0(z), (com.aspose.words.internal.zzZYG<zz82>) objZzLu, zzzxr);
                break;
            case 20:
                zzzydZzZlV.zzX(com.aspose.words.internal.zzZKN.format("{0}:xForSave", str), "val", objZzLu);
                break;
            case 21:
                zz1T.zzZ(str, (zzDB) objZzLu, zzzxr);
                break;
        }
    }

    private static void zzZ(zzFN zzfn, int i, zzZXR zzzxr, boolean z) throws Exception {
        Object objZzLu = zzfn.zzLu(i);
        if (objZzLu == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        switch (i) {
            case 0:
                zzzydZzZlV.zzX(zzE("idx", z), "val", objZzLu);
                break;
            case 1:
                zzzydZzZlV.zzX(zzE("explosion", z), "val", objZzLu);
                break;
            case 2:
                zzzydZzZlV.zzX(zzE("invertIfNegative", z), "val", objZzLu);
                break;
            case 3:
                zzzydZzZlV.zzX(zzE("bubble3D", z), "val", objZzLu);
                break;
            case 4:
                zzZ((ChartMarker) objZzLu, zzzxr, z);
                break;
            case 5:
                zzZ((zzD9) objZzLu, zzzxr, z, (String) null);
                break;
            case 6:
                zzZ((zzE3) objZzLu, zzzydZzZlV, z);
                break;
            case 7:
                zz7Z.zzZ(zzY0(z), (com.aspose.words.internal.zzZYG<zz82>) objZzLu, zzzxr);
                break;
        }
    }

    private static void zzZ(zzEF zzef, int i, zzZXR zzzxr, boolean z) throws Exception {
        Object objZzLu = zzef.zzLu(i);
        if (objZzLu == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        if (i == 0) {
            zzzydZzZlV.zzX(zzE("symbol", z), "val", zzC6.zzJS(((Integer) objZzLu).intValue()));
            return;
        }
        if (i == 1) {
            zzzydZzZlV.zzX(zzE("size", z), "val", objZzLu);
        } else if (i == 2) {
            zzZ((zzD9) objZzLu, zzzxr, z, (String) null);
        } else {
            if (i != 3) {
                return;
            }
            zz7Z.zzZ(zzY0(z), (com.aspose.words.internal.zzZYG<zz82>) objZzLu, zzzxr);
        }
    }

    private static void zzZ(zzCO zzco, int i, zzZXR zzzxr, boolean z) throws Exception {
        Object objZzLu = zzco.zzLu(i);
        if (objZzLu == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        switch (i) {
            case 0:
                zzzydZzZlV.zzX(zzE("backward", false), "val", objZzLu);
                break;
            case 1:
                zzzydZzZlV.zzX(zzE("dispEq", false), "val", objZzLu);
                break;
            case 2:
                zzzydZzZlV.zzX(zzE("dispRSqr", false), "val", objZzLu);
                break;
            case 3:
                zzzydZzZlV.zzX(zzE("forward", false), "val", objZzLu);
                break;
            case 4:
                zzzydZzZlV.zzX(zzE("intercept", false), "val", objZzLu);
                break;
            case 5:
                zzzydZzZlV.zzZ(zzE("name", false), (String) objZzLu);
                break;
            case 6:
                zzzydZzZlV.zzX(zzE("order", false), "val", objZzLu);
                break;
            case 7:
                zzzydZzZlV.zzX(zzE("period", false), "val", objZzLu);
                break;
            case 8:
                zzZ((zzD9) objZzLu, zzzxr, false, (String) null);
                break;
            case 9:
                zzZ((zzCQ) objZzLu, zzzxr, false);
                break;
            case 10:
                zzzydZzZlV.zzX(zzE("trendlineType", false), "val", zzC6.zzJG(((Integer) objZzLu).intValue()));
                break;
            case 11:
                zz7Z.zzZ(zzY0(false), (com.aspose.words.internal.zzZYG<zz82>) objZzLu, zzzxr);
                break;
        }
    }

    private static void zzZ(zzCQ zzcq, zzZXR zzzxr, boolean z) throws Exception {
        if (zzcq == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzE("trendlineLbl", z));
        zzZ(zzY0(z), zzcq.zz3y(), zzzxr, z);
        zzZ(zzcq.zz4d(), zzzydZzZlV, z);
        zzZ(zzcq.zzaQ(), zzzxr, z, (String) null);
        zzZ(zzcq.zz3u(), zzzxr, z);
        zzZ(zzcq.zzaR(), zzzxr, z);
        zz7Z.zzZ(zzY0(z), zzcq.getExtensions(), zzzxr);
        zzE("trendlineLbl", z);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(String str, double d, double d2, zzZYD zzzyd) {
        if (com.aspose.words.internal.zzAN.zzL(d, d2)) {
            return;
        }
        zzzyd.zzX(str, "val", Double.valueOf(d));
    }

    private static void zzZ(zzCU zzcu, zzZXR zzzxr, boolean z) throws Exception {
        if (zzcu == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        String str = z ? "unitsLabel" : "dispUnitsLbl";
        zzzydZzZlV.zzY(zzE(str, z));
        if (!z) {
            zzZ(zzY0(z), zzcu.zz3y(), zzzxr, z);
        }
        zzZ(zzcu.zzaQ(), zzzxr, z, (String) null);
        zzZ(zzcu.zzaR(), zzzxr, z);
        zzZ(zzcu.zz3u(), zzzxr, z);
        zz7Z.zzZ(zzY0(z), zzcu.getExtensions(), zzzxr);
        zzE(str, z);
        zzzydZzZlV.zzo();
    }

    public static void zzZ(zzFV zzfv, zzZXR zzzxr, boolean z) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzE(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, z));
        zzzydZzZlV.zzZj("id", zzfv.getId());
        Iterator<zzFK> it = zzfv.zzZNU().iterator();
        while (it.hasNext()) {
            zzZ(it.next().zzZN3(), zzzxr, true);
        }
        zz7Z.zzZ(zzY0(z), zzfv.getExtensions(), zzzxr);
        zzE(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, z);
        zzzydZzZlV.zzo();
    }

    public static void zzZ(zzEV zzev, zzZXR zzzxr, boolean z) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzE("fmtOvr", z));
        zzzydZzZlV.zzZj("idx", zzev.getIndex());
        if (zzev.zzaQ() != null) {
            zzZ(zzev.zzaQ(), zzzxr, z, (String) null);
        }
        zz7Z.zzZ(zzY0(z), zzev.getExtensions(), zzzxr);
        zzE("fmtOvr", z);
        zzzydZzZlV.zzo();
    }

    public static void zzZ(String str, int i, com.aspose.words.internal.zzZYG<zz82> zzzyg, zzZXR zzzxr, boolean z) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzE(str, z));
        zzzydZzZlV.zz0(z ? C18437z2.f56754h : "val", zzC6.zzJI(i));
        if (z) {
            zz7Z.zzZ(zzY0(z), zzzyg, zzzxr);
        }
        zzE(str, z);
        zzzydZzZlV.zzo();
    }

    public static void zzZ(zzCD zzcd, zzZXR zzzxr) {
        if (zzcd == null || zzcd.isEmpty()) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzE("valueColors", true));
        zzX("minColor", zzcd.zzZG5(), zzzxr);
        zzX("midColor", zzcd.zzZG4(), zzzxr);
        zzX("maxColor", zzcd.zzZG3(), zzzxr);
        zzE("valueColors", true);
        zzzydZzZlV.zzo();
    }

    public static void zzZ(zzDE zzde, zzZXR zzzxr) throws Exception {
        if (zzde.getCount() == 0) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzE("layoutPr", true));
        Object objZzLu = zzde.zzLu(0);
        if (objZzLu != null) {
            zzzydZzZlV.zzX(zzE("parentLabelLayout", true), "val", zzC6.zzJz(((Integer) objZzLu).intValue()));
        }
        Object objZzLu2 = zzde.zzLu(1);
        if (objZzLu2 != null) {
            zzzydZzZlV.zzX(zzE("regionLabelLayout", true), "val", zzC6.zzJA(((Integer) objZzLu2).intValue()));
        }
        zzzydZzZlV.zzX(zzE("visibility", true), "connectorLines", zzde.zzLu(2), "meanLine", zzde.zzLu(3), "meanMarker", zzde.zzLu(4), "nonoutliers", zzde.zzLu(5), "outliers", zzde.zzLu(6));
        if (zzde.zzLu(7) != null) {
            zzzydZzZlV.zzZ(zzE("aggregation", true), (String) null);
        }
        zzZ((zzG4) zzde.zzLu(8), zzzxr);
        Object objZzLu3 = zzde.zzLu(10);
        if (objZzLu3 != null) {
            zzzydZzZlV.zzX(zzE("statistics", true), "quartileMethod", zzC6.zzJx(((Integer) objZzLu3).intValue()));
        }
        zzZ((ArrayList<Integer>) zzde.zzLu(11), zzzydZzZlV);
        zz7Z.zzZ(zzY0(true), (com.aspose.words.internal.zzZYG<zz82>) zzde.zzLu(12), zzzxr);
        zzE("layoutPr", true);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzG4 zzg4, zzZXR zzzxr) {
        if (zzg4 == null || zzg4.getCount() == 0) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(zzE("binning", true));
        Object objZzLu = zzg4.zzLu(2);
        if (objZzLu != null) {
            zzzydZzZlV.zz0("intervalClosed", zzC6.zzJy(((Integer) objZzLu).intValue()));
        }
        zzZ("underflow", (zzZVY) zzg4.zzLu(3), zzzydZzZlV);
        zzZ("overflow", (zzZVY) zzg4.zzLu(4), zzzydZzZlV);
        Object objZzLu2 = zzg4.zzLu(0);
        if (objZzLu2 != null) {
            zzzydZzZlV.zzX(zzE("binSize", true), "val", objZzLu2);
        } else {
            Object objZzLu3 = zzg4.zzLu(1);
            if (objZzLu3 != null) {
                zzzydZzZlV.zzX(zzE("binCount", true), "val", objZzLu3);
            }
        }
        zzE("binning", true);
        zzzydZzZlV.zzo();
    }

    public static void zzZ(String str, zzZVY zzzvy, zzZYD zzzyd) {
        if (zzzvy == null || zzzvy.zzZk2()) {
            return;
        }
        if (zzzvy.isAuto()) {
            zzzyd.zz0(str, "auto");
        } else {
            zzzyd.zzO(str, zzzvy.getValue());
        }
    }

    public static void zzZ(String str, AxisBound axisBound, zzZYD zzzyd) {
        if (axisBound.isAuto()) {
            zzzyd.zz0(str, "auto");
        } else {
            zzzyd.zzO(str, axisBound.getValue());
        }
    }

    private static void zzZ(ArrayList<Integer> arrayList, zzZYD zzzyd) {
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        zzzyd.zzY(zzE("subtotals", true));
        for (Integer num : arrayList) {
            num.intValue();
            zzzyd.zzX(zzE("idx", true), "val", num);
        }
        zzE("subtotals", true);
        zzzyd.zzo();
    }
}
