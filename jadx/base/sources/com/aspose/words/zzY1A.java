package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY1A {
    private static com.aspose.words.internal.zzZYJ zzYNy;
    private static com.aspose.words.internal.zzZYJ zzWV9 = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYNz = new com.aspose.words.internal.zzZYJ();

    static {
        com.aspose.words.internal.zzZYJ zzzyj = new com.aspose.words.internal.zzZYJ();
        zzYNy = zzzyj;
        zzzyj.zzH("SingleLevel", 0);
        zzYNy.zzH("Multilevel", 1);
        zzYNy.zzH("HybridMultilevel", 2);
        zzYNz.zzH("Tab", 0);
        zzYNz.zzH("Space", 1);
        zzYNz.zzH("Nothing", 2);
        zzWV9.zzH("left", 0);
        zzWV9.zzH("center", 1);
        zzWV9.zzH("right", 2);
    }

    public static String zzhT(int i) {
        return zzYNy.zzO(i, "");
    }

    public static String zzhU(int i) {
        return zzYNz.zzO(i, "");
    }

    public static String zzhV(int i) {
        return zzWV9.zzO(i, "");
    }

    public static int zzyF(String str) {
        return zzYNy.zzG(str, 2);
    }

    public static int zzyG(String str) {
        return zzYNz.zzG(str, 0);
    }

    public static int zzyH(String str) {
        return zzWV9.zzG(str, 0);
    }
}
