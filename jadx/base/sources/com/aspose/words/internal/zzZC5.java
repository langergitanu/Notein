package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZC5 implements zzZD8 {
    private zzZBJ zzWHQ;

    public zzZC5(zzZBJ zzzbj) {
        this.zzWHQ = zzzbj;
    }

    @Override // com.aspose.words.internal.zzZBI
    public final zzZD5 zzXKI() throws IOException {
        return new zzZC6(this.zzWHQ.toByteArray());
    }

    @Override // com.aspose.words.internal.zzZD8
    public final InputStream zzXKJ() {
        return this.zzWHQ;
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
