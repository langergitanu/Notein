package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.pq */
/* JADX INFO: loaded from: classes4.dex */
public class C8540pq extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f28521x1 = new C7017h4("ln");

    /* JADX INFO: renamed from: k4 */
    private List<C8985uy> f28522k4;

    public C8540pq() {
        m39045to();
    }

    /* JADX INFO: renamed from: to */
    private void m39045to() {
        this.f28522k4 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final C8985uy[] m39047x1() {
        return this.f28522k4.toArray(new C8985uy[0]);
    }

    public C8540pq(final AbstractC13912i5 abstractC13912i5) {
        m39045to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.pq.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C8540pq.f28521x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C8540pq.this.f28522k4.addItem(new C8985uy(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8985uy m39046k4() {
        C8985uy c8985uy = new C8985uy();
        this.f28522k4.addItem(c8985uy);
        return c8985uy;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C8985uy> it = this.f28522k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("a", c3059ii, "ln");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
