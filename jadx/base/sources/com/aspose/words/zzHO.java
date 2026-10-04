package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzHO extends zz8D {
    private zzHP zzZh1;

    public zzHO(zzHP zzhp, zzZ90 zzz90) {
        super(zzz90);
        this.zzZh1 = zzhp;
    }

    @Override // com.aspose.words.zz8D, com.aspose.words.zzZCJ
    public final int getOrder() {
        return 7;
    }

    @Override // com.aspose.words.zzZCJ
    public final void zzZ(com.aspose.words.internal.zzEI zzei, int i, zzZCM zzzcm) {
        com.aspose.words.internal.zzPT zzpt = new com.aspose.words.internal.zzPT();
        zzpt.set(3, 3, (float) this.zzZh1.zzZQV());
        zzei.zzDT().zzZ(zzpt);
    }

    @Override // com.aspose.words.zzZCJ
    public final com.aspose.words.internal.zzPV zzZ(com.aspose.words.internal.zzPV zzpv, zzZCM zzzcm) {
        return new com.aspose.words.internal.zzPV((int) (zzpv.zzPD() * ((float) this.zzZh1.zzZQV())), zzpv);
    }
}
