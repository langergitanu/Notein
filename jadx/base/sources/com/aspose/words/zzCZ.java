package com.aspose.words;

import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes6.dex */
final class zzCZ extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR;
    private static com.aspose.words.internal.zzZYI zzZ9S;

    static {
        com.aspose.words.internal.zzZYI zzzyi = new com.aspose.words.internal.zzZYI();
        zzZ9S = zzzyi;
        zzzyi.add("axisTitle", 0);
        zzZ9S.add("categoryAxis", 1);
        zzZ9S.add("chartArea", 2);
        zzZ9S.add("dataLabel", 3);
        zzZ9S.add("dataLabelCallout", 4);
        zzZ9S.add("dataPoint", 5);
        zzZ9S.add("dataPoint3D", 6);
        zzZ9S.add("dataPointLine", 7);
        zzZ9S.add("dataPointMarker", 8);
        zzZ9S.add("dataPointWireframe", 9);
        zzZ9S.add("dataTable", 10);
        zzZ9S.add("downBar", 11);
        zzZ9S.add("dropLine", 12);
        zzZ9S.add("errorBar", 13);
        zzZ9S.add("floor", 14);
        zzZ9S.add("gridlineMajor", 15);
        zzZ9S.add("gridlineMinor", 16);
        zzZ9S.add("hiLoLine", 17);
        zzZ9S.add("leaderLine", 18);
        zzZ9S.add("legend", 19);
        zzZ9S.add("plotArea", 20);
        zzZ9S.add("plotArea3D", 21);
        zzZ9S.add("seriesAxis", 22);
        zzZ9S.add("seriesLine", 23);
        zzZ9S.add(NoteMeta.PROPERTY_TITLE, 24);
        zzZ9S.add("trendline", 25);
        zzZ9S.add("trendlineLabel", 26);
        zzZ9S.add("upBar", 27);
        zzZ9S.add("valueAxis", 28);
        zzZ9S.add("wall", 29);
        zzUR = new com.aspose.words.internal.zzZHW("id", "dataPointMarkerLayout", "extLst", "mods", "lnRef", "lineWidthScale", "fillRef", "effectRef", "fontRef", "spPr", "defRPr", "bodyPr");
    }

    private static zzD2 zzA(zzZXT zzzxt) {
        zzD2 zzd2 = new zzD2();
        zzd2.setValue(zzzxt.zzZsD().zzV("val", ""));
        zzd2.zze(zzBR.zzV(zzzxt.zzZsD(), zzzxt.zzZqn()));
        return zzd2;
    }

    private static zzCY zzB(zzZXT zzzxt) {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzCY zzcy = new zzCY();
        zzcy.zzIU(zzyu4ZzZsD.zzX("idx", 0));
        zzcy.zzI(zzS(zzyu4ZzZsD));
        zzZ(zzzxt, zzcy);
        return zzcy;
    }

    private static zzD1 zzC(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzD1 zzd1 = new zzD1();
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzi()) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 3) {
                zz39.zzI(zzyu4ZzZsD);
            } else {
                zzd1.zzI(com.aspose.words.internal.zzZKN.zzR(zzyu4ZzZsD.getValue(), ControlChar.SPACE_CHAR));
            }
        }
        zzyu4ZzZsD.zzj();
        while (zzyu4ZzZsD.zzQ(localName)) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 2:
                    zzd1.setExtensions(zz81.zzd(zzzxt));
                    break;
                case 3:
                default:
                    zz39.zzK(zzyu4ZzZsD);
                    break;
                case 4:
                    zzd1.zzY(zzB(zzzxt));
                    break;
                case 5:
                    double dZzZs = com.aspose.words.internal.zzJB.zzZs(zzyu4ZzZsD.readString());
                    if (!Double.isNaN(dZzZs)) {
                        zzd1.zzYb(dZzZs);
                    }
                    break;
                case 6:
                    zzd1.zzX(zzB(zzzxt));
                    break;
                case 7:
                    zzd1.zzW(zzB(zzzxt));
                    break;
                case 8:
                    zzd1.zzZ(zzz(zzzxt));
                    break;
                case 9:
                    zzd1.zzZ(new zzK1());
                    zz51.zzZ(zzzxt, zzd1.zzZTm());
                    break;
                case 10:
                    zzd1.zzY(new zz30());
                    zz0I.zzZ(zzd1.zzZHw(), zzzxt);
                    break;
                case 11:
                    zzd1.zzZ(new zz10());
                    zz0I.zzZ(zzzxt, zzd1.zzZTl(), zzzxt.zzZqn());
                    break;
            }
        }
        return zzd1;
    }

    public static zzD3 zzD(zzZXT zzzxt) throws Exception {
        if (!"chartStyle".equals(zzzxt.zzZsD().getLocalName())) {
            return null;
        }
        zzD3 zzd3 = new zzD3();
        zzZ(zzzxt.zzZsD(), zzd3);
        zzZ(zzzxt, zzd3);
        return zzd3;
    }

    private static zzEG zzR(zzYU4 zzyu4) {
        zzEG zzeg = new zzEG();
        zzeg.zzRp(zzyu4.zzV("symbol", ""));
        zzeg.setSize(zzyu4.zzX("size", 0));
        return zzeg;
    }

    private static String[] zzS(zzYU4 zzyu4) {
        String strZzV = zzyu4.zzV("mods", "");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzV)) {
            return com.aspose.words.internal.zzZKN.zzR(strZzV, ControlChar.SPACE_CHAR);
        }
        return null;
    }

    private static void zzZ(zzYU4 zzyu4, zzD3 zzd3) {
        while (zzyu4.zzi()) {
            if (zzUR.zzTP(zzyu4.getLocalName()) != 0) {
                zz39.zzI(zzyu4);
            } else {
                zzd3.setId(zzyu4.getValue());
            }
        }
        zzyu4.zzj();
    }

    private static zzEZ zzz(zzZXT zzzxt) {
        zzEZ zzez = new zzEZ();
        zzez.zzI8(zz84.zzOT(zzzxt.zzZsD().zzV("idx", "")));
        zzez.zzI(zzS(zzzxt.zzZsD()));
        zzZ(zzzxt, zzez);
        return zzez;
    }

    private static void zzZ(zzZXT zzzxt, zzD3 zzd3) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        while (zzyu4ZzZsD.zzQ("chartStyle")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 1) {
                zzd3.zzZ(zzR(zzyu4ZzZsD));
            } else if (iZzTP != 2) {
                if (zzZ9S.containsKey(zzyu4ZzZsD.getLocalName())) {
                    zzd3.zzZ(zzZ9S.get(zzyu4ZzZsD.getLocalName()), zzC(zzzxt));
                } else {
                    zz39.zzK(zzyu4ZzZsD);
                }
            } else {
                zzd3.setExtensions(zz81.zzd(zzzxt));
            }
        }
    }

    private static void zzZ(zzZXT zzzxt, zz17 zz17Var) {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzQ(localName)) {
            if ("styleClr".equals(zzyu4ZzZsD.getLocalName())) {
                zz17Var.zzZ(zzA(zzzxt));
            } else {
                zzBW zzbwZzW = zzBR.zzW(zzyu4ZzZsD, zzzxt.zzZqn());
                if (zzbwZzW != null) {
                    zz17Var.zzZ(zzbwZzW);
                }
            }
        }
    }
}
