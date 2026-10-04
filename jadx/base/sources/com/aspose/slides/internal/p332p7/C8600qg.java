package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.qg */
/* JADX INFO: loaded from: classes4.dex */
public class C8600qg extends AbstractC7966ix {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f28866kk = new C7017h4("cNvPr", "cNvSpPr");

    /* JADX INFO: renamed from: k4 */
    private C7632f3 f28867k4;

    /* JADX INFO: renamed from: x1 */
    private C8767sf f28868x1;

    public C8600qg() {
        this.f28867k4 = new C7632f3();
        this.f28868x1 = new C8767sf();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7966ix
    /* JADX INFO: renamed from: k4 */
    public C7632f3 mo30406k4() {
        return this.f28867k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7966ix
    /* JADX INFO: renamed from: x1 */
    public C8767sf mo30408x1() {
        return this.f28868x1;
    }

    public C8600qg(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.qg.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8600qg.f28866kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8600qg.this.f28867k4 = new C7632f3(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C8600qg.this.f28868x1 = new C8767sf(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f28867k4.mo6846k4("cdr", c3059ii, "cNvPr");
        this.f28868x1.mo6846k4("cdr", c3059ii, "cNvSpPr");
        c3059ii.mo21898jd();
    }
}
