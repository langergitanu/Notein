package com.aspose.slides;

import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.mq */
/* JADX INFO: loaded from: classes3.dex */
class C13846mq extends AbstractC1164gw {
    public C13846mq(C0886d8 c0886d8) {
        super(c0886d8);
    }

    @Override // com.aspose.slides.AbstractC1164gw
    /* JADX INFO: renamed from: k4 */
    public C12025x6 mo3519k4() {
        return new C12025x6(m73223ts().m56897x1(), m73223ts().m56895kk());
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        if (m6926yj().m4983dy() || m6926yj().m4988jd().getFormat().getFill().getFillType() == 0) {
            return;
        }
        C12007ix c12007ix = new C12007ix(m73228yd().m73227xk(), m73228yd().m73206c6(), m73228yd().m73225wy(), m73228yd().m73203ak());
        C14851yl c14851yl = new C14851yl(m6926yj().m5012up().m64941c5());
        c14851yl.m73924k4(c12007ix.Clone());
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55542k4(new C12007ix(m73227xk(), m73206c6(), m73225wy(), m73203ak()));
        if (m6926yj().m4999kk() > 0.0d) {
            m6926yj().m4982du(c11896dy);
            if (!m6926yj().m5019x1(c11896dy)) {
                m6926yj().m5009to(c11896dy);
            }
        } else {
            m6926yj().m5012up().m64941c5().m69870wy().mo68802x1(new C12007ix(0.0f, 0.0f, m73225wy(), m73203ak()), new azo(C12003du.f40505to.Clone(), 0.0f), new C0962es(C12003du.m56385i5().Clone()));
        }
        c14851yl.m73923k4();
    }

    @Override // com.aspose.slides.AbstractC1164gw
    /* JADX INFO: renamed from: k4 */
    public C12025x6 mo3520k4(C14177nd c14177nd) {
        return new C12025x6(m73223ts().m56897x1(), m73223ts().m56895kk());
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m73217kk(c14713vw.m72555k4());
        m73222to(c14713vw.m72556x1());
    }
}
