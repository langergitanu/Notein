package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.bb */
/* JADX INFO: loaded from: classes4.dex */
public class C7311bb extends AbstractC7361bz {

    /* JADX INFO: renamed from: fa */
    private static final C7017h4 f20477fa = new C7017h4("rtl", "firstRow", "firstCol", "lastRow", "lastCol", "bandRow", "bandCol", "noFill", "solidFill", "gradFill", "blipFill", "pattFill", "grpFill", "effectLst", "effectDag", "tableStyle", "tableStyleId", "extLst");

    /* JADX INFO: renamed from: c5 */
    private C7394ca f20478c5;

    /* JADX INFO: renamed from: ck */
    private C8397nz f20479ck;

    /* JADX INFO: renamed from: du */
    private boolean f20480du;

    /* JADX INFO: renamed from: dy */
    private C7394ca f20481dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f20482h4;

    /* JADX INFO: renamed from: jd */
    private C7394ca f20483jd;

    /* JADX INFO: renamed from: k4 */
    private boolean f20484k4;

    /* JADX INFO: renamed from: kk */
    private boolean f20485kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f20486m9;

    /* JADX INFO: renamed from: to */
    private boolean f20487to;

    /* JADX INFO: renamed from: x1 */
    private boolean f20488x1;

    public C7311bb() {
        m28781up();
    }

    /* JADX INFO: renamed from: up */
    private void m28781up() {
        this.f20484k4 = false;
        this.f20488x1 = false;
        this.f20485kk = false;
        this.f20487to = false;
        this.f20480du = false;
        this.f20482h4 = false;
        this.f20486m9 = false;
    }

    /* JADX INFO: renamed from: c5 */
    public final C7394ca m28784c5() {
        return this.f20478c5;
    }

    /* JADX INFO: renamed from: ck */
    public final AbstractC7414ck m28785ck() {
        return this.f20479ck;
    }

    /* JADX INFO: renamed from: du */
    public final void m28786du(boolean z) {
        this.f20480du = z;
    }

    /* JADX INFO: renamed from: dy */
    public final C7394ca m28788dy() {
        return this.f20481dy;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m28789h4(boolean z) {
        this.f20482h4 = z;
    }

    /* JADX INFO: renamed from: jd */
    public final C7394ca m28791jd() {
        return this.f20483jd;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m28800m9(boolean z) {
        this.f20486m9 = z;
    }

    /* JADX INFO: renamed from: to */
    public final void m28802to(boolean z) {
        this.f20487to = z;
    }

    public C7311bb(final AbstractC13912i5 abstractC13912i5) {
        m28781up();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.bb.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                switch (C7311bb.f20477fa.m27428k4(str)) {
                    case 0:
                        C7311bb.this.f20484k4 = C13850af.m65068c5(str2);
                        break;
                    case 1:
                        C7311bb.this.f20488x1 = C13850af.m65068c5(str2);
                        break;
                    case 2:
                        C7311bb.this.f20485kk = C13850af.m65068c5(str2);
                        break;
                    case 3:
                        C7311bb.this.f20487to = C13850af.m65068c5(str2);
                        break;
                    case 4:
                        C7311bb.this.f20480du = C13850af.m65068c5(str2);
                        break;
                    case 5:
                        C7311bb.this.f20482h4 = C13850af.m65068c5(str2);
                        break;
                    case 6:
                        C7311bb.this.f20486m9 = C13850af.m65068c5(str2);
                        break;
                }
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.bb.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                C7311bb c7311bb;
                C7394ca c7394ca;
                C7311bb c7311bb2;
                C7394ca c7394ca2;
                C7311bb c7311bb3;
                C7394ca c7394ca3;
                switch (C7311bb.f20477fa.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 7:
                        c7311bb = C7311bb.this;
                        c7394ca = new C7394ca("noFill", new C8130kt(abstractC13912i5));
                        c7311bb.f20481dy = c7394ca;
                        return true;
                    case 8:
                        c7311bb = C7311bb.this;
                        c7394ca = new C7394ca("solidFill", new C8256md(abstractC13912i5));
                        c7311bb.f20481dy = c7394ca;
                        return true;
                    case 9:
                        c7311bb = C7311bb.this;
                        c7394ca = new C7394ca("gradFill", new C8403o4(abstractC13912i5));
                        c7311bb.f20481dy = c7394ca;
                        return true;
                    case 10:
                        c7311bb = C7311bb.this;
                        c7394ca = new C7394ca("blipFill", new C9220xo(abstractC13912i5));
                        c7311bb.f20481dy = c7394ca;
                        return true;
                    case 11:
                        c7311bb = C7311bb.this;
                        c7394ca = new C7394ca("pattFill", new C7416cl(abstractC13912i5));
                        c7311bb.f20481dy = c7394ca;
                        return true;
                    case 12:
                        c7311bb = C7311bb.this;
                        c7394ca = new C7394ca("grpFill", new C9112wh(abstractC13912i5));
                        c7311bb.f20481dy = c7394ca;
                        return true;
                    case 13:
                        c7311bb2 = C7311bb.this;
                        c7394ca2 = new C7394ca("effectLst", new C8490p3(abstractC13912i5));
                        c7311bb2.f20478c5 = c7394ca2;
                        return true;
                    case 14:
                        c7311bb2 = C7311bb.this;
                        c7394ca2 = new C7394ca("effectDag", new C9295yl(abstractC13912i5));
                        c7311bb2.f20478c5 = c7394ca2;
                        return true;
                    case 15:
                        c7311bb3 = C7311bb.this;
                        c7394ca3 = new C7394ca("tableStyle", new C7565ef(abstractC13912i5));
                        c7311bb3.f20483jd = c7394ca3;
                        return true;
                    case 16:
                        abstractC13912i5.mo65026h4();
                        c7311bb3 = C7311bb.this;
                        c7394ca3 = new C7394ca("tableStyleId", new C14047bz(abstractC13912i5.mo65042rv()));
                        c7311bb3.f20483jd = c7394ca3;
                        return true;
                    case 17:
                        C7311bb.this.f20479ck = new C8397nz(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: du */
    public final boolean m28787du() {
        return this.f20480du;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m28790h4() {
        return this.f20482h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m28792k4(String str) {
        C7394ca c7394ca;
        if (this.f20478c5 != null) {
            throw new Exception("EffectProperties already is initialized.");
        }
        int iM27428k4 = f20477fa.m27428k4(str);
        if (iM27428k4 == 13) {
            c7394ca = new C7394ca("effectLst", new C8490p3());
        } else {
            if (iM27428k4 != 14) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("effectDag", new C9295yl());
        }
        this.f20478c5 = c7394ca;
        return this.f20478c5;
    }

    /* JADX INFO: renamed from: kk */
    public final C7394ca m28797kk(String str) {
        C7394ca c7394ca;
        if (this.f20483jd != null) {
            throw new Exception("TableStyle already is initialized.");
        }
        int iM27428k4 = f20477fa.m27428k4(str);
        if (iM27428k4 == 15) {
            c7394ca = new C7394ca("tableStyle", new C7565ef());
        } else {
            if (iM27428k4 != 16) {
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
            }
            c7394ca = new C7394ca("tableStyleId", new C14047bz());
        }
        this.f20483jd = c7394ca;
        return this.f20483jd;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m28801m9() {
        return this.f20486m9;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m28803to() {
        return this.f20487to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7394ca m28804x1(String str) {
        C7394ca c7394ca;
        if (this.f20481dy != null) {
            throw new Exception("FillProperties already is initialized.");
        }
        switch (f20477fa.m27428k4(str)) {
            case 7:
                c7394ca = new C7394ca("noFill", new C8130kt());
                break;
            case 8:
                c7394ca = new C7394ca("solidFill", new C8256md());
                break;
            case 9:
                c7394ca = new C7394ca("gradFill", new C8403o4());
                break;
            case 10:
                c7394ca = new C7394ca("blipFill", new C9220xo());
                break;
            case 11:
                c7394ca = new C7394ca("pattFill", new C7416cl());
                break;
            case 12:
                c7394ca = new C7394ca("grpFill", new C9112wh());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f20481dy = c7394ca;
        return this.f20481dy;
    }

    /* JADX INFO: renamed from: kk */
    public final void m28798kk(boolean z) {
        this.f20485kk = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m28805x1(boolean z) {
        this.f20488x1 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m28793k4(C7394ca c7394ca) {
        this.f20483jd = c7394ca;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m28799kk() {
        return this.f20485kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m28806x1() {
        return this.f20488x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m28794k4(AbstractC7414ck abstractC7414ck) {
        this.f20479ck = (C8397nz) abstractC7414ck;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0137  */
    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        C7311bb c7311bb;
        C3059ii c3059ii2;
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f20484k4;
        if (z) {
            c3059ii.m12955x1("rtl", z ? "1" : "0");
        }
        boolean z2 = this.f20488x1;
        if (z2) {
            c3059ii.m12955x1("firstRow", z2 ? "1" : "0");
        }
        boolean z3 = this.f20485kk;
        if (z3) {
            c3059ii.m12955x1("firstCol", z3 ? "1" : "0");
        }
        boolean z4 = this.f20487to;
        if (z4) {
            c3059ii.m12955x1("lastRow", z4 ? "1" : "0");
        }
        boolean z5 = this.f20480du;
        if (z5) {
            c3059ii.m12955x1("lastCol", z5 ? "1" : "0");
        }
        boolean z6 = this.f20482h4;
        if (z6) {
            c3059ii.m12955x1("bandRow", z6 ? "1" : "0");
        }
        boolean z7 = this.f20486m9;
        if (z7) {
            c3059ii.m12955x1("bandCol", z7 ? "1" : "0");
        }
        C7394ca c7394ca = this.f20481dy;
        if (c7394ca != null) {
            switch (f20477fa.m27428k4(c7394ca.m29539k4())) {
                case 7:
                    ((C8130kt) this.f20481dy.m29541kk()).mo6846k4("a", c3059ii, this.f20481dy.m29539k4());
                    break;
                case 8:
                    ((C8256md) this.f20481dy.m29541kk()).mo6846k4("a", c3059ii, this.f20481dy.m29539k4());
                    break;
                case 9:
                    ((C8403o4) this.f20481dy.m29541kk()).mo6846k4("a", c3059ii, this.f20481dy.m29539k4());
                    break;
                case 10:
                    ((C9220xo) this.f20481dy.m29541kk()).mo6846k4("a", c3059ii, this.f20481dy.m29539k4());
                    break;
                case 11:
                    ((C7416cl) this.f20481dy.m29541kk()).mo6846k4("a", c3059ii, this.f20481dy.m29539k4());
                    break;
                case 12:
                    ((C9112wh) this.f20481dy.m29541kk()).mo6846k4("a", c3059ii, this.f20481dy.m29539k4());
                    break;
            }
        }
        C7394ca c7394ca2 = this.f20478c5;
        if (c7394ca2 != null) {
            int iM27428k4 = f20477fa.m27428k4(c7394ca2.m29539k4());
            if (iM27428k4 == 13) {
                ((C8490p3) this.f20478c5.m29541kk()).mo6846k4("a", c3059ii, this.f20478c5.m29539k4());
            } else if (iM27428k4 == 14) {
                ((C9295yl) this.f20478c5.m29541kk()).mo6846k4("a", c3059ii, this.f20478c5.m29539k4());
            }
        }
        C7394ca c7394ca3 = this.f20483jd;
        if (c7394ca3 == null) {
            c7311bb = this;
            c3059ii2 = c3059ii;
        } else {
            int iM27428k42 = f20477fa.m27428k4(c7394ca3.m29539k4());
            if (iM27428k42 == 15) {
                c7311bb = this;
                c3059ii2 = c3059ii;
                ((C7565ef) c7311bb.f20483jd.m29541kk()).mo6846k4("a", c3059ii2, c7311bb.f20483jd.m29539k4());
            } else if (iM27428k42 == 16) {
                c7311bb = this;
                c3059ii2 = c3059ii;
                c7311bb.m29301k4("a", c3059ii2, "tableStyleId", C14113y2.m67408k4("{", OooOO0.OooO00o((C14047bz) C7019kk.m27464to(this.f20483jd.m29541kk(), C14047bz.class)), "}"), false);
            }
        }
        C8397nz c8397nz = c7311bb.f20479ck;
        if (c8397nz != null) {
            c8397nz.mo6846k4("a", c3059ii2, "extLst");
        }
        c3059ii2.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m28795k4(boolean z) {
        this.f20484k4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m28796k4() {
        return this.f20484k4;
    }
}
