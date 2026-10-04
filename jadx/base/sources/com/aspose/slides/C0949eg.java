package com.aspose.slides;

import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.eg */
/* JADX INFO: loaded from: classes3.dex */
class C0949eg extends AbstractC14770x9 {

    /* JADX INFO: renamed from: k4 */
    private float f4787k4;

    /* JADX INFO: renamed from: x1 */
    private C13847mr f4788x1;

    public C0949eg(C13847mr c13847mr) {
        this.f4788x1 = c13847mr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5521k4(float f) {
        this.f4787k4 = f;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        if (m73225wy() == 0.0f || m73203ak() == 0.0f) {
            return;
        }
        C14365qy c14365qyM64941c5 = this.f4788x1.m64941c5();
        C12007ix c12007ix = new C12007ix(m73228yd().m73227xk(), m73228yd().m73206c6(), m73228yd().m73225wy(), m73228yd().m73203ak());
        C14851yl c14851yl = new C14851yl(c14365qyM64941c5);
        c14851yl.m73924k4(c12007ix.Clone());
        try {
            C12007ix c12007ix2 = new C12007ix(m73227xk(), m73206c6(), m73225wy(), m73203ak());
            im9.m7707k4(this.f4788x1.m64945h4().m734m9().Clone().Clone(), this.f4788x1.m64941c5(), c12007ix2.Clone(), (FillFormat) this.f4788x1.m64945h4().getFormat().getFill(), this.f4788x1.m64945h4().getFormat().getEffect());
            C12003du c12003duClone = igr.m7634x1(this.f4788x1.m64945h4().m734m9().Clone(), 0.25d).Clone();
            C12003du.m56400k4(255, c12003duClone.Clone()).CloneTo(c12003duClone);
            im9.m7698k4(c12003duClone.Clone(), C12003du.f40505to.Clone(), this.f4788x1.m64941c5(), c12007ix2.Clone(), (Format) this.f4788x1.m64945h4().getFormat());
            m5520k4(c12003duClone.Clone());
        } finally {
            c14851yl.m73923k4();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m5520k4(C12003du c12003du) {
        azo azoVar = new azo(c12003du.Clone(), 0.1f);
        azoVar.m3914kk((byte) 2);
        C11896dy c11896dy = new C11896dy();
        try {
            c11896dy.m55547k4(new C12025x6(m73227xk(), m73206c6() + this.f4787k4), new C12025x6(m73227xk() + m73225wy(), m73206c6() + this.f4787k4));
            this.f4788x1.m64941c5().m69870wy().mo64338k4((C11896dy) c11896dy.deepClone(), azoVar, new C0962es(C12003du.f40505to.Clone()));
        } finally {
            c11896dy.dispose();
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m73217kk(c14713vw.m72555k4());
        m73222to(c14713vw.m72556x1());
    }
}
