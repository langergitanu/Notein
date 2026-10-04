package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.w0 */
/* JADX INFO: loaded from: classes4.dex */
public class C9081w0 extends AbstractC8125ks {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f32137kk = new C7017h4("cNvPr", "cNvGrpSpPr");

    /* JADX INFO: renamed from: k4 */
    private C7632f3 f32138k4;

    /* JADX INFO: renamed from: x1 */
    private C9171x4 f32139x1;

    public C9081w0() {
        this.f32138k4 = new C7632f3();
        this.f32139x1 = new C9171x4();
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8125ks
    /* JADX INFO: renamed from: k4 */
    public C7632f3 mo29447k4() {
        return this.f32138k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC8125ks
    /* JADX INFO: renamed from: x1 */
    public C9171x4 mo29448x1() {
        return this.f32139x1;
    }

    public C9081w0(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.w0.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C9081w0.f32137kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C9081w0.this.f32138k4 = new C7632f3(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C9081w0.this.f32139x1 = new C9171x4(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f32138k4.mo6846k4("dsp", c3059ii, "cNvPr");
        this.f32139x1.mo6846k4("dsp", c3059ii, "cNvGrpSpPr");
        c3059ii.mo21898jd();
    }
}
