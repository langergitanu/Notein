package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZB extends zzZV {
    private String zzY9;
    private int zzYa;
    private String zzYb;

    public zzZB(String str, zzZQ4 zzzq4, String str2, String str3, zzPV zzpv, int i) {
        super(zzzq4, str, zzpv, zzPV.zzHZ);
        this.zzY9 = str2;
        this.zzYb = str3;
        this.zzYa = i;
    }

    public final int getMaxLength() {
        return this.zzYa;
    }

    public final String zzYQ() {
        return this.zzY9;
    }

    public final String zzYR() {
        return this.zzYb;
    }

    @Override // com.aspose.words.internal.zzZL
    public final void zzZ(zz6 zz6Var) throws Exception {
        zz6Var.zzZ(this);
    }
}
