package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class hi8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f24157kk = new C7017h4("soft-page-break", "table-row");

    /* JADX INFO: renamed from: k4 */
    private tfm f24158k4;

    /* JADX INFO: renamed from: x1 */
    private exz f24159x1;

    public hi8() {
        this.f24159x1 = new exz();
    }

    /* JADX INFO: renamed from: k4 */
    public final exz m33445k4() {
        return this.f24159x1;
    }

    public hi8(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.hi8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = hi8.f24157kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    hi8.this.f24158k4 = new tfm(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    hi8.this.f24159x1 = new exz(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        tfm tfmVar = this.f24158k4;
        if (tfmVar != null) {
            tfmVar.mo6846k4("text", c3059ii, "soft-page-break");
        }
        this.f24159x1.mo6846k4("table", c3059ii, "table-row");
        c3059ii.mo21898jd();
    }
}
