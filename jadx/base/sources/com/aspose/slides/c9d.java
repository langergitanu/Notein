package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p323op.C7131h4;
import com.aspose.slides.internal.p323op.C7134m9;
import com.aspose.slides.internal.p479wm.C12210k4;

/* JADX INFO: loaded from: classes3.dex */
class c9d extends kg7 {

    /* JADX INFO: renamed from: k4 */
    private final ISvgShapeFormattingController f4294k4;

    public c9d(IBaseSlide iBaseSlide, C12210k4<C7134m9, C7131h4> c12210k4, C13700js c13700js, ISvgShapeFormattingController iSvgShapeFormattingController) {
        super(iBaseSlide, c12210k4, c13700js);
        this.f4294k4 = iSvgShapeFormattingController;
    }

    @Override // com.aspose.slides.kg7
    /* JADX INFO: renamed from: k4 */
    public void mo4517k4(vhx vhxVar, Portion portion, TextFrame textFrame) {
        ISvgShapeFormattingController iSvgShapeFormattingController = this.f4294k4;
        if (iSvgShapeFormattingController == null || !C7019kk.m27469x1(iSvgShapeFormattingController, ISvgShapeAndTextFormattingController.class)) {
            return;
        }
        SvgTSpan svgTSpan = new SvgTSpan();
        ((ISvgShapeAndTextFormattingController) this.f4294k4).formatText(svgTSpan, portion, textFrame);
        vhxVar.m72274k4(svgTSpan);
    }

    @Override // com.aspose.slides.kg7
    /* JADX INFO: renamed from: k4 */
    public void mo4518k4(AbstractC14897zn abstractC14897zn, Shape shape, InterruptionToken interruptionToken) {
        vhx vhxVar = (vhx) abstractC14897zn;
        SvgShape svgShape = new SvgShape();
        ISvgShapeFormattingController iSvgShapeFormattingController = this.f4294k4;
        if (iSvgShapeFormattingController != null) {
            iSvgShapeFormattingController.formatShape(svgShape, shape);
        }
        vhxVar.m72273k4(shape, svgShape);
        super.mo4518k4(abstractC14897zn, shape, interruptionToken);
        vhxVar.m72272k4(shape);
    }
}
