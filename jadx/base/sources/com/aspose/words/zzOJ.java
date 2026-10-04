package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzOJ {
    static zzOJ zzZpP = new zzOJ(0.0d, false);
    private double zzE0;
    private boolean zzZpO;

    public zzOJ(double d, boolean z) {
        this.zzE0 = d;
        this.zzZpO = z;
    }

    public static zzOJ zzY(zzOJ zzoj) {
        return new zzOJ(-zzoj.zzE0, zzoj.zzZpO);
    }

    public static zzOJ zzZ(zzOJ zzoj, zzOJ zzoj2) {
        return new zzOJ(zzoj.zzE0 + zzoj2.zzE0, zzoj.zzZpO || zzoj2.zzZpO);
    }

    public final double getValue() {
        return this.zzE0;
    }

    public final String toString() {
        return this.zzE0 + "; " + (this.zzZpO ? "custom" : "default");
    }

    public final boolean zzZVX() {
        return this.zzZpO;
    }

    public static zzOJ zzY(zzOJ zzoj, zzOJ zzoj2) {
        return new zzOJ(zzoj.zzE0 - zzoj2.zzE0, zzoj.zzZpO || zzoj2.zzZpO);
    }
}
