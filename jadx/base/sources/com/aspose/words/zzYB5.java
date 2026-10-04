package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYB5 {
    private double zzXA;
    private double zzXy;

    public zzYB5(double d, double d2) {
        this.zzXy = d;
        this.zzXA = d2;
    }

    public final double getHeight() {
        return this.zzXA;
    }

    public final double getWidth() {
        return this.zzXy;
    }

    public final boolean isEmpty() {
        return com.aspose.words.internal.zzAN.zzZD(this.zzXy) && com.aspose.words.internal.zzAN.zzZD(this.zzXA);
    }

    public final void setHeight(double d) {
        this.zzXA = d;
    }

    public final void setWidth(double d) {
        this.zzXy = d;
    }

    public final boolean zzY(zzYB5 zzyb5) {
        return this.zzXy > zzyb5.zzXy || this.zzXA > zzyb5.zzXA;
    }

    public zzYB5() {
    }
}
