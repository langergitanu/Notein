package com.aspose.slides.internal.p253lm;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.o9 */
/* JADX INFO: loaded from: classes4.dex */
public class C6165o9 extends AbstractC6155lr {

    /* JADX INFO: renamed from: to */
    private AbstractC6123ca f17410to;

    public C6165o9(AbstractC6211yd abstractC6211yd, String str) {
        super(abstractC6211yd, str);
        m24911k4(true);
        m24912kk(true);
        m24915x1(true);
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6155lr
    /* JADX INFO: renamed from: c5 */
    public AbstractC6155lr mo24796c5() {
        C6165o9 c6165o9 = new C6165o9(m24908du(), m24910k4(), this.f17410to);
        c6165o9.m24911k4(m24916x1());
        c6165o9.m24915x1(m24913kk());
        c6165o9.m24912kk(m24914to());
        return c6165o9;
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6155lr
    /* JADX INFO: renamed from: jd */
    public int mo24799jd() {
        return 0;
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6155lr
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo24800k4(AbstractC6211yd abstractC6211yd) {
        AbstractC6123ca abstractC6123ca = this.f17410to;
        return abstractC6123ca == null ? C6163nh.f17403k4 : abstractC6123ca;
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6155lr
    /* JADX INFO: renamed from: m9 */
    public boolean mo24803m9() {
        return false;
    }

    public C6165o9(AbstractC6211yd abstractC6211yd, String str, AbstractC6123ca abstractC6123ca) {
        this(abstractC6211yd, str);
        mo24802k4(null, abstractC6123ca);
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6155lr
    /* JADX INFO: renamed from: k4 */
    public void mo24802k4(AbstractC6211yd abstractC6211yd, AbstractC6123ca abstractC6123ca) {
        if (!m24914to()) {
            throw new C6208y2("This property is not writable");
        }
        this.f17410to = abstractC6123ca;
    }
}
