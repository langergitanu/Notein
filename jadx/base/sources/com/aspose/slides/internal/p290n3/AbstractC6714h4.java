package com.aspose.slides.internal.p290n3;

import com.aspose.slides.C22203OooOO0o;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.internal.p040bg.AbstractC1692du;
import com.aspose.slides.internal.p040bg.AbstractC1701up;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p349q3.C9640dy;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.n3.h4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6714h4 extends AbstractC1692du {
    public AbstractC6714h4(AbstractC1701up abstractC1701up) {
        super(abstractC1701up);
    }

    @Override // com.aspose.slides.internal.p040bg.AbstractC1692du
    /* JADX INFO: renamed from: h4 */
    public void mo7733h4(C9723vw c9723vw, C3585h4 c3585h4) {
        C9640dy c9640dy = (C9640dy) c9723vw;
        C12025x6 c12025x6Clone = c9640dy.m47165x1().m57782to().Clone();
        C12025x6 c12025x6Clone2 = c9640dy.m47164kk().m57782to().Clone();
        C12007ix c12007ixClone = c9640dy.m47160k4().m57841c5().Clone();
        C12025x6 c12025x6 = new C12025x6(C22205OooOOo.OooO00o(c12007ixClone, 2.0f, c12007ixClone.m56557jd()), C22203OooOO0o.OooO0O0(c12007ixClone, 2.0f, c12007ixClone.m56551ck()));
        float fM67498to = (float) (C14116yg.m67498to(c12025x6Clone.m56897x1() - c12025x6.m56897x1(), c12025x6Clone.m56895kk() - c12025x6.m56895kk()) * 57.29577951308232d);
        float fM67498to2 = (float) (C14116yg.m67498to(c12025x6Clone2.m56897x1() - c12025x6.m56897x1(), c12025x6Clone2.m56895kk() - c12025x6.m56895kk()) * 57.29577951308232d);
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
        if (c3585h4.m14582yj()) {
            c3585h4.m14556up().m55540k4(c11896dy, false);
        } else {
            mo7757k4(c11896dy, c3585h4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo7757k4(C11896dy c11896dy, C3585h4 c3585h4);

    @Override // com.aspose.slides.internal.p040bg.AbstractC1692du
    /* JADX INFO: renamed from: m9 */
    public boolean mo9136m9(C9723vw c9723vw, C3585h4 c3585h4) {
        return !c3585h4.m14582yj();
    }
}
