package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzUY implements zzHD {
    private zzD4 zzSg;
    private zzD4 zzSh;
    private zzUZ zzSs;

    public zzUY(zzD4 zzd4, zzD4 zzd42) {
        this.zzSh = zzd4;
        this.zzSg = zzd42;
    }

    @Override // com.aspose.words.internal.zzHD
    public final zzV1 zzUK() {
        return null;
    }

    public final zzUZ zzUw() {
        return this.zzSs;
    }

    public final boolean zzUx() {
        return this.zzSs != null;
    }

    @Override // com.aspose.words.internal.zzHD
    public final void zzUy() {
    }

    @Override // com.aspose.words.internal.zzHD
    public final void zzY(zzUZ zzuz) {
        this.zzSs = zzuz;
    }

    @Override // com.aspose.words.internal.zzHD
    public final void zzZe(int i) {
        this.zzSh.set(i, i);
    }

    @Override // com.aspose.words.internal.zzHD
    public final void zzZf(int i) {
        this.zzSg.set(i, i);
    }
}
