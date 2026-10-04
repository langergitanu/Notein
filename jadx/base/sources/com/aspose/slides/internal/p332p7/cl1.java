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
public class cl1 extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f21120du = new C7017h4("fo:column-count", "fo:column-gap", "column-sep", "column");

    /* JADX INFO: renamed from: k4 */
    private long f21121k4;

    /* JADX INFO: renamed from: kk */
    private yix f21122kk;

    /* JADX INFO: renamed from: to */
    private List<tx9> f21123to;

    /* JADX INFO: renamed from: x1 */
    private String f21124x1;

    public cl1() {
        m29666x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m29666x1() {
        this.f21123to = new List<>();
    }

    public cl1(final AbstractC13912i5 abstractC13912i5) {
        m29666x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.cl1.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = cl1.f21120du.m27428k4(str);
                if (iM27428k4 == 0) {
                    cl1.this.f21121k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                cl1.this.f21124x1 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.cl1.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = cl1.f21120du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    cl1.this.f21122kk = new yix(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                cl1.this.f21123to.addItem(new tx9(abstractC13912i5));
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("fo:column-count", C13850af.m65147x1(this.f21121k4));
        String str3 = this.f21124x1;
        if (str3 != null) {
            c3059ii.m12955x1("fo:column-gap", str3);
        }
        yix yixVar = this.f21122kk;
        if (yixVar != null) {
            yixVar.mo6846k4("style", c3059ii, "column-sep");
        }
        List.Enumerator<tx9> it = this.f21123to.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("style", c3059ii, "column");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
