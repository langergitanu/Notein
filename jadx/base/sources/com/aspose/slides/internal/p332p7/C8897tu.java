package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.tu */
/* JADX INFO: loaded from: classes4.dex */
public class C8897tu extends AbstractC7361bz {

    /* JADX INFO: renamed from: k4 */
    public static final byte f30887k4 = C7321bg.m28891k4("cust");

    /* JADX INFO: renamed from: yj */
    private static final C7017h4 f30888yj = new C7017h4("showMasterSp", "showMasterPhAnim", "matchingName", C18437z2.f56754h, "preserve", "userDrawn", "cSld", "clrMapOvr", "transition", "timing", "hf", "extLst");

    /* JADX INFO: renamed from: c5 */
    private C7585en f30889c5;

    /* JADX INFO: renamed from: ck */
    private ehe f30890ck;

    /* JADX INFO: renamed from: du */
    private byte f30891du;

    /* JADX INFO: renamed from: dy */
    private jqo f30892dy;

    /* JADX INFO: renamed from: fa */
    private qvp f30893fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f30894h4;

    /* JADX INFO: renamed from: jd */
    private C7821h4 f30895jd;

    /* JADX INFO: renamed from: kk */
    private boolean f30896kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f30897m9;

    /* JADX INFO: renamed from: to */
    private String f30898to;

    /* JADX INFO: renamed from: up */
    private dnu f30899up;

    /* JADX INFO: renamed from: x1 */
    private boolean f30900x1;

    public C8897tu() {
        m41914ne();
        this.f30892dy = new jqo();
    }

    /* JADX INFO: renamed from: ne */
    private void m41914ne() {
        this.f30900x1 = true;
        this.f30896kk = true;
        this.f30898to = "";
        this.f30891du = f30887k4;
        this.f30894h4 = false;
        this.f30897m9 = false;
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m41918c5() {
        return this.f30894h4;
    }

    /* JADX INFO: renamed from: ck */
    public final jqo m41919ck() {
        return this.f30892dy;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m41920du() {
        return this.f30900x1;
    }

    /* JADX INFO: renamed from: dy */
    public final byte m41921dy() {
        return this.f30891du;
    }

    /* JADX INFO: renamed from: fa */
    public final C7585en m41922fa() {
        return this.f30889c5;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m41923h4() {
        return this.f30896kk;
    }

    /* JADX INFO: renamed from: jd */
    public final boolean m41924jd() {
        return this.f30897m9;
    }

    /* JADX INFO: renamed from: kk */
    public final ehe m41930kk() {
        if (this.f30890ck != null) {
            throw new Exception("Only one <timing> element can be added.");
        }
        ehe eheVar = new ehe();
        this.f30890ck = eheVar;
        return eheVar;
    }

    /* JADX INFO: renamed from: ks */
    public final qvp m41932ks() {
        return this.f30893fa;
    }

    /* JADX INFO: renamed from: m9 */
    public final String m41933m9() {
        return this.f30898to;
    }

    /* JADX INFO: renamed from: rv */
    public final AbstractC7414ck m41934rv() {
        return this.f30899up;
    }

    /* JADX INFO: renamed from: to */
    public final qvp m41935to() {
        if (this.f30893fa != null) {
            throw new Exception("Only one <hf> element can be added.");
        }
        qvp qvpVar = new qvp();
        this.f30893fa = qvpVar;
        return qvpVar;
    }

    /* JADX INFO: renamed from: up */
    public final C7821h4 m41937up() {
        return this.f30895jd;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7821h4 m41938x1() {
        if (this.f30895jd != null) {
            throw new Exception("Only one <transition> element can be added.");
        }
        C7821h4 c7821h4 = new C7821h4();
        this.f30895jd = c7821h4;
        return c7821h4;
    }

    /* JADX INFO: renamed from: yj */
    public final ehe m41940yj() {
        return this.f30890ck;
    }

    public C8897tu(final AbstractC13912i5 abstractC13912i5) {
        m41914ne();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.tu.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C8897tu.f30888yj.m27428k4(str);
                if (iM27428k4 == 0) {
                    C8897tu.this.f30900x1 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 1) {
                    C8897tu.this.f30896kk = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 == 2) {
                    C8897tu.this.f30898to = str2;
                    return true;
                }
                if (iM27428k4 == 3) {
                    C8897tu.this.f30891du = C7321bg.m28891k4(str2);
                    return true;
                }
                if (iM27428k4 == 4) {
                    C8897tu.this.f30894h4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 5) {
                    return false;
                }
                C8897tu.this.f30897m9 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.tu.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                switch (C8897tu.f30888yj.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 6:
                        C8897tu.this.f30892dy = new jqo(abstractC13912i5);
                        return true;
                    case 7:
                        C8897tu.this.f30889c5 = new C7585en(abstractC13912i5);
                        return true;
                    case 8:
                        C8897tu.this.f30895jd = new C7821h4(abstractC13912i5);
                        return true;
                    case 9:
                        C8897tu.this.f30890ck = new ehe(abstractC13912i5);
                        return true;
                    case 10:
                        C8897tu.this.f30893fa = new qvp(abstractC13912i5);
                        return true;
                    case 11:
                        C8897tu.this.f30899up = new dnu(abstractC13912i5);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    /* JADX INFO: renamed from: kk */
    public final void m41931kk(boolean z) {
        this.f30894h4 = z;
    }

    /* JADX INFO: renamed from: to */
    public final void m41936to(boolean z) {
        this.f30897m9 = z;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m41939x1(boolean z) {
        this.f30896kk = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7585en m41925k4() {
        if (this.f30889c5 != null) {
            throw new Exception("Only one <clrMapOvr> element can be added.");
        }
        C7585en c7585en = new C7585en();
        this.f30889c5 = c7585en;
        return c7585en;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41926k4(byte b) {
        this.f30891du = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41927k4(AbstractC7414ck abstractC7414ck) {
        this.f30899up = (dnu) abstractC7414ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41928k4(String str) {
        this.f30898to = str;
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
        boolean z = this.f30900x1;
        if (!z) {
            c3059ii.m12955x1("showMasterSp", z ? "1" : "0");
        }
        boolean z2 = this.f30896kk;
        if (!z2) {
            c3059ii.m12955x1("showMasterPhAnim", z2 ? "1" : "0");
        }
        if (!"".equals(this.f30898to)) {
            c3059ii.m12955x1("matchingName", this.f30898to);
        }
        byte b = this.f30891du;
        if (b != f30887k4) {
            c3059ii.m12955x1(C18437z2.f56754h, C7321bg.m28892k4(b));
        }
        boolean z3 = this.f30894h4;
        if (z3) {
            c3059ii.m12955x1("preserve", z3 ? "1" : "0");
        }
        boolean z4 = this.f30897m9;
        if (z4) {
            c3059ii.m12955x1("userDrawn", z4 ? "1" : "0");
        }
        this.f30892dy.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cSld");
        C7585en c7585en = this.f30889c5;
        if (c7585en != null) {
            c7585en.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "clrMapOvr");
        }
        C7821h4 c7821h4 = this.f30895jd;
        if (c7821h4 != null) {
            c7821h4.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "transition");
        }
        ehe eheVar = this.f30890ck;
        if (eheVar != null) {
            eheVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "timing");
        }
        qvp qvpVar = this.f30893fa;
        if (qvpVar != null) {
            qvpVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "hf");
        }
        dnu dnuVar = this.f30899up;
        if (dnuVar != null) {
            dnuVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41929k4(boolean z) {
        this.f30900x1 = z;
    }
}
