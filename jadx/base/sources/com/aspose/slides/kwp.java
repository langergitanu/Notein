package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class kwp extends er8 {
    public kwp(SummaryZoomFrame summaryZoomFrame) {
        super(summaryZoomFrame);
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
        abstractC14897zn.m74622kk(new C4317dy(abstractC14897zn.m74623ks().m17347to(), abstractC14897zn.m74623ks().m17329du(), abstractC14897zn.m74623ks().m17331h4(), abstractC14897zn.m74623ks().m17346m9(), abstractC14897zn.m74623ks().m17330dy() + x, abstractC14897zn.m74623ks().m17328c5() + y));
        IGenericEnumerator<ISummaryZoomSection> it = ((SummaryZoomFrame) m5629du()).getSummaryZoomCollection().iterator();
        while (it.hasNext()) {
            try {
                ((SummaryZoomSection) it.next()).m2546bz().mo4131k4(abstractC14897zn, kg7Var, interruptionToken);
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        abstractC14897zn.m74626rv();
    }
}
