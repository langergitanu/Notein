package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.xu */
/* JADX INFO: loaded from: classes4.dex */
public class C9233xu extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f33067to = new C7017h4("pPr", "r", "br", "fld", "m", "endParaRPr");

    /* JADX INFO: renamed from: k4 */
    private C8181lg f33068k4;

    /* JADX INFO: renamed from: kk */
    private C9135ws f33069kk;

    /* JADX INFO: renamed from: x1 */
    private List<C7394ca> f33070x1;

    public C9233xu() {
        m44643m9();
    }

    /* JADX INFO: renamed from: m9 */
    private void m44643m9() {
        this.f33070x1 = new List<>();
    }

    /* JADX INFO: renamed from: du */
    public final C9135ws m44644du() {
        return this.f33069kk;
    }

    /* JADX INFO: renamed from: kk */
    public final C8181lg m44648kk() {
        return this.f33068k4;
    }

    /* JADX INFO: renamed from: to */
    public final List<C7394ca> m44649to() {
        return this.f33070x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C9135ws m44650x1() {
        if (this.f33069kk != null) {
            throw new Exception("Only one <endParaRPr> element can be added.");
        }
        C9135ws c9135ws = new C9135ws();
        this.f33069kk = c9135ws;
        return c9135ws;
    }

    public C9233xu(final AbstractC13912i5 abstractC13912i5) {
        m44643m9();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.xu.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                int iM27428k4 = C9233xu.f33067to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 != 0) {
                    if (iM27428k4 == 1) {
                        C8549pu c8549pu = new C8549pu(abstractC13912i5);
                        list = C9233xu.this.f33070x1;
                        c7394ca = new C7394ca("r", c8549pu);
                    } else if (iM27428k4 == 2) {
                        C8308n4 c8308n4 = new C8308n4(abstractC13912i5);
                        list = C9233xu.this.f33070x1;
                        c7394ca = new C7394ca("br", c8308n4);
                    } else if (iM27428k4 == 3) {
                        C8416oa c8416oa = new C8416oa(abstractC13912i5);
                        list = C9233xu.this.f33070x1;
                        c7394ca = new C7394ca("fld", c8416oa);
                    } else if (iM27428k4 == 4) {
                        C9348z6 c9348z6 = new C9348z6(abstractC13912i5);
                        list = C9233xu.this.f33070x1;
                        c7394ca = new C7394ca("m", c9348z6);
                    } else {
                        if (iM27428k4 != 5) {
                            return false;
                        }
                        C9233xu.this.f33069kk = new C9135ws(abstractC13912i5);
                    }
                    list.addItem(c7394ca);
                } else {
                    C9233xu.this.f33068k4 = new C8181lg(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m44645k4(String str) {
        C7394ca c7394ca;
        int iM27428k4 = f33067to.m27428k4(str);
        if (iM27428k4 == 1) {
            c7394ca = new C7394ca("r", new C8549pu());
        } else if (iM27428k4 == 2) {
            c7394ca = new C7394ca("br", new C8308n4());
        } else if (iM27428k4 == 3) {
            c7394ca = new C7394ca("fld", new C8416oa());
        } else {
            if (iM27428k4 != 4) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("m", new C9348z6());
        }
        this.f33070x1.addItem(c7394ca);
        return c7394ca;
    }

    /* JADX INFO: renamed from: k4 */
    public final C8181lg m44646k4() {
        if (this.f33068k4 != null) {
            throw new Exception("Only one <pPr> element can be added.");
        }
        C8181lg c8181lg = new C8181lg();
        this.f33068k4 = c8181lg;
        return c8181lg;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m44647k4(C9135ws c9135ws) {
        this.f33069kk = c9135ws;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, "a".equals(c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main")) ? null : "http://schemas.openxmlformats.org/drawingml/2006/main");
        C8181lg c8181lg = this.f33068k4;
        if (c8181lg != null) {
            c8181lg.mo6846k4("a", c3059ii, "pPr");
        }
        List.Enumerator<C7394ca> it = this.f33070x1.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f33067to.m27428k4(next.m29539k4());
                if (iM27428k4 == 1) {
                    ((C8549pu) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 2) {
                    ((C8308n4) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 3) {
                    ((C8416oa) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 4) {
                    ((C9348z6) next.m29541kk()).mo6846k4("a14", c3059ii, next.m29539k4());
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
        C9135ws c9135ws = this.f33069kk;
        if (c9135ws != null) {
            c9135ws.mo6846k4("a", c3059ii, "endParaRPr");
        }
        c3059ii.mo21898jd();
    }
}
