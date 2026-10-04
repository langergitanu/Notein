package com.aspose.words.internal;

import com.aspose.words.internal.zzZ0P;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzYY8 extends zzYT2 {
    private final byte[] data;
    private final zzYID zzW7R;

    public zzYY8(SecureRandom secureRandom) {
        super(true);
        this.zzW7R = new zzYID() { // from class: com.aspose.words.internal.zzYY8.1
            @Override // com.aspose.words.internal.zzYID
            public final zzYUB zzXDw() {
                return (zzYUB) zzYW6.zzZ(zzZ0P.zzZ.zzWdo);
            }
        };
        byte[] bArr = new byte[57];
        this.data = bArr;
        zzYID.zzZ(secureRandom, bArr);
    }

    public final byte[] getEncoded() {
        return zzYGU.zzVI(this.data);
    }

    public final zzYY7 zzXDx() {
        byte[] bArr = new byte[57];
        this.zzW7R.zzr(this.data, bArr);
        return new zzYY7(bArr);
    }

    public final void zzZ(zzYY7 zzyy7, byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        byte[] bArr4 = new byte[57];
        if (zzyy7 == null) {
            this.zzW7R.zzr(this.data, bArr4);
        } else {
            zzyy7.zzWE(bArr4);
        }
        this.zzW7R.zzZ(this.data, bArr4, bArr, bArr2, 0, i, bArr3, 0);
    }

    public zzYY8(byte[] bArr) {
        super(true);
        this.zzW7R = new zzYID() { // from class: com.aspose.words.internal.zzYY8.1
            @Override // com.aspose.words.internal.zzYID
            public final zzYUB zzXDw() {
                return (zzYUB) zzYW6.zzZ(zzZ0P.zzZ.zzWdo);
            }
        };
        byte[] bArr2 = new byte[57];
        this.data = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, 57);
    }
}
