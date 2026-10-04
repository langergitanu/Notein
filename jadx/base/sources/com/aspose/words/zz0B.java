package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz0B extends zz8E {
    private double zzZh2;
    private double zzyn;

    @Override // com.aspose.words.zz8E
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        zz0B zz0b = (zz0B) obj;
        return com.aspose.words.internal.zzZKO.equals(Double.valueOf(zz0b.zzyn), Double.valueOf(this.zzyn)) && com.aspose.words.internal.zzAN.zzL(zz0b.zzZh2, this.zzZh2);
    }

    @Override // com.aspose.words.zz8E
    public final int getType() {
        return 16;
    }

    @Override // com.aspose.words.zz8E
    public final int hashCode() {
        return (super.hashCode() ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzZh2)) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzyn);
    }

    public final double zzGw() {
        return this.zzyn;
    }

    public final void zzYU(double d) {
        this.zzZh2 = d;
    }

    public final double zzZQV() {
        return this.zzZh2;
    }

    public final void zzZS(double d) {
        this.zzyn = d;
    }
}
