package com.aspose.words.internal;

import com.aspose.slides.AutoShapeImpBase;

/* JADX INFO: loaded from: classes5.dex */
final class zzX5 {
    private boolean zzUA;
    private boolean zzUB;
    private int zzUC;
    private byte[] zzUD;
    private int zzUE = 1;
    private int zzUF;
    private int zzUG;
    private float zzUj;
    private int zzUk;
    private int zzUl;
    private int zzUm;
    private byte[] zzUn;
    private int zzUo;
    private int zzUp;
    private int zzUq;
    private byte[] zzUr;
    private zzZOP zzUs;
    private int zzUt;
    private int zzUu;
    private int zzUv;
    private int zzUw;
    private int zzUx;
    private boolean zzUy;
    private int zzUz;
    private static short[] zzUO = {10, 55, 0, 3, 2, 1, 2, 3, 2, 2, 2, 3, 3, 3, 4, 4, 3, 5, 4, 2, 6, 5, 3, 7, 6, 5, 8, 6, 4, 9, 7, 4, 10, 7, 5, 11, 7, 7, 12, 8, 4, 13, 8, 7, 14, 9, 24, 15, 10, 23, 16, 10, 24, 17, 10, 8, 18, 11, 103, 19, 11, 104, 20, 11, 108, 21, 11, 55, 22, 11, 40, 23, 11, 23, 24, 11, 24, 25, 12, 202, 26, 12, 203, 27, 12, 204, 28, 12, 205, 29, 12, 104, 30, 12, 105, 31, 12, 106, 32, 12, 107, 33, 12, 210, 34, 12, 211, 35, 12, 212, 36, 12, 213, 37, 12, 214, 38, 12, 215, 39, 12, 108, 40, 12, 109, 41, 12, 218, 42, 12, 219, 43, 12, 84, 44, 12, 85, 45, 12, 86, 46, 12, 87, 47, 12, 100, 48, 12, 101, 49, 12, 82, 50, 12, 83, 51, 12, 36, 52, 12, 55, 53, 12, 56, 54, 12, 39, 55, 12, 40, 56, 12, 88, 57, 12, 89, 58, 12, 43, 59, 12, 44, 60, 12, 90, 61, 12, 102, 62, 12, 103, 63, 10, 15, 64, 12, 200, 128, 12, 201, 192, 12, 91, 256, 12, 51, AutoShapeImpBase.CDSpecialValues.geoLeft, 12, 52, 384, 12, 53, 448, 13, 108, 512, 13, 109, 576, 13, 74, 640, 13, 75, 704, 13, 76, 768, 13, 77, 832, 13, 114, 896, 13, 115, 960, 13, 116, 1024, 13, 117, 1088, 13, 118, 1152, 13, 119, 1216, 13, 82, 1280, 13, 83, 1344, 13, 84, 1408, 13, 85, 1472, 13, 90, 1536, 13, 91, 1600, 13, 100, 1664, 13, 101, 1728, 11, 8, 1792, 11, 12, 1856, 11, 13, 1920, 12, 18, 1984, 12, 19, 2048, 12, 20, 2112, 12, 21, 2176, 12, 22, 2240, 12, 23, 2304, 12, 28, 2368, 12, 29, 2432, 12, 30, 2496, 12, 31, 2560, 12, 1, -1, 9, 1, -2, 10, 1, -2, 11, 1, -2, 12, 0, -2};
    private static short[] zzUN = {8, 53, 0, 6, 7, 1, 4, 7, 2, 4, 8, 3, 4, 11, 4, 4, 12, 5, 4, 14, 6, 4, 15, 7, 5, 19, 8, 5, 20, 9, 5, 7, 10, 5, 8, 11, 6, 8, 12, 6, 3, 13, 6, 52, 14, 6, 53, 15, 6, 42, 16, 6, 43, 17, 7, 39, 18, 7, 12, 19, 7, 8, 20, 7, 23, 21, 7, 3, 22, 7, 4, 23, 7, 40, 24, 7, 43, 25, 7, 19, 26, 7, 36, 27, 7, 24, 28, 8, 2, 29, 8, 3, 30, 8, 26, 31, 8, 27, 32, 8, 18, 33, 8, 19, 34, 8, 20, 35, 8, 21, 36, 8, 22, 37, 8, 23, 38, 8, 40, 39, 8, 41, 40, 8, 42, 41, 8, 43, 42, 8, 44, 43, 8, 45, 44, 8, 4, 45, 8, 5, 46, 8, 10, 47, 8, 11, 48, 8, 82, 49, 8, 83, 50, 8, 84, 51, 8, 85, 52, 8, 36, 53, 8, 37, 54, 8, 88, 55, 8, 89, 56, 8, 90, 57, 8, 91, 58, 8, 74, 59, 8, 75, 60, 8, 50, 61, 8, 51, 62, 8, 52, 63, 5, 27, 64, 5, 18, 128, 6, 23, 192, 7, 55, 256, 8, 54, AutoShapeImpBase.CDSpecialValues.geoLeft, 8, 55, 384, 8, 100, 448, 8, 101, 512, 8, 104, 576, 8, 103, 640, 9, 204, 704, 9, 205, 768, 9, 210, 832, 9, 211, 896, 9, 212, 960, 9, 213, 1024, 9, 214, 1088, 9, 215, 1152, 9, 216, 1216, 9, 217, 1280, 9, 218, 1344, 9, 219, 1408, 9, 152, 1472, 9, 153, 1536, 9, 154, 1600, 6, 24, 1664, 9, 155, 1728, 11, 8, 1792, 11, 12, 1856, 11, 13, 1920, 12, 18, 1984, 12, 19, 2048, 12, 20, 2112, 12, 21, 2176, 12, 22, 2240, 12, 23, 2304, 12, 28, 2368, 12, 29, 2432, 12, 30, 2496, 12, 31, 2560, 12, 1, -1, 9, 1, -2, 10, 1, -2, 11, 1, -2, 12, 0, -2};
    private static zzX4 zzUM = new zzX4(3, 1);
    private static int[] zzUL = {0, 1, 3, 7, 15, 31, 63, 127, 255};
    private static byte[] zzUK = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 8};
    private static zzX4 zzUJ = new zzX4(4, 1);
    private static zzX4[] zzUI = {new zzX4(7, 3), new zzX4(6, 3), new zzX4(3, 3), new zzX4(1, 1), new zzX4(3, 2), new zzX4(6, 2), new zzX4(7, 2)};
    private static byte[] zzUH = {8, 7, 6, 6, 5, 5, 5, 5, 4, 4, 4, 4, 4, 4, 4, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    private void close() throws Exception {
        if (!this.zzUA) {
            int i = zzVw() ? 13 : 12;
            for (int i2 = 0; i2 < 6; i2++) {
                zzH(1, i);
            }
            zzVC();
        }
        if (this.zzUp >= 0) {
            zzVD();
        }
    }

    private void init(int i) {
        this.zzUk = i;
        if (i == 2) {
            zzVA();
            return;
        }
        if (i == 3) {
            zzVE();
        } else if (i == 4) {
            zzVy();
        } else {
            if (i != 32771) {
                throw new IllegalStateException("Unexpected CCITT compression scheme.");
            }
            zzVz();
        }
    }

    private void zzH(int i, int i2) throws Exception {
        int i3;
        while (true) {
            i3 = this.zzUF;
            if (i2 <= i3) {
                break;
            }
            this.zzUC |= i >> (i2 - i3);
            i2 -= i3;
            zzVC();
        }
        this.zzUC = ((i & zzUL[i2]) << (i3 - i2)) | this.zzUC;
        int i4 = i3 - i2;
        this.zzUF = i4;
        if (i4 == 0) {
            zzVC();
        }
    }

    private static int zzI(int i, int i2) {
        int i3 = i * i2;
        if (i2 == 0 || i3 / i2 == i) {
            return i3;
        }
        return 0;
    }

    private static int zzJ(int i, int i2) {
        long j = (((long) i) + 31) / 32;
        if (j > 2147483647L) {
            return 0;
        }
        return (int) j;
    }

    private void zzT(byte[] bArr, int i) throws Exception {
        this.zzUD = bArr;
        this.zzUt = 0;
        while (i > 0) {
            zzVG();
            zzZKV.zzY(this.zzUD, this.zzUt, this.zzUn, 0, this.zzUm);
            int i2 = this.zzUt;
            int i3 = this.zzUm;
            this.zzUt = i2 + i3;
            i -= i3;
        }
    }

    private void zzU(byte[] bArr, int i) throws Exception {
        this.zzUD = bArr;
        this.zzUt = 0;
        while (i > 0) {
            if (!this.zzUB) {
                zzVB();
            }
            if (zzVw()) {
                if (this.zzUz == 0) {
                    zzVH();
                    this.zzUz = 1;
                } else {
                    zzVG();
                    this.zzUv--;
                }
                if (this.zzUv == 0) {
                    this.zzUz = 0;
                    this.zzUv = this.zzUu - 1;
                } else {
                    zzZKV.zzY(this.zzUD, this.zzUt, this.zzUn, 0, this.zzUm);
                }
            } else {
                zzVH();
            }
            int i2 = this.zzUt;
            int i3 = this.zzUm;
            this.zzUt = i2 + i3;
            i -= i3;
        }
    }

    private void zzVA() {
        zzVE();
        this.zzUG = 1;
        this.zzUB = true;
        this.zzUA = true;
    }

    private void zzVB() throws Exception {
        int i;
        int i2;
        int i3;
        if ((this.zzUx & 4) != 0 && 4 != (i3 = this.zzUF)) {
            zzH(0, 4 > i3 ? i3 + 4 : i3 - 4);
        }
        if (zzVw()) {
            i = this.zzUz == 0 ? 3 : 2;
            i2 = 13;
        } else {
            i = 1;
            i2 = 12;
        }
        zzH(i, i2);
    }

    private void zzVC() throws Exception {
        if (this.zzUp >= this.zzUq) {
            zzVD();
        }
        byte[] bArr = this.zzUr;
        int i = this.zzUo;
        bArr[i] = (byte) this.zzUC;
        this.zzUo = i + 1;
        this.zzUp++;
        this.zzUC = 0;
        this.zzUF = 8;
    }

    private void zzVD() throws Exception {
        int i = this.zzUp;
        if (i > 0) {
            this.zzUs.write(this.zzUr, 0, i);
            this.zzUp = 0;
            this.zzUo = 0;
        }
    }

    private void zzVE() {
        this.zzUx = 0;
        this.zzUn = null;
        this.zzUy = false;
    }

    private void zzVF() throws Exception {
        if (this.zzUF != 8) {
            zzVC();
        }
    }

    private void zzVG() throws Exception {
        int iZzZ;
        int i;
        int iZzZ2 = zzX(this.zzUD, this.zzUt, 0) != 0 ? 0 : zzZ(this.zzUD, this.zzUt, 0, this.zzUl, 0);
        if (zzX(this.zzUn, 0, 0) != 0) {
            iZzZ = 0;
            i = 0;
        } else {
            iZzZ = zzZ(this.zzUn, 0, 0, this.zzUl, 0);
            i = 0;
        }
        while (true) {
            byte[] bArr = this.zzUn;
            int iZzY = zzY(bArr, 0, iZzZ, this.zzUl, zzX(bArr, 0, iZzZ));
            int i2 = 1;
            if (iZzY >= iZzZ2) {
                int i3 = iZzZ - iZzZ2;
                if (-3 > i3 || i3 > 3) {
                    byte[] bArr2 = this.zzUD;
                    int i4 = this.zzUt;
                    int iZzY2 = zzY(bArr2, i4, iZzZ2, this.zzUl, zzX(bArr2, i4, iZzZ2));
                    zzZ(zzUM);
                    if (i + iZzZ2 == 0 || zzX(this.zzUD, this.zzUt, i) == 0) {
                        zzW(iZzZ2 - i, false);
                        zzW(iZzY2 - iZzZ2, true);
                    } else {
                        zzW(iZzZ2 - i, true);
                        zzW(iZzY2 - iZzZ2, false);
                    }
                    i = iZzY2;
                } else {
                    zzZ(zzUI[i3 + 3]);
                    i = iZzZ2;
                }
            } else {
                zzZ(zzUJ);
                i = iZzY;
            }
            int i5 = this.zzUl;
            if (i >= i5) {
                return;
            }
            byte[] bArr3 = this.zzUD;
            int i6 = this.zzUt;
            iZzZ2 = zzZ(bArr3, i6, i, i5, zzX(bArr3, i6, i));
            if (zzX(this.zzUD, this.zzUt, i) != 0) {
                i2 = 0;
            }
            iZzZ = zzZ(this.zzUn, 0, zzZ(this.zzUn, 0, i, this.zzUl, i2), this.zzUl, zzX(this.zzUD, this.zzUt, i));
        }
    }

    private void zzVH() throws Exception {
        int i = 0;
        do {
            int iZzZ = zzZ(this.zzUD, this.zzUt, i, this.zzUl);
            zzW(iZzZ, false);
            int i2 = i + iZzZ;
            int i3 = this.zzUl;
            if (i2 >= i3) {
                break;
            }
            int iZzY = zzY(this.zzUD, this.zzUt, i2, i3);
            zzW(iZzY, true);
            i = i2 + iZzY;
        } while (i < this.zzUl);
        if (this.zzUG != 0) {
            if (this.zzUF != 8) {
                zzVC();
            }
            if (this.zzUG != 2 || zzZM(this.zzUo)) {
                return;
            }
            zzVC();
        }
    }

    private void zzVI() {
        this.zzUr = new byte[8192];
        this.zzUq = 8192;
        this.zzUp = 0;
        this.zzUo = 0;
    }

    private void zzVJ() {
        int iZzVK = zzVK();
        int i = this.zzUw;
        this.zzUm = iZzVK;
        this.zzUl = i;
        boolean z = (this.zzUx & 1) != 0 || this.zzUk == 4;
        int iZzZL = zzZL(i);
        if (z) {
            long j = ((long) iZzZL) * 2;
            if (j > 2147483647L) {
                return;
            } else {
                iZzZL = (int) j;
            }
        }
        if (iZzZL == 0 || ((long) iZzZL) * 2 > 2147483647L) {
            return;
        }
        if (z) {
            this.zzUn = new byte[iZzVK + 1];
        } else {
            this.zzUn = null;
        }
    }

    private int zzVK() {
        return zzZK(zzI(this.zzUw, this.zzUE));
    }

    private void zzVL() throws Exception {
        if (this.zzUy) {
            zzVx();
        } else {
            zzVF();
        }
    }

    private void zzVM() {
        this.zzUF = 8;
        this.zzUC = 0;
        this.zzUz = 0;
        byte[] bArr = this.zzUn;
        if (bArr != null) {
            zzZKV.zzO(bArr, 0, bArr.length);
        }
        if (zzVw()) {
            int i = this.zzUj > 150.0f ? 4 : 2;
            this.zzUu = i;
            this.zzUv = i - 1;
        } else {
            this.zzUu = 0;
            this.zzUv = 0;
        }
        zzVI();
    }

    private boolean zzVw() {
        return (this.zzUx & 1) != 0;
    }

    private void zzVx() throws Exception {
        zzH(1, 12);
        zzH(1, 12);
        if (this.zzUF != 8) {
            zzVC();
        }
    }

    private void zzVy() {
        zzVE();
        this.zzUy = true;
    }

    private void zzVz() {
        zzVE();
        this.zzUG = 2;
        this.zzUB = true;
        this.zzUA = true;
    }

    private void zzW(int i, boolean z) throws Exception {
        short[] sArr = z ? zzUO : zzUN;
        zzX4 zzx4ZzZ = zzX4.zzZ(sArr, 103);
        while (i >= 2624) {
            zzH(zzx4ZzZ.zzUi, zzx4ZzZ.zzUh);
            i -= zzx4ZzZ.zzUg;
        }
        if (i >= 64) {
            zzX4 zzx4ZzZ2 = zzX4.zzZ(sArr, (i >> 6) + 63);
            zzH(zzx4ZzZ2.zzUi, zzx4ZzZ2.zzUh);
            i -= zzx4ZzZ2.zzUg;
        }
        zzX4 zzx4ZzZ3 = zzX4.zzZ(sArr, i);
        zzH(zzx4ZzZ3.zzUi, zzx4ZzZ3.zzUh);
    }

    private static int zzX(byte[] bArr, int i, int i2) {
        return ((bArr[Math.min(i + (i2 >> 3), bArr.length - 1)] & 255) >> (7 - (i2 & 7))) & 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int zzY(byte[] bArr, int i, int i2, int i3) {
        int i4;
        byte b;
        int i5 = i + (i2 >> 3);
        int i6 = i2 & 7;
        int i7 = i3 - i2;
        if (i7 <= 0 || i6 == 0) {
            i4 = 0;
        } else {
            i4 = zzUK[((bArr[i5] & 255) << i6) & 255] & 255;
            int i8 = 8 - i6;
            if (i4 > i8) {
                i4 = i8;
            }
            if (i4 > i7) {
                i4 = i7;
            }
            if (i6 + i4 < 8) {
                return i4;
            }
            i7 -= i4;
            i5++;
        }
        if (i7 >= 64) {
            while (!zzZN(i5)) {
                byte b2 = bArr[i5];
                if ((b2 & 255) != 255) {
                    b = zzUK[b2 & 255];
                    break;
                }
                i4 += 8;
                i7 -= 8;
                i5++;
            }
            loop1: while (i7 >= 32) {
                for (int i9 = 0; i9 < 4; i9++) {
                    if ((bArr[i5 + i9] & 255) != 255) {
                        break loop1;
                    }
                }
                i4 += 32;
                i7 -= 32;
                i5 += 4;
            }
            while (i7 >= 8) {
                byte b3 = bArr[i5];
                if ((b3 & 255) != 255) {
                    b = zzUK[b3 & 255];
                } else {
                    i4 += 8;
                    i7 -= 8;
                    i5++;
                }
            }
            if (i7 > 0) {
                return i4;
            }
            int i10 = zzUK[bArr[i5] & 255] & 255;
            if (i10 <= i7) {
                i7 = i10;
            }
            return i4 + i7;
        }
        while (i7 >= 8) {
        }
        if (i7 > 0) {
        }
        return i4 + (b & 255);
    }

    private static int zzZK(int i) {
        int i2 = i & 7;
        int i3 = i >> 3;
        return i2 != 0 ? i3 + 1 : i3;
    }

    private static int zzZL(int i) {
        return zzJ(i, 32) * 32;
    }

    private static boolean zzZM(int i) {
        return i % 2 == 0;
    }

    private static boolean zzZN(int i) {
        return i % 4 == 0;
    }

    public final void setAlignment(int i) {
        this.zzUG = 1;
    }

    public final void zzZ(byte[] bArr, int i, float f, int i2, zzZOP zzzop) throws Exception {
        this.zzUs = zzzop;
        this.zzUj = f;
        this.zzUw = i2;
        init(i);
        zzVJ();
        zzVM();
        if (this.zzUy) {
            zzT(bArr, bArr.length);
        } else {
            zzU(bArr, bArr.length);
        }
        zzVL();
        close();
    }

    public final void zzw(boolean z) {
        this.zzUB = false;
    }

    public final void zzx(boolean z) {
        this.zzUA = false;
    }

    private static int zzY(byte[] bArr, int i, int i2, int i3, int i4) {
        return i2 < i3 ? zzZ(bArr, i, i2, i3, i4) : i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int zzZ(byte[] bArr, int i, int i2, int i3) {
        int i4;
        byte b;
        int i5 = i + (i2 >> 3);
        int i6 = i3 - i2;
        int i7 = i2 & 7;
        if (i6 <= 0 || i7 == 0) {
            i4 = 0;
        } else {
            i4 = zzUH[((bArr[i5] & 255) << i7) & 255] & 255;
            int i8 = 8 - i7;
            if (i4 > i8) {
                i4 = i8;
            }
            if (i4 > i6) {
                i4 = i6;
            }
            if (i7 + i4 < 8) {
                return i4;
            }
            i6 -= i4;
            i5++;
        }
        if (i6 >= 64) {
            while (!zzZN(i5)) {
                byte b2 = bArr[i5];
                if (b2 != 0) {
                    b = zzUH[b2 & 255];
                    break;
                }
                i4 += 8;
                i6 -= 8;
                i5++;
            }
            loop1: while (i6 >= 32) {
                for (int i9 = 0; i9 < 4; i9++) {
                    if (bArr[i5 + i9] != 0) {
                        break loop1;
                    }
                }
                i4 += 32;
                i6 -= 32;
                i5 += 4;
            }
            while (i6 >= 8) {
                byte b3 = bArr[i5];
                if (b3 != 0) {
                    b = zzUH[b3 & 255];
                } else {
                    i4 += 8;
                    i6 -= 8;
                    i5++;
                }
            }
            if (i6 > 0) {
                return i4;
            }
            int i10 = zzUH[bArr[i5] & 255] & 255;
            if (i10 <= i6) {
                i6 = i10;
            }
            return i4 + i6;
        }
        while (i6 >= 8) {
        }
        if (i6 > 0) {
        }
        return i4 + (b & 255);
    }

    private static int zzZ(byte[] bArr, int i, int i2, int i3, int i4) {
        int iZzZ;
        if (i4 != 0) {
            iZzZ = zzY(bArr, i, i2, i3);
        } else {
            iZzZ = zzZ(bArr, i, i2, i3);
        }
        return i2 + iZzZ;
    }

    private void zzZ(zzX4 zzx4) throws Exception {
        zzH(zzx4.zzUi, zzx4.zzUh);
    }
}
