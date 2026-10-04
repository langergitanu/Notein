package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class lde extends lzv {
    public lde(IReflectionEffectiveData iReflectionEffectiveData) {
        super(iReflectionEffectiveData);
    }

    @Override // com.aspose.slides.lzv
    /* JADX INFO: renamed from: k4 */
    public void mo64370k4(AbstractC14897zn abstractC14897zn, C11896dy c11896dy, C0962es c0962es, azo azoVar, IShapeFrame iShapeFrame) {
        if (c11896dy == null) {
            throw new ArgumentNullException("path is null.");
        }
        if (c11896dy.m55525du() == 0) {
            return;
        }
        if ((c0962es == null || c0962es.m5681to() == 0) && (azoVar == null || !azoVar.m3903h4())) {
            return;
        }
        C11896dy c11896dy2 = new C11896dy();
        ShapeFrame shapeFrame = (ShapeFrame) iShapeFrame;
        c11896dy2.m55578x1(new C12007ix((float) C14116yg.m67501x1(shapeFrame.m2660k4().m56557jd()), (float) C14116yg.m67501x1(shapeFrame.m2660k4().m56551ck()), (float) C14116yg.m67501x1(shapeFrame.m2660k4().m56550c5()), (float) C14116yg.m67501x1(shapeFrame.m2660k4().m56575x1())).Clone());
        C11913yj c11913yjM64651k4 = m64651k4(c11896dy2, azoVar);
        c11896dy2.m55577x1(c11913yjM64651k4);
        C11896dy c11896dy3 = (C11896dy) c11896dy.deepClone();
        try {
            c11896dy3.m55577x1(m64652k4(abstractC14897zn));
            c11896dy3.m55577x1(c11913yjM64651k4);
            m64654k4(c11896dy3, c11896dy2.m55523c5().Clone().Clone(), c11913yjM64651k4, azoVar, c0962es, abstractC14897zn);
            c11896dy3.dispose();
        } finally {
        }
    }
}
