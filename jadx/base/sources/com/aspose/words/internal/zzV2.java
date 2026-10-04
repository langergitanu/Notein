package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzV2 implements zzHD {
    private zzP8 zzSr;
    private zzUZ zzSs;
    private zzV1 zzSt = new zzV1();

    @Override // com.aspose.words.internal.zzHD
    public final zzV1 zzUK() {
        return this.zzSt;
    }

    public final zzP8 zzUv() {
        return this.zzSr;
    }

    public final zzUZ zzUw() {
        return this.zzSs;
    }

    public final boolean zzUx() {
        return this.zzSs != null;
    }

    @Override // com.aspose.words.internal.zzHD
    public final void zzUy() {
        zzP8 zzp8ZzUu = this.zzSt.zzUu();
        this.zzSr = zzp8ZzUu;
        zzp8ZzUu.zzY(new zzP9(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f));
    }

    @Override // com.aspose.words.internal.zzHD
    public final void zzY(zzUZ zzuz) {
        this.zzSs = zzuz;
    }

    @Override // com.aspose.words.internal.zzHD
    public final void zzZe(int i) {
    }

    @Override // com.aspose.words.internal.zzHD
    public final void zzZf(int i) {
    }
}
