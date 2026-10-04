package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY1L {
    private static final com.aspose.words.internal.zzZHW zzUR;
    private static com.aspose.words.internal.zzZYJ zzYOp = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYOo = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYOn = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYOm = new com.aspose.words.internal.zzZYJ();

    static {
        zzYOn.zzH("none", 0);
        zzYOn.zzH("full-page", 1);
        zzYOn.zzH("best-fit", 2);
        zzYOn.zzH("text-fit", 3);
        zzYOm.zzH("letter", 1);
        zzYOm.zzH("e-mail", 2);
        zzYOo.zzH("CompressPunctuation", 1);
        zzYOo.zzH("CompressPunctuationAndJapaneseKana", 2);
        zzYOo.zzH("DontCompress", 0);
        zzYOp.zzH("tracked-changes", 0);
        zzYOp.zzH("comments", 1);
        zzYOp.zzH("forms", 2);
        zzYOp.zzH("read-only", 3);
        zzYOp.zzH("none", -1);
        zzUR = new com.aspose.words.internal.zzZHW("clean", "normal", "print", "outline", "master-pages", "web");
    }

    public static String zzi0(int i) {
        return zzYOm.zzO(i, "");
    }

    public static String zzi1(int i) {
        return zzYOn.zzO(i, "none");
    }

    public static String zzi2(int i) {
        return i != 3 ? i != 4 ? i != 5 ? "print" : "web" : "normal" : "master-pages";
    }

    public static String zzi3(int i) {
        return i != 1 ? "" : "clean";
    }

    public static String zzi4(int i) {
        return zzYOo.zzO(i, "DontCompress");
    }

    public static String zzi5(int i) {
        return zzYOp.zzO(i, "none");
    }

    public static int zzyM(String str) {
        return zzYOm.zzG(str, 0);
    }

    public static int zzyN(String str) {
        return zzYOn.zzG(str, 0);
    }

    public static int zzyO(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 1) {
            return 4;
        }
        if (iZzTP == 3 || iZzTP == 4) {
            return 3;
        }
        return iZzTP != 5 ? 1 : 5;
    }

    public static int zzyP(String str) {
        return zzUR.zzTP(str) != 0 ? 0 : 1;
    }

    public static int zzyQ(String str) {
        return zzYOo.zzG(str, 0);
    }

    public static int zzyR(String str) {
        return zzYOp.zzG(str, -1);
    }
}
