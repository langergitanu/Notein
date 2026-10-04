package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p077d8.C3074na;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.a7 */
/* JADX INFO: loaded from: classes3.dex */
class C0735a7 {

    /* JADX INFO: renamed from: k4 */
    public static final C14663v4[] f3828k4 = new C14663v4[0];

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f3829to;

    /* JADX INFO: renamed from: x1 */
    private static final C3074na<Byte, Byte> f3830x1;

    /* JADX INFO: renamed from: kk */
    private C13760l2 f3831kk;

    static {
        C3074na<Byte, Byte> c3074na = new C3074na<>();
        f3830x1 = c3074na;
        c3074na.m13009k4((byte) 0, (byte) 0);
        c3074na.m13009k4((byte) 1, (byte) 1);
        c3074na.m13009k4((byte) 2, (byte) 2);
        c3074na.m13009k4((byte) 3, (byte) 3);
        c3074na.m13009k4((byte) 4, (byte) 4);
        c3074na.m13009k4((byte) 5, (byte) 5);
        f3829to = new C7017h4("xl", "xt", "xr", "xb", "yl", "yt", "yr", "yb");
    }

    public C0735a7() {
        this.f3831kk = new C13760l2();
        m3331x1(-1);
    }

    /* JADX INFO: renamed from: k4 */
    private double m3304k4(double[] dArr, byte[] bArr, long j, byte[] bArr2) {
        bArr2[0] = 0;
        if (j > 27273042316900L) {
            return m3334x1()[(int) (j - 27273042316901L)].m64504k4();
        }
        if (j >= -27273042329600L) {
            return j;
        }
        int i = (int) ((-27273042329601L) - j);
        byte b = bArr[i];
        if ((b & 16) != 16) {
            return Double.NaN;
        }
        bArr2[0] = b;
        return dArr[i];
    }

    /* JADX INFO: renamed from: c5 */
    public final int m3307c5() {
        return m3314k4().m64257dy();
    }

    /* JADX INFO: renamed from: ck */
    public final int m3308ck() {
        return m3307c5();
    }

    /* JADX INFO: renamed from: du */
    public final C0899df[] m3309du() {
        return m3314k4().m64273to();
    }

    /* JADX INFO: renamed from: dy */
    public final C14843yd[] m3310dy() {
        return m3314k4().m64272m9();
    }

    /* JADX INFO: renamed from: h4 */
    public final f7k[] m3311h4() {
        return m3314k4().m64256du();
    }

    /* JADX INFO: renamed from: jd */
    public final C13760l2 m3312jd() {
        return m3314k4().m64255c5();
    }

    /* JADX INFO: renamed from: kk */
    public final C1253ij[] m3328kk() {
        return m3314k4().m64276x1();
    }

    /* JADX INFO: renamed from: m9 */
    public final C14843yd[] m3329m9() {
        return m3314k4().m64258h4();
    }

    /* JADX INFO: renamed from: to */
    public final C14663v4[] m3330to() {
        return m3314k4().m64271kk();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m3331x1(int i) {
        if (m3307c5() == i || i == 0) {
            return;
        }
        if (m3307c5() == 0) {
            m3322k4((C13791lr[]) null);
            m3321k4((C1253ij[]) null);
            m3323k4(f3828k4);
            m3319k4((C0899df[]) null);
            m3320k4((f7k[]) null);
            m3324k4((C14843yd[]) null);
            m3332x1((C14843yd[]) null);
        }
        m3317k4(i);
        m3318k4(C13753kz.m64234k4(m3307c5()));
        if (m3312jd() == null) {
            return;
        }
        m3322k4(m3306x1(m3312jd().m64270k4()));
    }

    public C0735a7(GeometryShape geometryShape) {
        this.f3831kk = new C13760l2();
        geometryShape.mo272to().m70449k4(m3314k4());
    }

    /* JADX INFO: renamed from: k4 */
    public static C0735a7 m3305k4(C0735a7 c0735a7) {
        C0735a7 c0735a72 = new C0735a7(new C13760l2(c0735a7.m3334x1(), c0735a7.m3309du(), c0735a7.m3328kk(), c0735a7.m3330to(), c0735a7.m3311h4(), c0735a7.m3329m9() == null ? null : c0735a7.m3329m9()[0], c0735a7.m3310dy() != null ? c0735a7.m3310dy()[0] : null));
        c0735a72.m3314k4().m64262k4(c0735a7.m3307c5());
        c0735a72.m3314k4().m64263k4(C13753kz.m64234k4(c0735a7.m3307c5()));
        return c0735a72;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m3332x1(C14843yd[] c14843ydArr) {
        m3314k4().m64275x1(c14843ydArr);
    }

    public C0735a7(C13760l2 c13760l2) {
        new C13760l2();
        this.f3831kk = c13760l2;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12007ix m3313k4(oju ojuVar, oju ojuVar2) {
        double d;
        double d2;
        C13760l2 c13760l2M3314k4 = m3314k4();
        if (m3307c5() != 0) {
            c13760l2M3314k4 = m3312jd();
        }
        if (c13760l2M3314k4 == null) {
            return new C12007ix(ojuVar.f47836k4, ojuVar.f47837x1, ojuVar2.f47836k4, ojuVar2.f47837x1);
        }
        byte[][] bArr = {null};
        double[][] dArr = {null};
        m3316k4((float) (((double) ojuVar2.f47836k4) * 12700.0d), (float) (((double) ojuVar2.f47837x1) * 12700.0d), bArr, dArr);
        byte[] bArr2 = bArr[0];
        double[] dArr2 = dArr[0];
        float f = ojuVar.f47836k4;
        double d3 = f;
        double d4 = f + ojuVar2.f47836k4;
        float f2 = ojuVar.f47837x1;
        double dOooO00o = f2;
        double dOooO00o2 = f2 + ojuVar2.f47837x1;
        if (c13760l2M3314k4.m64258h4() != null) {
            d = d4;
            double dOooO00o3 = OooO0O0.OooO0OO.OooO00o(ojuVar.f47836k4, 12700.0d, c13760l2M3314k4.m64259k4(dArr2, bArr2, c13760l2M3314k4.m64258h4()[0].m73856k4()), 12700.0d);
            dOooO00o = OooO0O0.OooO0OO.OooO00o(ojuVar.f47837x1, 12700.0d, c13760l2M3314k4.m64259k4(dArr2, bArr2, c13760l2M3314k4.m64258h4()[0].m73858x1()), 12700.0d);
            d3 = dOooO00o3;
        } else {
            d = d4;
        }
        if (c13760l2M3314k4.m64272m9() != null) {
            double dOooO00o4 = OooO0O0.OooO0OO.OooO00o(ojuVar.f47836k4, 12700.0d, c13760l2M3314k4.m64259k4(dArr2, bArr2, c13760l2M3314k4.m64272m9()[0].m73856k4()), 12700.0d);
            d2 = dOooO00o4;
            dOooO00o = dOooO00o;
            d3 = d3;
            dOooO00o2 = OooO0O0.OooO0OO.OooO00o(ojuVar.f47837x1, 12700.0d, c13760l2M3314k4.m64259k4(dArr2, bArr2, c13760l2M3314k4.m64272m9()[0].m73858x1()), 12700.0d);
        } else {
            d2 = d;
        }
        return new C12007ix((float) d3, (float) dOooO00o, (float) (d2 - d3), (float) (dOooO00o2 - dOooO00o));
    }

    /* JADX INFO: renamed from: x1 */
    public final C12025x6[] m3333x1(float f, float f2, float f3, float f4) {
        C13760l2 c13760l2M3314k4 = m3314k4();
        if (m3307c5() != 0) {
            c13760l2M3314k4 = m3312jd();
        }
        C12025x6[] c12025x6Arr = null;
        if (c13760l2M3314k4 != null) {
            byte[][] bArr = {null};
            double[][] dArr = {null};
            m3316k4(f3 * 12700.0f, f4 * 12700.0f, bArr, dArr);
            byte[] bArr2 = bArr[0];
            double[] dArr2 = dArr[0];
            C1253ij[] c1253ijArrM64276x1 = c13760l2M3314k4.m64276x1();
            if (c1253ijArrM64276x1 != null) {
                c12025x6Arr = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), c1253ijArrM64276x1.length));
                for (int i = 0; i < c12025x6Arr.length; i++) {
                    C1253ij c1253ij = c1253ijArrM64276x1[i];
                    c12025x6Arr[i] = new C12025x6((c13760l2M3314k4.m64259k4(dArr2, bArr2, c1253ij.m7640k4().m73856k4()) / 12700.0f) + f, (c13760l2M3314k4.m64259k4(dArr2, bArr2, c1253ij.m7640k4().m73858x1()) / 12700.0f) + f2);
                }
            }
        }
        return c12025x6Arr;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13760l2 m3314k4() {
        return this.f3831kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C13791lr[] m3334x1() {
        return m3314k4().m64270k4();
    }

    /* JADX INFO: renamed from: x1 */
    public static C13791lr[] m3306x1(C13791lr[] c13791lrArr) {
        C13791lr[] c13791lrArr2 = new C13791lr[c13791lrArr.length];
        for (int i = 0; i < c13791lrArr.length; i++) {
            c13791lrArr2[i] = new C13791lr(c13791lrArr[i]);
        }
        return c13791lrArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3315k4(float f, float f2, C0899df[] c0899dfArr, byte[][] bArr, double[][] dArr) {
        byte b;
        int i;
        char c;
        char c2;
        char c3;
        byte b2;
        int i2;
        int i3 = 1;
        int i4 = 11;
        int length = c0899dfArr == null ? 0 : c0899dfArr.length + 11;
        dArr[0] = new double[length];
        byte[] bArr2 = new byte[length];
        bArr[0] = bArr2;
        if (length == 0) {
            return;
        }
        bArr2[7] = 1;
        bArr2[8] = 4;
        char c4 = '\t';
        bArr2[9] = 2;
        char c5 = '\n';
        bArr2[10] = 8;
        int i5 = 0;
        while (true) {
            b = 16;
            if (i5 >= 11) {
                break;
            }
            byte[] bArr3 = bArr[0];
            bArr3[i5] = (byte) (16 | bArr3[i5]);
            i5++;
        }
        double[] dArr2 = dArr[0];
        dArr2[0] = 2.16E7d;
        double d = f;
        dArr2[1] = d;
        double d2 = f2;
        dArr2[2] = d2;
        dArr2[3] = f > f2 ? d2 : d;
        dArr2[4] = f > f2 ? d : d2;
        char c6 = '\b';
        dArr2[5] = f / 2.0f;
        dArr2[6] = f2 / 2.0f;
        double d3 = 0.0d;
        dArr2[7] = 0.0d;
        dArr2[8] = 0.0d;
        dArr2[9] = d;
        dArr2[10] = d2;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = 10;
        int i11 = 0;
        while (i10 > 0) {
            double[] dArr3 = dArr[0];
            double d4 = d3;
            if (i11 >= dArr3.length) {
                return;
            }
            int length2 = dArr3.length;
            int iM67483k4 = C14116yg.m67483k4(i11, i4);
            i11 = length2;
            i10 = 0;
            while (true) {
                double[] dArr4 = dArr[0];
                i = i4;
                if (iM67483k4 < dArr4.length) {
                    byte[] bArr4 = bArr[0];
                    if ((bArr4[iM67483k4] & b) == b) {
                        i2 = i3;
                        c = c4;
                        c2 = c6;
                        c3 = c5;
                        b2 = b;
                    } else {
                        C0899df c0899df = c0899dfArr[iM67483k4 - 11];
                        c = c4;
                        byte[] bArr5 = new byte[i3];
                        bArr5[0] = 0;
                        c2 = c6;
                        double dM3304k4 = m3304k4(dArr4, bArr4, c0899df.m5083kk(), bArr5);
                        byte b3 = bArr5[0];
                        c3 = c5;
                        byte[] bArr6 = new byte[i3];
                        bArr6[0] = 0;
                        byte b4 = b;
                        int i12 = i8;
                        double dM3304k42 = m3304k4(dArr[0], bArr[0], c0899df.m5085to(), bArr6);
                        byte b5 = bArr6[0];
                        b2 = b4;
                        byte[] bArr7 = new byte[i3];
                        bArr7[0] = 0;
                        i2 = i3;
                        double dM3304k43 = m3304k4(dArr[0], bArr[0], c0899df.m5078du(), bArr7);
                        byte b6 = bArr7[0];
                        if (C14044b3.m66437kk(dM3304k4) || C14044b3.m66437kk(dM3304k42) || C14044b3.m66437kk(dM3304k43)) {
                            i8 = i12;
                            if (iM67483k4 < i11) {
                                i11 = iM67483k4;
                            }
                        } else {
                            switch (c0899df.m5079h4()) {
                                case 0:
                                    dArr[0][iM67483k4] = (dM3304k4 * dM3304k42) / dM3304k43;
                                    break;
                                case 1:
                                    dArr[0][iM67483k4] = (dM3304k4 + dM3304k42) - dM3304k43;
                                    break;
                                case 2:
                                    dArr[0][iM67483k4] = (dM3304k4 + dM3304k42) / dM3304k43;
                                    break;
                                case 3:
                                    double[] dArr5 = dArr[0];
                                    if (dM3304k4 <= d4) {
                                        dM3304k42 = dM3304k43;
                                    }
                                    dArr5[iM67483k4] = dM3304k42;
                                    break;
                                case 4:
                                    dArr[0][iM67483k4] = C14116yg.m67475k4(dM3304k4);
                                    break;
                                case 5:
                                    dArr[0][iM67483k4] = C14116yg.m67498to(dM3304k42, dM3304k4) / 2.9088820866572157E-7d;
                                    break;
                                case 6:
                                    dArr[0][iM67483k4] = C14116yg.m67470dy(C14116yg.m67498to(dM3304k43, dM3304k42)) * dM3304k4;
                                    break;
                                case 7:
                                    dArr[0][iM67483k4] = C14116yg.m67470dy(dM3304k42 * 2.9088820866572157E-7d) * dM3304k4;
                                    break;
                                case 8:
                                    dArr[0][iM67483k4] = C14116yg.m67502x1(dM3304k4, dM3304k42);
                                    break;
                                case 9:
                                    dArr[0][iM67483k4] = C14116yg.m67491kk(dM3304k4, dM3304k42);
                                    break;
                                case 10:
                                    dArr[0][iM67483k4] = C14116yg.m67496rv((dM3304k43 * dM3304k43) + (dM3304k42 * dM3304k42) + (dM3304k4 * dM3304k4));
                                    break;
                                case 11:
                                    double[] dArr6 = dArr[0];
                                    if (dM3304k4 <= dM3304k42) {
                                        dM3304k4 = dM3304k42 > dM3304k43 ? dM3304k43 : dM3304k42;
                                    }
                                    dArr6[iM67483k4] = dM3304k4;
                                    break;
                                case 12:
                                    dArr[0][iM67483k4] = C14116yg.m67495m9(C14116yg.m67498to(dM3304k43, dM3304k42)) * dM3304k4;
                                    break;
                                case 13:
                                    dArr[0][iM67483k4] = C14116yg.m67495m9(dM3304k42 * 2.9088820866572157E-7d) * dM3304k4;
                                    break;
                                case 14:
                                    dArr[0][iM67483k4] = C14116yg.m67496rv(dM3304k4);
                                    break;
                                case 15:
                                    dArr[0][iM67483k4] = C14116yg.m67466c5(dM3304k42 * 2.9088820866572157E-7d) * dM3304k4;
                                    break;
                                case 16:
                                    dArr[0][iM67483k4] = dM3304k4;
                                    break;
                            }
                            switch (f3829to.m27428k4(c0899df.m5080k4())) {
                                case 0:
                                    i8 = i12;
                                    double[] dArr7 = dArr[0];
                                    double d5 = dArr7[iM67483k4];
                                    if (d5 > dArr7[7] && d5 < dArr7[c]) {
                                        i6 = iM67483k4;
                                    }
                                    break;
                                case 1:
                                    i8 = i12;
                                    double[] dArr8 = dArr[0];
                                    double d6 = dArr8[iM67483k4];
                                    if (d6 > dArr8[7] && d6 < dArr8[c]) {
                                        i7 = iM67483k4;
                                    }
                                    break;
                                case 2:
                                    i8 = i12;
                                    double[] dArr9 = dArr[0];
                                    double d7 = dArr9[iM67483k4];
                                    if (d7 > dArr9[7] && d7 < dArr9[c]) {
                                        i8 = iM67483k4;
                                    }
                                    break;
                                case 3:
                                    i8 = i12;
                                    double[] dArr10 = dArr[0];
                                    double d8 = dArr10[iM67483k4];
                                    if (d8 > dArr10[7] && d8 < dArr10[c]) {
                                        i9 = iM67483k4;
                                    }
                                    break;
                                case 4:
                                    i8 = i12;
                                    if (i6 > -1) {
                                        double[] dArr11 = dArr[0];
                                        double d9 = dArr11[iM67483k4];
                                        if (d9 > dArr11[c2] && d9 < dArr11[c3]) {
                                            dArr11[i6] = dArr11[7];
                                        }
                                    }
                                    break;
                                case 5:
                                    i8 = i12;
                                    if (i7 > -1) {
                                        double[] dArr12 = dArr[0];
                                        double d10 = dArr12[iM67483k4];
                                        double d11 = dArr12[c2];
                                        if (d10 > d11 && d10 < dArr12[c3]) {
                                            dArr12[iM67483k4] = d11;
                                        }
                                    }
                                    break;
                                case 6:
                                    i8 = i12;
                                    if (i8 > -1) {
                                        double[] dArr13 = dArr[0];
                                        double d12 = dArr13[iM67483k4];
                                        if (d12 > dArr13[c2] && d12 < dArr13[c3]) {
                                            dArr13[i8] = dArr13[c];
                                        }
                                    }
                                    break;
                                case 7:
                                    if (i9 > -1) {
                                        double[] dArr14 = dArr[0];
                                        double d13 = dArr14[iM67483k4];
                                        if (d13 > dArr14[c2]) {
                                            double d14 = dArr14[c3];
                                            if (d13 < d14) {
                                                dArr14[iM67483k4] = d14;
                                            }
                                        }
                                        break;
                                    }
                                default:
                                    i8 = i12;
                                    break;
                            }
                            bArr[0][iM67483k4] = (byte) (b3 | b5 | b6 | 16);
                            i10 += i2;
                        }
                    }
                    iM67483k4 += i2;
                    i3 = i2;
                    c6 = c2;
                    c5 = c3;
                    b = b2;
                    i4 = i;
                    c4 = c;
                }
            }
            d3 = d4;
            i4 = i;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3316k4(float f, float f2, byte[][] bArr, double[][] dArr) {
        C13760l2 c13760l2M3314k4 = m3314k4();
        if (m3307c5() != 0) {
            c13760l2M3314k4 = m3312jd();
        }
        m3315k4(f, f2, c13760l2M3314k4.m64273to(), bArr, dArr);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3317k4(int i) {
        m3314k4().m64262k4(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3318k4(C13760l2 c13760l2) {
        m3314k4().m64263k4(c13760l2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3319k4(C0899df[] c0899dfArr) {
        m3314k4().m64264k4(c0899dfArr);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3320k4(f7k[] f7kVarArr) {
        m3314k4().m64265k4(f7kVarArr);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3321k4(C1253ij[] c1253ijArr) {
        m3314k4().m64266k4(c1253ijArr);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3322k4(C13791lr[] c13791lrArr) {
        m3314k4().m64267k4(c13791lrArr);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3323k4(C14663v4[] c14663v4Arr) {
        m3314k4().m64268k4(c14663v4Arr);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3324k4(C14843yd[] c14843ydArr) {
        m3314k4().m64269k4(c14843ydArr);
    }

    /* JADX INFO: renamed from: k4 */
    public final float[] m3325k4(float f, float f2) {
        C13760l2 c13760l2M3314k4 = m3314k4();
        if (m3307c5() != 0) {
            c13760l2M3314k4 = m3312jd();
        }
        if (c13760l2M3314k4 != null) {
            byte[][] bArr = {null};
            double[][] dArr = {null};
            m3316k4(f * 12700.0f, f2 * 12700.0f, bArr, dArr);
            byte[] bArr2 = bArr[0];
            double[] dArr2 = dArr[0];
            C1253ij[] c1253ijArrM64276x1 = c13760l2M3314k4.m64276x1();
            if (c1253ijArrM64276x1 != null) {
                int length = c1253ijArrM64276x1.length;
                float[] fArr = new float[length];
                for (int i = 0; i < length; i++) {
                    fArr[i] = c13760l2M3314k4.m64274x1(dArr2, bArr2, c1253ijArrM64276x1[i].m7642x1());
                }
                return fArr;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final GeometryPath[] m3326k4(float f, float f2, float f3, float f4) {
        C13760l2 c13760l2M3314k4 = m3314k4();
        if (m3307c5() != 0) {
            c13760l2M3314k4 = m3312jd();
        }
        if (c13760l2M3314k4 == null) {
            throw new NotImplementedException("Shape template not found");
        }
        f7k[] f7kVarArrM64256du = c13760l2M3314k4.m64256du();
        byte[][] bArr = {null};
        double[][] dArr = {null};
        float f5 = f3 * 12700.0f;
        float f6 = f4 * 12700.0f;
        m3316k4(f5, f6, bArr, dArr);
        byte[] bArr2 = bArr[0];
        double[] dArr2 = dArr[0];
        GeometryPath[] geometryPathArr = new GeometryPath[f7kVarArrM64256du.length];
        for (int i = 0; i < f7kVarArrM64256du.length; i++) {
            geometryPathArr[i] = f7kVarArrM64256du[i].m6034k4(m3314k4(), dArr2, bArr2, f * 12700.0f, f2 * 12700.0f, f5, f6);
        }
        return geometryPathArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final ShapeElement[] m3327k4(Shape shape, float f, float f2, float f3, float f4) {
        C13760l2 c13760l2M3314k4 = m3314k4();
        if (m3307c5() != 0) {
            c13760l2M3314k4 = m3312jd();
        }
        if (c13760l2M3314k4 == null) {
            C11896dy c11896dy = new C11896dy();
            c11896dy.m55578x1(new C12007ix(f, f2, f3, f4));
            c11896dy.m55585yj();
            float f5 = f3 + f;
            float f6 = f4 + f2;
            c11896dy.m55574x1(f, f2, f5, f6);
            c11896dy.m55585yj();
            c11896dy.m55574x1(f, f6, f5, f2);
            return new ShapeElement[]{new ShapeElement(shape, c11896dy, 0, false, (byte) 1, (byte) 0, null)};
        }
        f7k[] f7kVarArrM64256du = c13760l2M3314k4.m64256du();
        ShapeElement[] shapeElementArr = new ShapeElement[f7kVarArrM64256du.length];
        byte[][] bArr = {null};
        double[][] dArr = {null};
        float f7 = f3 * 12700.0f;
        float f8 = f4 * 12700.0f;
        C0735a7 c0735a7 = this;
        c0735a7.m3316k4(f7, f8, bArr, dArr);
        byte[] bArr2 = bArr[0];
        double[] dArr2 = dArr[0];
        int i = 0;
        while (i < f7kVarArrM64256du.length) {
            float f9 = f7;
            float f10 = f8;
            int i2 = i;
            shapeElementArr[i2] = new ShapeElement(shape, f7kVarArrM64256du[i].m6046x1(c0735a7.m3314k4(), dArr2, bArr2, f * 12700.0f, f2 * 12700.0f, f9, f10), 0, !f7kVarArrM64256du[i].m6044to(), f3830x1.m13012x1(Byte.valueOf(f7kVarArrM64256du[i].m6031du())).byteValue(), f7kVarArrM64256du[i].m6032h4() ? (byte) 1 : (byte) 0, null);
            i = i2 + 1;
            c0735a7 = this;
            f7 = f9;
            f8 = f10;
        }
        return shapeElementArr;
    }
}
