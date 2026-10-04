package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz2I extends zz2F implements Cloneable {
    private zzGU zzYZh;

    public zz2I() {
        zzGU zzgu = new zzGU();
        this.zzYZh = zzgu;
        zzgu.zzZPQ();
    }

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
            return com.aspose.words.internal.zzZKO.equals(((zz2I) obj).zzYZh, this.zzYZh);
        }
        return false;
    }

    @Override // com.aspose.words.zz2F
    public final int hashCode() {
        return super.hashCode() ^ this.zzYZh.hashCode();
    }

    public final void zzM(com.aspose.words.internal.zzPV zzpv) {
        this.zzYZh.zzM(zzpv);
    }

    public final void zzY5(boolean z) {
        this.zzYZh.zzY5(z);
    }

    public final void zzYL(double d) {
        this.zzYZh.zzYL(d);
    }

    public final zzGU zzZvg() {
        return this.zzYZh;
    }

    @Override // com.aspose.words.zz2F
    public final int zzZvh() {
        return 4;
    }

    @Override // com.aspose.words.zz2F
    public final zz2F zzZvi() {
        zz2I zz2i = (zz2I) memberwiseClone();
        zzGU zzgu = this.zzYZh;
        if (zzgu != null) {
            zz2i.zzYZh = (zzGU) zzgu.zzZQY();
        }
        return zz2i;
    }
}
