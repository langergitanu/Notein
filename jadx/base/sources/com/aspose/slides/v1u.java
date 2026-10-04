package com.aspose.slides;

import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: loaded from: classes3.dex */
class v1u extends AbstractC14770x9 {

    /* JADX INFO: renamed from: k4 */
    private boolean f49458k4;

    /* JADX INFO: renamed from: x1 */
    private C13847mr f49459x1;

    public v1u(boolean z, C13847mr c13847mr) {
        this.f49458k4 = z;
        this.f49459x1 = c13847mr;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m73217kk(c14713vw.m72555k4());
        m73222to(c14713vw.m72556x1());
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        C12025x6 c12025x6;
        C12025x6 c12025x62;
        if (m73225wy() == 0.0f || m73203ak() == 0.0f) {
            return;
        }
        C12003du c12003duClone = igr.m7634x1(this.f49459x1.m64945h4().m734m9().Clone(), 0.25d).Clone();
        C12003du.m56400k4(255, c12003duClone.Clone()).CloneTo(c12003duClone);
        azo azoVar = new azo(c12003duClone.Clone(), 0.1f);
        azoVar.m3914kk((byte) 2);
        C11896dy c11896dy = new C11896dy();
        try {
            c11896dy.m55547k4(new C12025x6((m73225wy() / 2.0f) + m73227xk(), m73206c6()), new C12025x6((m73225wy() / 2.0f) + m73227xk(), m73206c6() + m73203ak()));
            this.f49459x1.m64941c5().m69870wy().mo64338k4((C11896dy) c11896dy.deepClone(), azoVar, new C0962es(C12003du.f40505to.Clone()));
            c11896dy.dispose();
            c11896dy = new C11896dy();
            try {
                if (this.f49458k4) {
                    c12025x6 = new C12025x6(m73227xk(), m73206c6());
                    c12025x62 = new C12025x6(m73227xk() + m73225wy(), m73206c6());
                } else {
                    c12025x6 = new C12025x6(m73227xk(), m73206c6() + m73203ak());
                    c12025x62 = new C12025x6(m73227xk() + m73225wy(), m73206c6() + m73203ak());
                }
                c11896dy.m55547k4(c12025x6, c12025x62);
                this.f49459x1.m64941c5().m69870wy().mo64338k4((C11896dy) c11896dy.deepClone(), azoVar, new C0962es(C12003du.f40505to.Clone()));
            } catch (Throwable th) {
                throw th;
            }
        } finally {
            c11896dy.dispose();
        }
    }
}
