package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY02 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\uf0b7", "o", "\uf0a7");

    public static String zzH(ListLevel listLevel) {
        int numberStyle = listLevel.getNumberStyle();
        if (numberStyle == 0) {
            return "Decimal";
        }
        if (numberStyle == 1) {
            return "UpperRoman";
        }
        if (numberStyle == 2) {
            return "LowerRoman";
        }
        if (numberStyle == 3) {
            return "UpperLatin";
        }
        if (numberStyle == 4) {
            return "LowerLatin";
        }
        if (numberStyle != 23) {
            return (numberStyle == 46 || numberStyle == 48) ? "Decimal" : numberStyle != 255 ? "" : "None";
        }
        int iZzTP = zzUR.zzTP(listLevel.getNumberFormat());
        return iZzTP != 1 ? iZzTP != 2 ? "Disc" : "Square" : "Circle";
    }

    public static String zzQ(double d, String str) {
        if (d <= 0.0d) {
            d = 0.0d;
        }
        return com.aspose.words.internal.zzZKN.format("{0}{1}", com.aspose.words.internal.zzJB.zzZU(d), str);
    }

    public static String zzw(com.aspose.words.internal.zzPV zzpv) {
        return com.aspose.words.internal.zzZKN.format("#{0:x2}{1:x2}{2:x2}{3:x2}", Integer.valueOf(zzpv.zzPD()), Integer.valueOf(zzpv.zzPC()), Integer.valueOf(zzpv.zzPB()), Integer.valueOf(zzpv.zzPA()));
    }

    public static String zzyP(int i) {
        return i != 1 ? i != 2 ? (i == 3 || i == 4) ? "Justify" : "Left" : "Right" : "Center";
    }

    public static boolean zzyr(String str) {
        return com.aspose.words.internal.zzZYD.zzi(str, "disc") || com.aspose.words.internal.zzZYD.zzi(str, "circle") || com.aspose.words.internal.zzZYD.zzi(str, "square");
    }

    public static boolean zzys(String str) {
        return com.aspose.words.internal.zzZYD.zzi(str, "decimal");
    }
}
