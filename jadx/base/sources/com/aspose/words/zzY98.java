package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY98 {
    public static String zzAU(int i) {
        switch (i) {
            case 0:
                return "NONE";
            case 1:
                return "MAINTEXT";
            case 2:
                return "FOOTNOTES";
            case 3:
                return "ENDNOTES";
            case 4:
                return "COMMENTS";
            case 5:
                return "TEXTBOX";
            case 6:
                return "EVENPAGESHEADER";
            case 7:
                return "PRIMARYHEADER";
            case 8:
                return "EVENPAGESFOOTER";
            case 9:
                return "PRIMARYFOOTER";
            case 10:
                return "FIRSTPAGEHEADER";
            case 11:
                return "FIRSTPAGEFOOTER";
            case 12:
                return "FOOTNOTESEPARATOR";
            case 13:
                return "FOOTNOTECONTINUATIONSEPARATOR";
            case 14:
                return "FOOTNOTECONTINUATIONNOTICE";
            case 15:
                return "ENDNOTESEPARATOR";
            case 16:
                return "ENDNOTECONTINUATIONSEPARATOR";
            case 17:
                return "ENDNOTECONTINUATIONNOTICE";
            default:
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: Unknown StoryType value, please update StoryTypeEnum.ToUpperString().");
        }
    }

    public static boolean zzlj(int i) {
        return i == 2 || i == 3 || i == 4;
    }
}
