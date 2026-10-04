package com.aspose.words.internal;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes5.dex */
final class zzYXS implements zzYGP, zzYUU {
    private static final byte[] zzW60 = {0, -1, 0, -1, 0, -1, 0, -1, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, -1};
    byte[] zzW61;
    byte[] zzW62;
    byte[] zzW63;
    short[] zzW64;
    short[] zzW65;
    private byte[] zzW66;
    private zzYV8 zzW67;
    private byte[][] zzW68;
    private byte[] zzW69;
    private byte[] zzW6a;
    private byte[] zzW6b;
    private byte[] zzW6c;
    private byte[] zzW6q;
    byte[] zzWch;
    byte[] zzWkD;
    private long zzWnf;
    private int zzWng;
    private byte[] zzWnh;

    public zzYXS() {
        this.zzW6c = new byte[32];
        this.zzW6b = new byte[32];
        this.zzW6a = new byte[32];
        this.zzW69 = new byte[32];
        this.zzW68 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.zzWnh = new byte[32];
        this.zzW67 = new zzYXW();
        this.zzW66 = new byte[32];
        this.zzWch = new byte[8];
        this.zzW65 = new short[16];
        this.zzW64 = new short[16];
        this.zzWkD = new byte[32];
        this.zzW63 = new byte[32];
        this.zzW62 = new byte[32];
        this.zzW61 = new byte[32];
        byte[] bArrZzwC = zzYXW.zzwC("D-A");
        this.zzW6q = bArrZzwC;
        this.zzW67.zzZ(true, new zzYXU(null, bArrZzwC));
        reset();
    }

    private void finish() {
        zzYGN.zzV(this.zzWnf * 8, this.zzW6b, 0);
        while (this.zzWng != 0) {
            update((byte) 0);
        }
        zzWu(this.zzW6b);
        zzWu(this.zzW69);
    }

    private void zzWt(byte[] bArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.zzW69;
            if (i == bArr2.length) {
                return;
            }
            int i3 = (bArr2[i] & 255) + (bArr[i] & 255) + i2;
            bArr2[i] = (byte) i3;
            i2 = i3 >>> 8;
            i++;
        }
    }

    private void zzWu(byte[] bArr) {
        System.arraycopy(bArr, 0, this.zzW6a, 0, 32);
        System.arraycopy(this.zzW6c, 0, this.zzW63, 0, 32);
        System.arraycopy(this.zzW6a, 0, this.zzW62, 0, 32);
        for (int i = 0; i < 32; i++) {
            this.zzW61[i] = (byte) (this.zzW63[i] ^ this.zzW62[i]);
        }
        zzZ(zzWx(this.zzW61), this.zzWkD, 0, this.zzW6c, 0);
        for (int i2 = 1; i2 < 4; i2++) {
            byte[] bArrZzWw = zzWw(this.zzW63);
            for (int i3 = 0; i3 < 32; i3++) {
                this.zzW63[i3] = (byte) (bArrZzWw[i3] ^ this.zzW68[i2][i3]);
            }
            this.zzW62 = zzWw(zzWw(this.zzW62));
            for (int i4 = 0; i4 < 32; i4++) {
                this.zzW61[i4] = (byte) (this.zzW63[i4] ^ this.zzW62[i4]);
            }
            int i5 = i2 * 8;
            zzZ(zzWx(this.zzW61), this.zzWkD, i5, this.zzW6c, i5);
        }
        for (int i6 = 0; i6 < 12; i6++) {
            zzWv(this.zzWkD);
        }
        for (int i7 = 0; i7 < 32; i7++) {
            byte[] bArr2 = this.zzWkD;
            bArr2[i7] = (byte) (bArr2[i7] ^ this.zzW6a[i7]);
        }
        zzWv(this.zzWkD);
        for (int i8 = 0; i8 < 32; i8++) {
            byte[] bArr3 = this.zzWkD;
            bArr3[i8] = (byte) (this.zzW6c[i8] ^ bArr3[i8]);
        }
        for (int i9 = 0; i9 < 61; i9++) {
            zzWv(this.zzWkD);
        }
        byte[] bArr4 = this.zzWkD;
        byte[] bArr5 = this.zzW6c;
        System.arraycopy(bArr4, 0, bArr5, 0, bArr5.length);
    }

    private void zzWv(byte[] bArr) {
        zzZ(bArr, this.zzW65);
        short[] sArr = this.zzW64;
        short[] sArr2 = this.zzW65;
        sArr[15] = (short) (((((sArr2[0] ^ sArr2[1]) ^ sArr2[2]) ^ sArr2[3]) ^ sArr2[12]) ^ sArr2[15]);
        System.arraycopy(sArr2, 1, sArr, 0, 15);
        zzZ(this.zzW64, bArr);
    }

    private byte[] zzWw(byte[] bArr) {
        for (int i = 0; i < 8; i++) {
            this.zzWch[i] = (byte) (bArr[i] ^ bArr[i + 8]);
        }
        System.arraycopy(bArr, 8, bArr, 0, 24);
        System.arraycopy(this.zzWch, 0, bArr, 24, 8);
        return bArr;
    }

    private byte[] zzWx(byte[] bArr) {
        for (int i = 0; i < 8; i++) {
            byte[] bArr2 = this.zzW66;
            int i2 = i * 4;
            bArr2[i2] = bArr[i];
            bArr2[i2 + 1] = bArr[i + 8];
            bArr2[i2 + 2] = bArr[i + 16];
            bArr2[i2 + 3] = bArr[i + 24];
        }
        return this.zzW66;
    }

    private void zzZ(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2) {
        this.zzW67.zzZ(true, new zzYS7(bArr));
        this.zzW67.zzY(bArr3, i2, bArr2, i);
    }

    @Override // com.aspose.words.internal.zzYUX
    public final int doFinal(byte[] bArr, int i) {
        finish();
        byte[] bArr2 = this.zzW6c;
        System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
        reset();
        return 32;
    }

    @Override // com.aspose.words.internal.zzYUX
    public final void reset() {
        this.zzWnf = 0L;
        this.zzWng = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.zzW6c;
            if (i >= bArr.length) {
                break;
            }
            bArr[i] = 0;
            i++;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = this.zzW6b;
            if (i2 >= bArr2.length) {
                break;
            }
            bArr2[i2] = 0;
            i2++;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr3 = this.zzW6a;
            if (i3 >= bArr3.length) {
                break;
            }
            bArr3[i3] = 0;
            i3++;
        }
        int i4 = 0;
        while (true) {
            byte[] bArr4 = this.zzW68[1];
            if (i4 >= bArr4.length) {
                break;
            }
            bArr4[i4] = 0;
            i4++;
        }
        int i5 = 0;
        while (true) {
            byte[] bArr5 = this.zzW68[3];
            if (i5 >= bArr5.length) {
                break;
            }
            bArr5[i5] = 0;
            i5++;
        }
        int i6 = 0;
        while (true) {
            byte[] bArr6 = this.zzW69;
            if (i6 >= bArr6.length) {
                break;
            }
            bArr6[i6] = 0;
            i6++;
        }
        int i7 = 0;
        while (true) {
            byte[] bArr7 = this.zzWnh;
            if (i7 >= bArr7.length) {
                byte[] bArr8 = zzW60;
                System.arraycopy(bArr8, 0, this.zzW68[2], 0, bArr8.length);
                return;
            } else {
                bArr7[i7] = 0;
                i7++;
            }
        }
    }

    @Override // com.aspose.words.internal.zzYUX
    public final void update(byte b) {
        byte[] bArr = this.zzWnh;
        int i = this.zzWng;
        int i2 = i + 1;
        this.zzWng = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            zzWt(bArr);
            zzWu(this.zzWnh);
            this.zzWng = 0;
        }
        this.zzWnf++;
    }

    @Override // com.aspose.words.internal.zzYUX
    public final int zzQI() {
        return 32;
    }

    @Override // com.aspose.words.internal.zzYGP
    public final zzYGP zzXE2() {
        return new zzYXS(this);
    }

    @Override // com.aspose.words.internal.zzYUU, com.aspose.words.internal.zzYUX
    public final int zzXE6() {
        return 32;
    }

    @Override // com.aspose.words.internal.zzYUX
    public final String zzXGi() {
        return "GOST3411";
    }

    private static void zzZ(byte[] bArr, short[] sArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            int i2 = i * 2;
            sArr[i] = (short) ((bArr[i2] & 255) | ((bArr[i2 + 1] << 8) & 65280));
        }
    }

    private static void zzZ(short[] sArr, byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            int i2 = i * 2;
            short s = sArr[i];
            bArr[i2 + 1] = (byte) (s >> 8);
            bArr[i2] = (byte) s;
        }
    }

    @Override // com.aspose.words.internal.zzYUX
    public final void update(byte[] bArr, int i, int i2) {
        while (this.zzWng != 0 && i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
        while (true) {
            byte[] bArr2 = this.zzWnh;
            if (i2 <= bArr2.length) {
                break;
            }
            System.arraycopy(bArr, i, bArr2, 0, bArr2.length);
            zzWt(this.zzWnh);
            zzWu(this.zzWnh);
            byte[] bArr3 = this.zzWnh;
            i += bArr3.length;
            i2 -= bArr3.length;
            this.zzWnf += (long) bArr3.length;
        }
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }

    @Override // com.aspose.words.internal.zzYGP
    public final void zzZ(zzYGP zzygp) {
        zzYXS zzyxs = (zzYXS) zzygp;
        byte[] bArr = zzyxs.zzW6q;
        this.zzW6q = bArr;
        this.zzW67.zzZ(true, new zzYXU(null, bArr));
        reset();
        byte[] bArr2 = zzyxs.zzW6c;
        System.arraycopy(bArr2, 0, this.zzW6c, 0, bArr2.length);
        byte[] bArr3 = zzyxs.zzW6b;
        System.arraycopy(bArr3, 0, this.zzW6b, 0, bArr3.length);
        byte[] bArr4 = zzyxs.zzW6a;
        System.arraycopy(bArr4, 0, this.zzW6a, 0, bArr4.length);
        byte[] bArr5 = zzyxs.zzW69;
        System.arraycopy(bArr5, 0, this.zzW69, 0, bArr5.length);
        byte[] bArr6 = zzyxs.zzW68[1];
        System.arraycopy(bArr6, 0, this.zzW68[1], 0, bArr6.length);
        byte[] bArr7 = zzyxs.zzW68[2];
        System.arraycopy(bArr7, 0, this.zzW68[2], 0, bArr7.length);
        byte[] bArr8 = zzyxs.zzW68[3];
        System.arraycopy(bArr8, 0, this.zzW68[3], 0, bArr8.length);
        byte[] bArr9 = zzyxs.zzWnh;
        System.arraycopy(bArr9, 0, this.zzWnh, 0, bArr9.length);
        this.zzWng = zzyxs.zzWng;
        this.zzWnf = zzyxs.zzWnf;
    }

    public zzYXS(byte[] bArr) {
        this.zzW6c = new byte[32];
        this.zzW6b = new byte[32];
        this.zzW6a = new byte[32];
        this.zzW69 = new byte[32];
        this.zzW68 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.zzWnh = new byte[32];
        this.zzW67 = new zzYXW();
        this.zzW66 = new byte[32];
        this.zzWch = new byte[8];
        this.zzW65 = new short[16];
        this.zzW64 = new short[16];
        this.zzWkD = new byte[32];
        this.zzW63 = new byte[32];
        this.zzW62 = new byte[32];
        this.zzW61 = new byte[32];
        byte[] bArrZzVI = zzYGU.zzVI(bArr);
        this.zzW6q = bArrZzVI;
        this.zzW67.zzZ(true, new zzYXU(null, bArrZzVI));
        reset();
    }

    public zzYXS(zzYXS zzyxs) {
        this.zzW6c = new byte[32];
        this.zzW6b = new byte[32];
        this.zzW6a = new byte[32];
        this.zzW69 = new byte[32];
        this.zzW68 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 4, 32);
        this.zzWnh = new byte[32];
        this.zzW67 = new zzYXW();
        this.zzW66 = new byte[32];
        this.zzWch = new byte[8];
        this.zzW65 = new short[16];
        this.zzW64 = new short[16];
        this.zzWkD = new byte[32];
        this.zzW63 = new byte[32];
        this.zzW62 = new byte[32];
        this.zzW61 = new byte[32];
        zzZ(zzyxs);
    }
}
