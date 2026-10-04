package com.aspose.slides.internal.p168hj;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p039be.AbstractC1689x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p416tb.C10912u4;
import com.aspose.slides.internal.p416tb.C10921yd;
import com.aspose.slides.internal.p416tb.C10922yj;
import com.aspose.slides.internal.p420th.C10953ck;
import com.aspose.slides.internal.p475wh.C12007ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.hj.to */
/* JADX INFO: loaded from: classes.dex */
public class C4592to extends AbstractC4593x1 {

    /* JADX INFO: renamed from: du */
    private C4589h4 f12829du;

    /* JADX INFO: renamed from: h4 */
    private final C5659x1 f12830h4;

    /* JADX INFO: renamed from: kk */
    private final int f12831kk;

    /* JADX INFO: renamed from: m9 */
    private final C5656k4 f12832m9;

    /* JADX INFO: renamed from: to */
    private final List<String> f12833to;

    public C4592to(C10912u4 c10912u4, C10953ck c10953ck) {
        super(c10912u4, c10953ck);
        this.f12832m9 = C5656k4.f15518dy;
        this.f12831kk = c10953ck.m52917kk();
        this.f12833to = c10953ck.m52918x1();
        this.f12830h4 = c10953ck.m52912k4();
        m18971h4();
        m18972ks();
    }

    /* JADX INFO: renamed from: h4 */
    private void m18971h4() {
        float fM56556h4 = m18989to().m56556h4() + 10.0f;
        float fM56558k4 = m18989to().m56558k4() + 2.0f;
        if (fM56558k4 > ((AbstractC4593x1) this).f12836k4.m52545kk()) {
            fM56558k4 = ((AbstractC4593x1) this).f12836k4.m52545kk();
        }
        if (fM56556h4 > ((AbstractC4593x1) this).f12836k4.m52546x1()) {
            fM56556h4 = ((AbstractC4593x1) this).f12836k4.m52546x1();
        }
        m18987k4(C12007ix.m56541k4(m18989to().m56571to(), m18989to().m56554dy(), fM56556h4, fM56558k4).Clone());
    }

    /* JADX INFO: renamed from: ks */
    private void m18972ks() {
        C4589h4 c4589h4 = new C4589h4(this.f37962x1);
        this.f12829du = c4589h4;
        c4589h4.m18961k4(new C12007ix(0.0f, 0.0f, m18989to().m56550c5(), m18989to().m56575x1()));
        this.f12829du.m18960k4(m18973rv());
    }

    /* JADX INFO: renamed from: rv */
    private C3152yj m18973rv() {
        C3152yj c3152yj = new C3152yj();
        C10921yd c10921yd = new C10921yd(c3152yj);
        AbstractC4593x1.m18979k4(c10921yd, this.f12829du.m18958du().Clone());
        AbstractC4593x1.m18975k4(c10921yd);
        AbstractC4593x1.m18978k4(c10921yd, this.f12832m9);
        AbstractC1689x1 abstractC1689x1M18985k4 = m18985k4(c10921yd, this.f12830h4);
        AbstractC4593x1.m18976k4(c10921yd, (m18989to().m56575x1() - this.f12830h4.m23114dy()) - 1.0f);
        AbstractC4593x1.m18977k4(c10921yd, 0.0f, 0.0f);
        AbstractC4593x1.m18982k4(c10921yd, this.f12833to.get_Item(this.f12831kk), abstractC1689x1M18985k4);
        AbstractC4593x1.m18983x1(c10921yd);
        return c3152yj;
    }

    @Override // com.aspose.slides.internal.p168hj.AbstractC4593x1
    /* JADX INFO: renamed from: k4 */
    public int mo18954k4() {
        return 2;
    }

    @Override // com.aspose.slides.internal.p168hj.AbstractC4593x1
    /* JADX INFO: renamed from: kk */
    public void mo18955kk(C10922yj c10922yj) {
        this.f12829du.mo9082k4(c10922yj);
    }

    @Override // com.aspose.slides.internal.p168hj.AbstractC4593x1
    /* JADX INFO: renamed from: x1 */
    public int mo18956x1() {
        return 131072 | super.mo18956x1();
    }

    @Override // com.aspose.slides.internal.p168hj.AbstractC4593x1
    /* JADX INFO: renamed from: x1 */
    public void mo18957x1(C10922yj c10922yj) {
        c10922yj.m52650k4("/Opt [");
        for (int i = 0; i < this.f12833to.size(); i++) {
            c10922yj.m52669to(this.f12833to.get_Item(i));
            c10922yj.m52644h4();
        }
        c10922yj.m52650k4("]");
        c10922yj.m52670to("/V", this.f12833to.get_Item(this.f12831kk));
        c10922yj.m52659k4("/DA", m18986k4(this.f12830h4, this.f12832m9), false);
        c10922yj.m52650k4("/AP");
        c10922yj.m52643dy();
        c10922yj.m52672x1("/N");
        c10922yj.m52650k4(this.f12829du.m52565c5());
        c10922yj.m52640c5();
    }
}
