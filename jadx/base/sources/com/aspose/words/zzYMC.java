package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYMC {
    protected zzYMD zzXFA;
    protected zzTF zzZss;

    public zzYMC(zzTF zztf) {
        this.zzZss = zztf;
    }

    public static zzYMC zzV(zzYIA zzyia) {
        return ((zzY6N) ((zzYIC) zzyia.zza9()).zza9()).zzY6a().zzZz() ? new zzWS(zzyia) : new zzWR(zzyia);
    }

    public abstract boolean isFinished();

    public abstract boolean isStarted();

    public abstract boolean moveNext();

    public final zzYMD zzYnU() {
        if (!isStarted() || isFinished()) {
            return null;
        }
        return this.zzXFA;
    }
}
