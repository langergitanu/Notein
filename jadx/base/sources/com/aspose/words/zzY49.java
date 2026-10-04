package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY49 extends zzZUS {
    public zzY49(zzJX zzjx, int i) {
        super(zzjx, i);
    }

    @Override // com.aspose.words.zzJZ
    public final int getType() {
        return 3;
    }

    @Override // com.aspose.words.zzZUS, com.aspose.words.zzJZ
    public final boolean zzZ(zzJZ zzjz) {
        if (getLength() < 2 || zzjz.getLength() < 2) {
            return false;
        }
        return super.zzZ(zzjz);
    }

    @Override // com.aspose.words.zzJZ
    public final int zzb6() {
        return 2;
    }

    @Override // com.aspose.words.zzJZ
    public final zzYI zzb8() {
        return new zzY48();
    }
}
