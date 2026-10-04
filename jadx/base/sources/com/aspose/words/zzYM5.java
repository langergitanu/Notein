package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYM5 {
    private zzYM2 zzXFk;
    private zzYM2 zzXFl;

    public zzYM5() {
        this(0L);
    }

    public final String toString() {
        return com.aspose.words.internal.zzZKN.format("X:{0}, Y:{1}", this.zzXFl.toString(), this.zzXFk.toString());
    }

    public final zzYM2 zzYnF() {
        return this.zzXFk;
    }

    public final zzYM2 zzYnG() {
        return this.zzXFl;
    }

    public zzYM5(int i, int i2) {
        this(com.aspose.words.internal.zzZPZ.zzZm(i, i2));
    }

    public zzYM5(long j) {
        this(new zzYM2((int) j, false), new zzYM2((int) (j >> 32), false));
    }

    public zzYM5(zzYM2 zzym2, zzYM2 zzym22) {
        this.zzXFl = zzym2;
        this.zzXFk = zzym22;
    }
}
