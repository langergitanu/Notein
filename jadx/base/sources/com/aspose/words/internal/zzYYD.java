package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzYYD implements zzYVA {
    private SecureRandom zzWk5;

    @Override // com.aspose.words.internal.zzYVA
    public final zzYVB zzXG6() {
        zzYYC zzyyc = new zzYYC(this.zzWk5);
        return new zzYVB(zzyyc.zzXDz(), zzyyc);
    }

    @Override // com.aspose.words.internal.zzYVA
    public final void zzZ(zzYUS zzyus) {
        this.zzWk5 = zzyus.zzXCJ();
    }
}
