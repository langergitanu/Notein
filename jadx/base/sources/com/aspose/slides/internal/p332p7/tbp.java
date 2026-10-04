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
public class tbp extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private String f30663du;

    /* JADX INFO: renamed from: h4 */
    private List<oju> f30664h4;

    /* JADX INFO: renamed from: kk */
    private boolean f30665kk;

    /* JADX INFO: renamed from: m9 */
    private g3j f30666m9;

    /* JADX INFO: renamed from: to */
    private int f30667to;

    /* JADX INFO: renamed from: x1 */
    private boolean f30668x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f30662k4 = o1a.m37956k4("none");

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f30661dy = new C7017h4("columnSort", "caseSensitive", "sortMethod", "ref", "sortCondition", "extLst");

    public tbp() {
        m41647x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m41647x1() {
        this.f30668x1 = false;
        this.f30665kk = false;
        this.f30667to = f30662k4;
        this.f30664h4 = new List<>();
    }

    public tbp(final AbstractC13912i5 abstractC13912i5) {
        m41647x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.tbp.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = tbp.f30661dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    tbp.this.f30668x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    tbp.this.f30665kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    tbp.this.f30667to = o1a.m37956k4(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                tbp.this.f30663du = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.tbp.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = tbp.f30661dy.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 4) {
                    tbp.this.f30664h4.addItem(new oju(abstractC13912i5));
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                tbp.this.f30666m9 = new g3j(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f30668x1;
        if (z) {
            c3059ii.m12955x1("columnSort", z ? "1" : "0");
        }
        boolean z2 = this.f30665kk;
        if (z2) {
            c3059ii.m12955x1("caseSensitive", z2 ? "1" : "0");
        }
        int i = this.f30667to;
        if (i != f30662k4) {
            c3059ii.m12955x1("sortMethod", o1a.m37957k4(i));
        }
        c3059ii.m12955x1("ref", this.f30663du);
        List.Enumerator<oju> it = this.f30664h4.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ssml", c3059ii, "sortCondition");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        g3j g3jVar = this.f30666m9;
        if (g3jVar != null) {
            g3jVar.mo6846k4("ssml", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
