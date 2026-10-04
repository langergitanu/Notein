package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class ltr extends AbstractC7414ck {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f26511x1 = new C7017h4("ext");

    /* JADX INFO: renamed from: k4 */
    private List<h2b> f26512k4;

    public ltr() {
        m36433du();
    }

    /* JADX INFO: renamed from: du */
    private void m36433du() {
        this.f26512k4 = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<h2b> it = this.f26512k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "ext");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7414ck
    /* JADX INFO: renamed from: kk */
    public AbstractC7414ck mo29644kk() {
        return new ltr();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7414ck
    /* JADX INFO: renamed from: x1 */
    public C8290mt mo29646x1() {
        h2b h2bVar = new h2b();
        this.f26512k4.addItem(h2bVar);
        return h2bVar;
    }

    public ltr(AbstractC13912i5 abstractC13912i5) {
        m36433du();
        if (abstractC13912i5.mo65048u4()) {
            return;
        }
        String strMo65023fa = abstractC13912i5.mo65023fa();
        while (abstractC13912i5.mo65026h4()) {
            do {
                if (abstractC13912i5.mo65028jd() == 15 && C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa)) {
                    return;
                }
                if (abstractC13912i5.mo65028jd() != 1) {
                    break;
                }
                if (f26511x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    abstractC13912i5.mo65208bv();
                } else {
                    this.f26512k4.addItem(new h2b(abstractC13912i5));
                }
            } while (!abstractC13912i5.mo65015ar());
        }
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7414ck
    /* JADX INFO: renamed from: k4 */
    public C8290mt[] mo29643k4() {
        return this.f26512k4.toArray(new h2b[0]);
    }
}
