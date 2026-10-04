package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZRF {
    private String mName;
    private zzYTT zzYHI;

    public zzZRF(String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        this.mName = com.aspose.words.internal.zzZKN.zzU2(str);
        this.zzYHI = new zzYTT(1, 0);
    }

    public final String getName() {
        return this.mName;
    }

    public final String toString() {
        return this.mName + " " + this.zzYHI;
    }

    public final zzYTT zzZh0() {
        return this.zzYHI;
    }
}
