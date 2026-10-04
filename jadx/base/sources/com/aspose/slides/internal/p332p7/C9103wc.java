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

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.wc */
/* JADX INFO: loaded from: classes4.dex */
public class C9103wc extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final int f32263k4 = C7921ic.m34005k4("b");

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f32264m9 = new C7017h4("name", "styleLbl", "chOrder", "moveWith", AbstractJwtRequest.ClaimNames.ALG, "shape", "presOf", "constrLst", "ruleLst", "varLst", "forEach", "layoutNode", "choose", "extLst");

    /* JADX INFO: renamed from: du */
    private String f32265du;

    /* JADX INFO: renamed from: h4 */
    private List<C7394ca> f32266h4;

    /* JADX INFO: renamed from: kk */
    private String f32267kk;

    /* JADX INFO: renamed from: to */
    private int f32268to;

    /* JADX INFO: renamed from: x1 */
    private String f32269x1;

    public C9103wc() {
        m43617m9();
    }

    /* JADX INFO: renamed from: m9 */
    private void m43617m9() {
        this.f32269x1 = "";
        this.f32267kk = "";
        this.f32268to = f32263k4;
        this.f32265du = "";
        this.f32266h4 = new List<>();
    }

    /* JADX INFO: renamed from: du */
    public final List<C7394ca> m43619du() {
        return this.f32266h4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m43621kk() {
        return this.f32268to;
    }

    /* JADX INFO: renamed from: to */
    public final String m43622to() {
        return this.f32265du;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m43623x1() {
        return this.f32267kk;
    }

    public C9103wc(final AbstractC13912i5 abstractC13912i5) {
        m43617m9();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.wc.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C9103wc.f32264m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    C9103wc.this.f32269x1 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C9103wc.this.f32267kk = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    C9103wc.this.f32268to = C7921ic.m34005k4(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                C9103wc.this.f32265du = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.wc.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (C9103wc.f32264m9.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 4:
                        C7254aj c7254aj = new C7254aj(abstractC13912i5);
                        list = C9103wc.this.f32266h4;
                        c7394ca = new C7394ca(AbstractJwtRequest.ClaimNames.ALG, c7254aj);
                        break;
                    case 5:
                        C8916u3 c8916u3 = new C8916u3(abstractC13912i5);
                        list = C9103wc.this.f32266h4;
                        c7394ca = new C7394ca("shape", c8916u3);
                        break;
                    case 6:
                        C7855hi c7855hi = new C7855hi(abstractC13912i5);
                        list = C9103wc.this.f32266h4;
                        c7394ca = new C7394ca("presOf", c7855hi);
                        break;
                    case 7:
                        C7910i7 c7910i7 = new C7910i7(abstractC13912i5);
                        list = C9103wc.this.f32266h4;
                        c7394ca = new C7394ca("constrLst", c7910i7);
                        break;
                    case 8:
                        C7975j4 c7975j4 = new C7975j4(abstractC13912i5);
                        list = C9103wc.this.f32266h4;
                        c7394ca = new C7394ca("ruleLst", c7975j4);
                        break;
                    case 9:
                        C9229xr c9229xr = new C9229xr(abstractC13912i5);
                        list = C9103wc.this.f32266h4;
                        c7394ca = new C7394ca("varLst", c9229xr);
                        break;
                    case 10:
                        C8404o5 c8404o5 = new C8404o5(abstractC13912i5);
                        list = C9103wc.this.f32266h4;
                        c7394ca = new C7394ca("forEach", c8404o5);
                        break;
                    case 11:
                        C9103wc c9103wc = new C9103wc(abstractC13912i5);
                        list = C9103wc.this.f32266h4;
                        c7394ca = new C7394ca("layoutNode", c9103wc);
                        break;
                    case 12:
                        C9306yr c9306yr = new C9306yr(abstractC13912i5);
                        list = C9103wc.this.f32266h4;
                        c7394ca = new C7394ca("choose", c9306yr);
                        break;
                    case 13:
                        C8397nz c8397nz = new C8397nz(abstractC13912i5);
                        list = C9103wc.this.f32266h4;
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

    /* JADX INFO: renamed from: k4 */
    public final String m43620k4() {
        return this.f32269x1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (!"".equals(this.f32269x1)) {
            c3059ii.m12955x1("name", this.f32269x1);
        }
        if (!"".equals(this.f32267kk)) {
            c3059ii.m12955x1("styleLbl", this.f32267kk);
        }
        int i = this.f32268to;
        if (i != f32263k4) {
            c3059ii.m12955x1("chOrder", C7921ic.m34006k4(i));
        }
        if (!"".equals(this.f32265du)) {
            c3059ii.m12955x1("moveWith", this.f32265du);
        }
        List.Enumerator<C7394ca> it = this.f32266h4.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f32264m9.m27428k4(next.m29539k4())) {
                    case 4:
                        ((C7254aj) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 5:
                        ((C8916u3) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 6:
                        ((C7855hi) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 7:
                        ((C7910i7) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 8:
                        ((C7975j4) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 9:
                        ((C9229xr) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 10:
                        ((C8404o5) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 11:
                        ((C9103wc) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 12:
                        ((C9306yr) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 13:
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
