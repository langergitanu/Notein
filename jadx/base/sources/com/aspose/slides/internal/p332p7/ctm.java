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
public class ctm extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f21258du = new C7017h4(C18293o1.f55803f, "uniqueCount", "si", "extLst");

    /* JADX INFO: renamed from: k4 */
    private long f21259k4;

    /* JADX INFO: renamed from: kk */
    private List<mhp> f21260kk;

    /* JADX INFO: renamed from: to */
    private g3j f21261to;

    /* JADX INFO: renamed from: x1 */
    private long f21262x1;

    public ctm() {
        m29810to();
    }

    /* JADX INFO: renamed from: to */
    private void m29810to() {
        this.f21259k4 = 4294967295L;
        this.f21262x1 = 4294967295L;
        this.f21260kk = new List<>();
    }

    public ctm(final AbstractC13912i5 abstractC13912i5) {
        m29810to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ctm.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = ctm.f21258du.m27428k4(str);
                if (iM27428k4 == 0) {
                    ctm.this.f21259k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                ctm.this.f21262x1 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ctm.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = ctm.f21258du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    ctm.this.f21260kk.addItem(new mhp(abstractC13912i5));
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                ctm.this.f21261to = new g3j(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final g3j m29816x1() {
        return this.f21261to;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m29817x1(long j) {
        this.f21262x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29812k4(long j) {
        this.f21259k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29813k4(g3j g3jVar) {
        this.f21261to = g3jVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m29814k4(mhp mhpVar) {
        this.f21260kk.addItem(mhpVar);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("ssml", str2, "http://schemas.openxmlformats.org/spreadsheetml/2006/main");
        long j = this.f21259k4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1(C18293o1.f55803f, C13850af.m65147x1(j));
        }
        long j2 = this.f21262x1;
        if ((j2 & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1("uniqueCount", C13850af.m65147x1(j2));
        }
        List.Enumerator<mhp> it = this.f21260kk.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ssml", c3059ii, "si");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        g3j g3jVar = this.f21261to;
        if (g3jVar != null) {
            g3jVar.mo6846k4("ssml", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final mhp[] m29815k4() {
        return this.f21260kk.toArray(new mhp[0]);
    }
}
