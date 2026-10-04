package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYF1 {
    private int zzXrC;
    private zzYF2 zzXrD;
    private com.aspose.words.internal.zzZQC<zzYF2> zzYTP = new com.aspose.words.internal.zzZQC<>();

    public zzYF1() {
        zzYfj();
    }

    public final boolean isInCell() {
        return this.zzXrD.isInCell();
    }

    public final boolean isLastRow() {
        return this.zzXrD.isLastRow();
    }

    public final void zzRh(boolean z) {
        this.zzXrD.zzRh(z);
    }

    public final int zzYf9() {
        return this.zzYTP.peek().zzYTl();
    }

    public final void zzYfa() {
        this.zzXrD.zzRi(true);
    }

    public final void zzYfb() {
        this.zzXrD.zzRj(true);
    }

    public final boolean zzYfc() {
        return zzYf9() < this.zzXrC;
    }

    public final boolean zzYfd() {
        return zzYf9() > this.zzXrC;
    }

    public final boolean zzYfe() {
        return this.zzXrC > 1;
    }

    public final boolean zzYff() {
        return this.zzXrC > 0;
    }

    public final void zzYfg() {
        this.zzXrC = 0;
    }

    public final void zzYfh() {
        this.zzYTP.pop();
        this.zzXrD = this.zzYTP.peek();
        if (zzYf9() == 0) {
            this.zzXrD = new zzYF2(1);
        }
        this.zzXrC = zzYf9();
    }

    public final void zzYfi() {
        zzYf9();
        if (zzYf9() > 0) {
            this.zzXrD = new zzYF2(this.zzXrD.zzYTl() + 1);
        }
        this.zzYTP.push(this.zzXrD);
    }

    public final void zzYfj() {
        this.zzXrC = 0;
        this.zzXrD = new zzYF2(1);
        this.zzYTP.push(zzYF2.zzXrM);
    }

    public final Cell zzYfk() {
        return this.zzXrD.zzYfk();
    }

    public final int zzYfl() {
        return this.zzXrD.zzYfl();
    }

    public final int zzYfm() {
        return this.zzXrD.zzYfm();
    }

    public final boolean zzYfn() {
        return this.zzXrD.zzYfn();
    }

    public final int zzYfo() {
        return this.zzXrD.zzYfo();
    }

    public final zzY6G zzZYf() {
        return this.zzXrD.zzZYf();
    }

    public final zzY6G zznL(int i) {
        return (zzY6G) this.zzXrD.zznT(i).zzbn();
    }

    public final void zznM(int i) {
        if (i > 0) {
            this.zzXrC = i;
        }
    }

    public final void zznN(int i) {
        if (this.zzXrC <= 0 || zzYfe() || this.zzXrD.zzYfm() <= i) {
            return;
        }
        this.zzXrC--;
    }

    public final void zznO(int i) {
        this.zzXrC = 1;
        this.zzXrD.zznR(i);
    }

    public final void zznP(int i) {
        this.zzXrD.reset(i);
        zznO(i);
    }

    public final void zznQ(int i) {
        this.zzXrD.zznQ(i);
    }

    public final void zznS(int i) {
        this.zzXrD.zznS(i);
    }

    public final zzY6G zznT(int i) {
        return this.zzXrD.zznT(i);
    }

    public final void zzp(Cell cell) {
        this.zzXrD.zzp(cell);
    }
}
