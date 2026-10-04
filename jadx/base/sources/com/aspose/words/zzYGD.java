package com.aspose.words;

import com.microsoft.identity.common.java.eststelemetry.PublicApiId;

/* JADX INFO: loaded from: classes6.dex */
final class zzYGD {
    private static final com.aspose.words.internal.zzZHW zzUR;
    private static com.aspose.words.internal.zzZYJ zzYOd = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzXuz = new com.aspose.words.internal.zzZYJ();

    static {
        zzYOd.zzH("\\brdrs", 1);
        zzYOd.zzH("\\brdrth", 2);
        zzYOd.zzH("\\brdrdb", 3);
        zzYOd.zzH("\\brdrdot", 6);
        zzYOd.zzH("\\brdrdash", 7);
        zzYOd.zzH("\\brdrhair", 5);
        zzYOd.zzH("\\brdrinset", 27);
        zzYOd.zzH("\\brdrdashsm", 22);
        zzYOd.zzH("\\brdrdashd", 8);
        zzYOd.zzH("\\brdrdashdd", 9);
        zzYOd.zzH("\\brdroutset", 26);
        zzYOd.zzH("\\brdrtriple", 10);
        zzYOd.zzH("\\brdrtnthsg", 11);
        zzYOd.zzH("\\brdrthtnsg", 12);
        zzYOd.zzH("\\brdrtnthtnsg", 13);
        zzYOd.zzH("\\brdrtnthmg", 14);
        zzYOd.zzH("\\brdrthtnmg", 15);
        zzYOd.zzH("\\brdrtnthtnmg", 16);
        zzYOd.zzH("\\brdrtnthlg", 17);
        zzYOd.zzH("\\brdrthtnlg", 18);
        zzYOd.zzH("\\brdrtnthtnlg", 19);
        zzYOd.zzH("\\brdrwavy", 20);
        zzYOd.zzH("\\brdrwavydb", 21);
        zzYOd.zzH("\\brdrdashdotstr", 23);
        zzYOd.zzH("\\brdremboss", 24);
        zzYOd.zzH("\\brdrengrave", 25);
        zzXuz.zzH("3", 3);
        zzXuz.zzH("5", 2);
        zzXuz.zzH("64", 1);
        zzXuz.zzH("11", 0);
        zzXuz.zzH(PublicApiId.MULTIPLE_ACCOUNT_PCA_ACQUIRE_TOKEN_SILENT_WITH_PARAMETERS, 4);
        zzUR = new com.aspose.words.internal.zzZHW("\\header", "\\headerl", "\\footer", "\\footerl", "\\headerr", "\\headerf", "\\footerr", "\\footerf");
    }

    public static int zzCf(String str) {
        return zzXuz.zzXo(str);
    }

    public static int zzCg(String str) {
        return zzYOd.zzXo(str);
    }

    public static String zzZn(int i, boolean z) {
        return i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? z ? "\\headerr" : "\\header" : "\\footerf" : "\\headerf" : z ? "\\footerr" : "\\footer" : "\\footerl" : "\\headerl";
    }

    public static String zzoE(int i) {
        return zzXuz.zzSY(i);
    }

    public static String zzoF(int i) {
        return zzYOd.zzSY(i);
    }
}
