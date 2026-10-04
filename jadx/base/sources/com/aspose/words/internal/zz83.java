package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz83 extends zz85 {
    private zzPV zzHv;
    private zzPV zzHw;
    private zzZUL zzol;

    public zz83(zzZUL zzzul, zzPV zzpv, zzPV zzpv2) {
        super(zzzul);
        this.zzol = zzzul;
        this.zzHv = zzpv;
        this.zzHw = zzpv2;
    }

    @Override // com.aspose.words.internal.zz85
    public final byte[] zzJZ() throws Exception {
        return this.zzol.zzT(this.zzHv, this.zzHw);
    }
}
