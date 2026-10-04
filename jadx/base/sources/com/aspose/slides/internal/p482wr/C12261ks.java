package com.aspose.slides.internal.p482wr;

import androidx.core.app.FrameMetricsAggregator;
import com.aspose.slides.Oooo0;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.wr.ks */
/* JADX INFO: loaded from: classes5.dex */
public final class C12261ks {

    /* JADX INFO: renamed from: ck */
    public C12278xk f40916ck;

    /* JADX INFO: renamed from: du */
    public int f40917du;

    /* JADX INFO: renamed from: fa */
    public int f40919fa;

    /* JADX INFO: renamed from: h4 */
    public int[] f40920h4;

    /* JADX INFO: renamed from: ix */
    public Object f40921ix;

    /* JADX INFO: renamed from: jd */
    public int f40922jd;

    /* JADX INFO: renamed from: kk */
    public int f40923kk;

    /* JADX INFO: renamed from: ks */
    public byte[] f40924ks;

    /* JADX INFO: renamed from: ne */
    public int f40926ne;

    /* JADX INFO: renamed from: rv */
    public int f40927rv;

    /* JADX INFO: renamed from: to */
    public int f40928to;

    /* JADX INFO: renamed from: u4 */
    public long f40929u4;

    /* JADX INFO: renamed from: up */
    public int f40930up;

    /* JADX INFO: renamed from: x6 */
    public int f40933x6;

    /* JADX INFO: renamed from: wl */
    private static final int[] f40914wl = {0, 1, 3, 7, 15, 31, 63, 127, 255, FrameMetricsAggregator.EVERY_DURATION, 1023, 2047, 4095, 8191, 16383, 32767, 65535};

    /* JADX INFO: renamed from: k4 */
    public static final int[] f40913k4 = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

    /* JADX INFO: renamed from: m9 */
    public int[] f40925m9 = new int[1];

    /* JADX INFO: renamed from: dy */
    public int[] f40918dy = new int[1];

    /* JADX INFO: renamed from: c5 */
    public C12266rv f40915c5 = new C12266rv();

    /* JADX INFO: renamed from: uz */
    public C12280yj f40931uz = new C12280yj();

    /* JADX INFO: renamed from: yj */
    public int[] f40934yj = new int[4320];

    /* JADX INFO: renamed from: x1 */
    public int f40932x1 = 0;

    public C12261ks(C12278xk c12278xk, Object obj, int i) {
        this.f40916ck = c12278xk;
        this.f40924ks = new byte[i];
        this.f40927rv = i;
        this.f40921ix = obj;
        m57269k4((long[]) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x03d9, code lost:
    
        r31.f40932x1 = 9;
        r1 = r31.f40916ck;
        r1.f41121c5 = "too many length or distance symbols";
        r31.f40930up = r4;
        r31.f40919fa = r5;
        r1.f41129kk = r2;
        r1.f41132to += (long) (r3 - r1.f41134x1);
        r1.f41134x1 = r3;
        r31.f40926ne = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03f9, code lost:
    
        return m57270x1(-3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0286, code lost:
    
        r31.f40920h4 = null;
        r31.f40932x1 = 9;
        r1 = r31.f40916ck;
        r1.f41121c5 = "invalid bit length repeat";
        r31.f40930up = r4;
        r31.f40919fa = r5;
        r1.f41129kk = r2;
        r1.f41132to += (long) (r3 - r1.f41134x1);
        r1.f41134x1 = r3;
        r31.f40926ne = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02aa, code lost:
    
        return m57270x1(-3);
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m57267k4(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C12278xk c12278xk = this.f40916ck;
        int i6 = c12278xk.f41134x1;
        int i7 = c12278xk.f41129kk;
        int i8 = this.f40930up;
        int i9 = this.f40919fa;
        int i10 = this.f40926ne;
        int i11 = this.f40933x6;
        int i12 = 1;
        int i13 = i10 < i11 ? (i11 - i10) - 1 : this.f40927rv - i10;
        int i14 = i10;
        int i15 = i9;
        int iM57419k4 = i8;
        int i16 = i6;
        int i17 = i7;
        int iM57270x1 = i;
        while (true) {
            int i18 = 6;
            int i19 = 9;
            int i20 = 7;
            int i21 = 0;
            switch (this.f40932x1) {
                case 0:
                    while (i15 < 3) {
                        if (i17 == 0) {
                            this.f40930up = iM57419k4;
                            this.f40919fa = i15;
                            C12278xk c12278xk2 = this.f40916ck;
                            c12278xk2.f41129kk = i17;
                            c12278xk2.f41132to += (long) (i16 - c12278xk2.f41134x1);
                            c12278xk2.f41134x1 = i16;
                            this.f40926ne = i14;
                            return m57270x1(iM57270x1);
                        }
                        i17--;
                        iM57419k4 |= (this.f40916ck.f41128k4[i16] & 255) << i15;
                        i15 += 8;
                        i16++;
                        iM57270x1 = 0;
                    }
                    this.f40922jd = iM57419k4 & 1;
                    int iM57419k42 = C12274wl.m57419k4(iM57419k4 & 7, 1);
                    if (iM57419k42 != 0) {
                        if (iM57419k42 == 1) {
                            int[] iArr = new int[1];
                            int[] iArr2 = new int[1];
                            int[][] iArr3 = new int[1][];
                            int[][] iArr4 = new int[1][];
                            C12280yj.m57537k4(iArr, iArr2, iArr3, iArr4, this.f40916ck);
                            this.f40915c5.m57382k4(iArr[0], iArr2[0], iArr3[0], 0, iArr4[0], 0);
                            iM57419k4 = C12274wl.m57419k4(iM57419k4, 3);
                            i15 -= 3;
                            this.f40932x1 = 6;
                        } else if (iM57419k42 == 2) {
                            iM57419k4 = C12274wl.m57419k4(iM57419k4, 3);
                            i15 -= 3;
                            this.f40932x1 = 3;
                        } else if (iM57419k42 == 3) {
                            int iM57419k43 = C12274wl.m57419k4(iM57419k4, 3);
                            this.f40932x1 = 9;
                            C12278xk c12278xk3 = this.f40916ck;
                            c12278xk3.f41121c5 = "invalid block type";
                            this.f40930up = iM57419k43;
                            this.f40919fa = i15 - 3;
                            c12278xk3.f41129kk = i17;
                            c12278xk3.f41132to += (long) (i16 - c12278xk3.f41134x1);
                            c12278xk3.f41134x1 = i16;
                            this.f40926ne = i14;
                            return m57270x1(-3);
                        }
                        i2 = 1;
                    } else {
                        int i22 = i15 - 3;
                        int i23 = i22 & 7;
                        iM57419k4 = C12274wl.m57419k4(C12274wl.m57419k4(iM57419k4, 3), i23);
                        i15 = i22 - i23;
                        i2 = 1;
                        this.f40932x1 = 1;
                    }
                    i12 = i2;
                    break;
                case 1:
                    while (i15 < 32) {
                        if (i17 == 0) {
                            this.f40930up = iM57419k4;
                            this.f40919fa = i15;
                            C12278xk c12278xk4 = this.f40916ck;
                            c12278xk4.f41129kk = i17;
                            c12278xk4.f41132to += (long) (i16 - c12278xk4.f41134x1);
                            c12278xk4.f41134x1 = i16;
                            this.f40926ne = i14;
                            return m57270x1(iM57270x1);
                        }
                        i17--;
                        iM57419k4 |= (this.f40916ck.f41128k4[i16] & 255) << i15;
                        i15 += 8;
                        i16++;
                        iM57270x1 = 0;
                    }
                    int i24 = 65535 & iM57419k4;
                    if ((C12274wl.m57419k4(~iM57419k4, 16) & 65535) != i24) {
                        this.f40932x1 = 9;
                        C12278xk c12278xk5 = this.f40916ck;
                        c12278xk5.f41121c5 = "invalid stored block lengths";
                        this.f40930up = iM57419k4;
                        this.f40919fa = i15;
                        c12278xk5.f41129kk = i17;
                        c12278xk5.f41132to += (long) (i16 - c12278xk5.f41134x1);
                        c12278xk5.f41134x1 = i16;
                        this.f40926ne = i14;
                        return m57270x1(-3);
                    }
                    this.f40923kk = i24;
                    this.f40932x1 = i24 != 0 ? 2 : this.f40922jd != 0 ? 7 : 0;
                    iM57419k4 = 0;
                    i15 = 0;
                    i12 = 1;
                    break;
                    break;
                case 2:
                    if (i17 == 0) {
                        this.f40930up = iM57419k4;
                        this.f40919fa = i15;
                        C12278xk c12278xk6 = this.f40916ck;
                        c12278xk6.f41129kk = i17;
                        c12278xk6.f41132to += (long) (i16 - c12278xk6.f41134x1);
                        c12278xk6.f41134x1 = i16;
                        this.f40926ne = i14;
                        return m57270x1(iM57270x1);
                    }
                    if (i13 == 0) {
                        int i25 = this.f40927rv;
                        if (i14 == i25 && (i3 = this.f40933x6) != 0) {
                            i13 = i3 > 0 ? i3 - 1 : i25;
                            i14 = 0;
                        }
                        if (i13 == 0) {
                            this.f40926ne = i14;
                            int iM57270x12 = m57270x1(iM57270x1);
                            i14 = this.f40926ne;
                            int i26 = this.f40933x6;
                            i13 = i14 < i26 ? (i26 - i14) - 1 : this.f40927rv - i14;
                            int i27 = this.f40927rv;
                            if (i14 == i27 && i26 != 0) {
                                if (i26 > 0) {
                                    i27 = i26 - 1;
                                }
                                i13 = i27;
                                i14 = 0;
                            }
                            if (i13 == 0) {
                                this.f40930up = iM57419k4;
                                this.f40919fa = i15;
                                C12278xk c12278xk7 = this.f40916ck;
                                c12278xk7.f41129kk = i17;
                                c12278xk7.f41132to += (long) (i16 - c12278xk7.f41134x1);
                                c12278xk7.f41134x1 = i16;
                                this.f40926ne = i14;
                                return m57270x1(iM57270x12);
                            }
                        }
                    }
                    int i28 = this.f40923kk;
                    if (i28 > i17) {
                        i28 = i17;
                    }
                    if (i28 > i13) {
                        i28 = i13;
                    }
                    AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) this.f40916ck.f41128k4), i16, AbstractC14092to.m67208k4((Object) this.f40924ks), i14, i28);
                    i16 += i28;
                    i17 -= i28;
                    i14 += i28;
                    i13 -= i28;
                    int i29 = this.f40923kk - i28;
                    this.f40923kk = i29;
                    if (i29 == 0) {
                        this.f40932x1 = this.f40922jd != 0 ? 7 : 0;
                    }
                    iM57270x1 = 0;
                    i12 = 1;
                    break;
                    break;
                case 3:
                    while (i15 < 14) {
                        if (i17 == 0) {
                            this.f40930up = iM57419k4;
                            this.f40919fa = i15;
                            C12278xk c12278xk8 = this.f40916ck;
                            c12278xk8.f41129kk = i17;
                            c12278xk8.f41132to += (long) (i16 - c12278xk8.f41134x1);
                            c12278xk8.f41134x1 = i16;
                            this.f40926ne = i14;
                            return m57270x1(iM57270x1);
                        }
                        i17--;
                        iM57419k4 |= (this.f40916ck.f41128k4[i16] & 255) << i15;
                        i15 += 8;
                        i16++;
                        iM57270x1 = 0;
                    }
                    int i30 = iM57419k4 & 16383;
                    this.f40928to = i30;
                    int i31 = iM57419k4 & 31;
                    if (i31 <= 29 && (i4 = (i30 >> 5) & 31) <= 29) {
                        int i32 = i31 + StyleIdentifier.COLORFUL_LIST_ACCENT_6 + i4;
                        int[] iArr5 = this.f40920h4;
                        if (iArr5 == null || iArr5.length < i32) {
                            this.f40920h4 = new int[i32];
                        } else {
                            for (int i33 = 0; i33 < i32; i33++) {
                                this.f40920h4[i33] = 0;
                            }
                        }
                        iM57419k4 = C12274wl.m57419k4(iM57419k4, 14);
                        i15 -= 14;
                        this.f40917du = 0;
                        i5 = 4;
                        this.f40932x1 = i5;
                        i12 = 1;
                    }
                    break;
                case 4:
                    while (this.f40917du < C12274wl.m57419k4(this.f40928to, 10) + 4) {
                        while (i15 < 3) {
                            if (i17 == 0) {
                                this.f40930up = iM57419k4;
                                this.f40919fa = i15;
                                C12278xk c12278xk9 = this.f40916ck;
                                c12278xk9.f41129kk = i17;
                                c12278xk9.f41132to += (long) (i16 - c12278xk9.f41134x1);
                                c12278xk9.f41134x1 = i16;
                                this.f40926ne = i14;
                                return m57270x1(iM57270x1);
                            }
                            i17--;
                            iM57419k4 |= (this.f40916ck.f41128k4[i16] & 255) << i15;
                            i15 += 8;
                            i16++;
                            iM57270x1 = 0;
                        }
                        int[] iArr6 = this.f40920h4;
                        int[] iArr7 = f40913k4;
                        int i34 = this.f40917du;
                        this.f40917du = i34 + 1;
                        iArr6[iArr7[i34]] = iM57419k4 & 7;
                        iM57419k4 = C12274wl.m57419k4(iM57419k4, 3);
                        i15 -= 3;
                    }
                    while (true) {
                        int i35 = this.f40917du;
                        if (i35 >= 19) {
                            int[] iArr8 = this.f40925m9;
                            iArr8[0] = 7;
                            int iM57540k4 = this.f40931uz.m57540k4(this.f40920h4, iArr8, this.f40918dy, this.f40934yj, this.f40916ck);
                            if (iM57540k4 != 0) {
                                if (iM57540k4 == -3) {
                                    this.f40920h4 = null;
                                    this.f40932x1 = 9;
                                }
                                this.f40930up = iM57419k4;
                                this.f40919fa = i15;
                                C12278xk c12278xk10 = this.f40916ck;
                                c12278xk10.f41129kk = i17;
                                c12278xk10.f41132to += (long) (i16 - c12278xk10.f41134x1);
                                c12278xk10.f41134x1 = i16;
                                this.f40926ne = i14;
                                return m57270x1(iM57540k4);
                            }
                            this.f40917du = 0;
                            i5 = 5;
                            this.f40932x1 = i5;
                            i12 = 1;
                        } else {
                            int[] iArr9 = this.f40920h4;
                            int[] iArr10 = f40913k4;
                            this.f40917du = i35 + 1;
                            iArr9[iArr10[i35]] = 0;
                        }
                        break;
                    }
                    break;
                case 5:
                    while (true) {
                        int i36 = this.f40928to;
                        int i37 = i20;
                        int i38 = i21;
                        if (this.f40917du >= (i36 & 31) + StyleIdentifier.COLORFUL_LIST_ACCENT_6 + ((i36 >> 5) & 31)) {
                            this.f40918dy[i38] = -1;
                            int[] iArr11 = {i19};
                            int[] iArr12 = {i18};
                            int[] iArr13 = new int[i12];
                            int[] iArr14 = new int[i12];
                            int i39 = i12;
                            int iM57539k4 = this.f40931uz.m57539k4((i36 & 31) + 257, ((i36 >> 5) & 31) + 1, this.f40920h4, iArr11, iArr12, iArr13, iArr14, this.f40934yj, this.f40916ck);
                            if (iM57539k4 != 0) {
                                if (iM57539k4 == -3) {
                                    this.f40920h4 = null;
                                    this.f40932x1 = 9;
                                }
                                this.f40930up = iM57419k4;
                                this.f40919fa = i15;
                                C12278xk c12278xk11 = this.f40916ck;
                                c12278xk11.f41129kk = i17;
                                c12278xk11.f41132to += (long) (i16 - c12278xk11.f41134x1);
                                c12278xk11.f41134x1 = i16;
                                this.f40926ne = i14;
                                return m57270x1(iM57539k4);
                            }
                            C12266rv c12266rv = this.f40915c5;
                            int i40 = iArr11[i38];
                            int i41 = iArr12[i38];
                            int[] iArr15 = this.f40934yj;
                            c12266rv.m57382k4(i40, i41, iArr15, iArr13[i38], iArr15, iArr14[i38]);
                            this.f40932x1 = 6;
                            i12 = i39;
                        } else {
                            int i42 = i12;
                            int i43 = this.f40925m9[i38];
                            while (i15 < i43) {
                                if (i17 == 0) {
                                    this.f40930up = iM57419k4;
                                    this.f40919fa = i15;
                                    C12278xk c12278xk12 = this.f40916ck;
                                    c12278xk12.f41129kk = i17;
                                    c12278xk12.f41132to += (long) (i16 - c12278xk12.f41134x1);
                                    c12278xk12.f41134x1 = i16;
                                    this.f40926ne = i14;
                                    return m57270x1(iM57270x1);
                                }
                                i17--;
                                iM57419k4 |= (this.f40916ck.f41128k4[i16] & 255) << i15;
                                i15 += 8;
                                i16++;
                                iM57270x1 = i38;
                            }
                            int[] iArr16 = this.f40934yj;
                            int i44 = this.f40918dy[i38];
                            int[] iArr17 = f40914wl;
                            int i45 = iArr16[Oooo0.OooO00o(i44, iArr17[i43] & iM57419k4, 3, i42)];
                            int i46 = iArr16[Oooo0.OooO00o(i44, iArr17[i45] & iM57419k4, 3, 2)];
                            if (i46 < 16) {
                                iM57419k4 = C12274wl.m57419k4(iM57419k4, i45);
                                i15 -= i45;
                                int[] iArr18 = this.f40920h4;
                                int i47 = this.f40917du;
                                this.f40917du = i47 + 1;
                                iArr18[i47] = i46;
                            } else {
                                int i48 = i46 == 18 ? i37 : i46 - 14;
                                int i49 = i46 == 18 ? 11 : 3;
                                while (i15 < i45 + i48) {
                                    if (i17 == 0) {
                                        this.f40930up = iM57419k4;
                                        this.f40919fa = i15;
                                        C12278xk c12278xk13 = this.f40916ck;
                                        c12278xk13.f41129kk = i17;
                                        c12278xk13.f41132to += (long) (i16 - c12278xk13.f41134x1);
                                        c12278xk13.f41134x1 = i16;
                                        this.f40926ne = i14;
                                        return m57270x1(iM57270x1);
                                    }
                                    i17--;
                                    iM57419k4 |= (this.f40916ck.f41128k4[i16] & 255) << i15;
                                    i15 += 8;
                                    i16++;
                                    iM57270x1 = i38;
                                }
                                int iM57419k44 = C12274wl.m57419k4(iM57419k4, i45);
                                int i50 = i49 + (f40914wl[i48] & iM57419k44);
                                iM57419k4 = C12274wl.m57419k4(iM57419k44, i48);
                                i15 = (i15 - i45) - i48;
                                int i51 = this.f40917du;
                                int i52 = this.f40928to;
                                if (i51 + i50 > (i52 & 31) + StyleIdentifier.COLORFUL_LIST_ACCENT_6 + ((i52 >> 5) & 31) || (i46 == 16 && i51 < 1)) {
                                    break;
                                } else {
                                    int i53 = i46 == 16 ? this.f40920h4[i51 - 1] : i38;
                                    while (true) {
                                        int i54 = i51 + 1;
                                        this.f40920h4[i51] = i53;
                                        i50--;
                                        if (i50 == 0) {
                                            this.f40917du = i54;
                                        } else {
                                            i51 = i54;
                                        }
                                    }
                                }
                            }
                            i20 = i37;
                            i21 = i38;
                            i12 = 1;
                            i19 = 9;
                            i18 = 6;
                        }
                        break;
                    }
                    break;
                case 6:
                    this.f40930up = iM57419k4;
                    this.f40919fa = i15;
                    C12278xk c12278xk14 = this.f40916ck;
                    c12278xk14.f41129kk = i17;
                    c12278xk14.f41132to += (long) (i16 - c12278xk14.f41134x1);
                    c12278xk14.f41134x1 = i16;
                    this.f40926ne = i14;
                    int iM57381k4 = this.f40915c5.m57381k4(this, iM57270x1);
                    if (iM57381k4 != i12) {
                        return m57270x1(iM57381k4);
                    }
                    C12278xk c12278xk15 = this.f40916ck;
                    i16 = c12278xk15.f41134x1;
                    i17 = c12278xk15.f41129kk;
                    iM57419k4 = this.f40930up;
                    i15 = this.f40919fa;
                    i14 = this.f40926ne;
                    int i55 = this.f40933x6;
                    i13 = i14 < i55 ? (i55 - i14) - i12 : this.f40927rv - i14;
                    if (this.f40922jd == 0) {
                        this.f40932x1 = 0;
                    } else {
                        this.f40932x1 = 7;
                    }
                    iM57270x1 = 0;
                    break;
                    break;
                case 7:
                    this.f40926ne = i14;
                    iM57270x1 = m57270x1(iM57270x1);
                    i14 = this.f40926ne;
                    int i56 = this.f40933x6;
                    int i57 = i14 < i56 ? (i56 - i14) - i12 : this.f40927rv - i14;
                    if (i56 != i14) {
                        this.f40930up = iM57419k4;
                        this.f40919fa = i15;
                        C12278xk c12278xk16 = this.f40916ck;
                        c12278xk16.f41129kk = i17;
                        c12278xk16.f41132to += (long) (i16 - c12278xk16.f41134x1);
                        c12278xk16.f41134x1 = i16;
                        this.f40926ne = i14;
                        return m57270x1(iM57270x1);
                    }
                    this.f40932x1 = 8;
                    i13 = i57;
                    break;
                    break;
                case 8:
                    this.f40930up = iM57419k4;
                    this.f40919fa = i15;
                    C12278xk c12278xk17 = this.f40916ck;
                    c12278xk17.f41129kk = i17;
                    c12278xk17.f41132to += (long) (i16 - c12278xk17.f41134x1);
                    c12278xk17.f41134x1 = i16;
                    this.f40926ne = i14;
                    return m57270x1(i12);
                case 9:
                    this.f40930up = iM57419k4;
                    this.f40919fa = i15;
                    C12278xk c12278xk18 = this.f40916ck;
                    c12278xk18.f41129kk = i17;
                    c12278xk18.f41132to += (long) (i16 - c12278xk18.f41134x1);
                    c12278xk18.f41134x1 = i16;
                    this.f40926ne = i14;
                    return m57270x1(-3);
                default:
                    this.f40930up = iM57419k4;
                    this.f40919fa = i15;
                    C12278xk c12278xk19 = this.f40916ck;
                    c12278xk19.f41129kk = i17;
                    c12278xk19.f41132to += (long) (i16 - c12278xk19.f41134x1);
                    c12278xk19.f41134x1 = i16;
                    this.f40926ne = i14;
                    return m57270x1(-2);
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final int m57270x1(int i) {
        C12278xk c12278xk = this.f40916ck;
        int i2 = c12278xk.f41126h4;
        int i3 = this.f40933x6;
        int i4 = this.f40926ne;
        if (i3 > i4) {
            i4 = this.f40927rv;
        }
        int i5 = i4 - i3;
        int i6 = c12278xk.f41131m9;
        if (i5 > i6) {
            i5 = i6;
        }
        if (i == -5) {
            i = 0;
        }
        c12278xk.f41131m9 = i6 - i5;
        c12278xk.f41124dy += (long) i5;
        if (this.f40921ix != null) {
            long jM57519k4 = C12276x1.m57519k4(this.f40929u4, this.f40924ks, i3, i5);
            this.f40929u4 = jM57519k4;
            this.f40916ck.f41125fa = jM57519k4;
        }
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) this.f40924ks), i3, AbstractC14092to.m67208k4((Object) this.f40916ck.f41123du), i2, i5);
        int i7 = i2 + i5;
        int i8 = i3 + i5;
        int i9 = this.f40927rv;
        if (i8 == i9) {
            if (this.f40926ne == i9) {
                this.f40926ne = 0;
            }
            int i10 = this.f40926ne;
            C12278xk c12278xk2 = this.f40916ck;
            int i11 = c12278xk2.f41131m9;
            if (i10 > i11) {
                i10 = i11;
            }
            if (i10 != 0 && i == -5) {
                i = 0;
            }
            c12278xk2.f41131m9 = i11 - i10;
            c12278xk2.f41124dy += (long) i10;
            if (this.f40921ix != null) {
                long jM57519k42 = C12276x1.m57519k4(this.f40929u4, this.f40924ks, 0, i10);
                this.f40929u4 = jM57519k42;
                this.f40916ck.f41125fa = jM57519k42;
            }
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) this.f40924ks), 0, AbstractC14092to.m67208k4((Object) this.f40916ck.f41123du), i7, i10);
            i7 += i10;
            i8 = i10;
        }
        this.f40916ck.f41126h4 = i7;
        this.f40933x6 = i8;
        return i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57268k4() {
        m57269k4((long[]) null);
        this.f40924ks = null;
        this.f40934yj = null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m57269k4(long[] jArr) {
        if (jArr != null) {
            jArr[0] = this.f40929u4;
        }
        this.f40932x1 = 0;
        this.f40919fa = 0;
        this.f40930up = 0;
        this.f40926ne = 0;
        this.f40933x6 = 0;
        if (this.f40921ix != null) {
            long jM57519k4 = C12276x1.m57519k4(0L, null, 0, 0);
            this.f40929u4 = jM57519k4;
            this.f40916ck.f41125fa = jM57519k4;
        }
    }
}
