package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz7W extends zz8E implements Cloneable {
    private int zzZ3U;
    private zz7X zzZjf;

    @Override // com.aspose.words.zz8E
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        zz7W zz7w = (zz7W) obj;
        return com.aspose.words.internal.zzZKO.equals(zz7w.zzZjf, this.zzZjf) && zz7w.zzZ3U == this.zzZ3U;
    }

    public final zz7X getFill() {
        return this.zzZjf;
    }

    @Override // com.aspose.words.zz8E
    public final int getType() {
        return 12;
    }

    @Override // com.aspose.words.zz8E
    public final int hashCode() {
        return (super.hashCode() ^ this.zzZjf.hashCode()) ^ this.zzZ3U;
    }

    @Override // com.aspose.words.zz8E
    public final Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void setFill(zz7X zz7x) {
        this.zzZjf = zz7x;
    }

    public final void zzIb(int i) {
        this.zzZ3U = i;
    }

    public final int zzZBl() {
        return this.zzZ3U;
    }

    @Override // com.aspose.words.zz8E
    public final zz8E zzZQY() {
        zz7W zz7w = (zz7W) memberwiseClone();
        zz7X zz7x = this.zzZjf;
        if (zz7x != null) {
            zz7w.zzZjf = zz7x.zzZQ6();
        }
        return zz7w;
    }
}
