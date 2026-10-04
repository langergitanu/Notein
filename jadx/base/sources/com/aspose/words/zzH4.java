package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzH4 implements Cloneable {
    private double zzXA;
    private double zzXy;
    private int zzZgD = 1;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!com.aspose.words.internal.zzZ4.zzW(this, obj)) {
            return false;
        }
        zzH4 zzh4 = (zzH4) obj;
        return zzh4.zzZgD == this.zzZgD && com.aspose.words.internal.zzAN.zzL(zzh4.zzXA, this.zzXA) && com.aspose.words.internal.zzAN.zzL(zzh4.zzXy, this.zzXy);
    }

    public final double getHeight() {
        return this.zzXA;
    }

    public final double getWidth() {
        return this.zzXy;
    }

    public final int hashCode() {
        return (com.aspose.words.internal.zzZKP.zzZ9(this.zzXA) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzXy)) ^ this.zzZgD;
    }

    public final void setHeight(double d) {
        this.zzXA = d;
    }

    public final void setWidth(double d) {
        this.zzXy = d;
    }

    public final void zzLE(int i) {
        this.zzZgD = i;
    }

    public final int zzZQd() {
        return this.zzZgD;
    }

    public final zzH4 zzZQe() {
        return (zzH4) memberwiseClone();
    }
}
