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
public class aph extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f20168x1 = new C7017h4("insertion-cut-off", "movement-cut-off");

    /* JADX INFO: renamed from: k4 */
    private List<C7394ca> f20169k4;

    public aph() {
        m28407x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m28407x1() {
        this.f20169k4 = new List<>();
    }

    public aph(final AbstractC13912i5 abstractC13912i5) {
        m28407x1();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.aph.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                int iM27428k4 = aph.f20168x1.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    moa moaVar = new moa(abstractC13912i5);
                    list = aph.this.f20169k4;
                    c7394ca = new C7394ca("insertion-cut-off", moaVar);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    r3b r3bVar = new r3b(abstractC13912i5);
                    list = aph.this.f20169k4;
                    c7394ca = new C7394ca("movement-cut-off", r3bVar);
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
        List.Enumerator<C7394ca> it = this.f20169k4.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                int iM27428k4 = f20168x1.m27428k4(next.m29539k4());
                if (iM27428k4 == 0) {
                    ((moa) next.m29541kk()).mo6846k4("table", c3059ii, next.m29539k4());
                } else if (iM27428k4 == 1) {
                    ((r3b) next.m29541kk()).mo6846k4("table", c3059ii, next.m29539k4());
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
