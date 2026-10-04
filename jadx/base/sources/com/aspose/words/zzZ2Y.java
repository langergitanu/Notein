package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZ2Y implements zzZAG {
    private int zzY64 = -1;

    @Override // com.aspose.words.zzZAG
    public final boolean moveNext() throws Exception {
        if (zzYC()) {
            return false;
        }
        this.zzY64++;
        return !zzYC();
    }

    @Override // com.aspose.words.zzZAG
    public final void reset() throws Exception {
        this.zzY64 = -1;
    }

    public abstract boolean zzYC() throws Exception;

    public final int zzYK7() {
        return this.zzY64;
    }

    @Override // com.aspose.words.zzZAG
    public final boolean zzZha() {
        return true;
    }
}
