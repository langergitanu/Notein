package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.v1 */
/* JADX INFO: loaded from: classes4.dex */
public class C8990v1 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f31481kk = new C7017h4("phantPr", "e");

    /* JADX INFO: renamed from: k4 */
    private C8746s8 f31482k4;

    /* JADX INFO: renamed from: x1 */
    private C9085w3 f31483x1;

    public C8990v1() {
        this.f31483x1 = new C9085w3();
    }

    public C8990v1(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.v1.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8990v1.f31481kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8990v1.this.f31482k4 = new C8746s8(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C8990v1.this.f31483x1 = new C9085w3(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8746s8 c8746s8 = this.f31482k4;
        if (c8746s8 != null) {
            c8746s8.mo6846k4("m", c3059ii, "phantPr");
        }
        this.f31483x1.mo6846k4("m", c3059ii, "e");
        c3059ii.mo21898jd();
    }
}
