package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ah */
/* JADX INFO: loaded from: classes4.dex */
public class C7249ah extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f20066x1 = new C7017h4("ext");

    /* JADX INFO: renamed from: k4 */
    private List<C7262ap> f20067k4;

    public C7249ah() {
        m28251x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m28251x1() {
        this.f20067k4 = new List<>();
    }

    public C7249ah(final AbstractC13912i5 abstractC13912i5) {
        m28251x1();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ah.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7249ah.f20066x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C7249ah.this.f20067k4.addItem(new C7262ap(abstractC13912i5));
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C7262ap> it = this.f20067k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("cx", c3059ii, "ext");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
