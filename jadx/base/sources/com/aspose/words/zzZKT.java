package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZKT extends zzZ7S {
    private int zzYw;

    public final int getLevel() {
        return this.zzYw;
    }

    public final void setLevel(int i) {
        this.zzYw = i;
    }

    @Override // com.aspose.words.zzZ7S, com.aspose.words.zzTI, com.aspose.words.zzYI
    public final boolean zzZ(zzYI zzyi) {
        if (zzyi.zzb4() == 1) {
            return super.zzZ(zzyi);
        }
        return false;
    }

    @Override // com.aspose.words.zzYI
    public final int zzb4() {
        return 2;
    }
}
