package com.aspose.slides.internal.p117ew;

import com.aspose.slides.internal.p102e8.AbstractC3589to;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p349q3.C9671lm;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p505xn.C12556ck;

/* JADX INFO: renamed from: com.aspose.slides.internal.ew.du */
/* JADX INFO: loaded from: classes.dex */
public class C3805du extends AbstractC3589to {
    /* JADX INFO: renamed from: h4 */
    public static void m15213h4(C9723vw c9723vw, C3585h4 c3585h4) {
        C9671lm c9671lm = (C9671lm) c9723vw;
        if (c3585h4.m14534ks() != null) {
            C11913yj c11913yjM14565x1 = c3585h4.m14565x1();
            c11913yjM14565x1.m55787x1(c3585h4.m14561vj());
            C12007ix c12007ixClone = c3585h4.m14534ks().m55523c5().Clone();
            if (c12007ixClone.m56550c5() >= 2.1474836E9f || c12007ixClone.m56575x1() >= 2.1474836E9f) {
                return;
            }
            C12018u4 c12018u4M58560k4 = C12556ck.m58560k4(c3585h4.m14534ks(), c11913yjM14565x1);
            int iM47419k4 = (int) c9671lm.m47419k4();
            if (iM47419k4 == 1) {
                c3585h4.m14532kk(C12556ck.m58561k4(AbstractC12008jd.m56582k4((AbstractC12002ck) c3585h4.m14494g8()), c3585h4.m14544s7(), c12018u4M58560k4));
                return;
            }
            if (iM47419k4 == 2) {
                c3585h4.m14544s7().m56766to(c12018u4M58560k4);
                return;
            }
            if (iM47419k4 == 3) {
                c3585h4.m14544s7().m56746du(c12018u4M58560k4);
            } else if (iM47419k4 == 4) {
                c3585h4.m14544s7().m56774x1(c12018u4M58560k4);
            } else {
                if (iM47419k4 != 5) {
                    return;
                }
                c3585h4.m14532kk(c12018u4M58560k4);
            }
        }
    }

    @Override // com.aspose.slides.internal.p102e8.AbstractC3589to
    /* JADX INFO: renamed from: to */
    public void mo9134to(C9723vw c9723vw, C3585h4 c3585h4) {
        m15213h4(c9723vw, c3585h4);
    }
}
