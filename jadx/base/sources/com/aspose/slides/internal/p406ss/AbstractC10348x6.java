package com.aspose.slides.internal.p406ss;

import com.aspose.slides.internal.p022ai.C1374fa;
import com.aspose.slides.internal.p057c6.InterfaceC1981h4;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p475wh.C12007ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.ss.x6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10348x6 extends AbstractC10346wl {
    public AbstractC10348x6(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
    }

    @Override // com.aspose.slides.internal.p406ss.AbstractC10346wl, com.aspose.slides.internal.p406ss.AbstractC10327ck, com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        super.mo14090k4(abstractC3533um);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50412k4(C12007ix c12007ix, C1374fa c1374fa, InterfaceC1981h4 interfaceC1981h4) {
        int iMo9886x1;
        C10349yj c10349yj = (C10349yj) m50342m9(57);
        if (c10349yj == null || c10349yj.m50394ss() != 149) {
            iMo9886x1 = 0;
        } else {
            iMo9886x1 = c10349yj.m50409kp().mo9886x1(interfaceC1981h4);
            float fM56575x1 = c12007ix.m56575x1();
            c12007ix.m56572to(c12007ix.m56551ck() + iMo9886x1);
            c12007ix.m56560k4(fM56575x1);
        }
        C10330fa c10330fa = (C10330fa) m50342m9(56);
        if (c10330fa != null && c10330fa.m50394ss() == 149) {
            iMo9886x1 += c10330fa.m50409kp().mo9886x1(interfaceC1981h4);
        }
        if (iMo9886x1 > 0) {
            if (c1374fa == C1374fa.f5957k4 || c1374fa == C1374fa.f5961x1) {
                c12007ix.m56560k4(c12007ix.m56575x1() - iMo9886x1);
            } else {
                c12007ix.m56576x1(c12007ix.m56550c5() - iMo9886x1);
            }
        }
    }
}
