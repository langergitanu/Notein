package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.huawei.hms.network.embedded.C18241k5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class hec extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f24049x1 = new C7017h4("script:event-listener", "presentation:event-listener");

    /* JADX INFO: renamed from: k4 */
    private List<C7394ca> f24050k4;

    public hec() {
        m33307k4();
    }

    /* JADX INFO: renamed from: k4 */
    private void m33307k4() {
        this.f24050k4 = new List<>();
    }

    public hec(AbstractC13912i5 abstractC13912i5) {
        List<C7394ca> list;
        C7394ca c7394ca;
        m33307k4();
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            do {
                if (abstractC13912i5.mo65028jd() != 15 || !C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    if (abstractC13912i5.mo65028jd() == 1) {
                        int iM27428k4 = f24049x1.m27428k4(C14113y2.m67408k4(abstractC13912i5.mo65060yj(), C18241k5.f55433h, abstractC13912i5.mo65023fa()));
                        if (iM27428k4 == 0) {
                            tve tveVar = new tve(abstractC13912i5);
                            list = this.f24050k4;
                            c7394ca = new C7394ca(C14113y2.m67408k4("script:", "event-listener"), tveVar);
                        } else if (iM27428k4 != 1) {
                            abstractC13912i5.mo65208bv();
                        } else {
                            h2y h2yVar = new h2y(abstractC13912i5);
                            list = this.f24050k4;
                            c7394ca = new C7394ca(C14113y2.m67408k4("presentation:", "event-listener"), h2yVar);
                        }
                        list.addItem(c7394ca);
                        break;
                    }
                    break;
                }
                return;
            } while (!abstractC13912i5.mo65015ar());
        }
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C7394ca> it = this.f24050k4.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f24049x1.m27428k4(next.m29539k4());
                if (iM27428k4 == 0) {
                    ((tve) next.m29541kk()).mo6846k4("script", c3059ii, "event-listener");
                } else if (iM27428k4 == 1) {
                    ((h2y) next.m29541kk()).mo6846k4("presentation", c3059ii, "event-listener");
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
