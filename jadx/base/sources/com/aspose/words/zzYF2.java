package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYF2 {
    static zzYF2 zzXrM = new zzYF2();
    private boolean zzXrE;
    private Cell zzXrF;
    private int zzXrG;
    private boolean zzXrH;
    private com.aspose.words.internal.zzZYV<zzY6G> zzXrI;
    private int zzXrJ;
    private boolean zzXrK;
    private int zzXrL;
    private int zzYF;
    private zzY6G zzZsO;

    public zzYF2(int i) {
        this.zzXrI = new com.aspose.words.internal.zzZYV<>();
        this.zzYF = i;
        this.zzXrH = false;
        this.zzXrJ = 0;
        reset(0);
    }

    public final boolean isInCell() {
        return this.zzXrE;
    }

    public final boolean isLastRow() {
        return this.zzXrK;
    }

    public final void reset(int i) {
        zzY6G zzy6g = new zzY6G();
        this.zzZsO = zzy6g;
        this.zzXrI.set(i, zzy6g);
        this.zzXrL = 0;
        this.zzXrK = false;
    }

    public final void zzRh(boolean z) {
        this.zzXrE = z;
    }

    public final void zzRi(boolean z) {
        this.zzXrH = true;
    }

    public final void zzRj(boolean z) {
        this.zzXrK = true;
    }

    public final int zzYTl() {
        return this.zzYF;
    }

    public final Cell zzYfk() {
        return this.zzXrF;
    }

    public final int zzYfl() {
        return this.zzXrG;
    }

    public final int zzYfm() {
        return this.zzXrJ;
    }

    public final boolean zzYfn() {
        return this.zzXrH;
    }

    public final int zzYfo() {
        return this.zzXrL;
    }

    public final zzY6G zzZYf() {
        return this.zzZsO;
    }

    public final void zznQ(int i) {
        this.zzXrG = i;
    }

    public final void zznR(int i) {
        this.zzXrJ = i;
    }

    public final void zznS(int i) {
        this.zzXrL = i;
    }

    public final zzY6G zznT(int i) {
        return this.zzXrI.zzW(i, this.zzZsO);
    }

    public final void zzp(Cell cell) {
        this.zzXrF = cell;
    }

    private zzYF2() {
        this.zzXrI = new com.aspose.words.internal.zzZYV<>();
        this.zzYF = 0;
    }
}
