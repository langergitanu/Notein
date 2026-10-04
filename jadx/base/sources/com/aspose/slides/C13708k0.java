package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p332p7.C9209xk;
import com.aspose.slides.internal.p464vq.AbstractC11737em;
import com.aspose.slides.internal.p464vq.AbstractC11758j2;
import com.aspose.slides.internal.p464vq.AbstractC11840w6;
import com.aspose.slides.internal.p464vq.C11791os;

/* JADX INFO: renamed from: com.aspose.slides.k0 */
/* JADX INFO: loaded from: classes3.dex */
class C13708k0 extends AbstractC11737em {
    public C13708k0(C11791os c11791os, AbstractC11758j2 abstractC11758j2) {
        super(c11791os, abstractC11758j2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63590k4(IDocumentProperties iDocumentProperties) {
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "http://schemas.openxmlformats.org/officeDocument/2006/custom-properties".equals(m55443jd().mo65050up()) && "Properties".equals(m55443jd().mo65023fa())) {
                com.aspose.slides.internal.p332p7.w0l[] w0lVarArrM44456x1 = new C9209xk(m55443jd()).m44456x1();
                for (int i = 0; i < w0lVarArrM44456x1.length; i++) {
                    try {
                        ((DocumentProperties) iDocumentProperties).m1339k4(w0lVarArrM44456x1[i].m43445k4(), w0lVarArrM44456x1[i].m43448x1().m29541kk());
                    } catch (RuntimeException e) {
                        C3085sv.m13082k4(e);
                    }
                }
            }
        }
        mo55330fa();
    }

    /* JADX INFO: renamed from: kk */
    public final void m63591kk(IDocumentProperties iDocumentProperties) {
        mo3467du().m55414ck();
        m63592x1(iDocumentProperties);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m63592x1(IDocumentProperties iDocumentProperties) {
        mo55332up();
        C9209xk c9209xk = new C9209xk();
        for (int i = 0; i < iDocumentProperties.getCountOfCustomProperties(); i++) {
            com.aspose.slides.internal.p332p7.w0l w0lVarM44455k4 = c9209xk.m44455k4();
            w0lVarM44455k4.m43447k4("{D5CDD505-2E9C-101B-9397-08002B2CF9AE}");
            w0lVarM44455k4.m43446k4(i + 2);
            w0lVarM44455k4.m43449x1(iDocumentProperties.getCustomPropertyName(i));
            Object objM1348x1 = ((DocumentProperties) iDocumentProperties).m1348x1(w0lVarM44455k4.m43445k4());
            if (objM1348x1 != null) {
                w0lVarM44455k4.m43444k4(objM1348x1);
            }
        }
        c9209xk.mo6846k4(null, m55442ck(), "Properties");
        mo55333yj();
    }

    public C13708k0(C11791os c11791os, AbstractC11840w6 abstractC11840w6) {
        super(c11791os, abstractC11840w6);
    }
}
