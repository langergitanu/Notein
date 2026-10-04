package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzHF implements Cloneable {
    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final zzHF zzZQI() {
        return (zzHF) memberwiseClone();
    }
}
