package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYFQ {
    private static com.aspose.words.internal.zzZYJ zzXsH = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4N = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4M = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4L = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ6C = new com.aspose.words.internal.zzZYJ();

    static {
        zzXsH.zzH("\\trqc", 1);
        zzXsH.zzH("\\trql", 0);
        zzXsH.zzH("\\trqr", 2);
        zzZ4N.zzH("\\tphcol", 2);
        zzZ4N.zzH("\\tphmrg", 0);
        zzZ4N.zzH("\\tphpg", 1);
        zzZ4M.zzH("\\tpvmrg", 0);
        zzZ4M.zzH("\\tpvpara", 2);
        zzZ4M.zzH("\\tpvpg", 1);
        zzZ4L.zzH("\\tposxc", 2);
        zzZ4L.zzH("\\tposxi", 4);
        zzZ4L.zzH("\\tposxl", 1);
        zzZ4L.zzH("\\tposxo", 5);
        zzZ4L.zzH("\\tposxr", 3);
        zzZ6C.zzH("\\tposyb", 3);
        zzZ6C.zzH("\\tposyc", 2);
        zzZ6C.zzH("\\tposyin", 4);
        zzZ6C.zzH("\\tposyout", 5);
        zzZ6C.zzH("\\tposyt", 1);
    }

    public static int zzBV(String str) {
        return zzXsH.zzXo(str);
    }

    public static int zzC4(String str) {
        return zzZ6C.zzXo(str);
    }

    public static int zzC5(String str) {
        return zzZ4L.zzXo(str);
    }

    public static int zzC6(String str) {
        return zzZ4M.zzXo(str);
    }

    public static int zzC7(String str) {
        return zzZ4N.zzXo(str);
    }

    public static String zzoe(int i) {
        return zzXsH.zzSY(i);
    }

    public static String zzou(int i) {
        return zzZ6C.zzSY(i);
    }

    public static String zzov(int i) {
        return zzZ4L.zzSY(i);
    }

    public static String zzow(int i) {
        return zzZ4M.zzO(i, "\\tpvmrg");
    }

    public static String zzox(int i) {
        return zzZ4N.zzO(i, "\\tphcol");
    }
}
