package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZ4Q extends zzZ4P {
    public zzZ4Q(zzJX zzjx, int i) {
        super(zzjx, i);
    }

    @Override // com.aspose.words.zzJZ
    public final int getType() {
        return 8;
    }

    public final boolean zzYPk() {
        if (zzZT4() != null && !zzZT4().zzZT2() && zzZT4().zzZT4() != null) {
            zzJZ zzjz = (zzJZ) zzZT4().zzZT4();
            if (zzjz.getType() == 8 && zzjz.isLinked() && zzjz.getEnd() + 2 == getEnd()) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzYPl() {
        if (zzZT5() != null && !zzZT5().zzZT2()) {
            zzJZ zzjz = (zzJZ) zzZT5();
            if (zzjz.getType() == 7 && zzjz.isLinked() && zzjz.getStart() - 1 == getEnd()) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzYPm() {
        if (zzZT5() != null && !zzZT5().zzZT2()) {
            zzJZ zzjz = (zzJZ) zzZT5();
            if (zzjz.getType() == 9 && zzjz.isLinked() && zzjz.getStart() - 1 == getEnd()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.words.zzJZ
    public final boolean zzZ(zzJZ zzjz) {
        return false;
    }

    @Override // com.aspose.words.zzJZ
    public final boolean zzb9() {
        return !zzZT2();
    }
}
