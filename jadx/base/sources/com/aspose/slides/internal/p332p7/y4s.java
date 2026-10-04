package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.huawei.hms.network.embedded.C18293o1;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class y4s extends AbstractC7361bz {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f33193dy = new C7017h4("name", "locked", "hidden", C18293o1.f55803f, "user", "comment", "inputCells");

    /* JADX INFO: renamed from: du */
    private String f33194du;

    /* JADX INFO: renamed from: h4 */
    private String f33195h4;

    /* JADX INFO: renamed from: k4 */
    private String f33196k4;

    /* JADX INFO: renamed from: kk */
    private boolean f33197kk;

    /* JADX INFO: renamed from: m9 */
    private List<qas> f33198m9;

    /* JADX INFO: renamed from: to */
    private long f33199to;

    /* JADX INFO: renamed from: x1 */
    private boolean f33200x1;

    public y4s() {
        m44800x1();
    }

    public y4s(final AbstractC13912i5 abstractC13912i5) {
        m44800x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.y4s.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = y4s.f33193dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    y4s.this.f33196k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    y4s.this.f33200x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    y4s.this.f33197kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    y4s.this.f33199to = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 4) {
                    y4s.this.f33194du = str2;
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                y4s.this.f33195h4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.y4s.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (y4s.f33193dy.m27428k4(abstractC13912i5.mo65023fa()) != 6) {
                    return false;
                }
                y4s.this.f33198m9.addItem(new qas(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m44800x1() {
        this.f33200x1 = false;
        this.f33197kk = false;
        this.f33199to = 4294967295L;
        this.f33198m9 = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("name", this.f33196k4);
        boolean z = this.f33200x1;
        if (z) {
            c3059ii.m12955x1("locked", z ? "1" : "0");
        }
        boolean z2 = this.f33197kk;
        if (z2) {
            c3059ii.m12955x1("hidden", z2 ? "1" : "0");
        }
        long j = this.f33199to;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1(C18293o1.f55803f, C13850af.m65147x1(j));
        }
        String str3 = this.f33194du;
        if (str3 != null) {
            c3059ii.m12955x1("user", str3);
        }
        String str4 = this.f33195h4;
        if (str4 != null) {
            c3059ii.m12955x1("comment", str4);
        }
        List.Enumerator<qas> it = this.f33198m9.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ssml", c3059ii, "inputCells");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
