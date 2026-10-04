package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.qy */
/* JADX INFO: loaded from: classes4.dex */
public class C8638qy extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private C7447cx f29074c5;

    /* JADX INFO: renamed from: du */
    private int f29075du;

    /* JADX INFO: renamed from: dy */
    private C7447cx f29076dy;

    /* JADX INFO: renamed from: h4 */
    private C8491p4 f29077h4;

    /* JADX INFO: renamed from: jd */
    private C8397nz f29078jd;

    /* JADX INFO: renamed from: kk */
    private double f29079kk;

    /* JADX INFO: renamed from: m9 */
    private C8491p4 f29080m9;

    /* JADX INFO: renamed from: to */
    private double f29081to;

    /* JADX INFO: renamed from: x1 */
    private double f29082x1;

    /* JADX INFO: renamed from: k4 */
    public static final int f29073k4 = C7490dl.m30396k4("warmMatte");

    /* JADX INFO: renamed from: ck */
    private static final C7017h4 f29072ck = new C7017h4("z", "extrusionH", "contourW", "prstMaterial", "bevelT", "bevelB", "extrusionClr", "contourClr", "extLst");

    public C8638qy() {
        m39748yj();
    }

    /* JADX INFO: renamed from: yj */
    private void m39748yj() {
        this.f29082x1 = 0.0d;
        this.f29079kk = 0.0d;
        this.f29081to = 0.0d;
        this.f29075du = f29073k4;
    }

    /* JADX INFO: renamed from: c5 */
    public final C8491p4 m39749c5() {
        return this.f29077h4;
    }

    /* JADX INFO: renamed from: ck */
    public final C7447cx m39750ck() {
        return this.f29076dy;
    }

    /* JADX INFO: renamed from: du */
    public final double m39751du() {
        return this.f29082x1;
    }

    /* JADX INFO: renamed from: dy */
    public final int m39752dy() {
        return this.f29075du;
    }

    /* JADX INFO: renamed from: fa */
    public final C7447cx m39753fa() {
        return this.f29074c5;
    }

    /* JADX INFO: renamed from: h4 */
    public final double m39754h4() {
        return this.f29079kk;
    }

    /* JADX INFO: renamed from: jd */
    public final C8491p4 m39755jd() {
        return this.f29080m9;
    }

    /* JADX INFO: renamed from: m9 */
    public final double m39761m9() {
        return this.f29081to;
    }

    /* JADX INFO: renamed from: to */
    public final C7447cx m39762to() {
        if (this.f29074c5 != null) {
            throw new Exception("Only one <contourClr> element can be added.");
        }
        C7447cx c7447cx = new C7447cx();
        this.f29074c5 = c7447cx;
        return c7447cx;
    }

    public C8638qy(final AbstractC13912i5 abstractC13912i5) {
        m39748yj();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.qy.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8638qy.f29072ck.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8638qy.this.f29082x1 = C13850af.m65132uz(str2) / 12700.0d;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C8638qy.this.f29079kk = C13850af.m65132uz(str2) / 12700.0d;
                    return true;
                }
                if (iM27428k4 == 2) {
                    C8638qy.this.f29081to = C13850af.m65132uz(str2) / 12700.0d;
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                C8638qy.this.f29075du = C7490dl.m30396k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.qy.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (C8638qy.f29072ck.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 4:
                        C8638qy.this.f29077h4 = new C8491p4(abstractC13912i5);
                        return true;
                    case 5:
                        C8638qy.this.f29080m9 = new C8491p4(abstractC13912i5);
                        return true;
                    case 6:
                        C8638qy.this.f29076dy = new C7447cx(abstractC13912i5);
                        return true;
                    case 7:
                        C8638qy.this.f29074c5 = new C7447cx(abstractC13912i5);
                        return true;
                    case 8:
                        C8638qy.this.f29078jd = new C8397nz(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: kk */
    public final C7447cx m39759kk() {
        if (this.f29076dy != null) {
            throw new Exception("Only one <extrusionClr> element can be added.");
        }
        C7447cx c7447cx = new C7447cx();
        this.f29076dy = c7447cx;
        return c7447cx;
    }

    /* JADX INFO: renamed from: kk */
    public final void m39760kk(double d) {
        this.f29081to = d;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8491p4 m39763x1() {
        if (this.f29080m9 != null) {
            throw new Exception("Only one <bevelB> element can be added.");
        }
        C8491p4 c8491p4 = new C8491p4();
        this.f29080m9 = c8491p4;
        return c8491p4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C8491p4 m39756k4() {
        if (this.f29077h4 != null) {
            throw new Exception("Only one <bevelT> element can be added.");
        }
        C8491p4 c8491p4 = new C8491p4();
        this.f29077h4 = c8491p4;
        return c8491p4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m39764x1(double d) {
        this.f29079kk = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39757k4(double d) {
        this.f29082x1 = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m39758k4(int i) {
        this.f29075du = i;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, "a".equals(c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main")) ? null : "http://schemas.openxmlformats.org/drawingml/2006/main");
        double d = this.f29082x1;
        if (d != 0.0d) {
            c3059ii.m12955x1("z", C22238OooO0oO.OooO00o(d, 12700.0d, 14));
        }
        double d2 = this.f29079kk;
        if (d2 != 0.0d) {
            c3059ii.m12955x1("extrusionH", C22238OooO0oO.OooO00o(d2, 12700.0d, 14));
        }
        double d3 = this.f29081to;
        if (d3 != 0.0d) {
            c3059ii.m12955x1("contourW", C22238OooO0oO.OooO00o(d3, 12700.0d, 14));
        }
        int i = this.f29075du;
        if (i != f29073k4) {
            c3059ii.m12955x1("prstMaterial", C7490dl.m30397k4(i));
        }
        C8491p4 c8491p4 = this.f29077h4;
        if (c8491p4 != null) {
            c8491p4.mo6846k4("a", c3059ii, "bevelT");
        }
        C8491p4 c8491p42 = this.f29080m9;
        if (c8491p42 != null) {
            c8491p42.mo6846k4("a", c3059ii, "bevelB");
        }
        C7447cx c7447cx = this.f29076dy;
        if (c7447cx != null) {
            c7447cx.mo6846k4("a", c3059ii, "extrusionClr");
        }
        C7447cx c7447cx2 = this.f29074c5;
        if (c7447cx2 != null) {
            c7447cx2.mo6846k4("a", c3059ii, "contourClr");
        }
        C8397nz c8397nz = this.f29078jd;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
