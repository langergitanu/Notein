package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZJ0 extends zzZJ7 {
    private boolean zzZJD = false;
    private boolean zzZJC = false;

    @Override // com.aspose.words.internal.zzZJ9
    public final void zzZ(zzZJU zzzju) {
        super.zzZ(zzzju);
        if (zzzju.zzdF() == -1) {
            zzzju.zzL(new long[]{(!this.zzZJD ? 1 : 0) | (this.zzZJC ? 4 : 0)});
            return;
        }
        int iZzdF = zzzju.zzdF();
        this.zzZJD = (iZzdF & 1) == 0;
        this.zzZJC = (iZzdF & 4) == 4;
    }

    private int zzZ(boolean z, boolean z2, byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2) {
        int i5;
        byte[] bArr3 = bArr;
        int i6 = i3;
        zzdi();
        int iZzZ = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i4) {
            if (!z && i7 % 2 != 0) {
                iZzZ += zzZ(z, z2, false, bArr2, iZzZ);
                int i9 = i8 - i;
                int iZzV = (((bArr3[i8] & 255) >>> 7) & 1) != 0 ? 0 : zzZJ7.zzV(bArr3, i8, 0, i6);
                int iZzV2 = (((bArr3[i9] & 255) >>> 7) & 1) != 0 ? 0 : zzZJ7.zzV(bArr3, i9, 0, i6);
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    int iZzV3 = zzZJ7.zzV(bArr3, i9, iZzV2, i6);
                    if (iZzV3 < iZzV) {
                        iZzZ = zzZ(bArr2, iZzZ, zzZJ7.zzZJK, 0) + iZzZ;
                        i11 = iZzV3;
                    } else {
                        int i12 = (iZzV2 - iZzV) + 3;
                        if (i12 <= 6 && i12 >= 0) {
                            i11 = iZzV;
                            iZzZ = zzZ(bArr2, iZzZ, zzZJ7.zzZJJ, i12) + iZzZ;
                        } else {
                            int iZzV4 = zzZJ7.zzV(bArr3, i8, iZzV, i6);
                            int iZzZ2 = zzZ(bArr2, iZzZ, zzZJ7.zzZJI, 0) + iZzZ;
                            int iZzU = zzU(bArr2, iZzZ2, iZzV - i11, i10) + iZzZ2;
                            iZzZ = zzU(bArr2, iZzU, iZzV4 - iZzV, i10 ^ 1) + iZzU;
                            i11 = iZzV4;
                        }
                    }
                    if (i11 >= i6) {
                        break;
                    }
                    i10 = ((bArr3[(i11 >>> 3) + i8] & 255) >>> (7 - (i11 & 7))) & 1;
                    iZzV = zzZJ7.zzV(bArr3, i8, i11, i6);
                    iZzV2 = zzZJ7.zzV(bArr3, i9, i11, i6);
                    if ((((bArr3[(iZzV2 >>> 3) + i9] & 255) >>> (7 - (iZzV2 & 7))) & 1) == i10) {
                        iZzV2 = zzZJ7.zzV(bArr3, i9, iZzV2, i6);
                    }
                }
                i5 = i8;
            } else {
                int iZzZ3 = iZzZ + zzZ(z, z2, true, bArr2, iZzZ);
                i5 = i8;
                iZzZ = iZzZ3 + zzZ(bArr3, i5, 0, i6, bArr2, iZzZ3);
            }
            i8 = i5 + i;
            i7++;
            bArr3 = bArr;
            i6 = i3;
        }
        for (int i13 = 0; i13 < 6; i13++) {
            iZzZ += zzZ(z, z2, true, bArr2, iZzZ);
        }
        while (true) {
            int i14 = this.zzZJF;
            if (i14 <= 0) {
                break;
            }
            int i15 = this.zzZJG;
            bArr2[iZzZ] = (byte) (i15 >>> 24);
            this.zzZJG = i15 << 8;
            this.zzZJF = i14 - 8;
            iZzZ++;
        }
        if (this.zzZJH) {
            for (int i16 = 0; i16 < iZzZ; i16++) {
                bArr2[i16] = zzZJL.zzZLi[bArr2[i16] & 255];
            }
        }
        return iZzZ;
    }

    @Override // com.aspose.words.internal.zzZJ9
    public final int zzZ(byte[] bArr, int i, int i2, int i3, int[] iArr, int i4) throws Exception {
        if (iArr.length == 1 && iArr[0] == 1) {
            byte[] bArr2 = new byte[(((((((i2 + 1) / 2) * 12) + 9) / 8) + 2) * i3) + 12];
            int iZzZ = zzZ(this.zzZJD, this.zzZJC, bArr, i4, 0, i2, i3, bArr2);
            this.zzZJV.write(bArr2, 0, iZzZ);
            return iZzZ;
        }
        throw new Exception("Bits per sample must be 1 for T4 compression!");
    }
}
