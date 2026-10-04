package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzEV extends zz80 implements Cloneable {
    private int zzTL;
    private zzD9 zzZyx;

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

    public final void setIndex(int i) {
        this.zzTL = i;
    }

    public final void zzZ(zzD9 zzd9) {
        this.zzZyx = zzd9;
    }

    public final zzEV zzZLP() {
        zzEV zzev = (zzEV) memberwiseClone();
        zzD9 zzd9 = this.zzZyx;
        if (zzd9 != null) {
            zzev.zzZyx = zzd9.zzZI4();
        }
        zzev.setExtensions(zzZBz());
        return zzev;
    }

    public final zzD9 zzaQ() {
        return this.zzZyx;
    }
}
