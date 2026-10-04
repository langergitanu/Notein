package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZJQ {
    private int zzU7;
    private Cell zzYsN;
    private zzZJQ zzYsO;
    private zzZJQ zzYsP;
    private int zzYsQ;
    private int zzYsR;
    private zzQQ zzYsS;
    private zzZIG zzYsT;
    private int zzYsU;
    private int zzsw;

    public zzZJQ(zzZIG zzzig, zzQQ zzqq) {
        this(zzqq);
        this.zzYsT = zzzig;
    }

    public final int getHorizontalMerge() {
        return this.zzYsR;
    }

    public final int getRowSpan() {
        return this.zzU7;
    }

    public final int getVerticalMerge() {
        return this.zzYsQ;
    }

    public final void setHorizontalMerge(int i) {
        this.zzYsR = i;
    }

    public final void setVerticalMerge(int i) {
        this.zzYsQ = i;
    }

    public final int zzBx() {
        return this.zzsw;
    }

    public final void zzN(Cell cell) {
        this.zzYsN = cell;
    }

    public final void zzOj(int i) {
        this.zzU7 = i;
    }

    public final void zzOk(int i) {
        this.zzsw = i;
    }

    public final void zzY(zzZJQ zzzjq) {
        this.zzYsO = zzzjq;
    }

    public final void zzZ(zzZJQ zzzjq) {
        this.zzYsP = zzzjq;
    }

    public final Cell zzZ3T() {
        return this.zzYsN;
    }

    public final int zzZ3U() {
        return this.zzYsU;
    }

    public final zzZJQ zzZ3V() {
        return this.zzYsO;
    }

    public final zzZJQ zzZ3W() {
        return this.zzYsP;
    }

    public final zzQQ zzZ3X() {
        return this.zzYsS;
    }

    public final zzZIG zzZ3Y() {
        return this.zzYsT;
    }

    public final void zzzX(int i) {
        this.zzYsU = i;
    }

    public zzZJQ(zzQQ zzqq) {
        this.zzYsS = zzqq;
        this.zzsw = 1;
        this.zzU7 = 1;
    }
}
