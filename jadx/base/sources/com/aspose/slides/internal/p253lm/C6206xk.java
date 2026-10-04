package com.aspose.slides.internal.p253lm;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.xk */
/* JADX INFO: loaded from: classes4.dex */
public class C6206xk extends AbstractC6172qq {

    /* JADX INFO: renamed from: du */
    private C6116bs f17546du;

    /* JADX INFO: renamed from: dy */
    private C6198wp f17547dy;

    /* JADX INFO: renamed from: h4 */
    private C6141he f17548h4;

    /* JADX INFO: renamed from: m9 */
    private C6198wp f17549m9;

    /* JADX INFO: renamed from: to */
    private String f17550to;

    public C6206xk(InterfaceC6173qw interfaceC6173qw, String str) {
        super(interfaceC6173qw);
        this.f17550to = str;
        m25137m9(str);
        C6116bs c6116bsM24760k4 = interfaceC6173qw.mo24967fa().m24760k4((C6198wp) this);
        this.f17546du = c6116bsM24760k4;
        m25174k4("prototype", c6116bsM24760k4, 7);
    }

    /* JADX INFO: renamed from: h4 */
    public final C6128dq m25165h4(String str) {
        C6128dq c6128dq = new C6128dq(m24965ck());
        c6128dq.mo25037k4("message", m24965ck().mo24980v4().m25068h4(str));
        return c6128dq;
    }

    /* JADX INFO: renamed from: jd */
    public final C6128dq m25166jd() {
        return m25165h4(C14113y2.f47374k4);
    }

    @Override // com.aspose.slides.internal.p253lm.C6198wp
    /* JADX INFO: renamed from: k4 */
    public C6116bs mo24809k4(AbstractC6123ca[] abstractC6123caArr, AbstractC14068j5[] abstractC14068j5Arr, InterfaceC6132em interfaceC6132em) {
        return (abstractC6123caArr == null || abstractC6123caArr.length <= 0) ? interfaceC6132em.mo10078to().mo24982x6().m25166jd() : interfaceC6132em.mo10078to().mo24982x6().m25165h4(abstractC6123caArr[0].toString());
    }

    @Override // com.aspose.slides.internal.p253lm.C6198wp
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10037k4(InterfaceC6132em interfaceC6132em, AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        if (abstractC6211yd == null || C7019kk.m27452k4((Object) abstractC6211yd, InterfaceC6173qw.class) == interfaceC6132em.mo10078to()) {
            interfaceC6132em.mo10079x1(abstractC6123caArr.length > 0 ? m25165h4(abstractC6123caArr[0].toString()) : m25166jd());
            return abstractC6211yd;
        }
        abstractC6211yd.mo24771k4((Object) (abstractC6123caArr.length > 0 ? abstractC6123caArr[0].toString() : C14113y2.f47374k4));
        interfaceC6132em.mo10079x1(abstractC6211yd);
        return abstractC6211yd;
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6172qq
    /* JADX INFO: renamed from: k4 */
    public void mo10093k4(InterfaceC6173qw interfaceC6173qw) {
        C6116bs c6116bsM25138rv = m25138rv();
        this.f17548h4 = interfaceC6173qw.mo24980v4().m25068h4(this.f17550to);
        this.f17549m9 = new C6122c6(interfaceC6173qw, "toString", c6116bsM25138rv);
        this.f17547dy = new C6122c6(interfaceC6173qw, "toString", c6116bsM25138rv);
        c6116bsM25138rv.m25174k4("name", this.f17548h4, 7);
        c6116bsM25138rv.m25174k4("toString", this.f17549m9, 2);
        c6116bsM25138rv.m25174k4("toLocaleString", this.f17547dy, 2);
    }
}
