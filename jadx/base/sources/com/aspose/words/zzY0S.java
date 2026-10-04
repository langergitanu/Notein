package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes6.dex */
final class zzY0S {
    private static final com.aspose.words.internal.zzZHW zzUR;
    private zzY14 zzWV7;
    private zzY0Y zzWV8;
    private static com.aspose.words.internal.zzIM<Integer> zzWUF = new com.aspose.words.internal.zzIM<>();
    private static com.aspose.words.internal.zzIM<Integer> zzWUE = new com.aspose.words.internal.zzIM<>();

    static {
        for (int i = 0; i <= 9; i++) {
            zzWUF.add(Integer.valueOf(i));
        }
        zzWUF.add(34);
        zzWUF.add(62);
        zzWUF.add(74);
        zzWUF.add(87);
        zzWUF.add(88);
        zzWUF.add(157);
        zzWUF.add(179);
        zzWUF.add(180);
        zzWUF.add(181);
        zzWUF.add(Integer.valueOf(StyleIdentifier.SUBTLE_EMPHASIS));
        zzWUF.add(Integer.valueOf(StyleIdentifier.INTENSE_EMPHASIS));
        zzWUF.add(Integer.valueOf(StyleIdentifier.SUBTLE_REFERENCE));
        zzWUF.add(Integer.valueOf(StyleIdentifier.INTENSE_REFERENCE));
        zzWUF.add(Integer.valueOf(StyleIdentifier.BOOK_TITLE));
        zzWUF.add(Integer.valueOf(StyleIdentifier.TOC_HEADING));
        zzWUE.add(7);
        zzWUE.add(8);
        zzWUE.add(9);
        zzWUE.add(34);
        zzWUE.add(105);
        for (int i2 = 111; i2 <= 152; i2++) {
            zzWUE.add(Integer.valueOf(i2));
        }
        zzWUE.add(155);
        zzWUE.add(Integer.valueOf(StyleIdentifier.TOC_HEADING));
        zzUR = new com.aspose.words.internal.zzZHW("versionOfBuiltInStylenames", "latentStyles", "style", "defLockedState", "latentStyleCount", "lsdException", "locked", "name", C18437z2.f56754h, "default", "styleId", "aliases", "basedOn", "next", "link", "autoRedefine", "hidden", "semiHidden", "personal", "personalCompose", "personalReply", "rsid", "pPr", "rPr", "uiName", "uiPriority", "qFormat", "tblPr", "trPr", "tcPr", "tblStylePr");
    }

    public zzY0S(zzY14 zzy14, zzY0Y zzy0y) {
        this.zzWV7 = zzy14;
        this.zzWV8 = zzy0y;
    }

    private ConditionalStyle zzQ(zzY12 zzy12) throws Exception {
        zzYU4 zzyu4ZzZsD = zzy12.zzZsD();
        int iZzAV = 0;
        while (zzyu4ZzZsD.zzi()) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) == 8) {
                iZzAV = zzY8T.zzAV(zzyu4ZzZsD.getValue());
            }
        }
        ConditionalStyle conditionalStyle = new ConditionalStyle(iZzAV);
        while (zzyu4ZzZsD.zzQ("tblStylePr")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 22) {
                conditionalStyle.zzZ(new zzYMX());
                this.zzWV7.zzY(zzy12, conditionalStyle.zzZYj(), conditionalStyle.zzZYh());
            } else if (iZzTP != 23) {
                switch (iZzTP) {
                    case 27:
                        conditionalStyle.zzZ(new zzY6G());
                        zzY0R.zzX(conditionalStyle.zzZYf(), zzy12);
                        break;
                    case 28:
                        conditionalStyle.zzY(new zzY6G());
                        zzY10.zzZ(conditionalStyle.zzZYd(), zzy12);
                        break;
                    case 29:
                        conditionalStyle.zzZ(new zzWP());
                        zzY11.zzXSt().zzY(zzy12, conditionalStyle.zz6G());
                        break;
                }
            } else {
                conditionalStyle.zzZ(new zzYEF());
                this.zzWV8.zzW(zzy12, conditionalStyle.zzZYh());
            }
        }
        return conditionalStyle;
    }

    private static void zzR(zzY12 zzy12) {
        zzZ73 zzz73ZzYi5 = zzy12.getDocument().getStyles().zzYi5();
        zzYU4 zzyu4ZzZsD = zzy12.zzZsD();
        String value = "";
        boolean zZzYUf = zzz73ZzYi5.zzYUf();
        while (zzyu4ZzZsD.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 6) {
                zZzYUf = zzyu4ZzZsD.zz8();
            } else if (iZzTP == 7) {
                value = zzyu4ZzZsD.getValue();
            }
        }
        int iZzAP = zzY8T.zzAP(value);
        int iZzYUc = zzz73ZzYi5.zzYUc();
        boolean zContains = zzWUF.contains(Integer.valueOf(iZzAP));
        boolean zContains2 = zzWUE.contains(Integer.valueOf(iZzAP));
        if (iZzAP != 4094) {
            zzz73ZzYi5.zzX(new zzZ74(iZzAP, zZzYUf, zContains, zContains2, iZzYUc, zContains2));
        }
    }

    private static void zzS(zzY12 zzy12) {
        zzZ73 zzz73ZzYi5 = zzy12.getDocument().getStyles().zzYi5();
        zzz73ZzYi5.zzy6(0);
        zzz73ZzYi5.zzV3(false);
        zzz73ZzYi5.zzV2(false);
        zzYU4 zzyu4ZzZsD = zzy12.zzZsD();
        while (zzyu4ZzZsD.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 3) {
                zzz73ZzYi5.zzV5(zzyu4ZzZsD.zz8());
            } else if (iZzTP == 4) {
                zzz73ZzYi5.zzy5(zzyu4ZzZsD.zzb());
            }
        }
        while (zzyu4ZzZsD.zzQ("latentStyles")) {
            if (zzUR.zzTP(zzyu4ZzZsD.getLocalName()) == 5) {
                zzR(zzy12);
            }
        }
    }

    public final void zzZ(zzY12 zzy12) throws Exception {
        zzYU4 zzyu4ZzZsD = zzy12.zzZsD();
        if (zzy12.zzYyZ().zzZrB()) {
            zzyu4ZzZsD.zzYyH();
            return;
        }
        zzYU7 zzyu7 = new zzYU7();
        while (zzyu4ZzZsD.zzQ("styles")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP != 0) {
                if (iZzTP == 1) {
                    zzS(zzy12);
                } else if (iZzTP != 2) {
                    zzyu4ZzZsD.zzk();
                } else {
                    zzZ(zzy12, zzyu7);
                }
            }
        }
        zzyu7.zzZ(zzy12);
    }

    private void zzZ(zzY12 zzy12, zzYU7 zzyu7) throws Exception {
        StyleCollection styles = zzy12.getDocument().getStyles();
        zzYU4 zzyu4ZzZsD = zzy12.zzZsD();
        boolean zZz8 = false;
        int iZzyI = 1;
        String value = null;
        while (zzyu4ZzZsD.zzi()) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 8:
                    iZzyI = zzY1K.zzyI(zzyu4ZzZsD.getValue());
                    break;
                case 9:
                    zZz8 = zzyu4ZzZsD.zz8();
                    break;
                case 10:
                    value = zzyu4ZzZsD.getValue();
                    break;
                default:
                    zzyu4ZzZsD.zzZ(65536, 13, zzyu4ZzZsD.getLocalName());
                    break;
            }
        }
        Style styleZzl6 = Style.zzl6(iZzyI);
        zzYU8 zzyu8 = new zzYU8(styleZzl6);
        String str = value;
        String strZzV = null;
        while (zzyu4ZzZsD.zzQ("style")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 6) {
                styleZzl6.setLocked(zzyu4ZzZsD.zzYyD());
            } else if (iZzTP != 7) {
                switch (iZzTP) {
                    case 11:
                        strZzV = zzyu4ZzZsD.zzV("val", null);
                        break;
                    case 12:
                        zzyu8.zzXSz = zzyu4ZzZsD.zzV("val", null);
                        break;
                    case 13:
                        zzyu8.zzXSy = zzyu4ZzZsD.zzV("val", null);
                        break;
                    case 14:
                        zzyu8.zzXSx = zzyu4ZzZsD.zzV("val", null);
                        break;
                    case 15:
                        styleZzl6.setAutomaticallyUpdate(zzyu4ZzZsD.zzYyD());
                        break;
                    case 16:
                        styleZzl6.setHidden(zzyu4ZzZsD.zzYyD());
                        break;
                    case 17:
                        styleZzl6.setSemiHidden(zzyu4ZzZsD.zzYyD());
                        break;
                    case 18:
                        styleZzl6.zzQg(zzyu4ZzZsD.zzYyD());
                        break;
                    case 19:
                        styleZzl6.zzQi(zzyu4ZzZsD.zzYyD());
                        break;
                    case 20:
                        styleZzl6.zzQh(zzyu4ZzZsD.zzYyD());
                        break;
                    case 21:
                        int iZzGV = zzYU3.zzGV(zzyu4ZzZsD.zzV("val", null));
                        if (iZzGV != Integer.MIN_VALUE) {
                            styleZzl6.zzl2(iZzGV);
                        }
                        break;
                    case 22:
                        this.zzWV7.zzY(zzy12, styleZzl6.zzZYj(), styleZzl6.zzZYh());
                        break;
                    case 23:
                        this.zzWV8.zzW(zzy12, styleZzl6.zzZYh());
                        break;
                    case 24:
                        String strZzV2 = zzyu4ZzZsD.zzV("val", null);
                        if (com.aspose.words.internal.zzZYD.zzXk(strZzV2)) {
                            styleZzl6.zzB0(strZzV2);
                        }
                        break;
                    case 25:
                        styleZzl6.setPriority(zzyu4ZzZsD.zzYyE());
                        break;
                    case 26:
                        styleZzl6.isQuickStyle(true);
                        break;
                    default:
                        zzZ(zzy12, styleZzl6);
                        break;
                }
            } else {
                String strZzV3 = zzyu4ZzZsD.zzV("val", null);
                if (com.aspose.words.internal.zzZYD.zzXk(strZzV3)) {
                    zzYUC.zzZ(strZzV3, styles, false, false, true, styleZzl6);
                    if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
                        str = strZzV3;
                    }
                    zzy12.zzH(str, styleZzl6.zzZ7j());
                }
            }
        }
        String[] strArrZzR = strZzV != null ? com.aspose.words.internal.zzZKN.zzR(strZzV, ',') : null;
        if (zzWUF.contains(Integer.valueOf(styleZzl6.getStyleIdentifier()))) {
            styleZzl6.isQuickStyle(true);
        }
        if (com.aspose.words.internal.zzZYD.zzXk(styleZzl6.getName())) {
            styles.zzZ(styleZzl6, strArrZzR);
            com.aspose.words.internal.zzZQG.zzZ(zzyu7, zzyu8);
        }
        if (zZz8) {
            zzy12.zzYyU().set(styleZzl6.getType(), styleZzl6);
        }
    }

    private void zzZ(zzY12 zzy12, Style style) throws Exception {
        zzYU4 zzyu4ZzZsD = zzy12.zzZsD();
        TableStyle tableStyle = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(style, TableStyle.class);
        if (tableStyle == null) {
            zzyu4ZzZsD.zzk();
        }
        switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
            case 27:
                zzY0R.zzX(tableStyle.zzZYf(), zzy12);
                break;
            case 28:
                zzY10.zzZ(tableStyle.zzZYd(), zzy12);
                break;
            case 29:
                zzY11.zzXSt().zzY(zzy12, tableStyle.zz6G());
                break;
            case 30:
                tableStyle.zzX(zzQ(zzy12));
                break;
            default:
                zzyu4ZzZsD.zzk();
                break;
        }
    }
}
