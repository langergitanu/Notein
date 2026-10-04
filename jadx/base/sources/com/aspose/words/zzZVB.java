package com.aspose.words;

import com.aspose.slides.PatternStyle;
import com.google.common.base.Ascii;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;

/* JADX INFO: loaded from: classes6.dex */
final class zzZVB implements zzZBN {
    private byte[] zzYLZ;
    private com.aspose.words.internal.zzH7 zzYM0;
    private com.aspose.words.internal.zzH7 zzYM1;
    private com.aspose.words.internal.zzXL zzYM2;
    private zzZUI zzYM3;
    private static byte[] zzYLY = {-2, -89, -46, 118, 59, 75, -98, 121};
    private static byte[] zzYLX = {-41, -86, 15, 109, PatternStyle.Wave, 97, PatternStyle.DownwardDiagonal, 78};
    private static byte[] zzYLW = {20, 110, 11, -25, -85, -84, -48, -42};
    private static byte[] zzYLV = {95, -78, -83, 1, 12, -71, -31, -10};
    private static byte[] zzYLU = {-96, 103, Ascii.DEL, 2, -78, PatternStyle.Weave, -124, PatternStyle.Cross};

    private byte[] decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        com.aspose.words.internal.zzXL zzxlZzZ = com.aspose.words.internal.zzXK.zzZ(this.zzYM3.zzZjo().zzZjj(), this.zzYM3.zzZjo().getBlockSize(), bArr, bArr2);
        this.zzYM2 = zzxlZzZ;
        byte[] bArr4 = new byte[bArr3.length];
        zzxlZzZ.zzZ(bArr3, bArr3.length, bArr4);
        return bArr4;
    }

    private void zzG(String str, String str2, String str3) {
        this.zzYM1 = com.aspose.words.internal.zzS1.zzq(str2);
        this.zzYM0 = com.aspose.words.internal.zzS1.zzq(str3);
        this.zzYLZ = zzZ(str, this.zzYM3.zzZjo().zzZjh(), this.zzYM3.zzZjo().zzZjl());
    }

    private byte[] zzYk(byte[] bArr) {
        return zzZ(this.zzYM1, this.zzYLZ, bArr, this.zzYM3.zzZjo().zzZjn() >> 3, PatternStyle.DiagonalCross);
    }

    private boolean zzZjQ() {
        byte[] bArrZzZjh = this.zzYM3.zzZjo().zzZjh();
        return com.aspose.words.internal.zzZ1.zzZ(zzZ(zzY(bArrZzZjh, this.zzYM3.zzZjo().zzYnR(), zzYLX), this.zzYM3.zzZjo().zzZjm(), (byte) 0), zzZ(this.zzYM1, zzY(bArrZzZjh, this.zzYM3.zzZjo().zzYnS(), zzYLY)));
    }

    private boolean zzZp(com.aspose.words.internal.zzZOP zzzop) {
        byte[] bArrZzZjh = this.zzYM3.zzZjo().zzZjh();
        byte[] bArrZzZjh2 = this.zzYM3.zzZjh();
        int iZzZjm = this.zzYM3.zzZjm();
        int blockSize = this.zzYM3.getBlockSize();
        byte[] bArrZzY = zzY(bArrZzZjh, this.zzYM3.zzZjo().zzYnQ(), zzYLW);
        byte[] bArrZzZ = zzZ(this.zzYM0, bArrZzZjh2, zzYLV, blockSize, (byte) 0);
        com.aspose.words.internal.zzGG zzggZzo = com.aspose.words.internal.zzS1.zzo(this.zzYM3.zzZji());
        zzggZzo.init(zzZ(bArrZzY, bArrZzZ, this.zzYM3.zzZjq(), iZzZjm));
        return com.aspose.words.internal.zzZ1.zzZ(zzZ(zzggZzo, zzzop), zzZ(bArrZzY, zzZ(this.zzYM0, bArrZzZjh2, zzYLU, blockSize, (byte) 0), this.zzYM3.zzZjp(), iZzZjm));
    }

    @Override // com.aspose.words.zzZBN
    public final void zzY(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZOP zzzop2, com.aspose.words.internal.zzZOP zzzop3, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.words.zzZBN
    public final void zzZ(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZOP zzzop2, com.aspose.words.internal.zzZOP zzzop3, String str) throws Exception {
        zzzop.zzH(8L);
        zzZUI zzzui = new zzZUI(new com.aspose.words.internal.zzZOX(zzzop));
        this.zzYM3 = zzzui;
        if (!AES256KeyLoader.AES_ALGORITHM.equals(zzzui.zzZjo().zzZjk())) {
            throw new IllegalStateException("Unsupported cipher algorithm.");
        }
        zzG(str, this.zzYM3.zzZjo().zzZji(), this.zzYM3.zzZji());
        if (!zzZjQ()) {
            throw new IncorrectPasswordException("The document password is incorrect.");
        }
        if (!zzZp(zzzop2)) {
            throw new FileCorruptedException("The document integrity is failed.");
        }
        zzZ(zzzop2, zzzop3, zzY(this.zzYM3.zzZjo().zzZjh(), this.zzYM3.zzZjo().zzYnQ(), zzYLW));
    }

    private byte[] zzY(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return decrypt(zzYk(bArr3), bArr, bArr2);
    }

    private void zzZ(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZOP zzzop2, byte[] bArr) throws Exception {
        zzzop.zzH(0L);
        zzzop2.zzH(0L);
        long jZzX8 = new com.aspose.words.internal.zzZOX(zzzop).zzX8();
        zzzop2.setLength(com.aspose.words.internal.zzAN.zzN(jZzX8, 512));
        int i = 4096;
        byte[] bArr2 = new byte[4096];
        int i2 = 0;
        while (zzzop.getPosition() < zzzop.getLength()) {
            int iMin = Math.min((int) (zzzop.getLength() - zzzop.getPosition()), i);
            zzzop.read(bArr2, 0, iMin);
            zzzop2.write(decrypt(bArr, zzZ(this.zzYM0, this.zzYM3.zzZjh(), com.aspose.words.internal.zzZQK.getBytes(i2), this.zzYM3.getBlockSize(), PatternStyle.DiagonalCross), bArr2), 0, iMin);
            i2++;
            i = 4096;
        }
        zzzop2.setLength(jZzX8);
        zzzop2.zzH(0L);
    }

    private byte[] zzZ(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        return zzZ(decrypt(bArr, bArr2, bArr3), i, (byte) 0);
    }

    private byte[] zzZ(String str, byte[] bArr, int i) {
        com.aspose.words.internal.zzZO0 zzzo0ZzhU = com.aspose.words.internal.zzZO0.zzhU();
        if (str == null) {
            str = "";
        }
        byte[] bArrZzZ = zzZ(this.zzYM1, bArr, zzzo0ZzhU.getBytes(str));
        byte[] bArr2 = new byte[bArrZzZ.length + 4];
        for (int i2 = 0; i2 < i; i2++) {
            com.aspose.words.internal.zzZ1.zzZ(i2, bArr2, 0);
            System.arraycopy(bArrZzZ, 0, bArr2, 4, bArrZzZ.length);
            bArrZzZ = zzZ(this.zzYM1, bArr2);
        }
        return bArrZzZ;
    }

    private static byte[] zzZ(com.aspose.words.internal.zzH7 zzh7, byte[] bArr, byte[] bArr2, int i, byte b) {
        return zzZ(zzZ(zzh7, bArr, bArr2), i, b);
    }

    private static byte[] zzZ(com.aspose.words.internal.zzH7 zzh7, byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return zzZ(zzh7, bArr3);
    }

    private static byte[] zzZ(byte[] bArr, int i, byte b) {
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            bArr2[i2] = i2 < Math.min(i, bArr.length) ? bArr[i2] : b;
            i2++;
        }
        return bArr2;
    }

    private static byte[] zzZ(com.aspose.words.internal.zzH7 zzh7, byte[] bArr) {
        zzh7.zzW(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[zzh7.zzQI()];
        zzh7.zzo(bArr2);
        return bArr2;
    }

    private static byte[] zzZ(com.aspose.words.internal.zzGG zzgg, com.aspose.words.internal.zzZOP zzzop) {
        return zzgg.zz1(com.aspose.words.internal.zzZYQ.zzZX(zzzop));
    }
}
