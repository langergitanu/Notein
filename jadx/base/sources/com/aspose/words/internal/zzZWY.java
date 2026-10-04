package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzZWY extends zzUV {
    private zzD4 zz9k;

    public zzZWY(zzD4 zzd4) {
        this.zz9k = zzd4;
    }

    @Override // com.aspose.words.internal.zzUV
    public final void zzZ(int i, zzDB zzdb) {
        int i2 = this.zz9k.get(i);
        if (zzD4.zzWm(i2)) {
            return;
        }
        zzdb.add(i2);
    }
}
