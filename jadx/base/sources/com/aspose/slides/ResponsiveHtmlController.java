package com.aspose.slides;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public class ResponsiveHtmlController implements IResponsiveHtmlController {

    /* JADX INFO: renamed from: k4 */
    private final IHtmlFormattingController f3228k4;

    public ResponsiveHtmlController() {
        this.f3228k4 = HtmlFormatter.m1662k4((String) null, true);
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public final void writeDocumentEnd(IHtmlGenerator iHtmlGenerator, IPresentation iPresentation) {
        this.f3228k4.writeDocumentEnd(iHtmlGenerator, iPresentation);
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public final void writeDocumentStart(IHtmlGenerator iHtmlGenerator, IPresentation iPresentation) {
        String strM67401k4;
        String strM67401k42;
        this.f3228k4.writeDocumentStart(iHtmlGenerator, iPresentation);
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26792k4("<style>");
        float fM56697kk = ((SlideSize) iPresentation.getSlideSize()).m2755k4().m56697kk() / ((SlideSize) iPresentation.getSlideSize()).m2755k4().m56699x1();
        float fM56697kk2 = ((((SlideSize) iPresentation.getSlideSize()).m2755k4().m56697kk() / 0.75f) / 2.0f) - 2.0f;
        float fM56699x1 = (((SlideSize) iPresentation.getSlideSize()).m2755k4().m56699x1() / 0.75f) + 16.0f;
        if (iPresentation.getSlideSize().getOrientation() == 0) {
            strM67401k42 = C14113y2.m67401k4(".slide {\r\n              position: relative;\r\n              box-sizing: border-box; }\r\n\r\n              @media only screen and (max-width:[MAXWIDTH]px) {\n\t\t\t\t.slides-canvas { width: 100%; margin-top: calc(((100% - 100vw*[SIZERATIO])/2) - [TOPSHIFT]px); }\n\t\t\t  }\r\n            ", "[SIZERATIO]", C14064he.m66704h4(1.0f - fM56697kk));
        } else {
            if (iPresentation.getSlideSize().getOrientation() != 1) {
                strM67401k4 = "";
                c6765kp.m26792k4(C14113y2.m67401k4(strM67401k4, "[MAXWIDTH]", C14064he.m66704h4(fM56699x1)));
                c6765kp.m26792k4("</style>");
                iHtmlGenerator.addHtml(c6765kp.toString());
            }
            strM67401k42 = C14113y2.m67401k4(".slide {\r\n              position: relative;\r\n              box-sizing: border-box; }\r\n\r\n              @media only screen and (max-width:[MAXWIDTH]px) {\n\t\t\t\t.slides-canvas { width: 100%; margin-top: calc(((100vw*[SIZERATIO] - 100%)/2) - [TOPSHIFT]px); }\n\t\t\t  }\r\n            ", "[SIZERATIO]", C14064he.m66704h4(fM56697kk + 1.0f));
            fM56697kk2 += 48.0f;
        }
        strM67401k4 = C14113y2.m67401k4(strM67401k42, "[TOPSHIFT]", C14064he.m66704h4(fM56697kk2));
        c6765kp.m26792k4(C14113y2.m67401k4(strM67401k4, "[MAXWIDTH]", C14064he.m66704h4(fM56699x1)));
        c6765kp.m26792k4("</style>");
        iHtmlGenerator.addHtml(c6765kp.toString());
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public final void writeShapeEnd(IHtmlGenerator iHtmlGenerator, IShape iShape) {
        this.f3228k4.writeShapeEnd(iHtmlGenerator, iShape);
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public final void writeShapeStart(IHtmlGenerator iHtmlGenerator, IShape iShape) {
        this.f3228k4.writeShapeStart(iHtmlGenerator, iShape);
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public final void writeSlideEnd(IHtmlGenerator iHtmlGenerator, ISlide iSlide) {
        this.f3228k4.writeSlideEnd(iHtmlGenerator, iSlide);
    }

    @Override // com.aspose.slides.IHtmlFormattingController
    public final void writeSlideStart(IHtmlGenerator iHtmlGenerator, ISlide iSlide) {
        this.f3228k4.writeSlideStart(iHtmlGenerator, iSlide);
    }

    public ResponsiveHtmlController(IHtmlFormattingController iHtmlFormattingController) {
        this.f3228k4 = iHtmlFormattingController;
    }
}
