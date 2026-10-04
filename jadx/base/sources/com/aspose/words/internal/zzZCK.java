package com.aspose.words.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZCK implements zzZCX {
    private int zzWHY;
    private boolean zzWHZ;
    private zzZD0 zzWI0;

    public zzZCK(boolean z, int i, zzZD0 zzzd0) {
        this.zzWHZ = z;
        this.zzWHY = i;
        this.zzWI0 = zzzd0;
    }

    @Override // com.aspose.words.internal.zzZBI
    public final zzZD5 zzXKI() throws IOException {
        return this.zzWI0.zzO(this.zzWHZ, this.zzWHY);
    }

    @Override // com.aspose.words.internal.zzZCX
    public final int zzXKy() {
        return this.zzWHY;
    }

    @Override // com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        try {
            return zzXKI();
        } catch (IOException e) {
            throw new zzZD6(e.getMessage());
        }
    }

    @Override // com.aspose.words.internal.zzZCX
    public final zzZDK zzYR(int i, boolean z) throws IOException {
        if (!z) {
            return this.zzWI0.zzP(this.zzWHZ, i);
        }
        if (this.zzWHZ) {
            return this.zzWI0.zzXKC();
        }
        throw new IOException("Explicit tags must be constructed (see X.690 8.14.2)");
    }
}
