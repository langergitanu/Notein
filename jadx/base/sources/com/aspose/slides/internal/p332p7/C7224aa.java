package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.aa */
/* JADX INFO: loaded from: classes4.dex */
public class C7224aa extends AbstractC7361bz {

    /* JADX INFO: renamed from: jd */
    private static final C7017h4 f19906jd = new C7017h4("preserve", "cSld", "clrMap", "sldLayoutIdLst", "transition", "timing", "hf", "txStyles", "extLst");

    /* JADX INFO: renamed from: c5 */
    private dnu f19907c5;

    /* JADX INFO: renamed from: du */
    private C7821h4 f19908du;

    /* JADX INFO: renamed from: dy */
    private i0a f19909dy;

    /* JADX INFO: renamed from: h4 */
    private ehe f19910h4;

    /* JADX INFO: renamed from: k4 */
    private boolean f19911k4;

    /* JADX INFO: renamed from: kk */
    private C7341br f19912kk;

    /* JADX INFO: renamed from: m9 */
    private qvp f19913m9;

    /* JADX INFO: renamed from: to */
    private rbg f19914to;

    /* JADX INFO: renamed from: x1 */
    private jqo f19915x1;

    public C7224aa() {
        m28069rv();
        this.f19915x1 = new jqo();
        this.f19912kk = new C7341br();
    }

    /* JADX INFO: renamed from: rv */
    private void m28069rv() {
        this.f19911k4 = false;
    }

    /* JADX INFO: renamed from: c5 */
    public final rbg m28070c5() {
        return this.f19914to;
    }

    /* JADX INFO: renamed from: ck */
    public final ehe m28071ck() {
        return this.f19910h4;
    }

    /* JADX INFO: renamed from: du */
    public final i0a m28072du() {
        if (this.f19909dy != null) {
            throw new Exception("Only one <txStyles> element can be added.");
        }
        i0a i0aVar = new i0a();
        this.f19909dy = i0aVar;
        return i0aVar;
    }

    /* JADX INFO: renamed from: dy */
    public final C7341br m28073dy() {
        return this.f19912kk;
    }

    /* JADX INFO: renamed from: fa */
    public final qvp m28074fa() {
        return this.f19913m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m28075h4() {
        return this.f19911k4;
    }

    /* JADX INFO: renamed from: jd */
    public final C7821h4 m28076jd() {
        return this.f19908du;
    }

    /* JADX INFO: renamed from: kk */
    public final ehe m28080kk() {
        if (this.f19910h4 != null) {
            throw new Exception("Only one <timing> element can be added.");
        }
        ehe eheVar = new ehe();
        this.f19910h4 = eheVar;
        return eheVar;
    }

    /* JADX INFO: renamed from: m9 */
    public final jqo m28081m9() {
        return this.f19915x1;
    }

    /* JADX INFO: renamed from: to */
    public final qvp m28082to() {
        if (this.f19913m9 != null) {
            throw new Exception("Only one <hf> element can be added.");
        }
        qvp qvpVar = new qvp();
        this.f19913m9 = qvpVar;
        return qvpVar;
    }

    /* JADX INFO: renamed from: up */
    public final i0a m28083up() {
        return this.f19909dy;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7821h4 m28084x1() {
        if (this.f19908du != null) {
            throw new Exception("Only one <transition> element can be added.");
        }
        C7821h4 c7821h4 = new C7821h4();
        this.f19908du = c7821h4;
        return c7821h4;
    }

    /* JADX INFO: renamed from: yj */
    public final AbstractC7414ck m28085yj() {
        return this.f19907c5;
    }

    public C7224aa(final AbstractC13912i5 abstractC13912i5) {
        m28069rv();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.aa.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7224aa.f19906jd.m27428k4(str) != 0) {
                    return false;
                }
                C7224aa.this.f19911k4 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.aa.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (C7224aa.f19906jd.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 1:
                        C7224aa.this.f19915x1 = new jqo(abstractC13912i5);
                        return true;
                    case 2:
                        C7224aa.this.f19912kk = new C7341br(abstractC13912i5);
                        return true;
                    case 3:
                        C7224aa.this.f19914to = new rbg(abstractC13912i5);
                        return true;
                    case 4:
                        C7224aa.this.f19908du = new C7821h4(abstractC13912i5);
                        return true;
                    case 5:
                        C7224aa.this.f19910h4 = new ehe(abstractC13912i5);
                        return true;
                    case 6:
                        C7224aa.this.f19913m9 = new qvp(abstractC13912i5);
                        return true;
                    case 7:
                        C7224aa.this.f19909dy = new i0a(abstractC13912i5);
                        return true;
                    case 8:
                        C7224aa.this.f19907c5 = new dnu(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final rbg m28077k4() {
        if (this.f19914to != null) {
            throw new Exception("Only one <sldLayoutIdLst> element can be added.");
        }
        rbg rbgVar = new rbg();
        this.f19914to = rbgVar;
        return rbgVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m28078k4(AbstractC7414ck abstractC7414ck) {
        this.f19907c5 = (dnu) abstractC7414ck;
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
        boolean z = this.f19911k4;
        if (z) {
            c3059ii.m12955x1("preserve", z ? "1" : "0");
        }
        this.f19915x1.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cSld");
        this.f19912kk.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "clrMap");
        rbg rbgVar = this.f19914to;
        if (rbgVar != null) {
            rbgVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "sldLayoutIdLst");
        }
        C7821h4 c7821h4 = this.f19908du;
        if (c7821h4 != null) {
            c7821h4.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "transition");
        }
        ehe eheVar = this.f19910h4;
        if (eheVar != null) {
            eheVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "timing");
        }
        qvp qvpVar = this.f19913m9;
        if (qvpVar != null) {
            qvpVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "hf");
        }
        i0a i0aVar = this.f19909dy;
        if (i0aVar != null) {
            i0aVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "txStyles");
        }
        dnu dnuVar = this.f19907c5;
        if (dnuVar != null) {
            dnuVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m28079k4(boolean z) {
        this.f19911k4 = z;
    }
}
