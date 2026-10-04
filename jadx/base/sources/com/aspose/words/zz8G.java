package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz8G extends zz8E implements Cloneable {
    private zzBW zzZ56;
    private zzBW zzZ57;

    @Override // com.aspose.words.zz8E
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        zz8G zz8g = (zz8G) obj;
        return com.aspose.words.internal.zzZKO.equals(zz8g.zzZ57, this.zzZ57) && com.aspose.words.internal.zzZKO.equals(zz8g.zzZ56, this.zzZ56);
    }

    @Override // com.aspose.words.zz8E
    public final int getType() {
        return 11;
    }

    @Override // com.aspose.words.zz8E
    public final int hashCode() {
        int iHashCode = super.hashCode();
        zzBW zzbw = this.zzZ57;
        if (zzbw != null) {
            iHashCode ^= zzbw.hashCode();
        }
        zzBW zzbw2 = this.zzZ56;
        return zzbw2 != null ? iHashCode ^ zzbw2.hashCode() : iHashCode;
    }

    @Override // com.aspose.words.zz8E
    public final Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zzQ(zzBW zzbw) {
        this.zzZ56 = zzbw;
    }

    public final void zzR(zzBW zzbw) {
        this.zzZ57 = zzbw;
    }

    public final zzBW zzZC9() {
        return this.zzZ56;
    }

    public final zzBW zzZCa() {
        return this.zzZ57;
    }

    @Override // com.aspose.words.zz8E
    public final zz8E zzZQY() {
        zz8G zz8g = (zz8G) memberwiseClone();
        zzBW zzbw = this.zzZ57;
        if (zzbw != null) {
            zz8g.zzZ57 = zzbw.zzZHt();
        }
        zzBW zzbw2 = this.zzZ56;
        if (zzbw2 != null) {
            zz8g.zzZ56 = zzbw2.zzZHt();
        }
        return zz8g;
    }
}
