package com.aspose.words;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes6.dex */
final class zzY3N {
    public static byte[] zzjh(int i) {
        com.aspose.words.internal.zzXE zzxe = new com.aspose.words.internal.zzXE();
        do {
            zzxe.zzX((byte) (((long) i) & Long.parseLong("01111111", 2) & 4294967295L));
            i >>= 7;
        } while (i > 0);
        zzxe.zzW((byte) (((long) (zzxe.get(0) & 255)) | (Long.parseLong("10000000", 2) & 4294967295L)));
        zzxe.reverse();
        return zzxe.zzWy();
    }

    public static long zzl(com.aspose.words.internal.zzY0 zzy0) throws Exception {
        long j = 0;
        while (zzy0.zzq().getPosition() < zzy0.zzq().getLength()) {
            byte b = zzy0.readByte();
            j += (long) (b & Ascii.DEL);
            if ((b & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                break;
            }
            j <<= 7;
        }
        return j;
    }

    public static long zzm(byte[] bArr, int i) {
        long j = 0;
        int i2 = 0;
        while (i >= 0) {
            byte b = bArr[i];
            j += (long) ((b & Ascii.DEL) << (i2 * 7));
            if ((b & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                break;
            }
            i2++;
            i--;
        }
        return j;
    }
}
