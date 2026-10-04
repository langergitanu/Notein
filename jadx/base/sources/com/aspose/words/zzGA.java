package com.aspose.words;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes6.dex */
final class zzGA extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("id", "hidden", "axId", "catScaling", "valScaling", "scaling", RequestParameters.SUBRESOURCE_DELETE, "axPos", "majorGridlines", "minorGridlines", NoteMeta.PROPERTY_TITLE, "numFmt", "majorTickMark", "minorTickMark", "majorTickMarks", "minorTickMarks", "tickLabels", "tickLblPos", "spPr", "txPr", "crossAx", "crosses", "crossesAt", "crossBetween", "majorUnit", "minorUnit", "dispUnits", "units", "auto", "lblAlgn", "lblOffset", "tickLblSkip", "tickMarkSkip", "noMultiLvlLbl", "baseTimeUnit", "majorTimeUnit", "minorTimeUnit", "extLst", "catAx", "dateAx", "serAx", "valAx", "axis");
    private zzZXT zzZfi;

    private zzGA(zzZXT zzzxt) {
        this.zzZfi = zzzxt;
    }

    private static void zzO(ChartAxis chartAxis) {
        if (com.aspose.words.internal.zzAN.zzL(chartAxis.zzaR().zzZHh().zzZCC().zzZQQ(), -1000.0d)) {
            chartAxis.zzaR().zzZHh().zzZxJ();
            chartAxis.zzaR().zzZHh().zzZtz();
        }
    }

    public static void zzP(ChartAxis chartAxis) {
        zz10 zz10Var = new zz10();
        if (chartAxis.zz40()) {
            zz10Var.zzX(zzHK.zzYR(-90.0d));
        }
        if (chartAxis.zz48() != null) {
            chartAxis.zz48().zzaR().zzZHh().zzV(zz10Var);
        }
        if (chartAxis.getDisplayUnit().zzb2() != null) {
            chartAxis.getDisplayUnit().zzb2().zzaR().zzZHh().zzV(zz10Var);
        }
    }

    private static int zzRB(String str) {
        switch (zzUR.zzTP(str)) {
            case 38:
            case 39:
                return 0;
            case 40:
                return 1;
            case 41:
            case 42:
                return 2;
            default:
                throw new IllegalArgumentException("Unexpected axis type.");
        }
    }

    private zzET zzRC(String str) throws Exception {
        zzET zzet = new zzET();
        while (this.zzZfi.zzZsD().zzQ(str)) {
            int iZzTP = zzUR.zzTP(this.zzZfi.zzZsD().getLocalName());
            if (iZzTP == 18) {
                zzFW.zzZ(this.zzZfi, zzet.zzaQ());
            } else if (iZzTP != 37) {
                zz39.zzK(this.zzZfi.zzZsD());
            } else {
                zzet.setExtensions(zz81.zzd(this.zzZfi));
            }
        }
        return zzet;
    }

    public static ChartAxis zzZ(zzZXT zzzxt, zzGK zzgk, boolean z) throws Exception {
        zzGA zzga = new zzGA(zzzxt);
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        String localName = zzyu4ZzZsD.getLocalName();
        ChartAxis chartAxis = new ChartAxis(zzRB(localName), zzgk, zzzxt.getDocument(), z);
        if (chartAxis.zz3Z()) {
            chartAxis.zz4p().zzL(2, Boolean.valueOf("dateAx".equals(localName)));
        }
        if (com.aspose.words.internal.zzZKN.equals(zzyu4ZzZsD.getNamespaceURI(), zzZX5.zz9(28, false))) {
            while (zzyu4ZzZsD.zzi()) {
                int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
                if (iZzTP == 0) {
                    chartAxis.zzOd(zzyu4ZzZsD.zzb());
                    zzgk.zzLz(chartAxis.zz4n());
                } else if (iZzTP != 1) {
                    zz39.zzI(zzyu4ZzZsD);
                } else {
                    chartAxis.setHidden(zzyu4ZzZsD.zz8());
                }
            }
            chartAxis.zzYt(false);
        }
        zzyu4ZzZsD.zzj();
        while (zzyu4ZzZsD.zzQ(localName)) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 2:
                    chartAxis.zzOd(zzyu4ZzZsD.zzX("val", 0));
                    break;
                case 3:
                    chartAxis.setType(0);
                    zzFW.zzZ(zzyu4ZzZsD, chartAxis.getScaling());
                    break;
                case 4:
                    chartAxis.setType(2);
                    zzFW.zzZ(zzyu4ZzZsD, chartAxis);
                    break;
                case 5:
                    zzFW.zzZ(zzzxt, chartAxis.getScaling());
                    break;
                case 6:
                    chartAxis.setHidden(zzyu4ZzZsD.zzX("val", true));
                    break;
                case 7:
                    chartAxis.zzOc(zzC6.zzRc(zzyu4ZzZsD.zzV("val", "")));
                    break;
                case 8:
                    chartAxis.zzZ(zzga.zzRC("majorGridlines"));
                    break;
                case 9:
                    chartAxis.zzY(zzga.zzRC("minorGridlines"));
                    break;
                case 10:
                    chartAxis.zzZ(zzFW.zzZ(chartAxis, zzzxt));
                    break;
                case 11:
                    chartAxis.zzZ(zzFW.zzX(zzyu4ZzZsD));
                    break;
                case 12:
                    chartAxis.setMajorTickMark(zzC6.zzQN(zzyu4ZzZsD.zzV("val", "")));
                    break;
                case 13:
                    chartAxis.setMinorTickMark(zzC6.zzQN(zzyu4ZzZsD.zzV("val", "")));
                    break;
                case 14:
                    zzFW.zzZ(zzzxt, chartAxis.zz4p(), 16, 29);
                    break;
                case 15:
                    zzFW.zzZ(zzzxt, chartAxis.zz4p(), 17, 30);
                    break;
                case 16:
                    chartAxis.zzYt(true);
                    zzZ(zzzxt, chartAxis);
                    break;
                case 17:
                    chartAxis.getTickLabels().setPosition(zzC6.zzQO(zzyu4ZzZsD.zzV("val", "")));
                    break;
                case 18:
                    zzFW.zzZ(zzzxt, chartAxis.zzaQ());
                    break;
                case 19:
                    zzFW.zzZ(zzzxt, chartAxis.zzaR());
                    break;
                case 20:
                    chartAxis.zzOb(zzyu4ZzZsD.zzX("val", 0));
                    break;
                case 21:
                    chartAxis.setCrosses(zzC6.zzR7(zzyu4ZzZsD.zzV("val", "")));
                    break;
                case 22:
                    chartAxis.setCrossesAt(zzyu4ZzZsD.zzZ("val", 0.0d));
                    chartAxis.setCrosses(3);
                    break;
                case 23:
                    chartAxis.zzOa(zzC6.zzR8(zzyu4ZzZsD.zzV("val", "")));
                    break;
                case 24:
                    chartAxis.zz4g().setValue(zzyu4ZzZsD.zzZ("val", 1.0d));
                    break;
                case 25:
                    chartAxis.zz4f().setValue(zzyu4ZzZsD.zzZ("val", 0.5d));
                    break;
                case 26:
                case 27:
                    chartAxis.zzZ(zzFW.zzY(chartAxis, zzzxt));
                    break;
                case 28:
                    if (zzyu4ZzZsD.zzX("val", true)) {
                        chartAxis.setCategoryType(0);
                    }
                    break;
                case 29:
                    chartAxis.zzOe(zzC6.zzR1(zzyu4ZzZsD.zzV("val", "")));
                    break;
                case 30:
                    chartAxis.zz4p().zzL(11, Integer.valueOf(zzyu4ZzZsD.zzX("val", 100)));
                    break;
                case 31:
                    chartAxis.zz4p().zzL(25, Integer.valueOf(zzyu4ZzZsD.zzX("val", 1)));
                    chartAxis.getTickLabels().isAutoSpacing(false);
                    break;
                case 32:
                    chartAxis.zz4p().zzL(28, Integer.valueOf(zzyu4ZzZsD.zzX("val", 1)));
                    break;
                case 33:
                    chartAxis.zzYu(zzyu4ZzZsD.zzX("val", true));
                    break;
                case 34:
                    chartAxis.setBaseTimeUnit(zzC6.zzQM(zzyu4ZzZsD.zzV("val", "")));
                    break;
                case 35:
                    chartAxis.setMajorUnitScale(zzC6.zzQM(zzyu4ZzZsD.zzV("val", "")));
                    break;
                case 36:
                    chartAxis.setMinorUnitScale(zzC6.zzQM(zzyu4ZzZsD.zzV("val", "")));
                    break;
                case 37:
                    chartAxis.setExtensions(zz81.zzd(zzzxt));
                    break;
                default:
                    zz39.zzK(zzyu4ZzZsD);
                    break;
            }
        }
        zzP(chartAxis);
        zzO(chartAxis);
        return chartAxis;
    }

    private static void zzZ(zzZXT zzzxt, ChartAxis chartAxis) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        while (zzyu4ZzZsD.zzQ("tickLabels")) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 37) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                chartAxis.zzS(zz81.zzd(zzzxt));
            }
        }
    }
}
