package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class fov extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f22935kk = new C7017h4("cSldViewPr", "extLst");

    /* JADX INFO: renamed from: k4 */
    private wz8 f22936k4;

    /* JADX INFO: renamed from: x1 */
    private ltr f22937x1;

    public fov() {
        this.f22936k4 = new wz8();
    }

    public fov(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.fov.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = fov.f22935kk.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    fov.this.f22936k4 = new wz8(abstractC13912i5);
                } else {
                    if (iM27428k4 != 1) {
                        return false;
                    }
                    fov.this.f22937x1 = new ltr(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final wz8 m31931k4() {
        return this.f22936k4;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f22936k4.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cSldViewPr");
        ltr ltrVar = this.f22937x1;
        if (ltrVar != null) {
            ltrVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
