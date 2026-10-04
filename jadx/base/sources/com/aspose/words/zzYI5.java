package com.aspose.words;

import com.aspose.slides.PatternStyle;

/* JADX INFO: loaded from: classes6.dex */
final class zzYI5 {
    private static byte[] zzX(byte[] bArr, byte[] bArr2, int i) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        zzzor.write(zzXS(bArr), 0, zzXS(bArr).length);
        byte[] bArrZzW = com.aspose.words.internal.zzIL.zzW(zzXR(bArr), bArr2, bArr2.length);
        zzzor.write(bArrZzW, 0, bArrZzW.length);
        if (i < zzzor.getLength() + 11) {
            zzY3F.zzje(11);
        }
        com.aspose.words.internal.zzZOR zzzor2 = new com.aspose.words.internal.zzZOR();
        zzzor2.writeByte((byte) 0);
        zzzor2.writeByte((byte) 1);
        int length = (i - ((int) zzzor.getLength())) - 3;
        for (int i2 = 0; i2 < length; i2++) {
            zzzor2.writeByte((byte) -1);
        }
        zzzor2.writeByte((byte) 0);
        zzzor.zzZH(zzzor2);
        return zzzor2.zzWy();
    }

    private static int zzXR(byte[] bArr) {
        int length = bArr.length;
        if (length == 128) {
            return 1;
        }
        if (length == 256) {
            return 3;
        }
        throw new IllegalStateException(com.aspose.words.internal.zzZKN.format(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{110, 85, 120, 101, 101, 112, 116, 99, 100, 101, 112, 32, 98, 117, 105, 108, 32, 99, 101, 107, 32, 121, 111, 109, 117, 100, 117, 108, 32, 115, 101, 108, 103, 110, 104, 116, 32, 58, PatternStyle.Wave, 123, 125}), Integer.valueOf(bArr.length)));
    }

    private static byte[] zzXS(byte[] bArr) {
        return zzXR(bArr) == 1 ? new byte[]{PatternStyle.Wave, 33, PatternStyle.Wave, 9, 6, 5, PatternStyle.Sphere, 14, 3, 2, 26, 5, 0, 4, 20} : new byte[]{PatternStyle.Wave, PatternStyle.Horizontal, PatternStyle.Wave, 13, 6, 9, 96, -122, 72, 1, 101, 3, 4, 2, 1, 5, 0, 4, 32};
    }

    private static boolean zzY(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws Exception {
        boolean z;
        if (bArr4.length != bArr.length) {
            zzY3F.zzje(1);
            z = true;
        } else {
            z = false;
        }
        byte[] bArrZzZc = com.aspose.words.internal.zz0W.zzZc(bArr4);
        com.aspose.words.internal.zzZZ8 zzzz8 = new com.aspose.words.internal.zzZZ8(bArr, bArr2);
        byte[] bArrZzZ = com.aspose.words.internal.zz0W.zzZ(zzzz8, bArrZzZc);
        byte[] bArrZzI = com.aspose.words.internal.zz0W.zzI(bArrZzZ, zzzz8.getModulus().bitLength() >> 3);
        byte[] bArrZzX = zzX(bArr, bArr3, bArrZzI.length);
        if (bArrZzI.length != bArrZzX.length) {
            z = true;
        } else {
            for (int i = 0; i < bArrZzI.length; i++) {
                z = z || bArrZzI[i] != bArrZzX[i];
            }
        }
        zzYB3 zzyb3 = new zzYB3(bArrZzZ);
        zzyb3.zzVJ(bArrZzZc.length, bArrZzX.length);
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        zzzor.write(bArrZzZ, 0, bArrZzZ.length);
        zzyb3.zzZ(zzzor, bArrZzX, bArrZzZc.length);
        if (zzyb3.zzY7T()) {
            bArrZzZc[0] = 0;
            bArrZzZc[1] = 17;
        }
        zzYB2 zzyb2 = new zzYB2(zzyb3, bArrZzI, zzyb3.zzY7T());
        com.aspose.words.internal.zzZKV.zzZ(bArrZzZ, 0, new int[bArrZzZ.length], 0, bArrZzZ.length);
        zzyb2.zzZ(zzyb3);
        zzyb2.zzY7P();
        zzyb2.zzY7Q();
        zzyb3.zzY7S();
        com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{PatternStyle.Vertical, PatternStyle.Horizontal, PatternStyle.DownwardDiagonal, PatternStyle.Cross, PatternStyle.DiagonalCross, PatternStyle.UpwardDiagonal, 56, 55, PatternStyle.Wave, 57, 66, 65, 68, 67, 70, 69});
        zzyb2.zzY7P();
        zzyb2.zzB4(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{115, 65, 111, 112, 101, 115, 87, PatternStyle.Divot, 114, 111, 115, 100}));
        return !z;
    }

    public static boolean zzZ(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws Exception {
        return zzY(bArr, bArr2, bArr3, bArr4);
    }
}
