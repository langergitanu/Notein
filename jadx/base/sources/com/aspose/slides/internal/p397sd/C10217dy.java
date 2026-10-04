package com.aspose.slides.internal.p397sd;

import androidx.core.graphics.OooO0OO;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.sd.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C10217dy {

    /* JADX INFO: renamed from: c5 */
    private int f36606c5;

    /* JADX INFO: renamed from: ck */
    private int f36607ck;

    /* JADX INFO: renamed from: du */
    private C10223m9 f36608du;

    /* JADX INFO: renamed from: dy */
    private int f36609dy;

    /* JADX INFO: renamed from: fa */
    private int f36610fa;

    /* JADX INFO: renamed from: h4 */
    private C10223m9 f36611h4;

    /* JADX INFO: renamed from: jd */
    private int f36612jd;

    /* JADX INFO: renamed from: kk */
    private int f36614kk;

    /* JADX INFO: renamed from: m9 */
    private int f36615m9;

    /* JADX INFO: renamed from: to */
    private C10223m9 f36616to;

    /* JADX INFO: renamed from: up */
    private byte[] f36617up;

    /* JADX INFO: renamed from: yj */
    private k4[] f36619yj;

    /* JADX INFO: renamed from: k4 */
    private final C10221k4 f36613k4 = new C10221k4();

    /* JADX INFO: renamed from: x1 */
    private final boolean f36618x1 = false;

    /* JADX INFO: renamed from: com.aspose.slides.internal.sd.dy$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        public int f36620k4;

        /* JADX INFO: renamed from: x1 */
        public k4 f36621x1;

        private k4() {
        }
    }

    private C10217dy() {
    }

    /* JADX INFO: renamed from: k4 */
    public static int m50034k4() {
        return 7168;
    }

    /* JADX INFO: renamed from: kk */
    private void m50041kk() {
        this.f36619yj = new k4[65536];
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            for (int i3 = 0; i3 < 96; i3++) {
                this.f36617up[i] = (byte) i2;
                int i4 = i + 1;
                m50042kk(i);
                this.f36617up[i4] = (byte) i3;
                i += 2;
                m50042kk(i4);
            }
        }
        for (int i5 = 0; i < 7168 && i5 < 256; i5++) {
            byte b = (byte) i5;
            this.f36617up[i] = b;
            int i6 = i + 1;
            m50042kk(i);
            this.f36617up[i6] = b;
            int i7 = i + 2;
            m50042kk(i6);
            this.f36617up[i7] = b;
            int i8 = i + 3;
            m50042kk(i7);
            this.f36617up[i8] = b;
            i += 4;
            m50042kk(i8);
        }
    }

    /* JADX INFO: renamed from: to */
    private byte[] m50043to() {
        return this.f36613k4.m50068x1();
    }

    /* JADX INFO: renamed from: x1 */
    private static int m50044x1(int i) {
        return (C10223m9.m50081kk(i - 1) + 2) / 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e5  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m50035k4(int i, int[] iArr) {
        char c;
        int[] iArr2 = {0};
        int[] iArr3 = {0};
        int[] iArr4 = {0};
        int iM50036k4 = m50036k4(i, iArr2, iArr3, iArr4);
        int i2 = iArr2[0];
        int i3 = iArr3[0];
        int i4 = iArr4[0];
        int i5 = i + 1;
        m50042kk(i);
        if (i3 > 0) {
            int[] iArr5 = {0};
            int[] iArr6 = {0};
            int[] iArr7 = {0};
            int iM50036k42 = m50036k4(i5, iArr5, iArr6, iArr7);
            int i6 = iArr5[0];
            int i7 = iArr6[0];
            int i8 = iArr7[0];
            c = 0;
            int iM50083k4 = this.f36611h4.m50083k4(this.f36617up[i] & 255);
            if (i7 >= i3 && i4 > ((i8 * iM50036k42) + iM50083k4) / (iM50036k42 + 1)) {
                iM50036k4 = 0;
            } else if (iM50036k4 > 3) {
                iArr5[0] = i6;
                iArr6[0] = i7;
                iArr7[0] = i8;
                int i9 = i + iM50036k4;
                int iM50036k43 = m50036k4(i9, iArr5, iArr6, iArr7);
                int i10 = iArr7[0];
                if (iM50036k43 >= 2) {
                    int[] iArr8 = {0};
                    int iM50036k44 = m50036k4(i9 - 1, new int[]{0}, new int[]{0}, iArr8);
                    int i11 = iArr8[0];
                    if (iM50036k44 > iM50036k43 && i11 < i10) {
                        int i12 = i2 + 1;
                        int iM50044x1 = m50044x1(i12);
                        int i13 = iM50036k4 - 1;
                        if (((i10 * iM50036k43) + (i4 * iM50036k4)) / (iM50036k43 + iM50036k4) > ((i11 * iM50036k44) + (m50046x1(i13, i12, iM50044x1) + m50045x1(i12, iM50044x1))) / (i13 + iM50036k44)) {
                            iM50036k4--;
                            i2 = i12;
                        }
                    }
                }
            }
            if (iM50036k4 == 2) {
                if (i >= 2) {
                    byte[] bArr = this.f36617up;
                    if (bArr[i] == bArr[i - 2]) {
                        if (i4 * 2 > this.f36611h4.m50083k4(this.f36617up[i5] & 255) + this.f36611h4.m50083k4(this.f36606c5)) {
                            iM50036k4 = 0;
                        }
                    } else if (i >= 1) {
                        byte[] bArr2 = this.f36617up;
                        if (i5 < bArr2.length && bArr2[i5] == bArr2[i - 1] && i4 * 2 > iM50083k4 + this.f36611h4.m50083k4(this.f36606c5)) {
                        }
                    }
                }
            }
        } else {
            c = 0;
        }
        iArr[c] = i2;
        return iM50036k4;
    }

    /* JADX INFO: renamed from: kk */
    private void m50042kk(int i) {
        byte b = this.f36617up[i];
        if (i > 0) {
            k4 k4Var = new k4();
            int i2 = i - 1;
            int i3 = (b & 255) | ((this.f36617up[i2] & 255) << 8);
            k4Var.f36620k4 = i2;
            k4[] k4VarArr = this.f36619yj;
            k4Var.f36621x1 = k4VarArr[i3];
            k4VarArr[i3] = k4Var;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private int m50045x1(int i, int i2) {
        int i3 = i - 1;
        int iM50083k4 = 0;
        for (int i4 = (i2 - 1) * 3; i4 >= 0; i4 -= 3) {
            iM50083k4 += this.f36616to.m50083k4((i3 >> i4) & 7);
        }
        return iM50083k4;
    }

    /* JADX INFO: renamed from: k4 */
    private int m50036k4(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr4;
        int i7;
        int i8;
        int iOooO00o;
        int iM50045x1;
        int iM50045x12;
        int[] iArr5 = new int[33];
        byte[] bArr = this.f36617up;
        int length = bArr.length - i;
        int i9 = 1;
        if (length > 1) {
            int i10 = (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
            k4 k4Var = this.f36619yj[i10];
            int i11 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            k4 k4Var2 = null;
            int i12 = 0;
            while (k4Var != null) {
                int i13 = k4Var.f36620k4;
                i2 = 0;
                int i14 = i - i13;
                i11 += i9;
                int i15 = i9;
                if (i11 > 256 || i14 > Integer.MAX_VALUE || i14 > this.f36609dy) {
                    k4[] k4VarArr = this.f36619yj;
                    if (k4VarArr[i10] == k4Var) {
                        k4VarArr[i10] = null;
                    } else {
                        k4Var2.f36621x1 = null;
                    }
                } else {
                    int i16 = length < i14 ? length : i14;
                    int i17 = 2;
                    if (i16 < 2) {
                        iArr4 = iArr5;
                    } else {
                        int i18 = i13 + 2;
                        int i19 = 2;
                        while (true) {
                            if (i19 >= i16) {
                                iArr4 = iArr5;
                                i7 = i17;
                                break;
                            }
                            byte[] bArr2 = this.f36617up;
                            iArr4 = iArr5;
                            if (bArr2[i18] != bArr2[i + i19]) {
                                i7 = 2;
                                break;
                            }
                            i18++;
                            i19++;
                            iArr5 = iArr4;
                            i17 = 2;
                        }
                        if (i19 >= i7 && (i8 = (i14 - i19) + 1) <= this.f36609dy && ((i19 != i7 || i8 < 512) && (i19 > i3 || i8 <= i4 || (i19 > i3 - 2 && (i8 <= (i4 << 3) || (i19 >= i3 && i8 <= (i4 << 4))))))) {
                            if (i19 > i12) {
                                int i20 = 32;
                                int i21 = i19 > 32 ? 32 : i19;
                                while (i12 < i21) {
                                    int i22 = i12 + 1;
                                    iArr4[i22] = this.f36611h4.m50083k4(this.f36617up[i + i12] & 255) + iArr4[i12];
                                    i12 = i22;
                                    i20 = 32;
                                }
                                if (i19 > i20) {
                                    int i23 = iArr4[i20];
                                    iOooO00o = OooO0OO.OooO00o(i19, 32, i23 / 32, i23);
                                } else {
                                    iOooO00o = iArr4[i19];
                                }
                                i12 = i21;
                            } else {
                                iOooO00o = iArr4[i19];
                            }
                            if (iOooO00o > i5) {
                                int iM50044x1 = m50044x1(i8);
                                int iM50046x1 = m50046x1(i19, i8, iM50044x1);
                                if ((iOooO00o - iM50046x1) - (iM50044x1 << 16) > i5 && (iM50045x12 = iOooO00o - (iM50045x1 = iM50046x1 + m50045x1(i8, iM50044x1))) > i5) {
                                    i5 = iM50045x12;
                                    i4 = i8;
                                    i3 = i19;
                                    i6 = iM50045x1;
                                }
                            }
                        }
                    }
                    k4Var2 = k4Var;
                    i9 = i15;
                    k4Var = k4Var.f36621x1;
                    iArr5 = iArr4;
                }
            }
            i2 = 0;
        } else {
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        iArr3[i2] = i3 > 0 ? i6 / i3 : i2;
        iArr[i2] = i4;
        iArr2[i2] = i5;
        return i3;
    }

    /* JADX INFO: renamed from: x1 */
    private int m50046x1(int i, int i2, int i3) {
        int i4 = i2 >= 512 ? i - 3 : i - 2;
        int iM50081kk = C10223m9.m50081kk(i4);
        int i5 = 2;
        while (i5 < iM50081kk) {
            i5 += 2;
        }
        int i6 = 1 << (i5 - 1);
        int i7 = iM50081kk > 2 ? 2 : 0;
        if ((i4 & i6) != 0) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        if (((i6 >> 1) & i4) != 0) {
            i8 |= 1;
        }
        int i9 = i6 >> 2;
        int iM50083k4 = this.f36611h4.m50083k4(((i3 - 1) * 8) + i8 + 256);
        int i10 = iM50081kk - 2;
        while (i10 >= 1) {
            int i11 = i10 > 2 ? 2 : 0;
            if ((i4 & i9) != 0) {
                i11 |= 1;
            }
            int i12 = i11 << 1;
            if (((i9 >> 1) & i4) != 0) {
                i12 |= 1;
            }
            i9 >>= 2;
            iM50083k4 += this.f36608du.m50083k4(i12);
            i10 -= 2;
        }
        return iM50083k4;
    }

    /* JADX INFO: renamed from: k4 */
    private void m50037k4(int i) {
        this.f36615m9 = 1;
        int i2 = 1 << 3;
        while (true) {
            this.f36609dy = i2;
            if (this.f36609dy >= i) {
                int i3 = this.f36615m9 * 8;
                this.f36606c5 = i3 + 256;
                this.f36612jd = i3 + 257;
                this.f36607ck = i3 + StyleIdentifier.COLORFUL_LIST_ACCENT_6;
                this.f36610fa = i3 + StyleIdentifier.COLORFUL_GRID_ACCENT_6;
                return;
            }
            int i4 = this.f36615m9 + 1;
            this.f36615m9 = i4;
            i2 = 1 << (i4 * 3);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m50047x1() {
        C10223m9 c10223m9;
        int i;
        m50041kk();
        this.f36613k4.m50066k4(this.f36614kk, 24);
        int i2 = 7168;
        int i3 = this.f36614kk + 7168;
        while (i2 < i3) {
            int[] iArr = {0};
            int i4 = i2 + 1;
            int iM50035k4 = m50035k4(i2, iArr);
            int i5 = iArr[0];
            if (iM50035k4 > 0) {
                int iM50044x1 = m50044x1(i5);
                m50039k4(iM50035k4, i5, iM50044x1);
                m50038k4(i5, iM50044x1);
                int i6 = 1;
                while (i6 < iM50035k4) {
                    m50042kk(i4);
                    i6++;
                    i4++;
                }
            } else {
                byte[] bArr = this.f36617up;
                byte b = bArr[i2];
                if (i2 >= 2 && b == bArr[i2 - 2]) {
                    c10223m9 = this.f36611h4;
                    i = this.f36606c5;
                } else if (i2 >= 4 && b == bArr[i2 - 4]) {
                    c10223m9 = this.f36611h4;
                    i = this.f36612jd;
                } else if (i2 < 6 || b != bArr[i2 - 6]) {
                    c10223m9 = this.f36611h4;
                    i = b & 255;
                } else {
                    c10223m9 = this.f36611h4;
                    i = this.f36607ck;
                }
                c10223m9.m50084x1(i);
            }
            i2 = i4;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m50038k4(int i, int i2) {
        int i3 = i - 1;
        for (int i4 = (i2 - 1) * 3; i4 >= 0; i4 -= 3) {
            this.f36616to.m50084x1((i3 >> i4) & 7);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m50048x1(byte[] bArr) {
        this.f36613k4.m50067k4(this.f36618x1);
        int length = bArr.length;
        this.f36614kk = length;
        m50037k4(length);
        this.f36616to = new C10223m9(this.f36613k4, 8);
        this.f36608du = new C10223m9(this.f36613k4, 8);
        this.f36611h4 = new C10223m9(this.f36613k4, this.f36610fa);
        this.f36617up = new byte[this.f36614kk + 7168];
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArr), 0, AbstractC14092to.m67208k4((Object) this.f36617up), 7168, this.f36614kk);
        m50047x1();
        this.f36613k4.m50064k4();
    }

    /* JADX INFO: renamed from: k4 */
    private void m50039k4(int i, int i2, int i3) {
        int i4 = i2 >= 512 ? i - 3 : i - 2;
        int iM50081kk = C10223m9.m50081kk(i4);
        int i5 = 2;
        while (i5 < iM50081kk) {
            i5 += 2;
        }
        int i6 = 1 << (i5 - 1);
        int i7 = iM50081kk > 2 ? 2 : 0;
        if ((i4 & i6) != 0) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        if (((i6 >> 1) & i4) != 0) {
            i8 |= 1;
        }
        int i9 = i6 >> 2;
        this.f36611h4.m50084x1(((i3 - 1) * 8) + i8 + 256);
        int i10 = iM50081kk - 2;
        while (i10 >= 1) {
            int i11 = i10 > 2 ? 2 : 0;
            if ((i4 & i9) != 0) {
                i11 |= 1;
            }
            int i12 = i11 << 1;
            if (((i9 >> 1) & i4) != 0) {
                i12 |= 1;
            }
            i9 >>= 2;
            this.f36608du.m50084x1(i12);
            i10 -= 2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m50040k4(byte[] bArr) {
        C10217dy c10217dy = new C10217dy();
        c10217dy.m50048x1(bArr);
        return c10217dy.m50043to();
    }
}
