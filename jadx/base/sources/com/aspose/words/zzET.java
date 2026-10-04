package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzET extends zz80 implements Cloneable {
    private zzD9 zzZyx = new zzD9();

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final zzET zzZLN() {
        zzET zzet = (zzET) memberwiseClone();
        zzD9 zzd9 = this.zzZyx;
        if (zzd9 != null) {
            zzet.zzZyx = zzd9.zzZI4();
        }
        zzet.setExtensions(zzZBz());
        return zzet;
    }

    public final zzD9 zzaQ() {
        return this.zzZyx;
    }
}
