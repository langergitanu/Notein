package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class ytw extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f33507du = new C7017h4(C18437z2.f56754h, "deleted", "xmlBased", "cellSmartTagPr");

    /* JADX INFO: renamed from: k4 */
    private long f33508k4;

    /* JADX INFO: renamed from: kk */
    private boolean f33509kk;

    /* JADX INFO: renamed from: to */
    private List<c2j> f33510to;

    /* JADX INFO: renamed from: x1 */
    private boolean f33511x1;

    public ytw() {
        m45136x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m45136x1() {
        this.f33511x1 = false;
        this.f33509kk = false;
        this.f33510to = new List<>();
    }

    public ytw(final AbstractC13912i5 abstractC13912i5) {
        m45136x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ytw.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = ytw.f33507du.m27428k4(str);
                if (iM27428k4 == 0) {
                    ytw.this.f33508k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    ytw.this.f33511x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                ytw.this.f33509kk = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ytw.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (ytw.f33507du.m27428k4(abstractC13912i5.mo65023fa()) != 3) {
                    return false;
                }
                ytw.this.f33510to.addItem(new c2j(abstractC13912i5));
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1(C18437z2.f56754h, C13850af.m65147x1(this.f33508k4));
        boolean z = this.f33511x1;
        if (z) {
            c3059ii.m12955x1("deleted", z ? "1" : "0");
        }
        boolean z2 = this.f33509kk;
        if (z2) {
            c3059ii.m12955x1("xmlBased", z2 ? "1" : "0");
        }
        List.Enumerator<c2j> it = this.f33510to.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ssml", c3059ii, "cellSmartTagPr");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
