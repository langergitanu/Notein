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

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.zn */
/* JADX INFO: loaded from: classes4.dex */
public class C9384zn extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f33977x1 = new C7017h4("scrgbClr", "srgbClr", "hslClr", "sysClr", "schemeClr", "prstClr");

    /* JADX INFO: renamed from: k4 */
    private List<C7394ca> f33978k4;

    public C9384zn() {
        m45692kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m45692kk() {
        this.f33978k4 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C7394ca> m45694k4() {
        return this.f33978k4;
    }

    public C9384zn(final AbstractC13912i5 abstractC13912i5) {
        m45692kk();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.zn.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                int iM27428k4 = C9384zn.f33977x1.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C9395zr c9395zr = new C9395zr(abstractC13912i5);
                    list = C9384zn.this.f33978k4;
                    c7394ca = new C7394ca("scrgbClr", c9395zr);
                } else if (iM27428k4 == 1) {
                    C7670fk c7670fk = new C7670fk(abstractC13912i5);
                    list = C9384zn.this.f33978k4;
                    c7394ca = new C7394ca("srgbClr", c7670fk);
                } else if (iM27428k4 == 2) {
                    C9052vm c9052vm = new C9052vm(abstractC13912i5);
                    list = C9384zn.this.f33978k4;
                    c7394ca = new C7394ca("hslClr", c9052vm);
                } else if (iM27428k4 == 3) {
                    C7939il c7939il = new C7939il(abstractC13912i5);
                    list = C9384zn.this.f33978k4;
                    c7394ca = new C7394ca("sysClr", c7939il);
                } else if (iM27428k4 == 4) {
                    C8732s1 c8732s1 = new C8732s1(abstractC13912i5);
                    list = C9384zn.this.f33978k4;
                    c7394ca = new C7394ca("schemeClr", c8732s1);
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    C8065k9 c8065k9 = new C8065k9(abstractC13912i5);
                    list = C9384zn.this.f33978k4;
                    c7394ca = new C7394ca("prstClr", c8065k9);
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m45695k4(String str) {
        C7394ca c7394ca;
        int iM27428k4 = f33977x1.m27428k4(str);
        if (iM27428k4 == 0) {
            c7394ca = new C7394ca("scrgbClr", new C9395zr());
        } else if (iM27428k4 == 1) {
            c7394ca = new C7394ca("srgbClr", new C7670fk());
        } else if (iM27428k4 == 2) {
            c7394ca = new C7394ca("hslClr", new C9052vm());
        } else if (iM27428k4 == 3) {
            c7394ca = new C7394ca("sysClr", new C7939il());
        } else if (iM27428k4 == 4) {
            c7394ca = new C7394ca("schemeClr", new C8732s1());
        } else {
            if (iM27428k4 != 5) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("prstClr", new C8065k9());
        }
        this.f33978k4.addItem(c7394ca);
        return c7394ca;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C7394ca> it = this.f33978k4.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f33977x1.m27428k4(next.m29539k4());
                if (iM27428k4 == 0) {
                    ((C9395zr) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 1) {
                    ((C7670fk) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 2) {
                    ((C9052vm) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 3) {
                    ((C7939il) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 4) {
                    ((C8732s1) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 5) {
                    ((C8065k9) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
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
