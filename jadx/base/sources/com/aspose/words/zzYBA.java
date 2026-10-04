package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYBA extends zzYBB {
    private boolean zzYMG;

    public zzYBA(zzZS8 zzzs8, int i, boolean z) {
        super(zzzs8, i);
        this.zzYMG = z;
    }

    @Override // com.aspose.words.zzYBB
    public final zzZBP zzY7U() {
        return new zzZVO();
    }

    @Override // com.aspose.words.zzYBB
    public final zzZBQ zzY7V() {
        return zzZVV.zzZ(this.zzYMH, this.zzYMG, this.zzYMF);
    }

    @Override // com.aspose.words.zzYBB
    public final zzZVR zzZ(com.aspose.words.internal.zzQ6 zzq6, com.aspose.words.internal.zzQ9 zzq9) {
        return new zzZVR(true, zzq6, zzq9, this.zzYMH.zzZhy());
    }
}
