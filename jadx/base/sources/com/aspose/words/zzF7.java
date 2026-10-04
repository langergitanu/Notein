package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzF7 extends zz80 implements Cloneable {
    private zzCF zzZcW;
    private zzFD zzZcX;
    private zzFD zzZcY;
    private double zzZcZ;
    private boolean zzZd0;
    private zzFD zzZd1;
    private zzFD zzZd2;
    private int zzZd3;
    private int zzZd4 = 1;
    private int zzZd5;
    private ChartSeries zzZyw;
    private zzD9 zzZyx;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private zzFD zz2B() {
        return this.zzZd4 == 0 ? zzZMn() : this.zzZyw.zz2y();
    }

    private boolean zz3S() {
        return this.zzZyw.zz3I().zzZPg().zzZIT() == 1;
    }

    private static zzFD zzT(zzFD zzfd) {
        zzFK zzfk = new zzFK();
        zzfk.zzV(new zzCE(2));
        zzfk.zzZN4().zzNy(zzfd.zzZMv().getValueCount());
        zzfk.zzZN4().setFormatCode(zzfd.zzZMv().getFormatCode());
        return new zzFD(zzfk);
    }

    private zzCF zzU(zzFD zzfd) {
        double value = 0.0d;
        int i = 0;
        for (int i2 = 0; i2 < zzfd.zzZMv().getValueCount(); i2++) {
            zzCF zzcfZzL0 = zzfd.zzL0(i2);
            zzCF zzcfZzL02 = this.zzZyw.zz2z().zzL0(i2);
            zzCF zzcfZzL03 = this.zzZyw.zz2y().zzL0(i2);
            if (!zzCF.zzR(zzcfZzL02) && !zzCF.zzR(zzcfZzL03)) {
                i++;
            }
            if (!zzCF.zzR(zzcfZzL0)) {
                value += zzcfZzL0.getValue();
            }
        }
        return new zzE7(0, i != 0 ? value / ((double) i) : 0.0d, zzfd.zzZMv().getFormatCode());
    }

    private double zzV(zzFD zzfd) {
        int i = this.zzZd3;
        if (i == 1) {
            return (float) this.zzZcZ;
        }
        if (i == 3) {
            return zzZ(zzfd, zzZMd(), this.zzZcZ);
        }
        if (i != 4) {
            return 0.0d;
        }
        return zzY(zzfd, zzZMd(), this.zzZcZ);
    }

    private static double zzY(zzFD zzfd, zzCF zzcf, double d) {
        return zzZ(zzfd, zzcf, d) / Math.sqrt(zzfd.zzZMv().getValueCount());
    }

    private zzFD zzZMn() {
        return this.zzZyw.zz2z().isEmpty() ? zzFD.zzKZ(this.zzZyw.zz2w() + 1) : this.zzZyw.zz2z();
    }

    private void zzZMo() {
        zzFD zzfd;
        double[] dArr;
        double dZzu;
        double dZzu2;
        double dZzu3;
        zzFD zzfdZz2B = zz2B();
        double[] dArrZzN = zzDG.zzN(this.zzZyw.zz3I());
        this.zzZcX = zzT(zzfdZz2B);
        this.zzZcY = zzT(zzfdZz2B);
        double dZzV = zzV(zzfdZz2B);
        int i = 0;
        while (i <= this.zzZyw.zz2w()) {
            zzCF zzcfZzL0 = zzfdZz2B.zzL0(i);
            if (zzcfZzL0 != null) {
                double value = zzcfZzL0.getValue();
                double value2 = zzcfZzL0.getValue();
                int i2 = this.zzZd3;
                if (i2 != 0) {
                    if (i2 == 1) {
                        dZzu3 = zzu(dZzV, dArrZzN[i]);
                    } else if (i2 != 2) {
                        if (i2 != 3) {
                            dZzu = value + dZzV;
                        } else {
                            dZzu = zzZMd().getValue() + dZzV;
                            value2 = zzZMd().getValue();
                        }
                        dZzu2 = value2 - dZzV;
                        zzfd = zzfdZz2B;
                        dArr = dArrZzN;
                    } else {
                        dZzV = zzZ(zzfdZz2B.zzZMv().zzKv(i), (float) this.zzZcZ);
                        dZzu3 = zzu(dZzV, dArrZzN[i]);
                    }
                    dZzu = value + dZzu3;
                    dZzu2 = value2 - dZzu3;
                    zzfd = zzfdZz2B;
                    dArr = dArrZzN;
                } else {
                    zzCF zzcfZzL02 = zzZMi().zzL0(zzcfZzL0.getIndex());
                    zzCF zzcfZzL03 = zzZMj().zzL0(zzcfZzL0.getIndex());
                    double value3 = zzcfZzL02 == null ? 0.0d : zzcfZzL02.getValue();
                    double value4 = zzcfZzL03 == null ? 0.0d : zzcfZzL03.getValue();
                    zzfd = zzfdZz2B;
                    dArr = dArrZzN;
                    dZzu = value + zzu(value3, dArr[i]);
                    dZzu2 = value2 - zzu(value4, dArr[i]);
                }
                this.zzZcX.zzZMv().zzU(new zzE7(zzcfZzL0.getIndex(), dZzu, null));
                this.zzZcY.zzZMv().zzU(new zzE7(zzcfZzL0.getIndex(), dZzu2, null));
            } else {
                zzfd = zzfdZz2B;
                dArr = dArrZzN;
            }
            i++;
            zzfdZz2B = zzfd;
            dArrZzN = dArr;
        }
    }

    private double zzu(double d, double d2) {
        return zz3S() ? d / d2 : d;
    }

    public final void zzKV(int i) {
        this.zzZd3 = i;
    }

    public final void zzKW(int i) {
        this.zzZd4 = i;
    }

    public final void zzKX(int i) {
        this.zzZd5 = i;
    }

    public final void zzXW(boolean z) {
        this.zzZd0 = z;
    }

    public final void zzYo(double d) {
        this.zzZcZ = d;
    }

    public final void zzZ(ChartSeries chartSeries) {
        this.zzZyw = chartSeries;
    }

    public final boolean zzZMa() {
        return this.zzZd3 == 3;
    }

    public final boolean zzZMb() {
        int i = this.zzZd5;
        return i == 0 || i == 1;
    }

    public final boolean zzZMc() {
        int i = this.zzZd5;
        return i == 0 || i == 2;
    }

    public final zzCF zzZMd() {
        if (this.zzZcW == null) {
            this.zzZcW = zzU(this.zzZd4 == 0 ? this.zzZyw.zz2z() : this.zzZyw.zz2y());
        }
        return this.zzZcW;
    }

    public final zzFD zzZMe() {
        if (this.zzZcY == null) {
            zzZMo();
        }
        return this.zzZcY;
    }

    public final zzFD zzZMf() {
        if (this.zzZcX == null) {
            zzZMo();
        }
        return this.zzZcX;
    }

    public final double zzZMg() {
        return this.zzZcZ;
    }

    public final boolean zzZMh() {
        return this.zzZd0;
    }

    public final zzFD zzZMi() {
        if (this.zzZd1 == null) {
            this.zzZd1 = new zzFD(new zzFK());
        }
        return this.zzZd1;
    }

    public final zzFD zzZMj() {
        if (this.zzZd2 == null) {
            this.zzZd2 = new zzFD(new zzFK());
        }
        return this.zzZd2;
    }

    public final int zzZMk() {
        return this.zzZd3;
    }

    public final int zzZMl() {
        return this.zzZd4;
    }

    public final int zzZMm() {
        return this.zzZd5;
    }

    public final zzF7 zzZMp() {
        zzF7 zzf7 = (zzF7) memberwiseClone();
        zzD9 zzd9 = this.zzZyx;
        if (zzd9 != null) {
            zzf7.zzZyx = zzd9.zzZI4();
        }
        zzFD zzfd = this.zzZcX;
        if (zzfd != null) {
            zzf7.zzZcX = zzfd.zzZMw();
        }
        zzFD zzfd2 = this.zzZcY;
        if (zzfd2 != null) {
            zzf7.zzZcY = zzfd2.zzZMw();
        }
        zzCF zzcf = this.zzZcW;
        if (zzcf != null) {
            zzf7.zzZcW = zzcf.zzZLf();
        }
        zzf7.setExtensions(zzZBz());
        zzFD zzfd3 = this.zzZd2;
        if (zzfd3 != null) {
            zzf7.zzZd2 = zzfd3.zzZMw();
        }
        zzFD zzfd4 = this.zzZd1;
        if (zzfd4 != null) {
            zzf7.zzZd1 = zzfd4.zzZMw();
        }
        return zzf7;
    }

    public final zzD9 zzaQ() {
        if (this.zzZyx == null) {
            this.zzZyx = new zzD9();
        }
        return this.zzZyx;
    }

    private static double zzZ(zzFD zzfd, zzCF zzcf, double d) {
        int valueCount = zzfd.zzZMv().getValueCount();
        double dPow = 0.0d;
        for (int i = 0; i < valueCount; i++) {
            zzCF zzcfZzL0 = zzfd.zzL0(i);
            if (!zzCF.zzR(zzcfZzL0)) {
                dPow += (double) ((float) Math.pow(zzcfZzL0.getValue() - zzcf.getValue(), 2.0d));
            }
        }
        double dSqrt = Math.sqrt(dPow / ((double) valueCount));
        if (com.aspose.words.internal.zzAN.zzZD(d)) {
            d = 1.0d;
        }
        return dSqrt * d;
    }

    private static double zzZ(zzCF zzcf, float f) {
        if (zzCF.zzR(zzcf)) {
            return 0.0d;
        }
        return (zzcf.getValue() * ((double) f)) / 100.0d;
    }
}
