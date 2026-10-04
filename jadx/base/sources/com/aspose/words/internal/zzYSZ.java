package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYSZ extends zzYUS {
    private zzYSX zzVY3;

    public zzYSZ(SecureRandom secureRandom, zzYSX zzysx) {
        super(secureRandom, zzZ(zzysx));
        this.zzVY3 = zzysx;
    }

    private static int zzZ(zzYSX zzysx) {
        return zzysx.getL() != 0 ? zzysx.getL() : zzysx.getP().bitLength();
    }

    public final zzYSX zzXCt() {
        return this.zzVY3;
    }
}
