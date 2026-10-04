package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.vg */
/* JADX INFO: loaded from: classes4.dex */
public class C9038vg extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f31859x1 = new C7017h4("fmtOvr");

    /* JADX INFO: renamed from: k4 */
    private List<C7917ia> f31860k4;

    public C9038vg() {
        m43092kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m43092kk() {
        this.f31860k4 = new List<>();
    }

    public C9038vg(final AbstractC13912i5 abstractC13912i5) {
        m43092kk();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.vg.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C9038vg.f31859x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C9038vg.this.f31860k4.addItem(new C7917ia(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43094k4(C7917ia c7917ia) {
        this.f31860k4.addItem(c7917ia);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C7917ia> it = this.f31860k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("cx", c3059ii, "fmtOvr");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final C7917ia[] m43095k4() {
        return this.f31860k4.toArray(new C7917ia[0]);
    }
}
