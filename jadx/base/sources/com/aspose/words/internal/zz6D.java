package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz6D {
    private static byte[] zzUe(int i) {
        return new byte[]{(byte) (i / 16777216), (byte) (i / 65536), (byte) (i / 256), (byte) i};
    }

    private static void zzV(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    public static byte[] zzY(byte[] bArr, byte[] bArr2, int i, int i2) {
        return zzZ(zzS1.zzD(bArr), bArr2, i, i2);
    }

    private static byte[] zzZ(zzGG zzgg, byte[] bArr, int i, int i2) {
        int size = zzgg.getSize();
        int iCeil = (int) Math.ceil(((double) i2) / ((double) size));
        int i3 = i2 - ((iCeil - 1) * size);
        byte[] bArr2 = new byte[iCeil * size];
        for (int i4 = 1; i4 <= iCeil; i4++) {
            byte[] bArrZzY = zzY(zzgg, bArr, i, i4);
            zzZKV.zzZ(bArrZzY, 0, bArr2, (i4 - 1) * size, bArrZzY.length);
        }
        if (i3 >= size) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i2];
        zzZKV.zzZ(bArr2, 0, bArr3, 0, i2);
        return bArr3;
    }

    private static byte[] zzY(zzGG zzgg, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[zzgg.getSize()];
        byte[] bArrZz1 = new byte[bArr.length + 4];
        zzZKV.zzZ(bArr, 0, bArrZz1, 0, bArr.length);
        zzZKV.zzZ(zzUe(i2), 0, bArrZz1, bArr.length, 4);
        for (int i3 = 0; i3 < i; i3++) {
            bArrZz1 = zzgg.zz1(bArrZz1);
            zzV(bArr2, bArrZz1);
        }
        return bArr2;
    }
}
