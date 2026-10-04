package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ4U extends zzZ4V {
    public zzZ4U(zzJX zzjx, int i) {
        super(zzjx, i);
    }

    @Override // com.aspose.words.zzJZ
    public final int getType() {
        return 9;
    }

    @Override // com.aspose.words.zzJZ
    public final boolean zzZ(zzJZ zzjz) {
        zzJZ zzjzZzZT7;
        if (zzjz.getType() != 10 || isLinked() || !zzZ4X.zzZ(this, zzjz) || (zzjzZzZT7 = zzZT7()) == null) {
            return false;
        }
        if (zzjzZzZT7.isLinked()) {
            return true;
        }
        zzY(zzjz);
        zzJZ zzjzZzba = zzjzZzZT7.zzba();
        zzZT8();
        return zzjzZzba != null;
    }

    @Override // com.aspose.words.zzJZ
    public final boolean zzb9() {
        return false;
    }
}
