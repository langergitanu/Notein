package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.he */
/* JADX INFO: loaded from: classes4.dex */
public class C7839he extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f24040h4 = new C7017h4("showMasterSp", "showMasterPhAnim", "cSld", "clrMapOvr", "extLst");

    /* JADX INFO: renamed from: du */
    private dnu f24041du;

    /* JADX INFO: renamed from: k4 */
    private boolean f24042k4;

    /* JADX INFO: renamed from: kk */
    private jqo f24043kk;

    /* JADX INFO: renamed from: to */
    private C7585en f24044to;

    /* JADX INFO: renamed from: x1 */
    private boolean f24045x1;

    public C7839he() {
        m33291dy();
        this.f24043kk = new jqo();
    }

    /* JADX INFO: renamed from: dy */
    private void m33291dy() {
        this.f24042k4 = true;
        this.f24045x1 = true;
    }

    /* JADX INFO: renamed from: du */
    public final C7585en m33298du() {
        return this.f24044to;
    }

    /* JADX INFO: renamed from: h4 */
    public final AbstractC7414ck m33299h4() {
        return this.f24041du;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m33303kk() {
        return this.f24045x1;
    }

    /* JADX INFO: renamed from: to */
    public final jqo m33304to() {
        return this.f24043kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m33305x1(boolean z) {
        this.f24045x1 = z;
    }

    public C7839he(final AbstractC13912i5 abstractC13912i5) {
        m33291dy();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.he.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                int iM27428k4 = C7839he.f24040h4.m27428k4(str);
                if (iM27428k4 == 0) {
                    C7839he.this.f24042k4 = C13850af.m65068c5(str2);
                    return true;
                }
                if (iM27428k4 != 1) {
                    return false;
                }
                C7839he.this.f24045x1 = C13850af.m65068c5(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.he.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7839he.f24040h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 2) {
                    C7839he.this.f24043kk = new jqo(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 == 3) {
                    C7839he.this.f24044to = new C7585en(abstractC13912i5);
                    return true;
                }
                if (iM27428k4 != 4) {
                    return false;
                }
                C7839he.this.f24041du = new dnu(abstractC13912i5);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7585en m33300k4() {
        if (this.f24044to != null) {
            throw new Exception("Only one <clrMapOvr> element can be added.");
        }
        C7585en c7585en = new C7585en();
        this.f24044to = c7585en;
        return c7585en;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m33306x1() {
        return this.f24042k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33301k4(AbstractC7414ck abstractC7414ck) {
        this.f24041du = (dnu) abstractC7414ck;
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
        boolean z = this.f24042k4;
        if (!z) {
            c3059ii.m12955x1("showMasterSp", z ? "1" : "0");
        }
        boolean z2 = this.f24045x1;
        if (!z2) {
            c3059ii.m12955x1("showMasterPhAnim", z2 ? "1" : "0");
        }
        this.f24043kk.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cSld");
        C7585en c7585en = this.f24044to;
        if (c7585en != null) {
            c7585en.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "clrMapOvr");
        }
        dnu dnuVar = this.f24041du;
        if (dnuVar != null) {
            dnuVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m33302k4(boolean z) {
        this.f24042k4 = z;
    }
}
