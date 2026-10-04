package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZSY extends zzZT7 {
    private zzZT8 zzYJx;

    public zzZSY() {
        this(false);
    }

    @Override // com.aspose.words.zzZT7
    public final void zzD(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzYJx.clear();
        this.zzYJx.zzZ(zzzox, zzZii().zzZim(), getWarningCallback());
    }

    @Override // com.aspose.words.zzZT7
    public final void zzZ(zzZSP zzzsp) throws Exception {
        zzZii().zzE7(this.zzYJx.getCount());
        this.zzYJx.zzV(zzzsp.zzZi3());
    }

    public final zzZT8 zzZi4() {
        return this.zzYJx;
    }

    public zzZSY(boolean z) {
        super(z ? 61730 : 61451, 3);
        this.zzYJx = new zzZT8();
    }
}
