package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYSS extends zzYUS {
    private zzYSP zzVXY;

    public zzYSS(SecureRandom secureRandom, zzYSP zzysp) {
        super(secureRandom, zzysp.getP().bitLength() - 1);
        this.zzVXY = zzysp;
    }

    public final zzYSP zzXCo() {
        return this.zzVXY;
    }
}
