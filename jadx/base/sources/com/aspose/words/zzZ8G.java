package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZ8G extends zzZ4P {
    public zzZ8G(zzJX zzjx, int i) {
        super(zzjx, i);
    }

    @Override // com.aspose.words.zzJZ
    public final int getType() {
        return 11;
    }

    @Override // com.aspose.words.zzJZ
    public final boolean zzZ(zzJZ zzjz) {
        if (zzjz.getType() == 8 && !zzZT2()) {
            return zzZ8H.zzZ(this, zzjz);
        }
        return false;
    }

    public final zzZ4O zzZ6T() {
        zzJZ zzjz = (zzJZ) zzZT5();
        if (zzjz == null || zzjz.zzZT2() || zzjz.getType() != 7 || zzjz.getStart() - 1 != getEnd()) {
            return null;
        }
        return (zzZ4O) zzjz;
    }

    @Override // com.aspose.words.zzZ4P, com.aspose.words.zzJZ
    public final zzYI zzb8() {
        return new zzZ8H();
    }

    @Override // com.aspose.words.zzJZ
    public final boolean zzb9() {
        return false;
    }
}
