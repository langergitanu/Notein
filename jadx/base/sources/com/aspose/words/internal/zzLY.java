package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzLY extends zzM4 {
    private long[][] zzDk;
    private boolean zzDo;

    public zzLY(boolean z) {
        this.zzDo = z;
    }

    @Override // com.aspose.words.internal.zzM4
    public final boolean isEmpty() {
        return this.zzDk.length == 0;
    }

    @Override // com.aspose.words.internal.zzM4
    public final boolean zzJB() {
        return false;
    }

    @Override // com.aspose.words.internal.zzM4
    public final zzP8 zzJL() {
        return zz9K.zzZ(this.zzDk, false);
    }

    @Override // com.aspose.words.internal.zzMO
    public final void zzK0() throws Exception {
        zzJJ().zzMY();
        this.zzDk = this.zzDo ? zzJJ().zzMR() : zzJJ().zzMS();
    }
}
