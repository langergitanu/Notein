package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZCR implements zzZD8 {
    private zzZD0 zzWI0;

    public zzZCR(zzZD0 zzzd0) {
        this.zzWI0 = zzzd0;
    }

    @Override // com.aspose.words.internal.zzZBI
    public final zzZD5 zzXKI() throws IOException {
        return new zzZCS(zzYG9.zzJ(zzXKJ()));
    }

    @Override // com.aspose.words.internal.zzZD8
    public final InputStream zzXKJ() {
        return new zzZCJ(this.zzWI0);
    }

    @Override // com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        try {
            return zzXKI();
        } catch (IOException e) {
            throw new zzZD6(C21111o0ooOoO.OooO00o(e, new StringBuilder("IOException converting stream to byte array: ")), e);
        }
    }
}
