package com.aspose.slides.internal.p253lm;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.microsoft.identity.common.java.providers.microsoft.azureactivedirectory.AzureActiveDirectorySlice;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.u5 */
/* JADX INFO: loaded from: classes4.dex */
public class C6187u5 extends AbstractC6172qq {

    /* JADX INFO: renamed from: c5 */
    private C6198wp f17481c5;

    /* JADX INFO: renamed from: ck */
    private C6198wp f17482ck;

    /* JADX INFO: renamed from: du */
    private C6198wp f17483du;

    /* JADX INFO: renamed from: dy */
    private C6198wp f17484dy;

    /* JADX INFO: renamed from: fa */
    private C6198wp f17485fa;

    /* JADX INFO: renamed from: h4 */
    private C6198wp f17486h4;

    /* JADX INFO: renamed from: ix */
    private C6198wp f17487ix;

    /* JADX INFO: renamed from: jd */
    private C6198wp f17488jd;

    /* JADX INFO: renamed from: ks */
    private C6198wp f17489ks;

    /* JADX INFO: renamed from: m9 */
    private C6198wp f17490m9;

    /* JADX INFO: renamed from: ne */
    private C6198wp f17491ne;

    /* JADX INFO: renamed from: qq */
    private C6198wp f17492qq;

    /* JADX INFO: renamed from: rv */
    private C6198wp f17493rv;

    /* JADX INFO: renamed from: to */
    private C6198wp f17494to;

    /* JADX INFO: renamed from: u4 */
    private C6198wp f17495u4;

    /* JADX INFO: renamed from: up */
    private C6198wp f17496up;

    /* JADX INFO: renamed from: uz */
    private C6198wp f17497uz;

    /* JADX INFO: renamed from: wl */
    private C6198wp f17498wl;

    /* JADX INFO: renamed from: x6 */
    private C6198wp f17499x6;

    /* JADX INFO: renamed from: yj */
    private C6198wp f17500yj;

    public C6187u5(InterfaceC6173qw interfaceC6173qw) {
        super(interfaceC6173qw);
        m25174k4("prototype", interfaceC6173qw.mo24967fa().m24760k4((C6198wp) this), 7);
        m25137m9("String");
        mo25037k4("fromCharCode", new C6154lm(interfaceC6173qw, "fromCharCode", m25138rv()));
    }

    /* JADX INFO: renamed from: h4 */
    public final C6141he m25068h4(String str) {
        return new C6141he(str, m25138rv());
    }

    /* JADX INFO: renamed from: jd */
    public final C6141he m25069jd() {
        return m25068h4(C14113y2.f47374k4);
    }

    @Override // com.aspose.slides.internal.p253lm.C6198wp
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10037k4(InterfaceC6132em interfaceC6132em, AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        C6187u5 c6187u5Mo24980v4;
        String string;
        if (abstractC6211yd != null && C7019kk.m27452k4((Object) abstractC6211yd, InterfaceC6173qw.class) != interfaceC6132em.mo10078to()) {
            abstractC6211yd.mo24771k4((Object) (abstractC6123caArr.length > 0 ? abstractC6123caArr[0].toString() : C14113y2.f47374k4));
            return interfaceC6132em.mo10079x1(abstractC6211yd);
        }
        if (abstractC6123caArr.length > 0) {
            c6187u5Mo24980v4 = m24965ck().mo24980v4();
            string = abstractC6123caArr[0].toString();
        } else {
            c6187u5Mo24980v4 = m24965ck().mo24980v4();
            string = C14113y2.f47374k4;
        }
        return interfaceC6132em.mo10079x1(c6187u5Mo24980v4.m25068h4(string));
    }

    @Override // com.aspose.slides.internal.p253lm.AbstractC6172qq
    /* JADX INFO: renamed from: k4 */
    public void mo10093k4(InterfaceC6173qw interfaceC6173qw) {
        C6116bs c6116bsM25138rv = m25138rv();
        this.f17494to = new C6154lm(interfaceC6173qw, "split", c6116bsM25138rv);
        this.f17483du = new C6154lm(interfaceC6173qw, "replace", c6116bsM25138rv);
        this.f17486h4 = new C6154lm(interfaceC6173qw, "toString", c6116bsM25138rv);
        this.f17490m9 = new C6154lm(interfaceC6173qw, "toLocaleString", c6116bsM25138rv);
        this.f17484dy = new C6154lm(interfaceC6173qw, "match", c6116bsM25138rv);
        this.f17481c5 = new C6154lm(interfaceC6173qw, "localeCompare", c6116bsM25138rv);
        this.f17488jd = new C6154lm(interfaceC6173qw, "substring", c6116bsM25138rv);
        this.f17482ck = new C6154lm(interfaceC6173qw, "substr", c6116bsM25138rv);
        this.f17485fa = new C6154lm(interfaceC6173qw, FirebaseAnalytics.Event.SEARCH, c6116bsM25138rv);
        this.f17496up = new C6154lm(interfaceC6173qw, "valueOf", c6116bsM25138rv);
        this.f17500yj = new C6154lm(interfaceC6173qw, "concat", c6116bsM25138rv);
        this.f17489ks = new C6154lm(interfaceC6173qw, "charAt", c6116bsM25138rv);
        this.f17493rv = new C6154lm(interfaceC6173qw, "charCodeAt", c6116bsM25138rv);
        this.f17499x6 = new C6154lm(interfaceC6173qw, "lastIndexOf", c6116bsM25138rv);
        this.f17491ne = new C6154lm(interfaceC6173qw, "indexOf", c6116bsM25138rv);
        this.f17487ix = new C6154lm(interfaceC6173qw, "toLowerCase", c6116bsM25138rv);
        this.f17495u4 = new C6154lm(interfaceC6173qw, "toLocaleLowerCase", c6116bsM25138rv);
        this.f17497uz = new C6154lm(interfaceC6173qw, "toUpperCase", c6116bsM25138rv);
        this.f17498wl = new C6154lm(interfaceC6173qw, "toLocaleUpperCase", c6116bsM25138rv);
        this.f17492qq = new C6154lm(interfaceC6173qw, AzureActiveDirectorySlice.SLICE_PARAMETER, c6116bsM25138rv);
        c6116bsM25138rv.m25174k4("split", this.f17494to, 2);
        c6116bsM25138rv.m25174k4("replace", this.f17483du, 2);
        c6116bsM25138rv.m25174k4("toString", this.f17486h4, 2);
        c6116bsM25138rv.m25174k4("toLocaleString", this.f17490m9, 2);
        c6116bsM25138rv.m25174k4("match", this.f17484dy, 2);
        c6116bsM25138rv.m25174k4("localeCompare", this.f17481c5, 2);
        c6116bsM25138rv.m25174k4("substring", this.f17488jd, 2);
        c6116bsM25138rv.m25174k4("substr", this.f17482ck, 2);
        c6116bsM25138rv.m25174k4(FirebaseAnalytics.Event.SEARCH, this.f17485fa, 2);
        c6116bsM25138rv.m25174k4("valueOf", this.f17496up, 2);
        c6116bsM25138rv.m25174k4("concat", this.f17500yj, 2);
        c6116bsM25138rv.m25174k4("charAt", this.f17489ks, 2);
        c6116bsM25138rv.m25174k4("charCodeAt", this.f17493rv, 2);
        c6116bsM25138rv.m25174k4("lastIndexOf", this.f17499x6, 2);
        c6116bsM25138rv.m25174k4("indexOf", this.f17491ne, 2);
        c6116bsM25138rv.m25174k4("toLowerCase", this.f17487ix, 2);
        c6116bsM25138rv.m25174k4("toLocaleLowerCase", this.f17495u4, 2);
        c6116bsM25138rv.m25174k4("toUpperCase", this.f17497uz, 2);
        c6116bsM25138rv.m25174k4("toLocaleUpperCase", this.f17498wl, 2);
        c6116bsM25138rv.m25174k4(AzureActiveDirectorySlice.SLICE_PARAMETER, this.f17492qq, 2);
        c6116bsM25138rv.mo25036k4((AbstractC6155lr) new C6120c4(interfaceC6173qw, c6116bsM25138rv, "length"));
    }
}
