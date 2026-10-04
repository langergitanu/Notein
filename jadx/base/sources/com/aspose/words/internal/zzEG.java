package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzEG {
    private double zzE;
    private double zzF;
    private int zzVL;
    private int zzVN;
    private int zzw9;
    private int zzwa;
    private boolean zzwh;

    private zzEG(int i, int i2, int i3, int i4, double d, double d2) {
        this.zzwa = i;
        this.zzw9 = i2;
        this.zzVL = i3;
        this.zzVN = i4;
        this.zzF = d;
        this.zzE = d2;
        if (d == 0.0d || d2 == 0.0d) {
            this.zzwh = true;
            this.zzF = 96.0d;
            this.zzE = 96.0d;
        }
    }

    public static zzEG zzDS() {
        return new zzEG(0, 0, 0, 0, 0.0d, 0.0d);
    }

    public static zzEG zzX(int i, int i2, double d) {
        return new zzEG(0, 0, i, i2, d, d);
    }

    public static zzEG zzY(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i3 - i;
        int i8 = i4 - i2;
        return new zzEG(i, i2, i7, i8, i5 != 0 ? ((double) i7) / (((double) i5) / 914400.0d) : 0.0d, i6 != 0 ? ((double) i8) / (((double) i6) / 914400.0d) : 0.0d);
    }

    public static zzEG zzZ(int i, int i2, double d, double d2) {
        return new zzEG(0, 0, i, i2, d, d2);
    }

    public final int getBottom() {
        return this.zzw9 + this.zzVN;
    }

    public final int getHeight() {
        return this.zzVN;
    }

    public final double getHeightPoints() {
        return (((double) this.zzVN) / this.zzE) * 72.0d;
    }

    public final double getHorizontalResolution() {
        return this.zzF;
    }

    public final int getLeft() {
        return this.zzwa;
    }

    public final int getRight() {
        return this.zzwa + this.zzVL;
    }

    public final long getSize() {
        return zzZPX.zzZm(this.zzVL, this.zzVN);
    }

    public final int getTop() {
        return this.zzw9;
    }

    public final double getVerticalResolution() {
        return this.zzE;
    }

    public final int getWidth() {
        return this.zzVL;
    }

    public final double getWidthPoints() {
        return (((double) this.zzVL) / this.zzF) * 72.0d;
    }

    public final int zzDN() {
        return zzSA.zzU(this.zzVN, this.zzE);
    }

    public final int zzDO() {
        return zzSA.zzU(this.zzVL, this.zzF);
    }

    public final int zzDP() {
        return zzSA.zzp(getHeightPoints());
    }

    public final int zzDQ() {
        return zzSA.zzp(getWidthPoints());
    }

    public final boolean zzDR() {
        return this.zzwh;
    }

    public static zzEG zzZ(int i, int i2, int i3, int i4, double d, double d2) {
        return new zzEG(i, i2, i3 - i, i4 - i2, d, d2);
    }
}
