package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zz3X extends zz0E implements Cloneable {
    private double zzE0;

    public zz3X() {
        this(1.0d);
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final double getValue() {
        return this.zzE0;
    }

    @Override // com.aspose.words.zz0E
    public final zz0E zzZwA() {
        return (zz3X) memberwiseClone();
    }

    public zz3X(double d) {
        this.zzE0 = d;
    }
}
