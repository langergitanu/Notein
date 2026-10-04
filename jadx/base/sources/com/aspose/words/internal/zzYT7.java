package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYT7 implements zzYTA {
    @Override // com.aspose.words.internal.zzYTA
    public final void init(SecureRandom secureRandom) throws IllegalArgumentException {
    }

    @Override // com.aspose.words.internal.zzYTA
    public final int zzW5(byte[] bArr) throws zzYUT {
        int i = bArr[bArr.length - 1] & 255;
        byte b = (byte) i;
        boolean z = (i > bArr.length) | (i == 0);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            z |= (bArr.length - i2 <= i) & (bArr[i2] != b);
        }
        if (z) {
            throw new zzYUT("pad block corrupted");
        }
        return i;
    }

    @Override // com.aspose.words.internal.zzYTA
    public final int zzZV(byte[] bArr, int i) {
        byte length = (byte) (bArr.length - i);
        while (i < bArr.length) {
            bArr[i] = length;
            i++;
        }
        return length;
    }
}
