package com.aspose.words.internal;

import com.aspose.words.internal.zzZ0P;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzYYC extends zzYT2 {
    private final byte[] data;
    private final zzYIE zzW7Y;

    public zzYYC(SecureRandom secureRandom) {
        super(true);
        this.zzW7Y = new zzYIE() { // from class: com.aspose.words.internal.zzYYC.1
            @Override // com.aspose.words.internal.zzYIE
            public final zzYUX zzXDy() {
                return zzYW6.zzZ(zzZ0P.zzZ.zzWdD);
            }
        };
        byte[] bArr = new byte[32];
        this.data = bArr;
        zzYIE.zzZ(secureRandom, bArr);
    }

    public final byte[] getEncoded() {
        return zzYGU.zzVI(this.data);
    }

    public final zzYYB zzXDz() {
        byte[] bArr = new byte[32];
        this.zzW7Y.zzr(this.data, bArr);
        return new zzYYB(bArr);
    }

    public final void zzZ(zzYYB zzyyb, byte[] bArr, int i, byte[] bArr2) {
        byte[] bArr3 = new byte[32];
        if (zzyyb == null) {
            this.zzW7Y.zzr(this.data, bArr3);
        } else {
            zzyyb.zzWE(bArr3);
        }
        this.zzW7Y.zzZ(this.data, bArr3, bArr, 0, i, bArr2, 0);
    }

    public zzYYC(byte[] bArr) {
        super(true);
        this.zzW7Y = new zzYIE() { // from class: com.aspose.words.internal.zzYYC.1
            @Override // com.aspose.words.internal.zzYIE
            public final zzYUX zzXDy() {
                return zzYW6.zzZ(zzZ0P.zzZ.zzWdD);
            }
        };
        byte[] bArr2 = new byte[32];
        this.data = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, 32);
    }
}
