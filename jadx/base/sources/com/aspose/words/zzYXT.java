package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYXT {
    private int zzXXA = 1;
    private int zzXXz = 1;
    private int zzZCv;

    public zzYXT(int i) {
        this.zzZCv = i;
    }

    private static String zzU(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder();
        com.aspose.words.internal.zzZNH.zzU(sb, str);
        com.aspose.words.internal.zzZNH.zzU(sb, zzYR.zzC(i, 4));
        if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
            com.aspose.words.internal.zzZNH.zzU(sb, "?mime=");
            com.aspose.words.internal.zzZNH.zzU(sb, str2);
        }
        return sb.toString();
    }

    private String zzp(int i, String str) {
        return this.zzZCv == 54 ? com.aspose.words.internal.zzJB.zz3(i) : zzU("kindle:embed:", i, str);
    }

    public final int getSaveFormat() {
        return this.zzZCv;
    }

    public final String zzHJ(String str) {
        int i = this.zzXXz;
        this.zzXXz = i + 1;
        return zzp(i, str);
    }

    public final String zzYCf() {
        int i = this.zzXXz;
        this.zzXXz = i + 1;
        return zzp(i, "");
    }

    public final String zzYCg() {
        int i = this.zzXXA;
        this.zzXXA = i + 1;
        return zzU("kindle:flow:", i, "image/svg+xml");
    }

    public final String zzYCh() {
        int i = this.zzXXA;
        this.zzXXA = i + 1;
        return zzU("kindle:flow:", i, "text/css");
    }
}
