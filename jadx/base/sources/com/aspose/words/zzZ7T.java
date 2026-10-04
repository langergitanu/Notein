package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ7T extends zzJZ {
    public zzZ7T(zzJX zzjx, int i) {
        super(zzjx, i, Integer.MAX_VALUE);
    }

    @Override // com.aspose.words.zzJZ
    public final int getPriority() {
        return -2147483644;
    }

    @Override // com.aspose.words.zzJZ
    public final int getType() {
        return 4;
    }

    @Override // com.aspose.words.zzJZ
    public final boolean zzZ(zzJZ zzjz) {
        return 4 == zzjz.getType() && !zzZT2() && getLength() == zzjz.getLength() && !zzZSW();
    }

    @Override // com.aspose.words.zzJZ
    public final int zzb6() {
        return Integer.MAX_VALUE;
    }

    @Override // com.aspose.words.zzJZ
    public final int zzb7() {
        return Integer.MAX_VALUE;
    }

    @Override // com.aspose.words.zzJZ
    public final zzYI zzb8() {
        return new zzZ7U(getLength());
    }

    @Override // com.aspose.words.zzJZ
    public final boolean zzb9() {
        return !zzZT2();
    }
}
