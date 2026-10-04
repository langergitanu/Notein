package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class jkn {
    /* JADX INFO: renamed from: k4 */
    public static void m63388k4(MasterSlide masterSlide, com.aspose.slides.internal.p332p7.kia kiaVar, wxb wxbVar) {
        masterSlide.setName(kiaVar.m35424k4());
        masterSlide.getThemeManager().getOverrideTheme().setName(kiaVar.m35424k4());
        if (wgi.m72731kk(kiaVar.m35425kk())) {
            wr8.m72896k4(masterSlide, kiaVar.m35425kk(), wxbVar);
        }
        wxbVar.m72958k4(new hom(masterSlide, null));
        List.Enumerator<C7394ca> it = kiaVar.m35427to().iterator();
        while (it.hasNext()) {
            try {
                mxr.m67788k4((ShapeCollection) masterSlide.getShapes(), it.next(), wxbVar);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        masterSlide.m1939qq();
    }
}
