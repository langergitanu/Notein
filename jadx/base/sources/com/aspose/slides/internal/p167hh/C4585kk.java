package com.aspose.slides.internal.p167hh;

import com.aspose.slides.internal.p167hh.AbstractC4584k4;
import com.aspose.slides.internal.p347px.AbstractC9608yj;
import com.aspose.slides.internal.p347px.C9579bv;

/* JADX INFO: renamed from: com.aspose.slides.internal.hh.kk */
/* JADX INFO: loaded from: classes.dex */
public class C4585kk extends C4586to {

    /* JADX INFO: renamed from: du */
    protected final C4582du f12805du;

    /* JADX INFO: renamed from: h4 */
    protected AbstractC9608yj f12806h4;

    public C4585kk(C4582du c4582du, C9579bv c9579bv) {
        this(c4582du, c9579bv, 1.0f, c9579bv.m46770h4());
    }

    /* JADX INFO: renamed from: fa */
    private void m18943fa() {
        if (this.f12808m9 == null) {
            C9579bv c9579bvM18918k4 = this.f12805du.m18918k4(this.f12797k4, this.f12799to, this.f12806h4);
            this.f12808m9 = c9579bvM18918k4;
            this.f12807dy = m18945k4(c9579bvM18918k4);
        }
    }

    @Override // com.aspose.slides.internal.p167hh.C4586to
    /* JADX INFO: renamed from: ck */
    public C9579bv mo18944ck() {
        m18943fa();
        return this.f12808m9;
    }

    @Override // com.aspose.slides.internal.p167hh.C4586to, com.aspose.slides.internal.p167hh.AbstractC4584k4
    /* JADX INFO: renamed from: jd */
    public AbstractC4584k4.k4 mo18927jd() {
        m18943fa();
        return super.mo18927jd();
    }

    @Override // com.aspose.slides.internal.p167hh.C4586to, com.aspose.slides.internal.p167hh.AbstractC4584k4
    /* JADX INFO: renamed from: k4 */
    public AbstractC4584k4 mo18929k4(float f) {
        C9579bv c9579bv = this.f12808m9;
        return c9579bv != null ? new C4585kk(this.f12805du, c9579bv, f, this.f12799to) : new C4585kk(this.f12805du, this.f12806h4, this.f12797k4, this.f12800x1, f, this.f12799to);
    }

    public C4585kk(C4582du c4582du, C9579bv c9579bv, float f, int i) {
        super(c9579bv, f, i);
        this.f12805du = c4582du;
    }

    @Override // com.aspose.slides.internal.p167hh.C4586to, com.aspose.slides.internal.p167hh.AbstractC4584k4
    /* JADX INFO: renamed from: k4 */
    public AbstractC4584k4 mo18930k4(float f, int i) {
        C9579bv c9579bv = this.f12808m9;
        return c9579bv != null ? new C4585kk(this.f12805du, c9579bv, f, i) : new C4585kk(this.f12805du, this.f12806h4, this.f12797k4, this.f12800x1, f, i);
    }

    public C4585kk(C4582du c4582du, AbstractC9608yj abstractC9608yj, String str, String str2, float f, int i) {
        super(str, str2, f, i);
        this.f12805du = c4582du;
        this.f12806h4 = abstractC9608yj;
    }

    @Override // com.aspose.slides.internal.p167hh.C4586to, com.aspose.slides.internal.p167hh.AbstractC4584k4
    /* JADX INFO: renamed from: k4 */
    public AbstractC4584k4 mo18931k4(int i) {
        C9579bv c9579bv = this.f12808m9;
        return c9579bv != null ? new C4585kk(this.f12805du, c9579bv, this.f12798kk, i) : new C4585kk(this.f12805du, this.f12806h4, this.f12797k4, this.f12800x1, this.f12798kk, i);
    }
}
