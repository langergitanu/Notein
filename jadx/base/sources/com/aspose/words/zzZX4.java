package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZX4 {
    private static final com.aspose.words.internal.zzZHW zzUR;
    private static com.aspose.words.internal.zzZYJ zzYNy;
    private static com.aspose.words.internal.zzZYJ zzYNz = new com.aspose.words.internal.zzZYJ();

    static {
        com.aspose.words.internal.zzZYJ zzzyj = new com.aspose.words.internal.zzZYJ();
        zzYNy = zzzyj;
        zzzyj.zzH("singleLevel", 0);
        zzYNy.zzH("multilevel", 1);
        zzYNy.zzH("hybridMultilevel", 2);
        zzYNz.zzH("tab", 0);
        zzYNz.zzH("space", 1);
        zzYNz.zzH("nothing", 2);
        zzUR = new com.aspose.words.internal.zzZHW("left", "start", "center", "right", "end");
    }

    public static String zz1(int i, boolean z) {
        return i != 0 ? i != 1 ? i != 2 ? "" : z ? "end" : "right" : "center" : z ? "start" : "left";
    }

    public static String zzEE(int i) {
        return zzYNy.zzO(i, "");
    }

    public static String zzEF(int i) {
        return zzYNz.zzO(i, "");
    }

    public static int zzMN(String str) {
        return zzYNy.zzG(str, 2);
    }

    public static int zzMO(String str) {
        return zzYNz.zzG(str, 0);
    }

    public static int zzW(String str, zzYO3 zzyo3) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 1) {
            zzyo3.zzYrc();
            return 0;
        }
        if (iZzTP == 2) {
            return 1;
        }
        if (iZzTP != 3) {
            if (iZzTP != 4) {
                return 0;
            }
            zzyo3.zzYrc();
        }
        return 2;
    }
}
