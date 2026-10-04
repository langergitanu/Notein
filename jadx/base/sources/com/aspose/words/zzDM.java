package com.aspose.words;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzDM extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("id", "chart", "date1904", "externalData", CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, "pivotSource", "protection", "roundedCorners", "spPr", "style", "txPr", "userShapes", "AlternateContent", "clrMapOvr", "extLst", "printSettings", "chartData", "fmtOvrs", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "fmtOvr", "bg1", "tx1", "bg2", "tx2", "accent1", "accent2", "accent3", "accent4", "accent5", "accent6", "hlink", "folHlink", "autoUpdate", "numDim", "strDim", "Fallback", "Choice", "autoTitleDeleted", "backWall", "dispBlanksAs", "floor", "legend", "pivotFmts", "plotArea", "plotVisOnly", "showDLblsOverMax", "sideWall", NoteMeta.PROPERTY_TITLE, "view3D", "areaChart", "area3DChart", "lineChart", "line3DChart", "stockChart", "radarChart", "scatterChart", "pieChart", "pie3DChart", "doughnutChart", "barChart", "bar3DChart", "ofPieChart", "surfaceChart", "surface3DChart", "bubbleChart", "valAx", "catAx", "dateAx", "serAx", "layout", "dTable", "plotAreaRegion", "axis", "plotSurface", "series", "axId", "dLbls", "dropLines", "ser", "varyColors", "grouping", "gapDepth", "barDir", "gapWidth", "shape", "overlap", "serLines", "bubble3D", "bubbleScale", "showNegBubbles", "sizeRepresents", "firstSliceAng", "holeSize", "hiLowLines", RequestParameters.MARKER, "smooth", "upDownBars", "custSplit", "ofPieType", "secondPieSize", "splitPos", "splitType", "radarStyle", "scatterStyle", "bandFmts", "wireframe");
    private zzZXT zzZfi;

    private zzDM(zzZXT zzzxt) {
        this.zzZfi = zzzxt;
    }

    private static zzG2 zzF(zzZXT zzzxt) {
        zzG2 zzg2 = new zzG2();
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        while (zzyu4ZzZsD.zzi()) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 20:
                    zzg2.zzZf5 = zzyu4ZzZsD.getValue();
                    break;
                case 21:
                    zzg2.zzZf4 = zzyu4ZzZsD.getValue();
                    break;
                case 22:
                    zzg2.zzZf3 = zzyu4ZzZsD.getValue();
                    break;
                case 23:
                    zzg2.zzZf2 = zzyu4ZzZsD.getValue();
                    break;
                case 24:
                    zzg2.zzZf1 = zzyu4ZzZsD.getValue();
                    break;
                case 25:
                    zzg2.zzZf0 = zzyu4ZzZsD.getValue();
                    break;
                case 26:
                    zzg2.zzZeZ = zzyu4ZzZsD.getValue();
                    break;
                case 27:
                    zzg2.zzZeY = zzyu4ZzZsD.getValue();
                    break;
                case 28:
                    zzg2.zzZeX = zzyu4ZzZsD.getValue();
                    break;
                case 29:
                    zzg2.zzZeW = zzyu4ZzZsD.getValue();
                    break;
                case 30:
                    zzg2.zzZeV = zzyu4ZzZsD.getValue();
                    break;
                case 31:
                    zzg2.zzZeU = zzyu4ZzZsD.getValue();
                    break;
            }
        }
        zzyu4ZzZsD.zzj();
        while (zzyu4ZzZsD.zzQ("clrMapOvr")) {
            zz39.zzL(zzyu4ZzZsD);
        }
        return zzg2;
    }

    public static Shape zzG(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        if (!"chart".equals(zzyu4ZzZsD.getLocalName())) {
            return null;
        }
        String value = null;
        while (zzyu4ZzZsD.zzi()) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) == 0) {
                value = zzyu4ZzZsD.getValue();
            }
        }
        if (!com.aspose.words.internal.zzZYD.zzXk(value)) {
            return null;
        }
        zzZW1 zzzw1ZzNK = zzzxt.zzNK(value);
        Shape shape = new Shape(zzzxt.getDocument(), (byte) 0);
        zzzxt.zzT(shape);
        zzD8 zzd8 = new zzD8(com.aspose.words.internal.zzZKN.equals(zzzw1ZzNK.getNamespaceURI(), zzZX5.zz9(28, false)));
        shape.zzU(zzd8);
        zzY(zzzxt, zzd8);
        zzd8.zzZ(zzZW9.zzZB(zzzxt));
        boolean zZzYr9 = zzzxt.zzZqn().zzYr9();
        if (zzzxt.zzY(zzzw1ZzNK.zzZmN(), zzZX5.zz9(22, zZzYr9)) != null) {
            zzd8.zzZ(zzG0.zzZ(zzzxt));
            zzzxt.zzZmi();
        }
        if (zzzxt.zzY(zzzw1ZzNK.zzZmN(), zzZX5.zz9(23, zZzYr9)) != null) {
            zzd8.zzZ(zzCZ.zzD(zzzxt));
            zzzxt.zzZmi();
        }
        zzzxt.zztj(18);
        zzzxt.zzZmi();
        return shape;
    }

    private static int zzRn(String str) {
        switch (zzUR.zzTP(str)) {
            case 49:
                return 0;
            case 50:
                return 1;
            case 51:
                return 2;
            case 52:
                return 3;
            case 53:
                return 4;
            case 54:
                return 5;
            case 55:
                return 6;
            case 56:
                return 7;
            case 57:
                return 8;
            case 58:
                return 9;
            case 59:
                return 10;
            case 60:
                return 11;
            case 61:
                return 12;
            case 62:
                return 13;
            case 63:
                return 14;
            case 64:
                return 15;
            default:
                throw new IllegalArgumentException("Unexpected tag name");
        }
    }

    private zzDT zzV(zzEY zzey) throws Exception {
        zzDT zzdt = new zzDT(zzey);
        if (com.aspose.words.internal.zzZKN.equals(this.zzZfi.zzZsD().getNamespaceURI(), zzZX5.zz9(28, false))) {
            zzF5 zzf5 = new zzF5();
            zzf5.zzY(this.zzZfi.getDocument());
            zzdt.zzU(zzf5);
        }
        while (this.zzZfi.zzZsD().zzQ("plotArea")) {
            int iZzTP = zzUR.zzTP(this.zzZfi.zzZsD().getLocalName());
            if (iZzTP == 8) {
                zzFW.zzZ(this.zzZfi, zzdt.zzaQ());
            } else if (iZzTP != 14) {
                switch (iZzTP) {
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                        zzdt.zzU(zzW(this.zzZfi.getDocument()));
                        break;
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        zzdt.zzN(zzGA.zzZ(this.zzZfi, zzdt.zzZJd(), false));
                        break;
                    case 69:
                        zzdt.zzZ(zzFW.zzS(this.zzZfi));
                        break;
                    case 70:
                        zzdt.zzZ(zzFW.zzZ(this.zzZfi, zzdt));
                        break;
                    case 71:
                        zzX(zzdt);
                        break;
                    case 72:
                        zzdt.zzN(zzGA.zzZ(this.zzZfi, zzdt.zzZJd(), true));
                        break;
                    default:
                        zz39.zzK(this.zzZfi.zzZsD());
                        break;
                }
            } else {
                zzdt.setExtensions(zz81.zzd(this.zzZfi));
            }
        }
        for (ChartAxis chartAxis : zzdt.zz3G()) {
            if (chartAxis.zz3I() == null) {
                chartAxis.zzZ(zzdt.zzZJd());
            }
        }
        return zzdt;
    }

    private void zzW(zzD8 zzd8) {
        while (this.zzZfi.zzZsD().zzQ("AlternateContent")) {
            int iZzTP = zzUR.zzTP(this.zzZfi.zzZsD().getLocalName());
            if (iZzTP == 35) {
                while (this.zzZfi.zzZsD().zzQ("Fallback")) {
                    if (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName()) != 9) {
                        zz39.zzL(this.zzZfi.zzZsD());
                    } else {
                        zzd8.zzKu(this.zzZfi.zzZsD().zzX("val", 0));
                    }
                }
            } else if (iZzTP != 36) {
                zz39.zzK(this.zzZfi.zzZsD());
            } else {
                while (this.zzZfi.zzZsD().zzQ("Choice")) {
                    if (zzUR.zzTP(this.zzZfi.zzZsD().getLocalName()) != 9) {
                        zz39.zzL(this.zzZfi.zzZsD());
                    } else {
                        zzd8.zzKt(this.zzZfi.zzZsD().zzX("val", 0));
                    }
                }
            }
        }
    }

    private static void zzX(zzD8 zzd8, zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzFV zzfv = new zzFV();
        zzfv.setId(zzyu4ZzZsD.zzX("id", -1));
        while (zzyu4ZzZsD.zzQ(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 14) {
                zzfv.setExtensions(zz81.zzd(zzzxt));
            } else if (iZzTP == 33 || iZzTP == 34) {
                zzFK zzfk = new zzFK();
                zzfk.zzZ(zzFW.zzO(zzzxt));
                zzfv.zzZNU().add(zzfk);
            } else {
                zz39.zzK(zzyu4ZzZsD);
            }
        }
        zzd8.zzZHI().zzZ(zzfv);
    }

    private static void zzY(zzZXT zzzxt, zzD8 zzd8) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzDM zzdm = new zzDM(zzzxt);
        while (zzyu4ZzZsD.zzQ("chartSpace")) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 1:
                    zzd8.zzW(zzdm.zzZIJ());
                    break;
                case 2:
                    zzd8.zzXD(zzyu4ZzZsD.zzX("val", false));
                    break;
                case 3:
                    zzY(zzd8, zzzxt);
                    break;
                case 4:
                    zzd8.zzRf(zzyu4ZzZsD.zzV("val", ""));
                    break;
                case 5:
                    zzd8.zzZ(zzFW.zzU(zzzxt));
                    break;
                case 6:
                    zzd8.zzZ(zzFW.zzZ(zzyu4ZzZsD));
                    break;
                case 7:
                    zzd8.zzXC(zzyu4ZzZsD.zzX("val", true));
                    break;
                case 8:
                    zzFW.zzZ(zzzxt, zzd8.zzaQ());
                    break;
                case 9:
                    zzd8.zzKu(zzyu4ZzZsD.zzX("val", 0));
                    break;
                case 10:
                    zzFW.zzZ(zzzxt, zzd8.zzaR());
                    break;
                case 11:
                    zzDA.zzZ(zzzxt, zzyu4ZzZsD.zzV("id", ""));
                    break;
                case 12:
                    zzdm.zzW(zzd8);
                    break;
                case 13:
                    zzd8.zzZ(zzF(zzzxt));
                    break;
                case 14:
                    zzd8.setExtensions(zz81.zzd(zzzxt));
                    break;
                case 15:
                    zz39.zzL(zzyu4ZzZsD);
                    break;
                case 16:
                    zzZ(zzd8, zzzxt);
                    break;
                case 17:
                    zzZ(zzd8.zzZHH(), zzzxt);
                    break;
                default:
                    zz39.zzK(zzyu4ZzZsD);
                    break;
            }
        }
    }

    public static void zzZ(zzZXT zzzxt, zzD8 zzd8) throws Exception {
        zzY(zzzxt, zzd8);
    }

    private zzEY zzZIJ() throws Exception {
        zzEY zzey = new zzEY();
        while (this.zzZfi.zzZsD().zzQ("chart")) {
            int iZzTP = zzUR.zzTP(this.zzZfi.zzZsD().getLocalName());
            if (iZzTP != 14) {
                switch (iZzTP) {
                    case 37:
                        zzey.zzXV(this.zzZfi.zzZsD().zzX("val", true));
                        break;
                    case 38:
                        zzey.zzZ(zzFW.zzT(this.zzZfi));
                        break;
                    case 39:
                        zzey.zzKT(zzC6.zzR5(this.zzZfi.zzZsD().zzV("val", "")));
                        break;
                    case 40:
                        zzey.zzY(zzFW.zzT(this.zzZfi));
                        break;
                    case 41:
                        zzey.zzZ(zzFW.zzZ(this.zzZfi, zzey));
                        break;
                    case 42:
                        zzey.zzZ(zzFW.zzX(this.zzZfi));
                        break;
                    case 43:
                        zzey.zzZ(zzV(zzey));
                        break;
                    case 44:
                        zzey.zzXU(this.zzZfi.zzZsD().zzX("val", true));
                        break;
                    case 45:
                        zzey.zzXT(this.zzZfi.zzZsD().zzX("val", true));
                        break;
                    case 46:
                        zzey.zzX(zzFW.zzT(this.zzZfi));
                        break;
                    case 47:
                        zzey.setDCTitle(zzFW.zzZ(zzey, this.zzZfi));
                        break;
                    case 48:
                        zzey.zzZ(zzFW.zzV(this.zzZfi));
                        break;
                    default:
                        zz39.zzK(this.zzZfi.zzZsD());
                        break;
                }
            } else {
                zzey.setExtensions(zz81.zzd(this.zzZfi));
            }
        }
        return zzey;
    }

    private static void zzZ(zzD8 zzd8, zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzyu4ZzZsD.zzj();
        while (zzyu4ZzZsD.zzQ("chartData")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 3) {
                zzY(zzd8, zzzxt);
            } else if (iZzTP == 14) {
                zzd8.zzZHI().setExtensions(zz81.zzd(zzzxt));
            } else if (iZzTP != 18) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                zzX(zzd8, zzzxt);
            }
        }
    }

    private static void zzZ(ArrayList<zzEV> arrayList, zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzyu4ZzZsD.zzj();
        while (zzyu4ZzZsD.zzQ("fmtOvrs")) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 19) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                arrayList.add(zzFW.zzI(zzzxt));
            }
        }
    }

    private void zzX(zzDT zzdt) throws Exception {
        zzGK zzgkZzZJd = zzdt.zzZJd();
        com.aspose.words.internal.zz7D zz7d = new com.aspose.words.internal.zz7D();
        while (this.zzZfi.zzZsD().zzQ("plotAreaRegion")) {
            int iZzTP = zzUR.zzTP(this.zzZfi.zzZsD().getLocalName());
            if (iZzTP == 14) {
                zzdt.zzP(zz81.zzd(this.zzZfi));
            } else if (iZzTP == 73) {
                zzdt.zzW(zzFW.zzT(this.zzZfi));
            } else if (iZzTP != 74) {
                zz39.zzK(this.zzZfi.zzZsD());
            } else {
                zzgkZzZJd.zzZPj().zzE(zzDD.zzZ(this.zzZfi, zzgkZzZJd, zz7d));
            }
        }
        zzZ(zzgkZzZJd.zzZPj(), (com.aspose.words.internal.zz7D<ChartSeries>) zz7d);
    }

    private static void zzZ(zzDF zzdf, com.aspose.words.internal.zz7D<ChartSeries> zz7d) {
        for (ChartSeries chartSeries : zz7d.zzxs()) {
            chartSeries.zzP(zzdf.get(zz7d.get(chartSeries)));
        }
    }

    private zzGK zzW(DocumentBase documentBase) throws Exception {
        String localName = this.zzZfi.zzZsD().getLocalName();
        zzGK zzgkZzKU = zzF4.zzKU(zzRn(localName));
        zzgkZzKU.zzY(documentBase);
        while (this.zzZfi.zzZsD().zzQ(localName)) {
            int iZzTP = zzUR.zzTP(this.zzZfi.zzZsD().getLocalName());
            if (iZzTP != 14) {
                switch (iZzTP) {
                    case 75:
                        zzgkZzKU.zzLz(this.zzZfi.zzZsD().zzX("val", 0));
                        break;
                    case 76:
                        zzgkZzKU.zzZPg().zzL(3, zzFW.zzZ(this.zzZfi, zzgkZzKU, (ChartSeries) null));
                        break;
                    case 77:
                        zzgkZzKU.zzZPg().zzL(5, Boolean.TRUE);
                        zzFW.zzY(this.zzZfi, (zzD9) zzgkZzKU.zzZPg().zzLv(4));
                        break;
                    case 78:
                        ChartSeries chartSeriesZzZ = zzDD.zzZ(this.zzZfi, zzgkZzKU, null);
                        if (chartSeriesZzZ.getValueCount() > 0) {
                            zzgkZzKU.zzZPj().zzE(chartSeriesZzZ);
                        }
                        break;
                    case 79:
                        zzgkZzKU.zzZPg().zzL(14, Boolean.valueOf(this.zzZfi.zzZsD().zzX("val", true)));
                        break;
                    case 80:
                        zzgkZzKU.zzZPg().zzKB(zzC6.zzRa(this.zzZfi.zzZsD().zzV("val", "")));
                        break;
                    case 81:
                        zzgkZzKU.zzZPg().zzL(10, Integer.valueOf(this.zzZfi.zzZsD().zzX("val", 150)));
                        break;
                    case 82:
                        zzgkZzKU.zzZPg().zzL(15, Integer.valueOf(zzC6.zzRb(this.zzZfi.zzZsD().zzV("val", ""))));
                        break;
                    case 83:
                        zzgkZzKU.zzZPg().zzL(11, Integer.valueOf(this.zzZfi.zzZsD().zzX("val", 150)));
                        break;
                    case 84:
                        zzgkZzKU.zzZPg().zzL(16, Integer.valueOf(zzC6.zzQR(this.zzZfi.zzZsD().zzV("val", ""))));
                        break;
                    case 85:
                        zzgkZzKU.zzZPg().zzL(17, Integer.valueOf(this.zzZfi.zzZsD().zzX("val", 0)));
                        break;
                    case 86:
                        zzgkZzKU.zzZPg().zzL(9, Boolean.TRUE);
                        zzFW.zzY(this.zzZfi, (zzD9) zzgkZzKU.zzZPg().zzLv(8));
                        break;
                    case 87:
                        zzgkZzKU.zzZPg().zzL(18, Boolean.valueOf(this.zzZfi.zzZsD().zzX("val", true)));
                        break;
                    case 88:
                        zzgkZzKU.zzZPg().zzL(19, Integer.valueOf(this.zzZfi.zzZsD().zzX("val", 0)));
                        break;
                    case 89:
                        zzgkZzKU.zzZPg().zzL(20, Boolean.valueOf(this.zzZfi.zzZsD().zzX("val", true)));
                        break;
                    case 90:
                        zzgkZzKU.zzZPg().zzL(21, Integer.valueOf(zzC6.zzQQ(this.zzZfi.zzZsD().zzV("val", ""))));
                        break;
                    case 91:
                        zzgkZzKU.zzZPg().zzL(22, Integer.valueOf(this.zzZfi.zzZsD().zzX("val", 0)));
                        break;
                    case 92:
                        zzgkZzKU.zzZPg().zzL(23, Integer.valueOf(this.zzZfi.zzZsD().zzX("val", 10)));
                        break;
                    case 93:
                        zzgkZzKU.zzZPg().zzL(7, Boolean.TRUE);
                        zzFW.zzY(this.zzZfi, (zzD9) zzgkZzKU.zzZPg().zzLv(6));
                        break;
                    case 94:
                        zzgkZzKU.zzZPg().zzL(24, Boolean.valueOf(this.zzZfi.zzZsD().zzX("val", true)));
                        break;
                    case 95:
                        zzgkZzKU.zzZPg().zzL(25, Boolean.valueOf(this.zzZfi.zzZsD().zzX("val", true)));
                        break;
                    case 96:
                        zzCH zzch = new zzCH();
                        zzFW.zzZ(this.zzZfi, zzch);
                        zzgkZzKU.zzZPg().zzL(26, zzch);
                        break;
                    case 97:
                        zzgkZzKU.zzZPg().zzL(27, zzFW.zzY(this.zzZfi.zzZsD()));
                        break;
                    case 98:
                        zzgkZzKU.zzZPg().zzKA(zzC6.zzQW(this.zzZfi.zzZsD().zzV("val", "")));
                        break;
                    case 99:
                        zzgkZzKU.zzZPg().zzL(29, Integer.valueOf(this.zzZfi.zzZsD().zzX("val", 75)));
                        break;
                    case 100:
                        zzgkZzKU.zzZPg().zzL(30, Double.valueOf(this.zzZfi.zzZsD().zzZ("val", 0.0d)));
                        break;
                    case 101:
                        zzgkZzKU.zzZPg().zzL(31, Integer.valueOf(zzC6.zzQP(this.zzZfi.zzZsD().zzV("val", ""))));
                        break;
                    case 102:
                        zzgkZzKU.zzZPg().zzL(32, Integer.valueOf(zzC6.zzQT(this.zzZfi.zzZsD().zzV("val", ""))));
                        break;
                    case 103:
                        zzgkZzKU.zzZPg().zzL(33, Integer.valueOf(zzC6.zzQS(this.zzZfi.zzZsD().zzV("val", ""))));
                        break;
                    case 104:
                        zzFW.zzZ(this.zzZfi, (zzG7) zzgkZzKU.zzZPg().zzLv(34));
                        break;
                    case 105:
                        zzgkZzKU.zzZPg().zzL(35, Boolean.valueOf(this.zzZfi.zzZsD().zzX("val", true)));
                        break;
                    default:
                        zz39.zzK(this.zzZfi.zzZsD());
                        break;
                }
            } else {
                zzgkZzKU.zzZPg().zzL(36, zz81.zzd(this.zzZfi));
            }
        }
        return zzgkZzKU;
    }

    private static void zzY(zzD8 zzd8, zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        String strZzV = zzyu4ZzZsD.zzV("id", "");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzV)) {
            zzd8.zzZ(zzzxt.zzNP(strZzV));
            if (zzd8.zzZHV() == null) {
                zzd8.zzRg(zzzxt.zzY9(strZzV));
            }
            zzd8.setAutoUpdate(zzyu4ZzZsD.zzX("autoUpdate", true));
            zzyu4ZzZsD.zzj();
            while (zzyu4ZzZsD.zzQ("externalData")) {
                if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 32) {
                    zz39.zzK(zzyu4ZzZsD);
                } else {
                    zzd8.setAutoUpdate(zzyu4ZzZsD.zzX("val", true));
                }
            }
        }
    }
}
