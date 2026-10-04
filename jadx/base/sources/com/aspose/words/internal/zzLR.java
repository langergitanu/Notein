package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzLR extends zzM4 {
    private long zzDb;
    private zzZQ4 zzG8;

    @Override // com.aspose.words.internal.zzM4
    public final boolean isEmpty() {
        return this.zzG8.isEmpty();
    }

    @Override // com.aspose.words.internal.zzM4
    public final zzP8 zzJL() {
        return zz9K.zzY(this.zzG8, this.zzDb);
    }

    @Override // com.aspose.words.internal.zzMO
    public final void zzK0() throws Exception {
        this.zzG8 = zzJJ().zzMY();
        this.zzDb = zzJJ().zzMZ();
    }
}
