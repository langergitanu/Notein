package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.l0 */
/* JADX INFO: loaded from: classes4.dex */
public class C8150l0 extends AbstractC7361bz {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f26030dy = new C7017h4("rot", "flipH", "flipV", "off", "ext", "chOff", "chExt");

    /* JADX INFO: renamed from: du */
    private C7258al f26031du;

    /* JADX INFO: renamed from: h4 */
    private C9391zp f26032h4;

    /* JADX INFO: renamed from: k4 */
    private float f26033k4;

    /* JADX INFO: renamed from: kk */
    private boolean f26034kk;

    /* JADX INFO: renamed from: m9 */
    private C7258al f26035m9;

    /* JADX INFO: renamed from: to */
    private C9391zp f26036to;

    /* JADX INFO: renamed from: x1 */
    private boolean f26037x1;

    public C8150l0() {
        m35792up();
    }

    /* JADX INFO: renamed from: up */
    private void m35792up() {
        this.f26033k4 = 0.0f;
        this.f26037x1 = false;
        this.f26034kk = false;
    }

    /* JADX INFO: renamed from: c5 */
    public final C7258al m35796c5() {
        return this.f26031du;
    }

    /* JADX INFO: renamed from: ck */
    public final C7258al m35797ck() {
        return this.f26035m9;
    }

    /* JADX INFO: renamed from: du */
    public final float m35798du() {
        return this.f26033k4;
    }

    /* JADX INFO: renamed from: dy */
    public final C9391zp m35799dy() {
        return this.f26036to;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m35800h4() {
        return this.f26037x1;
    }

    /* JADX INFO: renamed from: jd */
    public final C9391zp m35801jd() {
        return this.f26032h4;
    }

    /* JADX INFO: renamed from: kk */
    public final C9391zp m35805kk() {
        if (this.f26032h4 != null) {
            throw new Exception("Only one <chOff> element can be added.");
        }
        C9391zp c9391zp = new C9391zp();
        this.f26032h4 = c9391zp;
        return c9391zp;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m35806m9() {
        return this.f26034kk;
    }

    /* JADX INFO: renamed from: to */
    public final C7258al m35807to() {
        if (this.f26035m9 != null) {
            throw new Exception("Only one <chExt> element can be added.");
        }
        C7258al c7258al = new C7258al();
        this.f26035m9 = c7258al;
        return c7258al;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7258al m35808x1() {
        if (this.f26031du != null) {
            throw new Exception("Only one <ext> element can be added.");
        }
        C7258al c7258al = new C7258al();
        this.f26031du = c7258al;
        return c7258al;
    }

    public C8150l0(final AbstractC13912i5 abstractC13912i5) {
        m35792up();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.l0.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8150l0.f26030dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8150l0.this.f26033k4 = C13850af.m65151yj(str2) / 60000.0f;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C8150l0.this.f26037x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C8150l0.this.f26034kk = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.l0.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8150l0.f26030dy.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 3) {
                    C8150l0.this.f26036to = new C9391zp(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 4) {
                    C8150l0.this.f26031du = new C7258al(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 5) {
                    C8150l0.this.f26032h4 = new C9391zp(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 6) {
                    return false;
                }
                C8150l0.this.f26035m9 = new C7258al(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C9391zp m35802k4() {
        if (this.f26036to != null) {
            throw new Exception("Only one <off> element can be added.");
        }
        C9391zp c9391zp = new C9391zp();
        this.f26036to = c9391zp;
        return c9391zp;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m35809x1(boolean z) {
        this.f26034kk = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35803k4(float f) {
        this.f26033k4 = f;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        if (this.f26033k4 != 0.0f) {
            OooO00o.OooO00o(r3 * 60000.0f, 14, c3059ii, "rot");
        }
        boolean z = this.f26037x1;
        if (z) {
            c3059ii.m12955x1("flipH", z ? "1" : "0");
        }
        boolean z2 = this.f26034kk;
        if (z2) {
            c3059ii.m12955x1("flipV", z2 ? "1" : "0");
        }
        C9391zp c9391zp = this.f26036to;
        if (c9391zp != null) {
            c9391zp.mo6846k4("a", c3059ii, "off");
        }
        C7258al c7258al = this.f26031du;
        if (c7258al != null) {
            c7258al.mo6846k4("a", c3059ii, "ext");
        }
        C9391zp c9391zp2 = this.f26032h4;
        if (c9391zp2 != null) {
            c9391zp2.mo6846k4("a", c3059ii, "chOff");
        }
        C7258al c7258al2 = this.f26035m9;
        if (c7258al2 != null) {
            c7258al2.mo6846k4("a", c3059ii, "chExt");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35804k4(boolean z) {
        this.f26037x1 = z;
    }
}
