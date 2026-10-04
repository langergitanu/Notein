package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz0T implements Cloneable {
    private double zzE0;
    private int zzYXQ;

    public zz0T(double d, int i) {
        this.zzE0 = d;
        this.zzYXQ = i;
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

    public final int zzX(zzYEF zzyef) {
        double dZzZsA;
        double size;
        int i = this.zzYXQ;
        if (i == 1) {
            dZzZsA = new zz0K((int) this.zzE0).zzZsA();
            size = 2.0d;
        } else {
            if (i != 2) {
                return zzyef.getSize();
            }
            dZzZsA = zz3W.zzXz(this.zzE0);
            size = zzyef.getSize();
        }
        return (int) (dZzZsA * size);
    }

    public final int zzZta() {
        return this.zzYXQ;
    }

    public final zz0T zzZtb() {
        return (zz0T) memberwiseClone();
    }

    public final boolean zzZtd() {
        return this.zzYXQ == 0;
    }
}
