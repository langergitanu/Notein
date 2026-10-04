package com.aspose.slides.internal.p406ss;

import com.aspose.slides.internal.p022ai.C1374fa;
import com.aspose.slides.internal.p057c6.InterfaceC1981h4;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p475wh.C12007ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.ss.up */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10344up extends AbstractC10346wl {

    /* JADX INFO: renamed from: m9 */
    private int f36824m9;

    public AbstractC10344up(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
    }

    @Override // com.aspose.slides.internal.p406ss.AbstractC10346wl, com.aspose.slides.internal.p406ss.AbstractC10327ck, com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        super.mo14090k4(abstractC3533um);
        this.f36824m9 = abstractC3533um.m14385du(194).mo17251du();
    }

    /* JADX INFO: renamed from: ss */
    public final int m50394ss() {
        return this.f36824m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50393k4(C12007ix c12007ix, C1374fa c1374fa, InterfaceC1981h4 interfaceC1981h4) {
        int iMo9886x1;
        C10338ne c10338ne = (C10338ne) m50342m9(61);
        if (c10338ne != null) {
            iMo9886x1 = c10338ne.m50409kp().mo9886x1(interfaceC1981h4);
            float fM56550c5 = c12007ix.m56550c5();
            c12007ix.m56566kk(c12007ix.m56557jd() + iMo9886x1);
            c12007ix.m56576x1(fM56550c5);
        } else {
            iMo9886x1 = 0;
        }
        C10340rv c10340rv = (C10340rv) m50342m9(59);
        if (c10340rv != null) {
            iMo9886x1 += c10340rv.m50409kp().mo9886x1(interfaceC1981h4);
        }
        if (iMo9886x1 > 0) {
            if (c1374fa == C1374fa.f5957k4 || c1374fa == C1374fa.f5961x1) {
                c12007ix.m56576x1(c12007ix.m56550c5() - iMo9886x1);
            } else {
                c12007ix.m56560k4(c12007ix.m56575x1() - iMo9886x1);
            }
        }
    }
}
