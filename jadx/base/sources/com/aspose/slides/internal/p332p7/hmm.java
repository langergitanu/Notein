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
public class hmm extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f24219to = new C7017h4(C18293o1.f55803f, "manualBreakCount", "brk");

    /* JADX INFO: renamed from: k4 */
    private long f24220k4;

    /* JADX INFO: renamed from: kk */
    private List<htp> f24221kk;

    /* JADX INFO: renamed from: x1 */
    private long f24222x1;

    public hmm() {
        m33521x1();
    }

    public hmm(final AbstractC13912i5 abstractC13912i5) {
        m33521x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.hmm.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = hmm.f24219to.m27428k4(str);
                if (iM27428k4 == 0) {
                    hmm.this.f24220k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                hmm.this.f24222x1 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.hmm.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (hmm.f24219to.m27428k4(abstractC13912i5.mo65023fa()) != 2) {
                    return false;
                }
                hmm.this.f24221kk.addItem(new htp(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m33521x1() {
        this.f24220k4 = 0L;
        this.f24222x1 = 0L;
        this.f24221kk = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f24220k4;
        if ((j & 4294967295L) != 0) {
            c3059ii.m12955x1(C18293o1.f55803f, C13850af.m65147x1(j));
        }
        long j2 = this.f24222x1;
        if ((4294967295L & j2) != 0) {
            c3059ii.m12955x1("manualBreakCount", C13850af.m65147x1(j2));
        }
        List.Enumerator<htp> it = this.f24221kk.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ssml", c3059ii, "brk");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
