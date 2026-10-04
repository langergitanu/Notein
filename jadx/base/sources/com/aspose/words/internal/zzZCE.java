package com.aspose.words.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZCE implements zzZBI, zzZDK {
    private zzZD0 zzWI0;

    public zzZCE(zzZD0 zzzd0) {
        this.zzWI0 = zzzd0;
    }

    @Override // com.aspose.words.internal.zzZBI
    public final zzZD5 zzXKI() throws IOException {
        try {
            return new zzZBP(this.zzWI0.zzXKz());
        } catch (IllegalArgumentException e) {
            throw new zzZDH(e.getMessage(), e);
        }
    }

    @Override // com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        try {
            return zzXKI();
        } catch (IOException e) {
            throw new zzZD6("unable to get DER object", e);
        } catch (IllegalArgumentException e2) {
            throw new zzZD6("unable to get DER object", e2);
        }
    }
}
