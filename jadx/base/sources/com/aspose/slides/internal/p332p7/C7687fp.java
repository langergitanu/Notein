package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.fp */
/* JADX INFO: loaded from: classes4.dex */
public class C7687fp extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f22946x1 = new C7017h4("gridCol");

    /* JADX INFO: renamed from: k4 */
    private List<C7374c3> f22947k4;

    public C7687fp() {
        m31940to();
    }

    /* JADX INFO: renamed from: to */
    private void m31940to() {
        this.f22947k4 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final C7374c3[] m31942x1() {
        return this.f22947k4.toArray(new C7374c3[0]);
    }

    public C7687fp(final AbstractC13912i5 abstractC13912i5) {
        m31940to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.fp.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7687fp.f22946x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C7687fp.this.f22947k4.addItem(new C7374c3(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7374c3 m31941k4() {
        C7374c3 c7374c3 = new C7374c3();
        this.f22947k4.addItem(c7374c3);
        return c7374c3;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C7374c3> it = this.f22947k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("a", c3059ii, "gridCol");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
