package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.rk */
/* JADX INFO: loaded from: classes4.dex */
public class C8683rk extends AbstractC7361bz {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f29339dy = new C7017h4("enabled", "angularRad", "clr", "illuminance", "pos", "lookAt", "extLst");

    /* JADX INFO: renamed from: du */
    private C9165x2 f29340du;

    /* JADX INFO: renamed from: h4 */
    private C9165x2 f29341h4;

    /* JADX INFO: renamed from: k4 */
    private boolean f29342k4;

    /* JADX INFO: renamed from: kk */
    private C7447cx f29343kk;

    /* JADX INFO: renamed from: m9 */
    private C8397nz f29344m9;

    /* JADX INFO: renamed from: to */
    private C8682rj f29345to;

    /* JADX INFO: renamed from: x1 */
    private float f29346x1;

    public C8683rk() {
        m40044x1();
        this.f29343kk = new C7447cx();
        this.f29345to = new C8682rj();
        this.f29340du = new C9165x2();
        this.f29341h4 = new C9165x2();
    }

    public C8683rk(final AbstractC13912i5 abstractC13912i5) {
        m40044x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.rk.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8683rk.f29339dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8683rk.this.f29342k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C8683rk.this.f29346x1 = C13850af.m65151yj(str2) / 60000.0f;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.rk.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8683rk.f29339dy.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    C8683rk.this.f29343kk = new C7447cx(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 3) {
                    C8683rk.this.f29345to = new C8682rj(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 4) {
                    C8683rk.this.f29340du = new C9165x2(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 5) {
                    C8683rk.this.f29341h4 = new C9165x2(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 6) {
                    return false;
                }
                C8683rk.this.f29344m9 = new C8397nz(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    private void m40044x1() {
        this.f29342k4 = true;
        this.f29346x1 = Float.NaN;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f29342k4;
        if (!z) {
            c3059ii.m12955x1("enabled", z ? "1" : "0");
        }
        C6005k4.m24262k4(!C14064he.m66715kk(this.f29346x1), "Required property \"AngularRad\" is uninitialized.");
        OooO00o.OooO00o(this.f29346x1 * 60000.0f, 14, c3059ii, "angularRad");
        this.f29343kk.mo6846k4("am3d", c3059ii, "clr");
        this.f29345to.mo6846k4("am3d", c3059ii, "illuminance");
        this.f29340du.mo6846k4("am3d", c3059ii, "pos");
        this.f29341h4.mo6846k4("am3d", c3059ii, "lookAt");
        C8397nz c8397nz = this.f29344m9;
        if (c8397nz != null) {
            c8397nz.mo6846k4("am3d", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
