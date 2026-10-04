package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzWH {
    private zzWP zzZAg;
    private Cell zzZzz;
    private int zzsw = 1;
    private int zzU7 = 1;
    private int zzZzA = 1;

    private zzWH(zzWP zzwp, Cell cell) {
        this.zzZAg = zzwp;
        this.zzZzz = cell;
    }

    public static zzWH zz53() {
        return new zzWH(new zzWP(), null);
    }

    public static zzWH zzY(zzWP zzwp, Cell cell) {
        zzWH zzwhZzZ = zzZ(zzwp, cell);
        zzWP zzwp2 = zzwhZzZ.zzZAg;
        zzwp2.setHorizontalMerge(2);
        zzwp2.zzO(zzwp.zz5A());
        zzwp2.zzM(zzwp.zz5y());
        zzwp2.zzN(zzwp.zz5z());
        zzwp2.zzL(zzwp.zz5x());
        zzwp2.zzK(zzwp.zz5w());
        zzwp2.zzJ(zzwp.zz5v());
        return zzwhZzZ;
    }

    public static zzWH zzZ(zzWP zzwp, Cell cell) {
        return new zzWH((zzWP) zzwp.zzbn(), cell);
    }

    public final int getRowSpan() {
        return this.zzU7;
    }

    public final int zz50() {
        return this.zzZzA;
    }

    public final boolean zz51() {
        return this.zzZzz == null;
    }

    public final Cell zz52() {
        return this.zzZzz;
    }

    public final zzWP zz6G() {
        return this.zzZAg;
    }

    public final int zzBx() {
        return this.zzsw;
    }

    public final void zzOi(int i) {
        this.zzZzA = i;
    }

    public final void zzOj(int i) {
        this.zzU7 = i;
    }

    public final void zzOk(int i) {
        this.zzsw = i;
    }
}
