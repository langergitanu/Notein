package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.i1 */
/* JADX INFO: loaded from: classes4.dex */
public class C7900i1 extends AbstractC7992jd {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f24464kk = new C7017h4("cNvPr", "cNvCxnSpPr");

    /* JADX INFO: renamed from: k4 */
    private C7632f3 f24465k4;

    /* JADX INFO: renamed from: x1 */
    private C7971j0 f24466x1;

    public C7900i1() {
        this.f24465k4 = new C7632f3();
        this.f24466x1 = new C7971j0();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7992jd
    /* JADX INFO: renamed from: k4 */
    public C7632f3 mo33827k4() {
        return this.f24465k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7992jd
    /* JADX INFO: renamed from: x1 */
    public C7971j0 mo33828x1() {
        return this.f24466x1;
    }

    public C7900i1(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.i1.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7900i1.f24464kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7900i1.this.f24465k4 = new C7632f3(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C7900i1.this.f24466x1 = new C7971j0(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f24465k4.mo6846k4("cdr", c3059ii, "cNvPr");
        this.f24466x1.mo6846k4("cdr", c3059ii, "cNvCxnSpPr");
        c3059ii.mo21898jd();
    }
}
