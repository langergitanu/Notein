package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: loaded from: classes3.dex */
class w2q {

    /* JADX INFO: renamed from: k4 */
    public final oju f49755k4;

    /* JADX INFO: renamed from: x1 */
    public final oju f49756x1;

    public w2q(IShape iShape) {
        oju ojuVar = new oju();
        this.f49755k4 = ojuVar;
        oju ojuVar2 = new oju();
        this.f49756x1 = ojuVar2;
        C14725w6.m72636k4(iShape).CloneTo(ojuVar);
        C14725w6.m72637k4(((SlideSize) iShape.getPresentation().getSlideSize()).m2755k4().Clone()).CloneTo(ojuVar2);
    }

    /* JADX INFO: renamed from: k4 */
    public final oju m72624k4(C12025x6 c12025x6) {
        oju ojuVarClone = C14725w6.m72638k4(c12025x6.Clone()).Clone();
        float f = ojuVarClone.f47836k4;
        oju ojuVar = this.f49756x1;
        ojuVarClone.f47836k4 = f * ojuVar.f47836k4;
        ojuVarClone.f47837x1 *= ojuVar.f47837x1;
        return oju.m68619k4(this.f49755k4, ojuVarClone);
    }
}
