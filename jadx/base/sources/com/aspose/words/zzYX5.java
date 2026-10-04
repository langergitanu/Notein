package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYX5 extends zzYJC implements zzZCY, Cloneable {
    private int zzL4;

    public zzYX5(int i, String str, com.aspose.words.internal.zzZQ9 zzzq9) {
        super(str, zzzq9);
        this.zzL4 = i;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.zzZCY
    public zzZCY deepCloneComplexAttr() {
        return (zzYX5) memberwiseClone();
    }

    public final int getType() {
        return this.zzL4;
    }

    @Override // com.aspose.words.zzZCY
    @ReservedForInternalUse
    @Deprecated
    public boolean isInheritedComplexAttr() {
        return false;
    }

    public final zzYX5 zzYBA() {
        return (zzYX5) memberwiseClone();
    }
}
