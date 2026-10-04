package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz1M extends zz2F implements Cloneable {
    private double zzZgi;

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
            return com.aspose.words.internal.zzAN.zzL(((zz1M) obj).zzZgi, this.zzZgi);
        }
        return false;
    }

    @Override // com.aspose.words.zz2F
    public final int hashCode() {
        return super.hashCode() ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzZgi);
    }

    public final void zzYL(double d) {
        this.zzZgi = d;
    }

    public final double zzZPS() {
        return this.zzZgi;
    }

    @Override // com.aspose.words.zz2F
    public final int zzZvh() {
        return 3;
    }

    @Override // com.aspose.words.zz2F
    public final zz2F zzZvi() {
        return (zz1M) memberwiseClone();
    }
}
