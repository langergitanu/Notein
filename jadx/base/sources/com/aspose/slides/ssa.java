package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class ssa extends AbstractC14770x9 {

    /* JADX INFO: renamed from: k4 */
    private C14328q5 f48912k4;

    /* JADX INFO: renamed from: kk */
    private C1118fr f48913kk;

    /* JADX INFO: renamed from: x1 */
    private otz f48914x1;

    public ssa(C13847mr c13847mr) {
        this.f48912k4 = c13847mr.m64941c5().m69838jd();
        C1118fr c1118fr = new C1118fr(c13847mr.m64957kk(), this.f48912k4);
        this.f48913kk = c1118fr;
        m73215k4(c1118fr);
        if (this.f48912k4.m69408m9().m69834fa().getChartDataTable().getShowLegendKey()) {
            gnp gnpVar = new gnp(c13847mr);
            this.f48914x1 = gnpVar;
            m73215k4(gnpVar);
        }
    }

    /* JADX INFO: renamed from: m9 */
    private float m70761m9() {
        return 1.5f;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        float fM73225wy;
        if (this.f48914x1 != null) {
            int iM72841to = ((wnb) C7019kk.m27452k4((Object) m73228yd(), wnb.class)).m72841to();
            float fM67477k4 = (float) C14116yg.m67477k4(this.f48913kk.m6280dy().m56638du() / 3.0f, 0);
            if (iM72841to == 0) {
                this.f48914x1.m73210fa(new C14713vw(fM67477k4, fM67477k4));
            } else {
                this.f48914x1.m73210fa(new C14713vw(a4w.m3219k4(iM72841to), fM67477k4));
            }
            fM73225wy = this.f48914x1.m73225wy() + 2.5f;
        } else {
            fM73225wy = 0.0f;
        }
        C1118fr c1118fr = this.f48913kk;
        oju ojuVarClone = c1118fr.m73363k4(c1118fr.m6282m9(), c14713vw.m72555k4() - fM73225wy, c14713vw.m72556x1()).Clone();
        ojuVarClone.f47837x1 = (m70761m9() * 2.0f) + ojuVarClone.f47837x1;
        ojuVarClone.f47836k4 += 5.0f;
        this.f48913kk.m73210fa(new C14713vw(ojuVarClone.f47836k4, ojuVarClone.f47837x1));
        m73217kk(fM73225wy + this.f48913kk.m73225wy());
        m73222to(this.f48913kk.m73203ak());
    }

    /* JADX INFO: renamed from: to */
    public final otz m70762to() {
        return this.f48914x1;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        otz otzVar = this.f48914x1;
        float fM73225wy = 2.5f;
        if (otzVar != null) {
            otzVar.m73208du(2.5f);
            this.f48914x1.m73212h4((m73203ak() / 2.0f) - (this.f48914x1.m73203ak() / 2.0f));
            fM73225wy = 2.5f + this.f48914x1.m73225wy() + 2.5f;
            this.f48914x1.m73220ss();
        }
        this.f48913kk.m73212h4(m70761m9());
        this.f48913kk.m73208du(fM73225wy);
        this.f48913kk.m73220ss();
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
    }
}
