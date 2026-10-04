package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZIZ extends zzZJ7 {
    @Override // com.aspose.words.internal.zzZJ9
    public final int zzZ(byte[] bArr, int i, int i2, int i3, int[] iArr, int i4) throws Exception {
        if (iArr.length != 1 || iArr[0] != 1) {
            throw new Exception("Bits per sample must be 1 for T6 compression!");
        }
        byte[] bArr2 = new byte[(((((((i2 + 1) / 2) * 12) + 9) / 8) + 2) * i3) + 12];
        int iZzZ = zzZ(bArr, i4, 0, i2, i3, bArr2);
        this.zzZJV.write(bArr2, 0, iZzZ);
        return iZzZ;
    }

    private synchronized int zzZ(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2) {
        int iZzz;
        try {
            zzdi();
            int iZzU = 0;
            int i5 = 0;
            int i6 = 0;
            byte[] bArr3 = null;
            int i7 = i4;
            while (true) {
                int i8 = i7 - 1;
                if (i7 == 0) {
                    break;
                }
                int iZzV = (((bArr[i5] & 255) >>> 7) & 1) != 0 ? 0 : zzZJ7.zzV(bArr, i5, 0, i3);
                int iZzV2 = (bArr3 == null ? 0 : ((bArr3[i6] & 255) >>> 7) & 1) != 0 ? 0 : zzZJ7.zzV(bArr3, i6, 0, i3);
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    int iZzV3 = zzZJ7.zzV(bArr3, i6, iZzV2, i3);
                    if (iZzV3 < iZzV) {
                        iZzU += zzZ(bArr2, iZzU, zzZJ7.zzZJK, 0);
                        i9 = iZzV3;
                    } else {
                        int i11 = (iZzV2 - iZzV) + 3;
                        if (i11 <= 6 && i11 >= 0) {
                            iZzU += zzZ(bArr2, iZzU, zzZJ7.zzZJJ, i11);
                            i9 = iZzV;
                        } else {
                            int iZzV4 = zzZJ7.zzV(bArr, i5, iZzV, i3);
                            int iZzZ = iZzU + zzZ(bArr2, iZzU, zzZJ7.zzZJI, 0);
                            int iZzU2 = iZzZ + zzU(bArr2, iZzZ, iZzV - i9, i10);
                            iZzU = iZzU2 + zzU(bArr2, iZzU2, iZzV4 - iZzV, i10 ^ 1);
                            i9 = iZzV4;
                        }
                    }
                    if (i9 < i3) {
                        i10 = ((bArr[(i9 >>> 3) + i5] & 255) >>> (7 - (i9 & 7))) & 1;
                        iZzV = zzZJ7.zzV(bArr, i5, i9, i3);
                        iZzV2 = zzZJ7.zzV(bArr3, i6, i9, i3);
                        if ((bArr3 == null ? 0 : ((bArr3[(iZzV2 >>> 3) + i6] & 255) >>> (7 - (iZzV2 & 7))) & 1) == i10) {
                            iZzV2 = zzZJ7.zzV(bArr3, i6, iZzV2, i3);
                        }
                    }
                }
                bArr3 = bArr;
                i6 = i5;
                i5 += i;
                i7 = i8;
            }
            iZzz = iZzU + zzz(bArr2, iZzU);
            if (this.zzZJH) {
                for (int i12 = 0; i12 < iZzz; i12++) {
                    bArr2[i12] = zzZJL.zzZLi[bArr2[i12] & 255];
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return iZzz;
    }
}
