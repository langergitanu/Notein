package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzYY9 implements zzYVA {
    private SecureRandom zzWk5;

    @Override // com.aspose.words.internal.zzYVA
    public final zzYVB zzXG6() {
        zzYY8 zzyy8 = new zzYY8(this.zzWk5);
        return new zzYVB(zzyy8.zzXDx(), zzyy8);
    }

    @Override // com.aspose.words.internal.zzYVA
    public final void zzZ(zzYUS zzyus) {
        this.zzWk5 = zzyus.zzXCJ();
    }
}
