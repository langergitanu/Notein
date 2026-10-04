package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.tp */
/* JADX INFO: loaded from: classes4.dex */
public class C8883tp extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f30827x1 = new C7017h4("ds");

    /* JADX INFO: renamed from: k4 */
    private List<C7204a0> f30828k4;

    public C8883tp() {
        m41835to();
    }

    /* JADX INFO: renamed from: to */
    private void m41835to() {
        this.f30828k4 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final C7204a0[] m41837x1() {
        return this.f30828k4.toArray(new C7204a0[0]);
    }

    public C8883tp(final AbstractC13912i5 abstractC13912i5) {
        m41835to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.tp.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C8883tp.f30827x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C8883tp.this.f30828k4.addItem(new C7204a0(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7204a0 m41836k4() {
        C7204a0 c7204a0 = new C7204a0();
        this.f30828k4.addItem(c7204a0);
        return c7204a0;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C7204a0> it = this.f30828k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("a", c3059ii, "ds");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
