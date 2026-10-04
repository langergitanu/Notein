package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class x3e {
    /* JADX INFO: renamed from: k4 */
    private static ILayoutSlide m73039k4(String str, IGlobalLayoutSlideCollection iGlobalLayoutSlideCollection) {
        IGenericEnumerator<ILayoutSlide> it = iGlobalLayoutSlideCollection.iterator();
        while (it.hasNext()) {
            try {
                ILayoutSlide next = it.next();
                if (C14113y2.m67363du(next.getName(), str)) {
                    return next;
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

    /* JADX INFO: renamed from: k4 */
    public static void m73040k4(Presentation presentation, com.aspose.slides.internal.p332p7.yxj yxjVar, wxb wxbVar) {
        if (yxjVar.m45214k4() != null && "presentation".equals(yxjVar.m45214k4().m29539k4())) {
            com.aspose.slides.internal.p332p7.oax oaxVar = (com.aspose.slides.internal.p332p7.oax) C7019kk.m27452k4((Object) yxjVar.m45214k4().m29542x1(), com.aspose.slides.internal.p332p7.oax.class);
            if (oaxVar == null) {
                throw new InvalidOperationException();
            }
            if (oaxVar.m38149kk().length > 1) {
                for (int i = 1; i < oaxVar.m38149kk().length; i++) {
                    presentation.getSlides().addClone(presentation.getSlides().get_Item(0));
                }
            }
            for (int i2 = 0; i2 < oaxVar.m38149kk().length; i2++) {
                wxbVar.m72957k4().m69957to().throwIfInterruptionRequested();
                Slide slide = (Slide) presentation.getSlides().get_Item(i2);
                com.aspose.slides.internal.p332p7.fre freVar = oaxVar.m38149kk()[i2];
                ILayoutSlide iLayoutSlideM73039k4 = m73039k4(freVar.m32031du(), presentation.getLayoutSlides());
                if (iLayoutSlideM73039k4 != null) {
                    slide.setLayoutSlide(iLayoutSlideM73039k4);
                }
                t9m.m71041k4(slide, freVar, oaxVar.m38150x1(), wxbVar);
                ((SlideCollection) presentation.getSlides()).m2732k4(slide.getShapes());
            }
        }
    }
}
