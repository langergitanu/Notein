package com.aspose.slides.internal.p296nd;

import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p042bn.C1771xk;
import com.aspose.slides.internal.p441ui.C11315h4;
import com.aspose.slides.internal.p441ui.C11318m9;
import com.aspose.slides.internal.p472w8.C11893c5;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.nd.xk */
/* JADX INFO: loaded from: classes4.dex */
public class C6862xk extends AbstractC6841rv {
    @Override // com.aspose.slides.internal.p296nd.AbstractC6841rv
    /* JADX INFO: renamed from: x1 */
    public void mo26875x1(C1752sv c1752sv, AbstractC12008jd abstractC12008jd, C11315h4 c11315h4) {
        C1771xk c1771xk = (C1771xk) c1752sv;
        long jM9530k4 = c1771xk.m9530k4();
        C12007ix c12007ix = new C12007ix(c1771xk.m9529h4(), c1771xk.m9535to(), c1771xk.m9533kk(), c1771xk.m9537x1());
        if (c11315h4.m54403dy() == null || jM9530k4 == 170) {
            return;
        }
        if (jM9530k4 == 240) {
            if (c11315h4.m54403dy() != null) {
                C11893c5 c11893c5Mo17583x1 = abstractC12008jd.mo17583x1();
                abstractC12008jd.mo17476du(1);
                abstractC12008jd.mo17560kk(7);
                abstractC12008jd.mo17593x1(c11315h4.m54403dy(), c12007ix.Clone());
                abstractC12008jd.mo17496k4(c11893c5Mo17583x1);
                return;
            }
            return;
        }
        if (jM9530k4 == 204) {
            return;
        }
        C12009k4 c12009k4 = new C12009k4(c1771xk.m9533kk(), c1771xk.m9537x1());
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
        try {
            abstractC12008jdM56582k4.mo17526k4(c11315h4.m54403dy(), 0, 0, (int) c1771xk.m9533kk(), (int) c1771xk.m9537x1());
            abstractC12008jdM56582k4.dispose();
            C12009k4 c12009k42 = new C12009k4(c1771xk.m9533kk(), c1771xk.m9533kk());
            abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k42);
            try {
                abstractC12008jdM56582k4.mo17476du(1);
                abstractC12008jdM56582k4.mo17560kk(7);
                abstractC12008jdM56582k4.mo17508k4(c11315h4.m54409ix(), new C12014ne(0, 0, c1771xk.m9533kk(), c1771xk.m9533kk()));
                abstractC12008jdM56582k4.dispose();
                C12009k4 c12009k4M54481k4 = C11318m9.m54481k4(c12009k4, c12009k4, c12009k42, jM9530k4, c11315h4);
                C11893c5 c11893c5Mo17583x12 = abstractC12008jd.mo17583x1();
                abstractC12008jd.mo17476du(1);
                abstractC12008jd.mo17560kk(7);
                abstractC12008jd.mo17506k4(c12009k4M54481k4, c12007ix.Clone());
                abstractC12008jd.mo17496k4(c11893c5Mo17583x12);
            } finally {
            }
        } finally {
        }
    }
}
