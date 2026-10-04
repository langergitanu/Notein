package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYYJ {
    private int zzEc;
    private String zzXYm;
    private String zzXYn;
    private int zzZEj;

    public zzYYJ(int i, String str, String str2, int i2) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        com.aspose.words.internal.zzZYD.zzXk(str2);
        this.zzEc = i;
        this.zzXYn = str;
        this.zzXYm = str2;
        this.zzZEj = i2;
    }

    public final int zzKh() {
        return this.zzEc;
    }

    public final void zzX(com.aspose.words.internal.zzXE zzxe) {
        int iZzY = zzxe.zzY((byte) 60, this.zzZEj);
        int iZzY2 = zzxe.zzY((byte) 62, this.zzZEj);
        if (iZzY2 < 0 || iZzY2 >= iZzY) {
            return;
        }
        this.zzZEj = iZzY2 + 1;
    }

    public final boolean zzY(com.aspose.words.internal.zzXE zzxe) {
        int i = this.zzZEj;
        return i >= 0 && i <= zzxe.getCount();
    }

    public final String zzYCW() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("href=\"#"), this.zzXYm, "\"");
    }

    public final String zzYCX() {
        return this.zzXYn;
    }

    public final void zzZ(com.aspose.words.internal.zzXE zzxe, com.aspose.words.internal.zzZO0 zzzo0) {
        if (zzY(zzxe)) {
            zzxe.zzZ(this.zzZEj, zzzo0.getBytes("<a id=\"" + this.zzXYm + "\"></a>"));
        }
    }

    public abstract int zzaP();
}
