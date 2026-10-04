package com.aspose.slides;

import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;

/* JADX INFO: loaded from: classes3.dex */
class iak extends er8 {
    public iak(ZoomObject zoomObject) {
        super(zoomObject);
    }

    /* JADX INFO: renamed from: k4 */
    public final ZoomObject m7604k4() {
        return (ZoomObject) m5629du();
    }

    @Override // com.aspose.slides.er8
    /* JADX INFO: renamed from: k4 */
    public void mo4131k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, InterruptionToken interruptionToken) {
        interruptionToken.throwIfInterruptionRequested();
        if (m5629du().getHidden()) {
            return;
        }
        ShapeFrame shapeFrameM5631fa = m5631fa();
        float x = shapeFrameM5631fa.getX();
        float y = shapeFrameM5631fa.getY();
        float width = shapeFrameM5631fa.getWidth();
        float height = shapeFrameM5631fa.getHeight();
        if (C14064he.m66715kk(x) || C14064he.m66715kk(y) || C14064he.m66715kk(width) || C14064he.m66715kk(height)) {
            return;
        }
        abstractC14897zn.m74622kk(new C4317dy());
        ajz ajzVar = new ajz(shapeFrameM5631fa.cloneT(), new C4317dy(), null, m5642m9(), kg7Var);
        C12007ix c12007ix = new C12007ix(x, y, width, height);
        abstractC14897zn.mo68794k4(c12007ix.Clone(), (azo) null, C0962es.m5659k4(ajzVar, (FillFormat) m5629du().getFillFormat()));
        if (m7604k4().m3125qq().getPicture().getImage() != null) {
            abstractC14897zn.mo68793k4(m7604k4().m3125qq().getPicture().getImage().getSvgImage() != null ? ((ImageCollection) m7604k4().getPresentation().getImages()).m1738x1(((SvgImage) m7604k4().m3125qq().getPicture().getImage().getSvgImage()).m2854k4(new PictureFrame(m7604k4()))) : m7604k4().m3125qq().getPicture().getImage(), c12007ix.Clone(), (qta) null);
        }
        if (!m5629du().getLineFormat().isFormatNotDefined()) {
            float width2 = C14044b3.m66437kk(m5629du().getLineFormat().getWidth()) ? 0.0f : (float) m5629du().getLineFormat().getWidth();
            float f = width2 / 2.0f;
            abstractC14897zn.mo68794k4(new C12007ix(x - f, y - f, width + width2, height + width2), new azo(ajzVar, (LineFormat) m5629du().getLineFormat()), (C0962es) null);
        }
        abstractC14897zn.m74626rv();
    }
}
