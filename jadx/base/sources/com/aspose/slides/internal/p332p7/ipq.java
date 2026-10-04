package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class ipq extends AbstractC8125ks {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f24861to = new C7017h4("cNvPr", "cNvGrpSpPr", "nvPr");

    /* JADX INFO: renamed from: k4 */
    private C7632f3 f24862k4;

    /* JADX INFO: renamed from: kk */
    private gt8 f24863kk;

    /* JADX INFO: renamed from: x1 */
    private C9171x4 f24864x1;

    public ipq() {
        this.f24862k4 = new C7632f3();
        this.f24864x1 = new C9171x4();
        this.f24863kk = new gt8();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8125ks
    /* JADX INFO: renamed from: k4 */
    public C7632f3 mo29447k4() {
        return this.f24862k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8125ks
    /* JADX INFO: renamed from: kk */
    public gt8 mo34363kk() {
        return this.f24863kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8125ks
    /* JADX INFO: renamed from: x1 */
    public C9171x4 mo29448x1() {
        return this.f24864x1;
    }

    public ipq(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ipq.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = ipq.f24861to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    ipq.this.f24862k4 = new C7632f3(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    ipq.this.f24864x1 = new C9171x4(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    ipq.this.f24863kk = new gt8(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f24862k4.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cNvPr");
        this.f24864x1.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cNvGrpSpPr");
        this.f24863kk.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "nvPr");
        c3059ii.mo21898jd();
    }
}
