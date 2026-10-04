package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ch */
/* JADX INFO: loaded from: classes4.dex */
public class C7406ch extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f21065h4 = new C7017h4("ptLst", "cxnLst", TranslateLanguage.BULGARIAN, "whole", "extLst");

    /* JADX INFO: renamed from: du */
    private C8397nz f21066du;

    /* JADX INFO: renamed from: k4 */
    private C8124kr f21067k4;

    /* JADX INFO: renamed from: kk */
    private C8281mq f21068kk;

    /* JADX INFO: renamed from: to */
    private C7442cu f21069to;

    /* JADX INFO: renamed from: x1 */
    private C7555ed f21070x1;

    public C7406ch() {
        this.f21067k4 = new C8124kr();
    }

    public C7406ch(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ch.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7406ch.f21065h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7406ch.this.f21067k4 = new C8124kr(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C7406ch.this.f21070x1 = new C7555ed(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C7406ch.this.f21068kk = new C8281mq(abstractC13912i5);
                } else if (iM27428k4 == 3) {
                    C7406ch.this.f21069to = new C7442cu(abstractC13912i5);
                } else {
                    if (iM27428k4 != 4) {
                        return false;
                    }
                    C7406ch.this.f21066du = new C8397nz(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f21067k4.mo6846k4("dgm", c3059ii, "ptLst");
        C7555ed c7555ed = this.f21070x1;
        if (c7555ed != null) {
            c7555ed.mo6846k4("dgm", c3059ii, "cxnLst");
        }
        C8281mq c8281mq = this.f21068kk;
        if (c8281mq != null) {
            c8281mq.mo6846k4("dgm", c3059ii, TranslateLanguage.BULGARIAN);
        }
        C7442cu c7442cu = this.f21069to;
        if (c7442cu != null) {
            c7442cu.mo6846k4("dgm", c3059ii, "whole");
        }
        C8397nz c8397nz = this.f21066du;
        if (c8397nz != null) {
            c8397nz.mo6846k4("dgm", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
