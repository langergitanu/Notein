package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzUT extends zzU1 {
    public static int zzZ(byte[] bArr, int i, byte[][] bArr2) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < i) {
            if (bArr[i2] == 27) {
                int iZzZ = zzZ(bArr, i, i2, bArr2);
                if (iZzZ > 0) {
                    i3++;
                    i2 += iZzZ - 1;
                } else {
                    i4++;
                }
            }
            byte b = bArr[i2];
            if (b == 14 || b == 15) {
                i5++;
            }
            i2++;
        }
        if (i3 == 0) {
            return 0;
        }
        int i6 = ((i3 * 100) - (i4 * 100)) / (i4 + i3);
        int i7 = i3 + i5;
        if (i7 < 5) {
            i6 -= (5 - i7) * 10;
        }
        if (i6 < 0) {
            return 0;
        }
        return i6;
    }

    private static int zzZ(byte[] bArr, int i, int i2, byte[][] bArr2) {
        for (byte[] bArr3 : bArr2) {
            if (i - i2 >= bArr3.length) {
                int i3 = 0;
                for (int i4 = 1; i4 < bArr3.length; i4++) {
                    i3 = bArr3[i4] == bArr[i2 + i4] ? i3 + 1 : 0;
                    if (i3 == bArr3.length) {
                        return i3;
                    }
                }
            }
        }
        return 0;
    }
}
