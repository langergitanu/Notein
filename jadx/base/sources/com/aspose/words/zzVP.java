package com.aspose.words;

import androidx.core.view.InputDeviceCompat;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: loaded from: classes6.dex */
final class zzVP {
    private int zzZwA;
    private boolean zzZwB;
    private int zzZwC;
    private int zzZwD;
    private int zzZwE;
    private int zzZwF;
    private int zzZwG;
    private byte[] zzZwH;
    private boolean zzZwu;
    private int zzZwv;
    private int zzZww;
    private int zzZwx;
    private int zzZwy;
    private int zzZwz;
    private static int[] zzZwR = {0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17};
    private static int[] zzZwQ = {0, 1, 2, 3, 4, 6, 8, 12, 16, 24, 32, 48, 64, 96, 128, 192, 256, 384, 512, ViewUtils.EDGE_TO_EDGE_FLAGS, 1024, TableStyleOptions.DEFAULT_2003, 2048, 3072, 4096, 6144, 8192, 12288, 16384, 24576, 32768, 49152, 65536, 98304, 131072, 196608, 262144, 393216, 524288, 655360, 786432, 917504, 1048576, 1179648, 1310720, 1441792, 1572864, 1703936, 1835008, 1966080, 2097152};
    private int[] zzZwP = new int[104];
    private byte[] zzZwO = new byte[84];
    private int[] zzZwN = new int[5408];
    private byte[] zzZwM = new byte[720];
    private int[] zzZwL = new int[4596];
    private byte[] zzZwK = new byte[StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_5];
    private int[] zzZwJ = new int[144];
    private byte[] zzZwI = new byte[72];

    public zzVP(int i) {
        this.zzZwH = new byte[i];
        int iZzNo = zzNo(i) - 1;
        if (iZzNo < 15 || iZzNo > 21) {
            throw new IllegalStateException("Invalid window size.");
        }
        this.zzZwC = ((iZzNo == 20 ? 42 : iZzNo == 21 ? 50 : iZzNo << 1) << 3) + 256;
        reset();
    }

    private boolean zz1k() {
        return zzY(this.zzZwP, this.zzZwO, 6, 20);
    }

    private boolean zz1l() {
        return zzY(this.zzZwL, this.zzZwK, 12, 250);
    }

    private boolean zz1m() {
        return zzY(this.zzZwN, this.zzZwM, 12, 656);
    }

    private boolean zz1n() {
        return zzY(this.zzZwJ, this.zzZwI, 7, 8);
    }

    private static int zzNo(int i) {
        int i2 = 1;
        int i3 = 1;
        while (i2 != 0 && (((long) i) & ((long) i2) & 4294967295L) == 0) {
            i2 <<= 1;
            i3++;
        }
        if (i2 == 0) {
            return 0;
        }
        return i3;
    }

    private int zzV(zzVQ zzvq) {
        return zzvq.zzZ(this.zzZwP, this.zzZwO, 6, 20);
    }

    private int zzW(zzVQ zzvq) {
        return zzvq.zzZ(this.zzZwL, this.zzZwK, 12, 250);
    }

    private int zzX(zzVQ zzvq) {
        return zzvq.zzZ(this.zzZwJ, this.zzZwI, 7, 8);
    }

    private static boolean zzY(int[] iArr, byte[] bArr, int i, int i2) {
        int i3 = 1 << i;
        int i4 = i3 >>> 1;
        int i5 = 1;
        int i6 = i4;
        int i7 = 0;
        while (i5 <= i) {
            for (int i8 = 0; i8 < i2; i8++) {
                if ((bArr[i8] & 255) == i5) {
                    int i9 = i7 + i6;
                    if (i9 > i3) {
                        return false;
                    }
                    int i10 = i6;
                    while (i10 > 0) {
                        iArr[i7] = i8;
                        i10--;
                        i7++;
                    }
                    i7 = i9;
                }
            }
            i6 >>= 1;
            i5++;
        }
        if (i7 != i3) {
            for (int i11 = i7; i11 < i3; i11++) {
                iArr[i11] = 0;
            }
            i7 <<= 16;
            i3 <<= 16;
            int i12 = 32768;
            while (i5 <= 16) {
                for (int i13 = 0; i13 < i2; i13++) {
                    if ((bArr[i13] & 255) == i5) {
                        int i14 = i7 >>> 16;
                        for (int i15 = 0; i15 < i5 - i; i15++) {
                            if (iArr[i14] == 0) {
                                int i16 = i4 << 1;
                                iArr[i16] = 0;
                                iArr[i16 + 1] = 0;
                                iArr[i14] = i4;
                                i4++;
                            }
                            i14 = iArr[i14] << 1;
                            if (((i7 >>> (15 - i15)) & 1) != 0) {
                                i14++;
                            }
                        }
                        iArr[i14] = i13;
                        i7 += i12;
                        if (i7 > i3) {
                            return false;
                        }
                    }
                }
                i12 >>>= 1;
                i5++;
            }
        }
        if (i7 == i3) {
            return true;
        }
        for (int i17 = 0; i17 < i2; i17++) {
            if (bArr[i17] != 0) {
                return false;
            }
        }
        return true;
    }

    private void zzYB(byte[] bArr) {
        long j = this.zzZwv;
        long j2 = this.zzZww;
        int i = 0;
        while (i < bArr.length - 10) {
            int i2 = i + 1;
            if ((bArr[i] & 255) != 232) {
                j++;
                i = i2;
            } else {
                int i3 = i + 5;
                long jZzA = ((long) com.aspose.words.internal.zzZQK.zzA(bArr, i2)) & 4294967295L;
                if (jZzA < (-j) || jZzA >= j2) {
                    i = i3;
                } else {
                    long j3 = jZzA >= 0 ? jZzA - j : jZzA + j2;
                    bArr[i2] = (byte) (j3 & 255);
                    bArr[i + 2] = (byte) ((j3 >>> 8) & 255);
                    bArr[i + 3] = (byte) ((j3 >>> 16) & 255);
                    bArr[i + 4] = (byte) ((j3 >>> 24) & 255);
                    i += 5;
                }
                j += 5;
            }
        }
    }

    private boolean zzZ(zzVQ zzvq, byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < 20; i3++) {
            this.zzZwO[i3] = (byte) zzvq.zzNs(4);
        }
        if (!zz1k()) {
            return false;
        }
        while (i < i2) {
            int iZzV = zzV(zzvq);
            if (iZzV == 17) {
                int iZzNs = zzvq.zzNs(4) + 4;
                while (true) {
                    int i4 = iZzNs - 1;
                    if (iZzNs != 0) {
                        bArr[i] = 0;
                        i++;
                        iZzNs = i4;
                    }
                }
            } else if (iZzV == 18) {
                int iZzNs2 = zzvq.zzNs(5) + 20;
                while (true) {
                    int i5 = iZzNs2 - 1;
                    if (iZzNs2 != 0) {
                        bArr[i] = 0;
                        i++;
                        iZzNs2 = i5;
                    }
                }
            } else if (iZzV == 19) {
                int iZzNs3 = zzvq.zzNs(1) + 4;
                int iZzV2 = (bArr[i] & 255) - zzV(zzvq);
                if (iZzV2 < 0) {
                    iZzV2 += 17;
                }
                while (true) {
                    int i6 = iZzNs3 - 1;
                    if (iZzNs3 != 0) {
                        bArr[i] = (byte) iZzV2;
                        i++;
                        iZzNs3 = i6;
                    }
                }
            } else {
                int i7 = (bArr[i] & 255) - iZzV;
                if (i7 < 0) {
                    i7 += 17;
                }
                bArr[i] = (byte) i7;
                i++;
            }
        }
        return true;
    }

    public final void reset() {
        this.zzZwF = 1;
        this.zzZwE = 1;
        this.zzZwD = 1;
        this.zzZwB = false;
        this.zzZwx = 0;
        this.zzZwy = 0;
        this.zzZwA = 0;
        this.zzZwv = 0;
        this.zzZwu = false;
        this.zzZwG = 0;
        for (int i = 0; i < 720; i++) {
            this.zzZwM[i] = 0;
        }
        for (int i2 = 0; i2 < 314; i2++) {
            this.zzZwK[i2] = 0;
        }
    }

    public final byte[] zzw(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        zzVQ zzvq = new zzVQ(bArr);
        if (!this.zzZwB) {
            if (zzvq.zzNs(1) == 1) {
                this.zzZww = (zzvq.zzNs(16) << 16) | zzvq.zzNs(16);
            } else {
                this.zzZww = 0;
            }
            this.zzZwB = true;
        }
        int i2 = i;
        while (i2 > 0) {
            if (this.zzZwy == 0 && !zzZ(zzvq)) {
                return null;
            }
            int iMin = Math.min(i2, this.zzZwy);
            int i3 = this.zzZwG;
            byte[] bArr3 = this.zzZwH;
            int length = i3 & (bArr3.length - 1);
            this.zzZwG = length;
            if (length + iMin > bArr3.length) {
                return null;
            }
            i2 -= iMin;
            this.zzZwy -= iMin;
            if (!zzZ(zzvq, iMin, this.zzZwA)) {
                return null;
            }
        }
        if (i2 != 0) {
            return null;
        }
        int length2 = this.zzZwG;
        if (length2 == 0) {
            length2 = this.zzZwH.length;
        }
        int i4 = length2 - i;
        for (int i5 = 0; i5 < i; i5++) {
            bArr2[i5] = this.zzZwH[i4 + i5];
        }
        int i6 = this.zzZwx;
        this.zzZwx = i6 + 1;
        if (i6 < 32768 && this.zzZww != 0) {
            if (i > 6 && this.zzZwu) {
                zzYB(bArr2);
                return bArr2;
            }
            this.zzZwv += i;
        }
        return bArr2;
    }

    private int zzY(zzVQ zzvq) {
        return zzvq.zzZ(this.zzZwN, this.zzZwM, 12, 656);
    }

    private boolean zzZ(zzVQ zzvq) {
        if (this.zzZwA == 3 && this.zzZwz % 2 != 0) {
            zzvq.zz1p();
        }
        this.zzZwA = zzvq.zzNs(3);
        int iZzNs = (zzvq.zzNs(16) << 8) | zzvq.zzNs(8);
        this.zzZwz = iZzNs;
        this.zzZwy = iZzNs;
        int i = this.zzZwA;
        if (i != 1) {
            if (i == 2) {
                for (int i2 = 0; i2 < 8; i2++) {
                    this.zzZwI[i2] = (byte) (zzvq.zzNs(3) & 255);
                }
                if (zz1n() && zzZ(zzvq, this.zzZwM, 0, 256) && zzZ(zzvq, this.zzZwM, 256, this.zzZwC) && zz1m()) {
                    if (this.zzZwM[232] != 0) {
                        this.zzZwu = true;
                    }
                    if (!zzZ(zzvq, this.zzZwK, 0, StyleIdentifier.MEDIUM_SHADING_1_ACCENT_6) || !zz1l()) {
                    }
                }
                return false;
            }
            if (i != 3) {
                return false;
            }
            this.zzZwu = true;
            zzvq.zz1q();
            this.zzZwF = zzvq.zzXc();
            this.zzZwE = zzvq.zzXc();
            this.zzZwD = zzvq.zzXc();
        } else {
            if (!zzZ(zzvq, this.zzZwM, 0, 256) || !zzZ(zzvq, this.zzZwM, 256, this.zzZwC) || !zz1m()) {
                return false;
            }
            if (this.zzZwM[232] != 0) {
                this.zzZwu = true;
            }
            if (!zzZ(zzvq, this.zzZwK, 0, StyleIdentifier.MEDIUM_SHADING_1_ACCENT_6) || !zz1l()) {
                return false;
            }
        }
        return true;
    }

    private boolean zzZ(zzVQ zzvq, int i, int i2) {
        int i3;
        int iZzNs;
        int iZzNs2;
        if (i2 == 3) {
            int iMin = Math.min(i, zzvq.zz1o());
            zzvq.zzH(this.zzZwH, this.zzZwG, iMin);
            this.zzZwG += iMin;
            return true;
        }
        if (i2 != 1 && i2 != 2) {
            return false;
        }
        while (i > 0) {
            int iZzY = zzY(zzvq);
            if (iZzY < 256) {
                byte[] bArr = this.zzZwH;
                int i4 = this.zzZwG;
                this.zzZwG = i4 + 1;
                bArr[i4] = (byte) iZzY;
                i--;
            } else {
                int i5 = iZzY + InputDeviceCompat.SOURCE_ANY;
                int iZzW = i5 & 7;
                if (iZzW == 7) {
                    iZzW += zzW(zzvq);
                }
                int i6 = iZzW + 2;
                int i7 = i5 >> 3;
                if (i7 > 2) {
                    if (i2 == 1) {
                        if (i7 != 3) {
                            iZzNs2 = zzvq.zzNs(zzZwR[i7]);
                            iZzNs = zzZwQ[i7] - 2;
                            i3 = iZzNs + iZzNs2;
                        }
                        i3 = 1;
                    } else {
                        int i8 = zzZwR[i7];
                        iZzNs = zzZwQ[i7] - 2;
                        if (i8 > 3) {
                            iZzNs += zzvq.zzNs(i8 - 3) << 3;
                            iZzNs2 = zzX(zzvq);
                        } else if (i8 == 3) {
                            iZzNs2 = zzX(zzvq);
                        } else {
                            if (i8 > 0) {
                                iZzNs2 = zzvq.zzNs(i8);
                            }
                            i3 = 1;
                        }
                        i3 = iZzNs + iZzNs2;
                    }
                    this.zzZwD = this.zzZwE;
                    this.zzZwE = this.zzZwF;
                    this.zzZwF = i3;
                } else if (i7 == 0) {
                    i3 = this.zzZwF;
                } else if (i7 == 1) {
                    i3 = this.zzZwE;
                    this.zzZwE = this.zzZwF;
                    this.zzZwF = i3;
                } else {
                    i3 = this.zzZwD;
                    this.zzZwD = this.zzZwF;
                    this.zzZwF = i3;
                }
                int i9 = this.zzZwG;
                int i10 = i9 - i3;
                int i11 = i9 + i6;
                this.zzZwG = i11;
                if (i11 > this.zzZwH.length) {
                    return false;
                }
                i -= i6;
                while (true) {
                    if (i10 >= 0) {
                        break;
                    }
                    int i12 = i6 - 1;
                    if (i6 <= 0) {
                        i6 = i12;
                        break;
                    }
                    byte[] bArr2 = this.zzZwH;
                    bArr2[i9] = bArr2[bArr2.length + i10];
                    i10++;
                    i6 = i12;
                    i9++;
                }
                while (true) {
                    int i13 = i6 - 1;
                    if (i6 > 0) {
                        byte[] bArr3 = this.zzZwH;
                        bArr3[i9] = bArr3[i10];
                        i6 = i13;
                        i9++;
                        i10++;
                    }
                }
            }
        }
        return true;
    }
}
