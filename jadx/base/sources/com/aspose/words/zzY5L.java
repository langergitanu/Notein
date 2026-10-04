package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY5L {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("accent1", "accent2", "accent3", "accent4", "accent5", "accent6", "dk1", "dk2", "folHlink", "followedHyperlink", "hlink", "hyperlink", "lt1", "light1", "lt2", "light2", "tx1", "text1", "text2", "tx2", "bg1", "background1", "bg2", "background2");

    public static String toString(int i) {
        switch (i) {
            case -1:
                return "";
            case 0:
                return "dk1";
            case 1:
                return "lt1";
            case 2:
                return "dk2";
            case 3:
                return "lt2";
            case 4:
                return "accent1";
            case 5:
                return "accent2";
            case 6:
                return "accent3";
            case 7:
                return "accent4";
            case 8:
                return "accent5";
            case 9:
                return "accent6";
            case 10:
                return "hlink";
            case 11:
                return "folHlink";
            case 12:
                return "tx1";
            case 13:
                return "tx2";
            case 14:
                return "bg1";
            case 15:
                return "bg2";
            default:
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: color");
        }
    }

    public static int zzAg(String str) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return -1;
        }
        switch (zzUR.zzTP(str)) {
            case 0:
                return 4;
            case 1:
                return 5;
            case 2:
                return 6;
            case 3:
                return 7;
            case 4:
                return 8;
            case 5:
                return 9;
            case 6:
            default:
                return 0;
            case 7:
                return 2;
            case 8:
            case 9:
                return 11;
            case 10:
            case 11:
                return 10;
            case 12:
            case 13:
                return 1;
            case 14:
            case 15:
                return 3;
            case 16:
            case 17:
                return 12;
            case 18:
            case 19:
                return 13;
            case 20:
            case 21:
                return 14;
            case 22:
            case 23:
                return 15;
        }
    }

    public static String zzjD(int i) {
        switch (i) {
            case 0:
                return "dark1";
            case 1:
                return "light1";
            case 2:
                return "dark2";
            case 3:
                return "light2";
            case 4:
                return "accent1";
            case 5:
                return "accent2";
            case 6:
                return "accent3";
            case 7:
                return "accent4";
            case 8:
                return "accent5";
            case 9:
                return "accent6";
            case 10:
                return "hyperlink";
            case 11:
                return "followedHyperlink";
            case 12:
                return "text1";
            case 13:
                return "text2";
            case 14:
                return "background1";
            case 15:
                return "background2";
            default:
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: color");
        }
    }
}
