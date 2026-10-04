package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZX extends zz4 {
    private float zzZ3;
    private float zzZ4;

    public zzZX(float f, float f2) {
        this.zzZ4 = f;
        this.zzZ3 = f2;
    }

    @Override // com.aspose.words.internal.zz4
    public final void zzZ(zzEI zzei) {
        zzei.zzDT().zzZ(zzPN.zzX(this.zzZ4, this.zzZ3));
    }

    @Override // com.aspose.words.internal.zz4, com.aspose.words.internal.zzH5
    public final zzPV zzZ(zzPV zzpv) {
        return zzPT.zzZ(zzpv, zzPN.zzX(this.zzZ4, this.zzZ3));
    }
}
