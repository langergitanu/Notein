package com.aspose.words;

import androidx.core.app.NotificationCompat;
import com.facebook.common.callercontext.ContextChain;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18437z2;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.orion.notein.richeditor.converter.tagsoup.HTMLWriter;

/* JADX INFO: loaded from: classes6.dex */
final class zz0I extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("txBody", "useSpRect", "xfrm", ContextChain.TAG_PRODUCT, "lstStyle", "bodyPr", "anchor", "anchorCtr", "bIns", "lIns", "tIns", "rIns", "forceAA", "fromWordArt", "rot", "numCol", "rtlCol", "spcCol", "compatLnSpc", "spcFirstLastPara", "horzOverflow", "upright", "vert", "vertOverflow", "wrap", "noAutofit", "normAutofit", "spAutoFit", "prstTxWarp", "scene3d", "sp3d", "extLst", "flatTx", "avLst", "pathLst", "gdLst", "ahLst", "path", "gd", "defPPr", "lvl1pPr", "lvl2pPr", "lvl3pPr", "lvl4pPr", "lvl5pPr", "lvl6pPr", "lvl7pPr", "lvl8pPr", "lvl9pPr", "br", "fld", "r", "m", "pPr", "endParaRPr", "t", "rPr", "altLang", "b", "baseline", "bmk", "cap", "dirty", NotificationCompat.CATEGORY_ERROR, ContextChain.TAG_INFRA, "kern", "kumimoji", CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, "noProof", "normalizeH", "smtClean", "smtId", "spc", "strike", "sz", "u", "blipFill", "gradFill", "grpFill", "noFill", "pattFill", "solidFill", "ln", "highlight", TranslateLanguage.CZECH, "ea", "sym", "latin", "effectLst", "effectDag", "hlinkClick", "hlinkMouseOver", "uFill", "uFillTx", "uLn", "uLnTx", "rtl", "charset", "panose", "pitchFamily", "typeface", "algn", "defTabSz", "eaLnBrk", "hangingPunct", "fontAlgn", HTMLWriter.INDENT, "latinLnBrk", "lvl", "marL", "marR", "defRPr", "lnSpc", "spcAft", "spcBef", "buAutoNum", "buBlip", "buChar", "buNone", "buClr", "buClrTx", "buFont", "buFontTx", "buSzPct", "buSzPts", "buSzTx", "tabLst", "tab", "pos", "blip", "spcPct", "spcPts");
    private static zzZ9M zzYXo;

    public static zz47 zz0(zzZXT zzzxt) throws Exception {
        switch (zzUR.zzTP(zzzxt.zzZsD().getLocalName())) {
            case 49:
                return zzZV(zzzxt);
            case 50:
                return zzZX(zzzxt);
            case 51:
                return zzZZ(zzzxt);
            case 52:
                return zz0L.zzZ(zzzxt);
            default:
                zz39.zzK(zzzxt.zzZsD());
                return null;
        }
    }

    private static zz4A zz1(zzZXT zzzxt) throws Exception {
        zz4A zz4a = new zz4A();
        zzZ(zz4a, zzzxt);
        return zz4a;
    }

    public static zz0J zz2(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzYO3 zzyo3ZzZqn = zzzxt.zzZqn();
        if (!"txSp".equals(zzyu4ZzZsD.getLocalName())) {
            return null;
        }
        zz0J zz0j = new zz0J();
        while (zzyu4ZzZsD.zzQ("txSp")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 0) {
                zzZ(zzzxt, zz0j.zzZCZ(), "txBody");
            } else if (iZzTP == 1) {
                zz0j.zzZsw();
            } else if (iZzTP != 2) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                zz0j.zzZ(zz06.zzK(zzyu4ZzZsD, zzyo3ZzZqn));
            }
        }
        return zz0j;
    }

    private static zz0U zzE(zzYU4 zzyu4) {
        zz0U zz0u = new zz0U();
        if (zzUR.zzTP(zzyu4.getLocalName()) != 121) {
            return zz0u;
        }
        zz0u.zzV(zzH(zzyu4));
        return zz0u;
    }

    private static zz0W zzF(zzYU4 zzyu4) {
        zz0W zz0w = new zz0W();
        zz0w.zzOj(zzyu4.zzV("char", ""));
        return zz0w;
    }

    private static zz0W zzG(zzYU4 zzyu4) {
        zz0W zz0w = new zz0W();
        zz0w.setStartAt(zzyu4.zzX("startAt", 1));
        zz0w.zzGG(zz84.zzOM(zzyu4.zzV(C18437z2.f56754h, "")));
        return zz0w;
    }

    private static zz7P zzH(zzYU4 zzyu4) {
        zz7P zz7p = new zz7P();
        while (zzyu4.zzi()) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 97:
                    zz7p.zzI9(zzyu4.zzb());
                    break;
                case 98:
                    zz7p.zzOG(zzyu4.getValue());
                    break;
                case 99:
                    zz7p.zzIa(zzyu4.zzb());
                    break;
                case 100:
                    zz7p.zzOH(zzyu4.getValue());
                    break;
                default:
                    zz39.zzI(zzyu4);
                    break;
            }
        }
        return zz7p;
    }

    private static zz0E zzM(zzYU4 zzyu4, zzYO3 zzyo3) {
        String localName = zzyu4.getLocalName();
        zz0E zz3k = null;
        while (zzyu4.zzQ(localName)) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 130) {
                zz3k = new zz3X(zz3W.zzZ(zzyu4.zzV("val", ""), 1.0d, zzyo3));
            } else if (iZzTP != 131) {
                zz39.zzK(zzyu4);
            } else {
                zz3k = new zz3K(new zz0K(zzyu4.zzX("val", -1)));
            }
        }
        return zz3k;
    }

    private static zz0T zzN(zzYU4 zzyu4, zzYO3 zzyo3) {
        double dZzXy;
        int i;
        int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
        if (iZzTP == 123) {
            dZzXy = zz3W.zzXy(zz3W.zzZ(zzyu4.zzV("val", ""), 1.0d, zzyo3));
            i = 2;
        } else if (iZzTP != 124) {
            dZzXy = 0.0d;
            i = 0;
        } else {
            dZzXy = zzyu4.zzZ("val", 1.0d);
            i = 1;
        }
        return new zz0T(dZzXy, i);
    }

    private static zz0V zzO(zzYU4 zzyu4, zzYO3 zzyo3) {
        zz0V zz0v = new zz0V();
        if (zzUR.zzTP(zzyu4.getLocalName()) != 119) {
            return zz0v;
        }
        zz0v.zzZ(zzBR.zzX(zzyu4, zzyo3));
        return zz0v;
    }

    private static TabStopCollection zzP(zzYU4 zzyu4, zzYO3 zzyo3) {
        TabStopCollection tabStopCollection = new TabStopCollection();
        while (zzyu4.zzQ("tabLst")) {
            if (zzUR.zzTP(zzyu4.getLocalName()) != 127) {
                zz39.zzI(zzyu4);
            } else {
                int iZzU = 1;
                int iZzZG = 0;
                while (zzyu4.zzi()) {
                    int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
                    if (iZzTP == 101) {
                        iZzU = zzYUW.zzU(zzyu4.getValue(), zzyo3);
                    } else if (iZzTP != 128) {
                        zz39.zzI(zzyu4);
                    } else {
                        iZzZG = com.aspose.words.internal.zzAN.zzZG(zzyu4.zzQ(zzyo3));
                    }
                }
                tabStopCollection.add(new TabStop(iZzZG, iZzU, 0));
            }
        }
        return tabStopCollection;
    }

    private static void zzY(zz10 zz10Var, zzYU4 zzyu4, zzYO3 zzyo3) {
        while (zzyu4.zzQ("pathLst")) {
            if (zzUR.zzTP(zzyu4.getLocalName()) != 37) {
                zz39.zzK(zzyu4);
            } else {
                zz10Var.zzZtI().zzZ(zz43.zzR(zzyu4, zzyo3));
            }
        }
    }

    public static void zzZ(zzZXT zzzxt, zz11 zz11Var, String str) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        while (zzyu4ZzZsD.zzQ(str)) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 3) {
                zz11Var.zzY(zz1(zzzxt));
            } else if (iZzTP == 4) {
                zzZ(zzzxt, zz11Var.zzZtL());
            } else if (iZzTP != 5) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                zzZ(zzzxt, zz11Var.zzZtK(), zzzxt.zzZqn());
            }
        }
    }

    private static zz0X zzZV(zzZXT zzzxt) throws Exception {
        zz0X zz0x = new zz0X();
        while (zzzxt.zzZsD().zzQ("br")) {
            if (zzUR.zzTP(zzzxt.zzZsD().getLocalName()) != 56) {
                zz39.zzK(zzzxt.zzZsD());
            } else {
                zzZ(zz0x.zzZx5(), zzzxt);
            }
        }
        return zz0x;
    }

    private static zz0W zzZW(zzZXT zzzxt) throws Exception {
        zz0W zz0w = new zz0W();
        while (zzzxt.zzZsD().zzQ("buBlip")) {
            if (zzUR.zzTP(zzzxt.zzZsD().getLocalName()) != 129) {
                zz39.zzI(zzzxt.zzZsD());
            } else {
                zz0w.zzW(zz7V.zz9(zzzxt));
            }
        }
        return zz0w;
    }

    private static zz0P zzZX(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zz0P zz0p = new zz0P();
        zz0p.zzN(zzyu4ZzZsD.zzZ("id", com.aspose.words.internal.zzZOZ.zzZXP));
        zz0p.zzPy(zzyu4ZzZsD.zzV(C18437z2.f56754h, ""));
        while (zzyu4ZzZsD.zzQ("fld")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 53) {
                zzZ(zz0p.zzZsY(), zzzxt);
            } else if (iZzTP == 55) {
                zz0p.setText(zz0p.getText() + zzyu4ZzZsD.readString());
            } else if (iZzTP != 56) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                zzZ(zz0p.zzZx5(), zzzxt);
            }
        }
        return zz0p;
    }

    private static zz7X zzZY(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zz7X zz7xZzc = null;
        while (zzyu4ZzZsD.zzQ("uFill")) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                case 81:
                    zz7xZzc = zz7V.zzc(zzzxt);
                    break;
                default:
                    zz39.zzK(zzyu4ZzZsD);
                    break;
            }
        }
        return zz7xZzc;
    }

    private static zz31 zzZZ(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zz31 zz31Var = new zz31();
        while (zzyu4ZzZsD.zzQ("r")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 55) {
                zz31Var.setText(zz31Var.getText() + zzyu4ZzZsD.readString());
            } else if (iZzTP != 56) {
                zz39.zzK(zzyu4ZzZsD);
            } else {
                zzZ(zz31Var.zzZx5(), zzzxt);
            }
        }
        return zz31Var;
    }

    private static zzZ9M zzZsv() {
        if (zzYXo == null) {
            zzYXo = new zzYKW();
        }
        return zzYXo;
    }

    public static void zzZ(zzZXT zzzxt, zz10 zz10Var, zzYO3 zzyo3) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        while (zzyu4ZzZsD.zzi()) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 6:
                    zz10Var.zzGN(zz84.zzP6(zzyu4ZzZsD.getValue()));
                    break;
                case 7:
                    zz10Var.zzWJ(zzyu4ZzZsD.zz8());
                    break;
                case 8:
                    zz10Var.zzGR(com.aspose.words.internal.zzAN.zzZG(zzyu4ZzZsD.zzQ(zzyo3)));
                    break;
                case 9:
                    zz10Var.zzGO(com.aspose.words.internal.zzAN.zzZG(zzyu4ZzZsD.zzQ(zzyo3)));
                    break;
                case 10:
                    zz10Var.zzGQ(com.aspose.words.internal.zzAN.zzZG(zzyu4ZzZsD.zzQ(zzyo3)));
                    break;
                case 11:
                    zz10Var.zzGP(com.aspose.words.internal.zzAN.zzZG(zzyu4ZzZsD.zzQ(zzyo3)));
                    break;
                case 12:
                    zz10Var.zzWH(zzyu4ZzZsD.zz8());
                    break;
                case 13:
                    zz10Var.zzWG(zzyu4ZzZsD.zz8());
                    break;
                case 14:
                    zz10Var.zzX(new zzHK(zzyu4ZzZsD.zz9()));
                    break;
                case 15:
                    zz10Var.setColumnNumber(zzyu4ZzZsD.zzb());
                    break;
                case 16:
                    zz10Var.zzGL(zzyu4ZzZsD.zz8() ? 1 : 0);
                    break;
                case 17:
                    zz10Var.zzGK(zzyu4ZzZsD.zzb());
                    break;
                case 18:
                    zz10Var.zzWI(zzyu4ZzZsD.zz8());
                    break;
                case 19:
                    zz10Var.zzWF(zzyu4ZzZsD.zz8());
                    break;
                case 20:
                    zz10Var.zzGM(zz84.zzP8(zzyu4ZzZsD.getValue()));
                    break;
                case 21:
                    zz10Var.zzWE(zzyu4ZzZsD.zz8());
                    break;
                case 22:
                    zz10Var.zzGJ(zz84.zzP9(zzyu4ZzZsD.getValue()));
                    break;
                case 23:
                    zz10Var.zzGI(zz84.zzP7(zzyu4ZzZsD.getValue()));
                    break;
                case 24:
                    zz10Var.zzGH(zz84.zzP5(zzyu4ZzZsD.getValue()));
                    break;
                default:
                    zz39.zzI(zzyu4ZzZsD);
                    break;
            }
        }
        while (zzyu4ZzZsD.zzQ("bodyPr")) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 25:
                    zz10Var.zzZ(new zz55());
                    break;
                case 26:
                    zz4X zz4x = new zz4X();
                    zz4x.zzXM(zz3W.zzZ(zzyu4ZzZsD.zzV("fontScale", ""), 1.0d, zzyo3));
                    zz4x.zzXL(zz3W.zzZ(zzyu4ZzZsD.zzV("lnSpcReduction", ""), zzyo3));
                    zz10Var.zzZ(zz4x);
                    break;
                case 27:
                    zz10Var.zzZ(new zz2K());
                    break;
                case 28:
                    zzZ(zz10Var, zzyu4ZzZsD, zzyo3);
                    break;
                case 29:
                    zz10Var.zzZ(zz2R.zzX(zzzxt, zzyo3));
                    break;
                case 30:
                    zz10Var.zzZ(zz2R.zzW(zzzxt, zzyo3));
                    break;
                case 31:
                    zz10Var.setExtensions(zz81.zzd(zzzxt));
                    break;
                case 32:
                    zz39.zzL(zzyu4ZzZsD);
                    break;
                default:
                    zz39.zzK(zzyu4ZzZsD);
                    break;
            }
        }
    }

    private static void zzZ(zz10 zz10Var, zzYU4 zzyu4, zzYO3 zzyo3) {
        String strZzV = zzyu4.zzV("prst", "");
        zz3F zz3f = new zz3F();
        zz3f.zzH9(zz84.zzOS(strZzV));
        zz10Var.zzZ(zz3f);
        String strZzJB = zzZsv().zzJB(strZzV);
        if (com.aspose.words.internal.zzZYD.zzXk(strZzJB)) {
            zzZ(strZzV, zz10Var, new zzYU4(strZzJB, null), zzyo3);
        }
        while (zzyu4.zzQ("prstTxWarp")) {
            if (zzUR.zzTP(zzyu4.getLocalName()) != 33) {
                zz39.zzK(zzyu4);
            } else {
                zz7G.zzY(zz10Var.zzZtI().zzZAP(), false, zzyu4);
            }
        }
    }

    private static void zzZ(String str, zz10 zz10Var, zzYU4 zzyu4, zzYO3 zzyo3) {
        while (zzyu4.zzQ(str)) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 33:
                    zz7G.zzY(zz10Var.zzZtI().zzZAP(), true, zzyu4);
                    break;
                case 34:
                    zzY(zz10Var, zzyu4, zzyo3);
                    break;
                case 35:
                    zzZ(true, zz10Var, zzyu4);
                    break;
                case 36:
                    zz39.zzL(zzyu4);
                    break;
                default:
                    zz39.zzK(zzyu4);
                    break;
            }
        }
    }

    private static void zzZ(boolean z, zz10 zz10Var, zzYU4 zzyu4) {
        while (zzyu4.zzQ("gdLst")) {
            if (zzUR.zzTP(zzyu4.getLocalName()) != 38) {
                zz39.zzK(zzyu4);
            } else {
                zz7G.zzZ(zz10Var.zzZtI().zzZAP(), true, zzyu4);
            }
        }
    }

    public static void zzZ(zzZXT zzzxt, zz0N zz0n) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        while (zzyu4ZzZsD.zzQ("lstStyle")) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 39:
                    zzZ(zz0n.zzZsV(), zzzxt);
                    break;
                case 40:
                    zzZ(zz0n.zzZsU(), zzzxt);
                    break;
                case 41:
                    zzZ(zz0n.zzZsT(), zzzxt);
                    break;
                case 42:
                    zzZ(zz0n.zzZsS(), zzzxt);
                    break;
                case 43:
                    zzZ(zz0n.zzZsR(), zzzxt);
                    break;
                case 44:
                    zzZ(zz0n.zzZsQ(), zzzxt);
                    break;
                case 45:
                    zzZ(zz0n.zzZsP(), zzzxt);
                    break;
                case 46:
                    zzZ(zz0n.zzZsO(), zzzxt);
                    break;
                case 47:
                    zzZ(zz0n.zzZsN(), zzzxt);
                    break;
                case 48:
                    zzZ(zz0n.zzZsM(), zzzxt);
                    break;
                default:
                    zzyu4ZzZsD.zzk();
                    break;
            }
        }
    }

    public static void zzZ(zz4A zz4a, zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        while (zzyu4ZzZsD.zzQ(ContextChain.TAG_PRODUCT)) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 49:
                    zz4a.zzY(zz0(zzzxt));
                    break;
                case 50:
                    zz4a.zzY(zz0(zzzxt));
                    break;
                case 51:
                    zz4a.zzY(zz0(zzzxt));
                    break;
                case 52:
                    zz4a.zzY(zz0(zzzxt));
                    break;
                case 53:
                    zzZ(zz4a.zzZxp(), zzzxt);
                    break;
                case 54:
                    zzZ(zz4a.zzZxo(), zzzxt);
                    break;
                default:
                    zz39.zzK(zzyu4ZzZsD);
                    break;
            }
        }
    }

    public static void zzZ(zz30 zz30Var, zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        String localName = zzyu4ZzZsD.getLocalName();
        zzYO3 zzyo3ZzZqn = zzzxt.zzZqn();
        while (zzyu4ZzZsD.zzi()) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 57:
                    zz30Var.zzH8(com.aspose.words.internal.zzBM.zzYx(zzyu4ZzZsD.getValue()));
                    break;
                case 58:
                    zz30Var.setBold(zzyu4ZzZsD.zz8());
                    break;
                case 59:
                    zz30Var.zzXu(zz3W.zzZ(zzyu4ZzZsD.getValue(), zzyo3ZzZqn));
                    break;
                case 60:
                    zz30Var.zzOn(zzyu4ZzZsD.getValue());
                    break;
                case 61:
                    zz30Var.zzH7(zz84.zzP2(zzyu4ZzZsD.getValue()));
                    break;
                case 62:
                    zz30Var.isDirty(zzyu4ZzZsD.zz8());
                    break;
                case 63:
                    zz30Var.zzWP(zzyu4ZzZsD.zz8());
                    break;
                case 64:
                    zz30Var.zzWO(zzyu4ZzZsD.zz8());
                    break;
                case 65:
                    zz30Var.zzZ(new zz0K(zzyu4ZzZsD.zzb()));
                    break;
                case 66:
                    zz30Var.zzWN(zzyu4ZzZsD.zz8());
                    break;
                case 67:
                    zz30Var.zzRe(com.aspose.words.internal.zzBM.zzYx(zzyu4ZzZsD.getValue()));
                    break;
                case 68:
                    zz30Var.setNoProofing(zzyu4ZzZsD.zz8());
                    break;
                case 69:
                    zz30Var.zzWM(zzyu4ZzZsD.zz8());
                    break;
                case 70:
                    zz30Var.zzWL(zzyu4ZzZsD.zz8());
                    break;
                case 71:
                    zz30Var.zzH6(zzyu4ZzZsD.zza());
                    break;
                case 72:
                    zz30Var.zzY(new zz0K(zzyu4ZzZsD.zzR(zzyo3ZzZqn)));
                    break;
                case 73:
                    zz30Var.zzH5(zz84.zzP1(zzyu4ZzZsD.getValue()));
                    break;
                case 74:
                    zz30Var.zzX(new zz0K(zzyu4ZzZsD.zzb()));
                    break;
                case 75:
                    zz30Var.setUnderline(zz84.zzP0(zzyu4ZzZsD.getValue()));
                    break;
                default:
                    zz39.zzI(zzyu4ZzZsD);
                    break;
            }
        }
        while (zzyu4ZzZsD.zzQ(localName)) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP != 31) {
                switch (iZzTP) {
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                        zz30Var.setFill(zz7V.zzc(zzzxt));
                        break;
                    case 82:
                        zz30Var.setOutline(zz4C.zz4(zzzxt));
                        break;
                    case 83:
                        while (zzyu4ZzZsD.zzQ("highlight")) {
                            zz30Var.zzL(zzBR.zzW(zzyu4ZzZsD, zzyo3ZzZqn));
                        }
                        break;
                    case 84:
                        zz30Var.zzW(zzH(zzyu4ZzZsD));
                        break;
                    case 85:
                        zz30Var.zzY(zzH(zzyu4ZzZsD));
                        break;
                    case 86:
                        zz30Var.zzX(zzH(zzyu4ZzZsD));
                        break;
                    case 87:
                        zz30Var.zzZ(zzH(zzyu4ZzZsD));
                        break;
                    case 88:
                        zz30Var.zzZ(zz2E.zzZ(zzzxt, false, false));
                        break;
                    case 89:
                        zz30Var.zzZ(zz2E.zzZ(zzzxt, false, true));
                        break;
                    case 90:
                        zz30Var.zzZ(zz6O.zz7(zzzxt));
                        break;
                    case 91:
                        zz30Var.zzY(zz6O.zz7(zzzxt));
                        break;
                    case 92:
                        zz30Var.zzW(zzZY(zzzxt));
                        break;
                    case 93:
                        zz30Var.zzZvM();
                        break;
                    case 94:
                        zz30Var.zzP(zz4C.zz4(zzzxt));
                        break;
                    case 95:
                        zz30Var.zzZvL();
                        break;
                    case 96:
                        zz30Var.zzZvK();
                        break;
                    default:
                        zz39.zzK(zzyu4ZzZsD);
                        break;
                }
            } else {
                zz30Var.setExtensions(zz81.zzd(zzzxt));
            }
        }
    }

    private static void zzZ(zz49 zz49Var, zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        String localName = zzyu4ZzZsD.getLocalName();
        zzYO3 zzyo3ZzZqn = zzzxt.zzZqn();
        while (zzyu4ZzZsD.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP != 96) {
                switch (iZzTP) {
                    case 101:
                        zz49Var.setAlignment(zz84.zzP4(zzyu4ZzZsD.getValue()));
                        break;
                    case 102:
                        zz49Var.zzHm(com.aspose.words.internal.zzAN.zzZG(zzyu4ZzZsD.zzQ(zzyo3ZzZqn)));
                        break;
                    case 103:
                        zz49Var.zzWW(zzyu4ZzZsD.zz8());
                        break;
                    case 104:
                        zz49Var.zzWV(zzyu4ZzZsD.zz8());
                        break;
                    case 105:
                        zz49Var.zzHl(zz84.zzP3(zzyu4ZzZsD.getValue()));
                        break;
                    case 106:
                        zz49Var.zzHk(zzyu4ZzZsD.zzb());
                        break;
                    case 107:
                        zz49Var.zzWU(zzyu4ZzZsD.zz8());
                        break;
                    case 108:
                        zz49Var.setLevel(zzyu4ZzZsD.zzb());
                        break;
                    case 109:
                        zz49Var.zzHj(zzyu4ZzZsD.zzb());
                        break;
                    case 110:
                        zz49Var.zzHi(zzyu4ZzZsD.zzb());
                        break;
                    default:
                        zz39.zzI(zzyu4ZzZsD);
                        break;
                }
            } else {
                zz49Var.zzWT(zzyu4ZzZsD.zz8());
            }
        }
        while (zzyu4ZzZsD.zzQ(localName)) {
            int iZzTP2 = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP2 != 31) {
                switch (iZzTP2) {
                    case 111:
                        zz49Var.zzWS(true);
                        zzZ(zz49Var.zzZHc(), zzzxt);
                        break;
                    case 112:
                        zz49Var.zzZ(zzM(zzyu4ZzZsD, zzyo3ZzZqn));
                        break;
                    case 113:
                        zz49Var.zzY(zzM(zzyu4ZzZsD, zzyo3ZzZqn));
                        break;
                    case 114:
                        zz49Var.zzX(zzM(zzyu4ZzZsD, zzyo3ZzZqn));
                        break;
                    case 115:
                        zz49Var.zzZ(zzG(zzyu4ZzZsD));
                        break;
                    case 116:
                        zz49Var.zzZ(zzZW(zzzxt));
                        break;
                    case 117:
                        zz49Var.zzZ(zzF(zzyu4ZzZsD));
                        break;
                    case 118:
                        zz49Var.zzZ(new zz0W());
                        break;
                    case 119:
                    case 120:
                        zz49Var.zzZ(zzO(zzyu4ZzZsD, zzyo3ZzZqn));
                        break;
                    case 121:
                    case 122:
                        zz49Var.zzZ(zzE(zzyu4ZzZsD));
                        break;
                    case 123:
                    case 124:
                    case 125:
                        zz49Var.zzZ(zzN(zzyu4ZzZsD, zzyo3ZzZqn));
                        break;
                    case 126:
                        zz49Var.zzZ(zzP(zzyu4ZzZsD, zzyo3ZzZqn));
                        break;
                    default:
                        zz39.zzI(zzyu4ZzZsD);
                        break;
                }
            } else {
                zz49Var.setExtensions(zz81.zzd(zzzxt));
            }
        }
    }
}
