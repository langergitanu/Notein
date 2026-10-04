package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.microsoft.identity.common.java.jwt.AbstractJwtRequest;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.o5 */
/* JADX INFO: loaded from: classes4.dex */
public class C8404o5 extends AbstractC7361bz {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f27704jd = new C7017h4("name", "ref", "axis", "ptType", "hideLastTrans", "st", "cnt", "step", AbstractJwtRequest.ClaimNames.ALG, "shape", "presOf", "constrLst", "ruleLst", "forEach", "layoutNode", "choose", "extLst");

    /* JADX INFO: renamed from: c5 */
    private List<C7394ca> f27705c5;

    /* JADX INFO: renamed from: du */
    private String f27706du;

    /* JADX INFO: renamed from: dy */
    private String f27707dy;

    /* JADX INFO: renamed from: h4 */
    private String f27708h4;

    /* JADX INFO: renamed from: k4 */
    private String f27709k4;

    /* JADX INFO: renamed from: kk */
    private String f27710kk;

    /* JADX INFO: renamed from: m9 */
    private String f27711m9;

    /* JADX INFO: renamed from: to */
    private String f27712to;

    /* JADX INFO: renamed from: x1 */
    private String f27713x1;

    public C8404o5() {
        m37992ck();
    }

    /* JADX INFO: renamed from: ck */
    private void m37992ck() {
        this.f27709k4 = "";
        this.f27713x1 = "";
        this.f27710kk = "none";
        this.f27712to = "all";
        this.f27706du = TelemetryEventStrings.Value.TRUE;
        this.f27708h4 = "1";
        this.f27711m9 = "0";
        this.f27707dy = "1";
        this.f27705c5 = new List<>();
    }

    /* JADX INFO: renamed from: c5 */
    public final List<C7394ca> m38003c5() {
        return this.f27705c5;
    }

    /* JADX INFO: renamed from: du */
    public final String m38004du() {
        return this.f27706du;
    }

    /* JADX INFO: renamed from: dy */
    public final String m38005dy() {
        return this.f27707dy;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m38006h4() {
        return this.f27708h4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m38008kk() {
        return this.f27710kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final String m38009m9() {
        return this.f27711m9;
    }

    /* JADX INFO: renamed from: to */
    public final String m38010to() {
        return this.f27712to;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m38011x1() {
        return this.f27713x1;
    }

    public C8404o5(final AbstractC13912i5 abstractC13912i5) {
        m37992ck();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.o5.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (C8404o5.f27704jd.m27428k4(str)) {
                    case 0:
                        C8404o5.this.f27709k4 = str2;
                        break;
                    case 1:
                        C8404o5.this.f27713x1 = str2;
                        break;
                    case 2:
                        C8404o5.this.f27710kk = str2;
                        break;
                    case 3:
                        C8404o5.this.f27712to = str2;
                        break;
                    case 4:
                        C8404o5.this.f27706du = str2;
                        break;
                    case 5:
                        C8404o5.this.f27708h4 = str2;
                        break;
                    case 6:
                        C8404o5.this.f27711m9 = str2;
                        break;
                    case 7:
                        C8404o5.this.f27707dy = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.o5.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (C8404o5.f27704jd.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 8:
                        C7254aj c7254aj = new C7254aj(abstractC13912i5);
                        list = C8404o5.this.f27705c5;
                        c7394ca = new C7394ca(AbstractJwtRequest.ClaimNames.ALG, c7254aj);
                        break;
                    case 9:
                        C8916u3 c8916u3 = new C8916u3(abstractC13912i5);
                        list = C8404o5.this.f27705c5;
                        c7394ca = new C7394ca("shape", c8916u3);
                        break;
                    case 10:
                        C7855hi c7855hi = new C7855hi(abstractC13912i5);
                        list = C8404o5.this.f27705c5;
                        c7394ca = new C7394ca("presOf", c7855hi);
                        break;
                    case 11:
                        C7910i7 c7910i7 = new C7910i7(abstractC13912i5);
                        list = C8404o5.this.f27705c5;
                        c7394ca = new C7394ca("constrLst", c7910i7);
                        break;
                    case 12:
                        C7975j4 c7975j4 = new C7975j4(abstractC13912i5);
                        list = C8404o5.this.f27705c5;
                        c7394ca = new C7394ca("ruleLst", c7975j4);
                        break;
                    case 13:
                        C8404o5 c8404o5 = new C8404o5(abstractC13912i5);
                        list = C8404o5.this.f27705c5;
                        c7394ca = new C7394ca("forEach", c8404o5);
                        break;
                    case 14:
                        C9103wc c9103wc = new C9103wc(abstractC13912i5);
                        list = C8404o5.this.f27705c5;
                        c7394ca = new C7394ca("layoutNode", c9103wc);
                        break;
                    case 15:
                        C9306yr c9306yr = new C9306yr(abstractC13912i5);
                        list = C8404o5.this.f27705c5;
                        c7394ca = new C7394ca("choose", c9306yr);
                        break;
                    case 16:
                        C8397nz c8397nz = new C8397nz(abstractC13912i5);
                        list = C8404o5.this.f27705c5;
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
    public final String m38007k4() {
        return this.f27709k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (!"".equals(this.f27709k4)) {
            c3059ii.m12955x1("name", this.f27709k4);
        }
        if (!"".equals(this.f27713x1)) {
            c3059ii.m12955x1("ref", this.f27713x1);
        }
        if (!"none".equals(this.f27710kk)) {
            c3059ii.m12955x1("axis", this.f27710kk);
        }
        if (!"all".equals(this.f27712to)) {
            c3059ii.m12955x1("ptType", this.f27712to);
        }
        if (!TelemetryEventStrings.Value.TRUE.equals(this.f27706du)) {
            c3059ii.m12955x1("hideLastTrans", this.f27706du);
        }
        if (!"1".equals(this.f27708h4)) {
            c3059ii.m12955x1("st", this.f27708h4);
        }
        if (!"0".equals(this.f27711m9)) {
            c3059ii.m12955x1("cnt", this.f27711m9);
        }
        if (!"1".equals(this.f27707dy)) {
            c3059ii.m12955x1("step", this.f27707dy);
        }
        List.Enumerator<C7394ca> it = this.f27705c5.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f27704jd.m27428k4(next.m29539k4())) {
                    case 8:
                        ((C7254aj) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 9:
                        ((C8916u3) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 10:
                        ((C7855hi) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 11:
                        ((C7910i7) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 12:
                        ((C7975j4) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 13:
                        ((C8404o5) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 14:
                        ((C9103wc) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 15:
                        ((C9306yr) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 16:
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
