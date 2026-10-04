package com.aspose.slides.internal.p296nd;

import com.aspose.slides.internal.p042bn.C1752sv;
import com.aspose.slides.internal.p042bn.C1754to;
import com.aspose.slides.internal.p441ui.C11315h4;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p498xe.C12523x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.nd.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C6827kk extends AbstractC6846to {
    /* JADX INFO: renamed from: x1 */
    private C12009k4 m26877x1(boolean z, C12523x1 c12523x1, C11315h4 c11315h4) {
        if (z) {
            return c12523x1.m58274c5();
        }
        C12009k4 c12009k4 = new C12009k4(c11315h4.m54453v4(), c11315h4.m54438lr());
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
        try {
            abstractC12008jdM56582k4.mo17476du(1);
            abstractC12008jdM56582k4.mo17560kk(7);
            abstractC12008jdM56582k4.mo17508k4(c11315h4.m54409ix(), new C12014ne(0, 0, c11315h4.m54453v4(), c11315h4.m54438lr()));
            abstractC12008jdM56582k4.dispose();
            return c12009k4;
        } catch (Throwable th) {
            if (abstractC12008jdM56582k4 != null) {
                abstractC12008jdM56582k4.dispose();
            }
            throw th;
        }
    }

    @Override // com.aspose.slides.internal.p296nd.AbstractC6841rv
    /* JADX INFO: renamed from: x1 */
    public void mo26875x1(C1752sv c1752sv, AbstractC12008jd abstractC12008jd, C11315h4 c11315h4) {
        C1754to c1754to = (C1754to) c1752sv;
        m26885k4(c1754to.m9328k4(), m26877x1(c1754to.m9418jd(), c1754to.m9414c5(), c11315h4), new C12014ne(c1754to.m9331kk(), c1754to.m9335x1(), c1754to.m9416dy(), c1754to.m9416dy()).Clone(), new C12014ne(c1754to.m9327h4(), c1754to.m9333to(), c1754to.m9416dy(), c1754to.m9416dy()).Clone(), c1754to.m9418jd(), abstractC12008jd, c11315h4);
    }
}
