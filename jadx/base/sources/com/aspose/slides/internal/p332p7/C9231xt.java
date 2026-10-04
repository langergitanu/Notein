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

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.xt */
/* JADX INFO: loaded from: classes4.dex */
public class C9231xt extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f33054x1 = new C7017h4("tag");

    /* JADX INFO: renamed from: k4 */
    private List<egt> f33055k4;

    public C9231xt() {
        m44628to();
    }

    /* JADX INFO: renamed from: to */
    private void m44628to() {
        this.f33055k4 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final egt[] m44630x1() {
        return this.f33055k4.toArray(new egt[0]);
    }

    public C9231xt(final AbstractC13912i5 abstractC13912i5) {
        m44628to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.xt.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C9231xt.f33054x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C9231xt.this.f33055k4.addItem(new egt(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final egt m44629k4() {
        egt egtVar = new egt();
        this.f33055k4.addItem(egtVar);
        return egtVar;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(ContextChain.TAG_PRODUCT, str2, "http://schemas.openxmlformats.org/presentationml/2006/main");
        List.Enumerator<egt> it = this.f33055k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "tag");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
