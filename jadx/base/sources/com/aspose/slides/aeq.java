package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: loaded from: classes3.dex */
class aeq extends AbstractC1164gw {
    public aeq(C0886d8 c0886d8) {
        super(c0886d8);
    }

    @Override // com.aspose.slides.AbstractC1164gw
    /* JADX INFO: renamed from: k4 */
    public C12025x6 mo3519k4() {
        throw new InvalidOperationException();
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        if (m73225wy() == 0.0f || m73203ak() == 0.0f) {
            return;
        }
        C14365qy c14365qyM64941c5 = m6926yj().m5012up().m64941c5();
        C12007ix c12007ix = new C12007ix(m73228yd().m73227xk(), m73228yd().m73206c6(), m73228yd().m73225wy(), m73228yd().m73203ak());
        C14851yl c14851yl = new C14851yl(c14365qyM64941c5);
        c14851yl.m73924k4(c12007ix.Clone());
        try {
            C12007ix c12007ix2 = new C12007ix(m73227xk(), m73206c6(), m73225wy(), m73203ak());
            m6926yj().m5017x1(c12007ix2.Clone());
            m6926yj().m4996k4(c12007ix2.Clone());
        } finally {
            c14851yl.m73923k4();
        }
    }

    @Override // com.aspose.slides.AbstractC1164gw
    /* JADX INFO: renamed from: k4 */
    public C12025x6 mo3520k4(C14177nd c14177nd) {
        throw new InvalidOperationException();
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m73217kk(c14713vw.m72555k4());
        m73222to(c14713vw.m72556x1());
    }
}
