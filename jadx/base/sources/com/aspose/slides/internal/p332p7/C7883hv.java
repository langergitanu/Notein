package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.hv */
/* JADX INFO: loaded from: classes4.dex */
public class C7883hv extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f24303m9 = new C7017h4("meterPerModelUnit", "preTrans", "scale", "rot", "postTrans", "extLst");

    /* JADX INFO: renamed from: du */
    private C8428od f24304du;

    /* JADX INFO: renamed from: h4 */
    private C8397nz f24305h4;

    /* JADX INFO: renamed from: k4 */
    private C8682rj f24306k4;

    /* JADX INFO: renamed from: kk */
    private C7723g3 f24307kk;

    /* JADX INFO: renamed from: to */
    private C9024vc f24308to;

    /* JADX INFO: renamed from: x1 */
    private C8428od f24309x1;

    public C7883hv() {
    }

    public C7883hv(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.hv.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7883hv.f24303m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7883hv.this.f24306k4 = new C8682rj(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C7883hv.this.f24309x1 = new C8428od(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C7883hv.this.f24307kk = new C7723g3(abstractC13912i5);
                } else if (iM27428k4 == 3) {
                    C7883hv.this.f24308to = new C9024vc(abstractC13912i5);
                } else if (iM27428k4 == 4) {
                    C7883hv.this.f24304du = new C8428od(abstractC13912i5);
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    C7883hv.this.f24305h4 = new C8397nz(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        C8682rj c8682rj = this.f24306k4;
        if (c8682rj != null) {
            c8682rj.mo6846k4("am3d", c3059ii, "meterPerModelUnit");
        }
        C8428od c8428od = this.f24309x1;
        if (c8428od != null) {
            c8428od.mo6846k4("am3d", c3059ii, "preTrans");
        }
        C7723g3 c7723g3 = this.f24307kk;
        if (c7723g3 != null) {
            c7723g3.mo6846k4("am3d", c3059ii, "scale");
        }
        C9024vc c9024vc = this.f24308to;
        if (c9024vc != null) {
            c9024vc.mo6846k4("am3d", c3059ii, "rot");
        }
        C8428od c8428od2 = this.f24304du;
        if (c8428od2 != null) {
            c8428od2.mo6846k4("am3d", c3059ii, "postTrans");
        }
        C8397nz c8397nz = this.f24305h4;
        if (c8397nz != null) {
            c8397nz.mo6846k4("am3d", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
