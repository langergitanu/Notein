package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzH3 extends zz8E {
    private double zzZh5;

    @Override // com.aspose.words.zz8E
    public final boolean equals(Object obj) {
        if (super.equals(obj)) {
            return com.aspose.words.internal.zzAN.zzL(((zzH3) obj).zzZh5, this.zzZh5);
        }
        return false;
    }

    @Override // com.aspose.words.zz8E
    public final int getType() {
        return 7;
    }

    @Override // com.aspose.words.zz8E
    public final int hashCode() {
        return super.hashCode() ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzZh5);
    }

    public final void zzYV(double d) {
        this.zzZh5 = d;
    }

    public final double zzZQZ() {
        return this.zzZh5;
    }
}
