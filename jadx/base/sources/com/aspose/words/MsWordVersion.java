package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class MsWordVersion {
    public static final int WORD_2000 = 0;
    public static final int WORD_2002 = 1;
    public static final int WORD_2003 = 2;
    public static final int WORD_2007 = 3;
    public static final int WORD_2010 = 4;
    public static final int WORD_2013 = 5;
    public static final int WORD_2016 = 6;
    public static final int WORD_2019 = 7;
    public static final int length = 8;

    private MsWordVersion() {
    }

    public static int fromName(String str) {
        if ("WORD_2000".equals(str)) {
            return 0;
        }
        if ("WORD_2002".equals(str)) {
            return 1;
        }
        if ("WORD_2003".equals(str)) {
            return 2;
        }
        if ("WORD_2007".equals(str)) {
            return 3;
        }
        if ("WORD_2010".equals(str)) {
            return 4;
        }
        if ("WORD_2013".equals(str)) {
            return 5;
        }
        if ("WORD_2016".equals(str)) {
            return 6;
        }
        if ("WORD_2019".equals(str)) {
            return 7;
        }
        throw new IllegalArgumentException("Unknown MsWordVersion name.");
    }

    public static String getName(int i) {
        switch (i) {
            case 0:
                return "WORD_2000";
            case 1:
                return "WORD_2002";
            case 2:
                return "WORD_2003";
            case 3:
                return "WORD_2007";
            case 4:
                return "WORD_2010";
            case 5:
                return "WORD_2013";
            case 6:
                return "WORD_2016";
            case 7:
                return "WORD_2019";
            default:
                return "Unknown MsWordVersion value.";
        }
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7};
    }

    public static String toString(int i) {
        switch (i) {
            case 0:
                return "Word2000";
            case 1:
                return "Word2002";
            case 2:
                return "Word2003";
            case 3:
                return "Word2007";
            case 4:
                return "Word2010";
            case 5:
                return "Word2013";
            case 6:
                return "Word2016";
            case 7:
                return "Word2019";
            default:
                return "Unknown MsWordVersion value.";
        }
    }
}
