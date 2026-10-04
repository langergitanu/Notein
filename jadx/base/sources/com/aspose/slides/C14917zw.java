package com.aspose.slides;

import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12019um;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.qy7;

/* JADX INFO: renamed from: com.aspose.slides.zw */
/* JADX INFO: loaded from: classes3.dex */
class C14917zw {

    /* JADX INFO: renamed from: k4 */
    private C12007ix f50760k4 = new C12007ix();

    /* JADX INFO: renamed from: x1 */
    private ISlide f50761x1;

    /* JADX INFO: renamed from: k4 */
    public final C12003du m74855k4(IComment iComment) {
        switch ((int) (((((CommentAuthor) iComment.getAuthor()).m1174to() & 4294967295L) % 9) & 4294967295L)) {
            case 0:
                return C12003du.m56465vw();
            case 1:
                return C12003du.m56491yn();
            case 2:
                return C12003du.m56493yw();
            case 3:
                return C12003du.m56372ei();
            case 4:
                return C12003du.m56349b1();
            case 5:
                return C12003du.m56418na();
            case 6:
                return C12003du.m56491yn();
            case 7:
                return C12003du.m56415my();
            default:
                return C12003du.m56387ii();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final ISlide m74861x1() {
        return this.f50761x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12007ix m74856k4() {
        return this.f50760k4.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74857k4(ISlide iSlide) {
        this.f50761x1 = iSlide;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74858k4(ISlide iSlide, boolean z, boolean z2, boolean z3) {
        C12009k4 c12009k4M2706kk = ((Slide) m74861x1()).m2706kk(1.3333334f, 1.3333334f);
        if (z3) {
            try {
                C12007ix c12007ix = new C12007ix(new C12025x6(), ((SlideSize) iSlide.getPresentation().getSlideSize()).m2755k4().Clone());
                omq omqVar = new omq(c12009k4M2706kk, ((SlideSize) iSlide.getPresentation().getSlideSize()).m2755k4().m56699x1(), ((SlideSize) iSlide.getPresentation().getSlideSize()).m2755k4().m56697kk());
                try {
                    m74854k4(omqVar, c12007ix.Clone());
                    omqVar.dispose();
                } catch (Throwable th) {
                    omqVar.dispose();
                    throw th;
                }
            } finally {
            }
        }
        C3152yj c3152yj = new C3152yj();
        try {
            c12009k4M2706kk.m56333k4(c3152yj, C3977ck.m15681jd());
            byte[] array = c3152yj.toArray();
            c3152yj.dispose();
            c12009k4M2706kk.dispose();
            IPictureFrame iPictureFrameAddPictureFrame = iSlide.getShapes().addPictureFrame(5, m74856k4().m56557jd(), m74856k4().m56551ck(), m74856k4().m56550c5(), m74856k4().m56575x1(), new PPImage(iSlide.getPresentation(), array));
            if (z) {
                iPictureFrameAddPictureFrame.getLineFormat().getFillFormat().setFillType((byte) 1);
                ((ColorFormat) iPictureFrameAddPictureFrame.getLineFormat().getFillFormat().getSolidFillColor()).m1080k4(C12003du.m56460uz().Clone());
                iPictureFrameAddPictureFrame.getLineFormat().setWidth(0.75d);
            }
            if (z2) {
                IAutoShape iAutoShapeAddAutoShape = iSlide.getShapes().addAutoShape(5, m74856k4().m56557jd(), m74856k4().m56558k4() + 5.0f, 100.0f, 10.0f);
                iAutoShapeAddAutoShape.getLineFormat().getFillFormat().setFillType((byte) 0);
                iAutoShapeAddAutoShape.getFillFormat().setFillType((byte) 0);
                iAutoShapeAddAutoShape.getTextFrame().getTextFrameFormat().setMarginLeft(0.0d);
                iAutoShapeAddAutoShape.getTextFrame().getParagraphs().get_Item(0).getParagraphFormat().setAlignment(0);
                iAutoShapeAddAutoShape.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().setFillType((byte) 1);
                ((ColorFormat) iAutoShapeAddAutoShape.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat().getSolidFillColor()).m1080k4(C12003du.m56460uz().Clone());
                iAutoShapeAddAutoShape.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setFontHeight(10.0f);
                iAutoShapeAddAutoShape.getTextFrame().setText(C14057f9.m66591x1(m74861x1().getSlideNumber()));
            }
        } catch (Throwable th2) {
            c3152yj.dispose();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74859k4(C12007ix c12007ix) {
        this.f50760k4 = c12007ix.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    private void m74854k4(AbstractC14897zn abstractC14897zn, C12007ix c12007ix) {
        ShapeFrame shapeFrameM405up = ((Slide) m74861x1()).m405up();
        abstractC14897zn.m74622kk(new C4317dy(c12007ix.m56550c5() / shapeFrameM405up.getWidth(), 0.0f, 0.0f, c12007ix.m56575x1() / shapeFrameM405up.getHeight(), c12007ix.m56557jd(), c12007ix.m56551ck()));
        IComment[] slideComments = m74861x1().getSlideComments(null);
        int length = slideComments.length;
        int i = 0;
        while (i < length) {
            IComment iComment = slideComments[i];
            String initials = iComment.getAuthor().getInitials();
            if ("n/a".equals(initials)) {
                initials = "";
            }
            Comment comment = (Comment) iComment;
            String strM67399k4 = C14113y2.m67399k4(initials, Long.valueOf((comment.m1168to().m7379k4() & 4294967295L) - 1));
            azo azoVar = new azo(C12003du.m56393jw().Clone(), 0.1f);
            C0962es c0962es = new C0962es(m74855k4(iComment).Clone());
            qy7.C14366k4 c14366k4 = new qy7.C14366k4();
            c14366k4.f48495k4 = m74861x1().getPresentation().getMasterTheme().getFontScheme().getMinor().getLatinFont().getFontName();
            c14366k4.f48498x1 = 18.0f;
            qy7 qy7Var = new qy7((Presentation) m74861x1().getPresentation(), 72.0f, c14366k4.Clone());
            C12013m9 c12013m9 = new C12013m9(c14366k4.f48495k4, 13.5f);
            C12019um c12019um = new C12019um(C12019um.m56799c5());
            c12019um.m56817kk(c12019um.m56816kk() | 2048);
            C12015qq c12015qqClone = abstractC14897zn.m74608ar().mo17490k4(strM67399k4, c12013m9, C12025x6.f40591k4.Clone(), c12019um).Clone();
            C12007ix c12007ix2 = new C12007ix(comment.m1169x1().m56897x1(), comment.m1169x1().m56895kk(), c12015qqClone.m56699x1(), c12015qqClone.m56697kk());
            abstractC14897zn.mo68794k4(C12007ix.m56542k4(new C12007ix(comment.m1169x1().m56897x1(), comment.m1169x1().m56895kk() - c12013m9.m56639dy(), c12015qqClone.m56699x1(), c12013m9.m56639dy()), 5.0f, 5.0f).Clone().Clone(), azoVar, c0962es);
            abstractC14897zn.mo64343k4(strM67399k4, c12007ix2.Clone(), qy7Var);
            i++;
            slideComments = slideComments;
        }
        abstractC14897zn.m74626rv();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0189  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m74860k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, C13700js c13700js, boolean z, boolean z2, boolean z3) throws Throwable {
        q1f q1fVar;
        ShapeFrame shapeFrame;
        C12009k4 c12009k4;
        C12007ix c12007ix;
        kg7 kg7Var2;
        InterruptionToken interruptionToken;
        C13700js c13700js2;
        AbstractC14897zn abstractC14897zn2 = abstractC14897zn;
        if (m74861x1() != null) {
            q1f q1fVarM2721x6 = ((Slide) m74861x1()).m2721x6();
            if (z2) {
                qy7.C14366k4 c14366k4 = new qy7.C14366k4();
                c14366k4.f48495k4 = m74861x1().getPresentation().getMasterTheme().getFontScheme().getMinor().getLatinFont().getFontName();
                c14366k4.f48498x1 = 10.0f;
                abstractC14897zn2.mo64343k4(C14057f9.m66591x1(m74861x1().getSlideNumber()), new C12007ix(new C12025x6(m74856k4().m56557jd(), m74856k4().m56558k4() + 15.0f), new C12015qq()), new qy7((Presentation) m74861x1().getPresentation(), 72.0f, c14366k4.Clone()));
            }
            ShapeFrame shapeFrame2 = new ShapeFrame(m74856k4().m56557jd(), m74856k4().m56551ck(), m74856k4().m56550c5(), m74856k4().m56575x1(), (byte) 0, (byte) 0, 0.0f);
            if (C7019kk.m27469x1(abstractC14897zn2, C14250os.class)) {
                c13700js2 = new C13700js();
                c13700js2.f45566dy = z;
                interruptionToken = (InterruptionToken) ((Presentation) m74861x1().getPresentation()).m2349du().getInterruptionToken();
                kg7Var2 = new kg7(q1fVarM2721x6.m69378x1(), kg7Var.m63846ks(), c13700js2);
                q1fVar = q1fVarM2721x6;
                shapeFrame = shapeFrame2;
            } else {
                q1fVar = q1fVarM2721x6;
                shapeFrame = shapeFrame2;
                if (C7019kk.m27469x1(abstractC14897zn2, vhx.class)) {
                    kg7Var2 = new kg7(q1fVar.m69378x1(), kg7Var.m63846ks(), c13700js);
                    interruptionToken = (InterruptionToken) ((Presentation) m74861x1().getPresentation()).m2349du().getInterruptionToken();
                    c13700js2 = c13700js;
                } else {
                    C12009k4 c12009k4M69379x1 = q1fVar.m69379x1(new C12023wl(com.aspose.slides.Collections.Generic.OooO00o.OooO00o(shapeFrame.getWidth(), 2.775d, 14), com.aspose.slides.Collections.Generic.OooO00o.OooO00o(shapeFrame.getHeight(), 2.775d, 14)));
                    try {
                        c12007ix = new C12007ix(shapeFrame.getX(), shapeFrame.getY(), shapeFrame.getWidth(), shapeFrame.getHeight());
                        if (z) {
                            abstractC14897zn2.mo68794k4(c12007ix.Clone(), new azo(C12003du.m56460uz().Clone(), 0.2f), (C0962es) null);
                        }
                    } catch (Throwable th) {
                        th = th;
                        c12009k4 = c12009k4M69379x1;
                    }
                    try {
                        abstractC14897zn.mo64339k4(c12009k4M69379x1, c12007ix.m56557jd(), c12007ix.m56551ck(), c12007ix.m56550c5(), c12007ix.m56575x1());
                        abstractC14897zn2 = abstractC14897zn;
                        if (c12009k4M69379x1 != null) {
                            c12009k4M69379x1.dispose();
                        }
                        if (z3) {
                            m74854k4(abstractC14897zn2, m74856k4().Clone());
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        c12009k4 = c12009k4M69379x1;
                        if (c12009k4 != null) {
                            c12009k4.dispose();
                        }
                        throw th;
                    }
                }
            }
            q1fVar.m69374k4(abstractC14897zn2, shapeFrame, kg7Var2, c13700js2, interruptionToken);
            if (z3) {
            }
        }
    }
}
