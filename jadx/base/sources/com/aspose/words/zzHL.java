package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzHL extends zz8E {
    private double zzZh0;

    @Override // com.aspose.words.zz8E
    public final boolean equals(Object obj) {
        if (super.equals(obj)) {
            return com.aspose.words.internal.zzAN.zzL(((zzHL) obj).zzZh0, this.zzZh0);
        }
        return false;
    }

    @Override // com.aspose.words.zz8E
    public final int getType() {
        return 6;
    }

    @Override // com.aspose.words.zz8E
    public final int hashCode() {
        return super.hashCode() ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzZh0);
    }

    public final void zzYT(double d) {
        this.zzZh0 = d;
    }

    public final double zzZQU() {
        return this.zzZh0;
    }
}
