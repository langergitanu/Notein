package com.aspose.slides.internal.p344pt;

import com.aspose.slides.C22203OooOO0o;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.internal.p123f5.C3856h4;
import com.aspose.slides.internal.p132fj.C4011du;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.pt.du */
/* JADX INFO: loaded from: classes4.dex */
public class C9497du extends AbstractC9530rv {
    @Override // com.aspose.slides.internal.p344pt.AbstractC9530rv
    /* JADX INFO: renamed from: x1 */
    public void mo46684x1(C4047sv c4047sv, AbstractC12008jd abstractC12008jd, C3856h4 c3856h4) {
        C4011du c4011du = (C4011du) c4047sv;
        C12025x6 c12025x6 = new C12025x6(c4011du.m15877to(), c4011du.m15873kk());
        C12025x6 c12025x62 = new C12025x6(c4011du.m15879x1(), c4011du.m15871k4());
        C12007ix c12007ixClone = C12007ix.m56541k4(c4011du.m15865c5(), c4011du.m15867dy(), c4011du.m15875m9(), c4011du.m15869h4()).Clone();
        C12025x6 c12025x63 = new C12025x6(C22205OooOOo.OooO00o(c12007ixClone, 2.0f, c12007ixClone.m56557jd()), C22203OooOO0o.OooO0O0(c12007ixClone, 2.0f, c12007ixClone.m56551ck()));
        float fM67498to = (float) (C14116yg.m67498to(c12025x6.m56897x1() - c12025x63.m56897x1(), c12025x6.m56895kk() - c12025x63.m56895kk()) * 57.29577951308232d);
        float fM67498to2 = (float) (C14116yg.m67498to(c12025x62.m56897x1() - c12025x63.m56897x1(), c12025x62.m56895kk() - c12025x63.m56895kk()) * 57.29577951308232d);
        if (fM67498to < 0.0f) {
            fM67498to += 360.0f;
        }
        if (fM67498to2 < 0.0f) {
            fM67498to2 += 360.0f;
        }
        float f = fM67498to2 - fM67498to;
        if (f < 0.0f) {
            f += 360.0f;
        }
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55543k4(c12007ixClone.Clone(), fM67498to, f);
        c11896dy.m55567m9();
        if (c3856h4.m15472dy() != null) {
            abstractC12008jd.mo17527k4(c3856h4.m15472dy(), c11896dy);
        }
        if (c3856h4.m15464c5() != null) {
            abstractC12008jd.mo17540k4(c3856h4.m15464c5(), c11896dy);
        }
    }
}
