package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.n6 */
/* JADX INFO: loaded from: classes4.dex */
public class C8311n6 extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f27122h4 = new C7017h4("pos", "up", "lookAt", "orthographic", "perspective", "extLst");

    /* JADX INFO: renamed from: du */
    private C8397nz f27123du;

    /* JADX INFO: renamed from: k4 */
    private C9165x2 f27124k4;

    /* JADX INFO: renamed from: kk */
    private C9165x2 f27125kk;

    /* JADX INFO: renamed from: to */
    private C7394ca f27126to;

    /* JADX INFO: renamed from: x1 */
    private C8428od f27127x1;

    public C8311n6() {
        this.f27124k4 = new C9165x2();
        this.f27127x1 = new C8428od();
        this.f27125kk = new C9165x2();
    }

    public C8311n6(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.n6.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C8311n6 c8311n6;
                C7394ca c7394ca;
                int iM27428k4 = C8311n6.f27122h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8311n6.this.f27124k4 = new C9165x2(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C8311n6.this.f27127x1 = new C8428od(abstractC13912i5);
                } else if (iM27428k4 != 2) {
                    if (iM27428k4 == 3) {
                        c8311n6 = C8311n6.this;
                        c7394ca = new C7394ca("orthographic", new C9083w1(abstractC13912i5));
                    } else if (iM27428k4 == 4) {
                        c8311n6 = C8311n6.this;
                        c7394ca = new C7394ca("perspective", new C9048vk(abstractC13912i5));
                    } else {
                        if (iM27428k4 != 5) {
                            return false;
                        }
                        C8311n6.this.f27123du = new C8397nz(abstractC13912i5);
                    }
                    c8311n6.f27126to = c7394ca;
                } else {
                    C8311n6.this.f27125kk = new C9165x2(abstractC13912i5);
                }
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        this.f27124k4.mo6846k4("am3d", c3059ii, "pos");
        this.f27127x1.mo6846k4("am3d", c3059ii, "up");
        this.f27125kk.mo6846k4("am3d", c3059ii, "lookAt");
        C7394ca c7394ca = this.f27126to;
        if (c7394ca != null) {
            int iM27428k4 = f27122h4.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 3) {
                ((C9083w1) this.f27126to.m29541kk()).mo6846k4("am3d", c3059ii, this.f27126to.m29539k4());
            } else if (iM27428k4 == 4) {
                ((C9048vk) this.f27126to.m29541kk()).mo6846k4("am3d", c3059ii, this.f27126to.m29539k4());
            }
        }
        C8397nz c8397nz = this.f27123du;
        if (c8397nz != null) {
            c8397nz.mo6846k4("am3d", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
