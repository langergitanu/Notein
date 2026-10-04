package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZB {
    private zzYYG zzZEk;
    private int zzZEl = 0;

    public zzZB(int i) throws Exception {
        zzYYG zzyyg = new zzYYG();
        this.zzZEk = zzyyg;
        zzyyg.zzYCU().zzk(1178882900);
        this.zzZEk.zzYCU().zzk(12);
        this.zzZEk.zzYCU().zzk(i);
    }

    public final void zzO(com.aspose.words.internal.zzXZ zzxz) throws Exception {
        this.zzZEk.zzO(zzxz);
    }

    public final void zzP8(int i) throws Exception {
        int i2 = (int) ((((long) this.zzZEl) & 4294967295L) + (4294967295L & ((long) i)));
        this.zzZEk.zzYCU().zzk(this.zzZEl);
        this.zzZEk.zzYCU().zzk(i2);
        this.zzZEl = i2;
    }
}
