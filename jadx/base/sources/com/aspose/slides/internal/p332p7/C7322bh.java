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
import com.facebook.common.callercontext.ContextChain;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.bh */
/* JADX INFO: loaded from: classes4.dex */
public class C7322bh extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f20557h4 = new C7017h4("Ignorable", "MustUnderstand", "ProcessContent", "Requires", "sp", "graphicFrame", "contentPart", "notes");

    /* JADX INFO: renamed from: du */
    private List<C7394ca> f20558du;

    /* JADX INFO: renamed from: k4 */
    private String f20559k4;

    /* JADX INFO: renamed from: kk */
    private String f20560kk;

    /* JADX INFO: renamed from: to */
    private String f20561to;

    /* JADX INFO: renamed from: x1 */
    private String f20562x1;

    public C7322bh() {
        m28896kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C7394ca> m28900k4() {
        return this.f20558du;
    }

    public C7322bh(final AbstractC13912i5 abstractC13912i5) {
        m28896kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.bh.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7322bh.f20557h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7322bh.this.f20559k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C7322bh.this.f20562x1 = str2;
                    return true;
                }
                if (iM27428k4 == 2) {
                    C7322bh.this.f20560kk = str2;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                C7322bh.this.f20561to = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.bh.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                int iM27428k4 = C7322bh.f20557h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 4) {
                    dm6 dm6Var = new dm6(abstractC13912i5);
                    list = C7322bh.this.f20558du;
                    c7394ca = new C7394ca("sp", dm6Var);
                } else if (iM27428k4 == 5) {
                    pij pijVar = new pij(abstractC13912i5);
                    list = C7322bh.this.f20558du;
                    c7394ca = new C7394ca("graphicFrame", pijVar);
                } else if (iM27428k4 == 6) {
                    jbq jbqVar = new jbq(abstractC13912i5);
                    list = C7322bh.this.f20558du;
                    c7394ca = new C7394ca("contentPart", jbqVar);
                } else {
                    if (iM27428k4 != 7) {
                        return false;
                    }
                    C7839he c7839he = new C7839he(abstractC13912i5);
                    list = C7322bh.this.f20558du;
                    c7394ca = new C7394ca("notes", c7839he);
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: kk */
    private void m28896kk() {
        this.f20558du = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m28901k4(String str) {
        C7394ca c7394ca;
        int iM27428k4 = f20557h4.m27428k4(str);
        if (iM27428k4 == 4) {
            c7394ca = new C7394ca("sp", new dm6());
        } else if (iM27428k4 == 5) {
            c7394ca = new C7394ca("graphicFrame", new pij());
        } else if (iM27428k4 == 6) {
            c7394ca = new C7394ca("contentPart", new jbq());
        } else {
            if (iM27428k4 != 7) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("notes", new C7839he());
        }
        this.f20558du.addItem(c7394ca);
        return c7394ca;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m28902x1(String str) {
        this.f20561to = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f20559k4;
        if (str3 != null) {
            c3059ii.m12955x1("mc:Ignorable", str3);
        }
        String str4 = this.f20562x1;
        if (str4 != null) {
            c3059ii.m12955x1("mc:MustUnderstand", str4);
        }
        String str5 = this.f20560kk;
        if (str5 != null) {
            c3059ii.m12955x1("mc:ProcessContent", str5);
        }
        c3059ii.m12955x1("Requires", this.f20561to);
        List.Enumerator<C7394ca> it = this.f20558du.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f20557h4.m27428k4(next.m29539k4());
                if (iM27428k4 == 4) {
                    ((dm6) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
                } else if (iM27428k4 == 5) {
                    ((pij) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
                } else if (iM27428k4 == 6) {
                    ((jbq) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
                } else if (iM27428k4 == 7) {
                    ((C7839he) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
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
