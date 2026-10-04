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
public class kiv extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f25695kk = new C7017h4("index-title-template", "bibliography-entry-template");

    /* JADX INFO: renamed from: k4 */
    private pzs f25696k4;

    /* JADX INFO: renamed from: x1 */
    private List<nk4> f25697x1;

    public kiv() {
        m35434x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m35434x1() {
        this.f25697x1 = new List<>();
    }

    public kiv(final AbstractC13912i5 abstractC13912i5) {
        m35434x1();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.kiv.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = kiv.f25695kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    kiv.this.f25696k4 = new pzs(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    kiv.this.f25697x1.addItem(new nk4(abstractC13912i5));
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        pzs pzsVar = this.f25696k4;
        if (pzsVar != null) {
            pzsVar.mo6846k4("text", c3059ii, "index-title-template");
        }
        List.Enumerator<nk4> it = this.f25697x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("text", c3059ii, "bibliography-entry-template");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
