package com.aspose.slides.internal.p071cz;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.cl */
/* JADX INFO: loaded from: classes3.dex */
class C2688cl extends AbstractC2876qp {

    /* JADX INFO: renamed from: du */
    private final double f8536du;

    /* JADX INFO: renamed from: h4 */
    private final double f8537h4;

    /* JADX INFO: renamed from: k4 */
    private AbstractC2788k9 f8538k4;

    /* JADX INFO: renamed from: kk */
    private final double f8539kk;

    /* JADX INFO: renamed from: m9 */
    private double f8540m9;

    /* JADX INFO: renamed from: x1 */
    private double f8542x1 = 0.0d;

    /* JADX INFO: renamed from: to */
    private double f8541to = 0.0d;

    public C2688cl(double d, double d2, double d3) {
        this.f8539kk = d;
        this.f8536du = d2;
        this.f8537h4 = d3;
        this.f8540m9 = d2 + d;
    }

    /* JADX INFO: renamed from: c5 */
    private void m12173c5() {
        AbstractC2871qe[] abstractC2871qeArrM12491h4 = m12491h4();
        if (this.f8538k4 != null) {
            this.f8540m9 = this.f8536du + this.f8539kk;
            for (AbstractC2871qe abstractC2871qe : abstractC2871qeArrM12491h4) {
                abstractC2871qe.m12489k4(new C2706dw(this.f8540m9, abstractC2871qe.m12490to().m12212x1()));
                this.f8540m9 = abstractC2871qe.mo12122kk().m12482k4() + this.f8540m9;
            }
        }
    }

    /* JADX INFO: renamed from: dy */
    private void m12174dy() {
        this.f8542x1 = 0.0d;
        this.f8541to = 0.0d;
        for (AbstractC2871qe abstractC2871qe : m12491h4()) {
            C2918tx c2918tx = (C2918tx) abstractC2871qe;
            if (c2918tx.mo12122kk().m12484x1() > this.f8542x1) {
                this.f8542x1 = c2918tx.mo12122kk().m12484x1();
            }
            if (c2918tx.m12547k4().m12371m9() > this.f8541to) {
                this.f8541to = c2918tx.m12547k4().m12371m9();
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m12175x1() {
        AbstractC2871qe.m12488du();
        for (AbstractC2871qe abstractC2871qe : m12491h4()) {
            abstractC2871qe.m12489k4(new C2706dw(abstractC2871qe.m12490to().m12210k4(), this.f8542x1));
        }
        AbstractC2788k9 abstractC2788k9 = this.f8538k4;
        if (abstractC2788k9 != null) {
            abstractC2788k9.m12489k4(new C2706dw(abstractC2788k9.m12490to().m12210k4(), this.f8542x1));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC2788k9 m12177k4() {
        return this.f8538k4;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2871qe
    /* JADX INFO: renamed from: kk */
    public C2867q6 mo12122kk() {
        return new C2867q6(this.f8536du + this.f8539kk + this.f8540m9 + this.f8537h4, this.f8542x1);
    }

    /* JADX INFO: renamed from: x1 */
    private void m12176x1(AbstractC2788k9 abstractC2788k9) {
        AbstractC2871qe[] abstractC2871qeArrM12491h4 = m12491h4();
        this.f8538k4 = abstractC2788k9;
        if (abstractC2788k9 == null) {
            return;
        }
        double d = this.f8536du + this.f8539kk;
        this.f8540m9 = d;
        abstractC2788k9.m12489k4(new C2706dw(d, abstractC2788k9.m12490to().m12212x1()));
        if (C7019kk.m27469x1(this.f8538k4, C2748h8.class)) {
            this.f8540m9 = this.f8536du;
        } else {
            this.f8540m9 = this.f8538k4.mo12122kk().m12482k4() + this.f8540m9;
        }
        for (AbstractC2871qe abstractC2871qe : abstractC2871qeArrM12491h4) {
            abstractC2871qe.m12489k4(new C2706dw(this.f8540m9, abstractC2871qe.m12490to().m12212x1()));
            this.f8540m9 = abstractC2871qe.mo12122kk().m12482k4() + this.f8540m9;
        }
        m12175x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12178k4(AbstractC2788k9 abstractC2788k9) {
        m12173c5();
        m12176x1(abstractC2788k9);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12179k4(C2918tx c2918tx) {
        c2918tx.m12549x1();
        m12492k4((AbstractC2871qe) c2918tx);
        c2918tx.m12489k4(new C2706dw(this.f8540m9, c2918tx.m12490to().m12212x1()));
        this.f8540m9 = c2918tx.mo12122kk().m12482k4() + this.f8540m9;
        m12174dy();
        m12175x1();
    }
}
