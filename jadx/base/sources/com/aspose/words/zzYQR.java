package com.aspose.words;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes6.dex */
final class zzYQR {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("default-style", "notes-configuration", RequestParameters.MARKER, "stroke-dash", "gradient", "linenumbering-configuration", "outline-style", "default-page-layout", "bibliography-configuration", "linearGradient", "radialGradient", "hatch", "fill-image", "opacity", "presentation-page-layout", "table-template", "page-layout-properties", "number-lines", "increment", "offset", "restart-on-page", "style-name", "number-position", "count-empty-lines", "count-in-text-boxes", "num-format", "num-letter-sync", "style", "cx", TranslateLanguage.WELSH, "angle", "border", "start-color", "end-color", "start-intensity", "end-intensity", "list-style", "date-style", "time-style", "number-style", "text-style", "currency-style", "percentage-style", "boolean-style", "dots1", "dots1-length", "dots2", "dots2-length", "distance", "note-class", "citation-style-name", "citation-body-style-name", "start-value", "footnotes-position", "start-numbering-at", "default-style-name", "master-page-name", "num-prefix", "num-suffix");

    public static void zzJ(zzYQ7 zzyq7) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("styles")) {
            if (!zzW(zzyq7, false)) {
                switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                    case 0:
                        zzYPL.zzV(zzyq7, false);
                        break;
                    case 1:
                        zzd(zzyq7);
                        break;
                    case 2:
                        zze(zzyq7);
                        break;
                    case 3:
                        zzf(zzyq7);
                        break;
                    case 4:
                        zzg(zzyq7);
                        break;
                    case 5:
                        zzh(zzyq7);
                        break;
                    case 6:
                        zzyq7.zzYuS().zzZ(zzYR6.zzZ(zzyq7, "outline-style", false));
                        break;
                    case 7:
                        zzi(zzyq7);
                        break;
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        zzyq7.zzZ(256, true, "office:styles");
                        break;
                    default:
                        zzyq9ZzYuT.zzk();
                        break;
                }
            }
        }
        zzyq7.zzA(true, false);
        zzb(zzyq7);
    }

    private static void zzR(zzYQ7 zzyq7, String str) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        boolean zEquals = "endnote".equals(str);
        zzZAU endnoteOptions = zEquals ? zzyq7.getDocument().getEndnoteOptions() : zzyq7.getDocument().getFootnoteOptions();
        endnoteOptions.setNumberStyle(255);
        endnoteOptions.setStartNumber(0);
        zzyq9ZzYuT.zzj();
        while (zzyq9ZzYuT.zzi()) {
            String value = zzyq9ZzYuT.getValue();
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP != 25) {
                if (iZzTP != 26) {
                    switch (iZzTP) {
                        case 49:
                            break;
                        case 50:
                            zzZ(zzyq7, value, zEquals, false);
                            continue;
                        case 51:
                            zzZ(zzyq7, value, zEquals, true);
                            continue;
                        case 52:
                            endnoteOptions.setStartNumber(zzyq9ZzYuT.zzb() + 1);
                            continue;
                        case 53:
                            endnoteOptions.setLocation(zzYS3.zzFc(value));
                            continue;
                        case 54:
                            if ("chapter".equals(value)) {
                                zzyq7.zzT(256, "Import of 'chapter' value for 'text:notes-configuration' -> 'start-numbering-at' attribute is not supported for this format by Aspose.Words");
                            }
                            endnoteOptions.setRestartRule(zzYS3.zzFf(value));
                            continue;
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                            break;
                        default:
                            zzyq7.zzYi("notes-configuration", zzyq9ZzYuT.getLocalName());
                            continue;
                    }
                }
                zzyq7.zzZ(256, false, "text:notes-configuration");
            } else {
                endnoteOptions.setNumberStyle(zzYQU.zzEo(value));
            }
        }
    }

    private static void zzS(zzYQ7 zzyq7, String str) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            zzZ4Z zzz4zZzYuB = zzyq7.zzYuB();
            String value = zzyq9ZzYuT.getValue();
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 17:
                    zzz4zZzYuB.zzJj(value);
                    break;
                case 18:
                    zzz4zZzYuB.zzJi(value);
                    break;
                case 19:
                    zzz4zZzYuB.zzJh(value);
                    break;
                case 20:
                    zzz4zZzYuB.zzJg(value);
                    break;
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    zzyq7.zzZ(256, false, str);
                    break;
                default:
                    zzyq7.zzYi("linenumbering-configuration", zzyq9ZzYuT.getLocalName());
                    break;
            }
        }
    }

    private static void zzT(zzYQ7 zzyq7, String str) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ(str)) {
            if ("linenumbering-separator".equals(zzyq9ZzYuT.getLocalName())) {
                zzyq7.zzZ(256, true, str);
            } else {
                zzyq9ZzYuT.zzk();
            }
        }
    }

    public static boolean zzW(zzYQ7 zzyq7, boolean z) throws Exception {
        int iZzTP = zzUR.zzTP(zzyq7.zzYuT().getLocalName());
        if (iZzTP == 27) {
            zzYPL.zzV(zzyq7, z);
            return true;
        }
        switch (iZzTP) {
            case 36:
                zzYR6.zzZ(zzyq7, "list-style", z);
                break;
            case 37:
            case 38:
                zzYSC.zzZ(zzyq7, z);
                break;
            case 39:
                zzYSC.zzY(zzyq7, z);
                break;
            case 40:
                zzYSC.zzX(zzyq7, z);
                break;
            case 41:
            case 42:
            case 43:
                zzyq7.zzZ(256, true, z ? "office:automatic-styles" : "office:styles");
                break;
        }
        return true;
    }

    private static boolean zzX(zzYQ7 zzyq7, zzYPQ zzypq) {
        for (int i = 0; i < zzyq7.zzYuS().zzYu3(); i++) {
            zzYPP zzyppZzrF = zzyq7.zzYuS().zzrF(i);
            if ((zzyppZzrF instanceof zzYR7) && ((zzYR7) com.aspose.words.internal.zzZKW.zzZ(zzyppZzrF, zzYR7.class)).zzYvK().contains(zzypq.getName())) {
                return true;
            }
        }
        return false;
    }

    private static void zzY(zzYQ7 zzyq7, zzYPQ zzypq) {
        if (zzX(zzyq7, zzypq)) {
            return;
        }
        zzYOY zzyoy = (zzYOY) zzypq;
        zzYEF zzyefZzZYh = zzyoy.zzZYh();
        StyleCollection styles = zzyq7.getDocument().getStyles();
        if (com.aspose.words.internal.zzZYD.zzXk(zzypq.getName())) {
            Style styleZzZ = zzZ(2, zzypq.getName(), zzyq7.getDocument());
            if (zzyefZzZYh != null) {
                zzyefZzZYh.zzY(styleZzZ.zzZYh());
            }
            styles.zzZ(styleZzZ, (String[]) null);
            return;
        }
        if (zzyefZzZYh != null) {
            zzyefZzZYh.zzY(styles.zzY37());
        }
        zzYMX zzymxZzZYj = zzyoy.zzZYj();
        if (zzymxZzZYj != null) {
            zzymxZzZYj.zzY(styles.zzY36());
        }
    }

    private static void zzZ(zzYQ7 zzyq7, String str, boolean z, boolean z2) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            int i = z ? 42 : 38;
            if (z2) {
                i = z ? 43 : 29;
            }
            zzYOY zzyoy = (zzYOY) zzyq7.zzYuS().zzY(zzYOU.zzDr(str), null, false, false);
            if (zzyoy != null) {
                Style styleZzX = Style.zzX(2, 0, i, zzyoy.getName());
                if (zzyoy.zzZYh() != null) {
                    zzyoy.zzZYh().zzY(styleZzX.zzZYh());
                }
            }
        }
    }

    private static void zza(zzYQ7 zzyq7) {
        zzYPQ zzypq;
        Style styleZz0;
        zzYPQ zzypq2;
        String strZzYu5;
        StyleCollection styles = zzyq7.getDocument().getStyles();
        zzYPO zzypoZzYuS = zzyq7.zzYuS();
        for (int i = 0; i < styles.getCount(); i++) {
            Style style = styles.get(i);
            if (!zzrT(style.getStyleIdentifier())) {
                zzYPP zzyppZzY = zzypoZzYuS.zzY(style.getName(), null, false, false);
                if ((zzyppZzY instanceof zzYPQ) && (strZzYu5 = (zzypq2 = (zzYPQ) com.aspose.words.internal.zzZKW.zzZ(zzyppZzY, zzYPQ.class)).zzYu5()) != null && zzZ(styles.zz0(strZzYu5, false), style, zzypq2)) {
                    style.zzl5(styles.zz0(strZzYu5, false).zzZ7j());
                }
            }
        }
        for (int i2 = 0; i2 < zzypoZzYuS.zzYu3(); i2++) {
            zzYR7 zzyr7 = (zzYR7) com.aspose.words.internal.zzZKW.zzZ(zzypoZzYuS.zzrF(i2), zzYR7.class);
            if (zzyr7 != null && (zzypq = (zzYPQ) zzypoZzYuS.zzY(zzyr7.zzYvK().get(0), "text", false, false)) != null && zzypq.zzYu5() != null && (styleZz0 = styles.zz0(zzypq.zzYu5(), false)) != null) {
                zzZ4J zzz4jZzYPa = zzyq7.getDocument().getLists().getListByListId(zzyr7.getList().getListId()).zzYPa();
                if (styleZz0.getStyleIdentifier() != 107) {
                    zzz4jZzYPa.zzxh(styleZz0.zzZ7j());
                }
            }
        }
    }

    private static void zzb(zzYQ7 zzyq7) {
        for (int i = 0; i < zzyq7.zzYuS().zzYu3(); i++) {
            zzYPP zzyppZzrF = zzyq7.zzYuS().zzrF(i);
            if (zzyppZzrF instanceof zzYPQ) {
                zzYPQ zzypq = (zzYPQ) com.aspose.words.internal.zzZKW.zzZ(zzyppZzrF, zzYPQ.class);
                if ("paragraph".equals(zzypq.getFamily())) {
                    zzW(zzyq7, zzypq);
                }
                if (zzZ(zzyq7, zzypq)) {
                    zzY(zzyq7, zzypq);
                }
            }
        }
        zza(zzyq7);
    }

    private static void zzc(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("notes-configuration")) {
            if ("note-continuation-notice-forward".equals(zzyq9ZzYuT.getLocalName()) || "note-continuation-notice-backward".equals(zzyq9ZzYuT.getLocalName())) {
                zzyq7.zzZ(256, true, "text:notes-configuration");
            } else {
                zzyq9ZzYuT.zzk();
            }
        }
    }

    private static void zzd(zzYQ7 zzyq7) {
        String strZzV = zzyq7.zzYuT().zzV("note-class", "");
        if ("".equals(strZzV)) {
            return;
        }
        zzR(zzyq7, strZzV);
        zzc(zzyq7);
    }

    private static void zze(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzYR1 zzyr1 = new zzYR1();
        while (zzyq9ZzYuT.zzi()) {
            if (!zzYQ7.zzZ(zzyq9ZzYuT, zzyr1)) {
                if ("viewBox".equals(zzyq9ZzYuT.getLocalName())) {
                    zzyr1.zzEu(zzyq9ZzYuT.getValue());
                } else if ("d".equals(zzyq9ZzYuT.getLocalName())) {
                    zzyr1.zzEt(zzyq9ZzYuT.getValue());
                }
            }
        }
        zzyq7.zzYuS().zzZ((zzYPP) zzyr1, false, false);
    }

    private static void zzf(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzYPR zzypr = new zzYPR();
        while (zzyq9ZzYuT.zzi()) {
            if (!zzYQ7.zzZ(zzyq9ZzYuT, zzypr)) {
                String value = zzyq9ZzYuT.getValue();
                int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
                if (iZzTP != 27) {
                    switch (iZzTP) {
                        case 44:
                            zzypr.zzDZ(value);
                            break;
                        case 45:
                            zzypr.zzDY(value);
                            break;
                        case 46:
                            zzypr.zzDX(value);
                            break;
                        case 47:
                            zzypr.zzDW(value);
                            break;
                        case 48:
                            zzypr.zzDV(value);
                            break;
                        default:
                            zzyq7.zzYi("stroke-dash", zzyq9ZzYuT.getLocalName());
                            break;
                    }
                } else {
                    zzypr.zzTa(value);
                }
            }
        }
        zzyq7.zzYuS().zzZ((zzYPP) zzypr, false, false);
    }

    private static void zzg(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzYRP zzyrp = new zzYRP();
        while (zzyq9ZzYuT.zzi()) {
            if (!zzYQ7.zzZ(zzyq9ZzYuT, zzyrp)) {
                String value = zzyq9ZzYuT.getValue();
                switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                    case 27:
                        zzyrp.zzTa(value);
                        break;
                    case 28:
                        zzyrp.zzEH(value);
                        break;
                    case 29:
                        zzyrp.zzEG(value);
                        break;
                    case 30:
                        zzyrp.zzEF(value);
                        break;
                    case 31:
                        zzyrp.zzEE(value);
                        zzyq7.zzZ(256, false, "draw:gradient");
                        break;
                    case 32:
                        zzyrp.zzED(value);
                        break;
                    case 33:
                        zzyrp.zzEC(value);
                        break;
                    case 34:
                        zzyrp.zzEB(value);
                        break;
                    case 35:
                        zzyrp.zzEA(value);
                        break;
                    default:
                        zzyq7.zzYi("gradient", zzyq9ZzYuT.getLocalName());
                        break;
                }
            }
        }
        zzyq7.zzYuS().zzZ((zzYPP) zzyrp, false, false);
    }

    private static void zzh(zzYQ7 zzyq7) {
        zzyq7.zzZ(new zzZ4Z());
        zzS(zzyq7, "linenumbering-configuration");
        zzT(zzyq7, "linenumbering-configuration");
    }

    private static void zzi(zzYQ7 zzyq7) throws Exception {
        zzYQK zzyqk = new zzYQK();
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("default-page-layout")) {
            if (zzUR.zzTP(zzyq9ZzYuT.getLocalName()) != 16) {
                zzyq9ZzYuT.zzk();
            } else {
                zzYQI.zzZ(zzyq7, zzyqk);
                zzyq7.zzYuS().zzY(zzyqk);
            }
        }
    }

    private static boolean zzrT(int i) {
        return i == 0 || i == 65;
    }

    private static boolean zzZ(zzYQ7 zzyq7, zzYPQ zzypq) {
        return "text".equals(zzypq.getFamily()) && (!com.aspose.words.internal.zzZYD.zzXk(zzypq.getName()) || zzyq7.getDocument().getStyles().zz0(zzypq.getName(), false) == null);
    }

    private static Style zzZ(int i, String str, Document document) {
        Style styleZzl6 = Style.zzl6(i);
        zzYUC.zzZ(zzYS3.zzEU(str), document.getStyles(), false, false, false, styleZzl6);
        styleZzl6.zz1(str, false);
        return styleZzl6;
    }

    private static void zzW(zzYQ7 zzyq7, zzYPQ zzypq) {
        StyleCollection styles = zzyq7.getDocument().getStyles();
        zzYQB zzyqb = (zzYQB) zzypq;
        zzYEF zzyefZzZYh = zzyqb.zzZYh();
        zzYMX zzymxZzZYj = zzyqb.zzZYj();
        if (!com.aspose.words.internal.zzZYD.zzXk(zzypq.getName())) {
            if (zzyefZzZYh != null) {
                zzyefZzZYh.zzY(styles.zzY37());
            }
            if (zzymxZzZYj != null) {
                zzymxZzZYj.zzY(styles.zzY36());
                return;
            }
            return;
        }
        Style styleZzZ = zzZ(1, zzypq.getName(), zzyq7.getDocument());
        if (styleZzZ.getStyleIdentifier() == 0) {
            styleZzZ.isQuickStyle(true);
        }
        if (zzyefZzZYh != null) {
            zzyefZzZYh.zzY(styleZzZ.zzZYh());
        }
        if (zzymxZzZYj != null) {
            zzymxZzZYj.zzY(styleZzZ.zzZYj());
        }
        if (zzyqb.zzYv4() != -1) {
            styleZzZ.zzZYj().zzQ(1280, Integer.valueOf(zzyqb.zzYv4()));
            com.aspose.words.internal.zzZQG.zzZ(zzyq7.zzYuS().zzYtY(), styleZzZ);
        }
        styles.zzZ(styleZzZ, (String[]) null);
    }

    private static boolean zzZ(Style style, Style style2, zzYPQ zzypq) {
        return (style == null || style.getType() != style2.getType() || com.aspose.words.internal.zzZKN.equals(zzypq.getName(), zzypq.zzYu5())) ? false : true;
    }
}
