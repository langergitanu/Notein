package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.z8 */
/* JADX INFO: loaded from: classes4.dex */
public class C9350z8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f33779c5 = new C7017h4("enabled", "rad", "spotAng", "clr", "intensity", "pos", "lookAt", "extLst");

    /* JADX INFO: renamed from: du */
    private C8682rj f33780du;

    /* JADX INFO: renamed from: dy */
    private C8397nz f33781dy;

    /* JADX INFO: renamed from: h4 */
    private C9165x2 f33782h4;

    /* JADX INFO: renamed from: k4 */
    private boolean f33783k4;

    /* JADX INFO: renamed from: kk */
    private float f33784kk;

    /* JADX INFO: renamed from: m9 */
    private C9165x2 f33785m9;

    /* JADX INFO: renamed from: to */
    private C7447cx f33786to;

    /* JADX INFO: renamed from: x1 */
    private double f33787x1;

    public C9350z8() {
        m45504x1();
        this.f33786to = new C7447cx();
        this.f33780du = new C8682rj();
        this.f33782h4 = new C9165x2();
        this.f33785m9 = new C9165x2();
    }

    public C9350z8(final AbstractC13912i5 abstractC13912i5) {
        m45504x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.z8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C9350z8.f33779c5.m27428k4(str);
                if (iM27428k4 == 0) {
                    C9350z8.this.f33783k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    C9350z8.this.f33787x1 = C13850af.m65132uz(str2) / 12700.0d;
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C9350z8.this.f33784kk = C13850af.m65151yj(str2) / 60000.0f;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.z8.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C9350z8.f33779c5.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 3) {
                    C9350z8.this.f33786to = new C7447cx(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 4) {
                    C9350z8.this.f33780du = new C8682rj(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 5) {
                    C9350z8.this.f33782h4 = new C9165x2(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 6) {
                    C9350z8.this.f33785m9 = new C9165x2(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 7) {
                    return false;
                }
                C9350z8.this.f33781dy = new C8397nz(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m45504x1() {
        this.f33783k4 = true;
        this.f33787x1 = Double.NaN;
        this.f33784kk = 45.0f;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f33783k4;
        if (!z) {
            c3059ii.m12955x1("enabled", z ? "1" : "0");
        }
        C6005k4.m24262k4(!C14044b3.m66437kk(this.f33787x1), "Required property \"Rad\" is uninitialized.");
        c3059ii.m12955x1("rad", C22238OooO0oO.OooO00o(this.f33787x1, 12700.0d, 14));
        OooO00o.OooO00o(this.f33784kk * 60000.0f, 14, c3059ii, "spotAng");
        this.f33786to.mo6846k4("am3d", c3059ii, "clr");
        this.f33780du.mo6846k4("am3d", c3059ii, "intensity");
        this.f33782h4.mo6846k4("am3d", c3059ii, "pos");
        this.f33785m9.mo6846k4("am3d", c3059ii, "lookAt");
        C8397nz c8397nz = this.f33781dy;
        if (c8397nz != null) {
            c8397nz.mo6846k4("am3d", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
