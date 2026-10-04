package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zz8E implements Cloneable {
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return com.aspose.words.internal.zzZ4.zzW(this, obj) && ((zz8E) obj).getType() == getType();
    }

    public abstract int getType();

    public int hashCode() {
        return getType();
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public zz8E zzZQY() {
        return (zz8E) memberwiseClone();
    }
}
