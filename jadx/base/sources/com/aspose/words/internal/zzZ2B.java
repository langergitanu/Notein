package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ2B implements zzYVA {
    private zzYSZ zzWju;

    @Override // com.aspose.words.internal.zzYVA
    public final zzYVB zzXG6() {
        zzZ2C zzz2c = zzZ2C.zzWjv;
        zzYSX zzysxZzXCt = this.zzWju.zzXCt();
        BigInteger bigIntegerZzZ = zzZ2C.zzZ(zzysxZzXCt, this.zzWju.zzXCJ());
        return new zzYVB(new zzYSV(zzZ2C.zzZ(zzysxZzXCt, bigIntegerZzZ), zzysxZzXCt), new zzYSW(bigIntegerZzZ, zzysxZzXCt));
    }

    @Override // com.aspose.words.internal.zzYVA
    public final void zzZ(zzYUS zzyus) {
        this.zzWju = (zzYSZ) zzyus;
    }
}
