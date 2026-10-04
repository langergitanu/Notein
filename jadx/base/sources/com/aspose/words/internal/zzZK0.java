package com.aspose.words.internal;

import Oooo0oO.C21034OooOOOo;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZK0 {
    protected int zzZMO;
    protected int zzZMP;
    protected byte[] zzZMQ;
    protected int zzZMR;
    protected int[] zzZMM = new int[256];
    protected int[] zzZML = new int[256];
    protected int[] zzZMK = new int[256];
    protected int[] zzZMJ = new int[32];
    protected int[][] zzZMN = new int[256][];

    public zzZK0(byte[] bArr, int i, int i2) {
        this.zzZMQ = bArr;
        this.zzZMP = i;
        this.zzZMO = i2;
        for (int i3 = 0; i3 < 256; i3++) {
            this.zzZMN[i3] = new int[]{i, i, i, 0};
            int i4 = (i3 << 12) / 256;
            this.zzZMK[i3] = 256;
            this.zzZML[i3] = 0;
        }
    }

    private void zzU(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.zzZMN[i2];
        int i6 = iArr[0];
        iArr[0] = i6 - (((i6 - i3) * i) / 1024);
        int i7 = iArr[1];
        iArr[1] = i7 - (((i7 - i4) * i) / 1024);
        int i8 = iArr[2];
        iArr[2] = i8 - (((i8 - i5) * i) / 1024);
    }

    private void zzV(int i, int i2, int i3, int i4, int i5) {
        int i6 = i2 - i;
        if (i6 < -1) {
            i6 = -1;
        }
        int i7 = i2 + i;
        if (i7 > 256) {
            i7 = 256;
        }
        int i8 = i2 + 1;
        int i9 = i2 - 1;
        int i10 = 1;
        while (true) {
            if (i8 >= i7 && i9 <= i6) {
                return;
            }
            int i11 = i10 + 1;
            int i12 = this.zzZMJ[i10];
            if (i8 < i7) {
                int i13 = i8 + 1;
                int[] iArr = this.zzZMN[i8];
                try {
                    int i14 = iArr[0];
                    iArr[0] = i14 - com.aspose.slides.internal.p497xc.OooO00o.OooO00o(i14, i3, i12, 262144);
                    int i15 = iArr[1];
                    iArr[1] = i15 - com.aspose.slides.internal.p497xc.OooO00o.OooO00o(i15, i4, i12, 262144);
                    int i16 = iArr[2];
                    iArr[2] = i16 - com.aspose.slides.internal.p497xc.OooO00o.OooO00o(i16, i5, i12, 262144);
                } catch (Exception unused) {
                }
                i8 = i13;
            }
            if (i9 > i6) {
                int i17 = i9 - 1;
                int[] iArr2 = this.zzZMN[i9];
                try {
                    int i18 = iArr2[0];
                    iArr2[0] = i18 - com.aspose.slides.internal.p497xc.OooO00o.OooO00o(i18, i3, i12, 262144);
                    int i19 = iArr2[1];
                    iArr2[1] = i19 - com.aspose.slides.internal.p497xc.OooO00o.OooO00o(i19, i4, i12, 262144);
                    int i20 = iArr2[2];
                    iArr2[2] = i20 - com.aspose.slides.internal.p497xc.OooO00o.OooO00o(i20, i5, i12, 262144);
                } catch (Exception unused2) {
                }
                i10 = i11;
                i9 = i17;
            } else {
                i10 = i11;
            }
        }
    }

    private void zze6() {
        for (int i = 0; i < 256; i++) {
            int[] iArr = this.zzZMN[i];
            iArr[0] = iArr[0] >> 4;
            iArr[1] = iArr[1] >> 4;
            iArr[2] = iArr[2] >> 4;
            iArr[3] = i;
        }
    }

    private void zze8() {
        int i;
        zzZK0 zzzk0 = this;
        int i2 = zzzk0.zzZMP;
        int i3 = 1509;
        if (i2 < 1509) {
            zzzk0.zzZMO = 1;
        }
        int i4 = zzzk0.zzZMO;
        zzzk0.zzZMR = C21034OooOOOo.OooO00o(i4, 1, 3, 30);
        byte[] bArr = zzzk0.zzZMQ;
        int i5 = i2 / (i4 * 3);
        int i6 = i5 / 100;
        for (int i7 = 0; i7 < 32; i7++) {
            zzzk0.zzZMJ[i7] = (((1024 - (i7 * i7)) * 256) / 1024) * 1024;
        }
        int i8 = zzzk0.zzZMP;
        if (i8 < 1509) {
            i = 3;
        } else {
            if (i8 % 499 != 0) {
                i3 = 1497;
            } else if (i8 % 491 != 0) {
                i3 = 1473;
            } else if (i8 % 487 != 0) {
                i3 = 1461;
            }
            i = i3;
        }
        int i9 = 2048;
        int i10 = 1024;
        int i11 = i6;
        int i12 = 32;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i5) {
            int i15 = (bArr[i14] & 255) << 4;
            int i16 = (bArr[i14 + 1] & 255) << 4;
            int i17 = (bArr[i14 + 2] & 255) << 4;
            int iZzs = zzzk0.zzs(i15, i16, i17);
            zzzk0.zzU(i10, iZzs, i15, i16, i17);
            int i18 = i10;
            zzzk0 = this;
            int i19 = i12;
            if (i12 != 0) {
                zzzk0.zzV(i19, iZzs, i15, i16, i17);
            }
            int i20 = i14 + i;
            if (i20 >= i2) {
                i20 -= zzzk0.zzZMP;
            }
            i14 = i20;
            i13++;
            if (i11 == 0) {
                i11 = 1;
            }
            if (i13 % i11 == 0) {
                i10 = i18 - (i18 / zzzk0.zzZMR);
                i9 -= i9 / 30;
                int i21 = i9 >> 6;
                i12 = i21 <= 1 ? 0 : i21;
                for (int i22 = 0; i22 < i12; i22++) {
                    int i23 = i12 * i12;
                    zzzk0.zzZMJ[i22] = (((i23 - (i22 * i22)) * 256) / i23) * i10;
                }
            } else {
                i12 = i19;
                i10 = i18;
            }
        }
    }

    private void zze9() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < 256) {
            int[] iArr = this.zzZMN[i];
            int i4 = iArr[1];
            int i5 = i + 1;
            int i6 = i;
            for (int i7 = i5; i7 < 256; i7++) {
                int i8 = this.zzZMN[i7][1];
                if (i8 < i4) {
                    i6 = i7;
                    i4 = i8;
                }
            }
            int[] iArr2 = this.zzZMN[i6];
            if (i != i6) {
                int i9 = iArr2[0];
                iArr2[0] = iArr[0];
                iArr[0] = i9;
                int i10 = iArr2[1];
                iArr2[1] = iArr[1];
                iArr[1] = i10;
                int i11 = iArr2[2];
                iArr2[2] = iArr[2];
                iArr[2] = i11;
                int i12 = iArr2[3];
                iArr2[3] = iArr[3];
                iArr[3] = i12;
            }
            if (i4 != i2) {
                this.zzZMM[i2] = (i3 + i) >> 1;
                while (true) {
                    i2++;
                    if (i2 >= i4) {
                        break;
                    } else {
                        this.zzZMM[i2] = i;
                    }
                }
                i3 = i;
                i2 = i4;
            }
            i = i5;
        }
        this.zzZMM[i2] = (i3 + 255) >> 1;
        for (int i13 = i2 + 1; i13 < 256; i13++) {
            this.zzZMM[i13] = 255;
        }
    }

    private byte[] zzea() {
        byte[] bArr = new byte[ViewUtils.EDGE_TO_EDGE_FLAGS];
        int[] iArr = new int[256];
        for (int i = 0; i < 256; i++) {
            iArr[this.zzZMN[i][3]] = i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            int[] iArr2 = this.zzZMN[iArr[i3]];
            bArr[i2] = (byte) iArr2[0];
            int i4 = i2 + 2;
            bArr[i2 + 1] = (byte) iArr2[1];
            i2 += 3;
            bArr[i4] = (byte) iArr2[2];
        }
        return bArr;
    }

    private int zzs(int i, int i2, int i3) {
        int i4 = Integer.MAX_VALUE;
        int i5 = -1;
        int i6 = -1;
        int i7 = Integer.MAX_VALUE;
        for (int i8 = 0; i8 < 256; i8++) {
            int[] iArr = this.zzZMN[i8];
            int i9 = iArr[0] - i;
            if (i9 < 0) {
                i9 = -i9;
            }
            int i10 = iArr[1] - i2;
            if (i10 < 0) {
                i10 = -i10;
            }
            int i11 = i9 + i10;
            int i12 = iArr[2] - i3;
            if (i12 < 0) {
                i12 = -i12;
            }
            int i13 = i11 + i12;
            if (i13 < i4) {
                i5 = i8;
                i4 = i13;
            }
            int[] iArr2 = this.zzZML;
            int i14 = i13 - (iArr2[i8] >> 12);
            if (i14 < i7) {
                i6 = i8;
                i7 = i14;
            }
            int[] iArr3 = this.zzZMK;
            int i15 = iArr3[i8];
            int i16 = i15 >> 10;
            iArr3[i8] = i15 - i16;
            iArr2[i8] = iArr2[i8] + (i16 << 10);
        }
        int[] iArr4 = this.zzZMK;
        iArr4[i5] = iArr4[i5] + 64;
        int[] iArr5 = this.zzZML;
        iArr5[i5] = iArr5[i5] - 65536;
        return i6;
    }

    public final byte[] zze7() {
        zze8();
        zze6();
        zze9();
        return zzea();
    }

    public final int zzt(int i, int i2, int i3) {
        int i4 = this.zzZMM[i2];
        int i5 = i4 - 1;
        int i6 = 1000;
        int i7 = -1;
        while (true) {
            if (i4 >= 256 && i5 < 0) {
                return i7;
            }
            if (i4 < 256) {
                int[] iArr = this.zzZMN[i4];
                int i8 = iArr[1] - i2;
                if (i8 >= i6) {
                    i4 = 256;
                } else {
                    i4++;
                    if (i8 < 0) {
                        i8 = -i8;
                    }
                    int i9 = iArr[0] - i;
                    if (i9 < 0) {
                        i9 = -i9;
                    }
                    int i10 = i8 + i9;
                    if (i10 < i6) {
                        int i11 = iArr[2] - i3;
                        if (i11 < 0) {
                            i11 = -i11;
                        }
                        int i12 = i10 + i11;
                        if (i12 < i6) {
                            i7 = iArr[3];
                            i6 = i12;
                        }
                    }
                }
            }
            if (i5 >= 0) {
                int[] iArr2 = this.zzZMN[i5];
                int i13 = i2 - iArr2[1];
                if (i13 >= i6) {
                    i5 = -1;
                } else {
                    i5--;
                    if (i13 < 0) {
                        i13 = -i13;
                    }
                    int i14 = iArr2[0] - i;
                    if (i14 < 0) {
                        i14 = -i14;
                    }
                    int i15 = i13 + i14;
                    if (i15 < i6) {
                        int i16 = iArr2[2] - i3;
                        if (i16 < 0) {
                            i16 = -i16;
                        }
                        int i17 = i16 + i15;
                        if (i17 < i6) {
                            i7 = iArr2[3];
                            i6 = i17;
                        }
                    }
                }
            }
        }
    }
}
