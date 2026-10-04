package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class zw1 extends AbstractC7992jd {

    /* JADX INFO: renamed from: to */
    private static final C7017h4 f34190to = new C7017h4("cNvPr", "cNvCxnSpPr", "nvPr");

    /* JADX INFO: renamed from: k4 */
    private C7632f3 f34191k4;

    /* JADX INFO: renamed from: kk */
    private gt8 f34192kk;

    /* JADX INFO: renamed from: x1 */
    private C7971j0 f34193x1;

    public zw1() {
        this.f34191k4 = new C7632f3();
        this.f34193x1 = new C7971j0();
        this.f34192kk = new gt8();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7992jd
    /* JADX INFO: renamed from: k4 */
    public C7632f3 mo33827k4() {
        return this.f34191k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7992jd
    /* JADX INFO: renamed from: kk */
    public gt8 mo34651kk() {
        return this.f34192kk;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7992jd
    /* JADX INFO: renamed from: x1 */
    public C7971j0 mo33828x1() {
        return this.f34193x1;
    }

    public zw1(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.zw1.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = zw1.f34190to.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    zw1.this.f34191k4 = new C7632f3(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    zw1.this.f34193x1 = new C7971j0(abstractC13912i5);
                } else {
                    if (iM27428k4 != 2) {
                        return false;
                    }
                    zw1.this.f34192kk = new gt8(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f34191k4.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cNvPr");
        this.f34193x1.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cNvCxnSpPr");
        this.f34192kk.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "nvPr");
        c3059ii.mo21898jd();
    }
}
