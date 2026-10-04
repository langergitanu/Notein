package com.aspose.slides.internal.p332p7;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes4.dex */
public class ghm extends AbstractC7361bz {

    /* JADX INFO: renamed from: m9 */
    private static final C7017h4 f23439m9 = new C7017h4("htmlPubPr", "webPr", "prnPr", "showPr", "clrMru", "extLst");

    /* JADX INFO: renamed from: du */
    private C9084w2 f23440du;

    /* JADX INFO: renamed from: h4 */
    private ltr f23441h4;

    /* JADX INFO: renamed from: k4 */
    private lev f23442k4;

    /* JADX INFO: renamed from: kk */
    private xk6 f23443kk;

    /* JADX INFO: renamed from: to */
    private k6v f23444to;

    /* JADX INFO: renamed from: x1 */
    private oyy f23445x1;

    public ghm() {
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC7414ck m32544k4() {
        if (this.f23441h4 != null) {
            throw new Exception("Only one <extLst> element can be added.");
        }
        ltr ltrVar = new ltr();
        this.f23441h4 = ltrVar;
        return ltrVar;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC7414ck m32546kk() {
        return this.f23441h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final k6v m32547x1() {
        return this.f23444to;
    }

    public ghm(final AbstractC13912i5 abstractC13912i5) {
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ghm.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                int iM27428k4 = ghm.f23439m9.m27428k4(abstractC13912i5.mo65023fa());
                if (iM27428k4 == 0) {
                    ghm.this.f23442k4 = new lev(abstractC13912i5);
                } else if (iM27428k4 == 1) {
                    ghm.this.f23445x1 = new oyy(abstractC13912i5);
                } else if (iM27428k4 == 2) {
                    ghm.this.f23443kk = new xk6(abstractC13912i5);
                } else if (iM27428k4 == 3) {
                    ghm.this.f23444to = new k6v(abstractC13912i5);
                } else if (iM27428k4 == 4) {
                    ghm.this.f23440du = new C9084w2(abstractC13912i5);
                } else {
                    if (iM27428k4 != 5) {
                        return false;
                    }
                    ghm.this.f23441h4 = new ltr(abstractC13912i5);
                }
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m32545k4(k6v k6vVar) {
        this.f23444to = k6vVar;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(ContextChain.TAG_PRODUCT, str2, "http://schemas.openxmlformats.org/presentationml/2006/main");
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            c3059ii.m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        }
        if (c3059ii.mo12952k4("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
            c3059ii.m12954to("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
        }
        lev levVar = this.f23442k4;
        if (levVar != null) {
            levVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "htmlPubPr");
        }
        oyy oyyVar = this.f23445x1;
        if (oyyVar != null) {
            oyyVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "webPr");
        }
        xk6 xk6Var = this.f23443kk;
        if (xk6Var != null) {
            xk6Var.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "prnPr");
        }
        k6v k6vVar = this.f23444to;
        if (k6vVar != null) {
            k6vVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "showPr");
        }
        C9084w2 c9084w2 = this.f23440du;
        if (c9084w2 != null) {
            c9084w2.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "clrMru");
        }
        ltr ltrVar = this.f23441h4;
        if (ltrVar != null) {
            ltrVar.mo6846k4(ContextChain.TAG_PRODUCT, c3059ii, "extLst");
        }
        c3059ii.mo21898jd();
    }
}
