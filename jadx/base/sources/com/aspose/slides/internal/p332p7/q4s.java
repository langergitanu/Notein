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
public class q4s extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f28747x1 = new C7017h4("sldId");

    /* JADX INFO: renamed from: k4 */
    private List<e8m> f28748k4;

    public q4s() {
        m39332to();
    }

    /* JADX INFO: renamed from: to */
    private void m39332to() {
        this.f28748k4 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final e8m[] m39334x1() {
        return this.f28748k4.toArray(new e8m[0]);
    }

    public q4s(final AbstractC13912i5 abstractC13912i5) {
        m39332to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.q4s.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (q4s.f28747x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                q4s.this.f28748k4.addItem(new e8m(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final e8m m39333k4() {
        e8m e8mVar = new e8m();
        this.f28748k4.addItem(e8mVar);
        return e8mVar;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<e8m> it = this.f28748k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("p14", c3059ii, "sldId");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
