package com.aspose.words;

import com.aspose.slides.OooOO0;

/* JADX INFO: loaded from: classes6.dex */
final class zzZT3 {
    double zzYJD;
    double zzYJE;
    double zzYJF;
    double zzYJG;

    private zzZT3(double d, double d2, double d3, double d4) {
        this.zzYJG = d;
        this.zzYJF = d2;
        this.zzYJE = d3;
        this.zzYJD = d4;
    }

    private static boolean zzXa(double d) {
        double d2 = d % 360.0d;
        if (d2 < 0.0d) {
            d2 += 360.0d;
        }
        if (d2 >= 0.0d && d2 < 45.0d) {
            return false;
        }
        if (d2 >= 45.0d && d2 < 135.0d) {
            return true;
        }
        if (d2 >= 135.0d && d2 < 225.0d) {
            return false;
        }
        if (d2 >= 225.0d && d2 < 315.0d) {
            return true;
        }
        if (d2 >= 315.0d) {
            return false;
        }
        throw new IllegalStateException("Unexpected angle.");
    }

    public static void zzY(ShapeBase shapeBase, double d, double d2, double d3, double d4) {
        zzZT3 zzzt3 = new zzZT3(d, d2, d3, d4);
        if (zzXa(shapeBase.getRotation())) {
            zzzt3.zzZi8();
        }
        shapeBase.setLeft(zzzt3.zzYJG);
        shapeBase.setTop(zzzt3.zzYJF);
        shapeBase.zzWf(zzzt3.zzYJE);
        shapeBase.zzWe(zzzt3.zzYJD);
    }

    public static void zzZ(ShapeBase shapeBase, double d, double d2, double d3, double d4) {
        double d5;
        double d6;
        double d7;
        double d8;
        if (d > d2) {
            d6 = d;
            d5 = d2;
        } else {
            d5 = d;
            d6 = d2;
        }
        if (d3 > d4) {
            d8 = d3;
            d7 = d4;
        } else {
            d7 = d3;
            d8 = d4;
        }
        zzY(shapeBase, d5 / 20.0d, d7 / 20.0d, (d6 - d5) / 20.0d, (d8 - d7) / 20.0d);
    }

    private void zzZi8() {
        double d = this.zzYJG;
        double d2 = this.zzYJE;
        double d3 = this.zzYJD;
        this.zzYJG = OooOO0.OooO00o(d2, d3, 2.0d, d);
        this.zzYJF = OooOO0.OooO00o(d3, d2, 2.0d, this.zzYJF);
        this.zzYJE = d3;
        this.zzYJD = d2;
    }

    public static zzZT3 zzg(ShapeBase shapeBase) {
        zzZT3 zzzt3 = new zzZT3(shapeBase.getLeft(), shapeBase.getTop(), shapeBase.getWidth(), shapeBase.getHeight());
        if (zzXa(shapeBase.getRotation())) {
            zzzt3.zzZi8();
        }
        return zzzt3;
    }
}
