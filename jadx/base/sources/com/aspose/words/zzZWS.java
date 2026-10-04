package com.aspose.words;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.facebook.common.callercontext.ContextChain;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes6.dex */
final class zzZWS extends zzYUP {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("glow", "shadow", "reflection", "textOutline", "textFill", "scene3d", "props3d", "stylisticSets", "ligatures", "numForm", "numSpacing", "cntxtAlts", "rStyle", "rFonts", "font", "b", "bCs", ContextChain.TAG_INFRA, "iCs", "caps", "smallCaps", "strike", "dstrike", "outline", "emboss", "imprint", "noProof", "vanish", "snapToGrid", "webHidden", "color", "spacing", "w", "kern", RequestParameters.POSITION, "sz", "szCs", "highlight", "u", "effect", "bdr", "shd", "fitText", "vertAlign", "rtl", TranslateLanguage.CZECH, "em", CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, "specVanish", "rPrChange", "ins", "del", "moveFrom", "moveTo", "lit", "nor", "scr", "sty", "brk", "aln", "oMath", "eastAsianLayout", "pStyle", "textAlignment", "instrText", "t", "rPr", "r", "fldChar", "ascii", "hAnsi", "eastAsia", "hint", "asciiTheme", "hAnsiTheme", "eastAsiaTheme", "cstheme", "csTheme", "id", "vert", "vertCompress", "combine", "combineBrackets", "val", "themeColor", "themeShade", "themeTint", "bidi");
    private zzZYI zzYNI;
    private zzZXK zzYNe;

    public zzZWS() {
    }

    private static void zzS(zzYU4 zzyu4, zzYEF zzyef) {
        boolean z = false;
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 71) {
                zzZ(zzyef, 390, zzyu4.getValue());
            } else if (iZzTP == 83) {
                zzZ(zzyef, 380, zzyu4.getValue());
            } else if (iZzTP == 87) {
                zzZ(zzyef, StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2, zzyu4.getValue());
            }
            z = true;
        }
        if (z) {
            return;
        }
        zzyef.zzQ(380, 0);
    }

    private static void zzT(zzYU4 zzyu4, zzYEF zzyef) {
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP != 30) {
                switch (iZzTP) {
                    case 83:
                        zzyef.zzQ(140, Integer.valueOf(zzYUQ.zzHl(zzyu4.getValue())));
                        break;
                    case 84:
                        zzyef.zzQ(521, zzyu4.getValue());
                        break;
                    case 85:
                        zzyef.zzQ(522, zzyu4.getValue());
                        break;
                    case 86:
                        zzyef.zzQ(523, zzyu4.getValue());
                        break;
                }
            } else {
                zzyef.zzQ(450, zzYU3.zzGR(zzyu4.getValue()));
            }
        }
    }

    private static void zzU(zzYU4 zzyu4, zzYEF zzyef) {
        zzyef.remove(160);
        zzyef.remove(500);
        zzyef.remove(510);
        zzyef.remove(520);
        while (zzyu4.zzi()) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 83:
                    zzyef.zzQ(160, zzYU3.zzGR(zzyu4.getValue()));
                    break;
                case 84:
                    zzyef.zzQ(500, zzyu4.getValue());
                    break;
                case 85:
                    zzyef.zzQ(510, zzyu4.getValue());
                    break;
                case 86:
                    zzyef.zzQ(520, zzyu4.getValue());
                    break;
            }
        }
    }

    private void zzV(zzYVB zzyvb, zzYEF zzyef) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        while (zzyu4ZzZsD.zzQ("rPr")) {
            if ("t".equals(zzyu4ZzZsD.getLocalName()) || "r".equals(zzyu4ZzZsD.getLocalName())) {
                zzY(zzyvb, zzyef, false);
            } else {
                zzyu4ZzZsD.zzYyH();
            }
        }
    }

    private static void zzZ(zzZXT zzzxt, zzYEF zzyef) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        zzYO3 zzyo3ZzZqn = zzzxt.zzZqn();
        switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
            case 0:
                zzyef.zzQ(810, zz2E.zz3(zzzxt));
                break;
            case 1:
                zzyef.zzQ(815, zz2E.zz3(zzzxt));
                break;
            case 2:
                zzyef.zzQ(820, zz2E.zz3(zzzxt));
                break;
            case 3:
                zzyef.zzQ(825, zz4C.zz4(zzzxt));
                break;
            case 4:
                zzyef.zzQ(830, zz7V.zzb(zzzxt));
                break;
            case 5:
                zzyef.zzQ(835, zz2R.zzX(zzzxt, zzyo3ZzZqn));
                break;
            case 6:
                zzyef.zzQ(840, zz2R.zzW(zzzxt, zzyo3ZzZqn));
                break;
            case 7:
                zzyef.zzQ(865, Integer.valueOf(zzZK(zzzxt)));
                break;
            case 8:
                zzyef.zzQ(850, Integer.valueOf(zzZXP.zzNr(zzyu4ZzZsD.zzV("val", null))));
                break;
            case 9:
                zzyef.zzQ(855, Integer.valueOf(zzZXP.zzNq(zzyu4ZzZsD.zzV("val", null))));
                break;
            case 10:
                zzyef.zzQ(860, Integer.valueOf(zzZXP.zzNp(zzyu4ZzZsD.zzV("val", null))));
                break;
            case 11:
                zzyef.zzQ(870, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                break;
            default:
                zzyu4ZzZsD.zzk();
                break;
        }
    }

    private static int zzZK(zzZXT zzzxt) {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        String localName = zzyu4ZzZsD.getLocalName();
        int iZzNo = 0;
        while (zzyu4ZzZsD.zzQ(localName)) {
            if ("styleSet".equals(zzyu4ZzZsD.getLocalName()) && zzyu4ZzZsD.zzYyD()) {
                iZzNo |= zzZXP.zzNo(zzyu4ZzZsD.zzV("id", null));
            }
        }
        return iZzNo;
    }

    @Override // com.aspose.words.zzYUP
    public final void zzW(zzYVB zzyvb, zzYEF zzyef) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        if (zzyvb.zzYyZ().zzZrB()) {
            zzV(zzyvb, zzyef);
            return;
        }
        while (zzyu4ZzZsD.zzQ("rPr")) {
            if ("w14".equals(zzyu4ZzZsD.getPrefix())) {
                zzyvb.zzZqn().zzYr6();
                zzZ((zzZXT) zzyvb, zzyef);
            }
            if (zzyu4ZzZsD.zzP("rPr")) {
                return;
            } else {
                zzY(zzyvb, zzyef, false);
            }
        }
    }

    @Override // com.aspose.words.zzYUP
    public final void zzY(zzYVB zzyvb, zzYEF zzyef, boolean z) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzYO3 zzyo3ZzZqn = zzyvb.zzZqn();
        int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
        if (iZzTP == 1) {
            if (com.aspose.words.internal.zzZKN.equals(zzyu4ZzZsD.getNamespaceURI(), zzZX5.zz9(20, zzyo3ZzZqn.getCompliance() == 2))) {
                return;
            }
            zzyef.zzQ(100, zzyu4ZzZsD.zzYyC());
            return;
        }
        switch (iZzTP) {
            case 12:
                zzyef.zzQ(50, Integer.valueOf(zzyvb.zzJ(zzyu4ZzZsD.zzV("val", null), 10)));
                break;
            case 13:
                zzV(zzyu4ZzZsD, zzyef);
                break;
            case 14:
                if (!zzyef.zzVE(230)) {
                    zzYU3.zzZ(zzyef, 230, zzyu4ZzZsD.zzV("val", null), false);
                }
                break;
            case 15:
                try {
                    zzyef.zzQ(60, zzyu4ZzZsD.zzYyC());
                } catch (IllegalStateException e) {
                    zzyu4ZzZsD.zzZ(65536, 9, e.getMessage());
                    return;
                }
                break;
            case 16:
                zzyef.zzQ(250, zzyu4ZzZsD.zzYyC());
                break;
            case 17:
                zzyef.zzQ(70, zzyu4ZzZsD.zzYyC());
                break;
            case 18:
                zzyef.zzQ(StyleIdentifier.SUBTLE_EMPHASIS, zzyu4ZzZsD.zzYyC());
                break;
            case 19:
                zzyef.zzQ(120, zzyu4ZzZsD.zzYyC());
                break;
            case 20:
                zzyef.zzQ(110, zzyu4ZzZsD.zzYyC());
                break;
            case 21:
                zzyef.zzQ(80, zzyu4ZzZsD.zzYyC());
                break;
            case 22:
                zzyef.zzQ(300, zzyu4ZzZsD.zzYyC());
                break;
            case 23:
                zzyef.zzQ(90, zzyu4ZzZsD.zzYyC());
                break;
            case 24:
                zzyef.zzQ(170, zzyu4ZzZsD.zzYyC());
                break;
            case 25:
                zzyef.zzQ(180, zzyu4ZzZsD.zzYyC());
                break;
            case 26:
                zzyef.zzQ(440, zzyu4ZzZsD.zzYyC());
                break;
            case 27:
                zzyef.zzQ(130, zzyu4ZzZsD.zzYyC());
                break;
            case 28:
                zzyef.zzQ(StyleIdentifier.LIST_TABLE_2_ACCENT_1, zzyu4ZzZsD.zzYyC());
                break;
            case 29:
                zzyef.zzQ(132, zzyu4ZzZsD.zzYyC());
                break;
            case 30:
                zzU(zzyu4ZzZsD, zzyef);
                break;
            case 31:
                zzyef.zzQ(150, Integer.valueOf(zzyu4ZzZsD.zzV(zzyo3ZzZqn)));
                break;
            case 32:
                String strZzV = zzyu4ZzZsD.zzV("val", null);
                if (com.aspose.words.internal.zzZYD.zzXk(strZzV)) {
                    zzyef.zzQ(StyleIdentifier.GRID_TABLE_4_ACCENT_2, Integer.valueOf(zzYU4.zzQ(strZzV, zzyo3ZzZqn)));
                }
                break;
            case 33:
                zzyef.zzQ(220, Integer.valueOf(zzyu4ZzZsD.zzW(zzyo3ZzZqn)));
                break;
            case 34:
                zzyef.zzQ(200, Integer.valueOf(zzyu4ZzZsD.zzW(zzyo3ZzZqn)));
                break;
            case 35:
                if (!z) {
                    zzyef.zzQ(190, Integer.valueOf(zzyu4ZzZsD.zzW(zzyo3ZzZqn)));
                }
                break;
            case 36:
                if (!z) {
                    zzyef.zzQ(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4, Integer.valueOf(zzyu4ZzZsD.zzW(zzyo3ZzZqn)));
                }
                break;
            case 37:
                zzyef.zzQ(20, zzYUQ.zzHk(zzyu4ZzZsD.zzV("val", null)));
                break;
            case 38:
                zzT(zzyu4ZzZsD, zzyef);
                break;
            case 39:
                zzyef.zzQ(StyleIdentifier.GRID_TABLE_3_ACCENT_5, Integer.valueOf(zzYUQ.zzHm(zzyu4ZzZsD.zzV("val", null))));
                break;
            case 40:
                zzyef.zzQ(StyleIdentifier.LIST_TABLE_4_ACCENT_5, zzyu4ZzZsD.zzYyB());
                break;
            case 41:
                zzyef.zzQ(StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6, zzyu4ZzZsD.zzYyA());
                break;
            case 42:
                zzyef.zzQ(880, new zzZNW(zzyu4ZzZsD.zzV(zzyo3ZzZqn), zzyu4ZzZsD.zzX("id", 0)));
                break;
            case 43:
                zzyef.zzQ(210, Integer.valueOf(zzYUQ.zzHj(zzyu4ZzZsD.zzV("val", null))));
                break;
            case 44:
                zzyef.zzQ(StyleIdentifier.BIBLIOGRAPHY, zzyu4ZzZsD.zzYyC());
                break;
            case 45:
                zzyef.zzQ(StyleIdentifier.PLAIN_TABLE_2, zzyu4ZzZsD.zzYyC());
                break;
            case 46:
                zzyef.zzQ(770, Integer.valueOf(zzYUQ.zzHs(zzyu4ZzZsD.zzV("val", null))));
                break;
            case 47:
                zzS(zzyu4ZzZsD, zzyef);
                break;
            case 48:
                zzyef.zzQ(10, zzyu4ZzZsD.zzYyC());
                break;
            case 49:
                this.zzYNI.zzZ(zzyvb, zzyef);
                break;
            case 50:
                zzZYI.zzZ(zzyu4ZzZsD, zzyef);
                break;
            case 51:
                zzZYI.zzY(zzyu4ZzZsD, zzyef);
                break;
            case 52:
                zzZYI.zzX(zzyu4ZzZsD, zzyef);
                break;
            case 53:
                zzZYI.zzW(zzyu4ZzZsD, zzyef);
                break;
            case 54:
                zzyef.zzRb(zzyu4ZzZsD.zzYyD());
                break;
            case 55:
                zzyef.zzRa(zzyu4ZzZsD.zzYyD());
                break;
            case 56:
                zzyef.zznb(zzZXP.zzNa(zzyu4ZzZsD.zzV("val", null)));
                break;
            case 57:
                zzyef.zzna(zzZXP.zzN9(zzyu4ZzZsD.zzV("val", null)));
                break;
            case 58:
                zzyef.zzY(zzYUX.zzz(zzyu4ZzZsD));
                break;
            case 59:
                zzyef.zzR9(zzyu4ZzZsD.zzYyD());
                break;
            case 60:
                zzyef.zzR8(zzyu4ZzZsD.zzYyD());
                break;
            case 61:
                zzZ(zzyef, zzyu4ZzZsD);
                break;
            case 62:
            case 63:
                zzyu4ZzZsD.zzSw(true);
                break;
            case 64:
            case 65:
                zzZWW.zzZl1().zzP(zzyvb, zzyef);
                zzYUN.zzM(zzyvb, zzyef);
                break;
            case 66:
                zzW(zzyvb, zzyef);
                break;
            case 67:
                zzZWW.zzZl1().zzL(zzyvb, zzyef);
                break;
            case 68:
                if (this.zzYNe != null) {
                    zzYUN.zzM(zzyvb, zzyef);
                    this.zzYNe.zzW(zzyvb, zzyef);
                }
                break;
            default:
                zzyu4ZzZsD.zzk();
                break;
        }
    }

    public zzZWS(zzZXK zzzxk) {
        this.zzYNe = zzzxk;
    }

    @Override // com.aspose.words.zzYUP
    public final void zzV(zzYU4 zzyu4, zzYEF zzyef) {
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP != 45) {
                switch (iZzTP) {
                    case 69:
                        zzYU3.zzZ(zzyef, 230, zzyu4.getValue(), false);
                        break;
                    case 70:
                        zzYU3.zzZ(zzyef, 240, zzyu4.getValue(), false);
                        break;
                    case 71:
                        zzYU3.zzZ(zzyef, 235, zzyu4.getValue(), false);
                        break;
                    case 72:
                        zzyef.zzQ(400, Integer.valueOf(zzYUQ.zzHp(zzyu4.getValue())));
                        break;
                    case 73:
                        zzYU3.zzZ(zzyef, 230, zzyu4.getValue(), true);
                        break;
                    case 74:
                        zzYU3.zzZ(zzyef, 240, zzyu4.getValue(), true);
                        break;
                    case 75:
                        zzYU3.zzZ(zzyef, 235, zzyu4.getValue(), true);
                        break;
                    case 76:
                    case 77:
                        zzYU3.zzZ(zzyef, 270, zzyu4.getValue(), true);
                        break;
                }
            } else {
                zzYU3.zzZ(zzyef, 270, zzyu4.getValue(), false);
            }
        }
    }

    private static void zzZ(zzYEF zzyef, zzYU4 zzyu4) {
        zzZRH zzzrh = new zzZRH();
        while (zzyu4.zzi()) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 78:
                    zzzrh.zzDN(zzyu4.zzb());
                    break;
                case 79:
                    zzzrh.zzW7(zzyu4.zz8());
                    break;
                case 80:
                    zzzrh.zzW5(zzyu4.zz8());
                    break;
                case 81:
                    zzzrh.zzW6(zzyu4.zz8());
                    break;
                case 82:
                    zzzrh.zzDO(zzYUQ.zzHr(zzyu4.getValue()));
                    break;
            }
        }
        zzyef.zzU(zzzrh);
    }

    private static void zzZ(zzYEF zzyef, int i, String str) {
        if ("x-none".equals(str)) {
            zzyef.zzQ(i, 0);
        } else {
            zzyef.zzQ(i, Integer.valueOf(com.aspose.words.internal.zzBM.zzYx(str)));
        }
    }

    public final void zzZ(zzZYI zzzyi) {
        this.zzYNI = zzzyi;
    }
}
