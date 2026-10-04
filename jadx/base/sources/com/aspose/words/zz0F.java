package com.aspose.words;

import androidx.core.app.NotificationCompat;
import com.facebook.common.callercontext.ContextChain;
import com.huawei.hms.network.embedded.C18437z2;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.orion.notein.richeditor.converter.tagsoup.HTMLWriter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz0F {
    public static void zzX(zz2O zz2o, zzZXR zzzxr) throws Exception {
        boolean z = zzzxr.getCompliance() == 2;
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zz0J zz0jZzZAk = zz2o.zzZAk();
        if (zz0jZzZAk == null) {
            return;
        }
        int iZzZHY = zz2o.zzZHY();
        if (iZzZHY != 0) {
            if (iZzZHY != 8) {
                throw new IllegalArgumentException("Unexpected Dml node type.");
            }
            zzZ(z ? "wp:bodyPr" : "wps:bodyPr", zz0jZzZAk.zzZCZ().zzZtK(), zzzxr);
        } else {
            zzzydZzZlV.zzY("a:txSp");
            zzZ("a:txBody", zz0jZzZAk.zzZCZ(), zzzxr);
            if (zz0jZzZAk.zzZsx()) {
                zzzydZzZlV.zzZ("a:useSpRect", (String) null);
            }
            zzzydZzZlV.zzo();
        }
    }

    private static void zzY(String str, ArrayList<zz47> arrayList, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        for (zz47 zz47Var : arrayList) {
            zz0X zz0x = (zz0X) com.aspose.words.internal.zzZKW.zzZ(zz47Var, zz0X.class);
            if (zz0x != null) {
                zzzydZzZlV.zzY("a:br");
                zzZ("a:rPr", zz0x.zzZx5(), zzzxr);
                zzzydZzZlV.zzo();
            }
            zz0P zz0p = (zz0P) com.aspose.words.internal.zzZKW.zzZ(zz47Var, zz0P.class);
            if (zz0p != null) {
                zzzydZzZlV.zzY("a:fld");
                zzzydZzZlV.zzY("id", zz0p.zzZsX());
                if (com.aspose.words.internal.zzZYD.zzXk(zz0p.getType())) {
                    zzzydZzZlV.zz0(C18437z2.f56754h, zz0p.getType());
                }
                zzZ("a:rPr", zz0p.zzZx5(), zzzxr);
                zzZ("a:pPr", zz0p.zzZsY(), zzzxr);
                zzZ("a", zz0p.getText(), zzzydZzZlV);
                zzzydZzZlV.zzo();
            }
            zz31 zz31Var = (zz31) com.aspose.words.internal.zzZKW.zzZ(zz47Var, zz31.class);
            if (zz31Var != null) {
                zzzydZzZlV.zzY(com.aspose.words.internal.zzZKN.format("{0}:r", str));
                zzZ("a:rPr", zz31Var.zzZx5(), zzzxr);
                zzZ(str, zz31Var.getText(), zzzydZzZlV);
                zzzydZzZlV.zzo();
            }
            zz0M zz0m = (zz0M) com.aspose.words.internal.zzZKW.zzZ(zz47Var, zz0M.class);
            if (zz0m != null) {
                if (zz0m.zzZsK()) {
                    zzzydZzZlV.zzY("a14:m");
                    zzzydZzZlV.zz0("xmlns:a14", "http://schemas.microsoft.com/office/drawing/2010/main");
                    zzzydZzZlV.zz0("xmlns:m", new zzZX5(zzzydZzZlV.zzZtY() == 2).zzZlr());
                }
                zzZX6.zzZ(zz0m.zzZsL(), zz0m.zzZx5(), zzzxr);
                zzY("m", zz0m.zzMf(), zzzxr);
                zzZX6.zzZ(zzzydZzZlV);
                if (zz0m.zzZsK()) {
                    zzzydZzZlV.zzo();
                }
            }
        }
    }

    public static void zzZ(String str, zz11 zz11Var, zzZXR zzzxr) throws Exception {
        if (zz11Var == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(str);
        zzZ("a:bodyPr", zz11Var.zzZtK(), zzzxr);
        zzZ(zz11Var.zzZtL(), zzzxr);
        Iterator<zz4A> it = zz11Var.zzMi().iterator();
        while (it.hasNext()) {
            zzZ(it.next(), zzzxr);
        }
        zzzydZzZlV.zzo();
    }

    public static void zzZ(zz4A zz4a, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("a:p");
        zzZ("a:pPr", zz4a.zzZxp(), zzzxr);
        zzY("a", zz4a.zzMf(), zzzxr);
        if (!zz4a.zzZxo().isEmpty()) {
            zzZ("a:endParaRPr", zz4a.zzZxo(), zzzxr);
        }
        zzzydZzZlV.zzo();
    }

    private static void zzZ(String str, String str2, zzZYD zzzyd) {
        zzzyd.zzY(com.aspose.words.internal.zzZKN.format("{0}:t", str));
        zzzyd.writeString(str2);
        zzzyd.zzo();
    }

    public static void zzZ(zz0N zz0n, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("a:lstStyle");
        zzZ("a:defPPr", zz0n.zzZsV(), zzzxr);
        zzZ("a:lvl1pPr", zz0n.zzZsU(), zzzxr);
        zzZ("a:lvl2pPr", zz0n.zzZsT(), zzzxr);
        zzZ("a:lvl3pPr", zz0n.zzZsS(), zzzxr);
        zzZ("a:lvl4pPr", zz0n.zzZsR(), zzzxr);
        zzZ("a:lvl5pPr", zz0n.zzZsQ(), zzzxr);
        zzZ("a:lvl6pPr", zz0n.zzZsP(), zzzxr);
        zzZ("a:lvl7pPr", zz0n.zzZsO(), zzzxr);
        zzZ("a:lvl8pPr", zz0n.zzZsN(), zzzxr);
        zzZ("a:lvl9pPr", zz0n.zzZsM(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(String str, zz49 zz49Var, zzZXR zzzxr) throws Exception {
        if (zz49Var == null || zz49Var.isEmpty()) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(str);
        zzZ(8, zz49Var, zzzxr);
        zzZ(9, zz49Var, zzzxr);
        zzZ(0, zz49Var, zzzxr);
        zzZ(6, zz49Var, zzzxr);
        zzZ(1, zz49Var, zzzxr);
        zzZ(2, zz49Var, zzzxr);
        zzZ(10, zz49Var, zzzxr);
        zzZ(3, zz49Var, zzzxr);
        zzZ(4, zz49Var, zzzxr);
        zzZ(7, zz49Var, zzzxr);
        zzZ(5, zz49Var, zzzxr);
        zzZ(12, zz49Var, zzzxr);
        zzZ(14, zz49Var, zzzxr);
        zzZ(13, zz49Var, zzzxr);
        zzZ(17, zz49Var, zzzxr);
        zzZ(16, zz49Var, zzzxr);
        zzZ(18, zz49Var, zzzxr);
        zzZ(15, zz49Var, zzzxr);
        zzZ(19, zz49Var, zzzxr);
        if (zz49Var.zzZx9()) {
            zzZ("a:defRPr", zz49Var.zzZHc(), zzzxr);
        }
        zzZ(20, zz49Var, zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzY(zz30 zz30Var, zzZXR zzzxr, zzZYD zzzyd) {
        if (zz30Var.zzLh(21)) {
            zzzyd.zzY("a:highlight");
            zzBN.zzZ((zzBW) zz30Var.zzLu(21), zzzxr);
            zzzyd.zzo();
        }
    }

    private static void zzZ(String str, zz0E zz0e, zzZYD zzzyd) {
        if (zz0e == null) {
            return;
        }
        boolean z = zzzyd.zzZtY() == 2;
        zzzyd.zzY(str);
        zz3X zz3x = (zz3X) com.aspose.words.internal.zzZKW.zzZ(zz0e, zz3X.class);
        if (zz3x != null) {
            zzzyd.zzX("a:spcPct", "val", zz3W.zzS(zz3x.getValue(), z));
        }
        zz3K zz3k = (zz3K) com.aspose.words.internal.zzZKW.zzZ(zz0e, zz3K.class);
        if (zz3k != null) {
            zzzyd.zzX("a:spcPts", "val", Integer.valueOf(zz3k.zzZwo().getValue()));
        }
        zzzyd.zzo();
    }

    public static void zzZ(String str, zz30 zz30Var, zzZXR zzzxr) throws Exception {
        zzZXR zzzxr2;
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        boolean z = zzzxr.getCompliance() == 2;
        zzzydZzZlV.zzY(str);
        zzzydZzZlV.zzP("kumimoji", zz30Var.zzLu(9));
        zzZ(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, 10, zz30Var, zzzydZzZlV);
        zzZ("altLang", 0, zz30Var, zzzydZzZlV);
        if (zz30Var.zzLh(17)) {
            zzzydZzZlV.zzZj("sz", zz30Var.zzZvS().getValue());
        }
        zzzydZzZlV.zzP("b", zz30Var.zzLu(1));
        zzzydZzZlV.zzP(ContextChain.TAG_INFRA, zz30Var.zzLu(7));
        if (zz30Var.zzLh(18)) {
            zzzydZzZlV.zz0("u", zz84.zzIy(zz30Var.getUnderline()));
        }
        if (zz30Var.zzLh(16)) {
            zzzydZzZlV.zz0("strike", zz84.zzIz(zz30Var.zzZvT()));
        }
        if (zz30Var.zzLh(8)) {
            zzzydZzZlV.zzZj("kern", zz30Var.zzZvV().getValue());
        }
        if (zz30Var.zzLh(4)) {
            zzzydZzZlV.zz0("cap", zz84.zzIA(zz30Var.zzZvX()));
        }
        if (zz30Var.zzLh(15)) {
            zzzydZzZlV.zzZj("spc", zz30Var.zzZvU().getValue());
        }
        zzzydZzZlV.zzP("normalizeH", zz30Var.zzLu(12));
        if (zz30Var.zzLh(2)) {
            zzzydZzZlV.zz0("baseline", zz3W.zzS(zz30Var.zzZvY(), z));
        }
        zzzydZzZlV.zzP("noProof", zz30Var.zzLu(11));
        zzzydZzZlV.zzP("dirty", zz30Var.zzLu(5));
        zzzydZzZlV.zzP(NotificationCompat.CATEGORY_ERROR, zz30Var.zzLu(6));
        zzzydZzZlV.zzP("smtClean", zz30Var.zzLu(13));
        zzzydZzZlV.zzO("smtId", zz30Var.zzLu(14));
        zzzydZzZlV.zzP("bmk", zz30Var.zzLu(3));
        zz4B.zzZ("a:ln", (zz4G) zz30Var.zzLu(20), zzzxr);
        zz7T.zzZ((zz7X) zz30Var.zzLu(19), zzzxr, false);
        zz2A.zzZ(zz30Var.zzZTe(), zzzxr, false);
        zzY(zz30Var, zzzxr, zzzydZzZlV);
        if (zz30Var.zzLh(32)) {
            zzzydZzZlV.zzZ("a:uLnTx", (String) null);
        } else {
            zz4B.zzZ("a:uLn", (zz4G) zz30Var.zzLu(31), zzzxr);
        }
        zzZ(zz30Var, zzzxr, zzzydZzZlV);
        zzZ("a:latin", (zz7P) zz30Var.zzLu(22), zzzydZzZlV);
        zzZ("a:ea", (zz7P) zz30Var.zzLu(23), zzzydZzZlV);
        zzZ("a:cs", (zz7P) zz30Var.zzLu(25), zzzydZzZlV);
        zzZ("a:sym", (zz7P) zz30Var.zzLu(24), zzzydZzZlV);
        zz6P zz6p = (zz6P) zz30Var.zzLu(26);
        if (zz6p != null) {
            zzzxr2 = zzzxr;
            zz6N.zzZ("a:hlinkClick", zz6p.getId(), zz6p.zzZe(), zz6p.zzZzU(), zz6p.getExtensions(), zzzxr2);
        } else {
            zzzxr2 = zzzxr;
        }
        zz6P zz6p2 = (zz6P) zz30Var.zzLu(27);
        if (zz6p2 != null) {
            zzZXR zzzxr3 = zzzxr2;
            zz6N.zzZ("a:hlinkHover", zz6p2.getId(), zz6p2.zzZe(), zz6p2.zzZzU(), zz6p2.getExtensions(), zzzxr3);
            zzzxr2 = zzzxr3;
        }
        if (zz30Var.zzLh(33)) {
            zzzydZzZlV.zzZ("a:rtl", (String) null);
        }
        com.aspose.words.internal.zzZYG zzzyg = (com.aspose.words.internal.zzZYG) zz30Var.zzLu(34);
        if (zzzyg != null) {
            zz7Z.zzZ((com.aspose.words.internal.zzZYG<zz82>) zzzyg, zzzxr2);
        }
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zz30 zz30Var, zzZXR zzzxr, zzZYD zzzyd) throws Exception {
        if (zz30Var.zzLh(30)) {
            zzzyd.zzZ("a:uFillTx", (String) null);
            return;
        }
        zz7X zz7x = (zz7X) zz30Var.zzLu(29);
        if (zz7x != null) {
            zzzyd.zzY("a:uFill");
            zz7T.zzZ(zz7x, zzzxr, false);
            zzzyd.zzo();
        }
    }

    private static void zzZ(String str, zz7P zz7p, zzZYD zzzyd) {
        if (zz7p == null) {
            return;
        }
        zzzyd.zzY(str);
        zzzyd.zzX("typeface", zz7p.zzZAY());
        zzzyd.zz0("panose", zz7p.zzZAW());
        zzzyd.zzZh("pitchFamily", zz7p.zzZAX());
        if (zz7p.zzZAV() != 1) {
            zzzyd.zzZj("charset", zz7p.zzZAV());
        }
        zzzyd.zzo();
    }

    public static void zzZ(String str, zz10 zz10Var, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        boolean z = zzzxr.getCompliance() == 2;
        zzzydZzZlV.zzY(str);
        zzZ(8, zz10Var, zzzydZzZlV);
        zzZ(2, zz10Var, zzzydZzZlV);
        zzZ(12, zz10Var, zzzydZzZlV);
        zzZ(11, zz10Var, zzzydZzZlV);
        zzZ(13, zz10Var, zzzydZzZlV);
        zzZ(14, zz10Var, zzzydZzZlV);
        zzZ(16, zz10Var, zzzydZzZlV);
        zzZ(17, zz10Var, zzzydZzZlV);
        zzZ(18, zz10Var, zzzydZzZlV);
        zzZ(19, zz10Var, zzzydZzZlV);
        zzZ(3, zz10Var, zzzydZzZlV);
        zzZ(10, zz10Var, zzzydZzZlV);
        zzZ(4, zz10Var, zzzydZzZlV);
        zzZ(6, zz10Var, zzzydZzZlV);
        zzZ(0, zz10Var, zzzydZzZlV);
        zzZ(1, zz10Var, zzzydZzZlV);
        zzZ(5, zz10Var, zzzydZzZlV);
        zzZ(7, zz10Var, zzzydZzZlV);
        zzZ(15, zz10Var, zzzydZzZlV);
        if (zz10Var.zzZtI().zzZwk() != 0) {
            zzzydZzZlV.zzY("a:prstTxWarp");
            zzzydZzZlV.zz0("prst", zz84.zzIq(zz10Var.zzZtI().zzZwk()));
            zz7I.zzZ(zz10Var.zzZtI().zzZAP().zzZA2(), zzzydZzZlV, "a:avLst");
            zzzydZzZlV.zzo();
        }
        if (zz10Var.zzZtH() instanceof zz2K) {
            zzzydZzZlV.zzZ("a:spAutoFit", (String) null);
        }
        zz4X zz4x = (zz4X) com.aspose.words.internal.zzZKW.zzZ(zz10Var.zzZtH(), zz4X.class);
        if (zz4x != null) {
            zzzydZzZlV.zzX("a:normAutofit", "fontScale", zz3W.zzS(zz4x.zzZy4(), z), "lnSpcReduction", zz3W.zzS(zz4x.zzZy3(), z));
        }
        zzJN.zzZ(zz10Var.zzZTd(), zzzxr, false);
        zzJN.zzZ(zz10Var.zzZTc(), zzzxr, false);
        zz7Z.zzZ(zz10Var.getExtensions(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(int i, zz49 zz49Var, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        Object objZzLu = zz49Var.zzLu(i);
        if (objZzLu == null) {
            return;
        }
        switch (i) {
            case 0:
                zzzydZzZlV.zzP("lvl", objZzLu);
                break;
            case 1:
                if (zz84.zzID(zz49Var.getAlignment())) {
                    zzzxr.zzZ(65536, 2, com.aspose.words.internal.zzZKN.format("The alignment {0} is not supported by drawing paragraphs. It has been replaced with the {1} value.", ParagraphAlignment.toString(zz49Var.getAlignment()), ParagraphAlignment.toString(zz84.zzIC(zz49Var.getAlignment()))));
                }
                zzzydZzZlV.zz0("algn", zz84.zzIE(zz49Var.getAlignment()));
                break;
            case 2:
                zzzydZzZlV.zzP("defTabSz", objZzLu);
                break;
            case 3:
                zzzydZzZlV.zzP("eaLnBrk", objZzLu);
                break;
            case 4:
                zzzydZzZlV.zz0("fontAlgn", zz84.zzIB(zz49Var.zzZxg()));
                break;
            case 5:
                zzzydZzZlV.zzP("hangingPunct", objZzLu);
                break;
            case 6:
                zzzydZzZlV.zzP(HTMLWriter.INDENT, objZzLu);
                break;
            case 7:
                zzzydZzZlV.zzP("latinLnBrk", objZzLu);
                break;
            case 8:
                zzzydZzZlV.zzP("marL", objZzLu);
                break;
            case 9:
                zzzydZzZlV.zzP("marR", objZzLu);
                break;
            case 10:
                zzzydZzZlV.zzP("rtl", objZzLu);
                break;
            case 12:
                zzZ("a:lnSpc", (zz0E) objZzLu, zzzydZzZlV);
                break;
            case 13:
                zzZ("a:spcAft", (zz0E) objZzLu, zzzydZzZlV);
                break;
            case 14:
                zzZ("a:spcBef", (zz0E) objZzLu, zzzydZzZlV);
                break;
            case 15:
                zzZ((zz0W) objZzLu, zzzxr);
                break;
            case 16:
                zzZ((zz0T) objZzLu, zzzydZzZlV);
                break;
            case 17:
                zzZ((zz0V) objZzLu, zzzxr);
                break;
            case 18:
                zzZ((zz0U) objZzLu, zzzydZzZlV);
                break;
            case 19:
                zzZ((TabStopCollection) objZzLu, zzzxr);
                break;
            case 20:
                zz7Z.zzZ((com.aspose.words.internal.zzZYG<zz82>) objZzLu, zzzxr);
                break;
        }
    }

    private static void zzZ(TabStopCollection tabStopCollection, zzZXR zzzxr) {
        if (tabStopCollection == null || tabStopCollection.getCount() == 0) {
            return;
        }
        zzYU6 zzyu6ZzZm2 = zzzxr.zzZm2();
        zzyu6ZzZm2.zzY("a:tabLst");
        for (int i = 0; i < tabStopCollection.getCount(); i++) {
            TabStop tabStop = tabStopCollection.get(i);
            zzyu6ZzZm2.zzX("a:tab", "pos", Integer.valueOf(tabStop.zzY0E()), "algn", zz84.zzIj(tabStop.getAlignment()));
        }
        zzyu6ZzZm2.zzp();
    }

    private static void zzZ(zz0W zz0w, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        if (!zz0w.zzZxa()) {
            zzzydZzZlV.zzZ("a:buNone", (String) null);
            return;
        }
        if (zz0w.zzZtj()) {
            zzzydZzZlV.zzX("a:buChar", "char", zz0w.zzZtf());
            return;
        }
        if (zz0w.zzZti()) {
            zzzydZzZlV.zzW("a:buAutoNum", C18437z2.f56754h, zz84.zzIk(zz0w.zzZth()));
            if (zz0w.getStartAt() != 1) {
                zzzydZzZlV.zzZj("startAt", zz0w.getStartAt());
            }
            zzzydZzZlV.zzo();
            return;
        }
        if (zz0w.zzZtk()) {
            zzzydZzZlV.zzY("a:buBlip");
            zz7T.zzZ(zz0w.zzZtg(), zzzxr, "a:blip");
            zzzydZzZlV.zzo();
        }
    }

    private static void zzZ(zz0U zz0u, zzZYD zzzyd) {
        if (zz0u.zzZtd()) {
            zzzyd.zzZ("a:buFontTx", (String) null);
        } else {
            zzZ("a:buFont", zz0u.zzZw1(), zzzyd);
        }
    }

    private static void zzZ(zz0T zz0t, zzZYD zzzyd) {
        boolean z = zzzyd.zzZtY() == 2;
        int iZzZta = zz0t.zzZta();
        if (iZzZta == 0) {
            zzzyd.zzZ("a:buSzTx", (String) null);
        } else if (iZzZta == 1) {
            zzzyd.zzX("a:buSzPts", "val", Double.valueOf(zz0t.getValue()));
        } else {
            if (iZzZta != 2) {
                return;
            }
            zzzyd.zzX("a:buSzPct", "val", zz3W.zzS(zz3W.zzXz(zz0t.getValue()), z));
        }
    }

    private static void zzZ(zz0V zz0v, zzZXR zzzxr) {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        if (zz0v.zzZtd()) {
            zzzydZzZlV.zzZ("a:buClrTx", (String) null);
            return;
        }
        zzzydZzZlV.zzY("a:buClr");
        zzBN.zzZ(zz0v.zzZQX(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(int i, zz10 zz10Var, zzZYD zzzyd) {
        Object objZzLu = zz10Var.zzLu(i);
        if (objZzLu == null && i == 8 && zz10Var.zzZtA()) {
            objZzLu = new zzHK(-6.0E7d);
        }
        if (objZzLu == null) {
            return;
        }
        switch (i) {
            case 0:
                zzzyd.zz0("anchor", zz84.zzIG(zz10Var.zzMg()));
                break;
            case 1:
                zzzyd.zzP("anchorCtr", objZzLu);
                break;
            case 2:
                zzzyd.zzP("spcFirstLastPara", objZzLu);
                break;
            case 3:
                zzzyd.zzP("numCol", objZzLu);
                break;
            case 4:
                zzzyd.zzx("rtlCol", zz10Var.zzZty() == 1);
                break;
            case 5:
                zzzyd.zzP("forceAA", objZzLu);
                break;
            case 6:
                zzzyd.zzP("fromWordArt", objZzLu);
                break;
            case 7:
                zzzyd.zzw("upright", zz10Var.zzZtv());
                break;
            case 8:
                zzzyd.zzO("rot", ((zzHK) objZzLu).getValue());
                break;
            case 10:
                zzzyd.zzP("spcCol", objZzLu);
                break;
            case 11:
                zzzyd.zz0("horzOverflow", zz84.zzII(zz10Var.zzZtB()));
                break;
            case 12:
                zzzyd.zz0("vertOverflow", zz84.zzIH(zz10Var.zzZtt()));
                break;
            case 13:
                zzzyd.zz0("vert", zz84.zzIJ(zz10Var.zzZtu()));
                break;
            case 14:
                zzzyd.zz0("wrap", zz84.zzIF(zz10Var.zzZts()));
                break;
            case 15:
                zzzyd.zzP("compatLnSpc", objZzLu);
                break;
            case 16:
                zzzyd.zzP("lIns", objZzLu);
                break;
            case 17:
                zzzyd.zzP("tIns", objZzLu);
                break;
            case 18:
                zzzyd.zzP("rIns", objZzLu);
                break;
            case 19:
                zzzyd.zzP("bIns", objZzLu);
                break;
        }
    }

    private static void zzZ(String str, int i, zz30 zz30Var, zzZYD zzzyd) {
        Object objZzLu = zz30Var.zzLu(i);
        if (objZzLu != null) {
            zzzyd.zz0(str, com.aspose.words.internal.zzBM.zzVn(((Integer) objZzLu).intValue()));
        }
    }
}
