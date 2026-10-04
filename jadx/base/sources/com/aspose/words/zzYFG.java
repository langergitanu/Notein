package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYFG {
    private static com.aspose.words.internal.zzZYJ zzZ4N = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzZ4M = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzXsj = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzXsi = new com.aspose.words.internal.zzZYJ();

    static {
        zzZ4N.zzH("\\shpbxcolumn", 2);
        zzZ4N.zzH("\\shpbxmargin", 0);
        zzZ4N.zzH("\\shpbxpage", 1);
        zzZ4M.zzH("\\shpbymargin", 0);
        zzZ4M.zzH("\\shpbypara", 2);
        zzZ4M.zzH("\\shpbypage", 1);
        zzXsj.zzH("\\dobxcolumn", 2);
        zzXsj.zzH("\\dobxmargin", 0);
        zzXsj.zzH("\\dobxpage", 1);
        zzXsi.zzH("\\dobymargin", 0);
        zzXsi.zzH("\\dobypara", 2);
        zzXsi.zzH("\\dobypage", 1);
    }

    public static int zzC6(String str) {
        int iZzXo = zzZ4M.zzXo(str);
        return com.aspose.words.internal.zzZYI.zzWm(iZzXo) ? zzXsi.zzXo(str) : iZzXo;
    }

    public static int zzC7(String str) {
        int iZzXo = zzZ4N.zzXo(str);
        return com.aspose.words.internal.zzZYI.zzWm(iZzXo) ? zzXsj.zzXo(str) : iZzXo;
    }

    public static String zzow(int i) {
        return zzZ4M.zzO(i, "\\shpbypara");
    }

    public static String zzox(int i) {
        return zzZ4N.zzO(i, "\\shpbxcolumn");
    }
}
