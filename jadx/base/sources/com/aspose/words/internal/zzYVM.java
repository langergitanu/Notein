package com.aspose.words.internal;

import com.aspose.words.ControlChar;
import com.aspose.words.StyleIdentifier;
import com.aspose.words.internal.zzYW0;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes5.dex */
final class zzYVM implements zzYGP, zzYUU {
    private static final short[] zzVZK;
    private long[] zzVZL;
    private long[] zzVZM;
    private long[] zzVZN;
    private long[] zzVZO;
    private long[] zzVZP;
    private short[] zzVZQ;
    private int zzVZR;
    private final long[] zzVZS;
    private byte[] zzZXA;
    private static final int[] zzW01 = {24, 35, 198, 232, 135, 184, 1, 79, 54, 166, 210, 245, 121, 111, 145, 82, 96, 188, 155, 142, 163, 12, 123, 53, 29, 224, 215, 194, 46, 75, StyleIdentifier.MEDIUM_GRID_2_ACCENT_6, 87, 21, 119, 55, 229, 159, 240, 74, 218, 88, 201, 41, 10, 177, 160, 107, 133, 189, 93, 16, 244, 203, 62, 5, 103, 228, 39, 65, 139, 167, 125, 149, 216, StyleIdentifier.MEDIUM_LIST_1_ACCENT_6, 238, 124, 102, 221, 23, 71, 158, 202, 45, 191, 7, 173, 90, 131, 51, 99, 2, 170, 113, 200, 25, 73, 217, 242, 227, 91, 136, 154, 38, 50, 176, 233, 15, 213, 128, 190, 205, 52, 72, 255, 122, 144, 95, 32, 104, 26, 174, 180, 84, 147, 34, 100, 241, 115, 18, 64, 8, 195, 236, 219, 161, 141, 61, 151, 0, 207, 43, 118, 130, 214, 27, 181, 175, 106, 80, 69, 243, 48, 239, 63, 85, 162, 234, 101, 186, 47, 192, 222, 28, StyleIdentifier.MEDIUM_GRID_1_ACCENT_6, 77, 146, 117, 6, 138, 178, 230, 14, 31, 98, 212, 168, 150, StyleIdentifier.MEDIUM_SHADING_1_ACCENT_6, 197, 37, 89, 132, 114, 57, 76, 94, 120, 56, 140, 209, 165, 226, 97, 179, 33, 156, 30, 67, 199, StyleIdentifier.MEDIUM_LIST_2_ACCENT_6, 4, 81, 153, 109, 13, 250, 223, 126, 36, 59, 171, 206, 17, 143, 78, 183, 235, 60, 129, 148, StyleIdentifier.LIGHT_LIST_ACCENT_6, 185, 19, 44, 211, 231, 110, 196, 3, 86, 68, 127, 169, 42, 187, 193, 83, 220, 11, 157, 108, 49, 116, 246, 70, 172, 137, 20, 225, 22, 58, 105, 9, 112, 182, 208, 237, 204, 66, 152, 164, 40, 92, StyleIdentifier.LIGHT_GRID_ACCENT_6, 134};
    private static final long[] zzW00 = new long[256];
    private static final long[] zzVZZ = new long[256];
    private static final long[] zzVZY = new long[256];
    private static final long[] zzVZX = new long[256];
    private static final long[] zzVZW = new long[256];
    private static final long[] zzVZV = new long[256];
    private static final long[] zzVZU = new long[256];
    private static final long[] zzVZT = new long[256];

    static {
        short[] sArr = new short[32];
        zzVZK = sArr;
        sArr[31] = 8;
    }

    public zzYVM() {
        this.zzVZS = new long[11];
        this.zzZXA = new byte[64];
        this.zzVZR = 0;
        this.zzVZQ = new short[32];
        this.zzVZP = new long[8];
        this.zzVZO = new long[8];
        this.zzVZN = new long[8];
        this.zzVZM = new long[8];
        this.zzVZL = new long[8];
        for (int i = 0; i < 256; i++) {
            int i2 = zzW01[i];
            int iZzf5 = zzf5(i2 << 1);
            int iZzf52 = zzf5(iZzf5 << 1);
            int i3 = iZzf52 ^ i2;
            int iZzf53 = zzf5(iZzf52 << 1);
            int i4 = iZzf53 ^ i2;
            zzW00[i] = zzY(i2, i2, iZzf52, i2, iZzf53, i3, iZzf5, i4);
            zzVZZ[i] = zzY(i4, i2, i2, iZzf52, i2, iZzf53, i3, iZzf5);
            zzVZY[i] = zzY(iZzf5, i4, i2, i2, iZzf52, i2, iZzf53, i3);
            zzVZX[i] = zzY(i3, iZzf5, i4, i2, i2, iZzf52, i2, iZzf53);
            zzVZW[i] = zzY(iZzf53, i3, iZzf5, i4, i2, i2, iZzf52, i2);
            zzVZV[i] = zzY(i2, iZzf53, i3, iZzf5, i4, i2, i2, iZzf52);
            zzVZU[i] = zzY(iZzf52, i2, iZzf53, i3, iZzf5, i4, i2, i2);
            zzVZT[i] = zzY(i2, iZzf52, i2, iZzf53, i3, iZzf5, i4, i2);
        }
        this.zzVZS[0] = 0;
        for (int i5 = 1; i5 <= 10; i5++) {
            int i6 = (i5 - 1) * 8;
            this.zzVZS[i5] = (((((((zzW00[i6] & (-72057594037927936L)) ^ (zzVZZ[i6 + 1] & 71776119061217280L)) ^ (zzVZY[i6 + 2] & 280375465082880L)) ^ (zzVZX[i6 + 3] & 1095216660480L)) ^ (zzVZW[i6 + 4] & 4278190080L)) ^ (zzVZV[i6 + 5] & 16711680)) ^ (zzVZU[i6 + 6] & 65280)) ^ (zzVZT[i6 + 7] & 255);
        }
    }

    private void finish() {
        byte[] bArrZzXCT = zzXCT();
        byte[] bArr = this.zzZXA;
        int i = this.zzVZR;
        int i2 = i + 1;
        this.zzVZR = i2;
        bArr[i] = (byte) (bArr[i] | UnsignedBytes.MAX_POWER_OF_TWO);
        if (i2 == bArr.length) {
            zzXCU();
        }
        if (this.zzVZR > 32) {
            while (this.zzVZR != 0) {
                update((byte) 0);
            }
        }
        while (this.zzVZR <= 32) {
            update((byte) 0);
        }
        System.arraycopy(bArrZzXCT, 0, this.zzZXA, 32, 32);
        zzXCU();
    }

    private void increment() {
        int i = 0;
        for (int length = this.zzVZQ.length - 1; length >= 0; length--) {
            short[] sArr = this.zzVZQ;
            int i2 = (sArr[length] & 255) + zzVZK[length] + i;
            i = i2 >>> 8;
            sArr[length] = (short) (i2 & 255);
        }
    }

    private static long zz0(byte[] bArr, int i) {
        return (((long) bArr[i + 7]) & 255) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
    }

    private byte[] zzXCT() {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 32; i++) {
            bArr[i] = (byte) (this.zzVZQ[i] & 255);
        }
        return bArr;
    }

    private void zzXCU() {
        for (int i = 0; i < this.zzVZL.length; i++) {
            this.zzVZM[i] = zz0(this.zzZXA, i * 8);
        }
        zzXHo();
        this.zzVZR = 0;
        zzYGU.fill(this.zzZXA, (byte) 0);
    }

    private void zzXHo() {
        char c;
        char c2;
        for (int i = 0; i < 8; i++) {
            long[] jArr = this.zzVZL;
            long j = this.zzVZM[i];
            long[] jArr2 = this.zzVZO;
            long j2 = this.zzVZP[i];
            jArr2[i] = j2;
            jArr[i] = j ^ j2;
        }
        for (int i2 = 1; i2 <= 10; i2++) {
            int i3 = 0;
            while (true) {
                c = ControlChar.SPACE_CHAR;
                c2 = '(';
                if (i3 >= 8) {
                    break;
                }
                long[] jArr3 = this.zzVZN;
                jArr3[i3] = 0;
                long[] jArr4 = zzW00;
                long[] jArr5 = this.zzVZO;
                long j3 = jArr4[((int) (jArr5[i3 & 7] >>> 56)) & 255];
                jArr3[i3] = j3;
                long j4 = zzVZZ[((int) (jArr5[(i3 - 1) & 7] >>> 48)) & 255] ^ j3;
                jArr3[i3] = j4;
                long j5 = j4 ^ zzVZY[((int) (jArr5[(i3 - 2) & 7] >>> 40)) & 255];
                jArr3[i3] = j5;
                long j6 = j5 ^ zzVZX[((int) (jArr5[(i3 - 3) & 7] >>> 32)) & 255];
                jArr3[i3] = j6;
                long j7 = j6 ^ zzVZW[((int) (jArr5[(i3 - 4) & 7] >>> 24)) & 255];
                jArr3[i3] = j7;
                long j8 = j7 ^ zzVZV[((int) (jArr5[(i3 - 5) & 7] >>> 16)) & 255];
                jArr3[i3] = j8;
                long j9 = j8 ^ zzVZU[((int) (jArr5[(i3 - 6) & 7] >>> 8)) & 255];
                jArr3[i3] = j9;
                jArr3[i3] = j9 ^ zzVZT[((int) jArr5[(i3 - 7) & 7]) & 255];
                i3++;
            }
            long[] jArr6 = this.zzVZN;
            long[] jArr7 = this.zzVZO;
            System.arraycopy(jArr6, 0, jArr7, 0, jArr7.length);
            long[] jArr8 = this.zzVZO;
            jArr8[0] = jArr8[0] ^ this.zzVZS[i2];
            int i4 = 0;
            while (i4 < 8) {
                long[] jArr9 = this.zzVZN;
                long j10 = this.zzVZO[i4];
                jArr9[i4] = j10;
                long[] jArr10 = zzW00;
                long[] jArr11 = this.zzVZL;
                char c3 = c;
                char c4 = c2;
                long j11 = j10 ^ jArr10[((int) (jArr11[i4 & 7] >>> 56)) & 255];
                jArr9[i4] = j11;
                long j12 = j11 ^ zzVZZ[((int) (jArr11[(i4 - 1) & 7] >>> 48)) & 255];
                jArr9[i4] = j12;
                long j13 = j12 ^ zzVZY[((int) (jArr11[(i4 - 2) & 7] >>> c4)) & 255];
                jArr9[i4] = j13;
                long j14 = j13 ^ zzVZX[((int) (jArr11[(i4 - 3) & 7] >>> c3)) & 255];
                jArr9[i4] = j14;
                long j15 = j14 ^ zzVZW[((int) (jArr11[(i4 - 4) & 7] >>> 24)) & 255];
                jArr9[i4] = j15;
                long j16 = j15 ^ zzVZV[((int) (jArr11[(i4 - 5) & 7] >>> 16)) & 255];
                jArr9[i4] = j16;
                long j17 = j16 ^ zzVZU[((int) (jArr11[(i4 - 6) & 7] >>> 8)) & 255];
                jArr9[i4] = j17;
                jArr9[i4] = j17 ^ zzVZT[((int) jArr11[(i4 - 7) & 7]) & 255];
                i4++;
                c2 = c4;
                c = c3;
            }
            long[] jArr12 = this.zzVZN;
            long[] jArr13 = this.zzVZL;
            System.arraycopy(jArr12, 0, jArr13, 0, jArr13.length);
        }
        for (int i5 = 0; i5 < 8; i5++) {
            long[] jArr14 = this.zzVZP;
            jArr14[i5] = jArr14[i5] ^ (this.zzVZL[i5] ^ this.zzVZM[i5]);
        }
    }

    private static long zzY(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return (((((((((long) i2) << 48) ^ (((long) i) << 56)) ^ (((long) i3) << 40)) ^ (((long) i4) << 32)) ^ (((long) i5) << 24)) ^ (((long) i6) << 16)) ^ (((long) i7) << 8)) ^ ((long) i8);
    }

    private static int zzf5(int i) {
        return ((long) i) >= 256 ? i ^ StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_1 : i;
    }

    @Override // com.aspose.words.internal.zzYUX
    public final int doFinal(byte[] bArr, int i) {
        finish();
        for (int i2 = 0; i2 < 8; i2++) {
            zzY(this.zzVZP[i2], bArr, (i2 * 8) + i);
        }
        reset();
        return 64;
    }

    @Override // com.aspose.words.internal.zzYUX
    public final void reset() {
        this.zzVZR = 0;
        zzYGU.zzX(this.zzVZQ);
        zzYGU.fill(this.zzZXA, (byte) 0);
        zzYGU.zz9(this.zzVZP);
        zzYGU.zz9(this.zzVZO);
        zzYGU.zz9(this.zzVZN);
        zzYGU.zz9(this.zzVZM);
        zzYGU.zz9(this.zzVZL);
    }

    @Override // com.aspose.words.internal.zzYUX
    public final void update(byte b) {
        byte[] bArr = this.zzZXA;
        int i = this.zzVZR;
        bArr[i] = b;
        int i2 = i + 1;
        this.zzVZR = i2;
        if (i2 == bArr.length) {
            zzXCU();
        }
        increment();
    }

    @Override // com.aspose.words.internal.zzYUX
    public final int zzQI() {
        return 64;
    }

    @Override // com.aspose.words.internal.zzYGP
    public final zzYGP zzXE2() {
        return new zzYVM(this);
    }

    @Override // com.aspose.words.internal.zzYUU, com.aspose.words.internal.zzYUX
    public final int zzXE6() {
        return 64;
    }

    @Override // com.aspose.words.internal.zzYUX
    public final String zzXGi() {
        return zzYW0.zzZ.zzW1I.getName();
    }

    @Override // com.aspose.words.internal.zzYGP
    public final void zzZ(zzYGP zzygp) {
        zzYVM zzyvm = (zzYVM) zzygp;
        long[] jArr = zzyvm.zzVZS;
        long[] jArr2 = this.zzVZS;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        byte[] bArr = zzyvm.zzZXA;
        byte[] bArr2 = this.zzZXA;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.zzVZR = zzyvm.zzVZR;
        short[] sArr = zzyvm.zzVZQ;
        short[] sArr2 = this.zzVZQ;
        System.arraycopy(sArr, 0, sArr2, 0, sArr2.length);
        long[] jArr3 = zzyvm.zzVZP;
        long[] jArr4 = this.zzVZP;
        System.arraycopy(jArr3, 0, jArr4, 0, jArr4.length);
        long[] jArr5 = zzyvm.zzVZO;
        long[] jArr6 = this.zzVZO;
        System.arraycopy(jArr5, 0, jArr6, 0, jArr6.length);
        long[] jArr7 = zzyvm.zzVZN;
        long[] jArr8 = this.zzVZN;
        System.arraycopy(jArr7, 0, jArr8, 0, jArr8.length);
        long[] jArr9 = zzyvm.zzVZM;
        long[] jArr10 = this.zzVZM;
        System.arraycopy(jArr9, 0, jArr10, 0, jArr10.length);
        long[] jArr11 = zzyvm.zzVZL;
        long[] jArr12 = this.zzVZL;
        System.arraycopy(jArr11, 0, jArr12, 0, jArr12.length);
    }

    private static void zzY(long j, byte[] bArr, int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[i + i2] = (byte) ((j >> (56 - (i2 * 8))) & 255);
        }
    }

    @Override // com.aspose.words.internal.zzYUX
    public final void update(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }

    public zzYVM(zzYVM zzyvm) {
        this.zzVZS = new long[11];
        this.zzZXA = new byte[64];
        this.zzVZR = 0;
        this.zzVZQ = new short[32];
        this.zzVZP = new long[8];
        this.zzVZO = new long[8];
        this.zzVZN = new long[8];
        this.zzVZM = new long[8];
        this.zzVZL = new long[8];
        zzZ(zzyvm);
    }
}
