package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz2 extends zz4 {
    @Override // com.aspose.words.internal.zz4
    public final void zzZ(zzEI zzei) throws Exception {
        new zzZY().zzZ(zzei);
        zzei.zzDT().setThreshold(0.5f);
    }

    @Override // com.aspose.words.internal.zz4, com.aspose.words.internal.zzH5
    public final zzPV zzZ(zzPV zzpv) {
        zzPV zzpvZzZ = new zzZY().zzZ(zzpv);
        if (zzpvZzZ.zzPC() < zzAN.zzZE(127.5d)) {
            return new zzPV(zzpvZzZ.zzPD(), 0, 0, 0);
        }
        return new zzPV(zzpvZzZ.zzPD(), 255, 255, 255);
    }
}
