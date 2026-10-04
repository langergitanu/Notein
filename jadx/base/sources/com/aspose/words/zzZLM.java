package com.aspose.words;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzZLM {
    private static final com.aspose.words.internal.zzZHW zzUR;
    private static HashMap<Integer, String> zzYuP = new HashMap<>();
    private static HashMap<String, Integer> zzYuO = new HashMap<>();

    static {
        zzt(1, "AIUEO");
        zzt(2, "ALPHABETIC");
        zzt(3, "alphabetic");
        zzt(4, "Arabic");
        zzt(5, "ARABICABJAD");
        zzt(6, "ARABICALPHA");
        zzt(7, "ArabicDash");
        zzt(8, "BAHTTEXT");
        zzt(9, "CardText");
        zzt(10, "CHINESENUM1");
        zzt(11, "CHINESENUM2");
        zzt(12, "CHINESENUM3");
        zzt(13, "CHOSUNG");
        zzt(14, "CIRCLENUM");
        zzt(15, "DBCHAR");
        zzt(16, "DBNUM1");
        zzt(17, "DBNUM2");
        zzt(18, "DBNUM3");
        zzt(19, "DBNUM4");
        zzt(20, "DollarText");
        zzt(21, "GANADA");
        zzt(22, "GB1");
        zzt(23, "GB2");
        zzt(24, "GB3");
        zzt(25, "GB4");
        zzt(26, "HEBREW1");
        zzt(27, "HEBREW2");
        zzt(28, "Hex");
        zzt(29, "HINDIARABIC");
        zzt(30, "HINDICARDTEXT");
        zzt(31, "HINDILETTER1");
        zzt(32, "HINDILETTER2");
        zzt(33, "IROHA");
        zzt(34, "KANJINUM1");
        zzt(35, "KANJINUM2");
        zzt(36, "KANJINUM3");
        zzt(37, "Ordinal");
        zzt(38, "OrdText");
        zzt(39, "Roman");
        zzt(40, "roman");
        zzt(41, "SBCHAR");
        zzt(42, "THAIARABIC");
        zzt(43, "THAICARDTEXT");
        zzt(44, "THAILETTER");
        zzt(45, "VIETCARDTEXT");
        zzt(46, "ZODIAC1");
        zzt(47, "ZODIAC2");
        zzt(48, "ZODIAC3");
        zzt(49, "Caps");
        zzt(50, "FirstCap");
        zzt(51, "Lower");
        zzt(52, "Upper");
        zzt(53, "CHARFORMAT");
        zzt(54, "MERGEFORMAT");
        zzt(55, "MERGEFORMATINET");
        zzUR = new com.aspose.words.internal.zzZHW("alphabetic", "roman");
    }

    public static int zzAo(int i) {
        if (i == 15) {
            return 5;
        }
        switch (i) {
            case 49:
                return 3;
            case 50:
                return 4;
            case 51:
                return 2;
            case 52:
                return 1;
            default:
                return 0;
        }
    }

    public static int zzAp(int i) {
        switch (i) {
        }
        return 0;
    }

    public static boolean zzAq(int i) {
        return zzAp(i) != 255;
    }

    public static String zzAr(int i) {
        return (String) com.aspose.words.internal.zzQW.zzZ(zzYuP, Integer.valueOf(i));
    }

    public static int zzLd(String str) {
        int iZzTP = zzUR.zzTP(str.toLowerCase());
        return iZzTP != 0 ? iZzTP != 1 ? ((Integer) com.aspose.words.internal.zzQW.zzZ(zzYuO, str.toUpperCase(), 0)).intValue() : Character.isLowerCase(str.charAt(0)) ? 40 : 39 : Character.isLowerCase(str.charAt(0)) ? 3 : 2;
    }

    private static void zzt(int i, String str) {
        com.aspose.words.internal.zzZQF.zzY(zzYuP, Integer.valueOf(i), str);
        if (zzYuO.containsKey(str.toUpperCase())) {
            return;
        }
        com.aspose.words.internal.zzZQF.zzY(zzYuO, str.toUpperCase(), Integer.valueOf(i));
    }
}
