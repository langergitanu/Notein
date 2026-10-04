package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYY2 {
    private int zzXXQ;
    private boolean zzXXR;
    private int zzXXS;

    public zzYY2(int i) {
        long j = i;
        this.zzXXS = (int) (31 & j);
        this.zzXXR = com.aspose.words.internal.zzZQB.zzRr((int) (j & 128));
        this.zzXXQ = i >>> 8;
    }

    public final boolean isTerminated() {
        return this.zzXXR;
    }

    public final int zzYCA() {
        return this.zzXXQ;
    }

    public final int zzYCB() {
        return this.zzXXS;
    }
}
