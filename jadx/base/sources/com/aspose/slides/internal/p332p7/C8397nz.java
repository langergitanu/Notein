package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.nz */
/* JADX INFO: loaded from: classes4.dex */
public class C8397nz extends AbstractC7414ck {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f27667x1 = new C7017h4("ext");

    /* JADX INFO: renamed from: k4 */
    private List<C8618qp> f27668k4;

    public C8397nz() {
        m37942du();
    }

    /* JADX INFO: renamed from: du */
    private void m37942du() {
        this.f27668k4 = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, "a".equals(c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main")) ? null : "http://schemas.openxmlformats.org/drawingml/2006/main");
        List.Enumerator<C8618qp> it = this.f27668k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("a", c3059ii, "ext");
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
        return new C8397nz();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7414ck
    /* JADX INFO: renamed from: x1 */
    public C8290mt mo29646x1() {
        C8618qp c8618qp = new C8618qp();
        this.f27668k4.addItem(c8618qp);
        return c8618qp;
    }

    public C8397nz(AbstractC13912i5 abstractC13912i5) {
        m37942du();
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
                if (f27667x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    abstractC13912i5.mo65208bv();
                } else {
                    this.f27668k4.addItem(new C8618qp(abstractC13912i5));
                }
            } while (!abstractC13912i5.mo65015ar());
        }
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7414ck
    /* JADX INFO: renamed from: k4 */
    public C8290mt[] mo29643k4() {
        return this.f27668k4.toArray(new C8618qp[0]);
    }
}
