package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zz98 extends zz80 implements Cloneable {
    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public abstract void zzZ(zzZCK zzzck);

    public zz98 zzZFO() {
        return (zz98) memberwiseClone();
    }

    public abstract int zzZSn();
}
