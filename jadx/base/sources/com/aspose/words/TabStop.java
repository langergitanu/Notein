package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class TabStop implements Cloneable {
    private int zzUG;
    private boolean zzX79;
    private int zzX7a;
    private int zzX7b;
    private boolean zzX7c;
    private int zzYc7;
    private int zzZGG;

    public TabStop() {
    }

    public static TabStop zzO(double d, int i) {
        TabStop tabStop = new TabStop(d, 6, 0);
        tabStop.zzX7c = true;
        tabStop.zzYc7 = i;
        return tabStop;
    }

    public final boolean equals(TabStop tabStop) {
        return this.zzX7b == tabStop.zzX7b && this.zzUG == tabStop.zzUG && this.zzZGG == tabStop.zzZGG && this.zzX7a == tabStop.zzX7a && this.zzX79 == tabStop.zzX79;
    }

    public final int getAlignment() {
        return this.zzUG;
    }

    public final int getLeader() {
        return this.zzZGG;
    }

    public final double getPosition() {
        return ((double) this.zzX7b) / 20.0d;
    }

    public final int hashCode() {
        return (((((((this.zzX7b * 397) ^ this.zzUG) * 397) ^ this.zzZGG) * 397) ^ this.zzX7a) * 397) ^ com.aspose.words.internal.zzZKP.zzYY(this.zzX79);
    }

    public final boolean isClear() {
        return this.zzUG == 7;
    }

    public final Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void setAlignment(int i) {
        this.zzUG = i;
    }

    public final void setLeader(int i) {
        this.zzZGG = i;
    }

    public final void zzPL(boolean z) {
        this.zzX79 = z;
    }

    public final boolean zzY0A() {
        return this.zzX7c;
    }

    public final int zzY0B() {
        return this.zzYc7;
    }

    public final boolean zzY0C() {
        return this.zzX79;
    }

    public final int zzY0D() {
        return this.zzX7a;
    }

    public final int zzY0E() {
        return this.zzX7b;
    }

    public final TabStop zzY0F() {
        return (TabStop) memberwiseClone();
    }

    public final void zzks(int i) {
        this.zzX7a = i;
    }

    public final void zzkt(int i) {
        this.zzX7b = i;
    }

    public TabStop(double d) {
        this(d, 0, 0);
    }

    public TabStop(double d, int i, int i2) {
        this(com.aspose.words.internal.zzSA.zzr(d), i, i2);
    }

    public TabStop(int i, int i2, int i3) {
        this.zzX7b = i;
        this.zzUG = i2;
        this.zzZGG = i3;
    }
}
