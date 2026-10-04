package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzYNE {
    static final zzYNE zzVOA = new zzYNE(33023);
    private int zzVOB;

    public zzYNE(zzZ7F zzz7f) {
        this.zzVOB = zzz7f.intValue();
    }

    public final boolean zzX(zzYNE zzyne) {
        int i = this.zzVOB;
        return ((zzyne.zzVOB ^ i) | i) != 0;
    }

    public final boolean zzXAc() {
        return this.zzVOB == zzVOA.zzVOB;
    }

    public final zzYNE zzY(zzYNE zzyne) {
        zzYNE zzyne2 = new zzYNE();
        zzyne2.zzZ(new zzYNE(zzyne.zzVOB & this.zzVOB));
        return zzyne2;
    }

    public final void zzZ(zzYNE zzyne) {
        this.zzVOB = zzyne.zzVOB | this.zzVOB;
    }

    private zzYNE(int i) {
        this.zzVOB = i;
    }

    public zzYNE() {
        this(0);
    }
}
