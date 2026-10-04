package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.ad */
/* JADX INFO: loaded from: classes3.dex */
class C0742ad extends AbstractC14770x9 {

    /* JADX INFO: renamed from: k4 */
    private g2y f3875k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC1164gw[] f3876kk;

    /* JADX INFO: renamed from: to */
    private C13847mr f3877to;

    /* JADX INFO: renamed from: x1 */
    private g2y f3878x1;

    public C0742ad(C13847mr c13847mr, AbstractC1164gw[] abstractC1164gwArr) {
        this.f3877to = c13847mr;
        this.f3876kk = abstractC1164gwArr;
        if (m3481to()) {
            g2y g2yVar = new g2y();
            this.f3875k4 = g2yVar;
            g2yVar.m73212h4(Float.NaN);
            g2y g2yVar2 = new g2y();
            this.f3878x1 = g2yVar2;
            g2yVar2.m73212h4(Float.NaN);
            m73215k4(this.f3875k4);
            m73215k4(this.f3878x1);
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: O_ */
    public int mo3480O_() {
        return 2;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        if (m3481to()) {
            this.f3875k4.m73210fa(c14713vw);
            this.f3878x1.m73210fa(c14713vw);
        }
    }

    /* JADX INFO: renamed from: to */
    public final boolean m3481to() {
        AbstractC1164gw[] abstractC1164gwArr = this.f3876kk;
        return abstractC1164gwArr != null && abstractC1164gwArr.length > 0;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        g2y g2yVar = this.f3875k4;
        if (g2yVar == null || this.f3878x1 == null) {
            return;
        }
        this.f3877to.m64961to(g2yVar.m73223ts().Clone(), this.f3878x1.m73223ts().Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m3479k4(C12025x6 c12025x6) {
        return 0.0f <= c12025x6.m56897x1() && c12025x6.m56897x1() < m73218lr().m73225wy() && 0.0f <= c12025x6.m56895kk() && c12025x6.m56895kk() < m73218lr().m73203ak();
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        if (m3481to()) {
            for (AbstractC1164gw abstractC1164gw : this.f3876kk) {
                if (abstractC1164gw != null && abstractC1164gw.mo3221T_()) {
                    if (C14064he.m66715kk(this.f3875k4.m73219qm())) {
                        this.f3875k4.m73208du(abstractC1164gw.m73205bz());
                        this.f3875k4.m73212h4(abstractC1164gw.m73219qm());
                    }
                    if (abstractC1164gw.m73206c6() < this.f3875k4.m73206c6()) {
                        this.f3875k4.m73212h4(abstractC1164gw.m73219qm());
                    }
                    if (C14064he.m66715kk(this.f3878x1.m73219qm())) {
                        this.f3878x1.m73208du(abstractC1164gw.m73205bz());
                        this.f3878x1.m73212h4(abstractC1164gw.m73219qm());
                    }
                    if (abstractC1164gw.m73206c6() > this.f3878x1.m73206c6()) {
                        this.f3878x1.m73212h4(abstractC1164gw.m73219qm());
                    }
                }
            }
            if (m3479k4(this.f3875k4.m73223ts().Clone())) {
                g2y g2yVar = this.f3875k4;
                g2yVar.m73208du(C14116yg.m67481k4(g2yVar.m73205bz(), 0.0f));
                g2y g2yVar2 = this.f3875k4;
                g2yVar2.m73208du(C14116yg.m67504x1(g2yVar2.m73205bz(), c14713vw.m72555k4()));
                g2y g2yVar3 = this.f3875k4;
                g2yVar3.m73212h4(C14116yg.m67481k4(g2yVar3.m73219qm(), 0.0f));
                g2y g2yVar4 = this.f3875k4;
                g2yVar4.m73212h4(C14116yg.m67504x1(g2yVar4.m73219qm(), c14713vw.m72556x1()));
            } else {
                this.f3875k4 = null;
            }
            if (m3479k4(this.f3878x1.m73223ts().Clone())) {
                g2y g2yVar5 = this.f3878x1;
                g2yVar5.m73208du(C14116yg.m67481k4(g2yVar5.m73205bz(), 0.0f));
                g2y g2yVar6 = this.f3878x1;
                g2yVar6.m73208du(C14116yg.m67504x1(g2yVar6.m73205bz(), c14713vw.m72555k4()));
                g2y g2yVar7 = this.f3878x1;
                g2yVar7.m73212h4(C14116yg.m67481k4(g2yVar7.m73219qm(), 0.0f));
                g2y g2yVar8 = this.f3878x1;
                g2yVar8.m73212h4(C14116yg.m67504x1(g2yVar8.m73219qm(), c14713vw.m72556x1()));
            } else {
                this.f3878x1 = null;
            }
        }
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.m73220ss();
        }
    }
}
