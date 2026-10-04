package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p332p7.AbstractC7414ck;
import com.aspose.slides.internal.p332p7.C9152wy;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.Xml.C13932ly;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: renamed from: com.aspose.slides.mz */
/* JADX INFO: loaded from: classes3.dex */
class C14161mz extends ywb {
    public C14161mz(C11791os c11791os, gnb gnbVar) {
        super(c11791os, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static C13981tl m67838k4(AbstractC7414ck abstractC7414ck) {
        XmlDocument xmlDocumentM29999k4;
        C13981tl documentElement;
        if (abstractC7414ck == null || abstractC7414ck.mo29643k4().length == 0 || (xmlDocumentM29999k4 = com.aspose.slides.internal.p332p7.d0s.m29999k4(abstractC7414ck, "{C676402C-5697-4E1C-873F-D02D1690AC5C}")) == null || (documentElement = xmlDocumentM29999k4.getDocumentElement()) == null) {
            return null;
        }
        return (C13981tl) fyw.m6354k4(documentElement, "threadingInfo", "http://schemas.microsoft.com/office/powerpoint/2012/main");
    }

    /* JADX INFO: renamed from: x1 */
    private void m67840x1(Comment comment, com.aspose.slides.internal.p332p7.yyn yynVar) {
        C1235i1 c1235i1M1168to = comment.m1168to();
        yynVar.m45296x1(c1235i1M1168to.m7379k4());
        c1235i1M1168to.m7381k4(new com.aspose.slides.internal.p332p7.dnu());
        com.aspose.slides.internal.p332p7.h2b h2bVarM44791k4 = com.aspose.slides.internal.p332p7.y4k.m44791k4(c1235i1M1168to.m7382x1(), "{C676402C-5697-4E1C-873F-D02D1690AC5C}");
        XmlDocument xmlDocument = new XmlDocument();
        C13932ly c13932lyCreateDocumentFragment = xmlDocument.createDocumentFragment();
        c13932lyCreateDocumentFragment.setInnerXml(h2bVarM44791k4.mo28309k4());
        C13981tl c13981tlCreateElement = c13932lyCreateDocumentFragment.getChildNodes().m65457kk(0).getOwnerDocument().createElement("p15", "threadingInfo", "http://schemas.microsoft.com/office/powerpoint/2012/main");
        c13981tlCreateElement.m65910kk("timeZoneBias", C14057f9.m66591x1(comment.m1167kk()));
        if (comment.getParentComment() != null) {
            C13981tl c13981tlCreateElement2 = xmlDocument.createElement("p15", "parentCm", "http://schemas.microsoft.com/office/powerpoint/2012/main");
            c13981tlCreateElement2.m65910kk("authorId", C14114y9.m67465x1(((CommentAuthor) comment.getParentComment().getAuthor()).m1175x1().m7032k4()));
            c13981tlCreateElement2.m65910kk("idx", C14114y9.m67465x1(((Comment) comment.getParentComment()).m1168to().m7379k4()));
            c13981tlCreateElement.appendChild(c13981tlCreateElement2);
        }
        c13932lyCreateDocumentFragment.getChildNodes().m65457kk(0).appendChild(c13981tlCreateElement);
        h2bVarM44791k4.mo28310k4(c13932lyCreateDocumentFragment.getOuterXml());
        yynVar.m45290k4(c1235i1M1168to.m7382x1());
    }

    public C14161mz(C11791os c11791os, u8s u8sVar) {
        super(c11791os, u8sVar);
    }

    /* JADX INFO: renamed from: k4 */
    private void m67839k4(Comment comment, com.aspose.slides.internal.p332p7.yyn yynVar) {
        C1235i1 c1235i1M1168to = comment.m1168to();
        c1235i1M1168to.m7380k4(yynVar.m45293kk());
        c1235i1M1168to.m7381k4(yynVar.m45287h4());
        C13981tl c13981tlM67838k4 = m67838k4(c1235i1M1168to.m7382x1());
        if (c13981tlM67838k4 != null) {
            if (c13981tlM67838k4.m65913to("timeZoneBias")) {
                comment.m1164k4(C14057f9.m66582k4(c13981tlM67838k4.m65906k4("timeZoneBias")));
            }
            C13981tl c13981tl = (C13981tl) fyw.m6354k4(c13981tlM67838k4, "parentCm", "http://schemas.microsoft.com/office/powerpoint/2012/main");
            if (c13981tl != null && c13981tl.m65913to("authorId") && c13981tl.m65913to("idx")) {
                int[] iArr = {0};
                boolean zM66590k4 = C14057f9.m66590k4(c13981tl.m65906k4("authorId"), iArr);
                int i = iArr[0];
                if (zM66590k4) {
                    CommentAuthor commentAuthorM1178k4 = ((CommentAuthorCollection) comment.getSlide().getPresentation().getCommentAuthors()).m1178k4(i);
                    int[] iArr2 = {0};
                    boolean zM66590k42 = C14057f9.m66590k4(c13981tl.m65906k4("idx"), iArr2);
                    int i2 = iArr2[0];
                    if (zM66590k42) {
                        comment.setParentComment(((CommentCollection) commentAuthorM1178k4.getComments()).findCommentByIdx(i2));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m67841k4(Slide slide) {
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "cmLst".equals(m55443jd().mo65023fa())) {
                for (com.aspose.slides.internal.p332p7.yyn yynVar : new C9152wy(m55443jd()).m44118x1()) {
                    ICommentAuthor[] iCommentAuthorArr = {null};
                    mo3471m9().m6776dy().tryGetValue(Long.valueOf(yynVar.m45288k4()), iCommentAuthorArr);
                    ICommentAuthor iCommentAuthor = iCommentAuthorArr[0];
                    if (iCommentAuthor == null) {
                        throw new Exception(C14113y2.m67408k4("Comment by nonexistent author. AuthorId = ", C14114y9.m67465x1(yynVar.m45288k4()), "."));
                    }
                    m67839k4((Comment) ((CommentCollection) iCommentAuthor.getComments()).m1187k4(yynVar.m45286du(), (ISlide) slide, new C12025x6((float) ((yynVar.m45294to().m45889k4() * 12700.0d) / 8.0d), (float) ((yynVar.m45294to().m45891x1() * 12700.0d) / 8.0d)), yynVar.m45295x1().Clone()), yynVar);
                }
            }
        }
        mo55330fa();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m67842k4(IComment[] iCommentArr) {
        mo55332up();
        C9152wy c9152wy = new C9152wy();
        for (IComment iComment : iCommentArr) {
            com.aspose.slides.internal.p332p7.yyn yynVarM44117k4 = c9152wy.m44117k4();
            Comment comment = (Comment) iComment;
            yynVarM44117k4.m45294to().m45890k4(((double) (comment.m1169x1().m56897x1() * 8.0f)) / 12700.0d);
            yynVarM44117k4.m45294to().m45892x1(((double) (comment.m1169x1().m56895kk() * 8.0f)) / 12700.0d);
            yynVarM44117k4.m45292k4(iComment.getText());
            yynVarM44117k4.m45289k4(((CommentAuthor) iComment.getAuthor()).m1175x1().m7032k4());
            Comment comment2 = (Comment) iComment;
            yynVarM44117k4.m45291k4(comment2.m1163k4().Clone());
            m67840x1(comment2, yynVarM44117k4);
        }
        c9152wy.mo6846k4(null, m55442ck(), "cmLst");
        mo55333yj();
    }
}
