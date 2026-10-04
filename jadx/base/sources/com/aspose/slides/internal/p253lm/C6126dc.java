package com.aspose.slides.internal.p253lm;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.dc */
/* JADX INFO: loaded from: classes4.dex */
public class C6126dc extends AbstractC6155lr {

    /* JADX INFO: renamed from: du */
    private C6198wp f17312du;

    /* JADX INFO: renamed from: h4 */
    private C6198wp f17313h4;

    /* JADX INFO: renamed from: to */
    private InterfaceC6173qw f17314to;

    public C6126dc(InterfaceC6173qw interfaceC6173qw, AbstractC6211yd abstractC6211yd, String str) {
        super(abstractC6211yd, str);
        this.f17314to = interfaceC6173qw;
        m24911k4(false);
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6155lr
    /* JADX INFO: renamed from: c5 */
    public AbstractC6155lr mo24796c5() {
        C6126dc c6126dc = new C6126dc(this.f17314to, m24908du(), m24910k4());
        c6126dc.m24911k4(m24916x1());
        c6126dc.m24915x1(m24913kk());
        c6126dc.m24912kk(m24914to());
        c6126dc.m24801k4(m24797ck());
        c6126dc.m24804x1(m24798fa());
        return c6126dc;
    }

    /* JADX INFO: renamed from: ck */
    public final C6198wp m24797ck() {
        return this.f17312du;
    }

    /* JADX INFO: renamed from: fa */
    public final C6198wp m24798fa() {
        return this.f17313h4;
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6155lr
    /* JADX INFO: renamed from: jd */
    public int mo24799jd() {
        return 1;
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6155lr
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo24800k4(AbstractC6211yd abstractC6211yd) {
        this.f17314to.mo24969jd().mo10069k4(m24797ck(), abstractC6211yd, AbstractC6123ca.f17309kk);
        return this.f17314to.mo24969jd().mo10077m9();
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6155lr
    /* JADX INFO: renamed from: m9 */
    public boolean mo24803m9() {
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m24804x1(C6198wp c6198wp) {
        this.f17313h4 = c6198wp;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24801k4(C6198wp c6198wp) {
        this.f17312du = c6198wp;
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6155lr
    /* JADX INFO: renamed from: k4 */
    public void mo24802k4(AbstractC6211yd abstractC6211yd, AbstractC6123ca abstractC6123ca) {
        if (m24798fa() == null) {
            throw new C6158m4(this.f17314to.mo24981wl().m25166jd());
        }
        this.f17314to.mo24969jd().mo10069k4(m24798fa(), abstractC6211yd, new AbstractC6123ca[]{abstractC6123ca});
    }
}
