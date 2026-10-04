package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zz9V implements zzGB {
    private int zzDB;

    @Override // com.aspose.words.internal.zzGB
    public final int getHandle() {
        return this.zzDB;
    }

    @Override // com.aspose.words.internal.zzGB
    public final int getType() {
        return 1;
    }

    @Override // com.aspose.words.internal.zzGB
    public final void zzWe(int i) {
        this.zzDB = i;
    }

    public abstract zzPY zzZ(zz9G zz9g);
}
