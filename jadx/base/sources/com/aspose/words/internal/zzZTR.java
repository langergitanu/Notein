package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZTR extends zzZU0 {
    private long zzDb;
    private zzZQ4 zzG8;

    @Override // com.aspose.words.internal.zzZU0
    public final boolean isEmpty() {
        return this.zzG8.isEmpty();
    }

    @Override // com.aspose.words.internal.zzZU0
    public final zzP8 zzJL() {
        return zz9K.zzY(this.zzG8, this.zzDb);
    }

    @Override // com.aspose.words.internal.zzZUN
    public final void zzK0() throws Exception {
        this.zzDb = zzmY().zzMZ();
        this.zzG8 = zzmY().zzn0();
    }

    public final zzZQ4 zzZj() {
        return this.zzG8;
    }
}
