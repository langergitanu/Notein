package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZMK extends zzYJC implements zzZCY, Cloneable {
    private WordAttrCollection zzYwg;

    public zzZMK(WordAttrCollection wordAttrCollection, String str, com.aspose.words.internal.zzZQ9 zzzq9) {
        super(str, zzzq9);
        if (wordAttrCollection == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: revPr");
        }
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: author");
        }
        this.zzYwg = wordAttrCollection;
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
        zzZMK zzzmk = (zzZMK) memberwiseClone();
        zzzmk.zzYwg = (WordAttrCollection) this.zzYwg.zzbn();
        return zzzmk;
    }

    @Override // com.aspose.words.zzZCY
    @ReservedForInternalUse
    @Deprecated
    public boolean isInheritedComplexAttr() {
        return false;
    }

    public final void zzY(WordAttrCollection wordAttrCollection) {
        this.zzYwg = wordAttrCollection;
    }

    public final WordAttrCollection zzZ6C() {
        return this.zzYwg;
    }
}
