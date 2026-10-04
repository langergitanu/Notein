package com.aspose.slides.internal.p332p7;

import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.g8 */
/* JADX INFO: loaded from: classes4.dex */
public class C7736g8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f23275du = new C7017h4("cSld", "clrMap", "hf", "extLst");

    /* JADX INFO: renamed from: k4 */
    private jqo f23276k4;

    /* JADX INFO: renamed from: kk */
    private qvp f23277kk;

    /* JADX INFO: renamed from: to */
    private dnu f23278to;

    /* JADX INFO: renamed from: x1 */
    private C7341br f23279x1;

    public C7736g8() {
        this.f23276k4 = new jqo();
        this.f23279x1 = new C7341br();
    }

    /* JADX INFO: renamed from: kk */
    public final qvp m32351kk() {
        return this.f23277kk;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC7414ck m32352to() {
        return this.f23278to;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7341br m32353x1() {
        return this.f23279x1;
    }

    public C7736g8(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.g8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7736g8.f23275du.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7736g8.this.f23276k4 = new jqo(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C7736g8.this.f23279x1 = new C7341br(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C7736g8.this.f23277kk = new qvp(abstractC13912i5);
                } else {
                    if (iM27428k4 != 3) {
                        return false;
                    }
                    C7736g8.this.f23278to = new dnu(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final jqo m32348k4() {
        return this.f23276k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32349k4(AbstractC7414ck abstractC7414ck) {
        this.f23278to = (dnu) abstractC7414ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32350k4(qvp qvpVar) {
        this.f23277kk = qvpVar;
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
        this.f23276k4.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "cSld");
        this.f23279x1.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "clrMap");
        qvp qvpVar = this.f23277kk;
        if (qvpVar != null) {
            qvpVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "hf");
        }
        dnu dnuVar = this.f23278to;
        if (dnuVar != null) {
            dnuVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
