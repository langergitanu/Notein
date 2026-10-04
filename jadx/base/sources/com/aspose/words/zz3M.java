package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz3M extends zzBW {
    private zzBW zzZ01;

    @Override // com.aspose.words.zzBW
    public final boolean isEmpty() {
        return this.zzZ01 == null;
    }

    @Override // com.aspose.words.zzBW
    public final void zzV(zzBW zzbw) {
        this.zzZ01 = zzbw;
    }

    @Override // com.aspose.words.zzBW
    public final com.aspose.words.internal.zzPV zzZ(zzZ90 zzz90) {
        zzBW zzbw = this.zzZ01;
        return zzbw != null ? zzbw.zzZ(zzz90, (zzZCM) null) : com.aspose.words.internal.zzPV.zzHZ;
    }

    @Override // com.aspose.words.zzBW
    public final int zzZHs() {
        return 3;
    }

    @Override // com.aspose.words.zzBW
    public final zzBW zzZHt() {
        zz3M zz3m = new zz3M();
        zzBW zzbw = this.zzZ01;
        if (zzbw != null) {
            zz3m.zzZ01 = zzbw.zzZHt();
        }
        zzU(zz3m);
        return zz3m;
    }
}
