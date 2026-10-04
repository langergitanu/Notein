package com.aspose.words;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzYP0 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("hyphenate", "text-transform", "color", "text-outline", "text-line-through-type", "text-line-through-style", "text-position", "language", "country", "language-asian", "country-asian", "language-complex", "country-complex", "background-color", "letter-spacing", "display", "text-blinking", "text-scale", "text-shadow", "text-underline-width", "text-underline-style", "text-underline-type", "text-underline-mode", "text-underline-color", "text-rotation-scale", "text-rotation-angle", "use-window-font-color", "letter-kerning", "font-size-asian", "hyphenation-push-char-count", "hyphenation-remain-char-count", "script", "font-charset", "font-charset-asian", "font-charset-complex", "font-family-asian", "font-family-complex", "font-family-generic", "font-family-generic-asian", "font-family-generic-complex", "font-pitch", "font-pitch-asian", "font-pitch-complex", "font-size-rel", "font-size-rel-asian", "font-size-rel-complex", "font-style-name", "font-style-name-asian", "font-style-name-complex", "rfc-language-tag", "rfc-language-tag-asian", "rfc-language-tag-complex", "script-asian", "script-complex", "script-type", "text-combine", "text-combine-end-char", "text-combine-start-char", "text-emphasize", "text-line-through-color", "text-line-through-mode", "text-line-through-text", "text-line-through-text-style", "text-line-through-width", "text-overline-color", "text-overline-mode", "text-overline-style", "text-overline-type", "text-overline-width", "condition", "font-variant", "font-name", "font-name-complex", "font-name-asian", "font-family", "font-size", "font-size-complex", "font-weight", "font-weight-asian", "font-weight-complex", "font-style", "font-style-asian", "font-style-complex", "font-relief");

    private static String zzO(zzYQ7 zzyq7, String str) {
        if (!"bold".equals(str) && !"thick".equals(str)) {
            zzyq7.zzv("style:text-properties", "text-underline-width", str);
        }
        return str;
    }

    public static zzYEF zzX(zzYQ7 zzyq7, zzYOY zzyoy) {
        String str;
        String str2;
        String str3;
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzYEF zzyef = new zzYEF();
        String strZzV = zzyq9ZzYuT.zzV("font-size", "10pt");
        int iZzFR = zzYSF.zzFR(com.aspose.words.internal.zzZKN.zzW(strZzV, "%", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8) ? "10pt" : strZzV);
        zzyq9ZzYuT.zzj();
        zzZRH zzzrhZzZ = null;
        String value = "";
        String str4 = value;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        String strZzO = str9;
        String str10 = strZzO;
        String str11 = str10;
        while (zzyq9ZzYuT.zzi()) {
            String str12 = value;
            value = zzyq9ZzYuT.getValue();
            if (!zzZ(zzyq7, zzyoy, zzyef, value)) {
                str2 = strZzO;
                str3 = str10;
                str = str8;
                switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                    case 0:
                        zzZ(zzyq7.getDocument().zzZpV(), zzyoy, value);
                        break;
                    case 1:
                        zzY(zzyq7, value, zzyef);
                        break;
                    case 2:
                        zzyef.zzQ(160, zzYOU.zzDu(value));
                        break;
                    case 3:
                        if (TelemetryEventStrings.Value.TRUE.equals(value)) {
                            zzyef.zzQ(90, zzZU.zzZF6);
                        }
                        break;
                    case 4:
                        zzX(value, zzyef);
                        break;
                    case 5:
                        zzZ(zzyq7, value, zzyef);
                        break;
                    case 6:
                        zzZ(value, zzyef, iZzFR);
                        break;
                    case 7:
                        str4 = value;
                        break;
                    case 8:
                        str5 = value;
                        break;
                    case 9:
                        str6 = value;
                        break;
                    case 10:
                        str7 = value;
                        break;
                    case 11:
                        str8 = value;
                        value = str12;
                        strZzO = str2;
                        str10 = str3;
                        break;
                    case 12:
                        str9 = value;
                        break;
                    case 13:
                        zzyef.zzQ(StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6, zzYOU.zzZ(value, (Shading) zzyef.get(StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6)));
                        break;
                    case 14:
                        zzyef.zzQ(150, Integer.valueOf("normal".equals(value) ? 0 : zzYSF.zzFX(value)));
                        break;
                    case 15:
                        if ("none".equals(value)) {
                            zzyef.zzQ(130, zzZU.zzZF6);
                        }
                        if (TelemetryEventStrings.Value.TRUE.equals(value)) {
                            zzyef.zzQ(130, zzZU.zzZF7);
                        }
                        break;
                    case 16:
                        if (TelemetryEventStrings.Value.TRUE.equals(value)) {
                            zzyef.zzQ(StyleIdentifier.GRID_TABLE_3_ACCENT_5, 2);
                        }
                        break;
                    case 17:
                        zzyef.zzQ(StyleIdentifier.GRID_TABLE_4_ACCENT_2, Integer.valueOf(com.aspose.words.internal.zzJB.zzZv(value.replace("%", ""))));
                        break;
                    case 18:
                        if (!"none".equals(value)) {
                            zzyef.zzQ(100, zzZU.zzZF6);
                        }
                        break;
                    case 19:
                        strZzO = zzO(zzyq7, value);
                        value = str12;
                        str10 = str3;
                        str8 = str;
                        break;
                    case 20:
                        str10 = value;
                        value = str12;
                        strZzO = str2;
                        str8 = str;
                        break;
                    case 21:
                        str11 = value;
                        break;
                    case 22:
                        strZzO = str2;
                        str10 = str3;
                        str8 = str;
                        break;
                    case 23:
                        if (!"font-color".equals(value)) {
                            zzyef.zzQ(450, zzYOU.zzDu(value));
                        }
                        break;
                    case 24:
                        zzzrhZzZ = zzZ(zzyq7, zzzrhZzZ);
                        break;
                    case 25:
                        zzzrhZzZ = zzZ(zzyq7, zzyoy, value, zzzrhZzZ);
                        break;
                    case 26:
                        zzyoy.zzS0(TelemetryEventStrings.Value.TRUE.equals(value));
                        break;
                    case 27:
                        if (TelemetryEventStrings.Value.TRUE.equals(value)) {
                            zzyef.zzQ(220, 3);
                        }
                        break;
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                        zzyq7.zzZ(256, false, "style:text-properties");
                        break;
                    default:
                        zzyq7.zzYi("style:text-properties", zzyq9ZzYuT.getLocalName());
                        break;
                }
            } else {
                str = str8;
                str2 = strZzO;
                str3 = str10;
            }
            value = str12;
            strZzO = str2;
            str10 = str3;
            str8 = str;
        }
        String str13 = value;
        String str14 = str8;
        String str15 = strZzO;
        String str16 = str10;
        if (zzzrhZzZ != null) {
            zzyef.zzQ(780, zzzrhZzZ);
        }
        zzZ(zzyef, 380, str4, str5);
        zzZ(zzyef, 390, str6, str7);
        zzZ(zzyef, StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2, str14, str9);
        zzZ(zzyef, str16, str15, str13, str11);
        return zzyef;
    }

    public static void zzY(zzYQ7 zzyq7, zzYOY zzyoy) {
        zzYEF zzyefZzX = zzX(zzyq7, zzyoy);
        if (zzyefZzX.getCount() > 0) {
            if (zzyoy.zzZYh() != null) {
                zzyoy.zzZYh().zzY(zzyefZzX);
            }
            zzyoy.zzZ(zzyefZzX);
        }
    }

    private static void zzZ(zzYEF zzyef, int i, String str, String str2) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
                zzyef.zzQ(i, Integer.valueOf(zzYS3.zzET(com.aspose.words.internal.zzZKN.format("{0}-{1}", str, str2))));
            } else {
                zzyef.zzQ(i, Integer.valueOf(zzYS3.zzET(str)));
            }
        }
    }

    private static zzZRH zzZR(zzYQ7 zzyq7) {
        zzZRH zzzrh = new zzZRH();
        zzzrh.zzDN(zzyq7.zzZh1());
        zzyq7.zzDN(zzyq7.zzZh1() + 1);
        return zzzrh;
    }

    private static boolean zzry(int i) {
        if (i < 45 || i >= 180) {
            return i >= -315 && i < -180;
        }
        return true;
    }

    private static void zzZ(zzYEF zzyef, String str, String str2, String str3, String str4) {
        if (com.aspose.words.internal.zzZYD.zzXk(str) || "skip-white-space".equals(str3) || "thick".equals(str2)) {
            zzyef.zzQ(140, Integer.valueOf(zzYS3.zzS(str, str2, str3, str4)));
        }
    }

    private static void zzY(zzYQ7 zzyq7, String str, zzYEF zzyef) {
        if ("uppercase".equals(str)) {
            zzyef.zzQ(120, zzZU.zzZF6);
        } else if ("none".equals(str) || "capitalize".equals(str)) {
            zzyq7.zzv("style:text-properties", "fo:text-transform", zzyq7.zzYuT().getValue());
        }
    }

    private static zzZRH zzZ(zzYQ7 zzyq7, zzYOY zzyoy, String str, zzZRH zzzrh) {
        if (zzry(com.aspose.words.internal.zzJB.parseInt(str) % StyleIdentifier.LIST_TABLE_4_ACCENT_5)) {
            if (zzzrh == null) {
                zzzrh = zzZR(zzyq7);
            }
            zzzrh.zzW7(true);
        }
        if (zzzrh == null) {
            zzyoy.setTextOrientation(zzYS3.zzEW(zzyq7.zzYuT().getValue()));
        }
        return zzzrh;
    }

    private static zzZRH zzZ(zzYQ7 zzyq7, zzZRH zzzrh) {
        if ("line-height".equals(zzyq7.zzYuT().getValue())) {
            if (zzzrh == null) {
                zzzrh = zzZR(zzyq7);
            }
            zzzrh.zzW5(true);
        }
        return zzzrh;
    }

    private static boolean zzZ(zzYQ7 zzyq7, zzYOY zzyoy, zzYEF zzyef, String str) {
        switch (zzUR.zzTP(zzyq7.zzYuT().getLocalName())) {
            case 70:
                if (!"small-caps".equals(str)) {
                    return true;
                }
                zzyef.zzQ(110, zzZU.zzZF6);
                return true;
            case 71:
                String str2 = (String) com.aspose.words.internal.zzQW.zzZ((Map<String, TValue>) zzyq7.zzYuA(), str);
                if (!com.aspose.words.internal.zzZYD.zzXk(str2)) {
                    return true;
                }
                zzyef.setNameAscii(str2);
                zzyef.setNameOther(zzyef.getNameAscii());
                return true;
            case 72:
                String str3 = (String) com.aspose.words.internal.zzQW.zzZ((Map<String, TValue>) zzyq7.zzYuA(), str);
                if (!com.aspose.words.internal.zzZYD.zzXk(str3)) {
                    return true;
                }
                zzyef.setNameBi(str3);
                return true;
            case 73:
                String str4 = (String) com.aspose.words.internal.zzQW.zzZ((Map<String, TValue>) zzyq7.zzYuA(), str);
                if (!com.aspose.words.internal.zzZYD.zzXk(str4)) {
                    return true;
                }
                zzyef.setNameFarEast(str4);
                return true;
            case 74:
                String strZzS = com.aspose.words.internal.zzZKN.zzS(str, '\'');
                if (!com.aspose.words.internal.zzZYD.zzXk(strZzS)) {
                    return true;
                }
                zzyef.setNameAscii(strZzS);
                zzyef.setNameOther(zzyef.getNameAscii());
                return true;
            case 75:
                zzYSF.zzZ(str, zzyoy, zzyef, 190);
                return true;
            case 76:
                zzYSF.zzZ(str, zzyoy, zzyef, StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4);
                return true;
            case 77:
                zzyef.zzQ(60, zzYOU.zzM(zzyq7, str));
                return true;
            case 78:
                zzyq7.zzZ(256, false, "style:text-properties");
                return true;
            case 79:
                zzyef.zzQ(250, zzYOU.zzM(zzyq7, str));
                return true;
            case 80:
                if ("oblique".equals(str)) {
                    zzyq7.zzv("style:text-properties", "fo:font-style", str);
                }
                zzyef.zzQ(70, zzYOU.zzDv(str));
                return true;
            case 81:
                zzyq7.zzZ(256, false, "style:text-properties");
                return true;
            case 82:
                zzyef.zzQ(StyleIdentifier.SUBTLE_EMPHASIS, zzYOU.zzDv(str));
                return true;
            case 83:
                if ("engraved".equals(str)) {
                    zzyef.zzQ(180, zzZU.zzZF6);
                    return true;
                }
                if (!"embossed".equals(str)) {
                    return true;
                }
                zzyef.zzQ(170, zzZU.zzZF6);
                return true;
            default:
                return false;
        }
    }

    private static void zzX(String str, zzYEF zzyef) {
        if ("double".equals(str)) {
            zzyef.zzQ(300, zzZU.zzZF6);
        }
        if ("single".equals(str)) {
            zzyef.zzQ(80, zzZU.zzZF6);
        }
    }

    private static void zzZ(String str, zzYEF zzyef, int i) {
        if (com.aspose.words.internal.zzZYD.zzXk(zzYOU.zzDn(str))) {
            zzyef.zzQ(210, Integer.valueOf(zzYS3.zzEV(str)));
        }
        zzyef.zzQ(200, Integer.valueOf(zzYOU.zzZ9(str, i)));
    }

    private static void zzZ(zzYQ7 zzyq7, String str, zzYEF zzyef) {
        if ("solid".equals(str)) {
            zzyef.zzQ(80, zzZU.zzZF6);
        } else if ("none".equals(str)) {
            zzyef.zzQ(80, zzZU.zzZF7);
        } else {
            zzyq7.zzv("style:text-properties", "style:text-line-through-style", zzyq7.zzYuT().getValue());
        }
    }

    private static void zzZ(zzZZF zzzzf, zzYOY zzyoy, String str) {
        boolean zEquals = TelemetryEventStrings.Value.TRUE.equals(str);
        if ("paragraph".equals(zzyoy.getFamily()) && zzyoy.getName() == null) {
            zzzzf.zzYW3.setAutoHyphenation(zEquals);
        }
        if (zzyoy.zzZYj().zzPk(1410) == null) {
            zzyoy.zzZYj().zzQ(1410, Boolean.valueOf(!zEquals));
        }
    }
}
