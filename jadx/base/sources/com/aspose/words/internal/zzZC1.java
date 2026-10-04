package com.aspose.words.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZC1 implements zzZD3 {
    private zzZD0 zzWI0;

    public zzZC1(zzZD0 zzzd0) {
        this.zzWI0 = zzzd0;
    }

    @Override // com.aspose.words.internal.zzZD3
    public final zzZDK zzXKC() throws IOException {
        return this.zzWI0.zzXKC();
    }

    @Override // com.aspose.words.internal.zzZBI
    public final zzZD5 zzXKI() throws IOException {
        return new zzZC2(this.zzWI0.zzXKz());
    }

    @Override // com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        try {
            return zzXKI();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
}
