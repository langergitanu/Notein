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
import com.aspose.slides.p559ms.System.Xml.C13850af;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.py */
/* JADX INFO: loaded from: classes4.dex */
public class C8557py extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f28633to = new C7017h4("id", "numDim", "strDim", "extLst");

    /* JADX INFO: renamed from: k4 */
    private long f28634k4;

    /* JADX INFO: renamed from: kk */
    private C7249ah f28635kk;

    /* JADX INFO: renamed from: x1 */
    private List<C7394ca> f28636x1;

    public C8557py() {
        m39196to();
    }

    /* JADX INFO: renamed from: to */
    private void m39196to() {
        this.f28636x1 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final long m39197k4() {
        return this.f28634k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final List<C7394ca> m39200x1() {
        return this.f28636x1;
    }

    public C8557py(final AbstractC13912i5 abstractC13912i5) {
        m39196to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.py.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C8557py.f28633to.m27428k4(str) != 0) {
                    return false;
                }
                C8557py.this.f28634k4 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.py.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                int iM27428k4 = C8557py.f28633to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    C9311yt c9311yt = new C9311yt(abstractC13912i5);
                    list = C8557py.this.f28636x1;
                    c7394ca = new C7394ca("numDim", c9311yt);
                } else {
                    if (iM27428k4 != 2) {
                        if (iM27428k4 != 3) {
                            return false;
                        }
                        C8557py.this.f28635kk = new C7249ah(abstractC13912i5);
                        return true;
                    }
                    C9392zq c9392zq = new C9392zq(abstractC13912i5);
                    list = C8557py.this.f28636x1;
                    c7394ca = new C7394ca("strDim", c9392zq);
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m39198k4(String str) {
        C7394ca c7394ca;
        int iM27428k4 = f28633to.m27428k4(str);
        if (iM27428k4 == 1) {
            c7394ca = new C7394ca("numDim", new C9311yt());
        } else {
            if (iM27428k4 != 2) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("strDim", new C9392zq());
        }
        this.f28636x1.addItem(c7394ca);
        return c7394ca;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39199k4(long j) {
        this.f28634k4 = j;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("id", C13850af.m65147x1(this.f28634k4));
        List.Enumerator<C7394ca> it = this.f28636x1.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f28633to.m27428k4(next.m29539k4());
                if (iM27428k4 == 1) {
                    ((C9311yt) next.m29541kk()).mo6846k4("cx", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 2) {
                    ((C9392zq) next.m29541kk()).mo6846k4("cx", c3059ii, next.m29539k4());
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
        C7249ah c7249ah = this.f28635kk;
        if (c7249ah != null) {
            c7249ah.mo6846k4("cx", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
