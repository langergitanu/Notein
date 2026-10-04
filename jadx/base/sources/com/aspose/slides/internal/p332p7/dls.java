package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class dls extends AbstractC7966ix {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f21698to = new C7017h4("cNvPr", "cNvSpPr", "nvPr");

    /* JADX INFO: renamed from: k4 */
    private C7632f3 f21699k4;

    /* JADX INFO: renamed from: kk */
    private gt8 f21700kk;

    /* JADX INFO: renamed from: x1 */
    private C8767sf f21701x1;

    public dls() {
        this.f21699k4 = new C7632f3();
        this.f21701x1 = new C8767sf();
        this.f21700kk = new gt8();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7966ix
    /* JADX INFO: renamed from: k4 */
    public C7632f3 mo30406k4() {
        return this.f21699k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7966ix
    /* JADX INFO: renamed from: kk */
    public gt8 mo30407kk() {
        return this.f21700kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7966ix
    /* JADX INFO: renamed from: x1 */
    public C8767sf mo30408x1() {
        return this.f21701x1;
    }

    public dls(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.dls.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = dls.f21698to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    dls.this.f21699k4 = new C7632f3(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    dls.this.f21701x1 = new C8767sf(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    dls.this.f21700kk = new gt8(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, ContextChain.TAG_PRODUCT.equals(c3059ii.mo12952k4("http://schemas.openxmlformats.org/presentationml/2006/main")) ? null : "http://schemas.openxmlformats.org/presentationml/2006/main");
        this.f21699k4.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cNvPr");
        this.f21701x1.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cNvSpPr");
        this.f21700kk.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "nvPr");
        c3059ii.mo21898jd();
    }
}
