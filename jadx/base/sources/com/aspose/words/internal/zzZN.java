package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZN extends zz7 {
    private int zzYG;
    private String zzYH;

    public zzZN(String str, int i) {
        this.zzYH = str;
        this.zzYG = i;
    }

    public final int getId() {
        return this.zzYG;
    }

    public final String getLanguage() {
        return this.zzYH;
    }

    @Override // com.aspose.words.internal.zz7, com.aspose.words.internal.zzZL
    public final void zzZ(zz6 zz6Var) throws Exception {
        zz6Var.zzZ(this);
        super.zzZ(zz6Var);
        zz6Var.zzY(this);
    }
}
