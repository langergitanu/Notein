package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ0V implements zzZCY, Cloneable {
    private int zzUG;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.zzZCY
    public final zzZCY deepCloneComplexAttr() {
        return (zzZCY) memberwiseClone();
    }

    public final int getAlignment() {
        return this.zzUG;
    }

    public final int hashCode() {
        return this.zzUG;
    }

    @Override // com.aspose.words.zzZCY
    public final boolean isInheritedComplexAttr() {
        return false;
    }

    public final void setAlignment(int i) {
        if (i > 255) {
            i = 255;
        } else if (i < 0) {
            i = 0;
        }
        this.zzUG = i;
    }

    public final boolean zzYFO() {
        return this.zzUG == 0;
    }
}
