package com.aspose.slides.internal.p071cz;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.d2 */
/* JADX INFO: loaded from: classes3.dex */
final class C2692d2 extends AbstractC2876qp {

    /* JADX INFO: renamed from: k4 */
    private final C2728fh f8549k4;

    /* JADX INFO: renamed from: kk */
    private final C2778ji f8550kk;

    /* JADX INFO: renamed from: x1 */
    private double f8552x1 = 0.0d;

    /* JADX INFO: renamed from: to */
    private double f8551to = 0.0d;

    public C2692d2(C2728fh c2728fh, C2778ji c2778ji) {
        this.f8549k4 = c2728fh;
        this.f8550kk = c2778ji;
    }

    /* JADX INFO: renamed from: x1 */
    private void m12185x1() {
        this.f8551to = 0.0d;
        for (AbstractC2871qe abstractC2871qe : m12491h4()) {
            if (abstractC2871qe.mo12122kk().m12482k4() > this.f8551to) {
                this.f8551to = abstractC2871qe.mo12122kk().m12482k4();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C2688cl m12186k4() {
        double dM12305k4 = this.f8549k4.m12240c5() != null ? this.f8549k4.m12240c5().m12305k4() : (this.f8549k4.m12243dy() != null ? 1 + this.f8549k4.m12243dy().m12384k4() : 1) * 347663;
        double dM12405k4 = 0.0d;
        double dM12305k42 = this.f8549k4.m12246jd() != null ? this.f8549k4.m12246jd().m12305k4() : 0.0d;
        if (m12493m9() == 0) {
            dM12405k4 = this.f8549k4.m12264m9() != null ? this.f8549k4.m12264m9().m12405k4() : -342900.0d;
        }
        return new C2688cl(dM12405k4, dM12305k4, dM12305k42);
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2871qe
    /* JADX INFO: renamed from: kk */
    public C2867q6 mo12122kk() {
        return new C2867q6(this.f8551to, this.f8552x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12187k4(C2688cl c2688cl) {
        c2688cl.m12489k4(new C2706dw(0.0d, this.f8552x1));
        m12492k4((AbstractC2871qe) c2688cl);
        this.f8552x1 = c2688cl.mo12122kk().m12484x1() + this.f8552x1;
        m12185x1();
    }
}
