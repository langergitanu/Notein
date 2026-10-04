package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class ee2 extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f22115to = new C7017h4("result", "default", "listEntry");

    /* JADX INFO: renamed from: k4 */
    private clh f22116k4;

    /* JADX INFO: renamed from: kk */
    private List<ef9> f22117kk;

    /* JADX INFO: renamed from: x1 */
    private clh f22118x1;

    public ee2() {
        m30936x1();
    }

    public ee2(final AbstractC13912i5 abstractC13912i5) {
        m30936x1();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ee2.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = ee2.f22115to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    ee2.this.f22116k4 = new clh(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    ee2.this.f22118x1 = new clh(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    ee2.this.f22117kk.addItem(new ef9(abstractC13912i5));
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m30936x1() {
        this.f22117kk = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        clh clhVar = this.f22116k4;
        if (clhVar != null) {
            clhVar.mo6846k4("w", c3059ii, "result");
        }
        clh clhVar2 = this.f22118x1;
        if (clhVar2 != null) {
            clhVar2.mo6846k4("w", c3059ii, "default");
        }
        List.Enumerator<ef9> it = this.f22117kk.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("w", c3059ii, "listEntry");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
