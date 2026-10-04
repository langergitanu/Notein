package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
class zzZ2Q {
    protected int zzWk4;
    protected SecureRandom zzWk5;

    public byte[] zzXG8() {
        byte[] bArr = new byte[this.zzWk4];
        SecureRandom secureRandom = this.zzWk5;
        if (!(secureRandom instanceof zzZ0O)) {
            secureRandom.nextBytes(bArr);
            return bArr;
        }
        zzZ0O zzz0o = (zzZ0O) secureRandom;
        zzz0o.zzXEh();
        zzz0o.nextBytes(bArr);
        return bArr;
    }

    public void zzZ(zzYUS zzyus) {
        this.zzWk5 = zzyus.zzXCJ();
        this.zzWk4 = (zzyus.getStrength() + 7) / 8;
    }
}
