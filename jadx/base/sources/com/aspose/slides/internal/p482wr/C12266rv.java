package com.aspose.slides.internal.p482wr;

import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.wr.rv */
/* JADX INFO: loaded from: classes5.dex */
public final class C12266rv {

    /* JADX INFO: renamed from: ks */
    private static final int[] f41015ks = {0, 1, 3, 7, 15, 31, 63, 127, 255, FrameMetricsAggregator.EVERY_DURATION, 1023, 2047, 4095, 8191, 16383, 32767, 65535};

    /* JADX INFO: renamed from: c5 */
    public byte f41016c5;

    /* JADX INFO: renamed from: ck */
    public int[] f41017ck;

    /* JADX INFO: renamed from: du */
    public int f41018du;

    /* JADX INFO: renamed from: dy */
    public int f41019dy;

    /* JADX INFO: renamed from: fa */
    public int f41020fa;

    /* JADX INFO: renamed from: h4 */
    public int f41021h4;

    /* JADX INFO: renamed from: jd */
    public byte f41022jd;

    /* JADX INFO: renamed from: k4 */
    public int f41023k4;

    /* JADX INFO: renamed from: kk */
    public int[] f41024kk;

    /* JADX INFO: renamed from: m9 */
    public int f41025m9;

    /* JADX INFO: renamed from: to */
    public int f41026to = 0;

    /* JADX INFO: renamed from: up */
    public int[] f41027up;

    /* JADX INFO: renamed from: x1 */
    public int f41028x1;

    /* JADX INFO: renamed from: yj */
    public int f41029yj;

    /* JADX WARN: Code restructure failed: missing block: B:61:0x017d, code lost:
    
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x017e, code lost:
    
        r2 = r2 - r7;
        r28.f40930up = r4;
        r28.f40919fa = r5 - (r7 << 3);
        r29.f41129kk = r3 + r7;
        r29.f41132to += (long) (r2 - r29.f41134x1);
        r29.f41134x1 = r2;
        r28.f40926ne = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0197, code lost:
    
        return -3;
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m57380k4(int i, int i2, int[] iArr, int i3, int[] iArr2, int i4, C12261ks c12261ks, C12278xk c12278xk) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = c12278xk.f41134x1;
        int i11 = c12278xk.f41129kk;
        int i12 = c12261ks.f40930up;
        int i13 = c12261ks.f40919fa;
        int i14 = c12261ks.f40926ne;
        int i15 = c12261ks.f40933x6;
        int i16 = i14 < i15 ? (i15 - i14) - 1 : c12261ks.f40927rv - i14;
        int[] iArr3 = f41015ks;
        int i17 = iArr3[i];
        int i18 = iArr3[i2];
        while (true) {
            if (i13 < 20) {
                i11--;
                i12 |= (c12278xk.f41128k4[i10] & 255) << i13;
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
                    c12261ks.f40924ks[i14] = (byte) iArr[i20 + 2];
                } else {
                    do {
                        int i23 = iArr[i20 + 1];
                        i12 >>= i23;
                        i13 -= i23;
                        if ((i21 & 16) != 0) {
                            int i24 = i21 & 15;
                            int i25 = iArr[i20 + 2] + (f41015ks[i24] & i12);
                            i12 >>= i24;
                            i13 -= i24;
                            while (i13 < 15) {
                                i11--;
                                i12 |= (c12278xk.f41128k4[i10] & 255) << i13;
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
                                        i12 |= (c12278xk.f41128k4[i31] & 255) << i13;
                                        i13 += 8;
                                        i31++;
                                    }
                                    int i33 = iArr2[i27 + 2] + (f41015ks[i30] & i12);
                                    int i34 = i12 >> i30;
                                    int i35 = i13 - i30;
                                    int i36 = i16 - i25;
                                    if (i14 >= i33) {
                                        int i37 = i14 - i33;
                                        int i38 = i14 - i37;
                                        if (i38 <= 0 || 2 <= i38) {
                                            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) c12261ks.f40924ks), i37, AbstractC14092to.m67208k4((Object) c12261ks.f40924ks), i14, 2);
                                            i14 += 2;
                                            i5 = i37 + 2;
                                        } else {
                                            byte[] bArr = c12261ks.f40924ks;
                                            int i39 = i14 + 1;
                                            int i40 = i37 + 1;
                                            bArr[i14] = bArr[i37];
                                            i14 += 2;
                                            i5 = i37 + 2;
                                            bArr[i39] = bArr[i40];
                                        }
                                        i25 -= 2;
                                    } else {
                                        i5 = i14 - i33;
                                        do {
                                            i6 = c12261ks.f40927rv;
                                            i5 += i6;
                                        } while (i5 < 0);
                                        int i41 = i6 - i5;
                                        if (i25 > i41) {
                                            i25 -= i41;
                                            int i42 = i14 - i5;
                                            if (i42 <= 0 || i41 <= i42) {
                                                AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) c12261ks.f40924ks), i5, AbstractC14092to.m67208k4((Object) c12261ks.f40924ks), i14, i41);
                                                i14 += i41;
                                            } else {
                                                while (true) {
                                                    byte[] bArr2 = c12261ks.f40924ks;
                                                    int i43 = i5 + 1;
                                                    bArr2[i14] = bArr2[i5];
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
                                        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) c12261ks.f40924ks), i5, AbstractC14092to.m67208k4((Object) c12261ks.f40924ks), i14, i25);
                                        i14 += i25;
                                    } else {
                                        while (true) {
                                            byte[] bArr3 = c12261ks.f40924ks;
                                            int i45 = i5 + 1;
                                            bArr3[i14] = bArr3[i5];
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
                                    i26 = i26 + iArr2[i27 + 2] + (f41015ks[i28] & i12);
                                    i27 = (i4 + i26) * 3;
                                    i28 = iArr2[i27];
                                } else {
                                    c12278xk.f41121c5 = "invalid distance code";
                                    i7 = c12278xk.f41129kk - i11;
                                    i8 = i13 >> 3;
                                    if (i8 < i7) {
                                    }
                                }
                            }
                        } else if ((i21 & 64) == 0) {
                            i19 = i19 + iArr[i20 + 2] + (f41015ks[i21] & i12);
                            i20 = (i3 + i19) * 3;
                            i21 = iArr[i20];
                        } else {
                            if ((i21 & 32) != 0) {
                                int i46 = c12278xk.f41129kk - i11;
                                int i47 = i13 >> 3;
                                if (i47 < i46) {
                                    i46 = i47;
                                }
                                int i48 = i10 - i46;
                                c12261ks.f40930up = i12;
                                c12261ks.f40919fa = i13 - (i46 << 3);
                                c12278xk.f41129kk = i11 + i46;
                                c12278xk.f41132to += (long) (i48 - c12278xk.f41134x1);
                                c12278xk.f41134x1 = i48;
                                c12261ks.f40926ne = i14;
                                return 1;
                            }
                            c12278xk.f41121c5 = "invalid literal/length code";
                            i7 = c12278xk.f41129kk - i11;
                            i8 = i13 >> 3;
                            if (i8 < i7) {
                            }
                        }
                    } while (i21 != 0);
                    int i49 = iArr[i20 + 1];
                    i12 >>= i49;
                    i13 -= i49;
                    i9 = i14 + 1;
                    c12261ks.f40924ks[i14] = (byte) iArr[i20 + 2];
                }
                i16--;
                i14 = i9;
                if (i16 < 258 || i11 < 10) {
                    break;
                }
            }
        }
        int i50 = c12278xk.f41129kk - i11;
        int i51 = i13 >> 3;
        if (i51 < i50) {
            i50 = i51;
        }
        int i52 = i10 - i50;
        c12261ks.f40930up = i12;
        c12261ks.f40919fa = i13 - (i50 << 3);
        c12278xk.f41129kk = i11 + i50;
        c12278xk.f41132to += (long) (i52 - c12278xk.f41134x1);
        c12278xk.f41134x1 = i52;
        c12261ks.f40926ne = i14;
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m57381k4(C12261ks c12261ks, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C12278xk c12278xk = c12261ks.f40916ck;
        int i6 = c12278xk.f41134x1;
        int i7 = c12278xk.f41129kk;
        int i8 = c12261ks.f40930up;
        int i9 = c12261ks.f40919fa;
        int i10 = c12261ks.f40926ne;
        int i11 = c12261ks.f40933x6;
        int i12 = 1;
        int i13 = i10 < i11 ? (i11 - i10) - 1 : c12261ks.f40927rv - i10;
        int i14 = i10;
        int i15 = i9;
        int iM57419k4 = i8;
        int i16 = i7;
        int i17 = i6;
        int iM57270x1 = i;
        while (true) {
            int i18 = i12;
            switch (this.f41023k4) {
                case 0:
                    if (i13 >= 258 && i16 >= 10) {
                        c12261ks.f40930up = iM57419k4;
                        c12261ks.f40919fa = i15;
                        c12278xk.f41129kk = i16;
                        c12278xk.f41132to += (long) (i17 - c12278xk.f41134x1);
                        c12278xk.f41134x1 = i17;
                        c12261ks.f40926ne = i14;
                        iM57270x1 = m57380k4(this.f41016c5 & 255, this.f41022jd & 255, this.f41017ck, this.f41020fa, this.f41027up, this.f41029yj, c12261ks, c12278xk);
                        i17 = c12278xk.f41134x1;
                        i16 = c12278xk.f41129kk;
                        iM57419k4 = c12261ks.f40930up;
                        i15 = c12261ks.f40919fa;
                        i14 = c12261ks.f40926ne;
                        i13 = i14 < c12261ks.f40933x6 ? (r9 - i14) - 1 : c12261ks.f40927rv - i14;
                        if (iM57270x1 != 0) {
                            this.f41023k4 = iM57270x1 == i18 ? 7 : 9;
                            i12 = 1;
                            break;
                        }
                    }
                    this.f41018du = this.f41016c5 & 255;
                    this.f41024kk = this.f41017ck;
                    this.f41026to = this.f41020fa;
                    i12 = 1;
                    this.f41023k4 = 1;
                    break;
                case 1:
                    int i19 = this.f41018du;
                    while (i15 < i19) {
                        if (i16 == 0) {
                            c12261ks.f40930up = iM57419k4;
                            c12261ks.f40919fa = i15;
                            c12278xk.f41129kk = i16;
                            c12278xk.f41132to += (long) (i17 - c12278xk.f41134x1);
                            c12278xk.f41134x1 = i17;
                            c12261ks.f40926ne = i14;
                            return c12261ks.m57270x1(iM57270x1);
                        }
                        i16--;
                        iM57419k4 |= (c12278xk.f41128k4[i17] & 255) << i15;
                        i15 += 8;
                        iM57270x1 = 0;
                        i17++;
                    }
                    int i20 = (this.f41026to + (f41015ks[i19] & iM57419k4)) * 3;
                    int i21 = i20 + 1;
                    iM57419k4 = C12274wl.m57419k4(iM57419k4, this.f41024kk[i21]);
                    int[] iArr = this.f41024kk;
                    i15 -= iArr[i21];
                    int i22 = iArr[i20];
                    if (i22 == 0) {
                        this.f41021h4 = iArr[i20 + 2];
                        i = 6;
                    } else if ((i22 & 16) != 0) {
                        this.f41025m9 = i22 & 15;
                        this.f41028x1 = iArr[i20 + 2];
                        i = 2;
                    } else if ((i22 & 64) == 0) {
                        this.f41018du = i22;
                        i2 = i20 / 3;
                        i3 = iArr[i20 + 2];
                        this.f41026to = i2 + i3;
                        i12 = i18;
                    } else {
                        if ((i22 & 32) == 0) {
                            this.f41023k4 = 9;
                            c12278xk.f41121c5 = "invalid literal/length code";
                            c12261ks.f40930up = iM57419k4;
                            c12261ks.f40919fa = i15;
                            c12278xk.f41129kk = i16;
                            c12278xk.f41132to += (long) (i17 - c12278xk.f41134x1);
                            c12278xk.f41134x1 = i17;
                            c12261ks.f40926ne = i14;
                            return c12261ks.m57270x1(-3);
                        }
                        this.f41023k4 = 7;
                        i12 = i18;
                    }
                    this.f41023k4 = i;
                    i12 = i18;
                    break;
                case 2:
                    int i23 = this.f41025m9;
                    while (i15 < i23) {
                        if (i16 == 0) {
                            c12261ks.f40930up = iM57419k4;
                            c12261ks.f40919fa = i15;
                            c12278xk.f41129kk = i16;
                            c12278xk.f41132to += (long) (i17 - c12278xk.f41134x1);
                            c12278xk.f41134x1 = i17;
                            c12261ks.f40926ne = i14;
                            return c12261ks.m57270x1(iM57270x1);
                        }
                        i16--;
                        iM57419k4 |= (c12278xk.f41128k4[i17] & 255) << i15;
                        i15 += 8;
                        iM57270x1 = 0;
                        i17++;
                    }
                    this.f41028x1 += f41015ks[i23] & iM57419k4;
                    iM57419k4 >>= i23;
                    i15 -= i23;
                    this.f41018du = this.f41022jd & 255;
                    this.f41024kk = this.f41027up;
                    this.f41026to = this.f41029yj;
                    this.f41023k4 = 3;
                    i12 = i18;
                    break;
                case 3:
                    int i24 = this.f41018du;
                    while (i15 < i24) {
                        if (i16 == 0) {
                            c12261ks.f40930up = iM57419k4;
                            c12261ks.f40919fa = i15;
                            c12278xk.f41129kk = i16;
                            c12278xk.f41132to += (long) (i17 - c12278xk.f41134x1);
                            c12278xk.f41134x1 = i17;
                            c12261ks.f40926ne = i14;
                            return c12261ks.m57270x1(iM57270x1);
                        }
                        i16--;
                        iM57419k4 |= (c12278xk.f41128k4[i17] & 255) << i15;
                        i15 += 8;
                        iM57270x1 = 0;
                        i17++;
                    }
                    int i25 = (this.f41026to + (f41015ks[i24] & iM57419k4)) * 3;
                    int[] iArr2 = this.f41024kk;
                    int i26 = iArr2[i25 + 1];
                    iM57419k4 >>= i26;
                    i15 -= i26;
                    int i27 = iArr2[i25];
                    if ((i27 & 16) != 0) {
                        this.f41025m9 = i27 & 15;
                        this.f41019dy = iArr2[i25 + 2];
                        i = 4;
                        this.f41023k4 = i;
                        i12 = i18;
                    } else {
                        if ((i27 & 64) != 0) {
                            this.f41023k4 = 9;
                            c12278xk.f41121c5 = "invalid distance code";
                            c12261ks.f40930up = iM57419k4;
                            c12261ks.f40919fa = i15;
                            c12278xk.f41129kk = i16;
                            c12278xk.f41132to += (long) (i17 - c12278xk.f41134x1);
                            c12278xk.f41134x1 = i17;
                            c12261ks.f40926ne = i14;
                            return c12261ks.m57270x1(-3);
                        }
                        this.f41018du = i27;
                        i2 = i25 / 3;
                        i3 = iArr2[i25 + 2];
                        this.f41026to = i2 + i3;
                        i12 = i18;
                    }
                    break;
                case 4:
                    int i28 = this.f41025m9;
                    while (i15 < i28) {
                        if (i16 == 0) {
                            c12261ks.f40930up = iM57419k4;
                            c12261ks.f40919fa = i15;
                            c12278xk.f41129kk = i16;
                            c12278xk.f41132to += (long) (i17 - c12278xk.f41134x1);
                            c12278xk.f41134x1 = i17;
                            c12261ks.f40926ne = i14;
                            return c12261ks.m57270x1(iM57270x1);
                        }
                        i16--;
                        iM57419k4 |= (c12278xk.f41128k4[i17] & 255) << i15;
                        i15 += 8;
                        iM57270x1 = 0;
                        i17++;
                    }
                    this.f41019dy += f41015ks[i28] & iM57419k4;
                    iM57419k4 >>= i28;
                    i15 -= i28;
                    i = 5;
                    this.f41023k4 = i;
                    i12 = i18;
                    break;
                case 5:
                    int i29 = i14 - this.f41019dy;
                    while (i29 < 0) {
                        i29 += c12261ks.f40927rv;
                    }
                    while (this.f41028x1 != 0) {
                        if (i13 == 0) {
                            int i30 = c12261ks.f40927rv;
                            if (i14 == i30 && (i4 = c12261ks.f40933x6) != 0) {
                                i13 = i4 > 0 ? i4 - 1 : i30;
                                i14 = 0;
                            }
                            if (i13 == 0) {
                                c12261ks.f40926ne = i14;
                                iM57270x1 = c12261ks.m57270x1(iM57270x1);
                                i14 = c12261ks.f40926ne;
                                int i31 = c12261ks.f40933x6;
                                int i32 = i14 < i31 ? (i31 - i14) - 1 : c12261ks.f40927rv - i14;
                                int i33 = c12261ks.f40927rv;
                                if (i14 != i33 || i31 == 0) {
                                    i13 = i32;
                                } else {
                                    if (i31 > 0) {
                                        i33 = i31 - 1;
                                    }
                                    i14 = 0;
                                    i13 = i33;
                                }
                                if (i13 == 0) {
                                    c12261ks.f40930up = iM57419k4;
                                    c12261ks.f40919fa = i15;
                                    c12278xk.f41129kk = i16;
                                    c12278xk.f41132to += (long) (i17 - c12278xk.f41134x1);
                                    c12278xk.f41134x1 = i17;
                                    c12261ks.f40926ne = i14;
                                    return c12261ks.m57270x1(iM57270x1);
                                }
                            }
                        }
                        byte[] bArr = c12261ks.f40924ks;
                        int i34 = i14 + 1;
                        int i35 = i29 + 1;
                        bArr[i14] = bArr[i29];
                        i13--;
                        i29 = i35 == c12261ks.f40927rv ? 0 : i35;
                        this.f41028x1--;
                        i14 = i34;
                    }
                    this.f41023k4 = i;
                    i12 = i18;
                    break;
                case 6:
                    if (i13 == 0) {
                        int i36 = c12261ks.f40927rv;
                        if (i14 == i36 && (i5 = c12261ks.f40933x6) != 0) {
                            i13 = i5 > 0 ? i5 - 1 : i36;
                            i14 = 0;
                        }
                        if (i13 == 0) {
                            c12261ks.f40926ne = i14;
                            int iM57270x12 = c12261ks.m57270x1(iM57270x1);
                            i14 = c12261ks.f40926ne;
                            int i37 = c12261ks.f40933x6;
                            int i38 = i14 < i37 ? (i37 - i14) - 1 : c12261ks.f40927rv - i14;
                            int i39 = c12261ks.f40927rv;
                            if (i14 != i39 || i37 == 0) {
                                i13 = i38;
                            } else {
                                if (i37 > 0) {
                                    i39 = i37 - 1;
                                }
                                i14 = 0;
                                i13 = i39;
                            }
                            if (i13 == 0) {
                                c12261ks.f40930up = iM57419k4;
                                c12261ks.f40919fa = i15;
                                c12278xk.f41129kk = i16;
                                c12278xk.f41132to += (long) (i17 - c12278xk.f41134x1);
                                c12278xk.f41134x1 = i17;
                                c12261ks.f40926ne = i14;
                                return c12261ks.m57270x1(iM57270x12);
                            }
                        }
                    }
                    c12261ks.f40924ks[i14] = (byte) this.f41021h4;
                    i13--;
                    this.f41023k4 = 0;
                    iM57270x1 = 0;
                    i14++;
                    i12 = i18;
                    break;
                case 7:
                    if (i15 > 7) {
                        i15 -= 8;
                        i16++;
                        i17--;
                    }
                    c12261ks.f40926ne = i14;
                    iM57270x1 = c12261ks.m57270x1(iM57270x1);
                    i14 = c12261ks.f40926ne;
                    int i40 = c12261ks.f40933x6;
                    int i41 = i14 < i40 ? (i40 - i14) - 1 : c12261ks.f40927rv - i14;
                    if (i40 != i14) {
                        c12261ks.f40930up = iM57419k4;
                        c12261ks.f40919fa = i15;
                        c12278xk.f41129kk = i16;
                        c12278xk.f41132to += (long) (i17 - c12278xk.f41134x1);
                        c12278xk.f41134x1 = i17;
                        c12261ks.f40926ne = i14;
                        c12261ks.m57270x1(iM57270x1);
                        if (c12278xk.f41131m9 == 0) {
                            return 0;
                        }
                        return i18;
                    }
                    this.f41023k4 = 8;
                    i13 = i41;
                    i12 = i18;
                    break;
                case 8:
                    i = c12278xk.f41131m9 != 0 ? i18 : 0;
                    c12261ks.f40930up = iM57419k4;
                    c12261ks.f40919fa = i15;
                    c12278xk.f41129kk = i16;
                    c12278xk.f41132to += (long) (i17 - c12278xk.f41134x1);
                    c12278xk.f41134x1 = i17;
                    c12261ks.f40926ne = i14;
                    return c12261ks.m57270x1(i);
                case 9:
                    c12261ks.f40930up = iM57419k4;
                    c12261ks.f40919fa = i15;
                    c12278xk.f41129kk = i16;
                    c12278xk.f41132to += (long) (i17 - c12278xk.f41134x1);
                    c12278xk.f41134x1 = i17;
                    c12261ks.f40926ne = i14;
                    return c12261ks.m57270x1(-3);
                default:
                    c12261ks.f40930up = iM57419k4;
                    c12261ks.f40919fa = i15;
                    c12278xk.f41129kk = i16;
                    c12278xk.f41132to += (long) (i17 - c12278xk.f41134x1);
                    c12278xk.f41134x1 = i17;
                    c12261ks.f40926ne = i14;
                    return c12261ks.m57270x1(-2);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57382k4(int i, int i2, int[] iArr, int i3, int[] iArr2, int i4) {
        this.f41023k4 = 0;
        this.f41016c5 = (byte) i;
        this.f41022jd = (byte) i2;
        this.f41017ck = iArr;
        this.f41020fa = i3;
        this.f41027up = iArr2;
        this.f41029yj = i4;
        this.f41024kk = null;
    }
}
