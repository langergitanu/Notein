package com.aspose.slides.internal.p077d8;

import androidx.core.graphics.OooO00o;
import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.gk */
/* JADX INFO: loaded from: classes3.dex */
public class C3055gk {

    /* JADX INFO: renamed from: k4 */
    private static final C11697x1 f9078k4 = C11697x1.m55250kk();

    /* JADX INFO: renamed from: kk */
    private char f9079kk;

    /* JADX INFO: renamed from: x1 */
    private int f9080x1;

    /* JADX INFO: renamed from: k4 */
    private double m12931k4(double d) {
        return C14116yg.m67497to(d * ((double) this.f9080x1)) / ((double) this.f9080x1);
    }

    /* JADX INFO: renamed from: kk */
    private String m12938kk(double d) {
        return d < 0.0d ? C14044b3.m66432k4(d, (InterfaceC14073kp) f9078k4) : C14113y2.m67408k4(" ", C14044b3.m66432k4(d, (InterfaceC14073kp) f9078k4));
    }

    /* JADX INFO: renamed from: x1 */
    private String m12939x1(double d) {
        return C14044b3.m66432k4(d, (InterfaceC14073kp) f9078k4);
    }

    /* JADX INFO: renamed from: k4 */
    private static float m12932k4(C12025x6 c12025x6, C12025x6 c12025x62) {
        float fM56897x1 = c12025x6.m56897x1() - c12025x62.m56897x1();
        float fM56895kk = c12025x6.m56895kk() - c12025x62.m56895kk();
        return (fM56895kk * fM56895kk) + (fM56897x1 * fM56897x1);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02d6 A[SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C6765kp m12933k4(byte[] bArr, C12025x6[] c12025x6Arr, int i, int i2) {
        C6765kp c6765kp;
        double dM12931k4;
        double dM12931k42;
        char c;
        C6765kp c6765kp2 = new C6765kp();
        this.f9079kk = '*';
        double dM12931k43 = 0.0d;
        int i3 = i;
        double dM12931k44 = 0.0d;
        while (i3 < i2) {
            int i4 = bArr[i3] & 31;
            if (i4 != 0) {
                if (i4 == 1) {
                    c6765kp = c6765kp2;
                    dM12931k44 = m12931k4(c12025x6Arr[i3].m56897x1());
                    dM12931k43 = m12931k4(c12025x6Arr[i3].m56895kk());
                    i3++;
                    String strM67408k4 = this.f9079kk == 'L' ? C14113y2.m67408k4(m12938kk(dM12931k44), m12938kk(dM12931k43)) : C14113y2.m67402k4("L{0}{1}", m12939x1(dM12931k44), m12938kk(dM12931k43));
                    String strM67408k42 = this.f9079kk == 'l' ? C14113y2.m67408k4(m12938kk(dM12931k44), m12938kk(dM12931k43)) : C14113y2.m67402k4("l{0}{1}", m12939x1(dM12931k44), m12938kk(dM12931k43));
                    if (strM67408k4.length() <= strM67408k42.length()) {
                        c6765kp.m26792k4(strM67408k4);
                        this.f9079kk = 'L';
                    } else {
                        c6765kp.m26792k4(strM67408k42);
                        this.f9079kk = 'l';
                    }
                } else if (i4 == 2) {
                    c6765kp = c6765kp2;
                    double dM12931k45 = m12931k4(c12025x6Arr[i3].m56897x1());
                    double dM12931k46 = m12931k4(c12025x6Arr[i3].m56895kk());
                    int i5 = i3 + 1;
                    dM12931k4 = m12931k4(c12025x6Arr[i5].m56897x1());
                    dM12931k42 = m12931k4(c12025x6Arr[i5].m56895kk());
                    String strM67402k4 = this.f9079kk == 'Q' ? C14113y2.m67402k4("{0}{1}{2}{3}", m12938kk(dM12931k45), m12938kk(dM12931k46), m12938kk(dM12931k4), m12938kk(dM12931k42)) : C14113y2.m67402k4("Q{0}{1}{2}{3}", m12939x1(dM12931k45), m12938kk(dM12931k46), m12938kk(dM12931k4), m12938kk(dM12931k42));
                    String strM67402k42 = this.f9079kk == 'q' ? C14113y2.m67402k4("{0}{1}{2}{3}", m12938kk(dM12931k45), m12938kk(dM12931k46), m12938kk(dM12931k4), m12938kk(dM12931k42)) : C14113y2.m67402k4("q{0}{1}{2}{3}", m12939x1(dM12931k45), m12938kk(dM12931k46), m12938kk(dM12931k4), m12938kk(dM12931k42));
                    if (strM67402k4.length() <= strM67402k42.length()) {
                        c6765kp.m26792k4(strM67402k4);
                        this.f9079kk = 'Q';
                    } else {
                        c6765kp.m26792k4(strM67402k42);
                        this.f9079kk = 'q';
                    }
                    i3 += 4;
                } else if (i4 != 3) {
                    c6765kp = c6765kp2;
                } else {
                    double dM12931k47 = m12931k4(c12025x6Arr[i3].m56897x1());
                    double dM12931k48 = m12931k4(c12025x6Arr[i3].m56895kk());
                    int i6 = i3 + 1;
                    double dM12931k49 = m12931k4(c12025x6Arr[i6].m56897x1());
                    double dM12931k410 = m12931k4(c12025x6Arr[i6].m56895kk());
                    int i7 = i3 + 2;
                    double dM12931k411 = m12931k4(c12025x6Arr[i7].m56897x1());
                    double dM12931k412 = m12931k4(c12025x6Arr[i7].m56895kk());
                    int i8 = i3 + 3;
                    C6765kp c6765kp3 = c6765kp2;
                    String strM67402k43 = this.f9079kk == 'C' ? C14113y2.m67402k4("{0}{1}{2}{3}{4}{5}", m12938kk(dM12931k47), m12938kk(dM12931k48), m12938kk(dM12931k49), m12938kk(dM12931k410), m12938kk(dM12931k411), m12938kk(dM12931k412)) : C14113y2.m67402k4("C{0}{1}{2}{3}{4}{5}", m12939x1(dM12931k47), m12938kk(dM12931k48), m12938kk(dM12931k49), m12938kk(dM12931k410), m12938kk(dM12931k411), m12938kk(dM12931k412));
                    String strM67402k44 = this.f9079kk == 'c' ? C14113y2.m67402k4("{0}{1}{2}{3}{4}{5}", m12938kk(dM12931k47), m12938kk(dM12931k48), m12938kk(dM12931k49), m12938kk(dM12931k410), m12938kk(dM12931k411), m12938kk(dM12931k412)) : C14113y2.m67402k4("c{0}{1}{2}{3}{4}{5}", m12939x1(dM12931k47), m12938kk(dM12931k48), m12938kk(dM12931k49), m12938kk(dM12931k410), m12938kk(dM12931k411), m12938kk(dM12931k412));
                    c6765kp = c6765kp3;
                    if (strM67402k43.length() <= strM67402k44.length()) {
                        c6765kp.m26792k4(strM67402k43);
                        this.f9079kk = 'C';
                    } else {
                        c6765kp.m26792k4(strM67402k44);
                        this.f9079kk = 'c';
                    }
                    i3 = i8;
                    dM12931k43 = dM12931k412;
                    dM12931k44 = dM12931k411;
                }
                if ((bArr[i3 - 1] & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    c6765kp.m26792k4("z");
                    this.f9079kk = 'z';
                }
                c6765kp2 = c6765kp;
            } else {
                c6765kp = c6765kp2;
                dM12931k4 = m12931k4(c12025x6Arr[i3].m56897x1());
                dM12931k42 = m12931k4(c12025x6Arr[i3].m56895kk());
                i3++;
                String strM67402k45 = C14113y2.m67402k4("M{0}{1}", m12939x1(dM12931k4), m12938kk(dM12931k42));
                String strM67402k46 = C14113y2.m67402k4("m{0}{1}", m12939x1(dM12931k4 - dM12931k44), m12938kk(dM12931k42 - dM12931k43));
                if (strM67402k45.length() <= strM67402k46.length()) {
                    c6765kp.m26792k4(strM67402k45);
                    c = 'M';
                } else {
                    c6765kp.m26792k4(strM67402k46);
                    c = 'm';
                }
                this.f9079kk = c;
            }
            dM12931k44 = dM12931k4;
            dM12931k43 = dM12931k42;
            if ((bArr[i3 - 1] & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
            }
            c6765kp2 = c6765kp;
        }
        return c6765kp2;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12007ix m12934k4(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        while (i5 < str.length() && str.charAt(i5) <= ' ') {
            i5++;
        }
        if (i5 >= str.length() || !(str.charAt(i5) == '-' || str.charAt(i5) == '+')) {
            i = i5;
        } else {
            i = i5 + 1;
            while (i < str.length() && str.charAt(i) <= ' ') {
                i++;
            }
        }
        while (i < str.length() && ((str.charAt(i) >= '0' && str.charAt(i) <= '9') || str.charAt(i) == '.')) {
            i++;
        }
        float fM66705k4 = i5 != i ? C14064he.m66705k4(C14113y2.m67443x1(str, i5, i - i5)) : 0.0f;
        while (i < str.length() && str.charAt(i) <= ' ') {
            i++;
        }
        if (i < str.length() && str.charAt(i) == ',') {
            i++;
        }
        while (i < str.length() && str.charAt(i) <= ' ') {
            i++;
        }
        if (i >= str.length() || !(str.charAt(i) == '-' || str.charAt(i) == '+')) {
            i2 = i;
        } else {
            i2 = i + 1;
            while (i2 < str.length() && str.charAt(i2) <= ' ') {
                i2++;
            }
        }
        while (i2 < str.length() && ((str.charAt(i2) >= '0' && str.charAt(i2) <= '9') || str.charAt(i2) == '.')) {
            i2++;
        }
        float fM66705k42 = i != i2 ? C14064he.m66705k4(C14113y2.m67443x1(str, i, i2 - i)) : 0.0f;
        while (i2 < str.length() && str.charAt(i2) <= ' ') {
            i2++;
        }
        if (i2 < str.length() && str.charAt(i2) == ',') {
            i2++;
        }
        while (i2 < str.length() && str.charAt(i2) <= ' ') {
            i2++;
        }
        if (i2 >= str.length() || !(str.charAt(i2) == '-' || str.charAt(i2) == '+')) {
            i3 = i2;
        } else {
            i3 = i2 + 1;
            while (i3 < str.length() && str.charAt(i3) <= ' ') {
                i3++;
            }
        }
        while (i3 < str.length() && ((str.charAt(i3) >= '0' && str.charAt(i3) <= '9') || str.charAt(i3) == '.')) {
            i3++;
        }
        float fM66705k43 = i2 != i3 ? C14064he.m66705k4(C14113y2.m67443x1(str, i2, i3 - i2)) : 0.0f;
        while (i3 < str.length() && str.charAt(i3) <= ' ') {
            i3++;
        }
        if (i3 < str.length() && str.charAt(i3) == ',') {
            i3++;
        }
        while (i3 < str.length() && str.charAt(i3) <= ' ') {
            i3++;
        }
        if (i3 >= str.length() || !(str.charAt(i3) == '-' || str.charAt(i3) == '+')) {
            i4 = i3;
        } else {
            i4 = i3 + 1;
            while (i4 < str.length() && str.charAt(i4) <= ' ') {
                i4++;
            }
        }
        while (i4 < str.length() && ((str.charAt(i4) >= '0' && str.charAt(i4) <= '9') || str.charAt(i4) == '.')) {
            i4++;
        }
        return new C12007ix(fM66705k4, fM66705k42, fM66705k43, i3 != i4 ? C14064he.m66705k4(C14113y2.m67443x1(str, i3, i4 - i3)) : 0.0f);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m12935k4(C11896dy c11896dy, C6765kp c6765kp, C6765kp c6765kp2) {
        m12937k4(c11896dy, c6765kp, c6765kp2, 0.0f, 0.0f, 0.0f, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:213:0x1022  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x102a  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m12936k4(C11896dy c11896dy, C6765kp c6765kp, C6765kp c6765kp2, float f, float f2, float f3) {
        float f4;
        boolean z;
        int i;
        float f5;
        byte b;
        byte b2;
        int i2;
        float f6;
        byte[] bArr;
        C6765kp c6765kpM12933k4;
        byte[] bArr2;
        int i3;
        C12025x6[] c12025x6Arr;
        int i4;
        float f7;
        byte[] bArr3;
        byte b3;
        float f8;
        float f9 = f;
        float f10 = f2;
        if (c11896dy.m55525du() == 0) {
            return;
        }
        byte[] bArrM55571to = c11896dy.m55571to();
        C12025x6[] c12025x6ArrM55565kk = c11896dy.m55565kk();
        byte b4 = 0;
        int i5 = 4;
        boolean z2 = ((double) (C14116yg.m67480k4(f10) + C14116yg.m67480k4(f9))) < 0.01d;
        float f11 = f3 / (f3 < 16.0f ? 2.0f : 4.0f);
        float f12 = 0.0f;
        if (f9 > 0.0f) {
            float f13 = f9 + f11;
            f4 = f13 * f13;
        } else {
            f4 = 0.0f;
        }
        if (f10 > 0.0f) {
            float f14 = f10 + f11;
            f12 = f14 * f14;
        }
        int i6 = 5;
        int iM55525du = c11896dy.m55525du();
        int i7 = 0;
        byte b5 = 1;
        while (i7 < bArrM55571to.length) {
            int i8 = i7;
            byte b6 = b4;
            while (true) {
                if (i8 >= iM55525du || b6 != 0) {
                    break;
                }
                byte b7 = bArrM55571to[i8];
                if ((b7 & 31) != 0 || i8 <= i7) {
                    int i9 = b7 & 31;
                    boolean z3 = z2;
                    i8 = i9 != 2 ? i9 != 3 ? i8 + 1 : i8 + 3 : i8 + 2;
                    if ((bArrM55571to[i8 - 1] & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                        b6 = b5;
                    }
                    z2 = z3;
                } else if ((b7 & 255) == 0) {
                    z = z2;
                    b6 = b5;
                }
            }
            z = z2;
            if (i8 > iM55525du) {
                i8 = iM55525du;
            }
            if (b6 != 0 || z) {
                i = iM55525du;
                f5 = f11;
                b = b6;
                b2 = b4;
                i2 = i5;
                f6 = f4;
                bArr = bArrM55571to;
            } else {
                byte b8 = b5;
                if (i8 - i7 == b8) {
                    i = iM55525du;
                    b5 = b8;
                    b = b6;
                    bArr = bArrM55571to;
                    b2 = b4;
                    i2 = i5;
                    f5 = f11;
                    f6 = f4;
                } else {
                    int i10 = i7 + 1;
                    int i11 = i8 - 1;
                    i = iM55525du;
                    double dM56897x1 = c12025x6ArrM55565kk[i7].m56897x1();
                    double dM56895kk = c12025x6ArrM55565kk[i7].m56895kk();
                    double dM56897x12 = c12025x6ArrM55565kk[i11].m56897x1();
                    double dM56895kk2 = c12025x6ArrM55565kk[i11].m56895kk();
                    byte b9 = ((double) f9) < 1.0E-4d ? (byte) 1 : b4;
                    double d = -1.0d;
                    int i12 = i10;
                    double d2 = -1.0d;
                    while (true) {
                        b = b6;
                        if (i12 >= i8 || b9 != 0) {
                            break;
                        }
                        int i13 = bArrM55571to[i12] & 31;
                        if (i13 != 2) {
                            if (i13 == 3) {
                                if (m12932k4(c12025x6ArrM55565kk[i7].Clone(), c12025x6ArrM55565kk[i12].Clone()) > f4 || m12932k4(c12025x6ArrM55565kk[i7].Clone(), c12025x6ArrM55565kk[i12 + 1].Clone()) > f4 || m12932k4(c12025x6ArrM55565kk[i7].Clone(), c12025x6ArrM55565kk[i12 + 2].Clone()) > f4) {
                                    int i14 = i12 - 1;
                                    double dM56897x13 = ((double) c12025x6ArrM55565kk[i14].m56897x1()) - dM56897x1;
                                    double dM56895kk3 = ((double) c12025x6ArrM55565kk[i14].m56895kk()) - dM56895kk;
                                    double dM56897x14 = ((double) c12025x6ArrM55565kk[i12].m56897x1()) - dM56897x1;
                                    double dM56895kk4 = ((double) c12025x6ArrM55565kk[i12].m56895kk()) - dM56895kk;
                                    int i15 = i12 + 1;
                                    double dM56897x15 = ((double) c12025x6ArrM55565kk[i15].m56897x1()) - dM56897x1;
                                    double dM56895kk5 = ((double) c12025x6ArrM55565kk[i15].m56895kk()) - dM56895kk;
                                    int i16 = i12 + 2;
                                    double dM56897x16 = ((double) c12025x6ArrM55565kk[i16].m56897x1()) - dM56897x1;
                                    double dM56895kk6 = ((double) c12025x6ArrM55565kk[i16].m56895kk()) - dM56895kk;
                                    double d3 = ((dM56897x14 * 3.0d) + (dM56897x16 - (dM56897x15 * 3.0d))) - dM56897x13;
                                    double d4 = ((dM56897x15 - (dM56897x14 * 2.0d)) + dM56897x13) * 3.0d;
                                    double d5 = (dM56897x14 - dM56897x13) * 3.0d;
                                    double d6 = ((dM56895kk4 * 3.0d) + (dM56895kk6 - (dM56895kk5 * 3.0d))) - dM56895kk3;
                                    double d7 = ((dM56895kk5 - (dM56895kk4 * 2.0d)) + dM56895kk3) * 3.0d;
                                    double d8 = (dM56895kk4 - dM56895kk3) * 3.0d;
                                    double d9 = ((dM56895kk3 * dM56895kk3) + (dM56897x13 * dM56897x13)) - ((double) f4);
                                    double dOooO00o = OooO00o.OooO00o(dM56895kk3, d8, dM56897x13 * d5, 2.0d);
                                    double d10 = (d8 * d8) + (((dM56895kk3 * d7) + (dM56897x13 * d4)) * 2.0d) + (d5 * d5);
                                    double dOooO00o2 = OooO00o.OooO00o(d8, d7, (d6 * dM56895kk3) + (d5 * d4) + (dM56897x13 * d3), 2.0d);
                                    double d11 = (d7 * d7) + (((d8 * d6) + (d5 * d3)) * 2.0d) + (d4 * d4);
                                    double dOooO00o3 = OooO00o.OooO00o(d6, d7, d3 * d4, 2.0d);
                                    double[] dArr = new double[7];
                                    dArr[b4] = d9;
                                    dArr[1] = dOooO00o;
                                    dArr[2] = d10;
                                    dArr[3] = dOooO00o2;
                                    dArr[i5] = d11;
                                    dArr[i6] = dOooO00o3;
                                    dArr[6] = (d6 * d6) + (d3 * d3);
                                    double[] dArrM12926k4 = C3054gi.m12926k4(dArr, 0.0d, 1.0d);
                                    if (dArrM12926k4.length > 0) {
                                        d2 = dArrM12926k4[b4];
                                        b9 = 1;
                                    }
                                }
                                i12 += 3;
                            } else if (m12932k4(c12025x6ArrM55565kk[i7].Clone(), c12025x6ArrM55565kk[i12].Clone()) > f4) {
                                int i17 = i12 - 1;
                                double dM56897x17 = ((double) c12025x6ArrM55565kk[i17].m56897x1()) - dM56897x1;
                                double dM56895kk7 = ((double) c12025x6ArrM55565kk[i17].m56895kk()) - dM56895kk;
                                double dM56897x18 = (((double) c12025x6ArrM55565kk[i12].m56897x1()) - dM56897x1) - dM56897x17;
                                double dM56895kk8 = (((double) c12025x6ArrM55565kk[i12].m56895kk()) - dM56895kk) - dM56895kk7;
                                double d12 = (dM56897x18 + dM56895kk8) * 2.0d;
                                double d13 = (dM56895kk8 * dM56895kk8) + (dM56897x18 * dM56897x18);
                                double dM67496rv = C14116yg.m67496rv((d12 * d12) - ((((dM56895kk7 * dM56895kk7) + (dM56897x17 * dM56897x17)) - ((double) f4)) * (4.0d * d13)));
                                double d14 = -d12;
                                d2 = ((d14 - dM67496rv) / 2.0d) / d13;
                                double d15 = ((d14 + dM67496rv) / 2.0d) / d13;
                                if (d2 < 0.0d || d2 > 1.0d) {
                                    d2 = d15;
                                }
                                b6 = b;
                                b9 = 1;
                            } else {
                                i12++;
                            }
                            b6 = b;
                        } else {
                            if (m12932k4(c12025x6ArrM55565kk[i7].Clone(), c12025x6ArrM55565kk[i12].Clone()) <= f4 && m12932k4(c12025x6ArrM55565kk[i7].Clone(), c12025x6ArrM55565kk[i12 + 1].Clone()) <= f4) {
                                i12 += 2;
                                b6 = b;
                            }
                            int i18 = i12 - 1;
                            double dM56897x19 = ((double) c12025x6ArrM55565kk[i18].m56897x1()) - dM56897x1;
                            double dM56895kk9 = ((double) c12025x6ArrM55565kk[i18].m56895kk()) - dM56895kk;
                            double dM56897x110 = ((double) c12025x6ArrM55565kk[i12].m56897x1()) - dM56897x1;
                            double dM56895kk10 = ((double) c12025x6ArrM55565kk[i12].m56895kk()) - dM56895kk;
                            int i19 = i12 + 1;
                            double dM56897x111 = (dM56897x19 - (dM56897x110 * 2.0d)) + (((double) c12025x6ArrM55565kk[i19].m56897x1()) - dM56897x1);
                            double d16 = (dM56897x110 - dM56897x19) * 2.0d;
                            double dM56895kk11 = (dM56895kk9 - (dM56895kk10 * 2.0d)) + (((double) c12025x6ArrM55565kk[i19].m56895kk()) - dM56895kk);
                            double d17 = (dM56895kk10 - dM56895kk9) * 2.0d;
                            double d18 = ((dM56895kk9 * dM56895kk9) + (dM56897x19 * dM56897x19)) - ((double) f4);
                            double d19 = dM56895kk9 * d17;
                            double d20 = ((dM56897x19 * d16) + d19) * 2.0d;
                            double d21 = (d17 * d17) + (((dM56897x19 * dM56897x111) + d19) * 2.0d) + (d16 * d16);
                            double dOooO00o4 = OooO00o.OooO00o(dM56895kk11, d17, d16 * dM56897x111, 2.0d);
                            double[] dArr2 = new double[i6];
                            dArr2[b4] = d18;
                            dArr2[1] = d20;
                            dArr2[2] = d21;
                            dArr2[3] = dOooO00o4;
                            dArr2[i5] = (dM56895kk11 * dM56895kk11) + (dM56897x111 * dM56897x111);
                            byte[] bArr4 = bArrM55571to;
                            C12025x6[] c12025x6Arr2 = c12025x6ArrM55565kk;
                            double[] dArrM12926k42 = C3054gi.m12926k4(dArr2, 0.0d, 1.0d);
                            if (dArrM12926k42.length > 0) {
                                d2 = dArrM12926k42[b4];
                                b9 = 1;
                            } else {
                                i12 += 2;
                            }
                            b6 = b;
                            bArrM55571to = bArr4;
                            c12025x6ArrM55565kk = c12025x6Arr2;
                            i6 = 5;
                        }
                    }
                    byte[] bArr5 = bArrM55571to;
                    C12025x6[] c12025x6Arr3 = c12025x6ArrM55565kk;
                    byte b10 = ((double) f10) < 1.0E-4d ? (byte) 1 : b4;
                    int i20 = i11;
                    while (i7 < i20 && b10 == 0) {
                        int i21 = bArr5[i20] & 31;
                        if (i21 == 2) {
                            bArr3 = bArr5;
                            b3 = b10;
                            f8 = f12;
                            int i22 = i20 - 1;
                            if (m12932k4(c12025x6Arr3[i11].Clone(), c12025x6Arr3[i22].Clone()) > f8 || m12932k4(c12025x6Arr3[i11].Clone(), c12025x6Arr3[i20 - 2].Clone()) > f8) {
                                double dM56897x112 = ((double) c12025x6Arr3[i20].m56897x1()) - dM56897x12;
                                f12 = f8;
                                double dM56895kk12 = ((double) c12025x6Arr3[i20].m56895kk()) - dM56895kk2;
                                double dM56897x113 = ((double) c12025x6Arr3[i22].m56897x1()) - dM56897x12;
                                double dM56895kk13 = ((double) c12025x6Arr3[i22].m56895kk()) - dM56895kk2;
                                int i23 = i20 - 2;
                                double dM56897x114 = (dM56897x112 - (dM56897x113 * 2.0d)) + (((double) c12025x6Arr3[i23].m56897x1()) - dM56897x12);
                                double d22 = (dM56897x113 - dM56897x112) * 2.0d;
                                double dM56895kk14 = (dM56895kk12 - (dM56895kk13 * 2.0d)) + (((double) c12025x6Arr3[i23].m56895kk()) - dM56895kk2);
                                double d23 = (dM56895kk13 - dM56895kk12) * 2.0d;
                                double d24 = ((dM56895kk12 * dM56895kk12) + (dM56897x112 * dM56897x112)) - ((double) f12);
                                double d25 = dM56895kk12 * d23;
                                double d26 = ((dM56897x112 * d22) + d25) * 2.0d;
                                double d27 = (d23 * d23) + (((dM56897x112 * dM56897x114) + d25) * 2.0d) + (d22 * d22);
                                double dOooO00o5 = OooO00o.OooO00o(dM56895kk14, d23, dM56897x114 * d22, 2.0d);
                                double[] dArr3 = new double[5];
                                dArr3[b4] = d24;
                                dArr3[1] = d26;
                                dArr3[2] = d27;
                                dArr3[3] = dOooO00o5;
                                dArr3[i5] = (dM56895kk14 * dM56895kk14) + (dM56897x114 * dM56897x114);
                                C12025x6[] c12025x6Arr4 = c12025x6Arr3;
                                double[] dArrM12926k43 = C3054gi.m12926k4(dArr3, 0.0d, 1.0d);
                                if (dArrM12926k43.length > 0) {
                                    d = dArrM12926k43[b4];
                                    b10 = 1;
                                } else {
                                    i20 -= 2;
                                    b10 = b3;
                                }
                                bArr5 = bArr3;
                                c12025x6Arr3 = c12025x6Arr4;
                            } else {
                                i20 -= 2;
                                f12 = f8;
                                bArr5 = bArr3;
                                b10 = b3;
                            }
                        } else if (i21 != 3) {
                            int i24 = i20 - 1;
                            if (m12932k4(c12025x6Arr3[i11].Clone(), c12025x6Arr3[i24].Clone()) > f12) {
                                double dM56897x115 = ((double) c12025x6Arr3[i20].m56897x1()) - dM56897x12;
                                byte[] bArr6 = bArr5;
                                double dM56895kk15 = ((double) c12025x6Arr3[i20].m56895kk()) - dM56895kk2;
                                double dM56897x116 = (((double) c12025x6Arr3[i24].m56897x1()) - dM56897x12) - dM56897x115;
                                double dM56895kk16 = (((double) c12025x6Arr3[i24].m56895kk()) - dM56895kk2) - dM56895kk15;
                                double d28 = (dM56897x116 + dM56895kk16) * 2.0d;
                                double d29 = (dM56895kk16 * dM56895kk16) + (dM56897x116 * dM56897x116);
                                double dM67496rv2 = C14116yg.m67496rv((d28 * d28) - ((((dM56895kk15 * dM56895kk15) + (dM56897x115 * dM56897x115)) - ((double) f12)) * (d29 * 4.0d)));
                                double d30 = -d28;
                                double d31 = ((d30 - dM67496rv2) / 2.0d) / d29;
                                d = (d31 < 0.0d || d31 > 1.0d) ? ((d30 + dM67496rv2) / 2.0d) / d29 : d31;
                                bArr5 = bArr6;
                                b10 = 1;
                            } else {
                                i20--;
                            }
                        } else {
                            bArr3 = bArr5;
                            int i25 = i20 - 1;
                            if (m12932k4(c12025x6Arr3[i11].Clone(), c12025x6Arr3[i25].Clone()) > f12 || m12932k4(c12025x6Arr3[i11].Clone(), c12025x6Arr3[i20 - 2].Clone()) > f12 || m12932k4(c12025x6Arr3[i11].Clone(), c12025x6Arr3[i20 - 3].Clone()) > f12) {
                                double dM56897x117 = ((double) c12025x6Arr3[i20].m56897x1()) - dM56897x12;
                                b3 = b10;
                                double dM56895kk17 = ((double) c12025x6Arr3[i20].m56895kk()) - dM56895kk2;
                                double dM56897x118 = ((double) c12025x6Arr3[i25].m56897x1()) - dM56897x12;
                                double dM56895kk18 = ((double) c12025x6Arr3[i25].m56895kk()) - dM56895kk2;
                                int i26 = i20 - 2;
                                double dM56897x119 = ((double) c12025x6Arr3[i26].m56897x1()) - dM56897x12;
                                double dM56895kk19 = ((double) c12025x6Arr3[i26].m56895kk()) - dM56895kk2;
                                int i27 = i20 - 3;
                                double dM56897x120 = ((dM56897x118 * 3.0d) + ((((double) c12025x6Arr3[i27].m56897x1()) - dM56897x12) - (dM56897x119 * 3.0d))) - dM56897x117;
                                double d32 = ((dM56897x119 - (dM56897x118 * 2.0d)) + dM56897x117) * 3.0d;
                                double d33 = (dM56897x118 - dM56897x117) * 3.0d;
                                double dM56895kk20 = ((dM56895kk18 * 3.0d) + ((((double) c12025x6Arr3[i27].m56895kk()) - dM56895kk2) - (dM56895kk19 * 3.0d))) - dM56895kk17;
                                double d34 = ((dM56895kk19 - (dM56895kk18 * 2.0d)) + dM56895kk17) * 3.0d;
                                double d35 = (dM56895kk18 - dM56895kk17) * 3.0d;
                                double dOooO00o6 = OooO00o.OooO00o(dM56895kk17, d35, dM56897x117 * d33, 2.0d);
                                double d36 = (d35 * d35) + (((dM56895kk17 * d34) + (dM56897x117 * d32)) * 2.0d) + (d33 * d33);
                                double dOooO00o7 = OooO00o.OooO00o(d35, d34, (dM56895kk20 * dM56895kk17) + (d33 * d32) + (dM56897x117 * dM56897x120), 2.0d);
                                double d37 = (d34 * d34) + (((d35 * dM56895kk20) + (d33 * dM56897x120)) * 2.0d) + (d32 * d32);
                                double dOooO00o8 = OooO00o.OooO00o(dM56895kk20, d34, dM56897x120 * d32, 2.0d);
                                double d38 = dM56895kk20 * dM56895kk20;
                                double[] dArr4 = new double[7];
                                dArr4[b4] = ((dM56895kk17 * dM56895kk17) + (dM56897x117 * dM56897x117)) - ((double) f12);
                                dArr4[1] = dOooO00o6;
                                dArr4[2] = d36;
                                dArr4[3] = dOooO00o7;
                                dArr4[i5] = d37;
                                dArr4[5] = dOooO00o8;
                                dArr4[6] = d38 + (dM56897x120 * dM56897x120);
                                f8 = f12;
                                double[] dArrM12926k44 = C3054gi.m12926k4(dArr4, 0.0d, 1.0d);
                                if (dArrM12926k44.length > 0) {
                                    d = dArrM12926k44[b4];
                                    b3 = 1;
                                } else {
                                    i20 -= 3;
                                }
                                f12 = f8;
                                bArr5 = bArr3;
                                b10 = b3;
                            } else {
                                i20 -= 3;
                                bArr5 = bArr3;
                            }
                        }
                    }
                    byte[] bArr7 = bArr5;
                    C12025x6[] c12025x6Arr5 = c12025x6Arr3;
                    if (i20 >= i12) {
                        int i28 = i20 - i12;
                        int i29 = i28 + 2;
                        if (f9 > 0.0f) {
                            i29 = i28 + 3;
                        }
                        byte b11 = 1;
                        if (f10 > 0.0f) {
                            i29++;
                        }
                        C12025x6[] c12025x6Arr6 = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, i29);
                        byte[] bArr8 = new byte[i29];
                        int i30 = (d2 > 0.0d ? 1 : (d2 == 0.0d ? 0 : -1));
                        int i31 = i30 >= 0 ? 1 : b4;
                        int i32 = i12 - 1;
                        while (i32 <= i20) {
                            bArr8[i31] = bArr7[i32];
                            c12025x6Arr5[i32].CloneTo(c12025x6Arr6[i31]);
                            i32++;
                            i31++;
                            i20 = i20;
                        }
                        int i33 = i20;
                        bArr8[b4] = b4;
                        if (i30 >= 0) {
                            int i34 = bArr8[2] & 3;
                            if (i34 == 2) {
                                f7 = f11;
                                bArr2 = bArr7;
                                i3 = i30;
                                c12025x6Arr = c12025x6Arr5;
                                double d39 = d2 * d2;
                                double d40 = 1.0d - d2;
                                double d41 = d40 * d40;
                                double d42 = d2 * d40 * 2.0d;
                                C12025x6 c12025x6 = new C12025x6((float) ((((double) c12025x6Arr6[3].m56897x1()) * d39) + (((double) c12025x6Arr6[2].m56897x1()) * d42) + (((double) c12025x6Arr6[1].m56897x1()) * d41)), (float) ((((double) c12025x6Arr6[3].m56895kk()) * d39) + (d42 * ((double) c12025x6Arr6[2].m56895kk())) + (d41 * ((double) c12025x6Arr6[1].m56895kk()))));
                                C12025x6 c12025x62 = new C12025x6((float) ((((double) c12025x6Arr6[3].m56897x1()) * d2) + (((double) c12025x6Arr6[2].m56897x1()) * d40)), (float) ((((double) c12025x6Arr6[3].m56895kk()) * d2) + (((double) c12025x6Arr6[2].m56895kk()) * d40)));
                                b11 = 1;
                                c12025x6.CloneTo(c12025x6Arr6[1]);
                                c12025x62.CloneTo(c12025x6Arr6[2]);
                            } else if (i34 != 3) {
                                double d43 = 1.0d - d2;
                                f7 = f11;
                                c12025x6Arr6[1] = new C12025x6((float) ((((double) c12025x6Arr6[2].m56897x1()) * d2) + (((double) c12025x6Arr6[1].m56897x1()) * d43)), (float) ((((double) c12025x6Arr6[2].m56895kk()) * d2) + (d43 * ((double) c12025x6Arr6[1].m56895kk()))));
                                bArr2 = bArr7;
                                i3 = i30;
                                c12025x6Arr = c12025x6Arr5;
                            } else {
                                f7 = f11;
                                double d44 = 1.0d - d2;
                                double d45 = d2 * d2;
                                double d46 = d45 * d2;
                                double d47 = d44 * d44;
                                double d48 = d47 * d44;
                                double d49 = d2 * d47 * 3.0d;
                                double d50 = d45 * d44 * 3.0d;
                                C12025x6 c12025x63 = new C12025x6((float) ((((double) c12025x6Arr6[i5].m56897x1()) * d46) + (((double) c12025x6Arr6[3].m56897x1()) * d50) + (((double) c12025x6Arr6[2].m56897x1()) * d49) + (((double) c12025x6Arr6[1].m56897x1()) * d48)), (float) ((d46 * ((double) c12025x6Arr6[i5].m56895kk())) + (d50 * ((double) c12025x6Arr6[3].m56895kk())) + (d49 * ((double) c12025x6Arr6[2].m56895kk())) + (d48 * ((double) c12025x6Arr6[1].m56895kk()))));
                                double d51 = d2 * d44 * 2.0d;
                                i3 = i30;
                                c12025x6Arr = c12025x6Arr5;
                                C12025x6 c12025x64 = new C12025x6((float) ((((double) c12025x6Arr6[i5].m56897x1()) * d45) + (((double) c12025x6Arr6[3].m56897x1()) * d51) + (((double) c12025x6Arr6[2].m56897x1()) * d47)), (float) ((d45 * ((double) c12025x6Arr6[i5].m56895kk())) + (d51 * ((double) c12025x6Arr6[3].m56895kk())) + (d47 * ((double) c12025x6Arr6[2].m56895kk()))));
                                bArr2 = bArr7;
                                C12025x6 c12025x65 = new C12025x6((float) ((((double) c12025x6Arr6[i5].m56897x1()) * d2) + (((double) c12025x6Arr6[3].m56897x1()) * d44)), (float) ((((double) c12025x6Arr6[i5].m56895kk()) * d2) + (((double) c12025x6Arr6[3].m56895kk()) * d44)));
                                c12025x63.CloneTo(c12025x6Arr6[1]);
                                c12025x64.CloneTo(c12025x6Arr6[2]);
                                c12025x65.CloneTo(c12025x6Arr6[3]);
                                b11 = 1;
                            }
                            double dM56897x121 = c12025x6Arr[i7].m56897x1() - c12025x6Arr6[b11].m56897x1();
                            double dM56895kk21 = c12025x6Arr[i7].m56895kk() - c12025x6Arr6[b11].m56895kk();
                            double dM67496rv3 = C14116yg.m67496rv((dM56895kk21 * dM56895kk21) + (dM56897x121 * dM56897x121));
                            f5 = f7;
                            double d52 = f5;
                            c12025x6Arr6[b4] = new C12025x6((float) (((dM56897x121 / dM67496rv3) * d52) + ((double) c12025x6Arr6[b11].m56897x1())), (float) (((dM56895kk21 / dM67496rv3) * d52) + ((double) c12025x6Arr6[b11].m56895kk())));
                            bArr8[b11] = b11;
                        } else {
                            bArr2 = bArr7;
                            i3 = i30;
                            c12025x6Arr = c12025x6Arr5;
                            f5 = f11;
                        }
                        if (d >= 0.0d) {
                            if (i28 < (bArr2[i33] & 3) && i3 >= 0) {
                                d = (d / (1.0d - d2)) + 0.001d;
                            }
                            int i35 = i29 - 2;
                            int i36 = bArr8[i35] & 31;
                            if (i36 == 2) {
                                i4 = i35;
                                i6 = 5;
                                double d53 = d * d;
                                double d54 = 1.0d - d;
                                double d55 = d54 * d54;
                                double d56 = d * d54 * 2.0d;
                                int i37 = i29 - 3;
                                double dM56897x122 = (((double) c12025x6Arr6[i37].m56897x1()) * d56) + (((double) c12025x6Arr6[i4].m56897x1()) * d55);
                                int i38 = i29 - 4;
                                C12025x6 c12025x66 = new C12025x6((float) ((((double) c12025x6Arr6[i38].m56897x1()) * d53) + dM56897x122), (float) ((((double) c12025x6Arr6[i38].m56895kk()) * d53) + (d56 * ((double) c12025x6Arr6[i37].m56895kk())) + (d55 * ((double) c12025x6Arr6[i4].m56895kk()))));
                                C12025x6 c12025x67 = new C12025x6((float) ((((double) c12025x6Arr6[i38].m56897x1()) * d) + (((double) c12025x6Arr6[i37].m56897x1()) * d54)), (float) ((d * ((double) c12025x6Arr6[i38].m56895kk())) + (d54 * ((double) c12025x6Arr6[i37].m56895kk()))));
                                c12025x66.CloneTo(c12025x6Arr6[i4]);
                                c12025x67.CloneTo(c12025x6Arr6[i37]);
                            } else if (i36 != 3) {
                                double d57 = 1.0d - d;
                                int i39 = i29 - 3;
                                c12025x6Arr6[i35] = new C12025x6((float) ((((double) c12025x6Arr6[i39].m56897x1()) * d) + (((double) c12025x6Arr6[i35].m56897x1()) * d57)), (float) ((d * ((double) c12025x6Arr6[i39].m56895kk())) + (d57 * ((double) c12025x6Arr6[i35].m56895kk()))));
                                i4 = i35;
                                i6 = 5;
                            } else {
                                double d58 = 1.0d - d;
                                double d59 = d * d;
                                double d60 = d59 * d;
                                double d61 = d * d58;
                                double d62 = d58 * d58;
                                double d63 = d59 * d58;
                                double d64 = d62 * d58;
                                i4 = i35;
                                double dM56897x123 = ((double) c12025x6Arr6[i35].m56897x1()) * d64;
                                double d65 = d * d62 * 3.0d;
                                int i40 = i29 - 3;
                                double dM56897x124 = (((double) c12025x6Arr6[i40].m56897x1()) * d65) + dM56897x123;
                                double d66 = d63 * 3.0d;
                                int i41 = i29 - 4;
                                double dM56897x125 = (((double) c12025x6Arr6[i41].m56897x1()) * d66) + dM56897x124;
                                i6 = 5;
                                int i42 = i29 - 5;
                                C12025x6 c12025x68 = new C12025x6((float) ((((double) c12025x6Arr6[i42].m56897x1()) * d60) + dM56897x125), (float) ((d60 * ((double) c12025x6Arr6[i42].m56895kk())) + (d66 * ((double) c12025x6Arr6[i41].m56895kk())) + (d65 * ((double) c12025x6Arr6[i40].m56895kk())) + (d64 * ((double) c12025x6Arr6[i4].m56895kk()))));
                                double d67 = d61 * 2.0d;
                                C12025x6 c12025x69 = new C12025x6((float) ((((double) c12025x6Arr6[i42].m56897x1()) * d59) + (((double) c12025x6Arr6[i41].m56897x1()) * d67) + (((double) c12025x6Arr6[i40].m56897x1()) * d62)), (float) ((d59 * ((double) c12025x6Arr6[i42].m56895kk())) + (d67 * ((double) c12025x6Arr6[i41].m56895kk())) + (d62 * ((double) c12025x6Arr6[i40].m56895kk()))));
                                C12025x6 c12025x610 = new C12025x6((float) ((((double) c12025x6Arr6[i42].m56897x1()) * d) + (((double) c12025x6Arr6[i41].m56897x1()) * d58)), (float) ((d * ((double) c12025x6Arr6[i42].m56895kk())) + (((double) c12025x6Arr6[i41].m56895kk()) * d58)));
                                c12025x68.CloneTo(c12025x6Arr6[i4]);
                                c12025x69.CloneTo(c12025x6Arr6[i40]);
                                c12025x610.CloneTo(c12025x6Arr6[i41]);
                            }
                            double dM56897x126 = c12025x6Arr[i11].m56897x1() - c12025x6Arr6[i4].m56897x1();
                            double dM56895kk22 = c12025x6Arr[i11].m56895kk() - c12025x6Arr6[i4].m56895kk();
                            double dM67496rv4 = C14116yg.m67496rv((dM56895kk22 * dM56895kk22) + (dM56897x126 * dM56897x126));
                            int i43 = i29 - 1;
                            double d68 = dM56897x126 / dM67496rv4;
                            double d69 = f5;
                            c12025x6Arr6[i43] = new C12025x6((float) ((d68 * d69) + ((double) c12025x6Arr6[i4].m56897x1())), (float) (((dM56895kk22 / dM67496rv4) * d69) + ((double) c12025x6Arr6[i4].m56895kk())));
                            bArr8[i43] = 1;
                        } else {
                            i6 = 5;
                        }
                        byte b12 = b4;
                        c6765kpM12933k4 = m12933k4(bArr8, c12025x6Arr6, b12, i29);
                        b2 = b12;
                        f6 = f4;
                        i2 = i5;
                        bArr = bArr2;
                        c12025x6ArrM55565kk = c12025x6Arr;
                        b5 = 1;
                    } else {
                        int i44 = i20;
                        int i45 = i5;
                        i6 = 5;
                        f5 = f11;
                        byte[] bArr9 = new byte[i45];
                        // fill-array-data instruction
                        bArr9[0] = 0;
                        bArr9[1] = 1;
                        bArr9[2] = 1;
                        bArr9[3] = 1;
                        C12025x6[] c12025x6Arr7 = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, i45);
                        if (d2 >= 0.0d) {
                            int i46 = bArr7[i11] & 3;
                            if (i46 == 2) {
                                int i47 = i12;
                                double d70 = 1.0d - d2;
                                double d71 = d2 * d2;
                                double d72 = d70 * d70;
                                int i48 = i47 - 1;
                                double d73 = d2 * d70 * 2.0d;
                                int i49 = i47 + 1;
                                c12025x6Arr7[1] = new C12025x6((float) ((((double) c12025x6Arr5[i49].m56897x1()) * d71) + (((double) c12025x6Arr5[i47].m56897x1()) * d73) + (((double) c12025x6Arr5[i48].m56897x1()) * d72)), (float) ((d71 * ((double) c12025x6Arr5[i49].m56895kk())) + (d73 * ((double) c12025x6Arr5[i47].m56895kk())) + (d72 * ((double) c12025x6Arr5[i48].m56895kk()))));
                            } else if (i46 != 3) {
                                double d74 = 1.0d - d2;
                                int i50 = i12 - 1;
                                int i51 = i12;
                                c12025x6Arr7[1] = new C12025x6((float) ((((double) c12025x6Arr5[i51].m56897x1()) * d2) + (((double) c12025x6Arr5[i50].m56897x1()) * d74)), (float) ((d2 * ((double) c12025x6Arr5[i51].m56895kk())) + (d74 * ((double) c12025x6Arr5[i50].m56895kk()))));
                            } else {
                                int i52 = i12;
                                double d75 = 1.0d - d2;
                                double d76 = d2 * d2;
                                double d77 = d75 * d75;
                                double d78 = d76 * d2;
                                double d79 = d77 * d75;
                                int i53 = i52 - 1;
                                double d80 = d2 * 3.0d * d77;
                                double d81 = d76 * 3.0d * d75;
                                int i54 = i52 + 1;
                                double dM56897x127 = (((double) c12025x6Arr5[i54].m56897x1()) * d81) + (((double) c12025x6Arr5[i52].m56897x1()) * d80) + (((double) c12025x6Arr5[i53].m56897x1()) * d79);
                                int i55 = i52 + 2;
                                c12025x6Arr7[1] = new C12025x6((float) ((((double) c12025x6Arr5[i55].m56897x1()) * d78) + dM56897x127), (float) ((d78 * ((double) c12025x6Arr5[i55].m56895kk())) + (d81 * ((double) c12025x6Arr5[i54].m56895kk())) + (d80 * ((double) c12025x6Arr5[i52].m56895kk())) + (d79 * ((double) c12025x6Arr5[i53].m56895kk()))));
                            }
                            f6 = f4;
                        } else {
                            double dM56897x128 = c12025x6Arr5[i11].m56897x1() - c12025x6Arr5[i7].m56897x1();
                            double dM56895kk23 = c12025x6Arr5[i11].m56895kk() - c12025x6Arr5[i7].m56895kk();
                            double dM67496rv5 = C14116yg.m67496rv((dM56895kk23 * dM56895kk23) + (dM56897x128 * dM56897x128));
                            double dM67496rv6 = C14116yg.m67496rv(f4);
                            f6 = f4;
                            c12025x6Arr7[1] = new C12025x6((float) (((dM56897x128 / dM67496rv5) * dM67496rv6) + ((double) c12025x6Arr5[i7].m56897x1())), (float) (((dM56895kk23 / dM67496rv5) * dM67496rv6) + ((double) c12025x6Arr5[i7].m56895kk())));
                        }
                        if (d >= 0.0d) {
                            int i56 = bArr7[i11] & 3;
                            if (i56 == 2) {
                                double d82 = 1.0d - d;
                                double d83 = d * d;
                                double d84 = d82 * d82;
                                double d85 = d * d82;
                                double dM56897x129 = ((double) c12025x6Arr5[i44].m56897x1()) * d84;
                                double d86 = d85 * 2.0d;
                                int i57 = i44 - 1;
                                int i58 = i44 - 2;
                                c12025x6Arr7[2] = new C12025x6((float) ((((double) c12025x6Arr5[i58].m56897x1()) * d83) + (((double) c12025x6Arr5[i57].m56897x1()) * d86) + dM56897x129), (float) ((((double) c12025x6Arr5[i58].m56895kk()) * d83) + (d86 * ((double) c12025x6Arr5[i57].m56895kk())) + (d84 * ((double) c12025x6Arr5[i44].m56895kk()))));
                            } else if (i56 != 3) {
                                double d87 = 1.0d - d;
                                int i59 = i44 - 1;
                                c12025x6Arr7[2] = new C12025x6((float) ((((double) c12025x6Arr5[i59].m56897x1()) * d) + (((double) c12025x6Arr5[i44].m56897x1()) * d87)), (float) ((d * ((double) c12025x6Arr5[i59].m56895kk())) + (d87 * ((double) c12025x6Arr5[i44].m56895kk()))));
                            } else {
                                double d88 = 1.0d - d;
                                double d89 = d * d;
                                double d90 = d88 * d88;
                                double d91 = d89 * d;
                                double d92 = d90 * d88;
                                double d93 = d * 3.0d * d90;
                                int i60 = i44 - 1;
                                double d94 = d89 * 3.0d * d88;
                                int i61 = i44 - 2;
                                int i62 = i44 - 3;
                                c12025x6Arr7[2] = new C12025x6((float) ((((double) c12025x6Arr5[i62].m56897x1()) * d91) + (((double) c12025x6Arr5[i61].m56897x1()) * d94) + (((double) c12025x6Arr5[i60].m56897x1()) * d93) + (((double) c12025x6Arr5[i44].m56897x1()) * d92)), (float) ((d91 * ((double) c12025x6Arr5[i62].m56895kk())) + (((double) c12025x6Arr5[i61].m56895kk()) * d94) + (d93 * ((double) c12025x6Arr5[i60].m56895kk())) + (d92 * ((double) c12025x6Arr5[i44].m56895kk()))));
                            }
                        } else {
                            double dM56897x130 = c12025x6Arr5[i7].m56897x1() - c12025x6Arr5[i11].m56897x1();
                            double dM56895kk24 = c12025x6Arr5[i7].m56895kk() - c12025x6Arr5[i11].m56895kk();
                            double dM67496rv7 = C14116yg.m67496rv((dM56895kk24 * dM56895kk24) + (dM56897x130 * dM56897x130));
                            double dM67496rv8 = C14116yg.m67496rv(f12);
                            c12025x6Arr7[2] = new C12025x6((float) (((dM56897x130 / dM67496rv7) * dM67496rv8) + ((double) c12025x6Arr5[i11].m56897x1())), (float) (((dM56895kk24 / dM67496rv7) * dM67496rv8) + ((double) c12025x6Arr5[i11].m56895kk())));
                        }
                        b5 = 1;
                        double dM56897x131 = c12025x6Arr5[i7].m56897x1() - c12025x6Arr7[1].m56897x1();
                        double dM56895kk25 = c12025x6Arr5[i7].m56895kk() - c12025x6Arr7[1].m56895kk();
                        double dM67496rv9 = C14116yg.m67496rv((dM56895kk25 * dM56895kk25) + (dM56897x131 * dM56897x131));
                        double d95 = dM56897x131 / dM67496rv9;
                        double d96 = f5;
                        c12025x6Arr7[0] = new C12025x6((float) ((d95 * d96) + ((double) c12025x6Arr7[1].m56897x1())), (float) (((dM56895kk25 / dM67496rv9) * d96) + ((double) c12025x6Arr7[1].m56895kk())));
                        double dM56897x132 = c12025x6Arr5[i11].m56897x1() - c12025x6Arr7[2].m56897x1();
                        double dM56895kk26 = c12025x6Arr5[i11].m56895kk() - c12025x6Arr7[2].m56895kk();
                        double dM67496rv10 = C14116yg.m67496rv((dM56895kk26 * dM56895kk26) + (dM56897x132 * dM56897x132));
                        c12025x6Arr7[3] = new C12025x6((float) (((dM56897x132 / dM67496rv10) * d96) + ((double) c12025x6Arr7[2].m56897x1())), (float) (((dM56895kk26 / dM67496rv10) * d96) + ((double) c12025x6Arr7[2].m56895kk())));
                        i2 = 4;
                        b2 = 0;
                        c6765kpM12933k4 = m12933k4(bArr9, c12025x6Arr7, 0, 4);
                        bArr = bArr7;
                        c12025x6ArrM55565kk = c12025x6Arr5;
                    }
                    if (b == 0) {
                        if (c6765kp != null) {
                            c6765kp.m26791k4((Object) c6765kpM12933k4);
                        }
                    } else if (c6765kp2 != null) {
                        c6765kp2.m26791k4((Object) c6765kpM12933k4);
                    }
                    iM55525du = i;
                    f9 = f;
                    bArrM55571to = bArr;
                    i5 = i2;
                    b4 = b2;
                    f4 = f6;
                    i7 = i8;
                    f11 = f5;
                    z2 = z;
                    f10 = f2;
                }
            }
            c6765kpM12933k4 = m12933k4(bArr, c12025x6ArrM55565kk, i7, i8);
            if (b == 0) {
            }
            iM55525du = i;
            f9 = f;
            bArrM55571to = bArr;
            i5 = i2;
            b4 = b2;
            f4 = f6;
            i7 = i8;
            f11 = f5;
            z2 = z;
            f10 = f2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m12937k4(C11896dy c11896dy, C6765kp c6765kp, C6765kp c6765kp2, float f, float f2, float f3, boolean z) {
        int i;
        C3055gk c3055gk = new C3055gk();
        C12007ix c12007ixClone = c11896dy.m55523c5().Clone();
        float fM67481k4 = C14116yg.m67481k4(C14116yg.m67480k4(c12007ixClone.m56550c5()), C14116yg.m67480k4(c12007ixClone.m56575x1()));
        if (z) {
            i = 100;
        } else {
            i = 1;
            while (1000.0d / ((double) i) > fM67481k4) {
                i *= 10;
            }
        }
        c3055gk.f9080x1 = i;
        c3055gk.m12936k4(c11896dy, c6765kp, c6765kp2, f, f2, f3);
    }
}
