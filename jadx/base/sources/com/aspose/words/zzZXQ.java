package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes6.dex */
final class zzZXQ {
    private static final com.aspose.words.internal.zzZHW zzUR;
    private static com.aspose.words.internal.zzZYJ zzYOp = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYOo = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYOn = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYOm = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYOl = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYOk = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYOj = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYOi = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYOh = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYOg = new com.aspose.words.internal.zzZYJ();

    static {
        zzYOn.zzH("none", 0);
        zzYOn.zzH("fullPage", 1);
        zzYOn.zzH("bestFit", 2);
        zzYOn.zzH("textFit", 3);
        zzYOm.zzH("letter", 1);
        zzYOm.zzH("eMail", 2);
        zzYOo.zzH("compressPunctuation", 1);
        zzYOo.zzH("compressPunctuationAndJapaneseKana", 2);
        zzYOo.zzH("doNotCompress", 0);
        zzYOp.zzH("trackedChanges", 0);
        zzYOp.zzH("comments", 1);
        zzYOp.zzH("forms", 2);
        zzYOp.zzH("readOnly", 3);
        zzYOp.zzH("none", -1);
        zzYOl.zzH("W3C XHTML+CSS1", 1);
        zzYOl.zzH("W3C HTML4+CSS1", 2);
        zzYOl.zzH("W3C XHTML+CSS2", 3);
        zzYOl.zzH("W3C HTML4+CSS2", 4);
        zzYOk.zzH("basedOn", 4);
        zzYOk.zzH("font", 3);
        zzYOk.zzH("name", 0);
        zzYOk.zzH("priority", 1);
        zzYOk.zzH(C18437z2.f56754h, 5);
        zzYOk.zzH("default", 2);
        zzYOj.zzH("after", 1);
        zzYOj.zzH("before", 0);
        zzYOj.zzH("repeat", 2);
        zzYOi.zzH("+-", 1);
        zzYOi.zzH("-+", 2);
        zzYOi.zzH("--", 0);
        zzYOh.zzH("", 0);
        zzYOh.zzH("administrators", 1);
        zzYOh.zzH("contributors", 2);
        zzYOh.zzH("current", 3);
        zzYOh.zzH("editors", 4);
        zzYOh.zzH("everyone", 5);
        zzYOh.zzH("none", 6);
        zzYOh.zzH("owners", 7);
        zzYOg.zzH("next", 0);
        zzYOg.zzH("prev", 1);
        zzYOg.zzH("", 2);
        zzUR = new com.aspose.words.internal.zzZHW("clean", "normal", "print", "outline", "masterPages", "web");
    }

    public static String zzFg(int i) {
        return zzYOg.zzO(i, "");
    }

    public static String zzFh(int i) {
        return zzYOh.zzO(i, "");
    }

    public static String zzFi(int i) {
        return zzYOi.zzO(i, "");
    }

    public static String zzFj(int i) {
        return zzYOj.zzO(i, "");
    }

    public static String zzFk(int i) {
        return zzYOl.zzO(i, "");
    }

    public static String zzFl(int i) {
        return zzYOm.zzO(i, "");
    }

    public static String zzFm(int i) {
        return zzYOn.zzO(i, "none");
    }

    public static String zzFn(int i) {
        return zzYOk.zzO(i, "default");
    }

    public static String zzFo(int i) {
        return i != 3 ? i != 4 ? i != 5 ? "" : "web" : "normal" : "masterPages";
    }

    public static String zzFp(int i) {
        return i != 1 ? "" : "clean";
    }

    public static String zzFq(int i) {
        return zzYOo.zzO(i, "DontCompress");
    }

    public static String zzFr(int i) {
        return zzYOp.zzO(i, "none");
    }

    public static int zzNA(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 1) {
            return 4;
        }
        if (iZzTP == 3 || iZzTP == 4) {
            return 3;
        }
        return iZzTP != 5 ? 1 : 5;
    }

    public static int zzNB(String str) {
        return zzUR.zzTP(str) != 0 ? 0 : 1;
    }

    public static int zzNC(String str) {
        return zzYOo.zzG(str, 0);
    }

    public static int zzND(String str) {
        return zzYOp.zzG(str, -1);
    }

    public static int zzNt(String str) {
        return zzYOg.zzG(str, 2);
    }

    public static int zzNu(String str) {
        return zzYOh.zzG(str, 0);
    }

    public static int zzNv(String str) {
        return zzYOi.zzG(str, 0);
    }

    public static int zzNw(String str) {
        return zzYOj.zzG(str, 0);
    }

    public static int zzNx(String str) {
        return zzYOl.zzG(str, 0);
    }

    public static int zzNy(String str) {
        return zzYOm.zzG(str, 0);
    }

    public static int zzNz(String str) {
        return zzYOn.zzG(str, 0);
    }

    public static int zzY(String str, zzYO3 zzyo3) {
        if (Character.isDigit(str.charAt(0))) {
            return zzY8T.zzkN(com.aspose.words.internal.zzJB.zzZv(str));
        }
        zzyo3.zzYrc();
        return zzYOk.zzG(str, 2);
    }
}
