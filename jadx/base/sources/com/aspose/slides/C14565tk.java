package com.aspose.slides;

import com.aspose.slides.internal.p332p7.C7504dq;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p464vq.AbstractC11737em;
import com.aspose.slides.internal.p464vq.AbstractC11758j2;
import com.aspose.slides.internal.p464vq.AbstractC11840w6;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;

/* JADX INFO: renamed from: com.aspose.slides.tk */
/* JADX INFO: loaded from: classes3.dex */
class C14565tk extends AbstractC11737em {
    public C14565tk(C11791os c11791os, AbstractC11758j2 abstractC11758j2) {
        super(c11791os, abstractC11758j2);
    }

    /* JADX INFO: renamed from: k4 */
    public void m71238k4(IDocumentProperties iDocumentProperties) {
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "http://schemas.openxmlformats.org/package/2006/metadata/core-properties".equals(m55443jd().mo65050up()) && m55443jd().mo65023fa().equals("coreProperties")) {
                C7504dq c7504dq = new C7504dq(m55443jd());
                iDocumentProperties.setTitle(c7504dq.m30536up());
                iDocumentProperties.setAuthor(c7504dq.m30517du());
                iDocumentProperties.setSubject(c7504dq.m30521fa());
                iDocumentProperties.setKeywords(c7504dq.m30532m9());
                iDocumentProperties.setComments(C14113y2.m67401k4(c7504dq.m30522h4(), "_x000d_", ""));
                iDocumentProperties.setCategory(c7504dq.m30526k4());
                iDocumentProperties.setContentStatus(c7504dq.m30537x1());
                iDocumentProperties.setContentType(c7504dq.m30529kk());
                DocumentProperties documentProperties = (DocumentProperties) iDocumentProperties;
                documentProperties.m1336k4(c7504dq.m30534to().Clone());
                documentProperties.m1346to(c7504dq.m30524jd().Clone());
                documentProperties.m1343kk(c7504dq.m30514c5().Clone());
                iDocumentProperties.setLastSavedBy(c7504dq.m30519dy());
                int[] iArr = {0};
                boolean zM66590k4 = C14057f9.m66590k4(c7504dq.m30516ck(), iArr);
                int i = iArr[0];
                if (zM66590k4) {
                    iDocumentProperties.setRevisionNumber(i);
                }
            }
        }
        mo55330fa();
    }

    /* JADX INFO: renamed from: kk */
    public final void m71239kk(IDocumentProperties iDocumentProperties) {
        mo3467du().m55414ck();
        m71240x1(iDocumentProperties);
    }

    /* JADX INFO: renamed from: x1 */
    public void m71240x1(IDocumentProperties iDocumentProperties) {
        mo55332up();
        C7504dq c7504dq = new C7504dq();
        c7504dq.m30525jd(iDocumentProperties.getTitle());
        c7504dq.m30535to(iDocumentProperties.getAuthor());
        c7504dq.m30515c5(iDocumentProperties.getSubject());
        c7504dq.m30523h4(iDocumentProperties.getKeywords());
        c7504dq.m30518du(iDocumentProperties.getComments());
        c7504dq.m30528k4(iDocumentProperties.getCategory());
        c7504dq.m30539x1(iDocumentProperties.getContentStatus());
        c7504dq.m30531kk(iDocumentProperties.getContentType());
        DocumentProperties documentProperties = (DocumentProperties) iDocumentProperties;
        c7504dq.m30527k4(documentProperties.m1347x1().Clone());
        c7504dq.m30530kk(documentProperties.m1342kk().Clone());
        c7504dq.m30538x1(documentProperties.m1345to().Clone());
        c7504dq.m30533m9(iDocumentProperties.getLastSavedBy());
        c7504dq.m30520dy(C14057f9.m66586k4(iDocumentProperties.getRevisionNumber(), (InterfaceC14073kp) C11697x1.m55250kk()));
        c7504dq.mo6846k4(null, m55442ck(), "coreProperties");
        mo55333yj();
    }

    public C14565tk(C11791os c11791os, AbstractC11840w6 abstractC11840w6) {
        super(c11791os, abstractC11840w6);
    }
}
