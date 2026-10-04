package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzYVJ extends zzYT2 {
    private final byte[] data;

    public zzYVJ(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[32];
        this.data = bArr;
        zzYII.zzZ(secureRandom, bArr);
    }

    public final byte[] getEncoded() {
        return zzYGU.zzVI(this.data);
    }

    public final zzYVI zzXCR() {
        byte[] bArr = new byte[32];
        zzYII.zzs(this.data, bArr);
        return new zzYVI(bArr);
    }

    public final void zzZ(zzYVI zzyvi, byte[] bArr, int i) {
        byte[] bArr2 = new byte[32];
        zzyvi.zzWE(bArr2);
        if (!zzYII.zzX(this.data, bArr2, bArr, 0)) {
            throw new IllegalStateException("X25519 agreement failed");
        }
    }

    public zzYVJ(byte[] bArr) {
        super(true);
        byte[] bArr2 = new byte[32];
        this.data = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, 32);
    }
}
