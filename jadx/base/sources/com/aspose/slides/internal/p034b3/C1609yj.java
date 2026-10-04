package com.aspose.slides.internal.p034b3;

import com.aspose.slides.C22201OooO0oO;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p022ai.C1374fa;
import com.aspose.slides.internal.p057c6.C1983k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.b3.yj */
/* JADX INFO: loaded from: classes3.dex */
public class C1609yj {

    /* JADX INFO: renamed from: du */
    private double f6224du;

    /* JADX INFO: renamed from: h4 */
    private double f6225h4;

    /* JADX INFO: renamed from: k4 */
    private double f6226k4;

    /* JADX INFO: renamed from: kk */
    private double f6227kk;

    /* JADX INFO: renamed from: to */
    private double f6228to;

    /* JADX INFO: renamed from: x1 */
    private double f6229x1;

    /* JADX INFO: renamed from: m9 */
    private static final C1609yj f6223m9 = new C1609yj(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: dy */
    private static final C1609yj f6222dy = new C1609yj(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: c5 */
    private static final C1609yj f6221c5 = new C1609yj(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d);

    public C1609yj() {
        this.f6226k4 = 1.0d;
        this.f6229x1 = 0.0d;
        this.f6227kk = 0.0d;
        this.f6228to = 1.0d;
        this.f6224du = 0.0d;
        this.f6225h4 = 0.0d;
    }

    /* JADX INFO: renamed from: k4 */
    public final C1609yj m8690k4(double d, double d2) {
        return m8691k4(new C1609yj(1.0d, 0.0d, 0.0d, 1.0d, d, d2));
    }

    public String toString() {
        return C14113y2.m67408k4("[", C14044b3.m66425h4(this.f6226k4), " ", C14044b3.m66425h4(this.f6229x1), " ", C14044b3.m66425h4(this.f6227kk), " ", C14044b3.m66425h4(this.f6228to), " ", C14044b3.m66425h4(this.f6224du), " ", C14044b3.m66425h4(this.f6225h4), "]");
    }

    /* JADX INFO: renamed from: x1 */
    public final C1609yj m8695x1(double d) {
        double d2;
        double d3;
        double dM67495m9;
        if (d != 90.0d && d != -270.0d) {
            d2 = -1.0d;
            if (d != 270.0d && d != -90.0d) {
                if (d == 180.0d || d == -180.0d) {
                    dM67495m9 = 0.0d;
                    d3 = -1.0d;
                } else {
                    double d4 = 0.017444d * d;
                    double dM67470dy = C14116yg.m67470dy(d4);
                    dM67495m9 = C14116yg.m67495m9(d4);
                    d3 = dM67470dy;
                }
            }
            return m8691k4(new C1609yj(d3, -dM67495m9, dM67495m9, d3, 0.0d, 0.0d));
        }
        d2 = 1.0d;
        d3 = 0.0d;
        dM67495m9 = d2;
        return m8691k4(new C1609yj(d3, -dM67495m9, dM67495m9, d3, 0.0d, 0.0d));
    }

    public C1609yj(double d, double d2) {
        this.f6226k4 = 1.0d;
        this.f6229x1 = 0.0d;
        this.f6227kk = 0.0d;
        this.f6228to = 1.0d;
        this.f6224du = d;
        this.f6225h4 = d2;
    }

    /* JADX INFO: renamed from: k4 */
    public static C1609yj m8688k4(int i, C1374fa c1374fa, C12007ix c12007ix, C1983k4 c1983k4) {
        int iM27462to;
        int iM27462to2;
        double d;
        C1609yj c1609yjM8690k4;
        if (i % 180 == 0) {
            iM27462to2 = C7019kk.m27462to(Float.valueOf(c12007ix.m56550c5()), 13);
            iM27462to = C7019kk.m27462to(Float.valueOf(c12007ix.m56575x1()), 13);
        } else {
            iM27462to = C7019kk.m27462to(Float.valueOf(c12007ix.m56550c5()), 13);
            iM27462to2 = C7019kk.m27462to(Float.valueOf(c12007ix.m56575x1()), 13);
        }
        C1609yj c1609yj = new C1609yj(c12007ix.m56557jd(), c12007ix.m56551ck());
        if (i != 0) {
            double d2 = 0.0d;
            if (i == -270) {
                d = iM27462to2;
                c1609yjM8690k4 = c1609yj.m8690k4(d2, d);
                c1609yj = c1609yjM8690k4.m8695x1(i);
            } else {
                if (i != -180) {
                    if (i != -90) {
                        if (i != 90) {
                            if (i != 180) {
                                if (i != 270) {
                                    throw new Exception();
                                }
                            }
                        }
                        d = iM27462to2;
                        c1609yjM8690k4 = c1609yj.m8690k4(d2, d);
                        c1609yj = c1609yjM8690k4.m8695x1(i);
                    }
                    c1609yjM8690k4 = c1609yj.m8690k4(iM27462to, 0.0d);
                    c1609yj = c1609yjM8690k4.m8695x1(i);
                }
                d2 = iM27462to2;
                d = iM27462to;
                c1609yjM8690k4 = c1609yj.m8690k4(d2, d);
                c1609yj = c1609yjM8690k4.m8695x1(i);
            }
        }
        int iM8127x1 = c1374fa.m8127x1();
        if (iM8127x1 == 140 || iM8127x1 == 205) {
            c1983k4.f6947k4 = iM27462to;
            c1983k4.f6948x1 = iM27462to2;
        } else {
            c1983k4.f6947k4 = iM27462to2;
            c1983k4.f6948x1 = iM27462to;
        }
        return c1609yj.m8691k4(m8689k4(c1374fa, c1983k4.f6947k4, c1983k4.f6948x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final C11913yj m8696x1() {
        double[] dArrM8694k4 = m8694k4();
        return new C11913yj((float) dArrM8694k4[0], (float) dArrM8694k4[1], (float) dArrM8694k4[2], (float) dArrM8694k4[3], (float) dArrM8694k4[4], (float) dArrM8694k4[5]);
    }

    public C1609yj(double d, double d2, double d3, double d4, double d5, double d6) {
        this.f6226k4 = d;
        this.f6229x1 = d2;
        this.f6227kk = d3;
        this.f6228to = d4;
        this.f6224du = d5;
        this.f6225h4 = d6;
    }

    /* JADX INFO: renamed from: k4 */
    public static C1609yj m8689k4(C1374fa c1374fa, int i, int i2) {
        int iM8127x1 = c1374fa.m8127x1();
        if (iM8127x1 == 79) {
            return new C1609yj(f6223m9);
        }
        if (iM8127x1 == 121) {
            return new C1609yj(f6222dy);
        }
        if (iM8127x1 != 140 && iM8127x1 != 205) {
            return null;
        }
        C1609yj c1609yj = new C1609yj(f6221c5);
        c1609yj.f6224du = i2;
        return c1609yj;
    }

    public C1609yj(C1609yj c1609yj) {
        this.f6226k4 = c1609yj.f6226k4;
        this.f6229x1 = c1609yj.f6229x1;
        this.f6227kk = c1609yj.f6227kk;
        this.f6228to = c1609yj.f6228to;
        this.f6224du = c1609yj.f6224du;
        this.f6225h4 = c1609yj.f6225h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C1609yj m8691k4(C1609yj c1609yj) {
        double d = c1609yj.f6226k4;
        double d2 = this.f6226k4;
        double d3 = c1609yj.f6229x1;
        double d4 = this.f6227kk;
        double d5 = (d3 * d4) + (d * d2);
        double d6 = this.f6229x1;
        double d7 = this.f6228to;
        double d8 = d3 * d7;
        double d9 = c1609yj.f6227kk;
        double d10 = d9 * d2;
        double d11 = c1609yj.f6228to;
        double d12 = (d11 * d4) + d10;
        double d13 = (d11 * d7) + (d9 * d6);
        double d14 = c1609yj.f6224du;
        double d15 = c1609yj.f6225h4;
        return new C1609yj(d5, d8 + (d * d6), d12, d13, (d4 * d15) + (d2 * d14) + this.f6224du, (d15 * d7) + (d14 * d6) + this.f6225h4);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12007ix m8692k4(C12007ix c12007ix) {
        int iOooO00o = C22201OooO0oO.OooO00o((((double) c12007ix.m56551ck()) * this.f6227kk) + (((double) c12007ix.m56557jd()) * this.f6226k4), this.f6224du, 14);
        int iOooO00o2 = C22201OooO0oO.OooO00o((((double) c12007ix.m56551ck()) * this.f6228to) + (((double) c12007ix.m56557jd()) * this.f6229x1), this.f6225h4, 14);
        int iOooO00o3 = C22201OooO0oO.OooO00o((((double) (c12007ix.m56575x1() + c12007ix.m56551ck())) * this.f6227kk) + (((double) (c12007ix.m56550c5() + c12007ix.m56557jd())) * this.f6226k4), this.f6224du, 14);
        int iOooO00o4 = C22201OooO0oO.OooO00o((((double) (c12007ix.m56575x1() + c12007ix.m56551ck())) * this.f6228to) + (((double) (c12007ix.m56550c5() + c12007ix.m56557jd())) * this.f6229x1), this.f6225h4, 14);
        if (iOooO00o > iOooO00o3) {
            iOooO00o3 = iOooO00o;
            iOooO00o = iOooO00o3;
        }
        if (iOooO00o2 > iOooO00o4) {
            iOooO00o2 = iOooO00o4;
            iOooO00o4 = iOooO00o2;
        }
        return C12007ix.m56544k4(new C12014ne(iOooO00o, iOooO00o2, iOooO00o3 - iOooO00o, iOooO00o4 - iOooO00o2));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8693k4(double d) {
        this.f6225h4 = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final double[] m8694k4() {
        return new double[]{this.f6226k4, this.f6229x1, this.f6227kk, this.f6228to, this.f6224du, this.f6225h4};
    }
}
