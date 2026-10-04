package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZ4O extends zzZ4P {
    public zzZ4O(zzJX zzjx, int i) {
        super(zzjx, i);
    }

    private boolean zzYPj() {
        if (zzZT4() != null && !zzZT4().zzZT2()) {
            zzJZ zzjz = (zzJZ) zzZT4();
            if (zzjz.getType() == 11 && zzjz.getEnd() + 1 == getStart()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.words.zzJZ
    public final int getType() {
        return 7;
    }

    @Override // com.aspose.words.zzJZ
    public final boolean zzZ(zzJZ zzjz) {
        if (zzjz.getType() == 8 && !zzZT2() && !zzYPj() && zzZ1N.zzV(this, zzjz) == null) {
            return zzZ4R.zzZ(this, zzjz);
        }
        return false;
    }

    @Override // com.aspose.words.zzJZ
    public final boolean zzb9() {
        return false;
    }
}
