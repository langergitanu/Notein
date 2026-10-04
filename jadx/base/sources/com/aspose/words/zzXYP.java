package com.aspose.words;

import com.google.common.primitives.Shorts;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes6.dex */
final class zzXYP {
    private static short[] zzWS1 = {-7696, 7439, -13156, -31552, 4364, 3600, -3634, 12606, 6258, -7879, -11249, -31495, 10252, -22166, 20163};
    private static short[] zzWS0 = {-20740, 19929, -25678, 10053, 20106, -25324, 10761, 31585, -2366, -603, -5269, -14601, -25137, 11199, 17763, -30010, 1453, 2906, 5812, 11624, 23248, 885, 1770, 3540, 7080, 14160, 28320, -8896, -10167, -24397, 20807, -23922, 21821, -21894, 17621, 28485, -8566, -21195, 19019, -27498, 14605, 29210, -5341, -14745, -25361, 10751, 21502, -22532, 24537, 18387, -28762, 3949, 7898, 15796, 31592, -2352, -18335, 24803, -15930, -27731, 14203, 28406, -8724, 17824, -29888, 1697, 3394, 6788, 13576, 27152, -21935, 17539, -30458, 557, 1114, 2228, 4456, 30388, -4760, -13583, -31293, 7079, 14158, 28316, 14128, 28256, -9024, -22111, 17251, -31034, 7597, 13105, 26210, -13116, -30295, 883, 1766, 3532, 4129, 8258, 16516, -32504, 4657, 9314, 18628};
    private static byte[] zzWRZ = {-69, -1, -1, -70, -1, -1, -71, UnsignedBytes.MAX_POWER_OF_TWO, 0, -66, 15, 0, -65, 15, 0};

    private static byte zzV(byte b, byte b2) {
        return zzh((byte) ((b & 255) ^ (b2 & 255)));
    }

    private static short zzXu(byte[] bArr) {
        short s = zzWS1[bArr.length - 1];
        int i = 104;
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte b = bArr[length];
            for (int i2 = 0; i2 < 7; i2++) {
                int i3 = b & 255;
                if ((b & SignedBytes.MAX_POWER_OF_TWO) != 0) {
                    s = (short) ((s & 65535) ^ (65535 & zzWS0[i]));
                }
                b = (byte) (i3 << 1);
                i--;
            }
        }
        return s;
    }

    private static byte[] zzXv(byte[] bArr) {
        short sZzXu = zzXu(bArr);
        byte[] bArr2 = new byte[16];
        int length = bArr.length;
        if (length % 2 == 1) {
            bArr2[length] = zzV(zzWRZ[0], (byte) ((sZzXu & 65535) >>> 8));
            length--;
            bArr2[length] = zzV(bArr[bArr.length - 1], (byte) (sZzXu & 255));
        }
        while (length > 0) {
            int i = length - 1;
            bArr2[i] = zzV(bArr[i], (byte) ((sZzXu & 65535) >>> 8));
            length -= 2;
            bArr2[length] = zzV(bArr[length], (byte) (sZzXu & 255));
        }
        int i2 = 15;
        for (int length2 = 15 - bArr.length; length2 > 0; length2 -= 2) {
            bArr2[i2] = zzV(zzWRZ[length2], (byte) ((sZzXu & 65535) >>> 8));
            bArr2[i2 - 1] = zzV(zzWRZ[length2 - 1], (byte) (sZzXu & 255));
            i2 -= 2;
        }
        return bArr2;
    }

    private static short zzXw(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        bArr2[0] = (byte) bArr.length;
        com.aspose.words.internal.zzZKV.zzZ(bArr, 0, bArr2, 1, bArr.length);
        short s = 0;
        while (length >= 0) {
            s = (short) ((((short) ((((s & Shorts.MAX_POWER_OF_TWO) == 0 ? 0 : 1) & 65535) | (((short) (((short) ((s & 65535) << 1)) & Short.MAX_VALUE)) & 65535))) & 65535) ^ (bArr2[length] & 255));
            length--;
        }
        return (short) ((s & 65535) ^ 52811);
    }

    private static int zzXx(byte[] bArr) {
        return (int) ((((long) ((zzXu(bArr) & 65535) << 16)) & 4294967295L) + ((long) (zzXw(bArr) & 65535)));
    }

    public static void zzZ(com.aspose.words.internal.zzKD zzkd, int i, String str, String str2) throws Exception {
        byte[] bArrZzyc = zzyc(str2);
        if ((((long) zzXx(bArrZzyc)) & 4294967295L) != (4294967295L & ((long) i))) {
            throw new IncorrectPasswordException("The document password is incorrect.");
        }
        byte[] bArrZzXv = zzXv(bArrZzyc);
        zzZ(bArrZzXv, zzkd.zzIf().zzYu("WordDocument"), 68);
        zzZ(bArrZzXv, zzkd.zzIf().zzYu(str), 0);
        zzZ(bArrZzXv, zzkd.zzIf().zzYu("Data"), 0);
    }

    private static byte zzh(byte b) {
        int i = b & 255;
        return (byte) (((i << 7) | (i >>> 1)) % 256);
    }

    private static byte[] zzyc(String str) {
        int iMin = Math.min(str.length(), 15);
        byte[] bArr = new byte[iMin];
        char[] charArray = str.toCharArray();
        for (int i = 0; i < iMin; i++) {
            byte[] bArrZzW = com.aspose.words.internal.zzZO0.zzhU().zzW(charArray, i, 1);
            byte b = bArrZzW[0];
            if (b == 0) {
                b = bArrZzW[bArrZzW.length - 1];
            }
            bArr[i] = b;
        }
        return bArr;
    }

    private static void zzZ(byte[] bArr, com.aspose.words.internal.zzZOR zzzor, int i) throws Exception {
        if (zzzor == null) {
            return;
        }
        byte[] bArr2 = new byte[i];
        zzzor.zzH(0L);
        zzzor.read(bArr2, 0, i);
        zzzor.zzH(0L);
        int i2 = 0;
        while (zzzor.getPosition() < zzzor.getLength()) {
            byte bZzRI = (byte) zzzor.zzRI();
            int i3 = bZzRI & 255;
            byte b = (byte) ((bArr[i2] & 255) ^ i3);
            if (bZzRI != 0 && b != 0) {
                zzzor.zzH(zzzor.getPosition() - 1);
                zzzor.writeByte((byte) ((bArr[i2] & 255) ^ i3));
            }
            i2 = (i2 + 1) % 16;
        }
        zzzor.zzH(0L);
        zzzor.write(bArr2, 0, i);
    }
}
