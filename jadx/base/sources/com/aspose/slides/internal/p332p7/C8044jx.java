package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.microsoft.identity.common.java.jwt.AbstractJwtRequest;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.jx */
/* JADX INFO: loaded from: classes4.dex */
public class C8044jx extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f25403kk = new C7017h4("name", AbstractJwtRequest.ClaimNames.ALG, "shape", "presOf", "constrLst", "ruleLst", "forEach", "layoutNode", "choose", "extLst");

    /* JADX INFO: renamed from: k4 */
    private String f25404k4;

    /* JADX INFO: renamed from: x1 */
    private List<C7394ca> f25405x1;

    public C8044jx() {
        m35050kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m35050kk() {
        this.f25404k4 = "";
        this.f25405x1 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C7394ca> m35052k4() {
        return this.f25405x1;
    }

    public C8044jx(final AbstractC13912i5 abstractC13912i5) {
        m35050kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.jx.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8044jx.f25403kk.m27428k4(str) != 0) {
                    return false;
                }
                C8044jx.this.f25404k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.jx.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (C8044jx.f25403kk.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 1:
                        C7254aj c7254aj = new C7254aj(abstractC13912i5);
                        list = C8044jx.this.f25405x1;
                        c7394ca = new C7394ca(AbstractJwtRequest.ClaimNames.ALG, c7254aj);
                        break;
                    case 2:
                        C8916u3 c8916u3 = new C8916u3(abstractC13912i5);
                        list = C8044jx.this.f25405x1;
                        c7394ca = new C7394ca("shape", c8916u3);
                        break;
                    case 3:
                        C7855hi c7855hi = new C7855hi(abstractC13912i5);
                        list = C8044jx.this.f25405x1;
                        c7394ca = new C7394ca("presOf", c7855hi);
                        break;
                    case 4:
                        C7910i7 c7910i7 = new C7910i7(abstractC13912i5);
                        list = C8044jx.this.f25405x1;
                        c7394ca = new C7394ca("constrLst", c7910i7);
                        break;
                    case 5:
                        C7975j4 c7975j4 = new C7975j4(abstractC13912i5);
                        list = C8044jx.this.f25405x1;
                        c7394ca = new C7394ca("ruleLst", c7975j4);
                        break;
                    case 6:
                        C8404o5 c8404o5 = new C8404o5(abstractC13912i5);
                        list = C8044jx.this.f25405x1;
                        c7394ca = new C7394ca("forEach", c8404o5);
                        break;
                    case 7:
                        C9103wc c9103wc = new C9103wc(abstractC13912i5);
                        list = C8044jx.this.f25405x1;
                        c7394ca = new C7394ca("layoutNode", c9103wc);
                        break;
                    case 8:
                        C9306yr c9306yr = new C9306yr(abstractC13912i5);
                        list = C8044jx.this.f25405x1;
                        c7394ca = new C7394ca("choose", c9306yr);
                        break;
                    case 9:
                        C8397nz c8397nz = new C8397nz(abstractC13912i5);
                        list = C8044jx.this.f25405x1;
                        c7394ca = new C7394ca("extLst", c8397nz);
                        break;
                    default:
                        return false;
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (!"".equals(this.f25404k4)) {
            c3059ii.m12955x1("name", this.f25404k4);
        }
        List.Enumerator<C7394ca> it = this.f25405x1.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f25403kk.m27428k4(next.m29539k4())) {
                    case 1:
                        ((C7254aj) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 2:
                        ((C8916u3) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 3:
                        ((C7855hi) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 4:
                        ((C7910i7) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 5:
                        ((C7975j4) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 6:
                        ((C8404o5) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 7:
                        ((C9103wc) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 8:
                        ((C9306yr) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 9:
                        ((C8397nz) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        c3059ii.mo21898jd();
    }
}
