package com.aspose.words.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZJ1 extends zzZJ7 {
    private int zzZ(byte[] bArr, int i, int i2, byte[] bArr2) {
        zzdi();
        int iZzZ = zzZ(bArr, i, 0, i2, bArr2, 0);
        while (true) {
            int i3 = this.zzZJF;
            if (i3 <= 0) {
                break;
            }
            int i4 = this.zzZJG;
            bArr2[iZzZ] = (byte) (i4 >>> 24);
            this.zzZJG = i4 << 8;
            this.zzZJF = i3 - 8;
            iZzZ++;
        }
        if (this.zzZJH) {
            byte[] bArr3 = zzZJL.zzZLi;
            for (int i5 = 0; i5 < iZzZ; i5++) {
                bArr2[i5] = bArr3[bArr2[i5] & 255];
            }
        }
        return iZzZ;
    }

    @Override // com.aspose.words.internal.zzZJ9
    public final int zzZ(byte[] bArr, int i, int i2, int i3, int[] iArr, int i4) throws Exception {
        if (iArr.length == 1 && iArr[0] == 1) {
            byte[] bArr2 = new byte[((((i2 + 1) / 2) * 9) + 9) / 8];
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i3; i7++) {
                int iZzZ = zzZ(bArr, i6, i2, bArr2);
                this.zzZJV.write(bArr2, 0, iZzZ);
                i6 += i4;
                i5 += iZzZ;
            }
            return i5;
        }
        throw new IOException("Bits per sample must be 1 for RLE compression!");
    }
}
