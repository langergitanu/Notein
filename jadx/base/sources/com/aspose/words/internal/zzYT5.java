package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYT5 implements zzYTA {
    @Override // com.aspose.words.internal.zzYTA
    public final void init(SecureRandom secureRandom) throws IllegalArgumentException {
    }

    @Override // com.aspose.words.internal.zzYTA
    public final int zzW5(byte[] bArr) throws zzYUT {
        byte b = bArr[bArr.length - 1];
        int length = bArr.length - 1;
        while (length > 0 && bArr[length - 1] == b) {
            length--;
        }
        return bArr.length - length;
    }

    @Override // com.aspose.words.internal.zzYTA
    public final int zzZV(byte[] bArr, int i) {
        int length = bArr.length - i;
        int i2 = 0;
        if (i <= 0 ? (bArr[bArr.length - 1] & 1) == 0 : (bArr[i - 1] & 1) == 0) {
            i2 = 255;
        }
        byte b = (byte) i2;
        while (i < bArr.length) {
            bArr[i] = b;
            i++;
        }
        return length;
    }
}
