package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZUT extends zzZUS {
    public zzZUT(zzJX zzjx, int i) {
        super(zzjx, i);
    }

    @Override // com.aspose.words.zzZUS, com.aspose.words.zzJZ
    public final boolean zzZ(zzJZ zzjz) {
        if (super.zzZ(zzjz)) {
            return ((zzZSX() == 3 || zzjz.zzZSX() == 3) && (getLength() + zzjz.getLength()) % 3 == 0) ? false : true;
        }
        return false;
    }

    @Override // com.aspose.words.zzJZ
    public final int zzb6() {
        return 2;
    }

    @Override // com.aspose.words.zzJZ
    public final zzYI zzb8() {
        return getLength() == 1 ? new zzZ7H() : new zzYG();
    }
}
