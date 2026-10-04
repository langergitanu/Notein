package com.aspose.slides.internal.p253lm;

import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.domain.models.p605ai.AiFeatureConfig;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.vt */
/* JADX INFO: loaded from: classes4.dex */
public class C6194vt extends AbstractC6172qq {

    /* JADX INFO: renamed from: c5 */
    private C6198wp f17507c5;

    /* JADX INFO: renamed from: du */
    private C6198wp f17508du;

    /* JADX INFO: renamed from: dy */
    private C6198wp f17509dy;

    /* JADX INFO: renamed from: h4 */
    private C6198wp f17510h4;

    /* JADX INFO: renamed from: m9 */
    private C6198wp f17511m9;

    /* JADX INFO: renamed from: to */
    private C6171qn f17512to;

    public C6194vt(InterfaceC6173qw interfaceC6173qw) {
        super(interfaceC6173qw);
        ((C6198wp) this).f17519k4 = "RegExp";
        this.f17512to = new C6171qn(interfaceC6173qw, null, m25138rv());
        m25174k4("prototype", interfaceC6173qw.mo24967fa().m24760k4((C6198wp) this), 7);
    }

    /* JADX INFO: renamed from: jd */
    public final C6195vw m25122jd() {
        return m25124k4(C14113y2.f47374k4, false, false, false);
    }

    @Override // com.aspose.slides.internal.p253lm.C6198wp
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10037k4(InterfaceC6132em interfaceC6132em, AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return interfaceC6132em.mo10079x1(abstractC6123caArr.length == 0 ? m25122jd() : m25124k4(abstractC6123caArr[0].toString(), false, false, false));
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC6123ca m25123k4(C6195vw c6195vw, AbstractC6123ca[] abstractC6123caArr) {
        return this.f17512to.m24964x1(c6195vw, abstractC6123caArr);
    }

    /* JADX INFO: renamed from: k4 */
    public final C6195vw m25124k4(String str, boolean z, boolean z2, boolean z3) {
        C6195vw c6195vw = new C6195vw(str, z, z2, z3, m25138rv());
        c6195vw.mo25037k4("source", m24965ck().mo24980v4().m25068h4(str));
        c6195vw.mo25037k4("lastIndex", m24965ck().mo24977um().m25186k4(0.0d));
        c6195vw.mo25037k4(AiFeatureConfig.DEFAULT_AI_ASSISTANT_MODEL_LOCATION, m24965ck().mo24972ks().m25189k4(z));
        return c6195vw;
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6172qq
    /* JADX INFO: renamed from: k4 */
    public void mo10093k4(InterfaceC6173qw interfaceC6173qw) {
        C6116bs c6116bsM25138rv = m25138rv();
        this.f17508du = new C6171qn(interfaceC6173qw, "toString", c6116bsM25138rv);
        this.f17510h4 = new C6171qn(interfaceC6173qw, "toLocaleString", c6116bsM25138rv);
        this.f17511m9 = new C6171qn(interfaceC6173qw, "lastIndex", c6116bsM25138rv);
        this.f17509dy = new C6171qn(interfaceC6173qw, "exec", c6116bsM25138rv);
        this.f17507c5 = new C6171qn(interfaceC6173qw, "test", c6116bsM25138rv);
        c6116bsM25138rv.m25174k4("toString", this.f17508du, 2);
        c6116bsM25138rv.m25174k4("toLocaleString", this.f17510h4, 2);
        c6116bsM25138rv.m25174k4("lastIndex", this.f17511m9, 2);
        c6116bsM25138rv.m25174k4("exec", this.f17509dy, 2);
        c6116bsM25138rv.m25174k4("test", this.f17507c5, 2);
    }
}
