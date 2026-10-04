package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzOX extends zzON {
    private zzP8 zzSq;

    public zzOX(zzP8 zzp8) {
        this.zzSq = zzp8;
    }

    @Override // com.aspose.words.internal.zzON
    public final zzON zzM(zzP9 zzp9) {
        zzP8 zzp8ZzO8 = this.zzSq.zzO8();
        zzp8ZzO8.zzY(zzp9);
        return new zzOX(zzp8ZzO8);
    }

    @Override // com.aspose.words.internal.zzON
    public final zzP8 zzNR() {
        return this.zzSq.zzO8();
    }

    public final zzP8 zzUu() {
        return this.zzSq;
    }

    @Override // com.aspose.words.internal.zzON
    public final void zzZ(zzH1 zzh1) throws Exception {
        zzh1.zzZ(this);
    }
}
