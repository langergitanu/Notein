package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzWS extends zzYMC {
    public zzWS(zzYIA zzyia) {
        super(zzyia);
        this.zzXFA = (zzWT) zzyia.zz6w();
    }

    @Override // com.aspose.words.zzYMC
    public final boolean isFinished() {
        return this.zzXFA == null;
    }

    @Override // com.aspose.words.zzYMC
    public final boolean isStarted() {
        return isFinished() || !((zzWT) this.zzXFA).isVirtual();
    }

    @Override // com.aspose.words.zzYMC
    public final boolean moveNext() {
        if (!isFinished()) {
            this.zzXFA = this.zzXFA.zz5Y();
        }
        return !isFinished();
    }
}
