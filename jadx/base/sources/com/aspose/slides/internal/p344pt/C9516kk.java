package com.aspose.slides.internal.p344pt;

import com.aspose.slides.internal.p123f5.C3856h4;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p132fj.C4049to;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p488x0.C12352x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.pt.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C9516kk extends AbstractC9535to {
    /* JADX INFO: renamed from: x1 */
    private C12009k4 m46685x1(boolean z, C12352x1 c12352x1, C3856h4 c3856h4) {
        if (z) {
            return c12352x1.m57871c5();
        }
        C12009k4 c12009k4 = new C12009k4(c3856h4.m15539yd(), c3856h4.m15461b3());
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
        try {
            abstractC12008jdM56582k4.mo17476du(1);
            abstractC12008jdM56582k4.mo17560kk(7);
            abstractC12008jdM56582k4.mo17508k4(c3856h4.m15479ix(), new C12014ne(0, 0, c3856h4.m15539yd(), c3856h4.m15461b3()));
            abstractC12008jdM56582k4.dispose();
            return c12009k4;
        } catch (Throwable th) {
            if (abstractC12008jdM56582k4 != null) {
                abstractC12008jdM56582k4.dispose();
            }
            throw th;
        }
    }

    @Override // com.aspose.slides.internal.p344pt.AbstractC9530rv
    /* JADX INFO: renamed from: x1 */
    public void mo46684x1(C4047sv c4047sv, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) {
        C4049to c4049to = (C4049to) c4047sv;
        m46701k4(c4049to.m15989k4(), m46685x1(c4049to.m16078ck(), c4049to.m16082jd(), c3856h4), new C12014ne(c4049to.m15992kk(), c4049to.m15996x1(), c4049to.m16077c5(), c4049to.m16077c5()).Clone(), new C12014ne(c4049to.m15988h4(), c4049to.m15994to(), c4049to.m16077c5(), c4049to.m16077c5()).Clone(), c4049to.m16078ck(), abstractC12008jd, c3856h4);
    }
}
