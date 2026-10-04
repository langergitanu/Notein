package com.aspose.slides.internal.p156gw;

import OooO0O0.C20394OooO0Oo;
import OooooOo.C21385OooOOOO;
import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.gw.x1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4416x1 extends AbstractC4388ak {

    /* JADX INFO: renamed from: k4 */
    private int f12128k4;

    /* JADX INFO: renamed from: com.aspose.slides.internal.gw.x1$k4 */
    public static class k4 extends AbstractC4416x1 {

        /* JADX INFO: renamed from: du */
        public double f12129du;

        /* JADX INFO: renamed from: h4 */
        public double f12130h4;

        /* JADX INFO: renamed from: k4 */
        public double f12131k4;

        /* JADX INFO: renamed from: kk */
        public double f12132kk;

        /* JADX INFO: renamed from: to */
        public double f12133to;

        /* JADX INFO: renamed from: x1 */
        public double f12134x1;

        public k4() {
            super(0);
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4388ak
        /* JADX INFO: renamed from: c5 */
        public double mo17781c5() {
            return this.f12132kk;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4388ak
        /* JADX INFO: renamed from: ck */
        public boolean mo17782ck() {
            return this.f12132kk <= 0.0d || this.f12133to <= 0.0d;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4388ak
        /* JADX INFO: renamed from: h4 */
        public double mo17784h4() {
            return this.f12131k4;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4388ak
        /* JADX INFO: renamed from: jd */
        public double mo17785jd() {
            return this.f12133to;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4416x1
        /* JADX INFO: renamed from: k4 */
        public double mo18017k4() {
            return this.f12129du;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4388ak
        /* JADX INFO: renamed from: m9 */
        public double mo17787m9() {
            return this.f12134x1;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4416x1
        /* JADX INFO: renamed from: x1 */
        public double mo18021x1() {
            return this.f12130h4;
        }

        public k4(double d, double d2, double d3, double d4, double d5, double d6, int i) {
            super(i);
            this.f12131k4 = d;
            this.f12134x1 = d2;
            this.f12132kk = d3;
            this.f12133to = d4;
            this.f12129du = d5;
            this.f12130h4 = d6;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4416x1
        /* JADX INFO: renamed from: x1 */
        public C12007ix mo18022x1(double d, double d2, double d3, double d4) {
            return new C12007ix((float) d, (float) d2, (float) d3, (float) d4);
        }
    }

    public AbstractC4416x1() {
        this(0);
    }

    /* JADX INFO: renamed from: k4 */
    public static double m18015k4(double d) {
        if (d > 180.0d) {
            if (d <= 540.0d) {
                return d - 360.0d;
            }
            double dIEEEremainder = Math.IEEEremainder(d, 360.0d);
            if (dIEEEremainder == -180.0d) {
                return 180.0d;
            }
            return dIEEEremainder;
        }
        if (d <= -180.0d) {
            if (d > -540.0d) {
                return d + 360.0d;
            }
            d = Math.IEEEremainder(d, 360.0d);
            if (d == -180.0d) {
                return 180.0d;
            }
        }
        return d;
    }

    /* JADX INFO: renamed from: du */
    public C12025x6 m18016du() {
        double radians = Math.toRadians((-mo18017k4()) - mo18021x1());
        return new C12025x6((float) ((mo17781c5() * C21385OooOOOO.OooO0O0(radians, 0.5d, 0.5d)) + mo17784h4()), (float) ((mo17785jd() * ((Math.sin(radians) * 0.5d) + 0.5d)) + mo17787m9()));
    }

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: dy */
    public C12007ix mo8355dy() {
        double d;
        double dMax;
        double dMo17787m9;
        double dMo17784h4;
        double dMo17781c5;
        double dMo17785jd;
        AbstractC4416x1 abstractC4416x1;
        if (mo17782ck()) {
            dMo17784h4 = mo17784h4();
            dMo17787m9 = mo17787m9();
            dMo17781c5 = mo17781c5();
            dMo17785jd = mo17785jd();
            abstractC4416x1 = this;
        } else {
            if (m18019kk() == 2) {
                d = 0.0d;
                dMax = 0.0d;
            } else {
                d = 1.0d;
                dMax = -1.0d;
            }
            int i = 0;
            double dMin = d;
            double dMax2 = dMax;
            double dMo18017k4 = 0.0d;
            double dMin2 = dMin;
            while (i < 6) {
                if (i < 4) {
                    dMo18017k4 += 90.0d;
                    if (!m18023x1(dMo18017k4)) {
                    }
                    i++;
                } else {
                    dMo18017k4 = i == 4 ? mo18017k4() : dMo18017k4 + mo18021x1();
                }
                double radians = Math.toRadians(-dMo18017k4);
                double dCos = Math.cos(radians);
                double dSin = Math.sin(radians);
                dMin = Math.min(dMin, dCos);
                dMin2 = Math.min(dMin2, dSin);
                dMax2 = Math.max(dMax2, dCos);
                dMax = Math.max(dMax, dSin);
                i++;
            }
            double dMo17781c52 = mo17781c5();
            double dMo17785jd2 = mo17785jd();
            double dOooO0O0 = C20394OooO0Oo.OooO0O0(dMax2, dMin, 0.5d, dMo17781c52);
            double dOooO0O02 = C20394OooO0Oo.OooO0O0(dMax, dMin2, 0.5d, dMo17785jd2);
            double dMo17784h42 = (((dMin * 0.5d) + 0.5d) * dMo17781c52) + mo17784h4();
            dMo17787m9 = (((dMin2 * 0.5d) + 0.5d) * dMo17785jd2) + mo17787m9();
            dMo17784h4 = dMo17784h42;
            dMo17781c5 = dOooO0O0;
            dMo17785jd = dOooO0O02;
            abstractC4416x1 = this;
        }
        return abstractC4416x1.mo18022x1(dMo17784h4, dMo17787m9, dMo17781c5, dMo17785jd);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4416x1) {
            AbstractC4416x1 abstractC4416x1 = (AbstractC4416x1) obj;
            if (mo17784h4() == abstractC4416x1.mo17784h4() && mo17787m9() == abstractC4416x1.mo17787m9() && mo17781c5() == abstractC4416x1.mo17781c5() && mo17785jd() == abstractC4416x1.mo17785jd() && mo18017k4() == abstractC4416x1.mo18017k4() && mo18021x1() == abstractC4416x1.mo18021x1() && m18019kk() == abstractC4416x1.m18019kk()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long jDoubleToLongBits = (Double.doubleToLongBits(mo18021x1()) * 59) + (Double.doubleToLongBits(mo18017k4()) * 53) + (Double.doubleToLongBits(mo17785jd()) * 47) + (Double.doubleToLongBits(mo17781c5()) * 43) + (Double.doubleToLongBits(mo17787m9()) * 37) + Double.doubleToLongBits(mo17784h4()) + ((long) (m18019kk() * 61));
        return ((int) jDoubleToLongBits) ^ ((int) (jDoubleToLongBits >> 32));
    }

    /* JADX INFO: renamed from: k4 */
    public abstract double mo18017k4();

    /* JADX INFO: renamed from: kk */
    public int m18019kk() {
        return this.f12128k4;
    }

    /* JADX INFO: renamed from: to */
    public C12025x6 m18020to() {
        double radians = Math.toRadians(-mo18017k4());
        return new C12025x6((float) ((mo17781c5() * C21385OooOOOO.OooO0O0(radians, 0.5d, 0.5d)) + mo17784h4()), (float) ((mo17785jd() * ((Math.sin(radians) * 0.5d) + 0.5d)) + mo17787m9()));
    }

    /* JADX INFO: renamed from: x1 */
    public abstract double mo18021x1();

    /* JADX INFO: renamed from: x1 */
    public abstract C12007ix mo18022x1(double d, double d2, double d3, double d4);

    /* JADX INFO: renamed from: x1 */
    public boolean m18023x1(double d) {
        double dMo18021x1 = mo18021x1();
        boolean z = dMo18021x1 < 0.0d;
        if (z) {
            dMo18021x1 = -dMo18021x1;
        }
        if (dMo18021x1 >= 360.0d) {
            return true;
        }
        double dM18015k4 = m18015k4(d) - m18015k4(mo18017k4());
        if (z) {
            dM18015k4 = -dM18015k4;
        }
        if (dM18015k4 < 0.0d) {
            dM18015k4 += 360.0d;
        }
        return dM18015k4 >= 0.0d && dM18015k4 < dMo18021x1;
    }

    public AbstractC4416x1(int i) {
        m18018k4(i);
    }

    /* JADX INFO: renamed from: k4 */
    public void m18018k4(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "invalid type for Arc: "));
        }
        this.f12128k4 = i;
    }

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: kk */
    public InterfaceC4413v4 mo8359kk(C11913yj c11913yj) {
        return new C4401kk(this, c11913yj);
    }

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: k4 */
    public boolean mo8357k4(double d, double d2) {
        double dMo17781c5 = mo17781c5();
        if (dMo17781c5 <= 0.0d) {
            return false;
        }
        double dMo17784h4 = ((d - mo17784h4()) / dMo17781c5) - 0.5d;
        double dMo17785jd = mo17785jd();
        if (dMo17785jd <= 0.0d) {
            return false;
        }
        double dMo17787m9 = ((d2 - mo17787m9()) / dMo17785jd) - 0.5d;
        if ((dMo17787m9 * dMo17787m9) + (dMo17784h4 * dMo17784h4) >= 0.25d) {
            return false;
        }
        double dAbs = Math.abs(mo18021x1());
        if (dAbs >= 360.0d) {
            return true;
        }
        boolean zM18023x1 = m18023x1(-Math.toDegrees(Math.atan2(dMo17787m9, dMo17784h4)));
        if (this.f12128k4 == 2) {
            return zM18023x1;
        }
        if (zM18023x1) {
            if (dAbs >= 180.0d) {
                return true;
            }
        } else if (dAbs <= 180.0d) {
            return false;
        }
        double radians = Math.toRadians(-mo18017k4());
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double radians2 = Math.toRadians(-mo18021x1()) + radians;
        double dCos2 = Math.cos(radians2);
        double dSin2 = Math.sin(radians2);
        boolean z = AbstractC4409u4.m17984k4(dCos, dSin, dCos2, dSin2, dMo17784h4 * 2.0d, dMo17787m9 * 2.0d) * AbstractC4409u4.m17984k4(dCos, dSin, dCos2, dSin2, 0.0d, 0.0d) >= 0;
        return zM18023x1 ? !z : z;
    }

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: k4 */
    public boolean mo8358k4(double d, double d2, double d3, double d4) {
        double dMo17781c5 = mo17781c5();
        double dMo17785jd = mo17785jd();
        if (d3 > 0.0d && d4 > 0.0d && dMo17781c5 > 0.0d && dMo17785jd > 0.0d) {
            double dMo18021x1 = mo18021x1();
            if (dMo18021x1 == 0.0d) {
                return false;
            }
            double dMo17784h4 = mo17784h4();
            double dMo17787m9 = mo17787m9();
            double d5 = dMo17784h4 + dMo17781c5;
            double d6 = dMo17787m9 + dMo17785jd;
            double d7 = d + d3;
            double d8 = d2 + d4;
            if (d < d5 && d2 < d6 && d7 > dMo17784h4 && d8 > dMo17787m9) {
                double dM17788rv = m17788rv();
                double dM17790x6 = m17790x6();
                C12025x6 c12025x6M18020to = m18020to();
                C12025x6 c12025x6M18016du = m18016du();
                double dM56897x1 = c12025x6M18020to.m56897x1();
                double dM56895kk = c12025x6M18020to.m56895kk();
                double dM56897x12 = c12025x6M18016du.m56897x1();
                double dM56895kk2 = c12025x6M18016du.m56895kk();
                if (dM17790x6 >= d2 && dM17790x6 <= d8 && ((dM56897x1 < d7 && dM56897x12 < d7 && dM17788rv < d7 && d5 > d && m18023x1(0.0d)) || (dM56897x1 > d && dM56897x12 > d && dM17788rv > d && dMo17784h4 < d7 && m18023x1(180.0d)))) {
                    return true;
                }
                if (dM17788rv >= d && dM17788rv <= d7 && ((dM56895kk > d2 && dM56895kk2 > d2 && dM17790x6 > d2 && dMo17787m9 < d8 && m18023x1(90.0d)) || (dM56895kk < d8 && dM56895kk2 < d8 && dM17790x6 < d8 && d6 > d2 && m18023x1(270.0d)))) {
                    return true;
                }
                C12007ix c12007ix = new C12007ix((float) d, (float) d2, (float) d3, (float) d4);
                if (this.f12128k4 == 2 || Math.abs(dMo18021x1) > 180.0d) {
                    if (!C4405ne.m17968k4(c12007ix, dM17788rv, dM17790x6, dM56897x1, dM56895kk) && !C4405ne.m17968k4(c12007ix, dM17788rv, dM17790x6, dM56897x12, dM56895kk2)) {
                    }
                }
                if (C4405ne.m17968k4(c12007ix, dM56897x1, dM56895kk, dM56897x12, dM56895kk2)) {
                    return true;
                }
                return mo8357k4(d, d2) || mo8357k4(d7, d2) || mo8357k4(d, d8) || mo8357k4(d7, d8);
            }
        }
        return false;
    }
}
