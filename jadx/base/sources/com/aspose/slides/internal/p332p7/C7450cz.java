package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.cz */
/* JADX INFO: loaded from: classes4.dex */
public class C7450cz extends AbstractC7361bz {

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f21369fa = new C7017h4("noGrp", "noSelect", "noRot", "noChangeAspect", "noMove", "noResize", "noEditPoints", "noAdjustHandles", "noChangeArrowheads", "noChangeShapeType", "extLst");

    /* JADX INFO: renamed from: c5 */
    private boolean f21370c5;

    /* JADX INFO: renamed from: ck */
    private C8397nz f21371ck;

    /* JADX INFO: renamed from: du */
    private boolean f21372du;

    /* JADX INFO: renamed from: dy */
    private boolean f21373dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f21374h4;

    /* JADX INFO: renamed from: jd */
    private boolean f21375jd;

    /* JADX INFO: renamed from: k4 */
    private boolean f21376k4;

    /* JADX INFO: renamed from: kk */
    private boolean f21377kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f21378m9;

    /* JADX INFO: renamed from: to */
    private boolean f21379to;

    /* JADX INFO: renamed from: x1 */
    private boolean f21380x1;

    public C7450cz() {
        m29987x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m29987x1() {
        this.f21376k4 = false;
        this.f21380x1 = false;
        this.f21377kk = false;
        this.f21379to = false;
        this.f21372du = false;
        this.f21374h4 = false;
        this.f21378m9 = false;
        this.f21373dy = false;
        this.f21370c5 = false;
        this.f21375jd = false;
    }

    public C7450cz(final AbstractC13912i5 abstractC13912i5) {
        m29987x1();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.cz.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (C7450cz.f21369fa.m27428k4(str)) {
                    case 0:
                        C7450cz.this.f21376k4 = C13850af.m65068c5(str2);
                        break;
                    case 1:
                        C7450cz.this.f21380x1 = C13850af.m65068c5(str2);
                        break;
                    case 2:
                        C7450cz.this.f21377kk = C13850af.m65068c5(str2);
                        break;
                    case 3:
                        C7450cz.this.f21379to = C13850af.m65068c5(str2);
                        break;
                    case 4:
                        C7450cz.this.f21372du = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        C7450cz.this.f21374h4 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        C7450cz.this.f21378m9 = C13850af.m65068c5(str2);
                        break;
                    case 7:
                        C7450cz.this.f21373dy = C13850af.m65068c5(str2);
                        break;
                    case 8:
                        C7450cz.this.f21370c5 = C13850af.m65068c5(str2);
                        break;
                    case 9:
                        C7450cz.this.f21375jd = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.cz.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                if (C7450cz.f21369fa.m27428k4(abstractC13912i5.mo65023fa()) != 10) {
                    return false;
                }
                C7450cz.this.f21371ck = new C8397nz(abstractC13912i5);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f21376k4;
        if (z) {
            c3059ii.m12955x1("noGrp", z ? "1" : "0");
        }
        boolean z2 = this.f21380x1;
        if (z2) {
            c3059ii.m12955x1("noSelect", z2 ? "1" : "0");
        }
        boolean z3 = this.f21377kk;
        if (z3) {
            c3059ii.m12955x1("noRot", z3 ? "1" : "0");
        }
        boolean z4 = this.f21379to;
        if (z4) {
            c3059ii.m12955x1("noChangeAspect", z4 ? "1" : "0");
        }
        boolean z5 = this.f21372du;
        if (z5) {
            c3059ii.m12955x1("noMove", z5 ? "1" : "0");
        }
        boolean z6 = this.f21374h4;
        if (z6) {
            c3059ii.m12955x1("noResize", z6 ? "1" : "0");
        }
        boolean z7 = this.f21378m9;
        if (z7) {
            c3059ii.m12955x1("noEditPoints", z7 ? "1" : "0");
        }
        boolean z8 = this.f21373dy;
        if (z8) {
            c3059ii.m12955x1("noAdjustHandles", z8 ? "1" : "0");
        }
        boolean z9 = this.f21370c5;
        if (z9) {
            c3059ii.m12955x1("noChangeArrowheads", z9 ? "1" : "0");
        }
        boolean z10 = this.f21375jd;
        if (z10) {
            c3059ii.m12955x1("noChangeShapeType", z10 ? "1" : "0");
        }
        C8397nz c8397nz = this.f21371ck;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a14", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
