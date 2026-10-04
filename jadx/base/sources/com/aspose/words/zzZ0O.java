package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ0O implements Cloneable {
    private int zzY1g = 2;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final int getHorizontalAlignment() {
        return this.zzY1g;
    }

    public final void setHorizontalAlignment(int i) {
        if (i == 1 || i == 2 || i == 3) {
            this.zzY1g = i;
        } else {
            this.zzY1g = 2;
        }
    }

    public final zzZ0O zzYFs() {
        return (zzZ0O) memberwiseClone();
    }
}
