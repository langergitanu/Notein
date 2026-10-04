package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYS3 implements zzYV3 {
    private zzYV3 zzVXO;
    private SecureRandom zzWk5;

    public zzYS3(zzYV3 zzyv3, SecureRandom secureRandom) {
        this.zzWk5 = secureRandom;
        this.zzVXO = zzyv3;
    }

    public final zzYV3 zzXC6() {
        return this.zzVXO;
    }

    public final SecureRandom zzXCJ() {
        return this.zzWk5;
    }
}
