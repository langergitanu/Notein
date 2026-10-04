package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7293b3;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ip */
/* JADX INFO: loaded from: classes3.dex */
class C13645ip extends ywb {
    public C13645ip(C11791os c11791os, gnb gnbVar) {
        super(c11791os, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    private void m63020k4(ICommentAuthor iCommentAuthor, com.aspose.slides.internal.p332p7.ham hamVar) {
        C1186h5 c1186h5M1175x1 = ((CommentAuthor) iCommentAuthor).m1175x1();
        c1186h5M1175x1.m7034k4(hamVar.m33249k4());
        mo3471m9().m6776dy().addItem(Long.valueOf(hamVar.m33249k4()), iCommentAuthor);
        c1186h5M1175x1.m7033k4((int) hamVar.m33255to());
        c1186h5M1175x1.m7035k4(hamVar.m33248du());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m63023x1(IPresentation iPresentation) {
        mo55332up();
        C7293b3 c7293b3 = new C7293b3();
        IGenericEnumerator<ICommentAuthor> it = iPresentation.getCommentAuthors().iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                CommentAuthor commentAuthor = (CommentAuthor) it.next();
                com.aspose.slides.internal.p332p7.ham hamVarM28699k4 = c7293b3.m28699k4();
                hamVarM28699k4.m33252k4(commentAuthor.getName());
                hamVarM28699k4.m33258x1(commentAuthor.getInitials());
                int[] iArr = {i};
                m63021k4(commentAuthor, hamVarM28699k4, iArr);
                i = iArr[0];
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c7293b3.mo6846k4(null, m55442ck(), "cmAuthorLst");
        mo55333yj();
    }

    public C13645ip(C11791os c11791os, u8s u8sVar) {
        super(c11791os, u8sVar);
    }

    /* JADX INFO: renamed from: k4 */
    private void m63021k4(ICommentAuthor iCommentAuthor, com.aspose.slides.internal.p332p7.ham hamVar, int[] iArr) {
        C1186h5 c1186h5M1175x1 = ((CommentAuthor) iCommentAuthor).m1175x1();
        hamVar.m33250k4(c1186h5M1175x1.m7032k4());
        int iM7038x1 = c1186h5M1175x1.m7038x1();
        if (iM7038x1 < 0) {
            iM7038x1 = iArr[0] + 1;
        }
        if (iM7038x1 > iArr[0]) {
            iArr[0] = iM7038x1;
        }
        hamVar.m33254kk(((long) iM7038x1) & 4294967295L);
        hamVar.m33257x1(c1186h5M1175x1.m7036kk());
        hamVar.m33251k4(c1186h5M1175x1.m7037to());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63022k4(IPresentation iPresentation) {
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "cmAuthorLst".equals(m55443jd().mo65023fa())) {
                com.aspose.slides.internal.p332p7.ham[] hamVarArrM28700x1 = new C7293b3(m55443jd()).m28700x1();
                for (int i = 0; i < hamVarArrM28700x1.length; i++) {
                    m63020k4(iPresentation.getCommentAuthors().addAuthor(hamVarArrM28700x1[i].m33256x1(), hamVarArrM28700x1[i].m33253kk()), hamVarArrM28700x1[i]);
                }
            }
        }
        mo55330fa();
    }
}
