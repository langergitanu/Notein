package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz29 extends zz2F implements Cloneable {
    private zz7W zzYZ0 = new zz7W();

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.zz2F
    public final boolean equals(Object obj) {
        if (super.equals(obj)) {
            return com.aspose.words.internal.zzZKO.equals(((zz29) obj).zzYZ0, this.zzYZ0);
        }
        return false;
    }

    @Override // com.aspose.words.zz2F
    public final int hashCode() {
        return super.hashCode() ^ this.zzYZ0.hashCode();
    }

    public final void setFill(zz7X zz7x) {
        this.zzYZ0.setFill(zz7x);
    }

    public final void zzIb(int i) {
        this.zzYZ0.zzIb(i);
    }

    public final zz7W zzZuP() {
        return this.zzYZ0;
    }

    @Override // com.aspose.words.zz2F
    public final int zzZvh() {
        return 0;
    }

    @Override // com.aspose.words.zz2F
    public final zz2F zzZvi() {
        zz29 zz29Var = (zz29) memberwiseClone();
        zz29Var.zzYZ0 = (zz7W) this.zzYZ0.zzZQY();
        return zz29Var;
    }
}
