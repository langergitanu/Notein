package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
final class zz4E extends zz4D {
    private byte[] zziA;
    private byte[] zziB;
    private byte[] zziC;
    private byte[] zziE;
    private byte[] zziF;
    private int zziI;
    private byte[] zzix;

    public zz4E(int i, String str, String str2) throws Exception {
        this.zziI = i | 512;
        byte[] bArrZzT8 = zzZZS.zzT8(16);
        byte[] bArrZzT82 = zzZZS.zzT8(16);
        byte[] bArrZzXR = zzXR(str);
        byte[] bArrZzXR2 = zzXR(str2);
        zzZ zzz = new zzZ((byte) 0);
        this.zzix = zzZZS.zzT8(32);
        this.zziE = zzZ(bArrZzXR, bArrZzT8, zzz);
        this.zziB = zzZ(bArrZzXR, bArrZzT8, this.zzix, zzz);
        this.zziF = zzY(bArrZzXR2, bArrZzT82, this.zziE, zzz);
        this.zziC = zzZ(bArrZzXR2, bArrZzT82, this.zziE, this.zzix, zzz);
        this.zziA = zzY(i, this.zzix);
    }

    private static int zzV(zzZOR zzzor) throws Exception {
        zzzor.zzH(zzzor.getLength() - 1);
        return zzzor.zzRI();
    }

    private static byte[] zzX(byte[] bArr, byte[] bArr2, byte[] bArr3, zzZ zzz) throws Exception {
        int length = (bArr.length + 64 + (bArr3 != null ? bArr3.length : 0)) * 64;
        zzZOR zzzor = new zzZOR(64);
        zzZOR zzzor2 = new zzZOR(length);
        zzZOR zzzor3 = new zzZOR(length);
        zzZ(zzz.zziw, bArr, bArr2, bArr3, zzzor);
        for (int i = 0; i <= 287; i++) {
            zzZ(bArr, zzzor, bArr3, zzzor2);
            zzZ(zzzor, zzzor2, zzzor3);
            zzZ(zzZ(zzzor3, zzz), zzzor3, zzzor);
            if (i >= 63 && zzV(zzzor3) <= i - 32) {
                break;
            }
        }
        return zzZ(zzzor, 0, 32);
    }

    private static byte[] zzXR(String str) {
        if (!zzZYD.zzXk(str)) {
            return new byte[0];
        }
        byte[] bytes = zzZO0.zzhV().getBytes(str);
        if (bytes.length <= 127) {
            return bytes;
        }
        byte[] bArr = new byte[127];
        System.arraycopy(bytes, 0, bArr, 0, 127);
        return bArr;
    }

    private static byte[] zzY(byte[] bArr, byte[] bArr2, byte[] bArr3, zzZ zzz) throws Exception {
        byte[] bArrZzX = zzX(bArr, zzZk(bArr2), bArr3, zzz);
        byte[] bArr4 = new byte[48];
        System.arraycopy(bArrZzX, 0, bArr4, 0, 32);
        zzZKV.zzZ(bArr2, 0, bArr4, 32, 16);
        return bArr4;
    }

    private static byte[] zzZ(byte[] bArr, byte[] bArr2, zzZ zzz) throws Exception {
        byte[] bArrZzX = zzX(bArr, zzZk(bArr2), null, zzz);
        byte[] bArr3 = new byte[48];
        System.arraycopy(bArrZzX, 0, bArr3, 0, 32);
        zzZKV.zzZ(bArr2, 0, bArr3, 32, 16);
        return bArr3;
    }

    private static byte[] zzZj(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        zzZKV.zzZ(bArr, 8, bArr2, 0, 8);
        return bArr2;
    }

    private static byte[] zzZk(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        System.arraycopy(bArr, 0, bArr2, 0, 8);
        return bArr2;
    }

    @Override // com.aspose.words.internal.zz4D
    public final zz2V zzU7(int i) {
        return new zz2V(this.zzix);
    }

    public static class zzZ {
        public zzH7 zziu;
        public zzH7 zziv;
        public zzH7 zziw;

        private zzZ() {
            this.zziw = zzS1.zzYu(3);
            this.zziv = zzS1.zzYu(4);
            this.zziu = zzS1.zzYu(5);
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    private static byte[] zzY(int i, byte[] bArr) {
        byte[] bArrZzT8 = zzZZS.zzT8(16);
        bArrZzT8[0] = (byte) i;
        bArrZzT8[1] = (byte) (i >> 8);
        bArrZzT8[2] = (byte) (i >> 16);
        bArrZzT8[3] = (byte) (i >> 24);
        bArrZzT8[4] = -1;
        bArrZzT8[5] = -1;
        bArrZzT8[6] = -1;
        bArrZzT8[7] = -1;
        bArrZzT8[8] = 84;
        bArrZzT8[9] = 97;
        bArrZzT8[10] = 100;
        bArrZzT8[11] = 98;
        zzXL zzxlZzW = zzXK.zzW(bArr, new byte[16]);
        byte[] bArr2 = new byte[16];
        zzxlZzW.zzY(bArrZzT8, bArr2);
        return bArr2;
    }

    private static byte[] zzZ(byte[] bArr, byte[] bArr2, byte[] bArr3, zzZ zzz) throws Exception {
        zzXL zzxlZzW = zzXK.zzW(zzX(bArr, zzZj(bArr2), null, zzz), new byte[16]);
        byte[] bArr4 = new byte[32];
        zzxlZzW.zzY(bArr3, bArr4);
        return bArr4;
    }

    private static byte[] zzZ(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, zzZ zzz) throws Exception {
        byte[] bArrZzX = zzX(bArr, zzZj(bArr2), bArr3, zzz);
        byte[] bArr5 = new byte[32];
        zzXK.zzW(bArrZzX, new byte[16]).zzY(bArr4, bArr5);
        return bArr5;
    }

    private static void zzZ(zzH7 zzh7, byte[] bArr, byte[] bArr2, byte[] bArr3, zzZOR zzzor) throws Exception {
        zzh7.zzW(bArr, 0, bArr.length);
        zzh7.zzW(bArr2, 0, bArr2.length);
        if (bArr3 != null) {
            zzh7.zzW(bArr3, 0, bArr3.length);
        }
        int iZzQI = zzh7.zzQI();
        byte[] bArr4 = new byte[iZzQI];
        zzh7.zzo(bArr4);
        zzzor.setLength(0L);
        zzzor.write(bArr4, 0, iZzQI);
    }

    private static void zzZ(zzH7 zzh7, zzZOR zzzor, zzZOR zzzor2) throws Exception {
        zzh7.zzW(zzzor.zziA(), 0, (int) zzzor.getLength());
        int iZzQI = zzh7.zzQI();
        byte[] bArr = new byte[iZzQI];
        zzh7.zzo(bArr);
        zzzor2.setLength(0L);
        zzzor2.write(bArr, 0, iZzQI);
    }

    private static void zzZ(byte[] bArr, zzZOR zzzor, byte[] bArr2, zzZOR zzzor2) throws Exception {
        zzzor2.setLength(0L);
        for (int i = 0; i < 64; i++) {
            zzzor2.write(bArr, 0, bArr.length);
            zzzor2.write(zzzor.zzWy(), 0, (int) zzzor.getLength());
            if (bArr2 != null) {
                zzzor2.write(bArr2, 0, bArr2.length);
            }
        }
    }

    private static void zzZ(zzZOR zzzor, zzZOR zzzor2, zzZOR zzzor3) throws Exception {
        zzXL zzxlZzW = zzXK.zzW(zzZ(zzzor, 0, 16), zzZ(zzzor, 16, 16));
        zzzor2.zzH(0L);
        zzzor3.setLength(0L);
        int blockSize = zzxlZzW.getBlockSize();
        byte[] bArr = new byte[blockSize];
        byte[] bArr2 = new byte[blockSize];
        for (int i = 0; i < zzzor2.getLength(); i += blockSize) {
            zzzor2.read(bArr, 0, blockSize);
            zzxlZzW.zzZ(bArr, 0, bArr2, 0);
            zzzor3.write(bArr2, 0, blockSize);
        }
    }

    private static zzH7 zzZ(zzZOR zzzor, zzZ zzz) throws Exception {
        int iIntValue = new BigInteger(1, zzZ(zzzor, 0, 16)).mod(BigInteger.valueOf(3L)).intValue();
        if (iIntValue == 0) {
            return zzz.zziw;
        }
        if (iIntValue != 1) {
            return zzz.zziu;
        }
        return zzz.zziv;
    }

    private static byte[] zzZ(zzZOR zzzor, int i, int i2) throws Exception {
        byte[] bArr = new byte[i2];
        zzzor.zzH(i);
        zzzor.read(bArr, 0, i2);
        return bArr;
    }

    @Override // com.aspose.words.internal.zz4D
    public final zz4G zzZ(zz4W zz4w) {
        return zz4G.zzZ(zz4w, this.zziI, this.zziA, this.zziF, this.zziC, this.zziE, this.zziB);
    }
}
