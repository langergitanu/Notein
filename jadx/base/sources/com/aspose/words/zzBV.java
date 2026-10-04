package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzBV extends zz8E {
    private boolean zzZ8b;
    private zzBW zzZ8c;
    private zzBW zzZ8d;

    @Override // com.aspose.words.zz8E
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        zzBV zzbv = (zzBV) obj;
        return zzbv.zzZ8b == this.zzZ8b && com.aspose.words.internal.zzZKO.equals(zzbv.zzZ8d, this.zzZ8d) && com.aspose.words.internal.zzZKO.equals(zzbv.zzZ8c, this.zzZ8c);
    }

    @Override // com.aspose.words.zz8E
    public final int getType() {
        return 9;
    }

    @Override // com.aspose.words.zz8E
    public final int hashCode() {
        int iHashCode = super.hashCode();
        zzBW zzbw = this.zzZ8d;
        if (zzbw != null) {
            iHashCode ^= zzbw.hashCode();
        }
        zzBW zzbw2 = this.zzZ8c;
        if (zzbw2 != null) {
            iHashCode ^= zzbw2.hashCode();
        }
        return iHashCode ^ com.aspose.words.internal.zzZKP.zzYY(this.zzZ8b);
    }

    public final void zzS(zzBW zzbw) {
        this.zzZ8c = zzbw;
    }

    public final void zzT(zzBW zzbw) {
        this.zzZ8d = zzbw;
    }

    public final void zzXs(boolean z) {
        this.zzZ8b = z;
    }

    public final boolean zzZFC() {
        return this.zzZ8b;
    }

    public final zzBW zzZFD() {
        return this.zzZ8c;
    }

    public final zzBW zzZFE() {
        return this.zzZ8d;
    }
}
