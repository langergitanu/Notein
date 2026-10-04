package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZM extends zz6 {
    private int zzYF = 0;
    private int zzYE = 0;

    private zzZM() {
    }

    public static int zzT(zzZL zzzl) throws Exception {
        zzZM zzzm = new zzZM();
        zzzl.zzZ(zzzm);
        return zzzm.zzYE;
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(zzG zzg) {
        this.zzYF--;
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzG zzg) {
        int i = this.zzYF + 1;
        this.zzYF = i;
        if (i > this.zzYE) {
            this.zzYE = i;
        }
    }
}
