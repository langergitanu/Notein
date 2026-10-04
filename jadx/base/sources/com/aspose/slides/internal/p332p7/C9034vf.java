package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.vf */
/* JADX INFO: loaded from: classes4.dex */
public class C9034vf extends AbstractC7361bz {

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f31810fa = new C7017h4("noGrp", "noSelect", "noRot", "noChangeAspect", "noMove", "noResize", "noEditPoints", "noAdjustHandles", "noChangeArrowheads", "noChangeShapeType", "extLst");

    /* JADX INFO: renamed from: c5 */
    private boolean f31811c5;

    /* JADX INFO: renamed from: ck */
    private C8397nz f31812ck;

    /* JADX INFO: renamed from: du */
    private boolean f31813du;

    /* JADX INFO: renamed from: dy */
    private boolean f31814dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f31815h4;

    /* JADX INFO: renamed from: jd */
    private boolean f31816jd;

    /* JADX INFO: renamed from: k4 */
    private boolean f31817k4;

    /* JADX INFO: renamed from: kk */
    private boolean f31818kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f31819m9;

    /* JADX INFO: renamed from: to */
    private boolean f31820to;

    /* JADX INFO: renamed from: x1 */
    private boolean f31821x1;

    public C9034vf() {
        m43038up();
    }

    /* JADX INFO: renamed from: up */
    private void m43038up() {
        this.f31817k4 = false;
        this.f31821x1 = false;
        this.f31818kk = false;
        this.f31820to = false;
        this.f31813du = false;
        this.f31815h4 = false;
        this.f31819m9 = false;
        this.f31814dy = false;
        this.f31811c5 = false;
        this.f31816jd = false;
    }

    /* JADX INFO: renamed from: c5 */
    public final void m43040c5(boolean z) {
        this.f31811c5 = z;
    }

    /* JADX INFO: renamed from: ck */
    public final AbstractC7414ck m43042ck() {
        return this.f31812ck;
    }

    /* JADX INFO: renamed from: du */
    public final void m43043du(boolean z) {
        this.f31813du = z;
    }

    /* JADX INFO: renamed from: dy */
    public final void m43045dy(boolean z) {
        this.f31814dy = z;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m43047h4(boolean z) {
        this.f31815h4 = z;
    }

    /* JADX INFO: renamed from: jd */
    public final void m43049jd(boolean z) {
        this.f31816jd = z;
    }

    /* JADX INFO: renamed from: kk */
    public final void m43054kk(boolean z) {
        this.f31818kk = z;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m43056m9(boolean z) {
        this.f31819m9 = z;
    }

    /* JADX INFO: renamed from: to */
    public final void m43058to(boolean z) {
        this.f31820to = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m43060x1(boolean z) {
        this.f31821x1 = z;
    }

    public C9034vf(final AbstractC13912i5 abstractC13912i5) {
        m43038up();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.vf.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (C9034vf.f31810fa.m27428k4(str)) {
                    case 0:
                        C9034vf.this.f31817k4 = C13850af.m65068c5(str2);
                        break;
                    case 1:
                        C9034vf.this.f31821x1 = C13850af.m65068c5(str2);
                        break;
                    case 2:
                        C9034vf.this.f31818kk = C13850af.m65068c5(str2);
                        break;
                    case 3:
                        C9034vf.this.f31820to = C13850af.m65068c5(str2);
                        break;
                    case 4:
                        C9034vf.this.f31813du = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        C9034vf.this.f31815h4 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        C9034vf.this.f31819m9 = C13850af.m65068c5(str2);
                        break;
                    case 7:
                        C9034vf.this.f31814dy = C13850af.m65068c5(str2);
                        break;
                    case 8:
                        C9034vf.this.f31811c5 = C13850af.m65068c5(str2);
                        break;
                    case 9:
                        C9034vf.this.f31816jd = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.vf.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C9034vf.f31810fa.m27428k4(abstractC13912i5.mo65023fa()) != 10) {
                    return false;
                }
                C9034vf.this.f31812ck = new C8397nz(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m43041c5() {
        return this.f31811c5;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m43044du() {
        return this.f31813du;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m43046dy() {
        return this.f31814dy;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m43048h4() {
        return this.f31815h4;
    }

    /* JADX INFO: renamed from: jd */
    public final boolean m43050jd() {
        return this.f31816jd;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43051k4(AbstractC7414ck abstractC7414ck) {
        this.f31812ck = (C8397nz) abstractC7414ck;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m43055kk() {
        return this.f31818kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m43057m9() {
        return this.f31819m9;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m43059to() {
        return this.f31820to;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m43061x1() {
        return this.f31821x1;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f31817k4;
        if (z) {
            c3059ii.m12955x1("noGrp", z ? "1" : "0");
        }
        boolean z2 = this.f31821x1;
        if (z2) {
            c3059ii.m12955x1("noSelect", z2 ? "1" : "0");
        }
        boolean z3 = this.f31818kk;
        if (z3) {
            c3059ii.m12955x1("noRot", z3 ? "1" : "0");
        }
        boolean z4 = this.f31820to;
        if (z4) {
            c3059ii.m12955x1("noChangeAspect", z4 ? "1" : "0");
        }
        boolean z5 = this.f31813du;
        if (z5) {
            c3059ii.m12955x1("noMove", z5 ? "1" : "0");
        }
        boolean z6 = this.f31815h4;
        if (z6) {
            c3059ii.m12955x1("noResize", z6 ? "1" : "0");
        }
        boolean z7 = this.f31819m9;
        if (z7) {
            c3059ii.m12955x1("noEditPoints", z7 ? "1" : "0");
        }
        boolean z8 = this.f31814dy;
        if (z8) {
            c3059ii.m12955x1("noAdjustHandles", z8 ? "1" : "0");
        }
        boolean z9 = this.f31811c5;
        if (z9) {
            c3059ii.m12955x1("noChangeArrowheads", z9 ? "1" : "0");
        }
        boolean z10 = this.f31816jd;
        if (z10) {
            c3059ii.m12955x1("noChangeShapeType", z10 ? "1" : "0");
        }
        C8397nz c8397nz = this.f31812ck;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m43052k4(boolean z) {
        this.f31817k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m43053k4() {
        return this.f31817k4;
    }
}
