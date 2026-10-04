package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZUS extends zzJZ {
    public zzZUS(zzJX zzjx, int i) {
        super(zzjx, i, Integer.MAX_VALUE);
    }

    @Override // com.aspose.words.zzJZ
    public final int getPriority() {
        return -2147483647;
    }

    @Override // com.aspose.words.zzJZ
    public boolean isValid() {
        return zzZSX() != 0;
    }

    @Override // com.aspose.words.zzJZ
    public boolean zzZ(zzJZ zzjz) {
        if (!zzZT2() && getType() == zzjz.getType()) {
            return zzZSX() == 1 || zzZSX() == 3;
        }
        return false;
    }

    @Override // com.aspose.words.zzJZ
    public final int zzb7() {
        return Integer.MIN_VALUE;
    }

    @Override // com.aspose.words.zzJZ
    public final boolean zzb9() {
        if (zzZT2()) {
            return false;
        }
        return zzZSX() == 2 || zzZSX() == 3;
    }
}
