package com.aspose.slides.internal.p253lm;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.yj */
/* JADX INFO: loaded from: classes4.dex */
public class C6213yj extends AbstractC6172qq {

    /* JADX INFO: renamed from: du */
    private C6189up f17577du;

    /* JADX INFO: renamed from: dy */
    private C6116bs f17578dy;

    /* JADX INFO: renamed from: h4 */
    private C6198wp f17579h4;

    /* JADX INFO: renamed from: m9 */
    private C6198wp f17580m9;

    /* JADX INFO: renamed from: to */
    private C6189up f17581to;

    public C6213yj(InterfaceC6173qw interfaceC6173qw) {
        super(interfaceC6173qw);
        ((C6198wp) this).f17519k4 = "Boolean";
        C6116bs c6116bsM24760k4 = interfaceC6173qw.mo24967fa().m24760k4((C6198wp) this);
        this.f17578dy = c6116bsM24760k4;
        m25174k4("prototype", c6116bsM24760k4, 7);
        m25191x1(m25189k4(true));
        m25190k4(m25189k4(false));
    }

    /* JADX INFO: renamed from: c5 */
    public final C6189up m25187c5() {
        return this.f17581to;
    }

    /* JADX INFO: renamed from: jd */
    public final C6189up m25188jd() {
        return this.f17577du;
    }

    @Override // com.aspose.slides.internal.p253lm.C6198wp
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10037k4(InterfaceC6132em interfaceC6132em, AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        if (abstractC6211yd == null || C7019kk.m27452k4((Object) abstractC6211yd, InterfaceC6173qw.class) == interfaceC6132em.mo10078to()) {
            interfaceC6132em.mo10079x1(abstractC6123caArr.length > 0 ? new C6189up(abstractC6123caArr[0].mo24772k4(), m25138rv()) : new C6189up(false, m25138rv()));
            return abstractC6211yd;
        }
        abstractC6211yd.mo24771k4(abstractC6123caArr.length > 0 ? Boolean.valueOf(abstractC6123caArr[0].mo24772k4()) : Boolean.FALSE);
        interfaceC6132em.mo10079x1(abstractC6211yd);
        return abstractC6211yd;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25191x1(C6189up c6189up) {
        this.f17577du = c6189up;
    }

    /* JADX INFO: renamed from: k4 */
    public final C6189up m25189k4(boolean z) {
        return new C6189up(z, m25138rv());
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6172qq
    /* JADX INFO: renamed from: k4 */
    public void mo10093k4(InterfaceC6173qw interfaceC6173qw) {
        C6116bs c6116bsM25138rv = m25138rv();
        this.f17579h4 = new C6153ks(interfaceC6173qw, "toString", c6116bsM25138rv);
        this.f17580m9 = new C6153ks(interfaceC6173qw, "toLocaleString", c6116bsM25138rv);
        c6116bsM25138rv.m25174k4("toString", this.f17579h4, 2);
        c6116bsM25138rv.m25174k4("toLocaleString", this.f17580m9, 2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25190k4(C6189up c6189up) {
        this.f17581to = c6189up;
    }
}
