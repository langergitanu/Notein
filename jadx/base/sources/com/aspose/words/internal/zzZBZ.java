package com.aspose.words.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZBZ implements zzZD1 {
    private zzZD0 zzWI0;

    public zzZBZ(zzZD0 zzzd0) {
        this.zzWI0 = zzzd0;
    }

    @Override // com.aspose.words.internal.zzZBI
    public final zzZD5 zzXKI() throws IOException {
        return new zzZC0(this.zzWI0.zzXKz(), (byte) 0);
    }

    @Override // com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        try {
            return zzXKI();
        } catch (IOException e) {
            throw new zzZD6(e.getMessage(), e);
        }
    }
}
