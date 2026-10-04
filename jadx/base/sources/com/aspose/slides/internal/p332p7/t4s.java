package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class t4s extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f30571to = new C7017h4("text:outline-level", "text:style-name", "index-entry-chapter", "index-entry-page-number", "index-entry-text", "index-entry-span", "index-entry-tab-stop", "index-entry-link-start", "index-entry-link-end");

    /* JADX INFO: renamed from: k4 */
    private long f30572k4;

    /* JADX INFO: renamed from: kk */
    private List<C7394ca> f30573kk;

    /* JADX INFO: renamed from: x1 */
    private String f30574x1;

    public t4s() {
        m41537x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m41537x1() {
        this.f30573kk = new List<>();
    }

    public t4s(final AbstractC13912i5 abstractC13912i5) {
        m41537x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.t4s.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = t4s.f30571to.m27428k4(str);
                if (iM27428k4 == 0) {
                    t4s.this.f30572k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                t4s.this.f30574x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.t4s.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (t4s.f30571to.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 2:
                        dx5 dx5Var = new dx5(abstractC13912i5);
                        list = t4s.this.f30573kk;
                        c7394ca = new C7394ca("index-entry-chapter", dx5Var);
                        break;
                    case 3:
                        oca ocaVar = new oca(abstractC13912i5);
                        list = t4s.this.f30573kk;
                        c7394ca = new C7394ca("index-entry-page-number", ocaVar);
                        break;
                    case 4:
                        x3e x3eVar = new x3e(abstractC13912i5);
                        list = t4s.this.f30573kk;
                        c7394ca = new C7394ca("index-entry-text", x3eVar);
                        break;
                    case 5:
                        ljn ljnVar = new ljn(abstractC13912i5);
                        list = t4s.this.f30573kk;
                        c7394ca = new C7394ca("index-entry-span", ljnVar);
                        break;
                    case 6:
                        dim dimVar = new dim(abstractC13912i5);
                        list = t4s.this.f30573kk;
                        c7394ca = new C7394ca("index-entry-tab-stop", dimVar);
                        break;
                    case 7:
                        u6u u6uVar = new u6u(abstractC13912i5);
                        list = t4s.this.f30573kk;
                        c7394ca = new C7394ca("index-entry-link-start", u6uVar);
                        break;
                    case 8:
                        ot0 ot0Var = new ot0(abstractC13912i5);
                        list = t4s.this.f30573kk;
                        c7394ca = new C7394ca("index-entry-link-end", ot0Var);
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
        c3059ii.m12955x1("text:outline-level", C13850af.m65147x1(this.f30572k4));
        c3059ii.m12955x1("text:style-name", this.f30574x1);
        List.Enumerator<C7394ca> it = this.f30573kk.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f30571to.m27428k4(next.m29539k4())) {
                    case 2:
                        ((dx5) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        break;
                    case 3:
                        ((oca) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        break;
                    case 4:
                        ((x3e) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        break;
                    case 5:
                        ((ljn) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        break;
                    case 6:
                        ((dim) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        break;
                    case 7:
                        ((u6u) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        break;
                    case 8:
                        ((ot0) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
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
