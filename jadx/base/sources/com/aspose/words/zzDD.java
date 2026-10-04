package com.aspose.words;

import com.alibaba.sdk.android.oss.common.RequestParameters;

/* JADX INFO: loaded from: classes6.dex */
final class zzDD extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("layoutId", "hidden", "ownerIdx", "uniqueId", "formatIdx", "idx", "order", "explosion", "invertIfNegative", "bubble3D", "smooth", "shape", "cat", "xVal", "val", "yVal", "bubbleSize", "errBars", RequestParameters.MARKER, "dLbls", "dataLabels", "dPt", "dataPt", "pictureOptions", "trendline", "tx", "spPr", "valueColors", "dataId", "axisId", "layoutPr", "extLst");

    private static void zzB(ChartSeries chartSeries) {
        zzFN zzfnZz3d = chartSeries.zz2H().zz3d();
        if (zzfnZz3d.zzLh(2)) {
            boolean invertIfNegative = chartSeries.getInvertIfNegative();
            boolean zBooleanValue = ((Boolean) zzfnZz3d.zzZN9()).booleanValue();
            for (ChartDataPoint chartDataPoint : chartSeries.getDataPoints().zz3a()) {
                if (chartDataPoint.zz3d().zzLh(2)) {
                    if (chartDataPoint.getInvertIfNegative() == invertIfNegative) {
                        chartDataPoint.zz3d().zzZNG();
                    }
                } else if (invertIfNegative != zBooleanValue) {
                    chartDataPoint.setInvertIfNegative(zBooleanValue);
                }
            }
        }
    }

    public static ChartSeries zzZ(zzZXT zzzxt, zzGK zzgk, com.aspose.words.internal.zz7D<ChartSeries> zz7d) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        ChartSeries chartSeries = new ChartSeries(zzgk);
        String localName = zzyu4ZzZsD.getLocalName();
        if (com.aspose.words.internal.zzZKN.equals(zzyu4ZzZsD.getNamespaceURI(), zzZX5.zz9(28, false))) {
            while (zzyu4ZzZsD.zzi()) {
                int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
                if (iZzTP == 0) {
                    chartSeries.zzNL(zzC6.zzQG(zzyu4ZzZsD.getValue()));
                } else if (iZzTP == 1) {
                    chartSeries.setHidden(zzyu4ZzZsD.zz8());
                } else if (iZzTP == 2) {
                    int iZzb = zzyu4ZzZsD.zzb();
                    if (iZzb < zzgk.zzZPj().getCount()) {
                        chartSeries.zzP(zzgk.zzZPj().get(iZzb));
                    } else {
                        zz7d.zzP(chartSeries, iZzb);
                    }
                } else if (iZzTP == 3) {
                    chartSeries.zzT6(zzyu4ZzZsD.getValue());
                } else if (iZzTP != 4) {
                    zz39.zzI(zzyu4ZzZsD);
                } else {
                    chartSeries.zzNK(zzyu4ZzZsD.zzb());
                }
            }
            zzyu4ZzZsD.zzj();
        }
        while (zzyu4ZzZsD.zzQ(localName)) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 5:
                    chartSeries.setIndex(zzyu4ZzZsD.zzX("val", 0));
                    break;
                case 6:
                    chartSeries.setOrder(zzyu4ZzZsD.zzX("val", 0));
                    break;
                case 7:
                    chartSeries.zz2H().zz3d().zzL(1, Integer.valueOf(zzyu4ZzZsD.zzX("val", 0)));
                    break;
                case 8:
                    chartSeries.zz2H().zz3d().zzL(2, Boolean.valueOf(zzyu4ZzZsD.zzX("val", true)));
                    break;
                case 9:
                    chartSeries.zz2H().zz3d().zzL(3, Boolean.valueOf(zzyu4ZzZsD.zzX("val", true)));
                    break;
                case 10:
                    chartSeries.setSmooth(zzyu4ZzZsD.zzX("val", true));
                    break;
                case 11:
                    chartSeries.setShape(zzC6.zzQR(zzyu4ZzZsD.zzV("val", "")));
                    break;
                case 12:
                case 13:
                    zzFW.zzZ(zzzxt, chartSeries.zz2z().zzZMu());
                    break;
                case 14:
                case 15:
                    zzFW.zzZ(zzzxt, chartSeries.zz2y().zzZMu());
                    break;
                case 16:
                    zzFW.zzZ(zzzxt, chartSeries.zz2x().zzZMu());
                    break;
                case 17:
                    chartSeries.zzZ(zzFW.zzM(zzzxt));
                    break;
                case 18:
                    ChartMarker chartMarker = new ChartMarker(zzgk);
                    zzFW.zzZ(zzzxt, chartMarker);
                    chartSeries.zz2H().zz3d().zzL(4, chartMarker);
                    break;
                case 19:
                case 20:
                    chartSeries.zzX(zzFW.zzZ(zzzxt, zzgk, chartSeries));
                    break;
                case 21:
                case 22:
                    chartSeries.getDataPoints().zzW(zzFW.zzZ(zzzxt, zzgk));
                    break;
                case 23:
                    chartSeries.zz2H().zz3d().zzL(6, zzFW.zzV(zzyu4ZzZsD));
                    break;
                case 24:
                    chartSeries.zzZ(zzFW.zzK(zzzxt));
                    break;
                case 25:
                    chartSeries.zzZ(zzFW.zzR(zzzxt));
                    break;
                case 26:
                    zzD9 zzd9 = new zzD9();
                    zzFW.zzZ(zzzxt, zzd9);
                    chartSeries.zz2H().zz3d().zzL(5, zzd9);
                    break;
                case 27:
                    chartSeries.zzZ(zzFW.zzH(zzzxt));
                    break;
                case 28:
                    chartSeries.zzNJ(zzyu4ZzZsD.zzX("val", -1));
                    break;
                case 29:
                    chartSeries.zzNI(zzyu4ZzZsD.zzX("val", -1));
                    break;
                case 30:
                    zzFW.zzZ(zzzxt, chartSeries.zz2k());
                    break;
                case 31:
                    chartSeries.setExtensions(zz81.zzd(zzzxt));
                    break;
                default:
                    zz39.zzK(zzyu4ZzZsD);
                    break;
            }
        }
        zzB(chartSeries);
        chartSeries.zz2F();
        return chartSeries;
    }
}
