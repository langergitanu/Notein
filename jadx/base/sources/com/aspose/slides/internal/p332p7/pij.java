package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class pij extends AbstractC7650fa {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f28433du = new C7017h4("nvGraphicFramePr", "xfrm", "graphic", "extLst");

    /* JADX INFO: renamed from: k4 */
    private i1e f28434k4;

    /* JADX INFO: renamed from: kk */
    private C7902i2 f28435kk;

    /* JADX INFO: renamed from: to */
    private dnu f28436to;

    /* JADX INFO: renamed from: x1 */
    private C9030ve f28437x1;

    public pij() {
        this.f28434k4 = new i1e();
        this.f28437x1 = new C9030ve();
        this.f28435kk = new C7902i2();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7650fa
    /* JADX INFO: renamed from: kk */
    public C7902i2 mo31678kk() {
        return this.f28435kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7650fa
    /* JADX INFO: renamed from: to */
    public AbstractC7414ck mo31679to() {
        return this.f28436to;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7650fa
    /* JADX INFO: renamed from: x1 */
    public C9030ve mo31680x1() {
        return this.f28437x1;
    }

    public pij(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.pij.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = pij.f28433du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    pij.this.f28434k4 = new i1e(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    pij.this.f28437x1 = new C9030ve(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    pij.this.f28435kk = new C7902i2(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    pij.this.f28436to = new dnu(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7650fa
    /* JADX INFO: renamed from: k4 */
    public AbstractC8968up mo31676k4() {
        return this.f28434k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7650fa
    /* JADX INFO: renamed from: k4 */
    public void mo31677k4(AbstractC7414ck abstractC7414ck) {
        this.f28436to = (dnu) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, ContextChain.TAG_PRODUCT.equals(c3059ii.mo12952k4("http://schemas.openxmlformats.org/presentationml/2006/main")) ? null : "http://schemas.openxmlformats.org/presentationml/2006/main");
        this.f28434k4.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "nvGraphicFramePr");
        this.f28437x1.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "xfrm");
        this.f28435kk.mo6846k4("a", c3059ii, "graphic");
        dnu dnuVar = this.f28436to;
        if (dnuVar != null) {
            dnuVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
