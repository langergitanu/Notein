package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes4.dex */
public class ohe extends AbstractC7361bz {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f27947to = new C7017h4("text:style-name", "ruby-base", "ruby-text");

    /* JADX INFO: renamed from: k4 */
    private String f27948k4;

    /* JADX INFO: renamed from: kk */
    private nuk f27949kk;

    /* JADX INFO: renamed from: x1 */
    private ofi f27950x1;

    public ohe() {
        this.f27950x1 = new ofi();
        this.f27949kk = new nuk();
    }

    public ohe(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ohe.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (ohe.f27947to.m27428k4(str) != 0) {
                    return false;
                }
                ohe.this.f27948k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ohe.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = ohe.f27947to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 1) {
                    ohe.this.f27950x1 = new ofi(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    ohe.this.f27949kk = new nuk(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        String str3 = this.f27948k4;
        if (str3 != null) {
            c3059ii.m12955x1("text:style-name", str3);
        }
        this.f27950x1.mo6846k4("text", c3059ii, "ruby-base");
        this.f27949kk.mo6846k4("text", c3059ii, "ruby-text");
        c3059ii.mo21898jd();
    }
}
