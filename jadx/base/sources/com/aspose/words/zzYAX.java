package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYAX {
    private int zzXdQ;
    private int zzXdR;
    private int zzXdS;
    private int zzXdT;
    private boolean zzYDe;

    public zzYAX(int i, int i2, int i3, int i4) {
        this.zzYDe = i3 > i || i4 > i2;
        this.zzXdT = i;
        this.zzXdR = i2;
        this.zzXdS = i3;
        this.zzXdQ = i4;
    }

    private int zzY7J() {
        return Math.abs(this.zzXdQ - this.zzXdR);
    }

    private int zzY7K() {
        return Math.abs(this.zzXdS - this.zzXdT);
    }

    public final int getSize() {
        return zzY7K() + zzY7J();
    }

    public final int getXEnd() {
        return this.zzXdS;
    }

    public final int getXStart() {
        return this.zzXdT;
    }

    public final int getYEnd() {
        return this.zzXdQ;
    }

    public final int getYStart() {
        return this.zzXdR;
    }
}
