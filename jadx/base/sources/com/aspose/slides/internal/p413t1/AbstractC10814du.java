package com.aspose.slides.internal.p413t1;

import com.aspose.slides.C22203OooOO0o;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p183ij.C4978dy;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p191it.AbstractC5120du;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.t1.du */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10814du extends AbstractC5120du {
    @Override // com.aspose.slides.internal.p191it.AbstractC5120du
    /* JADX INFO: renamed from: du */
    public void mo16615du(C5061vw c5061vw, C4201h4 c4201h4) {
        C4978dy c4978dy = (C4978dy) c5061vw;
        C12025x6 c12025x6Clone = c4978dy.m20990x1().m58198to().Clone();
        C12025x6 c12025x6Clone2 = c4978dy.m20989kk().m58198to().Clone();
        C12007ix c12007ixClone = c4978dy.m20985k4().m58248c5().Clone();
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
        if (c4201h4.m16781yj()) {
            c4201h4.m16755up().m55540k4(c11896dy, false);
        } else {
            mo16623k4(c11896dy, c4201h4);
        }
    }

    @Override // com.aspose.slides.internal.p191it.AbstractC5120du
    /* JADX INFO: renamed from: h4 */
    public boolean mo16667h4(C5061vw c5061vw, C4201h4 c4201h4) {
        return !c4201h4.m16781yj();
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo16623k4(C11896dy c11896dy, C4201h4 c4201h4);
}
