package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzC extends zzZV {
    private long zzZr;
    private boolean zzZs;

    public zzC(zzZQ4 zzzq4, String str, zzPV zzpv, zzPV zzpv2, long j) {
        super(zzzq4, str, zzpv, zzpv2);
        this.zzZr = j;
    }

    public final void zzO(boolean z) {
        this.zzZs = z;
    }

    @Override // com.aspose.words.internal.zzZL
    public final void zzZ(zz6 zz6Var) throws Exception {
        zz6Var.zzZ(this);
    }

    public final long zzZE() {
        return this.zzZr;
    }

    public final boolean zzZF() {
        return this.zzZs;
    }
}
