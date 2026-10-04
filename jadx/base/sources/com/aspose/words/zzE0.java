package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzE0 extends zz80 implements Cloneable {
    private String mName;
    private int zzZbB;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final String getName() {
        return this.mName;
    }

    public final void setName(String str) {
        this.mName = str;
    }

    public final void zzKH(int i) {
        this.zzZbB = i;
    }

    public final int zzZKS() {
        return this.zzZbB;
    }

    public final zzE0 zzZKT() {
        zzE0 zze0 = (zzE0) memberwiseClone();
        zze0.setExtensions(zzZBz());
        return zze0;
    }
}
