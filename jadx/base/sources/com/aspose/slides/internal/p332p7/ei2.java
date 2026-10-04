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
public class ei2 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f22250x1 = new C7017h4("cond");

    /* JADX INFO: renamed from: k4 */
    private List<bnx> f22251k4;

    public ei2() {
        m31104to();
    }

    /* JADX INFO: renamed from: to */
    private void m31104to() {
        this.f22251k4 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final bnx[] m31106x1() {
        return this.f22251k4.toArray(new bnx[0]);
    }

    public ei2(final AbstractC13912i5 abstractC13912i5) {
        m31104to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ei2.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (ei2.f22250x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                ei2.this.f22251k4.addItem(new bnx(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final bnx m31105k4() {
        bnx bnxVar = new bnx();
        this.f22251k4.addItem(bnxVar);
        return bnxVar;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<bnx> it = this.f22251k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cond");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
