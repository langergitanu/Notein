package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.g5 */
/* JADX INFO: loaded from: classes4.dex */
public class C7730g5 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f23240x1 = new C7017h4("extLst");

    /* JADX INFO: renamed from: k4 */
    private C7249ah f23241k4;

    public C7730g5() {
    }

    /* JADX INFO: renamed from: k4 */
    public final C7249ah m32311k4() {
        return this.f23241k4;
    }

    public C7730g5(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.g5.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7730g5.f23240x1.m27428k4(abstractC13912i5.mo65023fa()) != 0) {
                    return false;
                }
                C7730g5.this.f23241k4 = new C7249ah(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32312k4(C7249ah c7249ah) {
        this.f23241k4 = c7249ah;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C7249ah c7249ah = this.f23241k4;
        if (c7249ah != null) {
            c7249ah.mo6846k4("cx", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
