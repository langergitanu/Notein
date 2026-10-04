package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.gz */
/* JADX INFO: loaded from: classes4.dex */
public class C7811gz extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f23800x1 = new C7017h4("dgm", "chart");

    /* JADX INFO: renamed from: k4 */
    private C7394ca f23801k4;

    public C7811gz() {
    }

    public C7811gz(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.gz.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C7811gz c7811gz;
                C7394ca c7394ca;
                int iM27428k4 = C7811gz.f23800x1.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    c7811gz = C7811gz.this;
                    c7394ca = new C7394ca("dgm", new C8111kn(abstractC13912i5));
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    c7811gz = C7811gz.this;
                    c7394ca = new C7394ca("chart", new C8248m8(abstractC13912i5));
                }
                c7811gz.f23801k4 = c7394ca;
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m33001k4(String str) {
        C7394ca c7394ca;
        if (this.f23801k4 != null) {
            throw new Exception("Animation already is initialized.");
        }
        int iM27428k4 = f23800x1.m27428k4(str);
        if (iM27428k4 == 0) {
            c7394ca = new C7394ca("dgm", new C8111kn());
        } else {
            if (iM27428k4 != 1) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("chart", new C8248m8());
        }
        this.f23801k4 = c7394ca;
        return this.f23801k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7394ca c7394ca = this.f23801k4;
        if (c7394ca != null) {
            int iM27428k4 = f23800x1.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 0) {
                ((C8111kn) this.f23801k4.m29541kk()).mo6846k4("a", c3059ii, this.f23801k4.m29539k4());
            } else if (iM27428k4 == 1) {
                ((C8248m8) this.f23801k4.m29541kk()).mo6846k4("a", c3059ii, this.f23801k4.m29539k4());
            }
        }
        c3059ii.mo21898jd();
    }
}
