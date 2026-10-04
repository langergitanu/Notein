package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p323op.C7131h4;
import com.aspose.slides.internal.p323op.C7134m9;
import com.aspose.slides.internal.p479wm.C12210k4;

/* JADX INFO: renamed from: com.aspose.slides.ys */
/* JADX INFO: loaded from: classes3.dex */
class C14859ys extends kg7 {

    /* JADX INFO: renamed from: k4 */
    private final IHtmlFormattingController f50399k4;

    /* JADX INFO: renamed from: kk */
    private final HtmlGenerator f50400kk;

    /* JADX INFO: renamed from: x1 */
    private final ISvgShapeFormattingController f50401x1;

    public C14859ys(IBaseSlide iBaseSlide, C12210k4<C7134m9, C7131h4> c12210k4, C13700js c13700js, HtmlGenerator htmlGenerator, IHtmlFormattingController iHtmlFormattingController, ISvgShapeFormattingController iSvgShapeFormattingController) {
        super(iBaseSlide, c12210k4, c13700js);
        this.f50400kk = htmlGenerator;
        this.f50399k4 = iHtmlFormattingController;
        if (iSvgShapeFormattingController == null && C7019kk.m27469x1(iHtmlFormattingController, ISvgShapeFormattingController.class)) {
            this.f50401x1 = (ISvgShapeFormattingController) iHtmlFormattingController;
        } else {
            this.f50401x1 = iSvgShapeFormattingController;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m74073k4(vhx vhxVar) {
        if (this.f50400kk.m1679x1()) {
            if (vhxVar.m72283up()) {
                vhxVar.m72275k4(this.f50400kk.m1677kk(), false);
                vhxVar.m72271jd();
            }
            this.f50400kk.m1675k4();
        }
    }

    @Override // com.aspose.slides.kg7
    /* JADX INFO: renamed from: k4 */
    public void mo4517k4(vhx vhxVar, Portion portion, TextFrame textFrame) {
        ISvgShapeFormattingController iSvgShapeFormattingController = this.f50401x1;
        if (iSvgShapeFormattingController == null || !C7019kk.m27469x1(iSvgShapeFormattingController, ISvgShapeAndTextFormattingController.class)) {
            return;
        }
        SvgTSpan svgTSpan = new SvgTSpan();
        ((ISvgShapeAndTextFormattingController) this.f50401x1).formatText(svgTSpan, portion, textFrame);
        vhxVar.m72274k4(svgTSpan);
    }

    @Override // com.aspose.slides.kg7
    /* JADX INFO: renamed from: k4 */
    public void mo4518k4(AbstractC14897zn abstractC14897zn, Shape shape, InterruptionToken interruptionToken) {
        vhx vhxVar = (vhx) abstractC14897zn;
        this.f50399k4.writeShapeStart(this.f50400kk, shape);
        m74073k4(vhxVar);
        SvgShape svgShape = new SvgShape();
        ISvgShapeFormattingController iSvgShapeFormattingController = this.f50401x1;
        if (iSvgShapeFormattingController != null) {
            iSvgShapeFormattingController.formatShape(svgShape, shape);
        }
        vhxVar.m72273k4(shape, svgShape);
        super.mo4518k4(abstractC14897zn, shape, interruptionToken);
        vhxVar.m72272k4(shape);
        this.f50399k4.writeShapeEnd(this.f50400kk, shape);
        m74073k4(vhxVar);
    }
}
