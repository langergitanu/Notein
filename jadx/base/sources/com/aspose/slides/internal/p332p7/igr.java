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
public class igr extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f24649du = new C7017h4("pivot", "sqref", "cfRule", "extLst");

    /* JADX INFO: renamed from: k4 */
    private boolean f24650k4;

    /* JADX INFO: renamed from: kk */
    private List<xjy> f24651kk;

    /* JADX INFO: renamed from: to */
    private g3j f24652to;

    /* JADX INFO: renamed from: x1 */
    private String f24653x1;

    public igr() {
        m34102x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m34102x1() {
        this.f24650k4 = false;
        this.f24651kk = new List<>();
    }

    public igr(final AbstractC13912i5 abstractC13912i5) {
        m34102x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.igr.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = igr.f24649du.m27428k4(str);
                if (iM27428k4 == 0) {
                    igr.this.f24650k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                igr.this.f24653x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.igr.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = igr.f24649du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    igr.this.f24651kk.addItem(new xjy(abstractC13912i5));
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                igr.this.f24652to = new g3j(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f24650k4;
        if (z) {
            c3059ii.m12955x1("pivot", z ? "1" : "0");
        }
        String str3 = this.f24653x1;
        if (str3 != null) {
            c3059ii.m12955x1("sqref", str3);
        }
        List.Enumerator<xjy> it = this.f24651kk.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ssml", c3059ii, "cfRule");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        g3j g3jVar = this.f24652to;
        if (g3jVar != null) {
            g3jVar.mo6846k4("ssml", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
