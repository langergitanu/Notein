package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYXZ {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r2 = r2 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int zzF(byte[] bArr, int i, int i2) {
        int iMax = Math.max(0, i - 2047);
        int i3 = i - i2;
        while (i3 >= iMax) {
            for (int i4 = 0; i4 < i2; i4++) {
                if (bArr[i3 + i4] != bArr[i + i4]) {
                    break;
                }
            }
            return i3;
        }
        return -1;
    }

    private static boolean zzn(byte b) {
        if (b == 0) {
            return true;
        }
        int i = b & 255;
        return i > 8 && i < 128;
    }

    public static byte[] zzo(byte[] bArr, int i) throws Exception {
        int i2;
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(i);
        int i3 = 0;
        while (i3 < i) {
            int i4 = 10;
            if (i3 > 10 && i - i3 > 10) {
                int iZzF = -1;
                while (iZzF < 0 && i4 >= 3) {
                    iZzF = zzF(bArr, i3, i4);
                    if (iZzF < 0) {
                        i4--;
                    }
                }
                if (iZzF >= 0) {
                    int i5 = (((i3 - iZzF) & 2047) << 3) | 32768 | (i4 - 3);
                    zzzor.writeByte((byte) (i5 / 256));
                    zzzor.writeByte((byte) (i5 % 256));
                    i3 += i4;
                }
            }
            byte b = bArr[i3];
            int i6 = i3 + 1;
            if ((b & 255) == 32 && (i3 = i3 + 2) < i && (i2 = bArr[i6] & 255) >= 64 && i2 < 128) {
                zzzor.writeByte((byte) (i2 ^ 128));
            } else if (zzn(b)) {
                zzzor.writeByte(b);
                i3 = i6;
            } else {
                int i7 = 1;
                i3 = i6;
                while (i3 < i && i7 < 8 && !zzn(bArr[i3])) {
                    i7++;
                    i3++;
                }
                zzzor.writeByte((byte) i7);
                zzzor.write(bArr, i3 - i7, i7);
            }
        }
        return zzzor.zzWy();
    }
}
