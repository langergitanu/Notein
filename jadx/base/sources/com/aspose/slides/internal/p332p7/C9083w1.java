package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.w1 */
/* JADX INFO: loaded from: classes4.dex */
public class C9083w1 extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f32151kk = new C7017h4("sz", "extLst");

    /* JADX INFO: renamed from: k4 */
    private C8682rj f32152k4;

    /* JADX INFO: renamed from: x1 */
    private C8397nz f32153x1;

    public C9083w1() {
        this.f32152k4 = new C8682rj();
    }

    public C9083w1(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.w1.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C9083w1.f32151kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C9083w1.this.f32152k4 = new C8682rj(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    C9083w1.this.f32153x1 = new C8397nz(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f32152k4.mo6846k4("am3d", c3059ii, "sz");
        C8397nz c8397nz = this.f32153x1;
        if (c8397nz != null) {
            c8397nz.mo6846k4("am3d", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
