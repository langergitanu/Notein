package com.aspose.words;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* JADX INFO: loaded from: classes6.dex */
final class zzL5 {
    private static com.aspose.words.internal.zzZNR zzZnt = new com.aspose.words.internal.zzZNR("[^ \\t\\r\\n\\f]+", 0);
    private static com.aspose.words.internal.zzZYJ zzZns = zzZTP();
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("horizontal-tb", "vertical-rl", "vertical-lr", "middle", "top", "bottom", "body", "blockquote", "div");

    private static double zzK(zzL4 zzl4) {
        int valueType = zzl4.getValueType();
        if (valueType == 3) {
            return ((zzNH) zzl4).zzZVM();
        }
        if (valueType != 4) {
            return -1.7976931348623157E308d;
        }
        zzOI zzoi = (zzOI) zzl4;
        switch (zzoi.getUnit()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return zzoi.zzZVW();
            default:
                return -1.7976931348623157E308d;
        }
    }

    public static double zzL(zzL4 zzl4) {
        double dZzK = zzK(zzl4);
        return com.aspose.words.internal.zzAN.zzZC(dZzK) ? zzZ(zzl4, (zzPS) null, 12.0d) : dZzK;
    }

    public static int zzM(zzPS zzps) {
        zzPT zzptZzSx;
        if (zzps == null || (zzptZzSx = zzps.zzSx(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)) == null) {
            return 0;
        }
        if (zzptZzSx.zzZWj().zzP(zzL4.zzZni)) {
            return 1;
        }
        return zzptZzSx.zzZWj().zzP(zzL4.zzZnh) ? 2 : 0;
    }

    public static zzL4 zzM6(int i) {
        return i != 0 ? i != 1 ? i != 3 ? zzL4.zzZmT : zzL4.zzZmX : zzL4.zzZmW : zzL4.zzZmY;
    }

    public static String zzM7(int i) {
        return (i == 1 || i == 3 || i == 5) ? "tb-rl" : "lr-tb";
    }

    public static String zzM8(int i) {
        return zzZns.zzSY(i);
    }

    public static String zzM9(int i) {
        return i != 1 ? i != 2 ? "lr-tb" : "tb-lr" : "tb-rl";
    }

    public static String zzMa(int i) {
        return i != 1 ? i != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    public static int zzMb(int i) {
        return (i == 1 || i == 2) ? 1 : 0;
    }

    public static int zzMc(int i) {
        return (i == 1 || i == 5) ? 1 : 0;
    }

    public static int zzMd(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public static zzMP zzMe(int i) {
        return new zzMP(new zzL2(i == 2 ? zzL4.zzZmG : zzL4.zzZmH));
    }

    public static int zzQ(Paragraph paragraph) {
        if (paragraph.getParentSection() != null) {
            return zzMc(paragraph.getParentSection().getPageSetup().zzYLa());
        }
        return 0;
    }

    public static int zzS5(String str) {
        int iZzTP = zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(str));
        if (iZzTP == 3) {
            return 1;
        }
        if (iZzTP != 4) {
            return iZzTP != 5 ? 2 : 3;
        }
        return 0;
    }

    public static int zzS6(String str) {
        return com.aspose.words.internal.zzZYD.zzi(str, "tb-rl") ? 5 : 0;
    }

    public static int zzS7(String str) {
        int iZzTP = zzUR.zzTP(str);
        int i = 1;
        if (iZzTP != 1) {
            i = 2;
            if (iZzTP != 2) {
                return 0;
            }
        }
        return i;
    }

    public static String[] zzS8(String str) {
        com.aspose.words.internal.zzZNS zzznsZzUW = zzZnt.zzUW(str);
        String[] strArr = new String[zzznsZzUW.getCount()];
        for (int i = 0; i < zzznsZzUW.getCount(); i++) {
            strArr[i] = zzznsZzUW.zzQw(i).getValue();
        }
        return strArr;
    }

    public static int zzU(zzMP zzmp) {
        if (zzmp.getCount() != 1 || zzmp.zzZVx().getValueType() != 0) {
            return StyleIdentifier.NIL;
        }
        int iZzXo = zzZns.zzXo(((zzOT) zzmp.zzZVx()).getValue());
        return !com.aspose.words.internal.zzZYJ.zzWm(iZzXo) ? iZzXo : StyleIdentifier.NIL;
    }

    public static double zzV(zzMP zzmp) {
        if (zzmp.zzP(zzL4.zzZlA)) {
            return 1.5d;
        }
        if (zzmp.zzP(zzL4.zzZlB)) {
            return 3.0d;
        }
        if (zzmp.zzP(zzL4.zzZlz)) {
            return 4.5d;
        }
        double dZzW = zzW(zzmp);
        if (com.aspose.words.internal.zzAN.zzZC(dZzW)) {
            return 0.0d;
        }
        return dZzW;
    }

    public static int zzW(zzPS zzps, boolean z) {
        zzPT zzptZzSx;
        return (z || zzps == null || (zzptZzSx = zzps.zzSx("unicode-bidi")) == null || !zzptZzSx.zzZWj().zzP(zzL4.zzZmJ)) ? 0 : 1;
    }

    private static boolean zzYW(double d) {
        return (com.aspose.words.internal.zzAN.zzZC(d) || com.aspose.words.internal.zzAN.zzZD(d)) ? false : true;
    }

    public static double zzZ(zzL4 zzl4, zzPS zzps, double d) {
        double doubleValue;
        if (zzl4.getValueType() != 4) {
            return -1.7976931348623157E308d;
        }
        zzOI zzoi = (zzOI) zzl4;
        int unit = zzoi.getUnit();
        if (unit == 7) {
            doubleValue = zzoi.getDoubleValue();
        } else {
            if (unit != 8) {
                if (unit != 9) {
                    return -1.7976931348623157E308d;
                }
                return zzL(zzps) * zzoi.getDoubleValue();
            }
            d *= zzoi.getDoubleValue();
            doubleValue = 0.5d;
        }
        return d * doubleValue;
    }

    private static com.aspose.words.internal.zzZYJ zzZTP() {
        com.aspose.words.internal.zzZYJ zzzyj = new com.aspose.words.internal.zzZYJ(false);
        zzzyj.zzP(0, zzL4.zzZnb.getValue());
        zzzyj.zzP(1, zzL4.zzZkK.getValue());
        zzzyj.zzP(2, zzL4.zzZkJ.getValue());
        zzzyj.zzP(3, zzL4.zzZkI.getValue());
        zzzyj.zzP(4, zzL4.zzZkH.getValue());
        zzzyj.zzP(5, zzL4.zzZkG.getValue());
        zzzyj.zzP(6, zzL4.zzZkF.getValue());
        zzzyj.zzP(7, zzL4.zzZkE.getValue());
        zzzyj.zzP(8, zzL4.zzZkD.getValue());
        zzzyj.zzP(9, zzL4.zzZkC.getValue());
        zzzyj.zzP(88, zzL4.zzZkB.getValue());
        zzzyj.zzP(85, zzL4.zzZkA.getValue());
        zzzyj.zzP(87, zzL4.zzZkz.getValue());
        return zzzyj;
    }

    public static double zzW(zzMP zzmp) {
        if (zzmp.getCount() == 1) {
            return zzL(zzmp.zzZVx());
        }
        return -1.7976931348623157E308d;
    }

    public static double zzL(zzPS zzps) {
        zzPT zzptZzSx;
        double dZzK = (zzps == null || (zzptZzSx = zzps.zzSx("font-size")) == null || zzptZzSx.zzZWj().getCount() != 1) ? -1.7976931348623157E308d : zzK(zzptZzSx.zzZWj().zzZVx());
        if (com.aspose.words.internal.zzAN.zzZC(dZzK)) {
            return 12.0d;
        }
        return dZzK;
    }

    private static boolean zzK(zzPS zzps) {
        int[] iArr = {3, 2, 0, 1};
        for (int i = 0; i < 4; i++) {
            zzRL zzrlZzZ = zzRL.zzZ(zzps, iArr[i], false);
            if (zzrlZzZ != null && zzrlZzZ.getLineStyle() != 0 && zzrlZzZ.zzZXk() > 0.0d) {
                return true;
            }
        }
        String[] strArr = {"margin-left", "margin-right", "margin-top", "margin-bottom"};
        for (int i2 = 0; i2 < 4; i2++) {
            String str = strArr[i2];
            if ("auto".equals(zzps.zzSF(str)) || zzYW(zzps.zzSH(str)) || zzYW(zzps.zzSC(str))) {
                return true;
            }
        }
        String[] strArr2 = {"border-left-color", "border-right-color", "border-top-color", "border-bottom-color"};
        for (int i3 = 0; i3 < 4; i3++) {
            if (zzps.zzSx(strArr2[i3]) != null) {
                return true;
            }
        }
        return false;
    }

    public static void zzZ(int i, zzLU zzlu) {
        if (i == 0) {
            zzlu.zzZs("page-break-before", "auto");
        } else if (i == 1) {
            zzlu.zzZs("mso-column-break-before", "always");
        } else if (i == 3) {
            zzlu.zzZs("page-break-before", "left");
        } else if (i == 4) {
            zzlu.zzZs("page-break-before", "right");
        } else {
            zzlu.zzZs("page-break-before", "always");
        }
        zzlu.zzZs("mso-break-type", "section-break");
        zzlu.zzZs("clear", "both");
    }

    public static void zzZ(PageSetup pageSetup, zzLU zzlu) {
        zzlu.zzx(pageSetup.getPageWidth(), pageSetup.getPageHeight());
        zzlu.zzU(pageSetup.getTopMargin(), pageSetup.getRightMargin(), pageSetup.getBottomMargin(), pageSetup.getLeftMargin());
    }

    public static boolean zzZ(String str, zzPS zzps, boolean z) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 6) {
            return z || zzK(zzps);
        }
        if (iZzTP != 7) {
            if (iZzTP != 8) {
                return false;
            }
            if (z && (zzps.zzSx("page") != null || zzps.zzSx("mso-element") != null)) {
                return false;
            }
        }
        return true;
    }
}
