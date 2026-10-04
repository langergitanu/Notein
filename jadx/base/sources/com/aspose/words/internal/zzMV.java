package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzMV extends zzM4 {
    private long zzDK;
    private long zzDL;
    private zzZQ4 zzG8;

    @Override // com.aspose.words.internal.zzM4
    public final boolean isEmpty() {
        return this.zzG8.isEmpty();
    }

    @Override // com.aspose.words.internal.zzM4
    public final zzP8 zzJL() {
        return zz9K.zzX(this.zzG8, this.zzDL, this.zzDK);
    }

    @Override // com.aspose.words.internal.zzMO
    public final void zzK0() throws Exception {
        this.zzG8 = zzJJ().zzMY();
        this.zzDL = zzJJ().zzN1();
        this.zzDK = zzJJ().zzN1();
    }
}
