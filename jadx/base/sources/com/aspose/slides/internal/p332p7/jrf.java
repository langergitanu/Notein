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
public class jrf extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f25329x1 = new C7017h4("custShow");

    /* JADX INFO: renamed from: k4 */
    private List<yz6> f25330k4;

    public jrf() {
        m34914to();
    }

    /* JADX INFO: renamed from: to */
    private void m34914to() {
        this.f25330k4 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final yz6[] m34916x1() {
        return this.f25330k4.toArray(new yz6[0]);
    }

    public jrf(final AbstractC13912i5 abstractC13912i5) {
        m34914to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.jrf.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (jrf.f25329x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                jrf.this.f25330k4.addItem(new yz6(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final yz6 m34915k4() {
        yz6 yz6Var = new yz6();
        this.f25330k4.addItem(yz6Var);
        return yz6Var;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<yz6> it = this.f25330k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "custShow");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
