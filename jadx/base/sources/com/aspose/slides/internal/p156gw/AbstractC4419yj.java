package com.aspose.slides.internal.p156gw;

import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12007ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.gw.yj */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4419yj extends AbstractC4388ak {

    /* JADX INFO: renamed from: com.aspose.slides.internal.gw.yj$k4 */
    public static class k4 extends AbstractC4419yj {

        /* JADX INFO: renamed from: k4 */
        public float f12138k4;

        /* JADX INFO: renamed from: kk */
        public float f12139kk;

        /* JADX INFO: renamed from: to */
        public float f12140to;

        /* JADX INFO: renamed from: x1 */
        public float f12141x1;

        public k4() {
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4388ak
        /* JADX INFO: renamed from: c5 */
        public double mo17781c5() {
            return this.f12139kk;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4388ak
        /* JADX INFO: renamed from: ck */
        public boolean mo17782ck() {
            return ((double) this.f12139kk) <= 0.0d || ((double) this.f12140to) <= 0.0d;
        }

        @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
        /* JADX INFO: renamed from: dy */
        public C12007ix mo8355dy() {
            return new C12007ix(this.f12138k4, this.f12141x1, this.f12139kk, this.f12140to);
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4388ak
        /* JADX INFO: renamed from: h4 */
        public double mo17784h4() {
            return this.f12138k4;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4388ak
        /* JADX INFO: renamed from: jd */
        public double mo17785jd() {
            return this.f12140to;
        }

        /* JADX INFO: renamed from: k4 */
        public void m18024k4(float f, float f2, float f3, float f4) {
            this.f12138k4 = f;
            this.f12141x1 = f2;
            this.f12139kk = f3;
            this.f12140to = f4;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4388ak
        /* JADX INFO: renamed from: m9 */
        public double mo17787m9() {
            return this.f12141x1;
        }

        public k4(float f, float f2, float f3, float f4) {
            m18024k4(f, f2, f3, f4);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4419yj) {
            AbstractC4419yj abstractC4419yj = (AbstractC4419yj) obj;
            if (mo17784h4() == abstractC4419yj.mo17784h4() && mo17787m9() == abstractC4419yj.mo17787m9() && mo17781c5() == abstractC4419yj.mo17781c5() && mo17785jd() == abstractC4419yj.mo17785jd()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long jDoubleToLongBits = (Double.doubleToLongBits(mo17785jd()) * 47) + (Double.doubleToLongBits(mo17781c5()) * 43) + (Double.doubleToLongBits(mo17787m9()) * 37) + Double.doubleToLongBits(mo17784h4());
        return ((int) jDoubleToLongBits) ^ ((int) (jDoubleToLongBits >> 32));
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
        return (dMo17787m9 * dMo17787m9) + (dMo17784h4 * dMo17784h4) < 0.25d;
    }

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: kk */
    public InterfaceC4413v4 mo8359kk(C11913yj c11913yj) {
        return new C4402ks(this, c11913yj);
    }

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: k4 */
    public boolean mo8358k4(double d, double d2, double d3, double d4) {
        double d5 = 0.0d;
        if (d3 > 0.0d && d4 > 0.0d) {
            double dMo17781c5 = mo17781c5();
            if (dMo17781c5 <= 0.0d) {
                return false;
            }
            double dMo17784h4 = ((d - mo17784h4()) / dMo17781c5) - 0.5d;
            double d6 = (d3 / dMo17781c5) + dMo17784h4;
            double dMo17785jd = mo17785jd();
            if (dMo17785jd <= 0.0d) {
                return false;
            }
            double dMo17787m9 = ((d2 - mo17787m9()) / dMo17785jd) - 0.5d;
            double d7 = (d4 / dMo17785jd) + dMo17787m9;
            if (dMo17784h4 <= 0.0d) {
                dMo17784h4 = d6 < 0.0d ? d6 : 0.0d;
            }
            if (dMo17787m9 > 0.0d) {
                d5 = dMo17787m9;
            } else if (d7 < 0.0d) {
                d5 = d7;
            }
            if ((d5 * d5) + (dMo17784h4 * dMo17784h4) < 0.25d) {
                return true;
            }
        }
        return false;
    }
}
