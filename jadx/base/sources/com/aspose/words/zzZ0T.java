package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ0T {
    private int zzBx;
    private int zzY1u;
    private String zzZi;

    public zzZ0T(String str) {
        this.zzZi = com.aspose.words.internal.zzZYD.zzXk(str) ? str : "";
    }

    private boolean zzuM(int i) {
        return this.zzZi.charAt(i) == ' ';
    }

    public final boolean moveNext() {
        int i = this.zzBx + this.zzY1u;
        this.zzBx = i;
        this.zzY1u = 0;
        if (i >= this.zzZi.length()) {
            return false;
        }
        boolean zZzuM = zzuM(this.zzBx);
        this.zzY1u = 1;
        for (int i2 = this.zzBx + 1; i2 < this.zzZi.length(); i2++) {
            boolean zZzuM2 = zzuM(i2);
            if (zZzuM2 && !zZzuM && i2 < this.zzZi.length() - 1 && !zzuM(i2 + 1)) {
                zZzuM2 = false;
            }
            if (zZzuM2 != zZzuM) {
                break;
            }
            this.zzY1u++;
        }
        return true;
    }

    public final boolean zzYFN() {
        return this.zzBx < this.zzZi.length() && this.zzZi.length() > 0 && zzuM(this.zzBx);
    }

    public final String zzZ3P() {
        if (this.zzY1u == 0) {
            return null;
        }
        if (!zzYFN()) {
            String str = this.zzZi;
            int i = this.zzBx;
            return str.substring(i, this.zzY1u + i);
        }
        int i2 = this.zzBx;
        boolean z = i2 > 0 && i2 + this.zzY1u < this.zzZi.length();
        int i3 = this.zzY1u;
        if (i3 == 1) {
            return z ? " " : "&#xa0;";
        }
        if (i3 == 2) {
            return z ? "&#xa0; " : "&#xa0;&#xa0;";
        }
        StringBuilder sb = new StringBuilder(i3 * 6);
        for (int i4 = 0; i4 < this.zzY1u - 1; i4++) {
            com.aspose.words.internal.zzZNH.zzU(sb, "&#xa0;");
        }
        com.aspose.words.internal.zzZNH.zzU(sb, z ? " " : "&#xa0;");
        return sb.toString();
    }
}
