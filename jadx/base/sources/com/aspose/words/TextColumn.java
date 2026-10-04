package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class TextColumn implements Cloneable {
    private int zzVL;
    private int zzY92;

    public double getSpaceAfter() {
        return ((double) this.zzY92) / 20.0d;
    }

    public double getWidth() {
        return ((double) this.zzVL) / 20.0d;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void setSpaceAfter(double d) {
        if (0.0d > d) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzY92 = com.aspose.words.internal.zzSA.zzr(d);
    }

    public void setWidth(double d) {
        if (0.0d > d) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzVL = com.aspose.words.internal.zzSA.zzr(d);
    }

    public final boolean zzXW1() {
        return this.zzVL > 0 || this.zzY92 > 0;
    }

    public final int zzXW2() {
        return this.zzY92;
    }

    public final int zzXW3() {
        return this.zzVL;
    }

    public final TextColumn zzXW4() {
        return (TextColumn) memberwiseClone();
    }

    public final void zzjL(int i) {
        this.zzY92 = i;
    }

    public final void zzjM(int i) {
        this.zzVL = i;
    }
}
