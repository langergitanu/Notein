package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ve */
/* JADX INFO: loaded from: classes4.dex */
public class C9030ve extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f31786h4 = new C7017h4("rot", "flipH", "flipV", "off", "ext");

    /* JADX INFO: renamed from: du */
    private C7258al f31787du;

    /* JADX INFO: renamed from: k4 */
    private float f31788k4;

    /* JADX INFO: renamed from: kk */
    private boolean f31789kk;

    /* JADX INFO: renamed from: to */
    private C9391zp f31790to;

    /* JADX INFO: renamed from: x1 */
    private boolean f31791x1;

    public C9030ve() {
        m42991c5();
    }

    /* JADX INFO: renamed from: c5 */
    private void m42991c5() {
        this.f31788k4 = 0.0f;
        this.f31791x1 = false;
        this.f31789kk = false;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m42998du() {
        return this.f31789kk;
    }

    /* JADX INFO: renamed from: h4 */
    public final C9391zp m42999h4() {
        return this.f31790to;
    }

    /* JADX INFO: renamed from: kk */
    public final float m43003kk() {
        return this.f31788k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final C7258al m43004m9() {
        return this.f31787du;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m43005to() {
        return this.f31791x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7258al m43006x1() {
        if (this.f31787du != null) {
            throw new Exception("Only one <ext> element can be added.");
        }
        C7258al c7258al = new C7258al();
        this.f31787du = c7258al;
        return c7258al;
    }

    public C9030ve(final AbstractC13912i5 abstractC13912i5) {
        m42991c5();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ve.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C9030ve.f31786h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    C9030ve.this.f31788k4 = C13850af.m65151yj(str2) / 60000.0f;
                    return true;
                }
                if (iM27428k4 == 1) {
                    C9030ve.this.f31791x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C9030ve.this.f31789kk = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ve.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C9030ve.f31786h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 3) {
                    C9030ve.this.f31790to = new C9391zp(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                C9030ve.this.f31787du = new C7258al(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final void m43007x1(boolean z) {
        this.f31789kk = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final C9391zp m43000k4() {
        if (this.f31790to != null) {
            throw new Exception("Only one <off> element can be added.");
        }
        C9391zp c9391zp = new C9391zp();
        this.f31790to = c9391zp;
        return c9391zp;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43001k4(float f) {
        this.f31788k4 = f;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, "a".equals(c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main")) ? null : "http://schemas.openxmlformats.org/drawingml/2006/main");
        if (this.f31788k4 != 0.0f) {
            OooO00o.OooO00o(r4 * 60000.0f, 14, c3059ii, "rot");
        }
        boolean z = this.f31791x1;
        if (z) {
            c3059ii.m12955x1("flipH", z ? "1" : "0");
        }
        boolean z2 = this.f31789kk;
        if (z2) {
            c3059ii.m12955x1("flipV", z2 ? "1" : "0");
        }
        C9391zp c9391zp = this.f31790to;
        if (c9391zp != null) {
            c9391zp.mo6846k4("a", c3059ii, "off");
        }
        C7258al c7258al = this.f31787du;
        if (c7258al != null) {
            c7258al.mo6846k4("a", c3059ii, "ext");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43002k4(boolean z) {
        this.f31791x1 = z;
    }
}
