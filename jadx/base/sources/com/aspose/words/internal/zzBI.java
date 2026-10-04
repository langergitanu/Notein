package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzBI {
    private zzZQ4 zzZL;
    private long zzsE;

    public zzBI(zzZQ4 zzzq4, long j) {
        this.zzZL = zzzq4;
        this.zzsE = j;
    }

    public final boolean isEmpty() {
        return this.zzZL.isEmpty();
    }

    public final zzZQ4 zzBE() {
        return new zzZQ4(this.zzZL.getX(), zzZPW.zzYz(this.zzsE) - this.zzZL.zzZn(), this.zzZL.getWidth(), this.zzZL.getHeight());
    }
}
