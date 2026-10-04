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

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.wq */
/* JADX INFO: loaded from: classes4.dex */
public final class C9130wq extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f32451du = new C7017h4("Ignorable", "MustUnderstand", "ProcessContent", "sp", "graphicFrame", "pic", "grpSp");

    /* JADX INFO: renamed from: k4 */
    private String f32452k4;

    /* JADX INFO: renamed from: kk */
    private String f32453kk;

    /* JADX INFO: renamed from: to */
    private List<C7394ca> f32454to;

    /* JADX INFO: renamed from: x1 */
    private String f32455x1;

    public C9130wq() {
        this.f32454to = new List<>();
    }

    public C9130wq(final AbstractC13912i5 abstractC13912i5) {
        this();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.wq.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C9130wq.f32451du.m27428k4(str);
                if (iM27428k4 == 0) {
                    C9130wq.this.f32452k4 = str2;
                } else if (iM27428k4 == 1) {
                    C9130wq.this.f32455x1 = str2;
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    C9130wq.this.f32453kk = str2;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.wq.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                int iM27428k4 = C9130wq.f32451du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 3) {
                    dm6 dm6Var = new dm6(abstractC13912i5);
                    list = C9130wq.this.f32454to;
                    c7394ca = new C7394ca("sp", dm6Var);
                } else if (iM27428k4 == 4) {
                    pij pijVar = new pij(abstractC13912i5);
                    list = C9130wq.this.f32454to;
                    c7394ca = new C7394ca("graphicFrame", pijVar);
                } else if (iM27428k4 == 5) {
                    ks0 ks0Var = new ks0(abstractC13912i5);
                    list = C9130wq.this.f32454to;
                    c7394ca = new C7394ca("pic", ks0Var);
                } else {
                    if (iM27428k4 != 6) {
                        return false;
                    }
                    hc1 hc1Var = new hc1(abstractC13912i5);
                    list = C9130wq.this.f32454to;
                    c7394ca = new C7394ca("grpSp", hc1Var);
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m43855k4(String str) {
        C7394ca c7394ca;
        int iM27428k4 = f32451du.m27428k4(str);
        if (iM27428k4 == 3) {
            c7394ca = new C7394ca("sp", new dm6());
        } else if (iM27428k4 == 4) {
            c7394ca = new C7394ca("graphicFrame", new pij());
        } else if (iM27428k4 == 5) {
            c7394ca = new C7394ca("pic", new ks0());
        } else {
            if (iM27428k4 != 6) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("grpSp", new hc1());
        }
        this.f32454to.addItem(c7394ca);
        return c7394ca;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f32452k4;
        if (str3 != null) {
            c3059ii.m12955x1("mc:Ignorable", str3);
        }
        String str4 = this.f32455x1;
        if (str4 != null) {
            c3059ii.m12955x1("mc:MustUnderstand", str4);
        }
        String str5 = this.f32453kk;
        if (str5 != null) {
            c3059ii.m12955x1("mc:ProcessContent", str5);
        }
        List.Enumerator<C7394ca> it = this.f32454to.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f32451du.m27428k4(next.m29539k4());
                if (iM27428k4 == 3) {
                    ((dm6) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
                } else if (iM27428k4 == 4) {
                    ((pij) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
                } else if (iM27428k4 == 5) {
                    ((ks0) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
                } else if (iM27428k4 == 6) {
                    ((hc1) next.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, next.m29539k4());
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

    /* JADX INFO: renamed from: k4 */
    public final C7394ca[] m43856k4() {
        return this.f32454to.toArray(new C7394ca[0]);
    }
}
