package com.aspose.words.internal;

import com.aspose.slides.OooOO0;

/* JADX INFO: loaded from: classes5.dex */
public final class zzIP {
    private double zzyl;
    private double zzym;
    private double zzyn;

    public zzIP(double d, double d2, double d3) {
        zzZS(d);
        zzZR(d2);
        zzZQ(d3);
    }

    private static double zzS(double d, double d2, double d3) {
        if (d3 < 0.0d) {
            d3 += 1.0d;
        }
        if (d3 > 1.0d) {
            d3 -= 1.0d;
        }
        if (d3 < 0.16666666666666666d) {
            return ((d2 - d) * 6.0d * d3) + d;
        }
        if (d3 < 0.5d) {
            return d2;
        }
        if (d3 >= 0.6666666666666666d) {
            return d;
        }
        return ((0.6666666666666666d - d3) * (d2 - d) * 6.0d) + d;
    }

    public static zzPV zzT(double d, double d2, double d3) {
        double dZzS;
        double dZzS2;
        if (d3 == 0.0d) {
            dZzS = 0.0d;
            dZzS2 = 0.0d;
            d3 = 0.0d;
        } else if (d2 == 0.0d) {
            dZzS = d3;
            dZzS2 = dZzS;
        } else {
            double d4 = d3 < 0.5d ? (d2 + 1.0d) * d3 : (d3 + d2) - (d2 * d3);
            double d5 = (d3 * 2.0d) - d4;
            d3 = zzS(d5, d4, d + 0.3333333333333333d);
            dZzS = zzS(d5, d4, d);
            dZzS2 = zzS(d5, d4, d - 0.3333333333333333d);
        }
        return zzPV.zzS((int) (d3 * 255.0d), (int) (dZzS * 255.0d), (int) (dZzS2 * 255.0d));
    }

    public final double zzGu() {
        return this.zzyl;
    }

    public final double zzGv() {
        return this.zzym;
    }

    public final double zzGw() {
        return this.zzyn;
    }

    public final zzPV zzGx() {
        return zzT(this.zzyn, this.zzym, this.zzyl);
    }

    public final void zzZQ(double d) {
        this.zzyl = zzAN.zzR(d, 0.0d, 1.0d);
    }

    public final void zzZR(double d) {
        this.zzym = zzAN.zzR(d, 0.0d, 1.0d);
    }

    public final void zzZS(double d) {
        this.zzyn = zzAN.zzR(d, 0.0d, 1.0d);
    }

    public zzIP(zzPV zzpv) {
        double dZzPC = ((double) zzpv.zzPC()) / 255.0d;
        double dZzPB = ((double) zzpv.zzPB()) / 255.0d;
        double dZzPA = ((double) zzpv.zzPA()) / 255.0d;
        double dMax = Math.max(Math.max(dZzPC, dZzPB), dZzPA);
        double dMin = Math.min(Math.min(dZzPC, dZzPB), dZzPA);
        double d = dMax + dMin;
        double d2 = d / 2.0d;
        this.zzyl = d2;
        this.zzyn = d2;
        this.zzym = d2;
        if (dMax == dMin) {
            this.zzyn = 0.0d;
            this.zzym = 0.0d;
        } else {
            double d3 = dMax - dMin;
            this.zzym = d2 > 0.5d ? d3 / ((2.0d - dMax) - dMin) : d3 / d;
            if (dZzPC == dMax) {
                this.zzyn = ((dZzPB - dZzPA) / d3) + ((double) (dZzPB < dZzPA ? 6 : 0));
            } else if (dZzPB == dMax) {
                this.zzyn = OooOO0.OooO00o(dZzPA, dZzPC, d3, 2.0d);
            } else if (dZzPA == dMax) {
                this.zzyn = OooOO0.OooO00o(dZzPC, dZzPB, d3, 4.0d);
            }
        }
        this.zzyn /= 6.0d;
    }
}
