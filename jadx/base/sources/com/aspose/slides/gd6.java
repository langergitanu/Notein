package com.aspose.slides;

import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12010kk;
import com.aspose.slides.internal.p475wh.C12023wl;

/* JADX INFO: loaded from: classes3.dex */
class gd6 extends AbstractC14875z7 implements fsr {

    /* JADX INFO: renamed from: x1 */
    private boolean f5192x1;

    public gd6(C12023wl c12023wl) {
        super(c12023wl.Clone());
    }

    @Override // com.aspose.slides.fsr
    /* JADX INFO: renamed from: k4 */
    public final void mo3090k4(float f, AbstractC12008jd abstractC12008jd) {
        if (m6496x1()) {
            f = 1.0f - f;
        }
        C12007ix c12007ix = new C12007ix();
        c12007ix.m56576x1(this.f50495k4.m56865x1() * f);
        c12007ix.m56560k4(f * this.f50495k4.m56862kk());
        c12007ix.m56566kk((this.f50495k4.m56865x1() - c12007ix.m56550c5()) / 2.0f);
        c12007ix.m56572to((this.f50495k4.m56862kk() - c12007ix.m56575x1()) / 2.0f);
        abstractC12008jd.mo17517k4(C12003du.m56460uz().Clone());
        if (!m6496x1()) {
            abstractC12008jd.mo17507k4(m74340k4(), c12007ix.Clone(), c12007ix.Clone(), 2);
        } else {
            abstractC12008jd.mo17589x1(m74340k4(), 0, 0);
            abstractC12008jd.mo17593x1(C12010kk.m56610k4(), c12007ix.Clone());
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m6496x1() {
        return this.f5192x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6495k4(boolean z) {
        this.f5192x1 = z;
    }
}
