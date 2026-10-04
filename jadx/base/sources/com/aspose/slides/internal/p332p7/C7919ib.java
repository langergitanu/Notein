package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ib */
/* JADX INFO: loaded from: classes4.dex */
public class C7919ib extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f24581x1 = new C7017h4("tab");

    /* JADX INFO: renamed from: k4 */
    private List<C8533pm> f24582k4;

    public C7919ib() {
        m33994to();
    }

    /* JADX INFO: renamed from: to */
    private void m33994to() {
        this.f24582k4 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final C8533pm[] m33996x1() {
        return this.f24582k4.toArray(new C8533pm[0]);
    }

    public C7919ib(final AbstractC13912i5 abstractC13912i5) {
        m33994to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ib.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7919ib.f24581x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C7919ib.this.f24582k4.addItem(new C8533pm(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8533pm m33995k4() {
        C8533pm c8533pm = new C8533pm();
        this.f24582k4.addItem(c8533pm);
        return c8533pm;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C8533pm> it = this.f24582k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("a", c3059ii, "tab");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
