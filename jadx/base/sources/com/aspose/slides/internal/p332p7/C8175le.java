package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.le */
/* JADX INFO: loaded from: classes4.dex */
public class C8175le extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f26211m9 = new C7017h4("enabled", "rad", "clr", "intensity", "pos", "extLst");

    /* JADX INFO: renamed from: du */
    private C9165x2 f26212du;

    /* JADX INFO: renamed from: h4 */
    private C8397nz f26213h4;

    /* JADX INFO: renamed from: k4 */
    private boolean f26214k4;

    /* JADX INFO: renamed from: kk */
    private C7447cx f26215kk;

    /* JADX INFO: renamed from: to */
    private C8682rj f26216to;

    /* JADX INFO: renamed from: x1 */
    private double f26217x1;

    public C8175le() {
        m36015x1();
        this.f26215kk = new C7447cx();
        this.f26216to = new C8682rj();
        this.f26212du = new C9165x2();
    }

    /* JADX INFO: renamed from: x1 */
    private void m36015x1() {
        this.f26214k4 = true;
        this.f26217x1 = Double.NaN;
    }

    public C8175le(final AbstractC13912i5 abstractC13912i5) {
        m36015x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.le.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8175le.f26211m9.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8175le.this.f26214k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8175le.this.f26217x1 = C13850af.m65132uz(str2) / 12700.0d;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.le.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8175le.f26211m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    C8175le.this.f26215kk = new C7447cx(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 3) {
                    C8175le.this.f26216to = new C8682rj(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 4) {
                    C8175le.this.f26212du = new C9165x2(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                C8175le.this.f26213h4 = new C8397nz(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f26214k4;
        if (!z) {
            c3059ii.m12955x1("enabled", z ? "1" : "0");
        }
        C6005k4.m24262k4(!C14044b3.m66437kk(this.f26217x1), "Required property \"Rad\" is uninitialized.");
        c3059ii.m12955x1("rad", C22238OooO0oO.OooO00o(this.f26217x1, 12700.0d, 14));
        this.f26215kk.mo6846k4("am3d", c3059ii, "clr");
        this.f26216to.mo6846k4("am3d", c3059ii, "intensity");
        this.f26212du.mo6846k4("am3d", c3059ii, "pos");
        C8397nz c8397nz = this.f26213h4;
        if (c8397nz != null) {
            c8397nz.mo6846k4("am3d", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
