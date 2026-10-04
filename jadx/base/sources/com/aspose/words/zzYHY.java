package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYHY {
    private static com.aspose.words.internal.zzZYJ zzXww = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzXwv = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzXwu = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzXwt = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzXws = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzXwr = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzXwq = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzXwp = new com.aspose.words.internal.zzZYJ();

    static {
        zzXww.zzH("\\clvertalt", 0);
        zzXww.zzH("\\clvertalc", 1);
        zzXww.zzH("\\clvertalb", 2);
        zzXwv.zzH("\\tsvertalt", 0);
        zzXwv.zzH("\\tsvertalc", 1);
        zzXwv.zzH("\\tsvertalb", 2);
        zzXwu.zzH("\\cltxlrtb", 0);
        zzXwu.zzH("\\cltxbtlr", 3);
        zzXwu.zzH("\\cltxtbrl", 1);
        zzXwu.zzH("\\cltxlrtbv", 4);
        zzXwu.zzH("\\cltxtbrlv", 5);
        zzXwt.zzH("\\clbghoriz", 20);
        zzXwt.zzH("\\clbgvert", 21);
        zzXwt.zzH("\\clbgfdiag", 22);
        zzXwt.zzH("\\clbgbdiag", 23);
        zzXwt.zzH("\\clbgcross", 24);
        zzXwt.zzH("\\clbgdcross", 25);
        zzXwt.zzH("\\clbgdkhor", 14);
        zzXwt.zzH("\\clbgdkvert", 15);
        zzXwt.zzH("\\clbgdkfdiag", 16);
        zzXwt.zzH("\\clbgdkbdiag", 17);
        zzXwt.zzH("\\clbgdkcross", 18);
        zzXwt.zzH("\\clbgdkdcross", 19);
        zzXws.zzH("\\tsbghoriz", 20);
        zzXws.zzH("\\tsbgvert", 21);
        zzXws.zzH("\\tsbgfdiag", 22);
        zzXws.zzH("\\tsbgbdiag", 23);
        zzXws.zzH("\\tsbgcross", 24);
        zzXws.zzH("\\tsbgdcross", 25);
        zzXws.zzH("\\tsbgdkhor", 14);
        zzXws.zzH("\\tsbgdkvert", 15);
        zzXws.zzH("\\tsbgdkfdiag", 16);
        zzXws.zzH("\\tsbgdkbdiag", 17);
        zzXws.zzH("\\tsbgdkcross", 18);
        zzXws.zzH("\\tsbgdkdcross", 19);
        zzXwr.zzH("\\tscbandhorzodd", 5);
        zzXwr.zzH("\\tscbandvertodd", 6);
        zzXwr.zzH("\\tscbandhorzeven", 7);
        zzXwr.zzH("\\tscbandverteven", 8);
        zzXwr.zzH("\\tscfirstcol", 2);
        zzXwr.zzH("\\tscfirstrow", 1);
        zzXwr.zzH("\\tsclastcol", 4);
        zzXwr.zzH("\\tsclastrow", 3);
        zzXwr.zzH("\\tscnecell", 10);
        zzXwr.zzH("\\tscnwcell", 9);
        zzXwr.zzH("\\tscsecell", 12);
        zzXwr.zzH("\\tscswcell", 11);
        zzXwr.zzH("", 0);
        zzXwq.zzH("\\clbrdrl", 3120);
        zzXwq.zzH("\\clbrdrr", 3140);
        zzXwq.zzH("\\clbrdrt", 3110);
        zzXwq.zzH("\\clbrdrb", 3130);
        zzXwq.zzH("\\cldgll", 3160);
        zzXwq.zzH("\\cldglu", 3150);
        zzXwp.zzH("\\tsbrdrl", 3120);
        zzXwp.zzH("\\tsbrdrr", 3140);
        zzXwp.zzH("\\tsbrdrt", 3110);
        zzXwp.zzH("\\tsbrdrb", 3130);
        zzXwp.zzH("\\tsbrdrdgr", 3160);
        zzXwp.zzH("\\tsbrdrdgl", 3150);
        zzXwp.zzH("\\tsbrdrh", 3200);
        zzXwp.zzH("\\tsbrdrv", 3210);
    }

    public static int zz4(String str, boolean z) {
        return (z ? zzXwv : zzXww).zzXo(str);
    }

    public static int zzCy(String str) {
        return zzXwt.zzXo(str);
    }

    public static int zzCz(String str) {
        return zzXwu.zzXo(str);
    }

    public static String zzZo(int i, boolean z) {
        return (z ? zzXwp : zzXwq).zzSY(i);
    }

    public static String zzZp(int i, boolean z) {
        return (z ? zzXws : zzXwt).zzSY(i);
    }

    public static String zzZq(int i, boolean z) {
        return (z ? zzXwv : zzXww).zzSY(i);
    }

    public static String zzp3(int i) {
        return zzXwr.zzO(i, "");
    }

    public static String zzp4(int i) {
        return zzXwu.zzSY(i);
    }
}
