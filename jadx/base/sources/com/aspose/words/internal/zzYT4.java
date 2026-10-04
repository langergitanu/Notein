package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYT4 implements zzYTA {
    SecureRandom zzWk5 = null;

    @Override // com.aspose.words.internal.zzYTA
    public final void init(SecureRandom secureRandom) throws IllegalArgumentException {
        this.zzWk5 = secureRandom;
    }

    @Override // com.aspose.words.internal.zzYTA
    public final int zzW5(byte[] bArr) throws zzYUT {
        int i = bArr[bArr.length - 1] & 255;
        if (i <= bArr.length) {
            return i;
        }
        throw new zzYUT("pad block corrupted");
    }

    @Override // com.aspose.words.internal.zzYTA
    public final int zzZV(byte[] bArr, int i) {
        byte length = (byte) (bArr.length - i);
        while (i < bArr.length - 1) {
            SecureRandom secureRandom = this.zzWk5;
            if (secureRandom == null) {
                bArr[i] = 0;
            } else {
                bArr[i] = (byte) secureRandom.nextInt();
            }
            i++;
        }
        bArr[i] = length;
        return length;
    }
}
