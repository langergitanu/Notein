package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZFO extends zzZGR {
    private int zzYnl;

    public zzZFO(zzZGO zzzgo, int i, int i2) {
        super(zzzgo, 1, "");
        zzzq(2);
        zzzp(i);
        this.zzYnl = i2;
    }

    @Override // com.aspose.words.zzZGR
    public final void zzZ(zzZGB zzzgb) {
        zzzgb.zzzf(zzZ1u().getListLevelNumber()).getListLevel().zzZYh().setSize(this.zzYnl);
    }
}
