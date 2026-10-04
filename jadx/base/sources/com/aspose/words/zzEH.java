package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzEH extends zz80 implements Cloneable {
    private double zzXA = Double.NaN;
    private int zzZc2 = 1;
    private int zzZc1 = 1;
    private double zzXy = Double.NaN;
    private int zzZc0 = 1;
    private double zzZqb = Double.NaN;
    private int zzZbZ = 1;
    private double zzZqh = Double.NaN;
    private int zzZbY = 1;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private static int zzYm(double d) {
        return com.aspose.words.internal.zzZKP.zzZ9(com.aspose.words.internal.zzZKQ.zzS(d, 10));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!com.aspose.words.internal.zzZ4.zzW(this, obj)) {
            return false;
        }
        zzEH zzeh = (zzEH) obj;
        return com.aspose.words.internal.zzAN.zzL(this.zzXA, zzeh.zzXA) && this.zzZc2 == zzeh.zzZc2 && this.zzZc1 == zzeh.zzZc1 && com.aspose.words.internal.zzAN.zzL(this.zzXy, zzeh.zzXy) && this.zzZc0 == zzeh.zzZc0 && com.aspose.words.internal.zzAN.zzL(this.zzZqb, zzeh.zzZqb) && this.zzZbZ == zzeh.zzZbZ && com.aspose.words.internal.zzAN.zzL(this.zzZqh, zzeh.zzZqh) && this.zzZbY == zzeh.zzZbY;
    }

    public final double getHeight() {
        return this.zzXA;
    }

    public final double getLeft() {
        return this.zzZqb;
    }

    public final double getTop() {
        return this.zzZqh;
    }

    public final double getWidth() {
        return this.zzXy;
    }

    public final int hashCode() {
        return (((((((zzYm(this.zzXA) ^ this.zzZc2) ^ this.zzZc1) ^ zzYm(this.zzXy)) ^ this.zzZc0) ^ zzYm(this.zzZqb)) ^ this.zzZbZ) ^ zzYm(this.zzZqh)) ^ this.zzZbY;
    }

    public final boolean isEmpty() {
        return (zzZLl() || zzZLk() || zzZLj() || zzZLi()) ? false : true;
    }

    public final void setHeight(double d) {
        this.zzXA = d;
    }

    public final void setLeft(double d) {
        this.zzZqb = d;
    }

    public final void setTop(double d) {
        this.zzZqh = d;
    }

    public final void setWidth(double d) {
        this.zzXy = d;
    }

    public final void zzKM(int i) {
        this.zzZbY = i;
    }

    public final void zzKN(int i) {
        this.zzZbZ = i;
    }

    public final void zzKO(int i) {
        this.zzZc0 = i;
    }

    public final void zzKP(int i) {
        this.zzZc1 = i;
    }

    public final void zzKQ(int i) {
        this.zzZc2 = i;
    }

    public final boolean zzZLi() {
        return !Double.isNaN(this.zzXA);
    }

    public final boolean zzZLj() {
        return !Double.isNaN(this.zzXy);
    }

    public final boolean zzZLk() {
        return !Double.isNaN(this.zzZqh);
    }

    public final boolean zzZLl() {
        return !Double.isNaN(this.zzZqb);
    }

    public final int zzZLm() {
        return this.zzZbY;
    }

    public final int zzZLn() {
        return this.zzZbZ;
    }

    public final int zzZLo() {
        return this.zzZc0;
    }

    public final int zzZLp() {
        return this.zzZc1;
    }

    public final int zzZLq() {
        return this.zzZc2;
    }

    public final zzEH zzZLr() {
        zzEH zzeh = (zzEH) memberwiseClone();
        zzeh.setExtensions(zzZBz());
        return zzeh;
    }
}
