package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zz7M implements Cloneable {
    private String zzZ3F;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final String getSource() {
        return this.zzZ3F;
    }

    public final void zzOE(String str) {
        this.zzZ3F = str;
    }

    public abstract double zzX(zzZCC zzzcc);

    public final zz7M zzZAR() {
        return (zz7M) memberwiseClone();
    }
}
