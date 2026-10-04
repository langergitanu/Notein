package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.yn */
/* JADX INFO: loaded from: classes3.dex */
class C14853yn extends ywb {
    public C14853yn(C11791os c11791os, gnb gnbVar) {
        super(c11791os, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    private void m73943k4(CommentAuthor commentAuthor, com.aspose.slides.internal.p332p7.rq8 rq8Var) {
        C14846yg c14846ygM1173kk = commentAuthor.m1173kk();
        c14846ygM1173kk.m73864k4(rq8Var.m40161k4().Clone());
        c14846ygM1173kk.m73865k4(rq8Var.m40166to());
        c14846ygM1173kk.m73868x1(rq8Var.m40160du());
        mo3471m9().m6773c5().addItem(rq8Var.m40161k4().Clone(), commentAuthor);
    }

    /* JADX INFO: renamed from: x1 */
    private void m73944x1(CommentAuthor commentAuthor, com.aspose.slides.internal.p332p7.rq8 rq8Var) {
        C14846yg c14846ygM1173kk = commentAuthor.m1173kk();
        rq8Var.m40162k4(c14846ygM1173kk.m73863k4().Clone());
        String strM73867x1 = c14846ygM1173kk.m73867x1();
        if (strM73867x1 == null) {
            strM73867x1 = "";
        }
        rq8Var.m40165kk(strM73867x1);
        String strM73866kk = c14846ygM1173kk.m73866kk();
        rq8Var.m40167to(strM73866kk != null ? strM73866kk : "");
    }

    public C14853yn(C11791os c11791os, u8s u8sVar) {
        super(c11791os, u8sVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73945k4(IPresentation iPresentation) {
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "authorLst".equals(m55443jd().mo65023fa())) {
                com.aspose.slides.internal.p332p7.rq8[] rq8VarArrM44353x1 = new com.aspose.slides.internal.p332p7.xgx(m55443jd()).m44353x1();
                for (int i = 0; i < rq8VarArrM44353x1.length; i++) {
                    String strM40168x1 = rq8VarArrM44353x1[i].m40168x1();
                    String strM40164kk = rq8VarArrM44353x1[i].m40164kk();
                    ICommentAuthor[] iCommentAuthorArrFindByNameAndInitials = iPresentation.getCommentAuthors().findByNameAndInitials(strM40168x1, strM40164kk);
                    m73943k4((CommentAuthor) (iCommentAuthorArrFindByNameAndInitials.length == 0 ? iPresentation.getCommentAuthors().addAuthor(strM40168x1, strM40164kk) : iCommentAuthorArrFindByNameAndInitials[0]), rq8VarArrM44353x1[i]);
                }
            }
        }
        mo55330fa();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m73946x1(IPresentation iPresentation) {
        mo55332up();
        com.aspose.slides.internal.p332p7.xgx xgxVar = new com.aspose.slides.internal.p332p7.xgx();
        IGenericEnumerator<ICommentAuthor> it = iPresentation.getCommentAuthors().iterator();
        while (it.hasNext()) {
            try {
                CommentAuthor commentAuthor = (CommentAuthor) it.next();
                if (commentAuthor.m1171k4() > 0) {
                    com.aspose.slides.internal.p332p7.rq8 rq8VarM44352k4 = xgxVar.m44352k4();
                    rq8VarM44352k4.m40163k4(commentAuthor.getName());
                    rq8VarM44352k4.m40169x1(commentAuthor.getInitials());
                    m73944x1(commentAuthor, rq8VarM44352k4);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        xgxVar.mo6846k4(null, m55442ck(), "authorLst");
        mo55333yj();
    }
}
