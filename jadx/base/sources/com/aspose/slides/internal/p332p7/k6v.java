package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class k6v extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f25472c5 = new C7017h4("loop", "showNarration", "showAnimation", "useTimings", "present", "browse", "kiosk", "sldAll", "sldRg", "custShow", "penClr", "extLst");

    /* JADX INFO: renamed from: du */
    private C7394ca f25473du;

    /* JADX INFO: renamed from: dy */
    private ltr f25474dy;

    /* JADX INFO: renamed from: h4 */
    private C7394ca f25475h4;

    /* JADX INFO: renamed from: k4 */
    private boolean f25476k4;

    /* JADX INFO: renamed from: kk */
    private boolean f25477kk;

    /* JADX INFO: renamed from: m9 */
    private C7447cx f25478m9;

    /* JADX INFO: renamed from: to */
    private boolean f25479to;

    /* JADX INFO: renamed from: x1 */
    private boolean f25480x1;

    public k6v() {
        m35135fa();
    }

    /* JADX INFO: renamed from: fa */
    private void m35135fa() {
        this.f25476k4 = false;
        this.f25480x1 = false;
        this.f25477kk = true;
        this.f25479to = true;
    }

    /* JADX INFO: renamed from: c5 */
    public final C7447cx m35144c5() {
        return this.f25478m9;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m35145du() {
        return this.f25477kk;
    }

    /* JADX INFO: renamed from: dy */
    public final C7394ca m35146dy() {
        return this.f25475h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m35147h4() {
        return this.f25479to;
    }

    /* JADX INFO: renamed from: jd */
    public final AbstractC7414ck m35148jd() {
        return this.f25474dy;
    }

    /* JADX INFO: renamed from: kk */
    public final void m35153kk(boolean z) {
        this.f25477kk = z;
    }

    /* JADX INFO: renamed from: m9 */
    public final C7394ca m35155m9() {
        return this.f25473du;
    }

    /* JADX INFO: renamed from: to */
    public final void m35156to(boolean z) {
        this.f25479to = z;
    }

    public k6v(final AbstractC13912i5 abstractC13912i5) {
        m35135fa();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.k6v.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = k6v.f25472c5.m27428k4(str);
                if (iM27428k4 == 0) {
                    k6v.this.f25476k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    k6v.this.f25480x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    k6v.this.f25477kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 3) {
                    return false;
                }
                k6v.this.f25479to = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.k6v.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                k6v k6vVar;
                C7394ca c7394ca;
                k6v k6vVar2;
                C7394ca c7394ca2;
                switch (k6v.f25472c5.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 4:
                        k6vVar = k6v.this;
                        c7394ca = new C7394ca("present", new qu9(abstractC13912i5));
                        k6vVar.f25473du = c7394ca;
                        return true;
                    case 5:
                        k6vVar = k6v.this;
                        c7394ca = new C7394ca("browse", new gz8(abstractC13912i5));
                        k6vVar.f25473du = c7394ca;
                        return true;
                    case 6:
                        k6vVar = k6v.this;
                        c7394ca = new C7394ca("kiosk", new wr8(abstractC13912i5));
                        k6vVar.f25473du = c7394ca;
                        return true;
                    case 7:
                        k6vVar2 = k6v.this;
                        c7394ca2 = new C7394ca("sldAll", new qu9(abstractC13912i5));
                        k6vVar2.f25475h4 = c7394ca2;
                        return true;
                    case 8:
                        k6vVar2 = k6v.this;
                        c7394ca2 = new C7394ca("sldRg", new a9h(abstractC13912i5));
                        k6vVar2.f25475h4 = c7394ca2;
                        return true;
                    case 9:
                        k6vVar2 = k6v.this;
                        c7394ca2 = new C7394ca("custShow", new nkv(abstractC13912i5));
                        k6vVar2.f25475h4 = c7394ca2;
                        return true;
                    case 10:
                        k6v.this.f25478m9 = new C7447cx(abstractC13912i5);
                        return true;
                    case 11:
                        k6v.this.f25474dy = new ltr(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7447cx m35149k4() {
        if (this.f25478m9 != null) {
            throw new Exception("Only one <penClr> element can be added.");
        }
        C7447cx c7447cx = new C7447cx();
        this.f25478m9 = c7447cx;
        return c7447cx;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m35154kk() {
        return this.f25476k4;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m35157to() {
        return this.f25480x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC7414ck m35158x1() {
        if (this.f25474dy != null) {
            throw new Exception("Only one <extLst> element can be added.");
        }
        ltr ltrVar = new ltr();
        this.f25474dy = ltrVar;
        return ltrVar;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m35159x1(C7394ca c7394ca) {
        this.f25475h4 = c7394ca;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m35160x1(boolean z) {
        this.f25480x1 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35150k4(C7394ca c7394ca) {
        this.f25473du = c7394ca;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35151k4(C7447cx c7447cx) {
        this.f25478m9 = c7447cx;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        boolean z = this.f25476k4;
        if (z) {
            c3059ii.m12955x1("loop", z ? "1" : "0");
        }
        boolean z2 = this.f25480x1;
        if (z2) {
            c3059ii.m12955x1("showNarration", z2 ? "1" : "0");
        }
        boolean z3 = this.f25477kk;
        if (!z3) {
            c3059ii.m12955x1("showAnimation", z3 ? "1" : "0");
        }
        boolean z4 = this.f25479to;
        if (!z4) {
            c3059ii.m12955x1("useTimings", z4 ? "1" : "0");
        }
        C7394ca c7394ca = this.f25473du;
        if (c7394ca != null) {
            int iM27428k4 = f25472c5.m27428k4(c7394ca.m29539k4());
            if (iM27428k4 == 4) {
                ((qu9) this.f25473du.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f25473du.m29539k4());
            } else if (iM27428k4 == 5) {
                ((gz8) this.f25473du.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f25473du.m29539k4());
            } else if (iM27428k4 == 6) {
                ((wr8) this.f25473du.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f25473du.m29539k4());
            }
        }
        C7394ca c7394ca2 = this.f25475h4;
        if (c7394ca2 != null) {
            int iM27428k42 = f25472c5.m27428k4(c7394ca2.m29539k4());
            if (iM27428k42 == 7) {
                ((qu9) this.f25475h4.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f25475h4.m29539k4());
            } else if (iM27428k42 == 8) {
                ((a9h) this.f25475h4.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f25475h4.m29539k4());
            } else if (iM27428k42 == 9) {
                ((nkv) this.f25475h4.m29541kk()).mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, this.f25475h4.m29539k4());
            }
        }
        C7447cx c7447cx = this.f25478m9;
        if (c7447cx != null) {
            c7447cx.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "penClr");
        }
        ltr ltrVar = this.f25474dy;
        if (ltrVar != null) {
            ltrVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m35152k4(boolean z) {
        this.f25476k4 = z;
    }
}
