package com.aspose.slides.internal.p156gw;

import androidx.concurrent.futures.OooO00o;
import com.aspose.slides.internal.p475wh.C12007ix;
import java.io.PrintStream;
import java.util.Vector;

/* JADX INFO: renamed from: com.aspose.slides.internal.gw.ck */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4393ck {

    /* JADX INFO: renamed from: k4 */
    protected int f11992k4;

    public AbstractC4393ck(int i) {
        this.f11992k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public static double m17859k4(double d) {
        return d;
    }

    /* JADX INFO: renamed from: c5 */
    public abstract double mo17797c5();

    /* JADX INFO: renamed from: ck */
    public abstract double mo17798ck();

    /* JADX INFO: renamed from: du */
    public abstract double mo17799du();

    /* JADX INFO: renamed from: du */
    public abstract double mo17800du(double d);

    /* JADX INFO: renamed from: dy */
    public abstract double mo17801dy();

    /* JADX INFO: renamed from: fa */
    public abstract double mo17802fa();

    /* JADX INFO: renamed from: h4 */
    public abstract double mo17803h4();

    /* JADX INFO: renamed from: jd */
    public abstract double mo17804jd();

    /* JADX INFO: renamed from: k4 */
    public abstract int mo17805k4(double[] dArr);

    /* JADX INFO: renamed from: k4 */
    public abstract AbstractC4393ck mo17806k4(double d, double d2, int i);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo17807k4(C12007ix c12007ix);

    /* JADX INFO: renamed from: kk */
    public abstract double mo17808kk(double d);

    /* JADX INFO: renamed from: kk */
    public abstract int mo17809kk();

    /* JADX INFO: renamed from: kk */
    public int mo17877kk(double d, double d2) {
        if (d2 < mo17799du() || d2 >= mo17803h4() || d >= mo17801dy()) {
            return 0;
        }
        return (d < mo17810m9() || d < mo17814x1(d2)) ? 1 : 0;
    }

    /* JADX INFO: renamed from: m9 */
    public abstract double mo17810m9();

    /* JADX INFO: renamed from: to */
    public abstract double mo17811to();

    /* JADX INFO: renamed from: to */
    public abstract double mo17812to(double d);

    /* JADX INFO: renamed from: to */
    public boolean m17878to(double d, double d2) {
        return Math.abs(d - d2) < Math.max(Math.abs(d), Math.abs(d2)) * 1.0E-10d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Curve[");
        sb.append(mo17809kk());
        sb.append(", (");
        sb.append(m17859k4(mo17797c5()));
        sb.append(", ");
        sb.append(m17859k4(mo17804jd()));
        sb.append("), ");
        sb.append(mo17816x1());
        sb.append("(");
        sb.append(m17859k4(mo17798ck()));
        sb.append(", ");
        sb.append(m17859k4(mo17802fa()));
        sb.append("), ");
        return OooO00o.OooO0OO(sb, this.f11992k4 == 1 ? "D" : "U", "]");
    }

    /* JADX INFO: renamed from: up */
    public abstract AbstractC4393ck mo17813up();

    /* JADX INFO: renamed from: x1 */
    public abstract double mo17814x1(double d);

    /* JADX INFO: renamed from: x1 */
    public abstract double mo17815x1(double d, double d2);

    /* JADX INFO: renamed from: x1 */
    public String mo17816x1() {
        return "";
    }

    /* JADX INFO: renamed from: x1 */
    public static void m17870x1(Vector vector, double d, double d2, double[] dArr) {
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        int i;
        Vector vector2;
        double d8;
        double d9;
        double[] dArr2;
        double d10 = dArr[5];
        if (d2 > d10) {
            double d11 = dArr[4];
            double d12 = dArr[2];
            d4 = dArr[3];
            d5 = dArr[0];
            d6 = dArr[1];
            i = -1;
            d3 = d12;
            d8 = d11;
            vector2 = vector;
            d7 = d;
            dArr2 = dArr;
            d9 = d10;
            d10 = d2;
        } else {
            if (d2 == d10 && d2 == dArr[1] && d2 == dArr[3]) {
                return;
            }
            d3 = dArr[0];
            d4 = dArr[1];
            d5 = dArr[2];
            d6 = dArr[3];
            d7 = dArr[4];
            i = 1;
            vector2 = vector;
            d8 = d;
            d9 = d2;
            dArr2 = dArr;
        }
        C4410um.m17994k4(vector2, dArr2, d8, d9, d3, d4, d5, d6, d7, d10, i);
    }

    /* JADX INFO: renamed from: k4 */
    public double m17871k4(double d, double d2, double d3) {
        double d4 = 1.0d;
        while (true) {
            double d5 = (d + d4) / 2.0d;
            if (d5 != d && d5 != d4) {
                double dMo17800du = mo17800du(d5);
                if (dMo17800du >= d3) {
                    if (dMo17800du <= d3) {
                        break;
                    }
                    d4 = d5;
                } else {
                    d = d5;
                }
            } else {
                break;
            }
        }
        return d4;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m17872k4() {
        return this.f11992k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m17860k4(double d, double d2) {
        if (d < d2) {
            return -1;
        }
        return d > d2 ? 1 : 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m17861k4(double d, double d2, double d3, double d4, double d5, double d6) {
        if (d2 < d4 && d2 < d6) {
            return 0;
        }
        if (d2 >= d4 && d2 >= d6) {
            return 0;
        }
        if (d >= d3 && d >= d5) {
            return 0;
        }
        if (d < d3 && d < d5) {
            return d4 < d6 ? 1 : -1;
        }
        if (d >= (((d5 - d3) * (d2 - d4)) / (d6 - d4)) + d3) {
            return 0;
        }
        return d4 < d6 ? 1 : -1;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m17862k4(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, int i) {
        if (d2 < d4 && d2 < d6 && d2 < d8 && d2 < d10) {
            return 0;
        }
        if (d2 >= d4 && d2 >= d6 && d2 >= d8 && d2 >= d10) {
            return 0;
        }
        if (d >= d3 && d >= d5 && d >= d7 && d >= d9) {
            return 0;
        }
        if (d < d3 && d < d5 && d < d7 && d < d9) {
            if (d2 >= d4) {
                if (d2 < d10) {
                    return 1;
                }
            } else if (d2 >= d10) {
                return -1;
            }
            return 0;
        }
        if (i > 52) {
            return m17861k4(d, d2, d3, d4, d9, d10);
        }
        double d11 = (d5 + d7) / 2.0d;
        double d12 = (d6 + d8) / 2.0d;
        double d13 = (d3 + d5) / 2.0d;
        double d14 = (d4 + d6) / 2.0d;
        double d15 = (d7 + d9) / 2.0d;
        double d16 = (d8 + d10) / 2.0d;
        double d17 = (d13 + d11) / 2.0d;
        double d18 = (d14 + d12) / 2.0d;
        double d19 = (d11 + d15) / 2.0d;
        double d20 = (d12 + d16) / 2.0d;
        double d21 = (d17 + d19) / 2.0d;
        double d22 = (d18 + d20) / 2.0d;
        if (Double.isNaN(d21) || Double.isNaN(d22)) {
            return 0;
        }
        int i2 = i + 1;
        return m17862k4(d, d2, d3, d4, d13, d14, d17, d18, d21, d22, i2) + m17862k4(d, d2, d21, d22, d19, d20, d15, d16, d9, d10, i2);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m17863k4(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i) {
        if (d2 < d4 && d2 < d6 && d2 < d8) {
            return 0;
        }
        if (d2 >= d4 && d2 >= d6 && d2 >= d8) {
            return 0;
        }
        if (d >= d3 && d >= d5 && d >= d7) {
            return 0;
        }
        if (d < d3 && d < d5 && d < d7) {
            if (d2 >= d4) {
                if (d2 < d8) {
                    return 1;
                }
            } else if (d2 >= d8) {
                return -1;
            }
            return 0;
        }
        if (i > 52) {
            return m17861k4(d, d2, d3, d4, d7, d8);
        }
        double d9 = (d3 + d5) / 2.0d;
        double d10 = (d4 + d6) / 2.0d;
        double d11 = (d5 + d7) / 2.0d;
        double d12 = (d6 + d8) / 2.0d;
        double d13 = (d9 + d11) / 2.0d;
        double d14 = (d10 + d12) / 2.0d;
        if (Double.isNaN(d13) || Double.isNaN(d14)) {
            return 0;
        }
        int i2 = i + 1;
        return m17863k4(d, d2, d3, d4, d9, d10, d13, d14, i2) + m17863k4(d, d2, d13, d14, d11, d12, d7, d8, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a0  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m17864k4(int i, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        double d9;
        double d10;
        double d11;
        double d12;
        if (d6 >= d4 && d8 >= d4) {
            return i;
        }
        if (d6 <= d2 && d8 <= d2) {
            return i;
        }
        if (d5 <= d && d7 <= d) {
            return i;
        }
        if (d5 >= d3 && d7 >= d3) {
            if (d6 < d8) {
                if (d6 <= d2) {
                    i++;
                }
                return d8 >= d4 ? i + 1 : i;
            }
            if (d8 >= d6) {
                return i;
            }
            if (d8 <= d2) {
                i--;
            }
            return d6 >= d4 ? i - 1 : i;
        }
        if ((d5 > d && d5 < d3 && d6 > d2 && d6 < d4) || (d7 > d && d7 < d3 && d8 > d2 && d8 < d4)) {
            return Integer.MIN_VALUE;
        }
        if (d6 < d2) {
            d10 = d2 - d6;
        } else {
            if (d6 <= d4) {
                d9 = d5;
                if (d8 >= d2) {
                    d12 = d2 - d8;
                } else {
                    if (d8 <= d4) {
                        d11 = d7;
                        if (d9 > d && d11 <= d) {
                            return i;
                        }
                        if (d9 >= d3 || d11 < d3) {
                            return Integer.MIN_VALUE;
                        }
                        if (d6 < d8) {
                            if (d6 <= d2) {
                                i++;
                            }
                            return d8 >= d4 ? i + 1 : i;
                        }
                        if (d8 >= d6) {
                            return i;
                        }
                        if (d8 <= d2) {
                            i--;
                        }
                        return d6 >= d4 ? i - 1 : i;
                    }
                    d12 = d4 - d8;
                }
                d11 = (((d5 - d7) * d12) / (d6 - d8)) + d7;
                if (d9 > d) {
                }
                if (d9 >= d3) {
                }
                return Integer.MIN_VALUE;
            }
            d10 = d4 - d6;
        }
        d9 = (((d7 - d5) * d10) / (d8 - d6)) + d5;
        if (d8 >= d2) {
        }
        d11 = (((d5 - d7) * d12) / (d6 - d8)) + d7;
        if (d9 > d) {
        }
        if (d9 >= d3) {
        }
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m17865k4(int i, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, int i2) {
        if ((d6 < d4 || d8 < d4 || d10 < d4 || d12 < d4) && ((d6 > d2 || d8 > d2 || d10 > d2 || d12 > d2) && (d5 > d || d7 > d || d9 > d || d11 > d))) {
            if (d5 < d3 || d7 < d3 || d9 < d3 || d11 < d3) {
                if ((d5 > d && d5 < d3 && d6 > d2 && d6 < d4) || (d11 > d && d11 < d3 && d12 > d2 && d12 < d4)) {
                    return Integer.MIN_VALUE;
                }
                if (i2 > 52) {
                    return m17864k4(i, d, d2, d3, d4, d5, d6, d11, d12);
                }
                double d13 = (d7 + d9) / 2.0d;
                double d14 = (d8 + d10) / 2.0d;
                double d15 = (d5 + d7) / 2.0d;
                double d16 = (d6 + d8) / 2.0d;
                double d17 = (d9 + d11) / 2.0d;
                double d18 = (d10 + d12) / 2.0d;
                double d19 = (d15 + d13) / 2.0d;
                double d20 = (d16 + d14) / 2.0d;
                double d21 = (d13 + d17) / 2.0d;
                double d22 = (d14 + d18) / 2.0d;
                double d23 = (d19 + d21) / 2.0d;
                double d24 = (d20 + d22) / 2.0d;
                if (Double.isNaN(d23) || Double.isNaN(d24)) {
                    return 0;
                }
                int i3 = i2 + 1;
                int iM17865k4 = m17865k4(i, d, d2, d3, d4, d5, d6, d15, d16, d19, d20, d23, d24, i3);
                return iM17865k4 != Integer.MIN_VALUE ? m17865k4(iM17865k4, d, d2, d3, d4, d23, d24, d21, d22, d17, d18, d11, d12, i3) : iM17865k4;
            }
            if (d6 < d12) {
                int i4 = (d6 > d2 || d12 <= d2) ? i : i + 1;
                return (d6 >= d4 || d12 < d4) ? i4 : i4 + 1;
            }
            if (d12 < d6) {
                int i5 = (d12 > d2 || d6 <= d2) ? i : i - 1;
                return (d12 >= d4 || d6 < d4) ? i5 : i5 - 1;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m17866k4(int i, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, int i2) {
        if ((d6 < d4 || d8 < d4 || d10 < d4) && ((d6 > d2 || d8 > d2 || d10 > d2) && (d5 > d || d7 > d || d9 > d))) {
            if (d5 < d3 || d7 < d3 || d9 < d3) {
                if ((d5 < d3 && d5 > d && d6 < d4 && d6 > d2) || (d9 < d3 && d9 > d && d10 < d4 && d10 > d2)) {
                    return Integer.MIN_VALUE;
                }
                if (i2 > 52) {
                    return m17864k4(i, d, d2, d3, d4, d5, d6, d9, d10);
                }
                double d11 = (d5 + d7) / 2.0d;
                double d12 = (d6 + d8) / 2.0d;
                double d13 = (d7 + d9) / 2.0d;
                double d14 = (d8 + d10) / 2.0d;
                double d15 = (d11 + d13) / 2.0d;
                double d16 = (d12 + d14) / 2.0d;
                if (Double.isNaN(d15) || Double.isNaN(d16)) {
                    return 0;
                }
                int i3 = i2 + 1;
                int iM17866k4 = m17866k4(i, d, d2, d3, d4, d5, d6, d11, d12, d15, d16, i3);
                return iM17866k4 != Integer.MIN_VALUE ? m17866k4(iM17866k4, d, d2, d3, d4, d15, d16, d13, d14, d9, d10, i3) : iM17866k4;
            }
            if (d6 < d10) {
                int i4 = (d6 > d2 || d10 <= d2) ? i : i + 1;
                return (d6 >= d4 || d10 < d4) ? i4 : i4 + 1;
            }
            if (d10 < d6) {
                int i5 = (d10 > d2 || d6 <= d2) ? i : i - 1;
                return (d10 >= d4 || d6 < d4) ? i5 : i5 - 1;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: k4 */
    public int mo17873k4(AbstractC4393ck abstractC4393ck, double[] dArr) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        AbstractC4393ck abstractC4393ck2;
        AbstractC4393ck abstractC4393ck3;
        AbstractC4393ck abstractC4393ck4 = abstractC4393ck;
        double d7 = dArr[0];
        double dMin = Math.min(Math.min(dArr[1], mo17803h4()), abstractC4393ck4.mo17803h4());
        if (dMin <= dArr[0]) {
            System.err.println("this == " + this);
            System.err.println("that == " + abstractC4393ck4);
            System.out.println("target range = " + dArr[0] + "=>" + dArr[1]);
            throw new InternalError("backstepping from " + dArr[0] + " to " + dMin);
        }
        dArr[1] = dMin;
        if (mo17801dy() <= abstractC4393ck4.mo17810m9()) {
            return mo17810m9() == abstractC4393ck4.mo17801dy() ? 0 : -1;
        }
        if (mo17810m9() >= abstractC4393ck4.mo17801dy()) {
            return 1;
        }
        double dMo17808kk = mo17808kk(d7);
        double dMo17800du = mo17800du(dMo17808kk);
        if (dMo17800du < d7) {
            dMo17808kk = m17871k4(dMo17808kk, dMo17800du, d7);
            dMo17800du = mo17800du(dMo17808kk);
        }
        double d8 = dMo17808kk;
        double d9 = dMo17800du;
        double dMo17808kk2 = mo17808kk(dMin);
        if (mo17800du(dMo17808kk2) < d7) {
            dMo17808kk2 = m17871k4(dMo17808kk2, mo17800du(dMo17808kk2), d7);
        }
        AbstractC4393ck abstractC4393ck5 = this;
        double d10 = dMo17808kk2;
        double dMo17808kk3 = abstractC4393ck4.mo17808kk(d7);
        double dMo17800du2 = abstractC4393ck4.mo17800du(dMo17808kk3);
        if (dMo17800du2 < d7) {
            d = d9;
            d2 = d10;
            dMo17808kk3 = abstractC4393ck4.m17871k4(dMo17808kk3, dMo17800du2, d7);
            dMo17800du2 = abstractC4393ck4.mo17800du(dMo17808kk3);
        } else {
            d = d9;
            d2 = d10;
        }
        double d11 = dMo17800du2;
        double dMo17808kk4 = abstractC4393ck4.mo17808kk(dMin);
        if (abstractC4393ck4.mo17800du(dMo17808kk4) < d7) {
            d3 = dMin;
            d4 = dMo17808kk3;
            dMo17808kk4 = abstractC4393ck4.m17871k4(dMo17808kk4, abstractC4393ck4.mo17800du(dMo17808kk4), d7);
        } else {
            d3 = dMin;
            d4 = dMo17808kk3;
        }
        double d12 = dMo17808kk4;
        double dMo17812to = abstractC4393ck5.mo17812to(d8);
        double dMo17812to2 = abstractC4393ck4.mo17812to(d4);
        double d13 = d4;
        String str = "=>";
        double dMax = Math.max(Math.max(Math.abs(d7), Math.abs(d3)) * 1.0E-14d, 1.0E-300d);
        if (abstractC4393ck5.m17878to(dMo17812to, dMo17812to2)) {
            d5 = dMo17812to;
            double dMin2 = Math.min(1.0E13d * dMax, (d3 - d7) * 0.1d);
            double d14 = d7 + dMax;
            double d15 = dMax;
            while (true) {
                if (d14 > d3) {
                    d6 = dMo17812to2;
                    break;
                }
                double d16 = dMin2;
                d6 = dMo17812to2;
                if (abstractC4393ck5.m17878to(abstractC4393ck5.mo17814x1(d14), abstractC4393ck4.mo17814x1(d14))) {
                    d15 *= 2.0d;
                    if (d15 > d16) {
                        d15 = d16;
                    }
                    d14 += d15;
                    dMin2 = d16;
                    dMo17812to2 = d6;
                } else {
                    d14 -= d15;
                    while (true) {
                        d15 /= 2.0d;
                        double d17 = d14 + d15;
                        if (d17 <= d14) {
                            break;
                        }
                        d14 = abstractC4393ck5.m17878to(abstractC4393ck5.mo17814x1(d17), abstractC4393ck4.mo17814x1(d17)) ? d17 : d14;
                    }
                }
            }
            if (d14 > d7) {
                if (d14 < d3) {
                    dArr[1] = d14;
                }
                return 0;
            }
        } else {
            d5 = dMo17812to;
            d6 = dMo17812to2;
        }
        if (dMax <= 0.0d) {
            System.out.println("ymin = " + dMax);
        }
        double d18 = dMax;
        double d19 = d13;
        double d20 = d8;
        double d21 = d5;
        double d22 = d6;
        while (d20 < d2 && d19 < d12) {
            double d23 = d18;
            double dMo17815x1 = abstractC4393ck5.mo17815x1(d20, d2);
            double d24 = d2;
            double d25 = d;
            double dMo17812to3 = abstractC4393ck5.mo17812to(dMo17815x1);
            double dMo17800du3 = abstractC4393ck5.mo17800du(dMo17815x1);
            double dMo17815x12 = abstractC4393ck4.mo17815x1(d19, d12);
            String str2 = str;
            double d26 = d11;
            double dMo17812to4 = abstractC4393ck4.mo17812to(dMo17815x12);
            double dMo17800du4 = abstractC4393ck4.mo17800du(dMo17815x12);
            d18 = d23;
            double d27 = d12;
            abstractC4393ck3 = this;
            double d28 = d19;
            abstractC4393ck2 = abstractC4393ck4;
            try {
                boolean zM17875k4 = abstractC4393ck3.m17875k4(abstractC4393ck2, dArr, d18, 0, 0, d20, d21, d25, dMo17815x1, dMo17812to3, dMo17800du3, d28, d22, d26, dMo17815x12, dMo17812to4, dMo17800du4);
                double d29 = d20;
                double d30 = d21;
                if (zM17875k4) {
                    break;
                }
                if (dMo17800du3 < dMo17800du4) {
                    if (dMo17800du3 <= dArr[0]) {
                        d21 = dMo17812to3;
                        d = dMo17800du3;
                        d20 = dMo17815x1;
                        d11 = d26;
                        str = str2;
                        abstractC4393ck5 = abstractC4393ck3;
                        abstractC4393ck4 = abstractC4393ck2;
                        d19 = d28;
                        d2 = d24;
                        d12 = d27;
                    } else if (dMo17800du3 < dArr[1]) {
                        dArr[1] = dMo17800du3;
                    }
                } else if (dMo17800du4 <= dArr[0]) {
                    d11 = dMo17800du4;
                    d = d25;
                    d20 = d29;
                    d21 = d30;
                    d28 = dMo17815x12;
                    d22 = dMo17812to4;
                    str = str2;
                    abstractC4393ck5 = abstractC4393ck3;
                    abstractC4393ck4 = abstractC4393ck2;
                    d19 = d28;
                    d2 = d24;
                    d12 = d27;
                } else if (dMo17800du4 < dArr[1]) {
                    dArr[1] = dMo17800du4;
                }
            } catch (Throwable th) {
                System.err.println("Error: " + th);
                System.err.println("y range was " + dArr[0] + str2 + dArr[1]);
                System.err.println("s y range is " + d25 + str2 + dMo17800du3);
                System.err.println("t y range is " + d26 + str2 + dMo17800du4);
                PrintStream printStream = System.err;
                StringBuilder sb = new StringBuilder("ymin is ");
                sb.append(d18);
                printStream.println(sb.toString());
                return 0;
            }
        }
        abstractC4393ck2 = abstractC4393ck4;
        abstractC4393ck3 = abstractC4393ck5;
        double d31 = (dArr[0] + dArr[1]) / 2.0d;
        return m17860k4(abstractC4393ck3.mo17814x1(d31), abstractC4393ck2.mo17814x1(d31));
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC4393ck m17874k4(int i) {
        return this.f11992k4 == i ? this : mo17813up();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m17867k4(Vector vector, double d, double d2) {
        vector.add(new C4414wl(d, d2));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m17868k4(Vector vector, double d, double d2, double d3, double d4) {
        if (d2 < d4) {
            vector.add(new C4406qq(d, d2, d3, d4, 1));
        } else if (d2 > d4) {
            vector.add(new C4406qq(d3, d4, d, d2, -1));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m17869k4(Vector vector, double d, double d2, double[] dArr) {
        double d3;
        double d4;
        double d5;
        int i;
        Vector vector2;
        double d6;
        double d7;
        double[] dArr2;
        double d8 = dArr[3];
        if (d2 > d8) {
            double d9 = dArr[2];
            d3 = dArr[0];
            d4 = dArr[1];
            i = -1;
            vector2 = vector;
            d5 = d;
            dArr2 = dArr;
            d6 = d9;
            d7 = d8;
            d8 = d2;
        } else {
            if (d2 == d8 && d2 == dArr[1]) {
                return;
            }
            d3 = dArr[0];
            d4 = dArr[1];
            d5 = dArr[2];
            i = 1;
            vector2 = vector;
            d6 = d;
            d7 = d2;
            dArr2 = dArr;
        }
        C4389ar.m17795k4(vector2, dArr2, d6, d7, d3, d4, d5, d8, i);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m17875k4(AbstractC4393ck abstractC4393ck, double[] dArr, double d, int i, int i2, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13) {
        double d14;
        double d15;
        double d16;
        double d17;
        if (d4 <= d13 && d10 <= d7 && Math.min(d3, d6) <= Math.max(d9, d12) && Math.max(d3, d6) >= Math.min(d9, d12)) {
            double d18 = d5 - d2;
            if (d18 > 0.001d) {
                double d19 = (d2 + d5) / 2.0d;
                double dMo17812to = mo17812to(d19);
                double dMo17800du = mo17800du(d19);
                if (d19 == d2 || d19 == d5) {
                    System.out.println("s0 = " + d2);
                    System.out.println("s1 = " + d5);
                    throw new InternalError("no s progress!");
                }
                if (d11 - d8 > 0.001d) {
                    double d20 = (d8 + d11) / 2.0d;
                    double dMo17812to2 = abstractC4393ck.mo17812to(d20);
                    double dMo17800du2 = abstractC4393ck.mo17800du(d20);
                    if (d20 == d8 || d20 == d11) {
                        System.out.println("t0 = " + d8);
                        System.out.println("t1 = " + d11);
                        throw new InternalError("no t progress!");
                    }
                    if (dMo17800du < d10 || dMo17800du2 < d4) {
                        d15 = d20;
                        d16 = d19;
                        d17 = dMo17812to;
                    } else {
                        boolean zM17875k4 = m17875k4(abstractC4393ck, dArr, d, i + 1, i2 + 1, d2, d3, d4, d19, dMo17812to, dMo17800du, d8, d9, d10, d20, dMo17812to2, dMo17800du2);
                        d16 = d19;
                        d17 = dMo17812to;
                        d15 = d20;
                        dMo17812to2 = dMo17812to2;
                        dMo17800du2 = dMo17800du2;
                        if (zM17875k4) {
                            return true;
                        }
                    }
                    if (dMo17800du >= dMo17800du2) {
                        double d21 = d16;
                        double d22 = d17;
                        d16 = d21;
                        d17 = d22;
                        if (m17875k4(abstractC4393ck, dArr, d, i + 1, i2 + 1, d2, d3, d4, d21, d22, dMo17800du, d15, dMo17812to2, dMo17800du2, d11, d12, d13)) {
                            return true;
                        }
                    }
                    if (dMo17800du2 >= dMo17800du) {
                        double d23 = d15;
                        double d24 = dMo17812to2;
                        double d25 = dMo17800du2;
                        boolean zM17875k42 = m17875k4(abstractC4393ck, dArr, d, i + 1, i2 + 1, d16, d17, dMo17800du, d5, d6, d7, d8, d9, d10, d23, d24, d25);
                        dMo17800du = dMo17800du;
                        d15 = d23;
                        dMo17812to2 = d24;
                        dMo17800du2 = d25;
                        if (zM17875k42) {
                            return true;
                        }
                    }
                    if (d7 >= dMo17800du2 && d13 >= dMo17800du && m17875k4(abstractC4393ck, dArr, d, i + 1, i2 + 1, d16, d17, dMo17800du, d5, d6, d7, d15, dMo17812to2, dMo17800du2, d11, d12, d13)) {
                        return true;
                    }
                } else {
                    double d26 = d19;
                    double d27 = dMo17812to;
                    if (dMo17800du >= d10) {
                        boolean zM17875k43 = m17875k4(abstractC4393ck, dArr, d, i + 1, i2, d2, d3, d4, d26, d27, dMo17800du, d8, d9, d10, d11, d12, d13);
                        d26 = d26;
                        d27 = d27;
                        if (zM17875k43) {
                            return true;
                        }
                    }
                    if (d13 >= dMo17800du && m17875k4(abstractC4393ck, dArr, d, i + 1, i2, d26, d27, dMo17800du, d5, d6, d7, d8, d9, d10, d11, d12, d13)) {
                        return true;
                    }
                }
            } else {
                double d28 = d11 - d8;
                if (d28 > 0.001d) {
                    double d29 = (d8 + d11) / 2.0d;
                    double dMo17812to3 = abstractC4393ck.mo17812to(d29);
                    double dMo17800du3 = abstractC4393ck.mo17800du(d29);
                    if (d29 == d8 || d29 == d11) {
                        System.out.println("t0 = " + d8);
                        System.out.println("t1 = " + d11);
                        throw new InternalError("no t progress!");
                    }
                    if (dMo17800du3 >= d4) {
                        boolean zM17875k44 = m17875k4(abstractC4393ck, dArr, d, i, i2 + 1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d29, dMo17812to3, dMo17800du3);
                        d14 = d29;
                        dMo17812to3 = dMo17812to3;
                        dMo17800du3 = dMo17800du3;
                        if (zM17875k44) {
                            return true;
                        }
                    } else {
                        d14 = d29;
                    }
                    if (d7 >= dMo17800du3) {
                        if (m17875k4(abstractC4393ck, dArr, d, i, i2 + 1, d2, d3, d4, d5, d6, d7, d14, dMo17812to3, dMo17800du3, d11, d12, d13)) {
                            return true;
                        }
                    }
                } else {
                    double d30 = d6 - d3;
                    double d31 = d7 - d4;
                    double d32 = d12 - d9;
                    double d33 = d13 - d10;
                    double d34 = d9 - d3;
                    double d35 = d10 - d4;
                    double d36 = (d32 * d31) - (d33 * d30);
                    if (d36 != 0.0d) {
                        double d37 = 1.0d / d36;
                        double d38 = ((d32 * d35) - (d33 * d34)) * d37;
                        double d39 = ((d30 * d35) - (d31 * d34)) * d37;
                        if (d38 >= 0.0d && d38 <= 1.0d && d39 >= 0.0d && d39 <= 1.0d) {
                            double d40 = (d38 * d18) + d2;
                            double d41 = (d39 * d28) + d8;
                            if (d40 < 0.0d || d40 > 1.0d || d41 < 0.0d || d41 > 1.0d) {
                                System.out.println("Uh oh!");
                            }
                            double dMo17800du4 = (abstractC4393ck.mo17800du(d41) + mo17800du(d40)) / 2.0d;
                            if (dMo17800du4 <= dArr[1] && dMo17800du4 > dArr[0]) {
                                dArr[1] = dMo17800du4;
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        return true;
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo17876k4(AbstractC4395dy abstractC4395dy) {
        double d;
        double dMo17815x1;
        double dMo17808kk;
        double d2;
        double dM17884kk = abstractC4395dy.m17884kk();
        if (mo17810m9() >= dM17884kk) {
            return false;
        }
        double dM17881k4 = abstractC4395dy.m17881k4();
        double dM17886x1 = abstractC4395dy.m17886x1();
        double dM17885to = abstractC4395dy.m17885to();
        double dMo17799du = mo17799du();
        double dMo17803h4 = mo17803h4();
        if (dMo17799du < dM17886x1) {
            if (dMo17803h4 <= dM17886x1) {
                return false;
            }
            dMo17815x1 = mo17808kk(dM17886x1);
            d = dM17886x1;
        } else {
            if (dMo17799du >= dM17885to) {
                return false;
            }
            d = dMo17799du;
            dMo17815x1 = 0.0d;
        }
        if (dMo17803h4 > dM17885to) {
            dMo17808kk = mo17808kk(dM17885to);
            d2 = dM17885to;
        } else {
            dMo17808kk = 1.0d;
            d2 = dMo17803h4;
        }
        boolean z = false;
        boolean z2 = false;
        while (true) {
            double dMo17812to = mo17812to(dMo17815x1);
            if (dMo17812to < dM17884kk) {
                if (z2 || dMo17812to > dM17881k4) {
                    break;
                }
                z = true;
            } else {
                if (z) {
                    return true;
                }
                z2 = true;
            }
            if (dMo17815x1 >= dMo17808kk) {
                if (z) {
                    abstractC4395dy.mo17882k4(d, d2, this.f11992k4);
                }
                return false;
            }
            dMo17815x1 = mo17815x1(dMo17815x1, dMo17808kk);
        }
    }
}
