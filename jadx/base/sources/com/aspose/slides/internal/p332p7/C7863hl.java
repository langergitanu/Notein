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

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.hl */
/* JADX INFO: loaded from: classes4.dex */
public class C7863hl extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f24202x1 = new C7017h4("noFill", "solidFill", "gradFill", "blipFill", "pattFill", "grpFill");

    /* JADX INFO: renamed from: k4 */
    private List<C7394ca> f24203k4;

    public C7863hl() {
        m33502kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m33502kk() {
        this.f24203k4 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C7394ca> m33504k4() {
        return this.f24203k4;
    }

    public C7863hl(final AbstractC13912i5 abstractC13912i5) {
        m33502kk();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.hl.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                int iM27428k4 = C7863hl.f24202x1.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8130kt c8130kt = new C8130kt(abstractC13912i5);
                    list = C7863hl.this.f24203k4;
                    c7394ca = new C7394ca("noFill", c8130kt);
                } else if (iM27428k4 == 1) {
                    C8256md c8256md = new C8256md(abstractC13912i5);
                    list = C7863hl.this.f24203k4;
                    c7394ca = new C7394ca("solidFill", c8256md);
                } else if (iM27428k4 == 2) {
                    C8403o4 c8403o4 = new C8403o4(abstractC13912i5);
                    list = C7863hl.this.f24203k4;
                    c7394ca = new C7394ca("gradFill", c8403o4);
                } else if (iM27428k4 == 3) {
                    C9220xo c9220xo = new C9220xo(abstractC13912i5);
                    list = C7863hl.this.f24203k4;
                    c7394ca = new C7394ca("blipFill", c9220xo);
                } else if (iM27428k4 == 4) {
                    C7416cl c7416cl = new C7416cl(abstractC13912i5);
                    list = C7863hl.this.f24203k4;
                    c7394ca = new C7394ca("pattFill", c7416cl);
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    C9112wh c9112wh = new C9112wh(abstractC13912i5);
                    list = C7863hl.this.f24203k4;
                    c7394ca = new C7394ca("grpFill", c9112wh);
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m33505k4(String str) {
        C7394ca c7394ca;
        int iM27428k4 = f24202x1.m27428k4(str);
        if (iM27428k4 == 0) {
            c7394ca = new C7394ca("noFill", new C8130kt());
        } else if (iM27428k4 == 1) {
            c7394ca = new C7394ca("solidFill", new C8256md());
        } else if (iM27428k4 == 2) {
            c7394ca = new C7394ca("gradFill", new C8403o4());
        } else if (iM27428k4 == 3) {
            c7394ca = new C7394ca("blipFill", new C9220xo());
        } else if (iM27428k4 == 4) {
            c7394ca = new C7394ca("pattFill", new C7416cl());
        } else {
            if (iM27428k4 != 5) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("grpFill", new C9112wh());
        }
        this.f24203k4.addItem(c7394ca);
        return c7394ca;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C7394ca> it = this.f24203k4.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f24202x1.m27428k4(next.m29539k4());
                if (iM27428k4 == 0) {
                    ((C8130kt) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 1) {
                    ((C8256md) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 2) {
                    ((C8403o4) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 3) {
                    ((C9220xo) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 4) {
                    ((C7416cl) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 5) {
                    ((C9112wh) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
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
