package com.aspose.words;

import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;

/* JADX INFO: loaded from: classes6.dex */
final class zzZRG {
    int zzYHJ;
    int zzYHK;

    public zzZRG() {
        this.zzYHK = 0;
        this.zzYHJ = 0;
    }

    public final String toString() {
        int i = this.zzYHK;
        return (i == 0 && this.zzYHJ == 0) ? CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR : com.aspose.words.internal.zzZKN.format("{0}, {1}", Integer.valueOf(i), Integer.valueOf(this.zzYHJ));
    }

    public final void zzZ(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzYHK = zzzox.zzXc();
        this.zzYHJ = zzzox.zzXc();
    }

    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzl(this.zzYHK);
        zzzow.zzl(this.zzYHJ);
    }

    public zzZRG(int i, int i2) {
        this.zzYHK = i;
        this.zzYHJ = i2;
    }
}
