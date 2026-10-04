package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzWJ {
    private zzY6P zzZzB;
    private int zzZzC;
    private PreferredWidth zzZzD;
    private boolean zzZzE;
    private boolean zzZzF;

    public zzWJ(Cell cell) {
        if (cell == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: cell");
        }
        this.zzZzB = new zzY6P();
        this.zzZzF = cell.zz6G().getVerticalMerge() == 2;
        this.zzZzD = zzY(cell.zz6G().getPreferredWidth());
        this.zzZzB.zzk6(zzY(cell));
        zzOu(cell.zz6G().zz5q());
    }

    private static PreferredWidth zzY(PreferredWidth preferredWidth) {
        int iZzYmE = preferredWidth.zzYmE();
        short s = (short) iZzYmE;
        if (s < 0) {
            s = 0;
        }
        if (preferredWidth.isFixed() && s == 0) {
            s = 1;
        }
        return s == iZzYmE ? preferredWidth : PreferredWidth.zzW6(preferredWidth.getType(), s);
    }

    private boolean zzZ(zzWJ zzwj) {
        return com.aspose.words.internal.zzZKO.equals(this.zzZzD, zzwj.zzZzD) && this.zzZzC == zzwj.zzZzC && this.zzZzB.equals(zzwj.zzZzB);
    }

    public final boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzWJ.class) {
            return false;
        }
        return zzZ((zzWJ) obj);
    }

    public final PreferredWidth getPreferredWidth() {
        return this.zzZzD;
    }

    public final int hashCode() {
        PreferredWidth preferredWidth = this.zzZzD;
        return ((((preferredWidth != null ? preferredWidth.hashCode() : 0) * 397) ^ this.zzZzC) * 397) ^ this.zzZzB.hashCode();
    }

    public final void setPreferredWidth(PreferredWidth preferredWidth) {
        this.zzZzD = preferredWidth;
    }

    public final boolean zz54() {
        return this.zzZzF;
    }

    public final zzY6P zz55() {
        return this.zzZzB;
    }

    public final int zz56() {
        return this.zzZzB.zz56();
    }

    public final int zz57() {
        if (this.zzZzD.isFixed()) {
            return this.zzZzD.zzYmD();
        }
        return 0;
    }

    public final int zz5q() {
        return this.zzZzC;
    }

    public final int zz6e() {
        return this.zzZzB.zz6e();
    }

    public final int zz6f() {
        return this.zzZzB.zz6f();
    }

    public final void zzOu(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzZzC = i;
    }

    public final void zzYx(boolean z) {
        this.zzZzE = z;
    }

    public final void zzYy(boolean z) {
        this.zzZzF = z;
    }

    private static int zzY(Cell cell) {
        return zzZSF.zzQ(cell) + 20;
    }

    public zzWJ(int i, PreferredWidth preferredWidth, zzY6P zzy6p) {
        this(i, preferredWidth);
        this.zzZzB = new zzY6P(zzy6p);
    }

    public zzWJ(int i, PreferredWidth preferredWidth) {
        if (preferredWidth != null) {
            this.zzZzD = zzY(preferredWidth);
            zzOu(i);
            if (preferredWidth.zzYmE() <= 0 || i > 0) {
                return;
            }
            zzOu(1);
            return;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: width");
    }
}
