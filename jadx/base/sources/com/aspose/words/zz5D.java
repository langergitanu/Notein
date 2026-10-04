package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz5D extends zz8D {
    private zz5E zzZ1f;

    public zz5D(zz5E zz5e, zzZ90 zzz90) {
        super(zzz90);
        this.zzZ1f = zz5e;
    }

    private com.aspose.words.internal.zzPT zzOI() {
        return com.aspose.words.internal.zzPN.zzX((float) this.zzZ1f.getContrast(), (float) this.zzZ1f.getBrightness());
    }

    @Override // com.aspose.words.zz8D, com.aspose.words.zzZCJ
    public final int getOrder() {
        return 5;
    }

    @Override // com.aspose.words.zzZCJ
    public final void zzZ(com.aspose.words.internal.zzEI zzei, int i, zzZCM zzzcm) {
        zzei.zzDT().zzZ(zzOI());
    }

    @Override // com.aspose.words.zzZCJ
    public final com.aspose.words.internal.zzPV zzZ(com.aspose.words.internal.zzPV zzpv, zzZCM zzzcm) {
        return com.aspose.words.internal.zzPT.zzZ(zzpv, zzOI());
    }
}
