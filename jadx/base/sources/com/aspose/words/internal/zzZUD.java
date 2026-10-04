package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZUD extends zzZUN {
    private int zz6L;
    private int zz6M;

    @Override // com.aspose.words.internal.zzZUN
    public final void zzK0() throws Exception {
        this.zz6L = zzmY().zzXa() & 65535;
        this.zz6M = zzmY().zzXa() & 65535;
    }

    public final int zzmQ() {
        return this.zz6L;
    }

    public final int zzmR() {
        return this.zz6M;
    }
}
