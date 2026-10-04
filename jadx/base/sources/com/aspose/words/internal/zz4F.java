package com.aspose.words.internal;

import com.aspose.slides.PatternStyle;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes5.dex */
final class zz4F extends zz4D {
    private static byte[] zziz = {40, -65, 78, 94, 78, 117, -118, 65, 100, 0, 78, 86, -1, -6, 1, 8, PatternStyle.Divot, PatternStyle.Divot, 0, -74, -48, 104, 62, UnsignedBytes.MAX_POWER_OF_TWO, PatternStyle.Shingle, 12, -87, -2, 100, 83, 105, 122};
    private byte[] zziE;
    private byte[] zziF;
    private int zziI;
    private byte[] zziy;

    public zz4F(int i, String str, String str2, zz47 zz47Var) {
        byte[] bArrZzXS = zzXS(str);
        byte[] bArrZzXS2 = zzXS(str2);
        this.zziI = i;
        byte[] bArrZzU = zzU(bArrZzXS, bArrZzXS2);
        this.zziF = bArrZzU;
        byte[] bArrZzZ = zzZ(zz47Var, bArrZzXS, bArrZzU, this.zziI);
        this.zziy = bArrZzZ;
        this.zziE = zzZ(zz47Var, bArrZzZ);
    }

    private static byte[] zzU(byte[] bArr, byte[] bArr2) {
        byte[] bArrZzW = zzIL.zzW(8, bArr2, bArr2.length);
        for (int i = 0; i < 50; i++) {
            bArrZzW = zzIL.zzW(8, bArrZzW, bArrZzW.length);
        }
        byte[] bArr3 = new byte[16];
        byte[] bArr4 = new byte[32];
        zzZZU zzzzu = new zzZZU();
        System.arraycopy(bArrZzW, 0, bArr3, 0, 16);
        zzzzu.zzG(bArr3, 16);
        zzzzu.zzT(bArr, bArr4);
        for (int i2 = 1; i2 < 20; i2++) {
            for (int i3 = 0; i3 < 16; i3++) {
                bArr3[i3] = (byte) ((bArrZzW[i3] & 255) ^ i2);
            }
            zzzzu.zzG(bArr3, 16);
            zzzzu.zzZ9(bArr4);
        }
        return bArr4;
    }

    private static byte[] zzXS(String str) {
        byte[] bytes = zzZYD.zzXk(str) ? zzZO0.zzhV().getBytes(str) : zzZ1.zzXW;
        byte[] bArr = new byte[32];
        zzZKV.zzZ(bytes, 0, bArr, 0, Math.min(bytes.length, 32));
        if (bytes.length < 32) {
            zzZKV.zzZ(zziz, 0, bArr, bytes.length, 32 - bytes.length);
        }
        return bArr;
    }

    private static byte[] zzZ(zz47 zz47Var, byte[] bArr, byte[] bArr2, int i) {
        zzH7 zzh7ZzYu = zzS1.zzYu(8);
        zzh7ZzYu.zzW(bArr, 0, bArr.length);
        zzh7ZzYu.zzW(bArr2, 0, bArr2.length);
        zzh7ZzYu.zzW(new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)}, 0, 4);
        zzh7ZzYu.zzW(zz47Var.zzuD(), 0, zz47Var.zzuD().length);
        byte[] bArrZzW = new byte[16];
        zzh7ZzYu.zzo(bArrZzW);
        for (int i2 = 0; i2 < 50; i2++) {
            bArrZzW = zzIL.zzW(8, bArrZzW, bArrZzW.length);
        }
        return bArrZzW;
    }

    private static byte[] zzZS(int i, int i2) {
        return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), 0, 0};
    }

    @Override // com.aspose.words.internal.zz4D
    public final zz2V zzU7(int i) {
        byte[] bArrZzZS = zzZS(i, 0);
        zzH7 zzh7ZzYu = zzS1.zzYu(8);
        byte[] bArr = this.zziy;
        zzh7ZzYu.zzW(bArr, 0, bArr.length);
        zzh7ZzYu.zzW(bArrZzZS, 0, 5);
        zzh7ZzYu.zzW(new byte[]{115, 65, 108, 84}, 0, 4);
        byte[] bArr2 = new byte[16];
        zzh7ZzYu.zzo(bArr2);
        return new zz2V(bArr2);
    }

    @Override // com.aspose.words.internal.zz4D
    public final zz4G zzZ(zz4W zz4w) {
        return zz4G.zzZ(zz4w, this.zziI, this.zziF, this.zziE);
    }

    private static byte[] zzZ(zz47 zz47Var, byte[] bArr) {
        byte[] bArr2 = new byte[16];
        zzH7 zzh7ZzYu = zzS1.zzYu(8);
        byte[] bArr3 = zziz;
        zzh7ZzYu.zzW(bArr3, 0, bArr3.length);
        zzh7ZzYu.zzW(zz47Var.zzuD(), 0, zz47Var.zzuD().length);
        zzh7ZzYu.zzo(bArr2);
        byte[] bArr4 = new byte[16];
        zzZZU zzzzu = new zzZZU();
        zzzzu.zzG(bArr, bArr.length);
        zzzzu.zzT(bArr2, bArr4);
        byte[] bArr5 = new byte[16];
        for (int i = 1; i < 20; i++) {
            for (int i2 = 0; i2 < bArr.length; i2++) {
                bArr5[i2] = (byte) ((bArr[i2] & 255) ^ i);
            }
            zzzzu.zzG(bArr5, 16);
            zzzzu.zzZ9(bArr4);
        }
        byte[] bArr6 = new byte[32];
        zzZKV.zzZ(bArr4, 0, bArr6, 0, 16);
        return bArr6;
    }
}
