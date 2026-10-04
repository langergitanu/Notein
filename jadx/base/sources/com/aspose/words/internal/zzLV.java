package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzLV extends zzMG {
    private boolean zzDM;
    private boolean zzDo;
    private long[] zzDp;

    public zzLV(boolean z, boolean z2) {
        this.zzDo = z;
        this.zzDM = z2;
    }

    @Override // com.aspose.words.internal.zzMG
    public final boolean isEmpty() {
        return this.zzDp.length == 0;
    }

    @Override // com.aspose.words.internal.zzMG
    public final boolean zzJR() {
        return this.zzDM;
    }

    @Override // com.aspose.words.internal.zzMO
    public final void zzK0() throws Exception {
        zzJJ().zzMY();
        this.zzDp = this.zzDo ? zzJJ().zzMT() : zzJJ().zzMU();
    }

    @Override // com.aspose.words.internal.zzMG
    public final zzP5 zzc(long j) {
        return zzP5.zzX(this.zzDM ? zzMG.zzY(this.zzDp, j) : this.zzDp, false, false);
    }
}
