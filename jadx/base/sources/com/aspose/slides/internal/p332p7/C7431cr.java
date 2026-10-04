package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.cr */
/* JADX INFO: loaded from: classes4.dex */
public class C7431cr extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f21175du = new C7017h4("enabled", "clr", "illuminance", "extLst");

    /* JADX INFO: renamed from: k4 */
    private boolean f21176k4;

    /* JADX INFO: renamed from: kk */
    private C8682rj f21177kk;

    /* JADX INFO: renamed from: to */
    private C8397nz f21178to;

    /* JADX INFO: renamed from: x1 */
    private C7447cx f21179x1;

    public C7431cr() {
        m29729x1();
        this.f21179x1 = new C7447cx();
        this.f21177kk = new C8682rj();
    }

    /* JADX INFO: renamed from: x1 */
    private void m29729x1() {
        this.f21176k4 = true;
    }

    public C7431cr(final AbstractC13912i5 abstractC13912i5) {
        m29729x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.cr.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7431cr.f21175du.m27428k4(str) != 0) {
                    return false;
                }
                C7431cr.this.f21176k4 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.cr.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7431cr.f21175du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    C7431cr.this.f21179x1 = new C7447cx(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C7431cr.this.f21177kk = new C8682rj(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    C7431cr.this.f21178to = new C8397nz(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f21176k4;
        if (!z) {
            c3059ii.m12955x1("enabled", z ? "1" : "0");
        }
        this.f21179x1.mo6846k4("am3d", c3059ii, "clr");
        this.f21177kk.mo6846k4("am3d", c3059ii, "illuminance");
        C8397nz c8397nz = this.f21178to;
        if (c8397nz != null) {
            c8397nz.mo6846k4("am3d", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
