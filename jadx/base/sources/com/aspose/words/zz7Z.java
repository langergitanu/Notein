package com.aspose.words;

import com.huawei.hms.network.embedded.C18241k5;
import com.miui.penengine.p596e.C18773h;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zz7Z {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("{E40237B7-FDA0-4F09-8148-C483321AD2D9}", "{909E8E84-426E-40DD-AFC4-6F175D3DCCD1}", "{28A0092B-C50C-407E-A947-70E740481C1C}", "{91240B29-F687-4F45-9708-019B960494DF}", "{CE6537A1-D6FC-4f65-9D91-7224C49458BB}", "{02D57815-91ED-43cb-92C2-25804820EDAC}", "{C3380CC4-5D6E-409C-BE32-E72D297353CC}", "{C809E66F-F1BF-436E-b5F7-EEA9579F0CBA}", "http://schemas.microsoft.com/office/drawing/2008/diagram", "{96DAC541-7B7A-43D3-8B79-37D633B846F1}", "{C183D7F6-B498-43B3-948B-1728B52AA6E4}", "{6F2FDCE9-48DA-4B69-8628-5D25D57E5C99}");

    private static void zzU(zzZXR zzzxr, zz82 zz82Var) throws Exception {
        zzZXR zzzxr2;
        if (zz82Var.zzZBV() == null) {
            return;
        }
        String strZzO = com.aspose.words.internal.zzZKN.zzO("dgm14", C18241k5.f55433h, "cNvPr");
        String strZzO2 = com.aspose.words.internal.zzZKN.zzO("xmlns", C18241k5.f55433h, "dgm14");
        zz4T zz4tZzZBV = zz82Var.zzZBV();
        zzW(zzzxr, zz82Var);
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzW(strZzO, strZzO2, "http://schemas.microsoft.com/office/drawing/2010/diagram");
        zzzydZzZlV.zzX("id", Integer.toString(zz4tZzZBV.getId()));
        zzzydZzZlV.zzX("name", zz4tZzZBV.getName());
        zz6P zz6pZzZxZ = zz4tZzZBV.zzZxZ();
        if (zz6pZzZxZ != null) {
            zzzxr2 = zzzxr;
            zz6N.zzZ("a:hlinkClick", zz6pZzZxZ.getId(), zz6pZzZxZ.zzZe(), zz6pZzZxZ.zzZzU(), zz6pZzZxZ.getExtensions(), zzzxr2);
        } else {
            zzzxr2 = zzzxr;
        }
        zz6P zz6pZzZxY = zz4tZzZBV.zzZxY();
        if (zz6pZzZxY != null) {
            zzZXR zzzxr3 = zzzxr2;
            zz6N.zzZ("a:hlinkHover", zz6pZzZxY.getId(), zz6pZzZxY.zzZe(), zz6pZzZxY.zzZzU(), zz6pZzZxY.getExtensions(), zzzxr3);
            zzzxr2 = zzzxr3;
        }
        zzzydZzZlV.zzo();
        zzW(zzzxr2);
    }

    private static void zzV(zzZXR zzzxr, zz82 zz82Var) throws Exception {
        if (zz82Var.zzZBY() == null) {
            return;
        }
        String strZzO = com.aspose.words.internal.zzZKN.zzO("a14", C18241k5.f55433h, "hiddenFill");
        String strZzO2 = com.aspose.words.internal.zzZKN.zzO("xmlns", C18241k5.f55433h, "a14");
        zz7X zz7xZzZBY = zz82Var.zzZBY();
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzW(zzzxr, zz82Var);
        zzzydZzZlV.zzW(strZzO, strZzO2, "http://schemas.microsoft.com/office/drawing/2010/main");
        zz7T.zzZ(zz7xZzZBY, zzzxr, false);
        zzzydZzZlV.zzo();
        zzW(zzzxr);
    }

    private static void zzW(zz82 zz82Var, zzZXR zzzxr, String str) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        String strZzO = com.aspose.words.internal.zzZKN.zzO(str, C18241k5.f55433h, "ext");
        String strZzO2 = com.aspose.words.internal.zzZKN.zzO("xmlns", C18241k5.f55433h, "c15");
        zzzydZzZlV.zzW(strZzO, "uri", zz82Var.getUri());
        zzzydZzZlV.zz0(strZzO2, "http://schemas.microsoft.com/office/drawing/2012/chart");
        zzFX.zzZ("c15", zz82Var.zzZBS(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzX(zz82 zz82Var, zzZXR zzzxr) throws Exception {
        String strZzIe = zz82Var.zzIe(zzzxr.getCompliance());
        Iterator<Map.Entry<K, V>> it = zz82Var.zzZBN().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            strZzIe = strZzIe.replace(com.aspose.words.internal.zzZKN.format(" r:embed=\"{0}\"", entry.getKey()), entry.getValue() == null ? "" : com.aspose.words.internal.zzZKN.format(" r:embed=\"{0}\"", zzzxr.zzYn((byte[]) entry.getValue())));
        }
        zzzxr.zzZlV().zzX(strZzIe);
    }

    private static void zzY(zz82 zz82Var, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        if (zz82Var.zzZBT() == null) {
            zzX(zz82Var, zzzxr);
            return;
        }
        String strZzO = com.aspose.words.internal.zzZKN.zzO("wp15", C18241k5.f55433h, "webVideoPr");
        String strZzO2 = com.aspose.words.internal.zzZKN.zzO("xmlns", C18241k5.f55433h, "wp15");
        zzzydZzZlV.zzW(com.aspose.words.internal.zzZKN.zzO("a", C18241k5.f55433h, "ext"), "uri", zz82Var.getUri());
        zzzydZzZlV.zzW(strZzO, strZzO2, "http://schemas.microsoft.com/office/word/2012/wordprocessingDrawing");
        zzZZW zzzzwZzZBT = zz82Var.zzZBT();
        zzzydZzZlV.zzX("embeddedHtml", zzzzwZzZBT.zzZs1());
        zzzydZzZlV.zzX(C18773h.f57233c, com.aspose.words.internal.zzJB.zzZZ(zzzzwZzZBT.zzZrZ()));
        zzzydZzZlV.zzX("w", com.aspose.words.internal.zzJB.zzZZ(zzzzwZzZBT.zzZs0()));
        zzzydZzZlV.zzo();
        zzzydZzZlV.zzo();
    }

    public static void zzZ(com.aspose.words.internal.zzZYG<zz82> zzzyg, zzZXR zzzxr) throws Exception {
        zzZ("a", null, zzzyg, zzzxr);
    }

    public static void zzZ(String str, com.aspose.words.internal.zzZYG<zz82> zzzyg, zzZXR zzzxr) throws Exception {
        zzZ(str, null, zzzyg, zzzxr);
    }

    public static void zzZ(String str, String str2, com.aspose.words.internal.zzZYG<zz82> zzzyg, zzZXR zzzxr) throws Exception {
        if (zzzyg == null || zzzyg.getCount() == 0) {
            return;
        }
        String strZzO = com.aspose.words.internal.zzZKN.zzO(str, C18241k5.f55433h, "extLst");
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(strZzO);
        if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
            zzzydZzZlV.zz0(com.aspose.words.internal.zzZKN.zzO("xmlns", C18241k5.f55433h, str), str2);
        }
        for (zz82 zz82Var : zzzyg.zzCJ()) {
            if (zz82Var != null) {
                switch (zzUR.zzTP(zz82Var.getUri())) {
                    case 0:
                        zzU(zzzxr, zz82Var);
                        break;
                    case 1:
                        zzV(zzzxr, zz82Var);
                        break;
                    case 2:
                        zzY(zzzxr, zz82Var);
                        break;
                    case 3:
                        zzZ(zzzxr, zz82Var);
                        break;
                    case 4:
                        zzW(zz82Var, zzzxr, str);
                        break;
                    case 5:
                        zzZ(zz82Var, zzzxr, str);
                        break;
                    case 6:
                        zzY(zz82Var, zzzxr, str);
                        break;
                    case 7:
                        zzY(zz82Var, zzzxr);
                        break;
                    case 8:
                        zzZ(zz82Var, zzzxr);
                        break;
                    case 9:
                        zzX(zz82Var, zzzxr, str);
                        break;
                    case 10:
                        zzX(zzzxr, zz82Var);
                        break;
                    case 11:
                        zzZ(zzzxr, zz82Var, str);
                        break;
                    default:
                        zzX(zz82Var, zzzxr);
                        break;
                }
            }
        }
        zzzydZzZlV.zzo();
    }

    private static void zzW(zzZXR zzzxr, zz82 zz82Var) {
        zzzxr.zzZlV().zzW(com.aspose.words.internal.zzZKN.zzO("a", C18241k5.f55433h, "ext"), "uri", zz82Var.getUri(), com.aspose.words.internal.zzZKN.zzO("xmlns", C18241k5.f55433h, "a"), zzZX5.zz9(6, zzzxr.getCompliance() == 2));
    }

    private static void zzX(zz82 zz82Var, zzZXR zzzxr, String str) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        String strZzO = com.aspose.words.internal.zzZKN.zzO("asvg", C18241k5.f55433h, "svgBlip");
        String strZzO2 = com.aspose.words.internal.zzZKN.zzO("xmlns", C18241k5.f55433h, "asvg");
        zzzydZzZlV.zzW(com.aspose.words.internal.zzZKN.zzO(str, C18241k5.f55433h, "ext"), "uri", zz82Var.getUri());
        zzzydZzZlV.zzY(strZzO);
        zzzydZzZlV.zz0(strZzO2, "http://schemas.microsoft.com/office/drawing/2016/SVG/main");
        zz7T.zzZ(zz82Var.zzZBO(), zzzxr);
        zzzydZzZlV.zzo();
        zzzydZzZlV.zzo();
    }

    private static void zzW(zzZXR zzzxr) {
        com.aspose.words.internal.zzZKN.zzO("a", C18241k5.f55433h, "ext");
        zzzxr.zzZlV().zzo();
    }

    private static void zzY(zz82 zz82Var, zzZXR zzzxr, String str) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        if (com.aspose.words.internal.zzZOZ.zzZ(zz82Var.zzZBQ(), com.aspose.words.internal.zzZOZ.zzZXP)) {
            if (com.aspose.words.internal.zzZKN.zzU3(zz82Var.zzZBZ())) {
                return;
            }
            zzX(zz82Var, zzzxr);
        } else {
            String strZzO = com.aspose.words.internal.zzZKN.zzO("c16", C18241k5.f55433h, "uniqueId");
            String strZzO2 = com.aspose.words.internal.zzZKN.zzO("xmlns", C18241k5.f55433h, "c16");
            zzzydZzZlV.zzW(com.aspose.words.internal.zzZKN.zzO(str, C18241k5.f55433h, "ext"), "uri", zz82Var.getUri());
            zzzydZzZlV.zz0(strZzO2, "http://schemas.microsoft.com/office/drawing/2014/chart");
            zzzydZzZlV.zzX(strZzO, "val", com.aspose.words.internal.zzZKN.zzU1(zz82Var.zzZBQ().toString("B")));
            zzzydZzZlV.zzo();
        }
    }

    private static void zzX(zzZXR zzzxr, zz82 zz82Var) {
        zzZ(zzzxr, zz82Var, "adec", "decorative", zz82Var.zzZBM(), "http://schemas.microsoft.com/office/drawing/2017/decorative");
    }

    private static void zzZ(zz82 zz82Var, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        String strZzO = com.aspose.words.internal.zzZKN.zzO("dsp", C18241k5.f55433h, "dataModelExt");
        String strZzO2 = com.aspose.words.internal.zzZKN.zzO("xmlns", C18241k5.f55433h, "a");
        String strZzO3 = com.aspose.words.internal.zzZKN.zzO("a", C18241k5.f55433h, "ext");
        String strZzO4 = com.aspose.words.internal.zzZKN.zzO("xmlns", C18241k5.f55433h, "dsp");
        zzzydZzZlV.zzW(strZzO3, "uri", zz82Var.getUri());
        zzzydZzZlV.zz0(strZzO2, zzZX5.zz9(6, false));
        zzzydZzZlV.zzY(strZzO);
        zzzydZzZlV.zzX("minVer", zzZX5.zz9(8, false));
        zzzydZzZlV.zzX("relId", zz82Var.zzZBP());
        zzzydZzZlV.zz0(strZzO4, zzZX5.zz9(24, false));
        zzzydZzZlV.zzo();
        zzzydZzZlV.zzo();
    }

    private static void zzY(zzZXR zzzxr, zz82 zz82Var) {
        zzZ(zzzxr, zz82Var, "a14", "useLocalDpi", zz82Var.zzZBU(), "http://schemas.microsoft.com/office/drawing/2010/main");
    }

    private static void zzZ(zz82 zz82Var, zzZXR zzzxr, String str) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        if (zz82Var.zzZBR().zzZN3() == null) {
            if (com.aspose.words.internal.zzZKN.zzU3(zz82Var.zzZBZ())) {
                return;
            }
            zzX(zz82Var, zzzxr);
            return;
        }
        String strZzO = com.aspose.words.internal.zzZKN.zzO("c15", C18241k5.f55433h, "datalabelsRange");
        String strZzO2 = com.aspose.words.internal.zzZKN.zzO("xmlns", C18241k5.f55433h, "c15");
        String strZzO3 = com.aspose.words.internal.zzZKN.zzO(str, C18241k5.f55433h, "ext");
        String strZzO4 = com.aspose.words.internal.zzZKN.zzO("c15", C18241k5.f55433h, "f");
        String strZzO5 = com.aspose.words.internal.zzZKN.zzO("c15", C18241k5.f55433h, "dlblRangeCache");
        zzzydZzZlV.zzW(strZzO3, "uri", zz82Var.getUri());
        zzzydZzZlV.zz0(strZzO2, "http://schemas.microsoft.com/office/drawing/2012/chart");
        zzzydZzZlV.zzY(strZzO);
        zzzydZzZlV.zzZ(strZzO4, zz82Var.zzZBR().zzZN3().zzZGv().getValue());
        zzFX.zzZ(strZzO5, zz82Var.zzZBR().zzZN3().zzZN4(), zzzxr, false);
        zzzydZzZlV.zzo();
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzZXR zzzxr, zz82 zz82Var) throws Exception {
        String strZzO = com.aspose.words.internal.zzZKN.zzO("a14", C18241k5.f55433h, "hiddenLine");
        zzW(zzzxr, zz82Var);
        zz4B.zzZ(strZzO, zz82Var.zzZBW(), zzzxr);
        zzW(zzzxr);
    }

    private static void zzZ(zzZXR zzzxr, zz82 zz82Var, String str) throws Exception {
        String strZz9 = zzZX5.zz9(25, false);
        String strZzO = com.aspose.words.internal.zzZKN.zzO("xmlns", C18241k5.f55433h, "c14");
        String strZzO2 = com.aspose.words.internal.zzZKN.zzO("c14", C18241k5.f55433h, "invertSolidFillFmt");
        String strZzO3 = com.aspose.words.internal.zzZKN.zzO(str, C18241k5.f55433h, "ext");
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzW(strZzO3, "uri", zz82Var.getUri());
        zzzydZzZlV.zz0(strZzO, strZz9);
        zzzydZzZlV.zzY(strZzO2);
        zzFX.zzZ(zz82Var.zzZBX(), zzzxr, false, "c14");
        zzzydZzZlV.zzo();
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzZXR zzzxr, zz82 zz82Var, String str, String str2, boolean z, String str3) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzW(zzzxr, zz82Var);
        zzzydZzZlV.zzW(com.aspose.words.internal.zzZKN.zzO(str, C18241k5.f55433h, str2), com.aspose.words.internal.zzZKN.zzO("xmlns", C18241k5.f55433h, str), str3);
        zzzydZzZlV.zzx("val", z);
        zzzydZzZlV.zzo();
        zzW(zzzxr);
    }
}
