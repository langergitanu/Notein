package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.m6 */
/* JADX INFO: loaded from: classes4.dex */
public class C8245m6 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f26697x1 = new C7017h4("path");

    /* JADX INFO: renamed from: k4 */
    private List<C8541pr> f26698k4;

    public C8245m6() {
        m36712to();
    }

    /* JADX INFO: renamed from: to */
    private void m36712to() {
        this.f26698k4 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final C8541pr[] m36714x1() {
        return this.f26698k4.toArray(new C8541pr[0]);
    }

    public C8245m6(final AbstractC13912i5 abstractC13912i5) {
        m36712to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.m6.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C8245m6.f26697x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C8245m6.this.f26698k4.addItem(new C8541pr(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8541pr m36713k4() {
        C8541pr c8541pr = new C8541pr();
        this.f26698k4.addItem(c8541pr);
        return c8541pr;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C8541pr> it = this.f26698k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("a", c3059ii, "path");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
