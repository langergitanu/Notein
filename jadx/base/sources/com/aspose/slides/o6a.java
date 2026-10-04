package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p080dd.C3125bv;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p129fe.C3982jd;
import com.aspose.slides.internal.p129fe.C3986m9;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p323op.C7131h4;
import com.aspose.slides.internal.p323op.C7134m9;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p479wm.C12210k4;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class o6a implements IHtmlFormattingController {

    /* JADX INFO: renamed from: du */
    private String f47677du;

    /* JADX INFO: renamed from: dy */
    private String f47678dy;

    /* JADX INFO: renamed from: h4 */
    private String f47679h4;

    /* JADX INFO: renamed from: k4 */
    private boolean f47680k4;

    /* JADX INFO: renamed from: kk */
    private C14062gk f47681kk;

    /* JADX INFO: renamed from: m9 */
    private String f47682m9;

    /* JADX INFO: renamed from: to */
    private String f47683to;

    /* JADX INFO: renamed from: x1 */
    private String f47684x1;

    public o6a(String str, boolean z, String str2, String str3, String str4, String str5) {
        if (str != null) {
            try {
                this.f47681kk = C14062gk.m66638k4(new URI(str));
            } catch (RuntimeException | URISyntaxException e) {
                C3085sv.m13082k4(e);
                this.f47684x1 = str;
            }
            this.f47680k4 = z;
            this.f47683to = str2;
            this.f47677du = str3;
            this.f47679h4 = str4;
            this.f47682m9 = str5;
        }
        str = null;
        this.f47681kk = null;
        this.f47684x1 = str;
        this.f47680k4 = z;
        this.f47683to = str2;
        this.f47677du = str3;
        this.f47679h4 = str4;
        this.f47682m9 = str5;
    }

    /* JADX INFO: renamed from: k4 */
    private String m68343k4() {
        String str = this.f47684x1;
        if (str != null) {
            return C14113y2.m67402k4("\n<style type=\"text/css\">\n{0}</style>", str);
        }
        C14062gk c14062gk = this.f47681kk;
        return c14062gk != null ? C14113y2.m67402k4("\n<link rel=StyleSheet href=\"{0}\" type=\"text/css\">", c14062gk) : "";
    }

    /* JADX INFO: renamed from: x1 */
    private C3982jd m68347x1() {
        for (C3982jd c3982jd : C3982jd.m15697k4()) {
            if ("image/png".equals(c3982jd.m15699h4())) {
                return c3982jd;
            }
        }
        return null;
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public final void writeDocumentEnd(IHtmlGenerator iHtmlGenerator, IPresentation iPresentation) {
        iHtmlGenerator.addHtml(C14113y2.m67402k4(this.f47677du, this.f47678dy));
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public final void writeDocumentStart(IHtmlGenerator iHtmlGenerator, IPresentation iPresentation) {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26796k4(this.f47683to, m68343k4());
        iHtmlGenerator.addHtml(c6765kp.toString());
        this.f47678dy = null;
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public final void writeShapeEnd(IHtmlGenerator iHtmlGenerator, IShape iShape) {
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public final void writeShapeStart(IHtmlGenerator iHtmlGenerator, IShape iShape) {
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public final void writeSlideEnd(IHtmlGenerator iHtmlGenerator, ISlide iSlide) {
        iHtmlGenerator.addHtml("</div>");
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public final void writeSlideStart(IHtmlGenerator iHtmlGenerator, ISlide iSlide) {
        String strM2901c5;
        if (this.f47678dy == null) {
            this.f47678dy = C14113y2.m67408k4("slideIface", C14057f9.m66591x1(iHtmlGenerator.getSlideIndex() + 1));
        }
        IGenericEnumerator<IShape> it = iSlide.getShapes().iterator();
        while (it.hasNext()) {
            try {
                Shape shape = (Shape) it.next();
                if (!C7019kk.m27469x1(shape, AutoShape.class) || shape.getPlaceholder() == null || (shape.getPlaceholder().getType() != 0 && shape.getPlaceholder().getType() != 2)) {
                }
                strM2901c5 = ((AutoShape) shape).m288x1().m2901c5();
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        strM2901c5 = null;
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        iHtmlGenerator.addHtml(C14113y2.m67402k4(this.f47679h4, m68348x1(strM2901c5), C14113y2.m67408k4("slideIface", C14057f9.m66591x1(iHtmlGenerator.getSlideIndex() + 1)), iHtmlGenerator.getNextSlideIndex() > 0 ? C14113y2.m67408k4("slideIface", C14057f9.m66591x1(iHtmlGenerator.getNextSlideIndex() + 1)) : "slideEnd", m68344k4((Slide) iSlide)));
    }

    /* JADX INFO: renamed from: k4 */
    private String m68344k4(Slide slide) {
        if (slide.getBackground().getEffective().getFillFormat().getFillType() != 3) {
            return "";
        }
        C3125bv c3125bv = new C3125bv();
        try {
            m68346k4(c3125bv, slide);
            return C14113y2.m67402k4("style=\"background-image:url('data:;base64,{0}')\"", c3125bv);
        } finally {
            c3125bv.dispose();
        }
    }

    /* JADX INFO: renamed from: x1 */
    private String m68348x1(String str) {
        return (str == null || !this.f47680k4) ? "" : C14113y2.m67402k4(this.f47682m9, m68345k4(str));
    }

    /* JADX INFO: renamed from: k4 */
    private String m68345k4(String str) {
        String strM67408k4;
        if (str == null) {
            return null;
        }
        C6765kp c6765kp = new C6765kp();
        C3125bv c3125bv = new C3125bv(c6765kp);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('\"' == cCharAt) {
                strM67408k4 = "&quot;";
            } else if ('&' == cCharAt) {
                strM67408k4 = "&amp;";
            } else if ('<' == cCharAt) {
                strM67408k4 = "&lt;";
            } else if ('>' == cCharAt) {
                strM67408k4 = "&gt;";
            } else if (160 >= cCharAt || 256 < cCharAt) {
                c3125bv.mo13302k4(cCharAt);
            } else {
                strM67408k4 = C14113y2.m67408k4("&#", C14057f9.m66586k4((int) cCharAt, (InterfaceC14073kp) C11697x1.m55250kk()), ";");
            }
            c3125bv.mo13304k4(strM67408k4);
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private void m68346k4(AbstractC3124b3 abstractC3124b3, Slide slide) {
        C12015qq c12015qqClone = ((SlideSize) slide.getPresentation().getSlideSize()).m2755k4().Clone();
        C12009k4 c12009k4 = new C12009k4(C7019kk.m27462to(Float.valueOf(c12015qqClone.m56699x1()), 13), C7019kk.m27462to(Float.valueOf(c12015qqClone.m56697kk()), 13), 139273);
        try {
            omq omqVar = new omq(c12009k4, c12015qqClone.m56699x1(), c12015qqClone.m56697kk());
            try {
                ShapeFrame shapeFrame = new ShapeFrame(-1.0f, -1.0f, c12015qqClone.m56699x1() + 2.0f, c12015qqClone.m56697kk() + 2.0f, (byte) 0, (byte) 0, 0.0f);
                omqVar.mo68794k4(shapeFrame.m2660k4().Clone(), (azo) null, slide.m2721x6().m67873k4((Background) slide.getBackground(), shapeFrame, (AbstractC14897zn) null, new kg7(slide, new C12210k4(C7134m9.class, C7131h4.class), new C13700js())));
                C3982jd c3982jdM68347x1 = m68347x1();
                C3152yj c3152yj = new C3152yj();
                try {
                    c12009k4.m56334k4(c3152yj, c3982jdM68347x1, (C3986m9) null);
                    abstractC3124b3.mo13304k4(C14080ne.m66953k4(c3152yj.getBuffer(), 0, (int) c3152yj.getLength()));
                    c3152yj.dispose();
                    omqVar.dispose();
                    c12009k4.dispose();
                } catch (Throwable th) {
                    c3152yj.dispose();
                    throw th;
                }
            } catch (Throwable th2) {
                omqVar.dispose();
                throw th2;
            }
        } catch (Throwable th3) {
            c12009k4.dispose();
            throw th3;
        }
    }
}
