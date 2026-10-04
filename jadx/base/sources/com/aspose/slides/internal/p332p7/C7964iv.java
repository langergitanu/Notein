package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.iv */
/* JADX INFO: loaded from: classes4.dex */
public class C7964iv extends AbstractC7361bz {

    /* JADX INFO: renamed from: dy */
    private static final C7017h4 f24952dy = new C7017h4("noGrp", "noDrilldown", "noSelect", "noChangeAspect", "noMove", "noResize", "extLst");

    /* JADX INFO: renamed from: du */
    private boolean f24953du;

    /* JADX INFO: renamed from: h4 */
    private boolean f24954h4;

    /* JADX INFO: renamed from: k4 */
    private boolean f24955k4;

    /* JADX INFO: renamed from: kk */
    private boolean f24956kk;

    /* JADX INFO: renamed from: m9 */
    private C8397nz f24957m9;

    /* JADX INFO: renamed from: to */
    private boolean f24958to;

    /* JADX INFO: renamed from: x1 */
    private boolean f24959x1;

    public C7964iv() {
        m34473c5();
    }

    /* JADX INFO: renamed from: c5 */
    private void m34473c5() {
        this.f24955k4 = false;
        this.f24959x1 = false;
        this.f24956kk = false;
        this.f24958to = false;
        this.f24953du = false;
        this.f24954h4 = false;
    }

    /* JADX INFO: renamed from: du */
    public final void m34482du(boolean z) {
        this.f24953du = z;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m34484h4(boolean z) {
        this.f24954h4 = z;
    }

    /* JADX INFO: renamed from: kk */
    public final void m34489kk(boolean z) {
        this.f24956kk = z;
    }

    /* JADX INFO: renamed from: m9 */
    public final AbstractC7414ck m34491m9() {
        return this.f24957m9;
    }

    /* JADX INFO: renamed from: to */
    public final void m34492to(boolean z) {
        this.f24958to = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m34494x1(boolean z) {
        this.f24959x1 = z;
    }

    public C7964iv(final AbstractC13912i5 abstractC13912i5) {
        m34473c5();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.iv.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7964iv.f24952dy.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7964iv.this.f24955k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    C7964iv.this.f24959x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    C7964iv.this.f24956kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 3) {
                    C7964iv.this.f24958to = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 4) {
                    C7964iv.this.f24953du = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                C7964iv.this.f24954h4 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.iv.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7964iv.f24952dy.m27428k4(abstractC13912i5.mo65023fa()) != 6) {
                    return false;
                }
                C7964iv.this.f24957m9 = new C8397nz(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: du */
    public final boolean m34483du() {
        return this.f24953du;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m34485h4() {
        return this.f24954h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34486k4(AbstractC7414ck abstractC7414ck) {
        this.f24957m9 = (C8397nz) abstractC7414ck;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m34490kk() {
        return this.f24956kk;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m34493to() {
        return this.f24958to;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m34495x1() {
        return this.f24959x1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, "a".equals(c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main")) ? null : "http://schemas.openxmlformats.org/drawingml/2006/main");
        boolean z = this.f24955k4;
        if (z) {
            c3059ii.m12955x1("noGrp", z ? "1" : "0");
        }
        boolean z2 = this.f24959x1;
        if (z2) {
            c3059ii.m12955x1("noDrilldown", z2 ? "1" : "0");
        }
        boolean z3 = this.f24956kk;
        if (z3) {
            c3059ii.m12955x1("noSelect", z3 ? "1" : "0");
        }
        boolean z4 = this.f24958to;
        if (z4) {
            c3059ii.m12955x1("noChangeAspect", z4 ? "1" : "0");
        }
        boolean z5 = this.f24953du;
        if (z5) {
            c3059ii.m12955x1("noMove", z5 ? "1" : "0");
        }
        boolean z6 = this.f24954h4;
        if (z6) {
            c3059ii.m12955x1("noResize", z6 ? "1" : "0");
        }
        C8397nz c8397nz = this.f24957m9;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m34487k4(boolean z) {
        this.f24955k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m34488k4() {
        return this.f24955k4;
    }
}
