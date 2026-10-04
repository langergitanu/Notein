package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.fo */
/* JADX INFO: loaded from: classes4.dex */
public class C7683fo extends AbstractC7414ck {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f22929x1 = new C7017h4("ext");

    /* JADX INFO: renamed from: k4 */
    private List<C8093kj> f22930k4;

    public C7683fo() {
        m31922du();
    }

    /* JADX INFO: renamed from: du */
    private void m31922du() {
        this.f22930k4 = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C8093kj> it = this.f22930k4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("c", c3059ii, "ext");
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
        return new C7683fo();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7414ck
    /* JADX INFO: renamed from: x1 */
    public C8290mt mo29646x1() {
        C8093kj c8093kj = new C8093kj();
        this.f22930k4.addItem(c8093kj);
        return c8093kj;
    }

    public C7683fo(AbstractC13912i5 abstractC13912i5) {
        m31922du();
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
                if (f22929x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    abstractC13912i5.mo65208bv();
                } else {
                    this.f22930k4.addItem(new C8093kj(abstractC13912i5));
                }
            } while (!abstractC13912i5.mo65015ar());
        }
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7414ck
    /* JADX INFO: renamed from: k4 */
    public C8290mt[] mo29643k4() {
        return this.f22930k4.toArray(new C8093kj[0]);
    }
}
