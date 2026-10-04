package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzYVG implements zzYVA {
    private SecureRandom zzWk5;

    @Override // com.aspose.words.internal.zzYVA
    public final zzYVB zzXG6() {
        zzYVF zzyvf = new zzYVF(this.zzWk5);
        return new zzYVB(zzyvf.zzXCQ(), zzyvf);
    }

    @Override // com.aspose.words.internal.zzYVA
    public final void zzZ(zzYUS zzyus) {
        this.zzWk5 = zzyus.zzXCJ();
    }
}
