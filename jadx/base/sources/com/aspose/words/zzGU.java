package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzGU extends zz8E {
    private double zzZgi;
    private boolean zzZgk = true;
    private boolean zzZgj = true;
    private com.aspose.words.internal.zzPV zzqB = new com.aspose.words.internal.zzPV(1, 255, 255, 255);

    @Override // com.aspose.words.zz8E
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        zzGU zzgu = (zzGU) obj;
        return zzgu.zzZgj == this.zzZgj && com.aspose.words.internal.zzAN.zzL(zzgu.zzZgi, this.zzZgi);
    }

    @Override // com.aspose.words.zz8E
    public final int getType() {
        return 8;
    }

    @Override // com.aspose.words.zz8E
    public final int hashCode() {
        return (super.hashCode() ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzZgi)) ^ com.aspose.words.internal.zzZKP.zzYY(this.zzZgj);
    }

    public final void zzM(com.aspose.words.internal.zzPV zzpv) {
        this.zzqB = zzpv;
    }

    public final com.aspose.words.internal.zzPV zzOK() {
        return this.zzqB;
    }

    public final void zzY5(boolean z) {
        this.zzZgj = z;
    }

    public final void zzYL(double d) {
        this.zzZgi = d;
    }

    public final void zzZPQ() {
        this.zzZgk = false;
    }

    public final boolean zzZPR() {
        return this.zzZgk;
    }

    public final double zzZPS() {
        return this.zzZgi;
    }

    public final boolean zzZPT() {
        return this.zzZgj;
    }
}
