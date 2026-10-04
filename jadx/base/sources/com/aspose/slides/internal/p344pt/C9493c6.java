package com.aspose.slides.internal.p344pt;

import com.aspose.slides.internal.p123f5.C3856h4;
import com.aspose.slides.internal.p123f5.C3859m9;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p132fj.C4066xk;
import com.aspose.slides.internal.p472w8.C11893c5;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.pt.c6 */
/* JADX INFO: loaded from: classes4.dex */
public class C9493c6 extends AbstractC9530rv {
    @Override // com.aspose.slides.internal.p344pt.AbstractC9530rv
    /* JADX INFO: renamed from: x1 */
    public void mo46684x1(C4047sv c4047sv, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) {
        C4066xk c4066xk = (C4066xk) c4047sv;
        long jM16200k4 = c4066xk.m16200k4();
        C12007ix c12007ix = new C12007ix(c4066xk.m16199h4(), c4066xk.m16205to(), c4066xk.m16203kk(), c4066xk.m16207x1());
        if (c3856h4.m15472dy() == null || jM16200k4 == 170) {
            return;
        }
        if (jM16200k4 == 240) {
            C11893c5 c11893c5Mo17583x1 = abstractC12008jd.mo17583x1();
            abstractC12008jd.mo17476du(1);
            abstractC12008jd.mo17560kk(7);
            abstractC12008jd.mo17593x1(c3856h4.m15472dy(), c12007ix.Clone());
            abstractC12008jd.mo17496k4(c11893c5Mo17583x1);
            return;
        }
        if (jM16200k4 == 204) {
            return;
        }
        C12009k4 c12009k4 = new C12009k4(c4066xk.m16203kk(), c4066xk.m16207x1());
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
        try {
            abstractC12008jdM56582k4.mo17526k4(c3856h4.m15472dy(), 0, 0, (int) c4066xk.m16203kk(), (int) c4066xk.m16207x1());
            abstractC12008jdM56582k4.dispose();
            C12009k4 c12009k42 = new C12009k4(c4066xk.m16203kk(), c4066xk.m16203kk());
            abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k42);
            try {
                abstractC12008jdM56582k4.mo17476du(1);
                abstractC12008jdM56582k4.mo17560kk(7);
                abstractC12008jdM56582k4.mo17508k4(c3856h4.m15479ix(), new C12014ne(0, 0, c4066xk.m16203kk(), c4066xk.m16203kk()));
                abstractC12008jdM56582k4.dispose();
                C12009k4 c12009k4M15551k4 = C3859m9.m15551k4(c12009k4, c12009k4, c12009k42, jM16200k4, c3856h4);
                C11893c5 c11893c5Mo17583x12 = abstractC12008jd.mo17583x1();
                abstractC12008jd.mo17476du(1);
                abstractC12008jd.mo17560kk(7);
                abstractC12008jd.mo17506k4(c12009k4M15551k4, c12007ix.Clone());
                abstractC12008jd.mo17496k4(c11893c5Mo17583x12);
            } finally {
            }
        } finally {
        }
    }
}
