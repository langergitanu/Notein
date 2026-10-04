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
public class rcz extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f29242du = new C7017h4(C18293o1.f55803f, "defaultTableStyle", "defaultPivotStyle", "tableStyle");

    /* JADX INFO: renamed from: k4 */
    private long f29243k4;

    /* JADX INFO: renamed from: kk */
    private String f29244kk;

    /* JADX INFO: renamed from: to */
    private List<nkc> f29245to;

    /* JADX INFO: renamed from: x1 */
    private String f29246x1;

    public rcz() {
        m39956x1();
    }

    public rcz(final AbstractC13912i5 abstractC13912i5) {
        m39956x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.rcz.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = rcz.f29242du.m27428k4(str);
                if (iM27428k4 == 0) {
                    rcz.this.f29243k4 = AbstractC7361bz.m29295ne(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    rcz.this.f29246x1 = str2;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                rcz.this.f29244kk = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.rcz.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (rcz.f29242du.m27428k4(abstractC13912i5.mo65023fa()) != 3) {
                    return false;
                }
                rcz.this.f29245to.addItem(new nkc(abstractC13912i5));
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m39956x1() {
        this.f29243k4 = 4294967295L;
        this.f29245to = new List<>();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        long j = this.f29243k4;
        if ((j & 4294967295L) != 4294967295L) {
            c3059ii.m12955x1(C18293o1.f55803f, C13850af.m65147x1(j));
        }
        String str3 = this.f29246x1;
        if (str3 != null) {
            c3059ii.m12955x1("defaultTableStyle", str3);
        }
        String str4 = this.f29244kk;
        if (str4 != null) {
            c3059ii.m12955x1("defaultPivotStyle", str4);
        }
        List.Enumerator<nkc> it = this.f29245to.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6846k4("ssml", c3059ii, "tableStyle");
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c3059ii.mo21898jd();
    }
}
