package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzQ6 {
    private double zzKE;
    private double zzKv = -1.0d;
    private double zzXw;
    private double zzXx;

    public zzQ6() {
    }

    public final void normalize() {
        double dZzPY = zzPY();
        if (dZzPY == 1.0d) {
            return;
        }
        if (dZzPY == 0.0d) {
            this.zzKE = 0.0d;
            this.zzXw = 0.0d;
            this.zzXx = 0.0d;
        } else {
            this.zzXx /= dZzPY;
            this.zzXw /= dZzPY;
            this.zzKE /= dZzPY;
        }
        this.zzKv = -1.0d;
    }

    public final double zzPY() {
        if (this.zzKv < 0.0d) {
            double d = this.zzXx;
            double d2 = this.zzXw;
            double d3 = (d2 * d2) + (d * d);
            double d4 = this.zzKE;
            this.zzKv = Math.sqrt((d4 * d4) + d3);
        }
        return this.zzKv;
    }

    public final double zzQa() {
        return this.zzKE;
    }

    public final double zzQb() {
        return this.zzXx;
    }

    public final zzQ6 zzV(zzQ6 zzq6) {
        return new zzQ6(this.zzXx - zzq6.zzXx, this.zzXw - zzq6.zzXw, this.zzKE - zzq6.zzKE);
    }

    public final zzQ6 zzW(zzQ6 zzq6) {
        return new zzQ6(this.zzXx + zzq6.zzXx, this.zzXw + zzq6.zzXw, this.zzKE + zzq6.zzKE);
    }

    public final void zzX(zzQB zzqb) {
        zzQ9 zzq9ZzY = zzqb.zzY(new zzQ9());
        zzQ9 zzq9ZzY2 = zzqb.zzY(new zzQ9(this.zzXx, this.zzXw, this.zzKE));
        this.zzXx = zzq9ZzY2.zzQb() - zzq9ZzY.zzQb();
        this.zzXw = zzq9ZzY2.zzYm() - zzq9ZzY.zzYm();
        this.zzKE = zzq9ZzY2.zzQa() - zzq9ZzY.zzQa();
        this.zzKv = -1.0d;
    }

    public final boolean zzY(zzQ6 zzq6) {
        return ((int) Math.signum((zzq6.zzKE * this.zzKE) + ((zzq6.zzXw * this.zzXw) + (zzq6.zzXx * this.zzXx)))) > 0;
    }

    public final double zzYm() {
        return this.zzXw;
    }

    public final float zzZ(zzQ6 zzq6) {
        return (float) (((zzq6.zzKE * this.zzKE) + ((zzq6.zzXw * this.zzXw) + (zzq6.zzXx * this.zzXx))) / (zzPY() * zzq6.zzPY()));
    }

    public zzQ6(double d, double d2, double d3) {
        this.zzXx = d;
        this.zzXw = d2;
        this.zzKE = d3;
    }

    public final zzQ6 zzX(zzQ6 zzq6) {
        double d = this.zzXw;
        double d2 = zzq6.zzKE;
        double d3 = this.zzKE;
        double d4 = zzq6.zzXw;
        double d5 = (d * d2) - (d3 * d4);
        double d6 = zzq6.zzXx;
        double d7 = this.zzXx;
        return new zzQ6(d5, (d3 * d6) - (d2 * d7), (d7 * d4) - (d * d6));
    }

    public zzQ6(zzQ9 zzq9, zzQ9 zzq92) {
        this.zzXx = zzq92.zzQb() - zzq9.zzQb();
        this.zzXw = zzq92.zzYm() - zzq9.zzYm();
        this.zzKE = zzq92.zzQa() - zzq9.zzQa();
    }
}
