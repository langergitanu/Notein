package com.aspose.slides.internal.p253lm;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.yg */
/* JADX INFO: loaded from: classes4.dex */
public class C6212yg extends AbstractC6172qq {

    /* JADX INFO: renamed from: du */
    private C6198wp f17572du;

    /* JADX INFO: renamed from: dy */
    private C6198wp f17573dy;

    /* JADX INFO: renamed from: h4 */
    private C6198wp f17574h4;

    /* JADX INFO: renamed from: m9 */
    private C6198wp f17575m9;

    /* JADX INFO: renamed from: to */
    private C6198wp f17576to;

    public C6212yg(InterfaceC6173qw interfaceC6173qw) {
        super(interfaceC6173qw);
        m25137m9("Number");
        m25174k4("prototype", interfaceC6173qw.mo24967fa().m24760k4((C6198wp) this), 7);
        m25180x1("MAX_VALUE", m25186k4(Double.MAX_VALUE));
        m25180x1("MIN_VALUE", m25186k4(-1.7976931348623157E308d));
        m25180x1("NaN", m25186k4(Double.NaN));
        m25180x1("POSITIVE_INFINITY", m25186k4(Double.POSITIVE_INFINITY));
        m25180x1("NEGATIVE_INFINITY", m25186k4(Double.NEGATIVE_INFINITY));
    }

    @Override // com.aspose.slides.internal.p253lm.C6198wp
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10037k4(InterfaceC6132em interfaceC6132em, AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        if (abstractC6211yd == null || C7019kk.m27452k4((Object) abstractC6211yd, InterfaceC6173qw.class) == interfaceC6132em.mo10078to()) {
            return interfaceC6132em.mo10079x1(m25186k4(abstractC6123caArr.length > 0 ? abstractC6123caArr[0].mo24775x1() : 0.0d));
        }
        abstractC6211yd.mo24771k4(abstractC6123caArr.length > 0 ? Double.valueOf(abstractC6123caArr[0].mo24775x1()) : 0);
        return interfaceC6132em.mo10079x1(abstractC6211yd);
    }

    /* JADX INFO: renamed from: k4 */
    public final C6214yn m25186k4(double d) {
        return new C6214yn(d, m25138rv());
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6172qq
    /* JADX INFO: renamed from: k4 */
    public void mo10093k4(InterfaceC6173qw interfaceC6173qw) {
        C6116bs c6116bsM25138rv = m25138rv();
        this.f17576to = new C6160my(interfaceC6173qw, "toString", c6116bsM25138rv);
        this.f17572du = new C6160my(interfaceC6173qw, "toLocaleString", c6116bsM25138rv);
        this.f17574h4 = new C6160my(interfaceC6173qw, "toFixed", c6116bsM25138rv);
        this.f17575m9 = new C6160my(interfaceC6173qw, "toExponential", c6116bsM25138rv);
        this.f17573dy = new C6160my(interfaceC6173qw, "toPrecision", c6116bsM25138rv);
        c6116bsM25138rv.m25174k4("toString", this.f17576to, 2);
        c6116bsM25138rv.m25174k4("toLocaleString", this.f17572du, 2);
        c6116bsM25138rv.m25174k4("toFixed", this.f17574h4, 2);
        c6116bsM25138rv.m25174k4("toExponential", this.f17575m9, 2);
        c6116bsM25138rv.m25174k4("toPrecision", this.f17573dy, 2);
    }
}
