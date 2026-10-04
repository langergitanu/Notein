package com.aspose.slides;

import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.oa */
/* JADX INFO: loaded from: classes3.dex */
final class C14220oa extends AbstractC14875z7 implements fsr {

    /* JADX INFO: renamed from: kk */
    private AbstractC12002ck f47726kk;

    /* JADX INFO: renamed from: x1 */
    private final C14819xv f47727x1;

    public C14220oa(C12023wl c12023wl, int i) {
        super(c12023wl.Clone());
        float fM67483k4 = C14116yg.m67483k4(c12023wl.m56865x1(), c12023wl.m56862kk());
        oju ojuVar = new oju(fM67483k4, fM67483k4);
        C14819xv c14819xv = new C14819xv(i);
        this.f47727x1 = c14819xv;
        c14819xv.m73609k4(oju.m68618k4(new oju(c12023wl.m56865x1(), c12023wl.m56862kk()), 2).Clone(), ojuVar.Clone());
    }

    @Override // com.aspose.slides.fsr
    /* JADX INFO: renamed from: k4 */
    public final void mo3090k4(float f, AbstractC12008jd abstractC12008jd) {
        this.f47727x1.m73608k4(f);
        if (m74340k4() != null) {
            abstractC12008jd.mo17589x1(m74340k4(), 0, 0);
        } else {
            abstractC12008jd.mo17517k4(C12003du.m56460uz().Clone());
        }
        abstractC12008jd.mo17497k4(this.f47727x1.f50208k4, 0);
        abstractC12008jd.mo17589x1(m68423x1(), 0, 0);
        abstractC12008jd.mo17573to();
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC12002ck m68423x1() {
        return this.f47726kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m68424x1(AbstractC12002ck abstractC12002ck) {
        this.f47726kk = abstractC12002ck;
    }
}
