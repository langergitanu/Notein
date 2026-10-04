package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class yz6 extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f33627du = new C7017h4("name", "id", "sldLst", "extLst");

    /* JADX INFO: renamed from: k4 */
    private String f33628k4;

    /* JADX INFO: renamed from: kk */
    private xf6 f33629kk;

    /* JADX INFO: renamed from: to */
    private ltr f33630to;

    /* JADX INFO: renamed from: x1 */
    private long f33631x1;

    public yz6() {
        this.f33629kk = new xf6();
    }

    /* JADX INFO: renamed from: kk */
    public final xf6 m45309kk() {
        return this.f33629kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m45310x1() {
        return this.f33631x1;
    }

    public yz6(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.yz6.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = yz6.f33627du.m27428k4(str);
                if (iM27428k4 == 0) {
                    yz6.this.f33628k4 = str2;
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                yz6.this.f33631x1 = AbstractC7361bz.m29295ne(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.yz6.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = yz6.f33627du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    yz6.this.f33629kk = new xf6(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                yz6.this.f33630to = new ltr(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final String m45306k4() {
        return this.f33628k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45307k4(long j) {
        this.f33631x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m45308k4(String str) {
        this.f33628k4 = str;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("name", this.f33628k4);
        c3059ii.m12955x1("id", C13850af.m65147x1(this.f33631x1));
        this.f33629kk.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "sldLst");
        ltr ltrVar = this.f33630to;
        if (ltrVar != null) {
            ltrVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
