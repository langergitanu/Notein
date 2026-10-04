package com.aspose.slides.internal.p161h5;

/* JADX INFO: renamed from: com.aspose.slides.internal.h5.yj */
/* JADX INFO: loaded from: classes.dex */
final class C4510yj {

    /* JADX INFO: renamed from: c5 */
    byte f12553c5;

    /* JADX INFO: renamed from: ck */
    int[] f12554ck;

    /* JADX INFO: renamed from: du */
    int f12555du;

    /* JADX INFO: renamed from: dy */
    int f12556dy;

    /* JADX INFO: renamed from: fa */
    int f12557fa;

    /* JADX INFO: renamed from: h4 */
    int f12558h4;

    /* JADX INFO: renamed from: jd */
    byte f12559jd;

    /* JADX INFO: renamed from: k4 */
    int f12560k4;

    /* JADX INFO: renamed from: kk */
    int[] f12561kk;

    /* JADX INFO: renamed from: m9 */
    int f12562m9;

    /* JADX INFO: renamed from: to */
    int f12563to = 0;

    /* JADX INFO: renamed from: up */
    int[] f12564up;

    /* JADX INFO: renamed from: x1 */
    int f12565x1;

    /* JADX INFO: renamed from: yj */
    int f12566yj;

    /* JADX WARN: Code restructure failed: missing block: B:61:0x015f, code lost:
    
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0160, code lost:
    
        r2 = r2 - r7;
        r29.f12533fa = r4;
        r29.f12530ck = r5 - (r7 << 3);
        r30.f12509kk = r3 + r7;
        r30.f12512to += (long) (r2 - r30.f12514x1);
        r30.f12514x1 = r2;
        r29.f12547x6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0179, code lost:
    
        return -3;
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int m18594k4(int i, int i2, int[] iArr, int i3, int[] iArr2, int i4, C4507up c4507up, C4505to c4505to) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = c4505to.f12514x1;
        int i11 = c4505to.f12509kk;
        int i12 = c4507up.f12533fa;
        int i13 = c4507up.f12530ck;
        int i14 = c4507up.f12547x6;
        int i15 = c4507up.f12541rv;
        int i16 = i14 < i15 ? (i15 - i14) - 1 : c4507up.f12538ks - i14;
        int[] iArr3 = C4509x6.f12552k4;
        int i17 = iArr3[i];
        int i18 = iArr3[i2];
        while (true) {
            if (i13 < 20) {
                i11--;
                i12 |= (c4505to.f12508k4[i10] & 255) << i13;
                i13 += 8;
                i10++;
            } else {
                int i19 = i12 & i17;
                int i20 = (i3 + i19) * 3;
                int i21 = iArr[i20];
                if (i21 == 0) {
                    int i22 = iArr[i20 + 1];
                    i12 >>= i22;
                    i13 -= i22;
                    i9 = i14 + 1;
                    c4507up.f12548yj[i14] = (byte) iArr[i20 + 2];
                } else {
                    do {
                        int i23 = iArr[i20 + 1];
                        i12 >>= i23;
                        i13 -= i23;
                        if ((i21 & 16) != 0) {
                            int i24 = i21 & 15;
                            int i25 = iArr[i20 + 2] + (C4509x6.f12552k4[i24] & i12);
                            i12 >>= i24;
                            i13 -= i24;
                            while (i13 < 15) {
                                i11--;
                                i12 |= (c4505to.f12508k4[i10] & 255) << i13;
                                i13 += 8;
                                i10++;
                            }
                            int i26 = i12 & i18;
                            int i27 = (i4 + i26) * 3;
                            int i28 = iArr2[i27];
                            while (true) {
                                int i29 = iArr2[i27 + 1];
                                i12 >>= i29;
                                i13 -= i29;
                                if ((i28 & 16) != 0) {
                                    int i30 = i28 & 15;
                                    int i31 = i10;
                                    int i32 = i11;
                                    while (i13 < i30) {
                                        i32--;
                                        i12 |= (c4505to.f12508k4[i31] & 255) << i13;
                                        i13 += 8;
                                        i31++;
                                    }
                                    int i33 = iArr2[i27 + 2] + (C4509x6.f12552k4[i30] & i12);
                                    int i34 = i12 >> i30;
                                    int i35 = i13 - i30;
                                    int i36 = i16 - i25;
                                    if (i14 >= i33) {
                                        int i37 = i14 - i33;
                                        int i38 = i14 - i37;
                                        if (i38 <= 0 || 2 <= i38) {
                                            byte[] bArr = c4507up.f12548yj;
                                            System.arraycopy(bArr, i37, bArr, i14, 2);
                                            i14 += 2;
                                            i5 = i37 + 2;
                                        } else {
                                            byte[] bArr2 = c4507up.f12548yj;
                                            int i39 = i14 + 1;
                                            int i40 = i37 + 1;
                                            bArr2[i14] = bArr2[i37];
                                            i14 += 2;
                                            i5 = i37 + 2;
                                            bArr2[i39] = bArr2[i40];
                                        }
                                        i25 -= 2;
                                    } else {
                                        i5 = i14 - i33;
                                        do {
                                            i6 = c4507up.f12538ks;
                                            i5 += i6;
                                        } while (i5 < 0);
                                        int i41 = i6 - i5;
                                        if (i25 > i41) {
                                            i25 -= i41;
                                            int i42 = i14 - i5;
                                            if (i42 <= 0 || i41 <= i42) {
                                                byte[] bArr3 = c4507up.f12548yj;
                                                System.arraycopy(bArr3, i5, bArr3, i14, i41);
                                                i14 += i41;
                                            } else {
                                                while (true) {
                                                    byte[] bArr4 = c4507up.f12548yj;
                                                    int i43 = i5 + 1;
                                                    bArr4[i14] = bArr4[i5];
                                                    i41--;
                                                    i14++;
                                                    if (i41 == 0) {
                                                        break;
                                                    }
                                                    i5 = i43;
                                                }
                                            }
                                            i5 = 0;
                                        }
                                    }
                                    int i44 = i14 - i5;
                                    if (i44 <= 0 || i25 <= i44) {
                                        byte[] bArr5 = c4507up.f12548yj;
                                        System.arraycopy(bArr5, i5, bArr5, i14, i25);
                                        i14 += i25;
                                    } else {
                                        while (true) {
                                            byte[] bArr6 = c4507up.f12548yj;
                                            int i45 = i5 + 1;
                                            bArr6[i14] = bArr6[i5];
                                            i25--;
                                            i14++;
                                            if (i25 == 0) {
                                                break;
                                            }
                                            i5 = i45;
                                        }
                                    }
                                    i11 = i32;
                                    i10 = i31;
                                    i12 = i34;
                                    i13 = i35;
                                    i16 = i36;
                                } else if ((i28 & 64) == 0) {
                                    i26 = i26 + iArr2[i27 + 2] + (C4509x6.f12552k4[i28] & i12);
                                    i27 = (i4 + i26) * 3;
                                    i28 = iArr2[i27];
                                } else {
                                    c4505to.f12501c5 = "invalid distance code";
                                    i7 = c4505to.f12509kk - i11;
                                    i8 = i13 >> 3;
                                    if (i8 < i7) {
                                    }
                                }
                            }
                        } else if ((i21 & 64) == 0) {
                            i19 = i19 + iArr[i20 + 2] + (C4509x6.f12552k4[i21] & i12);
                            i20 = (i3 + i19) * 3;
                            i21 = iArr[i20];
                        } else {
                            if ((i21 & 32) != 0) {
                                int i46 = c4505to.f12509kk - i11;
                                int i47 = i13 >> 3;
                                if (i47 < i46) {
                                    i46 = i47;
                                }
                                int i48 = i10 - i46;
                                c4507up.f12533fa = i12;
                                c4507up.f12530ck = i13 - (i46 << 3);
                                c4505to.f12509kk = i11 + i46;
                                c4505to.f12512to += (long) (i48 - c4505to.f12514x1);
                                c4505to.f12514x1 = i48;
                                c4507up.f12547x6 = i14;
                                return 1;
                            }
                            c4505to.f12501c5 = "invalid literal/length code";
                            i7 = c4505to.f12509kk - i11;
                            i8 = i13 >> 3;
                            if (i8 < i7) {
                            }
                        }
                    } while (i21 != 0);
                    int i49 = iArr[i20 + 1];
                    i12 >>= i49;
                    i13 -= i49;
                    i9 = i14 + 1;
                    c4507up.f12548yj[i14] = (byte) iArr[i20 + 2];
                }
                i16--;
                i14 = i9;
                if (i16 < 258 || i11 < 10) {
                    break;
                }
            }
        }
        int i50 = c4505to.f12509kk - i11;
        int i51 = i13 >> 3;
        if (i51 < i50) {
            i50 = i51;
        }
        int i52 = i10 - i50;
        c4507up.f12533fa = i12;
        c4507up.f12530ck = i13 - (i50 << 3);
        c4505to.f12509kk = i11 + i50;
        c4505to.f12512to += (long) (i52 - c4505to.f12514x1);
        c4505to.f12514x1 = i52;
        c4507up.f12547x6 = i14;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0090, code lost:
    
        r18.f12533fa = r4;
        r18.f12530ck = r5;
        r8.f12509kk = r3;
        r8.f12512to += (long) (r2 - r8.f12514x1);
        r8.f12514x1 = r2;
        r18.f12547x6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a8, code lost:
    
        return r18.m18592x1(1);
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0340 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x025a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014f A[LOOP:2: B:55:0x014d->B:56:0x014f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0217  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int m18595k4(C4507up c4507up, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C4505to c4505to = c4507up.f12536jd;
        int i12 = c4505to.f12514x1;
        int i13 = c4505to.f12509kk;
        int i14 = c4507up.f12533fa;
        int i15 = c4507up.f12530ck;
        int i16 = c4507up.f12547x6;
        int i17 = c4507up.f12541rv;
        int i18 = i16 < i17 ? (i17 - i16) - 1 : c4507up.f12538ks - i16;
        int i19 = i16;
        int i20 = i15;
        int i21 = i14;
        int i22 = i13;
        int i23 = i12;
        int iM18594k4 = i;
        while (true) {
            int i24 = 0;
            switch (this.f12560k4) {
                case 0:
                    if (i18 >= 258 && i22 >= 10) {
                        c4507up.f12533fa = i21;
                        c4507up.f12530ck = i20;
                        c4505to.f12509kk = i22;
                        c4505to.f12512to += (long) (i23 - c4505to.f12514x1);
                        c4505to.f12514x1 = i23;
                        c4507up.f12547x6 = i19;
                        iM18594k4 = m18594k4(this.f12553c5 & 255, this.f12559jd & 255, this.f12554ck, this.f12557fa, this.f12564up, this.f12566yj, c4507up, c4505to);
                        i23 = c4505to.f12514x1;
                        i22 = c4505to.f12509kk;
                        i21 = c4507up.f12533fa;
                        i20 = c4507up.f12530ck;
                        i19 = c4507up.f12547x6;
                        int i25 = c4507up.f12541rv;
                        i18 = i19 < i25 ? (i25 - i19) - 1 : c4507up.f12538ks - i19;
                        if (iM18594k4 != 0) {
                            i24 = iM18594k4 == 1 ? 7 : 9;
                            this.f12560k4 = i24;
                            break;
                        }
                    }
                    this.f12555du = this.f12553c5 & 255;
                    this.f12561kk = this.f12554ck;
                    this.f12563to = this.f12557fa;
                    this.f12560k4 = 1;
                    i3 = this.f12555du;
                    while (i20 < i3) {
                        if (i22 == 0) {
                            c4507up.f12533fa = i21;
                            c4507up.f12530ck = i20;
                            c4505to.f12509kk = i22;
                            c4505to.f12512to += (long) (i23 - c4505to.f12514x1);
                            c4505to.f12514x1 = i23;
                            c4507up.f12547x6 = i19;
                            return c4507up.m18592x1(iM18594k4);
                        }
                        i22--;
                        i21 |= (c4505to.f12508k4[i23] & 255) << i20;
                        i20 += 8;
                        iM18594k4 = 0;
                        i23++;
                    }
                    int i26 = (this.f12563to + (C4509x6.f12552k4[i3] & i21)) * 3;
                    int[] iArr = this.f12561kk;
                    int i27 = iArr[i26 + 1];
                    i21 >>= i27;
                    i20 -= i27;
                    i4 = iArr[i26];
                    if (i4 != 0) {
                        this.f12558h4 = iArr[i26 + 2];
                        i5 = 6;
                    } else if ((i4 & 16) != 0) {
                        this.f12562m9 = i4 & 15;
                        this.f12565x1 = iArr[i26 + 2];
                        i5 = 2;
                    } else if ((i4 & 64) == 0) {
                        this.f12555du = i4;
                        i6 = i26 / 3;
                        i7 = iArr[i26 + 2];
                        this.f12563to = i6 + i7;
                    } else {
                        if ((i4 & 32) == 0) {
                            this.f12560k4 = 9;
                            c4505to.f12501c5 = "invalid literal/length code";
                            c4507up.f12533fa = i21;
                            c4507up.f12530ck = i20;
                            c4505to.f12509kk = i22;
                            c4505to.f12512to += (long) (i23 - c4505to.f12514x1);
                            c4505to.f12514x1 = i23;
                            c4507up.f12547x6 = i19;
                            return c4507up.m18592x1(-3);
                        }
                        this.f12560k4 = 7;
                    }
                    this.f12560k4 = i5;
                    break;
                case 1:
                    i3 = this.f12555du;
                    while (i20 < i3) {
                    }
                    int i262 = (this.f12563to + (C4509x6.f12552k4[i3] & i21)) * 3;
                    int[] iArr2 = this.f12561kk;
                    int i272 = iArr2[i262 + 1];
                    i21 >>= i272;
                    i20 -= i272;
                    i4 = iArr2[i262];
                    if (i4 != 0) {
                    }
                    this.f12560k4 = i5;
                    break;
                case 2:
                    int i28 = this.f12562m9;
                    while (i20 < i28) {
                        if (i22 == 0) {
                            c4507up.f12533fa = i21;
                            c4507up.f12530ck = i20;
                            c4505to.f12509kk = i22;
                            c4505to.f12512to += (long) (i23 - c4505to.f12514x1);
                            c4505to.f12514x1 = i23;
                            c4507up.f12547x6 = i19;
                            return c4507up.m18592x1(iM18594k4);
                        }
                        i22--;
                        i21 |= (c4505to.f12508k4[i23] & 255) << i20;
                        i20 += 8;
                        iM18594k4 = 0;
                        i23++;
                    }
                    this.f12565x1 += i21 & C4509x6.f12552k4[i28];
                    i21 >>= i28;
                    i20 -= i28;
                    this.f12555du = this.f12559jd & 255;
                    this.f12561kk = this.f12564up;
                    this.f12563to = this.f12566yj;
                    this.f12560k4 = 3;
                    i8 = this.f12555du;
                    while (i20 < i8) {
                        if (i22 == 0) {
                            c4507up.f12533fa = i21;
                            c4507up.f12530ck = i20;
                            c4505to.f12509kk = i22;
                            c4505to.f12512to += (long) (i23 - c4505to.f12514x1);
                            c4505to.f12514x1 = i23;
                            c4507up.f12547x6 = i19;
                            return c4507up.m18592x1(iM18594k4);
                        }
                        i22--;
                        i21 |= (c4505to.f12508k4[i23] & 255) << i20;
                        i20 += 8;
                        iM18594k4 = 0;
                        i23++;
                    }
                    int i29 = (this.f12563to + (C4509x6.f12552k4[i8] & i21)) * 3;
                    int[] iArr3 = this.f12561kk;
                    int i30 = iArr3[i29 + 1];
                    i21 >>= i30;
                    i20 -= i30;
                    i9 = iArr3[i29];
                    if ((i9 & 16) == 0) {
                        this.f12562m9 = i9 & 15;
                        this.f12556dy = iArr3[i29 + 2];
                        i5 = 4;
                        this.f12560k4 = i5;
                    } else {
                        if ((i9 & 64) != 0) {
                            this.f12560k4 = 9;
                            c4505to.f12501c5 = "invalid distance code";
                            c4507up.f12533fa = i21;
                            c4507up.f12530ck = i20;
                            c4505to.f12509kk = i22;
                            c4505to.f12512to += (long) (i23 - c4505to.f12514x1);
                            c4505to.f12514x1 = i23;
                            c4507up.f12547x6 = i19;
                            return c4507up.m18592x1(-3);
                        }
                        this.f12555du = i9;
                        i6 = i29 / 3;
                        i7 = iArr3[i29 + 2];
                        this.f12563to = i6 + i7;
                    }
                    break;
                case 3:
                    i8 = this.f12555du;
                    while (i20 < i8) {
                    }
                    int i292 = (this.f12563to + (C4509x6.f12552k4[i8] & i21)) * 3;
                    int[] iArr32 = this.f12561kk;
                    int i302 = iArr32[i292 + 1];
                    i21 >>= i302;
                    i20 -= i302;
                    i9 = iArr32[i292];
                    if ((i9 & 16) == 0) {
                    }
                    break;
                case 4:
                    int i31 = this.f12562m9;
                    while (i20 < i31) {
                        if (i22 == 0) {
                            c4507up.f12533fa = i21;
                            c4507up.f12530ck = i20;
                            c4505to.f12509kk = i22;
                            c4505to.f12512to += (long) (i23 - c4505to.f12514x1);
                            c4505to.f12514x1 = i23;
                            c4507up.f12547x6 = i19;
                            return c4507up.m18592x1(iM18594k4);
                        }
                        i22--;
                        i21 |= (c4505to.f12508k4[i23] & 255) << i20;
                        i20 += 8;
                        iM18594k4 = 0;
                        i23++;
                    }
                    this.f12556dy += C4509x6.f12552k4[i31] & i21;
                    i21 >>= i31;
                    i20 -= i31;
                    this.f12560k4 = 5;
                    i10 = i19 - this.f12556dy;
                    while (i10 < 0) {
                        i10 += c4507up.f12538ks;
                    }
                    while (this.f12565x1 != 0) {
                        if (i18 == 0) {
                            int i32 = c4507up.f12538ks;
                            if (i19 == i32 && (i11 = c4507up.f12541rv) != 0) {
                                i18 = i11 > 0 ? i11 - 1 : i32;
                                i19 = 0;
                            }
                            if (i18 == 0) {
                                c4507up.f12547x6 = i19;
                                iM18594k4 = c4507up.m18592x1(iM18594k4);
                                i19 = c4507up.f12547x6;
                                int i33 = c4507up.f12541rv;
                                int i34 = i19 < i33 ? (i33 - i19) - 1 : c4507up.f12538ks - i19;
                                int i35 = c4507up.f12538ks;
                                if (i19 != i35 || i33 == 0) {
                                    i18 = i34;
                                } else {
                                    if (i33 > 0) {
                                        i35 = i33 - 1;
                                    }
                                    i19 = 0;
                                    i18 = i35;
                                }
                                if (i18 == 0) {
                                    c4507up.f12533fa = i21;
                                    c4507up.f12530ck = i20;
                                    c4505to.f12509kk = i22;
                                    c4505to.f12512to += (long) (i23 - c4505to.f12514x1);
                                    c4505to.f12514x1 = i23;
                                    c4507up.f12547x6 = i19;
                                    return c4507up.m18592x1(iM18594k4);
                                }
                            }
                        }
                        byte[] bArr = c4507up.f12548yj;
                        int i36 = i19 + 1;
                        int i37 = i10 + 1;
                        bArr[i19] = bArr[i10];
                        i18--;
                        i10 = i37 == c4507up.f12538ks ? 0 : i37;
                        this.f12565x1--;
                        i19 = i36;
                    }
                    this.f12560k4 = i24;
                    break;
                case 5:
                    i10 = i19 - this.f12556dy;
                    while (i10 < 0) {
                    }
                    while (this.f12565x1 != 0) {
                    }
                    this.f12560k4 = i24;
                    break;
                case 6:
                    if (i18 == 0) {
                        int i38 = c4507up.f12538ks;
                        if (i19 == i38 && (i2 = c4507up.f12541rv) != 0) {
                            i18 = i2 > 0 ? i2 - 1 : i38;
                            i19 = 0;
                        }
                        if (i18 == 0) {
                            c4507up.f12547x6 = i19;
                            int iM18592x1 = c4507up.m18592x1(iM18594k4);
                            i19 = c4507up.f12547x6;
                            int i39 = c4507up.f12541rv;
                            int i40 = i19 < i39 ? (i39 - i19) - 1 : c4507up.f12538ks - i19;
                            int i41 = c4507up.f12538ks;
                            if (i19 != i41 || i39 == 0) {
                                i18 = i40;
                            } else {
                                if (i39 > 0) {
                                    i41 = i39 - 1;
                                }
                                i19 = 0;
                                i18 = i41;
                            }
                            if (i18 == 0) {
                                c4507up.f12533fa = i21;
                                c4507up.f12530ck = i20;
                                c4505to.f12509kk = i22;
                                c4505to.f12512to += (long) (i23 - c4505to.f12514x1);
                                c4505to.f12514x1 = i23;
                                c4507up.f12547x6 = i19;
                                return c4507up.m18592x1(iM18592x1);
                            }
                        }
                    }
                    c4507up.f12548yj[i19] = (byte) this.f12558h4;
                    i18--;
                    this.f12560k4 = 0;
                    i19++;
                    iM18594k4 = 0;
                    break;
                case 7:
                    if (i20 > 7) {
                        i20 -= 8;
                        i22++;
                        i23--;
                    }
                    c4507up.f12547x6 = i19;
                    int iM18592x12 = c4507up.m18592x1(iM18594k4);
                    i19 = c4507up.f12547x6;
                    if (c4507up.f12541rv != i19) {
                        c4507up.f12533fa = i21;
                        c4507up.f12530ck = i20;
                        c4505to.f12509kk = i22;
                        c4505to.f12512to += (long) (i23 - c4505to.f12514x1);
                        c4505to.f12514x1 = i23;
                        c4507up.f12547x6 = i19;
                        return c4507up.m18592x1(iM18592x12);
                    }
                    this.f12560k4 = 8;
                    break;
                case 8:
                    break;
                case 9:
                    c4507up.f12533fa = i21;
                    c4507up.f12530ck = i20;
                    c4505to.f12509kk = i22;
                    c4505to.f12512to += (long) (i23 - c4505to.f12514x1);
                    c4505to.f12514x1 = i23;
                    c4507up.f12547x6 = i19;
                    return c4507up.m18592x1(-3);
                default:
                    c4507up.f12533fa = i21;
                    c4507up.f12530ck = i20;
                    c4505to.f12509kk = i22;
                    c4505to.f12512to += (long) (i23 - c4505to.f12514x1);
                    c4505to.f12514x1 = i23;
                    c4507up.f12547x6 = i19;
                    return c4507up.m18592x1(-2);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m18596k4(int i, int i2, int[] iArr, int i3, int[] iArr2, int i4) {
        this.f12560k4 = 0;
        this.f12553c5 = (byte) i;
        this.f12559jd = (byte) i2;
        this.f12554ck = iArr;
        this.f12557fa = i3;
        this.f12564up = iArr2;
        this.f12566yj = i4;
        this.f12561kk = null;
    }
}
