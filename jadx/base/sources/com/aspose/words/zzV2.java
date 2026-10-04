package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzV2 {
    private double zzZvB;
    private zzZ60 zzZvC;
    private PreferredWidth zzZvD;
    private PreferredWidth zzZvF = PreferredWidth.AUTO;
    private zzZ60 zzZvE = new zzZ60();

    public final PreferredWidth getPreferredWidth() {
        return this.zzZvF;
    }

    public final void setPreferredWidth(PreferredWidth preferredWidth) {
        this.zzZvF = preferredWidth;
    }

    public final void zz0I() {
        zzZ60 zzz60 = this.zzZvE;
        zzz60.zzZO(Math.max(zzz60.getMin(), 0.75d));
        zzZ60 zzz602 = this.zzZvE;
        zzz602.zzZN(Math.max(zzz602.getMax(), 0.75d));
    }

    public final double zz0J() {
        return this.zzZvB;
    }

    public final zzZ60 zz0K() {
        return this.zzZvC;
    }

    public final PreferredWidth zz0L() {
        return this.zzZvD;
    }

    public final zzZ60 zz0M() {
        return this.zzZvE;
    }

    public final void zz0N() {
        this.zzZvD = this.zzZvF;
        this.zzZvC = this.zzZvE.zzYRq();
    }

    public final void zzX(PreferredWidth preferredWidth) {
        this.zzZvD = preferredWidth;
    }

    public final void zzZ2(double d) {
        this.zzZvB = d;
    }
}
