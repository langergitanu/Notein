package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzRW {
    public static int zzZ(zzIJ zzij, zzIE zzie, short s) {
        int i = (zzij.zzN8 & 255) * 64 * zzie.zzxH;
        int i2 = 65535 & s;
        return ((((i2 / 2) + i) / i2) + 32) / 64;
    }

    public static byte[] zzZ(byte[] bArr, short s) {
        byte[] bArr2 = new byte[bArr.length];
        int i = s & 65535;
        bArr2[0] = (byte) (i >>> 8);
        bArr2[1] = (byte) i;
        zzZKV.zzZ(bArr, 2, bArr2, 2, bArr.length - 2);
        return bArr2;
    }
}
