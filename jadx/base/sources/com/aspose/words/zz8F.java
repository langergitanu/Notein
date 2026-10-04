package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz8F extends zz8D {
    private zz8G zzZ55;

    public zz8F(zz8G zz8g, zzZ90 zzz90) {
        super(zzz90);
        this.zzZ55 = zz8g;
    }

    private com.aspose.words.internal.zzPT zzV(zzZCM zzzcm) {
        return com.aspose.words.internal.zzPN.zzX(this.zzZ55.zzZCa().zzZ(this.zzZ54, zzzcm), this.zzZ55.zzZC9().zzZ(this.zzZ54, zzzcm));
    }

    @Override // com.aspose.words.zz8D, com.aspose.words.zzZCJ
    public final int getOrder() {
        return 4;
    }

    @Override // com.aspose.words.zzZCJ
    public final void zzZ(com.aspose.words.internal.zzEI zzei, int i, zzZCM zzzcm) {
        zz8C.zzZ(new zz75(), this.zzZ54).zzZ(zzei, i, zzzcm);
        zzei.zzDT().zzZ(zzV(zzzcm));
    }

    @Override // com.aspose.words.zzZCJ
    public final com.aspose.words.internal.zzPV zzZ(com.aspose.words.internal.zzPV zzpv, zzZCM zzzcm) {
        return com.aspose.words.internal.zzPT.zzZ(com.aspose.words.internal.zzPT.zzZ(zzpv, com.aspose.words.internal.zzPN.zzPo()), zzV(zzzcm));
    }
}
