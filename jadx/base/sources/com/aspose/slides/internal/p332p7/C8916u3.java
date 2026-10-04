package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.u3 */
/* JADX INFO: loaded from: classes4.dex */
public class C8916u3 extends AbstractC7361bz {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f31013jd = new C7017h4("rot", C18437z2.f56754h, "r:blip", "zOrderOff", "hideGeom", "lkTxEntry", "blipPhldr", "adjLst", "extLst");

    /* JADX INFO: renamed from: c5 */
    private C8397nz f31014c5;

    /* JADX INFO: renamed from: du */
    private boolean f31015du;

    /* JADX INFO: renamed from: dy */
    private C9147ww f31016dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f31017h4;

    /* JADX INFO: renamed from: k4 */
    private double f31018k4;

    /* JADX INFO: renamed from: kk */
    private String f31019kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f31020m9;

    /* JADX INFO: renamed from: to */
    private int f31021to;

    /* JADX INFO: renamed from: x1 */
    private String f31022x1;

    public C8916u3() {
        m42066dy();
    }

    /* JADX INFO: renamed from: dy */
    private void m42066dy() {
        this.f31018k4 = 0.0d;
        this.f31022x1 = "none";
        this.f31021to = 0;
        this.f31015du = false;
        this.f31017h4 = false;
        this.f31020m9 = false;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m42077du() {
        return this.f31020m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final C9147ww m42078h4() {
        return this.f31016dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m42079k4() {
        return this.f31018k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m42080kk() {
        return this.f31021to;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m42081to() {
        return this.f31015du;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m42082x1() {
        return this.f31022x1;
    }

    public C8916u3(final AbstractC13912i5 abstractC13912i5) {
        m42066dy();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.u3.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (C8916u3.f31013jd.m27428k4(str)) {
                    case 0:
                        C8916u3.this.f31018k4 = AbstractC7361bz.m29300yj(str2);
                        break;
                    case 1:
                        C8916u3.this.f31022x1 = str2;
                        break;
                    case 2:
                        C8916u3.this.f31019kk = str2;
                        break;
                    case 3:
                        C8916u3.this.f31021to = C13850af.m65151yj(str2);
                        break;
                    case 4:
                        C8916u3.this.f31015du = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        C8916u3.this.f31017h4 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        C8916u3.this.f31020m9 = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.u3.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8916u3.f31013jd.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 7) {
                    C8916u3.this.f31016dy = new C9147ww(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 8) {
                    return false;
                }
                C8916u3.this.f31014c5 = new C8397nz(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        double d = this.f31018k4;
        if (d != 0.0d) {
            c3059ii.m12955x1("rot", C13850af.m65101k4(d));
        }
        if (!"none".equals(this.f31022x1)) {
            c3059ii.m12955x1(C18437z2.f56754h, this.f31022x1);
        }
        if (this.f31019kk != null) {
            if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
                c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
            }
            c3059ii.m12955x1("r:blip", this.f31019kk);
        }
        int i = this.f31021to;
        if (i != 0) {
            c3059ii.m12955x1("zOrderOff", C13850af.m65103k4(i));
        }
        boolean z = this.f31015du;
        if (z) {
            c3059ii.m12955x1("hideGeom", z ? "1" : "0");
        }
        boolean z2 = this.f31017h4;
        if (z2) {
            c3059ii.m12955x1("lkTxEntry", z2 ? "1" : "0");
        }
        boolean z3 = this.f31020m9;
        if (z3) {
            c3059ii.m12955x1("blipPhldr", z3 ? "1" : "0");
        }
        C9147ww c9147ww = this.f31016dy;
        if (c9147ww != null) {
            c9147ww.mo6846k4("dgm", c3059ii, "adjLst");
        }
        C8397nz c8397nz = this.f31014c5;
        if (c8397nz != null) {
            c8397nz.mo6846k4("dgm", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
