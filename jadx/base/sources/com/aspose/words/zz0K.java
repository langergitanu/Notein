package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zz0K implements Cloneable {
    private int zzZn;

    public zz0K() {
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private boolean zzW(zz0K zz0k) {
        if (com.aspose.words.internal.zzZKO.zzA(null, zz0k)) {
            return false;
        }
        return com.aspose.words.internal.zzZKO.zzA(this, zz0k) || zz0k.zzZn == this.zzZn;
    }

    public static zz0K zzXh(double d) {
        return new zz0K((int) (d * 100.0d));
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zz0K.class) {
            return false;
        }
        return zzW((zz0K) obj);
    }

    public final int getValue() {
        return this.zzZn;
    }

    public int hashCode() {
        return this.zzZn;
    }

    public final double zzZsA() {
        return ((double) this.zzZn) / 100.0d;
    }

    public final zz0K zzZsB() {
        return (zz0K) memberwiseClone();
    }

    public final double zzZsz() {
        return com.aspose.words.internal.zzSA.zzp(zzZsA());
    }

    public zz0K(int i) {
        this.zzZn = i;
    }
}
