package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZV8 extends zzYJC implements zzZCY, Cloneable {
    private int zzL4;

    public zzZV8(int i) {
        this(i, "", com.aspose.words.internal.zzZQ9.zz35);
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
        return (zzZV8) memberwiseClone();
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

    public final zzZV8 zzZjO() {
        return (zzZV8) memberwiseClone();
    }

    public zzZV8(int i, String str, com.aspose.words.internal.zzZQ9 zzzq9) {
        super(str, zzzq9);
        this.zzL4 = i;
    }
}
