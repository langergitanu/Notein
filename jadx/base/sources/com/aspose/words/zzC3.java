package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzC3 extends zz80 implements Cloneable {
    private zz5G zzZ8k = new zz5G();

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final zz5G zzZFL() {
        return this.zzZ8k;
    }

    public abstract int zzZFM();

    public final zzC3 zzZFN() {
        zzC3 zzc3 = (zzC3) memberwiseClone();
        zzc3.zzZ8k = this.zzZ8k.zzZyr();
        zzc3.setExtensions(zzZBz());
        return zzc3;
    }
}
