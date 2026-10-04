package com.aspose.slides.internal.p253lm;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.j5 */
/* JADX INFO: loaded from: classes4.dex */
public class C6146j5 extends AbstractC6155lr {

    /* JADX INFO: renamed from: du */
    private AbstractC6211yd f17359du;

    /* JADX INFO: renamed from: to */
    private AbstractC6155lr f17360to;

    public C6146j5(AbstractC6211yd abstractC6211yd, String str, AbstractC6155lr abstractC6155lr, AbstractC6211yd abstractC6211yd2) {
        super(abstractC6211yd, str);
        if (abstractC6155lr.mo24803m9()) {
            C6146j5 c6146j5 = (C6146j5) C7019kk.m27452k4((Object) abstractC6155lr, C6146j5.class);
            this.f17360to = c6146j5.f17360to;
            this.f17359du = c6146j5.f17359du;
        } else {
            this.f17360to = abstractC6155lr;
        }
        this.f17388k4 = true;
        this.f17389kk = true;
        this.f17391x1 = true;
        this.f17359du = abstractC6211yd2;
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6155lr
    /* JADX INFO: renamed from: c5 */
    public AbstractC6155lr mo24796c5() {
        C6146j5 c6146j5 = new C6146j5(m24908du(), m24910k4(), this, m24858ck());
        c6146j5.f17389kk = m24914to();
        c6146j5.f17391x1 = m24913kk();
        c6146j5.f17388k4 = m24916x1();
        return c6146j5;
    }

    /* JADX INFO: renamed from: ck */
    public final AbstractC6211yd m24858ck() {
        return this.f17359du;
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6155lr
    /* JADX INFO: renamed from: h4 */
    public boolean mo24859h4() {
        return this.f17360to.mo24859h4();
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6155lr
    /* JADX INFO: renamed from: jd */
    public int mo24799jd() {
        return 0;
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6155lr
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo24800k4(AbstractC6211yd abstractC6211yd) {
        return this.f17360to.mo24800k4(abstractC6211yd);
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6155lr
    /* JADX INFO: renamed from: m9 */
    public boolean mo24803m9() {
        return true;
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6155lr
    /* JADX INFO: renamed from: to */
    public void mo24860to(boolean z) {
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6155lr
    /* JADX INFO: renamed from: k4 */
    public void mo24802k4(AbstractC6211yd abstractC6211yd, AbstractC6123ca abstractC6123ca) {
        this.f17360to.mo24802k4(abstractC6211yd, abstractC6123ca);
    }
}
