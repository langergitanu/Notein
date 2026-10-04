package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzYXL extends zzYUS {
    private zzYXI zzW5Z;

    public zzYXL(SecureRandom secureRandom, zzYXI zzyxi) {
        super(secureRandom, zzyxi.getP().bitLength() - 1);
        this.zzW5Z = zzyxi;
    }

    public final zzYXI zzXDl() {
        return this.zzW5Z;
    }
}
