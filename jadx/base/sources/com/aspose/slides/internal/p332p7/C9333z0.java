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

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.z0 */
/* JADX INFO: loaded from: classes4.dex */
public class C9333z0 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f33639x1 = new C7017h4("ahXY", "ahPolar");

    /* JADX INFO: renamed from: k4 */
    private List<C7394ca> f33640k4;

    public C9333z0() {
        m45315kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m45315kk() {
        this.f33640k4 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C7394ca> m45317k4() {
        return this.f33640k4;
    }

    public C9333z0(final AbstractC13912i5 abstractC13912i5) {
        m45315kk();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.z0.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                int iM27428k4 = C9333z0.f33639x1.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7340bq c7340bq = new C7340bq(abstractC13912i5);
                    list = C9333z0.this.f33640k4;
                    c7394ca = new C7394ca("ahXY", c7340bq);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C7828h8 c7828h8 = new C7828h8(abstractC13912i5);
                    list = C9333z0.this.f33640k4;
                    c7394ca = new C7394ca("ahPolar", c7828h8);
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m45318k4(String str) {
        C7394ca c7394ca;
        int iM27428k4 = f33639x1.m27428k4(str);
        if (iM27428k4 == 0) {
            c7394ca = new C7394ca("ahXY", new C7340bq());
        } else {
            if (iM27428k4 != 1) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("ahPolar", new C7828h8());
        }
        this.f33640k4.addItem(c7394ca);
        return c7394ca;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C7394ca> it = this.f33640k4.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f33639x1.m27428k4(next.m29539k4());
                if (iM27428k4 == 0) {
                    ((C7340bq) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 1) {
                    ((C7828h8) next.m29541kk()).mo6846k4("a", c3059ii, next.m29539k4());
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
