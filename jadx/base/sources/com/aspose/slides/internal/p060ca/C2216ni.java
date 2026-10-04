package com.aspose.slides.internal.p060ca;

import OooO0O0.OooO0OO;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.ni */
/* JADX INFO: loaded from: classes3.dex */
public class C2216ni extends C2117hn {

    /* JADX INFO: renamed from: c5 */
    public byte[] f7665c5;

    /* JADX INFO: renamed from: du */
    public double[] f7666du;

    /* JADX INFO: renamed from: dy */
    public boolean[] f7667dy;

    /* JADX INFO: renamed from: h4 */
    public double[] f7668h4;

    /* JADX INFO: renamed from: k4 */
    public int f7669k4;

    /* JADX INFO: renamed from: kk */
    public byte[] f7670kk;

    /* JADX INFO: renamed from: m9 */
    public boolean[] f7671m9;

    /* JADX INFO: renamed from: to */
    public int f7672to;

    /* JADX INFO: renamed from: x1 */
    public int[] f7673x1;

    private C2216ni() {
    }

    /* JADX INFO: renamed from: kk */
    public static C2216ni m11176kk() {
        return new C2216ni();
    }

    /* JADX INFO: renamed from: x1 */
    public static C2216ni m11177x1() {
        C2216ni c2216ni = new C2216ni();
        c2216ni.f7669k4 = 0;
        c2216ni.f7673x1 = new int[0];
        c2216ni.f7670kk = new byte[0];
        c2216ni.f7672to = 0;
        c2216ni.f7666du = new double[0];
        c2216ni.f7668h4 = new double[0];
        c2216ni.f7671m9 = new boolean[0];
        c2216ni.f7667dy = new boolean[0];
        c2216ni.f7665c5 = new byte[0];
        return c2216ni;
    }

    @Override // com.aspose.slides.internal.p060ca.C2117hn
    /* JADX INFO: renamed from: k4 */
    public C2046dg mo10695k4() {
        byte b;
        int i;
        int i2;
        int i3;
        C2046dg c2046dg;
        int i4;
        int i5;
        byte b2;
        C2324un c2324unM10362k4;
        C2264qn c2264qn;
        int i6;
        double d;
        double d2;
        C2046dg c2046dgMo10695k4 = super.mo10695k4();
        int i7 = 0;
        while (true) {
            b = 1;
            if (i7 >= this.f7672to) {
                break;
            }
            byte[] bArr = this.f7670kk;
            bArr[i7] = (byte) (1 & bArr[i7]);
            i7++;
        }
        int i8 = -1;
        int i9 = 0;
        while (i9 < this.f7673x1.length) {
            int i10 = i8 + 1;
            double d3 = 0.0d;
            int i11 = i10;
            double d4 = 0.0d;
            byte b3 = 0;
            while (true) {
                i = this.f7673x1[i9];
                if (i11 <= (i & 65535)) {
                    if (i11 == i10 && b3 == 0) {
                        byte[] bArr2 = this.f7670kk;
                        if ((bArr2[i11] & b) != 0 || (bArr2[i & 65535] & b) == 0) {
                            d = this.f7666du[i11];
                            d2 = this.f7668h4[i11];
                            c2046dgMo10695k4.m10362k4().m11513k4(new C2140j6(d, d2));
                        } else {
                            d = this.f7666du[i & 65535];
                            d2 = this.f7668h4[i & 65535];
                            c2046dgMo10695k4.m10362k4().m11513k4(new C2140j6(d, d2));
                            i11--;
                        }
                        c2046dg = c2046dgMo10695k4;
                        i4 = i8;
                        i5 = i9;
                        b2 = b;
                        i2 = i10;
                        d3 = d;
                        d4 = d2;
                        b3 = b2;
                    } else if ((this.f7670kk[i11] & b) != 0) {
                        b2 = b;
                        i2 = i10;
                        c2046dgMo10695k4.m10362k4().m11513k4(new C2090fu(this.f7666du[i11], this.f7668h4[i11]));
                        c2046dg = c2046dgMo10695k4;
                        i4 = i8;
                        i5 = i9;
                    } else {
                        byte b4 = b;
                        i2 = i10;
                        int i12 = i11 - 1;
                        int i13 = i12 == i8 ? i & 65535 : i12;
                        int i14 = i11;
                        int i15 = 0;
                        while (true) {
                            if (i14 == (this.f7673x1[i9] & 65535) + 1) {
                                i3 = i2;
                                break;
                            }
                            if ((this.f7670kk[i14] & 1) != 0) {
                                i3 = i14;
                                break;
                            }
                            i14++;
                            i15++;
                        }
                        if (i15 != 0) {
                            if (i15 == b4) {
                                c2046dg = c2046dgMo10695k4;
                                i4 = i8;
                                i5 = i9;
                                double d5 = this.f7666du[i3];
                                double d6 = this.f7668h4[i3];
                                c2324unM10362k4 = c2046dg.m10362k4();
                                double[] dArr = this.f7666du;
                                double d7 = dArr[i13];
                                double d8 = dArr[i11];
                                double dOooO00o = OooO0OO.OooO00o(d8, 2.0d, d7, 3.0d);
                                double[] dArr2 = this.f7668h4;
                                double d9 = dArr2[i13];
                                double d10 = dArr2[i11];
                                c2264qn = new C2264qn(dOooO00o, OooO0OO.OooO00o(d10, 2.0d, d9, 3.0d), ((d8 * 2.0d) + dArr[i3]) / 3.0d, ((d10 * 2.0d) + dArr2[i3]) / 3.0d, d5, d6);
                            } else if (i15 != 2) {
                                if (i15 != 3) {
                                    int i16 = i12 + i15;
                                    C2324un c2324unM10362k42 = c2046dgMo10695k4.m10362k4();
                                    double[] dArr3 = this.f7666du;
                                    double d11 = dArr3[i13];
                                    double d12 = dArr3[i11];
                                    double dOooO00o2 = OooO0OO.OooO00o(d12, 2.0d, d11, 3.0d);
                                    c2046dg = c2046dgMo10695k4;
                                    double[] dArr4 = this.f7668h4;
                                    double d13 = dArr4[i13];
                                    double d14 = dArr4[i11];
                                    double dOooO00o3 = OooO0OO.OooO00o(d14, 2.0d, d13, 3.0d);
                                    int i17 = i11 + 1;
                                    double d15 = dArr3[i17];
                                    double d16 = dArr4[i17];
                                    c2324unM10362k42.m11513k4(new C2264qn(dOooO00o2, dOooO00o3, ((d12 * 5.0d) + d15) / 6.0d, ((d14 * 5.0d) + d16) / 6.0d, (d12 + d15) / 2.0d, (d14 + d16) / 2.0d));
                                    while (true) {
                                        i6 = i16 - 1;
                                        if (i17 > i6) {
                                            break;
                                        }
                                        C2324un c2324unM10362k43 = c2046dg.m10362k4();
                                        double[] dArr5 = this.f7666du;
                                        int i18 = i17 - 1;
                                        double d17 = dArr5[i18];
                                        double d18 = dArr5[i17];
                                        double dOooO00o4 = OooO0OO.OooO00o(d18, 5.0d, d17, 6.0d);
                                        double[] dArr6 = this.f7668h4;
                                        double d19 = dArr6[i18];
                                        double d20 = dArr6[i17];
                                        double dOooO00o5 = OooO0OO.OooO00o(d20, 5.0d, d19, 6.0d);
                                        i17++;
                                        double d21 = dArr5[i17];
                                        double d22 = dArr6[i17];
                                        c2324unM10362k43.m11513k4(new C2264qn(dOooO00o4, dOooO00o5, ((d18 * 5.0d) + d21) / 6.0d, ((d20 * 5.0d) + d22) / 6.0d, (d18 + d21) / 2.0d, (d20 + d22) / 2.0d));
                                    }
                                    double d23 = this.f7666du[i3];
                                    double d24 = this.f7668h4[i3];
                                    C2324un c2324unM10362k44 = c2046dg.m10362k4();
                                    double[] dArr7 = this.f7666du;
                                    double d25 = dArr7[i6];
                                    double d26 = dArr7[i16];
                                    double dOooO00o6 = OooO0OO.OooO00o(d26, 5.0d, d25, 6.0d);
                                    double[] dArr8 = this.f7668h4;
                                    double d27 = dArr8[i6];
                                    double d28 = dArr8[i16];
                                    c2324unM10362k44.m11513k4(new C2264qn(dOooO00o6, OooO0OO.OooO00o(d28, 5.0d, d27, 6.0d), ((d26 * 2.0d) + dArr7[i3]) / 3.0d, ((d28 * 2.0d) + dArr8[i3]) / 3.0d, d23, d24));
                                } else {
                                    c2046dg = c2046dgMo10695k4;
                                    C2324un c2324unM10362k45 = c2046dg.m10362k4();
                                    double[] dArr9 = this.f7666du;
                                    double d29 = dArr9[i13];
                                    double d30 = dArr9[i11];
                                    double dOooO00o7 = OooO0OO.OooO00o(d30, 2.0d, d29, 3.0d);
                                    double[] dArr10 = this.f7668h4;
                                    double d31 = dArr10[i13];
                                    double d32 = dArr10[i11];
                                    double dOooO00o8 = OooO0OO.OooO00o(d32, 2.0d, d31, 3.0d);
                                    int i19 = i11 + 1;
                                    double d33 = dArr9[i19];
                                    double d34 = dArr10[i19];
                                    c2324unM10362k45.m11513k4(new C2264qn(dOooO00o7, dOooO00o8, ((d30 * 5.0d) + d33) / 6.0d, ((d32 * 5.0d) + d34) / 6.0d, (d30 + d33) / 2.0d, (d32 + d34) / 2.0d));
                                    C2324un c2324unM10362k46 = c2046dg.m10362k4();
                                    double[] dArr11 = this.f7666du;
                                    double d35 = dArr11[i11];
                                    double d36 = dArr11[i19];
                                    double dOooO00o9 = OooO0OO.OooO00o(d36, 5.0d, d35, 6.0d);
                                    double[] dArr12 = this.f7668h4;
                                    double d37 = dArr12[i11];
                                    double d38 = dArr12[i19];
                                    double dOooO00o10 = OooO0OO.OooO00o(d38, 5.0d, d37, 6.0d);
                                    int i20 = i11 + 2;
                                    double d39 = dArr11[i20];
                                    double d40 = dArr12[i20];
                                    c2324unM10362k46.m11513k4(new C2264qn(dOooO00o9, dOooO00o10, ((d36 * 5.0d) + d39) / 6.0d, ((d38 * 5.0d) + d40) / 6.0d, (d39 + d36) / 2.0d, (d40 + d38) / 2.0d));
                                    double d41 = this.f7666du[i3];
                                    double d42 = this.f7668h4[i3];
                                    C2324un c2324unM10362k47 = c2046dg.m10362k4();
                                    double[] dArr13 = this.f7666du;
                                    double d43 = dArr13[i19];
                                    double d44 = dArr13[i20];
                                    double dOooO00o11 = OooO0OO.OooO00o(d44, 5.0d, d43, 6.0d);
                                    double[] dArr14 = this.f7668h4;
                                    double d45 = dArr14[i19];
                                    double d46 = dArr14[i20];
                                    c2324unM10362k47.m11513k4(new C2264qn(dOooO00o11, OooO0OO.OooO00o(d46, 5.0d, d45, 6.0d), ((d44 * 2.0d) + dArr13[i3]) / 3.0d, ((d46 * 2.0d) + dArr14[i3]) / 3.0d, d41, d42));
                                }
                                i4 = i8;
                                i5 = i9;
                            } else {
                                c2046dg = c2046dgMo10695k4;
                                double d47 = this.f7666du[i3];
                                double d48 = this.f7668h4[i3];
                                c2324unM10362k4 = c2046dg.m10362k4();
                                double[] dArr15 = this.f7666du;
                                i4 = i8;
                                i5 = i9;
                                double dOooO00o12 = OooO0OO.OooO00o(dArr15[i11], 4.0d, -dArr15[i13], 3.0d);
                                double[] dArr16 = this.f7668h4;
                                double dOooO00o13 = OooO0OO.OooO00o(dArr16[i11], 4.0d, -dArr16[i13], 3.0d);
                                int i21 = i11 + 1;
                                double d49 = dArr15[i21] * 4.0d;
                                double d50 = dArr15[i3];
                                double d51 = (d49 - d50) / 3.0d;
                                double d52 = dArr16[i21] * 4.0d;
                                double d53 = dArr16[i3];
                                c2264qn = new C2264qn(dOooO00o12, dOooO00o13, d51, (d52 - d53) / 3.0d, d50, d53);
                            }
                            c2324unM10362k4.m11513k4(c2264qn);
                        } else {
                            c2046dg = c2046dgMo10695k4;
                            i4 = i8;
                            i5 = i9;
                            c2046dg.m10362k4().m11513k4(new C2090fu(this.f7666du[i3], this.f7668h4[i3]));
                        }
                        i11 = i14;
                        b2 = 1;
                    }
                    i11++;
                    i8 = i4;
                    b = b2;
                    i10 = i2;
                    i9 = i5;
                    c2046dgMo10695k4 = c2046dg;
                }
            }
            C2046dg c2046dg2 = c2046dgMo10695k4;
            i8 = i & 65535;
            c2046dg2.m10362k4().m11513k4(new C2387yg(d3, d4));
            i9++;
            c2046dgMo10695k4 = c2046dg2;
        }
        return c2046dgMo10695k4;
    }

    /* JADX INFO: renamed from: to */
    public final C2216ni m11178to() {
        C2216ni c2216ni = new C2216ni();
        c2216ni.f7673x1 = new int[this.f7673x1.length];
        c2216ni.f7670kk = new byte[this.f7670kk.length];
        c2216ni.f7666du = new double[this.f7666du.length];
        c2216ni.f7668h4 = new double[this.f7668h4.length];
        c2216ni.f7665c5 = new byte[this.f7665c5.length];
        c2216ni.f7671m9 = new boolean[this.f7671m9.length];
        c2216ni.f7667dy = new boolean[this.f7667dy.length];
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) this.f7673x1), 0, AbstractC14092to.m67208k4((Object) c2216ni.f7673x1), 0, this.f7673x1.length * 2);
        C14058fa.m66593k4(AbstractC14092to.m67208k4((Object) this.f7670kk), 0, AbstractC14092to.m67208k4((Object) c2216ni.f7670kk), 0, this.f7670kk.length);
        C14058fa.m66593k4(AbstractC14092to.m67208k4(this.f7666du), 0, AbstractC14092to.m67208k4(c2216ni.f7666du), 0, this.f7666du.length * 8);
        C14058fa.m66593k4(AbstractC14092to.m67208k4(this.f7668h4), 0, AbstractC14092to.m67208k4(c2216ni.f7668h4), 0, this.f7668h4.length * 8);
        C14058fa.m66593k4(AbstractC14092to.m67208k4(this.f7671m9), 0, AbstractC14092to.m67208k4(c2216ni.f7671m9), 0, this.f7671m9.length);
        C14058fa.m66593k4(AbstractC14092to.m67208k4(this.f7667dy), 0, AbstractC14092to.m67208k4(c2216ni.f7667dy), 0, this.f7667dy.length);
        c2216ni.f7672to = this.f7672to;
        c2216ni.f7669k4 = this.f7669k4;
        return c2216ni;
    }
}
