package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzBQ extends zz8E implements Cloneable {
    private zzBW zzZh4;

    @Override // com.aspose.words.zz8E
    public final boolean equals(Object obj) {
        if (super.equals(obj)) {
            return com.aspose.words.internal.zzZKO.equals(((zzBQ) obj).zzZh4, this.zzZh4);
        }
        return false;
    }

    @Override // com.aspose.words.zz8E
    public final int getType() {
        return 10;
    }

    @Override // com.aspose.words.zz8E
    public final int hashCode() {
        int iHashCode = super.hashCode();
        zzBW zzbw = this.zzZh4;
        return zzbw != null ? iHashCode ^ zzbw.hashCode() : iHashCode;
    }

    @Override // com.aspose.words.zz8E
    public final Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zzZ(zzBW zzbw) {
        this.zzZh4 = zzbw;
    }

    public final zzBW zzZQX() {
        return this.zzZh4;
    }

    @Override // com.aspose.words.zz8E
    public final zz8E zzZQY() {
        zzBQ zzbq = (zzBQ) memberwiseClone();
        zzBW zzbw = this.zzZh4;
        if (zzbw != null) {
            zzbq.zzZh4 = zzbw.zzZHt();
        }
        return zzbq;
    }
}
