package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14044b3;

/* JADX INFO: renamed from: com.aspose.slides.gw */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC1164gw extends AbstractC14770x9 {

    /* JADX INFO: renamed from: du */
    private double f5350du;

    /* JADX INFO: renamed from: k4 */
    private C14177nd f5351k4;

    /* JADX INFO: renamed from: kk */
    private C0886d8 f5352kk;

    /* JADX INFO: renamed from: to */
    private double f5353to;

    /* JADX INFO: renamed from: x1 */
    private klm f5354x1;

    public AbstractC1164gw(C0886d8 c0886d8) {
        m6921k4(c0886d8);
        m6920k4(m6926yj().m4989k4());
        m6924x1(m6926yj().m5015x1());
        mo63967x1(c0886d8.m5012up().m64945h4().getChart().getDisplayBlanksAs() == 2 || !m6926yj().m4983dy());
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: V_ */
    public void mo3030V_() {
        if (mo3221T_()) {
            m6926yj().m4988jd().m587k4(m73227xk() - m6926yj().m5012up().m64941c5().m69834fa().getX());
            m6926yj().m4988jd().m600x1(m73206c6() - m6926yj().m5012up().m64941c5().m69834fa().getY());
            m6926yj().m4988jd().m591kk(m73225wy());
            m6926yj().m4988jd().m597to(m73203ak());
        }
    }

    /* JADX INFO: renamed from: ck */
    public final klm m6917ck() {
        return this.f5354x1;
    }

    /* JADX INFO: renamed from: fa */
    public final double m6918fa() {
        return this.f5350du;
    }

    /* JADX INFO: renamed from: jd */
    public final C14177nd m6919jd() {
        return this.f5351k4;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract C12025x6 mo3519k4();

    /* JADX INFO: renamed from: k4 */
    public abstract C12025x6 mo3520k4(C14177nd c14177nd);

    /* JADX INFO: renamed from: k4 */
    public final void m6920k4(double d) {
        this.f5350du = d;
    }

    /* JADX INFO: renamed from: up */
    public double m6923up() {
        if (m73228yd() != null && C7019kk.m27469x1(m73228yd(), fml.class)) {
            fml fmlVar = (fml) m73228yd();
            if (ChartTypeCharacterizer.isSeriesUsesXValueCoordinate(fmlVar.m6220yj().m64945h4().getType()) && fmlVar.m6216ks().f45392kk != null && C7019kk.m27469x1(fmlVar.m6216ks().f45392kk, AbstractC14265p3.class) && C14044b3.m66437kk(this.f5353to)) {
                return ((double) fmlVar.f5072x1.indexOf(this)) + 1.0d;
            }
        }
        return this.f5353to;
    }

    /* JADX INFO: renamed from: x1 */
    public void m6924x1(double d) {
        this.f5353to = d;
    }

    /* JADX INFO: renamed from: yj */
    public final C0886d8 m6926yj() {
        return this.f5352kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6921k4(C0886d8 c0886d8) {
        this.f5352kk = c0886d8;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m6925x1(C14177nd c14177nd) {
        this.f5351k4 = c14177nd;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6922k4(klm klmVar) {
        this.f5354x1 = klmVar;
    }
}
