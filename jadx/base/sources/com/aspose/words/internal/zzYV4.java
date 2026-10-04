package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYV4 {
    protected int zzWk4;
    protected SecureRandom zzWk5;

    public final byte[] zzXG8() {
        byte[] bArr = new byte[this.zzWk4];
        this.zzWk5.nextBytes(bArr);
        return bArr;
    }

    public final void zzZ(zzYUS zzyus) {
        this.zzWk5 = zzyus.zzXCJ();
        this.zzWk4 = (zzyus.getStrength() + 7) / 8;
    }
}
