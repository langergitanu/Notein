package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class nky extends AbstractC14770x9 {

    /* JADX INFO: renamed from: du */
    private AbstractC1164gw[] f47560du;

    /* JADX INFO: renamed from: h4 */
    private C13847mr f47561h4;

    /* JADX INFO: renamed from: k4 */
    AbstractC14763x3 f47562k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC1164gw f47563kk;

    /* JADX INFO: renamed from: m9 */
    private g2y f47564m9;

    /* JADX INFO: renamed from: to */
    private AbstractC1164gw f47565to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC1164gw f47566x1;

    public nky(C13847mr c13847mr, AbstractC1164gw[] abstractC1164gwArr, AbstractC14763x3 abstractC14763x3) {
        this.f47560du = abstractC1164gwArr;
        this.f47561h4 = c13847mr;
        this.f47562k4 = abstractC14763x3;
        g2y g2yVar = new g2y();
        this.f47564m9 = g2yVar;
        m73215k4(g2yVar);
    }

    /* JADX INFO: renamed from: c5 */
    private AbstractC1164gw m68071c5() {
        for (int length = this.f47560du.length - 1; length >= 0; length--) {
            if (this.f47560du[length].mo3221T_()) {
                return this.f47560du[length];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: dy */
    private AbstractC1164gw m68072dy() {
        int i = 0;
        while (true) {
            AbstractC1164gw[] abstractC1164gwArr = this.f47560du;
            if (i >= abstractC1164gwArr.length) {
                return null;
            }
            if (abstractC1164gwArr[i].mo3221T_()) {
                return this.f47560du[i];
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: m9 */
    private AbstractC1164gw m68073m9() {
        AbstractC1164gw abstractC1164gw = null;
        for (AbstractC1164gw abstractC1164gw2 : this.f47560du) {
            if (abstractC1164gw2 != null && !abstractC1164gw2.m6926yj().m4983dy() && (abstractC1164gw == null || abstractC1164gw2.m73206c6() < abstractC1164gw.m73206c6())) {
                abstractC1164gw = abstractC1164gw2;
            }
        }
        return abstractC1164gw;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: O_ */
    public int mo3480O_() {
        return 4;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m73217kk((float) (((double) (this.f47562k4.m73225wy() / this.f47561h4.m64945h4().getDataPoints().size())) / ((double) ((this.f47561h4.m64945h4().getParentSeriesGroup().getUpDownBars().getGapWidth() / 100.0f) + 1.0f))));
        this.f47566x1 = m68073m9();
        this.f47563kk = m68072dy();
        this.f47565to = m68071c5();
        if (m68074to()) {
            m73222to(C14116yg.m67480k4(this.f47565to.m73206c6() - this.f47563kk.m73206c6()));
        }
        this.f47564m9.m73210fa(c14713vw);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        if (m68074to() && this.f47564m9 != null) {
            C12007ix c12007ix = new C12007ix(this.f47564m9.m73227xk(), this.f47564m9.m73206c6(), m73225wy(), m73203ak());
            if (this.f47561h4.m64969x1(c12007ix.Clone(), this.f47563kk.m73206c6() > this.f47565to.m73206c6())) {
                return;
            }
            this.f47561h4.m64952k4(c12007ix.Clone(), this.f47563kk.m73206c6() > this.f47565to.m73206c6());
        }
    }

    /* JADX INFO: renamed from: to */
    private boolean m68074to() {
        return (this.f47563kk == null || this.f47565to == null) ? false : true;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        if (m68074to()) {
            this.f47564m9.m73208du(this.f47566x1.m73227xk() - (m73225wy() / 2.0f));
            this.f47564m9.m73212h4((this.f47563kk.m73206c6() <= this.f47565to.m73206c6() ? this.f47563kk : this.f47565to).m73206c6());
            C12007ix c12007ix = new C12007ix(this.f47564m9.m73227xk(), this.f47564m9.m73206c6(), m73225wy(), m73203ak());
            c12007ix.m56562k4(new C12007ix(0.0f, 0.0f, c14713vw.m72555k4(), c14713vw.m72556x1()).Clone());
            if (c12007ix.m56568kk()) {
                this.f47564m9 = null;
            } else {
                this.f47564m9.m73208du(c12007ix.m56571to());
                this.f47564m9.m73212h4(c12007ix.m56554dy());
                m73217kk(c12007ix.m56550c5());
                m73222to(c12007ix.m56575x1());
            }
        }
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.m73220ss();
        }
    }
}
