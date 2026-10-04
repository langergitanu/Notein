package com.aspose.words;

import com.huawei.hms.network.embedded.C18293o1;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes6.dex */
final class zzZWG {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("docDefaults", "latentStyles", "style", "rPrDefault", "pPrDefault", "rPr", "pPr", C18293o1.f55803f, "defLockedState", "defQFormat", "defSemiHidden", "defUIPriority", "defUnhideWhenUsed", "lsdException", "locked", "name", "qFormat", "semiHidden", "uiPriority", "unhideWhenUsed", "customStyle", "default", "styleId", C18437z2.f56754h, "aliases", "basedOn", "next", "link", "autoRedefine", "hidden", "personal", "personalCompose", "personalReply", "rsid", "tblPr", "trPr", "tcPr", "tblStylePr");
    private zzZWS zzYNw;
    private zzZX1 zzYNx;

    public zzZWG(zzZX1 zzzx1, zzZWS zzzws) {
        this.zzYNx = zzzx1;
        this.zzYNw = zzzws;
    }

    private static void zzS(zzYEF zzyef) {
        zzyef.zzS(zzU1.zzMW(131076));
        zzyef.zzQ(zzU1.zzMW(131076));
        zzyef.zzR(zzU1.zzMW(131075));
        zzyef.zzP(zzU1.zzMW(131074));
        zzyef.setSize(22);
        zzyef.zzvA(22);
    }

    private static void zzW(zzYMX zzymx) {
        zzymx.zzw3(160);
        zzymx.zzw6(StyleIdentifier.COLORFUL_GRID_ACCENT_6);
        zzymx.setLineSpacingRule(2);
    }

    private static void zzX(zzYMX zzymx) {
        zzymx.zzw3(200);
        zzymx.zzw6(StyleIdentifier.GRID_TABLE_4);
        zzymx.setLineSpacingRule(2);
    }

    private void zzZ(zzZXT zzzxt, zzYU7 zzyu7) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        StyleCollection styles = zzzxt.getDocument().getStyles();
        boolean zZz8 = false;
        int iZzNj = 1;
        boolean zZz82 = false;
        String value = null;
        while (zzyu4ZzZsD.zzi()) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 20:
                    zZz82 = zzyu4ZzZsD.zz8();
                    break;
                case 21:
                    zZz8 = zzyu4ZzZsD.zz8();
                    break;
                case 22:
                    value = zzyu4ZzZsD.getValue();
                    break;
                case 23:
                    iZzNj = zzZXP.zzNj(zzyu4ZzZsD.getValue());
                    break;
                default:
                    zzzxt.zzZ(16777216, 9, com.aspose.words.internal.zzZKN.format("Unexpected attribute '{0}' is occurred while reading document, ignored.", zzyu4ZzZsD.getLocalName()));
                    break;
            }
        }
        Style styleZzl6 = Style.zzl6(iZzNj);
        zzYU8 zzyu8 = new zzYU8(styleZzl6);
        String strZzV = null;
        String strZzV2 = null;
        while (zzyu4ZzZsD.zzQ("style")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 5) {
                this.zzYNw.zzW(zzzxt, styleZzl6.zzZYh());
            } else if (iZzTP != 6) {
                switch (iZzTP) {
                    case 14:
                        styleZzl6.setLocked(zzyu4ZzZsD.zzYyD());
                        break;
                    case 15:
                        strZzV = zzyu4ZzZsD.zzV("val", null);
                        break;
                    case 16:
                        styleZzl6.isQuickStyle(zzyu4ZzZsD.zzYyD());
                        break;
                    case 17:
                        styleZzl6.setSemiHidden(zzyu4ZzZsD.zzYyD());
                        break;
                    case 18:
                        styleZzl6.setPriority(zzyu4ZzZsD.zzYyE());
                        break;
                    case 19:
                        styleZzl6.setUnhideWhenUsed(zzyu4ZzZsD.zzYyD());
                        break;
                    default:
                        switch (iZzTP) {
                            case 24:
                                strZzV2 = zzyu4ZzZsD.zzV("val", null);
                                break;
                            case 25:
                                zzyu8.zzXSz = zzyu4ZzZsD.zzV("val", null);
                                break;
                            case 26:
                                zzyu8.zzXSy = zzyu4ZzZsD.zzV("val", null);
                                break;
                            case 27:
                                zzyu8.zzXSx = zzyu4ZzZsD.zzV("val", null);
                                break;
                            case 28:
                                styleZzl6.setAutomaticallyUpdate(zzyu4ZzZsD.zzYyD());
                                break;
                            case 29:
                                styleZzl6.setHidden(zzyu4ZzZsD.zzYyD());
                                break;
                            case 30:
                                styleZzl6.zzQg(zzyu4ZzZsD.zzYyD());
                                break;
                            case 31:
                                styleZzl6.zzQi(zzyu4ZzZsD.zzYyD());
                                break;
                            case 32:
                                styleZzl6.zzQh(zzyu4ZzZsD.zzYyD());
                                break;
                            case 33:
                                int iZzGV = zzYU3.zzGV(zzyu4ZzZsD.zzV("val", null));
                                if (iZzGV != Integer.MIN_VALUE) {
                                    styleZzl6.zzl2(iZzGV);
                                }
                                break;
                            default:
                                zzZ(zzzxt, styleZzl6);
                                break;
                        }
                        break;
                }
            } else {
                this.zzYNx.zzY(zzzxt, styleZzl6.zzZYj(), styleZzl6.zzZYh());
            }
        }
        if (!com.aspose.words.internal.zzZYD.zzXk(strZzV) && com.aspose.words.internal.zzZYD.zzXk(value)) {
            strZzV = value;
        }
        if (com.aspose.words.internal.zzZYD.zzXk(strZzV)) {
            zzYUC.zzZ(strZzV, styles, zZz82, !zZz82, true, styleZzl6);
            if (!com.aspose.words.internal.zzZYD.zzXk(value)) {
                value = strZzV;
            }
            zzzxt.zzH(value, styleZzl6.zzZ7j());
        }
        String[] strArrZzR = strZzV2 != null ? com.aspose.words.internal.zzZKN.zzR(strZzV2, ',') : null;
        if (com.aspose.words.internal.zzZYD.zzXk(styleZzl6.getName())) {
            styles.zzZ(styleZzl6, strArrZzR);
            com.aspose.words.internal.zzZQG.zzZ(zzyu7, zzyu8);
        }
        if (zZz8) {
            zzzxt.zzYyU().set(styleZzl6.getType(), styleZzl6);
        }
    }

    private static void zzZC(zzZXT zzzxt) {
        zzYEF zzyefZzY37 = zzzxt.getDocument().getStyles().zzY37();
        zzzxt.zzYyZ().getMswVersion();
        zzS(zzyefZzY37);
    }

    private static void zzZD(zzZXT zzzxt) {
        if (zzZ3X.zzwL(zzzxt.zzYyZ().getLanguagePreferences().getDefaultEditingLanguage())) {
            return;
        }
        zzYMX zzymxZzY36 = zzzxt.getDocument().getStyles().zzY36();
        int mswVersion = zzzxt.zzYyZ().getMswVersion();
        if (mswVersion == 3 || mswVersion == 4) {
            zzX(zzymxZzY36);
        } else {
            zzW(zzymxZzY36);
        }
    }

    private ConditionalStyle zzZE(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        int iZzAV = 0;
        while (zzyu4ZzZsD.zzi()) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) == 23) {
                iZzAV = zzY8T.zzAV(zzyu4ZzZsD.getValue());
            }
        }
        ConditionalStyle conditionalStyle = new ConditionalStyle(iZzAV);
        while (zzyu4ZzZsD.zzQ("tblStylePr")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 5) {
                conditionalStyle.zzZ(new zzYEF());
                this.zzYNw.zzW(zzzxt, conditionalStyle.zzZYh());
            } else if (iZzTP != 6) {
                switch (iZzTP) {
                    case 34:
                        conditionalStyle.zzZ(new zzY6G());
                        zzZWE.zzT(zzzxt, conditionalStyle.zzZYf());
                        break;
                    case 35:
                        conditionalStyle.zzY(new zzY6G());
                        zzZWU.zzX(zzzxt, conditionalStyle.zzZYd());
                        break;
                    case 36:
                        conditionalStyle.zzZ(new zzWP());
                        zzZWW.zzZkZ().zzY(zzzxt, conditionalStyle.zz6G());
                        break;
                }
            } else {
                conditionalStyle.zzZ(new zzYMX());
                this.zzYNx.zzY(zzzxt, conditionalStyle.zzZYj(), conditionalStyle.zzZYh());
            }
        }
        return conditionalStyle;
    }

    private static void zzZF(zzZXT zzzxt) {
        zzZ73 zzz73ZzYi5 = zzzxt.getDocument().getStyles().zzYi5();
        boolean zZzYUf = zzz73ZzYi5.zzYUf();
        boolean zZzYUe = zzz73ZzYi5.zzYUe();
        boolean zZzYUd = zzz73ZzYi5.zzYUd();
        int iZzYUc = zzz73ZzYi5.zzYUc();
        boolean zZzYUb = zzz73ZzYi5.zzYUb();
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        String value = "";
        boolean zZz8 = zZzYUf;
        boolean zZz82 = zZzYUe;
        boolean zZz83 = zZzYUd;
        int iZzb = iZzYUc;
        boolean zZz84 = zZzYUb;
        while (zzyu4ZzZsD.zzi()) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 14:
                    zZz8 = zzyu4ZzZsD.zz8();
                    break;
                case 15:
                    value = zzyu4ZzZsD.getValue();
                    break;
                case 16:
                    zZz82 = zzyu4ZzZsD.zz8();
                    break;
                case 17:
                    zZz83 = zzyu4ZzZsD.zz8();
                    break;
                case 18:
                    iZzb = zzyu4ZzZsD.zzb();
                    break;
                case 19:
                    zZz84 = zzyu4ZzZsD.zz8();
                    break;
            }
        }
        int iZzAP = zzY8T.zzAP(value);
        if (iZzAP != 4094) {
            zzz73ZzYi5.zzX(new zzZ74(iZzAP, zZz8, zZz82, zZz83, iZzb, zZz84));
        }
    }

    private static void zzZG(zzZXT zzzxt) {
        zzZ73 zzz73ZzYi5 = zzzxt.getDocument().getStyles().zzYi5();
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        while (zzyu4ZzZsD.zzi()) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 7:
                    zzz73ZzYi5.zzy5(zzyu4ZzZsD.zzb());
                    break;
                case 8:
                    zzz73ZzYi5.zzV5(zzyu4ZzZsD.zz8());
                    break;
                case 9:
                    zzz73ZzYi5.zzV4(zzyu4ZzZsD.zz8());
                    break;
                case 10:
                    zzz73ZzYi5.zzV3(zzyu4ZzZsD.zz8());
                    break;
                case 11:
                    zzz73ZzYi5.zzy6(zzyu4ZzZsD.zzb());
                    break;
                case 12:
                    zzz73ZzYi5.zzV2(zzyu4ZzZsD.zz8());
                    break;
            }
        }
        while (zzyu4ZzZsD.zzQ("latentStyles")) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) == 13) {
                zzZF(zzzxt);
            }
        }
    }

    private void zzZH(zzZXT zzzxt) throws Exception {
        StyleCollection styles = zzzxt.getDocument().getStyles();
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        while (zzyu4ZzZsD.zzQ("pPrDefault")) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 6) {
                zzyu4ZzZsD.zzk();
            } else {
                this.zzYNx.zzY(zzzxt, styles.zzY36(), styles.zzY37());
            }
        }
        styles.zzY36().zzYpk();
    }

    private void zzZI(zzZXT zzzxt) throws Exception {
        StyleCollection styles = zzzxt.getDocument().getStyles();
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        while (zzyu4ZzZsD.zzQ("rPrDefault")) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) != 5) {
                zzyu4ZzZsD.zzk();
            } else {
                this.zzYNw.zzW(zzzxt, styles.zzY37());
            }
        }
    }

    private void zzZJ(zzZXT zzzxt) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        boolean z = false;
        boolean z2 = false;
        while (zzyu4ZzZsD.zzQ("docDefaults")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 3) {
                zzZI(zzzxt);
                z = true;
            } else if (iZzTP != 4) {
                zzyu4ZzZsD.zzk();
            } else {
                zzZH(zzzxt);
                z2 = true;
            }
        }
        if (!z) {
            zzZC(zzzxt);
        }
        if (z2) {
            return;
        }
        zzZD(zzzxt);
    }

    public final void zzE(zzZXT zzzxt) throws Exception {
        if (zzzxt.zzYyZ().zzZrB()) {
            return;
        }
        zzZW1 zzzw1ZzNJ = zzzxt.zzNJ(zzzxt.zzZmp().zzZkS());
        boolean z = false;
        if (zzzw1ZzNJ != null) {
            zzYU7 zzyu7 = new zzYU7();
            while (zzzw1ZzNJ.zzQ("styles")) {
                int iZzTP = zzUR.zzTP(zzzw1ZzNJ.getLocalName());
                if (iZzTP == 0) {
                    zzZJ(zzzxt);
                    z = true;
                } else if (iZzTP == 1) {
                    zzZG(zzzxt);
                } else if (iZzTP != 2) {
                    zzzw1ZzNJ.zzk();
                } else {
                    zzZ(zzzxt, zzyu7);
                }
            }
            zzyu7.zzZ(zzzxt);
            zzzxt.zzZmi();
        }
        if (!z) {
            zzZD(zzzxt);
            zzZC(zzzxt);
        }
        zzzxt.getDocument().getStyles().zzY2V();
    }

    private void zzZ(zzZXT zzzxt, Style style) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        TableStyle tableStyle = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(style, TableStyle.class);
        if (tableStyle == null) {
            zzyu4ZzZsD.zzk();
        }
        switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
            case 34:
                zzZWE.zzT(zzzxt, tableStyle.zzZYf());
                break;
            case 35:
                zzZWU.zzX(zzzxt, tableStyle.zzZYd());
                break;
            case 36:
                zzZWW.zzZkZ().zzY(zzzxt, tableStyle.zz6G());
                tableStyle.zz6G().remove(3050);
                break;
            case 37:
                tableStyle.zzX(zzZE(zzzxt));
                break;
            default:
                zzyu4ZzZsD.zzk();
                break;
        }
    }
}
