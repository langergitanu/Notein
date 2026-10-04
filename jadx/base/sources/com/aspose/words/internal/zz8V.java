package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz8V implements zzGB {
    private int zzDB;
    private zz8S[] zzpD;

    @Override // com.aspose.words.internal.zzGB
    public final int getHandle() {
        return this.zzDB;
    }

    @Override // com.aspose.words.internal.zzGB
    public final int getType() {
        return 10;
    }

    public final void zzT(zzO8 zzo8) throws Exception {
        this.zzDB = zzo8.zzXc();
        zzo8.zzXa();
        int iZzXa = zzo8.zzXa();
        this.zzpD = new zz8S[iZzXa];
        for (int i = 0; i < iZzXa; i++) {
            this.zzpD[i] = new zz8S(zzo8.zzXc());
        }
    }

    @Override // com.aspose.words.internal.zzGB
    public final void zzWe(int i) {
        this.zzDB = i;
    }
}
