package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYX2 {
    private int zzL4;
    private boolean zzXWO;
    private Section zzXWP;
    private zzYX0 zzXWQ;

    public zzYX2(zzYX0 zzyx0, int i, Section section) {
        this.zzXWQ = zzyx0;
        this.zzL4 = i;
        this.zzXWP = section;
    }

    public final int getType() {
        return this.zzL4;
    }

    public final boolean isLinked() {
        return this.zzXWO;
    }

    public final Section zzYBx() {
        return this.zzXWP;
    }

    public final zzYX0 zzYBy() {
        return this.zzXWQ;
    }

    public final void zzYBz() {
        this.zzXWO = true;
    }
}
