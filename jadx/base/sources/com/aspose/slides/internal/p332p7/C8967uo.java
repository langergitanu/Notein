package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.uo */
/* JADX INFO: loaded from: classes4.dex */
public class C8967uo extends AbstractC7361bz {

    /* JADX INFO: renamed from: c5 */
    private static final C7017h4 f31367c5 = new C7017h4("showMasterSp", "showMasterPhAnim", "show", "cSld", "clrMapOvr", "transition", "timing", "extLst");

    /* JADX INFO: renamed from: du */
    private C7585en f31368du;

    /* JADX INFO: renamed from: dy */
    private dnu f31369dy;

    /* JADX INFO: renamed from: h4 */
    private C7821h4 f31370h4;

    /* JADX INFO: renamed from: k4 */
    private boolean f31371k4;

    /* JADX INFO: renamed from: kk */
    private boolean f31372kk;

    /* JADX INFO: renamed from: m9 */
    private ehe f31373m9;

    /* JADX INFO: renamed from: to */
    private jqo f31374to;

    /* JADX INFO: renamed from: x1 */
    private boolean f31375x1;

    public C8967uo() {
        m42501up();
        this.f31374to = new jqo();
    }

    /* JADX INFO: renamed from: up */
    private void m42501up() {
        this.f31371k4 = true;
        this.f31375x1 = true;
        this.f31372kk = true;
    }

    /* JADX INFO: renamed from: c5 */
    public final C7821h4 m42503c5() {
        return this.f31370h4;
    }

    /* JADX INFO: renamed from: ck */
    public final AbstractC7414ck m42504ck() {
        return this.f31369dy;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m42505du() {
        return this.f31375x1;
    }

    /* JADX INFO: renamed from: dy */
    public final C7585en m42506dy() {
        return this.f31368du;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m42507h4() {
        return this.f31372kk;
    }

    /* JADX INFO: renamed from: jd */
    public final ehe m42508jd() {
        return this.f31373m9;
    }

    /* JADX INFO: renamed from: kk */
    public final ehe m42512kk() {
        if (this.f31373m9 != null) {
            throw new Exception("Only one <timing> element can be added.");
        }
        ehe eheVar = new ehe();
        this.f31373m9 = eheVar;
        return eheVar;
    }

    /* JADX INFO: renamed from: m9 */
    public final jqo m42514m9() {
        return this.f31374to;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m42515to() {
        return this.f31371k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7821h4 m42516x1() {
        if (this.f31370h4 != null) {
            throw new Exception("Only one <transition> element can be added.");
        }
        C7821h4 c7821h4 = new C7821h4();
        this.f31370h4 = c7821h4;
        return c7821h4;
    }

    public C8967uo(final AbstractC13912i5 abstractC13912i5) {
        m42501up();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.uo.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8967uo.f31367c5.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8967uo.this.f31371k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    C8967uo.this.f31375x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 2) {
                    return false;
                }
                C8967uo.this.f31372kk = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.uo.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8967uo.f31367c5.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 3) {
                    C8967uo.this.f31374to = new jqo(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 4) {
                    C8967uo.this.f31368du = new C7585en(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 5) {
                    C8967uo.this.f31370h4 = new C7821h4(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 6) {
                    C8967uo.this.f31373m9 = new ehe(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 7) {
                    return false;
                }
                C8967uo.this.f31369dy = new dnu(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: kk */
    public final void m42513kk(boolean z) {
        this.f31372kk = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m42517x1(boolean z) {
        this.f31375x1 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7585en m42509k4() {
        if (this.f31368du != null) {
            throw new Exception("Only one <clrMapOvr> element can be added.");
        }
        C7585en c7585en = new C7585en();
        this.f31368du = c7585en;
        return c7585en;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m42510k4(AbstractC7414ck abstractC7414ck) {
        this.f31369dy = (dnu) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(ContextChain.TAG_PRODUCT, str2, "http://schemas.openxmlformats.org/presentationml/2006/main");
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
            c3059ii.m12954to("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/math") == null) {
            c3059ii.m12954to("xmlns", "m", null, "http://schemas.openxmlformats.org/officeDocument/2006/math");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/wordprocessingml/2006/main") == null) {
            c3059ii.m12954to("xmlns", "w", null, "http://schemas.openxmlformats.org/wordprocessingml/2006/main");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing") == null) {
            c3059ii.m12954to("xmlns", "wp", null, "http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing");
        }
        if (c3059ii.mo12952k4("http://schemas.microsoft.com/office/drawing/2010/main") == null) {
            c3059ii.m12954to("xmlns", "a14", null, "http://schemas.microsoft.com/office/drawing/2010/main");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/markup-compatibility/2006") == null) {
            c3059ii.m12954to("xmlns", "mc", null, "http://schemas.openxmlformats.org/markup-compatibility/2006");
        }
        if (c3059ii.mo12952k4("http://schemas.microsoft.com/office/powerpoint/2010/main") == null) {
            c3059ii.m12954to("xmlns", "p14", null, "http://schemas.microsoft.com/office/powerpoint/2010/main");
        }
        if (c3059ii.mo12952k4("http://schemas.microsoft.com/office/powerpoint/2012/main") == null) {
            c3059ii.m12954to("xmlns", "p15", null, "http://schemas.microsoft.com/office/powerpoint/2012/main");
        }
        if (c3059ii.mo12952k4("http://schemas.microsoft.com/office/powerpoint/2015/09/main") == null) {
            c3059ii.m12954to("xmlns", "p159", null, "http://schemas.microsoft.com/office/powerpoint/2015/09/main");
        }
        boolean z = this.f31371k4;
        if (!z) {
            c3059ii.m12955x1("showMasterSp", z ? "1" : "0");
        }
        boolean z2 = this.f31375x1;
        if (!z2) {
            c3059ii.m12955x1("showMasterPhAnim", z2 ? "1" : "0");
        }
        boolean z3 = this.f31372kk;
        if (!z3) {
            c3059ii.m12955x1("show", z3 ? "1" : "0");
        }
        this.f31374to.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cSld");
        C7585en c7585en = this.f31368du;
        if (c7585en != null) {
            c7585en.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "clrMapOvr");
        }
        C7821h4 c7821h4 = this.f31370h4;
        if (c7821h4 != null) {
            c7821h4.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "transition");
        }
        ehe eheVar = this.f31373m9;
        if (eheVar != null) {
            eheVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "timing");
        }
        dnu dnuVar = this.f31369dy;
        if (dnuVar != null) {
            dnuVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m42511k4(boolean z) {
        this.f31371k4 = z;
    }
}
