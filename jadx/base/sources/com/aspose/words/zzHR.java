package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzHR extends zz8E implements Cloneable {
    private zzBW zzZh4;

    @Override // com.aspose.words.zz8E
    public final boolean equals(Object obj) {
        if (super.equals(obj)) {
            return com.aspose.words.internal.zzZKO.equals(((zzHR) obj).zzZh4, this.zzZh4);
        }
        return false;
    }

    @Override // com.aspose.words.zz8E
    public final int getType() {
        return 3;
    }

    @Override // com.aspose.words.zz8E
    public final int hashCode() {
        return super.hashCode() ^ this.zzZh4.hashCode();
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
        zzHR zzhr = (zzHR) memberwiseClone();
        zzBW zzbw = this.zzZh4;
        if (zzbw != null) {
            zzhr.zzZh4 = zzbw.zzZHt();
        }
        return zzhr;
    }
}
