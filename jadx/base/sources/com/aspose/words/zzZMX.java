package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZMX extends zzZ4P {
    public zzZMX(zzJX zzjx, int i) {
        super(zzjx, i);
    }

    @Override // com.aspose.words.zzJZ
    public final int getType() {
        return 12;
    }

    @Override // com.aspose.words.zzJZ
    public final boolean zzZ(zzJZ zzjz) {
        return zzjz != null && zzjz.getType() == 8 && !zzZT2() && zzZMV.zzZ(this, zzjz);
    }

    public final zzZ4O zzZ6T() {
        zzJZ zzjz = (zzJZ) zzZT4();
        if (zzjz == null || zzjz.zzZT2() || zzjz.getType() != 7 || zzjz.getStart() + 1 != getEnd()) {
            return null;
        }
        return (zzZ4O) zzjz;
    }

    @Override // com.aspose.words.zzZ4P, com.aspose.words.zzJZ
    public final zzYI zzb8() {
        return new zzZMV();
    }

    @Override // com.aspose.words.zzJZ
    public final boolean zzb9() {
        return false;
    }
}
