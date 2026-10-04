package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzPY implements Cloneable {
    private int zzKi;

    public zzPY(int i) {
        this.zzKi = i;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public static zzPY zzPJ() {
        return new zzOI(zzPV.zzHZ);
    }

    public boolean isEmpty() {
        return false;
    }

    public final int zzPH() {
        return this.zzKi;
    }

    public zzPY zzPI() {
        return (zzPY) memberwiseClone();
    }

    public abstract void zzZ(zzH5 zzh5) throws Exception;

    public abstract void zzZ(zzPW zzpw) throws Exception;
}
