package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzVB {
    private String zzZvU;
    private int zzZvV;

    private zzVB(int i) {
        this.zzZvV = i;
    }

    public static zzVB zzY(com.aspose.words.internal.zzZOX zzzox, boolean z) throws Exception {
        int iZzXc = zzzox.zzXc();
        if (iZzXc > 0) {
            return new zzVB(z ? zzZZR.zzR(zzzox, iZzXc) : zzYO6.zzJ(zzzox, iZzXc));
        }
        return iZzXc < 0 ? new zzVB(zzzox.zzXc()) : new zzVB(1);
    }

    public final void zzW(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        if (this.zzZvV != 1) {
            zzzow.zzl(-1);
            zzzow.zzl(this.zzZvV);
        } else if (com.aspose.words.internal.zzZYD.zzXk(this.zzZvU)) {
            zzYO6.zzV(zzzow, this.zzZvU);
        } else {
            zzzow.zzl(0);
        }
    }

    public zzVB(String str) {
        this.zzZvV = 1;
        this.zzZvU = str;
    }
}
