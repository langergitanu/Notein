package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzE9 extends zzEB {
    private int zzvN;
    private double zzvO;
    private int zzvP;
    private double zzvQ;
    private double zzvR;

    public zzE9(int i) {
        super(i);
        this.zzvO = 0.0d;
        this.zzvP = 0;
        this.zzvR = Double.NaN;
        this.zzvQ = Double.NaN;
    }

    public final double getMax() {
        return this.zzvQ;
    }

    public final void setOrientation(int i) {
        this.zzvP = 1;
    }

    public final int zzDA() {
        return this.zzvN;
    }

    public final void zzVN(int i) {
        this.zzvN = i;
    }

    @Override // com.aspose.words.internal.zzEB
    public final zzE6 zzVO(int i) {
        return new zzE4(i);
    }

    public final void zzZN(double d) {
        this.zzvQ = d;
    }

    public final void zzZO(double d) {
        this.zzvR = d;
    }
}
