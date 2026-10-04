package com.aspose.slides;

import com.aspose.slides.internal.p464vq.C11791os;
import com.facebook.common.callercontext.ContextChain;

/* JADX INFO: loaded from: classes3.dex */
class edy extends ywb {
    public edy(C11791os c11791os, u8s u8sVar) {
        super(c11791os, u8sVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5462k4(com.aspose.slides.internal.p332p7.i0a i0aVar) {
        mo55332up();
        m55442ck().m65807up("p:txStyles");
        m55442ck().m12954to("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
        m55442ck().m12954to("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        m55442ck().m12954to("xmlns", ContextChain.TAG_PRODUCT, null, "http://schemas.openxmlformats.org/presentationml/2006/main");
        if (i0aVar.m33795to() != null) {
            i0aVar.m33795to().mo6846k4(ContextChain.TAG_PRODUCT, m55442ck(), "titleStyle");
        }
        if (i0aVar.m33789du() != null) {
            i0aVar.m33789du().mo6846k4(ContextChain.TAG_PRODUCT, m55442ck(), "bodyStyle");
        }
        if (i0aVar.m33790h4() != null) {
            i0aVar.m33790h4().mo6846k4(ContextChain.TAG_PRODUCT, m55442ck(), "otherStyle");
        }
        if (i0aVar.m33794m9() != null) {
            i0aVar.m33794m9().mo6846k4(ContextChain.TAG_PRODUCT, m55442ck(), "extLst");
        }
        m55442ck().mo21898jd();
        mo55333yj();
    }
}
