package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYSD extends zzYOY {
    private String zzPn;
    private ArrayList<zzYPN> zzXQD;

    public final String getFormat() {
        return this.zzPn;
    }

    public final void setFormat(String str) {
        this.zzPn = str;
    }

    public final void zzYp(String str, String str2) {
        if (this.zzXQD == null) {
            this.zzXQD = new ArrayList<>();
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzXQD, new zzYPN(str, str2));
    }

    public final ArrayList<zzYPN> zzYwJ() {
        return this.zzXQD;
    }

    public String zzZ(zzYPO zzypo) {
        return this.zzPn;
    }
}
