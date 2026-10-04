package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZNW implements zzZCW, zzZCY, Cloneable {
    private int zzYG;
    private int zzZn;

    public zzZNW(int i, int i2) {
        this.zzZn = i;
        this.zzYG = i2;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.zzZCY
    public final zzZCY deepCloneComplexAttr() {
        return (zzZNW) memberwiseClone();
    }

    public final boolean equals(Object obj) {
        if (obj == null || zzZNW.class != obj.getClass()) {
            return false;
        }
        return zzZ((zzZNW) obj);
    }

    public final int getId() {
        return this.zzYG;
    }

    public final int getValue() {
        return this.zzZn;
    }

    public final int hashCode() {
        return this.zzZn ^ this.zzYG;
    }

    @Override // com.aspose.words.zzZCY
    public final boolean isInheritedComplexAttr() {
        return false;
    }

    @Override // com.aspose.words.zzZCW
    public final boolean zzZ(zzZCW zzzcw) {
        return zzzcw != null && zzZNW.class == zzzcw.getClass() && this.zzZn == ((zzZNW) zzzcw).zzZn;
    }

    private boolean zzZ(zzZNW zzznw) {
        return this.zzZn == zzznw.zzZn && this.zzYG == zzznw.zzYG;
    }
}
