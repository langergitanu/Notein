package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzHP extends zz8E {
    private double zzZh2;

    @Override // com.aspose.words.zz8E
    public final boolean equals(Object obj) {
        if (super.equals(obj)) {
            return com.aspose.words.internal.zzAN.zzL(((zzHP) obj).zzZh2, this.zzZh2);
        }
        return false;
    }

    @Override // com.aspose.words.zz8E
    public final int getType() {
        return 5;
    }

    @Override // com.aspose.words.zz8E
    public final int hashCode() {
        return super.hashCode() ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzZh2);
    }

    public final void zzYU(double d) {
        this.zzZh2 = d;
    }

    public final double zzZQV() {
        return this.zzZh2;
    }
}
