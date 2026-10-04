package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYM2 implements Cloneable {
    private boolean zzXFe;
    private int zzZn;

    public zzYM2() {
        this(0, false);
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final int getValue() {
        return this.zzZn;
    }

    public final String toString() {
        return com.aspose.words.internal.zzZKN.format("{0}{1}", this.zzXFe ? "@" : "", Integer.valueOf(this.zzZn));
    }

    public final boolean zzY(zzYM2 zzym2) {
        if (com.aspose.words.internal.zzZKO.zzA(null, zzym2)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, zzym2)) {
            return true;
        }
        return this.zzZn == zzym2.zzZn && this.zzXFe == zzym2.zzXFe;
    }

    public final boolean zzYnC() {
        return this.zzXFe;
    }

    public final zzYM2 zzYnD() {
        return (zzYM2) memberwiseClone();
    }

    public zzYM2(int i) {
        this(i, false);
    }

    public zzYM2(int i, boolean z) {
        this.zzZn = i;
        this.zzXFe = z;
    }
}
