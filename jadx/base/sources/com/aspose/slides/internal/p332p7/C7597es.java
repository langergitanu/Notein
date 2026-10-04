package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.es */
/* JADX INFO: loaded from: classes4.dex */
public class C7597es extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f22392du = new C7017h4(C18293o1.f55803f, "min", "mid", "max");

    /* JADX INFO: renamed from: k4 */
    private int f22393k4;

    /* JADX INFO: renamed from: kk */
    private C7468da f22394kk;

    /* JADX INFO: renamed from: to */
    private C8840t7 f22395to;

    /* JADX INFO: renamed from: x1 */
    private C8840t7 f22396x1;

    public C7597es() {
        m31277x1();
    }

    public C7597es(final AbstractC13912i5 abstractC13912i5) {
        m31277x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.es.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7597es.f22392du.m27428k4(str) != 0) {
                    return false;
                }
                C7597es.this.f22393k4 = C13850af.m65151yj(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.es.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7597es.f22392du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    C7597es.this.f22396x1 = new C8840t7(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C7597es.this.f22394kk = new C7468da(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    C7597es.this.f22395to = new C8840t7(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m31277x1() {
        this.f22393k4 = 2;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        int i = this.f22393k4;
        if (i != 2) {
            c3059ii.m12955x1(C18293o1.f55803f, C13850af.m65103k4(i));
        }
        C8840t7 c8840t7 = this.f22396x1;
        if (c8840t7 != null) {
            c8840t7.mo6846k4("cx", c3059ii, "min");
        }
        C7468da c7468da = this.f22394kk;
        if (c7468da != null) {
            c7468da.mo6846k4("cx", c3059ii, "mid");
        }
        C8840t7 c8840t72 = this.f22395to;
        if (c8840t72 != null) {
            c8840t72.mo6846k4("cx", c3059ii, "max");
        }
        c3059ii.mo21898jd();
    }
}
