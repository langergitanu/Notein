package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYFO {
    private static final com.aspose.words.internal.zzZHW zzUR;
    private static com.aspose.words.internal.zzZYJ zzXsG = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzXwt = new com.aspose.words.internal.zzZYJ();

    static {
        zzXsG.zzH("\\ulnone", 0);
        zzXsG.zzH("\\ul", 1);
        zzXsG.zzH("\\ulw", 2);
        zzXsG.zzH("\\uld", 4);
        zzXsG.zzH("\\uldash", 7);
        zzXsG.zzH("\\uldashd", 9);
        zzXsG.zzH("\\uldashdd", 10);
        zzXsG.zzH("\\uldb", 3);
        zzXsG.zzH("\\ulhwave", 27);
        zzXsG.zzH("\\ulldash", 39);
        zzXsG.zzH("\\ulth", 6);
        zzXsG.zzH("\\ulthd", 20);
        zzXsG.zzH("\\ulthdash", 23);
        zzXsG.zzH("\\ulthdashd", 25);
        zzXsG.zzH("\\ulthdashdd", 26);
        zzXsG.zzH("\\ulthldash", 55);
        zzXsG.zzH("\\ululdbwave", 43);
        zzXsG.zzH("\\ulwave", 11);
        zzXwt.zzH("\\chbghoriz", 20);
        zzXwt.zzH("\\chbgvert", 21);
        zzXwt.zzH("\\chbgfdiag", 22);
        zzXwt.zzH("\\chbgbdiag", 23);
        zzXwt.zzH("\\chbgcross", 24);
        zzXwt.zzH("\\chbgdcross", 25);
        zzXwt.zzH("\\chbgdkhoriz", 14);
        zzXwt.zzH("\\chbgdkvert", 15);
        zzXwt.zzH("\\chbgdkfdiag", 16);
        zzXwt.zzH("\\chbgdkbdiag", 17);
        zzXwt.zzH("\\chbgdkcross", 18);
        zzXwt.zzH("\\chbgdkdcross", 19);
        zzUR = new com.aspose.words.internal.zzZHW("\\acccircle", "\\acccomma", "\\accdot", "\\accunderdot");
    }

    public static int zzBU(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 0) {
            return 3;
        }
        if (iZzTP == 1) {
            return 2;
        }
        if (iZzTP != 2) {
            return iZzTP != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int zzCb(String str) {
        return zzXwt.zzXo(str);
    }

    public static String zzW(zzZRH zzzrh) {
        return zzzrh.zzZh5() ? com.aspose.words.internal.zzZKN.format("\\horzvert{0}", Integer.valueOf(zzzrh.zzZh2() ? 1 : 0)) : com.aspose.words.internal.zzZKN.format("\\twoinone{0}", Integer.valueOf(zzzrh.zzZh3()));
    }

    public static int zzY(String str, Object obj, boolean z) {
        int iZzXo = zzXsG.zzXo(str);
        return (iZzXo == Integer.MIN_VALUE || z) ? iZzXo : (iZzXo == 1 || (obj != null && ((Integer) obj).intValue() == iZzXo)) ? 0 : Integer.MIN_VALUE;
    }

    public static String zzoB(int i) {
        return zzXwt.zzSY(i);
    }

    public static String zzoc(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "\\accunderdot" : "\\acccircle" : "\\acccomma" : "\\accdot";
    }

    public static String zzod(int i) {
        return zzXsG.zzSY(i);
    }
}
