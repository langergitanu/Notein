package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz0 extends zz4 {
    private zzPU[] zzZ5;
    private zzPV zzZ6;
    private zzPV zzZ7;

    public zz0(zzPV zzpv, zzPV zzpv2) {
        this.zzZ7 = zzpv;
        this.zzZ6 = zzpv2;
        this.zzZ5 = new zzPU[]{new zzPU(zzpv, zzpv2)};
    }

    @Override // com.aspose.words.internal.zz4
    public final void zzZ(zzEI zzei) {
        zzei.zzDT().zzZ(this.zzZ5);
    }

    @Override // com.aspose.words.internal.zz4, com.aspose.words.internal.zzH5
    public final zzPV zzZ(zzPV zzpv) {
        return zzpv.equals(this.zzZ7) ? this.zzZ6 : zzpv;
    }
}
