package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class lpe extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f26467x1 = new C7017h4("control");

    /* JADX INFO: renamed from: k4 */
    private List<C8099kk> f26468k4;

    public lpe() {
        m36357to();
    }

    /* JADX INFO: renamed from: to */
    private void m36357to() {
        this.f26468k4 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final C8099kk[] m36359x1() {
        return this.f26468k4.toArray(new C8099kk[0]);
    }

    public lpe(final AbstractC13912i5 abstractC13912i5) {
        m36357to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.lpe.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (lpe.f26467x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                lpe.this.f26468k4.addItem(new C8099kk(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C8099kk m36358k4() {
        C8099kk c8099kk = new C8099kk();
        this.f26468k4.addItem(c8099kk);
        return c8099kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C8099kk> it = this.f26468k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "control");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
