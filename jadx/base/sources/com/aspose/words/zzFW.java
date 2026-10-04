package com.aspose.words;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.facebook.common.callercontext.ContextChain;
import com.google.firebase.messaging.Constants;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18437z2;
import com.miui.penengine.p596e.C18773h;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzFW extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("bodyPr", "lstStyle", ContextChain.TAG_PRODUCT, "blipFill", "gradFill", "grpFill", "noFill", "pattFill", "solidFill", "ln", "effectLst", "effectDag", "scene3d", "sp3d", "extLst", "custGeom", "xfrm", "prstGeom", "spPr", "pos", "align", "overlay", "layout", "legendEntry", "legendPos", "txPr", RequestParameters.SUBRESOURCE_DELETE, "idx", "pivotFmt", "dLbl", RequestParameters.MARKER, "depthPercent", "hPercent", "perspective", "rAngAx", "rotX", "rotY", "chartObject", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "formatting", "selection", "userInterface", "fmtId", "name", "downBars", "gapWidth", "upBars", "secondPiePt", "bandFmt", "showHorzBorder", "showKeys", "showOutline", "showVertBorder", "thickness", "pictureOptions", "tx", "formatCode", "sourceLinked", "logBase", "max", "min", "orientation", "majorUnit", "minorUnit", "builtInUnit", "custUnit", "dispUnitsLbl", "unitsLabel", "manualLayout", C18773h.f57233c, "w", "x", "y", "hMode", "wMode", "xMode", "yMode", "layoutTarget", "rich", "v", "strRef", "txData", "f", "datalabelsRange", "uniqueId", "nf", "strCache", "dlblRangeCache", "numCache", "multiLvlStrCache", "lvl", "multiLvlStrRef", "strDim", "numDim", "numRef", "ptCount", TranslateLanguage.PORTUGUESE, "bubble3D", "explosion", "invertIfNegative", "applyToEnd", "applyToFront", "applyToSides", "pictureFormat", "pictureStackUnit", "size", "symbol", "dLblPos", "numFmt", "separator", "showBubbleSize", "showCatName", "showLeaderLines", "showLegendKey", "showPercent", "showSerName", "showVal", "leaderLines", "visibility", "dataLabel", "dataLabelHidden", "showDataLabelsRange", "xForSave", "errBarType", "errDir", "errValType", "minus", "plus", "noEndCap", "val", "Choice", "Fallback", "strLit", "multiLvlStrLit", "numLit", "backward", "dispEq", "dispRSqr", "forward", "intercept", "order", "period", "trendlineLbl", "trendlineType", "minColor", "midColor", "maxColor", "parentLabelLayout", "regionLabelLayout", "aggregation", "binning", "statistics", "subtotals", "geography", "connectorLines", "meanLine", "meanMarker", "nonoutliers", "outliers", "intervalClosed", "underflow", "overflow", "binSize", "binCount");

    public static zzCD zzH(zzZXT zzzxt) {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzCD zzcd = new zzCD();
        while (zzyu4ZzZsD.zzQ("valueColors")) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 144:
                    zzcd.zzY(zzBR.zzX(zzyu4ZzZsD, zzzxt.zzZqn()));
                    break;
                case 145:
                    zzcd.zzX(zzBR.zzX(zzyu4ZzZsD, zzzxt.zzZqn()));
                    break;
                case 146:
                    zzcd.zzW(zzBR.zzX(zzyu4ZzZsD, zzzxt.zzZqn()));
                    break;
                default:
                    zz39.zzK(zzyu4ZzZsD);
                    break;
            }
        }
        return zzcd;
    }

    public static zzEV zzI(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzEV zzev = new zzEV();
        zzev.setIndex(zzyu4ZzZsD.zzX("idx", 0));
        while (zzyu4ZzZsD.zzQ("fmtOvr")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 14) {
                zzev.setExtensions(zz81.zzd(zzzxt));
            } else if (iZzTP != 18) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                zzev.zzZ(new zzD9());
                zzZ(zzzxt, zzev.zzaQ());
            }
        }
        return zzev;
    }

    private static zzCQ zzJ(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzCQ zzcq = new zzCQ();
        while (zzyu4ZzZsD.zzQ("trendlineLbl")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 14) {
                zzcq.setExtensions(zz81.zzd(zzzxt));
            } else if (iZzTP == 18) {
                zzZ(zzzxt, zzcq.zzaQ());
            } else if (iZzTP == 22) {
                zzcq.zzZ(zzS(zzzxt));
            } else if (iZzTP == 25) {
                zzZ(zzzxt, zzcq.zzaR());
            } else if (iZzTP == 55) {
                zzcq.zzZ(zzR(zzzxt));
            } else if (iZzTP != 108) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                zzcq.zzZ(zzX(zzyu4ZzZsD));
            }
        }
        return zzcq;
    }

    public static zzCR zzK(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzCR zzcr = new zzCR();
        while (zzyu4ZzZsD.zzQ("trendline")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 14) {
                zzcr.setExtensions(zz81.zzd(zzzxt));
            } else if (iZzTP == 18) {
                zzZ(zzzxt, zzcr.zzaQ());
            } else if (iZzTP != 43) {
                switch (iZzTP) {
                    case 135:
                        zzcr.zzYa(zzyu4ZzZsD.zzZ("val", 0.0d));
                        break;
                    case 136:
                        zzcr.zzXA(zzyu4ZzZsD.zzX("val", true));
                        break;
                    case 137:
                        zzcr.zzXz(zzyu4ZzZsD.zzX("val", true));
                        break;
                    case 138:
                        zzcr.zzY9(zzyu4ZzZsD.zzZ("val", 0.0d));
                        break;
                    case 139:
                        zzcr.zzY8(zzyu4ZzZsD.zzZ("val", 0.0d));
                        break;
                    case 140:
                        zzcr.setOrder(zzyu4ZzZsD.zzX("val", 0));
                        break;
                    case 141:
                        zzcr.zzKj(zzyu4ZzZsD.zzX("val", 0));
                        break;
                    case 142:
                        zzcr.zzZ(zzJ(zzzxt));
                        break;
                    case 143:
                        zzcr.zzKi(zzC6.zzQL(zzyu4ZzZsD.zzV("val", "")));
                        break;
                    default:
                        zz39.zzK(zzyu4ZzZsD);
                        break;
                }
            } else {
                zzcr.setName(zzyu4ZzZsD.readString());
            }
        }
        return zzcr;
    }

    private static zzCB zzL(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
        if (iZzTP == 80 || iZzTP == 83 || iZzTP == 91 || iZzTP == 94) {
            return zzO(zzzxt);
        }
        switch (iZzTP) {
            case 132:
                zzCE zzce = new zzCE(1);
                zzY(zzzxt, zzce);
                return new zzCB(zzce);
            case 133:
                zzCE zzce2 = new zzCE(3);
                zzZ(zzzxt, zzce2);
                return new zzCB(zzce2);
            case 134:
                zzCE zzce3 = new zzCE(2);
                zzY(zzzxt, zzce3);
                return new zzCB(zzce3);
            default:
                zz39.zzK(zzyu4ZzZsD);
                return null;
        }
    }

    public static zzF7 zzM(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzF7 zzf7 = new zzF7();
        while (zzyu4ZzZsD.zzQ("errBars")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 14) {
                zzf7.setExtensions(zz81.zzd(zzzxt));
            } else if (iZzTP != 18) {
                switch (iZzTP) {
                    case 123:
                        zzf7.zzKX(zzC6.zzR3(zzyu4ZzZsD.zzV("val", "")));
                        break;
                    case 124:
                        zzf7.zzKW(zzC6.zzR4(zzyu4ZzZsD.zzV("val", "")));
                        break;
                    case 125:
                        zzf7.zzKV(zzC6.zzR2(zzyu4ZzZsD.zzV("val", "")));
                        break;
                    case 126:
                        zzZ(zzzxt, zzf7.zzZMj().zzZMu());
                        break;
                    case 127:
                        zzZ(zzzxt, zzf7.zzZMi().zzZMu());
                        break;
                    case 128:
                        zzf7.zzXW(zzyu4ZzZsD.zzX("val", true));
                        break;
                    case 129:
                        zzf7.zzYo(zzyu4ZzZsD.zzZ("val", 0.0d));
                        break;
                    default:
                        zz39.zzK(zzyu4ZzZsD);
                        break;
                }
            } else {
                zzZ(zzzxt, zzf7.zzaQ());
            }
        }
        return zzf7;
    }

    public static zzFT zzN(zzZXT zzzxt) throws Exception {
        zzFT zzft = new zzFT(null, zzzxt.getDocument(), false);
        while (zzzxt.zzZsD().zzQ("ext")) {
            zzZ(zzzxt, zzft, true);
        }
        return zzft;
    }

    public static zzCB zzO(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        String localName = zzyu4ZzZsD.getLocalName();
        zzCB zzcb = new zzCB(zzRz(localName));
        zzcb.zzKd(zzC6.zzQK(zzyu4ZzZsD.zzV(C18437z2.f56754h, "")));
        int i = 0;
        while (zzyu4ZzZsD.zzQ(localName)) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 14) {
                zzcb.setExtensions(zz81.zzd(zzzxt));
            } else if (iZzTP != 82) {
                switch (iZzTP) {
                    case 85:
                        zzZ(zzyu4ZzZsD, zzcb.zzZFZ());
                        break;
                    case 86:
                    case 87:
                        zzY(zzzxt, zzcb.zzZN4());
                        break;
                    case 88:
                        zzY(zzzxt, zzcb.zzZN4());
                        break;
                    case 89:
                        zzZ(zzzxt, zzcb.zzZN4());
                        break;
                    case 90:
                        zzZ(zzyu4ZzZsD, zzcb.zzZN4(), "numDim".equals(localName), i);
                        i++;
                        break;
                    default:
                        zz39.zzK(zzyu4ZzZsD);
                        break;
                }
            } else {
                zzZ(zzyu4ZzZsD, zzcb.zzZGv());
            }
        }
        return zzcb;
    }

    public static com.aspose.words.internal.zzZOZ zzP(zzZXT zzzxt) {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        com.aspose.words.internal.zzZOZ zzzoz = com.aspose.words.internal.zzZOZ.zzZXP;
        while (zzyu4ZzZsD.zzQ("ext")) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 84) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                String strZzV = zzyu4ZzZsD.zzV("val", "");
                if (!"".equals(strZzV)) {
                    zzzoz = new com.aspose.words.internal.zzZOZ(strZzV);
                }
            }
        }
        return zzzoz;
    }

    public static zzCB zzQ(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzCB zzcbZzO = null;
        while (zzyu4ZzZsD.zzQ("ext")) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 83) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                zzcbZzO = zzO(zzzxt);
            }
        }
        return zzcbZzO;
    }

    public static zzCM zzR(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzCM zzcm = new zzCM();
        while (zzyu4ZzZsD.zzQ("tx")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP != 14) {
                switch (iZzTP) {
                    case 78:
                        zzcm.zzY(new zz11());
                        zz0I.zzZ(zzzxt, zzcm.zzZGw(), "rich");
                        break;
                    case 79:
                        zzcm.zzRd(zzyu4ZzZsD.readString());
                        break;
                    case 80:
                        zzcm.zzX(zzO(zzzxt));
                        break;
                    case 81:
                        zzZ(zzzxt, zzcm);
                        break;
                    default:
                        zz39.zzK(zzyu4ZzZsD);
                        break;
                }
            } else {
                zzcm.setExtensions(zz81.zzd(zzzxt));
            }
        }
        return zzcm;
    }

    private static int zzRz(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 80 || iZzTP == 83) {
            return 1;
        }
        switch (iZzTP) {
            case 91:
            case 92:
                return 3;
            case 93:
                return 4;
            case 94:
                return 2;
            default:
                return 0;
        }
    }

    public static zzEH zzS(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzEH zzeh = null;
        while (zzyu4ZzZsD.zzQ("layout")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 14) {
                zz39.zzL(zzyu4ZzZsD);
            } else if (iZzTP != 68) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                zzeh = new zzEH();
                zzZ(zzzxt, zzeh);
            }
        }
        return zzeh;
    }

    public static zzCW zzT(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        String localName = zzyu4ZzZsD.getLocalName();
        zzCW zzcw = new zzCW();
        while (zzyu4ZzZsD.zzQ(localName)) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 14) {
                zzcw.setExtensions(zz81.zzd(zzzxt));
            } else if (iZzTP == 18) {
                zzZ(zzzxt, zzcw.zzaQ());
            } else if (iZzTP == 53) {
                zzcw.setThickness(zzyu4ZzZsD.zzX("val", 0));
            } else if (iZzTP != 54) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                zzcw.zzZ(zzV(zzyu4ZzZsD));
            }
        }
        return zzcw;
    }

    public static zzE0 zzU(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzE0 zze0 = new zzE0();
        while (zzyu4ZzZsD.zzQ("pivotSource")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 14) {
                zze0.setExtensions(zz81.zzd(zzzxt));
            } else if (iZzTP == 42) {
                zze0.zzKH(zzyu4ZzZsD.zzX("val", 0));
            } else if (iZzTP != 43) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                zze0.setName(zzyu4ZzZsD.readString());
            }
        }
        return zze0;
    }

    public static zzC9 zzV(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzC9 zzc9 = new zzC9();
        while (zzyu4ZzZsD.zzQ("view3D")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP != 14) {
                switch (iZzTP) {
                    case 31:
                        zzc9.zzKc(zzyu4ZzZsD.zzX("val", 100));
                        break;
                    case 32:
                        zzc9.zzKb(zzyu4ZzZsD.zzX("val", 100));
                        break;
                    case 33:
                        zzc9.zzKa(zzyu4ZzZsD.zzX("val", 30));
                        break;
                    case 34:
                        zzc9.zzXw(zzyu4ZzZsD.zzX("val", true));
                        break;
                    case 35:
                        zzc9.zzK9(zzyu4ZzZsD.zzX("val", 0));
                        break;
                    case 36:
                        zzc9.zzK8(zzyu4ZzZsD.zzX("val", 0));
                        break;
                    default:
                        zz39.zzK(zzyu4ZzZsD);
                        break;
                }
            } else {
                zzc9.setExtensions(zz81.zzd(zzzxt));
            }
        }
        return zzc9;
    }

    private static zzE2 zzW(zzZXT zzzxt) throws Exception {
        zzE2 zze2 = new zzE2(zzzxt.getDocument().zzZqI());
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        while (zzyu4ZzZsD.zzQ("pivotFmt")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 14) {
                zze2.setExtensions(zz81.zzd(zzzxt));
            } else if (iZzTP == 18) {
                zzZ(zzzxt, zze2.zzaQ());
            } else if (iZzTP == 25) {
                zzZ(zzzxt, zze2.zzaR());
            } else if (iZzTP == 27) {
                zze2.setIndex(zzyu4ZzZsD.zzX("val", 0));
            } else if (iZzTP == 29) {
                zze2.zzU(zzZ(zzzxt, (zzFT) null, (ChartSeries) null));
            } else if (iZzTP != 30) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                zzZ(zzzxt, zze2.getMarker());
            }
        }
        return zze2;
    }

    public static zzE1 zzX(zzZXT zzzxt) throws Exception {
        zzE1 zze1 = new zzE1();
        while (zzzxt.zzZsD().zzQ("pivotFmts")) {
            if (zzUR.zzTP(zzzxt.zzZsD().getLocalName()) != 28) {
                zz39.zzK(zzzxt.zzZsD());
            } else {
                zze1.zzZ(zzW(zzzxt));
            }
        }
        return zze1;
    }

    public static void zzY(zzZXT zzzxt, zzD9 zzd9) throws Exception {
        String localName = zzzxt.zzZsD().getLocalName();
        while (zzzxt.zzZsD().zzQ(localName)) {
            if (zzUR.zzTP(zzzxt.zzZsD().getLocalName()) != 18) {
                zz39.zzK(zzzxt.zzZsD());
            } else {
                zzZ(zzzxt, zzd9);
            }
        }
    }

    public static void zzZ(zzZXT zzzxt, zzCL zzcl) throws Exception {
        while (zzzxt.zzZsD().zzQ("txPr")) {
            int iZzTP = zzUR.zzTP(zzzxt.zzZsD().getLocalName());
            if (iZzTP == 0) {
                zzcl.zzX(new zz10());
                zz0I.zzZ(zzzxt, zzcl.zzZHh(), zzzxt.zzZqn());
            } else if (iZzTP == 1) {
                zz0I.zzZ(zzzxt, zzcl.zzZGp());
            } else if (iZzTP != 2) {
                zz39.zzK(zzzxt.zzZsD());
            } else {
                zz0I.zzZ(zzcl.zzZGs(), zzzxt);
            }
        }
    }

    public static zzE8 zzX(zzYU4 zzyu4) {
        zzE8 zze8 = new zzE8();
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 56) {
                zze8.setFormatCode(zzyu4.getValue());
            } else if (iZzTP != 57) {
                zz39.zzI(zzyu4);
            } else {
                zze8.zzXR(zzyu4.zz8());
            }
        }
        return zze8;
    }

    private static ChartLegendEntry zzY(zzZXT zzzxt) throws Exception {
        ChartLegendEntry chartLegendEntry = new ChartLegendEntry();
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        while (zzyu4ZzZsD.zzQ("legendEntry")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP != 14) {
                switch (iZzTP) {
                    case 25:
                        zzZ(zzzxt, chartLegendEntry.zzaR());
                        break;
                    case 26:
                        chartLegendEntry.isHidden(zzyu4ZzZsD.zzX("val", true));
                        break;
                    case 27:
                        chartLegendEntry.setIndex(zzyu4ZzZsD.zzX("val", 0));
                        break;
                    default:
                        zz39.zzK(zzyu4ZzZsD);
                        break;
                }
            } else {
                chartLegendEntry.setExtensions(zz81.zzd(zzzxt));
            }
        }
        return chartLegendEntry;
    }

    private static zzG4 zzU(zzYU4 zzyu4) {
        zzG4 zzg4 = new zzG4();
        while (zzyu4.zzi()) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 159:
                    zzg4.zzL(2, Integer.valueOf(zzC6.zzQD(zzyu4.getValue())));
                    break;
                case 160:
                    zzZ(zzyu4, (zzZVY) zzg4.zzLv(3));
                    break;
                case 161:
                    zzZ(zzyu4, (zzZVY) zzg4.zzLv(4));
                    break;
                default:
                    zz39.zzI(zzyu4);
                    break;
            }
        }
        zzyu4.zzj();
        while (zzyu4.zzQ("binning")) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 162) {
                zzg4.zzL(0, Double.valueOf(zzyu4.zzZ("val", 1.0d)));
            } else if (iZzTP != 163) {
                zz39.zzK(zzyu4);
            } else {
                zzg4.zzL(1, Integer.valueOf(zzyu4.zzX("val", 6)));
            }
        }
        return zzg4;
    }

    public static void zzZ(zzZXT zzzxt, zzD9 zzd9) throws Exception {
        zzYO3 zzyo3ZzZqn = zzzxt.zzZqn();
        while (zzzxt.zzZsD().zzQ("spPr")) {
            switch (zzUR.zzTP(zzzxt.zzZsD().getLocalName())) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    zzd9.setFill(zz7V.zzc(zzzxt));
                    break;
                case 9:
                    zzd9.setOutline(zz4C.zz4(zzzxt));
                    break;
                case 10:
                    zzd9.zzZ(zz2E.zzZ(zzzxt, false, false));
                    break;
                case 11:
                    zzd9.zzZ(zz2E.zzZ(zzzxt, false, true));
                    break;
                case 12:
                    zzd9.zzY(zz2R.zzX(zzzxt, zzyo3ZzZqn));
                    break;
                case 13:
                    zzd9.zzY(zz2R.zzW(zzzxt, zzyo3ZzZqn));
                    break;
                case 14:
                    zzd9.setExtensions(zz81.zzd(zzzxt));
                    break;
                default:
                    zz39.zzK(zzzxt.zzZsD());
                    break;
            }
        }
    }

    private static ArrayList<Integer> zzT(zzYU4 zzyu4) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (zzyu4.zzQ("subtotals")) {
            if (zzUR.zzTP(zzyu4.getLocalName()) != 27) {
                zz39.zzK(zzyu4);
            } else {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, Integer.valueOf(zzyu4.zzX("val", 0)));
            }
        }
        return arrayList;
    }

    private static zzFC zzX(zzZCO zzzco, zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzFC zzfc = new zzFC(zzzco);
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzQ(localName)) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 14) {
                zzfc.setExtensions(zz81.zzd(zzzxt));
            } else if (iZzTP == 18) {
                zzZ(zzzxt, zzfc.zzaQ());
            } else if (iZzTP == 22) {
                zzfc.zzZ(zzS(zzzxt));
            } else if (iZzTP == 25) {
                zzZ(zzzxt, zzfc.zzaR());
            } else if (iZzTP != 55) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                zzfc.zzZ(zzR(zzzxt));
            }
        }
        return zzfc;
    }

    private static AxisBound zzW(zzYU4 zzyu4) {
        if ("auto".equals(zzyu4.getValue())) {
            return AxisBound.zzZED;
        }
        return new AxisBound(com.aspose.words.internal.zzJB.zzZs(zzyu4.getValue()));
    }

    private static void zzW(zzZXT zzzxt, zzFK zzfk) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        while (zzyu4ZzZsD.zzQ("Fallback")) {
            zzCB zzcbZzL = zzL(zzzxt);
            if (zzcbZzL != null) {
                zzfk.zzY(zzcbZzL);
            }
        }
    }

    public static int[] zzY(zzYU4 zzyu4) {
        com.aspose.words.internal.zzDB zzdbZzCT = com.aspose.words.internal.zzDB.zzCT();
        while (zzyu4.zzQ("custSplit")) {
            if (zzUR.zzTP(zzyu4.getLocalName()) != 47) {
                zz39.zzK(zzyu4);
            } else {
                zzdbZzCT.add(zzyu4.zzX("val", 0));
            }
        }
        return zzdbZzCT.toArray();
    }

    public static zzE3 zzV(zzYU4 zzyu4) {
        zzE3 zze3 = new zzE3();
        while (zzyu4.zzQ("pictureOptions")) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 100:
                    zze3.zzXO(zzyu4.zzX("val", true));
                    break;
                case 101:
                    zze3.zzXQ(zzyu4.zzX("val", true));
                    break;
                case 102:
                    zze3.zzXP(zzyu4.zzX("val", true));
                    break;
                case 103:
                    zze3.setPictureFormat(zzC6.zzQU(zzyu4.zzV("val", "stack")));
                    break;
                case 104:
                    zze3.zzYk(zzyu4.zzZ("val", 0.0d));
                    break;
                default:
                    zz39.zzK(zzyu4);
                    break;
            }
        }
        return zze3;
    }

    public static ChartLegend zzZ(zzZXT zzzxt, zzEY zzey) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        ChartLegend chartLegend = new ChartLegend(zzey);
        while (zzyu4ZzZsD.zzi()) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 19:
                    chartLegend.zzNR(zzC6.zzQI(zzyu4ZzZsD.getValue()));
                    break;
                case 20:
                    chartLegend.zzNQ(zzC6.zzQH(zzyu4ZzZsD.getValue()));
                    break;
                case 21:
                    chartLegend.setOverlay(zzyu4ZzZsD.zz8());
                    break;
                default:
                    zz39.zzI(zzyu4ZzZsD);
                    break;
            }
        }
        zzyu4ZzZsD.zzj();
        while (zzyu4ZzZsD.zzQ("legend")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 14) {
                chartLegend.setExtensions(zz81.zzd(zzzxt));
            } else if (iZzTP != 18) {
                switch (iZzTP) {
                    case 21:
                        chartLegend.setOverlay(zzyu4ZzZsD.zzX("val", true));
                        break;
                    case 22:
                        chartLegend.zzZ(zzS(zzzxt));
                        break;
                    case 23:
                        chartLegend.zzZ(zzY(zzzxt));
                        break;
                    case 24:
                        chartLegend.setPosition(zzC6.zzQY(zzyu4ZzZsD.zzV("val", "")));
                        break;
                    case 25:
                        zzZ(zzzxt, chartLegend.zzaR());
                        break;
                    default:
                        zz39.zzK(zzyu4ZzZsD);
                        break;
                }
            } else {
                zzZ(zzzxt, chartLegend.zzaQ());
            }
        }
        return chartLegend;
    }

    private static void zzX(zzZXT zzzxt, zzFK zzfk) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        while (zzyu4ZzZsD.zzQ("Choice")) {
            zzCB zzcbZzL = zzL(zzzxt);
            if (zzcbZzL != null) {
                zzfk.zzZ(zzcbZzL);
            }
        }
    }

    private static void zzY(zzZXT zzzxt, zzG7 zzg7) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzD9 zzd9 = new zzD9();
        int iZzX = 0;
        while (zzyu4ZzZsD.zzQ("bandFmt")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 18) {
                zzZ(zzzxt, zzd9);
            } else if (iZzTP != 27) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                iZzX = zzyu4ZzZsD.zzX("val", 0);
            }
        }
        zzg7.zzZ(iZzX, zzd9);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004f -> B:7:0x0033). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0053 -> B:7:0x0033). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005b -> B:7:0x0033). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0065 -> B:7:0x0033). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0073 -> B:7:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AxisDisplayUnit zzY(zzZCO zzzco, zzZXT zzzxt) throws Exception {
        boolean z;
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        AxisDisplayUnit axisDisplayUnit = new AxisDisplayUnit();
        String localName = zzyu4ZzZsD.getLocalName();
        if (com.aspose.words.internal.zzZKN.equals(zzyu4ZzZsD.getNamespaceURI(), zzZX5.zz9(28, false))) {
            String strZzV = zzyu4ZzZsD.zzV("unit", "");
            if (com.aspose.words.internal.zzZYD.zzXk(strZzV)) {
                axisDisplayUnit.setUnit(zzC6.zzR9(strZzV));
                z = false;
                if (!zzyu4ZzZsD.zzQ(localName)) {
                    int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
                    if (iZzTP != 14) {
                        switch (iZzTP) {
                            case 64:
                                axisDisplayUnit.setUnit(zzC6.zzR9(zzyu4ZzZsD.zzV("val", "thousands")));
                                break;
                            case 65:
                                axisDisplayUnit.setCustomUnit(zzyu4ZzZsD.zzZ("val", 0.0d));
                                break;
                            case 66:
                            case 67:
                                axisDisplayUnit.zzZ(zzX(zzzco, zzzxt));
                                break;
                            default:
                                zz39.zzK(zzyu4ZzZsD);
                                break;
                        }
                    } else {
                        axisDisplayUnit.setExtensions(zz81.zzd(zzzxt));
                    }
                    z = false;
                    if (!zzyu4ZzZsD.zzQ(localName)) {
                        if (z) {
                            return null;
                        }
                        return axisDisplayUnit;
                    }
                }
            }
        }
        z = true;
        if (!zzyu4ZzZsD.zzQ(localName)) {
        }
    }

    public static zzDN zzZ(zzYU4 zzyu4) {
        zzDN zzdn = new zzDN();
        while (zzyu4.zzQ("protection")) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 37:
                    zzdn.zzXI(zzyu4.zzX("val", true));
                    break;
                case 38:
                    zzdn.zzXH(zzyu4.zzX("val", true));
                    break;
                case 39:
                    zzdn.zzXG(zzyu4.zzX("val", true));
                    break;
                case 40:
                    zzdn.zzXF(zzyu4.zzX("val", true));
                    break;
                case 41:
                    zzdn.zzXE(zzyu4.zzX("val", true));
                    break;
                default:
                    zz39.zzK(zzyu4);
                    break;
            }
        }
        return zzdn;
    }

    private static void zzY(zzZXT zzzxt, zzCE zzce) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzQ(localName)) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 14) {
                zzce.setExtensions(zz81.zzd(zzzxt));
            } else if (iZzTP == 56) {
                zzce.setFormatCode(zzyu4ZzZsD.readString());
            } else if (iZzTP == 95) {
                zzce.zzNy(zzyu4ZzZsD.zzX("val", 0));
            } else if (iZzTP != 96) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                zzce.zzP(zzZ(zzyu4ZzZsD, zzce.getValueType()));
            }
        }
        if (zzce.getValueType() == 2) {
            Iterator<zzCF> it = zzce.iterator();
            while (it.hasNext()) {
                zzE7 zze7 = (zzE7) it.next();
                if (!com.aspose.words.internal.zzZYD.zzXk(zze7.getFormatCode())) {
                    zze7.setFormatCode(zzce.getFormatCode());
                }
            }
        }
    }

    public static void zzZ(zzZXT zzzxt, zzCH zzch) throws Exception {
        zzch.zzZGg();
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        while (zzyu4ZzZsD.zzQ("upDownBars")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP != 14) {
                switch (iZzTP) {
                    case 44:
                        zzch.zzXx(true);
                        zzY(zzzxt, zzch.zzZGh());
                        break;
                    case 45:
                        zzch.zzKh(zzyu4ZzZsD.zzX("val", 150));
                        break;
                    case 46:
                        zzch.zzXy(true);
                        zzY(zzzxt, zzch.zzZGi());
                        break;
                    default:
                        zz39.zzK(zzyu4ZzZsD);
                        break;
                }
            } else {
                zzch.setExtensions(zz81.zzd(zzzxt));
            }
        }
    }

    private static void zzY(zzZXT zzzxt, zzFK zzfk) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzQ(localName)) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 130) {
                zzX(zzzxt, zzfk);
            } else if (iZzTP != 131) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                zzW(zzzxt, zzfk);
            }
        }
    }

    public static void zzZ(zzZXT zzzxt, zzG7 zzg7) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        while (zzyu4ZzZsD.zzQ("bandFmts")) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 48) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                zzY(zzzxt, zzg7);
            }
        }
    }

    public static ChartDataTable zzZ(zzZXT zzzxt, zzDT zzdt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        ChartDataTable chartDataTable = new ChartDataTable(zzdt);
        chartDataTable.setShow(true);
        while (zzyu4ZzZsD.zzQ("dTable")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 18) {
                zzZ(zzzxt, chartDataTable.zzaQ());
            } else if (iZzTP != 25) {
                switch (iZzTP) {
                    case 49:
                        chartDataTable.hasHorizontalBorder(zzyu4ZzZsD.zzX("val", true));
                        break;
                    case 50:
                        chartDataTable.hasLegendKeys(zzyu4ZzZsD.zzX("val", true));
                        break;
                    case 51:
                        chartDataTable.hasOutlineBorder(zzyu4ZzZsD.zzX("val", true));
                        break;
                    case 52:
                        chartDataTable.hasVerticalBorder(zzyu4ZzZsD.zzX("val", true));
                        break;
                    default:
                        zz39.zzK(zzyu4ZzZsD);
                        break;
                }
            } else {
                zzZ(zzzxt, chartDataTable.zzaR());
            }
        }
        return chartDataTable;
    }

    public static zzCU zzZ(zzZCO zzzco, zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzCU zzcu = new zzCU(zzzco);
        while (zzyu4ZzZsD.zzi()) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 19:
                    zzcu.zzNR(zzC6.zzQI(zzyu4ZzZsD.getValue()));
                    break;
                case 20:
                    zzcu.zzNQ(zzC6.zzQH(zzyu4ZzZsD.getValue()));
                    break;
                case 21:
                    zzcu.setOverlay(zzyu4ZzZsD.zz8());
                    break;
                default:
                    zz39.zzI(zzyu4ZzZsD);
                    break;
            }
        }
        zzyu4ZzZsD.zzj();
        while (zzyu4ZzZsD.zzQ(NoteMeta.PROPERTY_TITLE)) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 14) {
                zzcu.setExtensions(zz81.zzd(zzzxt));
            } else if (iZzTP == 18) {
                zzcu.zzZ(new zzD9());
                zzZ(zzzxt, zzcu.zzaQ());
            } else if (iZzTP == 25) {
                zzZ(zzzxt, zzcu.zzaR());
            } else if (iZzTP == 55) {
                zzcu.zzZ(zzR(zzzxt));
            } else if (iZzTP == 21) {
                zzcu.setOverlay(zzyu4ZzZsD.zzX("val", true));
            } else if (iZzTP != 22) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                zzcu.zzZ(zzS(zzzxt));
            }
        }
        return zzcu;
    }

    public static void zzZ(zzZXT zzzxt, AxisScaling axisScaling) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        while (zzyu4ZzZsD.zzQ("scaling")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP != 14) {
                switch (iZzTP) {
                    case 58:
                        double dZzZ = zzyu4ZzZsD.zzZ("val", Double.NaN);
                        if (!Double.isNaN(dZzZ)) {
                            axisScaling.zzZ6(dZzZ);
                        }
                        break;
                    case 59:
                        axisScaling.setMaximum(new AxisBound(zzyu4ZzZsD.zzZ("val", 0.0d)));
                        break;
                    case 60:
                        axisScaling.setMinimum(new AxisBound(zzyu4ZzZsD.zzZ("val", 0.0d)));
                        break;
                    case 61:
                        axisScaling.setOrientation(zzC6.zzQV(zzyu4ZzZsD.zzV("val", "minMax")));
                        break;
                    default:
                        zz39.zzK(zzyu4ZzZsD);
                        break;
                }
            } else {
                axisScaling.setExtensions(zz81.zzd(zzzxt));
            }
        }
    }

    public static void zzZ(zzYU4 zzyu4, AxisScaling axisScaling) {
        while (zzyu4.zzi()) {
            if (zzUR.zzTP(zzyu4.getLocalName()) != 45) {
                zz39.zzI(zzyu4);
            } else {
                zzZ(zzyu4, axisScaling.zzaT());
            }
        }
        zzyu4.zzj();
    }

    public static void zzZ(zzYU4 zzyu4, ChartAxis chartAxis) {
        while (zzyu4.zzi()) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 59:
                    chartAxis.getScaling().setMaximum(zzW(zzyu4));
                    break;
                case 60:
                    chartAxis.getScaling().setMinimum(zzW(zzyu4));
                    break;
                case 61:
                default:
                    zz39.zzI(zzyu4);
                    break;
                case 62:
                    zzZ(zzyu4, chartAxis.zz4g());
                    break;
                case 63:
                    zzZ(zzyu4, chartAxis.zz4f());
                    break;
            }
        }
        zzyu4.zzj();
    }

    private static void zzZ(zzYU4 zzyu4, zzZVY zzzvy) {
        if ("auto".equals(zzyu4.getValue())) {
            zzzvy.isAuto(true);
        } else {
            zzzvy.setValue(com.aspose.words.internal.zzJB.zzZs(zzyu4.getValue()));
        }
    }

    private static void zzZ(zzZXT zzzxt, zzEH zzeh) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        while (zzyu4ZzZsD.zzQ("manualLayout")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP != 14) {
                switch (iZzTP) {
                    case 69:
                        zzeh.setHeight(zzyu4ZzZsD.zzZ("val", 0.0d));
                        break;
                    case 70:
                        zzeh.setWidth(zzyu4ZzZsD.zzZ("val", 0.0d));
                        break;
                    case 71:
                        zzeh.setLeft(zzyu4ZzZsD.zzZ("val", 0.0d));
                        break;
                    case 72:
                        zzeh.setTop(zzyu4ZzZsD.zzZ("val", 0.0d));
                        break;
                    case 73:
                        zzeh.zzKQ(zzC6.zzR0(zzyu4ZzZsD.zzV("val", "factor")));
                        break;
                    case 74:
                        zzeh.zzKO(zzC6.zzR0(zzyu4ZzZsD.zzV("val", "factor")));
                        break;
                    case 75:
                        zzeh.zzKN(zzC6.zzR0(zzyu4ZzZsD.zzV("val", "factor")));
                        break;
                    case 76:
                        zzeh.zzKM(zzC6.zzR0(zzyu4ZzZsD.zzV("val", "factor")));
                        break;
                    case 77:
                        zzeh.zzKP(zzC6.zzQZ(zzyu4ZzZsD.zzV("val", "outer")));
                        break;
                    default:
                        zz39.zzK(zzyu4ZzZsD);
                        break;
                }
            } else {
                zzeh.setExtensions(zz81.zzd(zzzxt));
            }
        }
    }

    private static void zzZ(zzZXT zzzxt, zzCM zzcm) {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        while (zzyu4ZzZsD.zzQ("txData")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 79) {
                zzcm.zzRd(zzyu4ZzZsD.readString());
            } else if (iZzTP != 82) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                zzcm.zzZ(new zzEU());
                zzZ(zzyu4ZzZsD, zzcm.zzZGv());
            }
        }
    }

    private static void zzZ(zzYU4 zzyu4, zzEU zzeu) {
        zzeu.setDirection(zzC6.zzQJ(zzyu4.zzV("dir", "")));
        zzeu.setValue(zzyu4.readString());
    }

    private static void zzZ(zzZXT zzzxt, zzCE zzce) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        String localName = zzyu4ZzZsD.getLocalName();
        int i = 0;
        while (zzyu4ZzZsD.zzQ(localName)) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 14) {
                zzce.setExtensions(zz81.zzd(zzzxt));
            } else if (iZzTP == 90) {
                zzZ(zzyu4ZzZsD, zzce, false, i);
                i++;
            } else if (iZzTP != 95) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                zzce.zzNy(zzyu4ZzZsD.zzX("val", 0));
            }
        }
    }

    private static void zzZ(zzYU4 zzyu4, zzCE zzce, boolean z, int i) {
        if (com.aspose.words.internal.zzZKN.equals(zzyu4.getNamespaceURI(), zzZX5.zz9(28, false))) {
            zzFP zzfp = new zzFP();
            while (zzyu4.zzi()) {
                int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
                if (iZzTP == 43) {
                    zzfp.setName(zzyu4.getValue());
                } else if (iZzTP == 56) {
                    zzfp.setFormatCode(zzyu4.getValue());
                } else if (iZzTP != 95) {
                    zz39.zzI(zzyu4);
                } else {
                    zzfp.zzNy(zzyu4.zzb());
                }
            }
            while (zzce.zzZG8().size() < i) {
                zzce.zzZ(null);
            }
            zzce.zzZ(zzfp);
        }
        zzyu4.zzj();
        while (zzyu4.zzQ("lvl")) {
            if (zzUR.zzTP(zzyu4.getLocalName()) != 96) {
                zz39.zzK(zzyu4);
            } else {
                zzCF zzcfZzZ = zzZ(zzyu4, z ? 2 : 1);
                zzE9 zzeb = (zzE9) zzce.zzKg(zzcfZzZ.getIndex());
                if (z) {
                    if (zzeb == null) {
                        zzeb = new zzEB(zzcfZzZ.getIndex(), zzce.zzZG8());
                        zzce.zzP(zzeb);
                    }
                    zzeb.zzK(Double.valueOf(zzcfZzZ.getValue()), i);
                } else {
                    if (zzeb == null) {
                        zzeb = new zzEA(zzcfZzZ.getIndex());
                        zzce.zzP(zzeb);
                    }
                    zzeb.zzK(zzcfZzZ.getStringValue(), i);
                }
            }
        }
    }

    private static zzCF zzZ(zzYU4 zzyu4, int i) {
        String string;
        int iZzb = 0;
        boolean zEquals = com.aspose.words.internal.zzZKN.equals(zzyu4.getNamespaceURI(), zzZX5.zz9(28, false));
        String string2 = null;
        String value = null;
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 27) {
                iZzb = zzyu4.zzb();
            } else if (iZzTP != 56) {
                zz39.zzI(zzyu4);
            } else {
                value = zzyu4.getValue();
            }
        }
        zzyu4.zzj();
        if (zEquals) {
            string = zzyu4.readString();
        } else {
            while (zzyu4.zzQ(TranslateLanguage.PORTUGUESE)) {
                if (zzUR.zzTP(zzyu4.getLocalName()) != 79) {
                    zz39.zzK(zzyu4);
                } else {
                    string2 = zzyu4.readString();
                }
            }
            string = string2;
        }
        if (i == 1) {
            return new zzD4(iZzb, string);
        }
        return new zzE7(iZzb, com.aspose.words.internal.zzJB.zzZs(string), value);
    }

    public static ChartDataPoint zzZ(zzZXT zzzxt, zzGK zzgk) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        ChartDataPoint chartDataPoint = new ChartDataPoint(zzgk);
        String localName = zzyu4ZzZsD.getLocalName();
        if (com.aspose.words.internal.zzZKN.equals(zzyu4ZzZsD.getNamespaceURI(), zzZX5.zz9(28, false))) {
            chartDataPoint.zz3d().zzL(0, Integer.valueOf(zzyu4ZzZsD.zzX("idx", 0)));
        }
        while (zzyu4ZzZsD.zzQ(localName)) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 14) {
                chartDataPoint.zz3d().zzL(7, zz81.zzd(zzzxt));
            } else if (iZzTP == 18) {
                zzD9 zzd9 = new zzD9();
                zzZ(zzzxt, zzd9);
                chartDataPoint.zz3d().zzL(5, zzd9);
            } else if (iZzTP == 27) {
                chartDataPoint.zz3d().zzL(0, Integer.valueOf(zzyu4ZzZsD.zzX("val", 0)));
            } else if (iZzTP == 30) {
                ChartMarker chartMarker = new ChartMarker(zzgk);
                zzZ(zzzxt, chartMarker);
                chartDataPoint.zz3d().zzL(4, chartMarker);
            } else if (iZzTP != 54) {
                switch (iZzTP) {
                    case 97:
                        chartDataPoint.zz3d().zzL(3, Boolean.valueOf(zzyu4ZzZsD.zzX("val", true)));
                        break;
                    case 98:
                        chartDataPoint.zz3d().zzL(1, Integer.valueOf(zzyu4ZzZsD.zzX("val", 0)));
                        break;
                    case 99:
                        chartDataPoint.zz3d().zzL(2, Boolean.valueOf(zzyu4ZzZsD.zzX("val", true)));
                        break;
                    default:
                        zz39.zzK(zzyu4ZzZsD);
                        break;
                }
            } else {
                chartDataPoint.zz3d().zzL(6, zzV(zzyu4ZzZsD));
            }
        }
        return chartDataPoint;
    }

    public static void zzZ(zzZXT zzzxt, ChartMarker chartMarker) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        while (zzyu4ZzZsD.zzQ(RequestParameters.MARKER)) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 14) {
                chartMarker.zz2O().zzL(3, zz81.zzd(zzzxt));
            } else if (iZzTP == 18) {
                zzD9 zzd9 = new zzD9();
                zzZ(zzzxt, zzd9);
                chartMarker.zz2O().zzL(2, zzd9);
            } else if (iZzTP == 105) {
                chartMarker.zz2O().zzL(1, Integer.valueOf(zzyu4ZzZsD.zzX("val", 7)));
            } else if (iZzTP != 106) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                chartMarker.zz2O().zzL(0, Integer.valueOf(zzC6.zzQX(zzyu4ZzZsD.zzV("val", "none"))));
            }
        }
    }

    public static ChartDataLabelCollection zzZ(zzZXT zzzxt, zzGK zzgk, ChartSeries chartSeries) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        ChartDataLabelCollection chartDataLabelCollection = new ChartDataLabelCollection(zzgk, chartSeries);
        if (chartSeries != null) {
            chartSeries.hasDataLabels(true);
        }
        zzFT zzftZz3q = chartDataLabelCollection.zz3q();
        String localName = zzyu4ZzZsD.getLocalName();
        if (com.aspose.words.internal.zzZKN.equals(zzyu4ZzZsD.getNamespaceURI(), zzZX5.zz9(28, false))) {
            String strZzV = zzyu4ZzZsD.zzV("pos", "");
            if (com.aspose.words.internal.zzZYD.zzXk(strZzV)) {
                zzftZz3q.zzL(2, Integer.valueOf(zzC6.zzR6(strZzV)));
            }
        }
        while (zzyu4ZzZsD.zzQ(localName)) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP != 14 && iZzTP != 18) {
                if (iZzTP != 29) {
                    if (iZzTP != 25 && iZzTP != 26) {
                        switch (iZzTP) {
                            case 107:
                            case 108:
                            case 109:
                            case 110:
                            case 111:
                            case 112:
                            case 113:
                            case 114:
                            case 115:
                            case 116:
                            case 117:
                            case 118:
                                break;
                            case 119:
                                break;
                            case 120:
                                int iZzX = zzyu4ZzZsD.zzX("idx", -1);
                                if (iZzX >= 0) {
                                    chartDataLabelCollection.get(iZzX).isHidden(true);
                                }
                                break;
                            default:
                                zz39.zzK(zzyu4ZzZsD);
                                break;
                        }
                    }
                }
                chartDataLabelCollection.zzZ(zzZ(zzzxt, zzftZz3q, chartSeries));
            }
            zzZ(zzzxt, zzftZz3q, false);
        }
        chartDataLabelCollection.zz3j();
        return chartDataLabelCollection;
    }

    private static ChartDataLabel zzZ(zzZXT zzzxt, zzFT zzft, ChartSeries chartSeries) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        ChartDataLabel chartDataLabel = new ChartDataLabel(zzft, chartSeries);
        String localName = zzyu4ZzZsD.getLocalName();
        if (com.aspose.words.internal.zzZKN.equals(zzyu4ZzZsD.getNamespaceURI(), zzZX5.zz9(28, false))) {
            while (zzyu4ZzZsD.zzi()) {
                int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
                if (iZzTP == 19) {
                    chartDataLabel.zz3q().zzL(2, Integer.valueOf(zzC6.zzR6(zzyu4ZzZsD.getValue())));
                } else if (iZzTP != 27) {
                    zz39.zzI(zzyu4ZzZsD);
                } else {
                    chartDataLabel.setIndex(zzyu4ZzZsD.zzb());
                }
            }
            zzyu4ZzZsD.zzj();
        }
        while (zzyu4ZzZsD.zzQ(localName)) {
            zzZ(zzzxt, chartDataLabel.zz3q(), false);
        }
        return chartDataLabel;
    }

    private static void zzZ(zzZXT zzzxt, zzFT zzft, boolean z) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
        if (iZzTP == 14) {
            zzft.zzL(19, zz81.zzd(zzzxt));
            return;
        }
        if (iZzTP == 18) {
            if (z) {
                zzDB zzdb = new zzDB();
                zz51.zzZ(zzzxt, zzdb);
                zzft.zzL(21, zzdb);
                return;
            } else {
                zzD9 zzd9 = new zzD9();
                zzZ(zzzxt, zzd9);
                zzft.zzL(15, zzd9);
                return;
            }
        }
        if (iZzTP == 22) {
            zzft.zzL(4, zzS(zzzxt));
            return;
        }
        if (iZzTP == 55) {
            zzft.zzL(16, zzR(zzzxt));
            return;
        }
        if (iZzTP == 121) {
            zzft.zzL(14, Boolean.valueOf(zzyu4ZzZsD.zzX("val", true)));
            return;
        }
        if (iZzTP != 122) {
            switch (iZzTP) {
                case 25:
                    zzCL zzcl = new zzCL();
                    zzZ(zzzxt, zzcl);
                    zzft.zzL(17, zzcl);
                    break;
                case 26:
                    zzft.zzL(1, Boolean.valueOf(zzyu4ZzZsD.zzX("val", true)));
                    break;
                case 27:
                    zzft.zzL(3, Integer.valueOf(zzyu4ZzZsD.zzX("val", 0)));
                    break;
                default:
                    switch (iZzTP) {
                        case 107:
                            zzft.zzL(2, Integer.valueOf(zzC6.zzR6(zzyu4ZzZsD.zzV("val", "center"))));
                            break;
                        case 108:
                            zzft.zzL(5, zzX(zzyu4ZzZsD));
                            break;
                        case 109:
                            zzft.zzL(6, zzyu4ZzZsD.readString());
                            break;
                        case 110:
                            zzft.zzL(7, Boolean.valueOf(zzyu4ZzZsD.zzX("val", true)));
                            break;
                        case 111:
                            zzft.zzL(8, Boolean.valueOf(zzyu4ZzZsD.zzX("val", true)));
                            break;
                        case 112:
                            zzft.zzL(13, Boolean.valueOf(zzyu4ZzZsD.zzX("val", true)));
                            break;
                        case 113:
                            zzft.zzL(9, Boolean.valueOf(zzyu4ZzZsD.zzX("val", true)));
                            break;
                        case 114:
                            zzft.zzL(10, Boolean.valueOf(zzyu4ZzZsD.zzX("val", true)));
                            break;
                        case 115:
                            zzft.zzL(11, Boolean.valueOf(zzyu4ZzZsD.zzX("val", true)));
                            break;
                        case 116:
                            zzft.zzL(12, Boolean.valueOf(zzyu4ZzZsD.zzX("val", true)));
                            break;
                        case 117:
                            zzD9 zzd92 = new zzD9();
                            zzY(zzzxt, zzd92);
                            zzft.zzL(18, zzd92);
                            break;
                        case 118:
                            zzft.zzL(11, Boolean.valueOf(zzyu4ZzZsD.zzX("seriesName", false)));
                            zzft.zzL(8, Boolean.valueOf(zzyu4ZzZsD.zzX("categoryName", false)));
                            zzft.zzL(12, Boolean.valueOf(zzyu4ZzZsD.zzX("value", true)));
                            break;
                        default:
                            zz39.zzK(zzyu4ZzZsD);
                            break;
                    }
                    break;
            }
            return;
        }
        zzft.zzL(20, Boolean.valueOf(zzyu4ZzZsD.zzX("val", true)));
    }

    public static void zzZ(zzZXT zzzxt, zzFK zzfk) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzQ(localName)) {
            if ("AlternateContent".equals(zzyu4ZzZsD.getLocalName())) {
                zzY(zzzxt, zzfk);
            } else {
                zzCB zzcbZzL = zzL(zzzxt);
                if (zzcbZzL != null) {
                    zzfk.zzZ(zzcbZzL);
                }
            }
        }
    }

    public static void zzZ(zzZXT zzzxt, zzGB zzgb, int i, int i2) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        String localName = zzyu4ZzZsD.getLocalName();
        zzgb.zzL(i, Integer.valueOf(zzC6.zzQN(zzyu4ZzZsD.zzV(C18437z2.f56754h, ""))));
        while (zzyu4ZzZsD.zzQ(localName)) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 14) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                zzgb.zzL(i2, zz81.zzd(zzzxt));
            }
        }
    }

    public static void zzZ(zzZXT zzzxt, zzDE zzde) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        while (zzyu4ZzZsD.zzQ("layoutPr")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 14) {
                zzde.zzL(12, zz81.zzd(zzzxt));
            } else if (iZzTP != 118) {
                switch (iZzTP) {
                    case 147:
                        zzde.zzL(0, Integer.valueOf(zzC6.zzQE(zzyu4ZzZsD.zzV("val", ""))));
                        break;
                    case 148:
                        zzde.zzL(1, Integer.valueOf(zzC6.zzQF(zzyu4ZzZsD.zzV("val", ""))));
                        break;
                    case 149:
                        zzde.zzL(7, Boolean.TRUE);
                        break;
                    case 150:
                        zzde.zzL(8, zzU(zzyu4ZzZsD));
                        break;
                    case 151:
                        zzde.zzL(10, Integer.valueOf(zzC6.zzQC(zzyu4ZzZsD.zzV("quartileMethod", ""))));
                        break;
                    case 152:
                        zzde.zzL(11, zzT(zzyu4ZzZsD));
                        break;
                    default:
                        zz39.zzK(zzyu4ZzZsD);
                        break;
                }
            } else {
                zzZ(zzyu4ZzZsD, zzde);
            }
        }
    }

    private static void zzZ(zzYU4 zzyu4, zzDE zzde) {
        while (zzyu4.zzi()) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 154:
                    zzde.zzL(2, Boolean.valueOf(zzyu4.zz8()));
                    break;
                case 155:
                    zzde.zzL(3, Boolean.valueOf(zzyu4.zz8()));
                    break;
                case 156:
                    zzde.zzL(4, Boolean.valueOf(zzyu4.zz8()));
                    break;
                case 157:
                    zzde.zzL(5, Boolean.valueOf(zzyu4.zz8()));
                    break;
                case 158:
                    zzde.zzL(6, Boolean.valueOf(zzyu4.zz8()));
                    break;
                default:
                    zz39.zzI(zzyu4);
                    break;
            }
        }
        zzyu4.zzj();
    }
}
