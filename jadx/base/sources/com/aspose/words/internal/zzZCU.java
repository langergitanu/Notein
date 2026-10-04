package com.aspose.words.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZCU implements zzZDO {
    private final int tag;
    private final zzZD0 zzWI7;

    public zzZCU(int i, zzZD0 zzzd0) {
        this.tag = i;
        this.zzWI7 = zzzd0;
    }

    @Override // com.aspose.words.internal.zzZBI
    public final zzZD5 zzXKI() throws IOException {
        return new zzZCV(this.tag, this.zzWI7.zzXKz());
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
