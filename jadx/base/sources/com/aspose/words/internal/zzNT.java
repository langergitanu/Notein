package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzNT implements zzHL {
    private zzNQ zzFf;
    private zzF8 zzFg;
    private zzGQ zzFh;

    public zzNT(long j, zzZQ4 zzzq4, zzN3 zzn3, zzGQ zzgq, zzF8 zzf8) {
        this.zzFh = zzgq;
        this.zzFg = zzf8;
        this.zzFf = new zzNQ(j, zzzq4, zzn3);
    }

    @Override // com.aspose.words.internal.zzHL
    public final zzF8 zzMj() {
        return this.zzFg;
    }

    @Override // com.aspose.words.internal.zzHL
    public final zzGQ zzMk() {
        return this.zzFh;
    }

    @Override // com.aspose.words.internal.zzHL
    public final zzHJ zzMl() {
        return this.zzFf;
    }

    @Override // com.aspose.words.internal.zzHL
    public final zzHP zzMm() {
        return new zzNS(this);
    }
}
