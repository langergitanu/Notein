package com.aspose.words.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZAO {
    private zzZDA zzWFS;
    private zzZCX zzWFy;

    public zzZAO(zzZD3 zzzd3) throws IOException {
        this.zzWFS = (zzZDA) zzzd3.zzXKC();
        this.zzWFy = (zzZCX) zzzd3.zzXKC();
    }

    public final zzZDK zzXJU() throws IOException {
        zzZCX zzzcx = this.zzWFy;
        if (zzzcx != null) {
            return zzzcx.zzYR(0, true);
        }
        return null;
    }
}
