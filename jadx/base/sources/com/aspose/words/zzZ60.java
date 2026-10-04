package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ60 {
    private double zzvQ;
    private double zzvR;

    public final void add(double d) {
        this.zzvR += d;
        this.zzvQ += d;
    }

    public final double getMax() {
        return this.zzvQ;
    }

    public final double getMin() {
        return this.zzvR;
    }

    public final zzZ60 zzYRq() {
        zzZ60 zzz60 = new zzZ60();
        zzz60.zzvR = this.zzvR;
        zzz60.zzvQ = this.zzvQ;
        return zzz60;
    }

    public final void zzZ(zzZ60 zzz60) {
        this.zzvR = Math.max(this.zzvR, zzz60.zzvR);
        this.zzvQ = Math.max(this.zzvQ, zzz60.zzvQ);
    }

    public final void zzZN(double d) {
        this.zzvQ = d;
    }

    public final void zzZO(double d) {
        this.zzvR = d;
    }
}
