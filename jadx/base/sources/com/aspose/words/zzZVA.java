package com.aspose.words;

import com.aspose.slides.PatternStyle;

/* JADX INFO: loaded from: classes6.dex */
final class zzZVA implements zzZBN {
    private com.aspose.words.internal.zzFU zzYLT = com.aspose.words.internal.zzS1.zzRu();

    private static void zzT(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzl(131076);
        zzzow.zzl(36);
        zzzow.zzl(140);
        zzzow.zzl(36);
        zzzow.zzl(0);
        zzzow.zzl(26126);
        zzzow.zzl(32772);
        zzzow.zzl(128);
        zzzow.zzl(24);
        zzzow.zzl(0);
        zzzow.zzl(0);
        zzYOP.zzZ("Microsoft Enhanced RSA and AES Cryptographic Provider", zzzow);
    }

    private byte[] zzZjP() {
        byte[] bArr = new byte[16];
        this.zzYLT.nextBytes(bArr);
        return bArr;
    }

    @Override // com.aspose.words.zzZBN
    public final void zzY(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZOP zzzop2, com.aspose.words.internal.zzZOP zzzop3, String str) throws Exception {
        com.aspose.words.internal.zzZOW zzzow = new com.aspose.words.internal.zzZOW(zzzop);
        zzT(zzzow);
        byte[] bArrZzZjP = zzZjP();
        com.aspose.words.internal.zzXL zzxlZzT = com.aspose.words.internal.zzXK.zzT(zzZ(128, com.aspose.words.internal.zzS1.zzYu(1), str, bArrZzZjP));
        zzZ(zzxlZzT, bArrZzZjP).zzZ(zzzow);
        zzY(zzxlZzT, zzzop2, zzzop3);
    }

    @Override // com.aspose.words.zzZBN
    public final void zzZ(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZOP zzzop2, com.aspose.words.internal.zzZOP zzzop3, String str) throws Exception {
        zzzop.zzH(8L);
        com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(zzzop);
        zzZUJ zzzuj = new zzZUJ(zzzox);
        zzZUG zzzug = new zzZUG(zzzox, true);
        zzZ(zzzuj);
        com.aspose.words.internal.zzXL zzxlZzU = com.aspose.words.internal.zzXK.zzU(zzZ(zzzuj.zzYLi, com.aspose.words.internal.zzS1.zzYu(1), str, zzzug.zzYL3));
        zzZ(zzxlZzU, zzzug);
        zzZ(zzxlZzU, zzzop2, zzzop3);
    }

    private static void zzY(com.aspose.words.internal.zzXL zzxl, com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZOP zzzop2) throws Exception {
        zzzop.zzH(0L);
        zzzop2.zzH(0L);
        long length = zzzop.getLength();
        zzzop.setLength(com.aspose.words.internal.zzAN.zzN(zzzop.getLength(), 16));
        new com.aspose.words.internal.zzZOW(zzzop2).zzQ(length);
        zzzop2.setLength(com.aspose.words.internal.zzAN.zzN(length, 16) + 8);
        zzxl.zzZ(zzzop, zzzop2);
        zzzop.zzH(0L);
        zzzop2.zzH(0L);
    }

    private static void zzZ(zzZUJ zzzuj) throws Exception {
        if (zzzuj.zzZjA == 36) {
            int i = zzzuj.zzYLk;
            if (i != 26126 && i != 26127 && i != 26128) {
                throw new IllegalStateException("Unexpected encryption algorithm id.");
            }
            if (zzzuj.zzYLj != 32772) {
                throw new IllegalStateException("Unexpected encryption algorithm hash id.");
            }
            return;
        }
        throw new IllegalStateException("Unexpected encryption flags.");
    }

    private static void zzZ(com.aspose.words.internal.zzXL zzxl, zzZUG zzzug) throws Exception {
        byte[] bArr = zzzug.zzYL2;
        byte[] bArrZzZ = zzZ(zzxl, bArr, bArr.length);
        byte[] bArr2 = zzzug.zzYL0;
        if (!com.aspose.words.internal.zzZ1.zzZ(zzZ(zzxl, bArr2, bArr2.length), com.aspose.words.internal.zzIL.zzW(1, bArrZzZ, bArrZzZ.length), zzzug.zzYL1)) {
            throw new IncorrectPasswordException("The document password is incorrect.");
        }
    }

    private static void zzZ(com.aspose.words.internal.zzXL zzxl, com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZOP zzzop2) throws Exception {
        zzzop.zzH(0L);
        zzzop2.zzH(0L);
        long jZzX8 = new com.aspose.words.internal.zzZOX(zzzop).zzX8();
        zzzop2.setLength(com.aspose.words.internal.zzAN.zzN(jZzX8, 512));
        zzxl.zzZ(zzzop, zzzop2);
        zzzop2.setLength(jZzX8);
        zzzop.zzH(0L);
        zzzop2.zzH(0L);
    }

    private zzZUG zzZ(com.aspose.words.internal.zzXL zzxl, byte[] bArr) throws Exception {
        byte[] bArrZzZjP = zzZjP();
        byte[] bArrZzW = com.aspose.words.internal.zzIL.zzW(1, bArrZzZjP, bArrZzZjP.length);
        byte[] bArr2 = new byte[32];
        System.arraycopy(bArrZzW, 0, bArr2, 0, bArrZzW.length);
        zzZUG zzzug = new zzZUG();
        zzzug.zzYL3 = bArr;
        zzzug.zzYL4 = 16;
        zzzug.zzYL1 = 32;
        zzzug.zzYL2 = zzZ(zzxl, bArrZzZjP, 16);
        zzzug.zzYL0 = zzZ(zzxl, bArr2, 32);
        return zzzug;
    }

    private static byte[] zzZ(int i, com.aspose.words.internal.zzH7 zzh7, String str, byte[] bArr) {
        byte[] bArrZzZ = zzZ(zzh7, str, bArr);
        byte[] bArrZzZ2 = zzZ(zzh7, PatternStyle.DiagonalCross, bArrZzZ);
        byte[] bArrZzZ3 = zzZ(zzh7, (byte) 92, bArrZzZ);
        byte[] bArr2 = new byte[bArrZzZ2.length + bArrZzZ3.length];
        System.arraycopy(bArrZzZ2, 0, bArr2, 0, bArrZzZ2.length);
        System.arraycopy(bArrZzZ3, 0, bArr2, bArrZzZ2.length, bArrZzZ3.length);
        int i2 = i / 8;
        byte[] bArr3 = new byte[i2];
        com.aspose.words.internal.zzZKV.zzZ(bArr2, 0, bArr3, 0, i2);
        return bArr3;
    }

    private static byte[] zzZ(com.aspose.words.internal.zzH7 zzh7, String str, byte[] bArr) {
        if (str == null) {
            str = "";
        }
        byte[] bytes = com.aspose.words.internal.zzZO0.zzhU().getBytes(str);
        byte[] bArr2 = new byte[bArr.length + bytes.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(bytes, 0, bArr2, bArr.length, bytes.length);
        byte[] bArrZzZ = com.aspose.words.internal.zzIL.zzZ(zzh7, bArr2);
        byte[] bArr3 = new byte[bArrZzZ.length + 4];
        for (int i = 0; i < 50000; i++) {
            com.aspose.words.internal.zzZ1.zzZ(i, bArr3, 0);
            System.arraycopy(bArrZzZ, 0, bArr3, 4, bArrZzZ.length);
            bArrZzZ = com.aspose.words.internal.zzIL.zzZ(zzh7, bArr3);
        }
        System.arraycopy(bArrZzZ, 0, bArr3, 0, bArrZzZ.length);
        com.aspose.words.internal.zzZ1.zzZ(0, bArr3, bArrZzZ.length);
        return com.aspose.words.internal.zzIL.zzZ(zzh7, bArr3);
    }

    private static byte[] zzZ(com.aspose.words.internal.zzH7 zzh7, byte b, byte[] bArr) {
        byte[] bArr2 = new byte[64];
        for (int i = 0; i < 64; i++) {
            bArr2[i] = b;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr2[i2] = (byte) ((bArr2[i2] & 255) ^ (bArr[i2] & 255));
        }
        return com.aspose.words.internal.zzIL.zzZ(zzh7, bArr2);
    }

    private static byte[] zzZ(com.aspose.words.internal.zzXL zzxl, byte[] bArr, int i) {
        if (bArr != null) {
            int outputSize = zzxl.getOutputSize(i);
            byte[] bArr2 = new byte[0];
            if (outputSize <= 0) {
                return bArr2;
            }
            byte[] bArr3 = new byte[outputSize];
            int iZzY = i > 0 ? zzxl.zzY(bArr, 0, i, bArr3, 0) : 0;
            if (iZzY >= outputSize) {
                return bArr3;
            }
            byte[] bArr4 = new byte[iZzY];
            com.aspose.words.internal.zzZKV.zzZ(bArr3, 0, bArr4, 0, iZzY);
            return bArr4;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: input");
    }
}
