package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class hgn extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f24067kk = new C7017h4("fullScrn", "cMediaNode");

    /* JADX INFO: renamed from: k4 */
    private boolean f24068k4;

    /* JADX INFO: renamed from: x1 */
    private v2z f24069x1;

    public hgn() {
        m33333to();
        this.f24069x1 = new v2z();
    }

    /* JADX INFO: renamed from: to */
    private void m33333to() {
        this.f24068k4 = false;
    }

    /* JADX INFO: renamed from: x1 */
    public final v2z m33336x1() {
        return this.f24069x1;
    }

    public hgn(final AbstractC13912i5 abstractC13912i5) {
        m33333to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.hgn.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (hgn.f24067kk.m27428k4(str) != 0) {
                    return false;
                }
                hgn.this.f24068k4 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.hgn.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (hgn.f24067kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                hgn.this.f24069x1 = new v2z(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f24068k4;
        if (z) {
            c3059ii.m12955x1("fullScrn", z ? "1" : "0");
        }
        this.f24069x1.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cMediaNode");
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33334k4(boolean z) {
        this.f24068k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m33335k4() {
        return this.f24068k4;
    }
}
