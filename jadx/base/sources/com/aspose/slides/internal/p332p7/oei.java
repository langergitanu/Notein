package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class oei extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f27901to = new C7017h4("text:outline-level", "text:style-name", "index-entry-chapter", "index-entry-page-number", "index-entry-text", "index-entry-span", "index-entry-tab-stop");

    /* JADX INFO: renamed from: k4 */
    private int f27902k4;

    /* JADX INFO: renamed from: kk */
    private List<C7394ca> f27903kk;

    /* JADX INFO: renamed from: x1 */
    private String f27904x1;

    public oei() {
        m38221x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m38221x1() {
        this.f27902k4 = 0;
        this.f27903kk = new List<>();
    }

    public oei(final AbstractC13912i5 abstractC13912i5) {
        m38221x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.oei.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = oei.f27901to.m27428k4(str);
                if (iM27428k4 == 0) {
                    oei.this.f27902k4 = w2q.m43458k4(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                oei.this.f27904x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.oei.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                int iM27428k4 = oei.f27901to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    dx5 dx5Var = new dx5(abstractC13912i5);
                    list = oei.this.f27903kk;
                    c7394ca = new C7394ca("index-entry-chapter", dx5Var);
                } else if (iM27428k4 == 3) {
                    oca ocaVar = new oca(abstractC13912i5);
                    list = oei.this.f27903kk;
                    c7394ca = new C7394ca("index-entry-page-number", ocaVar);
                } else if (iM27428k4 == 4) {
                    x3e x3eVar = new x3e(abstractC13912i5);
                    list = oei.this.f27903kk;
                    c7394ca = new C7394ca("index-entry-text", x3eVar);
                } else if (iM27428k4 == 5) {
                    ljn ljnVar = new ljn(abstractC13912i5);
                    list = oei.this.f27903kk;
                    c7394ca = new C7394ca("index-entry-span", ljnVar);
                } else {
                    if (iM27428k4 != 6) {
                        return false;
                    }
                    dim dimVar = new dim(abstractC13912i5);
                    list = oei.this.f27903kk;
                    c7394ca = new C7394ca("index-entry-tab-stop", dimVar);
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
        c3059ii.m12955x1("text:outline-level", w2q.m43459k4(this.f27902k4));
        c3059ii.m12955x1("text:style-name", this.f27904x1);
        List.Enumerator<C7394ca> it = this.f27903kk.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f27901to.m27428k4(next.m29539k4());
                if (iM27428k4 == 2) {
                    ((dx5) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 3) {
                    ((oca) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 4) {
                    ((x3e) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 5) {
                    ((ljn) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 6) {
                    ((dim) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
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
