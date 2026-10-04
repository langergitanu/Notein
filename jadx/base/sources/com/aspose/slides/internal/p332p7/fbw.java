package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.miui.penengine.p596e.C18773h;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class fbw extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f22782x1 = new C7017h4(C18773h.f57233c);

    /* JADX INFO: renamed from: k4 */
    private List<o9e> f22783k4;

    public fbw() {
        m31728kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m31728kk() {
        this.f22783k4 = new List<>();
    }

    public fbw(final AbstractC13912i5 abstractC13912i5) {
        m31728kk();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.fbw.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (fbw.f22782x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                fbw.this.f22783k4.addItem(new o9e(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final o9e m31730k4() {
        o9e o9eVar = new o9e();
        this.f22783k4.addItem(o9eVar);
        return o9eVar;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<o9e> it = this.f22783k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("v", c3059ii, C18773h.f57233c);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
