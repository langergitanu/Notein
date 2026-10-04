package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzYWZ implements zzYV8 {
    private int[] zzW8f = null;

    private static int zz4(byte[] bArr, int i) {
        return ((bArr[i] << 8) & 65280) + (bArr[i + 1] & 255);
    }

    private static void zzQ(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 8);
        bArr[i2 + 1] = (byte) i;
    }

    private static int zzUD(int i, int i2) {
        int i3;
        if (i == 0) {
            i3 = 65537 - i2;
        } else if (i2 == 0) {
            i3 = 65537 - i;
        } else {
            int i4 = i * i2;
            int i5 = i4 & 65535;
            int i6 = i4 >>> 16;
            i3 = (i5 - i6) + (i5 < i6 ? 1 : 0);
        }
        return i3 & 65535;
    }

    private static int[] zzWo(byte[] bArr) {
        int i;
        int[] iArr = new int[52];
        int i2 = 0;
        if (bArr.length < 16) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 16 - bArr.length, bArr.length);
            bArr = bArr2;
        }
        while (true) {
            if (i2 >= 8) {
                break;
            }
            iArr[i2] = zz4(bArr, i2 * 2);
            i2++;
        }
        for (i = 8; i < 52; i++) {
            int i3 = i & 7;
            if (i3 < 6) {
                iArr[i] = (((iArr[i - 7] & 127) << 9) | (iArr[i - 6] >> 7)) & 65535;
            } else if (i3 == 6) {
                iArr[i] = (((iArr[i - 7] & 127) << 9) | (iArr[i - 14] >> 7)) & 65535;
            } else {
                iArr[i] = (((iArr[i - 15] & 127) << 9) | (iArr[i - 14] >> 7)) & 65535;
            }
        }
        return iArr;
    }

    private static void zzX(int[] iArr, byte[] bArr, int i, byte[] bArr2, int i2) {
        int iZz4 = zz4(bArr, i);
        int iZz42 = zz4(bArr, i + 2);
        int iZz43 = zz4(bArr, i + 4);
        int iZz44 = zz4(bArr, i + 6);
        int i3 = 0;
        int i4 = iZz43;
        int i5 = iZz42;
        int i6 = iZz4;
        int i7 = 0;
        while (i3 < 8) {
            int iZzUD = zzUD(i6, iArr[i7]);
            int i8 = (i5 + iArr[i7 + 1]) & 65535;
            int i9 = (i4 + iArr[i7 + 2]) & 65535;
            int iZzUD2 = zzUD(iZz44, iArr[i7 + 3]);
            int i10 = i7 + 5;
            int iZzUD3 = zzUD(i9 ^ iZzUD, iArr[i7 + 4]);
            i7 += 6;
            int iZzUD4 = zzUD(((i8 ^ iZzUD2) + iZzUD3) & 65535, iArr[i10]);
            int i11 = 65535 & (iZzUD3 + iZzUD4);
            i6 = iZzUD ^ iZzUD4;
            iZz44 = iZzUD2 ^ i11;
            int i12 = i9 ^ iZzUD4;
            i3++;
            i4 = i8 ^ i11;
            i5 = i12;
        }
        zzQ(zzUD(i6, iArr[i7]), bArr2, i2);
        zzQ(i4 + iArr[i7 + 1], bArr2, i2 + 2);
        zzQ(i5 + iArr[i7 + 2], bArr2, i2 + 4);
        zzQ(zzUD(iZz44, iArr[i7 + 3]), bArr2, i2 + 6);
    }

    private static int[] zzZU(int[] iArr) {
        int[] iArr2 = new int[52];
        int iZzfp = zzfp(iArr[0]);
        int i = (0 - iArr[1]) & 65535;
        int i2 = (0 - iArr[2]) & 65535;
        iArr2[51] = zzfp(iArr[3]);
        iArr2[50] = i2;
        iArr2[49] = i;
        int i3 = 48;
        iArr2[48] = iZzfp;
        int i4 = 4;
        for (int i5 = 1; i5 < 8; i5++) {
            int i6 = iArr[i4];
            iArr2[i3 - 1] = iArr[i4 + 1];
            iArr2[i3 - 2] = i6;
            int iZzfp2 = zzfp(iArr[i4 + 2]);
            int i7 = (0 - iArr[i4 + 3]) & 65535;
            int i8 = i4 + 5;
            int i9 = (0 - iArr[i4 + 4]) & 65535;
            i4 += 6;
            iArr2[i3 - 3] = zzfp(iArr[i8]);
            iArr2[i3 - 4] = i7;
            iArr2[i3 - 5] = i9;
            i3 -= 6;
            iArr2[i3] = iZzfp2;
        }
        int i10 = iArr[i4];
        iArr2[i3 - 1] = iArr[i4 + 1];
        iArr2[i3 - 2] = i10;
        int iZzfp3 = zzfp(iArr[i4 + 2]);
        int i11 = (0 - iArr[i4 + 3]) & 65535;
        int i12 = (0 - iArr[i4 + 4]) & 65535;
        iArr2[i3 - 3] = zzfp(iArr[i4 + 5]);
        iArr2[i3 - 4] = i12;
        iArr2[i3 - 5] = i11;
        iArr2[i3 - 6] = iZzfp3;
        return iArr2;
    }

    private static int zzfp(int i) {
        if (i < 2) {
            return i;
        }
        int i2 = 65537 / i;
        int i3 = 65537 % i;
        int i4 = 1;
        while (i3 != 1) {
            int i5 = i / i3;
            i %= i3;
            i4 = ((i5 * i2) + i4) & 65535;
            if (i == 1) {
                return i4;
            }
            int i6 = i3 / i;
            i3 %= i;
            i2 = ((i6 * i4) + i2) & 65535;
        }
        return (1 - i2) & 65535;
    }

    @Override // com.aspose.words.internal.zzYV8
    public final int getBlockSize() {
        return 8;
    }

    @Override // com.aspose.words.internal.zzYV8
    public final void reset() {
    }

    @Override // com.aspose.words.internal.zzYV8
    public final String zzXGi() {
        return "IDEA";
    }

    @Override // com.aspose.words.internal.zzYV8
    public final int zzY(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = this.zzW8f;
        if (iArr == null) {
            throw new IllegalStateException("IDEA engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new zzYV0("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new zzYUO("output buffer too short");
        }
        zzX(iArr, bArr, i, bArr2, i2);
        return 8;
    }

    @Override // com.aspose.words.internal.zzYV8
    public final void zzZ(boolean z, zzYV3 zzyv3) {
        if (!(zzyv3 instanceof zzYS8)) {
            throw new IllegalArgumentException("invalid parameter passed to IDEA init - ".concat(zzyv3.getClass().getName()));
        }
        this.zzW8f = zzZ(z, ((zzYS8) zzyv3).getKey());
    }

    private int[] zzZ(boolean z, byte[] bArr) {
        if (z) {
            return zzWo(bArr);
        }
        return zzZU(zzWo(bArr));
    }
}
