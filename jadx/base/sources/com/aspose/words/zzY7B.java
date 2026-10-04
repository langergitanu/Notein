package com.aspose.words;

import com.aspose.words.ref.RefBoolean;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: loaded from: classes6.dex */
final class zzY7B {
    private static com.aspose.words.internal.zzZNR zzX7k = new com.aspose.words.internal.zzZNR("(matrix|translate|scale|rotate|skewX|skewY)\\(([^\\(\\)]+)\\)", 0);
    private static com.aspose.words.internal.zzZNR zzX7j = new com.aspose.words.internal.zzZNR("^(((-?(\\.\\d+))|(-?\\d+(\\.\\d+)?))((e-|e\\+|e)\\d+)?)\\s*(em|ex|px|in|cm|mm|pt|pc|%)?$", 0);
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("width", "min-width", "height", "min-height", "%", "px", BackupFile.EXTENSION_NOTEIN_FILE, "cm", "mm", TranslateLanguage.PORTUGUESE, "pc", "em", "", "matrix", "translate", "scale", "rotate", "skewX", "skewY", "ex");

    public static com.aspose.words.internal.zzZQ4 zz0(com.aspose.words.internal.zzG zzg) throws Exception {
        com.aspose.words.internal.zzH zzh = new com.aspose.words.internal.zzH();
        com.aspose.words.internal.zzG zzg2 = new com.aspose.words.internal.zzG();
        zzg2.zzX((com.aspose.words.internal.zzZL) zzg);
        return zzh.zzZ((com.aspose.words.internal.zzZL) zzg2);
    }

    public static boolean zzF(zzY7X zzy7x) {
        String strZzSF = zzy7x.zzZWe().zzSF("white-space");
        int i = com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8;
        if (com.aspose.words.internal.zzZKN.zzX(strZzSF, "pre", i) || com.aspose.words.internal.zzZKN.zzX(strZzSF, "pre-wrap", i)) {
            return true;
        }
        zzY7X zzy7xZzY1C = zzy7x.zzY1C();
        if (zzy7xZzY1C == null) {
            return false;
        }
        return com.aspose.words.internal.zzZKN.zzX(zzy7xZzY1C.getAttributeValue("space", ""), "preserve", i);
    }

    public static void zzG(zzY7X zzy7x) {
        String attributeValue = zzy7x.getAttributeValue("viewBox", null);
        if (attributeValue == null) {
            return;
        }
        float[] fArrZzZZ = zzY80.zzZZ(attributeValue, true);
        if (fArrZzZZ.length < 4) {
            return;
        }
        zzy7x.zzZ(new zzY7A(fArrZzZZ[0], fArrZzZZ[1], fArrZzZZ[2], fArrZzZZ[3]));
    }

    public static void zzK(zzY7J zzy7j, zzY7X zzy7x) {
        zzy7x.setWidth(zzZ(zzy7j, zzy7x, "width", 0.0d));
        zzy7x.zzW6(zzZ(zzy7j, zzy7x, "min-width", 0.0d));
        zzy7x.setHeight(zzZ(zzy7j, zzy7x, "height", 0.0d));
        zzy7x.zzW5(zzZ(zzy7j, zzy7x, "min-height", 0.0d));
        zzy7x.zzW4(Math.max(zzy7x.zzY1B(), zzy7x.getWidth()));
        zzy7x.zzW3(Math.max(zzy7x.zzY1A(), zzy7x.getHeight()));
    }

    public static float zzX(zzY7X zzy7x, String str) {
        double dZzSD = zzy7x.zzZWe().zzSD("opacity");
        boolean zZzZC = com.aspose.words.internal.zzAN.zzZC(dZzSD);
        if (!zZzZC) {
            dZzSD = com.aspose.words.internal.zzAN.zzR(dZzSD, 0.0d, 1.0d);
        }
        double dZzSD2 = zzy7x.zzZWe().zzSD(str);
        boolean zZzZC2 = com.aspose.words.internal.zzAN.zzZC(dZzSD2);
        if (!zZzZC2) {
            dZzSD2 = com.aspose.words.internal.zzAN.zzR(dZzSD2, 0.0d, 1.0d);
        }
        if (!zZzZC && !zZzZC2) {
            return Math.min((float) dZzSD2, (float) dZzSD);
        }
        if (!zZzZC2) {
            return (float) dZzSD2;
        }
        if (zZzZC) {
            return Float.NaN;
        }
        return (float) dZzSD;
    }

    private static com.aspose.words.internal.zzP9 zzY(String str, zzY7J zzy7j) {
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        for (com.aspose.words.internal.zzZNT zzznt : zzX7k.zzUW(str)) {
            String strOooO00o = OooO0O0.OooO00o(zzznt, 1);
            float[] fArrZzZZ = zzY80.zzZZ(OooO0O0.OooO00o(zzznt, 2), false);
            switch (zzUR.zzTP(strOooO00o)) {
                case 13:
                    zzp9.zzZ(new com.aspose.words.internal.zzP9(fArrZzZZ[0], fArrZzZZ[1], fArrZzZZ[2], fArrZzZZ[3], (float) com.aspose.words.internal.zzSA.pixelToPoint(fArrZzZZ[4]), (float) com.aspose.words.internal.zzSA.pixelToPoint(fArrZzZZ[5])), 0);
                    break;
                case 14:
                    zzp9.zzY((float) ConvertUtil.pixelToPoint(fArrZzZZ[0]), (float) ConvertUtil.pixelToPoint(fArrZzZZ.length > 1 ? fArrZzZZ[1] : 0.0d), 0);
                    break;
                case 15:
                    float f = fArrZzZZ[0];
                    zzp9.zzZ(f, fArrZzZZ.length > 1 ? fArrZzZZ[1] : f, 0);
                    break;
                case 16:
                    if (fArrZzZZ.length == 1) {
                        zzp9.zzX(fArrZzZZ[0], 0);
                    } else if (fArrZzZZ.length == 3) {
                        float fPixelToPoint = (float) ConvertUtil.pixelToPoint(fArrZzZZ[1]);
                        float fPixelToPoint2 = (float) ConvertUtil.pixelToPoint(fArrZzZZ[2]);
                        zzp9.zzY(fPixelToPoint, fPixelToPoint2, 0);
                        zzp9.zzX(fArrZzZZ[0], 0);
                        zzp9.zzY(-fPixelToPoint, -fPixelToPoint2, 0);
                    }
                    break;
                case 17:
                    zzp9.zzZ(new com.aspose.words.internal.zzP9(1.0f, 0.0f, (float) Math.tan(com.aspose.words.internal.zzAN.zzZL(fArrZzZZ[0])), 1.0f, 0.0f, 0.0f), 0);
                    break;
                case 18:
                    zzp9.zzZ(new com.aspose.words.internal.zzP9(1.0f, (float) Math.tan(com.aspose.words.internal.zzAN.zzZL(fArrZzZZ[0])), 0.0f, 1.0f, 0.0f, 0.0f), 0);
                    break;
                default:
                    zzy7j.zzT(16777216, com.aspose.words.internal.zzZKN.format("'{0}' is unexpected matrix command and will be ignored", strOooO00o));
                    break;
            }
        }
        return zzp9;
    }

    public static com.aspose.words.internal.zzP9 zzZ(zzY7J zzy7j, zzY7X zzy7x, com.aspose.words.internal.zzP9 zzp9) {
        return zzZ(zzy7j, zzy7x, "transform", zzp9);
    }

    public static com.aspose.words.internal.zzP9 zzZ(zzY7J zzy7j, zzY7X zzy7x, String str, com.aspose.words.internal.zzP9 zzp9) {
        String strZzKM = zzy7x.zzKM(str);
        return com.aspose.words.internal.zzZYD.zzXk(strZzKM) ? zzY(strZzKM, zzy7j) : zzp9;
    }

    public static double zzZ(zzY7J zzy7j, zzY7X zzy7x, String str, double d) {
        zzPT zzptZzSx = zzy7x.zzZWe().zzSx(str);
        if (zzptZzSx != null) {
            if (zzy7j == null) {
                return zzZ(zzy7x, str, d);
            }
            if (zzptZzSx.zzZWj().zzZVx().getValueType() != 5) {
                double dZzSH = zzy7x.zzZWe().zzSH(str);
                if (!com.aspose.words.internal.zzAN.zzZC(dZzSH)) {
                    return dZzSH;
                }
            } else {
                double dZzSC = zzy7x.zzZWe().zzSC(str);
                if (!com.aspose.words.internal.zzAN.zzZC(dZzSC)) {
                    int iZzTP = zzUR.zzTP(str);
                    if (iZzTP == 0 || iZzTP == 1) {
                        return zzy7j.zzW1(dZzSC);
                    }
                    if (iZzTP == 2 || iZzTP == 3) {
                        return zzy7j.zzW2(dZzSC);
                    }
                }
            }
        }
        return d;
    }

    public static String zzZ(zzY7X zzy7x, String str, String str2) {
        String strZzKM = zzy7x.zzKM(str);
        return com.aspose.words.internal.zzZYD.zzXk(strZzKM) ? strZzKM : str2;
    }

    public static float zzZ(zzY7J zzy7j, zzY7X zzy7x, String str, float f) {
        com.aspose.words.internal.zzZKN.zzU3(str);
        String strZzKM = zzy7x.zzKM(str);
        return com.aspose.words.internal.zzZYD.zzXk(strZzKM) ? zzZ(strZzKM, zzy7j, zzy7x) : f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static float zzZ(String str, zzY7J zzy7j, float f, RefBoolean refBoolean) {
        refBoolean.set(false);
        if (str != null) {
            com.aspose.words.internal.zzZNT zzzntZzUX = zzX7j.zzUX(str);
            if (zzzntZzUX.zzhL()) {
                double dZzZs = com.aspose.words.internal.zzJB.zzZs(zzzntZzUX.zzhJ().zzQx(1).getValue());
                String strOooO00o = OooO0O0.OooO00o(zzzntZzUX, 9);
                if (Double.isNaN(dZzZs)) {
                    dZzZs = 0.0d;
                }
                switch (zzUR.zzTP(strOooO00o)) {
                    case 4:
                        refBoolean.set(true);
                        dZzZs /= 100.0d;
                        return (float) dZzZs;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        if (zzy7j != null) {
                            zzy7j.zzT(16777216, "Unexpected units specified, '%' or no units are expected.");
                        }
                        break;
                    case 12:
                        if (com.aspose.words.internal.zzAN.zzZD(dZzZs) || com.aspose.words.internal.zzAN.zzL(dZzZs, 1.0d) || (dZzZs > 0.0d && dZzZs < 1.0d)) {
                            refBoolean.set(false);
                            return (float) dZzZs;
                        }
                        break;
                }
            }
        }
        return f;
    }

    private static double zzZ(zzY7X zzy7x, String str, double d) {
        double dZzSH = zzy7x.zzZWe().zzSH(str);
        return !com.aspose.words.internal.zzAN.zzZC(dZzSH) ? dZzSH : d;
    }

    private static float zzZ(String str, zzY7J zzy7j, zzY7X zzy7x) {
        double dZzSH;
        if (str == null) {
            return 0.0f;
        }
        com.aspose.words.internal.zzZNT zzzntZzUX = zzX7j.zzUX(str);
        if (!zzzntZzUX.zzhL()) {
            return 0.0f;
        }
        double dZzZs = com.aspose.words.internal.zzJB.zzZs(zzzntZzUX.zzhJ().zzQx(1).getValue());
        String strOooO00o = OooO0O0.OooO00o(zzzntZzUX, 9);
        if (Double.isNaN(dZzZs)) {
            dZzZs = 0.0d;
        }
        int iZzTP = zzUR.zzTP(strOooO00o);
        if (iZzTP != 4) {
            if (iZzTP != 19) {
                switch (iZzTP) {
                    case 6:
                        dZzSH = 72.0d;
                        dZzZs *= dZzSH;
                        break;
                    case 7:
                        dZzZs *= 10.0d;
                    case 8:
                        dZzZs *= 2.834645669291339d;
                        break;
                    case 9:
                        break;
                    case 10:
                        dZzSH = 12.0d;
                        dZzZs *= dZzSH;
                        break;
                    case 11:
                        if (zzy7j != null) {
                            dZzSH = zzy7x.zzZWe().zzSH("font-size");
                            dZzZs *= dZzSH;
                        }
                        break;
                    default:
                        dZzZs = com.aspose.words.internal.zzSA.pixelToPoint(dZzZs);
                        break;
                }
            } else if (zzy7j != null) {
                zzy7j.zzT(65536, "Relative length units are not supported upon reading SVG.");
            }
        } else if (zzy7j != null) {
            zzy7j.zzT(65536, "Percentage length is not supported upon reading SVG.");
        }
        return (float) dZzZs;
    }
}
