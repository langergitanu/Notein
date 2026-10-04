package com.aspose.slides.internal.p156gw;

import Oooo00o.OooO0OO;
import androidx.datastore.preferences.protobuf.C21825OoooOO0;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12007ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.gw.wy */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4415wy extends AbstractC4388ak {

    /* JADX INFO: renamed from: com.aspose.slides.internal.gw.wy$k4 */
    public static class k4 extends AbstractC4415wy {

        /* JADX INFO: renamed from: k4 */
        public double f12120k4;

        /* JADX INFO: renamed from: kk */
        public double f12121kk;

        /* JADX INFO: renamed from: to */
        public double f12122to;

        /* JADX INFO: renamed from: x1 */
        public double f12123x1;

        public k4() {
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4388ak
        /* JADX INFO: renamed from: c5 */
        public double mo17781c5() {
            return this.f12121kk;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4388ak
        /* JADX INFO: renamed from: ck */
        public boolean mo17782ck() {
            return this.f12121kk <= 0.0d || this.f12122to <= 0.0d;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4388ak
        /* JADX INFO: renamed from: h4 */
        public double mo17784h4() {
            return this.f12120k4;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4388ak
        /* JADX INFO: renamed from: jd */
        public double mo17785jd() {
            return this.f12122to;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4415wy
        /* JADX INFO: renamed from: k4 */
        public AbstractC4415wy mo18010k4(AbstractC4415wy abstractC4415wy) {
            k4 k4Var = new k4();
            AbstractC4415wy.m18009k4(this, abstractC4415wy, k4Var);
            return k4Var;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4388ak
        /* JADX INFO: renamed from: m9 */
        public double mo17787m9() {
            return this.f12123x1;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            C21825OoooOO0.OooO0OO(k4.class, sb, "[x=");
            sb.append(this.f12120k4);
            sb.append(",y=");
            sb.append(this.f12123x1);
            sb.append(",w=");
            sb.append(this.f12121kk);
            sb.append(",h=");
            sb.append(this.f12122to);
            sb.append("]");
            return sb.toString();
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4415wy
        /* JADX INFO: renamed from: x1 */
        public void mo18012x1(double d, double d2, double d3, double d4) {
            this.f12120k4 = d;
            this.f12123x1 = d2;
            this.f12121kk = d3;
            this.f12122to = d4;
        }

        public k4(double d, double d2, double d3, double d4) {
            mo18012x1(d, d2, d3, d4);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.gw.wy$x1 */
    public static class x1 extends AbstractC4415wy {

        /* JADX INFO: renamed from: k4 */
        public float f12124k4;

        /* JADX INFO: renamed from: kk */
        public float f12125kk;

        /* JADX INFO: renamed from: to */
        public float f12126to;

        /* JADX INFO: renamed from: x1 */
        public float f12127x1;

        public x1() {
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4388ak
        /* JADX INFO: renamed from: c5 */
        public double mo17781c5() {
            return this.f12125kk;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4388ak
        /* JADX INFO: renamed from: ck */
        public boolean mo17782ck() {
            return this.f12125kk <= 0.0f || this.f12126to <= 0.0f;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4388ak
        /* JADX INFO: renamed from: h4 */
        public double mo17784h4() {
            return this.f12124k4;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4388ak
        /* JADX INFO: renamed from: jd */
        public double mo17785jd() {
            return this.f12126to;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4415wy
        /* JADX INFO: renamed from: k4 */
        public AbstractC4415wy mo18010k4(AbstractC4415wy abstractC4415wy) {
            AbstractC4415wy x1Var = abstractC4415wy instanceof x1 ? new x1() : new k4();
            AbstractC4415wy.m18009k4(this, abstractC4415wy, x1Var);
            return x1Var;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4388ak
        /* JADX INFO: renamed from: m9 */
        public double mo17787m9() {
            return this.f12127x1;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            C21825OoooOO0.OooO0OO(x1.class, sb, "[x=");
            sb.append(this.f12124k4);
            sb.append(",y=");
            sb.append(this.f12127x1);
            sb.append(",w=");
            sb.append(this.f12125kk);
            sb.append(",h=");
            return OooO0OO.OooO0OO(sb, this.f12126to, "]");
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4415wy
        /* JADX INFO: renamed from: x1 */
        public void mo18012x1(double d, double d2, double d3, double d4) {
            this.f12124k4 = (float) d;
            this.f12127x1 = (float) d2;
            this.f12125kk = (float) d3;
            this.f12126to = (float) d4;
        }

        public x1(float f, float f2, float f3, float f4) {
            m18014k4(f, f2, f3, f4);
        }

        /* JADX INFO: renamed from: k4 */
        public void m18014k4(float f, float f2, float f3, float f4) {
            this.f12124k4 = f;
            this.f12127x1 = f2;
            this.f12125kk = f3;
            this.f12126to = f4;
        }
    }

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: dy */
    public C12007ix mo8355dy() {
        return new C12007ix((float) mo17784h4(), (float) mo17787m9(), (float) mo17781c5(), (float) mo17785jd());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4415wy) {
            AbstractC4415wy abstractC4415wy = (AbstractC4415wy) obj;
            if (mo17784h4() == abstractC4415wy.mo17784h4() && mo17787m9() == abstractC4415wy.mo17787m9() && mo17781c5() == abstractC4415wy.mo17781c5() && mo17785jd() == abstractC4415wy.mo17785jd()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long jDoubleToLongBits = (Double.doubleToLongBits(mo17785jd()) * 47) + (Double.doubleToLongBits(mo17781c5()) * 43) + (Double.doubleToLongBits(mo17787m9()) * 37) + Double.doubleToLongBits(mo17784h4());
        return ((int) jDoubleToLongBits) ^ ((int) (jDoubleToLongBits >> 32));
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4388ak, com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: k4 */
    public InterfaceC4413v4 mo8356k4(C11913yj c11913yj, double d) {
        return new C4390b3(this, c11913yj);
    }

    /* JADX INFO: renamed from: k4 */
    public abstract AbstractC4415wy mo18010k4(AbstractC4415wy abstractC4415wy);

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: kk */
    public InterfaceC4413v4 mo8359kk(C11913yj c11913yj) {
        return new C4390b3(this, c11913yj);
    }

    /* JADX INFO: renamed from: x1 */
    public abstract void mo18012x1(double d, double d2, double d3, double d4);

    /* JADX INFO: renamed from: x1 */
    public void m18013x1(AbstractC4415wy abstractC4415wy) {
        double dMin = Math.min(m17783fa(), abstractC4415wy.m17783fa());
        double dMax = Math.max(m17791yj(), abstractC4415wy.m17791yj());
        double dMin2 = Math.min(m17789up(), abstractC4415wy.m17789up());
        mo18012x1(dMin, dMin2, dMax - dMin, Math.max(m17786ks(), abstractC4415wy.m17786ks()) - dMin2);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m18009k4(AbstractC4415wy abstractC4415wy, AbstractC4415wy abstractC4415wy2, AbstractC4415wy abstractC4415wy3) {
        double dMax = Math.max(abstractC4415wy.m17783fa(), abstractC4415wy2.m17783fa());
        double dMax2 = Math.max(abstractC4415wy.m17789up(), abstractC4415wy2.m17789up());
        abstractC4415wy3.m18011kk(dMax, dMax2, Math.min(abstractC4415wy.m17791yj(), abstractC4415wy2.m17791yj()) - dMax, Math.min(abstractC4415wy.m17786ks(), abstractC4415wy2.m17786ks()) - dMax2);
    }

    /* JADX INFO: renamed from: kk */
    public void m18011kk(double d, double d2, double d3, double d4) {
        mo18012x1(d, d2, d3, d4);
    }

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: k4 */
    public boolean mo8357k4(double d, double d2) {
        double dMo17784h4 = mo17784h4();
        double dMo17787m9 = mo17787m9();
        return d >= dMo17784h4 && d2 >= dMo17787m9 && d < mo17781c5() + dMo17784h4 && d2 < mo17785jd() + dMo17787m9;
    }

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: k4 */
    public boolean mo8358k4(double d, double d2, double d3, double d4) {
        if (!mo17782ck() && d3 > 0.0d && d4 > 0.0d) {
            double dMo17784h4 = mo17784h4();
            double dMo17787m9 = mo17787m9();
            if (d3 + d > dMo17784h4 && d4 + d2 > dMo17787m9 && d < mo17781c5() + dMo17784h4 && d2 < mo17785jd() + dMo17787m9) {
                return true;
            }
        }
        return false;
    }
}
