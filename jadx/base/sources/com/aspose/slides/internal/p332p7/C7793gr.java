package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.gr */
/* JADX INFO: loaded from: classes4.dex */
public class C7793gr extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f23698kk = new C7017h4("r:link", "extLst");

    /* JADX INFO: renamed from: k4 */
    private String f23699k4;

    /* JADX INFO: renamed from: x1 */
    private C8397nz f23700x1;

    public C7793gr() {
    }

    public C7793gr(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.gr.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7793gr.f23698kk.m27428k4(str) != 0) {
                    return false;
                }
                C7793gr.this.f23699k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.gr.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7793gr.f23698kk.m27428k4(abstractC13912i5.mo65023fa()) != 1) {
                    return false;
                }
                C7793gr.this.f23700x1 = new C8397nz(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        c3059ii.m12955x1("r:link", this.f23699k4);
        C8397nz c8397nz = this.f23700x1;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
