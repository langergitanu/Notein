package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzYVK implements zzYVA {
    private SecureRandom zzWk5;

    @Override // com.aspose.words.internal.zzYVA
    public final zzYVB zzXG6() {
        zzYVJ zzyvj = new zzYVJ(this.zzWk5);
        return new zzYVB(zzyvj.zzXCR(), zzyvj);
    }

    @Override // com.aspose.words.internal.zzYVA
    public final void zzZ(zzYUS zzyus) {
        this.zzWk5 = zzyus.zzXCJ();
    }
}
