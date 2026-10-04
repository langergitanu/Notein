package com.aspose.words.internal;

import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzZBE extends InputStream {
    private int zzWIc;
    protected final InputStream zzWId;

    public zzZBE(InputStream inputStream, int i) {
        this.zzWId = inputStream;
        this.zzWIc = i;
    }

    public int getRemaining() {
        return this.zzWIc;
    }

    public final void zzXKo() {
        InputStream inputStream = this.zzWId;
        if (inputStream instanceof zzZBH) {
            ((zzZBH) inputStream).zzOP(true);
        }
    }
}
