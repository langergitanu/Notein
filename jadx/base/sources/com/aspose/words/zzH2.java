package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzH2 extends zz8D {
    private zzH3 zzZgC;

    public zzH2(zzH3 zzh3, zzZ90 zzz90) {
        super(zzz90);
        this.zzZgC = zzh3;
    }

    @Override // com.aspose.words.zz8D, com.aspose.words.zzZCJ
    public final int getOrder() {
        return 1;
    }

    @Override // com.aspose.words.zzZCJ
    public final void zzZ(com.aspose.words.internal.zzEI zzei, int i, zzZCM zzzcm) {
        zz8C.zzZ(new zz75(), this.zzZ54).zzZ(zzei, i, zzzcm);
        zzei.zzDT().setThreshold(((float) this.zzZgC.zzZQZ()) - 0.01f);
    }

    @Override // com.aspose.words.zzZCJ
    public final com.aspose.words.internal.zzPV zzZ(com.aspose.words.internal.zzPV zzpv, zzZCM zzzcm) {
        com.aspose.words.internal.zzPV zzpvZzZ = com.aspose.words.internal.zzPT.zzZ(zzpv, com.aspose.words.internal.zzPN.zzPo());
        if (zzpvZzZ.zzPC() < com.aspose.words.internal.zzAN.zzZE(this.zzZgC.zzZQZ() * 255.0d)) {
            return new com.aspose.words.internal.zzPV(zzpvZzZ.zzPD(), 0, 0, 0);
        }
        return new com.aspose.words.internal.zzPV(zzpvZzZ.zzPD(), 255, 255, 255);
    }
}
