package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.a4 */
/* JADX INFO: loaded from: classes3.dex */
class C0704a4 {
    /* JADX INFO: renamed from: k4 */
    public static void m3203k4(MasterHandoutSlide masterHandoutSlide, com.aspose.slides.internal.p332p7.xlm xlmVar, wxb wxbVar) {
        if (wgi.m72731kk(xlmVar.m44495k4())) {
            wr8.m72896k4(masterHandoutSlide, xlmVar.m44495k4(), wxbVar);
        }
        wxbVar.m72958k4(new hom(masterHandoutSlide, null));
        List.Enumerator<C7394ca> it = xlmVar.m44497x1().iterator();
        while (it.hasNext()) {
            try {
                mxr.m67788k4((ShapeCollection) masterHandoutSlide.getShapes(), it.next(), wxbVar);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
