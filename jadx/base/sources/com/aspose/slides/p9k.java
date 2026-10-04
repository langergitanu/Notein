package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class p9k extends C13683jf {
    public p9k(AbstractC14763x3 abstractC14763x3) {
        super(abstractC14763x3);
    }

    @Override // com.aspose.slides.C13683jf, com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m73217kk(c14713vw.m72555k4());
        m73222to(c14713vw.m72556x1());
    }

    @Override // com.aspose.slides.C13683jf, com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        int size = m63299kk().m73021fa().f49904k4.size();
        double d = 6.283185307179586d / ((double) size);
        double dM73225wy = (m73225wy() / 2.0f) + m73227xk();
        double dM73203ak = (m73203ak() / 2.0f) + m73206c6();
        C12025x6 c12025x6 = new C12025x6((float) dM73225wy, (float) dM73203ak);
        double d2 = 1.5707963267948966d + d;
        double dM73225wy2 = m73225wy() / 2.0f;
        int i = 0;
        while (i < size) {
            d2 -= d;
            m63299kk().m73026k4().m73393k4((float) ((C14116yg.m67470dy(d2) * dM73225wy2) + dM73225wy), (float) (dM73203ak - (C14116yg.m67495m9(d2) * dM73225wy2)), c12025x6.m56897x1(), c12025x6.m56895kk());
            i++;
            size = size;
            d = d;
        }
    }

    @Override // com.aspose.slides.C13683jf, com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
    }
}
