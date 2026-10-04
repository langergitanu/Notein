package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzLW extends zzM4 {
    private long[] zzDl;
    private boolean zzDo;

    public zzLW(boolean z) {
        this.zzDo = z;
    }

    @Override // com.aspose.words.internal.zzM4
    public final boolean isEmpty() {
        return this.zzDl.length == 0;
    }

    @Override // com.aspose.words.internal.zzM4
    public final zzP8 zzJL() {
        return zzP8.zzY(this.zzDl, false, true);
    }

    @Override // com.aspose.words.internal.zzMO
    public final void zzK0() throws Exception {
        zzJJ().zzMY();
        this.zzDl = this.zzDo ? zzJJ().zzMT() : zzJJ().zzMU();
    }
}
