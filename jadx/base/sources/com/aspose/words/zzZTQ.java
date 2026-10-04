package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZTQ extends zzZT9 {
    private int zzYKh;

    public zzZTQ(int i, int i2) {
        super(i);
        this.zzYKh = i2;
    }

    @Override // com.aspose.words.zzZT9
    public final boolean isComplex() {
        return true;
    }

    public abstract void zzC(com.aspose.words.internal.zzZOX zzzox) throws Exception;

    public final void zzEj(int i) {
        this.zzYKh = i;
    }

    public abstract void zzS(com.aspose.words.internal.zzZOW zzzow) throws Exception;

    public final int zzZiF() {
        return this.zzYKh;
    }

    @Override // com.aspose.words.zzZT9
    public final int zzZiG() {
        return 0;
    }
}
