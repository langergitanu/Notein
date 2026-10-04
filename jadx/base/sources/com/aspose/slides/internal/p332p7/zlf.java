package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class zlf extends AbstractC9177x6 {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f33942to = new C7017h4("cNvPr", "cNvPicPr", "nvPr");

    /* JADX INFO: renamed from: k4 */
    private C7632f3 f33943k4;

    /* JADX INFO: renamed from: kk */
    private gt8 f33944kk;

    /* JADX INFO: renamed from: x1 */
    private C7952iq f33945x1;

    public zlf() {
        this.f33943k4 = new C7632f3();
        this.f33945x1 = new C7952iq();
        this.f33944kk = new gt8();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9177x6
    /* JADX INFO: renamed from: k4 */
    public C7632f3 mo42132k4() {
        return this.f33943k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9177x6
    /* JADX INFO: renamed from: kk */
    public gt8 mo44221kk() {
        return this.f33944kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC9177x6
    /* JADX INFO: renamed from: x1 */
    public C7952iq mo42133x1() {
        return this.f33945x1;
    }

    public zlf(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.zlf.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = zlf.f33942to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    zlf.this.f33943k4 = new C7632f3(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    zlf.this.f33945x1 = new C7952iq(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    zlf.this.f33944kk = new gt8(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f33943k4.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cNvPr");
        this.f33945x1.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cNvPicPr");
        this.f33944kk.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "nvPr");
        c3059ii.mo21898jd();
    }
}
