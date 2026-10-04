package com.aspose.words.internal;

import com.google.common.primitives.UnsignedBytes;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYT8 implements zzYTA {
    @Override // com.aspose.words.internal.zzYTA
    public final void init(SecureRandom secureRandom) throws IllegalArgumentException {
    }

    @Override // com.aspose.words.internal.zzYTA
    public final int zzW5(byte[] bArr) throws zzYUT {
        int length = bArr.length - 1;
        while (length > 0 && bArr[length] == 0) {
            length--;
        }
        if (bArr[length] == -128) {
            return bArr.length - length;
        }
        throw new zzYUT("pad block corrupted");
    }

    @Override // com.aspose.words.internal.zzYTA
    public final int zzZV(byte[] bArr, int i) {
        int length = bArr.length - i;
        bArr[i] = UnsignedBytes.MAX_POWER_OF_TWO;
        while (true) {
            i++;
            if (i >= bArr.length) {
                return length;
            }
            bArr[i] = 0;
        }
    }
}
