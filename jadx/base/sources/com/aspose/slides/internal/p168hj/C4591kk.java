package com.aspose.slides.internal.p168hj;

import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p416tb.C10912u4;
import com.aspose.slides.internal.p416tb.C10921yd;
import com.aspose.slides.internal.p416tb.C10922yj;
import com.aspose.slides.internal.p420th.C10960jd;
import com.aspose.slides.internal.p475wh.C12007ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.hj.kk */
/* JADX INFO: loaded from: classes.dex */
public class C4591kk extends AbstractC4593x1 {

    /* JADX INFO: renamed from: du */
    private C4589h4 f12826du;

    /* JADX INFO: renamed from: kk */
    private boolean f12827kk;

    /* JADX INFO: renamed from: to */
    private C4589h4 f12828to;

    public C4591kk(C10912u4 c10912u4, C10960jd c10960jd) {
        super(c10912u4, c10960jd);
        this.f12827kk = false;
        this.f12827kk = c10960jd.m52947k4();
        m18969h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m18969h4() {
        C12007ix c12007ix = new C12007ix(0.0f, 0.0f, m18989to().m56550c5(), m18989to().m56575x1());
        C4589h4 c4589h4 = new C4589h4(this.f37962x1);
        this.f12826du = c4589h4;
        c4589h4.m18961k4(c12007ix.Clone());
        this.f12826du.m18960k4(new C3152yj());
        AbstractC4593x1.m18979k4(new C10921yd(this.f12826du.m18959h4()), this.f12826du.m18958du().Clone());
        C4589h4 c4589h42 = new C4589h4(this.f37962x1);
        this.f12828to = c4589h42;
        c4589h42.m18961k4(c12007ix.Clone());
        this.f12828to.m18960k4(new C3152yj());
        C10921yd c10921yd = new C10921yd(this.f12828to.m18959h4());
        AbstractC4593x1.m18979k4(c10921yd, c12007ix.Clone());
        m18970x1(c10921yd, c12007ix.Clone());
    }

    /* JADX INFO: renamed from: x1 */
    private static void m18970x1(C10921yd c10921yd, C12007ix c12007ix) {
        c10921yd.m52650k4("0 G ");
        c10921yd.m52646k4(c12007ix.m56571to());
        c10921yd.m52644h4();
        c10921yd.m52646k4(c12007ix.m56554dy());
        c10921yd.m52650k4(" m ");
        c10921yd.m52646k4(c12007ix.m56556h4());
        c10921yd.m52644h4();
        c10921yd.m52646k4(c12007ix.m56558k4());
        c10921yd.m52650k4(" l s ");
        c10921yd.m52646k4(c12007ix.m56571to());
        c10921yd.m52644h4();
        c10921yd.m52646k4(c12007ix.m56558k4());
        c10921yd.m52650k4(" m ");
        c10921yd.m52646k4(c12007ix.m56556h4());
        c10921yd.m52644h4();
        c10921yd.m52646k4(c12007ix.m56554dy());
        c10921yd.m52650k4(" l s ");
    }

    @Override // com.aspose.slides.internal.p168hj.AbstractC4593x1
    /* JADX INFO: renamed from: k4 */
    public int mo18954k4() {
        return 0;
    }

    @Override // com.aspose.slides.internal.p168hj.AbstractC4593x1
    /* JADX INFO: renamed from: kk */
    public void mo18955kk(C10922yj c10922yj) {
        this.f12828to.mo9082k4(c10922yj);
        this.f12826du.mo9082k4(c10922yj);
    }

    @Override // com.aspose.slides.internal.p168hj.AbstractC4593x1
    /* JADX INFO: renamed from: x1 */
    public void mo18957x1(C10922yj c10922yj) {
        boolean z = this.f12827kk;
        if (z) {
            c10922yj.m52666kk("/DV", z ? "/On" : "/Off");
        }
        c10922yj.m52650k4("/AP");
        c10922yj.m52643dy();
        c10922yj.m52650k4("/N");
        c10922yj.m52643dy();
        c10922yj.m52672x1("/Off");
        c10922yj.m52672x1(this.f12826du.m52565c5());
        c10922yj.m52672x1("/On");
        c10922yj.m52672x1(this.f12828to.m52565c5());
        c10922yj.m52640c5();
        c10922yj.m52640c5();
        c10922yj.m52666kk("/AS", this.f12827kk ? "/On" : "/Off");
    }
}
