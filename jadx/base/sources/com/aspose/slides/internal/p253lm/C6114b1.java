package com.aspose.slides.internal.p253lm;

import com.aspose.slides.internal.p314oc.C7017h4;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.b1 */
/* JADX INFO: loaded from: classes4.dex */
public class C6114b1 extends AbstractC6172qq {

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f17246ck = new C7017h4("String", "Number", "Boolean");

    /* JADX INFO: renamed from: c5 */
    private C6198wp f17247c5;

    /* JADX INFO: renamed from: du */
    private C6198wp f17248du;

    /* JADX INFO: renamed from: dy */
    private C6198wp f17249dy;

    /* JADX INFO: renamed from: h4 */
    private C6198wp f17250h4;

    /* JADX INFO: renamed from: jd */
    private C6198wp f17251jd;

    /* JADX INFO: renamed from: m9 */
    private C6198wp f17252m9;

    /* JADX INFO: renamed from: to */
    private C6198wp f17253to;

    public C6114b1(InterfaceC6173qw interfaceC6173qw, C6116bs c6116bs, C6116bs c6116bs2) {
        super(interfaceC6173qw);
        m25137m9("Object");
        m25174k4("prototype", c6116bs2, 7);
    }

    /* JADX INFO: renamed from: jd */
    public final C6116bs m24759jd() {
        return m24762x1((Object) null);
    }

    /* JADX INFO: renamed from: k4 */
    public final C6116bs m24760k4(C6198wp c6198wp) {
        C6116bs c6116bs = new C6116bs(m25138rv());
        C6165o9 c6165o9 = new C6165o9(c6116bs, "constructor", c6198wp);
        c6165o9.m24911k4(false);
        c6116bs.mo25036k4((AbstractC6155lr) c6165o9);
        return c6116bs;
    }

    /* JADX INFO: renamed from: kk */
    public final C6116bs m24761kk(C6116bs c6116bs) {
        return new C6116bs(c6116bs);
    }

    /* JADX INFO: renamed from: x1 */
    public final C6116bs m24762x1(Object obj) {
        return new C6116bs(obj, m25138rv());
    }

    @Override // com.aspose.slides.internal.p253lm.C6198wp
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10037k4(InterfaceC6132em interfaceC6132em, AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        if (abstractC6123caArr.length <= 0) {
            return m24760k4((C6198wp) this);
        }
        int iM27428k4 = f17246ck.m27428k4(abstractC6123caArr[0].mo24774to());
        return iM27428k4 != 0 ? iM27428k4 != 1 ? iM27428k4 != 2 ? abstractC6123caArr[0] : m24965ck().mo24972ks().m25189k4(abstractC6123caArr[0].mo24772k4()) : m24965ck().mo24977um().m25186k4(abstractC6123caArr[0].mo24775x1()) : m24965ck().mo24980v4().m25068h4(abstractC6123caArr[0].toString());
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6172qq
    /* JADX INFO: renamed from: k4 */
    public void mo10093k4(InterfaceC6173qw interfaceC6173qw) {
        C6116bs c6116bsM25138rv = m25138rv();
        C6116bs c6116bsM25138rv2 = interfaceC6173qw.mo24978up().m25138rv();
        this.f17253to = new C6216yw(interfaceC6173qw, "toString", c6116bsM25138rv2);
        this.f17248du = new C6216yw(interfaceC6173qw, "toString", c6116bsM25138rv2);
        this.f17250h4 = new C6216yw(interfaceC6173qw, "valueOf", c6116bsM25138rv2);
        this.f17252m9 = new C6216yw(interfaceC6173qw, "hasOwnProperty", c6116bsM25138rv2);
        this.f17249dy = new C6216yw(interfaceC6173qw, "isPrototypeOf", c6116bsM25138rv2);
        this.f17247c5 = new C6216yw(interfaceC6173qw, "propertyIsEnumerable", c6116bsM25138rv2);
        this.f17251jd = new C6216yw(interfaceC6173qw, "getPrototypeOf", c6116bsM25138rv2);
        c6116bsM25138rv.m25174k4("constructor", this, 2);
        c6116bsM25138rv.m25174k4("toString", this.f17253to, 2);
        c6116bsM25138rv.m25174k4("toLocaleString", this.f17248du, 2);
        c6116bsM25138rv.m25174k4("valueOf", this.f17250h4, 2);
        c6116bsM25138rv.m25174k4("hasOwnProperty", this.f17252m9, 2);
        c6116bsM25138rv.m25174k4("isPrototypeOf", this.f17249dy, 2);
        c6116bsM25138rv.m25174k4("propertyIsEnumerable", this.f17247c5, 2);
        c6116bsM25138rv.m25174k4("getPrototypeOf", this.f17251jd, 2);
        if (interfaceC6173qw.mo24971kk(4)) {
            c6116bsM25138rv.m25174k4("defineProperty", new C6216yw(interfaceC6173qw, "defineProperty", c6116bsM25138rv2), 2);
            c6116bsM25138rv.m25174k4("__lookupGetter__", new C6216yw(interfaceC6173qw, "__lookupGetter__", c6116bsM25138rv2), 2);
            c6116bsM25138rv.m25174k4("__lookupSetter__", new C6216yw(interfaceC6173qw, "__lookupSetter__", c6116bsM25138rv2), 2);
        }
    }
}
