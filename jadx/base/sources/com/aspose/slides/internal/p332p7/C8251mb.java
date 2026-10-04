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

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.mb */
/* JADX INFO: loaded from: classes4.dex */
public class C8251mb extends AbstractC7361bz {

    /* JADX INFO: renamed from: up */
    private static final C7017h4 f26719up = new C7017h4("name", "axis", "ptType", "hideLastTrans", "st", "cnt", "step", "func", "arg", "op", "val", AbstractJwtRequest.ClaimNames.ALG, "shape", "presOf", "constrLst", "ruleLst", "forEach", "layoutNode", "choose", "extLst");

    /* JADX INFO: renamed from: c5 */
    private String f26720c5;

    /* JADX INFO: renamed from: ck */
    private String f26721ck;

    /* JADX INFO: renamed from: du */
    private String f26722du;

    /* JADX INFO: renamed from: dy */
    private int f26723dy;

    /* JADX INFO: renamed from: fa */
    private List<C7394ca> f26724fa;

    /* JADX INFO: renamed from: h4 */
    private String f26725h4;

    /* JADX INFO: renamed from: jd */
    private int f26726jd;

    /* JADX INFO: renamed from: k4 */
    private String f26727k4;

    /* JADX INFO: renamed from: kk */
    private String f26728kk;

    /* JADX INFO: renamed from: m9 */
    private String f26729m9;

    /* JADX INFO: renamed from: to */
    private String f26730to;

    /* JADX INFO: renamed from: x1 */
    private String f26731x1;

    public C8251mb() {
        m36762up();
    }

    /* JADX INFO: renamed from: up */
    private void m36762up() {
        this.f26727k4 = "";
        this.f26731x1 = "none";
        this.f26728kk = "all";
        this.f26730to = TelemetryEventStrings.Value.TRUE;
        this.f26722du = "1";
        this.f26725h4 = "0";
        this.f26729m9 = "1";
        this.f26723dy = 0;
        this.f26720c5 = "none";
        this.f26726jd = 0;
        this.f26724fa = new List<>();
    }

    /* JADX INFO: renamed from: c5 */
    public final int m36765c5() {
        return this.f26726jd;
    }

    /* JADX INFO: renamed from: ck */
    public final List<C7394ca> m36766ck() {
        return this.f26724fa;
    }

    /* JADX INFO: renamed from: du */
    public final String m36767du() {
        return this.f26725h4;
    }

    /* JADX INFO: renamed from: dy */
    public final String m36768dy() {
        return this.f26720c5;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m36769h4() {
        return this.f26729m9;
    }

    /* JADX INFO: renamed from: jd */
    public final String m36770jd() {
        return this.f26721ck;
    }

    /* JADX INFO: renamed from: kk */
    public final String m36772kk() {
        return this.f26730to;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m36773m9() {
        return this.f26723dy;
    }

    /* JADX INFO: renamed from: to */
    public final String m36774to() {
        return this.f26722du;
    }

    public C8251mb(final AbstractC13912i5 abstractC13912i5) {
        m36762up();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.mb.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (C8251mb.f26719up.m27428k4(str)) {
                    case 0:
                        C8251mb.this.f26727k4 = str2;
                        break;
                    case 1:
                        C8251mb.this.f26731x1 = str2;
                        break;
                    case 2:
                        C8251mb.this.f26728kk = str2;
                        break;
                    case 3:
                        C8251mb.this.f26730to = str2;
                        break;
                    case 4:
                        C8251mb.this.f26722du = str2;
                        break;
                    case 5:
                        C8251mb.this.f26725h4 = str2;
                        break;
                    case 6:
                        C8251mb.this.f26729m9 = str2;
                        break;
                    case 7:
                        C8251mb.this.f26723dy = C7304b8.m28741k4(str2);
                        break;
                    case 8:
                        C8251mb.this.f26720c5 = str2;
                        break;
                    case 9:
                        C8251mb.this.f26726jd = C9322yx.m45210k4(str2);
                        break;
                    case 10:
                        C8251mb.this.f26721ck = str2;
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.mb.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (C8251mb.f26719up.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 11:
                        C7254aj c7254aj = new C7254aj(abstractC13912i5);
                        list = C8251mb.this.f26724fa;
                        c7394ca = new C7394ca(AbstractJwtRequest.ClaimNames.ALG, c7254aj);
                        break;
                    case 12:
                        C8916u3 c8916u3 = new C8916u3(abstractC13912i5);
                        list = C8251mb.this.f26724fa;
                        c7394ca = new C7394ca("shape", c8916u3);
                        break;
                    case 13:
                        C7855hi c7855hi = new C7855hi(abstractC13912i5);
                        list = C8251mb.this.f26724fa;
                        c7394ca = new C7394ca("presOf", c7855hi);
                        break;
                    case 14:
                        C7910i7 c7910i7 = new C7910i7(abstractC13912i5);
                        list = C8251mb.this.f26724fa;
                        c7394ca = new C7394ca("constrLst", c7910i7);
                        break;
                    case 15:
                        C7975j4 c7975j4 = new C7975j4(abstractC13912i5);
                        list = C8251mb.this.f26724fa;
                        c7394ca = new C7394ca("ruleLst", c7975j4);
                        break;
                    case 16:
                        C8404o5 c8404o5 = new C8404o5(abstractC13912i5);
                        list = C8251mb.this.f26724fa;
                        c7394ca = new C7394ca("forEach", c8404o5);
                        break;
                    case 17:
                        C9103wc c9103wc = new C9103wc(abstractC13912i5);
                        list = C8251mb.this.f26724fa;
                        c7394ca = new C7394ca("layoutNode", c9103wc);
                        break;
                    case 18:
                        C9306yr c9306yr = new C9306yr(abstractC13912i5);
                        list = C8251mb.this.f26724fa;
                        c7394ca = new C7394ca("choose", c9306yr);
                        break;
                    case 19:
                        C8397nz c8397nz = new C8397nz(abstractC13912i5);
                        list = C8251mb.this.f26724fa;
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

    /* JADX INFO: renamed from: x1 */
    public final String m36775x1() {
        return this.f26728kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m36771k4() {
        return this.f26731x1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (!"".equals(this.f26727k4)) {
            c3059ii.m12955x1("name", this.f26727k4);
        }
        if (!"none".equals(this.f26731x1)) {
            c3059ii.m12955x1("axis", this.f26731x1);
        }
        if (!"all".equals(this.f26728kk)) {
            c3059ii.m12955x1("ptType", this.f26728kk);
        }
        if (!TelemetryEventStrings.Value.TRUE.equals(this.f26730to)) {
            c3059ii.m12955x1("hideLastTrans", this.f26730to);
        }
        if (!"1".equals(this.f26722du)) {
            c3059ii.m12955x1("st", this.f26722du);
        }
        if (!"0".equals(this.f26725h4)) {
            c3059ii.m12955x1("cnt", this.f26725h4);
        }
        if (!"1".equals(this.f26729m9)) {
            c3059ii.m12955x1("step", this.f26729m9);
        }
        c3059ii.m12955x1("func", C7304b8.m28742k4(this.f26723dy));
        if (!"none".equals(this.f26720c5)) {
            c3059ii.m12955x1("arg", this.f26720c5);
        }
        c3059ii.m12955x1("op", C9322yx.m45211k4(this.f26726jd));
        c3059ii.m12955x1("val", this.f26721ck);
        List.Enumerator<C7394ca> it = this.f26724fa.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f26719up.m27428k4(next.m29539k4())) {
                    case 11:
                        ((C7254aj) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 12:
                        ((C8916u3) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 13:
                        ((C7855hi) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 14:
                        ((C7910i7) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 15:
                        ((C7975j4) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 16:
                        ((C8404o5) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 17:
                        ((C9103wc) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 18:
                        ((C9306yr) next.m29541kk()).mo6846k4("dgm", c3059ii, next.m29539k4());
                        break;
                    case 19:
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
