package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzYVF extends zzYT2 {
    private final byte[] data;

    public zzYVF(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[56];
        this.data = bArr;
        zzYIG.zzZ(secureRandom, bArr);
    }

    public final byte[] getEncoded() {
        return zzYGU.zzVI(this.data);
    }

    public final zzYVE zzXCQ() {
        byte[] bArr = new byte[56];
        zzYIG.zzs(this.data, bArr);
        return new zzYVE(bArr);
    }

    public final void zzZ(zzYVE zzyve, byte[] bArr, int i) {
        byte[] bArr2 = new byte[56];
        zzyve.zzWE(bArr2);
        if (!zzYIG.zzX(this.data, bArr2, bArr, 0)) {
            throw new IllegalStateException("X448 agreement failed");
        }
    }

    public zzYVF(byte[] bArr) {
        super(true);
        byte[] bArr2 = new byte[56];
        this.data = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, 56);
    }
}
