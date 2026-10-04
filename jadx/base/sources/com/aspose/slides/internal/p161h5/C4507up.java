package com.aspose.slides.internal.p161h5;

import com.aspose.slides.Oooo0;
import com.aspose.words.StyleIdentifier;
import java.util.Arrays;

/* JADX INFO: renamed from: com.aspose.slides.internal.h5.up */
/* JADX INFO: loaded from: classes.dex */
final class C4507up {

    /* JADX INFO: renamed from: k4 */
    static int[] f12528k4 = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

    /* JADX INFO: renamed from: c5 */
    int f12529c5;

    /* JADX INFO: renamed from: ck */
    int f12530ck;

    /* JADX INFO: renamed from: du */
    int[] f12531du;

    /* JADX INFO: renamed from: fa */
    int f12533fa;

    /* JADX INFO: renamed from: ix */
    long f12535ix;

    /* JADX INFO: renamed from: jd */
    C4505to f12536jd;

    /* JADX INFO: renamed from: kk */
    int f12537kk;

    /* JADX INFO: renamed from: ks */
    int f12538ks;

    /* JADX INFO: renamed from: ne */
    Object f12540ne;

    /* JADX INFO: renamed from: rv */
    int f12541rv;

    /* JADX INFO: renamed from: to */
    int f12542to;

    /* JADX INFO: renamed from: x1 */
    int f12546x1;

    /* JADX INFO: renamed from: x6 */
    int f12547x6;

    /* JADX INFO: renamed from: yj */
    byte[] f12548yj;

    /* JADX INFO: renamed from: h4 */
    int[] f12534h4 = new int[1];

    /* JADX INFO: renamed from: m9 */
    int[] f12539m9 = new int[1];

    /* JADX INFO: renamed from: dy */
    C4510yj f12532dy = new C4510yj();

    /* JADX INFO: renamed from: u4 */
    C4495fa f12543u4 = new C4495fa();

    /* JADX INFO: renamed from: up */
    int[] f12544up = new int[4320];

    /* JADX INFO: renamed from: uz */
    private int f12545uz = 0;

    public C4507up(C4505to c4505to, Object obj, int i) {
        this.f12536jd = c4505to;
        this.f12548yj = new byte[i];
        this.f12538ks = i;
        this.f12540ne = obj;
        m18591k4();
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0383, code lost:
    
        r38.f12531du = null;
        r38.f12545uz = 9;
        r1 = r38.f12536jd;
        r1.f12501c5 = "invalid bit length repeat";
        r38.f12533fa = r4;
        r38.f12530ck = r5;
        r1.f12509kk = r2;
        r1.f12512to += (long) (r3 - r1.f12514x1);
        r1.f12514x1 = r3;
        r38.f12547x6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x03a7, code lost:
    
        return m18592x1(-3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x03a8, code lost:
    
        r38.f12545uz = 9;
        r1 = r38.f12536jd;
        r1.f12501c5 = "too many length or distance symbols";
        r38.f12533fa = r4;
        r38.f12530ck = r5;
        r1.f12509kk = r2;
        r1.f12512to += (long) (r3 - r1.f12514x1);
        r1.f12514x1 = r3;
        r38.f12547x6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x03c8, code lost:
    
        return m18592x1(-3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0246, code lost:
    
        r38.f12547x6 = r6;
        r1 = m18592x1(r1);
        r6 = r38.f12547x6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0250, code lost:
    
        if (r38.f12541rv == r6) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0252, code lost:
    
        r38.f12533fa = r4;
        r38.f12530ck = r5;
        r4 = r38.f12536jd;
        r4.f12509kk = r2;
        r4.f12512to += (long) (r3 - r4.f12514x1);
        r4.f12514x1 = r3;
        r38.f12547x6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x026c, code lost:
    
        return m18592x1(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x026d, code lost:
    
        r38.f12545uz = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0271, code lost:
    
        r38.f12533fa = r4;
        r38.f12530ck = r5;
        r1 = r38.f12536jd;
        r1.f12509kk = r2;
        r1.f12512to += (long) (r3 - r1.f12514x1);
        r1.f12514x1 = r3;
        r38.f12547x6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x028c, code lost:
    
        return m18592x1(1);
     */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x012e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3 A[ADDED_TO_REGION, LOOP:4: B:34:0x00d3->B:36:0x00d7, LOOP_START, PHI: r1 r2 r3 r4 r5
      0x00d3: PHI (r1v66 int) = (r1v63 int), (r1v73 int) binds: [B:33:0x00d1, B:36:0x00d7] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r2v40 int) = (r2v37 int), (r2v43 int) binds: [B:33:0x00d1, B:36:0x00d7] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r3v19 int) = (r3v18 int), (r3v20 int) binds: [B:33:0x00d1, B:36:0x00d7] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r4v37 int) = (r4v34 int), (r4v40 int) binds: [B:33:0x00d1, B:36:0x00d7] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r5v22 int) = (r5v21 int), (r5v24 int) binds: [B:33:0x00d1, B:36:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121 A[LOOP:5: B:40:0x011b->B:42:0x0121, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x028d  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int m18590k4(int i) {
        int i2;
        int iM18595k4;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        C4505to c4505to = this.f12536jd;
        int i7 = c4505to.f12514x1;
        int i8 = c4505to.f12509kk;
        int i9 = this.f12533fa;
        int i10 = this.f12530ck;
        int i11 = this.f12547x6;
        int i12 = this.f12541rv;
        int i13 = i11 < i12 ? (i12 - i11) - 1 : this.f12538ks - i11;
        int i14 = i11;
        int i15 = i10;
        int i16 = i9;
        int i17 = i7;
        int i18 = i8;
        int i19 = i;
        while (true) {
            int i20 = 9;
            int i21 = 7;
            int i22 = 6;
            switch (this.f12545uz) {
                case 0:
                    for (int i23 = 3; i15 < i23; i23 = 3) {
                        if (i18 == 0) {
                            this.f12533fa = i16;
                            this.f12530ck = i15;
                            C4505to c4505to2 = this.f12536jd;
                            c4505to2.f12509kk = i18;
                            c4505to2.f12512to += (long) (i17 - c4505to2.f12514x1);
                            c4505to2.f12514x1 = i17;
                            this.f12547x6 = i14;
                            return m18592x1(i19);
                        }
                        i18--;
                        i16 |= (this.f12536jd.f12508k4[i17] & 255) << i15;
                        i15 += 8;
                        i17++;
                        i19 = 0;
                    }
                    this.f12529c5 = i16 & 1;
                    long j = (((long) (i16 & 7)) & 4294967295L) >> 1;
                    if (j == 0) {
                        int i24 = i15 - 3;
                        int i25 = i24 & 7;
                        i16 = (i16 >> 3) >> i25;
                        i15 = i24 - i25;
                        z = true;
                        this.f12545uz = 1;
                    } else {
                        z = true;
                        if (j == 1) {
                            int[] iArr = new int[1];
                            int[] iArr2 = new int[1];
                            int[][] iArr3 = new int[1][];
                            int[][] iArr4 = new int[1][];
                            C4495fa.m18551k4(iArr, iArr2, iArr3, iArr4, this.f12536jd);
                            this.f12532dy.m18596k4(iArr[0], iArr2[0], iArr3[0], 0, iArr4[0], 0);
                            i16 >>= 3;
                            i15 -= 3;
                            i6 = 6;
                        } else if (j == 2) {
                            i16 >>= 3;
                            i15 -= 3;
                            i6 = 3;
                        } else if (j == 3) {
                            int i26 = i16 >> 3;
                            this.f12545uz = 9;
                            C4505to c4505to3 = this.f12536jd;
                            c4505to3.f12501c5 = "invalid block type";
                            this.f12533fa = i26;
                            this.f12530ck = i15 - 3;
                            c4505to3.f12509kk = i18;
                            c4505to3.f12512to += (long) (i17 - c4505to3.f12514x1);
                            c4505to3.f12514x1 = i17;
                            this.f12547x6 = i14;
                            return m18592x1(-3);
                        }
                        this.f12545uz = i6;
                    }
                    break;
                case 1:
                    while (i15 < 32) {
                        if (i18 == 0) {
                            this.f12533fa = i16;
                            this.f12530ck = i15;
                            C4505to c4505to4 = this.f12536jd;
                            c4505to4.f12509kk = i18;
                            c4505to4.f12512to += (long) (i17 - c4505to4.f12514x1);
                            c4505to4.f12514x1 = i17;
                            this.f12547x6 = i14;
                            return m18592x1(i19);
                        }
                        i18--;
                        i16 |= (this.f12536jd.f12508k4[i17] & 255) << i15;
                        i15 += 8;
                        i17++;
                        i19 = 0;
                    }
                    int i27 = 65535 & i16;
                    if ((((~i16) >> 16) & 65535) != i27) {
                        this.f12545uz = 9;
                        C4505to c4505to5 = this.f12536jd;
                        c4505to5.f12501c5 = "invalid stored block lengths";
                        this.f12533fa = i16;
                        this.f12530ck = i15;
                        c4505to5.f12509kk = i18;
                        c4505to5.f12512to += (long) (i17 - c4505to5.f12514x1);
                        c4505to5.f12514x1 = i17;
                        this.f12547x6 = i14;
                        return m18592x1(-3);
                    }
                    this.f12546x1 = i27;
                    this.f12545uz = i27 != 0 ? 2 : this.f12529c5 != 0 ? 7 : 0;
                    i16 = 0;
                    i15 = 0;
                    break;
                    break;
                case 2:
                    if (i18 == 0) {
                        this.f12533fa = i16;
                        this.f12530ck = i15;
                        C4505to c4505to6 = this.f12536jd;
                        c4505to6.f12509kk = i18;
                        c4505to6.f12512to += (long) (i17 - c4505to6.f12514x1);
                        c4505to6.f12514x1 = i17;
                        this.f12547x6 = i14;
                        return m18592x1(i19);
                    }
                    if (i13 == 0) {
                        int i28 = this.f12538ks;
                        if (i14 == i28 && (i2 = this.f12541rv) != 0) {
                            i13 = i2 > 0 ? i2 - 1 : i28;
                            i14 = 0;
                        }
                        if (i13 == 0) {
                            this.f12547x6 = i14;
                            int iM18592x1 = m18592x1(i19);
                            i14 = this.f12547x6;
                            int i29 = this.f12541rv;
                            i13 = i14 < i29 ? (i29 - i14) - 1 : this.f12538ks - i14;
                            int i30 = this.f12538ks;
                            if (i14 == i30 && i29 != 0) {
                                if (i29 > 0) {
                                    i30 = i29 - 1;
                                }
                                i13 = i30;
                                i14 = 0;
                            }
                            if (i13 == 0) {
                                this.f12533fa = i16;
                                this.f12530ck = i15;
                                C4505to c4505to7 = this.f12536jd;
                                c4505to7.f12509kk = i18;
                                c4505to7.f12512to += (long) (i17 - c4505to7.f12514x1);
                                c4505to7.f12514x1 = i17;
                                this.f12547x6 = i14;
                                return m18592x1(iM18592x1);
                            }
                        }
                    }
                    int i31 = this.f12546x1;
                    if (i31 > i18) {
                        i31 = i18;
                    }
                    if (i31 > i13) {
                        i31 = i13;
                    }
                    System.arraycopy(this.f12536jd.f12508k4, i17, this.f12548yj, i14, i31);
                    i17 += i31;
                    i18 -= i31;
                    i14 += i31;
                    i13 -= i31;
                    int i32 = this.f12546x1 - i31;
                    this.f12546x1 = i32;
                    if (i32 == 0) {
                        this.f12545uz = this.f12529c5 != 0 ? 7 : 0;
                    }
                    i19 = 0;
                    break;
                    break;
                case 3:
                    while (i15 < 14) {
                        if (i18 == 0) {
                            this.f12533fa = i16;
                            this.f12530ck = i15;
                            C4505to c4505to8 = this.f12536jd;
                            c4505to8.f12509kk = i18;
                            c4505to8.f12512to += (long) (i17 - c4505to8.f12514x1);
                            c4505to8.f12514x1 = i17;
                            this.f12547x6 = i14;
                            return m18592x1(i19);
                        }
                        i18--;
                        i16 |= (this.f12536jd.f12508k4[i17] & 255) << i15;
                        i15 += 8;
                        i19 = 0;
                        i17++;
                    }
                    int i33 = i16 & 16383;
                    this.f12537kk = i33;
                    int i34 = i16 & 31;
                    if (i34 <= 29 && (i5 = (i33 >> 5) & 31) <= 29) {
                        int i35 = i34 + StyleIdentifier.COLORFUL_LIST_ACCENT_6 + i5;
                        int[] iArr5 = this.f12531du;
                        if (iArr5 == null || iArr5.length < i35) {
                            this.f12531du = new int[i35];
                        } else {
                            Arrays.fill(iArr5, 0, i35, 0);
                        }
                        i16 >>= 14;
                        i15 -= 14;
                        this.f12542to = 0;
                        this.f12545uz = 4;
                        for (int i36 = 4; this.f12542to < (this.f12537kk >> 10) + i36; i36 = 4) {
                            while (i15 < 3) {
                                if (i18 == 0) {
                                    this.f12533fa = i16;
                                    this.f12530ck = i15;
                                    C4505to c4505to9 = this.f12536jd;
                                    c4505to9.f12509kk = i18;
                                    c4505to9.f12512to += (long) (i17 - c4505to9.f12514x1);
                                    c4505to9.f12514x1 = i17;
                                    this.f12547x6 = i14;
                                    return m18592x1(i19);
                                }
                                i18--;
                                i16 |= (this.f12536jd.f12508k4[i17] & 255) << i15;
                                i15 += 8;
                                i19 = 0;
                                i17++;
                            }
                            int[] iArr6 = this.f12531du;
                            int[] iArr7 = f12528k4;
                            int i37 = this.f12542to;
                            this.f12542to = i37 + 1;
                            iArr6[iArr7[i37]] = i16 & 7;
                            i16 >>= 3;
                            i15 -= 3;
                        }
                        while (true) {
                            i4 = this.f12542to;
                            if (i4 < 19) {
                                int[] iArr8 = this.f12534h4;
                                iArr8[0] = 7;
                                int iM18554k4 = this.f12543u4.m18554k4(this.f12531du, iArr8, this.f12539m9, this.f12544up, this.f12536jd);
                                if (iM18554k4 != 0) {
                                    if (iM18554k4 == -3) {
                                        this.f12531du = null;
                                        this.f12545uz = 9;
                                    }
                                    this.f12533fa = i16;
                                    this.f12530ck = i15;
                                    C4505to c4505to10 = this.f12536jd;
                                    c4505to10.f12509kk = i18;
                                    c4505to10.f12512to += (long) (i17 - c4505to10.f12514x1);
                                    c4505to10.f12514x1 = i17;
                                    this.f12547x6 = i14;
                                    return m18592x1(iM18554k4);
                                }
                                this.f12542to = 0;
                                this.f12545uz = 5;
                                while (true) {
                                    i3 = this.f12537kk;
                                    if (this.f12542to < (i3 & 31) + StyleIdentifier.COLORFUL_LIST_ACCENT_6 + ((i3 >> 5) & 31)) {
                                        this.f12539m9[0] = -1;
                                        int[] iArr9 = {i20};
                                        int[] iArr10 = {i22};
                                        int[] iArr11 = new int[1];
                                        int[] iArr12 = new int[1];
                                        int iM18553k4 = this.f12543u4.m18553k4((i3 & 31) + 257, ((i3 >> 5) & 31) + 1, this.f12531du, iArr9, iArr10, iArr11, iArr12, this.f12544up, this.f12536jd);
                                        if (iM18553k4 != 0) {
                                            if (iM18553k4 == -3) {
                                                this.f12531du = null;
                                                this.f12545uz = 9;
                                            }
                                            this.f12533fa = i16;
                                            this.f12530ck = i15;
                                            C4505to c4505to11 = this.f12536jd;
                                            c4505to11.f12509kk = i18;
                                            c4505to11.f12512to += (long) (i17 - c4505to11.f12514x1);
                                            c4505to11.f12514x1 = i17;
                                            this.f12547x6 = i14;
                                            return m18592x1(iM18553k4);
                                        }
                                        C4510yj c4510yj = this.f12532dy;
                                        int i38 = iArr9[0];
                                        int i39 = iArr10[0];
                                        int[] iArr13 = this.f12544up;
                                        c4510yj.m18596k4(i38, i39, iArr13, iArr11[0], iArr13, iArr12[0]);
                                        this.f12545uz = i22;
                                    } else {
                                        int i40 = this.f12534h4[0];
                                        while (i15 < i40) {
                                            if (i18 == 0) {
                                                this.f12533fa = i16;
                                                this.f12530ck = i15;
                                                C4505to c4505to12 = this.f12536jd;
                                                c4505to12.f12509kk = i18;
                                                c4505to12.f12512to += (long) (i17 - c4505to12.f12514x1);
                                                c4505to12.f12514x1 = i17;
                                                this.f12547x6 = i14;
                                                return m18592x1(i19);
                                            }
                                            i18--;
                                            i16 |= (this.f12536jd.f12508k4[i17] & 255) << i15;
                                            i15 += 8;
                                            i17++;
                                            i19 = 0;
                                        }
                                        int[] iArr14 = this.f12544up;
                                        int i41 = this.f12539m9[0];
                                        int[] iArr15 = C4509x6.f12552k4;
                                        int i42 = iArr14[Oooo0.OooO00o(i41, iArr15[i40] & i16, 3, 1)];
                                        int i43 = iArr14[Oooo0.OooO00o(i41, iArr15[i42] & i16, 3, 2)];
                                        if (i43 < 16) {
                                            i16 >>= i42;
                                            i15 -= i42;
                                            int[] iArr16 = this.f12531du;
                                            int i44 = this.f12542to;
                                            this.f12542to = i44 + 1;
                                            iArr16[i44] = i43;
                                        } else {
                                            int i45 = i43 == 18 ? 7 : i43 - 14;
                                            int i46 = i43 == 18 ? 11 : 3;
                                            while (i15 < i42 + i45) {
                                                if (i18 == 0) {
                                                    this.f12533fa = i16;
                                                    this.f12530ck = i15;
                                                    C4505to c4505to13 = this.f12536jd;
                                                    c4505to13.f12509kk = i18;
                                                    c4505to13.f12512to += (long) (i17 - c4505to13.f12514x1);
                                                    c4505to13.f12514x1 = i17;
                                                    this.f12547x6 = i14;
                                                    return m18592x1(i19);
                                                }
                                                i18--;
                                                i16 |= (this.f12536jd.f12508k4[i17] & 255) << i15;
                                                i15 += 8;
                                                i17++;
                                                i19 = 0;
                                            }
                                            int i47 = i16 >> i42;
                                            int i48 = i46 + (C4509x6.f12552k4[i45] & i47);
                                            i16 = i47 >> i45;
                                            i15 = (i15 - i42) - i45;
                                            int i49 = this.f12542to;
                                            int i50 = this.f12537kk;
                                            if (i49 + i48 > (i50 & 31) + StyleIdentifier.COLORFUL_LIST_ACCENT_6 + ((i50 >> 5) & 31) || (i43 == 16 && i49 < 1)) {
                                                break;
                                            } else {
                                                int i51 = i43 == 16 ? this.f12531du[i49 - 1] : 0;
                                                while (true) {
                                                    int i52 = i49 + 1;
                                                    this.f12531du[i49] = i51;
                                                    i48--;
                                                    if (i48 == 0) {
                                                        this.f12542to = i52;
                                                    } else {
                                                        i49 = i52;
                                                    }
                                                }
                                            }
                                        }
                                        i20 = 9;
                                        i21 = 7;
                                        i22 = 6;
                                    }
                                }
                                this.f12533fa = i16;
                                this.f12530ck = i15;
                                C4505to c4505to14 = this.f12536jd;
                                c4505to14.f12509kk = i18;
                                c4505to14.f12512to += (long) (i17 - c4505to14.f12514x1);
                                c4505to14.f12514x1 = i17;
                                this.f12547x6 = i14;
                                iM18595k4 = this.f12532dy.m18595k4(this, i19);
                                if (iM18595k4 != 1) {
                                    return m18592x1(iM18595k4);
                                }
                                C4505to c4505to15 = this.f12536jd;
                                i17 = c4505to15.f12514x1;
                                i18 = c4505to15.f12509kk;
                                i16 = this.f12533fa;
                                i15 = this.f12530ck;
                                i14 = this.f12547x6;
                                i13 = i14 < this.f12541rv ? (r1 - i14) - 1 : this.f12538ks - i14;
                                if (this.f12529c5 == 0) {
                                    this.f12545uz = 0;
                                    i19 = 0;
                                } else {
                                    this.f12545uz = i21;
                                    i19 = 0;
                                }
                            } else {
                                int[] iArr17 = this.f12531du;
                                int[] iArr18 = f12528k4;
                                this.f12542to = i4 + 1;
                                iArr17[iArr18[i4]] = 0;
                            }
                        }
                    }
                    break;
                case 4:
                    while (this.f12542to < (this.f12537kk >> 10) + i36) {
                    }
                    while (true) {
                        i4 = this.f12542to;
                        if (i4 < 19) {
                        }
                        int[] iArr172 = this.f12531du;
                        int[] iArr182 = f12528k4;
                        this.f12542to = i4 + 1;
                        iArr172[iArr182[i4]] = 0;
                    }
                    break;
                case 5:
                    while (true) {
                        i3 = this.f12537kk;
                        if (this.f12542to < (i3 & 31) + StyleIdentifier.COLORFUL_LIST_ACCENT_6 + ((i3 >> 5) & 31)) {
                        }
                        i20 = 9;
                        i21 = 7;
                        i22 = 6;
                    }
                    this.f12533fa = i16;
                    this.f12530ck = i15;
                    C4505to c4505to142 = this.f12536jd;
                    c4505to142.f12509kk = i18;
                    c4505to142.f12512to += (long) (i17 - c4505to142.f12514x1);
                    c4505to142.f12514x1 = i17;
                    this.f12547x6 = i14;
                    iM18595k4 = this.f12532dy.m18595k4(this, i19);
                    if (iM18595k4 != 1) {
                    }
                    break;
                case 6:
                    this.f12533fa = i16;
                    this.f12530ck = i15;
                    C4505to c4505to1422 = this.f12536jd;
                    c4505to1422.f12509kk = i18;
                    c4505to1422.f12512to += (long) (i17 - c4505to1422.f12514x1);
                    c4505to1422.f12514x1 = i17;
                    this.f12547x6 = i14;
                    iM18595k4 = this.f12532dy.m18595k4(this, i19);
                    if (iM18595k4 != 1) {
                    }
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    this.f12533fa = i16;
                    this.f12530ck = i15;
                    C4505to c4505to16 = this.f12536jd;
                    c4505to16.f12509kk = i18;
                    c4505to16.f12512to += (long) (i17 - c4505to16.f12514x1);
                    c4505to16.f12514x1 = i17;
                    this.f12547x6 = i14;
                    return m18592x1(-3);
                default:
                    this.f12533fa = i16;
                    this.f12530ck = i15;
                    C4505to c4505to17 = this.f12536jd;
                    c4505to17.f12509kk = i18;
                    c4505to17.f12512to += (long) (i17 - c4505to17.f12514x1);
                    c4505to17.f12514x1 = i17;
                    this.f12547x6 = i14;
                    return m18592x1(-2);
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public int m18592x1(int i) {
        int i2;
        int i3 = 0;
        while (true) {
            if (i3 >= 2) {
                break;
            }
            if (i3 == 0) {
                int i4 = this.f12541rv;
                int i5 = this.f12547x6;
                if (i4 > i5) {
                    i5 = this.f12538ks;
                }
                i2 = i5 - i4;
            } else {
                i2 = this.f12547x6 - this.f12541rv;
            }
            if (i2 != 0) {
                C4505to c4505to = this.f12536jd;
                int i6 = c4505to.f12511m9;
                if (i2 > i6) {
                    i2 = i6;
                }
                if (i2 != 0 && i == -5) {
                    i = 0;
                }
                c4505to.f12511m9 = i6 - i2;
                c4505to.f12504dy += (long) i2;
                if (this.f12540ne != null) {
                    long jM18555k4 = C4499k4.m18555k4(this.f12535ix, this.f12548yj, this.f12541rv, i2);
                    this.f12535ix = jM18555k4;
                    c4505to.f12505fa = jM18555k4;
                }
                byte[] bArr = this.f12548yj;
                int i7 = this.f12541rv;
                C4505to c4505to2 = this.f12536jd;
                System.arraycopy(bArr, i7, c4505to2.f12503du, c4505to2.f12506h4, i2);
                this.f12536jd.f12506h4 += i2;
                int i8 = this.f12541rv + i2;
                this.f12541rv = i8;
                int i9 = this.f12538ks;
                if (i8 == i9 && i3 == 0) {
                    this.f12541rv = 0;
                    if (this.f12547x6 == i9) {
                        this.f12547x6 = 0;
                    }
                } else {
                    i3++;
                }
                i3++;
            } else if (i == -5) {
                return 0;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: k4 */
    public long m18591k4() {
        long j = this.f12535ix;
        this.f12545uz = 0;
        this.f12530ck = 0;
        this.f12533fa = 0;
        this.f12547x6 = 0;
        this.f12541rv = 0;
        if (this.f12540ne != null) {
            C4505to c4505to = this.f12536jd;
            long jM18555k4 = C4499k4.m18555k4(0L, null, 0, 0);
            this.f12535ix = jM18555k4;
            c4505to.f12505fa = jM18555k4;
        }
        return j;
    }

    /* JADX INFO: renamed from: x1 */
    public void m18593x1() {
        m18591k4();
        this.f12548yj = null;
        this.f12544up = null;
    }
}
