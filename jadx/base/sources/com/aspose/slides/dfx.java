package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C8163l7;
import com.aspose.slides.internal.p332p7.C8208ls;
import com.aspose.slides.internal.p332p7.C8549pu;
import com.aspose.slides.internal.p332p7.C8867tg;
import com.aspose.slides.internal.p332p7.C8952ug;
import com.aspose.slides.internal.p332p7.C9286yi;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class dfx extends ywb {
    public dfx(C11791os c11791os, gnb gnbVar) {
        super(c11791os, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    private long m5088k4(String str) {
        long jCharAt = 0;
        int i = 0;
        while (true) {
            long j = jCharAt & 4294967295L;
            if (i >= str.length()) {
                return (((((j << 5) & 4294967295L) + j) & 4294967295L) + 13) & 4294967295L;
            }
            jCharAt = ((((j << 5) & 4294967295L) + j) & 4294967295L) + ((long) str.charAt(i));
            i++;
        }
    }

    public dfx(C11791os c11791os, u8s u8sVar) {
        super(c11791os, u8sVar);
    }

    /* JADX INFO: renamed from: k4 */
    private Shape m5089k4(Slide slide, long j) {
        IGenericEnumerator<IShape> it = slide.getShapes().iterator();
        while (it.hasNext()) {
            try {
                Shape shape = (Shape) it.next();
                if (shape.m2584wp() == j) {
                    return shape;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0111 A[PHI: r2
      0x0111: PHI (r2v30 byte) = (r2v29 byte), (r2v31 byte) binds: [B:36:0x010b, B:38:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x020d A[SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5091k4(Slide slide) {
        Shape shapeM5089k4;
        C8867tg c8867tgM35934x1;
        int iM28936c5;
        int i;
        Slide slide2 = slide;
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "cmLst".equals(m55443jd().mo65023fa())) {
                com.aspose.slides.internal.p332p7.bjs[] bjsVarArrM40972x1 = new com.aspose.slides.internal.p332p7.sdp(m55443jd()).m40972x1();
                int length = bjsVarArrM40972x1.length;
                int i2 = 0;
                while (i2 < length) {
                    com.aspose.slides.internal.p332p7.bjs bjsVar = bjsVarArrM40972x1[i2];
                    CommentAuthor commentAuthorM1179k4 = ((CommentAuthorCollection) slide2.getPresentation().getCommentAuthors()).m1179k4(bjsVar.m28939dy().Clone());
                    C8549pu c8549pu = (C8549pu) C7019kk.m27452k4((Object) bjsVar.m28948ks().m42372du()[0].m44649to().get_Item(0).m29542x1(), C8549pu.class);
                    if (c8549pu != null) {
                        float fM45889k4 = bjsVar.m28951up() != null ? (float) bjsVar.m28951up().m45889k4() : 0.0f;
                        float fM45891x1 = bjsVar.m28951up() != null ? (float) bjsVar.m28951up().m45891x1() : 0.0f;
                        if (bjsVar.m28937ck() != null && bjsVar.m28937ck().m45016x1() != null) {
                            c8867tgM35934x1 = bjsVar.m28937ck().m45016x1();
                        } else if (bjsVar.m28940fa() == null || bjsVar.m28940fa().m35934x1() == null) {
                            shapeM5089k4 = null;
                            ModernComment modernComment = (ModernComment) ((CommentCollection) commentAuthorM1179k4.getComments()).m1189k4(c8549pu.m39137kk(), (ISlide) slide2, (IShape) shapeM5089k4, new C12025x6(fM45889k4, fM45891x1), bjsVar.m28942jd().Clone());
                            modernComment.m2010k4(bjsVar.m28949m9().Clone());
                            iM28936c5 = bjsVar.m28936c5();
                            if (iM28936c5 == 1) {
                                byte b = 2;
                                if (iM28936c5 != 2) {
                                    b = 3;
                                    if (iM28936c5 == 3) {
                                        modernComment.setStatus(b);
                                    }
                                }
                            } else {
                                modernComment.setStatus((byte) 1);
                            }
                            if (bjsVar.m28940fa() != null) {
                                modernComment.setTextSelectionStart(bjsVar.m28940fa().m35933kk().m33322x1());
                                modernComment.setTextSelectionLength(bjsVar.m28940fa().m35933kk().m33320kk());
                                if (bjsVar.m28940fa().m35933kk().m33321to() != null) {
                                    modernComment.m2009h4().m69749k4(bjsVar.m28940fa().m35933kk().m33321to().m36408k4());
                                    modernComment.m2009h4().m69751x1(bjsVar.m28940fa().m35933kk().m33321to().m36410x1());
                                }
                            }
                            if (bjsVar.m28954yj() == null) {
                                com.aspose.slides.internal.p332p7.eng[] engVarArrM45114x1 = bjsVar.m28954yj().m45114x1();
                                int length2 = engVarArrM45114x1.length;
                                int i3 = 0;
                                while (i3 < length2) {
                                    com.aspose.slides.internal.p332p7.eng engVar = engVarArrM45114x1[i3];
                                    CommentAuthor commentAuthorM1179k42 = ((CommentAuthorCollection) slide.getPresentation().getCommentAuthors()).m1179k4(engVar.m31186x1().Clone());
                                    if (commentAuthorM1179k42 == null) {
                                        throw new Exception(C14113y2.m67407k4("Comment reply by nonexistent author. AuthorId = ", engVar.m31186x1(), "."));
                                    }
                                    C8549pu c8549pu2 = (C8549pu) C7019kk.m27452k4((Object) engVar.m31185to().m42372du()[0].m44649to().get_Item(0).m29542x1(), C8549pu.class);
                                    if (c8549pu2 != null) {
                                        i = i3;
                                        ((ModernComment) ((CommentCollection) commentAuthorM1179k42.getComments()).m1189k4(c8549pu2.m39137kk(), slide, (IShape) null, new C12025x6(0.0f, 0.0f), engVar.m31184kk().Clone())).setParentComment(modernComment);
                                    } else {
                                        i = i3;
                                    }
                                    i3 = i + 1;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            c8867tgM35934x1 = bjsVar.m28940fa().m35934x1();
                        }
                        shapeM5089k4 = m5089k4(slide2, c8867tgM35934x1.m41709k4());
                        ModernComment modernComment2 = (ModernComment) ((CommentCollection) commentAuthorM1179k4.getComments()).m1189k4(c8549pu.m39137kk(), (ISlide) slide2, (IShape) shapeM5089k4, new C12025x6(fM45889k4, fM45891x1), bjsVar.m28942jd().Clone());
                        modernComment2.m2010k4(bjsVar.m28949m9().Clone());
                        iM28936c5 = bjsVar.m28936c5();
                        if (iM28936c5 == 1) {
                        }
                        if (bjsVar.m28940fa() != null) {
                        }
                        if (bjsVar.m28954yj() == null) {
                        }
                    }
                    i2++;
                    slide2 = slide;
                }
            }
            slide2 = slide;
        }
        mo55330fa();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0184 A[PHI: r7
      0x0184: PHI (r7v27 int) = (r7v26 int), (r7v29 int), (r7v30 int) binds: [B:20:0x017b, B:22:0x017e, B:24:0x0181] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5092k4(IComment[] iCommentArr) {
        long jM69750x1;
        mo55332up();
        com.aspose.slides.internal.p332p7.sdp sdpVar = new com.aspose.slides.internal.p332p7.sdp();
        for (IComment iComment : iCommentArr) {
            ModernComment modernComment = (ModernComment) iComment;
            if (modernComment.getParentComment() == null) {
                com.aspose.slides.internal.p332p7.bjs bjsVarM40971k4 = sdpVar.m40971k4();
                bjsVarM40971k4.m28945k4(modernComment.m2008du().Clone());
                bjsVarM40971k4.m28946k4(modernComment.m1163k4().Clone());
                bjsVarM40971k4.m28953x1(((CommentAuthor) modernComment.getAuthor()).m1173kk().m73863k4().Clone());
                if (modernComment.getShape() == null) {
                    com.aspose.slides.internal.p332p7.ypz ypzVarM28943k4 = bjsVarM40971k4.m28943k4();
                    ypzVarM28943k4.m45082k4().m33329x1(modernComment.getSlide().getSlideId());
                    ypzVarM28943k4.m45082k4().m33328k4(((Slide) modernComment.getSlide()).m389k4());
                } else if (!C7019kk.m27469x1(modernComment.getShape(), AutoShape.class) || modernComment.getTextSelectionLength() == 0) {
                    C9286yi c9286yiM28952x1 = bjsVarM40971k4.m28952x1();
                    c9286yiM28952x1.m45015k4().m33329x1(modernComment.getSlide().getSlideId());
                    c9286yiM28952x1.m45015k4().m33328k4(((Slide) modernComment.getSlide()).m389k4());
                    c9286yiM28952x1.m45016x1().m41710k4(modernComment.getShape().getOfficeInteropShapeId());
                } else {
                    C8163l7 c8163l7M28947kk = bjsVarM40971k4.m28947kk();
                    c8163l7M28947kk.m35932k4().m33329x1(modernComment.getSlide().getSlideId());
                    c8163l7M28947kk.m35932k4().m33328k4(((Slide) modernComment.getSlide()).m389k4());
                    c8163l7M28947kk.m35934x1().m41710k4(modernComment.getShape().getOfficeInteropShapeId());
                    c8163l7M28947kk.m35933kk().m33319k4(modernComment.getTextSelectionStart());
                    c8163l7M28947kk.m35933kk().m33323x1(modernComment.getTextSelectionLength());
                    C8208ls c8208lsM33318k4 = c8163l7M28947kk.m35933kk().m33318k4();
                    String text = ((AutoShape) modernComment.getShape()).getTextFrame().getText();
                    if ((modernComment.m2009h4().m69750x1() & 4294967295L) == 0) {
                        c8208lsM33318k4.m36409k4(((((long) text.length()) & 4294967295L) + 1) & 4294967295L);
                        jM69750x1 = m5088k4(text);
                    } else {
                        c8208lsM33318k4.m36409k4(modernComment.m2009h4().m69748k4());
                        jM69750x1 = modernComment.m2009h4().m69750x1();
                    }
                    c8208lsM33318k4.m36411x1(jM69750x1);
                }
                bjsVarM40971k4.m28950to();
                bjsVarM40971k4.m28951up().m45890k4(modernComment.m1169x1().m56897x1());
                bjsVarM40971k4.m28951up().m45892x1(modernComment.m1169x1().m56895kk());
                byte status = modernComment.getStatus();
                int i = 1;
                if (status != 1) {
                    i = 2;
                    if (status != 2) {
                        i = 3;
                        if (status == 3) {
                            bjsVarM40971k4.m28944k4(i);
                        }
                        C8952ug c8952ugM28941h4 = bjsVarM40971k4.m28941h4();
                        c8952ugM28941h4.m42373k4();
                        C8549pu c8549pu = (C8549pu) c8952ugM28941h4.m42376x1().m44645k4("r").m29542x1();
                        c8549pu.m39135k4();
                        c8549pu.m39136k4(modernComment.getText());
                        ModernComment[] modernCommentArrM5090k4 = m5090k4(iCommentArr, modernComment);
                        if (modernCommentArrM5090k4.length > 0) {
                            com.aspose.slides.internal.p332p7.ysr ysrVarM28938du = bjsVarM40971k4.m28938du();
                            for (ModernComment modernComment2 : modernCommentArrM5090k4) {
                                com.aspose.slides.internal.p332p7.eng engVarM45113k4 = ysrVarM28938du.m45113k4();
                                engVarM45113k4.m31182k4(modernComment2.m2008du().Clone());
                                engVarM45113k4.m31187x1(((CommentAuthor) modernComment2.getAuthor()).m1173kk().m73863k4().Clone());
                                engVarM45113k4.m31183k4(modernComment2.m1163k4().Clone());
                                C8952ug c8952ugM31181k4 = engVarM45113k4.m31181k4();
                                c8952ugM31181k4.m42373k4();
                                C8549pu c8549pu2 = (C8549pu) c8952ugM31181k4.m42376x1().m44645k4("r").m29542x1();
                                c8549pu2.m39135k4();
                                c8549pu2.m39136k4(modernComment2.getText());
                            }
                        }
                    }
                }
            }
        }
        sdpVar.mo6846k4(null, m55442ck(), "cmLst");
        mo55333yj();
    }

    /* JADX INFO: renamed from: k4 */
    private ModernComment[] m5090k4(IComment[] iCommentArr, ModernComment modernComment) {
        List list = new List();
        for (IComment iComment : iCommentArr) {
            ModernComment modernComment2 = (ModernComment) iComment;
            if (modernComment2.getParentComment() == modernComment) {
                list.addItem(modernComment2);
            }
        }
        return (ModernComment[]) list.toArray(new ModernComment[0]);
    }
}
