package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYDG implements Cloneable {
    public abstract int getType();

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public zzYDG zzYcY() {
        return (zzYDG) memberwiseClone();
    }
}
