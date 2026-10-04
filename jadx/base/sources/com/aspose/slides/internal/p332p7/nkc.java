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
public class nkc extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f27420h4 = new C7017h4("name", "pivot", "table", C18293o1.f55803f, "tableStyleElement");

    /* JADX INFO: renamed from: du */
    private List<tsh> f27421du;

    /* JADX INFO: renamed from: k4 */
    private String f27422k4;

    /* JADX INFO: renamed from: kk */
    private boolean f27423kk;

    /* JADX INFO: renamed from: to */
    private long f27424to;

    /* JADX INFO: renamed from: x1 */
    private boolean f27425x1;

    public nkc() {
        m37670x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m37670x1() {
        this.f27425x1 = true;
        this.f27423kk = true;
        this.f27424to = 4294967295L;
        this.f27421du = new List<>();
    }

    public nkc(final AbstractC13912i5 abstractC13912i5) {
        m37670x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.nkc.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = nkc.f27420h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    nkc.this.f27422k4 = str2;
                    return true;
                }
                if (iM27428k4 == 1) {
                    nkc.this.f27425x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    nkc.this.f27423kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                nkc.this.f27424to = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.nkc.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (nkc.f27420h4.m27428k4(abstractC13912i5.mo65023fa()) != 4) {
                    return false;
                }
                nkc.this.f27421du.addItem(new tsh(abstractC13912i5));
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("name", this.f27422k4);
        boolean z = this.f27425x1;
        if (!z) {
            c3059ii.m12955x1("pivot", z ? "1" : "0");
        }
        boolean z2 = this.f27423kk;
        if (!z2) {
            c3059ii.m12955x1("table", z2 ? "1" : "0");
        }
        long j = this.f27424to;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1(C18293o1.f55803f, C13850af.m65147x1(j));
        }
        List.Enumerator<tsh> it = this.f27421du.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ssml", c3059ii, "tableStyleElement");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
