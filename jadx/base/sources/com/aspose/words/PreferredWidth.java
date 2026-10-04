package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class PreferredWidth {
    public static PreferredWidth AUTO = new PreferredWidth(1, 0);
    static PreferredWidth zzXDr = zzW6(3, 0);
    private int zzL4;
    private int zzXDs;
    private int zzXDt;

    private PreferredWidth(int i, int i2) {
        this.zzXDt = i;
        this.zzL4 = i == 0 ? 1 : i;
        this.zzXDs = i2;
    }

    public static PreferredWidth fromPercent(double d) {
        com.aspose.words.internal.zzZ4.zzZ(d, 0.0d, 0.0d, 600.0d, 600.0d, true, "percent");
        return zzWm(d);
    }

    public static PreferredWidth fromPoints(double d) {
        com.aspose.words.internal.zzZ4.zzZ(d, 0.0d, 0.0d, 1584.0d, 1584.0d, true, "points");
        return zzWl(d);
    }

    public static PreferredWidth zzW6(int i, int i2) {
        return new PreferredWidth(i, i2);
    }

    public static double zzWj(double d) {
        return com.aspose.words.internal.zzAN.zzR(d, 0.0d, 1584.0d);
    }

    public static double zzWk(double d) {
        return com.aspose.words.internal.zzAN.zzR(d, 0.0d, 600.0d);
    }

    public static PreferredWidth zzWl(double d) {
        return new PreferredWidth(3, com.aspose.words.internal.zzSA.zzr(d));
    }

    public static PreferredWidth zzWm(double d) {
        return new PreferredWidth(2, com.aspose.words.internal.zzAN.zzZG(d * 50.0d));
    }

    public static PreferredWidth zzpK(int i) {
        return i == 0 ? zzXDr : new PreferredWidth(3, i);
    }

    public final boolean equals(PreferredWidth preferredWidth) {
        if (com.aspose.words.internal.zzZKO.zzA(null, preferredWidth)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, preferredWidth)) {
            return true;
        }
        return preferredWidth.zzL4 == this.zzL4 && preferredWidth.zzXDs == this.zzXDs;
    }

    public final int getType() {
        return this.zzL4;
    }

    public final double getValue() {
        double d;
        double d2;
        int i = this.zzL4;
        if (i == 1) {
            return 0.0d;
        }
        if (i == 2) {
            d = this.zzXDs;
            d2 = 50.0d;
        } else {
            if (i != 3) {
                throw new IllegalStateException("Unknown preferred width type.");
            }
            d = this.zzXDs;
            d2 = 20.0d;
        }
        return d / d2;
    }

    public final int hashCode() {
        return (this.zzL4 * 397) ^ this.zzXDs;
    }

    public final boolean isAuto() {
        return this.zzL4 == 1 || this.zzXDs <= 0;
    }

    public final boolean isFixed() {
        return this.zzL4 == 3;
    }

    public final boolean isValid() {
        int i = this.zzL4;
        return i == 1 || i == 2 || i == 3;
    }

    public final String toString() {
        int i = this.zzL4;
        if (i == 1) {
            return "Auto";
        }
        if (i != 2) {
            return i != 3 ? super.toString() : com.aspose.words.internal.zzJB.zzWD(this.zzXDs);
        }
        return com.aspose.words.internal.zzJB.zzZU(getValue()) + '%';
    }

    public final boolean zzYmB() {
        return this.zzL4 == 2;
    }

    public final boolean zzYmC() {
        return this.zzXDs > 0;
    }

    public final int zzYmD() {
        return this.zzXDs;
    }

    public final int zzYmE() {
        return this.zzXDs;
    }

    public final int zzYmF() {
        return this.zzXDt;
    }

    public final PreferredWidth zzYmG() {
        int iMax = Math.max(0, (int) ((short) this.zzXDs));
        if (getType() != 2) {
            iMax = Math.min(31680, iMax);
        }
        int i = getType() != 1 ? iMax : 0;
        return (i == 0 && getType() == 2) ? AUTO : i == this.zzXDs ? this : zzW6(getType(), i);
    }

    public final boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != PreferredWidth.class) {
            return false;
        }
        return equals((PreferredWidth) obj);
    }
}
