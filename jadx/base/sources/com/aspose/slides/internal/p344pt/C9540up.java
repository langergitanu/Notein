package com.aspose.slides.internal.p344pt;

import com.aspose.slides.internal.p123f5.C3856h4;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p132fj.C4054up;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.pt.up */
/* JADX INFO: loaded from: classes4.dex */
public class C9540up extends AbstractC9535to {
    @Override // com.aspose.slides.internal.p344pt.AbstractC9530rv
    /* JADX INFO: renamed from: x1 */
    public void mo46684x1(C4047sv c4047sv, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) {
        C12009k4 c12009k4;
        C4054up c4054up = (C4054up) c4047sv;
        C12014ne c12014ne = new C12014ne(c4054up.m15992kk(), c4054up.m15996x1(), c4054up.m16123c5(), c4054up.m16126dy());
        C12014ne c12014ne2 = new C12014ne(c4054up.m15988h4(), c4054up.m15994to(), c4054up.m16123c5(), c4054up.m16126dy());
        long jM15989k4 = c4054up.m15989k4();
        if (c4054up.m16124ck()) {
            c12009k4 = c4054up.m16128jd().m57639x1(c3856h4.m15468ck());
        } else {
            int i = (int) jM15989k4;
            if (i == 0 || i == 170 || i == 240 || i == 255) {
                c12009k4 = null;
            } else {
                c12009k4 = new C12009k4(c4054up.m16123c5(), c4054up.m16126dy());
                AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
                try {
                    C12014ne c12014ne3 = new C12014ne(0, 0, c4054up.m16123c5(), c4054up.m16126dy());
                    abstractC12008jdM56582k4.mo17512k4(c3856h4.m15479ix(), c12014ne3.Clone(), c12014ne.Clone(), 2);
                    c12014ne3.CloneTo(c12014ne);
                    abstractC12008jdM56582k4.dispose();
                } catch (Throwable th) {
                    if (abstractC12008jdM56582k4 != null) {
                        abstractC12008jdM56582k4.dispose();
                    }
                    throw th;
                }
            }
        }
        m46701k4(jM15989k4, c12009k4, c12014ne.Clone(), c12014ne2.Clone(), c4054up.m16124ck(), abstractC12008jd, c3856h4);
    }
}
