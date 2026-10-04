package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ts */
/* JADX INFO: loaded from: classes4.dex */
public class C8889ts extends AbstractC7361bz {

    /* JADX INFO: renamed from: h4 */
    private static final C7017h4 f30846h4 = new C7017h4("ptLst", "cxnLst", TranslateLanguage.BULGARIAN, "whole", "extLst");

    /* JADX INFO: renamed from: du */
    private C8397nz f30847du;

    /* JADX INFO: renamed from: k4 */
    private C8124kr f30848k4;

    /* JADX INFO: renamed from: kk */
    private C8281mq f30849kk;

    /* JADX INFO: renamed from: to */
    private C7442cu f30850to;

    /* JADX INFO: renamed from: x1 */
    private C7555ed f30851x1;

    public C8889ts() {
        this.f30848k4 = new C8124kr();
    }

    /* JADX INFO: renamed from: c5 */
    public final AbstractC7414ck m41859c5() {
        return this.f30847du;
    }

    /* JADX INFO: renamed from: du */
    public final C8124kr m41860du() {
        return this.f30848k4;
    }

    /* JADX INFO: renamed from: dy */
    public final C7442cu m41861dy() {
        return this.f30850to;
    }

    /* JADX INFO: renamed from: h4 */
    public final C7555ed m41862h4() {
        return this.f30851x1;
    }

    /* JADX INFO: renamed from: kk */
    public final C7442cu m41865kk() {
        if (this.f30850to != null) {
            throw new Exception("Only one <whole> element can be added.");
        }
        C7442cu c7442cu = new C7442cu();
        this.f30850to = c7442cu;
        return c7442cu;
    }

    /* JADX INFO: renamed from: m9 */
    public final C8281mq m41866m9() {
        return this.f30849kk;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC7414ck m41867to() {
        if (this.f30847du != null) {
            throw new Exception("Only one <extLst> element can be added.");
        }
        C8397nz c8397nz = new C8397nz();
        this.f30847du = c8397nz;
        return c8397nz;
    }

    /* JADX INFO: renamed from: x1 */
    public final C8281mq m41868x1() {
        if (this.f30849kk != null) {
            throw new Exception("Only one <bg> element can be added.");
        }
        C8281mq c8281mq = new C8281mq();
        this.f30849kk = c8281mq;
        return c8281mq;
    }

    public C8889ts(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ts.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C8889ts.f30846h4.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C8889ts.this.f30848k4 = new C8124kr(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C8889ts.this.f30851x1 = new C7555ed(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C8889ts.this.f30849kk = new C8281mq(abstractC13912i5);
                } else if (iM27428k4 == 3) {
                    C8889ts.this.f30850to = new C7442cu(abstractC13912i5);
                } else {
                    if (iM27428k4 != 4) {
                        return false;
                    }
                    C8889ts.this.f30847du = new C8397nz(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7555ed m41863k4() {
        if (this.f30851x1 != null) {
            throw new Exception("Only one <cxnLst> element can be added.");
        }
        C7555ed c7555ed = new C7555ed();
        this.f30851x1 = c7555ed;
        return c7555ed;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m41864k4(AbstractC7414ck abstractC7414ck) {
        this.f30847du = (C8397nz) abstractC7414ck;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("dgm", str2, "http://schemas.openxmlformats.org/drawingml/2006/diagram");
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
        this.f30848k4.mo6846k4("dgm", c3059ii, "ptLst");
        C7555ed c7555ed = this.f30851x1;
        if (c7555ed != null) {
            c7555ed.mo6846k4("dgm", c3059ii, "cxnLst");
        }
        C8281mq c8281mq = this.f30849kk;
        if (c8281mq != null) {
            c8281mq.mo6846k4("dgm", c3059ii, TranslateLanguage.BULGARIAN);
        }
        C7442cu c7442cu = this.f30850to;
        if (c7442cu != null) {
            c7442cu.mo6846k4("dgm", c3059ii, "whole");
        }
        C8397nz c8397nz = this.f30847du;
        if (c8397nz != null) {
            c8397nz.mo6846k4("dgm", c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
