package com.aspose.slides.internal.p253lm;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14057f9;
import com.microsoft.identity.common.java.providers.microsoft.azureactivedirectory.AzureActiveDirectorySlice;
import com.microsoft.identity.common.java.providers.oauth2.TokenRequest;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.du */
/* JADX INFO: loaded from: classes4.dex */
public class C6129du extends AbstractC6172qq {

    /* JADX INFO: renamed from: c5 */
    private C6198wp f17318c5;

    /* JADX INFO: renamed from: ck */
    private C6198wp f17319ck;

    /* JADX INFO: renamed from: du */
    private C6198wp f17320du;

    /* JADX INFO: renamed from: dy */
    private C6198wp f17321dy;

    /* JADX INFO: renamed from: fa */
    private C6198wp f17322fa;

    /* JADX INFO: renamed from: h4 */
    private C6198wp f17323h4;

    /* JADX INFO: renamed from: jd */
    private C6198wp f17324jd;

    /* JADX INFO: renamed from: ks */
    private C6198wp f17325ks;

    /* JADX INFO: renamed from: m9 */
    private C6198wp f17326m9;

    /* JADX INFO: renamed from: ne */
    private C6116bs f17327ne;

    /* JADX INFO: renamed from: rv */
    private C6198wp f17328rv;

    /* JADX INFO: renamed from: to */
    private C6198wp f17329to;

    /* JADX INFO: renamed from: up */
    private C6198wp f17330up;

    /* JADX INFO: renamed from: x6 */
    private C6198wp f17331x6;

    /* JADX INFO: renamed from: yj */
    private C6198wp f17332yj;

    public C6129du(InterfaceC6173qw interfaceC6173qw) {
        super(interfaceC6173qw);
        m25137m9("Array");
        C6116bs c6116bsM24760k4 = interfaceC6173qw.mo24967fa().m24760k4((C6198wp) this);
        this.f17327ne = c6116bsM24760k4;
        m25174k4("prototype", c6116bsM24760k4, 7);
    }

    @Override // com.aspose.slides.internal.p253lm.C6198wp
    /* JADX INFO: renamed from: k4 */
    public C6116bs mo24809k4(AbstractC6123ca[] abstractC6123caArr, AbstractC14068j5[] abstractC14068j5Arr, InterfaceC6132em interfaceC6132em) {
        C6182to c6182toM24811m9 = m24811m9();
        for (int i = 0; i < abstractC6123caArr.length; i++) {
            c6182toM24811m9.m25030k4(i, abstractC6123caArr[i]);
        }
        return c6182toM24811m9;
    }

    /* JADX INFO: renamed from: m9 */
    public final C6182to m24811m9() {
        return new C6182to(m25138rv());
    }

    @Override // com.aspose.slides.internal.p253lm.C6198wp
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10037k4(InterfaceC6132em interfaceC6132em, AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        if (abstractC6211yd == null || C7019kk.m27452k4((Object) abstractC6211yd, InterfaceC6173qw.class) == interfaceC6132em.mo10078to()) {
            return interfaceC6132em.mo10079x1(mo24809k4(abstractC6123caArr, (AbstractC14068j5[]) null, interfaceC6132em));
        }
        for (int i = 0; i < abstractC6123caArr.length; i++) {
            abstractC6211yd.mo25037k4(C14057f9.m66591x1(i), abstractC6123caArr[i]);
        }
        return interfaceC6132em.mo10079x1(abstractC6211yd);
    }

    /* JADX INFO: renamed from: k4 */
    public final C6182to m24810k4(AbstractC6123ca[] abstractC6123caArr) {
        return new C6182to(m25138rv()).m25034k4(m24965ck(), abstractC6123caArr);
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6172qq
    /* JADX INFO: renamed from: k4 */
    public void mo10093k4(InterfaceC6173qw interfaceC6173qw) {
        C6116bs c6116bsM25138rv = m25138rv();
        C6130dy c6130dy = new C6130dy(interfaceC6173qw, c6116bsM25138rv, "length");
        c6130dy.m24911k4(false);
        c6116bsM25138rv.mo25036k4((AbstractC6155lr) c6130dy);
        this.f17329to = new C6159m9(interfaceC6173qw, "toString", c6116bsM25138rv);
        this.f17320du = new C6159m9(interfaceC6173qw, "toLocaleString", c6116bsM25138rv);
        this.f17323h4 = new C6159m9(interfaceC6173qw, "concat", c6116bsM25138rv);
        this.f17326m9 = new C6159m9(interfaceC6173qw, "join", c6116bsM25138rv);
        this.f17321dy = new C6159m9(interfaceC6173qw, TokenRequest.TokenType.POP, c6116bsM25138rv);
        this.f17318c5 = new C6159m9(interfaceC6173qw, "push", c6116bsM25138rv);
        this.f17324jd = new C6159m9(interfaceC6173qw, "reverse", c6116bsM25138rv);
        this.f17319ck = new C6159m9(interfaceC6173qw, "shift", c6116bsM25138rv);
        this.f17322fa = new C6159m9(interfaceC6173qw, AzureActiveDirectorySlice.SLICE_PARAMETER, c6116bsM25138rv);
        this.f17330up = new C6159m9(interfaceC6173qw, NoteMeta.PROPERTY_SORT_KEY, c6116bsM25138rv);
        this.f17332yj = new C6159m9(interfaceC6173qw, "splice", c6116bsM25138rv);
        this.f17325ks = new C6159m9(interfaceC6173qw, "unshift", c6116bsM25138rv);
        this.f17328rv = new C6159m9(interfaceC6173qw, "indexOf", c6116bsM25138rv);
        this.f17331x6 = new C6159m9(interfaceC6173qw, "lastIndexOf", c6116bsM25138rv);
        c6116bsM25138rv.m25174k4("toString", this.f17329to, 2);
        c6116bsM25138rv.m25174k4("toLocaleString", this.f17320du, 2);
        c6116bsM25138rv.m25174k4("concat", this.f17323h4, 2);
        c6116bsM25138rv.m25174k4("join", this.f17326m9, 2);
        c6116bsM25138rv.m25174k4(TokenRequest.TokenType.POP, this.f17321dy, 2);
        c6116bsM25138rv.m25174k4("push", this.f17318c5, 2);
        c6116bsM25138rv.m25174k4("reverse", this.f17324jd, 2);
        c6116bsM25138rv.m25174k4("shift", this.f17319ck, 2);
        c6116bsM25138rv.m25174k4(AzureActiveDirectorySlice.SLICE_PARAMETER, this.f17322fa, 2);
        c6116bsM25138rv.m25174k4(NoteMeta.PROPERTY_SORT_KEY, this.f17330up, 2);
        c6116bsM25138rv.m25174k4("splice", this.f17332yj, 2);
        c6116bsM25138rv.m25174k4("unshift", this.f17325ks, 2);
        c6116bsM25138rv.m25174k4("indexOf", this.f17328rv, 2);
        c6116bsM25138rv.m25174k4("lastIndexOf", this.f17331x6, 2);
    }
}
