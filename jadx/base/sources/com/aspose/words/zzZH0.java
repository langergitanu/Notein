package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZH0 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("max-width", "max-height", "min-width", "min-height");
    private double zzXA;
    private double zzXy;
    private double zzYpo;
    private double zzYpp;
    private double zzYpq;
    private double zzYpr;
    private zzYB5 zzYps;
    private zzYB5 zzYpt;
    private zzPS zzZq9;

    public zzZH0(zzYB5 zzyb5, zzYB5 zzyb52, zzPS zzps) {
        this.zzYpt = zzyb5 == null ? new zzYB5(-1.0d, -1.0d) : zzyb5;
        this.zzYps = zzyb52;
        this.zzZq9 = zzps;
        this.zzXy = zzZ(zzps.zzSx("width"), -1.7976931348623157E308d);
        this.zzYpr = zzZ(zzps.zzSx("min-width"), -1.7976931348623157E308d);
        this.zzYpq = zzZ(zzps.zzSx("max-width"), Double.MAX_VALUE);
        this.zzXA = zzY(zzps.zzSx("height"), -1.7976931348623157E308d);
        this.zzYpp = zzY(zzps.zzSx("min-height"), -1.7976931348623157E308d);
        this.zzYpo = zzY(zzps.zzSx("max-height"), Double.MAX_VALUE);
    }

    private boolean zzKA(String str) {
        zzPT zzptZzSx = this.zzZq9.zzSx(str);
        if (zzptZzSx == null) {
            return false;
        }
        return zzptZzSx.zzMt(3) || zzptZzSx.zzMt(4) || zzptZzSx.zzMt(5);
    }

    private static double zzX(zzPT zzpt, double d) {
        return zzpt.zzMt(5) ? (d / 100.0d) * zzpt.zzZWj().zzZVx().getDoubleValue() : zzL5.zzW(zzpt.zzZWj());
    }

    private double zzY(zzPT zzpt, double d) {
        if (zzpt == null) {
            return d;
        }
        zzYB5 zzyb5 = this.zzYps;
        return zzX(zzpt, zzyb5 != null ? zzyb5.getHeight() : 0.0d);
    }

    private double zzZ(zzPT zzpt, double d) {
        if (zzpt == null) {
            return d;
        }
        zzYB5 zzyb5 = this.zzYps;
        return zzX(zzpt, zzyb5 != null ? zzyb5.getWidth() : 0.0d);
    }

    private boolean zzZ1v() {
        return zzKA("width") || zzKA("height");
    }

    private boolean zzZ1w() {
        zzPT zzptZzSx;
        zzYB5 zzyb5 = this.zzYps;
        return zzyb5 != null && zzyb5.getWidth() <= 0.0d && (zzptZzSx = this.zzZq9.zzSx("max-width")) != null && zzptZzSx.zzMt(5);
    }

    private double zzZ1x() {
        double height = this.zzXA;
        if (height <= 0.0d) {
            height = this.zzYpt.getHeight();
        }
        double d = this.zzYpp;
        if (d > 0.0d && height < d) {
            return d;
        }
        double d2 = this.zzYpo;
        return (d2 <= 0.0d || height <= d2) ? this.zzXA : d2;
    }

    private double zzZ1y() {
        double width = this.zzXy;
        if (width <= 0.0d) {
            width = this.zzYpt.getWidth();
        }
        double d = this.zzYpr;
        if (d > 0.0d && width < d) {
            return d;
        }
        double d2 = this.zzYpq;
        return (d2 <= 0.0d || width <= d2) ? this.zzXy : d2;
    }

    public final double zzZ1A() {
        double dZzZ1y = zzZ1y();
        if (com.aspose.words.internal.zzAN.zzZC(dZzZ1y)) {
            return -1.0d;
        }
        return dZzZ1y;
    }

    public final boolean zzZ1B() {
        return zzZ1v() || zzKA("min-width") || zzKA("min-height") || zzKA("max-width") || zzKA("max-height");
    }

    public final zzYB5 zzZ1C() {
        zzYB5 zzyb5;
        double d;
        double width = this.zzYpt.getWidth();
        double height = this.zzYpt.getHeight();
        double d2 = width / height;
        if (d2 <= 0.0d) {
            return null;
        }
        if (zzKA("width") && zzKA("height")) {
            width = this.zzXy;
            height = this.zzXA;
            d2 = width / height;
        } else if (zzKA("width")) {
            width = this.zzXy;
            height = width / d2;
        } else if (zzKA("height")) {
            height = this.zzXA;
            width = height * d2;
        }
        double d3 = d2;
        if (d3 <= 0.0d) {
            return null;
        }
        if (zzZ1w()) {
            return new zzYB5(width, height);
        }
        if (zzZ(width, height, "max-width")) {
            double d4 = this.zzYpq;
            return new zzYB5(d4, Math.max(d4 / d3, this.zzYpp));
        }
        if (zzZ(width, height, "min-width")) {
            double d5 = this.zzYpr;
            return new zzYB5(d5, Math.min(d5 / d3, this.zzYpo));
        }
        if (zzZ(width, height, "max-height")) {
            return new zzYB5(Math.max(this.zzYpo * d3, this.zzYpr), this.zzYpo);
        }
        if (zzZ(width, height, "min-height")) {
            return new zzYB5(Math.min(this.zzYpp * d3, this.zzYpq), this.zzYpp);
        }
        if (zzZ(width, height, "max-width", "max-height")) {
            double d6 = this.zzYpq;
            zzyb5 = null;
            d = d3;
            if (d6 / width <= this.zzYpo / height) {
                return new zzYB5(d6, Math.max(this.zzYpp, d6 / d));
            }
        } else {
            zzyb5 = null;
            d = d3;
        }
        if (zzZ(width, height, "max-width", "max-height")) {
            double d7 = this.zzYpq / width;
            double d8 = this.zzYpo;
            if (d7 > d8 / height) {
                return new zzYB5(Math.max(this.zzYpr, d8 * d), this.zzYpo);
            }
        }
        if (zzZ(width, height, "min-width", "min-height")) {
            double d9 = this.zzYpr / width;
            double d10 = this.zzYpp;
            if (d9 <= d10 / height) {
                return new zzYB5(Math.min(this.zzYpq, d10 * d), this.zzYpp);
            }
        }
        if (zzZ(width, height, "min-width", "min-height")) {
            double d11 = this.zzYpr;
            if (d11 / width > this.zzYpp / height) {
                return new zzYB5(d11, Math.min(this.zzYpo, d11 / d));
            }
        }
        return zzZ(width, height, "min-width", "max-height") ? new zzYB5(this.zzYpr, this.zzYpo) : zzZ(width, height, "max-width", "min-height") ? new zzYB5(this.zzYpq, this.zzYpp) : zzZ1v() ? new zzYB5(width, height) : zzyb5;
    }

    public final double zzZ1z() {
        double dZzZ1x = zzZ1x();
        if (com.aspose.words.internal.zzAN.zzZC(dZzZ1x)) {
            return -1.0d;
        }
        return dZzZ1x;
    }

    private boolean zzZ(double d, double d2, String... strArr) {
        String[] strArr2 = {"max-width", "max-height", "min-width", "min-height"};
        int i = 0;
        while (i < 4) {
            String str = strArr2[i];
            double d3 = d;
            double d4 = d2;
            if (zzZ(str, d3, d4) != com.aspose.words.internal.zzZ1.zzY(strArr, str)) {
                return false;
            }
            i++;
            d = d3;
            d2 = d4;
        }
        return true;
    }

    private boolean zzZ(String str, double d, double d2) {
        if (this.zzZq9.zzSx(str) == null) {
            return false;
        }
        int iZzTP = zzUR.zzTP(str);
        return iZzTP != 0 ? iZzTP != 1 ? iZzTP != 2 ? iZzTP == 3 && d2 < this.zzYpp : d < this.zzYpr : d2 > this.zzYpo : d > this.zzYpq;
    }
}
