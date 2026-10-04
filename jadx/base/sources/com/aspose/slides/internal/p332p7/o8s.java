package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class o8s extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f27756kk = new C7017h4("text:outline-level", "index-source-style");

    /* JADX INFO: renamed from: k4 */
    private long f27757k4;

    /* JADX INFO: renamed from: x1 */
    private List<x3j> f27758x1;

    public o8s() {
        m38059x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m38059x1() {
        this.f27758x1 = new List<>();
    }

    public o8s(final AbstractC13912i5 abstractC13912i5) {
        m38059x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.o8s.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (o8s.f27756kk.m27428k4(str) != 0) {
                    return false;
                }
                o8s.this.f27757k4 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.o8s.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (o8s.f27756kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                o8s.this.f27758x1.addItem(new x3j(abstractC13912i5));
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("text:outline-level", C13850af.m65147x1(this.f27757k4));
        List.Enumerator<x3j> it = this.f27758x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("text", c3059ii, "index-source-style");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
