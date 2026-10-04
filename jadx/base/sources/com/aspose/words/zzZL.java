package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZL extends zzZK {
    public zzZL(zzJX zzjx, int i) {
        super(zzjx, i);
    }

    @Override // com.aspose.words.zzJZ
    public final int getType() {
        return 6;
    }

    @Override // com.aspose.words.zzJZ
    public final boolean zzZ(zzJZ zzjz) {
        return false;
    }

    @Override // com.aspose.words.zzJZ
    public final boolean zzb9() {
        return !zzZT2();
    }

    @Override // com.aspose.words.zzJZ
    public final zzJZ zzba() {
        zzZAK zzzakZzZT4 = zzZT4();
        while (true) {
            zzJZ zzjz = (zzJZ) zzzakZzZT4;
            if (zzjz == null) {
                return null;
            }
            if (zzZT2()) {
                zzzakZzZT4 = zzjz.zzZT4();
            } else {
                if (zzjz.getType() == 6) {
                    return null;
                }
                if (zzjz.isLinked() && zzjz.zzZSZ() && -2147483644 <= zzjz.getPriority()) {
                    zzJZ zzjzZzZSY = zzjz.zzZSY();
                    while (zzjz != zzjzZzZSY) {
                        if (zzjz.getType() == 6) {
                            return null;
                        }
                        zzjz = (zzJZ) zzjz.zzZT4();
                    }
                } else if (zzjz.zzZ((zzJZ) this)) {
                    return zzjz;
                }
                zzzakZzZT4 = zzjz.zzZT4();
            }
        }
    }
}
