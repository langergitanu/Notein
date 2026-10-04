package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
abstract class a4w extends AbstractC14770x9 {

    /* JADX INFO: renamed from: k4 */
    private otz f3788k4;

    /* JADX INFO: renamed from: kk */
    private LegendEntryProperties f3789kk;

    /* JADX INFO: renamed from: to */
    private boolean f3790to;

    /* JADX INFO: renamed from: x1 */
    private z3m f3791x1;

    public a4w(LegendEntryProperties legendEntryProperties) {
        this.f3789kk = legendEntryProperties;
    }

    /* JADX INFO: renamed from: jd */
    private float m3218jd() {
        return m3220k4(m3222c5().m73891c5(), m3222c5().m73894jd());
    }

    /* JADX INFO: renamed from: k4 */
    public static float m3219k4(int i) {
        return i == 2 ? 25.2f : 18.5f;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: T_ */
    public boolean mo3221T_() {
        return (this.f3789kk.getHide() || this.f3790to) ? false : true;
    }

    /* JADX INFO: renamed from: c5 */
    public final ygk m3222c5() {
        return (ygk) m73228yd();
    }

    /* JADX INFO: renamed from: dy */
    public final otz m3223dy() {
        return this.f3788k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final z3m m3228m9() {
        return this.f3791x1;
    }

    /* JADX INFO: renamed from: to */
    public final LegendEntryProperties m3229to() {
        return this.f3789kk;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        C12007ix[] c12007ixArrM73368yj = this.f3791x1.m73368yj();
        if (c12007ixArrM73368yj.length > 0) {
            this.f3788k4.m73212h4((c12007ixArrM73368yj[0].m56575x1() / 2.0f) - (this.f3788k4.m73203ak() / 2.0f));
            this.f3791x1.m73212h4(0.0f);
            this.f3788k4.m73208du(m3218jd());
            this.f3791x1.m73208du(m3218jd() + this.f3788k4.m73225wy() + m3218jd());
        }
        this.f3788k4.m73220ss();
        this.f3791x1.m73220ss();
    }

    /* JADX INFO: renamed from: k4 */
    public static float m3220k4(int i, float f) {
        if (i == 1 || i == 2) {
            return 2.16f;
        }
        return f * 0.12f;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
        m73217kk(this.f3791x1.m73225wy() + this.f3791x1.m73205bz());
        m73222to(C14116yg.m67481k4(this.f3788k4.m73203ak(), this.f3791x1.m73219qm() + this.f3791x1.m73203ak()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3224k4(otz otzVar) {
        this.f3788k4 = otzVar;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        z3m z3mVar;
        C14713vw c14713vw2;
        if (m3222c5().m73891c5() == 0) {
            this.f3788k4.m73210fa(new C14713vw(m3222c5().m73892ck(), m3222c5().m73892ck()));
            z3mVar = this.f3791x1;
            c14713vw2 = new C14713vw((c14713vw.m72555k4() - (m3218jd() * 2.0f)) - this.f3788k4.m73225wy(), c14713vw.m72556x1());
        } else {
            this.f3788k4.m73210fa(new C14713vw(m3219k4(m3222c5().m73891c5()), m3222c5().m73892ck()));
            z3mVar = this.f3791x1;
            c14713vw2 = new C14713vw(c14713vw.m72555k4() - this.f3788k4.m73225wy(), c14713vw.m72556x1());
        }
        z3mVar.m73210fa(c14713vw2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3226k4(z3m z3mVar) {
        this.f3791x1 = z3mVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3227k4(boolean z) {
        this.f3790to = z;
    }
}
