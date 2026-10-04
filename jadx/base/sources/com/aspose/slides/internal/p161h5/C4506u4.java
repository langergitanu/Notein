package com.aspose.slides.internal.p161h5;

import com.aspose.slides.Oooo0;
import com.aspose.words.TableStyleOptions;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.h5.u4 */
/* JADX INFO: loaded from: classes.dex */
final class C4506u4 {

    /* JADX INFO: renamed from: c5 */
    int f12525c5;

    /* JADX INFO: renamed from: dy */
    short[] f12526dy;

    /* JADX INFO: renamed from: jd */
    C4497ix f12527jd;

    /* JADX INFO: renamed from: ck */
    private static int f12516ck = (C4504rv.f12494h4 * 2) + 1;

    /* JADX INFO: renamed from: k4 */
    static int[] f12520k4 = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 0};

    /* JADX INFO: renamed from: x1 */
    static int[] f12524x1 = {0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13};

    /* JADX INFO: renamed from: kk */
    static int[] f12521kk = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 7};

    /* JADX INFO: renamed from: to */
    static byte[] f12523to = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

    /* JADX INFO: renamed from: fa */
    private static byte[] f12518fa = {0, 1, 2, 3, 4, 4, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 0, 0, 16, 17, 18, 18, 19, 19, 20, 20, 20, 20, 21, 21, 21, 21, 22, 22, 22, 22, 22, 22, 22, 22, 23, 23, 23, 23, 23, 23, 23, 23, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29};

    /* JADX INFO: renamed from: du */
    static byte[] f12517du = {0, 1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 14, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16, 16, 16, 17, 17, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19, 19, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 28};

    /* JADX INFO: renamed from: h4 */
    static int[] f12519h4 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 14, 16, 20, 24, 28, 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 0};

    /* JADX INFO: renamed from: m9 */
    static int[] f12522m9 = {0, 1, 2, 3, 4, 6, 8, 12, 16, 24, 32, 48, 64, 96, 128, 192, 256, 384, 512, ViewUtils.EDGE_TO_EDGE_FLAGS, 1024, TableStyleOptions.DEFAULT_2003, 2048, 3072, 4096, 6144, 8192, 12288, 16384, 24576};

    /* JADX INFO: renamed from: k4 */
    public static int m18585k4(int i) {
        return i < 256 ? f12518fa[i] : f12518fa[C4503ne.m18574k4(i, 7) + 256];
    }

    /* JADX INFO: renamed from: x1 */
    public void m18589x1(C4494dy c4494dy) {
        int i;
        int i2;
        int i3;
        short[] sArr = this.f12526dy;
        C4497ix c4497ix = this.f12527jd;
        short[] sArr2 = c4497ix.f12449h4;
        int i4 = c4497ix.f12447c5;
        c4494dy.f12372bz = 0;
        c4494dy.f12396qm = f12516ck;
        int i5 = -1;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = i6 * 2;
            if (sArr[i7] != 0) {
                int[] iArr = c4494dy.f12379e0;
                int i8 = c4494dy.f12372bz + 1;
                c4494dy.f12372bz = i8;
                iArr[i8] = i6;
                c4494dy.f12382g8[i6] = 0;
                i5 = i6;
            } else {
                sArr[i7 + 1] = 0;
            }
        }
        while (true) {
            i = c4494dy.f12372bz;
            if (i >= 2) {
                break;
            }
            int[] iArr2 = c4494dy.f12379e0;
            int i9 = i + 1;
            c4494dy.f12372bz = i9;
            if (i5 < 2) {
                i3 = i5 + 1;
                i2 = i3;
            } else {
                i2 = i5;
                i3 = 0;
            }
            iArr2[i9] = i3;
            int i10 = i3 * 2;
            sArr[i10] = 1;
            c4494dy.f12382g8[i3] = 0;
            c4494dy.f12383gi--;
            if (sArr2 != null) {
                c4494dy.f12399s7 -= sArr2[i10 + 1];
            }
            i5 = i2;
        }
        this.f12525c5 = i5;
        for (int i11 = i / 2; i11 >= 1; i11--) {
            c4494dy.m18534k4(sArr, i11);
        }
        while (true) {
            int[] iArr3 = c4494dy.f12379e0;
            int i12 = iArr3[1];
            int i13 = c4494dy.f12372bz;
            c4494dy.f12372bz = i13 - 1;
            iArr3[1] = iArr3[i13];
            c4494dy.m18534k4(sArr, 1);
            int[] iArr4 = c4494dy.f12379e0;
            int i14 = iArr4[1];
            int i15 = c4494dy.f12396qm;
            int i16 = i15 - 1;
            c4494dy.f12396qm = i16;
            iArr4[i16] = i12;
            int i17 = i15 - 2;
            c4494dy.f12396qm = i17;
            iArr4[i17] = i14;
            int i18 = i12 * 2;
            int i19 = i14 * 2;
            sArr[i4 * 2] = (short) (sArr[i18] + sArr[i19]);
            byte[] bArr = c4494dy.f12382g8;
            byte b = bArr[i12];
            byte b2 = bArr[i14];
            if (b < b2) {
                b = b2;
            }
            bArr[i4] = (byte) ((b & 255) + 1);
            short s = (short) i4;
            sArr[i19 + 1] = s;
            sArr[i18 + 1] = s;
            int i20 = i4 + 1;
            iArr4[1] = i4;
            c4494dy.m18534k4(sArr, 1);
            if (c4494dy.f12372bz < 2) {
                int[] iArr5 = c4494dy.f12379e0;
                int i21 = c4494dy.f12396qm - 1;
                c4494dy.f12396qm = i21;
                iArr5[i21] = iArr5[1];
                m18588k4(c4494dy);
                m18587k4(sArr, i5, c4494dy.f12405ts);
                return;
            }
            i4 = i20;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static int m18586k4(int i, int i2) {
        int i3 = 0;
        do {
            int i4 = i3 | (i & 1);
            i >>= 1;
            i3 = i4 << 1;
            i2--;
        } while (i2 > 0);
        return i3 >> 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public void m18588k4(C4494dy c4494dy) {
        short[] sArr;
        short s;
        short[] sArr2 = this.f12526dy;
        C4497ix c4497ix = this.f12527jd;
        short[] sArr3 = c4497ix.f12449h4;
        int[] iArr = c4497ix.f12451m9;
        int i = c4497ix.f12448dy;
        int i2 = c4497ix.f12450jd;
        for (int i3 = 0; i3 <= C4504rv.f12496k4; i3++) {
            c4494dy.f12405ts[i3] = 0;
        }
        int[] iArr2 = c4494dy.f12379e0;
        int i4 = c4494dy.f12396qm;
        sArr2[(iArr2[i4] * 2) + 1] = 0;
        int i5 = i4 + 1;
        int i6 = 0;
        while (i5 < f12516ck) {
            int i7 = c4494dy.f12379e0[i5];
            int i8 = i7 * 2;
            int i9 = i8 + 1;
            int i10 = sArr2[(sArr2[i9] * 2) + 1] + 1;
            if (i10 > i2) {
                i6++;
                i10 = i2;
            }
            sArr2[i9] = (short) i10;
            if (i7 <= this.f12525c5) {
                short[] sArr4 = c4494dy.f12405ts;
                sArr4[i10] = (short) (sArr4[i10] + 1);
                int i11 = i7 >= i ? iArr[i7 - i] : 0;
                short s2 = sArr2[i8];
                c4494dy.f12383gi = Oooo0.OooO00o(i10, i11, s2, c4494dy.f12383gi);
                if (sArr3 != null) {
                    c4494dy.f12399s7 = Oooo0.OooO00o(sArr3[i9], i11, s2, c4494dy.f12399s7);
                }
            }
            i5++;
        }
        if (i6 == 0) {
            return;
        }
        do {
            int i12 = i2 - 1;
            while (true) {
                sArr = c4494dy.f12405ts;
                s = sArr[i12];
                if (s != 0) {
                    break;
                } else {
                    i12--;
                }
            }
            sArr[i12] = (short) (s - 1);
            int i13 = i12 + 1;
            sArr[i13] = (short) (sArr[i13] + 2);
            sArr[i2] = (short) (sArr[i2] - 1);
            i6 -= 2;
        } while (i6 > 0);
        while (i2 != 0) {
            short s3 = c4494dy.f12405ts[i2];
            while (s3 != 0) {
                i5--;
                int i14 = c4494dy.f12379e0[i5];
                if (i14 <= this.f12525c5) {
                    int i15 = i14 * 2;
                    int i16 = i15 + 1;
                    short s4 = sArr2[i16];
                    if (s4 != i2) {
                        c4494dy.f12383gi = (int) (((((long) i2) - ((long) s4)) * ((long) sArr2[i15])) + ((long) c4494dy.f12383gi));
                        sArr2[i16] = (short) i2;
                    }
                    s3--;
                }
            }
            i2--;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m18587k4(short[] sArr, int i, short[] sArr2) {
        short[] sArr3 = new short[C4504rv.f12496k4 + 1];
        short s = 0;
        for (int i2 = 1; i2 <= C4504rv.f12496k4; i2++) {
            s = (short) ((s + sArr2[i2 - 1]) << 1);
            sArr3[i2] = s;
        }
        for (int i3 = 0; i3 <= i; i3++) {
            int i4 = i3 * 2;
            short s2 = sArr[i4 + 1];
            if (s2 != 0) {
                short s3 = sArr3[s2];
                sArr3[s2] = (short) (s3 + 1);
                sArr[i4] = (short) m18586k4(s3, s2);
            }
        }
    }
}
