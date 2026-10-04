package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz9U extends zz9V {
    private int zzHu;
    private zzPV zzHv;

    public zz9U(int i, zzPV zzpv) {
        this.zzHu = i;
        this.zzHv = zzpv;
    }

    @Override // com.aspose.words.internal.zz9V
    public final zzPY zzZ(zz9G zz9g) {
        return new zzPK(this.zzHu, this.zzHv, zz9g.zzzU() == 2 ? zz9g.zzOK() : zzPV.zzHZ);
    }
}
