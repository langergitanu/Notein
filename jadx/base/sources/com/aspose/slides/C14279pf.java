package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;

/* JADX INFO: renamed from: com.aspose.slides.pf */
/* JADX INFO: loaded from: classes3.dex */
class C14279pf extends AbstractC14770x9 {

    /* JADX INFO: renamed from: k4 */
    private C13847mr f48047k4;

    /* JADX INFO: renamed from: x1 */
    private C0791b3 f48048x1;

    public C14279pf(C13847mr c13847mr, C0791b3 c0791b3) {
        this.f48047k4 = c13847mr;
        this.f48048x1 = c0791b3;
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
        if (m73225wy() == 0.0f || m73203ak() == 0.0f) {
            return;
        }
        C14365qy c14365qyM64941c5 = this.f48047k4.m64941c5();
        C12007ix c12007ix = new C12007ix(m73228yd().m73227xk(), m73228yd().m73206c6(), m73228yd().m73225wy(), m73228yd().m73203ak());
        C14851yl c14851yl = new C14851yl(c14365qyM64941c5);
        c14851yl.m73924k4(c12007ix.Clone());
        try {
            C12007ix c12007ix2 = new C12007ix(m73227xk(), m73206c6(), m73225wy(), m73203ak());
            C12003du c12003duClone = this.f48047k4.m64945h4().m734m9().Clone();
            FillFormat fillFormat = (FillFormat) this.f48047k4.m64945h4().getFormat().getFill();
            if (this.f48048x1.m3949dy().getFill().getFillType() != -1) {
                fillFormat = (FillFormat) this.f48048x1.m3949dy().getFill();
            }
            im9.m7707k4(c12003duClone.Clone(), this.f48047k4.m64941c5(), c12007ix2.Clone(), fillFormat, this.f48047k4.m64945h4().getFormat().getEffect());
            c14851yl.m73923k4();
        } catch (Throwable th) {
            c14851yl.m73923k4();
            throw th;
        }
    }
}
