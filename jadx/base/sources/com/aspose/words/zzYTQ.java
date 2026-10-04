package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYTQ {
    private int zzXS6;
    private String zzYcU;
    private String zzYcV;
    private String zzZqL;

    public zzYTQ(int i, String str, String str2, String str3) {
        this.zzXS6 = i;
        this.zzZqL = str;
        this.zzYcV = str2;
        this.zzYcU = str3;
    }

    public static zzYTQ zzl(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        String strZzf;
        String strZzf2;
        zzzox.zzXc();
        int iZzXc = zzzox.zzXc();
        int i = 1;
        if (iZzXc == 1) {
            i = 2;
        } else if (iZzXc != 2 && iZzXc != 3) {
            return null;
        }
        String strZzf3 = zzYO6.zzf(zzzox);
        if (i == 2) {
            strZzf = zzYO6.zzf(zzzox);
            strZzf2 = zzYO6.zzf(zzzox);
        } else {
            zzzox.zzXc();
            zzzox.zzXc();
            strZzf = "";
            strZzf2 = "";
        }
        return new zzYTQ(i, strZzf3, strZzf, strZzf2);
    }

    public final String getClassName() {
        return this.zzZqL;
    }

    public final String zzYPn() {
        return this.zzYcU;
    }

    public final String zzYPo() {
        return this.zzYcV;
    }

    public final int zzYyi() {
        return this.zzXS6;
    }

    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzl(1281);
        zzzow.zzl(this.zzXS6 == 2 ? 1 : 2);
        zzYO6.zzW(zzzow, this.zzZqL);
        zzYO6.zzV(zzzow, this.zzYcV);
        zzYO6.zzV(zzzow, this.zzYcU);
    }
}
