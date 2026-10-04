package com.aspose.words;

import OooOoo.C20593OooO0Oo;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.miui.penengine.p596e.C18773h;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes6.dex */
final class zzYSC {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("text-properties", "text", "day", "month", "year", "era", "day-of-week", "hours", "am-pm", "minutes", "seconds", "week-of-year", "quarter", "map", "language", "country", "automatic-order", "format-source", "rfc-language-tag", "script", NoteMeta.PROPERTY_TITLE, "transliteration-country", "transliteration-format", "transliteration-language", "transliteration-style", "truncate-on-overflow", "volatile", "number", "scientific-number", "fraction", "apply-style-name", "condition", "base-cell-address", "decimal-places", "grouping", "min-integer-digits", "decimal-replacement", "display-factor", "embedded-text", "min-exponent-digits", "text-content");

    private static String zzFq(String str) {
        return "'" + str.replace("'", "''") + "'";
    }

    public static void zzX(zzYQ7 zzyq7, boolean z) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String localName = zzyq9ZzYuT.getLocalName();
        zzYP4 zzyp4 = new zzYP4();
        zzZ(zzyq7, zzyp4, localName);
        zzZ(zzyq7, zzyq9ZzYuT, localName, zzyp4);
        zzyq7.zzYuS().zzZ(zzyp4, zzyq7.zzYuO(), z);
    }

    public static void zzY(zzYQ7 zzyq7, boolean z) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String localName = zzyq9ZzYuT.getLocalName();
        zzYQT zzyqt = new zzYQT();
        zzZ(zzyq7, zzyqt, localName);
        zzZ(zzyq7, zzyq9ZzYuT, localName, zzyqt);
        zzyq7.zzYuS().zzZ(zzyqt, zzyq7.zzYuO(), z);
    }

    public static void zzZ(zzYQ7 zzyq7, boolean z) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        String localName = zzyq9ZzYuT.getLocalName();
        zzYSA zzysa = new zzYSA();
        zzZ(zzyq7, zzysa, localName);
        zzZ(zzyq7, zzyq9ZzYuT, localName, zzysa);
        zzyq7.zzYuS().zzZ(zzysa, zzyq7.zzYuO(), z);
    }

    private static String zzZR(com.aspose.words.internal.zzPV zzpv) {
        if (com.aspose.words.internal.zzPV.zzZ(zzpv, com.aspose.words.internal.zzPV.zzKa)) {
            return "Black";
        }
        if (com.aspose.words.internal.zzPV.zzZ(zzpv, com.aspose.words.internal.zzPV.zzJ3)) {
            return "Green";
        }
        if (com.aspose.words.internal.zzPV.zzZ(zzpv, com.aspose.words.internal.zzPV.zzI5)) {
            return "White";
        }
        if (com.aspose.words.internal.zzPV.zzZ(zzpv, com.aspose.words.internal.zzPV.zzK8)) {
            return "Blue";
        }
        if (com.aspose.words.internal.zzPV.zzZ(zzpv, com.aspose.words.internal.zzPV.zzJ0)) {
            return "Magenta";
        }
        if (com.aspose.words.internal.zzPV.zzZ(zzpv, com.aspose.words.internal.zzPV.zzI3)) {
            return "Yellow";
        }
        if (com.aspose.words.internal.zzPV.zzZ(zzpv, com.aspose.words.internal.zzPV.zzJX)) {
            return "Cyan";
        }
        if (com.aspose.words.internal.zzPV.zzZ(zzpv, com.aspose.words.internal.zzPV.zzIs)) {
            return "Red";
        }
        return null;
    }

    private static String zzu(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzyq9ZzYuT.zzj();
        String localName = zzyq9ZzYuT.getLocalName();
        int iZzb = -1;
        int iZzb2 = 0;
        int iZzb3 = 0;
        boolean zZz8 = false;
        while (zzyq9ZzYuT.zzi()) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP != 39) {
                switch (iZzTP) {
                    case 33:
                        iZzb = zzyq9ZzYuT.zzb();
                        break;
                    case 34:
                        zZz8 = zzyq9ZzYuT.zz8();
                        break;
                    case 35:
                        iZzb2 = zzyq9ZzYuT.zzb();
                        break;
                    default:
                        zzyq7.zzZ(16777216, false, localName);
                        break;
                }
            } else {
                iZzb3 = zzyq9ZzYuT.zzb();
            }
        }
        zzZ(zzyq7, localName);
        return zzYSB.zzX(iZzb2, iZzb3, iZzb, zZz8);
    }

    private static String zzv(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzyq9ZzYuT.zzj();
        String localName = zzyq9ZzYuT.getLocalName();
        int iZzb = 0;
        int iZzb2 = 0;
        boolean zZz8 = false;
        while (zzyq9ZzYuT.zzi()) {
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 33:
                    iZzb = zzyq9ZzYuT.zzb();
                    break;
                case 34:
                    zZz8 = zzyq9ZzYuT.zz8();
                    break;
                case 35:
                    iZzb2 = zzyq9ZzYuT.zzb();
                    break;
                case 36:
                case 37:
                    zzyq7.zzZ(256, false, localName);
                    break;
                default:
                    zzyq7.zzZ(16777216, false, localName);
                    break;
            }
        }
        while (zzyq9ZzYuT.zzQ(localName)) {
            if (zzUR.zzTP(zzyq9ZzYuT.getLocalName()) != 38) {
                zzyq7.zzZ(16777216, false, localName);
                zzyq9ZzYuT.zzk();
            } else {
                zzyq7.zzZ(256, true, localName);
                zzyq9ZzYuT.zzk();
            }
        }
        return zzYSB.zzK(iZzb2, iZzb, zZz8);
    }

    private static boolean zzX(zzYQ9 zzyq9) {
        return com.aspose.words.internal.zzZKN.zzX(zzyq9.zzV("textual", TelemetryEventStrings.Value.FALSE), TelemetryEventStrings.Value.TRUE, com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8);
    }

    private static boolean zzY(zzYQ9 zzyq9) {
        return com.aspose.words.internal.zzZKN.zzX(zzyq9.zzV("style", "short"), "long", com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8);
    }

    private static void zzZ(zzYQ7 zzyq7, zzYQ9 zzyq9, String str, zzYSA zzysa) {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (zzyq9.zzQ(str)) {
            switch (zzUR.zzTP(zzyq9.getLocalName())) {
                case 0:
                    com.aspose.words.internal.zzZNH.zzU(sb, zzZ(zzyq7, (zzYOY) zzysa));
                    break;
                case 1:
                    com.aspose.words.internal.zzZNH.zzU(sb, zzFq(zzyq9.readString()));
                    break;
                case 2:
                    com.aspose.words.internal.zzZNH.zzU(sb, zzZ(zzyq9, "d"));
                    break;
                case 3:
                    com.aspose.words.internal.zzZNH.zzU(sb, zzZ(zzyq9, "M"));
                    if (zzX(zzyq9)) {
                        com.aspose.words.internal.zzZNH.zzU(sb, "MM");
                    }
                    break;
                case 4:
                    com.aspose.words.internal.zzZNH.zzU(sb, zzZ(zzyq9, "yy"));
                    break;
                case 5:
                    sb.append('g');
                    break;
                case 6:
                    com.aspose.words.internal.zzZNH.zzU(sb, zzZ(zzyq9, "d") + "dd");
                    break;
                case 7:
                    com.aspose.words.internal.zzZNH.zzU(sb, zzZ(zzyq9, "H"));
                    break;
                case 8:
                    com.aspose.words.internal.zzZNH.zzU(sb, "am/pm");
                    z = true;
                    break;
                case 9:
                    com.aspose.words.internal.zzZNH.zzU(sb, zzZ(zzyq9, "m"));
                    break;
                case 10:
                    com.aspose.words.internal.zzZNH.zzU(sb, zzZ(zzyq9, "s"));
                    break;
                case 11:
                case 12:
                case 13:
                    zzyq7.zzZ(256, true, str);
                    break;
                default:
                    zzyq9.zzk();
                    break;
            }
            zzZ(zzyq7, zzyq9);
        }
        String string = sb.toString();
        if (z) {
            string = string.replace("H", C18773h.f57233c);
        }
        zzysa.setFormat(string);
    }

    private static void zzZ(zzYQ7 zzyq7, zzYQ9 zzyq9) {
        String localName = zzyq9.getLocalName();
        while (zzyq9.zzi()) {
            String localName2 = zzyq9.getLocalName();
            if ("calendar".equals(localName2) || "possessive-form".equals(localName2) || "decimal-places".equals(localName2)) {
                zzyq7.zzZ(256, false, localName);
            }
        }
    }

    private static void zzZ(zzYQ7 zzyq7, zzYSA zzysa, String str) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzyq9ZzYuT.zzj();
        String value = "";
        String value2 = "";
        while (zzyq9ZzYuT.zzi()) {
            if (!zzYQ7.zzZ(zzyq9ZzYuT, zzysa)) {
                switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                    case 14:
                        value = zzyq9ZzYuT.getValue();
                        break;
                    case 15:
                        value2 = zzyq9ZzYuT.getValue();
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        zzyq7.zzZ(256, false, str);
                        break;
                    default:
                        zzyq7.zzZ(16777216, false, str);
                        break;
                }
            }
        }
        zzZ(zzysa, value, value2);
    }

    private static void zzZ(zzYSA zzysa, String str, String str2) {
        if (com.aspose.words.internal.zzZYD.zzXk(str) || com.aspose.words.internal.zzZYD.zzXk(str2)) {
            if (zzysa.zzZYh() == null) {
                zzysa.zzZ(new zzYEF());
            }
            zzysa.zzZYh().zzQ(380, Integer.valueOf(zzYS3.zzET(com.aspose.words.internal.zzZKN.format("{0}-{1}", str, str2))));
        }
    }

    private static String zzZ(zzYQ9 zzyq9, String str) {
        return zzY(zzyq9) ? com.aspose.words.internal.zzZKN.format("{0}{0}", str) : str;
    }

    private static void zzZ(zzYQ7 zzyq7, zzYQT zzyqt, String str) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzyq9ZzYuT.zzj();
        while (zzyq9ZzYuT.zzi()) {
            if (!zzYQ7.zzZ(zzyq9ZzYuT, zzyqt)) {
                switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                    case 14:
                    case 15:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 26:
                        zzyq7.zzZ(256, false, str);
                        break;
                    case 16:
                    case 17:
                    case 25:
                    default:
                        zzyq7.zzZ(16777216, false, str);
                        break;
                }
            }
        }
    }

    private static void zzZ(zzYQ7 zzyq7, zzYQ9 zzyq9, String str, zzYQT zzyqt) {
        StringBuilder sb = new StringBuilder();
        while (zzyq9.zzQ(str)) {
            int iZzTP = zzUR.zzTP(zzyq9.getLocalName());
            if (iZzTP == 0) {
                com.aspose.words.internal.zzZNH.zzU(sb, zzZ(zzyq7, (zzYOY) zzyqt));
            } else if (iZzTP == 1) {
                com.aspose.words.internal.zzZNH.zzU(sb, zzFq(zzyq9.readString()));
            } else if (iZzTP != 13) {
                switch (iZzTP) {
                    case 27:
                        com.aspose.words.internal.zzZNH.zzU(sb, zzv(zzyq7));
                        break;
                    case 28:
                        com.aspose.words.internal.zzZNH.zzU(sb, zzu(zzyq7));
                        break;
                    case 29:
                        zzyq7.zzZ(256, true, str);
                        zzyq9.zzk();
                        break;
                    default:
                        zzyq7.zzZ(16777216, false, str);
                        zzyq9.zzk();
                        break;
                }
            } else {
                zzZ(zzyq7, (zzYSD) zzyqt);
            }
        }
        zzyqt.setFormat(sb.toString());
    }

    private static String zzZ(zzYQ7 zzyq7, zzYOY zzyoy) {
        Object objZzPk;
        zzYP0.zzY(zzyq7, zzyoy);
        if (zzyoy.zzZYh() == null || (objZzPk = zzyoy.zzZYh().zzPk(160)) == null) {
            return "";
        }
        String strZzZR = zzZR((com.aspose.words.internal.zzPV) objZzPk);
        if (strZzZR == null) {
            zzyq7.zzZ(256, true, zzyq7.zzYuT().getLocalName());
            return "";
        }
        return C20593OooO0Oo.OooO0O0("[", strZzZR, "]");
    }

    private static void zzZ(zzYQ7 zzyq7, zzYSD zzysd) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzyq9ZzYuT.zzj();
        String localName = zzyq9ZzYuT.getLocalName();
        String value = "";
        String value2 = "";
        while (zzyq9ZzYuT.zzi()) {
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 30:
                    value = zzyq9ZzYuT.getValue();
                    break;
                case 31:
                    value2 = zzyq9ZzYuT.getValue();
                    if (!com.aspose.words.internal.zzZ1.zzY(zzYSB.zzXQC, value2)) {
                        zzyq7.zzZ(256, false, localName);
                    }
                    break;
                case 32:
                    zzyq7.zzZ(256, false, localName);
                    break;
                default:
                    zzyq7.zzZ(16777216, false, localName);
                    break;
            }
        }
        zzZ(zzyq7, localName);
        if (!com.aspose.words.internal.zzZKN.zzU3(value) && !com.aspose.words.internal.zzZKN.zzU3(value2)) {
            zzysd.zzYp(value, value2);
        } else {
            zzyq7.zzZ(16777216, false, localName);
        }
    }

    private static void zzZ(zzYQ7 zzyq7, String str) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ(str)) {
            zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            zzyq7.zzZ(16777216, false, str);
            zzyq9ZzYuT.zzk();
        }
    }

    private static void zzZ(zzYQ7 zzyq7, zzYP4 zzyp4, String str) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzyq9ZzYuT.zzj();
        while (zzyq9ZzYuT.zzi()) {
            if (!zzYQ7.zzZ(zzyq9ZzYuT, zzyp4)) {
                switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                    case 14:
                    case 15:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 26:
                        zzyq7.zzZ(256, false, str);
                        break;
                    case 16:
                    case 17:
                    case 25:
                    default:
                        zzyq7.zzZ(16777216, false, str);
                        break;
                }
            }
        }
    }

    private static void zzZ(zzYQ7 zzyq7, zzYQ9 zzyq9, String str, zzYP4 zzyp4) {
        StringBuilder sb = new StringBuilder();
        while (zzyq9.zzQ(str)) {
            int iZzTP = zzUR.zzTP(zzyq9.getLocalName());
            if (iZzTP == 0) {
                com.aspose.words.internal.zzZNH.zzU(sb, zzZ(zzyq7, (zzYOY) zzyp4));
            } else if (iZzTP == 1) {
                com.aspose.words.internal.zzZNH.zzU(sb, zzFq(zzyq9.readString()));
            } else if (iZzTP == 13) {
                zzZ(zzyq7, (zzYSD) zzyp4);
            } else if (iZzTP != 40) {
                zzyq7.zzZ(16777216, false, str);
                zzyq9.zzk();
            } else {
                zzyq7.zzZ(256, true, str);
                zzyq9.zzk();
            }
        }
        zzyp4.setFormat(sb.toString());
    }
}
