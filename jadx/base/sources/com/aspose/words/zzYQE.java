package com.aspose.words;

import androidx.core.view.PointerIconCompat;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.android.gms.common.ConnectionResult;
import com.huawei.hms.network.embedded.C18437z2;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes6.dex */
final class zzYQE {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("auto-text-indent", "text-align-last", "text-align", "text-indent", "text-autospace", "page-number", "line-number", "number-lines", "master-page-name", "writing-mode", "line-height", "line-height-at-least", "keep-together", "keep-with-next", "background-color", "punctuation-wrap", "vertical-align", "snap-to-layout-grid", "hyphenation-ladder-count", "tab-stop-distance", "shadow", "widows", "orphans", "hyphenation-keep", "background-transparency", "border-line-width", "border-line-width-bottom", "border-line-width-left", "border-line-width-right", "border-line-width-top", "font-independent-line-spacing", "join-border", "justify-single-word", "line-break", "line-spacing", "register-true", "writing-mode-automatic", "tab-stops", "drop-cap", C18437z2.f56754h, "leader-style", "leader-text", RequestParameters.POSITION, "char", "leader-type", "leader-text-style", "leader-width", "leader-color", "lines", "distance", "length", "style-name", "fill-color", "opacity", "fill");

    private static zz7X zz6(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zz7X zz7xZzId = null;
        String value = null;
        String value2 = null;
        while (zzyq9ZzYuT.zzi()) {
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 52:
                    value = zzyq9ZzYuT.getValue();
                    break;
                case 53:
                    value2 = zzyq9ZzYuT.getValue();
                    break;
                case 54:
                    zz7xZzId = zz7X.zzId(zzYS3.zzFg(zzyq9ZzYuT.getValue()));
                    break;
                default:
                    zzyq7.zzv("graphic-properties", "draw:fill", zzyq9ZzYuT.getValue());
                    break;
            }
        }
        if (zz7xZzId != null) {
            if (com.aspose.words.internal.zzZYD.zzXk(value) && zz7xZzId.zzZQ4() == 5) {
                zz7xZzId.zzm(zzYOU.zzDu(value));
            }
            if (com.aspose.words.internal.zzZYD.zzXk(value2)) {
                zz7xZzId.setOpacity(((double) zzYOU.zzDs(value2)) / 65536.0d);
            }
        }
        return zz7xZzId;
    }

    private static Border zzX(zzYTJ zzytj, double d, boolean z) {
        Border borderZzZ = zzYTJ.zzZ(zzytj, d, false);
        borderZzZ.setShadow(z);
        return borderZzZ;
    }

    public static void zzY(zzYQ7 zzyq7, zzYQB zzyqb) {
        zz7X zz7xZz6 = zz6(zzyq7);
        if (zz7xZz6 != null) {
            if (zzyqb.zzZYh() == null) {
                zzyqb.zzZ(new zzYEF());
            }
            zzyqb.zzZYh().set(830, zz7xZz6);
        }
    }

    public static void zzZ(zzYQ7 zzyq7, zzYQB zzyqb) {
        zzYMX zzymx = new zzYMX();
        zzZ(zzyq7, zzyqb, zzymx);
        zzY(zzyq7, zzyqb, zzymx);
        if (zzymx.getCount() > 0) {
            if (zzyqb.zzZYj() == null) {
                zzyqb.zzZ(zzymx);
            } else {
                zzymx.zzY(zzyqb.zzZYj());
            }
        }
    }

    private static TabStopCollection zzX(zzYQ7 zzyq7, zzYQB zzyqb) {
        TabStopCollection tabStopCollection = new TabStopCollection();
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("tab-stops")) {
            if ("tab-stop".equals(zzyq9ZzYuT.getLocalName())) {
                tabStopCollection.add(zzZ(zzyq7, zzZ(zzyq7.zzYuS(), zzyqb)));
            } else {
                zzyq9ZzYuT.zzk();
            }
        }
        return tabStopCollection;
    }

    private static void zzY(zzYQ7 zzyq7, zzYMX zzymx, String str) {
        if ("rl-tb".equals(str) || "rl".equals(str)) {
            zzymx.zzQ(1560, Boolean.TRUE);
        }
        if ("lr-tb".equals(str) || "lr".equals(str)) {
            zzymx.zzQ(1560, Boolean.FALSE);
        }
        if ("tb".equals(str) || "page".equals(str) || "tb-rl".equals(str) || "tb-lr".equals(str)) {
            zzyq7.zzv("style:paragraph-properties", "style:writing-mode", str);
        }
    }

    private static void zzZ(zzYQ7 zzyq7, zzYQB zzyqb, zzYMX zzymx) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String str = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        String strZzZ = null;
        while (zzyq9ZzYuT.zzi()) {
            if (!zzYQ7.zzZ(zzyq9ZzYuT, zzyqb, zzymx) && !zzYQ7.zzZ(zzyq9ZzYuT, zzyqb.zzYvQ()) && !zzYQ7.zzZ(zzyq9ZzYuT, zzyqb.zzYvh()) && !zzYQ7.zzZ(zzyq9ZzYuT, zzyqb.zzYvg())) {
                String value = zzyq9ZzYuT.getValue();
                int iZzb = zzyq9ZzYuT.zzb();
                switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                    case 0:
                        zzyqb.zzSf(TelemetryEventStrings.Value.TRUE.equals(value));
                        break;
                    case 1:
                        strZzZ = zzZ(zzyq7, strZzZ, value);
                        break;
                    case 2:
                        str = value;
                        break;
                    case 3:
                        zzZ(zzyq7, zzymx, value);
                        break;
                    case 4:
                        zzymx.zzQ(1240, Boolean.valueOf("ideograph-alpha".equals(value)));
                        break;
                    case 5:
                        if (!"auto".equals(value)) {
                            zzyqb.setPageNumber(value);
                        }
                        break;
                    case 6:
                        zzyqb.setLineNumber(iZzb);
                        break;
                    case 7:
                        zzymx.setSuppressLineNumbers(!TelemetryEventStrings.Value.TRUE.equals(value));
                        break;
                    case 8:
                        if (!com.aspose.words.internal.zzZYD.zzXk(zzyqb.zzYu6())) {
                            zzyqb.zzDT(zzYOU.zzDr(value));
                        }
                        break;
                    case 9:
                        zzZ(zzyqb, value);
                        zzY(zzyq7, zzymx, value);
                        break;
                    case 10:
                        zzZ(zzymx, value);
                        break;
                    case 11:
                        zzymx.setLineSpacingRule(0);
                        zzymx.zzw6(zzYSF.zzFX(value));
                        break;
                    case 12:
                        if ("always".equals(value)) {
                            zzymx.zzQ(EditingLanguage.ITALIAN_ITALY, Boolean.TRUE);
                        }
                        break;
                    case 13:
                        if ("always".equals(value)) {
                            zzymx.zzQ(1050, Boolean.TRUE);
                        }
                        break;
                    case 14:
                        if (!"transparent".equals(value)) {
                            zzymx.zzQ(1460, zzYOU.zzZ(value, (Shading) zzymx.get(1460)));
                        }
                        break;
                    case 15:
                        if ("simple".equals(value)) {
                            zzymx.zzQ(EditingLanguage.TURKMEN, Boolean.FALSE);
                        }
                        break;
                    case 16:
                        int iZzF4 = zzYS3.zzF4(value);
                        if (iZzF4 != 2) {
                            zzymx.zzQ(1510, Integer.valueOf(iZzF4));
                        }
                        break;
                    case 17:
                        if (TelemetryEventStrings.Value.TRUE.equals(value)) {
                            zzymx.zzQ(1260, Boolean.TRUE);
                        }
                        break;
                    case 18:
                        if ("no-limit".equals(value)) {
                            zzymx.zzQ(1410, Boolean.TRUE);
                        }
                        break;
                    case 19:
                        if (zzyqb.getName() == null) {
                            zzyq7.getDocument().zzZpV().zzYW4 = zzYSF.zzFX(value);
                        }
                        break;
                    case 20:
                        z = !"none".equals(value);
                        break;
                    case 21:
                        i = iZzb;
                        break;
                    case 22:
                        i2 = iZzb;
                        break;
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                        zzyq7.zzZ(256, false, "style:paragraph-properties");
                        break;
                    default:
                        zzyq7.zzYi("style:paragraph-properties", zzyq9ZzYuT.getLocalName());
                        break;
                }
            }
        }
        zzZ(zzyq7, zzymx, str, strZzZ);
        zzZ(zzyq7.getDocument().zzZpV(), zzyqb, zzymx, i, i2);
        zzZ(zzymx, zzyqb, z);
    }

    private static void zzY(zzYQ7 zzyq7, zzYQB zzyqb, zzYMX zzymx) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("paragraph-properties")) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP == 37) {
                zzymx.zzQ(EditingLanguage.GUARANI, zzX(zzyq7, zzyqb));
            } else if (iZzTP != 38) {
                zzyq9ZzYuT.zzk();
            } else {
                zzZ(zzyq7, zzymx, zzyqb);
            }
        }
    }

    private static void zzZ(zzYQB zzyqb, String str) {
        zzYRL zzyrl = (zzYRL) com.aspose.words.internal.zzZKW.zzZ(zzyqb, zzYRL.class);
        if (zzyrl == null || !"tb-rl".equals(str)) {
            return;
        }
        if (zzyrl.zzYvW() == null) {
            zzyrl.zzS(new zzYC3());
        }
        zzyrl.zzYvW().zzQ(136, 3);
    }

    private static void zzZ(zzYQ7 zzyq7, zzYMX zzymx, String str) {
        if (com.aspose.words.internal.zzZKN.zzW(str, "%", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            zzyq7.zzv("style:paragraph-properties", "fo:text-indent", "percent");
        }
        zzymx.zzwb(zzYSF.zzFX(str));
    }

    private static String zzZ(zzYQ7 zzyq7, String str, String str2) {
        if (!"justify".equals(str)) {
            zzyq7.zzv("style:paragraph-properties", "fo:text-align-last", str2);
        }
        return str2;
    }

    private static void zzZ(zzYMX zzymx, String str) {
        if ("normal".equals(str)) {
            return;
        }
        zzymx.zzw6(zzYOU.zzDw(str));
        zzymx.setLineSpacingRule(com.aspose.words.internal.zzZKN.zzW(str, "%", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8) ? 2 : 1);
    }

    private static void zzZ(zzYQ7 zzyq7, zzYMX zzymx, String str, String str2) {
        if (str == null) {
            return;
        }
        if ("start".equals(str)) {
            zzyq7.zzv("style:paragraph-properties", "fo:text-align", str);
        }
        zzymx.setAlignment(zzYS3.zzEX(str));
        if ("justify".equals(str2)) {
            zzymx.zzQ(PointerIconCompat.TYPE_GRAB, 4);
        }
    }

    private static void zzZ(zzZZF zzzzf, zzYQB zzyqb, zzYMX zzymx, int i, int i2) {
        boolean z = i == 2 && i2 == 2;
        if (zzyqb.getName() != null && !"Standard".equals(zzyqb.getName())) {
            if (z) {
                zzymx.zzQ(1470, Boolean.TRUE);
            }
        } else if (i < 2 || i2 < 2) {
            zzzzf.zzYUT = false;
        } else if (z) {
            zzzzf.zzYUT = true;
        }
    }

    private static void zzZ(zzZ9Q zzz9q, zzYQB zzyqb, boolean z) {
        zzYTH zzythZzYvh = zzyqb.zzYvh();
        zzYQL zzyqlZzYvg = zzyqb.zzYvg();
        zzYR2 zzyr2ZzYvQ = zzyqb.zzYvQ();
        zzZ(zzz9q, 1350, 1200, zzythZzYvh.zzYy8(), zzyqlZzYvg.zzYvl(), zzyr2ZzYvQ.zzYvB().zzYsU(), zzyr2ZzYvQ.zzYvB().zzYsS(), z);
        zzZ(zzz9q, 1370, 1220, zzythZzYvh.zzYy7(), zzyqlZzYvg.zzYvk(), zzyr2ZzYvQ.zzYvB().zzYsT(), zzyr2ZzYvQ.zzYvB().zzYsR(), z);
        zzZ(zzz9q, 1360, 1160, zzythZzYvh.zzYy6(), zzyqlZzYvg.zzYvj(), zzyr2ZzYvQ.zzYvC().zzYvO(), zzyr2ZzYvQ.zzYvC().zzYvM(), z);
        zzZ(zzz9q, 1380, EditingLanguage.BRETON, zzythZzYvh.zzYy5(), zzyqlZzYvg.zzYvi(), zzyr2ZzYvQ.zzYvC().zzYvN(), zzyr2ZzYvQ.zzYvC().zzYvL(), z);
    }

    private static void zzZ(zzZ9Q zzz9q, int i, int i2, zzYTJ zzytj, double d, double d2, boolean z, boolean z2) {
        if (zzytj != null || !com.aspose.words.internal.zzAN.zzZD(d)) {
            zzz9q.setParaAttr(i, zzX(zzytj, d, z2));
        }
        if (z) {
            zzz9q.setParaAttr(i2, Integer.valueOf(com.aspose.words.internal.zzSA.zzu(d2)));
        }
    }

    private static TabStop zzZ(zzYQ7 zzyq7, double d) {
        TabStop tabStop = new TabStop();
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String str = "";
        String str2 = "";
        String str3 = str2;
        while (zzyq9ZzYuT.zzi()) {
            String value = zzyq9ZzYuT.getValue();
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 39:
                    str3 = value;
                    break;
                case 40:
                    str = value;
                    break;
                case 41:
                    str2 = value;
                    break;
                case 42:
                    tabStop.zzkt(com.aspose.words.internal.zzSA.zzu(d) + zzYSF.zzFX(value));
                    break;
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                    zzyq7.zzZ(256, false, "style:tab-stop");
                    break;
                default:
                    zzyq7.zzYi("style:tab-stop", zzyq9ZzYuT.getLocalName());
                    break;
            }
        }
        if (com.aspose.words.internal.zzZYD.zzXk(str) || com.aspose.words.internal.zzZYD.zzXk(str2)) {
            tabStop.setLeader(zzYS3.zzYm(str, str2));
        }
        tabStop.setAlignment(zzYS3.zzEY(str3));
        return tabStop;
    }

    private static void zzZ(zzYQ7 zzyq7, zzYMX zzymx, zzYQB zzyqb) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 48:
                    zzymx.zzqG(zzyq9ZzYuT.zzb());
                    break;
                case 49:
                    zzymx.zzQ(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, Integer.valueOf(zzYSF.zzFX(zzyq9ZzYuT.getValue())));
                    break;
                case 50:
                    if ("word".equals(zzyq9ZzYuT.getValue())) {
                        zzyqb.zzSj(true);
                    } else {
                        zzyqb.zzrP(zzyq9ZzYuT.zzb());
                    }
                    break;
                case 51:
                    zzyq7.zzZ(256, false, "style:drop-cap");
                    break;
                default:
                    zzyq7.zzYi("style:drop-cap", zzyq9ZzYuT.getLocalName());
                    break;
            }
        }
    }

    private static double zzZ(zzYPO zzypo, zzYQB zzyqb) {
        zzYQB zzyqb2;
        return (zzyqb.zzYvQ().zzYvC().zzYvM() || com.aspose.words.internal.zzZKN.zzU3(zzyqb.zzYu5()) || (zzyqb2 = (zzYQB) zzypo.zzYh(zzyqb.zzYu5(), zzyqb.getFamily())) == null) ? zzyqb.zzYvQ().zzYvC().zzYvO() : zzZ(zzypo, zzyqb2);
    }
}
