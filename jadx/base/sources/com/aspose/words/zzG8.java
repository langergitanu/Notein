package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzG8 implements Cloneable {
    private int zzTL;
    private zzD9 zzZyx;

    public zzG8(int i, zzD9 zzd9) {
        this.zzTL = i;
        this.zzZyx = zzd9;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final int getIndex() {
        return this.zzTL;
    }

    public final zzG8 zzZOk() {
        zzG8 zzg8 = (zzG8) memberwiseClone();
        zzD9 zzd9 = this.zzZyx;
        if (zzd9 != null) {
            zzg8.zzZyx = zzd9.zzZI4();
        }
        return zzg8;
    }

    public final zzD9 zzaQ() {
        return this.zzZyx;
    }
}
