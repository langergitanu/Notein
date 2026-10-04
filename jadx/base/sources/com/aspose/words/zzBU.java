package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzBU extends zz8D {
    private zzBV zzZ8a;

    public zzBU(zzBV zzbv, zzZ90 zzz90) {
        super(zzz90);
        this.zzZ8a = zzbv;
    }

    private com.aspose.words.internal.zzPV zzX(zzZCM zzzcm) {
        return this.zzZ8a.zzZFD().zzZ(this.zzZ54, zzzcm);
    }

    private com.aspose.words.internal.zzPV zzY(zzZCM zzzcm) {
        com.aspose.words.internal.zzPV zzpvZzZ = this.zzZ8a.zzZFE().zzZ(this.zzZ54, zzzcm);
        return !this.zzZ8a.zzZFC() ? new com.aspose.words.internal.zzPV(255, zzpvZzZ) : zzpvZzZ;
    }

    @Override // com.aspose.words.zz8D, com.aspose.words.zzZCJ
    public final int getOrder() {
        return 2;
    }

    @Override // com.aspose.words.zzZCJ
    public final void zzZ(com.aspose.words.internal.zzEI zzei, int i, zzZCM zzzcm) {
        com.aspose.words.internal.zzPV zzpvZzY = zzY(zzzcm);
        com.aspose.words.internal.zzPV zzpvZzX = zzX(zzzcm);
        if (i == 5) {
            zzZ(zzei, zzpvZzY, zzpvZzX);
        } else {
            zzei.zzDT().zzZ(new com.aspose.words.internal.zzPU[]{new com.aspose.words.internal.zzPU(zzpvZzY, zzpvZzX)});
        }
    }

    @Override // com.aspose.words.zzZCJ
    public final com.aspose.words.internal.zzPV zzZ(com.aspose.words.internal.zzPV zzpv, zzZCM zzzcm) {
        return com.aspose.words.internal.zzPV.zzZ(zzpv, zzY(zzzcm)) ? zzX(zzzcm) : zzpv;
    }

    private static void zzZ(com.aspose.words.internal.zzEI zzei, com.aspose.words.internal.zzPV zzpv, com.aspose.words.internal.zzPV zzpv2) {
        zzei.zzDT().zzY(new com.aspose.words.internal.zzTM(zzpv, 10));
        zzei.zzF(zzpv2);
    }
}
