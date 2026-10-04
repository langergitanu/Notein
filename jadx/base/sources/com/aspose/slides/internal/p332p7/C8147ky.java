package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ky */
/* JADX INFO: loaded from: classes4.dex */
public class C8147ky extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f26016kk = new C7017h4("eqArrPr", "e");

    /* JADX INFO: renamed from: k4 */
    private C7871ho f26017k4;

    /* JADX INFO: renamed from: x1 */
    private List<C9085w3> f26018x1;

    public C8147ky() {
        m35776to();
    }

    /* JADX INFO: renamed from: to */
    private void m35776to() {
        this.f26018x1 = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final C9085w3[] m35780x1() {
        return this.f26018x1.toArray(new C9085w3[0]);
    }

    public C8147ky(final AbstractC13912i5 abstractC13912i5) {
        m35776to();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ky.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8147ky.f26016kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8147ky.this.f26017k4 = new C7871ho(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C8147ky.this.f26018x1.addItem(new C9085w3(abstractC13912i5));
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7871ho m35777k4() {
        return this.f26017k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35778k4(C7871ho c7871ho) {
        this.f26017k4 = c7871ho;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35779k4(C9085w3 c9085w3) {
        this.f26018x1.addItem(c9085w3);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7871ho c7871ho = this.f26017k4;
        if (c7871ho != null) {
            c7871ho.mo6846k4("m", c3059ii, "eqArrPr");
        }
        List.Enumerator<C9085w3> it = this.f26018x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("m", c3059ii, "e");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
