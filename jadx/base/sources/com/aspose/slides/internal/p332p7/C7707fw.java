package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.orion.penkit.tools.DrawToolFactory;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.fw */
/* JADX INFO: loaded from: classes4.dex */
public class C7707fw extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f23066m9 = new C7017h4("avLst", "gdLst", "ahLst", "cxnLst", DrawToolFactory.LASSO_TYPE_RECT, "pathLst");

    /* JADX INFO: renamed from: du */
    private C8727s0 f23067du;

    /* JADX INFO: renamed from: h4 */
    private C8245m6 f23068h4;

    /* JADX INFO: renamed from: k4 */
    private C7733g6 f23069k4;

    /* JADX INFO: renamed from: kk */
    private C9333z0 f23070kk;

    /* JADX INFO: renamed from: to */
    private C7484di f23071to;

    /* JADX INFO: renamed from: x1 */
    private C7733g6 f23072x1;

    public C7707fw() {
        this.f23068h4 = new C8245m6();
    }

    /* JADX INFO: renamed from: c5 */
    public final C7484di m32098c5() {
        return this.f23071to;
    }

    /* JADX INFO: renamed from: ck */
    public final C8245m6 m32099ck() {
        return this.f23068h4;
    }

    /* JADX INFO: renamed from: du */
    public final C8727s0 m32100du() {
        if (this.f23067du != null) {
            throw new Exception("Only one <rect> element can be added.");
        }
        C8727s0 c8727s0 = new C8727s0();
        this.f23067du = c8727s0;
        return c8727s0;
    }

    /* JADX INFO: renamed from: dy */
    public final C9333z0 m32101dy() {
        return this.f23070kk;
    }

    /* JADX INFO: renamed from: h4 */
    public final C7733g6 m32102h4() {
        return this.f23069k4;
    }

    /* JADX INFO: renamed from: jd */
    public final C8727s0 m32103jd() {
        return this.f23067du;
    }

    /* JADX INFO: renamed from: kk */
    public final C9333z0 m32105kk() {
        if (this.f23070kk != null) {
            throw new Exception("Only one <ahLst> element can be added.");
        }
        C9333z0 c9333z0 = new C9333z0();
        this.f23070kk = c9333z0;
        return c9333z0;
    }

    /* JADX INFO: renamed from: m9 */
    public final C7733g6 m32106m9() {
        return this.f23072x1;
    }

    /* JADX INFO: renamed from: to */
    public final C7484di m32107to() {
        if (this.f23071to != null) {
            throw new Exception("Only one <cxnLst> element can be added.");
        }
        C7484di c7484di = new C7484di();
        this.f23071to = c7484di;
        return c7484di;
    }

    /* JADX INFO: renamed from: x1 */
    public final C7733g6 m32108x1() {
        if (this.f23072x1 != null) {
            throw new Exception("Only one <gdLst> element can be added.");
        }
        C7733g6 c7733g6 = new C7733g6();
        this.f23072x1 = c7733g6;
        return c7733g6;
    }

    public C7707fw(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.fw.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = C7707fw.f23066m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    C7707fw.this.f23069k4 = new C7733g6(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    C7707fw.this.f23072x1 = new C7733g6(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    C7707fw.this.f23070kk = new C9333z0(abstractC13912i5);
                } else if (iM27428k4 == 3) {
                    C7707fw.this.f23071to = new C7484di(abstractC13912i5);
                } else if (iM27428k4 == 4) {
                    C7707fw.this.f23067du = new C8727s0(abstractC13912i5);
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    C7707fw.this.f23068h4 = new C8245m6(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final C7733g6 m32104k4() {
        if (this.f23069k4 != null) {
            throw new Exception("Only one <avLst> element can be added.");
        }
        C7733g6 c7733g6 = new C7733g6();
        this.f23069k4 = c7733g6;
        return c7733g6;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, "a".equals(c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main")) ? null : "http://schemas.openxmlformats.org/drawingml/2006/main");
        C7733g6 c7733g6 = this.f23069k4;
        if (c7733g6 != null) {
            c7733g6.mo6846k4("a", c3059ii, "avLst");
        }
        C7733g6 c7733g62 = this.f23072x1;
        if (c7733g62 != null) {
            c7733g62.mo6846k4("a", c3059ii, "gdLst");
        }
        C9333z0 c9333z0 = this.f23070kk;
        if (c9333z0 != null) {
            c9333z0.mo6846k4("a", c3059ii, "ahLst");
        }
        C7484di c7484di = this.f23071to;
        if (c7484di != null) {
            c7484di.mo6846k4("a", c3059ii, "cxnLst");
        }
        C8727s0 c8727s0 = this.f23067du;
        if (c8727s0 != null) {
            c8727s0.mo6846k4("a", c3059ii, DrawToolFactory.LASSO_TYPE_RECT);
        }
        this.f23068h4.mo6846k4("a", c3059ii, "pathLst");
        c3059ii.mo21898jd();
    }
}
