package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class dnu extends AbstractC7414ck {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f21763kk = new C7017h4("mod", "ext");

    /* JADX INFO: renamed from: k4 */
    private boolean f21764k4;

    /* JADX INFO: renamed from: x1 */
    private List<h2b> f21765x1;

    public dnu() {
        m30477h4();
    }

    /* JADX INFO: renamed from: h4 */
    private void m30477h4() {
        this.f21764k4 = false;
        this.f21765x1 = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f21764k4;
        if (z) {
            c3059ii.m12955x1("mod", z ? "1" : "0");
        }
        List.Enumerator<h2b> it = this.f21765x1.iterator();
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
        return new dnu();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7414ck
    /* JADX INFO: renamed from: x1 */
    public C8290mt mo29646x1() {
        h2b h2bVar = new h2b();
        this.f21765x1.addItem(h2bVar);
        return h2bVar;
    }

    public dnu(AbstractC13912i5 abstractC13912i5) {
        m30477h4();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.dnu.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (dnu.f21763kk.m27428k4(str) != 0) {
                    return false;
                }
                dnu.this.f21764k4 = C13850af.m65068c5(str2);
                return true;
            }
        });
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
                if (f21763kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    abstractC13912i5.mo65208bv();
                } else {
                    this.f21765x1.addItem(new h2b(abstractC13912i5));
                }
            } while (!abstractC13912i5.mo65015ar());
        }
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7414ck
    /* JADX INFO: renamed from: k4 */
    public C8290mt[] mo29643k4() {
        return this.f21765x1.toArray(new h2b[0]);
    }
}
