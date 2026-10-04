package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYT9 implements zzYTA {
    SecureRandom zzWk5;

    @Override // com.aspose.words.internal.zzYTA
    public final void init(SecureRandom secureRandom) throws IllegalArgumentException {
        if (secureRandom == null) {
            throw new IllegalArgumentException("No random provided where one required.");
        }
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
            bArr[i] = (byte) this.zzWk5.nextInt();
            i++;
        }
        bArr[i] = length;
        return length;
    }
}
