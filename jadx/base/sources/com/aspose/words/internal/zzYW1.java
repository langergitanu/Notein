package com.aspose.words.internal;

import Oooo0oO.C21023OooO0Oo;

/* JADX INFO: loaded from: classes5.dex */
class zzYW1 implements zzYUG {
    private int index;
    private int zzW2e;
    private int zzW2f;
    private int zzW2g;
    private byte[] zzW2h;
    protected int[] zzW2i;
    protected int[] zzW2j;
    protected int zzW2k;
    private boolean zzW9m;
    private static final int[] zzWbh = zzYGN.zzZK(zzYGI.zzwb("expand 16-byte kexpand 32-byte k"), 0);
    protected static final byte[] zzW2m = zzYGI.zzwb("expand 32-byte k");
    protected static final byte[] zzW2l = zzYGI.zzwb("expand 16-byte k");

    public zzYW1() {
        this((byte) 0);
    }

    public static void zzR(int i, int[] iArr) {
        int i2 = (i - 16) / 4;
        int[] iArr2 = zzWbh;
        iArr[0] = iArr2[i2];
        iArr[1] = iArr2[i2 + 1];
        iArr[2] = iArr2[i2 + 2];
        iArr[3] = iArr2[i2 + 3];
    }

    public static int zzUG(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    private boolean zzXD4() {
        int i = this.zzW2g + 1;
        this.zzW2g = i;
        if (i == 0) {
            int i2 = this.zzW2f + 1;
            this.zzW2f = i2;
            if (i2 == 0) {
                int i3 = this.zzW2e + 1;
                this.zzW2e = i3;
                if ((i3 & 32) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private void zzXD5() {
        this.zzW2g = 0;
        this.zzW2f = 0;
        this.zzW2e = 0;
    }

    private boolean zzfj(int i) {
        int i2 = this.zzW2g + i;
        this.zzW2g = i2;
        if (i2 < i && i2 >= 0) {
            int i3 = this.zzW2f + 1;
            this.zzW2f = i3;
            if (i3 == 0) {
                int i4 = this.zzW2e + 1;
                this.zzW2e = i4;
                if ((i4 & 32) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzYUE, com.aspose.words.internal.zzYV8
    public final void reset() {
        this.index = 0;
        zzXD5();
        zzXDK();
        zzWI(this.zzW2h);
    }

    public void zzA(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), zzXGi(), " requires 128 bit or 256 bit key"));
            }
            int length = (bArr.length - 16) / 4;
            int[] iArr = this.zzW2j;
            int[] iArr2 = zzWbh;
            iArr[0] = iArr2[length];
            iArr[5] = iArr2[length + 1];
            iArr[10] = iArr2[length + 2];
            iArr[15] = iArr2[length + 3];
            zzYGN.zzZ(bArr, 0, iArr, 1, 4);
            zzYGN.zzZ(bArr, bArr.length - 16, this.zzW2j, 11, 4);
        }
        zzYGN.zzZ(bArr2, 0, this.zzW2j, 6, 2);
    }

    public void zzWI(byte[] bArr) {
        zzY(this.zzW2k, this.zzW2j, this.zzW2i);
        zzYGN.zzW(this.zzW2i, bArr, 0);
    }

    public void zzXDK() {
        int[] iArr = this.zzW2j;
        iArr[9] = 0;
        iArr[8] = 0;
    }

    public void zzXDL() {
        int[] iArr = this.zzW2j;
        int i = iArr[8] + 1;
        iArr[8] = i;
        if (i == 0) {
            iArr[9] = iArr[9] + 1;
        }
    }

    public int zzXDM() {
        return 8;
    }

    @Override // com.aspose.words.internal.zzYUE, com.aspose.words.internal.zzYV8
    public String zzXGi() {
        if (this.zzW2k == 20) {
            return "Salsa20";
        }
        return "Salsa20/" + this.zzW2k;
    }

    @Override // com.aspose.words.internal.zzYUE
    public final int zzY(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (!this.zzW9m) {
            throw new IllegalStateException(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), zzXGi(), " not initialised"));
        }
        if (i + i2 > bArr.length) {
            throw new zzYV0("input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new zzYUO("output buffer too short");
        }
        if (zzfj(i2)) {
            throw new zzYUP("2^70 byte limit per IV would be exceeded; Change IV");
        }
        for (int i4 = 0; i4 < i2; i4++) {
            byte[] bArr3 = this.zzW2h;
            int i5 = this.index;
            bArr2[i4 + i3] = (byte) (bArr3[i5] ^ bArr[i4 + i]);
            int i6 = (i5 + 1) & 63;
            this.index = i6;
            if (i6 == 0) {
                zzXDL();
                zzWI(this.zzW2h);
            }
        }
        return i2;
    }

    @Override // com.aspose.words.internal.zzYUE, com.aspose.words.internal.zzYV8
    public final void zzZ(boolean z, zzYV3 zzyv3) {
        if (!(zzyv3 instanceof zzYS4)) {
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), zzXGi(), " Init parameters must include an IV"));
        }
        zzYS4 zzys4 = (zzYS4) zzyv3;
        byte[] iv = zzys4.getIV();
        if (iv == null || iv.length != zzXDM()) {
            StringBuilder sb = new StringBuilder();
            sb.append(zzXGi());
            sb.append(" requires exactly ");
            throw new IllegalArgumentException(C21023OooO0Oo.OooO0OO(" bytes of IV", zzXDM(), sb));
        }
        zzYV3 zzyv3ZzXC6 = zzys4.zzXC6();
        if (zzyv3ZzXC6 == null) {
            if (!this.zzW9m) {
                throw new IllegalStateException(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), zzXGi(), " KeyParameter can not be null for first initialisation"));
            }
            zzA(null, iv);
        } else {
            if (!(zzyv3ZzXC6 instanceof zzYS8)) {
                throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), zzXGi(), " Init parameters must contain a KeyParameter (or null for re-init)"));
            }
            zzA(((zzYS8) zzyv3ZzXC6).getKey(), iv);
        }
        reset();
        this.zzW9m = true;
    }

    @Override // com.aspose.words.internal.zzYUE
    public final byte zze(byte b) {
        if (zzXD4()) {
            throw new zzYUP("2^70 byte limit per IV; Change IV");
        }
        byte[] bArr = this.zzW2h;
        int i = this.index;
        byte b2 = (byte) (b ^ bArr[i]);
        int i2 = (i + 1) & 63;
        this.index = i2;
        if (i2 == 0) {
            zzXDL();
            zzWI(this.zzW2h);
        }
        return b2;
    }

    private zzYW1(byte b) {
        this.index = 0;
        this.zzW2j = new int[16];
        this.zzW2i = new int[16];
        this.zzW2h = new byte[64];
        this.zzW9m = false;
        this.zzW2k = 20;
    }

    private static void zzY(int i, int[] iArr, int[] iArr2) {
        if (iArr.length == 16) {
            if (iArr2.length == 16) {
                if (i % 2 == 0) {
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    int i4 = iArr[2];
                    char c = 3;
                    int i5 = iArr[3];
                    char c2 = 4;
                    int i6 = iArr[4];
                    char c3 = 5;
                    int i7 = iArr[5];
                    char c4 = 6;
                    int i8 = iArr[6];
                    int i9 = 7;
                    int i10 = iArr[7];
                    int i11 = iArr[8];
                    int i12 = 9;
                    int i13 = iArr[9];
                    int i14 = iArr[10];
                    int i15 = iArr[11];
                    int i16 = iArr[12];
                    int i17 = 13;
                    int i18 = iArr[13];
                    int i19 = iArr[14];
                    int iZzUG = iArr[15];
                    int iZzUG2 = i19;
                    int iZzUG3 = i18;
                    int iZzUG4 = i16;
                    int iZzUG5 = i15;
                    int iZzUG6 = i14;
                    int i20 = i13;
                    int i21 = i11;
                    int i22 = i10;
                    int i23 = i8;
                    int iZzUG7 = i7;
                    int i24 = i6;
                    int i25 = i5;
                    int i26 = i4;
                    int i27 = i3;
                    int iZzUG8 = i2;
                    int i28 = i;
                    while (i28 > 0) {
                        char c5 = c;
                        int iZzUG9 = zzUG(iZzUG8 + iZzUG4, i9) ^ i24;
                        int iZzUG10 = i21 ^ zzUG(iZzUG9 + iZzUG8, i12);
                        char c6 = c2;
                        int iZzUG11 = iZzUG4 ^ zzUG(iZzUG10 + iZzUG9, i17);
                        char c7 = c3;
                        char c8 = c4;
                        int iZzUG12 = iZzUG8 ^ zzUG(iZzUG11 + iZzUG10, 18);
                        int iZzUG13 = i20 ^ zzUG(iZzUG7 + i27, i9);
                        int iZzUG14 = iZzUG3 ^ zzUG(iZzUG13 + iZzUG7, i12);
                        int iZzUG15 = zzUG(iZzUG14 + iZzUG13, i17) ^ i27;
                        int iZzUG16 = zzUG(iZzUG15 + iZzUG14, 18) ^ iZzUG7;
                        int iZzUG17 = iZzUG2 ^ zzUG(iZzUG6 + i23, 7);
                        int iZzUG18 = i26 ^ zzUG(iZzUG17 + iZzUG6, 9);
                        int iZzUG19 = i23 ^ zzUG(iZzUG18 + iZzUG17, 13);
                        int iZzUG20 = iZzUG6 ^ zzUG(iZzUG19 + iZzUG18, 18);
                        int iZzUG21 = i25 ^ zzUG(iZzUG + iZzUG5, 7);
                        int iZzUG22 = i22 ^ zzUG(iZzUG21 + iZzUG, 9);
                        int iZzUG23 = iZzUG5 ^ zzUG(iZzUG22 + iZzUG21, 13);
                        int iZzUG24 = iZzUG ^ zzUG(iZzUG23 + iZzUG22, 18);
                        int iZzUG25 = iZzUG15 ^ zzUG(iZzUG12 + iZzUG21, 7);
                        int iZzUG26 = zzUG(iZzUG25 + iZzUG12, 9) ^ iZzUG18;
                        int iZzUG27 = iZzUG21 ^ zzUG(iZzUG26 + iZzUG25, 13);
                        iZzUG8 = iZzUG12 ^ zzUG(iZzUG27 + iZzUG26, 18);
                        int iZzUG28 = zzUG(iZzUG16 + iZzUG9, 7) ^ iZzUG19;
                        int iZzUG29 = zzUG(iZzUG28 + iZzUG16, 9) ^ iZzUG22;
                        int iZzUG30 = iZzUG9 ^ zzUG(iZzUG29 + iZzUG28, 13);
                        iZzUG7 = iZzUG16 ^ zzUG(iZzUG30 + iZzUG29, 18);
                        iZzUG5 = iZzUG23 ^ zzUG(iZzUG20 + iZzUG13, 7);
                        int iZzUG31 = zzUG(iZzUG5 + iZzUG20, 9) ^ iZzUG10;
                        int iZzUG32 = zzUG(iZzUG31 + iZzUG5, 13) ^ iZzUG13;
                        iZzUG6 = iZzUG20 ^ zzUG(iZzUG32 + iZzUG31, 18);
                        iZzUG4 = iZzUG11 ^ zzUG(iZzUG24 + iZzUG17, 7);
                        iZzUG3 = iZzUG14 ^ zzUG(iZzUG4 + iZzUG24, 9);
                        iZzUG2 = iZzUG17 ^ zzUG(iZzUG3 + iZzUG4, 13);
                        iZzUG = iZzUG24 ^ zzUG(iZzUG2 + iZzUG3, 18);
                        i28 -= 2;
                        i21 = iZzUG31;
                        i27 = iZzUG25;
                        i23 = iZzUG28;
                        i24 = iZzUG30;
                        i22 = iZzUG29;
                        i20 = iZzUG32;
                        c = c5;
                        c2 = c6;
                        c3 = c7;
                        c4 = c8;
                        i9 = 7;
                        i26 = iZzUG26;
                        i25 = iZzUG27;
                        i12 = 9;
                        i17 = 13;
                    }
                    char c9 = c;
                    char c10 = c2;
                    char c11 = c3;
                    char c12 = c4;
                    iArr2[0] = iZzUG8 + iArr[0];
                    iArr2[1] = i27 + iArr[1];
                    iArr2[2] = i26 + iArr[2];
                    iArr2[c9] = i25 + iArr[c9];
                    iArr2[c10] = i24 + iArr[c10];
                    iArr2[c11] = iZzUG7 + iArr[c11];
                    iArr2[c12] = i23 + iArr[c12];
                    iArr2[7] = i22 + iArr[7];
                    iArr2[8] = i21 + iArr[8];
                    iArr2[9] = i20 + iArr[9];
                    iArr2[10] = iZzUG6 + iArr[10];
                    iArr2[11] = iZzUG5 + iArr[11];
                    iArr2[12] = iZzUG4 + iArr[12];
                    iArr2[13] = iZzUG3 + iArr[13];
                    iArr2[14] = iZzUG2 + iArr[14];
                    iArr2[15] = iZzUG + iArr[15];
                    return;
                }
                throw new IllegalArgumentException("Number of rounds must be even");
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }
}
