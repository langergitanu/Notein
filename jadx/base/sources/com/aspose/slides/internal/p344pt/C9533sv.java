package com.aspose.slides.internal.p344pt;

import com.aspose.slides.internal.p123f5.C3856h4;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p132fj.C4061wp;
import com.aspose.slides.internal.p472w8.C11893c5;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12023wl;

/* JADX INFO: renamed from: com.aspose.slides.internal.pt.sv */
/* JADX INFO: loaded from: classes4.dex */
public class C9533sv extends AbstractC9530rv {
    @Override // com.aspose.slides.internal.p344pt.AbstractC9530rv
    /* JADX INFO: renamed from: x1 */
    public void mo46684x1(C4047sv c4047sv, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) {
        C11893c5 c11893c5Mo17583x1;
        C4061wp c4061wp = (C4061wp) c4047sv;
        C12014ne c12014ne = new C12014ne(c4061wp.m16165to(), c4061wp.m16163kk(), c4061wp.m16167x1() - c4061wp.m16165to(), c4061wp.m16161k4() - c4061wp.m16163kk());
        if (c3856h4.m15482k4() == 8 && c3856h4.m15514to().m55776k4()[3] < 0.0f && c3856h4.m15514to().m55776k4()[0] > 0.0f) {
            c11893c5Mo17583x1 = abstractC12008jd.mo17583x1();
            C11913yj c11913yj = new C11913yj();
            c11913yj.m55763k4(1.0f, -1.0f);
            abstractC12008jd.mo17499k4(c11913yj);
            C12016rv[] c12016rvArr = {c12014ne.m56665du(), new C12016rv(c4061wp.m16167x1(), c4061wp.m16163kk()), new C12016rv(c4061wp.m16167x1(), c4061wp.m16161k4()), new C12016rv(c4061wp.m16165to(), c4061wp.m16161k4())};
            c11913yj.m55774k4(c12016rvArr);
            c12014ne = new C12014ne(c12016rvArr[0].Clone(), new C12023wl(c12016rvArr[1].m56708k4() - c12016rvArr[0].m56708k4(), c12016rvArr[2].m56713x1() - c12016rvArr[0].m56713x1()));
        } else {
            c11893c5Mo17583x1 = null;
        }
        if (c3856h4.m15472dy() != null) {
            abstractC12008jd.mo17594x1(c3856h4.m15472dy(), c12014ne.Clone());
        }
        if (c3856h4.m15464c5() != null) {
            abstractC12008jd.mo17599x1(c3856h4.m15464c5(), c12014ne.Clone());
        }
        if (c11893c5Mo17583x1 != null) {
            abstractC12008jd.mo17496k4(c11893c5Mo17583x1);
        }
    }
}
