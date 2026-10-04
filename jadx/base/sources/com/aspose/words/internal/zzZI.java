package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZI extends zzZL {
    private int zzYw;
    private long zzZN;
    private String zzZj;

    public zzZI(long j, int i, String str) {
        this.zzZN = j;
        this.zzYw = i;
        this.zzZj = str;
    }

    public final int getLevel() {
        return this.zzYw;
    }

    public final String getTitle() {
        return this.zzZj;
    }

    public final void zzY(long j) {
        this.zzZN = j;
    }

    @Override // com.aspose.words.internal.zzZL
    public final void zzZ(zz6 zz6Var) throws Exception {
        zz6Var.zzZ(this);
    }

    public final long zzZT() {
        return this.zzZN;
    }
}
