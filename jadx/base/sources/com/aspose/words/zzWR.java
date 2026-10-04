package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzWR extends zzYMC {
    public zzWR(zzYIA zzyia) {
        super(zzyia);
    }

    @Override // com.aspose.words.zzYMC
    public final boolean isFinished() {
        return isStarted() && ((zzWT) this.zzXFA).isVirtual();
    }

    @Override // com.aspose.words.zzYMC
    public final boolean isStarted() {
        return this.zzXFA != null;
    }

    @Override // com.aspose.words.zzYMC
    public final boolean moveNext() {
        if (!isStarted()) {
            this.zzXFA = (zzWT) ((zzYIA) this.zzZss).zz6x();
        } else if (!isFinished()) {
            this.zzXFA = this.zzXFA.zz5Z();
        }
        return !isFinished();
    }
}
