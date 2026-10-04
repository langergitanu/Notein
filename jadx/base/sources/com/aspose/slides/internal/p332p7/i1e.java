package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class i1e extends AbstractC8968up {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f24469to = new C7017h4("cNvPr", "cNvGraphicFramePr", "nvPr");

    /* JADX INFO: renamed from: k4 */
    private C7632f3 f24470k4;

    /* JADX INFO: renamed from: kk */
    private gt8 f24471kk;

    /* JADX INFO: renamed from: x1 */
    private C8318n9 f24472x1;

    public i1e() {
        this.f24470k4 = new C7632f3();
        this.f24472x1 = new C8318n9();
        this.f24471kk = new gt8();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8968up
    /* JADX INFO: renamed from: k4 */
    public C7632f3 mo33833k4() {
        return this.f24470k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8968up
    /* JADX INFO: renamed from: kk */
    public gt8 mo33834kk() {
        return this.f24471kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8968up
    /* JADX INFO: renamed from: x1 */
    public C8318n9 mo33835x1() {
        return this.f24472x1;
    }

    public i1e(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.i1e.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = i1e.f24469to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    i1e.this.f24470k4 = new C7632f3(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    i1e.this.f24472x1 = new C8318n9(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    i1e.this.f24471kk = new gt8(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f24470k4.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cNvPr");
        this.f24472x1.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cNvGraphicFramePr");
        this.f24471kk.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "nvPr");
        c3059ii.mo21898jd();
    }
}
