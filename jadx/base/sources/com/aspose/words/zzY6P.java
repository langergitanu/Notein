package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY6P {
    private int zzX5S;
    private int zzX5T;
    private int zzXx8;

    public zzY6P() {
    }

    public final int zz56() {
        return this.zzXx8;
    }

    public final int zz6e() {
        return this.zzX5T;
    }

    public final int zz6f() {
        return this.zzX5S;
    }

    public final void zzW(zzWJ zzwj) {
        zzY6P zzy6pZz55 = zzwj.zz55();
        zzk6(Math.max(this.zzXx8, zzy6pZz55.zzXx8));
        zzk5(Math.max(this.zzX5S, zzy6pZz55.zzX5S));
        int iMax = Math.max(this.zzX5T, zzwj.getPreferredWidth().zzYmB() ? zzy6pZz55.zzX5T : zzy6pZz55.zzX5S);
        this.zzX5T = iMax;
        this.zzX5T = Math.max(iMax, this.zzX5S);
    }

    public final void zzXYP() {
        zzk6(Math.min(this.zzXx8, 31680));
        zzk5(Math.min(this.zzX5S, 31680));
        this.zzX5T = Math.min(this.zzX5T, 31680);
    }

    public final void zzk4(int i) {
        this.zzX5T = i;
    }

    public final void zzk5(int i) {
        this.zzX5S = i;
        if (this.zzX5T < i) {
            this.zzX5T = i;
        }
    }

    public final void zzk6(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzXx8 = i;
    }

    public zzY6P(zzY6P zzy6p) {
        zzk6(zzy6p.zzXx8);
        zzk5(zzy6p.zzX5S);
        this.zzX5T = zzy6p.zzX5T;
    }

    public zzY6P(int i, int i2, int i3) {
        zzk6(i);
        zzk5(i2);
        this.zzX5T = i3;
    }
}
