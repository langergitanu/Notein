package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.kv */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC13749kv extends AbstractC14770x9 {

    /* JADX INFO: renamed from: du */
    private double f45880du;

    /* JADX INFO: renamed from: h4 */
    private AbstractC1164gw f45881h4;

    /* JADX INFO: renamed from: to */
    private double f45884to;

    /* JADX INFO: renamed from: k4 */
    protected g2y f45882k4 = new g2y();

    /* JADX INFO: renamed from: x1 */
    protected g2y f45885x1 = new g2y();

    /* JADX INFO: renamed from: kk */
    protected g2y f45883kk = new g2y();

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: O_ */
    public int mo3480O_() {
        return 3;
    }

    /* JADX INFO: renamed from: c5 */
    public final double m64184c5() {
        return this.f45884to;
    }

    /* JADX INFO: renamed from: ck */
    public final AbstractC1164gw m64185ck() {
        return this.f45881h4;
    }

    /* JADX INFO: renamed from: du */
    public final void m64186du(double d) {
        this.f45884to = d;
    }

    /* JADX INFO: renamed from: dy */
    public abstract C14567tm mo64187dy();

    /* JADX INFO: renamed from: fa */
    public abstract void mo64188fa();

    /* JADX INFO: renamed from: h4 */
    public final void m64189h4(double d) {
        this.f45880du = d;
    }

    /* JADX INFO: renamed from: jd */
    public final double m64190jd() {
        return this.f45880du;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64191k4(double d) {
        m64186du(d - ((double) mo64187dy().m71247k4().getValue()));
        m64189h4(d + ((double) mo64187dy().m71247k4().getValue()));
    }

    /* JADX INFO: renamed from: kk */
    public final void m64193kk(double d) {
        double dMo64197up = mo64197up();
        double dMo64194m9 = mo64194m9() * ((double) mo64187dy().m71247k4().getValue());
        m64186du(dMo64197up - dMo64194m9);
        m64189h4(dMo64197up + dMo64194m9);
    }

    /* JADX INFO: renamed from: m9 */
    public abstract double mo64194m9();

    /* JADX INFO: renamed from: to */
    public abstract void mo64195to();

    /* JADX INFO: renamed from: to */
    public final void m64196to(double d) {
        int size = ((fml) C7019kk.m27452k4((Object) m64185ck().m73228yd(), fml.class)).f5072x1.size();
        double dMo64194m9 = mo64194m9();
        double d2 = size;
        m64186du(d - (dMo64194m9 / C14116yg.m67496rv(d2)));
        m64189h4((dMo64194m9 / C14116yg.m67496rv(d2)) + d);
    }

    /* JADX INFO: renamed from: up */
    public abstract double mo64197up();

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        if (!m64185ck().mo3221T_() || m64185ck().m6926yj().m4983dy()) {
            return;
        }
        C14365qy c14365qyM64941c5 = ((fml) C7019kk.m27452k4((Object) m73228yd(), fml.class)).m6220yj().m64941c5();
        C12007ix c12007ix = new C12007ix(m73228yd().m73227xk(), m73228yd().m73206c6(), m73228yd().m73225wy(), m73228yd().m73203ak());
        C14851yl c14851yl = new C14851yl(c14365qyM64941c5);
        c14851yl.m73924k4(c12007ix.Clone());
        try {
            mo64188fa();
        } finally {
            c14851yl.m73923k4();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public abstract void mo64199x1(AbstractC1164gw abstractC1164gw);

    /* JADX INFO: renamed from: k4 */
    public final void m64192k4(AbstractC1164gw abstractC1164gw) {
        this.f45881h4 = abstractC1164gw;
        mo64195to();
        g2y g2yVar = new g2y();
        this.f45882k4 = g2yVar;
        m73215k4(g2yVar);
        m73215k4(this.f45885x1);
        m73215k4(this.f45883kk);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m64198x1(double d) {
        m64186du(d - ((((double) mo64187dy().m71247k4().getValue()) * d) / 100.0d));
        m64189h4(((((double) mo64187dy().m71247k4().getValue()) * d) / 100.0d) + d);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        this.f45882k4.m73210fa(c14713vw);
        this.f45885x1.m73210fa(c14713vw);
        this.f45883kk.m73210fa(c14713vw);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.m73220ss();
        }
    }
}
