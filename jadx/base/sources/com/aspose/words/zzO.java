package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzO implements zzZCY, Cloneable {
    private String zzZGu;
    private CompositeNode zzZGv;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.zzZCY
    public final zzZCY deepCloneComplexAttr() {
        zzO zzo = (zzO) memberwiseClone();
        CompositeNode compositeNode = this.zzZGv;
        zzo.zzZGv = compositeNode != null ? (CompositeNode) compositeNode.deepClone(true) : null;
        return zzo;
    }

    public final int hashCode() {
        CompositeNode compositeNode = this.zzZGv;
        int iHashCode = (compositeNode != null ? compositeNode.getClass().hashCode() : 0) * 397;
        String str = this.zzZGu;
        return iHashCode ^ (str != null ? str.hashCode() : 0);
    }

    @Override // com.aspose.words.zzZCY
    public final boolean isInheritedComplexAttr() {
        return false;
    }

    public final void zzTH(String str) {
        this.zzZGu = str;
    }

    public final void zzZ(CompositeNode compositeNode) {
        this.zzZGv = compositeNode;
    }

    public final CompositeNode zzbR() {
        return this.zzZGv;
    }
}
