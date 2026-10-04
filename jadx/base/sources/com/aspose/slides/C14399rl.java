package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: renamed from: com.aspose.slides.rl */
/* JADX INFO: loaded from: classes3.dex */
class C14399rl extends AbstractC14770x9 {

    /* JADX INFO: renamed from: du */
    private C13847mr f48600du;

    /* JADX INFO: renamed from: h4 */
    private AbstractC14763x3 f48601h4;

    /* JADX INFO: renamed from: k4 */
    private g2y f48602k4;

    /* JADX INFO: renamed from: kk */
    private float f48603kk;

    /* JADX INFO: renamed from: to */
    private AbstractC1164gw[] f48604to;

    /* JADX INFO: renamed from: x1 */
    private g2y f48605x1;

    public C14399rl(C13847mr c13847mr, AbstractC1164gw[] abstractC1164gwArr, AbstractC14763x3 abstractC14763x3) {
        this.f48604to = abstractC1164gwArr;
        this.f48600du = c13847mr;
        this.f48601h4 = abstractC14763x3;
        if (m70157to()) {
            g2y g2yVar = new g2y();
            this.f48602k4 = g2yVar;
            g2yVar.m73212h4(Float.NaN);
            g2y g2yVar2 = new g2y();
            this.f48605x1 = g2yVar2;
            g2yVar2.m73212h4(Float.NaN);
            m73215k4(this.f48602k4);
            m73215k4(this.f48605x1);
        }
    }

    /* JADX INFO: renamed from: m9 */
    private void m70156m9() {
        for (AbstractC1164gw abstractC1164gw : this.f48604to) {
            if (abstractC1164gw != null && abstractC1164gw.mo3221T_()) {
                if (C14064he.m66715kk(this.f48602k4.m73219qm())) {
                    this.f48602k4.m73208du(abstractC1164gw.m73205bz());
                    this.f48602k4.m73212h4(abstractC1164gw.m73219qm());
                }
                if (abstractC1164gw.m73206c6() < this.f48602k4.m73206c6()) {
                    this.f48602k4.m73212h4(abstractC1164gw.m73219qm());
                }
                if (C14064he.m66715kk(this.f48605x1.m73219qm())) {
                    this.f48605x1.m73208du(abstractC1164gw.m73205bz());
                    this.f48605x1.m73212h4(abstractC1164gw.m73219qm());
                }
                if (abstractC1164gw.m73206c6() > this.f48605x1.m73206c6()) {
                    this.f48605x1.m73212h4(abstractC1164gw.m73219qm());
                }
            }
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        if (m70157to()) {
            this.f48602k4.m73210fa(c14713vw);
            this.f48605x1.m73210fa(c14713vw);
        }
    }

    /* JADX INFO: renamed from: to */
    public final boolean m70157to() {
        AbstractC1164gw[] abstractC1164gwArr = this.f48604to;
        return abstractC1164gwArr != null && abstractC1164gwArr.length > 0;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        if (m70157to()) {
            this.f48600du.m64958kk(this.f48602k4.m73223ts().Clone(), this.f48605x1.m73223ts().Clone());
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        if (m70157to()) {
            m70156m9();
            float fMo63718up = this.f48601h4.mo63718up();
            this.f48603kk = this.f48605x1.m73206c6();
            if (this.f48602k4.m73206c6() > fMo63718up && this.f48605x1.m73206c6() > fMo63718up) {
                this.f48602k4.m73212h4(this.f48605x1.m73219qm());
                this.f48603kk = this.f48601h4.mo63718up();
            }
            if (this.f48602k4.m73206c6() < fMo63718up && this.f48605x1.m73206c6() < fMo63718up) {
                this.f48603kk = this.f48601h4.mo63718up();
            }
            this.f48605x1.m73212h4(this.f48603kk);
        }
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.m73220ss();
        }
    }
}
