package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZTZ extends zzZU0 {
    private long zzDK;
    private long zzDL;
    private zzZQ4 zzG8;

    @Override // com.aspose.words.internal.zzZU0
    public final boolean isEmpty() {
        return this.zzG8.isEmpty();
    }

    @Override // com.aspose.words.internal.zzZU0
    public final zzP8 zzJL() {
        return zz9K.zzY(this.zzG8, this.zzDL, this.zzDK);
    }

    @Override // com.aspose.words.internal.zzZUN
    public final void zzK0() throws Exception {
        this.zzDK = zzmY().zzN1();
        this.zzDL = zzmY().zzN1();
        this.zzG8 = zzmY().zzn0();
    }
}
